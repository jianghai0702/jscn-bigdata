##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户月全量表 (经分 boss1 + boss2）
# Pay:DWA_FACT_INS_PROD_MON.py
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_MEND     = dicts['ARG_OPTIME_LAST2_MEND']        #获得传入的数据日期的所在上两个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2_MEND_ISO = dicts['ARG_OPTIME_LAST2_MEND_ISO']    #获得传入的数据日期的所在上两个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_MEND        = dicts['ARG_OPTIME_LAST3_MEND']          #获得传入的数据日期的所在上三个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3_MEND_ISO    = dicts['ARG_OPTIME_LAST3_MEND_ISO']      #获得传入的数据日期的所在上三个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期
    
    ARG_OPTIME_LASTYEAR1MON    = dicts['ARG_OPTIME_LASTYEAR1MON']       #获得传入的数据日期的去年上一月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON_ISO = dicts['ARG_OPTIME_LASTYEAR1MON_ISO']  #获得传入的数据日期的去年上一月yyyy-mm格式的数据日期

#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径
##===========================================================================
##自定义变量声明---源表声明
##===========================================================================
    s_stg_fact_ins_prod           =    "stg_fact_ins_prod"
    s_stg_fact_ins_prod_boss2     =    "stg_fact_ins_prod_boss2"

##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_dwa_fact_ins_prod_mon       =    "dwa_fact_ins_prod_mon"
##===========================================================================
##创建临时表
##===========================================================================

##===========================================================================
##数据处理
##===========================================================================
#生成 目标数据
# boss1 数据
    hsql='''insert overwrite table %(t_dwa_fact_ins_prod_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              t1.prod_inst_id , 
              t1.cust_id , 
              t1.acct_id , 
              t1.pay_type , 
              t1.bill_id , 
              t1.sub_bill_id , 
              t1.main_prod_inst_id , 
              t1.bill_start_date , 
              t1.user_name , 
              t1.user_group , 
              t1.vip_flag , 
              t1.vip_prop , 
              t1.first_use_date , 
              t1.state , 
              t1.state_date , 
              t1.oper_state , 
              t1.address_id , 
              t1.cont_id , 
              t1.access_mode , 
              t1.login_name , 
              t1.tv_number , 
              t1.region_id , 
              t1.valid_date , 
              t1.expire_date , 
              t1.create_date , 
              t1.done_date , 
              t1.done_code , 
              t1.org_id,
              t1.corp_org_id , 
              t1.own_corp_std_org_code , 
              t1.own_region_std_org_code , 
              t1.is_atv , 
              t1.is_dtv , 
              t1.is_dftv , 
              t1.is_dbitv , 
              t1.is_ditv , 
              t1.is_lan , 
              t1.is_voip , 
              t1.is_amsp , 
              t1.is_ext1 , 
              t1.is_ext2 , 
              t1.is_cloud_media , 
              t1.is_hdtv , 
              t1.is_main , 
              t1.is_second , 
              t1.is_trans , 
              t1.is_vaild  as is_valid , 
              t1.is_vaild1 as is_valid1, 
              t1.is_vaild2 as is_valid2, 
              t1.is_expire_ten_days , 
              t1.is_suspend , 
              t1.is_itv_active , 
              t1.is_debt_stop , 
              t1.is_free , 
              t1.is_paied as is_paid ,
              case when t1.is_vaild1 = 1 and t2.prod_inst_id is null then 1 else 0 end as is_new ,             -- 是否本月新增有效用户 
              t1.tv_pay_status , 
              t1.is_ins , 
              'BOSS1' as  data_source_cd ,  -- 表示数据来源是BOSS1 还是BOSS2
              %(ARG_OPTIME_LAST1_M)s as etl_cycle,
              current_timestamp  as     etl_date
             from %(s_stg_fact_ins_prod)s t1
             left join %(s_stg_fact_ins_prod)s t2
                on t1.prod_inst_id = t2.prod_inst_id
               and t2.is_vaild1 = 1 
               and t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
             where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
             '''% vars()
    QueryExe(hsql,name,dates)



# boss2 数据
    hsql='''insert into table %(t_dwa_fact_ins_prod_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              t1.prod_inst_id , 
              t1.cust_id , 
              t1.acct_id , 
              t1.pay_type , 
              t1.bill_id , 
              t1.sub_bill_id , 
              t1.main_prod_inst_id , 
              t1.bill_start_timestamp as bill_start_date , 
              t1.user_name , 
              t1.user_group , 
              t1.vip_flag , 
              t1.vip_prop , 
              t1.first_use_timestamp  as first_use_date , 
              t1.state , 
              t1.state_timestamp      as state_date , 
              t1.oper_state , 
              t1.address_id , 
              t1.cont_id , 
              t1.access_mode , 
              t1.login_name , 
              t1.tv_number , 
              t1.region_id , 
              t1.valid_timestamp as valid_date , 
              t1.expire_timestamp as expire_date , 
              t1.create_timestamp as create_date , 
              t1.done_timestamp as done_date , 
              t1.done_code , 
              t1.org_id,
              t1.corp_org_id , 
              t1.own_corp_std_org_code , 
              t1.own_region_std_org_code , 
              t1.is_atv , 
              t1.is_dtv , 
              t1.is_dftv , 
              t1.is_dbitv , 
              t1.is_ditv , 
              t1.is_lan , 
              t1.is_voip , 
              t1.is_amsp , 
              t1.is_ext1 , 
              t1.is_ext2 , 
              t1.is_cloud_media , 
              t1.is_hdtv , 
              t1.is_main , 
              t1.is_second , 
              t1.is_trans , 
              t1.is_valid , 
              t1.is_valid1 , 
              t1.is_valid2 , 
              t1.is_expire_ten_days , 
              t1.is_suspend , 
              t1.is_itv_active , 
              t1.is_debt_stop , 
              t1.is_free , 
              t1.is_paied as is_paid, 
              case when t1.is_valid1 = 1 and t2.prod_inst_id is null then 1 else 0 end as is_new ,             -- 是否本月新增有效用户
              t1.tv_pay_status , 
              t1.is_ins , 
              'BOSS2' as  data_source_cd,   -- 表示数据来源是BOSS1 还是BOSS2
              %(ARG_OPTIME_LAST1_M)s as etl_cycle,
              current_timestamp  as     etl_date
             from %(s_stg_fact_ins_prod_boss2)s t1
             left join %(s_stg_fact_ins_prod_boss2)s t2
                on t1.prod_inst_id = t2.prod_inst_id
               and t2.is_valid1 = 1
               and t2.pt_mon = %(ARG_OPTIME_LAST2_M)s
             where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
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
