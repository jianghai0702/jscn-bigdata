#!/bin/bash
source /etc/profile
#oracle连接文件
connect_file=/data/orcl_pswd/orcl_connect
connect_info=`cat ${connect_file}`

#日报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate
#hadoop导出文件
hive -e "select * from st_tv_diff_time_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_diff_time_view_d.csv
hive -e "select * from st_tv_total_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_total_view_d.csv
hive -e "select * from st_tv_diff_min_channel_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_diff_min_channel_view_d.csv
hive -e "select * from st_tv_diff_min_view_d where pt_time=$ldate" > /data/hadoop_output/st_tv_diff_min_view_d.csv
hive -e "select * from st_tv_user_into_out_d where pt_time=$ldate" > /data/hadoop_output/st_tv_user_into_out_d.csv
hive -e "select * from st_total_view_d where pt_time=$ldate" > /data/hadoop_output/st_total_view_d.csv
hive -e "select * from st_diff_time_view_d where pt_time=$ldate" > /data/hadoop_output/st_diff_time_view_d.csv
hive -e "select * from st_tv_user_into_out_dtl_d where pt_time=$ldate" > /data/hadoop_output/st_tv_user_into_out_dtl_d.csv

#oracle删除当天数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_tv_diff_time_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_total_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_diff_min_channel_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_diff_min_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_user_into_out_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_total_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_diff_time_view_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tv_user_into_out_dtl_d where pt_time=to_date('$ldate','yyyymmdd');
commit;
exit
EOF
#sqlldr当天数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_diff_time_view_d.ctl' log='/data/ctl_log/st_tv_diff_time_view_d.log' bad='/data/ctl_bad/st_tv_diff_time_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_total_view_d.ctl' log='/data/ctl_log/st_tv_total_view_d.log' bad='/data/ctl_bad/st_tv_total_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_diff_min_channel_view_d.ctl' log='/data/ctl_log/st_tv_diff_min_channel_view_d.log' bad='/data/ctl_bad/st_tv_diff_min_channel_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_diff_min_view_d.ctl' log='/data/ctl_log/st_tv_diff_min_view_d.log' bad='/data/ctl_bad/st_tv_diff_min_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_user_into_out_d.ctl' log='/data/ctl_log/st_tv_user_into_out_d.log' bad='/data/ctl_bad/st_tv_user_into_out_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_total_view_d.ctl' log='/data/ctl_log/st_total_view_d.log' bad='/data/ctl_bad/st_total_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_time_view_d.ctl' log='/data/ctl_log/st_diff_time_view_d.log' bad='/data/ctl_bad/st_diff_time_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tv_user_into_out_dtl_d.ctl' log='/data/ctl_log/st_tv_user_into_out_dtl_d.log' bad='/data/ctl_bad/st_tv_user_into_out_dtl_d.bad'
