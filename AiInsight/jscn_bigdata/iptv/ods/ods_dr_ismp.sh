#!/bin/bash
################################################
# 1.本文件用于将datasource的数据加载到datalake
# 2.本文件的执行方式：sh load_data_full_sqoop.sh 201910
# 3.先将mysql数据导入临时文件夹/sqoop/ods, 每个表的数据都使用单独文件夹如/sqoop/ods/ods_code_category
#
#
#
#
#	执行参数规范：
#		1.proessDate：处理日期日调度yyyyMMdd,月调度yyyyMM01（使用时需要将传入时间减去一个周期）
#################################################


#参数
#################
#防止服务器异常，手动补数据
#proessDate：处理日期:20191101
#siteName：驻地:IPTV_JSYD_NJ / OTT_JSYD_NJ
proessDate=${1}
siteName=${2}

if [[ ${#proessDate} == 0 ]]; then
	proessDate=`cat /AiInsight/jscn_bigdata/other/config/proessDate.ini`
fi

if [[ ${#siteName} == 0 ]]; then
	siteName=`cat /AiInsight/jscn_bigdata/iptv/other/config/siteName.ini`
fi
echo "=============TIME=============="
echo "PROESS_DATE:${proessDate}"
echo "SITE_NAME:${siteName}"

#数据日期
###############
currentYear=$(date -d "$proessDate -1 month" +%Y)
currentMonth=$(date -d "$proessDate -1 month" +%m)
currentDay=$(date -d "$proessDate -1 month" +%d)
pt_time="${currentYear}${currentMonth}${currentDay}"
pt_mon="${currentYear}${currentMonth}"
echo "ETL_MONTH:${pt_mon}"
echo "ETL_TIME:${pt_time}"
echo "=============END=============="






# 配置
###############
# logs配置
DATASOURCE_DB="-"
DATASOURCE_DB_TABLE="dwd_dr_ismp"
DATASOURCE_HDFS_DIR="/asiainfo/jscn_bigdata/iptv/other/logs/${DATASOURCE_DB_TABLE}"
DATASOURCE_LINUX_DIR="/AiInsight/jscn_bigdata/iptv/other/logs/${DATASOURCE_DB_TABLE}"
#ODS配置
ODS_DB="iptv_ods"
ODS_DB_TABLE="ods_dr_ismp"
ODS_DB_TABLE_DIR="/asiainfo/jscn_bigdata/iptv/ods/${ODS_DB_TABLE}"





#创建数据库
#su - hdfs <<EOF 
#hive -e """
#CREATE DATABASE IF NOT EXISTS ${ODS_DB};
#"""
#exit;
#EOF


#创建表
# su - hdfs <<EOF 
# hive -e """
# CREATE EXTERNAL TABLE IF NOT EXISTS iptv_ods.ods_dr_ismp (
# 
# TRADEMARK			string,
# DR_TYPE				string,
# SERVICE_ID			string,
# BILL_MONTH			string,
# VALID_RATE_PROD_ID	string,
# 
# RATE_PROD_ID		string,
# PRODUCT_ID			string,
# PROMOTION_PRODS		string,
# PLAN_ID				string,
# CUST_ID				string,
# 
# ACC_ID				string,
# USER_ID				string,
# CONDITION_ID		string,
# USER_NUMBER			string,
# HPLMN1				string,
# 
# HPLMN2				string,
# HPLMN3				string,
# START_TIME			string,
# STOP_TIME			string,
# RATING_RES			string,
# 
# RATING_FLAG			string,
# ITEM_CODE1			string,
# CHARGE1				string,
# CHARGE1_DISC		string,
# ITEM_CODE2			string,
# 
# CHARGE2				string,
# CHARGE2_DISC		string,
# ITEM_CODE3			string,
# CHARGE3				string,
# CHARGE3_DISC		string,
# 
# ITEM_CODE4			string,
# CHARGE4				string,
# CHARGE4_DISC		string,
# FREE_RES_VAL		string,
# ADDUP_RES_VAL		string,
# 
# SEQUENCE_NO			string,
# RECORD_TYPE			string,
# OPP_NUMBER			string,
# CP_CODE				string,
# CONTENT_ID			string,
# 
# SERVICE_CODE		string,
# PPV_ID				string,
# BILL_FLAG			string,
# ORI_BASIC_CHARGE	string,
# ORI_OTHER_CHARGE	string,
# 
# STD_BASIC_CHARGE	string,
# STD_OTHER_CHARGE	string,
# PROCESS_TIME		string,
# ORIGINAL_FILE		string,
# CORP_ORG_ID			string,
# 
# ROAM_TYPE			string,
# USER_TYPE			string,
# BACKUP_DATE			string,
# REDO_FLAG			string,
# RESERVE1			string,
# 
# RESERVE2			string,
# RESERVE3			string,
# RESERVE4			string,
# FILM_NAME			string,
# USER_PROPERTY		string,
# 
# MONITOR_CDR			string,
# STD_ERR_CODE		string,
# ACC_ITEM_CODE1		string,
# ACC_ITEM_CODE2		string,
# ACC_ITEM_CODE3		string,
# 
# ACC_ITEM_CODE4		string,
# LATE_LINK			string,
# INPUT_TIME			string,
# ROW_ID				string,
# OWN_CORP_STD_ORG_CODE		string,
# 
# DATA_SOURCE_CD		string,
# IS_HISTORY_DATA		string,
# ETL_CYCLE			string,
# ETL_DATE			string,
# CHANNELID			string,
# CHANNELNAME			string
# )
# partitioned by (pt_mon string)
# row format delimited
# fields terminated by '\001'
# lines terminated by '\n'
# stored as parquet
# LOCATION '/asiainfo/jscn_bigdata/iptv/ods/ods_dr_ismp';
# """
# exit;
# EOF




#加载数据
echo "LOAD DATA INPATH  "/asiainfo/jscn_bigdata/iptv/other/datasource/dwd_dr_ismp/${pt_mon}" '${DATASOURCE_LINUX_DIR}/${pt_mon}' OVERWRITE INTO TABLE ${ODS_DB}.${ODS_DB_TABLE} PARTITION (pt_mon='${pt_mon}');
"
su - hdfs <<EOF
hive -e """
LOAD DATA LOCAL INPATH '${DATASOURCE_LINUX_DIR}/${pt_mon}' OVERWRITE INTO TABLE ${ODS_DB}.${ODS_DB_TABLE} PARTITION (pt_mon='${pt_mon}');
"""
exit;
EOF

