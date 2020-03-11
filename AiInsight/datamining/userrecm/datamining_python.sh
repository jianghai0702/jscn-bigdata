#!/bin/bash

if [ -n "$1" ];then
   cycle=$1
else 
   cycle=`date +%Y%m%d`
fi
echo "cycleid = $cycle"

# 客户流失模型脚本
#rm -f /AiInsight/datamining/custloss/custloss_table.csv
#/usr/local/bin/python /AiInsight/datamining/custloss/lossModel.py cycle
#hive -e "load data local inpath '/AiInsight/datamining/custloss/custloss_table.csv' 
#overwrite into table dwa_model_result_cust_loss partition (pt_mon = $cycle) "

# 客户价值模型脚本
#rm -f /AiInsight/datamining/custvalue/custvalue_table.csv
#/usr/local/bin/python /AiInsight/datamining/custvalue/custValueModel.py cycle
#hive -e "load data local inpath '/AiInsight/datamining/custvalue/custvalue_table.csv' 
#overwrite into table dwa_model_result_cust_value partition (pt_mon = $cycle) "

# 套餐价值模型脚本
#rm -f /AiInsight/datamining/offervalue/offervalue_table.csv
#/usr/local/bin/python /AiInsight/datamining/offervalue/offerValueModel.py cycle
#hive -e "load data local inpath '/AiInsight/datamining/offervalue/offervalue_table.csv' 
#overwrite into table dwa_model_result_offer_value partition (pt_mon = $cycle) "

# 套餐推荐模型脚本
#rm -f /AiInsight/datamining/offerrec/offerrec_table.csv
#/usr/local/bin/python /AiInsight/datamining/offerrec/offerRecModel.py cycle
#hive -e "load data local inpath '/AiInsight/datamining/offerrec/offerrec_table.csv' 
#overwrite into table dwa_model_result_offer_recm partition (pt_mon = $cycle) "

# 用户推荐模型脚本
/usr/local/bin/python /AiInsight/datamining/userrecm/userScoreSimStep1.py -r hadoop \
 </AiInsight/datamining/userrecm/user_content_score.data> /AiInsight/datamining/userrecm/content_user_score.data
/usr/local/bin/python /AiInsight/datamining/userrecm/userScoreCommonCnt.py -r hadoop \
</AiInsight/datamining/userrecm/content_user_score.data> /AiInsight/datamining/userrecm/user_common.data
/usr/local/bin/python /AiInsight/datamining/userrecm/userScoreSimStep2.py -r hadoop \
</AiInsight/datamining/userrecm/content_user_score.data> /AiInsight/datamining/userrecm/user_score_sim.data
/usr/local/bin/python /AiInsight/datamining/userrecm/userScoreSim.py
