##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户月全量表      
# Pay:DWA_FACT_RPT_INS_PROD_MON.py
# Purpose:
#
# Author:      liuyf7
#
# Created:     26-08-2016
# Copyright:   (c) liuyf7 2016
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
#时间参数引入
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
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy-mm格式的数据日期
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
    s_dwd_rpt_inst_prod                         =    "dwd_rpt_inst_prod"
    s_dim_std_product                          =    "dim_std_product"
    s_dwa_user_online_length_d                 =    "dwa_user_online_length_d"
    s_temp_dwa_fact_rpt_ins_prod_mon1          =    "temp_dwa_fact_rpt_ins_prod_mon1"
    s_temp_dwa_fact_rpt_ins_prod_mon2          =    "temp_dwa_fact_rpt_ins_prod_mon2"
    s_temp_dwa_fact_rpt_ins_prod_mon3          =    "temp_dwa_fact_rpt_ins_prod_mon3"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_fact_rpt_ins_prod_mon                =    "dwa_fact_rpt_ins_prod_mon"    
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放中间结果数据，每个用户本月上网时长超过一小时的天数
    hsql='''create table if not exists %(s_temp_dwa_fact_rpt_ins_prod_mon1)s
            (
                login_name string,
                this_month_online_days int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_fact_rpt_ins_prod_mon1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
#用来存放中间结果数据，续费用户
    hsql='''create table if not exists %(s_temp_dwa_fact_rpt_ins_prod_mon2)s
            (
                prod_inst_id string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_fact_rpt_ins_prod_mon2)s'
            '''% vars()
    QueryExe(hsql,name,dates)
##用来存放中间结果数据，累计续费用户
#    hsql='''create table if not exists %(s_temp_dwa_fact_rpt_ins_prod_mon3)s
#            (
#                login_name string
#            )
#            stored as rcfile
#            LOCATION '%(tmp_path)s/%(s_temp_dwa_fact_rpt_ins_prod_mon3)s'
#            '''% vars()
#    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成本月上网天数
    hsql='''insert overwrite table %(s_temp_dwa_fact_rpt_ins_prod_mon1)s
    select login_name,
           count(distinct case when total_minutes >= 30 then pt_time else null end)
      from %(s_dwa_user_online_length_d)s
     where substr(pt_time,1,6)=%(ARG_OPTIME_LAST1_M)s
     group by login_name
            '''% vars()
    QueryExe(hsql,name,dates)
    
#生成续费用户
    hsql='''insert overwrite table %(s_temp_dwa_fact_rpt_ins_prod_mon2)s
select a.prod_inst_id
from %(s_dwd_rpt_inst_prod)s a
left join %(s_dwd_rpt_inst_prod)s b
on a.prod_inst_id=b.prod_inst_id
and a.pt_mon = %(ARG_OPTIME_LAST1_M)s
and b.pt_mon = %(ARG_OPTIME_LAST2_M)s
where cast(a.remainder_days as int)>cast(b.remainder_days as int)
            '''% vars()
    QueryExe(hsql,name,dates)
    
#生成累计续费用户（在历史表中到期日期在一年以内，并且①同一个用户在历史表中还有一条记录的生效日期大于（该到期日期—31天）的记录。或②同一个用户在当前订购表中有新订购的产品）
#    hsql='''insert overwrite table %(s_temp_dwa_fact_rpt_ins_prod_mon3)s
#    select prod_inst_id
#      from %(s_dwd_rpt_inst_prod)s
#     where pt_mon = %(ARG_OPTIME_LAST1_M)s
#       and datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',expire_date) <= 365 --在一年内失效
#       and datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',valid_date) <= 365  --并且有新订购
#     group by prod_inst_id
#    having count(1) > 1
#            '''% vars()
#    QueryExe(hsql,name,dates)
    
    
#生成目标表数据
    hsql='''insert overwrite table %(t_dwa_fact_rpt_ins_prod_mon)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              t1.cust_code
              ,t1.cust_name
              ,t1.prod_inst_id
              ,t1.addr_name
              ,t1.cutover_addr_name
              ,case when t1.management_station is null or trim(t1.management_station)='' or lower(t1.management_station)='null' then '未知' else t1.management_station end management_station
              ,t1.cont_phone1
              ,t1.cont_phone2
              ,t1.cont_mobile1
              ,t1.cont_mobile2
              ,t1.access_type
              ,t1.srvpkg_name
              ,t1.create_date
              ,t1.valid_date
              ,t1.remainder_days
              ,t1.expire_date
              ,t1.status_name
              ,t1.login_name
              ,t1.lan_number
              ,(case when substr(t1.expire_date,1,7) = '%(ARG_OPTIME_LAST1_M_ISO)s' then 1 else 0 end) is_this_expire --是否本期到期
              ,(case when datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',t1.expire_date) < 365 then 1 else 0 end) is_expire --是否到期
              ,(case when t4.prod_inst_id is not null then 1 else 0 end) is_this_repay --是否本期续费
              ,0 --是否续费 (case when t5.login_name is not null then 1 else 0 end) is_repay
              ,(case when cast(t1.remainder_days as int)>0 then 1 else 0 end) is_paied --是否缴费
              ,(case when t3.price > 0 and cast(t1.remainder_days as int)>0 then 1 else 0 end)is_pay --是否付费
              ,(case when t2.this_month_online_days<3 then 1 else 0 end) is_silent --是否沉默
              ,(case when t2.this_month_online_days>15 then 1 else 0 end) is_active --是否活跃
              ,(case when substr(t1.create_date,1,7) <= '%(ARG_OPTIME_LAST1_M_ISO)s'
                      and t1.create_date <> ''
                      and (t1.status_name in ('正常','暂停','预开通')
                           and t1.cust_code is not null
                           and t1.cust_code <>''
                           and t1.srvpkg_name is not null
                           and t1.srvpkg_name <> ''
                           or (t1.status_name='停机' and substr(t1.expire_date,1,10) > '%(ARG_OPTIME_LASTYEAR1MON_ISO)s-01'))
                    then 1 else 0 end) is_valid --是否有效
              ,(case when nvl(tt.is_valid,0)=0
                      and substr(t1.create_date,1,7) <= '%(ARG_OPTIME_LAST1_M_ISO)s'
                      and t1.create_date <> ''
                      and (t1.status_name in ('正常','暂停','预开通')
                           and t1.cust_code is not null
                           and t1.cust_code <>''
                           and t1.srvpkg_name is not null
                           and t1.srvpkg_name <> ''
                           or (t1.status_name='停机' and substr(t1.expire_date,1,10) > '%(ARG_OPTIME_LASTYEAR1MON_ISO)s-01'))
                    then 1 else 0 end) is_new --是否新增
              ,nvl(t2.this_month_online_days,0) --当月上网天数
              ,(case when tt.is_valid=1
                       and not (
                                substr(t1.create_date,1,7) <= '%(ARG_OPTIME_LAST1_M_ISO)s'
                            and t1.create_date <> ''
                            and (t1.status_name in ('正常','暂停','预开通')
                                 and t1.cust_code is not null
                                 and t1.cust_code <>''
                                 and t1.srvpkg_name is not null
                                 and t1.srvpkg_name <> ''
                                 or (t1.status_name='停机' and substr(t1.expire_date,1,10) > '%(ARG_OPTIME_LASTYEAR1MON_ISO)s-01'))
                            )
                     then 1 else 0 end) is_this_loss --是否本期流失
              ,(case when not (
                                substr(t1.create_date,1,7) <= '%(ARG_OPTIME_LAST1_M_ISO)s'
                            and t1.create_date <> ''
                            and (t1.status_name in ('正常','暂停','预开通')
                                 and t1.cust_code is not null
                                 and t1.cust_code <>''
                                 and t1.srvpkg_name is not null
                                 and t1.srvpkg_name <> ''
                                 or (t1.status_name='停机' and substr(t1.expire_date,1,10) > '%(ARG_OPTIME_LASTYEAR1MON_ISO)s-01'))
                            )
                     then 1 else 0 end) is_loss --是否流失
              ,row_number()over(partition by t1.prod_inst_id order by t1.expire_date desc) order_priority --订单顺序
              ,'' std_user_status_code --标准用户状态
              ,'' std_cust_channel_code --标准获客渠道编码
              ,t1.own_corp_std_org_code
              ,t1.data_source_cd
              ,%(ARG_OPTIME_LAST1_M)s etl_cycle
              ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_dwd_rpt_inst_prod)s t1
            left join %(t_dwa_fact_rpt_ins_prod_mon)s tt
              on t1.prod_inst_id = tt.prod_inst_id
             and tt.pt_mon = '%(ARG_OPTIME_LAST2_M)s'
            left join %(s_temp_dwa_fact_rpt_ins_prod_mon1)s t2 on t1.login_name = t2.login_name
            left join %(s_dim_std_product)s t3 on t1.srvpkg_name = t3.product_name
            left join %(s_temp_dwa_fact_rpt_ins_prod_mon2)s t4 on t1.prod_inst_id = t4.prod_inst_id
            --left join %(s_temp_dwa_fact_rpt_ins_prod_mon3)s t5 on t1.login_name = t5.login_name
           where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
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
