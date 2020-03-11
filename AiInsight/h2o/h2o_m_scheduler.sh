#!/bin/bash
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

#申明要跑的表
tables=(
    "st_ecommerce_consume_user_m"
    "st_diff_time_website_request_m"
    "st_auth_mode_m"
    "st_net_flow_m"
    "st_net_speed_m"
    "st_packet_loss_m"
    "st_domain_request_response_m"
    "st_bcpt_deployment_m"
    "st_web_browse_m"
    "st_diff_task_web_browse_m"
    "st_video_view_m"
    "st_diff_task_video_view_m"
    "st_other_web_browse_m"
    "st_other_video_view_m"
    "st_other_download_m"
    "st_tx_report_m"
    "st_dns_domain_request_m"
    "st_dns_domain_response_m"
       )


#获取脚本所在路径
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

#调用通用脚本导数
for table in "${tables[@]}"; do
    sh ${DIR}/h2o_sqoop_anytable.sh "${table}" "${table}" pt_mon "${v_cycle}"
done
