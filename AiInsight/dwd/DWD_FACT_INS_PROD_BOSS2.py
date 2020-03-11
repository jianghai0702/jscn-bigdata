##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD用户日全量表 (boss2）
# Pay:DWD_FACT_INS_PROD_BOSS2.py
# Purpose:
#
# Author:      wangxx
#
# Created:     08-27-2018
# Copyright:   (c) wangxx 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#
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

#程序开始执行
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')


try:
#传递日期参数
    dicts={}
    Pama(dicts,dates)
    Start(name,dates)
#===========================================================================================
#ʱ时间参数引入
#===========================================================================================
    ARG_TODAY                 = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO            = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR           = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH          = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01        = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy-mm格式的数据日期
    ARG_OPTIME_MONTH12        = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy-mm格式的数据日期
    ARG_OPTIME_HOUR           = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD       = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY            = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON        = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON        = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO    = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2MON       = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO   = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3MON       = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO   = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTYEAR       = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO   = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR01         = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO     = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR12         = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO     = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MON01          = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO      = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MONEND         = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO     = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径
##===========================================================================
##自定义变量声明---源表声明
##===========================================================================
    s_stg_fact_ins_prod           =    "stg_fact_ins_prod_boss2"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_dwd_fact_ins_prod           =    "dwd_fact_ins_prod_boss2"
##===========================================================================
##创建临时表
##===========================================================================

##===========================================================================
##数据处理
##===========================================================================
#生成 当天数据
# boss1 数据
    hsql='''insert overwrite table %(t_dwd_fact_ins_prod)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select   distinct 
                prod_inst_id , 
                offer_inst_id , 
                offer_id , 
                brand_id , 
                prod_spec_id , 
                cust_id , 
                acct_id , 
                pay_type , 
                user_type_id , 
                bill_id , 
                sub_bill_id , 
                main_prod_inst_id , 
                bill_start_timestamp , 
                user_name , 
                user_prop , 
                user_group , 
                vip_flag , 
                vip_prop , 
                boder_flag , 
                subsidy_flag , 
                subsidy_prop , 
                degree_flag , 
                first_use_timestamp , 
                state , 
                state_timestamp , 
                oper_state , 
                os_status , 
                address_id , 
                install_addr_id , 
                install_addr_name , 
                cont_id , 
                post_mode , 
                post_address_id , 
                access_mode , 
                login_name , 
                tv_number , 
                region_id , 
                sale_op_id , 
                sale_org_id , 
                warrant_cust_id , 
                valid_timestamp , 
                expire_timestamp , 
                create_timestamp , 
                create_op_id , 
                create_org_id , 
                done_timestamp , 
                done_code , 
                op_id , 
                org_id , 
                district_id , 
                corp_org_id , 
                own_corp_std_org_code , 
                own_region_std_org_code , 
                std_dis_code , 
                is_atv , 
                is_dtv , 
                is_dftv , 
                is_dbitv , 
                is_ditv , 
                is_lan , 
                is_voip , 
                is_amsp , 
                is_ext1 , 
                is_ext2 , 
                is_cloud_media , 
                is_hdtv , 
                is_online , 
                is_atv_online , 
                is_dtv_online , 
                is_dftv_online , 
                is_dbitv_online , 
                is_ditv_online , 
                is_lan_online , 
                is_voip_online , 
                is_amsp_online , 
                is_ext1_online , 
                is_ext2_online , 
                is_hdtv_online , 
                is_up_marketing , 
                is_main , 
                is_second , 
                is_mngbyself , 
                is_mngbycorp , 
                is_trans , 
                is_virtual , 
                is_opening , 
                is_valid , 
                is_valid1 , 
                is_valid2 , 
                is_expire_ten_days , 
                is_suspend , 
                is_itv_active , 
                is_debt_stop , 
                is_debt_cut , 
                is_mana_stop , 
                is_free , 
                is_paied , 
                is_new , 
                is_new_online , 
                is_lose , 
                is_lose1 , 
                is_lose_online , 
                tv_pay_status , 
                is_ins , 
                data_source_cd , 
                is_history_data , 
              %(ARG_OPTIME_LAST1_M)s etl_cycle,
              current_timestamp      etl_date
             from %(s_stg_fact_ins_prod)s t1
             where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
               and coalesce(t1.prod_inst_id,'') <> ''          -- 剔除无效数据
             '''% vars()
    QueryExe(hsql,name,dates)



##===========================================================================
##删除临时表
##===========================================================================

##===========================================================================
##程序结束
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
