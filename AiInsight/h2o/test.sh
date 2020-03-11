#!/bin/bash
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

#申明要跑的表
tables=(
       "ST_TVLIVE_CHANNEL_MARKET_M"
       "ST_TVLIVE_USERS_DEV_M"
       )
#"ST_LAN_PRODUCT_ORDER_DTL_M"
#获取脚本所在路径
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

#调用通用脚本导数
for table in "${tables[@]}"; do
    sh ${DIR}/h2o_sqoop_anytable.sh "${table}"  "${table}"  pt_mon "${v_cycle}"
done
