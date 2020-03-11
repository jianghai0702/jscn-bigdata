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
tablename="st_tv_diff_time_channel_view_d"
echo $tablename
#hadoop导出文件
hive -e "select * from $tablename where pt_time = $ldate" > /data/hadoop_output/$tablename.csv
#oracle删除上月数据

#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control=/data/oracle_ctl/${tablename}.ctl log=/data/ctl_log/${tablename}.log bad=/data/ctl_bad/${tablename}.bad
