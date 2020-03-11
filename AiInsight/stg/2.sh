#######################################################
#定义变量
#######################################################
#模块名称
folder="dns"
#目标表名
target_table_name="stg_dns_updown"
#######################################################
#脚本开始
#######################################################
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=`date -d "$v_cycle -1 day " +%Y%m%d`
etl_cycle1=`date -d "$v_cycle -16 day " +%Y%m%d`
#生成目录
load_dir="${folder}/${target_table_name}/${v_cycle}"
cd /home/ftpuser/bak/swxw/dns/${etl_cycle}/
for i in {00..23}
do
echo ${i}
cat *${etl_cycle}${i}*.gz > total_${i}.gz
#加载到stg表中
su - hdfs <<EOF
hive -e "LOAD DATA LOCAL INPATH '/home/ftpuser/bak/swxw/dns/${etl_cycle}/total_${i}.gz' OVERWRITE INTO TABLE ${target_table_name} PARTITION(PT_TIME='${etl_cycle}',pt_hour = '${i}');"
exit;
EOF
done
rm -rf total_*.gz
date

