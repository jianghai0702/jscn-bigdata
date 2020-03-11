#!/usr/bin/env bash
#获取统计周期
v_cycle=$1
echo $v_cycle
sqoop import \
--connect "jdbc:oracle:thin:@111.208.67.27:1521/orcl" \
--username "st" \
--password "st" \
--query "
select * from (
select * from zg.acct_item_0@JSBI where billing_cycle_id = $v_cycle
union 
select * from zg.acct_item_1@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_2@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_3@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_4@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_5@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_6@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_7@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_8@JSBI where billing_cycle_id = $v_cycle
union
select * from zg.acct_item_9@JSBI where billing_cycle_id = $v_cycle
) 
where \$CONDITIONS " \
--target-dir "/user/hive/warehouse/STG_ZG_ACCT_ITEM_N/pt_mon=$v_cycle " \
--fields-terminated-by '\t' \
--delete-target-dir \
--num-mappers 1 \
--verbose \
--hive-import \
--hive-overwrite \
--hive-database default \
--hive-table STG_ZG_ACCT_ITEM_N \
--hive-partition-key "pt_mon" \
--hive-partition-value $v_cycle \
--map-column-hive  ACCT_ITEM_ID=String \
--null-string '\\N' \
--null-non-string '\\N' \
--hive-drop-import-delims \
--delete-target-dir 



