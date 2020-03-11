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
# 数据源配置
SOURCE_DB_IP="111.208.88.1"
SOURCE_DB_PORT='1521'   #oracle:1521  mysql:3306
SOURCE_DB_IS_ORACLE="TRUE"
SOURCE_DB_USER="SJGS"
SOURCE_DB_PASSWORD="sjgs123"
SOURCE_DB="jsbi"
SOURCE_DB_TABLE="DWD.DWD_DR_ISMP_${currentYear}${currentMonth}"
if [[ $SOURCE_DB_IS_ORACLE = 'TRUE' ]]; then
	SOURCE_DB_DRIVER="oracle.jdbc.driver.OracleDriver"
	SOURCE_DB_URL="jdbc:oracle:thin:@${SOURCE_DB_IP}:${SOURCE_DB_PORT}/${SOURCE_DB}"
else
	SOURCE_DB_DRIVER="com.mysql.jdbc.Driver"
	SOURCE_DB_URL="jdbc:mysql://${SOURCE_DB_IP}:${SOURCE_DB_PORT}/${SOURCE_DB}"
fi
# 存储配置
DATASOURCE_DB="-"
DATASOURCE_DB_TABLE="dwd_dr_ismp"
DATASOURCE_HDFS_DIR="/asiainfo/jscn_bigdata/iptv/other/logs/${DATASOURCE_DB_TABLE}"




# 抽取数据
su - hdfs <<EOF
sqoop import \
--connect ${SOURCE_DB_URL} \
--username ${SOURCE_DB_USER} \
--password ${SOURCE_DB_PASSWORD} \
--table ${SOURCE_DB_TABLE} \
--delete-target-dir \
--target-dir "${DATASOURCE_HDFS_DIR}/${pt_mon}" \
--fields-terminated-by '\001' \
--split-by SERVICE_ID \
-m 4 \
-z
exit;
EOF

