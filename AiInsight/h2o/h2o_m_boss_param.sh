#!/bin/bash
# hive -> rdbms 同步数据通用脚本
# 使用sqoop同步数据
# 脚本入参说明：
# 需要指名hive表名，rdbms表名，hive表分区字段，以及同步数据时间。
#    hive_table_name    导出hive表名
#    rdbms_table_name   导入rdbms表名
#    partition_keys     导出hive表的分区字段,包括：pt_mon ,pt_time (不指定分区字段则全表导)
#    data_date          需要同步的数据时间
#
#######################################################
#脚本开始
##########################################g#############
# stdout vs stderr
err() {
  echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]: $@" >&2
}

log() {
  echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]: $@" >&1
}

# print usage
function usage
{ echo $@
  cat <<EOF
Usage:
$0 hive_table_name rdbms_table_name [partition_key] [date]
partition_key : pt_mon or pt_time
date format: YYYYMMDD
EOF
  exit
}


#参数判断
if [[ $# -lt 2 ]];then
    usage
fi

#######################################################
#定义变量
#######################################################
#运行日期
( echo ${4} | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=${4}; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
last_month="$(date -d "$v_cycle -1 month" +%Y%m)"  # 上月
last_day="$(date -d "$v_cycle -1 day" +%Y%m%d)"  # 前一天

#源hive数据库表名
hive_table_name="${1}"
#rdbms目标表名
rdbms_table_name="${2}"

log "------------------------------------------------------------"
log "同步开始"
log "hive库源表名：${hive_table_name}"
log "rdbms目标库表名：${rdbms_table_name}"


#获取分区键
if [[ -z "${3}" ]] ;then             #  没有指定分区键，全表跑
    partition_args=""
    sql_where="where stats_dt=${last_month}"
    log "全表数据同步"
elif [[ "${3}" = "pt_mon" || "${3}" = "PT_MON" ]] ;then
    partition_args="--hcatalog-partition-keys pt_mon --hcatalog-partition-values ${last_month}"
    sql_where="where pt_mon=${last_month}"
    log "同步数据日期（月）：${last_month}"
elif [[ "${3}" = "pt_time" || "${3}" = "PT_TIME" ]] ;then
    partition_args="--hcatalog-partition-keys pt_time --hcatalog-partition-values ${last_day}"
    sql_where="where pt_time=${last_day}"
    log "同步数据日期（日）：${last_day}"
else
    err "partition_key分区字段指定错误！！"
    usage
fi

log "------------------------------------------------------------"
#清理rdbms库表数据

log "------------------------------------------------------------"
log "清理rdbms库表数据"
log "------------------------------------------------------------"
/usr/bin/mysql -h jsgd27 -u st -pst -D st  <<EOF
delete from ${rdbms_table_name} ${sql_where} ;
EOF

if [[ ! $? -eq 0 ]];then
    err "清理rdbms库表数据失败 !!!"
    exit 1
fi

#加载数据到目标表中
log "------------------------------------------------------------"
log "sqoop数据导入"
log "------------------------------------------------------------"

#su - hdfs <<EOF
sqoop_str="/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_export.txt  --table "${rdbms_table_name}"  --hcatalog-database default --hcatalog-table "${hive_table_name}" "${partition_args}""

log ${sqoop_str}
eval ${sqoop_str}

if [[ ! $? -eq 0 ]];then
    err "sqoop数据导入失败 !!!"
    exit 1
fi

exit;
#EOF


