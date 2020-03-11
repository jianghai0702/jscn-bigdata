#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2019-03-27
@author: wanju Sun
@group : 
@contact: 
"""

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
sdate=sys.argv[1] if len(sys.argv) > 1 else '0'
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
ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
# 源表声明
# -------------------------------------------------------------------------------
s_stg_zg_acct_item_n = "stg_zg_acct_item_n" #BOSS1
s_stg_ZG_ACCT_ITEM_SERVICE = "stg_ZG_ACCT_ITEM_SERVICE" #BOSS1
s_stg_szzg_acct_item_n = "stg_szzg_acct_item_n " #BOSS2
s_stg_SZZG_ACCT_ITEM_SERVICE = "stg_SZZG_ACCT_ITEM_SERVICE" #BOSS2
s_stg_zg_acct = "stg_acct" #BOSS1 acct
s_stg_szzg_acct = "stg_szzg_acct" #BOSS2
s_dim_std_organize = "dim_std_organize"

# 临时表声明
# -------------------------------------------------------------------------------
s_temp_st_lan_arpu_fees_b1 = "temp_st_lan_arpu_fees_b1"
s_temp_st_lan_arpu_area_b1 = "temp_st_lan_arpu_area_b1"
s_temp_st_lan_arpu_fees_b2 = "temp_st_lan_arpu_fees_b2"
s_temp_st_lan_arpu_area_b2 = "temp_st_lan_arpu_area_b2"
# 目标表声明
# -------------------------------------------------------------------------------
t_st_lan_arpu_m_b1 = "st_lan_arpu_m_b1"
t_st_lan_arpu_m_b2 = "st_lan_arpu_m_b2"
t_st_lan_arpu_m = "st_lan_arpu_m"

# 开始数据处理
# -------------------------------------------------------------------------------

try:
    Start(name, dates)  # 数据处理开始，创建锁文件

#     # 删除临时表
#     # -------------------------------------------------------------------------------
#     hsql = '''drop table %(s_temp_st_lan_arpu_fees_b1)s''' % vars()
#     QueryExe(hsql, name, dates)
#     hsql = '''drop table %(s_temp_st_lan_arpu_area_b1)s''' % vars()
#     QueryExe(hsql, name, dates)
#     hsql = '''drop table %(s_temp_st_lan_arpu_fees_b2)s''' % vars()
#     QueryExe(hsql, name, dates)
#     hsql = '''drop table %(s_temp_st_lan_arpu_area_b2)s''' % vars()
#     QueryExe(hsql, name, dates)
#     # -------------------------------------------------------------------------------
#     # 创建临时表
#     # -------------------------------------------------------------------------------
#     # 存放账户的原始金额及优惠金额
#     hsql = '''create table if not exists %(s_temp_st_lan_arpu_fees_b1)s  (
#                      acct_id                   string,
#                      original_amount           string,
#                      discount_amount           string,
#                      service_id                string
#                  )CLUSTERED BY(acct_id) SORTED BY(acct_id) INTO 8 BUCKETS
#                STORED AS ORCFILE
#                LOCATION '%(tmp_path)s/%(s_temp_st_lan_arpu_fees_b1)s'
#            ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     # 存放账户的区域
#     hsql = '''create table if not exists %(s_temp_st_lan_arpu_area_b1)s  (
#                          acct_id                         string,
#                          std_org_code                    string,
#                          std_org_name                    string
#                          )CLUSTERED BY(acct_id) SORTED BY(acct_id) INTO 12 BUCKETS
#                        STORED AS ORCFILE
#                        LOCATION '%(tmp_path)s/%(s_temp_st_lan_arpu_area_b1)s'
#                    ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = '''create table if not exists %(s_temp_st_lan_arpu_area_b2)s (
#                          acct_id                         string,
#                          std_org_code                    string,
#                          std_org_name                    string
#                          )
#                         CLUSTERED BY(acct_id) SORTED BY(acct_id) INTO 12 BUCKETS
#                        STORED AS ORCFILE
#                        LOCATION '%(tmp_path)s/%(s_temp_st_lan_arpu_area_b2)s'
#              ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = '''create table if not exists %(s_temp_st_lan_arpu_fees_b2)s (
#                     acct_id                   string,
#                      original_amount           string,
#                      discount_amount           string,
#                      service_id                string
#                  )CLUSTERED BY(acct_id) SORTED BY(acct_id) INTO 8 BUCKETS
#                STORED AS ORCFILE
#                LOCATION '%(tmp_path)s/%(s_temp_st_lan_arpu_fees_b2)s'
#                  ''' % vars()
#
#     QueryExe(hsql, name, dates)
#
#     # 生成中间数据
#     # -------------------------------------------------------------------------------
#
#     hsql = ''' insert overwrite table %(s_temp_st_lan_arpu_fees_b1)s
#                select  distinct
#                         t1.acct_id
#                        ,t1.original_amount
#                        ,t1.discount_amount
#                        ,t2.service_id
#                from %(s_stg_zg_acct_item_n)s t1
#                left join %(s_stg_ZG_ACCT_ITEM_SERVICE)s t2 on t1.acct_item_type_id = t2.acct_item_type_id
#                where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#            ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = ''' insert overwrite table %(s_temp_st_lan_arpu_area_b1)s
#                 select   distinct
#                            act.acct_id
#                           ,org.std_org_code
#                           ,org.std_org_name
#                   from %(s_stg_zg_acct)s act
#                   inner join %(s_dim_std_organize)s org on act.corp_org_id = org.organize_id
#                   where act.pt_mon = %(ARG_OPTIME_LAST1_M)s
#                ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = ''' insert overwrite table %(s_temp_st_lan_arpu_fees_b2)s
#                  select  distinct
#                           t1.acct_id
#                          ,t1.original_amount
#                          ,t1.discount_amount
#                          ,t2.service_id
#                  from %(s_stg_szzg_acct_item_n)s t1
#                  left join %(s_stg_SZZG_ACCT_ITEM_SERVICE)s t2 on t1.acct_item_type_id = t2.acct_item_type_id
#                  where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#              ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = ''' insert overwrite table %(s_temp_st_lan_arpu_area_b2)s
#                   select   distinct
#                              act.acct_id
#                             ,org.std_org_code own_corp_std_org_code
#                             ,org.std_org_name own_corp_std_org_name
#                     from %(s_stg_szzg_acct)s act
#                     inner join %(s_dim_std_organize)s org on act.corp_org_id = org.organize_id2
#                  ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     # 生成目标数据
#     # -------------------------------------------------------------------------------
#
#     hsql = '''
#             insert overwrite table %(t_st_lan_arpu_m_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#             select distinct  %(ARG_OPTIME_LAST1_M)s  cycle_id
#                    ,t2.std_org_code
#                    ,t2.std_org_name
#                    ,t1.acct_id
#                    ,t1.service_id
#                    ,t1.original_amount
#                    ,t1.discount_amount
#             from %(s_temp_st_lan_arpu_fees_b2)s t1
#             inner join %(s_temp_st_lan_arpu_area_b2)s t2 on t1.acct_id = t2.acct_id
#         ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     # 向上钻取到地市维度汇总统计
#     hsql = '''
#                   insert into table %(t_st_lan_arpu_m_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#                   SELECT  distinct t1.cycle_id
#                      ,COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code
#                      ,COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name
#                      ,t1.acct_id
#                      ,t1.service_id
#                      ,t1.original_amount
#                      ,t1.discount_amount
#                   FROM %(t_st_lan_arpu_m_b2)s t1
#                   LEFT JOIN %(s_dim_std_organize)s t2 ON t1.own_corp_std_org_code = t2.std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t3 ON t3.std_org_code = t2.p_std_org_code
#                   WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#                   ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     # 向上钻向升级纬度汇总
#     hsql = '''
#                   insert into table %(t_st_lan_arpu_m_b2)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#                   SELECT  distinct  t1.cycle_id
#                          ,COALESCE(t4.std_org_code,'10') AS own_corp_std_org_code
#                          ,COALESCE(t4.std_org_name,'江苏有线') AS own_corp_std_org_name
#                          ,t1.acct_id
#                          ,t1.service_id
#                          ,t1.original_amount
#                          ,t1.discount_amount
#                   FROM %(t_st_lan_arpu_m_b2)s t1
#                   LEFT JOIN %(s_dim_std_organize)s t2 ON t1.own_corp_std_org_code = t2.std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t3 ON t3.std_org_code = t2.p_std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t4 ON t4.std_org_code = t3.p_std_org_code
#                   WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#         ''' % vars()
#     QueryExe(hsql, name, dates)
#
#     hsql = '''
#             insert overwrite table %(t_st_lan_arpu_m_b1)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#             select  distinct %(ARG_OPTIME_LAST1_M)s  cycle_id
#                    ,t2.std_org_code
#                    ,t2.std_org_name
#                    ,t1.acct_id
#                    ,t1.service_id
#                    ,t1.original_amount
#                    ,t1.discount_amount
#             from %(s_temp_st_lan_arpu_fees_b1)s t1
#             inner join %(s_temp_st_lan_arpu_area_b1)s t2 on t1.acct_id = t2.acct_id
#         ''' % vars()
#     QueryExe(hsql, name, dates)
# #
#     # 向上钻取到地市维度汇总统计
#     hsql = '''
#                   insert into table %(t_st_lan_arpu_m_b1)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#                   SELECT  distinct t1.cycle_id
#                      ,COALESCE(t3.std_org_code,'10') AS own_corp_std_org_code
#                      ,COALESCE(t3.std_org_name,'江苏有线') AS own_corp_std_org_name
#                      ,t1.acct_id
#                      ,t1.service_id
#                      ,t1.original_amount
#                      ,t1.discount_amount
#                   FROM %(t_st_lan_arpu_m_b1)s t1
#                   LEFT JOIN %(s_dim_std_organize)s t2 ON t1.own_corp_std_org_code = t2.std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t3 ON t3.std_org_code = t2.p_std_org_code
#                   WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#                   ''' % vars()
#     QueryExe(hsql, name, dates)
# #
#     # 向上钻向升级纬度汇总
#     hsql = '''
#                   insert into table %(t_st_lan_arpu_m_b1)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
#                   SELECT  distinct  t1.cycle_id
#                          ,COALESCE(t4.std_org_code,'10') AS own_corp_std_org_code
#                          ,COALESCE(t4.std_org_name,'江苏有线') AS own_corp_std_org_name
#                          ,t1.acct_id
#                          ,t1.service_id
#                          ,t1.original_amount
#                          ,t1.discount_amount
#                   FROM %(t_st_lan_arpu_m_b1)s t1
#                   LEFT JOIN %(s_dim_std_organize)s t2 ON t1.own_corp_std_org_code = t2.std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t3 ON t3.std_org_code = t2.p_std_org_code
#                   LEFT JOIN %(s_dim_std_organize)s t4 ON t4.std_org_code = t3.p_std_org_code
#                   WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
#         ''' % vars()
#     QueryExe(hsql, name, dates)
#
    ### 汇总多有的数据
    # hsql = ''' insert overwrite table %(t_st_lan_arpu_m)s  partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #                select %(ARG_OPTIME_LAST1_M)s cycle_id
    #                       ,tpp.own_corp_std_org_code
    #                       ,tpp.own_corp_std_org_name
    #                       ,count(distinct case when SERVICE_ID = '1004' then tpp.acct_id else null end) lan_acct_cnt
    #                       ,count(distinct tpp.acct_id) all_acct_cnt
    #                       ,round(sum( case when SERVICE_ID = '1004' then tpp.original_amount else 0 end)/100,2) lan_original_amount
    #                       ,round(sum( case when SERVICE_ID = '1004' then abs(tpp.discount_amount) else 0 end)/100,2) lan_discount_amount
    #                       ,round(sum(tpp.original_amount)/100,2) all_original_amount
    #                       ,round(sum(abs(tpp.discount_amount))/100,2) all_discount_amount
    #                       ,current_timestamp()
    #                from
    #                   ( select distinct tp.*
    #                      from
    #                         (
    #                          select t1.*
    #                          from %(t_st_lan_arpu_m_b1)s t1
    #                          where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
    #                          union all
    #                          select t2.*
    #                          from %(t_st_lan_arpu_m_b2)s t2
    #                          where t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
    #                        ) tp
    #                   ) tpp
    #                group by tpp.own_corp_std_org_code,tpp.own_corp_std_org_name
    #         ''' % vars()
    # QueryExe(hsql, name, dates)
#
#
#
    End(name, dates)
except Exception, e:
    Except(name, dates, e)