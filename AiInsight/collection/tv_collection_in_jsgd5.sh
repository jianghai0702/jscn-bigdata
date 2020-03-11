#!/bin/bash
source /etc/profile

#文件名日期
fdate=$1
tdate=`date +%Y%m%d`

#删除当天数据
rm -rf /opt/data/tv/stg_channel_program/${tdate}
rm -rf /opt/data/tv/stg_channel_program/${fdate}
echo "data has deleted"

#删除记录文件
rm -rf /opt/dolphin/tv_channel_program/fileStatusDir
rm -rf /opt/dolphin/TVlog/fileStatusDir

#运行采集脚本
cd /opt/dolphin/tv_channel_program/
sh run.sh
sleep 100

#检查是否已经运行完，该检查不一定准确
while [ -f /opt/data/tv/stg_channel_program/${tdate}/FlumeData.*.tmp ] || [ ! -d /opt/data/tv/stg_channel_program/${tdate} ]; do
    date
    echo "sleep to wait for finishing collection"
    sleep 100
done
echo "collection has finished"

#重命名生成的文件
mv /opt/data/tv/stg_channel_program/${tdate} /opt/data/tv/stg_channel_program/${fdate}
#标志文件生成并传输jsgd4
echo "" > /AiInsight/collection/clsus_${fdate}
scp /AiInsight/collection/clsus_${fdate} jsgd4:/AiInsight/collection/

date
