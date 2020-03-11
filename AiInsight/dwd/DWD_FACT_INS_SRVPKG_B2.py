#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWD产品订购月全量表BOSS2
# Pay: DWD_FACT_INS_SRVPKG_B2.py
# Purpose: 
# 
# Author:      wangxx
# 
# Created:     2018-10-29
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
s_stg_fact_ins_srvpkg_b2                =    "stg_fact_ins_srvpkg_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwd_fact_ins_srvpkg_b2                =    "dwd_fact_ins_srvpkg_b2"

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
    #     insert overwrite table %(t_dwd_fact_ins_srvpkg_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #     select  distinct
    #       t1.srvpkg_inst_id      ,
    #       t1.offer_inst_id       ,
    #       t1.offer_id            ,
    #       t1.offer_type          ,
    #       t1.srvpkg_id           ,
    #       t1.service_price_kind  ,
    #       t1.is_main             ,
    #       t1.cust_id             ,
    #       t1.prod_inst_id        ,
    #       t1.prod_spec_id        ,
    #       t1.valid_type          ,
    #       t1.oper_state          ,
    #       t1.state               ,
    #       t1.prod_service_id     ,
    #       t1.os_status           ,
    #       t1.src_system_id       ,
    #       t1.src_system_ext_code ,
    #       t1.cust_order_id       ,
    #       t1.region_id           ,
    #       t1.create_date         ,
    #       t1.done_code           ,
    #       t1.done_date           ,
    #       t1.valid_date          ,
    #       t1.expire_date         ,
    #       t1.op_id               ,
    #       t1.org_id              ,
    #       t1.std_org_code        ,
    #       t1.own_corp_org_id     ,
    #       t1.own_corp_std_org_code,
    #       t1.std_up_busi_type_code,
    #       t1.std_up_type_code    ,
    #       t1.is_cloud_media      ,
    #       t1.is_up_marketing,
    #       t1.is_new              ,
    #       t1.is_new_online       ,
    #       t1.is_cancel           ,
    #       t1.is_cancel_online    ,
    #       t1.is_ins              ,
    #       t1.is_online           ,
    #       t1.data_source_cd      ,
    #       t1.is_history_data     ,
    #       %(ARG_OPTIME_LAST1_M)s etl_cycle,
    #       CURRENT_TIMESTAMP  etl_date
    #       from %(s_stg_fact_ins_srvpkg_b2)s t1
    #      where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
    #
    #
    # '''% vars()
    # QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
