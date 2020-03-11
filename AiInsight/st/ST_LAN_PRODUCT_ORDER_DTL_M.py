#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  ST_LAN_PRODUCT_ORDER_DTL_M.py
# Purpose     :
#
# Author      :  sunwj
#
# CreatedDate :  2019-07-16 11:40
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------
directory = ["config", "dim", "dw", "dwd", "kpi", "py"]
import os, sys
from os.path import normpath, realpath

rp = realpath(sys.argv[0])
dwd = os.path.dirname(rp)
AiInsight = os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re

# 正则清洗参数
sdate = sys.argv[1] if len(sys.argv) > 1 else '0'
regex = ur"\d{8}"
match = re.search(regex, sdate)
if match:
    dates = sdate
else:
    dates = open('/AiInsight/config/pyparameter').read()

# 脚本名称
name = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')

# 传递日期参数,生成时间字典
# -------------------------------------------------------------------------------
dicts = {}
Pama(dicts, dates)

# 引入时间字典
ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO = dicts['ARG_OPTIME_LAST1_M_ISO']  # 获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M = dicts['ARG_OPTIME_LAST2_M']  # 获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO = dicts['ARG_OPTIME_LAST2_M_ISO']  # 获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
ARG_OPTIME_MON01 = dicts['ARG_OPTIME_MON01']  # 获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_MON01_ISO = dicts['ARG_OPTIME_MON01_ISO']  # 获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMON01 = dicts['ARG_OPTIME_LASTMON01']  # 获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMON01_ISO = dicts['ARG_OPTIME_LASTMON01_ISO']  # 获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期

# 源表声明
# -------------------------------------------------------------------------------
s_dim_std_organize              = "dim_std_organize"
s_dwa_fact_ins_srvpkg_mon       = "dwa_fact_ins_srvpkg_mon"
s_dwa_fact_ins_srvpkg_cancel    = "dwa_fact_ins_srvpkg_cancel"
s_dim_std_up_product            = "dim_std_up_product"
s_dwa_fact_cust_mon             = "dwa_fact_cust_mon"
S_DWA_FACT_INS_PROD_MON         = "DWA_FACT_INS_PROD_MON"
S_DWD_FACT_INS_ADDRESS_B1       = "DWD_FACT_INS_ADDRESS_B1"
S_DWD_FACT_INS_ADDRESS_B2       = "DWD_FACT_INS_ADDRESS_B2"

# 临时表声明
# -------------------------------------------------------------------------------
s_temp_st_lan_user_valid = "temp_st_lan_user_valid"
s_temp_st_lan_user_addr = "temp_st_lan_user_addr"
s_temp_st_lan_user_order = "temp_st_lan_user_order"
s_dwd_fact_cust_base = "DWD_FACT_CUST_BASE"

# 目标表声明
# -------------------------------------------------------------------------------
t_st_lan_product_order_detail_m = "st_lan_product_order_dtl_m"

# 开始数据处理
# -------------------------------------------------------------------------------

try:
    Start(name, dates)  # 数据处理开始，创建锁文件
    # 删除临时表
    # # -------------------------------------------------------------------------------
    hsql = '''drop table %(s_temp_st_lan_user_valid)s''' % vars()
    QueryExe(hsql, name, dates)
    hsql = '''drop table %(s_temp_st_lan_user_addr)s''' % vars()
    QueryExe(hsql, name, dates)
    hsql = '''drop table %(s_temp_st_lan_user_order)s''' % vars()
    QueryExe(hsql, name, dates)

    # -------------------------------------------------------------------------------
    # 创建临时表
    # -------------------------------------------------------------------------------
    # 存
    hsql = '''create table if not exists %(s_temp_st_lan_user_valid)s  (
                         cust_id                   string,
                         prod_inst_id              string,
                         STD_ORG_CODE              string,
                         USER_NAME                 string,
                         LOGIN_NAME                string,
                         DATA_SOURCE_CD            string
                     )STORED AS ORCFILE
                   LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_valid)s'
               ''' % vars()
    QueryExe(hsql, name, dates)


    # 存
    hsql = '''create table if not exists %(s_temp_st_lan_user_addr)s  (
                     cust_id                   string,
                     PROD_INST_ID              string,
                     STD_ORG_CODE              string,
                     DISTRICT_NAME             string,
                     STD_ADDR_NAME             string,
                     USER_NAME                 string,
                     LOGIN_NAME                string
                 )STORED AS ORCFILE
               LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_addr)s'
           ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''create table if not exists %(s_temp_st_lan_user_order)s  (
                         prod_inst_id         string,
                         STD_ORG_CODE         string,
                         bandwidth            string
                     )STORED AS ORCFILE
                   LOCATION '%(tmp_path)s/%(s_temp_st_lan_user_order)s'
               ''' % vars()
    QueryExe(hsql, name, dates)

    # 生成中间数据
    # -------------------------------------------------------------------------------

    hsql = '''
                insert overwrite table %(s_temp_st_lan_user_valid)s
                select distinct T.cust_id
                        ,T.PROD_INST_ID
                        ,T.STD_ORG_CODE
                        ,T.USER_NAME
                        ,T.LOGIN_NAME
                        ,T.DATA_SOURCE_CD
                from
                    ( select T1.cust_id
                           ,T1.OWN_CORP_STD_ORG_CODE STD_ORG_CODE
                           ,T1.PROD_INST_ID
                           ,T1.USER_NAME
                           ,T1.LOGIN_NAME
                           ,T1.DATA_SOURCE_CD
                     from %(S_DWA_FACT_INS_PROD_MON)s T1
                     where T1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
                       and T1.is_lan =1
                       and T1.is_valid=1
                     union  all
                     select T1.cust_id
                           ,T1.OWN_CORP_STD_ORG_CODE STD_ORG_CODE
                           ,T1.PROD_INST_ID
                           ,T1.USER_NAME
                           ,T1.LOGIN_NAME
                           ,T1.DATA_SOURCE_CD
                     from %(S_DWA_FACT_INS_PROD_MON)s T1
                     where T1.pt_mon='%(ARG_OPTIME_LAST1_M)s'
                       and T1.is_lan =1
                       and T1.IS_SUSPEND=1
                     ) T
                ''' % vars()
    QueryExe(hsql, name, dates)


    hsql = '''
            insert overwrite table %(s_temp_st_lan_user_addr)s
            select distinct T1.cust_id
                       ,T1.PROD_INST_ID
                       ,T1.STD_ORG_CODE
                       ,T2.DISTRICT_NAME
                       ,T2.STD_ADDR_NAME
                       ,T1.USER_NAME
                       ,T1.LOGIN_NAME
                 from %(s_temp_st_lan_user_valid)s T1
                 left join %(s_dwd_fact_cust_base)s T2 on  T1.cust_id=T2.cust_id and T2.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                 where  T2.STD_ADDR_NAME is not null
            ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''
              INSERT OVERWRITE TABLE %(s_temp_st_lan_user_order)s
              select   t1.prod_inst_id
                      ,t1.own_corp_std_org_code  STD_ORG_CODE
                      ,t2.bandwidth
               FROM dwa_fact_ins_srvpkg_mon t1 -- 用户产品订购表
               inner JOIN (
                 SELECT *
                   FROM
                       (SELECT product_id,
                               product_name,
                               bandwidth,
                               CYCLE,
                               arpu,
                               billing_type,
                               data_source_cd,
                               row_number() over (partition BY product_id,data_source_cd ORDER BY modify_date DESC) AS rn
                          FROM %(s_dim_std_up_product)s
                         WHERE modify_date < CAST(concat('%(ARG_OPTIME_MON01_ISO)s',' 00:00:00.0') AS TIMESTAMP) OR modify_date IS NULL ) d
                  WHERE d.rn=1                 -- 获取当期产品配置信息
               ) t2  -- 产品配置信息
                   ON t1.srvpkg_id = t2.product_id
                  AND t1.data_source_cd = t2.data_source_cd
                where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                  AND t1.prod_service_id = '1004'  -- 统计宽带产品
                  AND t1.STATE = 1 -- 订购状态


        ''' % vars()
    QueryExe(hsql, name, dates)

    # 生成目标数据
    # -------------------------------------------------------------------------------
    #
    hsql = '''
           insert overwrite table %(t_st_lan_product_order_detail_m)s partition (pt_mon= '%(ARG_OPTIME_LAST1_M)s')
           select distinct t1.cust_id
                 ,t1.prod_inst_id
                 ,t1.user_name
                 ,t1.login_name
                 ,t1.std_org_code
                 ,t1.DISTRICT_NAME
                 ,concat('江苏省 ',t4.short_name, ' ',t1.STD_ADDR_NAME) STD_ADDR_NAME
                 ,t2.bandwidth
           from  %(s_temp_st_lan_user_addr)s  t1
           left join %(s_temp_st_lan_user_order)s t2 on t1.prod_inst_id=t2.prod_inst_id
           left join  %(s_dim_std_organize)s  t3  on t1.std_org_code=t3.std_org_code
           left join  %(s_dim_std_organize)s  t4  on t3.p_std_org_code=t4.std_org_code
          
    ''' % vars()
    QueryExe(hsql, name, dates)

    End(name, dates)
except Exception, e:
    Except(name, dates, e)
