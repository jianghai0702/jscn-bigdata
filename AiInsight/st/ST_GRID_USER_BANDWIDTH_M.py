#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST网格用户发展带宽统计
# Pay: ST_GRID_USER_BANDWIDTH_M.py
# Purpose: 统计网格-小区存量、新增、流失用户产品带宽订购情况
# 
# Author:      wangxx
# 
# Created:     2018-11-02
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
#-------------------------------------------------------------------------------
# wangxx 2018-11-19
# 添加客户类型维度，区分公众、商业客户
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
ARG_OPTIME_MON01          = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_MON01_ISO      = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期

# 源表声明
#-------------------------------------------------------------------------------
s_st_grid_user_product_m              =    "st_grid_user_product_m"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_grid_user_bandwidth_m                    =    "st_grid_user_bandwidth_m"    

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
    
    hsql='''
        insert overwrite table %(t_st_grid_user_bandwidth_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT t.cycle_id,
               t.own_corp_std_org_code,
               t.own_corp_std_org_name,
               t.cust_type,
               t.cust_type_name,
               t.grid_id,
               t.grid_name,
               t.mgr_id,
               t.mgr_name,
               t.area_std_addr_id,
               t.area_std_addr_name,
               t.bandwidth,
               COALESCE(SUM(t.valid_user_cnt),0) AS valid_user_cnt,
               COALESCE(SUM(t.new_user_cnt),0) AS new_user_cnt,
               COALESCE(SUM(t.lose_user_cnt),0) AS lose_user_cnt,
               CURRENT_TIMESTAMP AS etl_date
          FROM %(s_st_grid_user_product_m)s t
         WHERE T.pt_mon = %(ARG_OPTIME_LAST1_M)s
        GROUP BY t.cycle_id,
                 t.own_corp_std_org_code,
                 t.own_corp_std_org_name,
                 t.cust_type,
                 t.cust_type_name,
                 t.grid_id,
                 t.grid_name,
                 t.mgr_id,
                 t.mgr_name,
                 t.area_std_addr_id,
                 t.area_std_addr_name,
                 t.bandwidth
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
