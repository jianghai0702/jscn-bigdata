##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA销账明细月全量
# Pay: DWA_FACT_PAYOFF_MON.py
# Purpose:
#
# Author:      liuzx
#
# Created:     2016-8-26
# Copyright:   (c) liuzx 2016
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
    s_dwa_fact_rpt_ins_prod_mon               =    "dwa_fact_rpt_ins_prod_mon"
    s_dim_std_product                         =    "dim_std_product"
    s_temp_dwa_fact_payoff_mon1               =    "temp_dwa_fact_payoff_mon1"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_fact_payoff_mon                     =    "dwa_fact_payoff_mon"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放 用户订购的产品在本月实际使用的天数
    hsql='''create table if not exists %(s_temp_dwa_fact_payoff_mon1)s
            (
                prod_inst_id          string,
                srvpkg_name           string,
                valid_date            string,
                expire_date           string,
                use_days              int,
                own_corp_std_org_code string,
                data_source_cd        string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_fact_payoff_mon1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
	
##===========================================================================       
##数据处理                                                       
##===========================================================================
#获得 用户订购的产品在本月实际使用的天数
    hsql='''insert overwrite table %(s_temp_dwa_fact_payoff_mon1)s
            select 
                t1.prod_inst_id,
                t1.srvpkg_name,
                t1.valid_date,
                t1.expire_date,
                case when to_date(t1.expire_date)>'%(ARG_OPTIME_LASTMON01_ISO)s' and to_date(t1.expire_date)<'%(ARG_OPTIME_MON01_ISO)s'
                          and to_date(t1.valid_date)>='%(ARG_OPTIME_LASTMON01_ISO)s' then datediff(to_date(t1.expire_date),to_date(t1.valid_date))
                     when to_date(t1.expire_date)>'%(ARG_OPTIME_LASTMON01_ISO)s' and to_date(t1.expire_date)<'%(ARG_OPTIME_MON01_ISO)s'
                          and to_date(t1.valid_date)<'%(ARG_OPTIME_LASTMON01_ISO)s' then datediff(to_date(t1.expire_date),'%(ARG_OPTIME_LASTMON01_ISO)s')
                     when to_date(t1.expire_date)>='%(ARG_OPTIME_MON01_ISO)s' and to_date(t1.valid_date)>='%(ARG_OPTIME_LASTMON01_ISO)s' 
                          and to_date(t1.valid_date)<'%(ARG_OPTIME_MON01_ISO)s' then datediff('%(ARG_OPTIME_MON01_ISO)s',to_date(t1.valid_date))
                     when to_date(t1.expire_date)>='%(ARG_OPTIME_MON01_ISO)s' and to_date(t1.valid_date)<'%(ARG_OPTIME_LASTMON01_ISO)s' 
                          then datediff('%(ARG_OPTIME_MON01_ISO)s','%(ARG_OPTIME_LASTMON01_ISO)s')
                     else 0 end use_days,
                t1.own_corp_std_org_code,
                t1.data_source_cd
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
            '''% vars()
    QueryExe(hsql,name,dates)

#生成目标表
#销账金额：产品价格除以(产品周期*31)得到每天使用该产品的价格，最后再乘以本月实际使用的天数
    hsql='''insert overwrite table %(t_dwa_fact_payoff_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              '' balance_log_id,
              '' acct_balance_id,
              '' payment_id,
              '' bill_id,
              '' acct_item_id,
              '' billing_cycle_id,
              t1.prod_inst_id serv_id,
              '' acct_id,
              '' cust_id,
              '' acct_item_type_id,
              '' balance_type_id,
              case when coalesce(t2.cycle,0)=0 then 0 else round(t2.price/(t2.cycle*31)*t1.use_days,2) end payoff_amount,
              '' unpay_amount,
              '' bill_amount,
              '' payment_date,
              '' corp_org_id,
              t2.product_id srvpkg_id,
              '' std_up_busi_type_code,
              '' std_balance_type_code,
              '' std_acct_item_type_code,
              '' std_prod_cycle_code,
              '' std_bandwidth_code,
              t1.own_corp_std_org_code,
              t1.data_source_cd,
              %(ARG_OPTIME_LAST1_M)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_dwa_fact_payoff_mon1)s t1
            left outer join %(s_dim_std_product)s t2 on t1.srvpkg_name=t2.product_name
            where t1.use_days>0
            '''% vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_dwa_fact_payoff_mon1)s''' %vars()
#    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
