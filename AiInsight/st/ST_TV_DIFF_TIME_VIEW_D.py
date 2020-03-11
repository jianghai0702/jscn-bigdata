##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST各时段直播收视情况(日)
# Pay: ST_TV_DIFF_TIME_VIEW_D.py
# Purpose:
#
# Author:      liuzx
#
# Created:     2016-8-23
# Copyright:   (c) liuzx 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# wangxx 2018-12-06
# 直播数据原表从dwd_ter_service更换到dwd_ter_service
# 关联dim_std_organize,剔除分公司关联不上的数据
#

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
    s_dwa_tv_view_log                =    "dwa_tv_view_log"
    s_dim_std_times                    =     "dim_std_times"
    s_dim_std_organize               =     "dim_std_organize"

##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_tv_diff_time_view_d 				          =    "st_tv_diff_time_view_d"

##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================

# 生成分公司数据
    hsql=r'''
        insert overwrite table %(t_st_tv_diff_time_view_d)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
                    select
                        t1.tv_day as cycle_id,
                        t1.own_corp_std_org_code,
                        t3.std_org_name as  own_corp_std_org_name,
                        t2.std_times_code,
                        t2.std_times_name,
                        count(distinct t1.user_id) as tv_user_count,
                        round(SUM(unix_timestamp(least(t1.end_time,CAST(concat(CAST(CAST(t1.start_time AS DATE) AS string),' ',CAST(CAST(t2.max_value AS INT) AS string),':00:00') AS timestamp)))  - unix_timestamp(greatest(t1.start_time,CAST(concat(CAST(CAST(t1.start_time AS DATE) AS string),' ',CAST(CAST(t2.min_value AS INT) AS string),':00:00') AS timestamp))))/60,2) AS tv_time,
                        current_timestamp as etl_date
                     from %(s_dwa_tv_view_log)s t1,
                          %(s_dim_std_times)s t2
                     inner join %(s_dim_std_organize)s t3
                     on t1.own_corp_std_org_code = t3.std_org_code
                     where t1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
                           and HOUR(t1.start_time)<CAST(t2.max_value AS int)
                           and HOUR(t1.end_time)>=CAST(t2.min_value AS INT)
                           AND t1.tv_day BETWEEN '%(ARG_OPTIME_LASTMON01)s' AND '%(ARG_OPTIME_LASTMONEND)s'
                    group by t1.tv_day,t1.own_corp_std_org_code,t3.std_org_name,t2.std_times_code,t2.std_times_name
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 生成地市、省的数据
    
    hsql=r'''
        insert into table %(t_st_tv_diff_time_view_d)s partition (pt_mon='%(ARG_OPTIME_LAST1_M)s')
                    select t1.cycle_id, 
                             coalesce(t3.std_org_code,'10') as own_corp_std_org_code,
                             coalesce(t3.std_org_name,'江苏有线') as own_corp_std_org_name,
                             t1.std_times_code,
                             t1.std_times_name,
                             sum(t1.tv_user_count) as tv_user_count,
                             sum(t1.tv_time) as tv_time,
                             current_timestamp as etl_date
                    from %(t_st_tv_diff_time_view_d)s as t1
                             LEFT JOIN %(s_dim_std_organize)s as  t2
                             ON t1.own_corp_std_org_code = t2.std_org_code
                         LEFT JOIN %(s_dim_std_organize)s as t3
                             ON t3.std_org_code = t2.p_std_org_code
                   where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                    GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.std_times_code,t1.std_times_name
                    grouping sets ( (cycle_id,t3.std_org_code,t3.std_org_name,t1.std_times_code,t1.std_times_name) ,
                                           (cycle_id,t1.std_times_code,t1.std_times_name) )
        
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
