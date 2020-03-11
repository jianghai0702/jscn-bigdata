#!/usr/bin/env bash
#获取统计周期
sqoop import \
--connect "jdbc:oracle:thin:@111.208.67.27:1521/orcl" \
--username "st" \
--password "st" \
--query " select  * FROM  ZG.ACCT_ITEM_SERVICE@JSBI where \$CONDITIONS " \
--target-dir "/asiainfo/hive/STG/STG_ZG_ACCT_ITEM_SERVICE " \
--fields-terminated-by '\t' \
--num-mappers 1 \
--verbose \
--hive-import \
--hive-overwrite \
--hive-database default \
--hive-table STG_ZG_ACCT_ITEM_SERVICE \
--null-string '\\N' \
--null-non-string '\\N' \
--hive-drop-import-delims 


