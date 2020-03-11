#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST网格客户月发展统计
# Pay: ST_GRID_CUST_DEV_M.py
# Purpose: 统计网格-小区融合、单宽带客户存量数、新增、流失发展统计。
# 
# Author:      wangxx
# 
# Created:     2018-10-24
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
#脚本修改说明及记录
#-------------------------------------------------------------------------------
# wangxx 2018-11-16
# 增加客户类型维度，暂时只统计公众客户和商业客户
# 
# wangxx 2018-11-20
# 修改融合客户统计逻辑，增加融合宽带用户统计
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
s_dwa_fact_cust_mon                    =    "dwa_fact_cust_mon"
s_dwa_lost_cust_mon                    =    "dwa_lost_cust_mon"
s_dim_std_organize                     =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------
s_temp_st_grid_cust_dev_m1              =    "temp_st_grid_cust_dev_m1"
s_temp_st_grid_cust_dev_m2              =    "temp_st_grid_cust_dev_m2"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_grid_cust_dev_m                    =    "st_grid_cust_dev_m"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_temp_st_grid_cust_dev_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    
    hsql='''drop table %(s_temp_st_grid_cust_dev_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放存量和新增客户统计
    hsql='''create table if not exists %(s_temp_st_grid_cust_dev_m1)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            VALID_CUST_CNT   DECIMAL(16),
            PAID_CUST_CNT    DECIMAL(16),
            CONV_VALID_CUST_CNT   DECIMAL(16),
            CONV_VALID_USER_CNT   DECIMAL(16),
            CONV_PAID_CUST_CNT   DECIMAL(16),
            CONV_PAID_USER_CNT   DECIMAL(16),
            OLAN_VALID_CUST_CNT    DECIMAL(16),
            OLAN_VALID_USER_CNT    DECIMAL(16),
            OLAN_PAID_CUST_CNT    DECIMAL(16),
            OLAN_PAID_USER_CNT    DECIMAL(16),
            NEW_CONV_CUST_CNT     DECIMAL(16),
            NEW_CONV_USER_CNT     DECIMAL(16),
            NEW_OLAN_CUST_CNT     DECIMAL(16),
            NEW_OLAN_USER_CNT     DECIMAL(16)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_cust_dev_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 存放流失客户统计
    
    hsql='''create table if not exists %(s_temp_st_grid_cust_dev_m2)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            LOSE_CONV_CUST_CNT     DECIMAL(16),
            LOSE_CONV_USER_CNT     DECIMAL(16),
            LOSE_OLAN_CUST_CNT     DECIMAL(16),
            LOSE_OLAN_USER_CNT     DECIMAL(16)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_cust_dev_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计存量和新增用户
    
    hsql='''
        insert overwrite table  %(s_temp_st_grid_cust_dev_m1)s
        select own_corp_std_org_code,
               cust_type,
               grid_id,
               grid_name,
               mgr_id,
               mgr_name,
               area_std_addr_id,
               area_std_addr_name,
               COUNT(CASE WHEN is_valid1 = 1 THEN cust_id ELSE NULL END) as valid_cust_cnt,
               COUNT(CASE WHEN is_paied = 1 THEN cust_id ELSE NULL END)  as paid_cust_cnt,
               COUNT(CASE WHEN is_valid1 = 1 AND conv_olan_flag = 1 THEN cust_id ELSE NULL END) AS conv_valid_cust_cnt,
               SUM(CASE WHEN is_valid1 = 1 AND conv_olan_flag = 1 THEN lan_count ELSE 0 END) AS conv_valid_user_cnt,
               COUNT(CASE WHEN is_paied = 1 AND conv_olan_flag = 1 THEN cust_id ELSE NULL END) AS conv_paid_cust_cnt,
               SUM(CASE WHEN is_paied = 1 AND conv_olan_flag = 1 THEN lan_count ELSE 0 END) AS conv_paid_user_cnt,
               COUNT(CASE WHEN is_valid1 = 1 AND conv_olan_flag = 2  THEN cust_id ELSE NULL END) AS olan_valid_cust_cnt,
               SUM(CASE WHEN is_valid1 = 1 AND conv_olan_flag = 2  THEN lan_count ELSE 0 END) AS olan_valid_user_cnt,
               COUNT(CASE WHEN is_paied = 1 AND conv_olan_flag = 2 THEN cust_id ELSE NULL END ) AS olan_paid_cust_cnt,
               SUM(CASE WHEN is_paied = 1 AND conv_olan_flag = 2 THEN lan_count ELSE 0 END ) AS olan_paid_user_cnt,
               COUNT(CASE WHEN is_new = 1 AND conv_olan_flag = 1 THEN cust_id ELSE NULL END) AS new_conv_cust_cnt,
               SUM(CASE WHEN is_new = 1 AND conv_olan_flag = 1 THEN lan_count ELSE 0 END) AS new_conv_user_cnt,
               COUNT(CASE WHEN is_new = 1 AND conv_olan_flag = 2 THEN cust_id ELSE NULL END) AS new_olan_cust_cnt,
               SUM(CASE WHEN is_new = 1 AND conv_olan_flag = 2 THEN lan_count ELSE 0 END) AS new_olan_user_cnt
          FROM  %(s_dwa_fact_cust_mon)s 
         WHERE  pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND  grid_id IS NOT NULL 
           AND  own_corp_std_org_code IS NOT NULL 
         group by own_corp_std_org_code,
                  cust_type,
                  grid_id,
                  grid_name,
                  mgr_id,
                  mgr_name,
                  area_std_addr_id,
                  area_std_addr_name
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 统计流失用户 
    hsql='''
        insert overwrite table %(s_temp_st_grid_cust_dev_m2)s
        select own_corp_std_org_code,
               cust_type,
               grid_id,
               grid_name,
               mgr_id,
               mgr_name,
               area_std_addr_id,
               area_std_addr_name,
               COUNT(CASE WHEN conv_olan_flag = 1  THEN cust_id ELSE NULL END) AS lose_conv_cust_cnt,
               SUM(CASE WHEN conv_olan_flag = 1  THEN lan_count ELSE 0 END) AS lose_conv_user_cnt,
               COUNT(CASE WHEN conv_olan_flag = 2 THEN cust_id ELSE NULL END) AS lose_olan_cust_cnt,
               SUM(CASE WHEN conv_olan_flag = 2 THEN lan_count ELSE 0 END) AS lose_olan_user_cnt
          FROM %(s_dwa_lost_cust_mon)s
         WHERE  pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND  grid_id IS NOT NULL 
           AND  own_corp_std_org_code IS NOT NULL
         GROUP BY own_corp_std_org_code,
                  cust_type,
                  grid_id,
                  grid_name,
                  mgr_id,
                  mgr_name,
                  area_std_addr_id,
                  area_std_addr_name
        
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_grid_cust_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               stock.std_org_code as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               stock.cust_type,
               CASE stock.cust_type WHEN 1 THEN '公众' WHEN 4 THEN '商业' ELSE NULL END cust_type_name,
               stock.grid_id,
               stock.grid_name,
               stock.mgr_id,
               stock.mgr_name,
               stock.area_std_addr_id,
               stock.area_std_addr_name,
               COALESCE(stock.valid_cust_cnt,0) AS valid_cust_cnt,
               COALESCE(stock.paid_cust_cnt,0) AS paid_cust_cnt,
               COALESCE(stock.conv_valid_cust_cnt,0) AS conv_valid_cust_cnt,
               COALESCE(stock.conv_valid_user_cnt,0) AS conv_valid_user_cnt,
               COALESCE(stock.conv_paid_cust_cnt,0) AS conv_paid_cust_cnt,
               COALESCE(stock.conv_paid_user_cnt,0) AS conv_paid_user_cnt,
               COALESCE(stock.olan_valid_cust_cnt,0) AS olan_valid_cust_cnt,
               COALESCE(stock.olan_valid_user_cnt,0) AS olan_valid_user_cnt,
               COALESCE(stock.olan_paid_cust_cnt,0) AS olan_paid_cust_cnt,
               COALESCE(stock.olan_paid_user_cnt,0) AS olan_paid_user_cnt,
               COALESCE(stock.new_conv_cust_cnt,0) AS new_conv_cust_cnt,
               COALESCE(stock.new_conv_user_cnt,0) AS new_conv_user_cnt,
               COALESCE(stock.new_olan_cust_cnt,0) AS new_olan_cust_cnt,
               COALESCE(stock.new_olan_user_cnt,0) AS new_olan_user_cnt,
               COALESCE(lose.lose_conv_cust_cnt,0) AS lose_conv_cust_cnt,
               COALESCE(lose.lose_conv_user_cnt,0) AS lose_conv_user_cnt,
               COALESCE(lose.lose_olan_cust_cnt,0) AS lose_olan_cust_cnt,
               COALESCE(lose.lose_olan_user_cnt,0) AS lose_olan_user_cnt,
               current_timestamp as etl_date
          from %(s_temp_st_grid_cust_dev_m1)s stock
                 left join %(s_temp_st_grid_cust_dev_m2)s lose
                     on stock.std_org_code = lose.std_org_code
                    AND stock.cust_type = lose.cust_type
                 AND stock.grid_id = lose.grid_id
                 AND COALESCE(stock.area_std_addr_id,'') = COALESCE(lose.area_std_addr_id,'')
                 inner join %(s_dim_std_organize)s org
                     on stock.std_org_code = org.std_org_code
        WHERE stock.cust_type IN (1,4)
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
