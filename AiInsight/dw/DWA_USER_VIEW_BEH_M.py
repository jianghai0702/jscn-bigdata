##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户收视行为标签月表
# Pay:DWA_USER_VIEW_BEH_M.py
# Purpose:
#
# Author:      taodn
#
# Created:     27-08-2017
# Copyright:   (c) taodn 2017
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']         
    #获得传入的数据日期的前一天所在月份3个月前的yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的前一天所在月份4个月前yyyy-mm格式的数据日期
    ARG_OPTIME_LAST4_M        = dicts['ARG_OPTIME_LAST4_M']          #获得传入的数据日期的前一天所在月份6个月前yyyy-mm格式的数据日期
    ARG_OPTIME_LAST6_M        = dicts['ARG_OPTIME_LAST6_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_user_view_m                      =    "dwa_user_view_m" 
    s_dwa_user_review_channel_m            =    "dwa_user_review_channel_m"
    s_dwa_user_tv_channel_m                =    "dwa_user_tv_channel_m"
    s_dwa_user_review_time_m               =    "dwa_user_review_time_m"
    s_dwa_user_vod_time_m                  =    "dwa_user_vod_time_m"
    s_dwa_user_tv_time_m                   =    "dwa_user_tv_time_m"
    s_dwd_fact_ins_prod                    =    "dwd_fact_ins_prod"
    s_dwa_cust_feat_dtl_m                  =    "dwa_cust_feat_dtl_m"
    
    s_temp_dwa_user_view_beh_m00           =    "temp_dwa_user_view_beh_m00"
    s_temp_dwa_user_view_beh_m0            =    "temp_dwa_user_view_beh_m0"
    s_temp_dwa_user_view_beh_m1            =    "temp_dwa_user_view_beh_m1"
    s_temp_dwa_user_view_beh_m2            =    "temp_dwa_user_view_beh_m2"
    s_temp_dwa_user_view_beh_m3            =    "temp_dwa_user_view_beh_m3"
    s_temp_dwa_user_view_beh_m4            =    "temp_dwa_user_view_beh_m4"
    s_temp_dwa_user_view_beh_m5            =    "temp_dwa_user_view_beh_m5"
    s_temp_dwa_user_view_beh_m6            =    "temp_dwa_user_view_beh_m6"
    s_temp_dwa_user_view_beh_m7            =    "temp_dwa_user_view_beh_m7"
    s_temp_dwa_user_view_beh_m8            =    "temp_dwa_user_view_beh_m8"
    s_temp_dwa_user_view_beh_m9            =    "temp_dwa_user_view_beh_m9"
    s_temp_dwa_user_view_beh_m10           =    "temp_dwa_user_view_beh_m10"
    s_temp_dwa_user_view_beh_m11           =    "temp_dwa_user_view_beh_m11"
    s_temp_dwa_user_view_beh_m12           =    "temp_dwa_user_view_beh_m12"
    s_temp_dwa_user_view_beh_m13           =    "temp_dwa_user_view_beh_m13"
    s_temp_dwa_user_view_beh_m14           =    "temp_dwa_user_view_beh_m14"
    s_temp_dwa_user_view_beh_m15           =    "temp_dwa_user_view_beh_m15"
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_DWA_USER_VIEW_BEH_M               =    "DWA_USER_VIEW_BEH_M"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================


##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m00)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m0)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m1)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m2)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m3)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m4)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m5)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m6)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m7)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m8)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m9)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m10)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m11)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m12)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m13)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m14)s
            '''% vars()    
    QueryExe(hsql,name,dates)
    
    hsql='''drop table if exists %(s_temp_dwa_user_view_beh_m15)s
            '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 上三月数据 回看、点播、直播次数、时长、天数
 
    # hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m00)s   as      
    #           select
    #           PROD_INST_ID,
    #           sum(review_num) REVIEW_NUM,
    #           sum(review_days) REVIEW_DAYS,
    #           sum(vod_num) VOD_NUM,
    #           sum(vod_days) VOD_DAYS,
    #           SUM(free_vod_num) FREE_VOD_NUM,
    #           sum(free_vod_days) FREE_VOD_DAYS,
    #           sum(dd_vod_num) DD_VOD_NUM,
    #           sum(dd_vod_days) DD_VOD_DAYS,
    #           sum(by_vod_num) BY_VOD_NUM,
    #           sum(by_vod_days) BY_VOD_DAYS,
    #           sum(tv_num) TV_NUM,
    #           sum(tv_days) TV_DAYS,
    #           sum(tv_time) TV_TIME
    #           from %(s_dwa_user_view_m)s  
    #           where pt_mon between %(ARG_OPTIME_LAST6_M)s and %(ARG_OPTIME_LAST4_M)s
    #           group by PROD_INST_ID
    #         '''% vars()
    # QueryExe(hsql,name,dates)
    

#生成近三月数据 回看、点播、直播次数、时长、天数
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m0)s   as      
            select
              a.PROD_INST_ID, 
              case when a.vod_num > 0 then 1 else 0 end  IS_BEFORE_VOD,
              CASE WHEN a.review_num > 0 then 1 else 0 end IS_BEFORE_REVIEW,
              CASE WHEN a.tv_num > 0 then 1 else 0 end IS_BEFORE_TV,
              a.review_num,
              round(a.review_num/3,2) AVG_REVIEW_NUM,
              a.MAX_REVIEW_NUM,
              round(a.REVIEW_NUM_AVG_RATE,2) REVIEW_NUM_AVG_RATE,
              '' AVG_REVIEW_TIME,
              '' MAX_REVIEW_TIME,
              '' REVIEW_TIME_AVG_RATE,
              round(a.review_days/3,2) AVG_REVIEW_DAYS,
              a.vod_num,
              round(a.vod_num/3,2) AVG_VOD_NUM,
              a.MAX_VOD_NUM,
              round(a.VOD_NUM_AVG_RATE,2) VOD_NUM_AVG_RATE,
              '' AVG_VOD_TIME,
              '' MAX_VOD_TIME,
              '' VOD_TIME_AVG_RATE,
              round(a.vod_days/3,2) AVG_VOD_DAYS,
              a.free_vod_num,
              round(a.free_vod_num/3,2) AVG_FREE_VOD_NUM,
              a.MAX_FREE_VOD_NUM,
              round(a.FREE_VOD_NUM_AVG_RATE,2) FREE_VOD_NUM_AVG_RATE,
              '' AVG_FREE_VOD_TIME,
              '' MAX_FREE_VOD_TIME,
              '' FREE_VOD_TIME_AVG_RATE,
              round(a.free_vod_days/3,2) AVG_FREE_VOD_DAYS,

              a.dd_vod_num,
              round(a.dd_vod_num/3,2) AVG_DD_VOD_NUM,
              a.MAX_DD_VOD_NUM,
              round(a.DD_VOD_NUM_AVG_RATE,2) DD_VOD_NUM_AVG_RATE,
              '' AVG_DD_VOD_TIME,
              '' MAX_DD_VOD_TIME,
              '' DD_VOD_TIME_AVG_RATE,
              round(a.dd_vod_days/3,2) AVG_DD_VOD_DAYS,
              a.by_vod_num,
              round(a.by_vod_num/3,2) AVG_BY_VOD_NUM,
              a.MAX_BY_VOD_NUM,
              round(a.BY_VOD_NUM_AVG_RATE,2) BY_VOD_NUM_AVG_RATE,
              '' AVG_BY_VOD_TIME,
              '' MAX_BY_VOD_TIME,
              '' BY_VOD_TIME_AVG_RATE,
              round(a.by_vod_days/3,2) AVG_BY_VOD_DAYS,
              a.tv_num,
              round(a.tv_num/3,2) AVG_TV_NUM,
              a.MAX_TV_NUM,
              round(a.TV_NUM_AVG_RATE,2) TV_NUM_AVG_RATE,
              a.tv_time,
              round(a.tv_time/3,2) AVG_TV_TIME,
              a.MAX_TV_TIME,
              round(a.TV_TIME_AVG_RATE,2) TV_TIME_AVG_RATE,
              round(a.tv_days/3,2) AVG_TV_DAYS
              from 
                  (select
                      t.PROD_INST_ID, 
                      sum(t.review_num) REVIEW_NUM,
                      max(t.review_num)  MAX_REVIEW_NUM,
                      avg(t.REVIEW_NUM_AVG_RATE) REVIEW_NUM_AVG_RATE,
                      sum(t.review_days) REVIEW_DAYS,
                      sum(t.vod_num) VOD_NUM,
                      max(t.vod_num) MAX_VOD_NUM,
                      avg(t.VOD_NUM_AVG_RATE) VOD_NUM_AVG_RATE,
                      sum(t.vod_days) VOD_DAYS,
                      sum(t.free_vod_num) FREE_VOD_NUM,
                      max(t.free_vod_num) MAX_FREE_VOD_NUM,
                      avg(t.FREE_VOD_NUM_AVG_RATE) FREE_VOD_NUM_AVG_RATE,
                      sum(t.free_vod_days) FREE_VOD_DAYS,
                      sum(t.dd_vod_num) DD_VOD_NUM,
                      max(t.dd_vod_num) MAX_DD_VOD_NUM,
                      avg(t.DD_VOD_NUM_AVG_RATE) DD_VOD_NUM_AVG_RATE,
                      sum(t.dd_vod_days) DD_VOD_DAYS,
                      sum(t.by_vod_num) BY_VOD_NUM,
                      max(t.by_vod_num) MAX_BY_VOD_NUM,
                      avg(t.BY_VOD_NUM_AVG_RATE) BY_VOD_NUM_AVG_RATE,
                      sum(t.by_vod_days) BY_VOD_DAYS,
                      sum(t.tv_num) TV_NUM,
                      max(t.tv_num) MAX_TV_NUM,
                      avg(t.TV_NUM_AVG_RATE) TV_NUM_AVG_RATE,
                      sum(t.tv_time) TV_TIME,
                      max(t.tv_time) MAX_TV_TIME,
                      avg(t.TV_TIME_AVG_RATE) TV_TIME_AVG_RATE,
                      sum(t.tv_days) TV_DAYS
                  from %(s_dwa_user_view_m)s t 
                  where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                  group by t.PROD_INST_ID ) a 
                   
            '''% vars()
    QueryExe(hsql,name,dates)

# 生成回看、直播频道TOP3数据
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m1)s   as  
                select
                  t.prod_inst_id, 
                  t.channel_name,
                  t.review_num,
                  ROW_NUMBER() over (distribute by t.prod_inst_id sort by  cast(t.review_num as int) desc) rn
                  from (select
                          t.prod_inst_id, 
                          t.channel_name,
                          sum(t.review_num) review_num
                          from %(s_dwa_user_review_channel_m)s t 
                          where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          group by t.prod_inst_id, 
                          t.channel_name) t
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m2)s   as  
               select
                  t.prod_inst_id, 
                  t.channel_name,
                  t.tv_time,
                  ROW_NUMBER() over (distribute by t.prod_inst_id   sort by cast(t.tv_time as int) desc) rn
                  from (select
                          t.prod_inst_id, 
                          t.channel_name,
                          sum(t.tv_time) tv_time
                          from %(s_dwa_user_tv_channel_m)s t
                          where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s 
                          group by t.prod_inst_id, 
                          t.channel_name) t
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists  %(s_temp_dwa_user_view_beh_m3)s   as  
               select
                  t.PROD_INST_ID,
                  t1.channel_name REVIEW_CHANNEL_1,
                  round(t1.review_num/t.review_num*100,2) REVIEW_CHANNEL_RATE_1,
                  t2.channel_name REVIEW_CHANNEL_2,
                  round(t2.review_num/t.review_num*100,2) REVIEW_CHANNEL_RATE_2,
                  t3.channel_name REVIEW_CHANNEL_3,
                  round(t3.review_num/t.review_num*100,2) REVIEW_CHANNEL_RATE_3,
                  t4.channel_name TV_CHANNEL_1,
                  round(t4.tv_time/t.tv_time*100,2) TV_CHANNEL_RATE_1,
                  t5.channel_name TV_CHANNEL_2,
                  round(t5.tv_time/t.tv_time*100,2) TV_CHANNEL_RATE_2,
                  t6.channel_name TV_CHANNEL_3,
                  round(t6.tv_time/t.tv_time*100,2) TV_CHANNEL_RATE_3
                  from %(s_temp_dwa_user_view_beh_m0)s t
                  left join %(s_temp_dwa_user_view_beh_m1)s t1 on t.prod_inst_id=t1.prod_inst_id and t1.rn=1
                  left join %(s_temp_dwa_user_view_beh_m1)s t2 on t.prod_inst_id=t2.prod_inst_id and t2.rn=2
                  left join %(s_temp_dwa_user_view_beh_m1)s t3 on t.prod_inst_id=t3.prod_inst_id and t3.rn=3
                  left join %(s_temp_dwa_user_view_beh_m2)s t4 on t.prod_inst_id=t4.prod_inst_id and t4.rn=1
                  left join %(s_temp_dwa_user_view_beh_m2)s t5 on t.prod_inst_id=t5.prod_inst_id and t5.rn=2
                  left join %(s_temp_dwa_user_view_beh_m2)s t6 on t.prod_inst_id=t6.prod_inst_id and t6.rn=3
            '''% vars()
    QueryExe(hsql,name,dates)

    
#生成回看时段标签字段
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m4)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.REVIEW_NUM,
                  t1.all_review_num,
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID  sort by cast(t.REVIEW_NUM as int) desc) rn
                  from (select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.REVIEW_NUM) REVIEW_NUM  
                          from %(s_dwa_user_review_time_m)s t 
                           where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                           and t.HOLIDAY_TYPE=1
                          group by t.prod_inst_id, 
                          t.time_bucket) t
               left   join (select
                          a.prod_inst_id, 
                          sum(a.review_num) all_review_num
                          from %(s_dwa_user_review_time_m)s a 
                          where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          and a.HOLIDAY_TYPE=1
                          group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id  
                 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if  not exists %(s_temp_dwa_user_view_beh_m5)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.REVIEW_NUM,
                  t1.all_review_num, 
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID sort by cast(t.REVIEW_NUM as int) desc) rn
                  from(select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.REVIEW_NUM) REVIEW_NUM
                          from %(s_dwa_user_review_time_m)s t
                      where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                      and HOLIDAY_TYPE=0
                      group by t.prod_inst_id,t.TIME_BUCKET) t 
                  join (select
                          a.prod_inst_id, 
                          sum(a.review_num) all_review_num
                          from %(s_dwa_user_review_time_m)s a 
                        where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                        and HOLIDAY_TYPE=0
                        group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m6)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  sum(t.REVIEW_NUM) REVIEW_NUM 
                  from %(s_dwa_user_review_time_m)s t
                  where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s   
                  group by t.PROD_INST_ID, 
                  t.TIME_BUCKET
            '''% vars()
    QueryExe(hsql,name,dates) 
  
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m7)s   as  
               select
                   t.PROD_INST_ID,
                   t0.TIME_BUCKET_CNT REVIEW_HOLIDAY_TIME_NUM,
                   t1.TIME_BUCKET  REVIEW_HOLIDAY_TIME_1,
                   t2.TIME_BUCKET REVIEW_HOLIDAY_TIME_2,
                   t3.TIME_BUCKET REVIEW_HOLIDAY_TIME_3,
                   round(t1.all_review_num/t0.TIME_BUCKET_CNT,2) HOLIDAY_TIME_AVG_REVIEW_NUM,
                   t17.TIME_BUCKET_CNT REVIEW_WEEKDAY_TIME_NUM,
                   t4.TIME_BUCKET REVIEW_WEEKDAY_TIME_1,
                   t5.TIME_BUCKET REVIEW_WEEKDAY_TIME_2,
                   t6.TIME_BUCKET REVIEW_WEEKDAY_TIME_3,
                   round(t4.all_review_num/t17.TIME_BUCKET_CNT,2)  WEEKDAY_TIME_AVG_REVIEW_NUM,
                   round(t1.all_review_num/t.review_num*100,2) HOLIDAY_REVIEW_NUM_RATE,
                   round(t9.REVIEW_NUM/t.review_num*100,2) LC_REVIEW_NUM_RATE,
                   round(t10.REVIEW_NUM/t.review_num*100,2) ZS_REVIEW_NUM_RATE,
                   round(t11.REVIEW_NUM/t.review_num*100,2) SW_REVIEW_NUM_RATE,
                   round(t12.REVIEW_NUM/t.review_num*100,2) ZW_REVIEW_NUM_RATE,
                   round(t13.REVIEW_NUM/t.review_num*100,2) XW_REVIEW_NUM_RATE,
                   round(t14.REVIEW_NUM/t.review_num*100,2) BW_REVIEW_NUM_RATE,
                   round(t15.REVIEW_NUM/t.review_num*100,2) WS_REVIEW_NUM_RATE,
                   round(t16.REVIEW_NUM/t.review_num*100,2) WY_REVIEW_NUM_RATE
                  from %(s_temp_dwa_user_view_beh_m0)s t
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT from %(s_temp_dwa_user_view_beh_m4)s where REVIEW_NUM>0 group by PROD_INST_ID) t0 on t.PROD_INST_ID=t0.PROD_INST_ID 
                  left join %(s_temp_dwa_user_view_beh_m4)s t1 on t.PROD_INST_ID=t1.PROD_INST_ID and t1.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m4)s t2 on t.PROD_INST_ID=t2.PROD_INST_ID and t2.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m4)s t3 on t.PROD_INST_ID=t3.PROD_INST_ID and t3.rn=3
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT from %(s_temp_dwa_user_view_beh_m5)s where REVIEW_NUM>0 group by PROD_INST_ID) t17 on t.PROD_INST_ID=t17.PROD_INST_ID
                  left join %(s_temp_dwa_user_view_beh_m5)s t4 on t.PROD_INST_ID=t4.PROD_INST_ID and t4.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m5)s t5 on t.PROD_INST_ID=t5.PROD_INST_ID and t5.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m5)s t6 on t.PROD_INST_ID=t6.PROD_INST_ID and t6.rn=3
                  left join %(s_temp_dwa_user_view_beh_m6)s  t9 on t.PROD_INST_ID=t9.PROD_INST_ID and t9.TIME_BUCKET='凌晨'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t10 on t.PROD_INST_ID=t10.PROD_INST_ID and t10.TIME_BUCKET='早晨'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t11 on t.PROD_INST_ID=t11.PROD_INST_ID and t11.TIME_BUCKET='上午'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t12 on t.PROD_INST_ID=t12.PROD_INST_ID and t12.TIME_BUCKET='中午'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t13 on t.PROD_INST_ID=t13.PROD_INST_ID and t13.TIME_BUCKET='下午'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t14 on t.PROD_INST_ID=t14.PROD_INST_ID and t14.TIME_BUCKET='傍晚'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t15 on t.PROD_INST_ID=t15.PROD_INST_ID and t15.TIME_BUCKET='晚上'
                  left join %(s_temp_dwa_user_view_beh_m6)s  t16 on t.PROD_INST_ID=t16.PROD_INST_ID and t16.TIME_BUCKET='午夜'
                  
            '''% vars()
    QueryExe(hsql,name,dates)
    

#生成点播时段标签
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m8)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.VOD_NUM,
                  t1.all_VOD_num,
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID sort by cast(t.VOD_NUM as int) desc) rn
                  from(select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.VOD_NUM) VOD_NUM
                          from %(s_dwa_user_vod_time_m)s t 
                       where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                       and HOLIDAY_TYPE=1
                       group by t.PROD_INST_ID, 
                          t.TIME_BUCKET) t
                  join (select
                          a.prod_inst_id,
                          sum(a.VOD_num) all_VOD_num
                          from %(s_dwa_user_vod_time_m)s a 
                          where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          and HOLIDAY_TYPE=1
                          group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id 
                 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m9)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.VOD_NUM,
                  t1.all_VOD_num, 
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID sort by cast(t.VOD_NUM as int) desc) rn
                  from(select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.VOD_NUM) VOD_NUM
                        from %(s_dwa_user_vod_time_m)s t 
                        where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                        and HOLIDAY_TYPE=0
                        group by t.PROD_INST_ID, 
                          t.TIME_BUCKET) t 
                  join (select
                          a.prod_inst_id, 
                          sum(a.VOD_num) all_VOD_num
                          from %(s_dwa_user_vod_time_m)s a 
                          where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          and a.HOLIDAY_TYPE=0
                          group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id
                 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m10)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  sum(t.VOD_NUM) VOD_NUM 
                  from %(s_dwa_user_vod_time_m)s t    
                  where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s   
                  group by t.PROD_INST_ID, 
                  t.TIME_BUCKET 
            '''% vars()
    QueryExe(hsql,name,dates) 
  
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m11)s   as  
               select
                   t.PROD_INST_ID,
                   t0.TIME_BUCKET_CNT VOD_HOLIDAY_TIME_NUM,
                   t1.TIME_BUCKET  VOD_HOLIDAY_TIME_1,
                   t2.TIME_BUCKET VOD_HOLIDAY_TIME_2,
                   t3.TIME_BUCKET VOD_HOLIDAY_TIME_3,
                   round(t1.all_VOD_num/t0.TIME_BUCKET_CNT,2) HOLIDAY_TIME_AVG_VOD_NUM,
                   t17.TIME_BUCKET_CNT VOD_WEEKDAY_TIME_NUM,
                   t4.TIME_BUCKET VOD_WEEKDAY_TIME_1,
                   t5.TIME_BUCKET VOD_WEEKDAY_TIME_2,
                   t6.TIME_BUCKET VOD_WEEKDAY_TIME_3,
                   round(t4.all_VOD_num/t17.TIME_BUCKET_CNT,2)  WEEKDAY_TIME_AVG_VOD_NUM,
                   round(t1.all_VOD_num/t.vod_num*100,2) HOLIDAY_VOD_NUM_RATE,
                   round(t9.VOD_NUM/t.vod_num*100,2) LC_VOD_NUM_RATE,
                   round(t10.VOD_NUM/t.vod_num*100,2) ZS_VOD_NUM_RATE,
                   round(t11.VOD_NUM/t.vod_num*100,2) SW_VOD_NUM_RATE,
                   round(t12.VOD_NUM/t.vod_num*100,2) ZW_VOD_NUM_RATE,
                   round(t13.VOD_NUM/t.vod_num*100,2) XW_VOD_NUM_RATE,
                   round(t14.VOD_NUM/t.vod_num*100,2) BW_VOD_NUM_RATE,
                   round(t15.VOD_NUM/t.vod_num*100,2) WS_VOD_NUM_RATE,
                   round(t16.VOD_NUM/t.vod_num*100,2) WY_VOD_NUM_RATE
                  from %(s_temp_dwa_user_view_beh_m0)s t
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT from %(s_temp_dwa_user_view_beh_m8)s where VOD_NUM>0 group by PROD_INST_ID) t0 on t.PROD_INST_ID=t0.PROD_INST_ID 
                  left join %(s_temp_dwa_user_view_beh_m8)s t1 on t.PROD_INST_ID=t1.PROD_INST_ID and t1.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m8)s t2 on t.PROD_INST_ID=t2.PROD_INST_ID and t2.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m8)s t3 on t.PROD_INST_ID=t3.PROD_INST_ID and t3.rn=3
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT from %(s_temp_dwa_user_view_beh_m9)s where VOD_NUM>0 group by PROD_INST_ID) t17 on t.PROD_INST_ID=t17.PROD_INST_ID
                  left join %(s_temp_dwa_user_view_beh_m9)s t4 on t.PROD_INST_ID=t4.PROD_INST_ID and t4.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m9)s t5 on t.PROD_INST_ID=t5.PROD_INST_ID and t5.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m9)s t6 on t.PROD_INST_ID=t6.PROD_INST_ID and t6.rn=3
                  left join %(s_temp_dwa_user_view_beh_m10)s  t9 on t.PROD_INST_ID=t9.PROD_INST_ID and t9.TIME_BUCKET='凌晨'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t10 on t.PROD_INST_ID=t10.PROD_INST_ID and t10.TIME_BUCKET='早晨'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t11 on t.PROD_INST_ID=t11.PROD_INST_ID and t11.TIME_BUCKET='上午'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t12 on t.PROD_INST_ID=t12.PROD_INST_ID and t12.TIME_BUCKET='中午'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t13 on t.PROD_INST_ID=t13.PROD_INST_ID and t13.TIME_BUCKET='下午'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t14 on t.PROD_INST_ID=t14.PROD_INST_ID and t14.TIME_BUCKET='傍晚'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t15 on t.PROD_INST_ID=t15.PROD_INST_ID and t15.TIME_BUCKET='晚上'
                  left join %(s_temp_dwa_user_view_beh_m10)s  t16 on t.PROD_INST_ID=t16.PROD_INST_ID and t16.TIME_BUCKET='午夜'
            '''% vars()
    QueryExe(hsql,name,dates)

#生成直播时段标签
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m12)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.TV_NUM,
                  t.TV_TIME,
                  t1.all_TV_num,
                  t1.all_TV_TIME,
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID sort by cast(t.TV_TIME as int) desc) rn
                  from(select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.TV_NUM) TV_NUM,
                          sum(t.TV_TIME) TV_TIME
                          from %(s_dwa_user_tv_time_m)s t 
                          where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                          and HOLIDAY_TYPE=1
                          group by t.PROD_INST_ID, 
                          t.TIME_BUCKET) t
                  join (select
                          a.prod_inst_id, 
                          sum(a.TV_num) all_TV_num,
                          sum(a.TV_TIME) all_TV_TIME
                          from %(s_dwa_user_tv_time_m)s a 
                          where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          and HOLIDAY_TYPE=1
                          group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m13)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  t.TV_NUM,
                  t1.all_TV_num, 
                  t1.all_TV_TIME,
                  ROW_NUMBER() over (distribute by t.PROD_INST_ID sort by cast(t.TV_TIME as int) desc) rn
                  from(select
                          t.PROD_INST_ID, 
                          t.TIME_BUCKET,
                          sum(t.TV_NUM) TV_NUM,
                          sum(t.TV_TIME) TV_TIME
                          from %(s_dwa_user_tv_time_m)s t
                          where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s  
                          and HOLIDAY_TYPE=0
                          group by t.PROD_INST_ID, 
                          t.TIME_BUCKET) t 
                  join (select
                          a.prod_inst_id, 
                          sum(a.TV_num) all_TV_num,
                          sum(a.TV_TIME) all_TV_TIME
                          from %(s_dwa_user_tv_time_m)s a 
                          where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
                          and HOLIDAY_TYPE=0
                          group by a.prod_inst_id) t1 on t.prod_inst_id=t1.prod_inst_id 
                  
            '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m14)s   as  
               select
                  t.PROD_INST_ID, 
                  t.TIME_BUCKET,
                  sum(t.TV_NUM) TV_NUM,
                  sum(t.TV_TIME) TV_TIME
                  from %(s_dwa_user_tv_time_m)s t    
                  where t.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s   
                  group by t.PROD_INST_ID, 
                  t.TIME_BUCKET 
            '''% vars()
    QueryExe(hsql,name,dates) 
  
    hsql='''create table if not exists %(s_temp_dwa_user_view_beh_m15)s   as  
               select
                   t.PROD_INST_ID,
                   t0.TIME_BUCKET_CNT TV_HOLIDAY_TIME_NUM,
                   t1.TIME_BUCKET  TV_HOLIDAY_TIME_1,
                   t2.TIME_BUCKET TV_HOLIDAY_TIME_2,
                   t3.TIME_BUCKET TV_HOLIDAY_TIME_3,
                   round(t1.all_TV_num/t0.TIME_BUCKET_CNT,2) HOLIDAY_TIME_AVG_TV_NUM,
                   round(t1.all_TV_TIME/t0.TIME_BUCKET_CNT,2) HOLIDAY_TIME_AVG_TV_TIME,
                   t17.TIME_BUCKET_CNT TV_WEEKDAY_TIME_NUM,
                   t4.TIME_BUCKET TV_WEEKDAY_TIME_1,
                   t5.TIME_BUCKET TV_WEEKDAY_TIME_2,
                   t6.TIME_BUCKET TV_WEEKDAY_TIME_3,
                   round(t4.all_TV_num/t17.TIME_BUCKET_CNT,2)  WEEKDAY_TIME_AVG_TV_NUM,                   
                   round(t4.all_TV_TIME/t17.TIME_BUCKET_CNT,2)  WEEKDAY_TIME_AVG_TV_TIME,
                   round(t1.all_TV_time/t.TV_time*100,2) HOLIDAY_TV_TIME_RATE, 
                   round(t9.TV_TIME/t.TV_TIME*100,2) LC_TV_TIME_RATE,
                   round(t10.TV_TIME/t.tv_time*100,2) ZS_TV_TIME_RATE,
                   round(t11.TV_TIME/t.tv_time*100,2) SW_TV_TIME_RATE,
                   round(t12.TV_TIME/t.tv_time*100,2) ZW_TV_TIME_RATE,
                   round(t13.TV_TIME/t.tv_time*100,2) XW_TV_TIME_RATE,
                   round(t14.TV_TIME/t.tv_time*100,2) BW_TV_TIME_RATE,
                   round(t15.TV_TIME/t.tv_time*100,2) WS_TV_TIME_RATE,
                   round(t16.TV_TIME/t.tv_time*100,2) WY_TV_TIME_RATE
                  from %(s_temp_dwa_user_view_beh_m0)s t
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT  from %(s_temp_dwa_user_view_beh_m12)s where TV_NUM>0 group by PROD_INST_ID) t0 on t.PROD_INST_ID=t0.PROD_INST_ID
                  left join %(s_temp_dwa_user_view_beh_m12)s t1 on t.PROD_INST_ID=t1.PROD_INST_ID and t1.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m12)s t2 on t.PROD_INST_ID=t2.PROD_INST_ID and t2.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m12)s t3 on t.PROD_INST_ID=t3.PROD_INST_ID and t3.rn=3
                  left join (select PROD_INST_ID,count(TIME_BUCKET) TIME_BUCKET_CNT from %(s_temp_dwa_user_view_beh_m13)s where TV_NUM>0 group by PROD_INST_ID) t17 on t.PROD_INST_ID=t17.PROD_INST_ID
                  left join %(s_temp_dwa_user_view_beh_m13)s t4 on t.PROD_INST_ID=t4.PROD_INST_ID and t4.rn=1  
                  left join %(s_temp_dwa_user_view_beh_m13)s t5 on t.PROD_INST_ID=t5.PROD_INST_ID and t5.rn=2 
                  left join %(s_temp_dwa_user_view_beh_m13)s t6 on t.PROD_INST_ID=t6.PROD_INST_ID and t6.rn=3
                  left join %(s_temp_dwa_user_view_beh_m14)s  t9 on t.PROD_INST_ID=t9.PROD_INST_ID and t9.TIME_BUCKET='凌晨'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t10 on t.PROD_INST_ID=t10.PROD_INST_ID and t10.TIME_BUCKET='早晨'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t11 on t.PROD_INST_ID=t11.PROD_INST_ID and t11.TIME_BUCKET='上午'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t12 on t.PROD_INST_ID=t12.PROD_INST_ID and t12.TIME_BUCKET='中午'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t13 on t.PROD_INST_ID=t13.PROD_INST_ID and t13.TIME_BUCKET='下午'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t14 on t.PROD_INST_ID=t14.PROD_INST_ID and t14.TIME_BUCKET='傍晚'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t15 on t.PROD_INST_ID=t15.PROD_INST_ID and t15.TIME_BUCKET='晚上'
                  left join %(s_temp_dwa_user_view_beh_m14)s  t16 on t.PROD_INST_ID=t16.PROD_INST_ID and t16.TIME_BUCKET='午夜'
            '''% vars()
    QueryExe(hsql,name,dates)
    
    
    
#生成目标数据
    hsql='''insert overwrite table %(t_DWA_USER_VIEW_BEH_M)s partition(pt_mon = %(ARG_OPTIME_LAST1_M)s)            
              select
               t.PROD_INST_ID,
               t5.cust_id,
               t.IS_BEFORE_VOD,
               t.IS_BEFORE_REVIEW,
               t.IS_BEFORE_TV,
               t.AVG_REVIEW_NUM,
               t.MAX_REVIEW_NUM,
               t.REVIEW_NUM_AVG_RATE,
               t.AVG_REVIEW_TIME,
               t.MAX_REVIEW_TIME,
               t.REVIEW_TIME_AVG_RATE,
               t.AVG_REVIEW_DAYS,
               t.AVG_VOD_NUM,
               t.MAX_VOD_NUM,
               t.VOD_NUM_AVG_RATE,
               t.AVG_VOD_TIME,
               t.MAX_VOD_TIME,
               t.VOD_TIME_AVG_RATE,
               t.AVG_VOD_DAYS,
               t.AVG_FREE_VOD_NUM,
               t.MAX_FREE_VOD_NUM,
               t.free_vod_num_avg_rate,
               t.avg_free_vod_time,
               t.max_free_vod_time,
               t.free_vod_time_avg_rate,
               t.avg_free_vod_days,
               t.avg_dd_vod_num,
               t.max_dd_vod_num,
               t.dd_vod_num_avg_rate,
               t.avg_dd_vod_time,
               t.max_dd_vod_time,
               t.dd_vod_time_avg_rate,
               t.avg_dd_vod_days,
               t.avg_by_vod_num,
               t.max_by_vod_num,
               t.by_vod_num_avg_rate,
               t.avg_by_vod_time,
               t.max_by_vod_time,
               t.by_vod_time_avg_rate,
               t.avg_by_vod_days,
               t.AVG_TV_NUM,
               t.MAX_TV_NUM,
               t.TV_NUM_AVG_RATE,
               t.AVG_TV_TIME,
               t.MAX_TV_TIME,
               t.TV_TIME_AVG_RATE,
               t.AVG_TV_DAYS,
               t1.REVIEW_CHANNEL_1,
               t1.REVIEW_CHANNEL_RATE_1,
               t1.REVIEW_CHANNEL_2,
               t1.REVIEW_CHANNEL_RATE_2,
               t1.REVIEW_CHANNEL_3,
               t1.REVIEW_CHANNEL_RATE_3,
               t1.TV_CHANNEL_1,
               t1.TV_CHANNEL_RATE_1,
               t1.TV_CHANNEL_2,
               t1.TV_CHANNEL_RATE_2,
               t1.TV_CHANNEL_3,
               t1.TV_CHANNEL_RATE_3,
               t2.REVIEW_HOLIDAY_TIME_NUM,
               t2.REVIEW_HOLIDAY_TIME_1,
               t2.REVIEW_HOLIDAY_TIME_2,
               t2.REVIEW_HOLIDAY_TIME_3,
               t2.HOLIDAY_TIME_AVG_REVIEW_NUM,
               t2.REVIEW_WEEKDAY_TIME_NUM,
               t2.REVIEW_WEEKDAY_TIME_1,
               t2.REVIEW_WEEKDAY_TIME_2,
               t2.REVIEW_WEEKDAY_TIME_3,
               t2.WEEKDAY_TIME_AVG_REVIEW_NUM,
               t2.HOLIDAY_REVIEW_NUM_RATE,
               t2.LC_REVIEW_NUM_RATE,
               t2.ZS_REVIEW_NUM_RATE,
               t2.SW_REVIEW_NUM_RATE,
               t2.ZW_REVIEW_NUM_RATE,
               t2.XW_REVIEW_NUM_RATE,
               t2.BW_REVIEW_NUM_RATE,
               t2.WS_REVIEW_NUM_RATE,
               t2.WY_REVIEW_NUM_RATE,
               t3.VOD_HOLIDAY_TIME_NUM,
               t3.VOD_HOLIDAY_TIME_1,
               t3.VOD_HOLIDAY_TIME_2,
               t3.VOD_HOLIDAY_TIME_3,
               t3.HOLIDAY_TIME_AVG_VOD_NUM,
               t3.VOD_WEEKDAY_TIME_NUM,
               t3.VOD_WEEKDAY_TIME_1,
               t3.VOD_WEEKDAY_TIME_2,
               t3.VOD_WEEKDAY_TIME_3,
               t3.WEEKDAY_TIME_AVG_VOD_NUM,
               t3.HOLIDAY_VOD_NUM_RATE,
               t3.LC_VOD_NUM_RATE,
               t3.ZS_VOD_NUM_RATE,
               t3.SW_VOD_NUM_RATE,
               t3.ZW_VOD_NUM_RATE,
               t3.XW_VOD_NUM_RATE,
               t3.BW_VOD_NUM_RATE,
               t3.WS_VOD_NUM_RATE,
               t3.WY_VOD_NUM_RATE,
               t4.TV_HOLIDAY_TIME_NUM,
               t4.TV_HOLIDAY_TIME_1,
               t4.TV_HOLIDAY_TIME_2,
               t4.TV_HOLIDAY_TIME_3,
               t4.HOLIDAY_TIME_AVG_TV_NUM,
               t4.HOLIDAY_TIME_AVG_TV_TIME,
               t4.TV_WEEKDAY_TIME_NUM,
               t4.TV_WEEKDAY_TIME_1,
               t4.TV_WEEKDAY_TIME_2,
               t4.TV_WEEKDAY_TIME_3,
               t4.WEEKDAY_TIME_AVG_TV_NUM,
               t4.WEEKDAY_TIME_AVG_TV_TIME,
               t4.HOLIDAY_TV_TIME_RATE,
               t4.LC_TV_TIME_RATE,
               t4.ZS_TV_TIME_RATE,
               t4.SW_TV_TIME_RATE,
               t4.ZW_TV_TIME_RATE,
               t4.XW_TV_TIME_RATE,
               t4.BW_TV_TIME_RATE,
               t4.WS_TV_TIME_RATE,
               t4.WY_TV_TIME_RATE,
               from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
              from %(s_temp_dwa_user_view_beh_m0)s t
              left join %(s_temp_dwa_user_view_beh_m3)s t1 on t.prod_inst_id = t1.prod_inst_id
              left join %(s_temp_dwa_user_view_beh_m7)s t2 on t.PROD_INST_ID=t2.PROD_INST_ID
              left join %(s_temp_dwa_user_view_beh_m11)s t3 on t.PROD_INST_ID=t3.PROD_INST_ID
              left join %(s_temp_dwa_user_view_beh_m15)s t4 on t.PROD_INST_ID=t4.PROD_INST_ID
              left join %(s_dwd_fact_ins_prod)s t5 
              on  t.prod_inst_id=t5.prod_inst_id and t5.pt_mon=%(ARG_OPTIME_LAST1_M)s         
              inner join %(s_dwa_cust_feat_dtl_m)s t6
              on  t5.cust_id = t6.cust_id
              and t6.pt_mon =  %(ARG_OPTIME_LAST1_M)s 
            '''% vars()
    QueryExe(hsql,name,dates)
    
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
