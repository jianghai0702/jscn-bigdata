#!/usr/bin/env bash

#模块名称
folder="tvlive"
#目标表名
target_provice_table_name="STG_CONFIG_CHANNEL"  # 卫视频道
target_local_table_name="STG_CONFIG_LOCAL_CHANNEL"  # 本地频道
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
etl_cycle1=`date -d "$v_cycle -16 day " +%Y%m%d`

#

#加载到stg表中
su - hdfs <<EOF
hive -e "
    LOAD DATA LOCAL INPATH '/AiInsight/channels/provice_${etl_cycle}.csv'
    OVERWRITE INTO TABLE ${target_provice_table_name} PARTITION(PT_TIME='${etl_cycle}');

    LOAD DATA LOCAL INPATH '/AiInsight/channels/locals_${etl_cycle}.csv'
    OVERWRITE INTO TABLE ${target_local_table_name} PARTITION(PT_TIME='${etl_cycle}');
    "
exit;
EOF