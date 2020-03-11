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
hive -e "select * from st_dns_domain_request_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_domain_request_m.csv
hive -e "select * from st_dns_domain_response_m where pt_mon=$lmonth" > /data/hadoop_output/st_dns_domain_response_m.csv

#oracle删除上月数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
delete from st_dns_domain_request_m where pt_mon=to_date('$lmonth','yyyymm');
delete from st_dns_domain_response_m where pt_mon=to_date('$lmonth','yyyymm');
exit
EOF

#sqlldr当月数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_domain_request_m.ctl' log='/data/ctl_log/st_dns_domain_request_m.log' bad='/data/ctl_bad/st_tv_diff_time_view_d.bad'
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_dns_domain_response_m.ctl' log='/data/ctl_log/st_dns_domain_response_m.log' bad='/data/ctl_bad/st_dns_domain_response_m.bad'
