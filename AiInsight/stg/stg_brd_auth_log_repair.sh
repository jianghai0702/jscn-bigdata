#!/usr/bin/env bash
# 	$Id$
#######################################################
#定义变量
#######################################################
#模块名称 认证用户记录
folder="auth"
#目标表名
target_table_name="stg_brd_auth_log"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
etl_cycle1=`date -d "$v_cycle -15 day " +%Y%m%d`
#修改日志：sunwj 由于22服务器配置的脚本 fix_brd_auth_log.sh 已经执行了入库操作 因此 脚本暂时不做任何操作

#生成目录
load_dir="${folder}/${target_table_name}/${v_cycle}"
mkdir -p /AiInsight/downloads/${load_dir}
#从19复制文件

scp -rp root@111.208.67.22:/opt/data/${load_dir}/. /AiInsight/downloads/${load_dir}

if [[ $(ls -l /AiInsight/downloads/${load_dir}|awk '{size=size+$5}END{print size}' ) -eq 0 ]]; then
    echo "${etl_cycle}无数据！"
    rm -rf /AiInsight/downloads/${load_dir}
    #exit 1
fi

#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/AiInsight/downloads/${load_dir}' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}');"
exit;
EOF
rm -rf /AiInsight/downloads/${load_dir}

#删除30天前数据
su - hdfs <<EOF
hive -e "alter table ${target_table_name} drop partition(pt_time < ${etl_cycle1});"
hdfs dfs -test -e /asiainfo/hive/STG/${target_table_name}/pt_time=${etl_cycle1}
if [ \$? -eq 0 ] ; then
    echo "Directory pt_time=${etl_cycle1} is exist"
    hdfs dfs -rm -r /asiainfo/hive/STG/${target_table_name}/pt_time=${etl_cycle1}
else
    echo "Directory pt_time=${etl_cycle1} is not exist"
fi
exit;
EOF

