##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA直播收视明细表
# Pay:DWA_TV_VIEW_LOG.py
# Purpose:
#
# Author:      wangxx
#
# Created:     12-08-2018
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
#
#-------------------------------------------------------------------------------
# wangxx 2019-01-09
# 增加节目单匹配逻辑

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

#程序开始执行
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')


try:
#传递日期参数
    dicts={}
    Pama(dicts,dates)
    Start(name,dates)
#===========================================================================================
#ʱ时间参数引入
#===========================================================================================
    ARG_TODAY                 = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO            = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR           = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH          = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01        = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy-mm格式的数据日期
    ARG_OPTIME_MONTH12        = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy-mm格式的数据日期
    ARG_OPTIME_HOUR           = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD       = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY            = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON        = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON        = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO    = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2MON       = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO   = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3MON       = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO   = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTYEAR       = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO   = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR01         = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO     = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR12         = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO     = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MON01          = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO      = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MONEND         = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO     = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_ter_service             =    "dwd_ter_service"
    s_dim_double_rows           =    "dim_double_rows"
    s_dwd_channel_program    =    "dwd_channel_program"

##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_tv_view_log           =    "dwa_tv_view_log"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成数据
# 收视开始时间、结束时间在同一天的数据
    hsql='''insert overwrite table %(t_dwa_tv_view_log)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s,pt_time)            
            select
              translate(substr(cast(t1.time as string),1,10),'-','') as tv_day,
              t1.user_id             ,
              t1.cust_id,
              t1.sn                  ,
              t1.smcid               ,
              greatest(t1.ucendtime,cast(t2.begin_time as timestamp))  as start_time     ,
              least(t1.time,cast(t2.end_time as timestamp))  as end_time  ,
              unix_timestamp(least(t1.time,cast(t2.end_time as timestamp))) - unix_timestamp(greatest(t1.ucendtime,cast(t2.begin_time as timestamp)))  as duration     ,
              t1.service_id          ,
              t1.ts_id               ,
              t1.channel_name,
              coalesce(t2.program_name,regexp_replace(trim(t1.program_nam),'[(][0-9]*[)]','')) as program_name     ,
              t1.own_corp_std_org_code,
              current_timestamp etl_date,
              t2.pro_begin_time,
              t2.pro_end_time,
              t2.program_type,
              t2.broad_type,
              coalesce(t2.program_num, regexp_extract(t1.program_nam, '.*[(]([0-9]*)[)].*', 1)) as program_num,
               t2.pro_begin_minute_code,
               t2.pro_end_minute_code,
              translate(substr(cast(t1.time as string),1,10),'-','') as pt_time
            from %(s_dwd_ter_service)s t1
             left join %(s_dwd_channel_program)s t2 
                 on t1.channel_name = t2.channel_name
               and t2.pt_time = translate(substr(cast(t1.time as string),1,10),'-','')
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
              and unix_timestamp(t1.time) - unix_timestamp(t1.ucendtime) between 0 and 10800           -- 剔除收视时长异常的
              and t1.time >= cast(date '%(ARG_OPTIME_LASTMON01_ISO)s' as timestamp)
              and t1.ucendtime <= cast(date '%(ARG_OPTIME_MON01_ISO)s' as timestamp) -- 剔除时间异常数据
              and cast(t1.ucendtime as date) = cast(t1.time as date) 
              and ((t1.ucendtime < cast(t2.end_time as timestamp)             -- 匹配节目单节目
                     and t1.time > cast(t2.begin_time as timestamp)) 
                 or t2.channel_name is null )                      
            '''% vars()
    QueryExe(hsql,name,dates)


# 收视时间跨天的数据
    hsql='''insert into table %(t_dwa_tv_view_log)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s,pt_time)            
            select
              translate(substr(cast((case when t2.rownum = 1 then t1.ucendtime else t1.time end) as string),1,10),'-','') as tv_day,
              t1.user_id             ,
              t1.cust_id,
              t1.sn                  ,
              t1.smcid               ,
              greatest(cast(t3.begin_time as timestamp),case when t2.rownum = 1 then t1.ucendtime else cast(concat(substr(cast(t1.time as string),1,10),' 00:00:00') as timestamp) end) as start_time     ,
              least(cast(t3.end_time as timestamp),case when t2.rownum = 1 then cast(concat(substr(cast(t1.ucendtime as string),1,10),' 24:00:00') as timestamp) else t1.time end)  as end_time  ,
              case when t2.rownum = 1 then unix_timestamp(least(t3.end_time,concat(substr(cast(t1.time as string),1,10),' 00:00:00'))) - unix_timestamp(greatest(cast(t3.begin_time as timestamp),t1.ucendtime))
              else unix_timestamp(least(cast(t3.end_time as timestamp),t1.time)) - unix_timestamp(greatest(t3.begin_time,concat(substr(cast(t1.time as string),1,10),' 00:00:00'))) end as  duration     ,
              t1.service_id          ,
              t1.ts_id               ,
              t1.channel_name,
              coalesce(t3.program_name,regexp_replace(trim(t1.program_nam),'[(][0-9]*[)]','')) as program_name     ,
              t1.own_corp_std_org_code,
              current_timestamp etl_date,
              t3.pro_begin_time,
              t3.pro_end_time,
              t3.program_type,
              t3.broad_type,
              coalesce(t3.program_num, regexp_extract(t1.program_nam, '.*[(]([0-9]*)[)].*', 1)) as program_num,
               t3.pro_begin_minute_code,
               t3.pro_end_minute_code,
              translate(substr(cast((case when t2.rownum = 1 then t1.ucendtime else t1.time end) as string),1,10),'-','') as pt_time
            from %(s_dwd_ter_service)s t1
            cross join %(s_dim_double_rows)s t2   -- 把跨天的收视记录，分成两条：一条从ucendtime到当天24:00分，一条从time那天的00:00到time。
             left join %(s_dwd_channel_program)s t3
                 on t1.channel_name = t3.channel_name
               and t3.pt_time = translate(substr(cast((case when t2.rownum = 1 then t1.ucendtime else t1.time end) as string),1,10),'-','') 
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
              and unix_timestamp(t1.time) - unix_timestamp(t1.ucendtime) between 0 and 10800           -- 剔除收视时长异常的
              and t1.time >= cast( date '%(ARG_OPTIME_LASTMON01_ISO)s' as timestamp)
              and t1.ucendtime <= cast(date '%(ARG_OPTIME_MON01_ISO)s' as timestamp) -- 剔除时间异常数据
              and cast(t1.ucendtime as date) <> cast(t1.time as date) 
              and (( (case when t2.rownum = 1 then t1.ucendtime else cast(concat(substr(cast(t1.time as string),1,10),' 00:00:00') as timestamp) end) < cast(t3.end_time as timestamp)             -- 匹配节目单节目
                     and (case when t2.rownum = 1 then cast(concat(substr(cast(t1.ucendtime as string),1,10),' 24:00:00') as timestamp) else t1.time end) > cast(t3.begin_time as timestamp)) 
                 or t3.channel_name is null )                      
            '''% vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
