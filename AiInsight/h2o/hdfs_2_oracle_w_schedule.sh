#!/bin/bash
source /etc/profile
#oracle连接文件
connect_file=/data/orcl_pswd/orcl_connect
connect_info=`cat ${connect_file}`

#周报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

#hadoop导出文件
hive -e "select * from st_tx_report_w where pt_week=$ldate" > /data/hadoop_output/st_tx_report_w.csv
hive -e "select * from st_view_dtl_d where pt_time=$ldate" > /data/hadoop_output/st_view_dtl_d.csv
hive -e "select * from st_review_diff_time_pro_view_d where pt_time=$ldate" > /data/hadoop_output/st_review_diff_time_pro_view_d.csv
hive -e "select * from st_vod_diff_time_pro_view_d where pt_time=$ldate" > /data/hadoop_output/st_vod_diff_time_pro_view_d.csv
hive -e "select * from st_tv_diff_time_channel_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_diff_time_channel_view_d.csv
hive -e "select * from st_tv_diff_time_program_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_diff_time_program_view_d.csv


#oracle删除上周数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_tx_report_w where pt_time=to_date('$ldate','yyyymmdd');
delete from st_view_dtl_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_review_diff_time_pro_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_vod_diff_time_pro_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_diff_time_channel_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_diff_time_program_view_d where pt_time=to_date('$ldate','yyyymmdd');
exit
EOF

#sqlldr当周数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tx_report_w.ctl' log='/data/ctl_log/st_tx_report_w.log' bad='/data/ctl_bad/st_tx_report_w.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_view_dtl_d.ctl' log='/data/ctl_log/st_view_dtl_d.log' bad='/data/ctl_bad/st_view_dtl_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_review_diff_time_pro_view_d.ctl' log='/data/ctl_log/st_review_diff_time_pro_view_d.log' bad='/data/ctl_bad/st_review_diff_time_pro_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_vod_diff_time_pro_view_d.ctl' log='/data/ctl_log/st_vod_diff_time_pro_view_d.log' bad='/data/ctl_bad/st_vod_diff_time_pro_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_diff_time_channel_view_d.ctl' log='/data/ctl_log/st_tv_diff_time_channel_view_d.log' bad='/data/ctl_bad/st_tv_diff_time_channel_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_diff_time_program_view_d.ctl' log='/data/ctl_log/st_tv_diff_time_program_view_d.log' bad='/data/ctl_bad/st_tv_diff_time_program_view_d.bad'
