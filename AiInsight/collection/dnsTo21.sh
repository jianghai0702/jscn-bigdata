#!/bin/bash
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
etl_cycle_tmp=`date -d "$v_cycle -1 day " +/%Y/%m/%d/`
#生成目录
#load_dir="${folder}/${target_table_name}/${v_cycle}"
rm -rf /opt/data/dns_data/${etl_cycle}/
mkdir -p /opt/data/dns_data/${etl_cycle}/
cd /opt/data/dns_data/${etl_cycle}/

ftp -niv <<EOF
open 111.208.59.122
user logftp JScN2017!@#.
bin
Prompt
cd ${etl_cycle_tmp}
mget *.gz

bye
!FTPRUN
EOF

data_size=$(ls -l ./*.gz | awk '{size=size+$5} END{print size}')

if [[ ${data_size} -eq 0 ]]; then     #判断有无数据，并生成消息文件
    echo "${etl_cycle}无数据"
    echo "" > nodata
    scp ./nodata root@111.208.67.21:/home/ftpuser/bak/swxw/dns/${etl_cycle}/
else 
    scp  /opt/data/dns_data/${etl_cycle}/*.gz root@111.208.67.21:/home/ftpuser/bak/swxw/dns/${etl_cycle}/
    echo ${data_size} > done
    scp ./done root@111.208.67.21:/home/ftpuser/bak/swxw/dns/${etl_cycle}/
fi

rm -rf /opt/data/dns_data/${etl_cycle}/
