##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST点播概况统计
# Pay:ST_DR_SUMMARY.py
# Purpose:
#
# Author:      liuyf7
#
# Created:     26-08-2017
# Copyright:   (c) liuyf7 2017
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
    ARG_TODAY                     = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO                 = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                    = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO                = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR               = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH              = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01            = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy-mm格式的数据日期
    ARG_OPTIME_MONTH12            = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy-mm格式的数据日期
    ARG_OPTIME_HOUR               = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD           = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY                = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON            = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY            = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO        = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON            = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO        = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2MON           = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO       = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3MON           = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO       = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTYEAR           = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO       = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR01             = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO         = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR12             = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO         = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MON01              = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO          = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON01          = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO      = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MONEND             = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO         = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND         = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO     = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST_Y             = dicts['ARG_OPTIME_LAST_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST_M             = dicts['ARG_OPTIME_LAST_M']            # 获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M            = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M            = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M            = dicts['ARG_OPTIME_LAST3_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST4_M            = dicts['ARG_OPTIME_LAST4_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST5_M            = dicts['ARG_OPTIME_LAST5_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST6_M            = dicts['ARG_OPTIME_LAST6_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2MONTH         = dicts['ARG_OPTIME_LAST2MONTH']        #获得传入的数据日期的上2月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON       = dicts['ARG_OPTIME_LASTYEAR1MON']      #获得传入的数据日期的去年前一个月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON01_ISO = dicts['ARG_OPTIME_LASTYEAR1MON01_ISO'] #获得传入的数据日期的去年前一个月第一天yyyy-mm-dd格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_dr_ismp             =    "dwd_dr_ismp"
    s_dwa_dr_all_user_m                  =    "dwa_dr_all_user_m"
    s_dim_std_organize                    =    "dim_std_organize"

##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_dr_summary              =    "st_dr_summary"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================

#活跃用户：当月有点播或回看
#休眠用户：之前有点播或回看，近三个月没有
#新增用户：之前三个月没有，当月有
#回流用户：之前有，近三个月没有，当月有

#当月点播回看情况
    hsql='''
insert overwrite table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
select 
       OWN_CORP_STD_ORG_CODE
       ,null OWN_CORP_STD_ORG_NAME
       ,null TOTAL_USER_COUNT
       ,count(distinct user_id) ACTIVE_USER_COUNT
       ,null DORMANT_USER_COUNT
       ,null DR_NEW_USER_COUNT
       ,null DR_BACK_USER_COUNT
       ,count(distinct case when a.DATA_SOURCE_CD <> 'VOD' then user_id else null end) DR_USER_COUNT
       ,null DR_USER_PRO
       ,sum(case when a.DATA_SOURCE_CD <> 'VOD' then 1 else 0 end) DR_COUNT
       ,null DR_PER_COUNT
       ,null DR_YEAR_GROWTH
       ,null DR_MONTH_GROWTH
       ,null DR_PER_YEAR_GROWTH
       ,null DR_PER_MONTH_GROWTH
       ,null LB_NEW_USER_COUNT
       ,null LB_BACK_USER_COUNT
       ,count(distinct case when a.DATA_SOURCE_CD = 'VOD' then user_id else null end) LB_USER_COUNT
       ,null LB_USER_PRO
       ,sum(case when a.DATA_SOURCE_CD = 'VOD' then 1 else 0 end) LB_COUNT
       ,null LB_PER_COUNT
       ,null LB_YEAR_GROWTH
       ,null LB_MONTH_GROWTH
       ,null LB_PER_YEAR_TROWTH
       ,null LB_PER_MONTH_TROWTH
       ,null ETL_DATE
from %(s_dwd_dr_ismp)s a
where pt_mon = %(ARG_OPTIME_LAST1_M)s
and OWN_CORP_STD_ORG_CODE is not null
and OWN_CORP_STD_ORG_CODE <> ''
group by OWN_CORP_STD_ORG_CODE
            '''% vars()
    QueryExe(hsql,name,dates)


#休眠用户：之前有点播或回看，近三个月没有
    hsql='''
     insert into table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
     select 
             a.OWN_CORP_STD_ORG_CODE
             ,null OWN_CORP_STD_ORG_NAME
             ,null TOTAL_USER_COUNT
             ,null ACTIVE_USER_COUNT
             ,count(distinct a.user_id) DORMANT_USER_COUNT
             ,null DR_NEW_USER_COUNT
             ,null DR_BACK_USER_COUNT
             ,null DR_USER_COUNT
             ,null DR_USER_PRO
             ,null DR_COUNT
             ,null DR_PER_COUNT
             ,null DR_YEAR_GROWTH
             ,null DR_MONTH_GROWTH
             ,null DR_PER_YEAR_GROWTH
             ,null DR_PER_MONTH_GROWTH
             ,null LB_NEW_USER_COUNT
             ,null LB_BACK_USER_COUNT
             ,null LB_USER_COUNT
             ,null LB_USER_PRO
             ,null LB_COUNT
             ,null LB_PER_COUNT
             ,null LB_YEAR_GROWTH
             ,null LB_MONTH_GROWTH
             ,null LB_PER_YEAR_TROWTH
             ,null LB_PER_MONTH_TROWTH
             ,null ETL_DATE
     from %(s_dwa_dr_all_user_m)s a
     left join (select distinct user_id from %(s_dwa_dr_all_user_m)s
                 where pt_mon >= %(ARG_OPTIME_LAST3_M)s
                   and pt_mon <= %(ARG_OPTIME_LAST1_M)s 
                   and (is_dr_thism=1 or is_lb_thism=1)) b
     on a.user_id = b.user_id
     where a.pt_mon = %(ARG_OPTIME_LAST4_M)s
     and a.OWN_CORP_STD_ORG_CODE is not null
     and a.OWN_CORP_STD_ORG_CODE <> ''
     and (a.is_dr = 1 or a.is_lb = 1) --之前有
     and b.user_id is null --近三个月没有
     group by OWN_CORP_STD_ORG_CODE
            '''% vars()
    QueryExe(hsql,name,dates)


#新增用户：之前三个月没有，当月有
#回流用户：之前有，近三个月没有，当月有
    hsql='''
        insert into table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
        select 
              a.OWN_CORP_STD_ORG_CODE
              ,null OWN_CORP_STD_ORG_NAME
              ,null TOTAL_USER_COUNT
              ,null ACTIVE_USER_COUNT
              ,null DORMANT_USER_COUNT
              ,count(case when a.is_dr_thism = 1 and coalesce(b.is_dr,0) = 0 then 1 else 0 end) DR_NEW_USER_COUNT
              ,count(case when a.is_dr_thism = 1 and coalesce(b.is_dr,0) = 0 and c.is_dr = 1 then 1 else 0 end) DR_BACK_USER_COUNT
              ,null DR_USER_COUNT
              ,null DR_USER_PRO
              ,null DR_COUNT
              ,null DR_PER_COUNT
              ,null DR_YEAR_GROWTH
              ,null DR_MONTH_GROWTH
              ,null DR_PER_YEAR_GROWTH
              ,null DR_PER_MONTH_GROWTH
              ,count(case when a.is_lb_thism = 1 and coalesce(b.is_lb,0) = 0 then 1 else 0 end) LB_NEW_USER_COUNT
              ,count(case when a.is_lb_thism = 1 and coalesce(b.is_lb,0) = 0 and c.is_lb = 1 then 1 else 0 end) LB_BACK_USER_COUNT
              ,null LB_USER_COUNT
              ,null LB_USER_PRO
              ,null LB_COUNT
              ,null LB_PER_COUNT
              ,null LB_YEAR_GROWTH
              ,null LB_MONTH_GROWTH
              ,null LB_PER_YEAR_TROWTH
              ,null LB_PER_MONTH_TROWTH
              ,null ETL_DATE
       from %(s_dwa_dr_all_user_m)s a
       left join (select user_id
                         ,max(is_dr_thism) as is_dr
                         ,max(is_lb_thism) as is_lb
                    from %(s_dwa_dr_all_user_m)s
                   where pt_mon >= %(ARG_OPTIME_LAST4_M)s
                     and pt_mon <= %(ARG_OPTIME_LAST2_M)s
                   group by user_id) b
       on a.user_id = b.user_id
       left join (select user_id
                         ,is_dr
                         ,is_lb
                    from %(s_dwa_dr_all_user_m)s
                   where pt_mon = %(ARG_OPTIME_LAST5_M)s
                   ) c
       on a.user_id = c.user_id
       where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
       and a.OWN_CORP_STD_ORG_CODE is not null
       and a.OWN_CORP_STD_ORG_CODE <> ''
       group by OWN_CORP_STD_ORG_CODE
                   '''% vars()
    QueryExe(hsql,name,dates)


#总用户数
    hsql='''
           insert into table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
           select 
                   OWN_CORP_STD_ORG_CODE
                   ,null OWN_CORP_STD_ORG_NAME
                   ,count(distinct user_id) TOTAL_USER_COUNT
                   ,null ACTIVE_USER_COUNT
                   ,null DORMANT_USER_COUNT
                   ,null DR_NEW_USER_COUNT
                   ,null DR_BACK_USER_COUNT
                   ,null DR_USER_COUNT
                   ,null DR_USER_PRO
                   ,null DR_COUNT
                   ,null DR_PER_COUNT
                   ,null DR_YEAR_GROWTH
                   ,null DR_MONTH_GROWTH
                   ,null DR_PER_YEAR_GROWTH
                   ,null DR_PER_MONTH_GROWTH
                   ,null LB_NEW_USER_COUNT
                   ,null LB_BACK_USER_COUNT
                   ,null LB_USER_COUNT
                   ,null LB_USER_PRO
                   ,null LB_COUNT
                   ,null LB_PER_COUNT
                   ,null LB_YEAR_GROWTH
                   ,null LB_MONTH_GROWTH
                   ,null LB_PER_YEAR_TROWTH
                   ,null LB_PER_MONTH_TROWTH
                   ,null ETL_DATE
           from %(s_dwa_dr_all_user_m)s
           where pt_mon = %(ARG_OPTIME_LAST1_M)s
           and OWN_CORP_STD_ORG_CODE <> ''
           and OWN_CORP_STD_ORG_CODE is not null
           group by OWN_CORP_STD_ORG_CODE
            '''% vars()
    QueryExe(hsql,name,dates)


#地区级
    hsql='''
          insert into table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
          select
                  b.P_STD_ORG_CODE
                  ,null OWN_CORP_STD_ORG_NAME
                  ,sum(TOTAL_USER_COUNT)
                  ,sum(ACTIVE_USER_COUNT)
                  ,sum(DORMANT_USER_COUNT)
                  ,sum(DR_NEW_USER_COUNT)
                  ,sum(DR_BACK_USER_COUNT)
                  ,sum(DR_USER_COUNT)
                  ,sum(DR_USER_PRO)
                  ,sum(DR_COUNT)
                  ,sum(DR_PER_COUNT)
                  ,sum(DR_YEAR_GROWTH)
                  ,sum(DR_MONTH_GROWTH)
                  ,sum(DR_PER_YEAR_GROWTH)
                  ,sum(DR_PER_MONTH_GROWTH)
                  ,sum(LB_NEW_USER_COUNT)
                  ,sum(LB_BACK_USER_COUNT)
                  ,sum(LB_USER_COUNT)
                  ,sum(LB_USER_PRO)
                  ,sum(LB_COUNT)
                  ,sum(LB_PER_COUNT)
                  ,sum(LB_YEAR_GROWTH)
                  ,sum(LB_MONTH_GROWTH)
                  ,sum(LB_PER_YEAR_TROWTH)
                  ,sum(LB_PER_MONTH_TROWTH)
                  ,null ETL_DATE
          from %(t_st_dr_summary)s a
          inner join (select distinct STD_ORG_CODE,STD_ORG_NAME,P_STD_ORG_CODE from %(s_dim_std_organize)s) b
          on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
          where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
          group by b.P_STD_ORG_CODE
            '''% vars()
    QueryExe(hsql,name,dates)


#省级
    hsql='''
          insert into table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
          select
                 '10' OWN_CORP_STD_ORG_CODE
                 ,null OWN_CORP_STD_ORG_NAME
                 ,sum(TOTAL_USER_COUNT)
                 ,sum(ACTIVE_USER_COUNT)
                 ,sum(DORMANT_USER_COUNT)
                 ,sum(DR_NEW_USER_COUNT)
                 ,sum(DR_BACK_USER_COUNT)
                 ,sum(DR_USER_COUNT)
                 ,sum(DR_USER_PRO)
                 ,sum(DR_COUNT)
                 ,sum(DR_PER_COUNT)
                 ,sum(DR_YEAR_GROWTH)
                 ,sum(DR_MONTH_GROWTH)
                 ,sum(DR_PER_YEAR_GROWTH)
                 ,sum(DR_PER_MONTH_GROWTH)
                 ,sum(LB_NEW_USER_COUNT)
                 ,sum(LB_BACK_USER_COUNT)
                 ,sum(LB_USER_COUNT)
                 ,sum(LB_USER_PRO)
                 ,sum(LB_COUNT)
                 ,sum(LB_PER_COUNT)
                 ,sum(LB_YEAR_GROWTH)
                 ,sum(LB_MONTH_GROWTH)
                 ,sum(LB_PER_YEAR_TROWTH)
                 ,sum(LB_PER_MONTH_TROWTH)
                 ,null ETL_DATE
          from %(t_st_dr_summary)s a
          left join (select distinct STD_ORG_CODE,STD_ORG_NAME,P_STD_ORG_CODE from %(s_dim_std_organize)s) b
          on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
          where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
          and length(a.OWN_CORP_STD_ORG_CODE) = 6
            '''% vars()
    QueryExe(hsql,name,dates)


#重新插入：汇总数据，计算占比同比环比
    hsql='''
         insert overwrite table %(t_st_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
         select
              a.OWN_CORP_STD_ORG_CODE
              ,b.STD_ORG_NAME OWN_CORP_STD_ORG_NAME
              ,nvl(round(sum(a.TOTAL_USER_COUNT)),0)
              ,nvl(round(sum(a.ACTIVE_USER_COUNT)),0)
              ,nvl(round(sum(a.DORMANT_USER_COUNT)),0)
              ,nvl(round(sum(a.DR_NEW_USER_COUNT)),0)
              ,nvl(round(sum(a.DR_BACK_USER_COUNT)),0)
              ,nvl(round(sum(a.DR_USER_COUNT)),0)
              ,nvl(if(sum(a.TOTAL_USER_COUNT)=0,0,round(sum(a.DR_USER_COUNT)/sum(a.TOTAL_USER_COUNT)*100,4)),0) AS DR_USER_PRO
              ,nvl(round(sum(a.DR_COUNT)),0)
              ,nvl(if(sum(a.DR_USER_COUNT)=0,0,round(sum(a.DR_COUNT)/sum(a.DR_USER_COUNT),2)),0) AS DR_PER_COUNT
              ,if(nvl(round(sum(t3.DR_COUNT)),0) = 0, 0, (nvl(round(sum(a.DR_COUNT)),0)-nvl(round(sum(t3.DR_COUNT)),0))/nvl(round(sum(t3.DR_COUNT)),0)  ) AS DR_YEAR_GROWTH
              ,if(nvl(round(sum(t2.DR_COUNT)),0) = 0, 0, (nvl(round(sum(a.DR_COUNT)),0)-nvl(round(sum(t2.DR_COUNT)),0))/nvl(round(sum(t2.DR_COUNT)),0)  ) AS DR_MONTH_GROWTH
              ,if(nvl(round(sum(t3.DR_PER_COUNT)),0) = 0, 0, (nvl(if(sum(a.DR_USER_COUNT)=0,0,round(sum(a.DR_COUNT)/sum(a.DR_USER_COUNT),2)),0) - nvl(round(sum(t3.DR_COUNT)),0)) / nvl(round(sum(t3.DR_PER_COUNT)),0)  ) AS DR_PER_YEAR_GROWTH
              ,if(nvl(round(sum(t2.DR_PER_COUNT)),0) = 0, 0, (nvl(if(sum(a.DR_USER_COUNT)=0,0,round(sum(a.DR_COUNT)/sum(a.DR_USER_COUNT),2)),0) - nvl(round(sum(t2.DR_COUNT)),0)) / nvl(round(sum(t2.DR_PER_COUNT)),0)  ) AS DR_PER_MONTH_GROWTH
              ,nvl(round(sum(a.LB_NEW_USER_COUNT)),0)
              ,nvl(round(sum(a.LB_BACK_USER_COUNT)),0)
              ,nvl(round(sum(a.LB_USER_COUNT)),0)
              ,nvl(if(sum(a.TOTAL_USER_COUNT)=0,0,round(sum(a.LB_USER_COUNT)/sum(a.TOTAL_USER_COUNT)*100,4)),0) AS LB_USER_PRO
              ,nvl(round(sum(a.LB_COUNT)),0)
              ,nvl(if(sum(a.LB_USER_COUNT)=0,0,round(sum(a.LB_COUNT)/sum(a.LB_USER_COUNT),2)),0) AS LB_PER_COUNT
              ,if(nvl(round(sum(t3.LB_COUNT)),0) = 0, 0, (nvl(round(sum(a.LB_COUNT)),0)-nvl(round(sum(t3.LB_COUNT)),0))/nvl(round(sum(t3.LB_COUNT)),0)  ) AS LB_YEAR_GROWTH
              ,if(nvl(round(sum(t2.LB_COUNT)),0) = 0, 0, (nvl(round(sum(a.LB_COUNT)),0)-nvl(round(sum(t2.LB_COUNT)),0))/nvl(round(sum(t2.LB_COUNT)),0)  ) AS LB_MONTH_GROWTH
              ,if(nvl(round(sum(t3.LB_PER_COUNT)),0) = 0, 0, (nvl(if(sum(a.LB_USER_COUNT)=0,0,round(sum(a.LB_COUNT)/sum(a.LB_USER_COUNT),2)),0) - nvl(round(sum(t3.LB_COUNT)),0)) / nvl(round(sum(t3.LB_PER_COUNT)),0)  ) AS LB_PER_YEAR_GROWTH
              ,if(nvl(round(sum(t2.LB_PER_COUNT)),0) = 0, 0, (nvl(if(sum(a.LB_USER_COUNT)=0,0,round(sum(a.LB_COUNT)/sum(a.LB_USER_COUNT),2)),0) - nvl(round(sum(t2.LB_COUNT)),0)) / nvl(round(sum(t2.LB_PER_COUNT)),0)  ) AS LB_PER_MONTH_GROWTH
              ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') AS ETL_DATE
         from %(t_st_dr_summary)s a
         left join (select distinct STD_ORG_CODE,STD_ORG_NAME,P_STD_ORG_CODE from %(s_dim_std_organize)s) b
                on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
         left join %(t_st_dr_summary)s t2 on a.own_corp_std_org_code=t2.own_corp_std_org_code
               and a.own_corp_std_org_name=t2.own_corp_std_org_name
               and t2.pt_mon=%(ARG_OPTIME_LAST2MONTH)s
         left join %(t_st_dr_summary)s t3 on a.own_corp_std_org_code=t3.own_corp_std_org_code
               and a.own_corp_std_org_name=t3.own_corp_std_org_name
               and t3.pt_mon=%(ARG_OPTIME_LASTYEAR1MON)s
         where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
         group by a.OWN_CORP_STD_ORG_CODE
                 ,b.STD_ORG_NAME
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

