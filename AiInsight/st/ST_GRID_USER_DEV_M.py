#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST网格用户月发展统计
# Pay: ST_GRID_USER_DEV_M.py
# Purpose: 统计网格-小区用户存量数、新增、流失发展统计。
# 
# Author:      wangxx
# 
# Created:     2018-10-23
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 修改记录
#-------------------------------------------------------------------------------
# 保留小区id为空，网格id不为空的记录，以保证网格统计的准确性。
# 
# wangxx 2018-11-13
# 增加客户类型维度、统计公众和商业客户
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
s_dwa_lost_cust_mon                    =    "dwa_lost_cust_mon"
s_dim_std_organize                     =    "dim_std_organize"

# 临时表声明
#-------------------------------------------------------------------------------
s_temp_st_grid_user_dev_m1              =    "temp_st_grid_user_dev_m1"
s_temp_st_grid_user_dev_m2              =    "temp_st_grid_user_dev_m2"

# 目标表声明
#-------------------------------------------------------------------------------
t_st_grid_user_dev_m                    =    "st_grid_user_dev_m"    

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    
    hsql='''drop table %(s_temp_st_grid_user_dev_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    
    hsql='''drop table %(s_temp_st_grid_user_dev_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    # 存放存量和新增用户统计
    hsql='''create table if not exists %(s_temp_st_grid_user_dev_m1)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            DTV_VALID_USER_CNT   DECIMAL(16),
            DTV_PAID_USER_CNT    DECIMAL(16),
            LAN_VALID_USER_CNT   DECIMAL(16),
            LAN_PAID_USER_CNT    DECIMAL(16),
            DFTV_VALID_USER_CNT  DECIMAL(16),
            DFTV_PAID_USER_CNT   DECIMAL(16),
            DBITV_VALID_USER_CNT DECIMAL(16),
            DBITV_PAID_USER_CNT  DECIMAL(16),
            DITV_VALID_USER_CNT  DECIMAL(16),
            DITV_PAID_USER_CNT   DECIMAL(16),
            AMSP_VALID_USER_CNT  DECIMAL(16),
            AMSP_PAID_USER_CNT   DECIMAL(16),
            CM_VALID_USER_CNT    DECIMAL(16),
            CM_PAID_USER_CNT     DECIMAL(16),
            HDTV_VALID_USER_CNT  DECIMAL(16),
            HDTV_PAID_USER_CNT   DECIMAL(16),
            NEW_DTV_USER_CNT     DECIMAL(16),
            NEW_LAN_USER_CNT     DECIMAL(16),
            NEW_DFTV_USER_CNT    DECIMAL(16),
            NEW_DBITV_USER_CNT   DECIMAL(16),
            NEW_DITV_USER_CNT    DECIMAL(16),
            NEW_AMSP_USER_CNT    DECIMAL(16),
            NEW_CM_USER_CNT      DECIMAL(16),
            NEW_HDTV_USER_CNT    DECIMAL(16)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_user_dev_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 存放流失用户统计
    
    hsql='''create table if not exists %(s_temp_st_grid_user_dev_m2)s  (
            STD_ORG_CODE    varchar(6),
            cust_type       decimal(2,0),
            GRID_ID              VARCHAR(20),
            GRID_NAME            VARCHAR(100),
            MGR_ID               DECIMAL(16),
            MGR_NAME             VARCHAR(100),
            AREA_STD_ADDR_ID     VARCHAR(30),
            AREA_STD_ADDR_NAME   VARCHAR(255),
            LOSE_DTV_USER_CNT     DECIMAL(16),
            LOSE_LAN_USER_CNT     DECIMAL(16),
            LOSE_DFTV_USER_CNT    DECIMAL(16),
            LOSE_DBITV_USER_CNT   DECIMAL(16),
            LOSE_DITV_USER_CNT    DECIMAL(16),
            LOSE_AMSP_USER_CNT    DECIMAL(16),
            LOSE_CM_USER_CNT      DECIMAL(16),
            LOSE_HDTV_USER_CNT    DECIMAL(16)
        )
        STORED AS ORCFILE
        LOCATION '%(tmp_path)s/%(s_temp_st_grid_user_dev_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计存量和新增用户
    
    hsql='''
        insert overwrite table  %(s_temp_st_grid_user_dev_m1)s
        select t1.own_corp_std_org_code,
               t2.cust_type,
               t2.grid_id,
               t2.grid_name,
               t2.mgr_id,
               t2.mgr_name,
               t2.area_std_addr_id,
               t2.area_std_addr_name,
               COUNT(CASE WHEN t1.is_dtv = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS dtv_valid_user_cnt,
               COUNT(CASE WHEN t1.is_dtv = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS dtv_paid_user_cnt,
               COUNT(CASE WHEN t1.is_lan = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS lan_valid_user_cnt,
               COUNT(CASE WHEN t1.is_lan = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS lan_paid_user_cnt,
               COUNT(CASE WHEN t1.is_dftv = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS dftv_valid_user_cnt,
               COUNT(CASE WHEN t1.is_dftv = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS dftv_paid_user_cnt,
               COUNT(CASE WHEN t1.is_dbitv = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS dbitv_valid_user_cnt,
               COUNT(CASE WHEN t1.is_dbitv = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS dbitv_paid_user_cnt,
               COUNT(CASE WHEN t1.is_ditv = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS ditv_valid_user_cnt,
               COUNT(CASE WHEN t1.is_ditv = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS ditv_paid_user_cnt,
               COUNT(CASE WHEN t1.is_amsp = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS amsp_valid_user_cnt,
               COUNT(CASE WHEN t1.is_amsp = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS amsp_paid_user_cnt,
               COUNT(CASE WHEN t1.is_cloud_media = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS cm_valid_user_cnt,
               COUNT(CASE WHEN t1.is_cloud_media = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS cm_paid_user_cnt,
               COUNT(CASE WHEN t1.is_hdtv = 1 AND t1.is_valid1 = 1 THEN t1.prod_inst_id ELSE NULL END) AS hdtv_valid_user_cnt,
               COUNT(CASE WHEN t1.is_hdtv = 1 AND t1.is_paid = 1 THEN t1.prod_inst_id ELSE NULL END) AS hdtv_paid_user_cnt,
        
               COUNT(CASE WHEN t1.is_dtv = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_dtv_user_cnt,
               COUNT(CASE WHEN t1.is_lan = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_lan_user_cnt,
               COUNT(CASE WHEN t1.is_dftv = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_dftv_user_cnt,
               COUNT(CASE WHEN t1.is_dbitv = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_dbitv_user_cnt,
               COUNT(CASE WHEN t1.is_ditv = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_ditv_user_cnt,
               COUNT(CASE WHEN t1.is_amsp = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_amsp_user_cnt,
               COUNT(CASE WHEN t1.is_cloud_media = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_cm_user_cnt,
               COUNT(CASE WHEN t1.is_hdtv = 1 AND t1.is_new = 1 THEN t1.prod_inst_id ELSE NULL END) AS new_hdtv_user_cnt
          from %(s_dwa_fact_ins_prod_mon)s t1
        INNER JOIN %(s_dwa_fact_cust_mon)s t2
            ON t1.cust_id = t2.cust_id
           AND t1.data_source_cd = t2.data_source_cd -- boss1,boss2
           AND t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
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
                  t2.area_std_addr_name
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 统计流失用户 
    hsql='''
        insert overwrite table %(s_temp_st_grid_user_dev_m2)s
        select t1.own_corp_std_org_code,
                 t2.cust_type,
                 t2.grid_id,
                 t2.grid_name,
                 t2.mgr_id,
                 t2.mgr_name,
                 t2.area_std_addr_id,
                 t2.area_std_addr_name,
               COUNT(CASE WHEN t1.is_dtv = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_dtv_user_cnt,
               COUNT(CASE WHEN t1.is_lan = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_lan_user_cnt,
               COUNT(CASE WHEN t1.is_dftv = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_dftv_user_cnt,
               COUNT(CASE WHEN t1.is_dbitv = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_dbitv_user_cnt,
               COUNT(CASE WHEN t1.is_ditv = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_ditv_user_cnt,
               COUNT(CASE WHEN t1.is_amsp = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_amsp_user_cnt,
               COUNT(CASE WHEN t1.is_cloud_media = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_cm_user_cnt,
               COUNT(CASE WHEN t1.is_hdtv = 1 THEN t1.prod_inst_id ELSE NULL END) AS lose_hdtv_user_cnt       
          from %(s_dwa_lost_users_mon)s t1
        INNER JOIN %(s_dwa_fact_cust_mon)s t2
            ON t1.cust_id = t2.cust_id 
           AND t1.data_source_cd = t2.data_source_cd
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
         where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t2.grid_id IS NOT NULL 
           AND t1.own_corp_std_org_code IS NOT null
         group by t1.own_corp_std_org_code,
                  t2.cust_type,
                 t2.grid_id,
                 t2.grid_name,
                 t2.mgr_id,
                 t2.mgr_name,
                 t2.area_std_addr_id,
                 t2.area_std_addr_name
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    hsql='''
        insert overwrite table %(t_st_grid_user_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        select %(ARG_OPTIME_LAST1_M)s as cycle_id,
               stock.std_org_code as own_corp_std_org_code,
               org.std_org_name   as own_corp_std_org_name,
               stock.cust_type,
               CASE stock.cust_type 
               WHEN 1 THEN '公众'
               WHEN 4 THEN '商业'
               ELSE NULL END AS CUST_TYPE_NAME,
               stock.grid_id,
               stock.grid_name,
               stock.mgr_id,
               stock.mgr_name,
               stock.area_std_addr_id,
               stock.area_std_addr_name,
               COALESCE(stock.dtv_valid_user_cnt,0) AS dtv_valid_user_cnt,
               COALESCE(stock.dtv_paid_user_cnt,0) AS dtv_paid_user_cnt,
               COALESCE(stock.new_dtv_user_cnt,0) AS new_dtv_user_cnt,
               COALESCE(lose.lose_dtv_user_cnt,0) AS lose_dtv_user_cnt,
        
               COALESCE(stock.lan_valid_user_cnt,0) AS lan_valid_user_cnt,
               COALESCE(stock.lan_paid_user_cnt,0) AS lan_paid_user_cnt,
               COALESCE(stock.new_lan_user_cnt,0) AS new_lan_user_cnt,
               COALESCE(lose.lose_lan_user_cnt,0) AS lose_lan_user_cnt,
        
               COALESCE(stock.dftv_valid_user_cnt,0) AS dftv_valid_user_cnt,
               COALESCE(stock.dftv_paid_user_cnt,0) AS dftv_paid_user_cnt,
               COALESCE(stock.new_dftv_user_cnt,0) AS new_dftv_user_cnt,
               COALESCE(lose.lose_dftv_user_cnt,0) AS lose_dftv_user_cnt,
        
               COALESCE(stock.dbitv_valid_user_cnt,0) AS dbitv_valid_user_cnt,
               COALESCE(stock.dbitv_paid_user_cnt,0) AS dbitv_paid_user_cnt,
               COALESCE(stock.new_dbitv_user_cnt,0) AS new_dbitv_user_cnt,
               COALESCE(lose.lose_dbitv_user_cnt,0) AS lose_dbitv_user_cnt,
        
               COALESCE(stock.ditv_valid_user_cnt,0) AS ditv_valid_user_cnt,
               COALESCE(stock.ditv_paid_user_cnt,0) AS ditv_paid_user_cnt,
               COALESCE(stock.new_ditv_user_cnt,0) AS new_ditv_user_cnt,
               COALESCE(lose.lose_ditv_user_cnt,0) AS lose_ditv_user_cnt,
        
               COALESCE(stock.amsp_valid_user_cnt,0) AS amsp_valid_user_cnt,
               COALESCE(stock.amsp_paid_user_cnt,0) AS amsp_paid_user_cnt,
               COALESCE(stock.new_amsp_user_cnt,0) AS new_amsp_user_cnt,
               COALESCE(lose.lose_amsp_user_cnt,0) AS lose_amsp_user_cnt,
        
               COALESCE(stock.cm_valid_user_cnt,0) AS cm_valid_user_cnt,
               COALESCE(stock.cm_paid_user_cnt,0) AS cm_paid_user_cnt,
               COALESCE(stock.new_cm_user_cnt,0) AS new_cm_user_cnt,
               COALESCE(lose.lose_cm_user_cnt,0) AS lose_cm_user_cnt,
        
               COALESCE(stock.hdtv_valid_user_cnt,0) AS hdtv_valid_user_cnt,
               COALESCE(stock.hdtv_paid_user_cnt,0) AS hdtv_paid_user_cnt,
               COALESCE(stock.new_hdtv_user_cnt,0) AS new_hdtv_user_cnt,
               COALESCE(lose.lose_hdtv_user_cnt,0) AS lose_hdtv_user_cnt,
               current_timestamp as etl_date
          from %(s_temp_st_grid_user_dev_m1)s stock
        left join %(s_temp_st_grid_user_dev_m2)s lose
            on stock.std_org_code = lose.std_org_code
                 AND stock.cust_type = lose.cust_type
                 AND stock.grid_id = lose.grid_id
                 AND COALESCE(stock.area_std_addr_id,'') = COALESCE(lose.area_std_addr_id,'')
        inner join %(s_dim_std_organize)s org
            on stock.std_org_code = org.std_org_code
        WHERE stock.cust_type IN (1,4)  -- 只统计公众和商业客户
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
