##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA客户订购产品明细月表
# Pay:DWA_CUST_ORDER_PROD_M.py
# Purpose:
#
# Author:      wangxx
#
# Created:     17-10-2017
# Copyright:   (c) wangxx 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# 统计用户订购的套餐
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
    
    ARG_OPTIME_LASTYEAR1MON    = dicts['ARG_OPTIME_LASTYEAR1MON']       #获得传入的数据日期的去年上一月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON_ISO = dicts['ARG_OPTIME_LASTYEAR1MON_ISO']  #获得传入的数据日期的去年上一月yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================   
     
#    s_dwd_rep_order_prod                 =    "dwd_rep_order_prod"
    s_dwd_fact_ins_srvpkg                =    "dwd_fact_ins_srvpkg"
    s_dwd_up_product_item                =    "dwd_up_product_item"
    s_dwd_fact_cust_base                 =    "dwd_fact_cust_base"
    s_dwa_cust_feat_dtl_m                =    "dwa_cust_feat_dtl_m"
    
        
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_DWA_CUST_ORDER_PROD_M                =    "DWA_CUST_ORDER_PROD_M"
##===========================================================================       
##创建临时表

##===========================================================================
# #生成目标表数据
#     hsql='''INSERT OVERWRITE TABLE %(t_DWA_CUST_ORDER_PROD_M)s PARTITION(PT_MON = %(ARG_OPTIME_LAST1_M)s)
#     SELECT T1.CUST_ID
#     	   ,T1.OFFER_ID
# 	   ,T1.OFFER_NAME
# 	   ,T1.OFFER_CREATE_DATE
# 	   ,CASE REGEXP_EXTRACT(T1.OFFER_NAME,'/[0-9个]*([月年])')
# 	   	 WHEN '月' THEN (CASE WHEN REGEXP_EXTRACT(T1.OFFER_NAME,'/([0-9]*)[个月]')='' THEN 1 ELSE REGEXP_EXTRACT(T1.OFFER_NAME,'/([0-9]*)[个月]') END) 
# 		 WHEN '年' THEN (CASE WHEN REGEXP_EXTRACT(T1.OFFER_NAME,'/([0-9]*)[个年]')='' THEN 12 ELSE cast(REGEXP_EXTRACT(T1.OFFER_NAME,'/([0-9]*)[个年]')*12 as int) END)
# 		 ELSE NULL
# 	    END  OFFER_CYCLE
# 	   ,T1.PROD_SERVICE_ID
# 	   ,CASE T1.PROD_SERVICE_ID
# 	   	 WHEN '1002' THEN '数字基本'
# 	   	 WHEN '1003' THEN '互动基本'
# 	   	 WHEN '1004' THEN '宽带'
# 		 WHEN '1005' THEN '付费频道'
# 		 WHEN '1006' THEN '互动点播'
# 		 WHEN '1008' THEN '云媒体增值'
# 		 ELSE NULL
#  	   END  PROD_SERVICE_NAME
#            ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
#     FROM %(s_dwd_rep_order_prod)s T1
#     WHERE T1.PT_MON = %(ARG_OPTIME_LAST1_M)s
#     AND T1.STATE = '1'
#     '''% vars()
#     QueryExe(hsql,name,dates)


#生成目标表数据
    hsql='''INSERT OVERWRITE TABLE %(t_DWA_CUST_ORDER_PROD_M)s PARTITION(PT_MON = %(ARG_OPTIME_LAST1_M)s)
    SELECT DISTINCT T1.PROD_INST_ID
           ,T1.CUST_ID
    	   ,T1.OFFER_ID
	   ,T2.NAME OFFER_NAME
	   ,CASE REGEXP_EXTRACT(T2.NAME,'/[0-9个]*([月年])')
	   	 WHEN '月' THEN (CASE WHEN REGEXP_EXTRACT(T2.NAME,'/([0-9]*)[个月]')='' THEN 1 ELSE REGEXP_EXTRACT(T2.NAME,'/([0-9]*)[个月]') END) 
		 WHEN '年' THEN (CASE WHEN REGEXP_EXTRACT(T2.NAME,'/([0-9]*)[个年]')='' THEN 12 ELSE cast(REGEXP_EXTRACT(T2.NAME,'/([0-9]*)[个年]')*12 as int) END)
		 ELSE NULL
	    END  OFFER_CYCLE
	   ,T1.PROD_SERVICE_ID
	   ,CASE T1.PROD_SERVICE_ID
	   	 WHEN '1002' THEN '数字基本'
	   	 WHEN '1003' THEN '互动基本'
	   	 WHEN '1004' THEN '宽带'
		 WHEN '1005' THEN '付费频道'
		 WHEN '1006' THEN '互动点播'
		 WHEN '1008' THEN '云媒体增值'
		 ELSE NULL
 	   END  PROD_SERVICE_NAME
           ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
    FROM %(s_dwd_fact_ins_srvpkg)s T1
    LEFT JOIN %(s_dwd_up_product_item)s T2
    ON   T1.OFFER_ID=T2.PRODUCT_ITEM_ID
    AND  T2.PT_MON = %(ARG_OPTIME_LAST1_M)s
    inner join %(s_dwa_cust_feat_dtl_m)s T3
    on   t1.cust_id = t3.cust_id
    and  t3.pt_mon = %(ARG_OPTIME_LAST1_M)s
    WHERE T1.PT_MON = %(ARG_OPTIME_LAST1_M)s
      and coalesce(t1.OFFER_ID,'')<>''
    AND T1.STATE = '1'
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
