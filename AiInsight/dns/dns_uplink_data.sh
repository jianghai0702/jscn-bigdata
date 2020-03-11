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
#生成目录
load_dir="${folder}/${target_table_name}/${v_cycle}"
rm -rf /home/ftpuser/bak/swxw/dns/${etl_cycle}
mkdir -p /home/ftpuser/bak/swxw/dns/${etl_cycle}

#连接22服务器，从ftp将数据下载到22.
ssh jsgd5  "nohup sh /AiInsight/collection/dnsTo21.sh ${v_cycle} 1> /AiInsight/collection/dnsTo21.log 2>&1 &"

sleep 300
scp -rp root@111.208.67.22:/opt/data/dns_data/${etl_cycle}/* /home/ftpuser/bak/swxw/dns/${etl_cycle}/
cd /home/ftpuser/bak/swxw/dns/${etl_cycle}/

for i in {00..23}
do
for j in {00..59}
do
echo 025_01_${etl_cycle}${i}${j}
gzip -cd 0x01+0x0300+M-JS-GD+XF.gz > 0x01+0x0300+M-JS-GD+XF+${i}+${etl_cycle}${j}${k}00_tmp
done
done


rm -rf /home/ftpuser/bak/swxw/before/${etl_cycle}/*_tmp

cd /home/ftpuser/bak/swxw/after/${etl_cycle}/
gzip *

#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/home/ftpuser/bak/swxw/after/${etl_cycle}/*.gz' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}');"
exit;
EOF

