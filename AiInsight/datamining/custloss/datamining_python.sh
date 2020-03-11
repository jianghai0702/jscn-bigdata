#!/bin/bash

if [ -n "$1" ];then
   cycle=$1
else 
   cycle=`date +%Y%m%d`
fi
echo "cycleid = $cycle"

# 客户流失模型脚本
rm -f /AiInsight/datamining/custloss/custloss_table.csv
/usr/local/bin/python /AiInsight/datamining/custloss/lossModel.py $cycle
hive -e "load data local inpath '/AiInsight/datamining/custloss/custloss_table.csv' 
overwrite into table dwa_model_result_cust_loss partition (pt_mon = $cycle) "

# 客户价值模型脚本
#rm -f /AiInsight/datamining/custvalue/custvalue_table.csv
#/usr/local/bin/python /AiInsight/datamining/custvalue/custValueModel.py $cycle
#hive -e "load data local inpath '/AiInsight/datamining/custvalue/custvalue_table.csv' 
#overwrite into table dwa_model_result_cust_value partition (pt_mon = $cycle) "

# 套餐价值模型脚本
#rm -f /AiInsight/datamining/offervalue/offervalue_table.csv
#/usr/local/bin/python /AiInsight/datamining/offervalue/offerValueModel.py $cycle
#hive -e "load data local inpath '/AiInsight/datamining/offervalue/offervalue_table.csv' 
#overwrite into table dwa_model_result_offer_value partition (pt_mon = $cycle) "

# 套餐推荐模型脚本
#rm -f /AiInsight/datamining/offerrec/offerrec_table.csv
#/usr/local/bin/python /AiInsight/datamining/offerrec/offerRecModel.py $cycle
#hive -e "load data local inpath '/AiInsight/datamining/offerrec/offerrec_table.csv' 
#overwrite into table dwa_model_result_offer_recm partition (pt_mon = $cycle) "

# 用户推荐模型脚本
#
#su hdfs << EOF
#hdfs dfs -test -f dm/mrscripts/usergroup_content_score
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_content_score
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_common
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_common
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_score_sim
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_score_sim
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_sim
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_sim
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_sim_keys
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_sim_keys
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_score_keys
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_score_keys
#fi
#
#hdfs dfs -test -f dm/mrscripts/usergroup_content_score_sim
#if [ $? -eq 0 ] ;then
#    hdfs dfs -rm -r dm/mrscripts/usergroup_content_score_sim
#fi
#
#
#hdfs dfs -copyFromLocal /AiInsight/datamining/userrecm/usergroup_content_score.data dm/mrscripts/usergroup_content_score
#
#
#/usr/local/bin/python /AiInsight/datamining/userrecm/jobRunner.py 

