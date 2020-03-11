#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户上网行为标签月表
# Pay:DWA_USER_NETWORK_BEH_M.py
# Purpose:
#
# Author:      chens
#
# Created:     28-08-2017
# Copyright:   (c) chens 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# 添加客户编号cust_id,通过BOSS提供用户数据表dwd_fact_ins_prod关联。
# 老BOSS用户表dwa_fact_rpt_ins_prod_mon，暂时不动。
# 修改时间：2017-11-16
# 修改人  : wangxx

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
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']          #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']      #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']          #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']      #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期  
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_user_network_time_m                =    "dwa_user_network_time_m"
    s_dwa_user_network_domain_m              =    "dwa_user_network_domain_m"
    s_dwa_user_network_device_m              =    "dwa_user_network_device_m"
#    s_dwa_fact_rpt_ins_prod_mon              =    "dwa_fact_rpt_ins_prod_mon"
    s_dim_std_product                        =    "dim_std_product"
    s_dim_std_product2                       =    "dim_std_product2"
    s_dwd_fact_ins_prod                      =    "dwd_fact_ins_prod"
    s_dwa_cust_order_prod_m                  =    "dwa_cust_order_prod_m"
    s_dwd_up_product_item                    =    "dwd_up_product_item"
    s_dwa_cust_feat_dtl_m                    =    "dwa_cust_feat_dtl_m"

    s_temp_dwa_user_network_beh_m1           =    "temp_dwa_user_network_beh_m1"
    s_temp_dwa_user_network_beh_m2           =    "temp_dwa_user_network_beh_m2"
    s_temp_dwa_user_network_beh_m3           =    "temp_dwa_user_network_beh_m3"
    s_temp_dwa_user_network_beh_m4           =    "temp_dwa_user_network_beh_m4"
    s_temp_dwa_user_network_beh_m5           =    "temp_dwa_user_network_beh_m5"
    s_temp_dwa_user_network_beh_m6           =    "temp_dwa_user_network_beh_m6"
    s_temp_dwa_user_network_beh_m7           =    "temp_dwa_user_network_beh_m7"
    s_temp_dwa_user_network_beh_m8           =    "temp_dwa_user_network_beh_m8"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_network_beh_m                 =    "dwa_user_network_beh_m" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放最近3个月用户上网时段数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m1)s
            (
              prod_inst_id      string,
              total_net_num     string,
              total_net_flow    string,
              weekday_net_num   string,
              weekday_net_flow  string,
              weekend_net_num   string,
              weekend_net_flow  string,
              lc_net_num        string,
              lc_net_flow       string,
              zs_net_num        string,
              zs_net_flow       string,
              sw_net_num        string,
              sw_net_flow       string,
              zw_net_num        string,
              zw_net_flow       string,
              xw_net_num        string,
              xw_net_flow       string,
              bw_net_num        string,
              bw_net_flow       string,
              ws_net_num        string,
              ws_net_flow       string,
              wy_net_num        string,
              wy_net_flow       string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放最近3个月用户各域名上网数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m2)s
            (
              prod_inst_id      string,
              domain_name       string,
              website_type      string,
              net_num           int,
              net_flow          string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 按用户分组，上网次数倒序排序的域名数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m3)s
            (
              prod_inst_id      string,
              domain_name       string,
              website_type      string,             
              net_num           int,
              net_flow          string,
              rn                int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放 访问次数最大的域名top5
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m4)s
            (
              prod_inst_id          string,
              domain_name_1         string,
              domain_name_flow_1    string,
              domain_type_1        string,
              domain_name_2         string,
              domain_name_flow_2    string,
              domain_type_2        string,
              domain_name_3         string,
              domain_name_flow_3    string,
              domain_type_3        string,
              domain_name_4         string,
              domain_name_flow_4    string,
              domain_type_4        string,
              domain_name_5         string,
              domain_name_flow_5    string,
              domain_type_5        string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放最近3个月用户各网站类型上网数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m5)s
            (
              prod_inst_id      string,
              website_type      string,
              net_num           string,
              net_flow          string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m5)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 按用户分组，上网次数倒序排序的网站类型数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m6)s
            (
              prod_inst_id      string,
              website_type      string,
              net_num           string,
              net_flow          string,
              rn                int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m6)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放 访问次数最大的网站类型top5
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m7)s
            (
              prod_inst_id          string,
              website_type_1        string,
              website_type_flow_1   string,
              website_type_2        string,
              website_type_flow_2   string,
              website_type_3        string,
              website_type_flow_3   string,
              website_type_4        string,
              website_type_flow_4   string,
              website_type_5        string,
              website_type_flow_5   string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m7)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放最近3个月用户上网设备数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_beh_m8)s
            (
              prod_inst_id      string,
              total_net_time    string,
              pc_net_time       string,
              mobile_net_time   string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_beh_m8)s'
            '''% vars()    
    QueryExe(hsql,name,dates)    

##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成  临时表1
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m1)s
            select
                t1.prod_inst_id,
                sum(t1.net_num) total_net_num,
                sum(t1.net_flow) total_net_flow,
                sum(case when t1.week_type='工作日' then t1.net_num else 0 end) weekday_net_num,
                sum(case when t1.week_type='工作日' then t1.net_flow else 0 end) weekday_net_flow,
                sum(case when t1.week_type='非工作日' then t1.net_num else 0 end) weekend_net_num,
                sum(case when t1.week_type='非工作日' then t1.net_flow else 0 end) weekend_net_flow,
                sum(case when t1.time_bucket='凌晨' then t1.net_num else 0 end) lc_net_num,
                sum(case when t1.time_bucket='凌晨' then t1.net_flow else 0 end) lc_net_flow,
                sum(case when t1.time_bucket='早晨' then t1.net_num else 0 end) zs_net_num,
                sum(case when t1.time_bucket='早晨' then t1.net_flow else 0 end) zs_net_flow,
                sum(case when t1.time_bucket='上午' then t1.net_num else 0 end) sw_net_num,
                sum(case when t1.time_bucket='上午' then t1.net_flow else 0 end) sw_net_flow,
                sum(case when t1.time_bucket='中午' then t1.net_num else 0 end) zw_net_num,
                sum(case when t1.time_bucket='中午' then t1.net_flow else 0 end) zw_net_flow,
                sum(case when t1.time_bucket='下午' then t1.net_num else 0 end) xw_net_num,
                sum(case when t1.time_bucket='下午' then t1.net_flow else 0 end) xw_net_flow,
                sum(case when t1.time_bucket='傍晚' then t1.net_num else 0 end) bw_net_num,
                sum(case when t1.time_bucket='傍晚' then t1.net_flow else 0 end) bw_net_flow,
                sum(case when t1.time_bucket='晚上' then t1.net_num else 0 end) ws_net_num,
                sum(case when t1.time_bucket='晚上' then t1.net_flow else 0 end) ws_net_flow,
                sum(case when t1.time_bucket='午夜' then t1.net_num else 0 end) wy_net_num,
                sum(case when t1.time_bucket='午夜' then t1.net_flow else 0 end) wy_net_flow
            from %(s_dwa_user_network_time_m)s t1
            where t1.pt_mon in ('%(ARG_OPTIME_LAST1_M)s','%(ARG_OPTIME_LAST2_M)s','%(ARG_OPTIME_LAST3_M)s')
            group by t1.prod_inst_id
         '''% vars()
    QueryExe(hsql,name,dates)    

#生成  临时表2
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m2)s
            select
                t1.prod_inst_id,
                t1.domain_name,
                t1.website_type,
                sum(t1.net_num) net_num,
                sum(t1.net_flow) net_flow
            from %(s_dwa_user_network_domain_m)s t1
            where t1.pt_mon in ('%(ARG_OPTIME_LAST1_M)s','%(ARG_OPTIME_LAST2_M)s','%(ARG_OPTIME_LAST3_M)s')
            group by t1.prod_inst_id,t1.domain_name,t1.website_type
         '''% vars()
    QueryExe(hsql,name,dates)
    
#生成  临时表3
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m3)s
            select
                t1.prod_inst_id,
                t1.domain_name,
                t1.website_type,
                t1.net_num,
                t1.net_flow,
                row_number() OVER(distribute by t1.prod_inst_id sort by t1.net_num desc) rn
            from %(s_temp_dwa_user_network_beh_m2)s t1
         '''% vars()
    QueryExe(hsql,name,dates) 

#生成    临时表4
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m4)s
            select
                t1.prod_inst_id,
                t1.domain_name domain_name_1,
                t1.website_type domain_type_1,
                t1.net_flow domain_name_flow_1,
                t2.domain_name domain_name_2,
                t2.website_type domain_type_2,
                t2.net_flow domain_name_flow_2,
                t3.domain_name domain_name_3,
                t3.website_type domain_type_3,
                t3.net_flow domain_name_flow_3,
                t4.domain_name domain_name_4,
                t4.website_type domain_type_4,
                t4.net_flow domain_name_flow_4,
                t5.domain_name domain_name_5,
                t5.website_type domain_type_5,
                t5.net_flow domain_name_flow_5
             from %(s_temp_dwa_user_network_beh_m3)s t1
             left join %(s_temp_dwa_user_network_beh_m3)s t2 on t1.prod_inst_id=t2.prod_inst_id and t2.rn=2
             left join %(s_temp_dwa_user_network_beh_m3)s t3 on t1.prod_inst_id=t3.prod_inst_id and t3.rn=3
             left join %(s_temp_dwa_user_network_beh_m3)s t4 on t1.prod_inst_id=t4.prod_inst_id and t4.rn=4
             left join %(s_temp_dwa_user_network_beh_m3)s t5 on t1.prod_inst_id=t5.prod_inst_id and t5.rn=5
             where t1.rn=1
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成  临时表5
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m5)s
            select
                t1.prod_inst_id,
                t1.website_type,
                sum(t1.net_num) net_num,
                sum(t1.net_flow) net_flow
            from %(s_dwa_user_network_domain_m)s t1
            where t1.pt_mon in ('%(ARG_OPTIME_LAST1_M)s','%(ARG_OPTIME_LAST2_M)s','%(ARG_OPTIME_LAST3_M)s')
            group by t1.prod_inst_id,t1.website_type
         '''% vars()
    QueryExe(hsql,name,dates)
    
#生成  临时表6
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m6)s
            select
                t1.prod_inst_id,
                t1.website_type,
                t1.net_num,
                t1.net_flow,
                row_number() OVER(distribute by t1.prod_inst_id sort by t1.net_num desc) rn
            from %(s_temp_dwa_user_network_beh_m5)s t1
         '''% vars()
    QueryExe(hsql,name,dates) 

#生成    临时表7
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m7)s
            select
                t1.prod_inst_id,
                t1.website_type website_type_1,
                t1.net_flow website_type_flow_1,
                t2.website_type website_type_2,
                t2.net_flow website_type_flow_2,
                t3.website_type website_type_3,
                t3.net_flow website_type_flow_3,
                t4.website_type website_type_4,
                t4.net_flow website_type_flow_4,
                t5.website_type website_type_5,
                t5.net_flow website_type_flow_5
             from %(s_temp_dwa_user_network_beh_m6)s t1
             left join %(s_temp_dwa_user_network_beh_m6)s t2 on t1.prod_inst_id=t2.prod_inst_id and t2.rn=2
             left join %(s_temp_dwa_user_network_beh_m6)s t3 on t1.prod_inst_id=t3.prod_inst_id and t3.rn=3
             left join %(s_temp_dwa_user_network_beh_m6)s t4 on t1.prod_inst_id=t4.prod_inst_id and t4.rn=4
             left join %(s_temp_dwa_user_network_beh_m6)s t5 on t1.prod_inst_id=t5.prod_inst_id and t5.rn=5
             where t1.rn=1
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成  临时表8
    hsql='''insert overwrite table %(s_temp_dwa_user_network_beh_m8)s
            select
                t1.prod_inst_id,
                sum(t1.net_time) total_net_time,
                sum(case when t1.device_type='电脑' then t1.net_time else 0 end) pc_net_time,
                sum(case when t1.device_type='移动设备' then t1.net_time else 0 end) mobile_net_time
            from %(s_dwa_user_network_device_m)s t1
            where t1.pt_mon in ('%(ARG_OPTIME_LAST1_M)s','%(ARG_OPTIME_LAST2_M)s','%(ARG_OPTIME_LAST3_M)s')
            group by t1.prod_inst_id
         '''% vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当周期的记录
    hsql='''insert overwrite table %(t_dwa_user_network_beh_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                t1.prod_inst_id,
                t1.cust_id,
                coalesce(t2.bandwidth,t9.bandwidth,'') bandwidth,
                coalesce(t3.total_net_flow,'') total_net_flow,
                case when round(t3.wy_net_num/t3.total_net_num*100,2)>20 or round(t3.wy_net_flow/t3.total_net_flow*100,2)>20 then 1 else 0 end is_yemaozi,
                case when round(t3.weekend_net_num/t3.total_net_num*100,2)>70 or round(t3.weekend_net_flow/t3.total_net_flow*100,2)>70
                          or round(t3.ws_net_num/t3.total_net_num*100,2)>80 or round(t3.ws_net_flow/t3.total_net_flow*100,2)>80 then 1 else 0 end is_shangbanzu,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.weekday_net_num/t3.total_net_num*100,2) end weekday_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.weekday_net_flow/t3.total_net_flow*100,2) end weekday_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.weekend_net_num/t3.total_net_num*100,2) end weekend_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.weekend_net_flow/t3.total_net_flow*100,2) end weekend_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.lc_net_num/t3.total_net_num*100,2) end lc_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.lc_net_flow/t3.total_net_flow*100,2) end lc_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.zs_net_num/t3.total_net_num*100,2) end zs_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.zs_net_flow/t3.total_net_flow*100,2) end zs_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.sw_net_num/t3.total_net_num*100,2) end sw_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.sw_net_flow/t3.total_net_flow*100,2) end sw_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.zw_net_num/t3.total_net_num*100,2) end zw_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.zw_net_flow/t3.total_net_flow*100,2) end zw_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.xw_net_num/t3.total_net_num*100,2) end xw_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.xw_net_flow/t3.total_net_flow*100,2) end xw_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.bw_net_num/t3.total_net_num*100,2) end bw_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.bw_net_flow/t3.total_net_flow*100,2) end bw_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.ws_net_num/t3.total_net_num*100,2) end ws_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.ws_net_flow/t3.total_net_flow*100,2) end ws_net_flow_rate,
                case when coalesce(t3.total_net_num,0)=0 then 0 else round(t3.wy_net_num/t3.total_net_num*100,2) end wy_net_num_rate,
                case when coalesce(t3.total_net_flow,0)=0 then 0 else round(t3.wy_net_flow/t3.total_net_flow*100,2) end wy_net_flow_rate,
                case when coalesce(t6.total_net_time,0)=0 then 0 else round(t6.pc_net_time/t6.total_net_time*100,2) end pc_net_time_rate,
                case when coalesce(t6.total_net_time,0)=0 then 0 else round(t6.mobile_net_time/t6.total_net_time*100,2) end mobile_net_time_rate,
                coalesce(t4.domain_name_1,'') domain_name_1,
                coalesce(t4.domain_type_1,'') domain_type_1,
                coalesce(t4.domain_name_flow_1,'') domain_name_flow_1,
                coalesce(t4.domain_name_2,'') domain_name_2,
                coalesce(t4.domain_type_2,'') domain_type_2,
                coalesce(t4.domain_name_flow_2,'') domain_name_flow_2,
                coalesce(t4.domain_name_3,'') domain_name_3,
                coalesce(t4.domain_type_3,'') domain_type_3,
                coalesce(t4.domain_name_flow_3,'') domain_name_flow_3,
                coalesce(t4.domain_name_4,'') domain_name_4,
                coalesce(t4.domain_type_4,'') domain_type_4,
                coalesce(t4.domain_name_flow_4,'') domain_name_flow_4,
                coalesce(t4.domain_name_5,'') domain_name_5,
                coalesce(t4.domain_type_5,'') domain_type_5,
                coalesce(t4.domain_name_flow_5,'') domain_name_flow_5,
                coalesce(t5.website_type_1,'') website_type_1,
                coalesce(t5.website_type_flow_1,'') website_type_flow_1,
                coalesce(t5.website_type_2,'') website_type_2,
                coalesce(t5.website_type_flow_2,'') website_type_flow_2,
                coalesce(t5.website_type_3,'') website_type_3,
                coalesce(t5.website_type_flow_3,'') website_type_flow_3,
                coalesce(t5.website_type_4,'') website_type_4,
                coalesce(t5.website_type_flow_4,'') website_type_flow_4,
                coalesce(t5.website_type_5,'') website_type_5,
                coalesce(t5.website_type_flow_5,'') website_type_flow_5,
                '' video_domain_name_1,
                '' video_domain_name_flow_1,
                '' video_domain_name_2,
                '' video_domain_name_flow_2,
                '' video_domain_name_3,
                '' video_domain_name_flow_3,
                '' video_domain_name_4,
                '' video_domain_name_flow_4,
                '' video_domain_name_5,
                '' video_domain_name_flow_5,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
             from %(s_dwd_fact_ins_prod)s t1
             left join %(s_dwd_up_product_item)s t7
             on t1.offer_id=t7.product_item_id 
             and t7.pt_mon=%(ARG_OPTIME_LAST1_M)s 
             left join %(s_dim_std_product)s t2 
             on t7.name=t2.product_name 
             and t1.own_corp_std_org_code = t2.own_corp_std_org_code
             left join %(s_temp_dwa_user_network_beh_m1)s t3 on t1.prod_inst_id=t3.prod_inst_id
             left join %(s_temp_dwa_user_network_beh_m4)s t4 on t1.prod_inst_id=t4.prod_inst_id
             left join %(s_temp_dwa_user_network_beh_m7)s t5 on t1.prod_inst_id=t5.prod_inst_id
             left join %(s_temp_dwa_user_network_beh_m8)s t6 on t1.prod_inst_id=t6.prod_inst_id
             inner join %(s_dwa_cust_feat_dtl_m)s t8   -- 关联用户剔除测试数据
             on   t1.cust_id = t8.cust_id
             and  t8.pt_mon = %(ARG_OPTIME_LAST1_M)s

             left join %(s_dim_std_product2)s t9
             on t7.name = t9.product_name
             and t8.corp_org_name = t9.own_corp_std_org_name

             where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
                   and (t3.prod_inst_id is not null
                        or t4.prod_inst_id is not null
                        or t5.prod_inst_id is not null
                        or t6.prod_inst_id is not null
                        )
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table %(s_temp_dwa_user_network_beh_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m3)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m4)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m5)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m6)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m7)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_beh_m8)s''' %vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
