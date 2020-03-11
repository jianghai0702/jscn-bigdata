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
hive -e "select * from st_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_user_dev_m.csv
hive -e "select * from st_diff_prod_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_prod_user_dev_m.csv
hive -e "select * from st_diff_channel_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_channel_user_dev_m.csv
hive -e "select * from st_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_income_m.csv
hive -e "select * from st_diff_prod_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_prod_income_m.csv
hive -e "select * from st_diff_bandwidth_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_bandwidth_income_m.csv
hive -e "select * from st_diff_cycle_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_cycle_income_m.csv
hive -e "select * from st_diff_online_media_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_online_media_user_m.csv
hive -e "select * from st_diff_device_cate_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_device_cate_user_m.csv
hive -e "select * from st_diff_times_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_times_user_m.csv
hive -e "select * from st_diff_online_days_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_online_days_user_m.csv
hive -e "select * from st_diff_online_length_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_online_length_user_m.csv
hive -e "select * from st_diff_times_device_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_times_device_user_m.csv
hive -e "select * from st_bandwidth_length_user_m where pt_mon=$lmonth" > /data/hadoop_output/st_bandwidth_length_user_m.csv
hive -e "select * from st_repay_users_mon where pt_mon=$lmonth" > /data/hadoop_output/st_repay_users_mon.csv
hive -e "select * from st_lost_users_mon where pt_mon=$lmonth" > /data/hadoop_output/st_lost_users_mon.csv
hive -e "select * from st_user_online_mon where pt_mon=$lmonth" > /data/hadoop_output/st_user_online_mon.csv
hive -e "select * from st_auth_m where pt_mon=$lmonth" > /data/hadoop_output/st_auth_m.csv
hive -e "select * from st_diff_prod_failure_reason_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_prod_failure_reason_m.csv
hive -e "select * from st_auth_rate_m where pt_mon=$lmonth" > /data/hadoop_output/st_auth_rate_m.csv
hive -e "select * from st_auth_failure_reason_m where pt_mon=$lmonth" > /data/hadoop_output/st_auth_failure_reason_m.csv
hive -e "select * from st_diff_corp_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_corp_income_m.csv
hive -e "select * from st_diff_region_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_region_income_m.csv
hive -e "select * from st_diff_offer_income_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_offer_income_m.csv
hive -e "select * from st_diff_corp_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_corp_user_dev_m.csv
hive -e "select * from st_diff_region_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_region_user_dev_m.csv
hive -e "select * from st_diff_offer_user_dev_m where pt_mon=$lmonth" > /data/hadoop_output/st_diff_offer_user_dev_m.csv
hive -e "select * from st_all_users_mon where pt_mon=$lmonth" > /data/hadoop_output/st_all_users_mon.csv
hive -e "select * from dim_std_product" > /data/hadoop_output/dim_std_product.csv
hive -e "select * from st_dns_response_failure_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_response_failure_m.csv
hive -e "select * from st_dns_response_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_response_m.csv


hive -e "select * from st_diff_device_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_device_user_m.csv 
hive -e "select * from st_diff_offer_urltype_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_offer_urltype_user_m.csv
hive -e "select * from st_diff_offer_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_offer_user_m.csv
hive -e "select * from st_diff_time_urltype_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_time_urltype_user_m.csv
hive -e "select * from st_diff_time_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_time_user_m.csv
hive -e "select * from st_diff_url_diff_device_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_url_diff_device_user_m.csv 
hive -e "select * from st_diff_url_type_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_url_type_user_m.csv 
hive -e "select * from st_diff_url_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_url_user_m.csv
hive -e "select * from st_diff_workday_user_m  where pt_mon=$lmonth" > /data/hadoop_output/st_diff_workday_user_m.csv





#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_prod_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_channel_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_prod_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_bandwidth_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_cycle_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_online_media_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_device_cate_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_times_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_online_days_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_online_length_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_times_device_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_bandwidth_length_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_repay_users_mon where pt_mon=to_date('$lmonth','yyyymm');
delete from st_lost_users_mon where pt_mon=to_date('$lmonth','yyyymm');
delete from st_user_online_mon where pt_mon=to_date('$lmonth','yyyymm');
delete from st_auth_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_prod_failure_reason_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_auth_rate_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_auth_failure_reason_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_corp_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_region_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_offer_income_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_corp_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_region_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_offer_user_dev_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_all_users_mon where pt_mon=to_date('$lmonth','yyyymm');
truncate table dim_std_product;
delete from st_dns_response_failure_m where pt_mon=to_date('$lmonth','yyyymm');

delete from st_diff_device_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_offer_urltype_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_offer_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_time_urltype_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_time_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_url_diff_device_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_url_type_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_url_user_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_workday_user_m where pt_mon=to_date('$lmonth','yyyymm');

delete from st_dns_response_failure_m where pt_mon='$lmonth' ;
delete from st_dns_response_m where pt_mon='$lmonth' ;

commit;
exit
EOF

#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_user_dev_m.ctl' log='/data/ctl_log/st_user_dev_m.log' bad='/data/ctl_bad/st_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_prod_user_dev_m.ctl' log='/data/ctl_log/st_diff_prod_user_dev_m.log' bad='/data/ctl_bad/st_diff_prod_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_channel_user_dev_m.ctl' log='/data/ctl_log/st_diff_channel_user_dev_m.log' bad='/data/ctl_bad/st_diff_channel_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_income_m.ctl' log='/data/ctl_log/st_income_m.log' bad='/data/ctl_bad/st_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_prod_income_m.ctl' log='/data/ctl_log/st_diff_prod_income_m.log' bad='/data/ctl_bad/st_diff_prod_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_bandwidth_income_m.ctl' log='/data/ctl_log/st_diff_bandwidth_income_m.log' bad='/data/ctl_bad/st_diff_bandwidth_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_cycle_income_m.ctl' log='/data/ctl_log/st_diff_cycle_income_m.log' bad='/data/ctl_bad/st_diff_cycle_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_online_media_user_m.ctl' log='/data/ctl_log/st_diff_online_media_user_m.log' bad='/data/ctl_bad/st_diff_online_media_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_device_cate_user_m.ctl' log='/data/ctl_log/st_diff_device_cate_user_m.log' bad='/data/ctl_bad/st_diff_device_cate_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_times_user_m.ctl' log='/data/ctl_log/st_diff_times_user_m.log' bad='/data/ctl_bad/st_diff_times_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_online_days_user_m.ctl' log='/data/ctl_log/st_diff_online_days_user_m.log' bad='/data/ctl_bad/st_diff_online_days_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_online_length_user_m.ctl' log='/data/ctl_log/st_diff_online_length_user_m.log' bad='/data/ctl_bad/st_diff_online_length_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_times_device_user_m.ctl' log='/data/ctl_log/st_diff_times_device_user_m.log' bad='/data/ctl_bad/st_diff_times_device_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_bandwidth_length_user_m.ctl' log='/data/ctl_log/st_bandwidth_length_user_m.log' bad='/data/ctl_bad/st_bandwidth_length_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_repay_users_mon.ctl' log='/data/ctl_log/st_repay_users_mon.log' bad='/data/ctl_bad/st_repay_users_mon.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_lost_users_mon.ctl' log='/data/ctl_log/st_lost_users_mon.log' bad='/data/ctl_bad/st_lost_users_mon.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_user_online_mon.ctl' log='/data/ctl_log/st_user_online_mon.log' bad='/data/ctl_bad/st_user_online_mon.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_auth_m.ctl' log='/data/ctl_log/st_auth_m.log' bad='/data/ctl_bad/st_auth_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_prod_failure_reason_m.ctl' log='/data/ctl_log/st_diff_prod_failure_reason_m.log' bad='/data/ctl_bad/st_diff_prod_failure_reason_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_auth_rate_m.ctl' log='/data/ctl_log/st_auth_rate_m.log' bad='/data/ctl_bad/st_auth_rate_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_auth_failure_reason_m.ctl' log='/data/ctl_log/st_auth_failure_reason_m.log' bad='/data/ctl_bad/st_auth_failure_reason_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_corp_income_m.ctl' log='/data/ctl_log/st_diff_corp_income_m.log' bad='/data/ctl_bad/st_diff_corp_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_region_income_m.ctl' log='/data/ctl_log/st_diff_region_income_m.log' bad='/data/ctl_bad/st_diff_region_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_offer_income_m.ctl' log='/data/ctl_log/st_diff_offer_income_m.log' bad='/data/ctl_bad/st_diff_offer_income_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_corp_user_dev_m.ctl' log='/data/ctl_log/st_diff_corp_user_dev_m.log' bad='/data/ctl_bad/st_diff_corp_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_region_user_dev_m.ctl' log='/data/ctl_log/st_diff_region_user_dev_m.log' bad='/data/ctl_bad/st_diff_region_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_offer_user_dev_m.ctl' log='/data/ctl_log/st_diff_offer_user_dev_m.log' bad='/data/ctl_bad/st_diff_offer_user_dev_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_all_users_mon.ctl' log='/data/ctl_log/st_all_users_mon.log' bad='/data/ctl_bad/st_all_users_mon.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/dim_std_product.ctl' log='/data/ctl_log/dim_std_product.log' bad='/data/ctl_bad/dim_std_product.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_response_failure_m.ctl' log='/data/ctl_log/st_dns_response_failure_m.log' bad='/data/ctl_bad/st_dns_response_failure_m.bad'


sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_device_user_m.ctl' log='/data/ctl_log/st_diff_device_user_m.log' bad='/data/ctl_bad/st_diff_device_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_offer_urltype_user_m.ctl' log='/data/ctl_log/st_diff_offer_urltype_user_m.log' bad='/data/ctl_bad/st_diff_offer_urltype_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_offer_user_m.ctl' log='/data/ctl_log/st_diff_offer_user_m.log' bad='/data/ctl_bad/st_diff_offer_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_time_urltype_user_m.ctl' log='/data/ctl_log/st_diff_time_urltype_user_m.log' bad='/data/ctl_bad/st_diff_time_urltype_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_time_user_m.ctl' log='/data/ctl_log/st_diff_time_user_m.log' bad='/data/ctl_bad/st_diff_time_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_url_diff_device_user_m.ctl' log='/data/ctl_log/st_diff_url_diff_device_user_m.log' bad='/data/ctl_bad/st_diff_url_diff_device_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_url_type_user_m.ctl' log='/data/ctl_log/st_diff_url_type_user_m.log' bad='/data/ctl_bad/st_diff_url_type_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_url_user_m.ctl' log='/data/ctl_log/st_diff_url_user_m.log' bad='/data/ctl_bad/st_diff_url_user_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_workday_user_m.ctl' log='/data/ctl_log/st_diff_workday_user_m.log' bad='/data/ctl_bad/st_diff_workday_user_m.bad'


sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_response_failure_m.ctl' log='/data/ctl_log/st_dns_response_failure_m.log' bad='/data/ctl_bad/st_dns_response_failure_m.bad'

sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_response_m.ctl' log='/data/ctl_log/st_dns_response_m.log' bad='/data/ctl_bad/st_dns_response_m.bad'
