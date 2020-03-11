##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST电视收看明细数据(日)
# Pay: ST_VIEW_DTL_D.py
# Purpose:
#
# Author:      liuzx
#
# Created:     2016-8-22
# Copyright:   (c) liuzx 2016
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
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']			      #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            # 获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_tv_view_log                         =    "dwa_tv_view_log"
    s_dwd_channel_program                     =    "dwd_channel_program"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_view_dtl_d         				          =    "st_view_dtl_d"
    t_st_view_dtl_d_tmp1        				      =    "st_view_dtl_d_tmp1"
    t_st_view_dtl_d_tmp2        				      =    "st_view_dtl_d_tmp2"
    t_st_view_dtl_d_tmp3        				      =    "st_view_dtl_d_tmp3"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放直播的清洗数据，包括频道，开始结束时间的时间戳等
    hsql='''create table if not exists %(t_st_view_dtl_d_tmp1)s
            (
        id          string,
        start_date  string,
        channel     string,
        view_type   string,
        view_time   string,
        start_time  int,
        end_time    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_view_dtl_d_tmp1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放节目频道对应关系的清洗数据，包括节目开始时间节目结束时间的时间戳
    hsql='''create table if not exists %(t_st_view_dtl_d_tmp2)s
            (
        channel     string,
        program     string,
        begin_time  string,
        view_time   string,
        start_time  int,
        end_time    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_view_dtl_d_tmp2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放直播的结果数据
    hsql='''create table if not exists %(t_st_view_dtl_d_tmp3)s
            (
        id          string,
        start_date  string,
        channel     string,
        program     string,
        view_time   string,
        start_time  int,
        end_time    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_view_dtl_d_tmp3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#上周的日期列表yyyymmdd
    li=[ARG_OPTIME_LAST7DAY,ARG_OPTIME_LAST6DAY,ARG_OPTIME_LAST5DAY,ARG_OPTIME_LAST4DAY,ARG_OPTIME_LAST3DAY,ARG_OPTIME_LAST2DAY,ARG_OPTIME_LASTDAY]
    li_iso=[ARG_OPTIME_LAST7DAY_ISO,ARG_OPTIME_LAST6DAY_ISO,ARG_OPTIME_LAST5DAY_ISO,ARG_OPTIME_LAST4DAY_ISO,ARG_OPTIME_LAST3DAY_ISO,ARG_OPTIME_LAST2DAY_ISO,ARG_OPTIME_LASTDAY_ISO]

    for n in range(1,len(li)+1):
      v_date=li[n-1]
      v_date_iso=li_iso[n-1]
      #在临时表1中删除变更数据
      hsql='''insert overwrite table %(t_st_view_dtl_d_tmp1)s
              select
                t1.user_id serial_id,
                t1.start_time start_date,
                t1.event_desc channel,
                case when t1.event_type='广播频道' then '直播'
                     when t1.event_type='时移节目' then '回看'
                     else '点播' end view_type,
                t1.duration view_time,
                unix_timestamp(t1.start_time,'yyyy-MM-dd HH:mm:ss') start_time,
                unix_timestamp(t1.end_time,'yyyy-MM-dd HH:mm:ss') end_time
              from %(s_dwd_tv_view_log)s t1
                where cast(t1.duration as int)>300
                  and t1.pt_time=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #在临时表2中删除变更数据
      hsql='''insert overwrite table %(t_st_view_dtl_d_tmp2)s
              select
                t1.channel_name channel,
                t1.program_name program,
                t1.begin_time,
                t1.duration view_time,
                unix_timestamp(t1.begin_time,'yyyy-MM-dd HH:mm:ss') start_time,
                unix_timestamp(t1.end_time,'yyyy-MM-dd HH:mm:ss') end_time
              from %(s_dwd_channel_program)s t1
                where t1.pt_time=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #在临时表3中删除变更数据
      hsql='''insert overwrite table %(t_st_view_dtl_d_tmp3)s
              select
                t1.id,
                t1.start_date,
                t1.channel,
                t2.program,
                if(t1.end_time<t2.end_time,t1.end_time,t2.end_time)
                  -if(t1.start_time>t2.start_time,t1.start_time,t2.start_time) view_time,
                t1.start_time,
                t1.end_time
              from %(t_st_view_dtl_d_tmp1)s t1,%(t_st_view_dtl_d_tmp2)s t2
              where t1.channel=t2.channel
                and t1.start_time<t2.end_time 
                and t1.end_time>t2.start_time
                and t1.view_type='直播'
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #插入当前dwd全量数据
      hsql='''insert overwrite table %(t_st_view_dtl_d)s partition(pt_time=%(v_date)s)
              select
                %(v_date)s cycle_id,
                t1.id id,
                t1.view_type,
                t1.start_date,
                '' channel,
                t1.channel program,
                round(t1.view_time/60,2) view_time,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
              from %(t_st_view_dtl_d_tmp1)s t1
              where t1.view_type in('回看','点播')
              union all
              select
                %(v_date)s cycle_id,
                t2.id,
                '直播' view_type,
                t2.start_date,
                t2.channel,
                t2.program,
                round(t2.view_time/60,2) view_time,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
              from %(t_st_view_dtl_d_tmp3)s t2
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
