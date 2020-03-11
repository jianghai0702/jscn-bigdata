#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA产品订购全量表
# Pay: DWA_FACT_INS_SRVPKG_MON.py
# Purpose: 每月boss1、boss2用户产品订购明细
# 
# Author:      wangxx
# 
# Created:     2018-10-31
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
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

#脚本名称
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')


# 传递日期参数,生成时间字典
#-------------------------------------------------------------------------------
dicts={} 
Pama(dicts,dates)

#引入时间字典
ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期

# 源表声明
#-------------------------------------------------------------------------------
s_stg_fact_ins_srvpkg                =    "stg_fact_ins_srvpkg"
s_stg_fact_ins_srvpkg_b2             =    "stg_fact_ins_srvpkg_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwa_fact_ins_srvpkg_mon            =    "dwa_fact_ins_srvpkg_mon"

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    # 插入boss1数据
    
    hsql=r'''
        INSERT overwrite table %(t_dwa_fact_ins_srvpkg_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
           t1.SRVPKG_INST_ID                             ,
           t1.OFFER_INST_ID                              ,
           t1.OFFER_ID             ,
           t1.OFFER_TYPE           ,
           t1.SRVPKG_ID            ,
           t1.SERVICE_PRICE_KIND   ,
           t1.IS_MAIN              ,
           t1.CUST_ID                                    ,
           t1.PROD_INST_ID         ,
           t1.PROD_SPEC_ID                               ,
           t1.VALID_TYPE           ,
           t1.OPER_STATE           ,
           t1.STATE                ,
           t1.PROD_SERVICE_ID      ,
           t1.OS_STATUS            ,
           t1.SRC_SYSTEM_ID        ,
           t1.SRC_SYSTEM_EXT_CODE  ,
           t1.CUST_ORDER_ID        ,
           t1.REGION_ID            ,
           t1.CREATE_DATE         ,
           t1.DONE_CODE            ,
           t1.DONE_DATE           ,
           t1.VALID_DATE                                      ,
           t1.EXPIRE_DATE                                     ,
           t1.OP_ID                ,
           t1.ORG_ID               ,
           t1.STD_ORG_CODE         ,
           t1.OWN_CORP_ORG_ID                            ,
           t1.OWN_CORP_STD_ORG_CODE ,
           t1.STD_UP_BUSI_TYPE_CODE ,
           t1.STD_UP_TYPE_CODE     ,
           t1.IS_CLOUD_MEDIA       ,
           CASE WHEN t1.STATE = 1 AND t2.srvpkg_inst_id IS NULL THEN 1 ELSE 0 END  AS IS_NEW               ,
           NULL AS IS_UP_MARKETING      ,
           t1.IS_INS               ,
           t1.PAR_VALUE            ,
          'BOSS1' AS data_source_cd, 
          t1.is_history_data , 
          %(ARG_OPTIME_LAST1_M)s AS  etl_cycle,
          current_timestamp AS  etl_date
        FROM %(s_stg_fact_ins_srvpkg)s t1
        LEFT JOIN %(s_stg_fact_ins_srvpkg)s t2  -- 判断是否本月新增订购
            ON t1.srvpkg_inst_id = t2.srvpkg_inst_id
           AND t2.STATE = 1 -- 正常订购状态
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
        WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 插入boss2数据
    
    hsql=r'''
        INSERT INTO table %(t_dwa_fact_ins_srvpkg_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
           t1.SRVPKG_INST_ID                             ,
           t1.OFFER_INST_ID                              ,
           t1.OFFER_ID             ,
           t1.OFFER_TYPE           ,
           t1.SRVPKG_ID            ,
           t1.SERVICE_PRICE_KIND   ,
           t1.IS_MAIN              ,
           t1.CUST_ID                                    ,
           t1.PROD_INST_ID         ,
           t1.PROD_SPEC_ID                               ,
           t1.VALID_TYPE           ,
           t1.OPER_STATE           ,
           t1.STATE                ,
           t1.PROD_SERVICE_ID      ,
           t1.OS_STATUS            ,
           t1.SRC_SYSTEM_ID        ,
           t1.SRC_SYSTEM_EXT_CODE  ,
           t1.CUST_ORDER_ID        ,
           t1.REGION_ID            ,
           t1.CREATE_DATE         ,
           t1.DONE_CODE            ,
           t1.DONE_DATE           ,
           t1.VALID_DATE                                      ,
           t1.EXPIRE_DATE                                     ,
           t1.OP_ID                ,
           t1.ORG_ID               ,
           t1.STD_ORG_CODE         ,
           t1.OWN_CORP_ORG_ID                            ,
           t1.OWN_CORP_STD_ORG_CODE ,
           t1.STD_UP_BUSI_TYPE_CODE ,
           t1.STD_UP_TYPE_CODE     ,
           t1.IS_CLOUD_MEDIA       ,
           CASE WHEN t1.STATE = 1 AND t2.srvpkg_inst_id IS NULL THEN 1 ELSE 0 END  AS IS_NEW               ,
           t1.IS_UP_MARKETING      ,
           t1.IS_INS               ,
           NULL AS PAR_VALUE            ,
          'BOSS2' AS data_source_cd, 
          t1.is_history_data , 
          %(ARG_OPTIME_LAST1_M)s AS  etl_cycle,
          current_timestamp AS  etl_date
        FROM %(s_stg_fact_ins_srvpkg_b2)s t1
        LEFT JOIN %(s_stg_fact_ins_srvpkg_b2)s t2  -- 判断是否本月新增订购
            ON t1.srvpkg_inst_id = t2.srvpkg_inst_id
           AND t2.STATE = 1 -- 正常订购状态
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
        WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
