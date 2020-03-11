#!/bin/bash
if [ -n "$1" ];then
   cycle=$1
else 
   cycle=`date +%Y%m%d`
fi
echo "cycleid = $cycle"

# 客户流失模型的计算
rm -f /AiInsight/datamining/requirements.txt
# /usr/local/bin/python /AiInsight/datamining/custloss/lossModel.py cycle
#hive -e "load data local inpath '/AiInsight/datamining/custloss/custloss_table.csv' overwrite into table dwa_model_result_cust_loss_test partition (pt_mon = '201707')"