#!/bin/bash
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
#
# Author:      yanal
#
# Created:     2017-9-14
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#参数
#数据库连接
connect_string="st/st@jsor"
#文件系统存储目录
hadoop_output="/data/hadoop_output"
#DIM ctl存储路径
ctl_path="/data/oracle_ctl/tmp"
#DIM log存储路径
log_path="/data/ctl_log"
#DIM bad存储路径
bad_path="/data/ctl_bad"
#------------------------------------------------------------------------------
#本表名
if [[！ $# -eq 1 ]];then
    echo "usage: $0 table_name"
    exit 1
fi

table_name="${1}"
##ST导出文件目录
#-------------------------------------------------------------------------------
#运行日期
#( echo $2 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$2; }
#[ ! $v_cycle ]
#数据日期
#ldate="$(date -d "$v_cycle -1 day " +%Y%m%d)"
#echo "${ldate}"

#获取月份
#lmonth="$(date -d "$ldate" +%Y%m)"
#echo "${lmonth}"
#-------------------------------------------------------------------------------
#获取字段列表
column_list=`
sqlplus -s $connect_string <<EOF
set serveroutput off;
set heading off;
set echo off;
set feedback off;
select
    case 
      when column_name = 'PT_MON' AND to_char(data_type) = to_char('DATE') then column_name||' DATE "YYYYMM",'
      when column_name = 'PT_TIME' AND to_char(data_type) = to_char('DATE') then  column_name||' DATE "YYYYMMDD",'
      when to_char(data_type) = to_char('TIMESTAMP(6)') then column_name||' DATE "YYYY-MM-DD hh24:mi:ss",'
      when to_char(data_type) = to_char('DATE') then column_name||' DATE "YYYY-MM-DD hh24:mi:ss",'
    else column_name||'  "NULLIF(:'||column_name||',''NULL'')",' end
from all_tab_columns where table_name=upper('${table_name}') order by column_id;
exit;
EOF`


if [[ -z "${column_list}" ]];then
    echo "ERROR:字段列表为空 !!!"
    exit 1
fi

echo "字段列表：${column_list}"
#-------------------------------------------------------------------------------
#生成ctl文件
echo "load data" > $ctl_path/$table_name".ctl"
echo "CHARACTERSET utf8" >>  $ctl_path/$table_name".ctl"
echo "infile '$hadoop_output/$table_name"".csv'" >>  $ctl_path/$table_name".ctl"
echo "append into table $table_name" >> $ctl_path/$table_name".ctl"
echo "fields terminated by X'09'(" >>  $ctl_path/$table_name".ctl"
echo ${column_list%,*} >> $ctl_path/$table_name".ctl"
echo ")" >> $ctl_path/$table_name".ctl"
#--------------------------------------------------------------------------------


#导出CSV文件
#hive_where=""
# if [[ -n $(echo "${column_list}" | grep "PT_MON" ) ]];then
#     hive_where="where pt_mon=${lmonth} "
# elif [[ -n $(echo "${column_list}" | grep "PT_TIME" )  ]];then
#     hive_where="where pt_time=${ldate} "
# fi    

HIVE_STRING="hive -e \"use default;select * from ${table_name}  \" > "$hadoop_output/$table_name".csv"
echo "$HIVE_STRING"
eval "$HIVE_STRING"

if [[ ! $? -eq 0 ]];then
    echo "hive导出错误 !!!"
    exit 1
fi

#---------------------------------------------------------------------------------
#删除原有数据
# sqlplus_where=""
# if [[ -n $(echo "${column_list}" | grep "PT_MON" | grep "DATE" ) ]];then
#     sqlplus_where="where pt_mon=to_date('${lmonth}','yyyymm') "
# elif [[ -n $(echo "${column_list}" | grep "PT_TIME" |grep "DATE" ) ]];then
#     sqlplus_where="where pt_time=to_date('${ldate}','yyyymmdd') "
# elif [[ -n $(echo "${column_list}" | grep "PT_MON") ]];then
#     sqlplus_where="where pt_mon='${lmonth}' "
# elif [[ -n $(echo "${column_list}" | grep "PT_TIME") ]];then
#     sqlplus_where="where pt_time='${ldate}' "
# fi    


sqlplus -s $connect_string <<EOF
set serveroutput on
set timing on
delete from ${table_name} ;
commit;
EOF


if [[ ! $? -eq 0 ]];then
    echo "oracle删除数据错误 !!!"
    exit 1
fi

#---------------------------------------------------------------------------------
#导入到ORACLE
SQLD_STRING="sqlldr userid="$connect_string" control='"$ctl_path/$table_name".ctl' log='"$log_path/$table_name"_"$lmonth".log' bad='"$bad_path/$table_name"_"$lmonth".bad'"
echo $SQLD_STRING
eval "$SQLD_STRING"
#---------------------------------------------------------------------------------
#删除中间文件
rm -f $hadoop_output/$table_name".csv"
rm -f $ctl_path/$table_name".ctl"
