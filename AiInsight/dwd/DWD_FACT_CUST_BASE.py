##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD客户基础表
# Pay:DWD_FACT_CUST_BASE.py
# Purpose:
#
# Author:      zhoush
#
# Created:     04-12-2017
# Copyright:   (c) zhoush 2017
# Licence:     <your licence>
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
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
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_fact_cust_base           =    "stg_fact_cust_base"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_fact_cust_base           =    "dwd_fact_cust_base"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当天数据
    hsql='''insert overwrite table %(t_dwd_fact_cust_base)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)            
            select
              t1.cust_id , 
              t1.cust_code , 
              t1.old_cust_id , 
              t1.old_cust_code , 
              t1.cust_name , 
              t1.cust_type , 
              t1.cust_type1 , 
              t1.cust_level  , 
              t1.cust_status  , 
              t1.district_id  , 
              t1.district_name  , 
              t1.station_name  , 
              t1.county  , 
              t1.towns  , 
              t1.area  , 
              t1.grid_name  , 
              t1.grid_id  , 
              t1.mgr_addr_id  , 
              t1.mgr_addr_name  , 
              t1.std_addr_id  , 
              t1.std_addr_name  , 
              t1.street_std_addr_id  , 
              t1.street_std_addr_name  , 
              t1.area_std_addr_id  ,
              t1.area_std_addr_name  , 
              t1.door_name  , 
              t1.address  , 
              t1.cont_dflt_mode  , 
              t1.cont_phone1  , 
              t1.cont_phone2  , 
              t1.cont_mobile1  , 
              t1.cont_mobile2  , 
              t1.cust_cert_type  , 
              t1.cust_cert_no  , 
              t1.cust_cert_addr  , 
              t1.cust_occupation  , 
              t1.border_flag  , 
              t1.create_date  , 
              t1.create_op_id  , 
              t1.create_org_id  , 
              t1.valid_date  , 
              t1.expire_date  , 
              t1.done_date  , 
              t1.op_id  , 
              t1.org_id  , 
              t1.atv_count  , 
              t1.dtv_count  , 
              t1.dftv_count  , 
              t1.dbitv_count  , 
              t1.lan_count  , 
              t1.voip_count  , 
              t1.amsp_count  , 
              t1.hdtv_count  , 
              t1.hditv_count  , 
              t1.cloud_media_count  , 
              t1.user_count  , 
              t1.second_user_count  , 
              t1.is_cloud_media  , 
              t1.is_vaild  , 
              t1.is_dtv_suspend  , 
              t1.is_lan_suspend  , 
              t1.is_voip_suspend  , 
              t1.is_dtv_debt_stop  , 
              t1.is_lan_debt_stop  , 
              t1.is_voip_debt_stop  , 
              t1.is_free  , 
              t1.is_paied  , 
              t1.is_unpay  , 
              t1.is_itv_active  , 
              t1.is_new  , 
              t1.is_lose  , 
              t1.is_entrust  , 
              t1.is_expire_ten_days  , 
              t1.is_high_payoff  , 
              t1.is_dftv_high_payoff  , 
              t1.is_ditv_high_payoff  , 
              t1.is_exchange  , 
              t1.first_unpay_month  , 
              t1.have_switch_on  , 
              t1.tv_pay_status  , 
              t1.tv_game_status  , 
              t1.atv_balance_amount  , 
              t1.public_balance_amount  , 
              t1.dtv_balance_amount   , 
              t1.dbitv_balance_amount   , 
              t1.private_balance_amount   ,  
              t1.active_balance_amount   , 
              t1.lan_balance_amount   , 
              t1.zz_balance_amount   , 
              t1.balance_amount   , 
              t1.arpu   , 
              t1.dbitv_arpu   , 
              t1.dftv_arpu   , 
              t1.atv_unpay_amount   , 
              t1.dtv_unpay_amount   , 
              t1.dbitv_unpay_amount   , 
              t1.dftv_unpay_amount   , 
              t1.ditv_unpay_amount   , 
              t1.lan_unpay_amount   , 
              t1.base_unpay_amount   , 
              t1.zz_unpay_amount   , 
              t1.total_unpay_amount   , 
              t1.dtv_avg_conume_amount   , 
              t1.dbitv_avg_consume_amount   , 
              t1.dftv_avg_consume_amount   , 
              t1.ditv_avg_consume_amount   , 
              t1.lan_avg_consume_amount   , 
              t1.amsp_avg_consume_amount   , 
              t1.zz_avg_consume_amount   , 
              t1.avg_consume_amount   , 
              t1.favorite_program_id1   , 
              t1.favorite_program_id2   , 
              t1.favorite_program_id3   , 
              t1.favorite_program_name1   , 
              t1.favorite_program_name2   , 
              t1.favorite_program_name3   , 
              t1.favorite_vod_id1   , 
              t1.favorite_vod_id2   , 
              t1.favorite_vod_id3   , 
              t1.favorite_vod_name1   , 
              t1.favorite_vod_name2   , 
              t1.favorite_vod_name3   , 
              t1.corp_org_id   , 
              t1.own_corp_std_org_code   , 
              t1.own_region_std_org_code   , 
              %(ARG_OPTIME_LAST1_M)s etl_cycle,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_stg_fact_cust_base)s t1
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
