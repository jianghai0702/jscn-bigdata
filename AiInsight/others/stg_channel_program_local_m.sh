#!/bin/bash
source /etc/profile
date

# 本地节目单清洗入库，入库上个月的节目单。处理周期月。
# 原先的本地节目单是按周为周期入库的

#目标表名
target_table_name="stg_channel_program_local"
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
this_month=$(date -d "${v_cycle}" +%Y%m)
last_month=$(date -d "${v_cycle} -1 month" +%Y%m)
echo $this_month $last_month

#删除boss历史数据
rm -f /data/tv_data/${target_table_name}/*

#文件名列表存入配置文件
cd /home/ftpuser/tv/tv_channel_program_local/
ls *tv_channel* -1 | grep $this_month > /home/ftpuser/tv/tv_channel_program_local/channel_program_local
ls *tv_channel* -1 | grep $last_month >> /home/ftpuser/tv/tv_channel_program_local/channel_program_local

#循环转化boss文件
for i in `cat /home/ftpuser/tv/tv_channel_program_local/channel_program_local`
do
    echo $i
    python /AiInsight/others/xls_to_csv_channel_local.py $i
    
    # 获取节目单时间
    pt_time=$(echo "${i}"|grep -P '_\d{8}.xls' -o|sed -e 's/_//g' -e 's/.xls//')
    echo "${pt_time}"

    #加载到stg表中
    su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/data/tv_data/${target_table_name}' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_time='${pt_time}');"
exit;
EOF

done

#移动到bak
if [ $? -eq 0 ];then
 mv /home/ftpuser/tv/tv_channel_program_local/*tv_channel*$ldate* /home/ftpuser/bak/tv/tv_channel_program_local/
fi
