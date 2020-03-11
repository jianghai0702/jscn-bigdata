##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD网页浏览表
# Pay:DWD_WEB_BROWSE.py
# Purpose:
#
# Author:      lvdp
#
# Created:     11-08-2016
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
    s_stg_web_browse                =    "stg_web_browse"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_web_browse                =    "dwd_web_browse"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当天数据
    hsql='''insert overwrite table %(t_dwd_web_browse)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
              t1.TASK_ID,
              t1.TASK_NAME,
              t1.TASK_URL,
              t1.ERROR_DESC,
              t1.URL_REDIRECT,
              t1.DNS_QUERY_TIME,
              t1.TCP_CONNET_TIME,
              t1.SSL_HANDSHAKE_TIME,
              t1.CLIENT_REQUEST_TIME,
              t1.SERVER_RESPONSE_TIME,
              t1.REDIRECT_TIME,
              t1.BASIC_DOC_DOWNLOAD_TIME,
              t1.RENDER_TIME,
              t1.FIRST_PACKET_TIME,
              t1.BASIC_DOC_DOWNLOAD_SPEED,
              t1.RENDER_SPEED,
              t1.DOWNLOAD_SPEED,
              t1.BASIC_DOC_ACTUAL_BYTES,
              t1.BASIC_DOC_DOWNLOAD_BYTES,
              t1.MONITOR_DATE,
              t1.DOWNLOAD_BYTES,
              t1.DNS_RESOLUTION_COUNT,
              t1.TCP_CONNECT_COUNT,
              t1.PERFORMANCE,
              t1.TARGET_IP,
              t1.FIRST_SCREEN_TIME,
              t1.TARGET_CITY,
              t1.TARGET_OPERATOR,
              t1.MONITOR_CITY,
              t1.MONITOR_PROVINCE,
              t1.MONITOR_OPERATOR,
              t1.MONITOR_DNS,
              t1.MONITOR_BANDWIDTH,
              t1.MONITOR_TYPE,
              t1.MONITOR_IP,
              t1.MONITOR_CPU_USAGE,
              t1.MONITOR_MEMORY_USAGE,
              t1.CURRENT_AVG_SPEED,
              t1.MONITOR_PROCESSES,
              t1.INCREMENT_ID,
              t1.MAIN_ID,
              t1.USER_NAME,
              t1.BROWSER_BLOCK_TIME,
              t1.ROUNDTRIPS,
              t1.ELEMENT_ERROR_TAB,
              t1.AVG_DNS_QUERY_TIME,
              t1.AVG_TCP_CONNET_TIME,
              t1.AVG_SEND_REQUEST_TIME,
              t1.AVG_SERVER_RESPONSE_TIME,
              t1.AVG_DOWNLOAD_TIME,
              t1.AVG_SSL_HANDSHAKE_TIME,
              t1.PROJECTED_DNS_TIME,
              t1.PROJECTED_TCP_TIME,
              t1.PROJECTED_REQUEST_TIME,
              t1.PROJECTED_RESPONSE_TIME,
              t1.PROJECTED_DOWNLOAD_TIME,
              t1.PROJECTED_SSL_TIME,
              t1.CLIENT_ONLY_ID,
              t1.BLOCK_PROJECTED_TIME,
              t1.COMPLETE_DOC_TIME,
              t1.HEADER,
              t1.ERROR_SNAPSHOT,
              t1.SOURCE_CODE,
              t1.COUNTRY,
              t1.BROWSER_KERNEL,
              t1.RESOLUTION,
              t1.CPU_NAME,
              t1.CPU_FREQUENCY,
              t1.CPU_COUNT,
              t1.MEMORY_SIZE,
              t1.GRAPHICS,
              t1.CPU_CURVE,
              t1.MEMORY_CURVE,
              t1.REQUEST_HEADER,
              t1.ELE_LOADED_SUCCESS_COUNT,
              t1.ELE_REDIRECT_COUNT,
              t1.ELE_REQUEST_ERROR_COUNT,
              t1.ELE_SERVER_ERROR_COUNT,
              t1.ELE_UNCONNET_COUNT,
              t1.ONLOAD_TIME,
              t1.DOMREADY_TIME,
              t1.ONLOAD_URL,
              t1.FIRST_SCREEN_URL,
              t1.CYCLE_SCREENSHOT,
              t1.SCREEN_FULL_RENDER_TIME,
              t1.SCREEN_ELEMENT_COUNT,
              t1.FIRST_RENDER_TIME,
              t1.ELEMENT_HIJACK_COUNT,
              t1.DOMAIN_HIJACK_COUNT,
              t1.HIJACK_COUNT,
              t1.HIJACK_RATE,
              t1.TARGET_PROVINCE,
              t1.BROWSER_VERSION,
              t1.DATA_SOURCE_CD,
              %(ARG_OPTIME_LASTDAY)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_stg_web_browse)s t1
            where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
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
