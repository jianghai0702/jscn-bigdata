#!/bin/bash
#删除表
#
#1、删除表
#2、删除表数据

db=$1
table=$2


hive -e "drop table if exists iptv_ods.ods_dr_ismp;"

su - hdfs <<EOF

hdfs dfs -rm -r -f "/asiainfo/jscn_bigdata/iptv/ods/ods_dr_ismp"

exit;
EOF