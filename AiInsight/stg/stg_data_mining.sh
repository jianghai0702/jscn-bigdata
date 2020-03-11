#!/bin/bash
# 该脚本通过sqoop把用户画像基础数据从oracle导入hive。 顺序执行（数据库连接数有限制，并行报错）
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }

# 申明要导入的表名
tables=("stg_cm_customer"
        "stg_res_terminal"
        "stg_sec_organize"
        "stg_time_prop_bill"
        "stg_ord_price"
        "stg_ord_price_f"
        "stg_h_ins_srvpkg"
        "stg_h_ins_offer"
        "stg_res_code_definition"
       )

#获取脚本所在路径
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"


# 开启VPN
#/AiInsight/others/jsgd_vpn_stop.sh
#/AiInsight/others/jsgd_vpn_start.sh

#调用通用脚本导数
for table in "${tables[@]}"; do
   sh ${DIR}/"${table}".sh "${v_cycle}"
   if [[ $? -ne 0 ]]; then
       exit 1
   fi
   sleep 5
done

# 关闭VPN
#/AiInsight/others/jsgd_vpn_stop.sh
