#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  DWA_TVLIVE_DETAIL.py
# Purpose     :  收视行为详情
#
# Author      :  sunwj
#
# CreatedDate :  2019-06-26 10:09
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
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
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
    s_dwd_ter_service       =    "dwd_ter_service"
    s_dwd_config_channel    =    "dwd_config_channel"
    s_tmp_dwa_tvlive_detail =    "tmp_dwa_tvlive_detail"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_dwa_tvlive_detail       =    "dwa_tvlive_detail"
##===========================================================================
# 删除临时表
##===========================================================================
    hsql = '''drop table %(s_tmp_dwa_tvlive_detail)s ''' %vars()
    QueryExe(hsql, name, dates)
##创建临时表
##===========================================================================
    hsql = '''create table if not exists %(s_tmp_dwa_tvlive_detail)s  (
                 user_id                           String ,
                 cust_id                           String ,
                 sn                                String ,
                 OWN_CORP_STD_ORG_CODE             String ,
                 CHANNEL_NAME                      String ,
                 PROGRAM_NAM                       String ,
                 channel_begin_time                String ,
                 channel_end_time                  String ,
                 program_begintime                 String ,
                 program_endtime                   String ,
                 programName                       String
                 )
                 STORED AS RCFILE
                 LOCATION '%(tmp_path)s/%(s_tmp_dwa_tvlive_detail)s'
                ''' % vars()
    QueryExe(hsql, name, dates)

##===========================================================================
##数据处理
##===========================================================================
#生成数据
# 收视开始时间、结束时间在同一天的数据  匹配最早及最晚节目所有节目单
    hsql='''insert overwrite table %(s_tmp_dwa_tvlive_detail)s            
            select distinct T.*
            from 
              (
               select   t1.user_id
                       ,t1.cust_id
                       ,t1.sn
                       ,t1.OWN_CORP_STD_ORG_CODE
                       ,t1.CHANNEL_NAME
                       ,t1.PROGRAM_NAM
                       ,t1.UCENDTIME as  channel_begin_time
                       ,t1.TIME as channel_end_time
                       ,t2.begintime as program_begintime
                       ,t2.endtime as program_endtime
                       ,t2.programName
               from  dwd_ter_service t1
               left join DWD_CONFIG_CHANNEL t2
                 on trim(t1.CHANNEL_NAME)=trim(t2.channelname)
               and t2.pt_time='%(ARG_OPTIME_LASTDAY)s'
               where t1.pt_mon=substring(%(ARG_OPTIME_LASTDAY)s,1,6)
                 and t1.UCENDTIME < t1.TIME  -- 过滤掉结束时间小于开始时间的异常数据
                 and substring(t1.UCENDTIME, 1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                 and t2.programName is not null
                 and ( t1.TIME between  t2.begintime and t2.endtime
                       or t1.UCENDTIME between  t2.begintime and t2.endtime
                      ) -- 频道内的时间段与节目时间段相交 最早节目与最晚节目
                 union all
                 select t1.user_id
                       ,t1.cust_id
                       ,t1.sn
                       ,t1.OWN_CORP_STD_ORG_CODE
                       ,t1.CHANNEL_NAME
                       ,t1.PROGRAM_NAM
                       ,t1.UCENDTIME as  channel_begin_time
                       ,t1.TIME as channel_end_time
                       ,t2.begintime as program_begintime
                       ,t2.endtime as program_endtime
                       ,t2.programName
               from  dwd_ter_service t1
               left join DWD_CONFIG_CHANNEL t2
                 on trim(t1.CHANNEL_NAME)=trim(t2.channelname)
               and t2.pt_time='%(ARG_OPTIME_LASTDAY)s'
               where t1.pt_mon=substring(%(ARG_OPTIME_LASTDAY)s,1,6)
                 and t1.UCENDTIME < t1.TIME  -- 过滤掉结束时间小于开始时间的异常数据
                 and substring(t1.UCENDTIME, 1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                 and t2.programName is not null
                 and t2.begintime between t1.UCENDTIME and t1.TIME
                 and t2.endtime between t1.UCENDTIME and t1.TIME    -- 长时间停留在某频道时 跨越的所有节目
                ) T       
               '''% vars()
    QueryExe(hsql,name,dates)


# 收视处理
    hsql='''insert overwrite table %(t_dwa_tvlive_detail)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)            
            select  T.user_id
                   ,T.cust_id
                   ,T.sn
                   ,T.OWN_CORP_STD_ORG_CODE
                   ,T.CHANNEL_NAME
                   ,T.programName
                   ,T.start_time
                   ,T.end_time
            from 
            (select  user_id
                    ,cust_id
                    ,sn
                    ,OWN_CORP_STD_ORG_CODE
                    ,CHANNEL_NAME
                    ,programName
                    ,case when cast(channel_begin_time as string)  >= program_begintime then cast(channel_begin_time as string)
                          when cast(channel_begin_time as string)  < program_begintime  then program_begintime
                     end start_time
                    ,case when cast(channel_end_time as string)  >= program_endtime then  program_endtime
                          when cast(channel_end_time as string)  < program_endtime then  cast(channel_end_time as string)
                     end end_time
           from %(s_tmp_dwa_tvlive_detail)s 
           )  T                  
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