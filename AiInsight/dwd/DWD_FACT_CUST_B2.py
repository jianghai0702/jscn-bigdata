#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWD客户全量表boss2
# Pay: DWD_FACT_CUST_B2.py
# Purpose: 
# 
# Author:      wangxx
# 
# Created:     2018-10-15
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
s_stg_fact_cust_b2                =    "stg_fact_cust_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwd_fact_cust_b2                    =    "dwd_fact_cust_b2"

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
    
    # hsql='''
    #     INSERT overwrite table %(t_dwd_fact_cust_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #     SELECT distinct
    #       CUST_ID                           ,
    #       CUST_CODE                      ,
    #       OLD_CUST_ID                    ,
    #       OLD_CUST_CODE                  ,
    #       CUST_NAME                     ,
    #       CUST_TYPE                          ,
    #       CUST_LEVEL                         ,
    #       CUST_STATUS                        ,
    #       CUST_CERT_TYPE                     ,
    #       CUST_CERT_NO                   ,
    #       CUST_CERT_ADDR                ,
    #       CERT_VALID_date                        ,
    #       CERT_EXPIRE_date                       ,
    #       CUST_OCCUPATION                    ,
    #       BORDER_FLAG                        ,
    #       CREATE_date                            ,
    #       CREATE_OP_ID                      ,
    #       CREATE_ORG_ID                     ,
    #       VALID_date                             ,
    #       EXPIRE_date                            ,
    #       DONE_date                              ,
    #       DONE_CODE                         ,
    #       OP_ID                             ,
    #       ORG_ID                            ,
    #       DISTRICT_ID                        ,
    #       CORP_ORG_ID                       ,
    #       STD_ORG_CODE                              ,
    #       OWN_CORP_STD_ORG_CODE                     ,
    #       OWN_REGION_STD_ORG_CODE                   ,
    #       STD_DIS_CODE                              ,
    #       CUST_PROP                                     ,
    #       ATV_COUNT                                     ,
    #       DTV_COUNT                                     ,
    #       DFTV_COUNT                                    ,
    #       DBITV_COUNT                                   ,
    #       DITV_COUNT                                    ,
    #       LAN_COUNT                                     ,
    #       VOIP_COUNT                                    ,
    #       AMSP_COUNT                                    ,
    #       EXT1_COUNT                                    ,
    #       EXT2_COUNT                                    ,
    #       HDTV_COUNT                                    ,
    #       HDITV_COUNT                                   ,
    #       USER_COUNT                                    ,
    #       SECOND_USER_COUNT                             ,
    #       IS_CLOUD_MEDIA                                ,
    #       IS_VALID                                      ,
    #       IS_VALID1                                     ,
    #       IS_VALID2                                     ,
    #       IS_ONLINE                                     ,
    #       IS_DTV_SUSPEND                                ,
    #       IS_LAN_SUSPEND                                ,
    #       IS_VOIP_SUSPEND                               ,
    #       IS_DEBT_STOP                                  ,
    #       IS_DEBT_CUT                                   ,
    #       IS_DTV_MANA_STOP                              ,
    #       IS_LAN_MANA_STOP                              ,
    #       IS_FREE                                       ,
    #       IS_PAIED                                      ,
    #       IS_UNPAY                                      ,
    #       IS_ITV_ACTIVE                                 ,
    #       IS_NEW                                        ,
    #       IS_LOSE                                       ,
    #       IS_LOSE1                                      ,
    #       HAVE_SWITCH_ON                                ,
    #       TV_PAY_STATUS                                 ,
    #       TV_GAME_STATUS                                ,
    #       IS_HOUSE                                      ,
    #       IS_INS                                        ,
    #       IS_DTV_PAIED                                  ,
    #       DATA_SOURCE_CD                            ,
    #       IS_HISTORY_DATA                               ,
    #       %(ARG_OPTIME_LAST1_M)s as etl_cycle,
    #       current_timestamp as etl_date
    #       from %(s_stg_fact_cust_b2)s
    #      WHERE pt_mon = %(ARG_OPTIME_LAST1_M)s
    # '''% vars()
    # QueryExe(hsql,name,dates)
    #
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
