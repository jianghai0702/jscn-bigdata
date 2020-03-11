#######################################################
#定义变量
#######################################################
#模块名称
#folder=""
#目标表名
target_table_name="stg_dr_ismp_yyyymm"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 month" +%Y%m`
#生成目录
load_dir="/home/ftpuser/boss"

#判断文件是否存在
if [ ! -f ${load_dir}/${etl_cycle}boss1.csv] ; then
    echo "${load_dir}/${etl_cycle}boss1.csv 文件不存在"
    exit 1
fi

file_name=${load_dir}/${etl_cycle}boss1
file_name_utf8=${file_name}_utf8
# 文件编码转换 gbk -> utf8
iconv -c -f gbk -t utf8 ${file_name}.csv -o ${file_name_utf8}.csv 
# 去掉行首
sed -i '1d' ${file_name_utf8}.csv

#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '${file_name_utf8}.csv' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_MON='${etl_cycle}');"
exit;
EOF
