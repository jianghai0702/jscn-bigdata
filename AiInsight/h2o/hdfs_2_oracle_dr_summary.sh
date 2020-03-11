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
lmonth=`date -d "$ldate" +%Y%m`

#hadoop导出文件
hive -e "select * from st_diff_num_dr_summary where pt_mon=$lmonth" > /data/hadoop_output/st_diff_num_dr_summary.csv
hive -e "select * from st_diff_time_dr_summary where pt_mon=$lmonth" > /data/hadoop_output/st_diff_time_dr_summary.csv
hive -e "select * from st_diff_movie_dr_summary where pt_mon=$lmonth" > /data/hadoop_output/st_diff_movie_dr_summary.csv
hive -e "select * from st_diff_category_dr_summary where pt_mon=$lmonth" > /data/hadoop_output/st_diff_category_dr_summary.csv
hive -e "select * from ST_DR_SUMMARY where pt_mon=$lmonth" > /data/hadoop_output/ST_DR_SUMMARY.csv
hive -e "select * from st_diff_category_type_summary where pt_mon=$lmonth" > /data/hadoop_output/st_diff_category_type_summary.csv
#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_diff_num_dr_summary where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_time_dr_summary where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_movie_dr_summary where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_category_dr_summary where pt_mon=to_date('$lmonth','yyyymm');
delete from ST_DR_SUMMARY where pt_mon=to_date('$lmonth','yyyymm');
delete from st_diff_category_type_summary where pt_mon=to_date('$lmonth','yyyymm');
commit;
exit
EOF

#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_num_dr_summary.ctl' log='/data/ctl_log/st_diff_num_dr_summary.log' bad='/data/ctl_bad/st_diff_num_dr_summary.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_time_dr_summary.ctl' log='/data/ctl_log/st_diff_time_dr_summary.log' bad='/data/ctl_bad/st_diff_time_dr_summary.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_movie_dr_summary.ctl' log='/data/ctl_log/st_diff_movie_dr_summary.log' bad='/data/ctl_bad/st_diff_movie_dr_summary.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_category_dr_summary.ctl' log='/data/ctl_log/st_diff_category_dr_summary.log' bad='/data/ctl_bad/st_diff_category_dr_summary.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/ST_DR_SUMMARY.ctl' log='/data/ctl_log/ST_DR_SUMMARY.log' bad='/data/ctl_bad/ST_DR_SUMMARY.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_diff_category_type_summary.ctl' log='/data/ctl_log/st_diff_category_type_summary.log' bad='/data/ctl_bad/st_diff_category_type_summary.bad'st_diff_category_type_summary

