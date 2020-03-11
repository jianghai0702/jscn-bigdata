#!/bin/bash
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

#申明要跑的表
tables=(
        "st_user_dev_m"
        "st_diff_prod_user_dev_m"
        "st_diff_channel_user_dev_m"
        "st_income_m"
        "st_diff_prod_income_m"
        "st_diff_bandwidth_income_m"
        "st_diff_cycle_income_m"
        "st_diff_online_media_user_m"
        "st_diff_device_cate_user_m"
        "st_diff_times_user_m"
        "st_diff_online_days_user_m"
        "st_diff_online_length_user_m"
        "st_diff_times_device_user_m"
        "st_bandwidth_length_user_m"
        "st_repay_users_mon"
        "st_lost_users_mon"
        "st_user_online_mon"
        "st_auth_m"
        "st_diff_prod_failure_reason_m"
        "st_auth_rate_m"
        "st_auth_failure_reason_m"
        "st_diff_corp_income_m"
        "st_diff_region_income_m"
        "st_diff_offer_income_m"
        "st_diff_corp_user_dev_m"
        "st_diff_region_user_dev_m"
        "st_diff_offer_user_dev_m"
        "st_all_users_mon"
        "st_dns_response_failure_m"
        "st_dns_response_m"
        "st_diff_device_user_m"
        "st_diff_offer_urltype_user_m"
        "st_diff_offer_user_m"
        "st_diff_time_urltype_user_m"
        "st_diff_time_user_m"
        "st_diff_url_diff_device_user_m"
        "st_diff_url_type_user_m"
        "st_diff_url_user_m"
        "st_diff_workday_user_m"
        "st_auth_mode_m"
       )

tables_all=(
        "dim_std_product"
)


#获取脚本所在路径
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

#调用通用脚本导数
for table in "${tables[@]}"; do
    sh ${DIR}/h2o_sqoop_anytable.sh "${table}" "${table}" pt_mon "${v_cycle}"
done

for table1 in "${tables_all[@]}"; do
    sh ${DIR}/h2o_sqoop_anytable.sh "${table1}" "${table1}"
done
