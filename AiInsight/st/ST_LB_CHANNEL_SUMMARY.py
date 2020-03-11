#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST回看频道分析
# Pay: ST_LB_CHANNEL_SUMMARY.py
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
s_dwd_dr_ismp                        =    "dwd_dr_ismp"
s_dim_std_organize                              =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_lb_channel_summary                    =    "st_lb_channel_summary"    

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
        insert overwrite table %(t_st_lb_channel_summary)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               t1.own_corp_std_org_code,
               t2.std_org_name AS own_corp_std_org_name,
               t1.channelid AS channel_id,
               t1.channelname AS channel_name,
               COUNT(DISTINCT t1.user_id) AS lb_user_count,
               COUNT(1) AS lb_count,
               current_timestamp as etl_date
          from %(s_dwd_dr_ismp)s AS t1
        inner JOIN %(s_dim_std_organize)s AS t2 
            ON  t1.own_corp_std_org_code = t2.std_org_code
        WHERE t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
          AND  t1.data_source_cd  = 'VOD'
        GROUP BY t1.own_corp_std_org_code,t2.std_org_name,t1.channelid,t1.channelname
    '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''
        insert into table %(t_st_lb_channel_summary)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select t1.cycle_id,
               COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code,
               COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name,
               t1.channel_id,
               t1.channel_name,
               SUM(t1.lb_user_count) AS lb_user_count,
               SUM(t1.lb_count) AS lb_count,
               current_timestamp as etl_date
          from %(t_st_lb_channel_summary)s AS t1
                LEFT JOIN %(s_dim_std_organize)s t2
                    ON t1.own_corp_std_org_code = t2.std_org_code
                LEFT JOIN %(s_dim_std_organize)s t3
                    ON t3.std_org_code = t2.p_std_org_code
        WHERE t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
        GROUP BY cycle_id ,t3.std_org_code,t3.std_org_name,t1.channel_id,t1.channel_name
        GROUPING SETS ((cycle_id ,t3.std_org_code,t3.std_org_name,t1.channel_id,t1.channel_name),(cycle_id,t1.channel_id,t1.channel_name))
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
