#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA客户住宅月全量表
# Pay: DWA_FACT_INS_ADDRESS_MON.py
# Purpose: 每月boss1、boss2客户住宅明细       
# 
# Author:      wangxx
# 
# Created:     2018-10-17
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
s_stg_fact_ins_address_b1                =    "stg_fact_ins_address_b1"
s_stg_fact_ins_address_b2                =    "stg_fact_ins_address_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwa_fact_ins_address_mon                    =    "dwa_fact_ins_address_mon"

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
    
    hsql='''
        INSERT overwrite table %(t_dwa_fact_ins_address_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
          CUST_ID               ,
          CUST_ADDR_ID          ,
          STD_ADDR_ID         ,
          STD_ADDR_NAME       ,
          MOVE_FLAG           ,
          REGION_ID           ,
          DOOR_NAME           ,
          RELOCATE_FLAG       ,
          CAN_TRANSFER_FLAG   ,
          TRANSFER_STATUS     ,
          TRANSFER_NO         ,
          AUDIT_FLAG          ,
          STREET_STD_ADDR_ID  ,
          STREET_STD_ADDR_NAME ,
          AREA_STD_ADDR_ID    ,
          AREA_STD_ADDR_NAME  ,
          MGR_ADDR_ID         ,
          MGR_ADDR_NAME       ,
          DISTRICT_ID         ,
          DISTRICT_NAME       ,
          VALID_DATE           ,
          EXPIRE_DATE          ,
          CREATE_DATE        ,
          CREATE_OP_ID        ,
          CREATE_ORG_ID       ,
          OWN_ORG_ID          ,
          OWN_CORP_ORG_ID     ,
          DONE_DATE          ,
          DONE_CODE           ,
          OP_ID               ,
          ORG_ID              ,
          STD_ORG_CODE        ,
          OWN_CORP_STD_ORG_CODE ,
          OWN_REGION_STD_ORG_CODE ,
          'BOSS1' AS DATA_SOURCE_CD      ,
          IS_HISTORY_DATA     ,
          %(ARG_OPTIME_LAST1_M)s AS  etl_cycle,
          current_timestamp AS  etl_date
          FROM %(s_stg_fact_ins_address_b1)s t1
         WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 插入boss2数据
    
    hsql='''
        INSERT INTO table %(t_dwa_fact_ins_address_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
          CUST_ID             ,
          CUST_ADDR_ID         ,
          STD_ADDR_ID         ,
          STD_ADDR_NAME       ,
          MOVE_FLAG           ,
          REGION_ID           ,
          DOOR_NAME           ,
          RELOCATE_FLAG       ,
          CAN_TRANSFER_FLAG   ,
          TRANSFER_STATUS     ,
          TRANSFER_NO         ,
          AUDIT_FLAG          ,
          STREET_STD_ADDR_ID  ,
          STREET_STD_ADDR_NAME ,
          AREA_STD_ADDR_ID    ,
          AREA_STD_ADDR_NAME  ,
          MGR_ADDR_ID         ,
          MGR_ADDR_NAME       ,
          DISTRICT_ID         ,
          DISTRICT_NAME       ,
          VALID_DATE         ,
          EXPIRE_DATE        ,
          CREATE_DATE       ,
          CREATE_OP_ID        ,
          CREATE_ORG_ID       ,
          OWN_ORG_ID          ,
          OWN_CORP_ORG_ID     ,
          DONE_DATE         ,
          DONE_CODE           ,
          OP_ID               ,
          ORG_ID              ,
          STD_ORG_CODE        ,
          OWN_CORP_STD_ORG_CODE ,
          OWN_REGION_STD_ORG_CODE ,
          'BOSS2' AS DATA_SOURCE_CD      ,
          IS_HISTORY_DATA     ,
          %(ARG_OPTIME_LAST1_M)s as etl_cycle,
          current_timestamp as etl_date
          from %(s_stg_fact_ins_address_b2)s t1
         WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
        
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
