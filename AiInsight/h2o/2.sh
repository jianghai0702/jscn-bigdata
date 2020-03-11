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
echo $lmonth
#hadoop导出文件
hive -e "select * from st_web_browse_m where pt_mon=$lmonth" > /data/hadoop_output/st_web_browse_m.csv
hive -e "select * from st_video_view_m where pt_mon=$lmonth" > /data/hadoop_output/st_video_view_m.csv
hive -e "select * from st_packet_loss_m where pt_mon=$lmonth" > /data/hadoop_output/st_packet_loss_m.csv
#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on

delete from st_web_browse_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_video_view_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_packet_loss_m where pt_mon=to_date('$lmonth','yyyymm');
commit;
exit
EOF
#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_web_browse_m.ctl' log='/data/ctl_log/st_web_browse_m.log' bad='/data/ctl_bad/st_web_browse_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_video_view_m.ctl' log='/data/ctl_log/st_video_view_m.log' bad='/data/ctl_bad/st_video_view_m.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_packet_loss_m.ctl' log='/data/ctl_log/st_packet_loss_m.log' bad='/data/ctl_bad/st_packet_loss_m.bad'

