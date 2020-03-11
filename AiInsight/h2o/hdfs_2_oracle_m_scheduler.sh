#!/bin/bash
source /etc/profile
#oracle连接文件
connect_file=/data/orcl_pswd/orcl_connect
connect_info=`cat ${connect_file}`

#月报
#日报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

#获取月份
lmonth=`date -d "$v_cycle -1 month" +%Y%m`

#hadoop导出文件
hive -e "select * from st_ecommerce_consume_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_ecommerce_consume_user_m.csv
hive -e "select * from st_diff_time_website_request_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_time_website_request_m.csv
hive -e "select * from st_auth_mode_m where pt_mon=$lmonth" > /data/hadoop_output/st_auth_mode_m.csv
hive -e "select * from st_net_flow_m where pt_mon=$lmonth" > /data/hadoop_output/st_net_flow_m.csv
hive -e "select * from st_net_speed_m where pt_mon=$lmonth" > /data/hadoop_output/st_net_speed_m.csv
hive -e "select * from st_packet_loss_m where pt_mon=$lmonth" > /data/hadoop_output/st_packet_loss_m.csv
hive -e "select * from st_domain_request_response_m where pt_mon=$lmonth" > /data/hadoop_output/st_domain_request_response_m.csv
hive -e "select * from st_bcpt_deployment_m where pt_mon=$lmonth" > /data/hadoop_output/st_bcpt_deployment_m.csv
hive -e "select * from st_web_browse_m where pt_mon=$lmonth" > /data/hadoop_output/st_web_browse_m.csv
hive -e "select * from st_diff_task_web_browse_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_task_web_browse_m.csv
hive -e "select * from st_video_view_m where pt_mon=$lmonth" > /data/hadoop_output/st_video_view_m.csv
hive -e "select * from st_diff_task_video_view_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_task_video_view_m.csv
hive -e "select * from st_other_web_browse_m where pt_mon=$lmonth" > /data/hadoop_output/st_other_web_browse_m.csv
hive -e "select * from st_other_video_view_m where pt_mon=$lmonth" > /data/hadoop_output/st_other_video_view_m.csv
hive -e "select * from st_other_download_m where pt_mon=$lmonth" > /data/hadoop_output/st_other_download_m.csv
hive -e "select * from st_tx_report_m where pt_mon=$lmonth" > /data/hadoop_output/st_tx_report_m.csv

hive -e "select * from st_dns_domain_request_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_domain_request_m.csv
hive -e "select * from st_dns_domain_response_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_domain_response_m.csv


#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_ecommerce_consume_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_time_website_request_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_auth_mode_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_net_flow_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_net_speed_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_packet_loss_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_domain_request_response_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_bcpt_deployment_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_web_browse_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_task_web_browse_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_video_view_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_task_video_view_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_other_web_browse_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_other_video_view_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_other_download_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_tx_report_m where pt_mon=to_date('$lmonth','yyyymm');

delete from st_dns_domain_request_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_dns_domain_response_m where pt_mon=to_date('$lmonth','yyyymm');

commit;
exit
EOF

#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_ecommerce_consume_user_m.ctl' log='/data/ctl_log/st_ecommerce_consume_user_m.log' bad='/data/ctl_bad/st_ecommerce_consume_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_time_website_request_m.ctl' log='/data/ctl_log/st_diff_time_website_request_m.log' bad='/data/ctl_bad/st_diff_time_website_request_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_auth_mode_m.ctl' log='/data/ctl_log/st_auth_mode_m.log' bad='/data/ctl_bad/st_auth_mode_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_net_flow_m.ctl' log='/data/ctl_log/st_net_flow_m.log' bad='/data/ctl_bad/st_net_flow_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_net_speed_m.ctl' log='/data/ctl_log/st_net_speed_m.log' bad='/data/ctl_bad/st_net_speed_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_packet_loss_m.ctl' log='/data/ctl_log/st_packet_loss_m.log' bad='/data/ctl_bad/st_packet_loss_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_domain_request_response_m.ctl' log='/data/ctl_log/st_domain_request_response_m.log' bad='/data/ctl_bad/st_domain_request_response_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_bcpt_deployment_m.ctl' log='/data/ctl_log/st_bcpt_deployment_m.log' bad='/data/ctl_bad/st_bcpt_deployment_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_web_browse_m.ctl' log='/data/ctl_log/st_web_browse_m.log' bad='/data/ctl_bad/st_web_browse_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_task_web_browse_m.ctl' log='/data/ctl_log/st_diff_task_web_browse_m.log' bad='/data/ctl_bad/st_diff_task_web_browse_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_video_view_m.ctl' log='/data/ctl_log/st_video_view_m.log' bad='/data/ctl_bad/st_video_view_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_task_video_view_m.ctl' log='/data/ctl_log/st_diff_task_video_view_m.log' bad='/data/ctl_bad/st_diff_task_video_view_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_other_web_browse_m.ctl' log='/data/ctl_log/st_other_web_browse_m.log' bad='/data/ctl_bad/st_other_web_browse_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_other_video_view_m.ctl' log='/data/ctl_log/st_other_video_view_m.log' bad='/data/ctl_bad/st_other_video_view_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_other_download_m.ctl' log='/data/ctl_log/st_other_download_m.log' bad='/data/ctl_bad/st_other_download_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tx_report_m.ctl' log='/data/ctl_log/st_tx_report_m.log' bad='/data/ctl_bad/st_tx_report_m.bad'


sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_domain_request_m.ctl' log='/data/ctl_log/st_dns_domain_request_m.log' bad='/data/ctl_bad/st_dns_domain_request_m.bad'

sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_domain_response_m.ctl' log='/data/ctl_log/st_dns_domain_response_m.log' bad='/data/ctl_bad/st_dns_domain_response_m.bad'
