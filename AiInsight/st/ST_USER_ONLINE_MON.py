##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST本月用户上网情况（月）      
# Pay: ST_USER_ONLINE_MON.py
# Purpose: 这个表数据取本月用户的上网情况
# 
# Author:      yanal
#
# Created:     29-12-2016
# Copyright:   (c) yanal 2016
# Licence:     <your licence>
# -------------------------------
# 
# 由于 null 默认存储是 \N ，而数值型数据导出后都变成了 NULL 字符串，导致在导入到 oracle 库的时候报错.字符串为null的导入 oracle 变成了字符串 'NULL'
# 因此把数值型数据为null的默认都存0，字符串为null的都默认为 '' 
# -------------------------------
# yanal 2017-1-9 修改：应客户要求，修改成: 该表只取当月有上网记录的用户，因此拿认证在线记录数据做主表
#          同时，用户当月最后一次上网时间，取在线表的结束时间字段 acct_stop_time
# -----------------------------
# yanal 2017-2-19 上网天数改为月有效上网次数: 
#    规则：耿辉 2017-2-17 把它理解为 在线数据（认证部分）一天上线一次和下线一次 为上网一次
#          去除为0的情况，上网时长 >= 15分钟的，算有效。即: ACCT_SESSION_TIME >= 15*60
# yanal 2017-2-21 
# 平均上网时长改为日均上网时长，公式： 平均上网时长 = 月上网总时长/月上网天数
# -----------------------------
# yanal 2017-3-3 
# 如果用户的日上网时长 < 30分钟， 这天的时长就不计入总时长了. 同时把 有效上网次数的时长也改为 >= 30 分钟
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
    s_dim_std_organize                 =    "dim_std_organize"
    s_dim_std_product                  =    "dim_std_product"
    s_temp_st_user_online_mon1         =    "temp_st_user_online_mon1"
    s_temp_st_user_online_mon2         =    "temp_st_user_online_mon2"
    s_temp_st_user_online_mon3         =    "temp_st_user_online_mon3"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_user_online_mon                =    "st_user_online_mon"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

# 获取上网天数和上网时长数据
    hsql='''create table if not exists %(s_temp_st_user_online_mon1)s  (
        login_name           string,
        month_online_duration    double
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_user_online_mon1)s'
            '''% vars()
    QueryExe(hsql,name,dates)

# 获取最后一次上网距月最后一天的天数
    hsql='''create table if not exists %(s_temp_st_user_online_mon2)s  (
        login_name           string,
        days_from_last_online           int,
        month_online_num   int
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(s_temp_st_user_online_mon2)s'
            '''% vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#先生成 临时中间表数据

# 取得 上网天数和时长数据
    hsql='''insert overwrite table %(s_temp_st_user_online_mon1)s 
            select distinct 
            t1.login_name           ,
            t2.month_online_duration
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            left join 
            (
            select login_name,
            sum(case when total_minutes >= 30 then total_minutes else 0 end) as month_online_duration
            from %(s_dwa_user_online_length_d)s 
            where pt_time between %(ARG_OPTIME_LASTMON01)s and %(ARG_OPTIME_LASTMONEND)s
            group by login_name
            ) t2 on t1.login_name = t2.login_name
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s and t1.is_valid = 1
            '''% vars()
    QueryExe(hsql,name,dates)

#从认证的在线记录表取得最后一次上网时间
    hsql='''insert overwrite table %(s_temp_st_user_online_mon2)s 
            select 
            t.login_name,
            datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',last_online_day) days_from_last_online,
            month_online_num
            from 
            (
            select 
            user_name as login_name ,
            max(t1.acct_stop_time) last_online_day,
            sum(case when acct_session_time >= 1800 then 1 else 0 end) month_online_num 
            from %(s_dwd_dr_brd_expend)s t1
            where pt_time between %(ARG_OPTIME_LASTMON01)s and %(ARG_OPTIME_LASTMONEND)s
            and t1.acct_input_octets+t1.acct_output_octets >= 100
            group by t1.user_name
            ) t
            '''% vars()
    QueryExe(hsql,name,dates)


# 生成目标表数据
    hsql='''insert overwrite table %(t_st_user_online_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select 
            %(ARG_OPTIME_LAST1_M)s as cycle_id                ,                                      
            t3.own_corp_std_org_code   , 
            t4.std_org_name    own_corp_std_org_name,                                  
            t3.login_name              ,                                      
            t3.cust_code            ,
            t3.cust_name            ,
            t3.prod_inst_id         ,
            coalesce(t3.srvpkg_name,'')          ,
            (case when coalesce(t5.cycle,0)=0 then 0 else coalesce(t5.price,0)/t5.cycle end) arpu                 ,
            coalesce(t5.bandwidth,'')            ,
            coalesce(t5.cycle,0)                ,
            coalesce(t5.price,0)                ,
            coalesce(t1.month_online_num,0) ,
            (case when coalesce(t3.this_month_online_days,0)=0 then 0 
                else coalesce(t2.month_online_duration,0)/t3.this_month_online_days end) month_online_duration_avg,
            coalesce(t1.days_from_last_online,0) ,
            from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date                
            from %(s_temp_st_user_online_mon2)s t1   
            left join %(s_temp_st_user_online_mon1)s t2 on t1.login_name=t2.login_name
            left join %(s_dwa_fact_rpt_ins_prod_mon)s t3 on t1.login_name=t3.login_name 
            left join %(s_dim_std_organize)s t4 on t3.own_corp_std_org_code = t4.std_org_code 
            left join %(s_dim_std_product)s t5 on t3.srvpkg_name = t5.product_name
            where t3.pt_mon=%(ARG_OPTIME_LAST1_M)s and t3.is_valid = 1
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
