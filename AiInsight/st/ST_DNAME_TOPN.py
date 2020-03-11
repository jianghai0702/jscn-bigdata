#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST总体域名流量排名
# Pay: ST_DNAME_TOPN.py
# Purpose:  
# 
# Author:      wangxx
# 
# Created:     2018-12-27
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
s_stg_tbl_dname_topn               =    "stg_tbl_dname_topn"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_dname_topn                      =    "st_dname_topn"    

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
        INSERT OVERWRITE TABLE %(t_st_dname_topn)s partition (pt_time=%(ARG_OPTIME_LASTDAY)s)
        SELECT %(ARG_OPTIME_LASTDAY)s AS cycle_id,
               trim(t1.nodeid),
               TRIM(lower(t1.host_text)) AS dname,
               round(SUM(t1.in_bytes)/1024/1024/1024,2) AS in_gbs,
               round(SUM(t1.out_bytes)/1024/1024/1024,2) AS out_gbs,
               round(SUM(t1.total_bytes)/1024/1024/1024,2) AS total_gbs,
               CURRENT_TIMESTAMP AS etl_date
        FROM %(s_stg_tbl_dname_topn)s t1 
        WHERE t1.pt_time = %(ARG_OPTIME_LASTDAY)s
          AND LENGTH(trim(t1.nodeid)) = 10 
          AND COALESCE(t1.host_text,'') <> ''
        GROUP BY trim(t1.nodeid),TRIM(lower(t1.host_text))
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
