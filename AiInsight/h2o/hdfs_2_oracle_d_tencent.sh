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
hive -e "select * from st_tx_report_d where pt_time=$ldate" > /data/hadoop_output/st_tx_report_d.csv
hive -e "select * from st_tx_vod_analysis_d where pt_time=$ldate" > /data/hadoop_output/st_tx_vod_analysis_d.csv
hive -e "select * from st_tx_vod_vtype_analysis_d where pt_time=$ldate" > /data/hadoop_output/st_tx_vod_vtype_analysis_d.csv
hive -e "select * from dim_std_vtype" > /data/hadoop_output/dim_std_vtype.csv


#oracle删除当天数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_tx_report_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tx_vod_analysis_d where pt_time=to_date('$ldate','yyyymmdd');
delete from st_tx_vod_vtype_analysis_d where pt_time=to_date('$ldate','yyyymmdd');
truncate table dim_std_vtype;
commit;
exit
EOF

#sqlldr当天数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tx_report_d.ctl' log='/data/ctl_log/st_tx_report_d.log' bad='/data/ctl_bad/st_tx_report_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tx_vod_analysis_d.ctl' log='/data/ctl_log/st_tx_vod_analysis_d.log' bad='/data/ctl_bad/st_tx_vod_analysis_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tx_vod_vtype_analysis_d.ctl' log='/data/ctl_log/st_tx_vod_vtype_analysis_d.log' bad='/data/ctl_bad/st_tx_vod_vtype_analysis_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/dim_std_vtype.ctl' log='/data/ctl_log/dim_std_vtype.log' bad='/data/ctl_bad/dim_std_vtype.bad'
