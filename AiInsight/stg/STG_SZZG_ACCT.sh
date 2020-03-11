#!/usr/bin/env bash
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="STG_SZZG_ACCT"
#源数据库表名（必须大写）
source_table_name="SZZG.ACCT"
#获取统计周期
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天

su - hdfs <<EOF
/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_import.txt  --table ${source_table_name}  --hive-table  ${target_database}.${target_table_name} --hive-partition-key pt_mon --hive-partition-value "${etl_cycle}"

exit;
EOF