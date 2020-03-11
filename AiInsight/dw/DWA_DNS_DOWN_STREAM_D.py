﻿##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户DNS下行数据(日)
# Pay:dwa_dns_down_stream_d.py
# Purpose: 
#
# Author:      liuyf7
#
# Created:     27-08-2017
# Copyright:   (c) liuyf7 2017
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
#时间参数引入
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
    ARG_OPTIME_LAST2DAY       = dicts['ARG_OPTIME_LAST2DAY']          #获得传入的数据日期的前两天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2DAY_ISO   = dicts['ARG_OPTIME_LAST2DAY_ISO']      #获得传入的数据日期的前两天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3DAY       = dicts['ARG_OPTIME_LAST3DAY']          #获得传入的数据日期的前三天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3DAY_ISO   = dicts['ARG_OPTIME_LAST3DAY_ISO']      #获得传入的数据日期的前三天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST4DAY       = dicts['ARG_OPTIME_LAST4DAY']          #获得传入的数据日期的前四天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST4DAY_ISO   = dicts['ARG_OPTIME_LAST4DAY_ISO']      #获得传入的数据日期的前四天yyyy-mm-dd格式的数据日期
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_MEND     = dicts['ARG_OPTIME_LAST2_MEND']        #获得传入的数据日期的所在上两个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2_MEND_ISO = dicts['ARG_OPTIME_LAST2_MEND_ISO']    #获得传入的数据日期的所在上两个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_MEND        = dicts['ARG_OPTIME_LAST3_MEND']          #获得传入的数据日期的所在上三个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3_MEND_ISO    = dicts['ARG_OPTIME_LAST3_MEND_ISO']      #获得传入的数据日期的所在上三个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================
    s_dwd_dr_brd_expend             =    "dwd_dr_brd_expend"
    s_dwd_dns_down_stream               =    "dwd_dns_down_stream"
    s_dim_std_intranet_ip                   = "dim_std_intranet_ip"
    s_tmp_dwa_dns_down_stream_d1                =    "s_tmp_dwa_dns_down_stream_d1"  
    s_tmp_dwa_dns_down_stream_d2                =    "s_tmp_dwa_dns_down_stream_d2" 
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_dns_down_stream_d                =    "dwa_dns_down_stream_d"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放中间结果数据，当日在线记录
    hsql='''create table if not exists %(s_tmp_dwa_dns_down_stream_d1)s
            (
                acct_start_time    string
                ,acct_stop_time    string
                ,client_ip_address string
                ,user_name         string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_tmp_dwa_dns_down_stream_d1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_tmp_dwa_dns_down_stream_d2)s
            (
                login_name     string
                ,answer_code   string
                ,analysis_address   string
                ,count         bigint
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_tmp_dwa_dns_down_stream_d2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#插入当日的在线记录
    hsql='''insert overwrite table %(s_tmp_dwa_dns_down_stream_d1)s
    select from_unixtime(unix_timestamp(acct_start_time),'yyyyMMddHHmmss') as acct_start_time
         ,from_unixtime(unix_timestamp(acct_stop_time),'yyyyMMddHHmmss') as acct_stop_time
         ,client_ip_address
         ,user_name
     from %(s_dwd_dr_brd_expend)s
    where pt_time = %(ARG_OPTIME_LASTDAY)s
     '''% vars()
    QueryExe(hsql,name,dates)

#开始时间相同的，保留结束时间最大的
    hsql='''insert overwrite table %(s_tmp_dwa_dns_down_stream_d1)s
      select acct_start_time,acct_stop_time,client_ip_address,user_name
        from (select t.*,row_number()over(partition by user_name,acct_start_time order by acct_stop_time desc) rn
                from %(s_tmp_dwa_dns_down_stream_d1)s t
                 ) t
        where rn = 1
            '''% vars()
    QueryExe(hsql,name,dates)
#结束时间相同的，保留开始时间最小的
    hsql='''insert overwrite table %(s_tmp_dwa_dns_down_stream_d1)s
      select acct_start_time,acct_stop_time,client_ip_address,user_name
        from (select t.*,row_number()over(partition by user_name,acct_stop_time order by acct_start_time asc) rn
                from %(s_tmp_dwa_dns_down_stream_d1)s t
                 ) t
        where rn = 1
            '''% vars()
    QueryExe(hsql,name,dates)

##===========================================================================
##数据处理
##===========================================================================


    #======================================================================
    #生成上线时间在当天的访问数据
    hsql='''truncate table %(s_tmp_dwa_dns_down_stream_d2)s  '''% vars()
    QueryExe(hsql,name,dates)
    #循环
    # for n in range(0,12):
    hsql='''insert into table %(s_tmp_dwa_dns_down_stream_d2)s
           select
             t1.user_name AS login_name
             ,t2.answer_code
             ,split(t2.analysis_address, ';')[0] as analysis_address
             ,count(1)
           from %(s_tmp_dwa_dns_down_stream_d1)s t1 --在线记录 
            join %(s_dwd_dns_down_stream)s t2 --上行数据 (select query_time
              on t2.user_address = t1.client_ip_address 
              and t2.pt_time = %(ARG_OPTIME_LASTDAY)s
           where substring(t1.acct_start_time,1,8) = %(ARG_OPTIME_LASTDAY)s
             and t1.acct_start_time <= t2.query_time
             and t1.acct_stop_time >= t2.query_time
           group by t1.user_name
                   ,t2.answer_code
                   ,split(t2.analysis_address, ';')[0]
    '''% vars()
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(t_dwa_dns_down_stream_d)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s,etl_time=%(ARG_OPTIME_LASTDAY)s)
              select t2.login_name
                     ,t2.answer_code
                     ,if(t3.ip_network is not null,1,0) as is_intranet
                     ,sum(count),''
                from %(s_tmp_dwa_dns_down_stream_d2)s t2
           left join %(s_dim_std_intranet_ip)s t3 --内网IP表
                  on t2.analysis_address = t3.ip_network
               group by t2.login_name
                       ,t2.answer_code
                       ,if(t3.ip_network is not null,1,0)
     '''% vars()
    QueryExe(hsql,name,dates)


    #======================================================================
    #生成上线时间在前一天的访问数据
    hsql='''truncate table %(s_tmp_dwa_dns_down_stream_d2)s  '''% vars()
    QueryExe(hsql,name,dates)
    #循环
    # for n in range(0,12):
    hsql='''insert into table %(s_tmp_dwa_dns_down_stream_d2)s
           select
             t1.user_name AS login_name
             ,t2.answer_code
             ,split(t2.analysis_address, ';')[0] as analysis_address
             ,count(1)
           from %(s_tmp_dwa_dns_down_stream_d1)s t1 --在线记录 
            join %(s_dwd_dns_down_stream)s t2 --上行数据 (select query_time
              on t2.user_address = t1.client_ip_address 
              and t2.pt_time = %(ARG_OPTIME_LAST2DAY)s
           where substring(t1.acct_start_time,1,8) = %(ARG_OPTIME_LAST2DAY)s
             and t1.acct_start_time <= t2.query_time
             and t1.acct_stop_time >= t2.query_time
           group by t1.user_name
                   ,t2.answer_code
                   ,split(t2.analysis_address, ';')[0]
    '''% vars()
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(t_dwa_dns_down_stream_d)s partition(pt_time=%(ARG_OPTIME_LAST2DAY)s,etl_time=%(ARG_OPTIME_LASTDAY)s)
              select t2.login_name
                     ,t2.answer_code
                     ,if(t3.ip_network is not null,1,0) as is_intranet
                     ,sum(count),''
                from %(s_tmp_dwa_dns_down_stream_d2)s t2
           left join %(s_dim_std_intranet_ip)s t3 --内网IP表
                  on t2.analysis_address = t3.ip_network
               group by t2.login_name
                       ,t2.answer_code
                       ,if(t3.ip_network is not null,1,0)
     '''% vars()
    QueryExe(hsql,name,dates)


    #======================================================================
    #生成上线时间在前两天的访问数据
    hsql='''truncate table %(s_tmp_dwa_dns_down_stream_d2)s  '''% vars()
    QueryExe(hsql,name,dates)
    #循环
    # for n in range(0,12):
    hsql='''insert into table %(s_tmp_dwa_dns_down_stream_d2)s
         select
             t1.user_name AS login_name
             ,t2.answer_code
             ,split(t2.analysis_address, ';')[0] as analysis_address
             ,count(1)
           from %(s_tmp_dwa_dns_down_stream_d1)s t1 --在线记录 
            join %(s_dwd_dns_down_stream)s t2 --上行数据
              on t2.user_address = t1.client_ip_address 
              and t2.pt_time = %(ARG_OPTIME_LAST3DAY)s
           where substring(t1.acct_start_time,1,8) = %(ARG_OPTIME_LAST3DAY)s
             and t1.acct_start_time <= t2.query_time
             and t1.acct_stop_time >= t2.query_time
           group by t1.user_name
                   ,t2.answer_code
                   ,split(t2.analysis_address, ';')[0]
    '''% vars()
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(t_dwa_dns_down_stream_d)s partition(pt_time=%(ARG_OPTIME_LAST3DAY)s,etl_time=%(ARG_OPTIME_LASTDAY)s)
              select t2.login_name
                     ,t2.answer_code
                     ,if(t3.ip_network is not null,1,0) as is_intranet
                     ,sum(count),''
                from %(s_tmp_dwa_dns_down_stream_d2)s t2
           left join %(s_dim_std_intranet_ip)s t3 --内网IP表
                  on t2.analysis_address = t3.ip_network
               group by t2.login_name
                       ,t2.answer_code
                       ,if(t3.ip_network is not null,1,0)
     '''% vars()
    QueryExe(hsql,name,dates)


    #======================================================================
    #生成上线时间在前三天的访问数据
    hsql='''truncate table %(s_tmp_dwa_dns_down_stream_d2)s  '''% vars()
    QueryExe(hsql,name,dates)
    #循环
    # for n in range(0,12):
    hsql='''insert into table %(s_tmp_dwa_dns_down_stream_d2)s
          select
             t1.user_name AS login_name
             ,t2.answer_code
             ,split(t2.analysis_address, ';')[0] as analysis_address
             ,count(1)
           from %(s_tmp_dwa_dns_down_stream_d1)s t1 --在线记录 
            join %(s_dwd_dns_down_stream)s t2 --上行数据 (select query_time
              on t2.user_address = t1.client_ip_address 
              and t2.pt_time = %(ARG_OPTIME_LAST4DAY)s
           where substring(t1.acct_start_time,1,8) = %(ARG_OPTIME_LAST4DAY)s
             and t1.acct_start_time <= t2.query_time
             and t1.acct_stop_time >= t2.query_time
           group by t1.user_name
                   ,t2.answer_code
                   ,split(t2.analysis_address, ';')[0]
    '''% vars()
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(t_dwa_dns_down_stream_d)s partition(pt_time=%(ARG_OPTIME_LAST4DAY)s,etl_time=%(ARG_OPTIME_LASTDAY)s)
              select t2.login_name
                     ,t2.answer_code
                     ,if(t3.ip_network is not null,1,0) as is_intranet
                     ,sum(count),''
                from %(s_tmp_dwa_dns_down_stream_d2)s t2
           left join %(s_dim_std_intranet_ip)s t3 --内网IP表
                  on t2.analysis_address = t3.ip_network
               group by t2.login_name
                       ,t2.answer_code
                       ,if(t3.ip_network is not null,1,0)
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
