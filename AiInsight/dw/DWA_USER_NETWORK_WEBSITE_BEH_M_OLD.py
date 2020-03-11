#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户上网网站类型行为标签月表
# Pay:DWA_USER_NETWORK_WEBSITE_BEH_M.py
# Purpose:
#
# Author:      chens
#
# Created:     25-08-2017
# Copyright:   (c) chens 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# 添加客户编号cust_id,取自dwd_fact_ins_prod
# 修改时间： 2017-11-16
# 修改人 ： wangxx

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
sdate=sys.argv[1]
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

#    s_dwd_fact_ins_prod                      =    "dwd_fact_ins_prod"
    s_dwa_fact_rpt_ins_prod_mon              =    "dwa_fact_rpt_ins_prod_mon"
    s_dwa_user_network_domain_m              =    "dwa_user_network_domain_m"
    s_temp_dwa_user_network_website_beh_m1   =    "temp_dwa_user_network_website_beh_m1"
    s_temp_dwa_user_network_website_beh_m2   =    "temp_dwa_user_network_website_beh_m2"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_network_website_beh_m         =    "dwa_user_network_website_beh_m" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放最近3个月数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_website_beh_m1)s
            (
              prod_inst_id      string,
              website_type      string,
              domain_name       string,
              net_num           string,
              net_flow          string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_website_beh_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 按用户和网站类型分组，上网次数倒序排序的数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_website_beh_m2)s
            (
              prod_inst_id      string,
              website_type      string,
              domain_name       string,
              net_num           string,
              net_flow          string,
              rn                int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_website_beh_m2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成  临时表1
    hsql='''insert overwrite table %(s_temp_dwa_user_network_website_beh_m1)s
            select
                t1.prod_inst_id,
                coalesce(t1.website_type,'未知'),
                t1.domain_name,
                sum(t1.net_num) net_num,
                sum(t1.net_flow) net_flow
            from %(s_dwa_user_network_domain_m)s t1
            where t1.pt_mon in ('%(ARG_OPTIME_LAST1_M)s','%(ARG_OPTIME_LAST2_M)s','%(ARG_OPTIME_LAST3_M)s')
            group by t1.prod_inst_id,coalesce(t1.website_type,'未知'),t1.domain_name
         '''% vars()
    QueryExe(hsql,name,dates)    

#生成  临时表2
    hsql='''insert overwrite table %(s_temp_dwa_user_network_website_beh_m2)s
            select
                t1.prod_inst_id,
                t1.website_type,
                t1.domain_name,
                t1.net_num,
                t1.net_flow,
                row_number() OVER(distribute by t1.prod_inst_id,t1.website_type sort by t1.net_num desc) rn
            from %(s_temp_dwa_user_network_website_beh_m1)s t1
         '''% vars()
    QueryExe(hsql,name,dates) 
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当周期的记录
    hsql='''insert overwrite table %(t_dwa_user_network_website_beh_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                t1.prod_inst_id,
                t6.cust_code,
                coalesce(t1.website_type,'') website_type,
                coalesce(t1.domain_name,'') domain_name_1,
                coalesce(t1.net_flow,'') domain_name_flow_1,
                coalesce(t2.domain_name,'') domain_name_2,
                coalesce(t2.net_flow,'') domain_name_flow_2,
                coalesce(t3.domain_name,'') domain_name_3,
                coalesce(t3.net_flow,'') domain_name_flow_3,
                coalesce(t4.domain_name,'') domain_name_4,
                coalesce(t4.net_flow,'') domain_name_flow_4,
                coalesce(t5.domain_name,'') domain_name_5,
                coalesce(t5.net_flow,'') domain_name_flow_5,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
             from %(s_temp_dwa_user_network_website_beh_m2)s t1
             left join %(s_temp_dwa_user_network_website_beh_m2)s t2 on t1.prod_inst_id=t2.prod_inst_id and t1.website_type=t2.website_type and t2.rn=2
             left join %(s_temp_dwa_user_network_website_beh_m2)s t3 on t1.prod_inst_id=t3.prod_inst_id and t1.website_type=t3.website_type and t3.rn=3
             left join %(s_temp_dwa_user_network_website_beh_m2)s t4 on t1.prod_inst_id=t4.prod_inst_id and t1.website_type=t4.website_type and t4.rn=4
             left join %(s_temp_dwa_user_network_website_beh_m2)s t5 on t1.prod_inst_id=t5.prod_inst_id and t1.website_type=t5.website_type and t5.rn=5
             left join %(s_dwa_fact_rpt_ins_prod_mon)s t6  on trim(t1.prod_inst_id)=trim(t6.prod_inst_id) and t6.pt_mon=%(ARG_OPTIME_LAST1_M)s
             where t1.rn=1
  
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
