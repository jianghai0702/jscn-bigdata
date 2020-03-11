#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST不同节目出品地点播统计
# Pay: ST_DR_MOVIE_PRODUCED_SUMMARY.py
# Purpose: 
# 
# Author:      wangxx
# 
# Created:     2018-12-13
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
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
ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期

# 源表声明
#-------------------------------------------------------------------------------
s_st_diff_movie_dr_summary                   =    "st_diff_movie_dr_summary"
s_dim_dr_program_label                        =    "dim_dr_program_label"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_dr_movie_produced_summary                    =    "st_dr_movie_produced_summary"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    #-------------------------------------------------------------------------------
    # 删除临时表
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_dr_movie_produced_summary)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               t1.own_corp_std_org_code,
               t1.own_corp_std_org_name,
               t2.produced1 AS produced,
               SUM(t1.dr_user_count) AS dr_user_count,
               SUM(t1.dr_count) AS dr_count,
               SUM(t1.lb_user_count) AS lb_user_count,
               SUM(t1.lb_count) AS lb_count,
               current_timestamp as etl_date
          from %(s_st_diff_movie_dr_summary)s AS t1
        INNER  JOIN (select program_name,produced1 from %(s_dim_dr_program_label)s lateral view explode(produced) mt as produced1) AS t2
            ON  t1.movie_name = t2.program_name
        WHERE COALESCE(t1.own_corp_std_org_code,'') <> ''
          AND COALESCE(t2.produced1,'') <> ''
        GROUP BY t1.own_corp_std_org_code,t1.own_corp_std_org_name,t2.produced1
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
