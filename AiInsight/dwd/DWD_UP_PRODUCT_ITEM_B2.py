#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWD产品单元表BOSS2
# Pay: DWD_UP_PRODUCT_ITEM_B2.py
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
s_stg_up_product_item_b2                =    "stg_up_product_item_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwd_up_product_item_b2                =    "dwd_up_product_item_b2"

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
    #     insert overwrite table %(t_dwd_up_product_item_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #     select distinct
    #       t1.product_item_id     ,
    #       t1.extend_id           ,
    #       t1.code                ,
    #       t1.name                ,
    #       t1.item_type           ,
    #       t1.priority            ,
    #       t1.sort_by             ,
    #       t1.description         ,
    #       t1.creater             ,
    #       t1.modifier            ,
    #       t1.state               ,
    #       t1.del_flag            ,
    #       t1.remark              ,
    #       t1.create_date         ,
    #       t1.modify_date         ,
    #       t1.valid_date          ,
    #       t1.expire_date         ,
    #       t1.use_eff_date        ,
    #       t1.use_exp_date        ,
    #       t1.ent_id              ,
    #       t1.checker             ,
    #       t1.islock              ,
    #       t1.supplier_id         ,
    #       t1.provider_type       ,
    #       t1.business_domain_id  ,
    #       t1.platform_id         ,
    #       t1.extend_id2          ,
    #       t1.own_corp_org_id     ,
    #       t1.own_corp_std_org_code,
    #       t1.ext1,
    #       t1.data_source_cd,
    #       t1.is_history_data,
    #       %(ARG_OPTIME_LAST1_M)s etl_cycle,
    #       CURRENT_TIMESTAMP  etl_date
    #       from %(s_stg_up_product_item_b2)s t1
    #      where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
    #        and coalesce(t1.product_item_id,'') <> ''
    #
    # '''% vars()
    # QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
