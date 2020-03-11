##!/usr/bin/env python
## -*-coding:utf-8 -*-
#--------------------------------------------------------
# Name:ST客户画像详细信息月表     
# Pay:ST_CUST_FEAT_DTL_M.py
# Purpose:
#
# Author:      zhoush
#
# Created:     20_12_2017
# Copyright:   (c) zhoush 2017
# Licence:     <your licence>
#--------------------------------------------------------
# 剔除集团用户  2018-03-28 wxx
# wangxx 2018-12-20
# 增加地市、全省汇总逻辑
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
    S_DWA_CUST_FEAT_DTL_M               =    "DWA_CUST_FEAT_DTL_M"
    S_DIM_STD_ORGANIZE                  =    "DIM_STD_ORGANIZE"
    S_TMP_ST_CUST_FEAT_DTL_M1           =    "TMP_ST_CUST_FEAT_DTL_M1"
    S_TMP_ST_CUST_FEAT_DTL_M2           =    "TMP_ST_CUST_FEAT_DTL_M2"
    S_TMP_ST_CUST_FEAT_DTL_M3           =    "TMP_ST_CUST_FEAT_DTL_M3"
    S_TMP_ST_CUST_FEAT_DTL_M4           =    "TMP_ST_CUST_FEAT_DTL_M4"
    S_TMP_ST_CUST_FEAT_DTL_M5           =    "TMP_ST_CUST_FEAT_DTL_M5"

##==========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    T_ST_CUST_FEAT_DTL_M                =    "ST_CUST_FEAT_DTL_M"   
##===========================================================================       
##创建临时表
##===========================================================================       
#存放支付方式数据
    hsql='''CREATE TABLE IF NOT EXISTS %(S_TMP_ST_CUST_FEAT_DTL_M1)s
            (
             CORP_ORG_CODE STRING,
             PAYMENT_HABIT STRING,
             PAYMENT_HABIT_COUNT int
            )
            STORED AS ORCFILE
            LOCATION '%(tmp_path)s/%(S_TMP_ST_CUST_FEAT_DTL_M1)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#存放支付方式数据
    hsql='''CREATE TABLE IF NOT EXISTS %(S_TMP_ST_CUST_FEAT_DTL_M4)s
            (
             CORP_ORG_CODE STRING,
             PAYMENT_HABIT STRING,
             PAYMENT_HABIT_COUNT int,
             ORDER_ID int
            )
            STORED AS ORCFILE
            LOCATION '%(tmp_path)s/%(S_TMP_ST_CUST_FEAT_DTL_M4)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成分公司支付方式数据
    hsql='''INSERT OVERWRITE TABLE %(S_TMP_ST_CUST_FEAT_DTL_M1)s
            SELECT
               CORP_ORG_CODE,
               PAYMENT_HABIT,
               COUNT(1) PAYMENT_HABIT_COUNT
            FROM %(S_DWA_CUST_FEAT_DTL_M)s 
            WHERE PT_MON=%(ARG_OPTIME_LAST1_M)s
            AND COALESCE(PAYMENT_HABIT,'') <> ''
              AND cust_type = 1 
            GROUP BY CORP_ORG_CODE,PAYMENT_HABIT
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成地市、全省支付方式数据
    hsql='''INSERT INTO TABLE %(S_TMP_ST_CUST_FEAT_DTL_M1)s
            SELECT
               coalesce(t3.std_org_code,'10'),
               PAYMENT_HABIT,
               sum(PAYMENT_HABIT_COUNT)
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M1)s t1
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T2
            ON T1.CORP_ORG_CODE = T2.STD_ORG_CODE
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T3
            ON T2.P_STD_ORG_CODE = T3.STD_ORG_CODE
            GROUP BY PAYMENT_HABIT,t3.std_org_code 
             grouping sets ( (PAYMENT_HABIT,t3.std_org_code ), PAYMENT_HABIT)
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成支付方式TOP3数据
    hsql='''INSERT overwrite TABLE %(S_TMP_ST_CUST_FEAT_DTL_M4)s
            SELECT
               corp_org_code,
               PAYMENT_HABIT,
               PAYMENT_HABIT_COUNT,
               order_id
            from 
            (SELECT
               corp_org_code,
               PAYMENT_HABIT,
               PAYMENT_HABIT_COUNT,
               ROW_NUMBER() OVER(DISTRIBUTE BY CORP_ORG_CODE SORT BY PAYMENT_HABIT_COUNT DESC) ORDER_ID
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M1)s ) t1
           where t1.order_id <= 3
    ''' % vars()
    QueryExe(hsql,name,dates)

#存放活跃渠道数据
    hsql='''CREATE TABLE IF NOT EXISTS %(S_TMP_ST_CUST_FEAT_DTL_M2)s 
            (
             CORP_ORG_CODE STRING,
             PAYMENT_CHANNEL STRING,
             PAYMENT_CHANNEL_COUNT int
            )
            STORED AS ORCFILE
            LOCATION '%(tmp_path)s/%(S_TMP_ST_CUST_FEAT_DTL_M2)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#存放活跃渠道TOP5数据
    hsql='''CREATE TABLE IF NOT EXISTS %(S_TMP_ST_CUST_FEAT_DTL_M5)s 
            (
             CORP_ORG_CODE STRING,
             PAYMENT_CHANNEL STRING,
             PAYMENT_CHANNEL_COUNT int,
             ORDER_ID int
            )
            STORED AS ORCFILE
            LOCATION '%(tmp_path)s/%(S_TMP_ST_CUST_FEAT_DTL_M5)s'
    ''' % vars()
    QueryExe(hsql,name,dates)


#生成活跃渠道数据
    hsql='''INSERT OVERWRITE TABLE %(S_TMP_ST_CUST_FEAT_DTL_M2)s 
           SELECT 
               CORP_ORG_CODE,
               PAYMENT_CHANNEL,
               COUNT(1) PAYMENT_CHANNEL_COUNT
            FROM %(S_DWA_CUST_FEAT_DTL_M)s 
            WHERE PT_MON=%(ARG_OPTIME_LAST1_M)s 
            AND COALESCE(PAYMENT_CHANNEL,'') <> ''
             AND  cust_type = 1 
            GROUP BY CORP_ORG_CODE,PAYMENT_CHANNEL
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成地市、全省活跃渠道数据
    hsql='''INSERT INTO  TABLE %(S_TMP_ST_CUST_FEAT_DTL_M2)s 
           SELECT 
               coalesce(t3.std_org_code,'10'),
               PAYMENT_CHANNEL,
               sum(PAYMENT_CHANNEL_COUNT)
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M2)s  t1
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T2
            ON T1.CORP_ORG_CODE = T2.STD_ORG_CODE
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T3
            ON T2.P_STD_ORG_CODE = T3.STD_ORG_CODE
            GROUP BY PAYMENT_CHANNEL,t3.std_org_code          
            grouping sets ( (PAYMENT_CHANNEL,t3.std_org_code),PAYMENT_CHANNEL )

    ''' % vars()
    QueryExe(hsql,name,dates)


#生成活跃渠道TOP5数据
    hsql='''INSERT overwrite TABLE %(S_TMP_ST_CUST_FEAT_DTL_M5)s
            SELECT
               corp_org_code,
               PAYMENT_CHANNEL,
               PAYMENT_CHANNEL_COUNT,
               order_id
            from 
            (SELECT
               corp_org_code,
               PAYMENT_CHANNEL,
               PAYMENT_CHANNEL_COUNT,
               ROW_NUMBER() OVER(DISTRIBUTE BY CORP_ORG_CODE SORT BY PAYMENT_CHANNEL_COUNT DESC) ORDER_ID
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M2)s ) t1
           where t1.order_id <= 5
    ''' % vars()
    QueryExe(hsql,name,dates)



#存放临时数据
    hsql='''CREATE TABLE IF NOT EXISTS %(S_TMP_ST_CUST_FEAT_DTL_M3)s
            (
             CYCLE_ID STRING,
             CORP_ORG_CODE STRING,
             CORP_ORG_NAME STRING,
             DTV_USER_COUNT INT,
             DBITV_USER_COUNT INT,
             DITV_USER_COUNT INT,
             DFTV_USER_COUNT INT,
             LAN_USER_COUNT INT,
             HDTV_USER_COUNT INT,
             AMSP_USER_COUNT INT,
             CLOUD_MEDIA_USER_COUNT INT,
             MALE_COUNT INT,
             FEMALE_COUNT INT,
             GENERATION_BEFORE_70S INT,
             GENERATION_BETWEEN_70S_AND_90S INT,
             GENERATION_BETWEEN_90S_AND_10S INT,
             GENERATION_AFTER_10S INT,
             FAMILY_CHILD_COUNT INT,
             FAMILY_OLD_COUNT INT,
             FAMILY_CHILD_FAMILT_OLD_COUNT INT,
             NFAMILY_CHILD_FAMILT_OLD_COUNT INT,
             CITY_COUNT INT,
             SUBURB_COUNT INT,
             CONVERGE_USER_COUNT INT,
             ONLY_LAN_USER_COUNT INT,
             TV_USER_COUNT INT,
             NET_1_YEAR_USER_COUNT INT,
             NET_1_TO_3_YAER_USER_COUNT INT,
             NET_3_TO_5_YEAR_USER_COUNT INT,
             NET_GRANTER_5_YEAR_USER_COUNT INT,
             DEV_1_YEAR_USER_COUNT INT,
             DEV_1_TO_3_YAER_USER_COUNT INT,
             DEV_3_TO_5_YEAR_USER_COUNT INT,
             DEV_GRANTER_5_YEAR_USER_COUNT INT,
             INFREQUENT_CHANGE_USER_COUNT INT,
             CHANGE_ONE_TIME_USER_COUNT INT,
             FREQUENT_CHANGE_USER_COUNT INT,
             CONSUM_OVER_101_USER_COUNT INT,
             CONSUM_51_TO_100_USER_COUNT INT,
             CONSUM_21_TO_50_USER_COUNT INT,
             CONSUM_LESS_20_USER_COUNT INT,
             VOD_OVER_21_USER_COUNT INT,
             VOD_11_TO_20_USER_COUNT INT,
             VOD_6_TO_10_USER_COUNT INT,
             VOD_LESS_5_USER_COUNT INT,
             ACTIVE_USER_COUNT INT,
             INACTIVE_USER_COUNT INT,
             DEBT_STOP_SEN_LEV_ZERO INT,
             DEBT_STOP_SEN_LEV_ONE_WEEK INT,
             DEBT_STOP_SEN_LEV_TWO_WEEKS INT,
             DEBT_STOP_SEN_LEV_ONE_MONTH INT,
             DEBT_STOP_SEN_LEV_OVER INT,
             USER_COUNT_TOTAL INT,
             CUST_COUNT_TOTAL INT
            )
            LOCATION '%(tmp_path)s/%(S_TMP_ST_CUST_FEAT_DTL_M3)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
#生成临时数据
    hsql='''INSERT OVERWRITE TABLE %(S_TMP_ST_CUST_FEAT_DTL_M3)s 
            SELECT 
              %(ARG_OPTIME_LAST1_M)s CYCLE_ID,
              T1.CORP_ORG_CODE ,
              T1.CORP_ORG_NAME,
              SUM(T1.DTV_USER_COUNT) DTV_USER_COUNT,
              SUM(T1.DBITV_USER_COUNT) DBITV_USER_COUNT,
              SUM(T1.DITV_USER_COUNT) DITV_USER_COUNT,
              SUM(T1.DFTV_USER_COUNT) DFTV_USER_COUNT,
              SUM(T1.LAN_USER_COUNT) LAN_USER_COUNT,
              SUM(T1.HDTV_USER_COUNT) HDTV_USER_COUNT,
              SUM(T1.AMSP_USER_COUNT ) AMSP_USER_COUNT,
              SUM(T1.CLOUD_MEDIA_USER_COUNT) CLOUD_MEDIA_USER_COUNT,
              COUNT(CASE WHEN T1.SEX = '男' THEN T1.CUST_ID ELSE NULL END ) MALE_COUNT,
              COUNT(CASE WHEN T1.SEX = '女' THEN T1.CUST_ID ELSE NULL END ) FEMALE_COUNT,
              COUNT(CASE WHEN T1.GENERATION < '70' THEN T1.CUST_ID ELSE NULL END ) GENERATION_BEFORE_70S,
              COUNT(CASE WHEN T1.GENERATION IN ('70','80') THEN T1.CUST_ID ELSE NULL END ) GENERATION_BETWEEN_70S_AND_90S,
              COUNT(CASE WHEN T1.GENERATION IN ('90','10') THEN T1.CUST_ID ELSE NULL END ) GENERATION_BETWEEN_90S_AND_10S,
              COUNT(CASE WHEN T1.GENERATION = '10' THEN T1.CUST_ID ELSE NULL END ) GENERATION_AFTER_10S,
              COUNT(CASE WHEN T1.FAMILY_CHILD = 1 THEN T1.CUST_ID ELSE NULL END ) FAMILY_CHILD_COUNT,
              COUNT(CASE WHEN T1.FAMILY_OLD = 1 THEN T1.CUST_ID ELSE NULL END ) FAMILY_OLD_COUNT,
              COUNT(CASE WHEN T1.FAMILY_CHILD = 1 AND T1.FAMILY_OLD =1 THEN T1.CUST_ID ELSE NULL END ) FAMILY_CHILD_FAMILT_OLD_COUNT,
              COUNT(CASE WHEN T1.FAMILY_CHILD = 0 AND T1.FAMILY_OLD = 0 THEN T1.CUST_ID ELSE NULL END ) NFAMILY_CHILD_FAMILT_OLD_COUNT,
              COUNT(CASE T1.DISTRICT_NAME WHEN '城区' THEN T1.CUST_ID ELSE NULL END ) CITY_COUNT,
              COUNT(CASE T1.DISTRICT_NAME WHEN '乡镇' THEN T1.CUST_ID ELSE NULL END ) SUBURB_COUNT,
              COUNT(CASE WHEN T1.IS_CONVERGE = 1 THEN T1.CUST_ID ELSE NULL END ) CONVERGE_USER_COUNT,
              COUNT(CASE WHEN T1.IS_LAN = 1 AND T1.IS_DTV = 0 THEN T1.CUST_ID ELSE NULL END ) ONLY_LAN_USER_COUNT,
              COUNT(CASE WHEN T1.IS_LAN = 0 AND T1.IS_DTV = 1 THEN T1.CUST_ID ELSE NULL END ) TV_USER_COUNT,
              COUNT(CASE WHEN T1.NET_AGE = '1年以内' THEN T1.CUST_ID ELSE NULL END ) NET_1_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.NET_AGE = '1年-3年' THEN T1.CUST_ID ELSE NULL END ) NET_1_TO_3_YAER_USER_COUNT,
              COUNT(CASE WHEN T1.NET_AGE = '3年-5年' THEN T1.CUST_ID ELSE NULL END ) NET_3_TO_5_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.NET_AGE = '大于5年' THEN T1.CUST_ID ELSE NULL END ) NET_GRANTER_5_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_USE_AGE = '1年以内' THEN T1.CUST_ID ELSE NULL END ) DEV_1_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_USE_AGE = '1年-3年' THEN T1.CUST_ID ELSE NULL END ) DEV_1_TO_3_YAER_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_USE_AGE = '3年-5年' THEN T1.CUST_ID ELSE NULL END ) DEV_3_TO_5_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_USE_AGE = '大于5年' THEN T1.CUST_ID ELSE NULL END ) DEV_GRANTER_5_YEAR_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_CHANGE_TYPE = '一年内无换机' THEN T1.CUST_ID ELSE NULL END ) INFREQUENT_CHANGE_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_CHANGE_TYPE = '一年内换机一次' THEN T1.CUST_ID ELSE NULL END ) CHANGE_ONE_TIME_USER_COUNT,
              COUNT(CASE WHEN T1.DEV_CHANGE_TYPE = '一年内换机两次及以上' THEN T1.CUST_ID ELSE NULL END ) FREQUENT_CHANGE_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_CONSUM_AMOUNT >= 101 THEN T1.CUST_ID ELSE NULL END ) CONSUM_OVER_101_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_CONSUM_AMOUNT >= 51 AND T1.MONTH_AVG_CONSUM_AMOUNT <=100 THEN T1.CUST_ID ELSE NULL END ) CONSUM_51_TO_100_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_CONSUM_AMOUNT >= 21 AND T1.MONTH_AVG_CONSUM_AMOUNT <=50 THEN T1.CUST_ID ELSE NULL END ) CONSUM_21_TO_50_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_CONSUM_AMOUNT <= 20 THEN T1.CUST_ID ELSE NULL END ) CONSUM_LESS_20_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_VOD_AMOUNT >= 21 THEN T1.CUST_ID ELSE NULL END ) VOD_OVER_21_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_VOD_AMOUNT >= 11 AND T1.MONTH_AVG_VOD_AMOUNT <=20 THEN T1.CUST_ID ELSE NULL END ) VOD_11_TO_20_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_VOD_AMOUNT >= 6 AND T1.MONTH_AVG_VOD_AMOUNT <=10 THEN T1.CUST_ID ELSE NULL END ) VOD_6_TO_10_USER_COUNT,
              COUNT(CASE WHEN T1.MONTH_AVG_VOD_AMOUNT <= 5 THEN T1.CUST_ID ELSE NULL END ) VOD_LESS_5_USER_COUNT,
              COUNT(CASE WHEN T1.PAYMENT_CHANNEL IS NOT NULL OR T1.PAYMENT_HABIT IS NOT NULL THEN T1.CUST_ID ELSE NULL END ) ACTIVE_USER_COUNT,
              COUNT(CASE WHEN T1.PAYMENT_CHANNEL IS NULL AND T1.PAYMENT_HABIT IS NULL THEN T1.CUST_ID ELSE NULL END ) INACTIVE_USER_COUNT,
              COUNT(CASE WHEN T1.DEBT_STOP_SEN_LEV = '无欠费停机特征' THEN T1.CUST_ID ELSE NULL END ) DEBT_STOP_SEN_LEV_ZERO,
              COUNT(CASE WHEN T1.DEBT_STOP_SEN_LEV = '欠费停机敏感客户（1周）'THEN T1.CUST_ID ELSE NULL END ) DEBT_STOP_SEN_LEV_ONE_WEEK,
              COUNT(CASE WHEN T1.DEBT_STOP_SEN_LEV = '欠费停机敏感客户（2周）'THEN T1.CUST_ID ELSE NULL END ) DEBT_STOP_SEN_LEV_TWO_WEEKS,
              COUNT(CASE WHEN T1.DEBT_STOP_SEN_LEV = '欠费停机敏感客户（1月）'THEN T1.CUST_ID ELSE NULL END ) DEBT_STOP_SEN_LEV_ONE_MONTH,
              COUNT(CASE WHEN T1.DEBT_STOP_SEN_LEV = '欠费停机不敏感客户' THEN T1.CUST_ID ELSE NULL END ) DEBT_STOP_SEN_LEV_OVER,
              SUM(T1.USER_COUNT) USER_COUNT_TOTAL,
              COUNT(T1.CUST_ID) CUST_COUNT_TOTAL
            FROM %(S_DWA_CUST_FEAT_DTL_M)s T1
            WHERE T1.PT_MON = %(ARG_OPTIME_LAST1_M)s
              AND T1.CUST_TYPE = 1 -- 剔除集团用户 
            GROUP BY T1.CORP_ORG_CODE,T1.CORP_ORG_NAME
    ''' % vars()
    QueryExe(hsql,name,dates)


# 地市、全省汇总
    hsql='''INSERT into TABLE %(S_TMP_ST_CUST_FEAT_DTL_M3)s 
            SELECT 
              t1.CYCLE_ID,
              coalesce(t3.std_org_code,'10') ,
              coalesce(t3.std_org_name,'江苏有线'),
              SUM(T1.DTV_USER_COUNT) DTV_USER_COUNT,
              SUM(T1.DBITV_USER_COUNT) DBITV_USER_COUNT,
              SUM(T1.DITV_USER_COUNT) DITV_USER_COUNT,
              SUM(T1.DFTV_USER_COUNT) DFTV_USER_COUNT,
              SUM(T1.LAN_USER_COUNT) LAN_USER_COUNT,
              SUM(T1.HDTV_USER_COUNT) HDTV_USER_COUNT,
              SUM(T1.AMSP_USER_COUNT ) AMSP_USER_COUNT,
              SUM(T1.CLOUD_MEDIA_USER_COUNT) CLOUD_MEDIA_USER_COUNT,
              sum(MALE_COUNT) as MALE_COUNT,
              sum(FEMALE_COUNT) as FEMALE_COUNT,
              sum(GENERATION_BEFORE_70S) as GENERATION_BEFORE_70S,
              sum(GENERATION_BETWEEN_70S_AND_90S) as GENERATION_BETWEEN_70S_AND_90S,
              sum(GENERATION_BETWEEN_90S_AND_10S) as GENERATION_BETWEEN_90S_AND_10S,
              sum(GENERATION_AFTER_10S) as GENERATION_AFTER_10S,
              sum(FAMILY_CHILD_COUNT) as FAMILY_CHILD_COUNT,
              sum(FAMILY_OLD_COUNT) as FAMILY_OLD_COUNT,
              sum(FAMILY_CHILD_FAMILT_OLD_COUNT) as FAMILY_CHILD_FAMILT_OLD_COUNT,
              sum(NFAMILY_CHILD_FAMILT_OLD_COUNT) as NFAMILY_CHILD_FAMILT_OLD_COUNT,
              sum(CITY_COUNT) as CITY_COUNT,
              sum(SUBURB_COUNT) as SUBURB_COUNT,
              sum(CONVERGE_USER_COUNT) as CONVERGE_USER_COUNT,
              sum(ONLY_LAN_USER_COUNT) as ONLY_LAN_USER_COUNT,
              sum(TV_USER_COUNT) as TV_USER_COUNT,
              sum(NET_1_YEAR_USER_COUNT) as NET_1_YEAR_USER_COUNT,
              sum(NET_1_TO_3_YAER_USER_COUNT) as NET_1_TO_3_YAER_USER_COUNT,
              sum(NET_3_TO_5_YEAR_USER_COUNT) as NET_3_TO_5_YEAR_USER_COUNT,
              sum(NET_GRANTER_5_YEAR_USER_COUNT) as NET_GRANTER_5_YEAR_USER_COUNT,
              sum(DEV_1_YEAR_USER_COUNT) as DEV_1_YEAR_USER_COUNT,
              sum(DEV_1_TO_3_YAER_USER_COUNT) as DEV_1_TO_3_YAER_USER_COUNT,
              sum(DEV_3_TO_5_YEAR_USER_COUNT) as DEV_3_TO_5_YEAR_USER_COUNT,
              sum(DEV_GRANTER_5_YEAR_USER_COUNT) as DEV_GRANTER_5_YEAR_USER_COUNT,
              sum(INFREQUENT_CHANGE_USER_COUNT) as INFREQUENT_CHANGE_USER_COUNT,
              sum(CHANGE_ONE_TIME_USER_COUNT) as CHANGE_ONE_TIME_USER_COUNT,
              sum(FREQUENT_CHANGE_USER_COUNT) as FREQUENT_CHANGE_USER_COUNT,
              sum(CONSUM_OVER_101_USER_COUNT) as CONSUM_OVER_101_USER_COUNT,
              sum(CONSUM_51_TO_100_USER_COUNT) as CONSUM_51_TO_100_USER_COUNT,
              sum(CONSUM_21_TO_50_USER_COUNT) as CONSUM_21_TO_50_USER_COUNT,
              sum(CONSUM_LESS_20_USER_COUNT) as CONSUM_LESS_20_USER_COUNT,
              sum(VOD_OVER_21_USER_COUNT) as VOD_OVER_21_USER_COUNT,
              sum(VOD_11_TO_20_USER_COUNT) as VOD_11_TO_20_USER_COUNT,
              sum(VOD_6_TO_10_USER_COUNT) as VOD_6_TO_10_USER_COUNT,
              sum(VOD_LESS_5_USER_COUNT) as VOD_LESS_5_USER_COUNT,
              sum(ACTIVE_USER_COUNT) as ACTIVE_USER_COUNT,
              sum(INACTIVE_USER_COUNT) as INACTIVE_USER_COUNT,
              sum(DEBT_STOP_SEN_LEV_ZERO) as DEBT_STOP_SEN_LEV_ZERO,
              sum(DEBT_STOP_SEN_LEV_ONE_WEEK) as DEBT_STOP_SEN_LEV_ONE_WEEK,
              sum(DEBT_STOP_SEN_LEV_TWO_WEEKS) as DEBT_STOP_SEN_LEV_TWO_WEEKS,
              sum(DEBT_STOP_SEN_LEV_ONE_MONTH) as DEBT_STOP_SEN_LEV_ONE_MONTH,
              sum(DEBT_STOP_SEN_LEV_OVER) as DEBT_STOP_SEN_LEV_OVER,
              SUM(T1.USER_COUNT_TOTAL) USER_COUNT_TOTAL,
              sum(CUST_COUNT_TOTAL) as CUST_COUNT_TOTAL
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M3)s T1
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T2
            ON T1.CORP_ORG_CODE = T2.STD_ORG_CODE
            LEFT JOIN %(S_DIM_STD_ORGANIZE)s T3
            ON T2.P_STD_ORG_CODE = T3.STD_ORG_CODE
            GROUP BY CYCLE_ID,T3.STD_ORG_CODE,T3.STD_ORG_NAME grouping sets ((CYCLE_ID,T3.STD_ORG_CODE,T3.STD_ORG_NAME),CYCLE_ID)
    ''' % vars() 
    QueryExe(hsql,name,dates)


##===========================================================================
#生成目标表数据
    hsql='''INSERT OVERWRITE TABLE %(T_ST_CUST_FEAT_DTL_M)s PARTITION(PT_MON=%(ARG_OPTIME_LAST1_M)s)
            SELECT
              t1.CYCLE_ID,
              T1.CORP_ORG_CODE ,
              T1.CORP_ORG_NAME,
              T1.DTV_USER_COUNT ,
              T1.DBITV_USER_COUNT ,
              T1.DITV_USER_COUNT ,
              T1.DFTV_USER_COUNT ,
              T1.LAN_USER_COUNT ,
              T1.HDTV_USER_COUNT ,
              T1.AMSP_USER_COUNT ,
              T1.CLOUD_MEDIA_USER_COUNT CLOUD_MEDIA_USER_COUNT,
              T1.MALE_COUNT,
              T1.FEMALE_COUNT,
              T1.GENERATION_BEFORE_70S,
              T1.GENERATION_BETWEEN_70S_AND_90S,
              T1.GENERATION_BETWEEN_90S_AND_10S,
              T1.GENERATION_AFTER_10S,
              T1.FAMILY_CHILD_COUNT,
              T1.FAMILY_OLD_COUNT,
              T1.FAMILY_CHILD_FAMILT_OLD_COUNT,
              T1.NFAMILY_CHILD_FAMILT_OLD_COUNT,
              T1.CITY_COUNT,
              T1.SUBURB_COUNT,
              T1.CONVERGE_USER_COUNT,
              T1.ONLY_LAN_USER_COUNT,
              T1.TV_USER_COUNT,
              T1.NET_1_YEAR_USER_COUNT,
              T1.NET_1_TO_3_YAER_USER_COUNT,
              T1.NET_3_TO_5_YEAR_USER_COUNT,
              T1.NET_GRANTER_5_YEAR_USER_COUNT,
              T1.DEV_1_YEAR_USER_COUNT,
              T1.DEV_1_TO_3_YAER_USER_COUNT,
              T1.DEV_3_TO_5_YEAR_USER_COUNT,
              T1.DEV_GRANTER_5_YEAR_USER_COUNT,
              T1.INFREQUENT_CHANGE_USER_COUNT,
              T1.CHANGE_ONE_TIME_USER_COUNT,
              T1.FREQUENT_CHANGE_USER_COUNT,
              T1.CONSUM_OVER_101_USER_COUNT,
              T1.CONSUM_51_TO_100_USER_COUNT,
              T1.CONSUM_21_TO_50_USER_COUNT,
              T1.CONSUM_LESS_20_USER_COUNT,
              T1.VOD_OVER_21_USER_COUNT,
              T1.VOD_11_TO_20_USER_COUNT,
              T1.VOD_6_TO_10_USER_COUNT,
              T1.VOD_LESS_5_USER_COUNT,
              T1.ACTIVE_USER_COUNT,
              T1.INACTIVE_USER_COUNT,
              T2.PAYMENT_CHANNEL PAYMENT_CAHNNEL_TOP_FIVE,
              T2.PAYMENT_CHANNEL_COUNT TOP5_PAYMENT_CHANNEL_COUNT,
              T3.PAYMENT_CHANNEL PAYMENT_CAHNNEL_TOP_FOUR,
              T3.PAYMENT_CHANNEL_COUNT TOP4_PAYMENT_CHANNEL_COUNT,
              T4.PAYMENT_CHANNEL PAYMENT_CAHNNEL_TOP_THREE,
              T4.PAYMENT_CHANNEL_COUNT TOP3_PAYMENT_CHANNEL_COUNT,
              T5.PAYMENT_CHANNEL PAYMENT_CAHNNEL_TOP_TWO,
              T5.PAYMENT_CHANNEL_COUNT TOP2_PAYMENT_CHANNEL_COUNT,
              T6.PAYMENT_CHANNEL PAYMENT_CAHNNEL_TOP_ONE,
              T6.PAYMENT_CHANNEL_COUNT TOP1_PAYMENT_CHANNEL_COUNT,
              T7.PAYMENT_HABIT PAYMENT_HABIT_TOP_THREE,
              T7.PAYMENT_HABIT_COUNT TOP3_PAYMENT_HABIT_COUNT,
              T8.PAYMENT_HABIT PAYMENT_HABIT_TOP_TWO,
              T8.PAYMENT_HABIT_COUNT TOP2_PAYMENT_HABIT_COUNT,
              T9.PAYMENT_HABIT PAYMENT_HABIT_TOP_ONE,
              T9.PAYMENT_HABIT_COUNT TOP1_PAYMENT_HABIT_COUNT,
              T1.DEBT_STOP_SEN_LEV_ZERO,
              T1.DEBT_STOP_SEN_LEV_ONE_WEEK,
              T1.DEBT_STOP_SEN_LEV_TWO_WEEKS,
              T1.DEBT_STOP_SEN_LEV_ONE_MONTH,
              T1.DEBT_STOP_SEN_LEV_OVER,
              T1.USER_COUNT_TOTAL,
              T1.CUST_COUNT_TOTAL,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') ETL_DATE
            FROM %(S_TMP_ST_CUST_FEAT_DTL_M3)s T1
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M5)s T2
            ON T1.CORP_ORG_CODE = T2.CORP_ORG_CODE AND T2.ORDER_ID=5
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M5)s T3
            ON T1.CORP_ORG_CODE = T3.CORP_ORG_CODE AND T3.ORDER_ID=4
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M5)s T4
            ON T1.CORP_ORG_CODE = T4.CORP_ORG_CODE AND T4.ORDER_ID=3
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M5)s T5
            ON T1.CORP_ORG_CODE = T5.CORP_ORG_CODE AND T5.ORDER_ID=2
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M5)s T6
            ON T1.CORP_ORG_CODE = T6.CORP_ORG_CODE AND T6.ORDER_ID=1
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M4)s T7
            ON T7.CORP_ORG_CODE = T1.CORP_ORG_CODE AND T7.ORDER_ID=3
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M4)s T8
            ON T8.CORP_ORG_CODE = T1.CORP_ORG_CODE AND T8.ORDER_ID=2
            LEFT JOIN %(S_TMP_ST_CUST_FEAT_DTL_M4)s T9
            ON T9.CORP_ORG_CODE = T1.CORP_ORG_CODE AND T9.ORDER_ID=1
    ''' % vars()
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
