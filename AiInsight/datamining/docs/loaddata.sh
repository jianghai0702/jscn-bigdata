#!/bin/sh
#
# ===========================================================================
# 程序名称:     loaddata.sh
# 功能描述:     load model result data to hdfs
# 输入参数:     每月同步
#   创建人:     孙万菊
# 创建日期:     2017-12-24
# 版本说明:     v1.0
# 代码审核:   
# 修改人名:
# 修改日期:
# 修改原因:
# 修改列表:
# ===========================================================================

# get the cycle date
#echo `date "+%Y%m%d"` > /AiInsight/datamining/utils/pydate
if [ -n "$1" ];then
   cycle=$1
else
   cycle=`date +%Y%m`
fi


## load model result data  to hdfs
### cust_result
hive -e "
load data local inpath '/sunwj_tmp/custloss_table_${cycle}.csv' overwrite into table dwa_model_result_test partition (pt_mon =
 ${cycle});

load data local inpath '/sunwj_tmp/offervalue_result.csv' overwrite to table dwa



 "