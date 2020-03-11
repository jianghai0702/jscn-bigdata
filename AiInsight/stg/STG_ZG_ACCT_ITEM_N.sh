#!/bin/bash
#######################################################
#定义变量
#######################################################
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="STG_ZG_ACCT_ITEM_N"
#源数据库表名（必须大写）
source_table_name="ZG.ACCT"
#######################################################
#脚本开始
##########################################g#############
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天
CONDITIONS="(1=0)"
echo ${etl_cycle}
echo ${data_cycle}
#加载数据到目标表中
su - hdfs <<EOF
/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_import.txt --query 'select T.* from (
select * from zg.acct_item_0 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_1 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_2 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_3 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_4 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_5 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_6 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_7 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_8 where billing_cycle_id = $etl_cycle
union
select * from zg.acct_item_9 where billing_cycle_id = $etl_cycle
) T
where \$CONDITIONS' --target-dir "/asiainfo/hive/STG/STG_ZG_ACCT_ITEM_N/pt_mon=${etl_cycle} " --hive-table  ${target_database}.${target_table_name} --hive-partition-key pt_mon --hive-partition-value "${etl_cycle}"


#hive -e "alter table ${target_database}.${target_table_name} drop partiton (pt_mon < ${etl_cycle});"

exit;
EOF


