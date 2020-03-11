#!/usr/bin/env bash
#获取统计周期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

sqoop import \
--connect "jdbc:oracle:thin:@111.208.88.1:1521/jsbi" \
--username "SJGS" \
--password "sjgs123" \
--query '
select * from (
select  * 
from  zg.acct_item_0
where billing_cycle_id = ${v_cycle}
union 
select  * 
from  zg.acct_item_1
where billing_cycle_id = ${v_cycle}
) T
where $CONDITIONS
' \
--hive-database "default" \
--hive-table "default.stg_zg_acct_item" \
--verbose \
--hive-import \
--hive-partition-key pt_mon \
--hive-partition-value "${etl_cycle}" \
--hive-overwrite \
# 空字符串转换
--null-string '\\N' \
--null-non-string '\\N' \
# 剔除源数据中的hive分隔符，避免出现字段错误等分隔符导致的问题
--hive-drop-import-delims \
# 目标目录已经存在时删除目标目录
--delete-target-dir \