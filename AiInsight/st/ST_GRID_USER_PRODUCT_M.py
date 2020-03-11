#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST网格用户月发展产品统计
# Pay: ST_GRID_USER_PRODUCT_M.py
# Purpose: 统计网格-小区存量、新增、流失用户产品订购情况
# 
# Author:      wangxx
# 
# Created:     2018-10-31
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
#-------------------------------------------------------------------------------
# 保留小区id为空，网格id不为空的记录，以保证网格统计的准确性。
# 
# wangxx 2018-11-19
# 添加客户类型维度，暂时统计公众客户、商业客户
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
s_dwa_fact_ins_prod_mon                =    "dwa_fact_ins_prod_mon"
s_dwa_lost_users_mon                   =    "dwa_lost_users_mon"
s_dwa_fact_cust_mon                    =    "dwa_fact_cust_mon"
s_dwa_lost_cust_mon                    =    "dwa_lost_cust_mon"
s_dim_std_organize                     =    "dim_std_organize"
s_dwa_fact_ins_srvpkg_mon              =    "dwa_fact_ins_srvpkg_mon"
s_dim_std_up_product                   =    "dim_std_up_product"

# 临时表声明
#-------------------------------------------------------------------------------
s_temp_st_grid_user_product_m1              =    "temp_st_grid_user_product_m1"
s_temp_st_grid_user_product_m2              =    "temp_st_grid_user_product_m2"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_grid_user_product_m                    =    "st_grid_user_product_m"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_temp_st_grid_user_product_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    
    hsql='''drop table %(s_temp_st_grid_user_product_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放存量和新增用户统计
    hsql='''create table if not exists %(s_temp_st_grid_user_product_m1)s  (
            STD_ORG_CODE    varchar(6),
            CUST_TYPE            DECIMAL(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            product_id           decimal(16),
            product_name         varchar(100),
            prod_service_id      decimal(16),
            bandwidth            decimal(16),
            cycle                decimal(16),
            arpu                 decimal(16,2),
            billing_type         decimal(1),
            VALID_USER_CNT       DECIMAL(16),
            NEW_USER_CNT    DECIMAL(16)
    
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_user_product_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 存放流失用户统计
    
    hsql='''create table if not exists %(s_temp_st_grid_user_product_m2)s  (
            STD_ORG_CODE    varchar(6),
            CUST_TYPE            DECIMAL(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            product_id           decimal(16),
            product_name         varchar(100),
            prod_service_id      decimal(16),
            bandwidth            decimal(16),
            cycle                decimal(16),
            arpu                 decimal(16,2),
            billing_type         decimal(1),
            LOSE_USER_CNT    DECIMAL(16)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_user_product_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计存量和新增用户
    
    hsql='''
        insert overwrite table  %(s_temp_st_grid_user_product_m1)s
        select t1.own_corp_std_org_code,
               t2.cust_type,
               t2.grid_id,
               t2.grid_name,
               t2.mgr_id,
               t2.mgr_name,
               t2.area_std_addr_id,
               t2.area_std_addr_name,
               t4.product_id,
               t4.product_name,
               t4.prod_service_id,
               t4.bandwidth,
               t4.CYCLE,
               t4.arpu,
               t4.billing_type,
               COUNT(DISTINCT CASE WHEN t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS valid_user_cnt,
               COUNT(DISTINCT CASE WHEN t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_user_cnt
          from %(s_dwa_fact_ins_prod_mon)s t1 -- 用户表
        INNER JOIN %(s_dwa_fact_cust_mon)s t2 -- 客户表
            ON t1.cust_id = t2.cust_id
           AND t1.data_source_cd = t2.data_source_cd -- boss1,boss2
           AND t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
        INNER JOIN %(s_dwa_fact_ins_srvpkg_mon)s t3 -- 用户产品订购表
            ON t1.prod_inst_id = t3.prod_inst_id
           AND t1.data_source_cd = t3.data_source_cd
           AND t3.prod_service_id = 1004  -- 统计宽带产品
           AND t3.STATE = 1 -- 订购状态
           AND t3.pt_mon = %(ARG_OPTIME_LAST1_M)s
        INNER JOIN (
          SELECT * 
            FROM 
                (SELECT product_id,product_name,prod_service_id,bandwidth,CYCLE,arpu,billing_type,data_source_cd,row_number() over (partition BY product_id,data_source_cd ORDER BY modify_date DESC) AS rn
                   FROM %(s_dim_std_up_product)s 
                  WHERE modify_date < CAST(concat('%(ARG_OPTIME_MON01_ISO)s',' 00:00:00.0') AS TIMESTAMP) OR modify_date IS NULL ) d 
           WHERE d.rn=1                 -- 获取当期产品配置信息
        ) t4  -- 产品配置信息
            ON t3.srvpkg_id = t4.product_id
           AND t3.data_source_cd = t4.data_source_cd
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t2.grid_id IS NOT NULL 
           AND t1.own_corp_std_org_code IS NOT NULL 
         group by t1.own_corp_std_org_code,
                  t2.cust_type,
                  t2.grid_id,
                  t2.grid_name,
                  t2.mgr_id,
                  t2.mgr_name,
                  t2.area_std_addr_id,
                  t2.area_std_addr_name,
                  t4.product_id,
                  t4.product_name,
                  t4.prod_service_id,
                  t4.bandwidth,
                  t4.CYCLE,
                  t4.arpu,
                  t4.billing_type
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 统计流失用户 
    # 用户本月已流失，所以统计的是用户上月的订购情况
    hsql='''
        insert overwrite table %(s_temp_st_grid_user_product_m2)s
        select t1.own_corp_std_org_code,
               t2.cust_type,
               t2.grid_id,
               t2.grid_name,
               t2.mgr_id,
               t2.mgr_name,
               t2.area_std_addr_id,
               t2.area_std_addr_name,
               t4.product_id,
               t4.product_name,
               t4.prod_service_id,
               t4.bandwidth,
               t4.CYCLE,
               t4.arpu,
               t4.billing_type,
               COUNT(DISTINCT t1.prod_inst_id) AS lose_user_cnt       
          from %(s_dwa_lost_users_mon)s t1
        INNER JOIN %(s_dwa_fact_cust_mon)s t2 -- 上月客户信息
            ON t1.cust_id = t2.cust_id 
           AND t1.data_source_cd = t2.data_source_cd
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
        INNER JOIN %(s_dwa_fact_ins_srvpkg_mon)s t3 -- 上月用户产品订购信息
            ON t1.prod_inst_id = t3.prod_inst_id
           AND t1.data_source_cd = t3.data_source_cd
           AND t3.prod_service_id = 1004  -- 统计宽带产品
           AND t3.STATE = 1 -- 订购状态
           AND t3.pt_mon = %(ARG_OPTIME_LAST2_M)s
        INNER JOIN (
          SELECT * 
            FROM 
                (SELECT product_id,product_name,prod_service_id,bandwidth,CYCLE,arpu,billing_type,data_source_cd,row_number() over (partition BY product_id,data_source_cd ORDER BY modify_date DESC) AS rn
                   FROM %(s_dim_std_up_product)s 
                  WHERE modify_date < CAST(concat('%(ARG_OPTIME_LASTMON01_ISO)s',' 00:00:00.0') AS TIMESTAMP) OR modify_date IS NULL ) d 
           WHERE d.rn=1                 -- 获取上期产品配置信息
        ) t4  -- 产品配置信息
            ON t3.srvpkg_id = t4.product_id
           AND t3.data_source_cd = t4.data_source_cd
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t2.grid_id IS NOT NULL 
           AND t1.own_corp_std_org_code IS NOT NULL
         group by t1.own_corp_std_org_code,
                  t2.cust_type,
                  t2.grid_id,
                  t2.grid_name,
                  t2.mgr_id,
                  t2.mgr_name,
                  t2.area_std_addr_id,
                  t2.area_std_addr_name,
                  t4.product_id,
                  t4.product_name,
                  t4.prod_service_id,
                  t4.bandwidth,
                  t4.CYCLE,
                  t4.arpu,
                  t4.billing_type
        
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_grid_user_product_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               COALESCE(stock.std_org_code,lose.std_org_code) as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               COALESCE(stock.cust_type,lose.cust_type) AS cust_type,
               CASE COALESCE(stock.cust_type,lose.cust_type) 
               WHEN 1 THEN '公众'
               WHEN 4 THEN '商业'
               ELSE NULL END AS cust_type_name,
               COALESCE(stock.grid_id,lose.grid_id) AS grid_id,
               COALESCE(stock.grid_name,lose.grid_name) AS grid_name,
               COALESCE(stock.mgr_id,lose.mgr_id) AS mgr_id,
               COALESCE(stock.mgr_name,lose.mgr_name) AS mgr_name,
               COALESCE(stock.area_std_addr_id,lose.area_std_addr_id) AS area_std_addr_id,
               COALESCE(stock.area_std_addr_name,lose.area_std_addr_name) AS area_std_addr_name,
               COALESCE(stock.product_id,lose.product_id) AS product_id,
               COALESCE(stock.product_name,lose.product_name) AS product_name,
               COALESCE(stock.prod_service_id,lose.prod_service_id) AS prod_service_id,
               COALESCE(stock.bandwidth,lose.bandwidth) AS bandwidth,
               COALESCE(stock.CYCLE,lose.CYCLE) AS CYCLE,
               COALESCE(stock.arpu,lose.arpu) AS arpu,
               COALESCE(stock.billing_type,lose.billing_type) AS billing_type,
               COALESCE(stock.valid_user_cnt,0) AS valid_user_cnt,
               COALESCE(stock.new_user_cnt,0) AS new_user_cnt,
               COALESCE(lose.lose_user_cnt,0) AS lose_user_cnt,
               current_timestamp as etl_date
          FROM %(s_temp_st_grid_user_product_m1)s stock
        FULL JOIN %(s_temp_st_grid_user_product_m2)s lose
            on stock.std_org_code = lose.std_org_code
                 AND stock.cust_type = lose.cust_type
                 AND stock.grid_id = lose.grid_id
                 AND COALESCE(stock.area_std_addr_id,'') = COALESCE(lose.area_std_addr_id,'')
                 AND COALESCE(stock.product_id,0) = COALESCE(lose.product_id,0)
        inner join %(s_dim_std_organize)s org
            on COALESCE(stock.std_org_code,lose.std_org_code) = org.std_org_code
        WHERE COALESCE(stock.cust_type,lose.cust_type)  IN (1,4)
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
