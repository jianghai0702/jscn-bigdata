##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST用户收视行为标签表
# Pay:ST_USER_VIEW_BEH_M.py
# Purpose:
#
# Author:      zhoush
#
# Created:     27-12-2017
# Copyright:   (c) zhoush 2017
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
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
    s_dwa_user_tv_channel_m           =    "dwa_user_tv_channel_m"
    s_dwa_user_tv_time_m              =    "dwa_user_tv_time_m"
    s_dwa_user_review_channel_m       =    "dwa_user_review_channel_m"
    s_dwa_user_review_time_m          =    "dwa_user_review_time_m"
    s_dwa_user_vod_time_m             =    "dwa_user_vod_time_m"
    s_dwa_user_view_m                 =    "dwa_user_view_m"
    s_dwd_fact_ins_prod               =    "dwd_fact_ins_prod"
    s_dim_std_organize                =    "dim_std_organize"
    s_dwa_user_view_beh_m             =    "dwa_user_view_beh_m"
    s_dwa_cust_feat_dtl_m             =    "dwa_cust_feat_dtl_m"
    
    s_tmp_st_user_view_beh_m1         =    "tmp_st_user_view_beh_m1"
    s_tmp_st_user_view_beh_m2         =    "tmp_st_user_view_beh_m2"
    s_tmp_st_user_view_beh_m3         =    "tmp_st_user_view_beh_m3"
    s_tmp_st_user_view_beh_m4         =    "tmp_st_user_view_beh_m4"
    s_tmp_st_user_view_beh_m5         =    "tmp_st_user_view_beh_m5"
    s_tmp_st_user_view_beh_m6         =    "tmp_st_user_view_beh_m6"
    s_tmp_st_user_view_beh_m7         =    "tmp_st_user_view_beh_m7"
    s_tmp_st_user_view_beh_m8         =    "tmp_st_user_view_beh_m8"
    s_tmp_st_user_view_beh_m9         =    "tmp_st_user_view_beh_m9"    

##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_user_view_beh_m              =    "st_user_view_beh_m"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#存放直播总观看次数TOP1,TOP2,TOP3,TOP4,TOP5频道名称、平均观看次数、最大观看次数数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m1)s
            (
             own_corp_std_org_code string,
             channel_name string,
             tv_num_total string,
             avg_tv_count string,
             max_tv_num string,
             order_id string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m1)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成数据
    hsql='''insert overwrite table %(s_tmp_st_user_view_beh_m1)s 
            select 
              t3.own_corp_std_org_code,
              t3.channel_name ,
              t3.tv_num_total,
              round(t3.tv_num_total/t3.tv_user_count,2) avg_tv_count,
              t3.max_tv_num,
              t3.order_id 
            from 
            (select
               coalesce(t3.std_org_code,t3.p_std_org_code,'10') as own_corp_std_org_code,
               t1.channel_name channel_name,
               sum(t1.tv_num) tv_num_total,
               count(distinct t1.prod_inst_id) tv_user_count,
               max(cast(t1.tv_num as int)) max_tv_num,
               row_number() over(distribute by coalesce(t3.std_org_code,t3.p_std_org_code,'10') sort by cast(sum(t1.tv_num) as int) desc) order_id 
            from %(s_dwa_user_tv_channel_m)s t1
            inner join %(s_dwd_fact_ins_prod)s t2
            on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            inner join %(s_dim_std_organize)s t3
            on t2.own_corp_std_org_code = t3.std_org_code
            where t1.pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
            group by channel_name,t3.std_org_code,t3.p_std_org_code 
            grouping sets (
                  (channel_name,t3.std_org_code,t3.p_std_org_code),
                  (channel_name,t3.p_std_org_code),
                  (channel_name)
                  )
) t3

    '''% vars()
    QueryExe(hsql,name,dates)

#存放回看总观看次数TOP1,TOP2,TOP3,TOP4,TOP5频道名称、平均观看次数、最大观看次数数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m2)s
            (
             own_corp_std_org_code string,
             channel_name string,
             review_num_total string,
             avg_review_count string,
             max_review_num string,
             order_id string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m2)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成数据
    hsql='''insert overwrite table %(s_tmp_st_user_view_beh_m2)s 
            select 
              t3.own_corp_std_org_code,
              t3.channel_name ,
              t3.review_num_total,
              round(t3.review_num_total/t3.review_user_count,2) avg_review_count,
              t3.max_review_num,
              t3.order_id 
            from 
            (select
               coalesce(t3.std_org_code,t3.p_std_org_code,'10') as own_corp_std_org_code ,
               t1.channel_name ,
               sum(t1.review_num) review_num_total,
               count(distinct t1.prod_inst_id) review_user_count,
               max(cast(review_num as int)) max_review_num,
               row_number() over(distribute by coalesce(t3.std_org_code,t3.p_std_org_code,'10') sort by cast(sum(t1.review_num) as int) desc) order_id 
            from %(s_dwa_user_review_channel_m)s t1
            inner join %(s_dwd_fact_ins_prod)s t2
            on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            inner join %(s_dim_std_organize)s t3
            on t2.own_corp_std_org_code = t3.std_org_code
            where t1.pt_mon between %(ARG_OPTIME_LAST3_M)s and  %(ARG_OPTIME_LAST1_M)s
            group by channel_name,t3.p_std_org_code,t3.std_org_code
            grouping sets (
                  (channel_name,t3.p_std_org_code,t3.std_org_code),
                  (channel_name,t3.p_std_org_code),
                  (channel_name)
                  )
) t3
    '''% vars()
    QueryExe(hsql,name,dates)



# 存放近三月直播时段数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m4)s
            (
                prod_inst_id   string,
                holiday_type   string,
                time_bucket    string,
                tv_num         string,
                tv_time        string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m4)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

# 
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m4)s
            select
                prod_inst_id   
                ,holiday_type   
                ,time_bucket    
                ,sum(tv_num)
                ,sum(tv_time)   
            from %(s_dwa_user_tv_time_m)s 
            where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
            group by prod_inst_id,holiday_type,time_bucket
    ''' % vars()
    QueryExe(hsql,name,dates)


# 统计分公司直播时段情况
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m7)s
            (
             own_corp_std_org_code string,
             own_corp_std_org_name string,
             holiday_tv_count1 string,
             avg_holiday_tv_count1 string,
             holiday_tv_count2 string,
             avg_holiday_tv_count2 string,
             holiday_tv_count3 string,
             avg_holiday_tv_count3 string,
             holiday_tv_count4 string,
             avg_holiday_tv_count4 string,
             holiday_tv_count5 string,
             avg_holiday_tv_count5 string,
             holiday_tv_count6 string,
             avg_holiday_tv_count6 string,
             holiday_tv_count7 string,
             avg_holiday_tv_count7 string,
             holiday_tv_count8 string,
             avg_holiday_tv_count8 string,
             no_holiday_tv_count1 string,
             avg_no_holiday_tv_count1 string,
             no_holiday_tv_count2 string,
             avg_no_holiday_tv_count2 string,
             no_holiday_tv_count3 string,
             avg_no_holiday_tv_count3 string,
             no_holiday_tv_count4 string,
             avg_no_holiday_tv_count4 string,
             no_holiday_tv_count5 string,
             avg_no_holiday_tv_count5 string,
             no_holiday_tv_count6 string,
             avg_no_holiday_tv_count6 string,
             no_holiday_tv_count7 string,
             avg_no_holiday_tv_count7 string,
             no_holiday_tv_count8 string,
             avg_no_holiday_tv_count8 string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m7)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
 
# 
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m7)s
            select  coalesce(t3.std_org_code,t4.std_org_code,'10'),
                    coalesce(t3.std_org_name,t4.std_org_name,'江苏有线'),
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.tv_num else 0 end ) holiday_tv_count1,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count1,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.tv_num else 0 end ) holiday_tv_count2,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count2,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.tv_num else 0 end ) holiday_tv_count3,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count3,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.tv_num else 0 end ) holiday_tv_count4,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count4,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.tv_num else 0 end ) holiday_tv_count5,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count5,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.tv_num else 0 end ) holiday_tv_count6,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count6,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.tv_num else 0 end ) holiday_tv_count7,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count7,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.tv_num else 0 end ) holiday_tv_count8,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_holiday_tv_count8,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.tv_num else 0 end ) no_holiday_tv_count1,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count1,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.tv_num else 0 end ) no_holiday_tv_count2,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count2,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.tv_num else 0 end ) no_holiday_tv_count3,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count3,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.tv_num else 0 end ) no_holiday_tv_count4,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count4,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.tv_num else 0 end ) no_holiday_tv_count5,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count5,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.tv_num else 0 end ) no_holiday_tv_count6,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count6,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.tv_num else 0 end ) no_holiday_tv_count7,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count7,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.tv_num else 0 end ) no_holiday_tv_count8,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.tv_num else 0 end )/count(distinct t1.prod_inst_id),2) avg_no_holiday_tv_count8
            from %(s_tmp_st_user_view_beh_m4)s t1
            left join %(s_dwd_fact_ins_prod)s t2
            on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            inner join %(s_dim_std_organize)s t3
            on t2.own_corp_std_org_code = t3.std_org_code
            inner join %(s_dim_std_organize)s t4
            on t3.p_std_org_code = t4.std_org_code
            group by t3.std_org_code,t3.std_org_name,t4.std_org_code,t4.std_org_name,1 
            grouping sets (
                  (1,t3.std_org_code,t3.std_org_name,t4.std_org_code,t4.std_org_name),
                  (1,t4.std_org_code,t4.std_org_name),
                  ()
                 )
    ''' % vars()
    QueryExe(hsql,name,dates)
    

# 存放近三月回看时段数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m5)s
            (
                prod_inst_id   string,
                holiday_type   string,
                time_bucket    string,
                review_num         string,
                review_time        string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m5)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m5)s
            select
                prod_inst_id   
                ,holiday_type   
                ,time_bucket    
                ,sum(review_num)
                ,sum(review_time)   
            from %(s_dwa_user_review_time_m)s 
            where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
            group by prod_inst_id,holiday_type,time_bucket
    ''' % vars()
    QueryExe(hsql,name,dates)

# 统计分公司回看时段情况
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m8)s
            (
             own_corp_std_org_code string,
             own_corp_std_org_name string,
             holiday_review_count1 string,
             avg_holiday_review_count1 string,
             holiday_review_count2 string,
             avg_holiday_review_count2 string,
             holiday_review_count3 string,
             avg_holiday_review_count3 string,
             holiday_review_count4 string,
             avg_holiday_review_count4 string,
             holiday_review_count5 string,
             avg_holiday_review_count5 string,
             holiday_review_count6 string,
             avg_holiday_review_count6 string,
             holiday_review_count7 string,
             avg_holiday_review_count7 string,
             holiday_review_count8 string,
             avg_holiday_review_count8 string,
             nholiday_review_count1 string,
             avg_nholiday_review_count1 string,
             nholiday_review_count2 string,
             avg_nholiday_review_count2 string,
             nholiday_review_count3 string,
             avg_nholiday_review_count3 string,
             nholiday_review_count4 string,
             avg_nholiday_review_count4 string,
             nholiday_review_count5 string,
             avg_nholiday_review_count5 string,
             nholiday_review_count6 string,
             avg_nholiday_review_count6 string,
             nholiday_review_count7 string,
             avg_nholiday_review_count7 string,
             nholiday_review_count8 string,
             avg_nholiday_review_count8 string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m8)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
 
# 
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m8)s
            select  t3.std_org_code,
                    t3.std_org_name,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.review_num else 0 end) holiday_review_count1,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count1,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.review_num else 0 end) holiday_review_count2,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count2,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.review_num else 0 end) holiday_review_count3,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count3,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.review_num else 0 end) holiday_review_count4,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count4,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.review_num else 0 end) holiday_review_count5,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count5,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.review_num else 0 end) holiday_review_count6,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count6,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.review_num else 0 end) holiday_review_count7,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count7,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.review_num else 0 end) holiday_review_count8,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_review_count8,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.review_num else 0 end) nholiday_review_count1,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count1,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.review_num else 0 end) nholiday_review_count2,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count2,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.review_num else 0 end) nholiday_review_count3,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count3,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.review_num else 0 end) nholiday_review_count4,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count4,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.review_num else 0 end) nholiday_review_count5,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count5,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.review_num else 0 end) nholiday_review_count6,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count6,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.review_num else 0 end) nholiday_review_count7,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count7,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.review_num else 0 end) nholiday_review_count8,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.review_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_nholiday_review_count8

            from %(s_tmp_st_user_view_beh_m5)s t1
            left join %(s_dwd_fact_ins_prod)s t2
            on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            left join %(s_dim_std_organize)s t3
            on t2.own_corp_std_org_code = t3.std_org_code
            left join %(s_dim_std_organize)s t4
            on t3.p_std_org_code = t4.std_org_code
            group by 1,t4.std_org_code,t4.std_org_name,t3.std_org_code,t3.std_org_name
            grouping sets (
                  (1,t4.std_org_code,t4.std_org_name,t3.std_org_code,t3.std_org_name),
                  (1,t4.std_org_code,t4.std_org_name),
                  ()
                  )
    ''' % vars()
    QueryExe(hsql,name,dates)
    

    
# 存放近三月点播时段数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m6)s
            (
                prod_inst_id   string,
                holiday_type   string,
                time_bucket    string,
                vod_num         string,
                vod_time        string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m6)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m6)s
            select
                prod_inst_id   
                ,holiday_type   
                ,time_bucket    
                ,sum(vod_num)
                ,sum(vod_time)   
            from %(s_dwa_user_vod_time_m)s 
            where pt_mon between %(ARG_OPTIME_LAST3_M)s and %(ARG_OPTIME_LAST1_M)s
            group by prod_inst_id,holiday_type,time_bucket
    ''' % vars()
    QueryExe(hsql,name,dates)

# 统计分公司点播时段情况
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m9)s
            (
             own_corp_std_org_code string,
             own_corp_std_org_name string,
             holiday_vod_count1 string,
             avg_holiday_vod_count1 string,
             holiday_vod_count2 string,
             avg_holiday_vod_count2 string,
             holiday_vod_count3 string,
             avg_holiday_vod_count3 string,
             holiday_vod_count4 string,
             avg_holiday_vod_count4 string,
             holiday_vod_count5 string,
             avg_holiday_vod_count5 string,
             holiday_vod_count6 string,
             avg_holiday_vod_count6 string,
             holiday_vod_count7 string,
             avg_holiday_vod_count7 string,
             holiday_vod_count8 string,
             avg_holiday_vod_count8 string,
             no_holiday_vod_count1 string,
             avg_no_holiday_vod_count1 string,
             no_holiday_vod_count2 string,
             avg_no_holiday_vod_count2 string,
             no_holiday_vod_count3 string,
             avg_no_holiday_vod_count3 string,
             no_holiday_vod_count4 string,
             avg_no_holiday_vod_count4 string,
             no_holiday_vod_count5 string,
             avg_no_holiday_vod_count5 string,
             no_holiday_vod_count6 string,
             avg_no_holiday_vod_count6 string,
             no_holiday_vod_count7 string,
             avg_no_holiday_vod_count7 string,
             no_holiday_vod_count8 string,
             avg_no_holiday_vod_count8 string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m9)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
 
# 
    hsql='''insert overwrite table  %(s_tmp_st_user_view_beh_m9)s
            select  coalesce(t3.std_org_code,t4.std_org_code,'10'),
                    coalesce(t3.std_org_name,t4.std_org_name,'江苏有线'),
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.vod_num else 0 end) holiday_vod_count1,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '凌晨' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count1,

              sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.vod_num else 0 end) holiday_vod_count2,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '早晨' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count2,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.vod_num else 0 end) holiday_vod_count3,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '上午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count3,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.vod_num else 0 end) holiday_vod_count4,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '中午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count4,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.vod_num else 0 end) holiday_vod_count5,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '下午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count5,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.vod_num else 0 end) holiday_vod_count6,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '傍晚' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count6,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.vod_num else 0 end) holiday_vod_count7,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '晚上' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count7,
              sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.vod_num else 0 end) holiday_vod_count8,
              round(sum(case when t1.holiday_type = 1 and t1.time_bucket = '午夜' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_holiday_vod_count8,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.vod_num else 0 end) no_holiday_vod_count1,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '凌晨' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count1,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.vod_num else 0 end) no_holiday_vod_count2,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '早晨' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count2,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.vod_num else 0 end) no_holiday_vod_count3,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '上午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count3,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.vod_num else 0 end) no_holiday_vod_count4,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '中午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count4,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.vod_num else 0 end) no_holiday_vod_count5,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '下午' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count5,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.vod_num else 0 end) no_holiday_vod_count6,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '傍晚' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count6,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.vod_num else 0 end) no_holiday_vod_count7,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '晚上' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count7,
              sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.vod_num else 0 end) no_holiday_vod_count8,
              round(sum(case when t1.holiday_type = 0 and t1.time_bucket = '午夜' then t1.vod_num else 0 end)/count(distinct t1.prod_inst_id),2) avg_no_holiday_vod_count8
            from %(s_tmp_st_user_view_beh_m6)s t1
            left join %(s_dwd_fact_ins_prod)s t2
            on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            inner join %(s_dim_std_organize)s t3
            on t2.own_corp_std_org_code = t3.std_org_code
            inner join %(s_dim_std_organize)s t4
            on t3.p_std_org_code = t4.std_org_code
            group by t3.std_org_code,t3.std_org_name,t4.std_org_code,t4.std_org_name,1 
            grouping sets (
                  (1,t3.std_org_code,t3.std_org_name,t4.std_org_code,t4.std_org_name),
                  (1,t4.std_org_code,t4.std_org_name),
                  ()
                 )
    ''' % vars()
    QueryExe(hsql,name,dates)


    
# 统计直播、回看、点播用户数据
    hsql='''create table if not exists %(s_tmp_st_user_view_beh_m3)s
            (
             own_corp_std_org_code string,
             own_corp_std_org_name string,
             tv_user_count string,
             no_tv_user_count string,
             review_user_count string,
             no_review_user_count string,
             vod_user_count string,
             no_vod_user_count string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_st_user_view_beh_m3)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
#
    hsql='''insert overwrite table %(s_tmp_st_user_view_beh_m3)s 
            select 
              coalesce(t3.std_org_code,t4.std_org_code,'10'),
              coalesce(t3.std_org_name,t4.std_org_name,'江苏有线'),
              count(distinct case when t1.is_before_tv = 1 then t1.prod_inst_id else null end ) tv_user_count,
              count(distinct case when t1.is_before_tv = 0 then t1.prod_inst_id else null end ) no_tv_user_count,
              count(distinct case when t1.is_before_review = 1 then t1.prod_inst_id else null end ) review_user_count,
              count(distinct case when t1.is_before_review = 0 then t1.prod_inst_id else null end ) no_review_user_count,
              count(distinct case when t1.IS_BEFORE_VOD = 1 then t1.prod_inst_id else null end ) vod_user_count,
              count(distinct case when t1.IS_BEFORE_VOD = 0 then t1.prod_inst_id else null end ) no_vod_user_count
            from %(s_dwa_user_view_beh_m)s t1
            inner join %(s_dwa_cust_feat_dtl_m)s t2
            on t1.cust_id = t2.cust_id
            and t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
            left join %(s_dim_std_organize)s t3
            on t2.corp_org_code = t3.std_org_code
            left join %(s_dim_std_organize)s t4
            on t3.p_std_org_code = t4.std_org_code
            where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
             and  t2.cust_type = 1 --剔除集团用户
            group by 1,t4.std_org_code,t4.std_org_name,t3.std_org_code,t3.std_org_name
            grouping sets (
                  (1,t4.std_org_code,t4.std_org_name,t3.std_org_code,t3.std_org_name),
                  (1,t4.std_org_code,t4.std_org_name),
                  ()
                  )
    '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成数据
    hsql='''insert overwrite table %(t_st_user_view_beh_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              t1.own_corp_std_org_code,
              t1.own_corp_std_org_name,
              t1.tv_user_count,
              t1.no_tv_user_count,
              t2.channel_name tv_channel_name_top1,
              t2.avg_tv_count top1_avg_tv_count,
              t2.max_tv_num top1_max_tv_count,
              t3.channel_name tv_channel_name_top2,
              t3.avg_tv_count top2_avg_tv_count,
              t3.max_tv_num top2_max_tv_count,
              t4.channel_name tv_channel_name_top3,
              t4.avg_tv_count top3_avg_tv_count,
              t4.max_tv_num top3_max_tv_count,
              t5.channel_name tv_channel_name_top4,
              t5.avg_tv_count top4_avg_tv_count,
              t5.max_tv_num top4_max_tv_count,
              t6.channel_name tv_channel_name_top5,
              t6.avg_tv_count top5_avg_tv_count,
              t6.max_tv_num top5_max_tv_count,
              t14.holiday_tv_count1,
              t14.avg_holiday_tv_count1,
              t14.holiday_tv_count2,
              t14.avg_holiday_tv_count2,
              t14.holiday_tv_count3,
              t14.avg_holiday_tv_count3,
              t14.holiday_tv_count4,
              t14.avg_holiday_tv_count4,
              t14.holiday_tv_count5,
              t14.avg_holiday_tv_count5,
              t14.holiday_tv_count6,
              t14.avg_holiday_tv_count6,
              t14.holiday_tv_count7,
              t14.avg_holiday_tv_count7,
              t14.holiday_tv_count8,
              t14.avg_holiday_tv_count8,
              t14.no_holiday_tv_count1,
              t14.avg_no_holiday_tv_count1,
              t14.no_holiday_tv_count2,
              t14.avg_no_holiday_tv_count2,
              t14.no_holiday_tv_count3,
              t14.avg_no_holiday_tv_count3,
              t14.no_holiday_tv_count4,
              t14.avg_no_holiday_tv_count4,
              t14.no_holiday_tv_count5,
              t14.avg_no_holiday_tv_count5,
              t14.no_holiday_tv_count6,
              t14.avg_no_holiday_tv_count6,
              t14.no_holiday_tv_count7,
              t14.avg_no_holiday_tv_count7,
              t14.no_holiday_tv_count8,
              t14.avg_no_holiday_tv_count8,
              
              t1.review_user_count,
              t1.no_review_user_count,
              t9.channel_name review_channel_name_top1,
              t9.avg_review_count top1_avg_review_count,
              t9.max_review_num  top1_max_review_count,
              t10.channel_name review_channel_name_top2,
              t10.avg_review_count top2_avg_review_count,
              t10.max_review_num top2_max_review_count,
              t11.channel_name review_channel_name_top3,
              t11.avg_review_count top3_avg_review_count,
              t11.max_review_num top3_max_review_count,
              t12.channel_name review_channel_name_top4,
              t12.avg_review_count top4_avg_review_count,
              t12.max_review_num top4_max_review_count,
              t13.channel_name review_channel_name_top5,
              t13.avg_review_count top5_avg_review_count,
              t13.max_review_num top5_max_review_count,
              t15.holiday_review_count1,
              t15.avg_holiday_review_count1,
              t15.holiday_review_count2,
              t15.avg_holiday_review_count2,
              t15.holiday_review_count3,
              t15.avg_holiday_review_count3,
              t15.holiday_review_count4,
              t15.avg_holiday_review_count4,
              t15.holiday_review_count5,
              t15.avg_holiday_review_count5,
              t15.holiday_review_count6,
              t15.avg_holiday_review_count6,
              t15.holiday_review_count7,
              t15.avg_holiday_review_count7,
              t15.holiday_review_count8,
              t15.avg_holiday_review_count8,
              t15.nholiday_review_count1,
              t15.avg_nholiday_review_count1,
              t15.nholiday_review_count2,
              t15.avg_nholiday_review_count2,
              t15.nholiday_review_count3,
              t15.avg_nholiday_review_count3,
              t15.nholiday_review_count4,
              t15.avg_nholiday_review_count4,
              t15.nholiday_review_count5,
              t15.avg_nholiday_review_count5,
              t15.nholiday_review_count6,
              t15.avg_nholiday_review_count6,
              t15.nholiday_review_count7,
              t15.avg_nholiday_review_count7,
              t15.nholiday_review_count8,
              t15.avg_nholiday_review_count8,
              
              t1.vod_user_count,
              t1.no_vod_user_count,
              t16.holiday_vod_count1,
              t16.avg_holiday_vod_count1,
              t16.holiday_vod_count2,
              t16.avg_holiday_vod_count2,
              t16.holiday_vod_count3,
              t16.avg_holiday_vod_count3,
              t16.holiday_vod_count4,
              t16.avg_holiday_vod_count4,
              t16.holiday_vod_count5,
              t16.avg_holiday_vod_count5,
              t16.holiday_vod_count6,
              t16.avg_holiday_vod_count6,
              t16.holiday_vod_count7,
              t16.avg_holiday_vod_count7,
              t16.holiday_vod_count8,
              t16.avg_holiday_vod_count8,
              t16.no_holiday_vod_count1,
              t16.avg_no_holiday_vod_count1,
              t16.no_holiday_vod_count2,
              t16.avg_no_holiday_vod_count2,
              t16.no_holiday_vod_count3,
              t16.avg_no_holiday_vod_count3,
              t16.no_holiday_vod_count4,
              t16.avg_no_holiday_vod_count4,
              t16.no_holiday_vod_count5,
              t16.avg_no_holiday_vod_count5,
              t16.no_holiday_vod_count6,
              t16.avg_no_holiday_vod_count6,
              t16.no_holiday_vod_count7,
              t16.avg_no_holiday_vod_count7,
              t16.no_holiday_vod_count8,
              t16.avg_no_holiday_vod_count8,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_tmp_st_user_view_beh_m3)s t1
            left join %(s_tmp_st_user_view_beh_m7)s t14
            on t1.own_corp_std_org_code = t14.own_corp_std_org_code
            left join %(s_tmp_st_user_view_beh_m8)s t15
            on t1.own_corp_std_org_code = t15.own_corp_std_org_code
            left join %(s_tmp_st_user_view_beh_m9)s t16
            on t1.own_corp_std_org_code = t16.own_corp_std_org_code

            left join %(s_tmp_st_user_view_beh_m1)s t2
            on t2.own_corp_std_org_code = t1.own_corp_std_org_code and t2.order_id=1
            left join %(s_tmp_st_user_view_beh_m1)s t3
            on t3.own_corp_std_org_code = t1.own_corp_std_org_code and t3.order_id=2
            left join %(s_tmp_st_user_view_beh_m1)s t4
            on t4.own_corp_std_org_code = t1.own_corp_std_org_code and t4.order_id=3
            left join %(s_tmp_st_user_view_beh_m1)s t5
            on t5.own_corp_std_org_code = t1.own_corp_std_org_code and t5.order_id=4
            left join %(s_tmp_st_user_view_beh_m1)s t6
            on t6.own_corp_std_org_code = t1.own_corp_std_org_code and t6.order_id=5
            left join %(s_tmp_st_user_view_beh_m2)s t9
            on t9.own_corp_std_org_code = t1.own_corp_std_org_code and t9.order_id = 1
            left join %(s_tmp_st_user_view_beh_m2)s t10
            on t10.own_corp_std_org_code = t1.own_corp_std_org_code and t10.order_id = 2
            left join %(s_tmp_st_user_view_beh_m2)s t11
            on t11.own_corp_std_org_code = t1.own_corp_std_org_code and t11.order_id = 3
            left join %(s_tmp_st_user_view_beh_m2)s t12
            on t12.own_corp_std_org_code = t1.own_corp_std_org_code and t12.order_id = 4
            left join %(s_tmp_st_user_view_beh_m2)s t13
            on t13.own_corp_std_org_code = t1.own_corp_std_org_code and t13.order_id = 5
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
