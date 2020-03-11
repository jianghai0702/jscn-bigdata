##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST全量用户情况（月）      
# Pay: ST_ALL_USERS_MON.py
# Purpose: 这个表数据要取全量用户的上月情况 ，数据逻辑同续费和流失用户表
# 
# Author:      yanal
#
# Created:     2017-3-14
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
# -------------------------------
# 由于这个表是要获取本月用户的上月情况，因此：用户表基础信息取本月数据；
# 其他逻辑跟随续费和流失用户的统计逻辑
# -----------------------------
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
    s_dwa_fact_rpt_ins_prod_mon        =    "dwa_fact_rpt_ins_prod_mon"
    s_dwa_user_online_length_d         =    "dwa_user_online_length_d"
    s_dwd_dr_brd_expend                =    "dwd_dr_brd_expend"
    s_dwd_brd_auth_log                 =    "dwd_brd_auth_log"
    s_dim_std_organize                 =    "dim_std_organize"
    s_temp_st_all_users_mon1         =    "temp_st_all_users_mon1"
    s_temp_st_all_users_mon2         =    "temp_st_all_users_mon2"
    s_temp_st_all_users_mon3         =    "temp_st_all_users_mon3"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_all_users_mon                =    "st_all_users_mon"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
# 下行流量数据临时表
    hsql='''create table if not exists %(s_temp_st_all_users_mon1)s  (
        login_name           string,
        month_up_flow        double,
        month_down_flow      double
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_all_users_mon1)s'
            '''% vars()
    QueryExe(hsql,name,dates)

# 认证次数临时表
    hsql='''create table if not exists %(s_temp_st_all_users_mon2)s  (
        login_name           string,
        auth_count           int,
        auth_success_rate    double
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_all_users_mon2)s'
            '''% vars()
    QueryExe(hsql,name,dates)

# 获取上网天数和上网时长数据
    hsql='''create table if not exists %(s_temp_st_all_users_mon3)s  (
        login_name           string,
        month_online_num        int,
        month_online_duration    double,
        month_online_days        int
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_all_users_mon3)s'
            '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##数据处理                                                       
##===========================================================================
#先生成 临时中间表数据

#从认证的在线记录表取得上下行流量数据 
    hsql='''insert overwrite table %(s_temp_st_all_users_mon1)s 
            select 
            t.login_name,
            coalesce(t.month_up_flow,0) month_up_flow,
            coalesce(t.month_down_flow,0) month_down_flow
            from 
            (
            select 
            user_name as login_name           ,
            sum(acct_input_octets)/1024/1024 month_up_flow  ,
            sum(acct_output_octets)/1024/1024 month_down_flow  
            from %(s_dwd_dr_brd_expend)s t1
            where pt_time between %(ARG_OPTIME_LAST2MON01)s and %(ARG_OPTIME_LAST2_MEND)s
            and t1.acct_input_octets+t1.acct_output_octets >= 100
            group by t1.user_name
            ) t
            '''% vars()
    QueryExe(hsql,name,dates)


#从认证记录表取得 认证次数数据
    hsql='''insert overwrite table %(s_temp_st_all_users_mon2)s 
            select 
            t.login_name,
            coalesce(t2.auth_count,0) auth_count,
            (t.auth_success_count/t.auth_count_1) as auth_success_rate 
            from 
            (
                select 
                login_name           ,
                count(pt_time) as auth_count_1  ,
                sum(auth_success_count) auth_success_count
                from 
                (select pt_time,login_name,max(case when auth_result = 0 then 1 else 0 end) auth_success_count
                from %(s_dwd_brd_auth_log)s t1
                where pt_time between %(ARG_OPTIME_LAST2MON01)s and %(ARG_OPTIME_LAST2_MEND)s
                group by pt_time,login_name
                ) t1
                group by login_name
            ) t
            join 
            (
                select login_name,count(1)auth_count
                from %(s_dwd_brd_auth_log)s t1
                where pt_time between %(ARG_OPTIME_LAST2MON01)s and %(ARG_OPTIME_LAST2_MEND)s
                group by login_name
            ) t2 on t.login_name = t2.login_name
            
            '''% vars()
    QueryExe(hsql,name,dates)

# 取得上月有效上网次数和总时长数据
    hsql='''insert overwrite table %(s_temp_st_all_users_mon3)s 
            select distinct
            t1.login_name           ,
            coalesce(t3.month_online_num,0) as month_online_num  ,
            coalesce(t2.month_online_duration,0) month_online_duration,
            coalesce(t1.this_month_online_days,0) month_online_days
            from (
            select prod_inst_id from
            %(s_dwa_fact_rpt_ins_prod_mon)s
            where pt_mon=%(ARG_OPTIME_LAST1_M)s 
            ) t
            join 
            (select prod_inst_id,login_name,this_month_online_days from %(s_dwa_fact_rpt_ins_prod_mon)s 
             where pt_mon=%(ARG_OPTIME_LAST2_M)s 
            ) t1 on t.prod_inst_id = t1.prod_inst_id
            left join 
            (
            select login_name,
            sum(case when total_minutes >= 30 then total_minutes else 0 end) as month_online_duration
            from %(s_dwa_user_online_length_d)s 
            where pt_time between %(ARG_OPTIME_LAST2MON01)s and %(ARG_OPTIME_LAST2_MEND)s
            group by login_name
            ) t2 on t1.login_name = t2.login_name
            left join 
            ( 
            select user_name,sum(case when acct_session_time >= 1800 then 1 else 0 end) month_online_num 
            from %(s_dwd_dr_brd_expend)s 
            where pt_time between %(ARG_OPTIME_LAST2MON01)s and %(ARG_OPTIME_LAST2_MEND)s
            and acct_input_octets + acct_output_octets >= 100
            group by  user_name
            ) t3 on t1.login_name = t3.user_name
            '''% vars()
    QueryExe(hsql,name,dates)


# 生成目标表数据
    hsql='''insert overwrite table %(t_st_all_users_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select 
            %(ARG_OPTIME_LAST1_M)s as cycle_id                ,                                      
            t.own_corp_std_org_code   ,
            t5.std_org_name as own_corp_std_org_name,
            t.login_name              ,                                      
            coalesce(t1.cust_code,'')               ,                                      
            coalesce(t1.cust_name,'')               ,                                      
            coalesce(t.prod_inst_id,'')            ,                                      
            coalesce(t1.addr_name,'')               ,                                      
            coalesce(t1.management_station,'')      ,                                      
            coalesce(t1.cont_phone1,'')             ,                                      
            coalesce(t1.cont_phone2,'')             ,                                      
            coalesce(t1.cont_mobile1,'')            ,                                      
            coalesce(t1.cont_mobile2,'')            ,                                      
            coalesce(t1.access_type,'')             ,                                      
            coalesce(t1.srvpkg_name,'')             ,                                      
            coalesce(t1.create_date,'') srvpkg_create_date      ,                                      
            coalesce(t1.valid_date,'') srvpkg_valid_date       ,                                      
            coalesce(t1.remainder_days,'') srvpkg_remainder_days   ,                                      
            coalesce(t1.expire_date,'') srvpkg_expire_date      ,                                      
            coalesce(t1.status_name,'')             ,                                      
            coalesce(t1.lan_number,'')              ,                                      
            coalesce(t4.month_online_num,0)  ,                                      
            coalesce(t4.month_online_duration,0) ,                                      
            (case when coalesce(t4.month_online_days,0)=0 then 0 
                else coalesce(t4.month_online_duration,0)/t4.month_online_days end ) month_online_duration_avg  ,                                      
            coalesce(t2.month_up_flow,0)           ,                                      
            (case when coalesce(t4.month_online_days,0)=0 then 0 else coalesce(t2.month_up_flow,0)/t4.month_online_days end) month_up_flow_avg     ,                                      
            coalesce(t2.month_down_flow,0)         ,                                      
            (case when coalesce(t4.month_online_days,0)=0 then 0 else coalesce(t2.month_down_flow,0)/t4.month_online_days end) month_down_flow_avg    ,                                      
            (case when coalesce(t3.auth_count,0) = 0 and t4.month_online_num > 0 then t4.month_online_num else coalesce(t3.auth_count,0) end)  ,                                      
            (case when coalesce(t3.auth_success_rate,0) = 0 and t4.month_online_num > 0 then 1 else coalesce(t3.auth_success_rate,0) end)       ,                                      
            from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date                
            from 
            (
             select login_name,prod_inst_id,own_corp_std_org_code from %(s_dwa_fact_rpt_ins_prod_mon)s 
             where pt_mon=%(ARG_OPTIME_LAST1_M)s 
            )t
            left join %(s_dwa_fact_rpt_ins_prod_mon)s t1 on t.prod_inst_id=t1.prod_inst_id and t1.pt_mon=%(ARG_OPTIME_LAST2_M)s
            left join %(s_temp_st_all_users_mon1)s t2 on t.login_name=t2.login_name
            left join %(s_temp_st_all_users_mon2)s t3 on t.login_name=t3.login_name 
            left join %(s_temp_st_all_users_mon3)s t4 on t.login_name=t4.login_name
            left join %(s_dim_std_organize)s t5 on t.own_corp_std_org_code = t5.std_org_code 
            '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_dwa_fact_ins_srvpkg_mon1)s''' %vars()
#    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
