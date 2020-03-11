#!/bin/bash
source /etc/profile
date

#目标表名
target_table_name="stg_channel_program_local"
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

#删除boss历史数据
rm -f /data/tv_data/${target_table_name}/*

#文件名列表存入配置文件
cd /home/ftpuser/tv/tv_channel_program_local/
ls *tv_channel* -1 | grep $ldate > /home/ftpuser/tv/tv_channel_program_local/channel_program_local

#循环转化boss文件
for i in `cat /home/ftpuser/tv/tv_channel_program_local/channel_program_local`
 do
 echo $i
 python /AiInsight/others/xls_to_csv_channel.py $i
 done

#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/data/tv_data/${target_table_name}' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_time='${ldate}');"
exit;
EOF

#移动到bak
if [ $? -eq 0 ];then
 mv /home/ftpuser/tv/tv_channel_program_local/*tv_channel*$ldate* /home/ftpuser/bak/tv/tv_channel_program_local/
fi
