##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST宽带用户发展统计（月）      
# Pay: ST_LAN_USER_DEV_M.py
# Purpose: 统计宽带用户存量、新增、流失情况
# 
# Author:      wangxx
#
# Created:     2018-9-11
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
#
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
if len(sys.argv) > 1 :
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
#时间参数引入
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_MEND     = dicts['ARG_OPTIME_LAST2_MEND']        #获得传入的数据日期的所在上两个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2_MEND_ISO = dicts['ARG_OPTIME_LAST2_MEND_ISO']    #获得传入的数据日期的所在上两个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_MEND        = dicts['ARG_OPTIME_LAST3_MEND']          #获得传入的数据日期的所在上三个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3_MEND_ISO    = dicts['ARG_OPTIME_LAST3_MEND_ISO']      #获得传入的数据日期的所在上三个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期

    ARG_OPTIME_LAST2MON01      = dicts['ARG_OPTIME_LAST2MON01']         # 获得传入的数据日期的上2月第一天 yyyymmdd 格式的数据日期
    ARG_OPTIME_LAST2MON01_ISO  = dicts['ARG_OPTIME_LAST2MON01_ISO']     # 获得传入的数据日期的上2月第一天 yyyy-mm-dd 格式的数据日期

#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     

    s_dwa_fact_ins_prod_mon                =    "dwa_fact_ins_prod_mon"
    s_dim_std_organize                     =    "dim_std_organize"
    s_temp_st_lan_user_dev_m1              =    "s_temp_st_lan_user_dev_m1"
    s_temp_st_lan_user_dev_m2              =    "s_temp_st_lan_user_dev_m2"
    s_temp_st_lan_user_dev_m3              =    "s_temp_st_lan_user_dev_m3"

##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 

    t_st_lan_user_dev_m                    =    "st_lan_user_dev_m"    

##===========================================================================       
##创建临时表                                                                       
##===========================================================================

# 存放存量用户统计

    hsql='''create table if not exists %(s_temp_st_lan_user_dev_m1)s  (
        STD_ORG_CODE    varchar(6),
        LAN_USER_COUNT  decimal(16,0),
        LAN_PAID_USER_COUNT  decimal(16,0),
        LANONLY_USER_COUNT    decimal(16,0),
        LANONLY_PAID_USER_COUNT    decimal(16,0)
    )
    STORED AS ORCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_dev_m1)s'
            '''% vars()
    QueryExe(hsql,name,dates)

# 存放新增用户统计

    hsql='''create table if not exists %(s_temp_st_lan_user_dev_m2)s  (
        STD_ORG_CODE    varchar(6),
        NEW_LAN_USER_COUNT    decimal(16,0),
        NEW_LAN_PAID_USER_COUNT    decimal(16,0),
        NEW_LANONLY_USER_COUNT    decimal(16,0),
        NEW_LANONLY_PAID_USER_COUNT    decimal(16,0)
    )
    STORED AS ORCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_dev_m2)s'
            '''% vars()
    QueryExe(hsql,name,dates)

# 存放流失用户统计

    hsql='''create table if not exists %(s_temp_st_lan_user_dev_m3)s  (
        STD_ORG_CODE    varchar(6),
        LOSE_LAN_USER_COUNT    decimal(16,0),
        LOSE_LAN_PAID_USER_COUNT    decimal(16,0),
        LOSE_LANONLY_USER_COUNT    decimal(16,0),
        LOSE_LANONLY_PAID_USER_COUNT    decimal(16,0)
    )
    STORED AS ORCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_dev_m3)s'
            '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##数据处理                                                       
##===========================================================================
#先生成 临时中间表数据


# 统计存量用户

    hsql='''insert overwrite table  %(s_temp_st_lan_user_dev_m1)s
            select t1.own_corp_std_org_code,
                   count(distinct case when t1.is_valid1 = 1 then t1.prod_inst_id else null end) as LAN_USER_COUNT,
                   count(distinct case when t1.is_paid = 1 then t1.prod_inst_id else null end) as LAN_PAID_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_valid1 = 1 then t1.prod_inst_id else null end) as LANONLY_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_paid = 1 then t1.prod_inst_id else null end) as LANONLY_PAID_USER_COUNT
              from %(s_dwa_fact_ins_prod_mon)s t1
            left join %(s_dwa_fact_ins_prod_mon)s t2             -- 统计同客户中含有效数字电视用户的用户数
                on t1.cust_id = t2.cust_id 
               and t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
               and t2.is_dtv = 1 
             where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
               and t1.is_lan = 1
            group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)

# 统计新增用户

    hsql='''insert overwrite table %(s_temp_st_lan_user_dev_m2)s
            select t1.own_corp_std_org_code,
                   count(distinct case when t1.is_valid1 = 1 then t1.prod_inst_id else null end) as NEW_LAN_USER_COUNT,
                   count(distinct case when t1.is_paid = 1 then t1.prod_inst_id else null end) as NEW_LAN_PAID_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_valid1 = 1 then t1.prod_inst_id else null end) as NEW_LANONLY_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_paid = 1 then t1.prod_inst_id else null end) as NEW_LANONLY_PAID_USER_COUNT
              from %(s_dwa_fact_ins_prod_mon)s t1
            left join %(s_dwa_fact_ins_prod_mon)s t2             -- 统计同客户中含有效数字电视用户的用户数
                on t1.cust_id = t2.cust_id 
               and t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
               and t2.is_dtv = 1 
             where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
               and t1.is_lan = 1 
               and not exists (select 1 
                                from %(s_dwa_fact_ins_prod_mon)s l 
                               where l.pt_mon = %(ARG_OPTIME_LAST2_M)s 
                                 and l.prod_inst_id = t1.prod_inst_id 
                                 and l.is_lan = 1 
                                )
            group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)


# 统计流失用户 (上月用户)
    hsql='''insert overwrite table %(s_temp_st_lan_user_dev_m3)s
            select t1.own_corp_std_org_code,
                   count(distinct case when t1.is_valid1 = 1 then t1.prod_inst_id else null end) as LOSE_LAN_USER_COUNT,
                   count(distinct case when t1.is_paid = 1 then t1.prod_inst_id else null end) as LOSE_LAN_PAID_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_valid1 = 1 then t1.prod_inst_id else null end) as LOSE_LANONLY_USER_COUNT,
                   count(distinct case when t2.cust_id is null and t1.is_paid = 1 then t1.prod_inst_id else null end) as LOSE_LANONLY_PAID_USER_COUNT
              from %(s_dwa_fact_ins_prod_mon)s t1
            left join %(s_dwa_fact_ins_prod_mon)s t2             -- 统计同客户中含有效数字电视用户的用户数
                on t1.cust_id = t2.cust_id 
               and t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
               and t2.is_dtv = 1 
             where t1.pt_mon = %(ARG_OPTIME_LAST2_M)s
               and t1.is_lan = 1 
               and not exists (select 1 
                                from %(s_dwa_fact_ins_prod_mon)s l 
                               where l.pt_mon = %(ARG_OPTIME_LAST1_M)s 
                                 and l.prod_inst_id = t1.prod_inst_id 
                                 and l.is_lan = 1 
                               )
            group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)


# 生成目标表数据
    hsql='''insert overwrite table %(t_st_lan_user_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select %(ARG_OPTIME_LAST1_M)s as cycle_id,
                   stock.std_org_code as own_corp_std_org_code,
                   org.std_org_name   as own_corp_std_org_name,
                   stock.lan_user_count,
                   stock.lan_paid_user_count,
                   stock.LANONLY_user_count,
                   stock.LANONLY_paid_user_count,
                   coalesce(new.new_lan_user_count,0) as new_lan_user_count,
                   coalesce(new.new_lan_paid_user_count,0) as new_lan_paid_user_count,
                   coalesce(new.new_LANONLY_user_count,0) as new_LANONLY_user_count,
                   coalesce(new.new_LANONLY_paid_user_count,0) as new_LANONLY_paid_user_count,
                   coalesce(lose.lose_lan_user_count,0) as lose_lan_user_count,
                   coalesce(lose.lose_lan_paid_user_count,0) as lose_lan_paid_user_count,
                   coalesce(lose.lose_LANONLY_user_count,0) as lose_LANONLY_user_count,
                   coalesce(lose.lose_LANONLY_paid_user_count,0) as lose_LANONLY_paid_user_count,
                   current_timestamp as etl_date
              from %(s_temp_st_lan_user_dev_m1)s stock
            left join %(s_temp_st_lan_user_dev_m2)s new
                on stock.std_org_code = new.std_org_code
            left join %(s_temp_st_lan_user_dev_m3)s lose
                on stock.std_org_code = lose.std_org_code 
            left join %(s_dim_std_organize)s org
                on stock.std_org_code = org.std_org_code
              where coalesce(stock.std_org_code,'') <> ''
            '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_dwa_fact_ins_srvpkg_mon1)s''' %vars()
#    queryexe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
