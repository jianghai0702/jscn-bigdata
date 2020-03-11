#!/bin/bash
#######################################################
#定义变量
#######################################################
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="STG_SZZG_ACCT_ITEM_N"

#######################################################
#脚本开始
##########################################g#############
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天

echo ${etl_cycle}
echo ${data_cycle}

su - hdfs <<EOF
sqls =  `echo -e "select T.* from (select * from szzg.acct_item_0@JSBI where billing_cycle_id = 201903 union
select * from szzg.acct_item_1@JSBI where billing_cycle_id = 201903 union \n
select * from szzg.acct_item_2@JSBI where billing_cycle_id = 201903 ) T where \$CONDITIONS "`
exit;
EOF


