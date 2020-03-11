#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWA流失客户月表
# Pay: DWA_LOST_CUST_MON.py
# Purpose: 流失客户上月信息
# 
# Author:      wangxx
# 
# Created:     2018-10-18
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
# 
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
#-------------------------------------------------------------------------------
# wangxx 2018-11-19
# 去除原表的用户数统计（因为不准），添加融合、单宽带客户标识字段。
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
s_dwa_fact_cust_mon               =    "dwa_fact_cust_mon"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwa_lost_cust_mon                    =    "dwa_lost_cust_mon"

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
    
    hsql=r'''
        INSERT overwrite table %(t_dwa_lost_cust_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
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
          t1.district_id,
          t1.DISTRICT_NAME,
          t1.MGR_ADDR_ID,
          t1.MGR_ADDR_NAME,
          t1.STD_ADDR_ID,
          t1.STD_ADDR_NAME,
          t1.STREET_STD_ADDR_ID,
          t1.STREET_STD_ADDR_NAME,
          t1.AREA_STD_ADDR_ID,
          t1.AREA_STD_ADDR_NAME,
          t1.DOOR_NAME,
          t1.ADDRESS,
          t1.GRID_ID,
          t1.GRID_NAME,
          t1.MGR_ID,
          t1.MGR_NAME,
          t1.border_flag , 
          t1.create_date , 
          t1.create_op_id , 
          t1.create_org_id , 
          t1.valid_date , 
          t1.expire_date , 
          t1.done_date , 
          t1.done_code , 
          t1.op_id, 
          t1.org_id, 
          t1.corp_org_id , 
          t1.own_corp_std_org_code, 
          t1.own_region_std_org_code, 
          t1.cust_prop , 
          t1.is_cloud_media , 
          t1.is_valid, 
          t1.is_valid1, 
          t1.is_valid2, 
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
          t1.is_ins, 
          t1.is_exchange , 
          t1.cust_type1 , 
          t1.IS_HOUSE,
          t1.IS_DTV_MANA_STOP    ,
          t1.IS_LAN_MANA_STOP    ,
          t1.is_history_data , 
          t1.ATV_COUNT,
          t1.DTV_COUNT,
          t1.DFTV_COUNT,
          t1.DBITV_COUNT,
          t1.DITV_COUNT,
          t1.LAN_COUNT,
          t1.VOIP_COUNT,
          t1.AMSP_COUNT,
          t1.EXT1_COUNT,
          t1.EXT2_COUNT,
          t1.HDTV_COUNT,
          t1.cloud_media_count,
          t1.USER_COUNT,
          t1.SECOND_USER_COUNT,
          t1.conv_olan_flag,
          t1.data_source_cd, 
          %(ARG_OPTIME_LAST1_M)s AS  etl_cycle,
          current_timestamp AS  etl_date
        FROM %(s_dwa_fact_cust_mon)s t1
        LEFT JOIN %(s_dwa_fact_cust_mon)s t2  -- 判断是否本月流失用户
            ON t1.cust_id = t2.cust_id 
           AND t1.data_source_cd = t2.data_source_cd
           AND t2.pt_mon = %(ARG_OPTIME_LAST1_M)s
           AND t2.is_valid1 = 1
        WHERE t1.pt_mon = %(ARG_OPTIME_LAST2_M)s
          AND T1.is_valid1 = 1
          AND t2.cust_id IS NULL -- 取流失客户
        
    '''% vars()
    QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
