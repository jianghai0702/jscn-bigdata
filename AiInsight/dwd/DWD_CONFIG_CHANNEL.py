#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  DWD_CONFIG_CHANNEL.py
# Purpose     :  频道节目单处理(跨天数据)
#
# Author      :  sunwj
#
# CreatedDate :  2019-06-13 11:58
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------


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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径
##===========================================================================
##自定义变量声明---源表声明
##===========================================================================
    s_stg_config_channel        =    "stg_config_channel"
    s_stg_config_local_channel  =    "stg_config_local_channel"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_dwd_config_channel        =    "dwd_config_channel"
##===========================================================================
##创建临时表
##===========================================================================
#生成临时表数据
##===========================================================================
##数据处理
##===========================================================================
#生成数据

    hsql='''insert overwrite table %(t_dwd_config_channel)s partition(pt_time = %(ARG_OPTIME_LASTDAY)s)
           select distinct T.*
           from (
                  select  channelcode
                         ,channelname
                         ,createTime
                         ,eventid
                         ,programname
                         ,begintime
                         ,duration
                         ,endtime
                         ,eventtype
                         ,language
                         ,'0'
                  from %(s_stg_config_channel)s
                  where datediff(to_date(from_unixtime(UNIX_TIMESTAMP(begintime,'yyyy-MM-dd'))),
                        to_date(from_unixtime(UNIX_TIMESTAMP(endtime,'yyyy-MM-dd'))))=0
                   and pt_time = '%(ARG_OPTIME_LASTDAY)s'
                   and substring(begintime,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                   union all
                  select channelcode
                         ,channelname
                         ,createTime
                         ,eventid
                         ,programname
                         ,begintime
                         ,(unix_timestamp(substring(concat(to_date(from_unixtime(UNIX_TIMESTAMP(begintime,'yyyy-MM-dd'))),' 23:59:59'),0,19))
                          - unix_timestamp(substring(begintime,0,19))) as duration
                         ,concat(to_date(from_unixtime(UNIX_TIMESTAMP(begintime,'yyyy-MM-dd'))),' 23:59:59') as endtime
                         ,eventtype
                         ,language
                         ,'0'
                  from %(s_stg_config_channel)s
                  where datediff(to_date(from_unixtime(UNIX_TIMESTAMP(begintime,'yyyy-MM-dd'))),
                        to_date(from_unixtime(UNIX_TIMESTAMP(endtime,'yyyy-MM-dd'))))!=0
                   and pt_time = '%(ARG_OPTIME_LASTDAY)s'
                   and (substring(begintime,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                       or substring(endtime,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                       )
                  union all
                  select  channelcode
                         ,channelname
                         ,createTime
                         ,eventid
                         ,programname
                         ,concat(to_date(from_unixtime(UNIX_TIMESTAMP(endtime,'yyyy-MM-dd'))),' 00:00:00') as begintime
                         ,unix_timestamp(substring(endtime,1,19)) -
                          unix_timestamp(substring(concat(to_date(from_unixtime(UNIX_TIMESTAMP(endtime,'yyyy-MM-dd'))),' 00:00:00'),1,19))
                          as duration
                         ,endtime
                         ,eventtype
                         ,language
                         ,'0'
                  from %(s_stg_config_channel)s
                  where datediff(to_date(from_unixtime(UNIX_TIMESTAMP(begintime,'yyyy-MM-dd'))),
                        to_date(from_unixtime(UNIX_TIMESTAMP(endtime,'yyyy-MM-dd'))))!=0
                   and pt_time = '%(ARG_OPTIME_LASTDAY)s'
                   and (substring(begintime,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                       or substring(endtime,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                       )
                  ) T
            '''% vars()
    QueryExe(hsql,name,dates)

    # 处理本地频道
    hsql='''insert into table %(t_dwd_config_channel)s partition(pt_time = %(ARG_OPTIME_LASTDAY)s) 
            select ''
                   ,channelname
                   ,''
                   ,''
                   ,programname
                   ,concat(from_unixtime(unix_timestamp(tvday,'yyyymmdd'),'yyyy-mm-dd'),' ',begintime) as begintime
                   ,(unix_timestamp(concat(from_unixtime(unix_timestamp(tvday,'yyyymmdd'),'yyyy-mm-dd'),' ' ,endtime))
                     - unix_timestamp(concat(from_unixtime(unix_timestamp(tvday,'yyyymmdd'),'yyyy-mm-dd'),' ',begintime)
                     )) as duration
                   ,concat(from_unixtime(unix_timestamp(tvday,'yyyymmdd'),'yyyy-mm-dd'),' ' ,endtime)  as endtime
                   ,''
                   ,''
                   ,'1'
            from %(s_stg_config_local_channel)s
            where  pt_time = '%(ARG_OPTIME_LASTDAY)s'
            '''% vars()
    QueryExe(hsql,name,dates)


##======================================================================================================================
##删除临时表
##======================================================================================================================

##======================================================================================================================
##程序结束
##======================================================================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)