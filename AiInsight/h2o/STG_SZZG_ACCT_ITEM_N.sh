#!/usr/bin/env bash
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
sqoop import \
--connect "jdbc:oracle:thin:@111.208.67.27:1521/orcl" \
--username "st" \
--password "st" \
--query "
select T.* from (
select * from szzg.acct_item_0@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_1@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_2@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_3@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_4@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_5@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_6@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_7@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_8@JSBI where billing_cycle_id = $etl_cycle
union
select * from szzg.acct_item_9@JSBI where billing_cycle_id = $etl_cycle
) T
where '\$CONDITIONS'" \
--target-dir "/asiainfo/hive/STG/STG_SZZG_ACCT_ITEM_N/pt_mon=$etl_cycle " \
--fields-terminated-by '\t' \
--num-mappers 1 \
--verbose \
--hive-import \
--hive-overwrite \
--hive-database default \
--hive-table STG_SZZG_ACCT_ITEM_N \
--hive-partition-key "pt_mon" \
--hive-partition-value $etl_cycle \
--null-string '\\N' \
--null-non-string '\\N' \
--hive-drop-import-delims
exit;
EOF