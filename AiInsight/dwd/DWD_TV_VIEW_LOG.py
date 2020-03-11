##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD电视收视日志表
# Pay:DWD_TV_VIEW_LOG.py
# Purpose:
#
# Author:      lvdp
#
# Created:     11-08-2016
# Copyright:   (c) lvdp 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# liuyf7 20170514 增加另一种收视日志处理逻辑
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
    s_stg_tv_view_log                =    "stg_tv_view_log"
    s_stg_tv_pb_power_onoff          =    "stg_tv_pb_power_onoff"
    s_stg_tv_am_channel_info         =    "stg_tv_am_channel_info"
    s_dim_std_organize               =    "dim_std_organize"
    s_dim_std_channel_rule           =    "dim_std_channel_rule"
    s_tmp_dwd_tv_view_log1           =    "tmp_dwd_tv_view_log1"
    s_tmp_dwd_tv_view_log2           =    "tmp_dwd_tv_view_log2"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_tv_view_log                =    "dwd_tv_view_log"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放中间结果数据，当日数据
    hsql='''create table if not exists %(s_tmp_dwd_tv_view_log1)s
            (
              MAC_ADDR   string,
              CREATE_TIME string,
              CHANNEL_NAME  string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_tmp_dwd_tv_view_log1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
#用来存放中间结果数据，当日数据
    hsql='''create table if not exists %(s_tmp_dwd_tv_view_log2)s
            (
              MAC_ADDR   string,
              CREATE_TIME string,
              CHANNEL_NAME  string,
              rn int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_tmp_dwd_tv_view_log2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当天数据
#排除 持续时间大于3小时的记录
#清洗数据，将日志中event_type = '广播频道'的记录的频道名称event_desc转换为标准的频道名称
    hsql='''insert overwrite table %(t_dwd_tv_view_log)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
              t1.data_type_id,
              t1.serial_id,
              t1.begin_time,
              from_unixtime(cast(t1.duration + unix_timestamp(t1.begin_time) as int),'yyyy-MM-dd HH:mm:ss'),
              t1.event_type,
              case when t1.event_type = '广播频道' and t2.channel_name is not null then t2.std_channel_name
                   when t1.event_type = '广播频道' and t2.channel_name is null then regexp_replace(t1.event_desc,'#','')
                   else t1.event_desc end event_desc,
              t1.duration,
              t1.data_source_cd,
              %(ARG_OPTIME_LASTDAY)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date,
              t3.std_org_code own_corp_std_org_code
            from %(s_stg_tv_view_log)s t1
            left outer join %(s_dim_std_channel_rule)s t2 on regexp_replace(t1.event_desc,'#','')=t2.channel_name
            left join %(s_dim_std_organize)s t3 on t1.corp_code = t3.notes
            where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
                  and to_date(t1.begin_time)='%(ARG_OPTIME_LASTDAY_ISO)s'
                  and t1.duration<=10800
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================
    
#生成 当天数据
#排除 持续时间大于3小时的记录
#增加另一种收视日志处理逻辑
    #把换台日志和开关机日志合并
    hsql='''insert overwrite table %(s_tmp_dwd_tv_view_log1)s
            select MAC_ADDR
                   ,CREATE_TIME
                   ,case when OP_TYPE = 0 then '开机'
                         when OP_TYPE = 1 then '关机'
                         when OP_TYPE = 2 then '待机'
                         else '待机' end 
            from %(s_stg_tv_pb_power_onoff)s t1
            where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
              and to_date(t1.CREATE_TIME)='%(ARG_OPTIME_LASTDAY_ISO)s'
            '''% vars()
    QueryExe(hsql,name,dates)
    hsql='''insert into %(s_tmp_dwd_tv_view_log1)s
            select MAC_ADDR
                   ,CREATE_TIME
                   ,CHANNEL_NAME
            from %(s_stg_tv_am_channel_info)s t1
            where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
              and to_date(t1.CREATE_TIME)='%(ARG_OPTIME_LASTDAY_ISO)s'
            '''% vars()
    QueryExe(hsql,name,dates)
    
    #把换台日志和开关机日志按时间顺序排序
    hsql='''insert overwrite table %(s_tmp_dwd_tv_view_log2)s
            select MAC_ADDR
                   ,CREATE_TIME
                   ,CHANNEL_NAME
                   ,row_number()over(partition by MAC_ADDR order by CREATE_TIME)
            from %(s_tmp_dwd_tv_view_log1)s t1
            '''% vars()
    QueryExe(hsql,name,dates)
    
    
    hsql='''insert into  %(t_dwd_tv_view_log)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
              '',
              t1.MAC_ADDR,
              t1.CREATE_TIME,--开始时间
              t2.CREATE_TIME,--结束时间
              '',
              t3.STD_CHANNEL_NAME,--频道
              unix_timestamp(t2.CREATE_TIME)-unix_timestamp(t1.CREATE_TIME),--持续时间（秒）
              'TV',
              %(ARG_OPTIME_LASTDAY)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date,
              '' own_corp_std_org_code
            from %(s_tmp_dwd_tv_view_log2)s t1
            left outer join %(s_tmp_dwd_tv_view_log2)s t2 on t1.MAC_ADDR=t2.MAC_ADDR and t1.rn=t2.rn-1
            left outer join %(s_dim_std_channel_rule)s t3 on t1.channel_name=t3.channel_name

            where unix_timestamp(t2.CREATE_TIME)-unix_timestamp(t1.CREATE_TIME)<=10800
              and t1.CHANNEL_NAME not in('开机','关机','待机')
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
