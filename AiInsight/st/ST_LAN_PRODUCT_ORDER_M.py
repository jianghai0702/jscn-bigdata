#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST宽带产品订购统计分析
# Pay: ST_LAN_PRODUCT_ORDER_M.py
# Purpose: 统计各分公司宽带产品的订购发展情况
# 
# Author:      wangxx
# 
# Created:     2018-11-06
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
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
s_dim_std_organize                     =    "dim_std_organize"
s_dwa_fact_ins_srvpkg_mon              =    "dwa_fact_ins_srvpkg_mon"
s_dwa_fact_ins_srvpkg_cancel           =    "dwa_fact_ins_srvpkg_cancel"
s_dim_std_up_product                   =    "dim_std_up_product"
s_dwa_fact_cust_mon                    =    "dwa_fact_cust_mon"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_st_lan_product_order_m                    =    "st_lan_product_order_m"    

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
        insert overwrite table %(t_st_lan_product_order_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               COALESCE(stock.own_corp_std_org_code,lose.own_corp_std_org_code) as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               COALESCE(stock.cust_type,lose.cust_type) AS cust_type,
               CASE COALESCE(stock.cust_type,lose.cust_type) 
               WHEN 1 THEN '公众'
               WHEN 4 THEN '商业'
               ELSE NULL END AS cust_type_name,
               COALESCE(stock.product_id,lose.product_id) AS product_id,
               COALESCE(stock.product_name,lose.product_name) AS product_name,
               COALESCE(stock.bandwidth,lose.bandwidth) AS bandwidth,
               COALESCE(stock.CYCLE,lose.CYCLE) AS CYCLE,
               COALESCE(stock.arpu,lose.arpu) AS arpu,
               COALESCE(stock.billing_type,lose.billing_type) AS billing_type,
               COALESCE(stock.order_user_cnt,0) AS order_user_cnt,
               COALESCE(stock.new_user_cnt,0) AS new_user_cnt,
               COALESCE(lose.lose_user_cnt,0) AS lose_user_cnt,
               current_timestamp as etl_date
          FROM (
            select t1.own_corp_std_org_code,
                   t3.cust_type,
                   t2.product_id,
                   t2.product_name,
                   t2.bandwidth,
                   t2.CYCLE,
                   t2.arpu,
                   t2.billing_type,
                   COUNT(DISTINCT t1.prod_inst_id) AS order_user_cnt,
                   COUNT(DISTINCT CASE WHEN t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_user_cnt
              FROM %(s_dwa_fact_ins_srvpkg_mon)s t1 -- 用户产品订购表
            inner JOIN (
              SELECT * 
                FROM 
                    (SELECT product_id,product_name,bandwidth,CYCLE,arpu,billing_type,data_source_cd,row_number() over (partition BY product_id,data_source_cd ORDER BY modify_date DESC) AS rn
                       FROM %(s_dim_std_up_product)s 
                      WHERE modify_date < CAST(concat('%(ARG_OPTIME_MON01_ISO)s',' 00:00:00.0') AS TIMESTAMP) OR modify_date IS NULL ) d 
               WHERE d.rn=1                 -- 获取当期产品配置信息
            ) t2  -- 产品配置信息
                ON t1.srvpkg_id = t2.product_id
               AND t1.data_source_cd = t2.data_source_cd
            INNER JOIN %(s_dwa_fact_cust_mon)s t3
                ON t1.cust_id = t3.cust_id
               AND t1.data_source_cd = t3.data_source_cd 
               AND t3.pt_mon = %(ARG_OPTIME_LAST1_M)s
             where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
               AND t1.prod_service_id = 1004  -- 统计宽带产品
               AND t1.STATE = 1 -- 订购状态
             group by t1.own_corp_std_org_code,
                      t3.cust_type,
                      t2.product_id,
                      t2.product_name,
                      t2.bandwidth,
                      t2.CYCLE,
                      t2.arpu,
                      t2.billing_type
            ) stock
        FULL JOIN (
          select t1.own_corp_std_org_code,
                 t3.cust_type,
                 t2.product_id,
                 t2.product_name,
                 t2.bandwidth,
                 t2.CYCLE,
                 t2.arpu,
                 t2.billing_type,
                 COUNT(DISTINCT t1.prod_inst_id) AS lose_user_cnt
            FROM %(s_dwa_fact_ins_srvpkg_cancel)s t1 -- 产品退订表
          inner JOIN (
            SELECT * 
              FROM 
                  (SELECT product_id,product_name,bandwidth,CYCLE,arpu,billing_type,data_source_cd,row_number() over (partition BY product_id,data_source_cd ORDER BY modify_date DESC) AS rn
                     FROM %(s_dim_std_up_product)s 
                    WHERE modify_date < CAST(concat('%(ARG_OPTIME_LASTMON01_ISO)s',' 00:00:00.0') AS TIMESTAMP) OR modify_date IS NULL ) d 
             WHERE d.rn=1                 -- 获取上期产品配置信息
          ) t2  -- 产品配置信息
              ON t1.srvpkg_id = t2.product_id
             AND t1.data_source_cd = t2.data_source_cd
          INNER JOIN %(s_dwa_fact_cust_mon)s t3
              ON t3.pt_mon = %(ARG_OPTIME_LAST2_M)s
             AND t1.cust_id = t3.cust_id
             AND t1.data_source_cd = t3.data_source_cd 
           where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
             AND t1.prod_service_id = 1004  -- 统计宽带产品
           group by t1.own_corp_std_org_code,
                    t3.cust_type,
                    t2.product_id,
                    t2.product_name,
                    t2.bandwidth,
                    t2.CYCLE,
                    t2.arpu,
                    t2.billing_type
          
          ) lose
            ON stock.own_corp_std_org_code = lose.own_corp_std_org_code
           AND stock.cust_type = lose.cust_type
           AND COALESCE(stock.product_id,0) = COALESCE(lose.product_id,0)
        inner JOIN %(s_dim_std_organize)s org
            on COALESCE(stock.own_corp_std_org_code,lose.own_corp_std_org_code) = org.std_org_code
        WHERE COALESCE(stock.own_corp_std_org_code,lose.own_corp_std_org_code,'') <> ''
          AND COALESCE(stock.cust_type,lose.cust_type) IN (1,4)
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 向上钻取到地市、省级维度汇总统计
    hsql='''
          INSERT INTO TABLE %(t_st_lan_product_order_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
          SELECT cycle_id,
                 COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code,
                 COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name,
                 t1.cust_type,
                 t1.cust_type_name,
                 t1.product_id,
                 t1.product_name,
                 t1.bandwidth,
                 t1.CYCLE,
                 t1.arpu,
                 t1.billing_type,
                 SUM(t1.order_user_cnt) AS order_user_cnt,
                 SUM(t1.new_user_cnt) AS new_user_cnt,
                 SUM(t1.lose_user_cnt) AS lose_user_cnt,
                 current_timestamp as etl_date
            FROM %(t_st_lan_product_order_m)s t1
                   LEFT JOIN %(s_dim_std_organize)s t2
                       ON t1.own_corp_std_org_code = t2.std_org_code
                   LEFT JOIN %(s_dim_std_organize)s t3
                       ON t3.std_org_code = t2.p_std_org_code
           WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           GROUP BY cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name,t1.product_id,t1.product_name,t1.bandwidth,t1.CYCLE,t1.arpu,t1.billing_type 
           GROUPING SETS ((cycle_id,t3.std_org_code,t3.std_org_name,t1.cust_type,t1.cust_type_name,t1.product_id,t1.product_name,t1.bandwidth,t1.CYCLE,t1.arpu,t1.billing_type),(cycle_id,t1.cust_type,t1.cust_type_name,t1.product_id,t1.product_name,t1.bandwidth,t1.CYCLE,t1.arpu,t1.billing_type))
          
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
