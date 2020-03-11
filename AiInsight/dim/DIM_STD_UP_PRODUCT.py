#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM产品配置表
# Pay: DIM_STD_UP_PRODUCT.py
# Purpose: 统计用户订购宽带产品的带宽、周期、arpu等属性
# 
# Author:      wangxx
# 
# Created:     2018-10-30
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
s_stg_fact_ins_srvpkg                  =    "stg_fact_ins_srvpkg"
s_stg_fact_ins_srvpkg_b2               =    "stg_fact_ins_srvpkg_b2"
s_stg_up_product_item                  =    "stg_up_product_item"
s_stg_up_product_item_b2               =    "stg_up_product_item_b2"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dim_std_up_product                    =    "dim_std_up_product"

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
        INSERT into TABLE %(t_dim_std_up_product)s
        SELECT 
          t.srvpkg_id  AS product_id,
          t.NAME     AS product_name,
          t.prod_service_id   AS prod_service_id,
          REGEXP_EXTRACT(t.name,'([0-9]+)M')  AS bandwidth,
          CASE when REGEXP_EXTRACT(t.name,'/[0-9个包一两二三半]{0,3}([月年])') = '月'
            THEN (CASE WHEN REGEXP_EXTRACT(t.name,'/([0-9]{0,3})个?月') <> '' then REGEXP_EXTRACT(t.name,'/([0-9]{0,3})个?月')
                  when REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月')='' THEN 1 
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('包','一') THEN 1
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('二','两') THEN 2
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('三') THEN 3                
                  ELSE null END)
          WHEN  REGEXP_EXTRACT(t.name,'/[0-9个包一两二三半]{0,2}([月年])') =  '年'  
            THEN (CASE WHEN REGEXP_EXTRACT(t.name,'/([0-9]{0,2})个?年') <> '' then cast(REGEXP_EXTRACT(t.name,'/([0-9]{0,2})个?年')*12 as int)
                  when REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年')='' THEN 12 
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('包','一') THEN 12
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('二','两') THEN 24
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('三') THEN 36
                  WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('半')  THEN  6
                  ELSE null               
                  END)
          when REGEXP_EXTRACT(t.name,'[0-9个包一两二三半]{1,3}([月年])') = '月'
            THEN (CASE WHEN REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,3})个?月') <> '' then REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,3})个?月')
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('包','一') THEN 1
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('二','两') THEN 2
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('三') THEN 3
                  ELSE null END)
          WHEN  REGEXP_EXTRACT(t.name,'[0-9个包一两二三半]{1,2}([月年])') =  '年'  
            THEN (CASE WHEN REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,2})个?年') <> '' then cast(REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,2})个?年')*12 as int)
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('包','一') THEN 12
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('二','两') THEN 24
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('三') THEN 36
                  WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('半')  THEN  6
                  ELSE null               
                  END)            
          ELSE NULL  END      AS CYCLE,
          (CASE  WHEN t.name rlike '[元/]'
            THEN REGEXP_EXTRACT(t.name,'([0-9]+)[元/]')
           ELSE NULL
           END)/(
             CASE when REGEXP_EXTRACT(t.name,'/[0-9个包一两二三半]{0,3}([月年])') = '月'
               THEN (CASE WHEN REGEXP_EXTRACT(t.name,'/([0-9]{0,3})个?月') <> '' then REGEXP_EXTRACT(t.name,'/([0-9]{0,3})个?月')
                     when REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月')='' THEN 1 
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('包','一') THEN 1
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('二','两') THEN 2
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?月') IN ('三') THEN 3                
                     ELSE null END)
             WHEN  REGEXP_EXTRACT(t.name,'/[0-9个包一两二三半]{0,2}([月年])') =  '年'  
               THEN (CASE WHEN REGEXP_EXTRACT(t.name,'/([0-9]{0,2})个?年') <> '' then cast(REGEXP_EXTRACT(t.name,'/([0-9]{0,2})个?年')*12 as int)
                     when REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年')='' THEN 12 
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('包','一') THEN 12
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('二','两') THEN 24
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('三') THEN 36
                     WHEN REGEXP_EXTRACT(t.name,'/([包一两二三半])个?年') IN ('半')  THEN  6
                     ELSE null               
                     END)
             when REGEXP_EXTRACT(t.name,'[0-9个包一两二三半]{1,3}([月年])') = '月'
               THEN (CASE WHEN REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,3})个?月') <> '' then REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,3})个?月')
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('包','一') THEN 1
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('二','两') THEN 2
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?月') IN ('三') THEN 3
                     ELSE null END)
             WHEN  REGEXP_EXTRACT(t.name,'[0-9个包一两二三半]{1,2}([月年])') =  '年'  
               THEN (CASE WHEN REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,2})个?年') <> '' then cast(REGEXP_EXTRACT(t.name,'[^0-9]([0-9]{1,2})个?年')*12 as int)
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('包','一') THEN 12
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('二','两') THEN 24
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('三') THEN 36
                     WHEN REGEXP_EXTRACT(t.name,'([包一两二三半])个?年') IN ('半')  THEN  6
                     ELSE null               
                     END)            
             ELSE NULL  END 
           )       AS arpu,
          CASE WHEN instr(t.NAME,'余额') > 0 THEN 1 ELSE 0 END   AS billing_type, -- 是否余额量产品
          t.create_date  AS CREATE_date,
          t.modify_date  AS modify_date,
          t.valid_date    AS valid_date,
          t.expire_date  AS expire_date,
          t.use_eff_date   AS use_eff_date,
          t.use_exp_date   AS use_exp_date,
          t.data_source_cd   AS data_source_cd,
          CURRENT_TIMESTAMP   AS  update_time
        
          FROM  (
            -- boss1
            SELECT DISTINCT 
              s1.srvpkg_id,
              p1.NAME,
              s1.prod_service_id,
              p1.create_date,
              p1.modify_date,
              p1.valid_date,
              p1.expire_date,
              p1.use_eff_date,
              p1.use_exp_date,
              'BOSS1' AS data_source_cd
              FROM %(s_stg_fact_ins_srvpkg)s s1
                     INNER JOIN %(s_stg_up_product_item)s p1
                         ON  s1.srvpkg_id = p1.product_item_id
                     AND  p1.pt_mon = %(ARG_OPTIME_LAST1_M)s
                     AND coalesce(p1.product_item_id,'') <> ''
             WHERE s1.pt_mon = %(ARG_OPTIME_LAST1_M)s
               AND s1.prod_service_id = 1004 -- 宽带产品
        
                   UNION ALL
        -- boss2
            SELECT DISTINCT 
              s2.srvpkg_id,
              p2.NAME,
              s2.prod_service_id,
              p2.create_date,
              p2.modify_date,
              p2.valid_date,
              p2.expire_date,
              p2.use_eff_date,
              p2.use_exp_date,
              'BOSS2' AS data_source_cd
              FROM %(s_stg_fact_ins_srvpkg_b2)s s2
                     INNER JOIN %(s_stg_up_product_item_b2)s p2
                         ON  s2.srvpkg_id = p2.product_item_id 
                     AND  p2.pt_mon = %(ARG_OPTIME_LAST1_M)s
                     AND  coalesce(p2.product_item_id,'') <> ''
             WHERE s2.pt_mon = %(ARG_OPTIME_LAST1_M)s
               AND s2.prod_service_id = 1004 -- 宽带产品
          )  AS t
                  LEFT JOIN %(t_dim_std_up_product)s AS p
                      ON p.product_id = t.srvpkg_id
                  AND p.data_source_cd = t.data_source_cd
                  AND COALESCE(t.modify_date,current_timestamp) = COALESCE(p.modify_date,current_timestamp)
         WHERE p.product_id IS NULL
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
