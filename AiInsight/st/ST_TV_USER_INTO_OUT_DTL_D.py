#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST直播各频道用户流入流出明细情况(日)
# Pay:ST_TV_USER_INTO_OUT_DTL_D.py
# Purpose:
#
# Author:      chens
#
# Created:     24-10-2016
# Copyright:   (c) chens 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from env_path import *
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
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']          #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']      #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']          #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']      #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期  
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_tv_view_log                    =    "dwa_tv_view_log"
    s_dim_std_channel                    =    "dim_std_channel"
    s_dim_std_times                      =    "dim_std_times"
    s_st_tv_total_view_d                 =    "st_tv_total_view_d"
    s_temp_st_tv_user_into_out_dtl_d1    =    "temp_st_tv_user_into_out_dtl_d1"
    s_temp_st_tv_user_into_out_dtl_d2    =    "temp_st_tv_user_into_out_dtl_d2"
    s_temp_st_tv_user_into_out_dtl_d3    =    "temp_st_tv_user_into_out_dtl_d3"
    s_temp_st_tv_user_into_out_dtl_d4    =    "temp_st_tv_user_into_out_dtl_d4"
    s_temp_st_tv_user_into_out_dtl_d5    =    "temp_st_tv_user_into_out_dtl_d5"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_tv_user_into_out_dtl_d          =    "st_tv_user_into_out_dtl_d"      
##===========================================================================       
##创建临时表                                                        
##===========================================================================
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放直播的清洗数据，包括频道，开始结束时间的时间戳等，并排除持续时间小于等于10秒的数据,然后按用户分组，时间降序排序；
    hsql='''create table if not exists %(s_temp_st_tv_user_into_out_dtl_d1)s
            (
              serial_id       string,
              begin_time      string,
              end_time        string,
              channel_name    string,
              begin_time_num  int,
              end_time_num    int,
              rn              int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_tv_user_into_out_dtl_d1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#存放  同一个用户从一个频道换到另一个频道的记录
    hsql='''create table if not exists %(s_temp_st_tv_user_into_out_dtl_d2)s
            (
              serial_id            string,
              begin_time           string,
              end_time             string,
              channel_name         string,
              begin_time_num       int,
              end_time_num         int,
              next_channel_name    string,
              next_begin_time      string,
              next_end_time        string,
              next_begin_time_num  int,
              next_end_time_num    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_tv_user_into_out_dtl_d2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放标准时段的清洗数据，包括时段开始时间结束时间的时间戳
    hsql='''create table if not exists %(s_temp_st_tv_user_into_out_dtl_d3)s
            (
              std_times_code     string,
              std_times_name     string,
              min_value          string,
              max_value          string,
              begin_time_num     int,
              end_time_num       int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_tv_user_into_out_dtl_d3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放关联标准时段之后的数据
    hsql='''create table if not exists %(s_temp_st_tv_user_into_out_dtl_d4)s
            (
              serial_id            string,
              channel_name         string,
              begin_time           string,
              end_time             string,
              begin_time_num       int,
              end_time_num         int,
              next_channel_name    string,
              next_begin_time      string,
              next_end_time        string,
              next_begin_time_num  int,
              next_end_time_num    int,
              std_times_code       string,
              std_times_name       string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_tv_user_into_out_dtl_d4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#存放    各频道用户流入流出情况
    hsql='''create table if not exists %(s_temp_st_tv_user_into_out_dtl_d5)s
            (
              own_corp_std_org_code string,
              own_corp_std_org_name string,
              std_times_code        string,
              std_times_name        string,
              std_channel_code      string,
              std_channel_name      string,
              into_out_channel      string,
              into_user_count       int,
              out_user_count        int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_tv_user_into_out_dtl_d5)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成    包括频道，开始结束时间的时间戳等，并排除持续时间小于等于10秒的数据
    hsql='''insert overwrite table %(s_temp_st_tv_user_into_out_dtl_d1)s
            select
                t1.user_id serial_id,
                t1.start_time,
                t1.end_time,
                t1.channel_name,
                unix_timestamp(t1.start_time,'yyyy-MM-dd HH:mm:ss') begin_time_num,
                unix_timestamp(t1.end_time,'yyyy-MM-dd HH:mm:ss') end_time_num,
                row_number() over(distribute by t1.user_id sort by t1.start_time) rn
             from %(s_dwd_tv_view_log)s t1
             where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
                   and t1.duration>10
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成    同一个用户从一个频道换到另一个频道的记录
    hsql='''insert overwrite table %(s_temp_st_tv_user_into_out_dtl_d2)s
            select
                t1.serial_id,
                t1.begin_time,
                t1.end_time,
                t1.channel_name,
                t1.begin_time_num,
                t1.end_time_num,        
                t2.channel_name next_channel_name,
                t2.begin_time next_begin_time,
                t2.end_time next_end_time,
                t2.begin_time_num next_begin_time_num,
                t2.end_time_num next_end_time_num
             from %(s_temp_st_tv_user_into_out_dtl_d1)s t1
             left outer join %(s_temp_st_tv_user_into_out_dtl_d1)s t2 on t1.serial_id=t2.serial_id and t1.rn+1=t2.rn
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成   标准时段的清洗数据，包括时段开始时间结束时间的时间戳
    hsql='''insert overwrite table %(s_temp_st_tv_user_into_out_dtl_d3)s
            select
                t1.std_times_code,
                t1.std_times_name,
                t1.min_value,
                t1.max_value,
                unix_timestamp(cast(%(ARG_OPTIME_LASTDAY)s as string),'yyyyMMdd')+min_value*3600 begin_time_num,
                unix_timestamp(cast(%(ARG_OPTIME_LASTDAY)s as string),'yyyyMMdd')+max_value*3600 end_time_num
              from %(s_dim_std_times)s t1
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成   关联标准时段之后的数据
#排除同一个用户中，下一个频道开始时间-前一个频道的结束时间大于>=5分钟的记录，防止关机后过了一段时间再开机的情况
    hsql='''insert overwrite table %(s_temp_st_tv_user_into_out_dtl_d4)s
            select
                t1.serial_id,
                t1.channel_name,
                t1.begin_time,
                t1.end_time,
                t1.begin_time_num,
                t1.end_time_num,        
                t1.next_channel_name,
                t1.next_begin_time,
                t1.next_end_time,
                t1.next_begin_time_num,
                t1.next_end_time_num,
                t2.std_times_code,
                t2.std_times_name
            from %(s_temp_st_tv_user_into_out_dtl_d2)s t1,%(s_temp_st_tv_user_into_out_dtl_d3)s t2
            where t1.end_time_num+300>t1.next_begin_time_num
                  and t1.next_begin_time_num>=t2.begin_time_num 
                  and t1.next_begin_time_num<t2.end_time_num
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成    用户流入情况；
    hsql='''insert overwrite table %(s_temp_st_tv_user_into_out_dtl_d5)s
            select
                '' own_corp_std_org_code,
                '' own_corp_std_org_name,
                t1.std_times_code,
                t1.std_times_name,
                t2.std_channel_code,
                t1.next_channel_name std_channel_name,
                t1.channel_name into_out_channel,
                count(distinct t1.serial_id) into_user_count,
                0 out_user_count
             from %(s_temp_st_tv_user_into_out_dtl_d4)s t1
             left outer join %(s_dim_std_channel)s t2 on t1.next_channel_name=t2.std_channel_name
             group by t1.std_times_code,t1.std_times_name,t2.std_channel_code,t1.next_channel_name,t1.channel_name
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成    用户流出情况；
    hsql='''insert into table %(s_temp_st_tv_user_into_out_dtl_d5)s
            select
                '' own_corp_std_org_code,
                '' own_corp_std_org_name,
                t1.std_times_code,
                t1.std_times_name,
                t2.std_channel_code,
                t1.channel_name std_channel_name,
                t1.next_channel_name into_out_channel,
                0 into_user_count,
                count(distinct t1.serial_id) out_user_count
             from %(s_temp_st_tv_user_into_out_dtl_d4)s t1
             left outer join %(s_dim_std_channel)s t2 on t1.channel_name=t2.std_channel_name
             group by t1.std_times_code,t1.std_times_name,t2.std_channel_code,t1.channel_name,t1.next_channel_name
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当天的记录；
    hsql='''insert overwrite table %(t_st_tv_user_into_out_dtl_d)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
                %(ARG_OPTIME_LASTDAY)s cycle_id,
                t1.own_corp_std_org_code,
                t1.own_corp_std_org_name,
                t1.std_times_code,
                t1.std_times_name,
                t1.std_channel_code,
                t1.std_channel_name,
                t1.into_out_channel,
                t1.into_user_count,
                t1.out_user_count,
                case when coalesce(t2.tv_user_count,0)=0 then 0 else round(t1.into_user_count/t2.tv_user_count*100,2) end into_turnover_rate,
                case when coalesce(t2.tv_user_count,0)=0 then 0 else round(t1.out_user_count/t2.tv_user_count*100,2) end out_turnover_rate,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
             from 
             (select
                t.own_corp_std_org_code,
                t.own_corp_std_org_name,
                t.std_times_code,
                t.std_times_name,
                t.std_channel_code,
                t.std_channel_name,
                t.into_out_channel,
                sum(t.into_user_count) into_user_count,
                sum(t.out_user_count) out_user_count
             from %(s_temp_st_tv_user_into_out_dtl_d5)s t
             group by t.own_corp_std_org_code,t.own_corp_std_org_name,t.std_times_code,t.std_times_name,
                      t.std_channel_code,t.std_channel_name,t.into_out_channel
            ) t1
            left outer join %(s_st_tv_total_view_d)s t2 on t1.own_corp_std_org_code=t2.own_corp_std_org_code
                                                           and t1.own_corp_std_org_name=t2.own_corp_std_org_name
                                                           and t2.pt_time=%(ARG_OPTIME_LASTDAY)s
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_st_tv_user_into_out_dtl_d1)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_user_into_out_dtl_d2)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_user_into_out_dtl_d3)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_user_into_out_dtl_d4)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_user_into_out_dtl_d5)s''' %vars()
#    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
