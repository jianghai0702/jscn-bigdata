#!/bin/bash
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
sqoop export \
--connect "jdbc:mysql://111.208.67.27/st" \
--username "st" \
--password "st" \
--verbose \
--num-mappers 1 \
--table param_add_adjust_test \ 
--export-dir /asiainfo/hive/ST/st_param_add_adjust \
--input-fields-terminated-by '|' \
--fields-terminated-by ','\
--input-null-string '\\N' \
--input-null-non-string '\\N'