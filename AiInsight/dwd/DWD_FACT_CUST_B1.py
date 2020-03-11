#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DWD客户全量表boss1
# Pay: DWD_FACT_CUST_B1.py
# Purpose: 
# 
# Author:      wangxx
# 
# Created:     2018-10-15
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
s_stg_fact_cust_b1                =    "stg_fact_cust_b1"

# 临时表声明
#-------------------------------------------------------------------------------

# 目标表声明
#-------------------------------------------------------------------------------
t_dwd_fact_cust_b1                    =    "dwd_fact_cust_b1"    

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
    
    # hsql='''
    #     INSERT overwrite table %(t_dwd_fact_cust_b1)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #     SELECT distinct
    #       cust_id ,
    #       cust_code,
    #       old_cust_id,
    #       old_cust_code,
    #       cust_name,
    #       cust_type ,
    #       cust_level ,
    #       cust_status ,
    #       cust_cert_type ,
    #       cust_cert_no,
    #       cust_cert_addr,
    #       cert_valid_date ,
    #       cert_expire_date ,
    #       cust_occupation ,
    #       border_flag ,
    #       create_date ,
    #       create_op_id ,
    #       create_org_id ,
    #       valid_date ,
    #       expire_date ,
    #       done_date ,
    #       done_code ,
    #       op_id ,
    #       org_id ,
    #       corp_org_id ,
    #       own_corp_std_org_code,
    #       own_region_std_org_code,
    #       cust_prop ,
    #       atv_count ,
    #       dtv_count ,
    #       dftv_count ,
    #       dbitv_count ,
    #       ditv_count ,
    #       lan_count ,
    #       voip_count ,
    #       amsp_count ,
    #       ext1_count ,
    #       ext2_count ,
    #       hdtv_count ,
    #       hditv_count ,
    #       cloud_media_count ,
    #       user_count ,
    #       second_user_count ,
    #       is_cloud_media ,
    #       is_vaild ,
    #       is_vaild1 ,
    #       is_vaild2 ,
    #       is_dtv_suspend ,
    #       is_lan_suspend ,
    #       is_voip_suspend ,
    #       is_dtv_debt_stop ,
    #       is_lan_debt_stop ,
    #       is_voip_debt_stop ,
    #       is_dtv_paied ,
    #       is_lan_paied ,
    #       is_voip_paied ,
    #       is_free ,
    #       is_paied ,
    #       is_unpay ,
    #       is_itv_active ,
    #       is_new ,
    #       is_lose ,
    #       have_switch_on ,
    #       tv_pay_status ,
    #       tv_game_status ,
    #       is_ins ,
    #       is_exchange ,
    #       cust_type1 ,
    #       data_source_cd,
    #       is_history_data ,
    #       %(ARG_OPTIME_LAST1_M)s as etl_cycle,
    #       current_timestamp as etl_date
    #       from %(s_stg_fact_cust_b1)s
    #      WHERE pt_mon = %(ARG_OPTIME_LAST1_M)s
    # '''% vars()
    # QueryExe(hsql,name,dates)
    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
