#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST全流量协议分析汇总
# Pay: ST_TBL_TRAFFIC_SUMMARY.py
# Purpose:  汇总统计每小时的协议流量数据
# 
# Author:      wangxx
# 
# Created:     2018-12-25
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
s_stg_tbl_traffic                    =    "stg_tbl_traffic"
s_dim_std_content                =    "dim_std_content"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_tbl_traffic_summary         =    "st_tbl_traffic_summary"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        INSERT OVERWRITE TABLE %(t_st_tbl_traffic_summary)s partition (pt_time=%(ARG_OPTIME_LASTDAY)s)
        SELECT %(ARG_OPTIME_LASTDAY)s AS cycle_id,
               CAST(CONCAT(substr(create_time,1,13),':00:00')  AS TIMESTAMP) AS CREATE_TIME,
               t1.traffic_id AS content_code,
               t1.traffic_type AS content_name,
               t2.std_content_type,
               round(SUM(t1.in_bytes)/1024/1024/1024,2) AS in_gbs,
               round(SUM(t1.out_bytes)/1024/1024/1024,2) AS out_gbs,
               round(SUM(t1.in_bytes+t1.out_bytes)/1024/1024/1024,2) AS total_gbs,
               current_timestamp as etl_date
        FROM %(s_stg_tbl_traffic)s t1 
        LEFT JOIN %(s_dim_std_content)s t2
        ON t1.traffic_id = t2.std_content_code
        WHERE t1.pt_time = %(ARG_OPTIME_LASTDAY)s
        AND COALESCE(t1.CREATE_time,'') <> ''
        GROUP BY traffic_id,t1.traffic_type,t2.std_content_type,CAST(CONCAT(substr(create_time,1,13),':00:00')  AS TIMESTAMP)
        GROUPING SETS ((traffic_id,t1.traffic_type,t2.std_content_type,CAST(CONCAT(substr(create_time,1,13),':00:00')  AS TIMESTAMP) ),
        (traffic_id,t1.traffic_type,t2.std_content_type)
        )
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
