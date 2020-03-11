#!/usr/bin/env bash
#获取统计周期
v_cycle=$1
#target_table = "STG_SZZG_ACCT_ITEM_N"
echo $v_cycle
sqoop import \
--connect "jdbc:oracle:thin:@111.208.67.27:1521/orcl" \
--username "st" \
--password "st" \
--query "
select * from (
select * from szzg.acct_item_0@JSBI where billing_cycle_id = $v_cycle
union 
select * from szzg.acct_item_1@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_2@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_3@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_4@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_5@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_6@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_7@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_8@JSBI where billing_cycle_id = $v_cycle
union
select * from szzg.acct_item_9@JSBI where billing_cycle_id = $v_cycle
) 
where \$CONDITIONS " \
--target-dir "/user/hive/warehouse/STG_SZZG_ACCT_ITEM_N/pt_mon=$v_cycle " \
--fields-terminated-by '\t' \
--delete-target-dir \
--num-mappers 1 \
--verbose \
--hive-import \
--hive-overwrite \
--hive-database default \
--hive-table STG_SZZG_ACCT_ITEM_N \
--hive-partition-key "pt_mon" \
--hive-partition-value $v_cycle \
--map-column-java ACCT_ITEM_ID=String,ITEM_SOURCE_ID=String, 
SERV_ID=String, 
ACCT_ID=String, 
BILL_ID=String, 
SRC_BILL_ID=String, 
BILLING_CYCLE_ID=String, 
FEE_CYCLE_ID=String, 
ACCT_ITEM_TYPE_ID=String, 
ORIGINAL_AMOUNT=String, 
DISCOUNT_AMOUNT=String, 
DERATED_AMOUNT=String, 
ADJUST_AMOUNT=String, 
PPY_AMOUNT=String, 
PRINTED_AMOUNT=String, 
UNPRN_AMOUNT=String, 
AMOUNT=String, 
CREATED_DATE=String, 
STATE=String, 
STATE_DATE=String, 
LATE_FEE=String, 
DERATED_LATE_FEE=String, 
DEFAULT_ACCT_ID=String, 
CDR_DISCOUNT_AMOUNT=String, 
PAY_STATE=String, 
PAY_STATE_DATE=String, 
BAD_DEBT_DATE=String, 
TOTAL_UNIT=String, 
TOTAL_COUNT=String, 
CELL_COUNT=String, 
REFUSED_AMOUNT=String, 
DISCOUNT_ID=String, 
ANNOTATION=String, 
DEVOLVE_ID=String, 
ACC_REGION_ID=String, 
CORP_ORG_ID=String \
--null-string '\\N' \
--null-non-string '\\N' \
--hive-drop-import-delims \
--delete-target-dir 



