##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD(dns)上行数据
# Pay:DWD_DNS_UP_STREAM.py
# Purpose:
#
# Author:      zhangzc
#
# Created:     16-08-2017
# Copyright:   (c) zhangzc 2016
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
#?时间参数引入
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_dns_updown               =    "stg_dns_updown"
    s_tmp_dwd_dns_up_stream        =    "tmp_dwd_dns_up_stream"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_dns_up_stream               =    "dwd_dns_up_stream"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
# 上行流量数据统计临时表
    hsql='''create table if not exists %(s_tmp_dwd_dns_up_stream)s  (
        upcount   int
    )
    partitioned by (pt_time string)
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_tmp_dwd_dns_up_stream)s'
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================       
##数据处理
# 修改日志：201907 由于集群空间及内存问题 改成for循环 sunwj
#     for hour in range(24):
#         if hour<10:
#             hour = '0'+str(hour)
#生成 当天数据
    hsql='''insert overwrite table %(t_dwd_dns_up_stream)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s,pt_hour)
            select
               user_address as req_ans_flag ,
               service_address as source_adress ,
               analysis_address as service_address ,
               user_port   as domain_name ,
               domain_name  as  visit_time,
               pt_hour
            from %(s_stg_dns_updown)s t1
            where t1.user_address = 'query'
            and t1.pt_time=%(ARG_OPTIME_LASTDAY)s
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================

##===========================================================================
    hsql='''insert overwrite table %(s_tmp_dwd_dns_up_stream)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
            count(*) as upcount
            from %(t_dwd_dns_up_stream)s
            where pt_time=%(ARG_OPTIME_LASTDAY)s
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================

##===========================================================================       
##删除临时表                                               
##===========================================================================

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)


