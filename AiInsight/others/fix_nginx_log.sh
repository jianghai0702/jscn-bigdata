#!/bin/bash
#######################################################
# 获取时间
v_cycle=$(date +%Y%m%d)
etl_cycle=$(date -d "$v_cycle -1 day " +%Y%m%d)

# 定义变量
data_path_base=/opt/data/auth/
scr_path_base=/opt/dolphin/

table_name=stg_nginx_log
scr_name=auth_nginx_log

date
# 判断当天文件是否生成
if [[ -d ${data_path_base}/${table_name}/${v_cycle} ]] ; then
    echo "the auth data processing is ok, nothing should done."
    exit
fi

# 重新处理数据
echo "begin to process ${table_name} data"
touch ${scr_path_base}/${scr_name}/flume.conf

# 判断数据是否完成
loop_count=0

while [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] || [[ -f  ${data_path_base}/${table_name}/${v_cycle}/FlumeData.*.tmp ]] ; do
    echo "waiting for the ${data_path_base}/${table_name}/${v_cycle} finishing"
    sleep 60
    if [ ${loop_count} -gt 60 ]; then
        echo "${etl_cycle}无数据"
        exit 2
    fi
    loop_count=$(expr ${loop_count} + 1)
done

# 生成hive数据
ssh jsgd4 > /dev/null 2>&1 <<EOF
    sh /AiInsight/stg/stg_nginx_log.sh ${v_cycle} > /AiInsight/logs/stg_nginx_log.log 2>&1    
    if [[ $? -ne 0 ]];then
        exit
    fi
    python /AiInsight/dwd/DWD_NGINX_LOG.py ${v_cycle} 
    if [[ $? -ne 0 ]] ; then
        exit
    fi
    nohup python /AiInsight/dw/DWA_DIFF_DEVICE_CATE_USER_D.py ${v_cycle} &
    nohup python /AiInsight/dw/DWA_DIFF_TIMES_DEVICE_USER_D.py ${v_cycle} &

    exit

EOF


echo "done!"
echo "------------------------------"
