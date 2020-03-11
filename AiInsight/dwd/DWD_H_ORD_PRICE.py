##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD价格计划订单历史      
# Pay:DWD_H_ORD_PRICE.py
# Purpose:
#
# Author:      chens
#
# Created:     01-08-2016
# Copyright:   (c) chens 2016
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST1_Y        = dicts['ARG_OPTIME_LAST1_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_h_ord_price                =    "stg_h_ord_price"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_h_ord_price                =    "dwd_h_ord_price"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#删除变更数据
    hsql='''insert overwrite table %(t_dwd_h_ord_price)s partition(pt_year=%(ARG_OPTIME_LAST_Y)s)
            select
            t1.priceplan_order_id,
              t1.priceplan_inst_id,
              t1.priceplan_order_type,
              t1.priceplan_type,
              t1.price_plan_id,
              t1.price_plan_detail_id,
              t1.cust_order_id,
              t1.offer_order_id,
              t1.main_order_id,
              t1.priceplan_priceitem_id,
              t1.prom_kind,
              t1.prom_type,
              t1.priceitem_value,
              t1.fact_priceitem_value,
              t1.order_num,
              t1.should_money,
              t1.fact_money,
              t1.fee_month,
              t1.priceplan_begin_date,
              t1.priceplan_end_date,
              t1.cust_id,
              t1.is_mem_grp_disc,
              t1.grp_priceplan_id,
              t1.grp_priceplan_inst_id,
              t1.valid_type,
              t1.state,
              t1.order_state,
              t1.done_code,
              t1.create_date,
              t1.done_date,
              t1.valid_date,
              t1.expire_date,
              t1.op_id,
              t1.org_id,
              t1.ext1,
              t1.ext2,
              t1.ext3,
              t1.ext4,
              t1.remark,
              t1.region_id,
              t1.priceplan_detail_type,
              t1.cut_money,
              t1.bind_flag,
              t1.base_offer_id,
              t1.ext5,
              t1.ext6,
              t1.ext7,
              t1.ext8,
              t1.src_acct_item_id,
              t1.src_acct_pay_money,
              t1.prepay_acct_type,
              t1.data_source_cd,
              t1.etl_cycle,
              t1.etl_date
            from %(t_dwd_h_ord_price)s t1
            left outer join %(s_stg_h_ord_price)s t2 on t1.priceplan_order_id = t2.priceplan_order_id and t2.pt_time=%(ARG_OPTIME_LASTDAY)s
            where t2.priceplan_order_id is null
                  and t1.pt_year=%(ARG_OPTIME_LAST_Y)s
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成目标表数据
    hsql='''insert into table %(t_dwd_h_ord_price)s partition(pt_year=%(ARG_OPTIME_LAST_Y)s)
            select
              t1.priceplan_order_id,
              t1.priceplan_inst_id,
              t1.priceplan_order_type,
              t1.priceplan_type,
              t1.price_plan_id,
              t1.price_plan_detail_id,
              t1.cust_order_id,
              t1.offer_order_id,
              t1.main_order_id,
              t1.priceplan_priceitem_id,
              t1.prom_kind,
              t1.prom_type,
              t1.priceitem_value,
              t1.fact_priceitem_value,
              t1.order_num,
              t1.should_money,
              t1.fact_money,
              t1.fee_month,
              t1.priceplan_begin_date,
              t1.priceplan_end_date,
              t1.cust_id,
              t1.is_mem_grp_disc,
              t1.grp_priceplan_id,
              t1.grp_priceplan_inst_id,
              t1.valid_type,
              t1.state,
              t1.order_state,
              t1.done_code,
              t1.create_date,
              t1.done_date,
              t1.valid_date,
              t1.expire_date,
              t1.op_id,
              t1.org_id,
              t1.ext1,
              t1.ext2,
              t1.ext3,
              t1.ext4,
              t1.remark,
              t1.region_id,
              t1.priceplan_detail_type,
              t1.cut_money,
              t1.bind_flag,
              t1.base_offer_id,
              t1.ext5,
              t1.ext6,
              t1.ext7,
              t1.ext8,
              t1.src_acct_item_id,
              t1.src_acct_pay_money,
              t1.prepay_acct_type,
              t1.data_source_cd,
              %(ARG_OPTIME_LASTDAY)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_stg_h_ord_price)s t1
            where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
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
