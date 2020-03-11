#!/bin/bash
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

#申明要跑的表
tables=(
       "ST_USER_NETWORK_BEH_M"
       "ST_CUST_FEAT_DTL_M"
       "ST_ZG_ACCT"
       "ST_USER_VIEW_BEH_M"
       )

#获取脚本所在路径
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

#调用通用脚本导数
for table in "${tables[@]}"; do
    ${DIR}/hdfs_2_oracle_anytable.sh "${table}" "${v_cycle}"
done