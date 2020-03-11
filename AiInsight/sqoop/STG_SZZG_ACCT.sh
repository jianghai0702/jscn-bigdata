#!/usr/bin/env bash
#获取统计周期 
#账户状态码的意义 
sqoop import \
--connect "jdbc:oracle:thin:@111.208.67.27:1521/orcl" \
--username "st" \
--password "st" \
--query " select  T.*,SYSDATE FROM SZZG.ACCT@JSBI T where \$CONDITIONS " \
--target-dir "/asiainfo/hive/STG/STG_SZZG_ACCT " \
--fields-terminated-by '\t' \
--num-mappers 1 \
--verbose \
--hive-import \
--hive-overwrite \
--hive-database default \
--hive-table STG_SZZG_ACCT \
--null-string '\\N' \
--null-non-string '\\N' \
--hive-drop-import-delims 


