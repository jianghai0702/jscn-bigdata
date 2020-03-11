#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA客户全量表
# Pay: DWA_FACT_CUST_MON.py
# Purpose: 每月boss1、boss2客户明细，包括标准住宅地址、管理站、网格信息
# 
# Author:      wangxx
# 
# Created:     2018-10-17
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
#-------------------------------------------------------------------------------
# wangxx 2018-11-19
# 添加客户下用户数统计（根据用户表统计），添加融合、单宽带客户标识字段。
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
s_stg_fact_cust_b1                =    "stg_fact_cust_b1"
s_stg_fact_cust_b2                =    "stg_fact_cust_b2"
s_stg_fact_ins_prod               =    "stg_fact_ins_prod"
s_stg_fact_ins_prod_boss2         =    "stg_fact_ins_prod_boss2"
s_stg_fact_ins_address_b1         =    "stg_fact_ins_address_b1"
s_stg_fact_ins_address_b2         =    "stg_fact_ins_address_b2"
s_stg_gs_cust_grid_rel_b1         =    "stg_gs_cust_grid_rel_b1"
s_stg_gs_cust_grid_rel_b2         =    "stg_gs_cust_grid_rel_b2"

# 临时表声明
#-------------------------------------------------------------------------------
s_tmp_dwa_fact_cust_mon                    =    "tmp_dwa_fact_cust_mon"
# 目标表声明
#-------------------------------------------------------------------------------
t_dwa_fact_cust_mon                    =    "dwa_fact_cust_mon"

# 开始数据处理
#-------------------------------------------------------------------------------

try:
    Start(name,dates)           # 数据处理开始，创建锁文件
    # 删除临时表
    #-------------------------------------------------------------------------------
    hsql='''drop table %(s_tmp_dwa_fact_cust_mon)s''' %vars()
    QueryExe(hsql,name,dates)
    
    #-------------------------------------------------------------------------------
    # 创建临时表
    #-------------------------------------------------------------------------------
    
    
    # 统计客户是融合客户还是单宽带客户，boss1
    hsql='''create table if not exists %(s_tmp_dwa_fact_cust_mon)s  (
              data_source_cd    varchar(10),
              cust_id           decimal(16,0),
              conv_olan_flag    decimal(2,0),
              ATV_COUNT         DECIMAL(8),
              DTV_COUNT         DECIMAL(8),
              DFTV_COUNT        DECIMAL(8),
              DBITV_COUNT       DECIMAL(8),
              DITV_COUNT        DECIMAL(8),
              LAN_COUNT         DECIMAL(8),
              VOIP_COUNT        DECIMAL(8),
              AMSP_COUNT        DECIMAL(8),
              EXT1_COUNT        DECIMAL(8),
              EXT2_COUNT        DECIMAL(8),
              HDTV_COUNT        DECIMAL(8),
              CLOUD_MEDIA_COUNT DECIMAL(8),
              USER_COUNT        DECIMAL(8),
              SECOND_USER_COUNT DECIMAL(8)
          )
          STORED AS ORCFILE
          LOCATION '%(tmp_path)s/%(s_tmp_dwa_fact_cust_mon)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 生成中间数据
    #-------------------------------------------------------------------------------
    
    # 统计客户是融合客户还是单宽带客户
    hsql='''
    INSERT overwrite TABLE %(s_tmp_dwa_fact_cust_mon)s
    SELECT 'BOSS1' AS data_source_cd,
           t1.cust_id,
           CASE WHEN SUM(t2.is_dtv) > 0 AND SUM(t2.is_lan) > 0 THEN 1 -- 融合客户
           WHEN SUM(t2.is_dtv) = 0 AND SUM(t2.is_lan) > 0 THEN 2      -- 单宽带客户
           ELSE 0 END AS conv_olan_flag,
           SUM(t2.is_atv) AS  ATV_COUNT,
           SUM(t2.is_dtv) AS  DTV_COUNT,
           SUM(T2.is_dftv) AS DFTV_COUNT,
           SUM(t2.is_dbitv) AS DBITV_COUNT,
           SUM(t2.is_ditv) AS  DITV_COUNT,
           SUM(t2.is_lan) AS LAN_COUNT,
           SUM(t2.is_voip) AS VOIP_COUNT,
           SUM(t2.is_amsp) AS AMSP_COUNT,
           SUM(t2.is_ext1) AS EXT1_COUNT,
           SUM(t2.is_ext2) AS EXT2_COUNT,
           SUM(t2.is_hdtv) AS HDTV_COUNT,
           SUM(t2.is_cloud_media) AS cloud_media_count,
           SUM(t2.is_vaild1) AS USER_COUNT,
           SUM(t2.is_second) AS SECOND_USER_COUNT 
    FROM %(s_stg_fact_cust_b1)s t1
    LEFT JOIN %(s_stg_fact_ins_prod)s t2
    ON t1.cust_id = t2.cust_id
    AND t2.is_vaild1 = 1
    AND t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
    WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
    GROUP BY t1.cust_id
    UNION ALL 
    SELECT 'BOSS2' AS data_source_cd,
           t1.cust_id,
           CASE WHEN SUM(t2.is_dtv) > 0 AND SUM(t2.is_lan) > 0 THEN 1 -- 融合客户
           WHEN SUM(t2.is_dtv) = 0 AND SUM(t2.is_lan) > 0 THEN 2      -- 单宽带客户
           ELSE 0 END AS conv_olan_flag,
           SUM(t2.is_atv) AS  ATV_COUNT,
           SUM(t2.is_dtv) AS  DTV_COUNT,
           SUM(T2.is_dftv) AS DFTV_COUNT,
           SUM(t2.is_dbitv) AS DBITV_COUNT,
           SUM(t2.is_ditv) AS  DITV_COUNT,
           SUM(t2.is_lan) AS LAN_COUNT,
           SUM(t2.is_voip) AS VOIP_COUNT,
           SUM(t2.is_amsp) AS AMSP_COUNT,
           SUM(t2.is_ext1) AS EXT1_COUNT,
           SUM(t2.is_ext2) AS EXT2_COUNT,
           SUM(t2.is_hdtv) AS HDTV_COUNT,
           SUM(t2.is_cloud_media) AS cloud_media_count,
           SUM(t2.is_valid1) AS USER_COUNT,
           SUM(t2.is_second) AS SECOND_USER_COUNT 
    FROM %(s_stg_fact_cust_b2)s t1
    LEFT JOIN %(s_stg_fact_ins_prod_boss2)s t2
    ON t1.cust_id = t2.cust_id
    AND t2.is_valid1 = 1
    AND t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
    WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
    GROUP BY t1.cust_id
    
    '''% vars()
    QueryExe(hsql,name,dates)
    
    # 生成目标数据
    #-------------------------------------------------------------------------------
    
    # 插入boss1数据
    
    hsql=r'''
        INSERT overwrite table %(t_dwa_fact_cust_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
          t1.cust_id , 
          t1.cust_code, 
          t1.old_cust_id, 
          t1.old_cust_code, 
          t1.cust_name, 
          t1.cust_type , 
          t1.cust_level , 
          t1.cust_status , 
          t1.cust_cert_type , 
          t1.cust_cert_no, 
          t1.cust_cert_addr, 
          t1.cert_valid_date , 
          t1.cert_expire_date , 
          t1.cust_occupation , 
          A.district_id   AS    district_id,
          A.DISTRICT_NAME AS    DISTRICT_NAME       ,
          A.MGR_ADDR_ID AS MGR_ADDR_ID,
          A.MGR_ADDR_NAME AS MGR_ADDR_NAME,
          A.STD_ADDR_ID AS STD_ADDR_ID,
          A.STD_ADDR_NAME AS STD_ADDR_NAME,
          A.STREET_STD_ADDR_ID AS STREET_STD_ADDR_ID,
          A.STREET_STD_ADDR_NAME AS STREET_STD_ADDR_NAME,
          A.AREA_STD_ADDR_ID AS AREA_STD_ADDR_ID,
          A.AREA_STD_ADDR_NAME AS AREA_STD_ADDR_NAME,
          A.DOOR_NAME AS DOOR_NAME,
          regexp_replace(concat(A.std_addr_name,COALESCE(a.door_name,'')),'\\s','')  AS    ADDRESS,
          G.GRID_ID AS GRID_ID,
          G.GRID_NAME AS GRID_NAME,
          G.MGR_ID AS MGR_ID,
          G.MGR_NAME AS MGR_NAME,
          t1.border_flag , 
          t1.create_date , 
          t1.create_op_id , 
          t1.create_org_id , 
          t1.valid_date , 
          t1.expire_date , 
          t1.done_date , 
          t1.done_code , 
          t1.op_id , 
          t1.org_id , 
          t1.corp_org_id , 
          t1.own_corp_std_org_code, 
          t1.own_region_std_org_code, 
          t1.cust_prop , 
          t1.is_cloud_media , 
          t1.is_vaild  AS is_valid, 
          t1.is_vaild1 AS is_valid1, 
          t1.is_vaild2 AS is_valid2, 
          t1.is_dtv_suspend , 
          t1.is_lan_suspend , 
          t1.is_voip_suspend , 
          t1.is_dtv_debt_stop , 
          t1.is_lan_debt_stop , 
          t1.is_voip_debt_stop , 
          t1.is_dtv_paied , 
          t1.is_lan_paied , 
          t1.is_voip_paied , 
          t1.is_free , 
          t1.is_paied , 
          t1.is_unpay , 
          t1.is_itv_active , 
          t1.have_switch_on , 
          t1.tv_pay_status , 
          t1.tv_game_status , 
          t1.is_ins , 
          t1.is_exchange , 
          t1.cust_type1 , 
          NULL  AS   IS_HOUSE            ,
          NULL  AS   IS_DTV_MANA_STOP    ,
          NULL  AS   IS_LAN_MANA_STOP    ,
          t1.is_history_data , 
          t3.ATV_COUNT,
          t3.DTV_COUNT,
          t3.DFTV_COUNT,
          t3.DBITV_COUNT,
          t3.DITV_COUNT,
          t3.LAN_COUNT,
          t3.VOIP_COUNT,
          t3.AMSP_COUNT,
          t3.EXT1_COUNT,
          t3.EXT2_COUNT,
          t3.HDTV_COUNT,
          t3.cloud_media_count,
          t3.USER_COUNT,
          t3.SECOND_USER_COUNT,
          CASE WHEN t1.is_vaild1 = 1 AND t2.cust_id IS NULL THEN 1 ELSE 0 END  AS is_new , 
          COALESCE(t3.conv_olan_flag,0) AS conv_olan_flag,
          'BOSS1' AS data_source_cd, 
          %(ARG_OPTIME_LAST1_M)s AS  etl_cycle,
          current_timestamp AS  etl_date
        FROM %(s_stg_fact_cust_b1)s t1
        LEFT JOIN %(s_stg_fact_cust_b1)s t2  -- 判断是否本月新增用户
            ON t1.cust_id = t2.cust_id 
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
           AND t2.is_vaild1 = 1
        LEFT JOIN %(s_stg_fact_ins_address_b1)s A
            ON A.cust_id = t1.cust_id 
           AND A.pt_mon = %(ARG_OPTIME_LAST1_M)s
        LEFT JOIN %(s_stg_gs_cust_grid_rel_b1)s G
            ON t1.cust_id = G.cust_id 
           AND G.pt_mon = %(ARG_OPTIME_LAST1_M)s
        LEFT JOIN %(s_tmp_dwa_fact_cust_mon)s t3 
            ON t1.cust_id = t3.cust_id
           AND t3.data_source_cd = 'BOSS1'
        WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    
    # 插入boss2数据
    
    hsql=r'''
        INSERT INTO table %(t_dwa_fact_cust_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
        SELECT 
          t1.CUST_ID                           ,
          t1.CUST_CODE                      ,
          t1.OLD_CUST_ID                    ,
          t1.OLD_CUST_CODE                  ,
          t1.CUST_NAME                     ,
          t1.CUST_TYPE                          ,
          t1.CUST_LEVEL                         ,
          t1.CUST_STATUS                        ,
          t1.CUST_CERT_TYPE                     ,
          t1.CUST_CERT_NO                   ,
          t1.CUST_CERT_ADDR                ,
          t1.CERT_VALID_date                        ,
          t1.CERT_EXPIRE_date                       ,
          t1.CUST_OCCUPATION                    ,
          a.district_id AS district_id,
          A.DISTRICT_NAME AS DISTRICT_NAME,
          A.MGR_ADDR_ID AS MGR_ADDR_ID,
          A.MGR_ADDR_NAME AS MGR_ADDR_NAME,
          A.STD_ADDR_ID AS STD_ADDR_ID,
          A.STD_ADDR_NAME AS STD_ADDR_NAME,
          A.STREET_STD_ADDR_ID AS STREET_STD_ADDR_ID,
          A.STREET_STD_ADDR_NAME AS STREET_STD_ADDR_NAME,
          A.AREA_STD_ADDR_ID AS AREA_STD_ADDR_ID,
          A.AREA_STD_ADDR_NAME AS AREA_STD_ADDR_NAME,
          A.DOOR_NAME AS DOOR_NAME,
          regexp_replace(concat(A.std_addr_name,COALESCE(a.door_name,'')),'\\s','') AS  ADDRESS,
          G.GRID_ID AS GRID_ID,
          G.GRID_NAME AS GRID_NAME,
          G.MGR_ID AS MGR_ID,
          G.MGR_NAME AS MGR_NAME,
          t1.BORDER_FLAG,
          t1.CREATE_date                            ,
          t1.CREATE_OP_ID                      ,
          t1.CREATE_ORG_ID                     ,
          t1.VALID_date                             ,
          t1.EXPIRE_date                            ,
          t1.DONE_date                              ,
          t1.DONE_CODE                         ,
          t1.OP_ID                             ,
          t1.ORG_ID                            ,
          t1.CORP_ORG_ID                       ,
          t1.OWN_CORP_STD_ORG_CODE                     ,
          t1.OWN_REGION_STD_ORG_CODE                   ,
          t1.CUST_PROP                                     ,
          t1.IS_CLOUD_MEDIA                                ,
          t1.IS_VALID                                      ,
          t1.IS_VALID1                                     ,
          t1.IS_VALID2                                     ,
          t1.IS_DTV_SUSPEND                                ,
          t1.IS_LAN_SUSPEND                                ,
          t1.IS_VOIP_SUSPEND                               ,
          NULL AS is_dtv_debt_stop,
          NULL AS is_lan_debt_stop,
          NULL AS is_voip_debt_stop,
          t1.IS_DTV_PAIED                                  ,
          NULL AS is_lan_paied,
          NULL AS is_voip_paied,
          t1.IS_FREE                                       ,
          t1.IS_PAIED                                      ,
          t1.IS_UNPAY                                      ,
          t1.IS_ITV_ACTIVE                                 ,
          t1.HAVE_SWITCH_ON                                ,
          t1.TV_PAY_STATUS                                 ,
          t1.TV_GAME_STATUS                                ,
          t1.IS_INS                                        ,
          NULL AS is_exchange,
          NULL AS cust_type1,
          t1.IS_HOUSE                                      ,
          t1.IS_DTV_MANA_STOP                              ,
          t1.IS_LAN_MANA_STOP                              ,
          t1.IS_HISTORY_DATA                               ,
          t3.ATV_COUNT,
          t3.DTV_COUNT,
          t3.DFTV_COUNT,
          t3.DBITV_COUNT,
          t3.DITV_COUNT,
          t3.LAN_COUNT,
          t3.VOIP_COUNT,
          t3.AMSP_COUNT,
          t3.EXT1_COUNT,
          t3.EXT2_COUNT,
          t3.HDTV_COUNT,
          t3.cloud_media_count,
          t3.USER_COUNT,
          t3.SECOND_USER_COUNT,
          CASE WHEN t1.is_valid1 = 1 AND t2.cust_id IS NULL THEN 1 ELSE 0 END  as IS_NEW,
          COALESCE(t3.conv_olan_flag,0) AS conv_olan_flag,
          'BOSS2' AS DATA_SOURCE_CD ,
          %(ARG_OPTIME_LAST1_M)s as etl_cycle,
          current_timestamp as etl_date
        FROM %(s_stg_fact_cust_b2)s t1
        LEFT JOIN %(s_stg_fact_cust_b2)s t2  -- 判断是否本月新增用户
            ON t1.cust_id = t2.cust_id 
           AND t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
           AND t2.is_valid1 = 1
        LEFT JOIN %(s_stg_fact_ins_address_b2)s A
            ON  t1.cust_id = A.cust_id
           AND  A.pt_mon   = %(ARG_OPTIME_LAST1_M)s
        LEFT JOIN %(s_stg_gs_cust_grid_rel_b2)s G
            ON  t1.cust_id = G.cust_id
           AND  G.pt_mon   = %(ARG_OPTIME_LAST1_M)s
        LEFT JOIN %(s_tmp_dwa_fact_cust_mon)s t3 
            ON t1.cust_id = t3.cust_id
           AND t3.data_source_cd = 'BOSS2'
        WHERE t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
        
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
