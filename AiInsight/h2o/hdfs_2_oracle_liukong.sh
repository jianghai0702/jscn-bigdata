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

#检查当天数据是否存在
while [ ! -f /home/ftpuser/liukong/tbl_as_sum_report_all_${v_cycle} ] || [ ! -f /home/ftpuser/liukong/tbl_dname_topn_${v_cycle} ] || \
      [ ! -f /home/ftpuser/liukong/tbl_part_app_log_${v_cycle} ] || [ ! -f /home/ftpuser/liukong/tbl_traffic_${v_cycle} ]; do
    date
    echo "sleep to wait for data"
    sleep 300
done

#oracle删除当天数据
sqlplus ${connect_info}  <<EOF
set serveroutput on
set timing on
exec p_delete_local_data_liukong(to_date('$ldate','yyyymmdd'))
exit
EOF

echo $?
sleep 5s
if [ 1 -eq 1 ]; then
#规范文件名
cp /home/ftpuser/liukong/tbl_as_sum_report_all_${v_cycle} /data/hadoop_output/st_tbl_as_sum_report_all.csv
cp /home/ftpuser/liukong/tbl_dname_topn_${v_cycle} /data/hadoop_output/st_tbl_dname_topn.csv
#cp /home/ftpuser/liukong/tbl_part_app_log_${v_cycle} /data/hadoop_output/st_tbl_part_app_log.csv
cp /home/ftpuser/liukong/tbl_traffic_${v_cycle} /data/hadoop_output/st_tbl_traffic.csv

#tbl_part_app_log_yyyymmdd需要单独处理
hive -e "select * from stg_tbl_part_app_log where cast(cp_id as int)<100000 and pt_time=$ldate" > /data/hadoop_output/st_tbl_part_app_log.csv

#sqlldr当天数据到oracle
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tbl_as_sum_report_all.ctl' log='/data/ctl_log/st_tbl_as_sum_report_all.log' bad='/data/st_tbl_as_sum_report_all.bad'
sleep 5s
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tbl_part_app_log.ctl' log='/data/ctl_log/st_tbl_part_app_log.log' bad='/data/ctl_bad/st_tbl_part_app_log.bad'
sleep 5s
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tbl_dname_topn.ctl' log='/data/ctl_log/st_tbl_dname_topn.log' bad='/data/ctl_bad/st_tbl_dname_topn.bad'
sleep 5s
sqlldr userid=${connect_info} control='/data/oracle_ctl/st_tbl_traffic.ctl' log='/data/ctl_log/st_tbl_traffic.log' bad='/data/ctl_bad/st_tbl_traffic.bad'
fi
date
