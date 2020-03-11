#!/usr/bin/env bash
sqoop export \
--connect "jdbc:mysql://10.10.100.137/st" \
--username "st" \
--password "st" \
--verbose \
--num-mappers 1 \
--table ST_LAN_ARPU_M \ 
--export-dir /asiainfo/hive/ST/ST_LAN_ARPU_M_B2 \
--input-fields-terminated-by '|' \
--fields-terminated-by ','\
--input-null-string '\\N' \
--input-null-non-string '\\N'