#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA直播各分钟各节目收视统计(日)
# Pay: DWA_TV_DIFF_MIN_PROGRAM_D.py
# Purpose: 每月直播各分钟各节目收视用户数、收视时长
# 
# Author:      wangxx
# 
# Created:     2019-01-07
# Copyright:   (c) wangxx 2019
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
ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期


# 源表声明
#-------------------------------------------------------------------------------
s_dwa_tv_view_log                =    "dwa_tv_view_log"
s_dim_std_organize               =     "dim_std_organize"
s_dim_std_minute                  =    "dim_std_minute"

# 临时表声明
#-------------------------------------------------------------------------------
# 目标表声明
#-------------------------------------------------------------------------------
t_dwa_tv_diff_min_program_d                    =    "dwa_tv_diff_min_program_d"

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
    
    # 生成分公司数据
    
    hsql=r'''
        insert overwrite table %(t_dwa_tv_diff_min_program_d)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
                    select
                        t1.tv_day as cycle_id,
                        t1.own_corp_std_org_code,
                        t3.std_org_name as  own_corp_std_org_name,
                        t2.std_minute_code,
                        t2.std_minute_name,
                        null as std_channel_code,
                        t1.CHANNEL_NAME as std_channel_name,
                        regexp_replace(trim(t1.PROGRAM_NAME),'\\(.*\\)','')  AS program_name,
                        count(distinct t1.user_id) as tv_user_count,
                      round(sum(case when substr(cast(t1.start_time as string),12,5)=t2.std_minute_name and substr(cast(t1.end_time as string),12,5)=t2.std_minute_name then second(t1.end_time)-second(t1.start_time)
                                        when substr(cast(t1.start_time as string),12,5)=t2.std_minute_name and substr(cast(t1.end_time as string),12,5)>t2.std_minute_name then 60-second(t1.start_time)
                                        when substr(cast(t1.start_time as string),12,5)<t2.std_minute_name and substr(cast(t1.end_time as string),12,5)=t2.std_minute_name then second(t1.end_time)
                                        else 60 end)/60,2)  as tv_time,
        
                        current_timestamp as etl_date
                      from %(s_dwa_tv_view_log)s t1,
                           %(s_dim_std_minute)s t2
                             inner join %(s_dim_std_organize)s t3
                                 on t1.own_corp_std_org_code = t3.std_org_code
                     where t1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
                       AND CAST(t2.std_minute_code AS INT) - 1  BETWEEN HOUR(t1.start_time) * 60 + MINUTE(t1.start_time) AND HOUR(t1.end_time) * 60 + MINUTE(t1.end_time)
                       AND COALESCE(t1.program_name,'') NOT IN ('','结束','NULL','null')
                       AND t1.tv_day BETWEEN '%(ARG_OPTIME_LASTMON01)s' AND '%(ARG_OPTIME_LASTMONEND)s'
                       AND t3.p_std_org_code IN ('1007')
                    group by t1.tv_day,t1.own_corp_std_org_code,t3.std_org_name,t2.std_minute_code,t2.std_minute_name,t1.channel_name,regexp_replace(trim(t1.PROGRAM_NAME),'\\(.*\\)','')
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 生成地市、省的数据
    
    hsql=r'''
        insert into table %(t_dwa_tv_diff_min_program_d)s partition (pt_mon='%(ARG_OPTIME_LAST1_M)s')
                    select t1.cycle_id, 
                             coalesce(t3.std_org_code,'10') as own_corp_std_org_code,
                             coalesce(t3.std_org_name,'江苏有线') as own_corp_std_org_name,
                             t1.std_minute_code,
                             t1.std_minute_name,
                             t1.std_channel_code,
                             t1.std_channel_name,
                           t1.program_name,
                             sum(t1.tv_user_count) as tv_user_count,
                             sum(t1.tv_time) as tv_time,
                             current_timestamp as etl_date
                    from %(t_dwa_tv_diff_min_program_d)s as t1
                             LEFT JOIN %(s_dim_std_organize)s as  t2
                             ON t1.own_corp_std_org_code = t2.std_org_code
                         LEFT JOIN %(s_dim_std_organize)s as t3
                             ON t3.std_org_code = t2.p_std_org_code
                   where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                    GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name,t1.program_name
                    grouping sets ( (cycle_id,t3.std_org_code,t3.std_org_name,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name,t1.program_name) ,
                                           (cycle_id,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name,t1.program_name) )
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
