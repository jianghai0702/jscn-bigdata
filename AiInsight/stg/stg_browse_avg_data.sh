#######################################################
#定义变量
#######################################################
#模块名称
folder="bonree"
#目标表名
target_table_name="stg_browse_avg_data"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
#生成目录
load_dir="${folder}/${target_table_name}/${v_cycle}"
mkdir -p /AiInsight/downloads/${load_dir}
#从19复制文件
scp -rp root@111.208.67.22:/opt/data/${load_dir}/. /AiInsight/downloads/${load_dir}
#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/AiInsight/downloads/${load_dir}' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}');"
exit;
EOF
rm -rf /AiInsight/downloads/${load_dir}
