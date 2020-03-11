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
hive -e "select * from dwa_cust_feat_dtl_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_cust_feat_dtl_m.csv
#hive -e "select * from dwa_cust_order_prod_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_cust_order_prod_m.csv
#hive -e "select * from dwa_zg_acct where pt_mon=$lmonth" > /data/hadoop_output/dwa_zg_acct.csv
#hive -e "select * from dwa_user_network_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_network_beh_m.csv
#hive -e "select * from dwa_user_network_website_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_network_website_beh_m.csv
#hive -e "select * from dwa_user_view_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_view_beh_m.csv
#hive -e "select * from dwa_user_review_channel_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_review_channel_beh_m.csv
#hive -e "select * from dwa_user_tv_channel_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_tv_channel_beh_m.csv
#hive -e "select * from dwa_user_tv_program_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_tv_program_beh_m.csv
#hive -e "select * from dwa_user_dr_program_beh_m where pt_mon=$lmonth" > /data/hadoop_output/dwa_user_dr_program_beh_m.csv


#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from dwa_cust_feat_dtl_m ;
--delete from dwa_cust_order_prod_m where pt_mon='$lmonth';
--delete from dwa_zg_acct ;
--delete from dwa_user_network_beh_m where pt_mon='$lmonth';
--delete from dwa_user_network_website_beh_m where pt_mon='$lmonth';
--delete from dwa_user_view_beh_m where pt_mon='$lmonth' ;
-- delete from dwa_user_review_channel_beh_m where pt_mon='$lmonth';
-- delete from dwa_user_tv_channel_beh_m where pt_mon='$lmonth' ;
-- delete from dwa_user_tv_program_beh_m where pt_mon='$lmonth';
-- delete from dwa_user_dr_program_beh_m where pt_mon='$lmonth';
commit;
exit
EOF


#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_cust_feat_dtl_m.ctl' log='/data/ctl_log/dwa_cust_feat_dtl_m.log' bad='/data/ctl_bad/dwa_cust_feat_dtl_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_cust_order_prod_m.ctl' log='/data/ctl_log/dwa_cust_order_prod_m.log' bad='/data/ctl_bad/dwa_cust_order_prod_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_zg_acct.ctl' log='/data/ctl_log/dwa_zg_acct.log' bad='/data/ctl_bad/dwa_zg_acct.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_network_beh_m.ctl' log='/data/ctl_log/dwa_user_network_beh_m.log' bad='/data/ctl_bad/dwa_user_network_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_network_website_beh_m.ctl' log='/data/ctl_log/dwa_user_network_website_beh_m.log' bad='/data/ctl_bad/dwa_user_network_website_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_view_beh_m.ctl' log='/data/ctl_log/dwa_user_view_beh_m.log' bad='/data/ctl_bad/dwa_user_view_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_review_channel_beh_m.ctl' log='/data/ctl_log/dwa_user_review_channel_beh_m.log' bad='/data/ctl_bad/dwa_user_review_channel_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_tv_channel_beh_m.ctl' log='/data/ctl_log/dwa_user_tv_channel_beh_m.log' bad='/data/ctl_bad/dwa_user_tv_channel_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_tv_program_beh_m.ctl' log='/data/ctl_log/dwa_user_tv_program_beh_m.log' bad='/data/ctl_bad/dwa_user_tv_program_beh_m.bad'
#sqlldr userid=${connect_info} control='/data/oracle_ctl/dwa_user_dr_program_beh_m.ctl' log='/data/ctl_log/dwa_user_dr_program_beh_m.log' bad='/data/ctl_bad/dwa_user_dr_program_beh_m.bad'

