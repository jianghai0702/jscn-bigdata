#!/bin/bash
################################################
# 1.本文件用于将datasource的数据加载到datalake
# 2.本文件的执行方式：sh load_data_full_sqoop.sh 201910
# 3.先将mysql数据导入临时文件夹/sqoop/ods, 每个表的数据都使用单独文件夹如/sqoop/ods/ods_code_category
#
#################################################


#参数
#################
#防止服务器异常，手动补数据
#proessDate：处理日期:20191101
#siteName：驻地:IPTV_JSYD_NJ / OTT_JSYD_NJ
proessDate=${1}
siteName=${2}

if [[ ${#proessDate} == 8 ]]
then
	echo "使用自定义日期 proessDate:${proessDate}"
else
	proessDate=`cat /AiInsight/config/proessDate.ini`
	echo "使用系统的日期 proessDate:${proessDate}"
fi

if [[ ${#siteName} -gt 8 ]]
then
	echo "使用自定义驻地 siteName:${siteName}"
else
	siteName=`cat /AiInsight/config/iptvSiteName.ini`
	echo "使用自定义驻地 siteName:${siteName}"
fi





#数据日期
###############
currentYear=$(date -d "$proessDate -1 month" +%Y)
currentMonth=$(date -d "$proessDate -1 month" +%m)
currentDay=$(date -d "$proessDate -1 month" +%d)
pt_time="${currentYear}${currentMonth}${currentDay}"
pt_mon="${currentYear}${currentMonth}"
echo "数据日期：${pt_time}"
echo "数据月份：${pt_mon}"







# 源数据库
###############
# 目标
datasourceDB="datasource_${siteName}"
datasourceTable="std_category"  # 修改
datasourceDir="/asiainfo/${datasourceDB}/${datasourceTable}/${pt_mon}"

# 存储
datalakeDB="datalake_${siteName}"
datalakeTable="lake_std_category"  #修改
datalakeDir="/asiainfo/${datalakeDB}/${datalakeTable}"




# 创建数据库
su - hdfs <<EOF
echo "创建数据库：${datalakeDB}"
hive -e """
CREATE DATABASE IF NOT EXISTS ${datalakeDB};
"""
exit;
EOF


#创建表
su - hdfs <<EOF
echo "创建表：${datalakeDB}.${datalakeTable}";

hive -e """
CREATE EXTERNAL TABLE IF NOT EXISTS ${datalakeDB}.${datalakeTable} (
channel_name string,
category_name string,
start_time string,
start_minute_code int,
end_time string,
end_minute_code int,
day_of_week int,
remark string,
update_time string
)
partitioned by (pt_mon string)
row format delimited
fields terminated by '\001'
lines terminated by '\n'
stored as parquet
LOCATION '${datalakeDir}';
"""
exit;
EOF



#datasource数据加载到datalake表中
# 每次load之后，删除datasource
su - hdfs <<EOF
hdfs dfs -test -e "${datasourceDir}"
if [ $? -eq 0 ] ; then
	echo ""
else
	echo "无数据"
	exit;
fi

hive -e """
LOAD DATA INPATH '${datasourceDir}' OVERWRITE INTO TABLE  ${datalakeDB}.${datalakeTable} PARTITION(pt_mon='${pt_mon}');
"""

# 删除
hdfs dfs -r -f '${datasourceDir}';
exit;
EOF

