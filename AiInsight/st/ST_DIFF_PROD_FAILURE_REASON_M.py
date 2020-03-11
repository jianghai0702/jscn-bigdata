##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST认证失败原因情况按产品统计(月)
# Pay: ST_DIFF_PROD_FAILURE_REASON_M.py
# Purpose:
#
# Author:      lvdp
#
# Created:     2016-8-18
# Copyright:   (c) lvdp 2016
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
    s_dwd_brd_auth_log                        =    "dwd_brd_auth_log"
    s_dwa_fact_rpt_ins_prod_mon               =    "dwa_fact_rpt_ins_prod_mon"
    s_dim_std_failure_reason                  =    "dim_std_failure_reason"
    s_st_auth_failure_reason_m                =    "st_auth_failure_reason_m"
    s_tmp_diff_prod_failure_reason_m1         =    "tmp_diff_prod_failure_reason_m1"
    s_dim_std_product                         =    "dim_std_product"
    s_dim_std_organize                          =    "dim_std_organize"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_st_diff_prod_failure_reason_m           =    "st_diff_prod_failure_reason_m"
##===========================================================================
##创建临时表
##===========================================================================
    hsql='''create table if not exists %(s_tmp_diff_prod_failure_reason_m1)s
            (
                std_failure_reason_code string,
                login_name              string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_tmp_diff_prod_failure_reason_m1)s'
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================
##数据处理
##===========================================================================
#插入认证失败用户
    hsql='''insert overwrite table %(s_tmp_diff_prod_failure_reason_m1)s
            select distinct auth_result,login_name
              from %(s_dwd_brd_auth_log)s
             where substr(pt_time,1,6)=%(ARG_OPTIME_LAST1_M)s
               and auth_result <> 0
            '''% vars()
    QueryExe(hsql,name,dates)

#插入目标表数据
    hsql='''insert overwrite table %(t_st_diff_prod_failure_reason_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
              select
                %(ARG_OPTIME_LAST1_M)s cycle_id
                ,t1.std_failure_reason_code
                ,t2.std_failure_reason_name
                ,t1.product_id std_product_code
                ,t1.srvpkg_name std_product_name
                ,t1.auth_failure_user_count
                ,if(coalesce(t3.auth_failure_user_count,0)=0,0,round(t1.auth_failure_user_count/t3.auth_failure_user_count*100,2)) auth_failure_user_rate
                ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
                ,t1.own_corp_std_org_code
                ,t4.std_org_name
              from(select a.std_failure_reason_code
                          ,b.own_corp_std_org_code
                          ,b.srvpkg_name
                          ,c.product_id
                          ,count(b.login_name) auth_failure_user_count
                     from %(s_tmp_diff_prod_failure_reason_m1)s a
                    inner join %(s_dwa_fact_rpt_ins_prod_mon)s b
                       on a.login_name = b.login_name
                      and b.pt_mon = %(ARG_OPTIME_LAST1_M)s
                     left join %(s_dim_std_product)s c
                       on b.srvpkg_name=c.product_name
                      and b.own_corp_std_org_code=c.own_corp_std_org_code
                    group by a.std_failure_reason_code
                             ,b.own_corp_std_org_code
                             ,b.srvpkg_name
                             ,c.product_id ) t1
              left join %(s_dim_std_failure_reason)s t2
                on t1.std_failure_reason_code = t2.std_failure_reason_code
              left join (select std_failure_reason_code
                                ,own_corp_std_org_code
                                ,auth_failure_user_count
                           from %(s_st_auth_failure_reason_m)s
                          where pt_mon = %(ARG_OPTIME_LAST1_M)s ) t3
                on t1.std_failure_reason_code = t3.std_failure_reason_code
               and t1.own_corp_std_org_code = t3.own_corp_std_org_code
              left join %(s_dim_std_organize)s t4
                on t1.own_corp_std_org_code=t4.std_org_code
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
