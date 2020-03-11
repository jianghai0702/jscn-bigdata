#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST宽带融合用户客户校验
# Pay: ST_CONV_LAN_CHECK.py
# Purpose: 校验融合客户发展数据,以用户表为准统计客户
# 
# Author:      wangxx
# 
# Created:     2018-10-19
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
s_dwa_fact_ins_prod_mon                   =    "dwa_fact_ins_prod_mon"
s_dim_std_organize                    =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------
t_tmp_st_conv_lan_all                     =    "tmp_st_conv_lan_all"
t_tmp_st_conv_lan_conv                    =    "tmp_st_conv_lan_conv"
t_tmp_st_conv_lan_olan                    =    "tmp_st_conv_lan_olan"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_conv_lan_check                    =    "st_conv_lan_check"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    #-------------------------------------------------------------------------------
    # 删除临时表
    
    hsql='''
        drop table %(t_tmp_st_conv_lan_all)s
    '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''
        drop table %(t_tmp_st_conv_lan_conv)s
    '''% vars()
    QueryExe(hsql,name,dates)
    
    hsql='''
        drop table %(t_tmp_st_conv_lan_olan)s
    '''% vars()
    QueryExe(hsql,name,dates)
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放全量用户、客户
    hsql='''
        CREATE TABLE IF NOT EXISTS %(t_tmp_st_conv_lan_all)s
          (
            std_org_code VARCHAR(6),
            total_cust_count DECIMAL(16,0),
            total_user_count DECIMAL(16),
            dtv_user_count   DECIMAL(16),
            lan_user_count   DECIMAL(16)
            )
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 存放融合用户、客户
    hsql='''
        CREATE TABLE IF NOT EXISTS  %(t_tmp_st_conv_lan_conv)s
          (
            std_org_code VARCHAR(6),
            conv_cust_count DECIMAL(16,0),
            conv_lan_user_count DECIMAL(16)
        
            )
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 存放单宽带用户、客户
    hsql='''
        CREATE TABLE IF NOT EXISTS  %(t_tmp_st_conv_lan_olan)s
          (
            std_org_code VARCHAR(6),
            olan_cust_count DECIMAL(16,0),
            olan_user_count DECIMAL(16)
            )
    '''% vars()
    QueryExe(hsql,name,dates)
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计全量用户、客户
    hsql='''
        insert overwrite table  %(t_tmp_st_conv_lan_all)s
        select t1.own_corp_std_org_code,
               COUNT(DISTINCT concat(cust_id,data_source_cd)) total_cust_count,
               COUNT(DISTINCT concat(prod_inst_id,data_source_cd)) total_user_count,
               COUNT(DISTINCT CASE WHEN is_dtv = 1 THEN concat(prod_inst_id,data_source_cd) ELSE NULL END)   dtv_user_count,
               COUNT(DISTINCT CASE WHEN is_lan = 1 THEN concat(prod_inst_id,data_source_cd) ELSE NULL END )  lan_user_count
          from %(s_dwa_fact_ins_prod_mon)s t1
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         AND   t1.is_valid1 = 1 
         group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 统计融合用户、客户
    hsql='''
        insert overwrite table  %(t_tmp_st_conv_lan_conv)s
        select t1.own_corp_std_org_code,
               COUNT(DISTINCT concat(cust_id,data_source_cd)) conv_cust_count,
               COUNT(DISTINCT concat(prod_inst_id,data_source_cd)) conv_lan_user_count
          from %(s_dwa_fact_ins_prod_mon)s t1
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t1.is_valid1 = 1 
           AND t1.is_lan = 1
           AND EXISTS (SELECT 1 
                         FROM %(s_dwa_fact_ins_prod_mon)s t2 
                        WHERE t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
                          AND t2.is_dtv = 1
                          AND t1.cust_id = t2.cust_id
           )
         group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 统计单宽带用户、客户
    hsql='''
        insert overwrite table  %(t_tmp_st_conv_lan_olan)s
        select t1.own_corp_std_org_code,
               COUNT(DISTINCT concat(cust_id,data_source_cd)) olan_cust_count,
               COUNT(DISTINCT concat(prod_inst_id,data_source_cd)) olan_user_count
          from %(s_dwa_fact_ins_prod_mon)s t1
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t1.is_valid1 = 1 
           AND t1.is_lan = 1
           AND NOT EXISTS (SELECT 1 
                         FROM %(s_dwa_fact_ins_prod_mon)s t2 
                        WHERE t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
                          AND t2.is_dtv = 1
                          AND t1.cust_id = t2.cust_id
           )
         group by t1.own_corp_std_org_code
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_conv_lan_check)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               a.std_org_code as own_corp_std_org_code,
               o.std_org_name   as own_corp_std_org_name,
               a.total_cust_count,
               c.conv_cust_count,
               l.olan_cust_count,
               a.total_user_count,
               a.dtv_user_count,
               a.lan_user_count,
               c.conv_lan_user_count,
               l.olan_user_count,
               current_timestamp as etl_date
          from %(t_tmp_st_conv_lan_all)s a
                 LEFT JOIN %(t_tmp_st_conv_lan_conv)s c
                     ON a.std_org_code = c.std_org_code
                 LEFT JOIN %(t_tmp_st_conv_lan_olan)s l
                     ON a.std_org_code = l.std_org_code
                 left join %(s_dim_std_organize)s o
                     ON a.std_org_code = o.std_org_code
         where coalesce(a.std_org_code,'')  <> ''
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
