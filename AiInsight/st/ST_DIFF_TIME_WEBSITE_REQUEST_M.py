#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST各时段各网站类别的请求次数统计(月)
# Pay:ST_DIFF_TIME_WEBSITE_REQUEST_M.py
# Purpose:
#
# Author:      chens
#
# Created:     18-08-2016
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
    s_dwd_uplink_data                         =    "dwd_uplink_data"
    s_dim_std_times                           =    "dim_std_times"
    s_temp_st_diff_time_website_request_m1    =    "temp_st_diff_time_website_request_m1"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_diff_time_website_request_m                =    "st_diff_time_website_request_m"      
##===========================================================================       
##创建临时表                                                        
##===========================================================================
    hsql='''create table if not exists %(s_temp_st_diff_time_website_request_m1)s
            (
              std_times_code         string,
              std_website_cate_code  string,
              std_website_cate_name  string,
              requests_count         int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_diff_time_website_request_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
    hsql='''insert overwrite table %(s_temp_st_diff_time_website_request_m1)s
            select
              case when hour(from_unixtime(cast(t1.access_time as int)))=0 then 0
                   when hour(from_unixtime(cast(t1.access_time as int)))=1 then 1
                   when hour(from_unixtime(cast(t1.access_time as int)))=2 then 2
                   when hour(from_unixtime(cast(t1.access_time as int)))=3 then 3
                   when hour(from_unixtime(cast(t1.access_time as int)))=4 then 4
                   when hour(from_unixtime(cast(t1.access_time as int)))=5 then 5
                   when hour(from_unixtime(cast(t1.access_time as int)))=6 then 6
                   when hour(from_unixtime(cast(t1.access_time as int)))=7 then 7
                   when hour(from_unixtime(cast(t1.access_time as int)))=8 then 8
                   when hour(from_unixtime(cast(t1.access_time as int)))=9 then 9
                   when hour(from_unixtime(cast(t1.access_time as int)))=10 then 10
                   when hour(from_unixtime(cast(t1.access_time as int)))=11 then 11
                   when hour(from_unixtime(cast(t1.access_time as int)))=12 then 12
                   when hour(from_unixtime(cast(t1.access_time as int)))=13 then 13
                   when hour(from_unixtime(cast(t1.access_time as int)))=14 then 14
                   when hour(from_unixtime(cast(t1.access_time as int)))=15 then 15
                   when hour(from_unixtime(cast(t1.access_time as int)))=16 then 16
                   when hour(from_unixtime(cast(t1.access_time as int)))=17 then 17
                   when hour(from_unixtime(cast(t1.access_time as int)))=18 then 18
                   when hour(from_unixtime(cast(t1.access_time as int)))=19 then 19
                   when hour(from_unixtime(cast(t1.access_time as int)))=20 then 20
                   when hour(from_unixtime(cast(t1.access_time as int)))=21 then 21
                   when hour(from_unixtime(cast(t1.access_time as int)))=22 then 22
                   when hour(from_unixtime(cast(t1.access_time as int)))=23 then 23
              else '' end std_times_code,
              '' std_website_cate_code,
              '' std_website_cate_name,
              count(1) requests_count
            from %(s_dwd_uplink_data)s t1
           where substr(t1.pt_time,1,6) = %(ARG_OPTIME_LAST1_M)s
           group by case when hour(from_unixtime(cast(t1.access_time as int)))=0 then 0
                   when hour(from_unixtime(cast(t1.access_time as int)))=1 then 1
                   when hour(from_unixtime(cast(t1.access_time as int)))=2 then 2
                   when hour(from_unixtime(cast(t1.access_time as int)))=3 then 3
                   when hour(from_unixtime(cast(t1.access_time as int)))=4 then 4
                   when hour(from_unixtime(cast(t1.access_time as int)))=5 then 5
                   when hour(from_unixtime(cast(t1.access_time as int)))=6 then 6
                   when hour(from_unixtime(cast(t1.access_time as int)))=7 then 7
                   when hour(from_unixtime(cast(t1.access_time as int)))=8 then 8
                   when hour(from_unixtime(cast(t1.access_time as int)))=9 then 9
                   when hour(from_unixtime(cast(t1.access_time as int)))=10 then 10
                   when hour(from_unixtime(cast(t1.access_time as int)))=11 then 11
                   when hour(from_unixtime(cast(t1.access_time as int)))=12 then 12
                   when hour(from_unixtime(cast(t1.access_time as int)))=13 then 13
                   when hour(from_unixtime(cast(t1.access_time as int)))=14 then 14
                   when hour(from_unixtime(cast(t1.access_time as int)))=15 then 15
                   when hour(from_unixtime(cast(t1.access_time as int)))=16 then 16
                   when hour(from_unixtime(cast(t1.access_time as int)))=17 then 17
                   when hour(from_unixtime(cast(t1.access_time as int)))=18 then 18
                   when hour(from_unixtime(cast(t1.access_time as int)))=19 then 19
                   when hour(from_unixtime(cast(t1.access_time as int)))=20 then 20
                   when hour(from_unixtime(cast(t1.access_time as int)))=21 then 21
                   when hour(from_unixtime(cast(t1.access_time as int)))=22 then 22
                   when hour(from_unixtime(cast(t1.access_time as int)))=23 then 23
              else '' end
          '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当天的记录；
    hsql='''insert overwrite table %(t_st_diff_time_website_request_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              %(ARG_OPTIME_LAST1_M)s cycle_id,
              t1.std_times_code,
              t2.std_times_name,
              t1.std_website_cate_code,
              t1.std_website_cate_name,
              t1.requests_count,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_st_diff_time_website_request_m1)s t1
            left outer join %(s_dim_std_times)s t2 on t1.std_times_code=t2.std_times_code
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_st_diff_time_website_request_m1)s''' %vars()
#    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
