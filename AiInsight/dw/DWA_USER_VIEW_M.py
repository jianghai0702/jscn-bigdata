##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户收视月表
# Pay:DWA_USER_VIEW_M.py
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
    #获得传入的数据日期上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']     #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================      
    s_dwd_dr_ismp                   =    "dwd_dr_ismp" 
    s_dwd_ter_service                      =    "dwd_ter_service"
    s_tmp_dwa_user_view_m0                 =    "tmp_dwa_user_view_m0"
    s_tmp_dwa_user_view_m1                 =    "tmp_dwa_user_view_m1" 
    s_tmp_dwa_user_view_m2                 =    "tmp_dwa_user_view_m2" 
    s_tmp_dwa_user_view_m3                 =    "tmp_dwa_user_view_m3" 
    s_tmp_dwa_user_view_m4                 =    "tmp_dwa_user_view_m4" 
    s_tmp_dwa_user_view_m5                 =    "tmp_dwa_user_view_m5" 
    s_tmp_dwa_user_view_m6                 =    "tmp_dwa_user_view_m6" 
    s_tmp_dwa_user_view_m7                 =    "tmp_dwa_user_view_m7" 
    s_tmp_dwa_user_view_m8                 =    "tmp_dwa_user_view_m8" 
    s_tmp_dwa_user_view_m9                 =    "tmp_dwa_user_view_m9"
    s_tmp_dwa_user_view_m10                =    "tmp_dwa_user_view_m10"
    s_tmp_dwa_user_view_m11                =    "tmp_dwa_user_view_m11"
    s_tmp_dwa_user_view_m12                =    "tmp_dwa_user_view_m12"
    s_tmp_dwa_user_view_m13                =    "tmp_dwa_user_view_m13"
    s_tmp_dwa_user_view_m14                =    "tmp_dwa_user_view_m14"
    s_tmp_dwa_user_view_m15                =    "tmp_dwa_user_view_m15"
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_DWA_USER_VIEW_M               =    "DWA_USER_VIEW_M"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当月回放与点播数据 
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m0)s
         (
            prod_inst_id      string,
            first_review_date   string,
            REVIEW_NUM string,
            review_days STRING,
            first_vod_date string,
            VOD_NUM string,
            vod_days string,
            free_vod_num string,
            free_vod_days string,
            dd_vod_num string,
            dd_vod_days string,
            by_vod_num string,
            by_vod_days string

         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m0)s'
         '''% vars()    
    QueryExe(hsql,name,dates)

#
    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m0)s
             select
              a.user_id PROD_INST_ID, 
              min(case when a.data_source_cd = 'VOD' then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) FIRST_REVIEW_DATE,
              count(case when a.data_source_cd = 'VOD' then a.user_id else null end) REVIEW_NUM,
              count(distinct  case when a.data_source_cd = 'VOD' then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) REVIEW_DAYS,

              min(case when a.data_source_cd <> 'VOD' then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) FIRST_VOD_DATE,
              count(case when a.data_source_cd <> 'VOD' then a.user_id else null end) VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD'  then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.std_basic_charge = 0 then a.user_id else null end) FREE_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.std_basic_charge = 0 then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) FREE_VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.charge1 > 0 then a.user_id else null end) DD_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.charge1 > 0 then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) DD_VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.charge1 = 0 and a.std_basic_charge > 0  then a.user_id else null end) BY_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.charge1 = 0 and a.std_basic_charge > 0  then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) BY_VOD_DAYS
              
              from %(s_dwd_dr_ismp)s a  
              where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
                 group by a.user_id  
            '''% vars()
    QueryExe(hsql,name,dates)


#生成 当月直播数据 
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m3)s
         (
            prod_inst_id      string,
            FIRST_TV_DATE string,
            TV_NUM string,
            TV_TIME string,
            TV_DAYS string
         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m3)s'
         '''% vars()    
    QueryExe(hsql,name,dates)
#
    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m3)s
             select
              a.user_id PROD_INST_ID, 
              min(from_unixtime(unix_timestamp(a.ucendtime,'yyyy-MM-dd'),'yyyyMMdd')) FIRST_TV_DATE,
              count(a.user_id) TV_NUM,
              sum(a.uncontinue) TV_TIME,
              count(distinct from_unixtime(unix_timestamp(a.ucendtime,'yyyy-MM-dd'),'yyyyMMdd')) TV_DAYS
              from %(s_dwd_ter_service)s a  
              where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
              group by a.user_id  
            '''% vars()
    QueryExe(hsql,name,dates)


#生成 当月用户
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m4)s
         (
            prod_inst_id      string
         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m4)s'
         '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m4)s
            select PROD_INST_ID
            from (
                select distinct b.user_id PROD_INST_ID from %(s_dwd_dr_ismp)s b where b.pt_mon = %(ARG_OPTIME_LAST1_M)s  -- 点播回看用户
                union all
                select distinct c.user_id PROD_INST_ID from %(s_dwd_ter_service)s c where c.pt_mon = %(ARG_OPTIME_LAST1_M)s  --直播用户
                  ) t
             group by prod_inst_id
            '''% vars()
    QueryExe(hsql,name,dates)
#生成 当月数据
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m5)s
         (
            prod_inst_id      string,
            FIRST_REVIEW_DATE string,
            REVIEW_NUM string,
            review_days string,
            FIRST_VOD_DATE string,
            VOD_NUM string,
            vod_days string,
            free_vod_num string,
            free_vod_days string,
            dd_vod_num string,
            dd_vod_days string,
            by_vod_num string,
            by_vod_days string, 
            FIRST_TV_DATE string,
            TV_NUM string,
            TV_TIME string,
            tv_days string
         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m5)s'
         '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m5)s
              select
              t.PROD_INST_ID, 
              a.FIRST_REVIEW_DATE,
              a.REVIEW_NUM, 
              a.REVIEW_DAYS,
              a.FIRST_VOD_DATE,
              a.VOD_NUM,
              a.vod_days,
              a.free_vod_num,
              a.free_vod_days,
              a.dd_vod_num,
              a.dd_vod_days,
              a.by_vod_num,
              a.by_vod_days,
              c.FIRST_TV_DATE,
              c.TV_NUM,
              c.TV_TIME,
              c.TV_DAYS
              from %(s_tmp_dwa_user_view_m4)s t
              left join %(s_tmp_dwa_user_view_m0)s a 
                  on  t.PROD_INST_ID=a.PROD_INST_ID
              left join %(s_tmp_dwa_user_view_m3)s c 
                  on c.PROD_INST_ID=t.PROD_INST_ID
   
            '''% vars()
    QueryExe(hsql,name,dates)
    
#生成 上月回放和点播用户数据 
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m6)s
         (
            prod_inst_id      string,
            REVIEW_NUM string,
            review_days STRING,
            VOD_NUM string,
            vod_days string,
            free_vod_num string,
            free_vod_days string,
            dd_vod_num string,
            dd_vod_days string,
            by_vod_num string,
            by_vod_days string

         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m6)s'
         '''% vars()    
    QueryExe(hsql,name,dates)

# 
    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m6)s
             select
              a.user_id PROD_INST_ID, 
              count(case when a.data_source_cd = 'VOD' then a.user_id else null end) REVIEW_NUM,
              count(distinct  case when a.data_source_cd = 'VOD' then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) REVIEW_DAYS,

              count(case when a.data_source_cd <> 'VOD' then a.user_id else null end) VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD'  then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.std_basic_charge = 0 then a.user_id else null end) FREE_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.std_basic_charge = 0 then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) FREE_VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.charge1 > 0 then a.user_id else null end) DD_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.charge1 > 0 then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) DD_VOD_DAYS,

              count(case when a.data_source_cd <> 'VOD' and a.charge1 = 0 and a.std_basic_charge > 0  then a.user_id else null end) BY_VOD_NUM,
              COUNT(DISTINCT case when a.data_source_cd <> 'VOD' and a.charge1 = 0 and a.std_basic_charge > 0  then from_unixtime(unix_timestamp(a.start_time,'yyyy-MM-dd'),'yyyyMMdd') else null end) BY_VOD_DAYS

              from %(s_dwd_dr_ismp)s a  
              where a.pt_mon = %(ARG_OPTIME_LAST2_M)s
              group by a.user_id  
            '''% vars()
    QueryExe(hsql,name,dates)

#生成 上月直播数据 
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m8)s
         (
            prod_inst_id      string,
            TV_NUM string,
            TV_TIME string,
            tv_days string
         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m8)s'
         '''% vars()    
    QueryExe(hsql,name,dates)

#
    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m8)s
             select
              a.user_id PROD_INST_ID, 
              count(a.user_id) TV_NUM,
              sum(a.uncontinue) TV_TIME,
              count(distinct   from_unixtime(unix_timestamp(a.ucendtime,'yyyy-MM-dd'),'yyyyMMdd')) TV_DAYS
              from %(s_dwd_ter_service)s a  
              where a.pt_mon = %(ARG_OPTIME_LAST2_M)s
              group by a.user_id
            '''% vars()
    QueryExe(hsql,name,dates)

#生成 上月数据
    hsql='''create table if not exists %(s_tmp_dwa_user_view_m9)s
         (
            prod_inst_id      string,
            REVIEW_NUM string,
            review_days string,
            VOD_NUM string,
            vod_days string,
            free_vod_num string,
            free_vod_days string,
            dd_vod_num string,
            dd_vod_days string,
            by_vod_num string,
            by_vod_days string,
            TV_NUM string,
            TV_TIME string,
            tv_days string
         )
         stored as orcfile
         LOCATION '%(tmp_path)s/%(s_tmp_dwa_user_view_m9)s'
         '''% vars()    
    QueryExe(hsql,name,dates)
#
    hsql='''insert overwrite table %(s_tmp_dwa_user_view_m9)s
              select
              t.PROD_INST_ID, 
              a.REVIEW_NUM, 
              a.review_days,
              a.VOD_NUM,
              a.vod_days,
              a.free_vod_num,
              a.free_vod_days,
              a.dd_vod_num,
              a.dd_vod_days,
              a.by_vod_num,
              a.by_vod_days,
              c.TV_NUM,
              c.TV_TIME,
              c.tv_days
              from %(s_tmp_dwa_user_view_m4)s t
              left join %(s_tmp_dwa_user_view_m6)s a 
                  on  t.PROD_INST_ID=a.PROD_INST_ID
              left join %(s_tmp_dwa_user_view_m8)s c 
                  on c.PROD_INST_ID=t.PROD_INST_ID 
           '''% vars()
    QueryExe(hsql,name,dates)

#生成最终目标数据
    hsql='''insert overwrite table %(t_DWA_USER_VIEW_M)s partition(pt_mon = %(ARG_OPTIME_LAST1_M)s)            
              select
              t.PROD_INST_ID, 
              t.FIRST_REVIEW_DATE,
              t.REVIEW_NUM,    
              case when COALESCE(t1.REVIEW_NUM,0)<>0 then round((t.REVIEW_NUM-t1.REVIEW_NUM)/t1.REVIEW_NUM*100,2) else 0 end REVIEW_NUM_AVG_RATE,  
              '' REVIEW_TIME,
              '' REVIEW_TIME_AVG_RATE,
              t.review_days,
              CASE WHEN COALESCE(t1.review_days,0) <> 0 THEN ROUND((t.review_days-t1.review_days)/t1.review_days*100,2) ELSE 0 END review_days_avg_rate,
              t.FIRST_VOD_DATE,
              t.VOD_NUM,
              CASE WHEN COALESCE(t1.vod_num,0) <> 0 THEN ROUND((t.VOD_NUM-t1.VOD_NUM)/t1.VOD_NUM*100,2) ELSE 0 END  VOD_NUM_AVG_RATE,
              '' VOD_TIME,
              '' VOD_TIME_AVG_RATE,
              t.vod_days,
              CASE WHEN COALESCE(t1.vod_days,0) <> 0 THEN ROUND((t.vod_days-t1.vod_days)/t1.vod_days*100,2) ELSE 0 END  vod_days_avg_rate,
              t.free_vod_num,
              CASE WHEN COALESCE(T1.free_vod_num,0) <> 0 THEN ROUND((t.free_vod_num-t1.free_vod_num)/t1.free_vod_num*100,2) ELSE 0 END FREE_VOD_NUM_AVG_RATE,
              '' free_vod_time,
              '' free_vod_time_avg_rate,
              t.free_vod_days,
              CASE WHEN COALESCE(T1.free_vod_days,0) <>0 THEN ROUND((T.free_vod_days-t1.free_vod_days)/t1.free_vod_days*100,2) ELSE 0 END FREE_VOD_DAYS_AVG_RATE,
              t.dd_vod_num,
              CASE WHEN COALESCE(T1.dd_vod_num,0) <> 0 THEN ROUND((t.dd_vod_num-t1.dd_vod_num)/t1.dd_vod_num*100,2) ELSE 0 END DD_VOD_NUM_AVG_RATE,
              '' dd_vod_time,
              '' dd_vod_time_avg_rate,
              t.dd_vod_days,
              CASE WHEN COALESCE(T1.dd_vod_days,0) <>0 THEN ROUND((T.dd_vod_days-t1.dd_vod_days)/t1.dd_vod_days*100,2) ELSE 0 END DD_VOD_DAYS_AVG_RATE,
              t.by_vod_num,
              CASE WHEN COALESCE(T1.by_vod_num,0) <> 0 THEN ROUND((t.by_vod_num-t1.by_vod_num)/t1.by_vod_num*100,2) ELSE 0 END BY_VOD_NUM_AVG_RATE,
              '' by_vod_time,
              '' by_vod_time_avg_rate,
              t.by_vod_days,
              CASE WHEN COALESCE(T1.by_vod_days,0) <>0 THEN ROUND((T.by_vod_days-t1.by_vod_days)/t1.by_vod_days*100,2) ELSE 0 END BY_VOD_DAYS_AVG_RATE,
              t.FIRST_TV_DATE,
              t.TV_NUM,
              CASE WHEN COALESCE(T1.tv_num,0) <>0 THEN ROUND((t.TV_NUM-t1.TV_NUM)/t1.TV_NUM*100,2) ELSE 0 END  TV_NUM_AVG_RATE,
              t.TV_TIME,
              CASE WHEN COALESCE(t1.tv_time,0) <>0 THEN ROUND((t.TV_TIME-t1.TV_TIME)/t1.TV_TIME*100,2) ELSE 0 END  TV_TIME_AVG_RATE,
              t.TV_DAYS,
              CASE WHEN COALESCE(t1.tv_days,0) <> 0 THEN ROUND((t.tv_days-t1.tv_days)/t1.tv_days*100,2) ELSE 0 END  tv_days_avg_rate,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
              from %(s_tmp_dwa_user_view_m5)s t
              left join %(s_tmp_dwa_user_view_m9)s t1 
                  on t.PROD_INST_ID=t1.PROD_INST_ID 
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================       
##删除临时表                                               
##===========================================================================
    # hsql='''drop table %(s_tmp_dwa_user_view_m0)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m1)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m2)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m3)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m4)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m5)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m6)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m7)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m8)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m9)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m10)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m11)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m12)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m13)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m14)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_tmp_dwa_user_view_m15)s''' %vars()
    # QueryExe(hsql,name,dates)

    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
