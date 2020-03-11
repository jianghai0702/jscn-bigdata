#!/bin/bash
#######################################################
#定义变量
#######################################################
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="stg_arpu"
#源数据库表名（必须大写）
source_table_name="REP.KD_ARPU_2019"
#######################################################
#脚本开始
##########################################g#############
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天

echo ${etl_cycle}
echo ${data_cycle}
#加载数据到目标表中
su - hdfs <<EOF
/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_import.txt  --table ${source_table_name}  --hive-table  ${target_database}.${target_table_name} --hive-partition-key pt_mon --hive-partition-value "${etl_cycle}"

exit;
EOF


