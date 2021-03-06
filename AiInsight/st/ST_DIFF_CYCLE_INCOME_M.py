#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST经营收入按产品周期统计(月)
# Pay:ST_DIFF_CYCLE_INCOME_M.py
# Purpose:
#
# Author:      chens
#
# Created:     09-02-2017
# Copyright:   (c) chens 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from env_path import *
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
    ARG_OPTIME_LASTYEAR1MON   = dicts['ARG_OPTIME_LASTYEAR1MON']      #获得传入的数据日期的去年同一个月yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_fact_rpt_ins_prod_mon       =    "dwa_fact_rpt_ins_prod_mon"
    s_dwa_fact_payoff_mon             =    "dwa_fact_payoff_mon"
    s_dim_std_product                 =    "dim_std_product"
    s_dim_std_organize                =    "dim_std_organize"
    s_temp_st_diff_cycle_income_m1    =    "temp_st_diff_cycle_income_m1"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_diff_cycle_income_m          =    "st_diff_cycle_income_m"      
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#存放    新订购用户数,新订购非0元用户数,新订购收入,平均每个月新订购收入,销账用户数,销账收入,缴费用户数
    hsql='''create table if not exists %(s_temp_st_diff_cycle_income_m1)s
            (
              own_corp_std_org_code  string,
              own_corp_std_org_name  string,
              std_prod_cycle_code    string,
              std_prod_cycle_name    string,
              new_order_user_count   int,
              new_order_not0_user_count int,
              new_order_amount       double,
              avg_new_order_amount   double,
              bill_user_count        int,
              bill_amount            double,
              payment_user_count     int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_diff_cycle_income_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成     新订购用户数,新订购非0元用户数,新订购收入,平均每个月新订购收入
    hsql='''insert overwrite table %(s_temp_st_diff_cycle_income_m1)s
            select
                t1.own_corp_std_org_code,
                t3.std_org_name own_corp_std_org_name,
                '' std_prod_cycle_code,
                t2.cycle std_prod_cycle_name,
                count(distinct t1.prod_inst_id) new_order_user_count,
                count(distinct case when coalesce(t2.price,0)<>0 then t1.prod_inst_id else null end) new_order_not0_user_count,
                sum(t2.price) new_order_amount,
                sum(case when coalesce(t2.cycle,0)=0 then 0 else t2.price/t2.cycle end) avg_new_order_amount,
                0 bill_user_count,
                0 bill_amount,
                0 payment_user_count
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            left outer join %(s_dim_std_product)s t2 on t1.srvpkg_name=t2.product_name and t1.own_corp_std_org_code=t2.own_corp_std_org_code
            left outer join %(s_dim_std_organize)s t3 on t1.own_corp_std_org_code=t3.std_org_code
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
                  and t1.remainder_days <> ''
                  and t1.status_name in ('正常','预开通')
                  and substr(to_date(t1.create_date),1,7)='%(ARG_OPTIME_LAST1_M_ISO)s'
            group by t1.own_corp_std_org_code,t3.std_org_name,t2.cycle
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成  用户状态正常，订购时间小于数据日期，订购的产品是包月产品的收入（这种情况也算为“新订购收入”）
    hsql='''insert into table %(s_temp_st_diff_cycle_income_m1)s
            select
                t1.own_corp_std_org_code,
                t3.std_org_name own_corp_std_org_name,
                '' std_prod_cycle_code,
                t2.cycle std_prod_cycle_name,
                0 new_order_user_count,
                0 new_order_not0_user_count,
                sum(t2.price) new_order_amount,
                0 avg_new_order_amount,
                0 bill_user_count,
                0 bill_amount,
                0 payment_user_count
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            left outer join %(s_dim_std_product)s t2 on t1.srvpkg_name=t2.product_name and t1.own_corp_std_org_code=t2.own_corp_std_org_code
            left outer join %(s_dim_std_organize)s t3 on t1.own_corp_std_org_code=t3.std_org_code
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
                  and t1.status_name in ('正常')
                  and substr(to_date(t1.create_date),1,7)<'%(ARG_OPTIME_LAST1_M_ISO)s'
                  and t2.cycle=1
            group by t1.own_corp_std_org_code,t3.std_org_name,t2.cycle
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成     销账用户数,销账收入
    hsql='''insert into table %(s_temp_st_diff_cycle_income_m1)s
            select
                t1.own_corp_std_org_code,
                t3.std_org_name own_corp_std_org_name,
                '' std_prod_cycle_code,
                t4.cycle std_prod_cycle_name,
                0 new_order_user_count,
                0 new_order_not0_user_count,
                0 new_order_amount,
                0 avg_new_order_amount,
                count(distinct t1.serv_id) bill_user_count,
                sum(t1.payoff_amount) bill_amount,
                0 payment_user_count
            from %(s_dwa_fact_payoff_mon)s t1
            left outer join %(s_dim_std_organize)s t3 on t1.own_corp_std_org_code=t3.std_org_code
            left outer join %(s_dim_std_product)s t4 on t1.srvpkg_id=t4.product_id and t1.own_corp_std_org_code=t4.own_corp_std_org_code
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
            group by t1.own_corp_std_org_code,t3.std_org_name,t4.cycle
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成     缴费用户数
    hsql='''insert into table %(s_temp_st_diff_cycle_income_m1)s
            select
                t1.own_corp_std_org_code,
                t3.std_org_name own_corp_std_org_name,
                '' std_prod_cycle_code,
                t2.cycle std_prod_cycle_name,
                0 new_order_user_count,
                0 new_order_not0_user_count,
                0 new_order_amount,
                0 avg_new_order_amount,
                0 bill_user_count,
                0 bill_amount,
                count(distinct t1.prod_inst_id) payment_user_count
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            left outer join %(s_dim_std_product)s t2 on t1.srvpkg_name=t2.product_name and t1.own_corp_std_org_code=t2.own_corp_std_org_code
            left outer join %(s_dim_std_organize)s t3 on t1.own_corp_std_org_code=t3.std_org_code
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
                  and t1.is_valid=1
                  and t1.is_paied=1
            group by t1.own_corp_std_org_code,t3.std_org_name,t2.cycle
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成      新订购用户数,新订购收入,销账用户数,销账收入,缴费用户数 汇总数据
    hsql='''insert overwrite table %(s_temp_st_diff_cycle_income_m1)s
            select
                t1.own_corp_std_org_code,
                t1.own_corp_std_org_name,
                t1.std_prod_cycle_code,
                t1.std_prod_cycle_name,
                sum(t1.new_order_user_count) new_order_user_count,
                sum(t1.new_order_not0_user_count) new_order_not0_user_count,
                sum(t1.new_order_amount) new_order_amount,
                sum(t1.avg_new_order_amount) avg_new_order_amount,
                sum(t1.bill_user_count) bill_user_count,
                sum(t1.bill_amount) bill_amount,
                sum(t1.payment_user_count) payment_user_count
            from %(s_temp_st_diff_cycle_income_m1)s t1
            group by t1.own_corp_std_org_code,t1.own_corp_std_org_name,t1.std_prod_cycle_code,t1.std_prod_cycle_name
          '''% vars()    
    QueryExe(hsql,name,dates)
        
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当月的记录；
    hsql='''insert overwrite table %(t_st_diff_cycle_income_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                %(ARG_OPTIME_LAST1_M)s cycle_id,
                t1.own_corp_std_org_code,
                t1.own_corp_std_org_name,
                t1.std_prod_cycle_code,
                t1.std_prod_cycle_name,
                t1.new_order_user_count,
                round(t1.new_order_amount,2) new_order_amount,
                case when coalesce(t1.new_order_user_count,0)=0 then 0 else round(t1.avg_new_order_amount/t1.new_order_user_count,2) end new_order_amount_arpu,
                case when coalesce(t1.new_order_not0_user_count,0)=0 then 0 else round(t1.avg_new_order_amount/t1.new_order_not0_user_count,2) end new_order_amount_not0_arpu,
                t1.bill_user_count,
                round(t1.bill_amount,2) bill_amount,
                case when coalesce(t1.payment_user_count,0)=0 then 0 else round(t1.bill_amount/t1.payment_user_count,2) end bill_amount_arpu,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_st_diff_cycle_income_m1)s t1
            where t1.own_corp_std_org_code is not null
                  and trim(t1.own_corp_std_org_code)<>''
                  and lower(t1.own_corp_std_org_code)<>'null'
                  and t1.std_prod_cycle_name is not null
                  and trim(t1.std_prod_cycle_name)<>''
                  and lower(t1.std_prod_cycle_name)<>'null'
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_st_diff_cycle_income_m1)s''' %vars()
#    QueryExe(hsql,name,dates)
   
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
