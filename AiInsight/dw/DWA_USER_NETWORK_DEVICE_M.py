#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户上网设备月表
# Pay:DWA_USER_NETWORK_DEVICE_M.py
# Purpose:
#
# Author:      chens
#
# Created:     28-08-2017
# Copyright:   (c) chens 2017
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
    s_dwa_diff_online_media_user_d           =    "dwa_diff_online_media_user_d"
    s_dwd_fact_ins_prod                      =    "dwd_fact_ins_prod"
    s_temp_dwa_user_network_device_m1        =    "temp_dwa_user_network_device_m1"
    s_temp_dwa_user_network_device_m2        =    "temp_dwa_user_network_device_m2"
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_network_device_m              =    "dwa_user_network_device_m" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放 按用户，上网设备分组，访问时间排序的数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_device_m1)s
            (
              login_name            string,
              std_device_cate_code  string,
              access_time           string,
              access_time_num       string,
              acct_start_time       string,
              acct_start_time_num   string,
              acct_stop_time        string,
              acct_stop_time_num    string,
              rn                    int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_device_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放 用户各上网设备的上网时长
    hsql='''create table if not exists %(s_temp_dwa_user_network_device_m2)s
            (
              login_name            string,
              std_device_cate_code  string,
              net_time              string,
              net_num               string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_device_m2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成  临时表1
    hsql='''insert overwrite table %(s_temp_dwa_user_network_device_m1)s
            select
                t1.login_name,
                t1.std_device_cate_code,
                t1.access_time,
                unix_timestamp(t1.access_time,'yyyy-MM-dd HH:mm:ss') access_time_num,
                t1.acct_start_time,
                unix_timestamp(t1.acct_start_time,'yyyy-MM-dd HH:mm:ss') acct_start_time_num,
                t1.acct_stop_time,
                unix_timestamp(t1.acct_stop_time,'yyyy-MM-dd HH:mm:ss') acct_stop_time_num,
                row_number() OVER(distribute by t1.login_name,t1.std_device_cate_code sort by t1.access_time asc) rn
            from %(s_dwa_diff_online_media_user_d)s t1
            where substr(t1.pt_time,1,6)='%(ARG_OPTIME_LAST1_M)s'
         '''% vars()
    QueryExe(hsql,name,dates)    

#生成  临时表2
    hsql='''insert overwrite table %(s_temp_dwa_user_network_device_m2)s
            select
                t1.login_name,
                t1.std_device_cate_code,
            --    sum(if(t1.acct_stop_time_num<t2.access_time_num,t1.acct_stop_time_num,t2.access_time_num)-t1.access_time_num) net_time,
                sum(least(t1.acct_stop_time_num,coalesce(t2.access_time_num,t1.acct_stop_time_num))-t1.access_time_num) net_time,
                count(1) net_num
            from %(s_temp_dwa_user_network_device_m1)s t1
            left join %(s_temp_dwa_user_network_device_m1)s t2 on t1.login_name=t2.login_name and t1.std_device_cate_code=t2.std_device_cate_code and t1.rn+1=t2.rn
            group by t1.login_name,t1.std_device_cate_code
         '''% vars()
    QueryExe(hsql,name,dates)      
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当周期的记录
    hsql='''insert overwrite table %(t_dwa_user_network_device_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                t2.prod_inst_id,
                case when t1.std_device_cate_code in ('windows','mac') then '电脑' else '移动设备' end device_type,
                sum(t1.net_time) net_time,
                sum(t1.net_num)  net_num,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_dwa_user_network_device_m2)s t1
            join %(s_dwd_fact_ins_prod)s t2 on t1.login_name=t2.login_name and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'
            group by t2.prod_inst_id,
                     case when t1.std_device_cate_code in ('windows','mac') then '电脑' else '移动设备' end
          '''% vars()    
    QueryExe(hsql,name,dates)

    
##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table %(s_temp_dwa_user_network_device_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_device_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
