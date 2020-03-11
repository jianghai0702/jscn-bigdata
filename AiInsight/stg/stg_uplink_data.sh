#######################################################
#定义变量
#######################################################
#模块名称
folder="dns"
#目标表名
target_table_name="stg_uplink_data"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
etl_cycle1=`date -d "$v_cycle -16 day " +%Y%m%d`
loop_count=0

#生成目录
load_dir="${folder}/${target_table_name}/${v_cycle}"
rm -rf /home/ftpuser/bak/swxw/stg/before/${etl_cycle}
rm -rf /home/ftpuser/bak/swxw/stg/before/${etl_cycle1}
rm -rf /home/ftpuser/bak/swxw/stg/after/${etl_cycle}
rm -rf /home/ftpuser/bak/swxw/stg/after/${etl_cycle1}
mkdir -p /home/ftpuser/bak/swxw/stg/before/${etl_cycle}
mkdir -p /home/ftpuser/bak/swxw/stg/after/${etl_cycle}

#连接22服务器，从ftp将数据下载到22.
ssh jsgd5  "nohup sh /AiInsight/collection/ftpTo21.sh ${v_cycle} 1> /AiInsight/collection/ftpTo21.log 2>&1 &"

#scp -rp root@111.208.67.22:/opt/data/stg_data/${etl_cycle}/* /home/ftpuser/bak/swxw/before/${etl_cycle}/

#检测文件是否生成
while [[ ! -f /home/ftpuser/bak/swxw/stg/before/${etl_cycle}/done ]] && [[ ! -f  /home/ftpuser/bak/swxw/stg/before/${etl_cycle}/nodata ]]; do
    date
    echo "别急！22服务器正在运行脚本"
    sleep 60
    if [ ${loop_count} -gt 60 ]; then
        echo "jsgd5采集程序异常"
        exit 2
    fi
    loop_count=$(expr ${loop_count} + 1)
done

if [[ -f /home/ftpuser/bak/swxw/stg/before/${etl_cycle}/nodata ]] ;then
    echo "${etl_cycle}无数据"
    exit 1
fi

echo "数据成功复制到21服务器"

cd /home/ftpuser/bak/swxw/stg/before/${etl_cycle}/
cp /home/ftpuser/bak/swxw/stg/base64.jar ./

for i in {001..008}
do
for j in {00..23}
do
for k in {00..55..5}
do
echo 0x01+0x0300+M-JS-GD+XF+${i}+${etl_cycle}${j}${k}00
gzip -cd 0x01+0x0300+M-JS-GD+XF+${i}+${etl_cycle}${j}${k}00.gz > 0x01+0x0300+M-JS-GD+XF+${i}+${etl_cycle}${j}${k}00_tmp
java -jar base64.jar ${i} ${etl_cycle} ${j} ${k}
done
done
done

rm -rf /home/ftpuser/bak/swxw/stg/before/${etl_cycle}/*

cd /home/ftpuser/bak/swxw/stg/after/${etl_cycle}/
gzip *
for m in {001..008}
do
echo ${m}
cat *+${m}+*.gz > total_${m}.gz
done

# data_size=$(ls -l total_*.gz | awk '{size=size+$5} END{print size}')

# if [[ ${data_size} -eq 0 ]]; then
#     echo "${etl_cycle}无数据"
#     exit 1
# fi
        
#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/home/ftpuser/bak/swxw/stg/after/${etl_cycle}/total_*.gz' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}');"
exit;
EOF
rm -rf total_*.gz
date
#删除15天前的数据