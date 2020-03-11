##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWDCRM与帐管产品关系表
# Pay:DWD_UP_PRODUCT_PROD_REL.py
# Purpose:
#
# Author:      chens
#
# Created:     09-08-2016
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
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_up_product_item              =    "stg_up_product_item"
    s_stg_up_item_relat                =    "stg_up_item_relat"
    s_stg_cp_pm_products               =    "stg_cp_pm_products"
    s_stg_cp_pm_prod_pkgs              =    "stg_cp_pm_prod_pkgs"
    s_stg_cp_pm_packages               =    "stg_cp_pm_packages"
    s_stg_cp_pm_rent_pkg_del           =    "stg_cp_pm_rent_pkg_del"
    s_stg_cp_pm_rates                  =    "stg_cp_pm_rates"
    s_stg_cp_pm_curve                  =    "stg_cp_pm_curve"
    s_stg_cp_pm_curve_segments         =    "stg_cp_pm_curve_segments"
    s_stg_cp_pm_items                  =    "stg_cp_pm_items"
    s_stg_cp_pm_expressions            =    "stg_cp_pm_expressions"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_up_product_prod_rel                =    "dwd_up_product_prod_rel"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当天数据
    hsql='''insert overwrite table %(t_dwd_up_product_prod_rel)s            
            select
              distinct
              t13.product_item_id,
              t1.prod_id,
              t4.item_code,
              t7.base_val,
              t1.data_source_cd,
              %(ARG_OPTIME_LASTDAY)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_stg_cp_pm_products)s t1
            inner join %(s_stg_cp_pm_prod_pkgs)s t2 on t1.prod_id=t2.prod_id and t2.event_id=5 and t2.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_packages)s t3 on t2.pkg_id=t3.pkg_id and t3.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_rent_pkg_del)s t4 on t3.pkg_id=t4.pkg_id and t4.cal_indi=20 and t4.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_rates)s t5 on t4.rate_id=t5.rate_id and t5.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_curve)s t6 on t5.curve_id=t6.curve_id and t6.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_curve_segments)s t7 on t6.curve_id=t7.curve_id and t7.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_items)s t8 on t4.item_code=t8.item_code and t8.item_class=2 and t8.sub_type=0 and t8.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_expressions)s t9 on t4.use_marker_id=t9.expr_id and t9.use_trigger in (3,5) and t9.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_expressions)s t10 on t7.formula_id=t10.expr_id and t10.use_trigger in (3,5) and t10.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_cp_pm_expressions)s t11 on t4.expr_id=t11.expr_id and (t11.expr_id=0 or t11.use_trigger in (3,5)) and t11.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_up_product_item)s t12 on t1.prod_id=trim(t12.extend_id) and t12.pt_time=%(ARG_OPTIME_LASTDAY)s
            inner join %(s_stg_up_item_relat)s t13 on t12.product_item_id=t13.relat_product_item_id and t13.prod_item_relat_kind_id='SERVICE_PRICE_GENERAL_PRICE_PLAN_PKG_BOSS' and t13.pt_time=%(ARG_OPTIME_LASTDAY)s
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
