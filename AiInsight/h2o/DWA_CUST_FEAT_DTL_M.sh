#!/bin/sh shell
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: 
# Pay: ST_GROUP_OFFICE_SUB_DEVE_DAY.sh
# Purpose:
#
# Author:      yanal
#
# Created:     2017-8-11
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#参数
#数据库连接
connect_string="st/st@jsor"
#文件系统存储目录
hadoop_output="/data/hadoop_output"
#DIM ctl存储路径
ctl_path="/data/oracle_ctl"
#DIM log存储路径
log_path="/data/ctl_log"
#DIM bad存储路径
bad_path="/data/ctl_bad"
#------------------------------------------------------------------------------
#本表名
table_name="DWA_CUST_FEAT_DTL_M"
##ST导出文件目录
#-------------------------------------------------------------------------------
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ]
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

#获取月份
lmonth=`date -d "$ldate" +%Y%m`
echo $lmonth
#-------------------------------------------------------------------------------
#获取字段列表
columu_list=`
sqlplus -s $connect_string <<EOF
set serveroutput off;
set heading off;
set echo off;
set feedback off;
select
    case to_char(data_type)
    when to_char('TIMESTAMP(6)') then column_name||' DATE "YYYY-MM-DD hh24:mi:ss",'
    when to_char('DATE') then column_name||' DATE "YYYY-MM-DD hh24:mi:ss",'
    else column_name||',' end
from all_tab_columns where table_name='$table_name' order by column_id;
exit;
EOF`
echo "字段列表：""$columu_list"
#-------------------------------------------------------------------------------
#生成ctl文件
echo "load data" > $ctl_path/$table_name".ctl"
echo "CHARACTERSET utf8" >>  $ctl_path/$table_name".ctl"
echo "infile '$hadoop_output/$table_name""_UTF8.csv'" >>  $ctl_path/$table_name".ctl"
echo "append into table $table_name" >> $ctl_path/$table_name".ctl"
echo "fields terminated by X'09'(" >>  $ctl_path/$table_name".ctl"
echo ${columu_list%,*} >> $ctl_path/$table_name".ctl"
echo ")" >> $ctl_path/$table_name".ctl"
#--------------------------------------------------------------------------------
#导出CSV文件
HIVE_STRING="hive -e \"select * from "$table_name" where pt_mon='${lmonth}'\" > "$hadoop_output/$table_name"_UTF8.csv"
echo "$HIVE_STRING"
eval "$HIVE_STRING"
#---------------------------------------------------------------------------------
#删除原有数据
sqlplus -s $connect_string <<EOF
set serveroutput on
set timing on
delete from $table_name where pt_mon='${lmonth}';
commit;
EOF
#---------------------------------------------------------------------------------
#导入到ORACLE
SQLD_STRING="sqlldr userid="$connect_string" control='"$ctl_path/$table_name".ctl' log='"$log_path/$table_name"_"$lmonth".log' bad='"$bad_path/$table_name"_"$lmonth".bad'"
echo $SQLD_STRING
eval "$SQLD_STRING"
#---------------------------------------------------------------------------------
#删除中间文件
rm -f $hadoop_output/$table_name"_UTF8.csv"
rm -f $ctl_path/$table_name".ctl"
