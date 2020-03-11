##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST各时段各节目直播收视情况(日)
# Pay: ST_TV_DIFF_TIME_PROGRAM_VIEW_D.py
# Purpose:
#
# Author:      chens
#
# Created:     2016-10-18
# Copyright:   (c) chens 2016
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']                  #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
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
    s_dim_std_channel                         =    "dim_std_channel"
    s_dim_std_program                         =    "dim_std_program"
    s_st_tv_total_view_d                      =    "st_tv_total_view_d"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_tv_diff_time_program_view_d          =    "st_tv_diff_time_program_view_d"
    t_st_tv_diff_time_program_view_d_tmp1     =    "st_tv_diff_time_program_view_d_tmp1"
    t_st_tv_diff_time_program_view_d_tmp2     =    "st_tv_diff_time_program_view_d_tmp2"
    t_st_tv_diff_time_program_view_d_tmp3     =    "st_tv_diff_time_program_view_d_tmp3"
    t_st_tv_diff_time_program_view_d_tmp4     =    "st_tv_diff_time_program_view_d_tmp4"
    t_st_tv_diff_time_program_view_d_tmp5     =    "st_tv_diff_time_program_view_d_tmp5"
    t_st_tv_diff_time_program_view_d_tmp6     =    "st_tv_diff_time_program_view_d_tmp6"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放直播的清洗数据，包括频道，开始结束时间的时间戳等
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp1)s
            (
              serial_id       string,
              begin_time      string,
              end_time        string,
              channel_name    string,
              duration        int,
              begin_time_num  int,
              end_time_num    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放节目频道对应关系的清洗数据，包括节目开始时间节目结束时间的时间戳
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp2)s
            (
              channel_name    string,
              program_name    string,
              begin_time      string,
              end_time        string,
              duration        int,
              begin_time_num  int,
              end_time_num    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放直播的结果数据，得到看该频道该节目对应的实际时长
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp3)s
            (
              serial_id           string,
              begin_time          string,
              end_time            string,
              begin_time_num      int,
              end_time_num        int,
              duration            int,
              channel_name        string,
              program_name        string,
              view_time           int,
              pro_begin_time      string,
              pro_end_time        string,
              pro_begin_time_num  int,
              pro_end_time_num    int,
              pro_duration        int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放  各时段各节目的直播收视用户数和直播时长的汇总数据
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp4)s
            (
              own_corp_std_org_code   string,
              own_corp_std_org_name   string,
              std_channel_code        string,
              std_channel_name        string,
              std_program_code        string,
              std_program_name        string,
              pro_begin_time          string,
              pro_end_time            string,
              pro_duration            double,
              tv_user_count           int,
              tv_time                 int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放 节目开始时间和结束时间
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp5)s
            (
              pro_begin_time      string,
              pro_end_time        string,
              pro_begin_time_num  int,
              pro_end_time_num    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp5)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 各时段的 直播时长汇总数据
    hsql='''create table if not exists %(t_st_tv_diff_time_program_view_d_tmp6)s
            (
              own_corp_std_org_code   string,
              own_corp_std_org_name   string,
              pro_begin_time          string,
              pro_end_time            string,
              tv_time                 int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(t_st_tv_diff_time_program_view_d_tmp6)s'
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
      #生成 临时表1
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp1)s
              select
                t1.user_id serial_id,
                t1.start_time,
                t1.end_time,
                t1.channel_name,
                t1.duration,
                unix_timestamp(t1.start_time,'yyyy-MM-dd HH:mm:ss') begin_time_num,
                unix_timestamp(t1.end_time,'yyyy-MM-dd HH:mm:ss') end_time_num
              from %(s_dwd_tv_view_log)s t1
              where  t1.pt_time=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #生成 临时表2
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp2)s
              select
                t1.channel_name,
                t1.program_name,
                t1.begin_time,
                t1.end_time,
                t1.duration,
                unix_timestamp(t1.begin_time,'yyyy-MM-dd HH:mm:ss') begin_time_num,
                unix_timestamp(t1.end_time,'yyyy-MM-dd HH:mm:ss') end_time_num
              from %(s_dwd_channel_program)s t1
              where t1.pt_time=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #生成 临时表3
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp3)s
              select
                t1.serial_id,
                t1.begin_time,
                t1.end_time,
                t1.begin_time_num,
                t1.end_time_num,
                t1.duration,
                t1.channel_name,
                t2.program_name,
                if(t1.end_time_num<t2.end_time_num,t1.end_time_num,t2.end_time_num)
                  -if(t1.begin_time_num>t2.begin_time_num,t1.begin_time_num,t2.begin_time_num) view_time,
                t2.begin_time pro_begin_time,
                t2.end_time pro_end_time,
                t2.begin_time_num pro_begin_time_num,
                t2.end_time_num pro_end_time_num,
                t2.duration pro_duration
              from %(t_st_tv_diff_time_program_view_d_tmp1)s t1,%(t_st_tv_diff_time_program_view_d_tmp2)s t2
              where t1.channel_name=t2.channel_name
                    and t1.begin_time_num<t2.end_time_num 
                    and t1.end_time_num>t2.begin_time_num
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #生成 临时表4
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp4)s
              select
                '' own_corp_std_org_code,
                '' own_corp_std_org_name,
                t3.std_channel_code,
                t1.channel_name std_channel_name,
                t2.std_program_code,
                t1.program_name std_program_name,
                t1.pro_begin_time,
                t1.pro_end_time,
                t1.pro_duration,
                count(distinct t1.serial_id) tv_user_count,
                sum(t1.view_time) tv_time
              from %(t_st_tv_diff_time_program_view_d_tmp3)s t1
              left outer join %(s_dim_std_program1)s t2 on t1.program_name=t2.std_program_name
              left outer join %(s_dim_std_channel)s t3 on t1.channel_name=t3.std_channel_name
              group by t3.std_channel_code,t1.channel_name,t2.std_program_code,t1.program_name,
                       t1.pro_begin_time,t1.pro_end_time,t1.pro_duration
              '''% vars()
      QueryExe(hsql,name,dates)

      #生成 临时表5

      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp5)s
              select
                distinct
                t1.begin_time pro_begin_time,
                t1.end_time pro_end_time,
                t1.begin_time_num pro_begin_time_num,
                t1.end_time_num pro_end_time_num
              from %(t_st_tv_diff_time_program_view_d_tmp2)s t1
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #生成 临时表6
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d_tmp6)s
              select
                '' own_corp_std_org_code,
                '' own_corp_std_org_name,
                t2.pro_begin_time,
                t2.pro_end_time,
                sum(if(t1.end_time_num<t2.pro_end_time_num,t1.end_time_num,t2.pro_end_time_num)
                    -if(t1.begin_time_num>t2.pro_begin_time_num,t1.begin_time_num,t2.pro_begin_time_num)) tv_time
              from %(t_st_tv_diff_time_program_view_d_tmp1)s t1,%(t_st_tv_diff_time_program_view_d_tmp5)s t2
              where t1.begin_time_num<t2.pro_end_time_num 
                    and t1.end_time_num>t2.pro_begin_time_num
              group by t2.pro_begin_time,t2.pro_end_time
              '''% vars()
      QueryExe(hsql,name,dates)
      
      #插入当天全量数据
      hsql='''insert overwrite table %(t_st_tv_diff_time_program_view_d)s partition(pt_time=%(v_date)s)
              select
                %(v_date)s cycle_id,
                t1.own_corp_std_org_code,
                t1.own_corp_std_org_name,
                t1.std_channel_code,
                t1.std_channel_name,
                t1.std_program_code,
                t1.std_program_name,
                t1.pro_begin_time,
                t1.pro_end_time,
                t1.tv_user_count,
                round(t1.tv_time/60,2) tv_time,
                case when coalesce(t1.tv_user_count,0)=0 then 0 else round(t1.tv_time/60/t1.tv_user_count,2) end avg_tv_time,
                case when coalesce(t3.tv_user_count,0)=0 then 0 else round(t1.tv_time/(t1.pro_duration*t3.tv_user_count)*100,2) end tv_rate,
                case when coalesce(t2.tv_time,0)=0 then 0 else round(t1.tv_time/t2.tv_time*100,2) end tv_occupy_rate,
                case when coalesce(t3.tv_user_count,0)=0 then 0 else round(t1.tv_user_count/t3.tv_user_count*100,2) end tv_arrival_rate,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
              from %(t_st_tv_diff_time_program_view_d_tmp4)s t1
              left outer join %(t_st_tv_diff_time_program_view_d_tmp6)s t2 on t1.own_corp_std_org_code=t2.own_corp_std_org_code
                                                                              and t1.pro_begin_time=t2.pro_begin_time
                                                                              and t1.pro_end_time=t2.pro_end_time
              left outer join %(s_st_tv_total_view_d)s t3 on t1.own_corp_std_org_code=t3.own_corp_std_org_code
                                                             and t3.pt_time=%(v_date)s
              '''% vars()
      QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp1)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp2)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp3)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp4)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp5)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(t_st_tv_diff_time_program_view_d_tmp6)s''' %vars()
#    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
