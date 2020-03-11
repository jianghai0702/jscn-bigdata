#######################################################
#定义变量
#######################################################
#模块名称
folder="auth"
#目标表名
#target_table_name="stg_brd_auth_log"
#######################################################
#脚本开始
#######################################################
#运行日期
# ( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
# [ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
v_cycle=$(date +%Y%m%d)
etl_cycle=$(date -d "$v_cycle -1 day " +%Y%m%d)

#生成目录
data_path_base=/opt/data/auth/
scr_path_base=/opt/dolphin/


# stg_brd_auth_log 处理
table_name=stg_brd_auth_log
scr_name=auth_log

# 判断当天文件是否生成
if [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] ; then
    touch ${scr_path_base}/${scr_name}/flume.conf
    while [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] || [[ -f  ${data_path_base}/${table_name}/${v_cycle}/FlumeData.*.tmp ]] ; do
        echo "waiting for the ${data_path_base}/${table_name}/${v_cycle} finishing"
        sleep 60
    done
    # 生成hive数据
    ssh jsgd4 > /dev/null 2>&1 <<EOF 
    sh /AiInsight/stg/stg_brd_auth_log.sh ${v_cycle} > /AiInsight/logs/stg_brd_auth_log.log 2>&1
    if [[ $? -eq 0 ]];then
        python /AiInsight/dwd/DWD_BRD_AUTH_LOG.py ${v_cycle} 
    fi

    if [[ $? -eq 0 ]] ; then
        python /AiInsight/dim/DIM_STD_FAILURE_REASON.py ${v_cycle} 
    fi
    exit   

EOF

fi


# stg_dr_brd_expend 处理
table_name=stg_dr_brd_expend
scr_name=auth_online

# 判断当天文件是否生成
if [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] ; then
    touch ${scr_path_base}/${scr_name}/flume.conf
    while [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] || [[ -f  ${data_path_base}/${table_name}/${v_cycle}/FlumeData.*.tmp ]] ; do
        echo "waiting for the ${data_path_base}/${table_name}/${v_cycle} finishing"
        sleep 60
    done
    # 生成hive数据
    ssh jsgd4 > /dev/null 2>&1 <<EOF
    sh /AiInsight/stg/stg_dr_brd_expend.sh ${v_cycle} > /AiInsight/logs/stg_dr_brd_expend.log 2>&1    
    if [[ $? -eq 0 ]];then
          python /AiInsight/dwd/DWD_DR_BRD_EXPEND.py ${v_cycle}
    fi
    if [[ $? -eq 0 ]] ; then
        python /AiInsight/dw/DWA_DIFF_TIMES_USER_D.py ${v_cycle} &
        python /AiInsight/dw/DWA_USER_ONLINE_LENGTH_D.py ${v_cycle} &
        python /AiInsight/dw/DWA_DIFF_ONLINE_MEDIA_USER_D.py ${v_cycle} &
        python /AiInsight/dw/DWA_DIFF_DEVICE_CATE_USER_D.py ${v_cycle} &
        python /AiInsight/dw/DWA_DIFF_TIMES_DEVICE_USER_D.py ${v_cycle} &
        
    fi
    exit

EOF

fi



# stg_dr_brd_expend 处理
table_name=stg_nginx_log
scr_name=auth_nginx_log

# 判断当天文件是否生成
if [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] ; then
    touch ${scr_path_base}/${scr_name}/flume.conf
    while [[ ! -d ${data_path_base}/${table_name}/${v_cycle} ]] || [[ -f  ${data_path_base}/${table_name}/${v_cycle}/FlumeData.*.tmp ]] ; do
        echo "waiting for the ${data_path_base}/${table_name}/${v_cycle} finishing"
        sleep 60
    done
    # 生成hive数据
    ssh jsgd4 > /dev/null 2>&1 <<EOF
    sh /AiInsight/stg/stg_nginx_log.sh ${v_cycle} > /AiInsight/logs/stg_nginx_log.log 2>&1    
    if [[ $? -eq 0 ]];then
        python /AiInsight/dwd/DWD_NGINX_LOG.py ${v_cycle} 
    fi

    if [[ $? -eq 0 ]] ; then
        python /AiInsight/dw/DWA_DIFF_DEVICE_CATE_USER_D.py ${v_cycle} &
        python /AiInsight/dw/DWA_DIFF_TIMES_DEVICE_USER_D.py ${v_cycle} &
        
    fi
    exit

EOF
fi


        
        

