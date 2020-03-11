#!/bin/bash
source /etc/profile

#日报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

#删除标志文件
rm -f /AiInsight/collection/clsus_${v_cycle}

#将bak的文件转移回来，添加重跑机制
mv /home/ftpuser/bak/tv/tv_log/tv_view_log_*_${ldate}.* /home/ftpuser/tv/tv_log/
mv /home/ftpuser/bak/tv/tv_channel_program/csEPG${ldate}.zip /home/ftpuser/tv/tv_channel_program/
mv /home/ftpuser/bak/tv/tv_am_channel_info/channel${ldate}.txt /home/ftpuser/tv/tv_am_channel_info/
mv /home/ftpuser/bak/tv/tv_pb_poweronoff_info/pb_poweronoff_info${ldate}.txt /home/ftpuser/tv/tv_pb_poweronoff_info/

################jsgd4#######################
#检查当天数据是否存在
#while [ ! -f /home/ftpuser/tv/tv_channel_program/csEPG${ldate}.zip ] || [ ! -f /home/ftpuser/tv/tv_log/tv_view_log_*_${ldate}.* ] || [ ! -f /home/ftpuser/tv/tv_am_channel_info/channel${ldate}.txt ] || [ ! -f /home/ftpuser/tv/tv_pb_poweronoff_info/pb_poweronoff_info${ldate}.txt ]; do
#    date
#    echo "sleep to wait for data"
#    sleep 300
#done
#echo "data has get"

#删除目标文件夹并重新解压
rm -rf /home/ftpuser/tv/tv_channel_program/csEPG
rm -f /data/tv_data/stg_tv_view_log/*
rm -f /data/tv_data/stg_tv_am_channel_info/*
rm -f /data/tv_data/stg_tv_pb_power_onoff/*


echo "++++++++++++++++++collection start+++++++++++++++++"
if [ -f /home/ftpuser/tv/tv_channel_program/csEPG${ldate}.zip ] ; then 
    unzip /home/ftpuser/tv/tv_channel_program/csEPG${ldate}.zip -d /home/ftpuser/tv/tv_channel_program/csEPG    
    #################jsgd5#######################
    #运行采集脚本
    echo ${v_cycle}
    ssh jsgd5  "nohup sh /AiInsight/collection/tv_collection_in_jsgd5.sh ${v_cycle} 1> /AiInsight/collection/tv_collection_in_jsgd5.log 2>&1 &"
    #################jsgd4#######################

    #检测文件是否生成
    while [ ! -f /AiInsight/collection/clsus_${v_cycle} ]; do
	date
	echo "sleep to wait for finishing collection from jsgd5"
	sleep 100
    done

    mv /home/ftpuser/tv/tv_channel_program/csEPG${ldate}.zip /home/ftpuser/bak/tv/tv_channel_program/
else
    echo "/home/ftpuser/tv/tv_channel_program/csEPG${ldate}.zip 文件不存在！！！" 
fi

python /AiInsight/collection/tv_log_txt_to_csv.py $ldate
python /AiInsight/collection/tv_channel_txt_to_csv.py $ldate
python /AiInsight/collection/tv_poweronoff_txt_to_csv.py $ldate

echo "collection success"

mv /home/ftpuser/tv/tv_log/tv_view_log_*_${ldate}.* /home/ftpuser/bak/tv/tv_log/
mv /home/ftpuser/tv/tv_am_channel_info/channel${ldate}.txt /home/ftpuser/bak/tv/tv_am_channel_info/
mv /home/ftpuser/tv/tv_pb_poweronoff_info/pb_poweronoff_info${ldate}.txt /home/ftpuser/bak/tv/tv_pb_poweronoff_info/
rm -f /AiInsight/collection/clsus_${v_cycle}
echo "success executed"
date

if [ $? -ne 0 ]; then
echo -e "TV job may be faild,please check it!" | mail -s "TV Error" liuyf7@asiainfo.com
fi
