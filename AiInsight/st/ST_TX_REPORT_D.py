##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST宽带伴侣报表(日)
# Pay: ST_TX_REPORT_D.py
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
    s_dwd_user_play_records    =    "dwd_user_play_records"
    s_dwd_probe_setup_log      =    "dwd_probe_setup_log"
    s_dwd_visqual_probes       =    "dwd_visqual_probes"
    s_st_tx_report_d1          =    "s_st_tx_report_d1"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_st_tx_report_d     =    "st_tx_report_d"
##===========================================================================
##创建临时表
##===========================================================================
#用来存放中间结果数据，当天用户登录次数
    hsql='''create table if not exists %(s_st_tx_report_d1)s
            (
                owner_id    string,
                login_count int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_st_tx_report_d1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成用户当天登录次数
    hsql='''insert overwrite table %(s_st_tx_report_d1)s
            select t1.row_id
                   ,t1.online_times - nvl(t2.online_times,0) login_count
            from %(s_dwd_visqual_probes)s t1
            left join %(s_dwd_visqual_probes)s t2
              on t1.row_id = t2.row_id
             and t2.pt_time = %(ARG_OPTIME_LAST2DAY)s
           where t1.pt_time = %(ARG_OPTIME_LASTDAY)s
            '''% vars()
    QueryExe(hsql,name,dates)


#生成目标表数据
    hsql='''insert overwrite table %(t_st_tx_report_d)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
              %(ARG_OPTIME_LASTDAY)s cycle_id,
              t2.total_user_count, --总用户数
              t2.new_user_count, --新用户数
              t3.active_user_count, --活跃用户数
              t1.play_count, --播放次数
              case when t2.total_user_count = 0 then 0 else round(t3.active_user_count/t2.total_user_count*100,2) end as active_rate, --活跃度
              case when t1.play_user_count1 = 0 then 0 else round(t1.play_count/t1.play_user_count1,2) end avg_play_count, --人均点播次数
              case when t1.play_user_count2 = 0 then 0 else round(t1.vtime/t1.play_user_count2,2) end avg_duration, --人均点播时长
              case when t3.active_user_count = 0 then 0 else round(t1.play_count/t3.active_user_count*100,2) end play_active_rate, --播放活跃比
              t3.twice_activated_count, --二次激活用户
              case when t2.new_user_count = 0 then 0 else round(t3.twice_activated_count/t2.new_user_count*100,2) end twice_activated_rate, --二次激活率
              t1.play_user_count1 play_user_count, --播放用户数
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from
                (select count(t1.row_id) play_count, --播放次数
                        round(sum(t1.vtime)/10000/60,2) vtime,--播放时长
                        count(distinct t1.setup_id) play_user_count1, --播放用户数
                        count(distinct case when t1.vtime <> 0 then t1.setup_id else null end) play_user_count2 --播放用户数（不含点播时长为0的）
                   from %(s_dwd_user_play_records)s t1--点播
                 where t1.pt_time = %(ARG_OPTIME_LASTDAY)s
                   and substr(t1.create_time,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s'
                ) t1,
                (select count(1) total_user_count, --总用户数
                        sum(case when substr(t2.setup_time,1,10) = '%(ARG_OPTIME_LASTDAY_ISO)s' then 1 else 0 end)new_user_count --新用户数
                   from %(s_dwd_probe_setup_log)s t2--用户
                   where t2.pt_time = %(ARG_OPTIME_LASTDAY)s
                ) t2,
                (select count(distinct case when t3.login_count>0 then t3.owner_id else null end) active_user_count, --活跃用户数
                        count(distinct case when t3.login_count>1 then t3.owner_id else null end) twice_activated_count --二次激活用户数
                   from %(s_st_tx_report_d1)s t3--登录
                ) t3
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
