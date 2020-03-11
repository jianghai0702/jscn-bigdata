##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD电视频道节目单信息表
# Pay:DWD_CHANNEL_PROGRAM.py
# Purpose:
#
# Author:      lvdp,liuyf7
#
# Created:     21-09-2016
# Copyright:   (c) lvdp 2016
# Licence:     <your licence>
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
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2DAY       = dicts['ARG_OPTIME_LAST2DAY']           #获得传入的数据日期的前两天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2DAY_ISO   = dicts['ARG_OPTIME_LAST2DAY_ISO']       #获得传入的数据日期的前两天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3DAY       = dicts['ARG_OPTIME_LAST3DAY']           #获得传入的数据日期的前三天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3DAY_ISO   = dicts['ARG_OPTIME_LAST3DAY_ISO']       #获得传入的数据日期的前三天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST4DAY       = dicts['ARG_OPTIME_LAST4DAY']           #获得传入的数据日期的前四天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST4DAY_ISO   = dicts['ARG_OPTIME_LAST4DAY_ISO']       #获得传入的数据日期的前四天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST5DAY       = dicts['ARG_OPTIME_LAST5DAY']           #获得传入的数据日期的前五天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST5DAY_ISO   = dicts['ARG_OPTIME_LAST5DAY_ISO']       #获得传入的数据日期的前五天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST6DAY       = dicts['ARG_OPTIME_LAST6DAY']           #获得传入的数据日期的前六天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST6DAY_ISO   = dicts['ARG_OPTIME_LAST6DAY_ISO']       #获得传入的数据日期的前六天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST7DAY       = dicts['ARG_OPTIME_LAST7DAY']           #获得传入的数据日期的前七天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST7DAY_ISO   = dicts['ARG_OPTIME_LAST7DAY_ISO']       #获得传入的数据日期的前七天yyyy-mm-dd格式的数据日期
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
    s_stg_channel_program                =    "stg_channel_program"
    s_stg_channel_program_local          =    "stg_channel_program_local"
##===========================================================================
##自定义变量声明---目标表声明 
##===========================================================================
    t_dwd_channel_program                =    "dwd_channel_program"
##===========================================================================
##创建临时表
##===========================================================================

##===========================================================================
##数据处理
##===========================================================================
    #上周的日期列表yyyymmdd
    li=[ARG_OPTIME_LAST7DAY,ARG_OPTIME_LAST6DAY,ARG_OPTIME_LAST5DAY,ARG_OPTIME_LAST4DAY,ARG_OPTIME_LAST3DAY,ARG_OPTIME_LAST2DAY,ARG_OPTIME_LASTDAY]
    li_iso=[ARG_OPTIME_LAST7DAY_ISO,ARG_OPTIME_LAST6DAY_ISO,ARG_OPTIME_LAST5DAY_ISO,ARG_OPTIME_LAST4DAY_ISO,ARG_OPTIME_LAST3DAY_ISO,ARG_OPTIME_LAST2DAY_ISO,ARG_OPTIME_LASTDAY_ISO]

    for n in range(1,len(li)+1):
      v_date=li[n-1]
      v_date_iso=li_iso[n-1]
      #插入第n天的节目单
      hsql='''insert overwrite table %(t_dwd_channel_program)s partition(pt_time=%(v_date)s)
              select
                t1.channel_name,
                t1.event_id,
                t1.program_name,
                from_unixtime(unix_timestamp(t1.begin_time,'yyyyMMddHHmmss'),'yyyy-MM-dd HH:mm:ss') begin_time,
                from_unixtime(unix_timestamp(t1.begin_time,'yyyyMMddHHmmss')+cast(substr(t1.duration,1,2)*60*60+substr(t1.duration,3,2)*60+substr(t1.duration,5,2) as int),'yyyy-MM-dd HH:mm:ss') end_time,
                cast(substr(t1.duration,1,2)*60*60+substr(t1.duration,3,2)*60+substr(t1.duration,5,2) as int) duration,
                t1.event_type,
                t1.data_source_cd,
                %(v_date)s etl_cycle,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
              from %(s_stg_channel_program)s t1
              where t1.pt_time=%(v_date)s --第n天分区的节目单
                and substr(t1.begin_time,1,8)=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)
      #插入每周第n天的各地节目单
      hsql='''insert into table %(t_dwd_channel_program)s partition(pt_time=%(v_date)s)
              select
                t1.channel_name,
                '' event_id,
                t1.program_name,
                t1.begin_time,
                t1.end_time,
                cast(unix_timestamp(t1.end_time) as int) - cast(unix_timestamp(t1.begin_time) as int) duration,
                '' event_type,
                t1.data_source_cd,
                %(v_date)s etl_cycle,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
              from (
                    select
                      t1.channel_name,
                      t1.program_name,
                      case when length(t1.begin_time)=4 then concat('%(v_date_iso)s',' 0',t1.begin_time,':00')
                           when length(t1.begin_time)=5 then concat('%(v_date_iso)s',' ',t1.begin_time,':00')
                        else '' end begin_time,
                      case when length(t1.end_time)=4 then concat('%(v_date_iso)s',' 0',t1.end_time,':00')
                           when length(t1.end_time)=5 then concat('%(v_date_iso)s',' ',t1.end_time,':00')
                        else '' end end_time,
                      t1.data_source_cd
                    from %(s_stg_channel_program_local)s t1
                    where t1.pt_time=%(ARG_OPTIME_LASTDAY)s --上周的分区
                      and t1.day_of_week = %(n)s --第n天的节目单
              ) t1
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
