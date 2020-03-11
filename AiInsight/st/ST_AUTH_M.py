##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST认证总体情况统计(月)
# Pay: ST_AUTH_M.py
# Purpose:
#
# Author:      liuyf7
#
# Created:     2016-10-22
# Copyright:   (c) liuyf7 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# 修改逻辑取消认证数据与boss数据的关联
# modified by wangxx
# at 2018-09-21
#
# sunwj 20190618
# dwa_fact_rpt_ins_prod_mon  -> DWA_FACT_INS_PROD_MON
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
    s_dwd_brd_auth_log                         =    "dwd_brd_auth_log"
    s_dwd_dr_brd_expend                        =    "dwd_dr_brd_expend"
    s_dwa_fact_ins_prod_mon                    =    "dwa_fact_ins_prod_mon"  # "dwa_fact_rpt_ins_prod_mon"
    s_dim_std_organize                         =    "dim_std_organize"
##===========================================================================       
##自定义变量声明---目标表声明
##=========================================================================== 
    t_st_auth_m                                =    "st_auth_m"
##===========================================================================       
##创建临时表
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
    hsql='''insert overwrite table %(t_st_auth_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
     select %(ARG_OPTIME_LAST1_M)s cycle_id
            ,t1.auth_success_count+t1.auth_failure_count auth_count
            ,t1.auth_success_count
            ,if(t1.auth_success_count+t1.auth_failure_count=0,0,round(t1.auth_success_count/(t1.auth_success_count+t1.auth_failure_count)*100,2)) auth_success_rate
            ,t1.auth_failure_count
            ,if(t1.auth_success_count+t1.auth_failure_count=0,0,round(t1.auth_failure_count/(t1.auth_success_count+t1.auth_failure_count)*100,2)) auth_failure_rate
            ,t1.auth_user_count
            ,coalesce(t3.online_user_count,0)
            ,coalesce(t3.browse_user_count,0)
            ,if(coalesce(t2.pay_user_count,0)=0,0,round(t1.auth_user_count/t2.pay_user_count*100,2)) auth_rate
            ,if(t1.auth_user_count=0,0,round(t3.browse_user_count/t1.auth_user_count*100,2)) browse_rate
            ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            ,t1.own_corp_std_org_code
            ,t4.std_org_name
            from
            (--产品状态正常的认证记录数据
              select t1.own_corp_std_org_code
                     ,sum(case when t1.auth_result = 0 then 1 else 0 end) auth_success_count
                     ,sum(case when t1.auth_result <> 0 then 1 else 0 end) auth_failure_count
                     ,count(distinct t1.login_name) auth_user_count
                from %(s_dwd_brd_auth_log)s t1
                join (select login_name,own_corp_std_org_code from %(s_dwa_fact_ins_prod_mon)s
                       where pt_mon = %(ARG_OPTIME_LAST1_M)s
                        and is_lan=1 
                        and is_valid=1  -- 正常用户
                      ) t2
                   on t1.login_name = t2.login_name
               where substr(pt_time,1,6)=%(ARG_OPTIME_LAST1_M)s
               group by t1.own_corp_std_org_code
            ) t1 
      left join 
            (--付费用户数
              select own_corp_std_org_code,count(1) pay_user_count
                from %(s_dwa_fact_ins_prod_mon)s
               where pt_mon = %(ARG_OPTIME_LAST1_M)s
                 -- and is_valid = 1
                 and is_lan=1     -- sunwj 20190704 修改为dwa_fact_ins_prod_mon后 宽带付费用户 暂停和缴费用户均为付费用户
                 and (is_paid=1 or IS_SUSPEND=1)
               group by own_corp_std_org_code
            ) t2
         on t1.own_corp_std_org_code = t2.own_corp_std_org_code
      left join 
            (--在线用户数，浏览用户数
              select own_corp_std_org_code
                     ,count(distinct user_name) online_user_count
                     ,count(distinct case when acct_input_octets+acct_output_octets>0 then user_name else null end) browse_user_count
                from %(s_dwd_dr_brd_expend)s t
               where substr(pt_time,1,6)=%(ARG_OPTIME_LAST1_M)s
                 and acct_status_type = 'Stop' --取认证结束时记录的时间
           --      and exists(select 1 from %(s_dwa_fact_ins_prod_mon)s aa where aa.login_name = t.user_name)
               group by own_corp_std_org_code
            ) t3
         on t1.own_corp_std_org_code = t3.own_corp_std_org_code
      left join %(s_dim_std_organize)s t4
         on t1.own_corp_std_org_code = t4.std_org_code      
       where coalesce(t1.own_corp_std_org_code,'')  <> ''
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
