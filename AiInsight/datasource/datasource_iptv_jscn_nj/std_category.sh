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
sourceDBIP="111.208.67.27"
sourceDBIsOracle="FALSE"
sourceDBUser="st"
sourceDBPass="st"
sourceDB="st"
sourceDBPort='3306'   #oracle:1521  mysql:3306
sourceTable="dim_std_category"

if [[ sourceDBIsOracle = 'TRUE' ]]
then
	sourceDBDriver="oracle.jdbc.driver.OracleDriver"
	sourceDBUrl="jdbc:oracle:thin:@${sourceDBIP}:${sourceDBPort}/${sourceDB}"
else
	sourceDBDriver="com.mysql.jdbc.Driver"
	sourceDBUrl="jdbc:mysql://${sourceDBIP}:${sourceDBPort}/${sourceDB}"
fi
echo "驱动：${sourceDBDriver}"
echo "源数据库: ${sourceDBUrl}"


# 目标
datasourceDB="datasource_${siteName}"
datasourceTable="std_category"
datasourceDir="/asiainfo/${datasourceDB}/${datasourceTable}/${pt_mon}"
echo "存储目录：${datasourceDir}"




# 查看文件是否存在
# 如果有备份，则使用备份数据
# su - hdfs <<EOF
# #删除源数据
# hdfs dfs -rm -r -f ${datasourceDir};
# 
# hdfs dfs -test -e ${datasourceDir}_bak
# if [ \$? -eq 0 ] ; then
# 	echo "有数据"
# 	#echo "正在拷贝备份数据..."
# 	#echo "${datasourceDir}_bak"
# 	#hdfs dfs -cp '${datasourceDir}_bak/'  '${datasourceDir}'
# else
# 	echo "无数据"
# fi
# 
# #删除备份数据
# #hdfs dfs -rm -r -f '${datasourceDir}_bak'
# exit;
# EOF



# hdfs dfs -ls /asiainfo/datasource_iptv_jscn_nj/std_category/201910
# su - hdfs 
# hdfs dfs -rm -r -f /asiainfo/datasource_iptv_jscn_nj/std_category/201910


# 抽取数据
su - hdfs <<EOF
echo "正在抽取远程数据..."
echo "${sourceDBUrl}"
sqoop import \
--connect $sourceDBUrl \
--username $sourceDBUser \
--password $sourceDBPass \
--delete-target-dir \
--table $sourceTable \
--target-dir $datasourceDir \
--fields-terminated-by '\001' \
--as-parquetfile \
-z \
-m 1
exit;
EOF




#datasource数据备份
#su - hdfs <<EOF
#echo "正在备份数据..."
#echo "${datasourceDir}"
#hdfs dfs -cp '${datasourceDir}/*'  '${datasourceDir}_bak/';
#exit;
#EOF







