##!/usr/bin/env python
## -*-coding:utf-8 -*-
#--------------------------------------------------------
# Name:ST用户画像账户按分公司统计
# Pay:ST_ZG_ACCT.py
# Purpose:
#
# Author:      zhoush
#
# Created:     22_12_2017
# Copyright:   (c) zhoush 2017
# Licence:     <your licence>
#--------------------------------------------------------
# 剔除集团用户 2018-03-28 wxx
# 
# wangxx 2019-01-17
# 添加地区、省的汇总统计
#

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
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy_MM_dd HH格式的当前日期
    ARG_OPTIME                = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO            = dicts['ARG_OPTIME_ISO']               #获得yyyy_mm_dd格式的数据日期
    ARG_OPTIME_YEAR           = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH          = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01        = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy_mm格式的数据日期
    ARG_OPTIME_MONTH12        = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy_mm格式的数据日期
    ARG_OPTIME_HOUR           = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD       = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY            = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON        = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTMON        = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO    = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LAST2MON       = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO   = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LAST3MON       = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO   = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTYEAR       = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO   = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_YEAR01         = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO     = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_YEAR12         = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO     = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_MON01          = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO      = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_MONEND         = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO     = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy_mm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy_mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy_mm格式的数据日期
    ARG_OPTIME_LAST2_MEND     = dicts['ARG_OPTIME_LAST2_MEND']        #获得传入的数据日期的所在上两个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2_MEND_ISO = dicts['ARG_OPTIME_LAST2_MEND_ISO']    #获得传入的数据日期的所在上两个月份最后一天yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy_mm格式的数据日期
    ARG_OPTIME_LAST3_MEND        = dicts['ARG_OPTIME_LAST3_MEND']          #获得传入的数据日期的所在上三个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3_MEND_ISO    = dicts['ARG_OPTIME_LAST3_MEND_ISO']      #获得传入的数据日期的所在上三个月份最后一天yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy_mm_dd格式的数据日期
    ARG_OPTIME_LASTYEAR1MON    = dicts['ARG_OPTIME_LASTYEAR1MON']       #获得传入的数据日期的去年上一月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON_ISO = dicts['ARG_OPTIME_LASTYEAR1MON_ISO']  #获得传入的数据日期的去年上一月yyyy_mm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON01_ISO  = dicts['ARG_OPTIME_LASTYEAR1MON01_ISO']  # 获得传入的数据日期的去年上月第一天日期yyyy_mm_dd格式的数据日期

#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================   
    s_dwa_zg_acct                       =    "dwa_zg_acct"
    s_dwa_cust_feat_dtl_m               =    "dwa_cust_feat_dtl_m"
    s_dim_std_organize                  =    "dim_std_organize"
##==========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_zg_acct                        =    "st_zg_acct"   
##===========================================================================       
##创建临时表
##===========================================================================       


##===========================================================================
#生成目标表数据
    hsql='''INSERT OVERWRITE TABLE %(t_st_zg_acct)s PARTITION(PT_MON=%(ARG_OPTIME_LAST1_M)s)
            SELECT 
              %(ARG_OPTIME_LAST1_M)s CYCLE_ID,
              coalesce(T2.CORP_ORG_CODE,t4.std_org_code,'10') as OWN_CORP_STD_ORG_CODE,
              coalesce(T2.CORP_ORG_NAME,t4.std_org_name,'江苏有线') as OWN_CORP_STD_ORG_NAME,
              COUNT(CASE WHEN T1.PAYMENT_FREQUENCY = '按月缴费' THEN T1.ACCT_ID ELSE NULL END ) PAYMENT_MONTH_COUNT,
              COUNT(CASE WHEN T1.PAYMENT_FREQUENCY = '按半年缴费' THEN T1.ACCT_ID ELSE NULL END ) PAYMENT_SIX_MONTH_COUNT,
              COUNT(CASE WHEN T1.PAYMENT_FREQUENCY = '按年缴费' THEN T1.ACCT_ID ELSE NULL END ) PAYMENT_YEAR_COUNT,
              COUNT(CASE WHEN T1.PAYMENT_FREQUENCY = '无特征' THEN T1.ACCT_ID ELSE NULL END ) PAYMENT_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT <= 0 THEN T1.ACCT_ID ELSE NULL END ) NO_CREDIT_AMOUNT_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >0 AND T1.CREDIT_AMOUNT <= 200 THEN T1.ACCT_ID ELSE NULL END ) CREDIT_AMOUNT_0_200_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >=201 AND T1.CREDIT_AMOUNT <= 300 THEN T1.ACCT_ID ELSE NULL END ) CREDIT_AMOUNT_201_300_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >=301 AND T1.CREDIT_AMOUNT <= 500 THEN T1.ACCT_ID ELSE NULL END ) CREDIT_AMOUNT_301_500_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >=501 AND T1.CREDIT_AMOUNT <= 1000 THEN T1.ACCT_ID ELSE NULL END ) CREDIT_AMOUNT_501_1000_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >=1001 AND T1.CREDIT_AMOUNT <= 2000 THEN T1.ACCT_ID ELSE NULL END ) CREDIT_AMOUNT_1001_2000_COUNT,
              COUNT(CASE WHEN T1.CREDIT_AMOUNT >= 2001 THEN T1.ACCT_ID ELSE NULL END ) credit_amount_2001_count,
              COUNT(CASE WHEN SUBSTR(T1.PT_MON,1,6) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,6) THEN T1.ACCT_ID ELSE NULL END ) LESS_ONE_MONTH_COUNT,
              COUNT(CASE WHEN (CASE WHEN SUBSTR(T1.PT_MON,1,4) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN T1.PT_MON - T1.MAX_UNPAY_BILL_CYCLE
                                    WHEN SUBSTR(T1.PT_MON,1,4) > SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN (SUBSTR(T1.PT_MON,1,4)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4))*12+(SUBSTR(T1.PT_MON,5,2)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,5,2)) ELSE NULL END) >= 1 AND 
                              (CASE WHEN SUBSTR(T1.PT_MON,1,4) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN T1.PT_MON - T1.MAX_UNPAY_BILL_CYCLE
                                    WHEN SUBSTR(T1.PT_MON,1,4) > SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN  (SUBSTR(T1.PT_MON,1,4)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4))*12+(SUBSTR(T1.PT_MON,5,2)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,5,2)) ELSE NULL END ) <= 6 THEN T1.ACCT_ID ELSE NULL END ) ONE_TO_SIX_MONTH_COUNT,
              COUNT(CASE WHEN (CASE WHEN SUBSTR(T1.PT_MON,1,4) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN T1.PT_MON - T1.MAX_UNPAY_BILL_CYCLE
                                    WHEN SUBSTR(T1.PT_MON,1,4) > SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN  (SUBSTR(T1.PT_MON,1,4)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4))*12+(SUBSTR(T1.PT_MON,5,2)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,5,2)) ELSE NULL END) > 6 AND 
                              (CASE WHEN SUBSTR(T1.PT_MON,1,4) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN T1.PT_MON - T1.MAX_UNPAY_BILL_CYCLE
                                    WHEN SUBSTR(T1.PT_MON,1,4) > SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN  (SUBSTR(T1.PT_MON,1,4)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4))*12+(SUBSTR(T1.PT_MON,5,2)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,5,2)) ELSE NULL END) <= 12 THEN T1.ACCT_ID ELSE NULL END ) SIX_TO_TWELVE_MONTH_COUNT,
              COUNT(CASE WHEN (CASE WHEN SUBSTR(T1.PT_MON,1,4) = SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN T1.PT_MON - T1.MAX_UNPAY_BILL_CYCLE 
                                    WHEN SUBSTR(T1.PT_MON,1,4) > SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4) THEN  (SUBSTR(T1.PT_MON,1,4)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,1,4))*12+(SUBSTR(T1.PT_MON,5,2)-SUBSTR(T1.MAX_UNPAY_BILL_CYCLE,5,2)) ELSE NULL END) > 12 THEN T1.ACCT_ID ELSE NULL END ) GRANTER_TWELVE_MONTH_COUNT,
              ROUND(SUM(T1.SZ_UNPAY_AMOUNT),2) SZ_UNPAY_AMOUNT_TOTAL,
              COUNT(CASE WHEN T1.SZ_UNPAY_AMOUNT > 0 THEN T1.ACCT_ID ELSE NULL END ) SZ_UNPAY_AMOUNT_COUNT,
              ROUND(SUM(T1.HD_UNPAY_AMOUNT),2) HD_UNPAY_AMOUNT_TOTAL,
              COUNT(CASE WHEN T1.HD_UNPAY_AMOUNT > 0 THEN T1.ACCT_ID ELSE NULL END ) HD_UNPAY_AMOUNT_COUNT,
              ROUND(SUM(T1.KD_UNPAY_AMOUNT),2) KD_UNPAY_AMOUNT_TOTAL,
              COUNT(CASE WHEN T1.KD_UNPAY_AMOUNT > 0 THEN T1.ACCT_ID ELSE NULL END ) KD_UNPAY_AMOUNT_COUNT,
              ROUND(SUM(T1.ZZ_UNPAY_AMOUNT),2) ZZ_UNPAY_AMOUNT_TOTAL,
              COUNT(CASE WHEN T1.ZZ_UNPAY_AMOUNT > 0 THEN T1.ACCT_ID ELSE NULL END ) ZZ_UNPAY_AMOUNT_COUNT,
              ROUND(SUM(T1.UNPAY_AMOUNT),2) UNPAY_AMOUNT_TOTAL,
              COUNT(CASE WHEN T1.UNPAY_AMOUNT > 0 THEN T1.ACCT_ID ELSE NULL END ) UNPAY_COUNT_TOTAL,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
            FROM %(s_dwa_zg_acct)s T1
            LEFT JOIN %(s_dwa_cust_feat_dtl_m)s T2 ON
            T1.CUST_ID = T2.CUST_ID AND T2.PT_MON=%(ARG_OPTIME_LAST1_M)s
            left join %(s_dim_std_organize)s t3
                  on t2.corp_org_code = t3.std_org_code 
            left join %(s_dim_std_organize)s t4
                  on t3.p_std_org_code = t4.std_org_code 
            WHERE T1.PT_MON=%(ARG_OPTIME_LAST1_M)s
              AND COALESCE(T2.CORP_ORG_NAME,'') <> ''
              AND t2.cust_type = 1 -- 剔除集团用户
            GROUP BY t2.CORP_ORG_CODE,t2.CORP_ORG_NAME,t4.std_org_code,t4.std_org_name,1 -- 添加1为规避hive的grouping sets的bug。
            grouping sets ((1,t2.CORP_ORG_CODE,t2.CORP_ORG_NAME,t4.std_org_code,t4.std_org_name),  
                                (1,t4.std_org_code,t4.std_org_name),
                                ()                        
                   )
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
