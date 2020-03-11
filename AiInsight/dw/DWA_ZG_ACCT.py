#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA账户全量
# Pay:DWA_ZG_ACCT.py
# Purpose:
#
# Author:      chens
#
# Created:     22-10-2017
# Copyright:   (c) chens 2017
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']        #获得传入的数据日期的前一天所在年份yyyy格式的数据日期  
    
    ARG_OPTIME_LASTDAYLAST2YEAR01     = dicts['ARG_OPTIME_LASTDAYLAST2YEAR01']  # 获得传入的数据日期的前一天对应的上两年第一个月yyyymm格式的数据日期 
    ARG_OPTIME_LASTDAYLAST2YEAR01_ISO = dicts['ARG_OPTIME_LASTDAYLAST2YEAR01_ISO']  # 获得传入的数据日期的前一天对应的上两年第一个月yyyy-mm格式的数据日期 
    
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_fact_payment              =    "dwd_fact_payment"
    s_dwd_fact_unpay                =    "dwd_fact_unpay"
    s_dim_std_acct_item_type            =    "dim_std_acct_item_type"
    s_dwd_zg_acct                      =    "dwd_zg_acct"
    s_dwd_user_service_credit       =    "dwd_user_service_credit"
    s_dwd_fact_cust_base            =    "dwd_fact_cust_base"

    s_temp_dwa_zg_acct1             =    "temp_dwa_zg_acct1"
    s_temp_dwa_zg_acct2             =    "temp_dwa_zg_acct2"
    s_temp_dwa_zg_acct3             =    "temp_dwa_zg_acct3"
    s_temp_dwa_zg_acct4             =    "temp_dwa_zg_acct4"
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_zg_acct                   =    "dwa_zg_acct" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放 账户的当前最早欠费账期，最近欠费账期，欠费总金额
#数字基本业务欠费金额，互动基本业务欠费金额，宽带业务欠费金额，增值业务欠费金额
    hsql='''create table if not exists %(s_temp_dwa_zg_acct1)s
            (
              acct_id                 string,
              min_unpay_bill_cycle    string,
              max_unpay_bill_cycle    string,
              unpay_amount            string,
              sz_unpay_amount         string,
              hd_unpay_amount         string,
              kd_unpay_amount         string,
              zz_unpay_amount         string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_zg_acct1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 账户最近3年的缴费月份数
    hsql='''create table if not exists %(s_temp_dwa_zg_acct2)s
            (
              acct_id               string,
              payment_mon_num       string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_zg_acct2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 账户最近3年使用月份数
    hsql='''create table if not exists %(s_temp_dwa_zg_acct3)s
            (
              acct_id               string,
              cust_id               string,
              use_mon_num           string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_zg_acct3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 账户的缴费频次
    hsql='''create table if not exists %(s_temp_dwa_zg_acct4)s
            (
              acct_id               string,
              cust_id               string,
              payment_frequency     string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_zg_acct4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成  临时表1
#账户的当前最早欠费账期，最近欠费账期，欠费总金额
#数字基本业务欠费金额，互动基本业务欠费金额，宽带业务欠费金额，增值业务欠费金额
    hsql='''insert overwrite table %(s_temp_dwa_zg_acct1)s
            select 
                t1.acct_id,
                min(t1.billing_cycle_id) min_unpay_bill_cycle,  --最早欠费月份
                max(t1.billing_cycle_id) max_unpay_bill_cycle,  --最近欠费月份
                round(sum(t1.unpay_amount/100),2) unpay_amount,  --欠费总金额
                round(sum(case when t2.std_up_busi_type_code=1002 then t1.unpay_amount/100 else 0 end),2) sz_unpay_amount,  --数字基本
                round(sum(case when t2.std_up_busi_type_code=1003 then t1.unpay_amount/100 else 0 end),2) hd_unpay_amount,  --互动基本
                round(sum(case when t2.std_up_busi_type_code=1004 then t1.unpay_amount/100 else 0 end),2) kd_unpay_amount,  --宽带
                round(sum(case when t2.std_up_busi_type_code in (1005,1006,1008) then t1.unpay_amount/100 else 0 end),2) zz_unpay_amount  --增值
            from %(s_dwd_fact_unpay)s t1
            left join %(s_dim_std_acct_item_type)s t2 on t1.acct_item_type_id=t2.acct_item_type_id 
            where t1.unpay_amount>0
                  and t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
            group by t1.acct_id
         '''% vars()
    QueryExe(hsql,name,dates)    

#生成  临时表2
#账户最近3年的缴费次数
    hsql='''insert overwrite table %(s_temp_dwa_zg_acct2)s
            select
              t1.acct_id,
              count(distinct substr(t1.payment_date,1,7)) payment_mon_num
            from %(s_dwd_fact_payment)s t1
            where substr(t1.payment_date,1,7)>='%(ARG_OPTIME_LASTDAYLAST2YEAR01_ISO)s'
                  and substr(t1.payment_date,1,7)<='%(ARG_OPTIME_LAST1_M_ISO)s'
                  and t1.operation_type=103000
                  and t1.balance_type_id in (100,200)
            group by t1.acct_id
         '''% vars()
    QueryExe(hsql,name,dates)
    
#生成  临时表3
#账户最近3年使用月份数
    hsql='''insert overwrite table %(s_temp_dwa_zg_acct3)s
            select
              t1.acct_id,
              t1.cust_id,
              case when substr(t2.create_date,1,7) < '%(ARG_OPTIME_LASTDAYLAST2YEAR01_ISO)s' then 24+month('%(ARG_OPTIME_LASTMON01_ISO)s')
                   when substr(t2.create_date,1,4) = substr('%(ARG_OPTIME_LASTDAYLAST2YEAR01_ISO)s',1,4) then 12-month(t2.create_date)+1+12+month('%(ARG_OPTIME_LASTMON01_ISO)s')
                   when substr(t2.create_date,1,4) = substr('%(ARG_OPTIME_LASTDAYLAST2YEAR01_ISO)s',1,4)+1 then 12-month(t2.create_date)+1+month('%(ARG_OPTIME_LASTMON01_ISO)s')
                   when substr(t2.create_date,1,4) = substr('%(ARG_OPTIME_LAST2_M_ISO)s',1,4) then month('%(ARG_OPTIME_LASTMON01_ISO)s')-month(t2.create_date)+1
                   else 0 end use_mon_num
            from %(s_dwd_zg_acct)s t1 
            left join %(s_dwd_fact_cust_base)s t2
            on t1.cust_id = t2.cust_id  and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'
            and substr(t2.create_date,1,7)<='%(ARG_OPTIME_LAST1_M_ISO)s'
            where coalesce(t1.acct_id,'') <> ''
            and   coalesce(t1.cust_id,'') <> ''
            and   t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
            and   t2.cust_level not in (5,9,31,33)  -- 剔除测试用户
         '''% vars()
    QueryExe(hsql,name,dates)
    
#生成  临时表4
#账户的缴费频次
    hsql='''insert overwrite table %(s_temp_dwa_zg_acct4)s
            select
              t.acct_id,
              t.cust_id,
              case when t.year_payment_num<=1 then '按年缴费'
                   when t.year_payment_num>1 and t.year_payment_num<=2 then '按半年缴费'
                   when t.year_payment_num>2 then '按月缴费'
                   else '无特征' end payment_frequency  --缴费频次
            from (select
                    t1.acct_id,
                    t1.cust_id,
                    case when coalesce(t1.use_mon_num,0)=0 then 0 else round(t2.payment_mon_num/(t1.use_mon_num/12),2) end year_payment_num --年缴费次数
                  from %(s_temp_dwa_zg_acct3)s t1 
                  left join %(s_temp_dwa_zg_acct2)s t2 on t1.acct_id=t2.acct_id
                  ) t
         '''% vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当周期的记录
    hsql='''insert overwrite table %(t_dwa_zg_acct)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                t1.acct_id,
                t1.cust_id,
                t2.min_unpay_bill_cycle,
                t2.max_unpay_bill_cycle,
                coalesce(t2.unpay_amount,0) unpay_amount,
                coalesce(t2.sz_unpay_amount,0) sz_unpay_amount,
                coalesce(t2.hd_unpay_amount,0) hd_unpay_amount,
                coalesce(t2.kd_unpay_amount,0) kd_unpay_amount,
                coalesce(t2.zz_unpay_amount,0) zz_unpay_amount,
                coalesce(t1.payment_frequency,'无特征') payment_frequency,
                coalesce(round(t4.credit/100,2),0) credit_amount,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from  %(s_temp_dwa_zg_acct4)s t1
            left join %(s_temp_dwa_zg_acct1)s t2 on t1.acct_id=t2.acct_id
            left join %(s_dwd_user_service_credit)s t4 on t1.acct_id=t4.acct_id and t4.pt_mon=%(ARG_OPTIME_LAST1_M)s
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
    # hsql='''drop table %(s_temp_dwa_zg_acct1)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_temp_dwa_zg_acct2)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_temp_dwa_zg_acct3)s''' %vars()
    # QueryExe(hsql,name,dates)
    # hsql='''drop table %(s_temp_dwa_zg_acct4)s''' %vars()
    # QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
