#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST客户月发展统计
# Pay: ST_CUST_DEV_M.py
# Purpose: 统计融合、单宽带客户的存量、新增、流失月发展情况
# 
# Author:      wangxx
# 
# Created:     2018-10-19
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 修改记录
#-------------------------------------------------------------------------------
# wangxx 2018-10-17
# 增加data_source_cd的判断，避免boss1、boss2表用户id的重复
# 
# wangxx 2018-11-14
# 增加向上钻取到地市、省的汇总统计
# 
# wangxx 2018-11-20
# 增加客户联系维护、统计公众和商业客户
# 
# wangxx 2018-11-20
# 修改融合、单宽带判断逻辑，以用户表的状态判断融合、单宽带客户。
# 并添加融合客户下的宽带用户和单宽带用户字段。
#
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
s_dwa_fact_cust_mon                   =    "dwa_fact_cust_mon"
s_dwa_lost_cust_mon                   =    "dwa_lost_cust_mon"
s_dim_std_organize                    =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------
s_temp_st_cust_dev_m1              =    "temp_st_cust_dev_m1"
s_temp_st_cust_dev_m2              =    "temp_st_cust_dev_m2"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_cust_dev_m                    =    "st_cust_dev_m"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_temp_st_cust_dev_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    
    hsql='''drop table %(s_temp_st_cust_dev_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放存量和新增客户统计
    hsql='''create table if not exists %(s_temp_st_cust_dev_m1)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            total_valid_cust_count  decimal(16,0),
            total_paid_cust_count   decimal(16,0),
            conv_valid_cust_count   decimal(16,0),
            conv_valid_user_count   decimal(16,0),
            conv_paid_cust_count   decimal(16,0),
            conv_paid_user_count   decimal(16,0),
            olan_valid_cust_count   decimal(16,0),
            olan_valid_user_count   decimal(16,0),
            olan_paid_cust_count   decimal(16,0),
            olan_paid_user_count   decimal(16,0),
            new_conv_cust_count    decimal(16,0),
            new_conv_user_count    decimal(16,0),
            new_olan_cust_count    decimal(16,0),
            new_olan_user_count    decimal(16,0)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_cust_dev_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 存放流失客户统计
    
    hsql='''create table if not exists %(s_temp_st_cust_dev_m2)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            LOSE_CONV_CUST_COUNT    decimal(16,0),
            LOSE_CONV_USER_COUNT    decimal(16,0),
            LOSE_OLAN_CUST_COUNT    decimal(16,0),
            LOSE_OLAN_USER_COUNT    decimal(16,0)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_cust_dev_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计存量和新增客户
    
    hsql='''
        insert overwrite table  %(s_temp_st_cust_dev_m1)s
        select t1.own_corp_std_org_code,
               t1.cust_type,
               count(case when t1.is_valid1 = 1  then t1.cust_id else null end) as total_valid_cust_count,
               count(case when t1.is_paied = 1   then t1.cust_id else null end) as total_paid_cust_count,
               count(case when t1.is_valid1 = 1 and t1.conv_olan_flag = 1 then t1.cust_id else null end) as conv_valid_cust_count, -- 有效融合客户
               SUM(case when t1.is_valid1 = 1 and t1.conv_olan_flag = 1 then t1.lan_count else 0 end) as conv_valid_user_count, -- 有效融合宽带用户数
               count(case when t1.is_paied = 1 and t1.conv_olan_flag = 1 then t1.cust_id else null end) as conv_paid_cust_count, -- 缴费融合客户
               SUM(case when t1.is_paied = 1 and t1.conv_olan_flag = 1 then t1.lan_count else 0 end) as conv_paid_user_count, -- 缴费融合宽带用户数
               count(case when t1.is_valid1 = 1 AND T1.conv_olan_flag = 2  then t1.cust_id else null end) as olan_valid_cust_count, -- 有效单宽带客户数
               SUM(case when t1.is_valid1 = 1 AND T1.conv_olan_flag = 2  then t1.lan_count else 0 end) as olan_valid_user_count, -- 有效单宽带用户数
               count(case when t1.is_paied = 1 and t1.conv_olan_flag = 2 then t1.cust_id else null end) as olan_paid_cust_count, -- 缴费单宽带客户数
               SUM(case when t1.is_paied = 1 and t1.conv_olan_flag = 2 then t1.lan_count else 0 end) as olan_paid_user_count, -- 缴费单宽带用户数
               count(case when t1.is_new = 1 and t1.conv_olan_flag = 1 then t1.cust_id else null end) as new_conv_cust_count, -- 新增融合客户数
               SUM(case when t1.is_new = 1 and t1.conv_olan_flag = 1 then t1.lan_count else 0 end) as new_conv_user_count, -- 新增融合宽带用户数
               count(case when t1.is_new = 1 and t1.conv_olan_flag = 2 THEN t1.cust_id else null end) as conv_paid_cust_count,  -- 新增单宽带客户数
               SUM(case when t1.is_new = 1 and t1.conv_olan_flag = 2 THEN t1.lan_count else 0 end) as conv_paid_cust_count  -- 新增单宽带用户数
          from %(s_dwa_fact_cust_mon)s t1
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         group by t1.own_corp_std_org_code,t1.cust_type
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 统计流失客户 
    hsql='''
        insert overwrite table %(s_temp_st_cust_dev_m2)s
        select t1.own_corp_std_org_code,
               t1.cust_type,
               COUNT(case when t1.conv_olan_flag = 1  then t1.cust_id else null end) as LOSE_CONV_CUST_COUNT,
               SUM(case when t1.conv_olan_flag = 1  then t1.lan_count else 0 end) as LOSE_CONV_USER_COUNT,
               count(case when t1.conv_olan_flag = 2 then t1.cust_id else null end) as LOSE_OLAN_CUST_COUNT,
               SUM(case when t1.conv_olan_flag = 2 then t1.lan_count else 0 end) as LOSE_OLAN_USER_COUNT
          from %(s_dwa_lost_cust_mon)s t1
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         group by t1.own_corp_std_org_code,t1.cust_type
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_cust_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               stock.std_org_code as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               stock.cust_type,
               CASE stock.cust_type 
               WHEN 1 THEN '公众'
               WHEN 4 THEN '商业'
               ELSE NULL END AS cust_type_name,
               stock.total_valid_cust_count,
               stock.total_paid_cust_count,
               stock.conv_valid_cust_count,
               stock.conv_valid_user_count,
               stock.conv_paid_cust_count,
               stock.conv_paid_user_count,
               stock.olan_valid_cust_count,
               stock.olan_valid_user_count,
               stock.olan_paid_cust_count,
               stock.olan_paid_user_count,
               coalesce(stock.new_conv_cust_count,0) as new_conv_cust_count,
               coalesce(stock.new_conv_user_count,0) as new_conv_user_count,
               coalesce(stock.new_olan_cust_count,0) as new_olan_cust_count,
               coalesce(stock.new_olan_user_count,0) as new_olan_user_count,
        
               coalesce(lose.lose_conv_cust_count,0) as lose_conv_cust_count,
               coalesce(lose.lose_conv_user_count,0) as lose_conv_user_count,
               coalesce(lose.lose_olan_cust_count,0) as lose_olan_cust_count,
               coalesce(lose.lose_olan_user_count,0) as lose_olan_user_count,
               current_timestamp as etl_date
          from %(s_temp_st_cust_dev_m1)s stock
                 left join %(s_temp_st_cust_dev_m2)s lose
                     on stock.std_org_code = lose.std_org_code
                    AND stock.cust_type = lose.cust_type
                 inner join %(s_dim_std_organize)s org
                     on stock.std_org_code = org.std_org_code
         where coalesce(stock.std_org_code,'')  <> ''
           AND stock.cust_type IN (1,4)
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 向上钻取到地市、省汇总统计
    
    hsql='''
        INSERT INTO TABLE %(t_st_cust_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT cycle_id,
               COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code,
               COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name,
               t1.cust_type,
               t1.cust_type_name,
               SUM(t1.total_valid_cust_count) AS total_valid_cust_count,
               SUM(t1.total_paid_cust_count) AS total_paid_cust_count,
               SUM(t1.conv_valid_cust_count) AS conv_valid_cust_count,
               SUM(t1.conv_valid_user_count) AS conv_valid_user_count,
               SUM(t1.conv_paid_cust_count) AS conv_paid_cust_count,
               SUM(t1.conv_paid_user_count) AS conv_paid_user_count,
               SUM(t1.olan_valid_cust_count) AS olan_valid_cust_count,
               SUM(t1.olan_valid_user_count) AS olan_valid_user_count,
               SUM(t1.olan_paid_cust_count) AS olan_paid_cust_count,
               SUM(t1.olan_paid_user_count) AS olan_paid_user_count,
               SUM(t1.new_conv_cust_count) AS new_conv_cust_count,
               SUM(t1.new_conv_user_count) AS new_conv_user_count,
               SUM(t1.new_olan_cust_count) AS new_olan_cust_count,
               SUM(t1.new_olan_user_count) AS new_olan_user_count,
               SUM(t1.lose_conv_cust_count) AS lose_conv_cust_count,
               SUM(t1.lose_conv_user_count) AS lose_conv_user_count,
               SUM(t1.lose_olan_cust_count) AS lose_olan_cust_count,
               SUM(t1.lose_olan_user_count) AS lose_olan_user_count,
               current_timestamp as etl_date
          FROM %(t_st_cust_dev_m)s t1
                 LEFT JOIN %(s_dim_std_organize)s t2
                     ON t1.own_corp_std_org_code = t2.std_org_code
                 LEFT JOIN %(s_dim_std_organize)s t3
                     ON t3.std_org_code = t2.p_std_org_code
         WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
         GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name 
         GROUPING SETS ((cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name),(cycle_id,t1.cust_type,t1.cust_type_name))
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
