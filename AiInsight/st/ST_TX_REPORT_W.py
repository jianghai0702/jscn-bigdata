##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST宽带伴侣报表(周)
# Pay: ST_TX_REPORT_W.py
# Purpose:
#
# Author:      liuyf7
#
# Created:     2016-9-14
# Copyright:   (c) liuyf7 2016
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
    ARG_OPTIME_LAST2DAY       = dicts['ARG_OPTIME_LAST2DAY']          #获得传入的数据日期的两天前yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2DAY_ISO   = dicts['ARG_OPTIME_LAST2DAY_ISO']      #获得传入的数据日期的两天前yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST7DAY       = dicts['ARG_OPTIME_LAST7DAY']          #获得传入的数据日期的7天前yyyymmdd格式的数据日期
    ARG_OPTIME_LAST7DAY_ISO   = dicts['ARG_OPTIME_LAST7DAY_ISO']      #获得传入的数据日期的7天前yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST14DAY      = dicts['ARG_OPTIME_LAST14DAY']         #获得传入的数据日期的14天前yyyymmdd格式的数据日期
    ARG_OPTIME_LAST14DAY_ISO  = dicts['ARG_OPTIME_LAST14DAY_ISO']     #获得传入的数据日期的14天前yyyy-mm-dd格式的数据日期
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            # 获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================
    s_dwd_probe_setup_log      =    "dwd_probe_setup_log"
    s_dwd_visqual_probes       =    "dwd_visqual_probes"
    s_st_tx_report_d           =    "st_tx_report_d"
    s_st_tx_report_w1          =    "s_st_tx_report_w1"
    s_st_tx_report_w2          =    "s_st_tx_report_w2"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_st_tx_report_w     =    "st_tx_report_w"
##===========================================================================
##创建临时表
##===========================================================================
#用来存放中间结果数据，本周用户登录次数
    hsql='''create table if not exists %(s_st_tx_report_w1)s
            (
                owner_id    string,
                login_count int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_st_tx_report_w1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
#用来存放中间结果数据，上周用户登录次数
    hsql='''create table if not exists %(s_st_tx_report_w2)s
            (
                owner_id    string,
                login_count int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_st_tx_report_w2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成用户本周登录次数
    hsql='''insert overwrite table %(s_st_tx_report_w1)s
            select t1.owner_id
                   ,t1.online_times - nvl(t2.online_times,0) login_count
            from %(s_dwd_visqual_probes)s t1
            left join %(s_dwd_visqual_probes)s t2
              on t1.owner_id = t2.owner_id
             and t2.pt_time = %(ARG_OPTIME_LAST7DAY)s
           where t1.pt_time = %(ARG_OPTIME_LASTDAY)s
            '''% vars()
    QueryExe(hsql,name,dates)
#生成用户上周登录次数
    hsql='''insert overwrite table %(s_st_tx_report_w2)s
            select t1.owner_id
                   ,t1.online_times - nvl(t2.online_times,0) login_count
            from %(s_dwd_visqual_probes)s t1
            left join %(s_dwd_visqual_probes)s t2
              on t1.owner_id = t2.owner_id
             and t2.pt_time = %(ARG_OPTIME_LAST14DAY)s
           where t1.pt_time = %(ARG_OPTIME_LAST7DAY)s
            '''% vars()
    QueryExe(hsql,name,dates)


#生成目标表数据
    hsql='''insert overwrite table %(t_st_tx_report_w)s partition(pt_week=%(ARG_OPTIME_LASTDAY)s)
            select
              %(ARG_OPTIME_LASTDAY)s cycle_id,
              active_user_count, --周活跃用户
              case when total_user_count = 0 then 0 else round(active_user_count/total_user_count*100,2) end as active_rate, --周活跃度
              case when active_user_count = 0 then 0 else round(active_user_count2/active_user_count*100,2) end as active_user_loss_rate, --周活跃用户流失率
              avg_active_rate, --周均日活跃度
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from(
             select count(t2.row_id) total_user_count, --总用户数
                    max(t3.active_user_count) active_user_count, --活跃用户数
                    max(t3.active_user_count2) active_user_count2, --上周活跃，且本周不活跃用户数
                    round(sum(t1.active_rate)/7*100,2) avg_active_rate --周均日活跃度
               from %(s_st_tx_report_d)s t1 --日活跃
                   ,%(s_dwd_probe_setup_log)s t2 --用户
                   ,(select count(distinct case when a.login_count>0 then a.owner_id else null end) active_user_count
                            ,count(distinct case when a.login_count=0 and b.login_count>0 then a.owner_id else null end) active_user_count2
                       from %(s_st_tx_report_w1)s a
                       left join %(s_st_tx_report_w2)s b
                         on a.owner_id = b.owner_id) t3 --登录
               where t2.pt_time = %(ARG_OPTIME_LASTDAY)s
                 and t1.pt_time >= %(ARG_OPTIME_LASTDAY)s
                 and t1.pt_time <= %(ARG_OPTIME_LAST7DAY)s
            ) t
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
