#######################################################
#定义变量
#######################################################
#模块名称
folder="liukong"
#目标表名
source_table_name="tbl_part_app_log"
target_table_name="stg_tbl_part_app_log"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
#生成目录
load_dir="${folder}/${source_table_name}_${v_cycle}"
#判断文件是否存在
if  [[ ! -f /home/ftpuser/${load_dir} ]] || [[ $(ls -l  /home/ftpuser/${load_dir}  | awk '{print $5}') -eq 0 ]] ; then
    echo "${etl_cycle}无数据！"
    exit 1
fi

#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/home/ftpuser/${load_dir}' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}');"
exit;
EOF
