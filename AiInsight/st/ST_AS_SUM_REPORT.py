#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST AS域流量统计
# Pay: ST_AS_SUM_REPORT.py
# Purpose:  汇总as域各省流量
# 
# Author:      wangxx
# 
# Created:     2018-12-26
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
#-------------------------------------------------------------------------------
# 
#-------------------------------------------------------------------------------
directory=["config","dim","dw","dwd","kpi","py"]
import os,sys
from os.path import normpath,realpath
rp=realpath(sys.argv[0])
dwd=os.path.dirname(rp)
AiInsight=os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re

#正则清洗参数
sdate=sys.argv[1] if len(sys.argv) > 1 else '0'
regex=ur"\d{8}"
match=re.search(regex,sdate)
if match:
  dates=sdate
else:
  dates=open('/AiInsight/config/pyparameter').read()

#脚本名称
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')


# 传递日期参数,生成时间字典
#-------------------------------------------------------------------------------
dicts={} 
Pama(dicts,dates)

#引入时间字典
ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期

# 源表声明
#-------------------------------------------------------------------------------
s_stg_tbl_as_sum_report_all                    =    "stg_tbl_as_sum_report_all"
s_dim_std_area                                     =    "dim_std_area"

# 临时表声明
#-------------------------------------------------------------------------------
s_tmp_st_as_sum_report         =    "tmp_st_as_sum_report"    
# 目标表声明
#-------------------------------------------------------------------------------
t_st_as_sum_report         =    "st_as_sum_report"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_tmp_st_as_sum_report)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放as_type,as_name汇总数据
    hsql='''create table if not exists %(s_tmp_st_as_sum_report)s  (
            nodeid       varchar(11),
            as_type      varchar(20),
            as_name    varchar(200),
            in_gbs       decimal(16,2),
            out_gbs     decimal(16,2)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_tmp_st_as_sum_report)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 生成as_type,as_name汇总数据
    hsql='''
        INSERT OVERWRITE TABLE %(s_tmp_st_as_sum_report)s
        SELECT TRIM(t1.nodeid) AS nodeid,
               t1.as_type,
               t1.as_name,
               round(SUM(t1.bytes_in)/1024/1024/1024,2) AS in_gbs,
               round(SUM(t1.bytes_out)/1024/1024/1024,2) AS out_gbs
          FROM  %(s_stg_tbl_as_sum_report_all)s t1 
         WHERE t1.pt_time = %(ARG_OPTIME_LASTDAY)s
           AND  LENGTH(TRIM(t1.nodeid)) = 10
         GROUP BY TRIM(t1.nodeid),t1.as_type,t1.as_name
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        INSERT OVERWRITE TABLE %(t_st_as_sum_report)s partition (pt_time=%(ARG_OPTIME_LASTDAY)s)
        SELECT %(ARG_OPTIME_LASTDAY)s AS cycle_id,
               t.nodeid,
                t.as_type,
               t.std_area_code,
               t.std_area_name,
               round(SUM(t.in_gbs),2) AS in_gbs,
               round(SUM(t.out_gbs),2) AS out_gbs,
               current_timestamp as etl_date
        FROM 
            ( SELECT  t1.nodeid,t1.as_type,t1.as_name,t2.std_area_code,t2.std_area_name,t1.in_gbs,
                      t1.out_gbs,row_number() over (distribute BY t1.nodeid,t1.as_type,t1.as_name sort BY t2.std_area_code ASC ) AS rn
                FROM %(s_tmp_st_as_sum_report)s t1 
             ,(SELECT std_area_code,std_area_name FROM %(s_dim_std_area)s WHERE substr(std_area_code,5,2) = '00'  AND instr(std_area_name,']') = 0 )  t2 -- 省、地级市
               WHERE  instr(T1.as_name,t2.std_area_name)  > 0 -- 取数据所在行政区划
            ) t 
        WHERE t.rn = 1 
        GROUP BY t.nodeid,t.as_type,t.std_area_code,t.std_area_name
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
