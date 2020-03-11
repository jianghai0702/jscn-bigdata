#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST用户月发展统计（新）      
# Pay: ST_NEW_USER_DEV_M.py
# Purpose: 统计数字电视和宽带用户存量、新增、流失情况
# 
# Author:      wangxx
# 
# Created:     2018-09-30
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 修改说明
#-------------------------------------------------------------------------------
# wangxx 2018-10-17
# 增加data_source_cd的判断，避免boss1、boss2表用户id的重复
# 
# wangxx 2018-11-13
# 增加向上钻取到地市、省的汇总统计
# 
# wangxx 2018-11-16
# 关联客户表，增加客户类型维度,暂时只统计公众客户和商业客户
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
s_dwa_fact_ins_prod_mon                =    "dwa_fact_ins_prod_mon"
s_dwa_lost_users_mon                   =    "dwa_lost_users_mon"
s_dwa_fact_cust_mon                    =    "dwa_fact_cust_mon"
s_dim_std_organize                     =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------
s_temp_st_new_user_dev_m1              =    "temp_st_new_user_dev_m1"
s_temp_st_new_user_dev_m2              =    "temp_st_new_user_dev_m2"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_new_user_dev_m                    =    "st_new_user_dev_m"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_temp_st_new_user_dev_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    
    hsql='''drop table %(s_temp_st_new_user_dev_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放存量和新增用户统计
    hsql='''create table if not exists %(s_temp_st_new_user_dev_m1)s  (
            STD_ORG_CODE    varchar(6),
            CUST_TYPE       decimal(2,0),
            DTV_USER_COUNT  decimal(16,0),
            DTV_PAID_USER_COUNT  decimal(16,0),
            LAN_USER_COUNT    decimal(16,0),
            LAN_PAID_USER_COUNT    decimal(16,0),
            NEW_DTV_USER_COUNT    decimal(16,0),
            NEW_LAN_USER_COUNT    decimal(16,0)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_new_user_dev_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 存放流失用户统计
    
    hsql='''create table if not exists %(s_temp_st_new_user_dev_m2)s  (
            STD_ORG_CODE    varchar(6),
            CUST_TYPE       decimal(2,0),
            LOSE_DTV_USER_COUNT    decimal(16,0),
            LOSE_LAN_USER_COUNT    decimal(16,0)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_new_user_dev_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计存量和新增用户
    
    hsql='''insert overwrite table  %(s_temp_st_new_user_dev_m1)s
                select t1.own_corp_std_org_code,
                       t2.cust_type,
                       count(distinct case when t1.is_valid1 = 1 and t1.is_dtv = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as DTV_USER_COUNT,
                       count(distinct case when t1.is_paid = 1 and t1.is_dtv = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as DTV_PAID_USER_COUNT,
                       count(distinct case when t1.is_valid1 = 1 and t1.is_lan = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as LAN_USER_COUNT,
                       count(distinct case when t1.is_paid = 1 and t1.is_lan = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as LAN_PAID_USER_COUNT,
    
                       count(distinct case when t1.is_valid1 = 1 and t1.is_dtv = 1 and t1.is_new = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as NEW_DTV_USER_COUNT,
                       count(distinct case when t1.is_valid1 = 1 and t1.is_lan = 1 and t1.is_new = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as NEW_LAN_USER_COUNT
                  from %(s_dwa_fact_ins_prod_mon)s t1
                 left join %(s_dwa_fact_cust_mon)s t2  
                    on t1.cust_id = t2.cust_id 
                   and t1.data_source_cd = t2.data_source_cd
                   and t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
                 where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
                group by t1.own_corp_std_org_code,t2.cust_type
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 统计流失用户 
    hsql='''
        insert overwrite table %(s_temp_st_new_user_dev_m2)s
        select t1.own_corp_std_org_code,
               t2.cust_type,
               COUNT(distinct case when t1.is_dtv = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as LOSE_DTV_USER_COUNT,
               count(distinct case when t1.is_lan = 1 then concat(t1.prod_inst_id,t1.data_source_cd) else null end) as LOSE_LAN_USER_COUNT
          from %(s_dwa_lost_users_mon)s t1
        LEFT JOIN %(s_dwa_fact_cust_mon)s t2 
            ON t1.cust_id = t2.cust_id
           and t1.data_source_cd = t2.data_source_cd
           and t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         group by t1.own_corp_std_org_code,t2.cust_type
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_new_user_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               stock.std_org_code as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               stock.cust_type,
               CASE stock.cust_type 
               WHEN 1 THEN '公众'
               WHEN 4 THEN '商业'
               ELSE NULL END AS cust_type_name,
               stock.dtv_user_count,
               stock.dtv_paid_user_count,
               stock.lan_user_count,
               stock.lan_paid_user_count,
               coalesce(stock.new_dtv_user_count,0) as new_dtv_user_count,
               coalesce(stock.new_lan_user_count,0) as new_lan_user_count,
               coalesce(lose.lose_dtv_user_count,0) as lose_dtv_user_count,
               coalesce(lose.lose_lan_user_count,0) as lose_lan_user_count,
               current_timestamp as etl_date
          from %(s_temp_st_new_user_dev_m1)s stock
                 left join %(s_temp_st_new_user_dev_m2)s lose
                     on stock.std_org_code = lose.std_org_code
                    AND stock.cust_type = lose.cust_type
                 inner join %(s_dim_std_organize)s org
                     on stock.std_org_code = org.std_org_code
         where coalesce(stock.std_org_code,'')  <> ''
           AND stock.cust_type IN (1,4)  -- 只统计公众和商业客户
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 向上钻取到地市、省级维度汇总统计
    
    hsql='''
        INSERT INTO TABLE %(t_st_new_user_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT cycle_id,
               COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code,
               COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name,
               t1.cust_type,
               t1.cust_type_name,
               SUM(t1.dtv_user_count) AS dtv_user_count,
               SUM(t1.dtv_paid_user_count) AS dtv_paid_user_count,
               SUM(t1.lan_user_count) AS lan_user_count,
               SUM(t1.lan_paid_user_count) AS lan_paid_user_count,
               SUM(t1.new_dtv_user_count) AS new_dtv_user_count,
               SUM(t1.new_lan_user_count) AS new_lan_user_count,
               SUM(t1.lose_dtv_user_count) AS lose_dtv_user_count,
               SUM(t1.lose_lan_user_count) AS lose_lan_user_count,
               current_timestamp as etl_date
          FROM %(t_st_new_user_dev_m)s t1
        LEFT JOIN %(s_dim_std_organize)s t2
            ON t1.own_corp_std_org_code = t2.std_org_code
        LEFT JOIN %(s_dim_std_organize)s t3
            ON t3.std_org_code = t2.p_std_org_code
         WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name GROUPING SETS ((cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name),(cycle_id,t1.cust_type,t1.cust_type_name))
        
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
