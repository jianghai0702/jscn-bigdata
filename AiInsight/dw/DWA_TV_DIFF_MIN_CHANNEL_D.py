##!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA直播各分钟各频道收视统计(日)
# Pay:DWA_TV_DIFF_MIN_CHANNEL_D.py
# Purpose:
#
# Author:       wangxx
#
# Created:     12-08-2018
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------
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
    s_dwa_tv_view_log                        =    "dwa_tv_view_log"
    s_dim_std_organize                      =    "dim_std_organize"
    s_dim_std_minute                         =    "dim_std_minute"
    s_dim_std_series                          =    "dim_std_series"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_tv_diff_min_channel_d    =    "dwa_tv_diff_min_channel_d"      
##===========================================================================       
##创建临时表                                                        
##===========================================================================
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================



##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当月的记录；
#由于收视日志表中的频道名称和dim频道表中的频道名称不能统一，故暂时不关联dim表取频道编码

    hsql='''insert overwrite table %(t_dwa_tv_diff_min_channel_d)s partition(pt_mon='%(ARG_OPTIME_LAST1_M)s')
            select
                t1.tv_day as cycle_id,
                t1.own_corp_std_org_code,
                t3.std_org_name as  own_corp_std_org_name,
                t2.std_minute_code,
                t2.std_minute_name,
                null as std_channel_code,
                t1.CHANNEL_NAME as std_channel_name,
                count(distinct t1.user_id) as tv_user_count,
                round(sum(case when substr(cast(t1.start_time as string),12,5)=t2.std_minute_name and substr(cast(t1.end_time as string),12,5)=t2.std_minute_name then second(t1.end_time)-second(t1.start_time)
                               when substr(cast(t1.start_time as string),12,5)=t2.std_minute_name and substr(cast(t1.end_time as string),12,5)>t2.std_minute_name then 60-second(t1.start_time)
                               when substr(cast(t1.start_time as string),12,5)<t2.std_minute_name and substr(cast(t1.end_time as string),12,5)=t2.std_minute_name then second(t1.end_time)
                               else 60 end)/60,2)  as tv_time,
                    current_timestamp as etl_date
             from %(s_dim_std_minute)s t2,%(s_dwa_tv_view_log)s t1                  
             inner join %(s_dim_std_organize)s t3
             on t1.own_corp_std_org_code = t3.std_org_code
             where t1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
                   and  cast(t2.std_minute_code as int) - 1  between hour(t1.start_time) * 60 + minute(t1.start_time) and hour(t1.end_time) * 60 + minute(t1.end_time)
                   AND t1.pt_time BETWEEN '%(ARG_OPTIME_LASTMON01)s' AND '%(ARG_OPTIME_LASTMONEND)s'
                  AND t3.p_std_org_code IN ('1007')                   
            group by t1.tv_day,t1.own_corp_std_org_code,t3.std_org_name,t2.std_minute_code,t2.std_minute_name,t1.channel_name
          '''% vars()    
    QueryExe(hsql,name,dates)



    # # 上面属于精确是算法，但是由于数据量问题，或者Hive对于这种非等于join的处理效率问题，结果跑不出来。所以采取下面这种粗略一点的近视算法，不计算分钟一下的秒数，只算分钟数。
    # hsql='''insert overwrite table %(t_dwa_tv_diff_min_channel_d)s partition(pt_mon='%(ARG_OPTIME_LAST1_M)s')
    #         select
    #             t1.tv_day as cycle_id,
    #             t1.own_corp_std_org_code,
    #             t3.std_org_name as  own_corp_std_org_name,
    #             t4.std_minute_code,
    #             t4.std_minute_name,
    #             null as std_channel_code,
    #             t1.CHANNEL_NAME as std_channel_name,
    #             count(distinct t1.user_id) as tv_user_count,
    #             round(sum(case when substr(cast(t1.start_time as string),12,5)=t4.std_minute_name and substr(cast(t1.end_time as string),12,5)=t4.std_minute_name then second(t1.end_time)-second(t1.start_time)
    #                            when substr(cast(t1.start_time as string),12,5)=t4.std_minute_name and substr(cast(t1.end_time as string),12,5)>t4.std_minute_name then 60-second(t1.start_time)
    #                            when substr(cast(t1.start_time as string),12,5)<t4.std_minute_name and substr(cast(t1.end_time as string),12,5)=t4.std_minute_name then second(t1.end_time)
    #                            else 60 end)/60,2)  as tv_time,
    #                 current_timestamp as etl_date
    #          from  %(s_dim_std_series)s t2, %(s_dwa_tv_view_log)s t1 
    #          inner join %(s_dim_std_organize)s t3
    #          on t1.own_corp_std_org_code = t3.std_org_code
    #          inner join %(s_dim_std_minute)s t4 on hour(t1.start_time) * 60 + minute(t1.start_time) + t2.nbr = cast(t4.std_minute_code as int)
    #          where t1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
    #             and round(t1.duration/60) > t2.nbr  -- 根据收视分钟数，把记录划分为几个标准分钟
    #             and t2.nbr < 180 --  收视时长超过3小时的算异常数据，不做统计
    #             AND t1.pt_time BETWEEN '%(ARG_OPTIME_LASTMON01)s' AND '%(ARG_OPTIME_LASTMONEND)s'
    #         group by t1.tv_day,t1.own_corp_std_org_code,t3.std_org_name,t4.std_minute_code,t4.std_minute_name,t1.channel_name
    #       '''% vars()    
    # QueryExe(hsql,name,dates)

# 向上钻取汇总到地市、省
    hsql='''insert into table %(t_dwa_tv_diff_min_channel_d)s partition (pt_mon='%(ARG_OPTIME_LAST1_M)s')
            select t1.cycle_id, 
                     coalesce(t3.std_org_code,'10') as own_corp_std_org_code,
                     coalesce(t3.std_org_name,'江苏有线') as own_corp_std_org_name,
                     t1.std_minute_code,
                     t1.std_minute_name,
                     t1.std_channel_code,
                     t1.std_channel_name,
                     sum(t1.tv_user_count) as tv_user_count,
                     sum(t1.tv_time) as tv_time,
                     current_timestamp as etl_date
            from %(t_dwa_tv_diff_min_channel_d)s as t1
                     LEFT JOIN %(s_dim_std_organize)s as  t2
                     ON t1.own_corp_std_org_code = t2.std_org_code
                 LEFT JOIN %(s_dim_std_organize)s as t3
                     ON t3.std_org_code = t2.p_std_org_code
           where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
            GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name  
            grouping sets ( (cycle_id,t3.std_org_code,t3.std_org_name,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name) ,
                                   (cycle_id,t1.std_minute_code,t1.std_minute_name,t1.std_channel_code,t1.std_channel_name) )

    ''' % vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_dwa_tv_diff_min_channel_d_tmp)s''' %vars()
#    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
