##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM标准网址库
# Pay: DIM_STD_URL.py
# Purpose:
#
# Author:      yanal
#
# Created:     2016-8-27
# Copyright:   (c) yanal 2016
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
    s_stg_url_type                     =    "stg_url_type"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_temp_dim_std_url               =    "temp_dim_std_url"
    t_dim_std_url               =    "dim_std_url"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
    hsql='''CREATE TABLE  if not exists %(t_temp_dim_std_url)s
            (     
                url             STRING,
                title           STRING,
                URL_TYPE        STRING
            )
            STORED AS TEXTFILE
            LOCATION '%(tmp_path)s/%(t_temp_dim_std_url)s'
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================       
##数据处理                                                       
##===========================================================================   
#生成临时表数据
    hsql='''insert overwrite table %(t_temp_dim_std_url)s            
            select
            split(split(t1.url,'://')[1],'/')[0] url ,
            t1.title ,
            t1.type
            from %(s_stg_url_type)s t1
            where t1.pt_time = %(ARG_OPTIME_LASTDAY)s
            '''% vars()
    QueryExe(hsql,name,dates)
    

#生成目标表数据,插入同一个url只有一条的这种数据
    hsql='''insert into table %(t_dim_std_url)s            
            select
            t1.url STD_URL_CODE         ,
            t1.title STD_URL_NAME         ,
            t1.URL                  ,
            t1.URL_TYPE             ,
            '' NOTES                ,
            1 IS_DISPLAY           ,
            '' DISPLAY_ORDER        ,
            1 IS_VALID             ,
            from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') UPDATE_DATE
            from %(t_temp_dim_std_url)s t1
            left join (select url,count(1) cnt from %(t_temp_dim_std_url)s  group by url) t2 on t1.url=t2.url
            left join %(t_dim_std_url)s t3 on t1.url=t3.url 
            where t2.cnt=1 and t3.std_url_code is null
            '''% vars()
    QueryExe(hsql,name,dates)
    
#生成目标表数据,插入同一个url有多条的这种数据
    hsql='''insert into table %(t_dim_std_url)s            
            select
            distinct
            t1.url STD_URL_CODE         ,
            '' STD_URL_NAME         ,
            t1.URL                  ,
            t1.URL_TYPE             ,
            '' NOTES                ,
            1 IS_DISPLAY           ,
            '' DISPLAY_ORDER        ,
            1 IS_VALID             ,
            from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') UPDATE_DATE
            from %(t_temp_dim_std_url)s t1
            left join (select url
                             ,count(1) cnt 
                             ,count(distinct url_type) type_cnt
                       from %(t_temp_dim_std_url)s 
                       group by url
                       ) t2 on t1.url=t2.url
            left join %(t_dim_std_url)s t3 on t1.url=t3.url 
            where t2.cnt>1 and t2.type_cnt = 1 and t3.std_url_code is null
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

