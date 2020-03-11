#!/bin/bash
################################################
# 1.本文件用于将MYSQL的数据迁移到HDFS
# 2.本文件的执行方式：sh load_data_full_sqoop.sh 201910
# 3.先将mysql数据导入临时文件夹/sqoop/ods, 每个表的数据都使用单独文件夹如/sqoop/ods/ods_code_category
#
#################################################

#参数
#################
#防止服务器异常，手动补数据
#proessDate：处理日期:2019-11-01
#siteName：驻地:IPTV_JSYD_NJ / OTT_JSYD_NJ
proessDate=${1}
siteName=${2}

if [[ ${#proessDate} == 10 ]]
then
	echo "使用自定义日期 proessDate:${proessDate}"
else
	proessDate=`cat /AiInsight/config/proessDate.ini`
	echo "使用系统的日期 proessDate:${proessDate}"
fi

if [[ ${#siteName} -gt 10 ]]
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
pt_time="${currentYear}-${currentMonth}-${currentDay}"
pt_mon="${currentYear}-${currentMonth}"
echo "数据日期：${pt_time}"
echo "数据月份：${pt_mon}"





# 源数据库
###############
sourceDBIP="111.208.88.1"
sourceDBIsOracle="TRUE"
sourceDBUser="SJGS"
sourceDBPass="sjgs123"
sourceDB="jsbi"
sourceDBPort='1521'   #oracle:1521  mysql:3306
sourceTable="DWD.DWD_DR_ISMP_${currentYear}${currentMonth}"

if [[ sourceDBIsOracle = 'TRUE' ]]
then
	sourceDBDriver="oracle.jdbc.driver.OracleDriver"
	sourceDBUrl="jdbc:oracle:thin:@${sourceDBIP}:${sourceDBPort}/${sourceDB}"
else
	sourceDBDriver="com.mysql.jdbc.Driver"
	sourceDBUrl="jdbc:mysql://${sourceDBIP}:${sourceDBPort}/${sourceDB}"
fi


# 目标
datasourceDB="datasource_${siteName}"
datasourceTable="dr_ismp"
datasourceDir="/asiainfo/${datasourceDB}/${datasourceTable}/${pt_mon}"





# 抽取数据
su - hdfs <<EOF
sqoop import \
--connect $sourceDBUrl \
--username $sourceDBUser \
--password $sourceDBPass \
--delete-target-dir \
--table $sourceTable \
--target-dir datasourceDir \
--fields-terminated-by '\001' \
--as-parquetfile \
-z \
-m 1
exit;
EOF



