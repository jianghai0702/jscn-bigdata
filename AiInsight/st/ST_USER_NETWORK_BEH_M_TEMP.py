#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST用户上网行为分析月表
# Pay:ST_USER_NETWORK_BEH_M.py
# Purpose:
#
# Author:      wangxx
#
# Created:     26-12-2017
# Copyright:   (c) wangxx 2017
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
sdate=sys.argv[1]
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
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']          #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']      #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']          #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']      #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期  
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_user_network_time_m                =    "dwa_user_network_time_m"
    s_dwa_user_network_domain_m              =    "dwa_user_network_domain_m"
    s_dwa_user_network_device_m              =    "dwa_user_network_device_m"
    s_dwd_fact_ins_prod                      =    "dwd_fact_ins_prod"
    s_dwa_user_network_beh_m                 =    "dwa_user_network_beh_m"
    s_dim_std_organize                       =    "dim_std_organize"
    
    s_tmp_st_user_network_beh_m1             =    "tmp_st_user_network_beh_m1"
    s_tmp_st_user_network_beh_m2             =    "tmp_st_user_network_beh_m2"
    s_tmp_st_user_network_beh_m3             =    "tmp_st_user_network_beh_m3"
    s_tmp_st_user_network_beh_m4             =    "tmp_st_user_network_beh_m4"
    s_tmp_st_user_network_beh_m5             =    "tmp_st_user_network_beh_m5"    
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_user_network_beh_m                 =    "st_user_network_beh_m" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================

# 存放带宽、上班族、野猫子、用户数统计。
    hsql='''create table if not exists %(s_tmp_st_user_network_beh_m1)s
            (
              std_org_code      string,
              std_org_name      string,
              total_user_count  string,
              bw_4m_user_count  string,
              bw_6m_user_count  string,
              bw_8m_user_count  string,
              bw_10m_user_count string,
              bw_20m_user_count string,
              total_net_flow    string,
              sbz_not_ymz_count  string,
              ymz_not_sbz_count  string,
              ymz_and_sbz_count  string,
              others_count      string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_st_user_network_beh_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


# 存放工作日，非工作日各时段上网次数和流量统计
    hsql='''create table if not exists %(s_tmp_st_user_network_beh_m2)s
            (
              std_org_code      string,
              std_org_name      string,
              weekday_net_num   string,
              weekday_net_flow  string,
              weekend_net_num   string,
              weekend_net_flow  string,
              weekday_lc_net_num  string,
              weekday_lc_net_flow string,
              weekday_zs_net_num  string,
              weekday_zs_net_flow string,
              weekday_sw_net_num  string,
              weekday_sw_net_flow string,
              weekday_zw_net_num  string,
              weekday_zw_net_flow string,
              weekday_xw_net_num  string,
              weekday_xw_net_flow string,
              weekday_bw_net_num  string,
              weekday_bw_net_flow string,
              weekday_ws_net_num  string,
              weekday_ws_net_flow string,
              weekday_wy_net_num  string,
              weekday_wy_net_flow string,

              weekend_lc_net_num  string,
              weekend_lc_net_flow string,
              weekend_zs_net_num  string,
              weekend_zs_net_flow string,
              weekend_sw_net_num  string,
              weekend_sw_net_flow string,
              weekend_zw_net_num  string,
              weekend_zw_net_flow string,
              weekend_xw_net_num  string,
              weekend_xw_net_flow string,
              weekend_bw_net_num  string,
              weekend_bw_net_flow string,
              weekend_ws_net_num  string,
              weekend_ws_net_flow string,
              weekend_wy_net_num  string,
              weekend_wy_net_flow string
             
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_st_user_network_beh_m2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


# 存放各设备上网时长、次数统计
    hsql='''create table if not exists %(s_tmp_st_user_network_beh_m3)s
            (
              std_org_code      string,
              std_org_name      string,
              pc_net_total_time string,
              pc_net_total_num  string,
              mobile_net_total_time string,
              mobile_net_total_num  string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_st_user_network_beh_m3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


# 存放访问网站次数排名
    hsql='''create table if not exists %(s_tmp_st_user_network_beh_m4)s
            (
              std_org_code      string,
              std_org_name      string,
              domain_name       string,
              domain_name_num   string,
              order_id          string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_st_user_network_beh_m4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


# 存放访问网站类型次数排名
    hsql='''create table if not exists %(s_tmp_st_user_network_beh_m5)s
            (
              std_org_code      string,
              std_org_name      string,
              website_type      string,
              website_type_num  string,
              order_id          string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_st_user_network_beh_m5)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

    
    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
# 生成带宽、上班族、野猫子、用户数统计。
    hsql='''insert overwrite table %(s_tmp_st_user_network_beh_m1)s
            select  t2.own_corp_std_org_code
                    ,t3.std_org_name
                    ,count(t1.prod_inst_id) as total_user_count
                    ,count(case when t1.bandwidth='4M' then t1.prod_inst_id else null end) as  bw_4m_user_count
                    ,count(case when t1.bandwidth='6M' then t1.prod_inst_id else null end) as  bw_6m_user_count
                    ,count(case when t1.bandwidth='8M' then t1.prod_inst_id else null end) as  bw_8m_user_count
                    ,count(case when t1.bandwidth='10M' then t1.prod_inst_id else null end) as  bw_10m_user_count
                    ,count(case when t1.bandwidth='20M' then t1.prod_inst_id else null end) as  bw_20m_user_count
                    ,sum(t1.total_net_flow) as total_net_flow
                    ,count(case when t1.is_shangbanzu='1' and t1.is_yemaozi='0' then t1.prod_inst_id else null end) as sbz_not_ymz_count
                    ,count(case when t1.is_yemaozi='1' and t1.is_shangbanzu='0' then t1.prod_inst_id else null end) as ymz_not_sbz_count
                    ,count(case when t1.is_shangbanzu='1' and t1.is_yemaozi='1' then t1.prod_inst_id else null end) as ymz_and_sbz_count
                    ,count(case when t1.is_shangbanzu='0' and t1.is_yemaozi='0' then t1.prod_inst_id else null end) as others_count
            from    %(s_dwa_user_network_beh_m)s t1
            inner join %(s_dwd_fact_ins_prod)s t2
            on      t1.prod_inst_id = t2.prod_inst_id
            LEFT JOIN  %(s_dim_std_organize)s t3
            ON      T2.own_corp_std_org_code = T3.std_org_code
            WHERE   t2.pt_mon = 201708
              AND   t1.pt_mon = 201801
            GROUP BY t2.own_corp_std_org_code
                    ,t3.std_org_name
         '''% vars()
    QueryExe(hsql,name,dates)    


# 生成工作日，非工作日各时段上网次数和流量统计
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_st_user_network_beh_m2)s 
            SELECT  t2.own_corp_std_org_code
                    ,t3.std_org_name
                    ,sum(case when t1.WEEK_TYPE='工作日' then t1.net_num else null end) as weekday_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' then t1.net_flow else null end) as weekday_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' then t1.net_num else null end) as weekend_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' then t1.net_flow else null end) as weekend_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='凌晨' then t1.net_num else null end) as weekday_lc_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='凌晨' then t1.net_flow else null end) as weekday_lc_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='早晨' then t1.net_num else null end) as weekday_zs_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='早晨' then t1.net_flow else null end) as weekday_zs_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='上午' then t1.net_num else null end) as weekday_sw_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='上午' then t1.net_flow else null end) as weekday_sw_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='中午' then t1.net_num else null end) as weekday_zw_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='中午' then t1.net_flow else null end) as weekday_zw_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='下午' then t1.net_num else null end) as weekday_xw_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='下午' then t1.net_flow else null end) as weekday_xw_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='傍晚' then t1.net_num else null end) as weekday_bw_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='傍晚' then t1.net_flow else null end) as weekday_bw_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='晚上' then t1.net_num else null end) as weekday_ws_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='晚上' then t1.net_flow else null end) as weekday_ws_net_flow
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='午夜' then t1.net_num else null end) as weekday_wy_net_num
                    ,sum(case when t1.WEEK_TYPE='工作日' and t1.time_bucket='午夜' then t1.net_flow else null end) as weekday_wy_net_flow


                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='凌晨' then t1.net_num else null end) as weekend_lc_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='凌晨' then t1.net_flow else null end) as weekend_lc_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='早晨' then t1.net_num else null end) as weekend_zs_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='早晨' then t1.net_flow else null end) as weekend_zs_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='上午' then t1.net_num else null end) as weekend_sw_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='上午' then t1.net_flow else null end) as weekend_sw_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='中午' then t1.net_num else null end) as weekend_zw_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='中午' then t1.net_flow else null end) as weekend_zw_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='下午' then t1.net_num else null end) as weekend_xw_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='下午' then t1.net_flow else null end) as weekend_xw_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='傍晚' then t1.net_num else null end) as weekend_bw_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='傍晚' then t1.net_flow else null end) as weekend_bw_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='晚上' then t1.net_num else null end) as weekend_ws_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='晚上' then t1.net_flow else null end) as weekend_ws_net_flow
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='午夜' then t1.net_num else null end) as weekend_wy_net_num
                    ,sum(case when t1.WEEK_TYPE='非工作日' and t1.time_bucket='午夜' then t1.net_flow else null end) as weekend_wy_net_flow
            FROM    %(s_dwa_user_network_time_m)s t1
            INNER JOIN %(s_dwd_fact_ins_prod)s t2
            ON      t1.prod_inst_id = t2.prod_inst_id
            LEFT JOIN  %(s_dim_std_organize)s t3
            ON      t2.own_corp_std_org_code = t3.std_org_code
            WHERE   t2.pt_mon = 201708
              AND   t1.pt_mon = 201801
            GROUP BY t2.own_corp_std_org_code
                     ,t3.std_org_name
         '''% vars()
    QueryExe(hsql,name,dates)    


# 生成各设备上网时长、次数统计
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_st_user_network_beh_m3)s
            SELECT  t2.own_corp_std_org_code
                    ,t3.std_org_name
                    ,sum(case when t1.device_type = '电脑' then t1.net_time else null end) as pc_net_total_time 
                    ,0 as pc_net_total_num
                    ,sum(case when t1.device_type = '移动设备' then t1.net_time else null end) as mobile_net_total_time 
                    ,0 as mobile_net_total_num 
            FROM    %(s_dwa_user_network_device_m)s t1
            INNER JOIN %(s_dwd_fact_ins_prod)s t2
            ON      t1.prod_inst_id = t2.prod_inst_id
            LEFT JOIN  %(s_dim_std_organize)s t3
            ON      t2.own_corp_std_org_code = t3.std_org_code
            WHERE   t2.pt_mon = 201708
              AND   t1.pt_mon = 201801
            GROUP BY t2.own_corp_std_org_code
                     ,t3.std_org_name
         '''% vars()
    QueryExe(hsql,name,dates)    

# 生成访问网站排名
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_st_user_network_beh_m4)s
            SELECT  t2.own_corp_std_org_code
                    ,t3.std_org_name
                    ,t1.domain_name
                    ,sum(t1.net_num) as domain_name_num
                    ,row_number() over (distribute by t2.own_corp_std_org_code,t3.std_org_name sort by sum(t1.net_num) desc)  as order_id
            FROM    %(s_dwa_user_network_domain_m)s t1
            INNER JOIN %(s_dwd_fact_ins_prod)s t2
            ON      t1.prod_inst_id = t2.prod_inst_id
            LEFT JOIN  %(s_dim_std_organize)s t3
            ON      t2.own_corp_std_org_code = t3.std_org_code
            WHERE   t2.pt_mon = 201708
              AND   t1.pt_mon = 201801
              AND   coalesce(t1.domain_name,'') <> ''
            GROUP BY t2.own_corp_std_org_code
                     ,t3.std_org_name
                     ,t1.domain_name
         '''% vars()
    QueryExe(hsql,name,dates)    

# 生成访问网站类型top5
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_st_user_network_beh_m5)s
            SELECT  t2.own_corp_std_org_code
                    ,t3.std_org_name
                    ,t1.website_type
                    ,sum(t1.net_num) as website_type_num
                    ,row_number() over (distribute by t2.own_corp_std_org_code,t3.std_org_name sort by sum(t1.net_num) desc)  as order_id
            FROM    %(s_dwa_user_network_domain_m)s t1
            INNER JOIN %(s_dwd_fact_ins_prod)s t2
            ON      t1.prod_inst_id = t2.prod_inst_id
            LEFT JOIN  %(s_dim_std_organize)s t3
            ON      t2.own_corp_std_org_code = t3.std_org_code
            WHERE   t2.pt_mon = 201708
              AND   t1.pt_mon = 201801
              AND   coalesce(t1.website_type,'') <> ''
            GROUP BY t2.own_corp_std_org_code
                     ,t3.std_org_name
                     ,t1.website_type
         '''% vars()
    QueryExe(hsql,name,dates)    



##===========================================================================       
##生成目标表数据
##===========================================================================
    hsql='''INSERT OVERWRITE TABLE %(t_st_user_network_beh_m)s PARTITION (pt_mon='201802')     
            SELECT  %(ARG_OPTIME_LAST1_M)s  as cycle_id
                    ,t1.std_org_code        as own_corp_std_org_code
                    ,t1.std_org_name        as own_corp_std_org_name
                    ,t1.total_user_count
                    ,t1.bw_4m_user_count
                    ,t1.bw_6m_user_count
                    ,t1.bw_8m_user_count
                    ,t1.bw_10m_user_count
                    ,t1.bw_20m_user_count
                    ,t1.total_net_flow
                    ,t1.sbz_not_ymz_count
                    ,t1.ymz_not_sbz_count
                    ,t1.ymz_and_sbz_count
                    ,t1.others_count
                    ,t2.weekday_net_num
                    ,t2.weekday_net_flow
                    ,t2.weekend_net_num
                    ,t2.weekend_net_flow
                    ,t2.weekday_lc_net_num  
                    ,t2.weekday_lc_net_flow 
                    ,t2.weekday_zs_net_num  
                    ,t2.weekday_zs_net_flow 
                    ,t2.weekday_sw_net_num  
                    ,t2.weekday_sw_net_flow 
                    ,t2.weekday_zw_net_num  
                    ,t2.weekday_zw_net_flow 
                    ,t2.weekday_xw_net_num  
                    ,t2.weekday_xw_net_flow 
                    ,t2.weekday_bw_net_num  
                    ,t2.weekday_bw_net_flow 
                    ,t2.weekday_ws_net_num  
                    ,t2.weekday_ws_net_flow 
                    ,t2.weekday_wy_net_num  
                    ,t2.weekday_wy_net_flow 
                    ,t2.weekend_lc_net_num  
                    ,t2.weekend_lc_net_flow 
                    ,t2.weekend_zs_net_num  
                    ,t2.weekend_zs_net_flow 
                    ,t2.weekend_sw_net_num  
                    ,t2.weekend_sw_net_flow 
                    ,t2.weekend_zw_net_num  
                    ,t2.weekend_zw_net_flow 
                    ,t2.weekend_xw_net_num  
                    ,t2.weekend_xw_net_flow 
                    ,t2.weekend_bw_net_num  
                    ,t2.weekend_bw_net_flow 
                    ,t2.weekend_ws_net_num  
                    ,t2.weekend_ws_net_flow 
                    ,t2.weekend_wy_net_num  
                    ,t2.weekend_wy_net_flow
                    ,t3.pc_net_total_time
                    ,t3.pc_net_total_num
                    ,t3.mobile_net_total_time
                    ,t3.mobile_net_total_num
                    ,t4.domain_name             as domain_name_1
                    ,t4.domain_name_num         as domain_name_num_1
                    ,t5.domain_name             as domain_name_2
                    ,t5.domain_name_num         as domain_name_num_2
                    ,t6.domain_name             as domain_name_3
                    ,t6.domain_name_num         as domain_name_num_3
                    ,t7.domain_name             as domain_name_4
                    ,t7.domain_name_num         as domain_name_num_4
                    ,t8.domain_name             as domain_name_5
                    ,t8.domain_name_num         as domain_name_num_5
                    ,t9.website_type             as website_type_1
                    ,t9.website_type_num         as website_type_num_1
                    ,t10.website_type             as website_type_2
                    ,t10.website_type_num         as website_type_num_2
                    ,t11.website_type             as website_type_3
                    ,t11.website_type_num         as website_type_num_3
                    ,t12.website_type             as website_type_4
                    ,t12.website_type_num         as website_type_num_4
                    ,t13.website_type             as website_type_5
                    ,t13.website_type_num         as website_type_num_5
                    ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss')   as etl_date

            FROM    %(s_tmp_st_user_network_beh_m1)s t1
            LEFT JOIN %(s_tmp_st_user_network_beh_m2)s t2
            ON      t1.std_org_code=t2.std_org_code
            LEFT JOIN %(s_tmp_st_user_network_beh_m3)s t3
            ON      t1.std_org_code=t3.std_org_code            
            LEFT JOIN %(s_tmp_st_user_network_beh_m4)s t4
            ON      t1.std_org_code=t4.std_org_code
            AND     T4.order_id = 1            
            LEFT JOIN %(s_tmp_st_user_network_beh_m4)s t5
            ON      t1.std_org_code=t5.std_org_code
            AND     T5.order_id = 2
            LEFT JOIN %(s_tmp_st_user_network_beh_m4)s t6
            ON      t1.std_org_code=t6.std_org_code
            AND     T6.order_id = 3            
            LEFT JOIN %(s_tmp_st_user_network_beh_m4)s t7
            ON      t1.std_org_code=t7.std_org_code
            AND     T7.order_id = 4            
            LEFT JOIN %(s_tmp_st_user_network_beh_m4)s t8
            ON      t1.std_org_code=t8.std_org_code
            AND     T8.order_id = 5

            LEFT JOIN %(s_tmp_st_user_network_beh_m5)s t9
            ON      t1.std_org_code=t9.std_org_code
            AND     T9.order_id = 1            
            LEFT JOIN %(s_tmp_st_user_network_beh_m5)s t10
            ON      t1.std_org_code=t10.std_org_code
            AND     T10.order_id = 2
            LEFT JOIN %(s_tmp_st_user_network_beh_m5)s t11
            ON      t1.std_org_code=t11.std_org_code
            AND     T11.order_id = 3            
            LEFT JOIN %(s_tmp_st_user_network_beh_m5)s t12
            ON      t1.std_org_code=t12.std_org_code
            AND     T12.order_id = 4            
            LEFT JOIN %(s_tmp_st_user_network_beh_m5)s t13
            ON      t1.std_org_code=t13.std_org_code
            AND     T13.order_id = 5

    ''' %vars()
    QueryExe(hsql,name,dates)
    

##===========================================================================       
##删除临时表                                               
##===========================================================================
    # hsql='''drop table %(s_tmp_st_user_network_beh_m1)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_st_user_network_beh_m2)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_st_user_network_beh_m3)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_st_user_network_beh_m4)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_st_user_network_beh_m5)s''' %vars()
    # QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
