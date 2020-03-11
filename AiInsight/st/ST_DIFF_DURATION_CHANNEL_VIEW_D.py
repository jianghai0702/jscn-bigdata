#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST各时段各频道直播收视情况
# Pay: ST_DIFF_DURATION_CHANNELGROUP_VIEW_D.py
# Purpose: 
# 
# Author:      wangxx
# 
# Created:     2018-12-14
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
s_st_tv_diff_time_channel_view_d                        =    "st_tv_diff_time_channel_view_d"
s_dim_std_channel                                            =    "dim_std_channel"
s_dim_std_duration                                           =    "dim_std_duration"
s_st_tv_diff_time_view_d                                    =    "st_tv_diff_time_view_d"
s_st_tv_total_view_d                                          =    "st_tv_total_view_d"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_diff_duration_channel_view_d                    =    "st_diff_duration_channel_view_d"    

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
        insert overwrite table %(t_st_diff_duration_channel_view_d)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT a1.cycle_id,a1.own_corp_std_org_code,a1.own_corp_std_org_name,
               a3.std_channel_group_code,a3.std_channel_group_name,
               a1.std_channel_name,a1.duration_id,a1.duration_name,
               a1.tv_time,
               a1.all_tv_time,
               a1.tv_user_count,
               round(a1.tv_time/a1.all_tv_time *100,2) AS tv_occupy_rate,
               round(a1.tv_time/(a2.tv_user_count * a1.duration_times) * 100,2) AS tv_rate,
               round(a1.tv_user_count/a2.tv_user_count*100,2) AS tv_arrival_rate,
               round(a1.tv_time/a1.tv_user_count,2) AS avg_tv_time,
               round((a1.tv_time/(a2.tv_user_count * a1.duration_times))/(a1.tv_user_count/a2.tv_user_count) * 100,2) AS loyalty_rate,
               CURRENT_TIMESTAMP AS etl_date
        FROM 
        (SELECT t1.cycle_id,t1.own_corp_std_org_code,t1.own_corp_std_org_name,t1.std_channel_name,t3.duration_id,t3.duration_name,t3.duration_times,
               SUM(t1.tv_time) AS tv_time,
               SUM(t2.tv_time) AS all_tv_time,
               SUM(t1.tv_user_count) AS tv_user_count       
        FROM %(s_st_tv_diff_time_channel_view_d)s AS t1 ,dim_std_duration AS t3
        LEFT JOIN %(s_st_tv_diff_time_view_d)s AS t2 
        ON t1.cycle_id = t2.cycle_id AND t1.own_corp_std_org_code = t2.own_corp_std_org_code AND t1.std_times_code = t2.std_times_code AND t2.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
        WHERE t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
        AND  CAST(t1.std_times_code AS INT) BETWEEN t3.start_times_code AND t3.end_times_code
        GROUP BY t1.cycle_id,t1.own_corp_std_org_code,t1.own_corp_std_org_name,t1.std_channel_name,t3.duration_id,t3.duration_name,t3.duration_times )  AS a1
        LEFT JOIN %(s_st_tv_total_view_d)s AS a2 
        ON a1.cycle_id = a2.cycle_id AND a2.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
        AND a1.own_corp_std_org_code = a2.own_corp_std_org_code 
        LEFT JOIN %(s_dim_std_channel)s AS a3
        ON a1.std_channel_name = a3.std_channel_name 
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
