#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DIM_IPADDRESS
# Pay:DIM_STD_CP.py
# Purpose:
#
# Author:      zhanghg
#
# Created:     31-10-2014
# Copyright:   (c) zhanghg 2014
# Licence:     <your licence>
# modify:      1-11-2014 by zhanghg  根据验证，IP地址默认取前三位即可判断用户的归属地，故对脚本信息调整，默认只保留IP的前三位
#modiy 2015-2-5 zhanghg 地址如果抓包，抓不到则默认成“其它地区(135)”
#-------------------------------------------------------------------------------
from env_path import *
from settings import *
from hqltools import *
from log4py import logger
import sys
reload(sys)
sys.setdefaultencoding('utf8')

#程序开始执行
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')
dates=sys.argv[1]

try:
#传递日期参数
    dicts={}
    Pama(dicts,dates)
    Start(name,dates)
#===========================================================================================
#ʱ时间参数引入
#===========================================================================================
    ARG_TODAY                 = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy-mm-dd hh格式的当前日期
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
##===========================================================================       
##自定义变量声明---源表声明                                                          
##=========================================================================== 	
    s_dim_ip_relative               =   "dim_ip_relative"
    s_dim_std_organize              =   "dim_std_organize"
    s_dim_std_carrieroperator_rel   =   "dim_std_carrieroperator_rel"
    s_temp_dim_ipaddress            =   "temp_dim_ipaddress"
##===========================================================================       
##自定义变量声明---目标表声明                                                                 
##=========================================================================== 
    t_dim_ipaddress			        =	"dim_ipaddress" 
##===========================================================================       
##创建临时表                                               
##===========================================================================  
    hsql='''create table if not exists %(s_temp_dim_ipaddress)s (
               ip_address         string,
               ip_num             bigint,
               country            string,
               area               string,
               province           string,
               city               string,
               county             string,
               isp                string
            )
            LOCATION '%(tmp_path)s/%(s_temp_dim_ipaddress)s'
            '''% vars()    
    QueryExe(hsql,name,dates)  
##===========================================================================       
##生成临时表数据                                             
##===========================================================================   
#获取本周期新增IP全量数据
    hsql='''insert overwrite table %(s_temp_dim_ipaddress)s 
            select
            concat(split(split(ip,':')[0],'\\\.')[0],'.',split(split(ip,':')[0],'\\\.')[1],'.',split(split(ip,':')[0],'\\\.')[2]) ip,
            (((split(split(ip,':')[0],'\\\.')[0]*256)+split(split(ip,':')[0],'\\\.')[1])*256+split(split(ip,':')[0],'\\\.')[2])*256 ip_num,
            country,
            area,
            case when trim(province)='' then country else province end province,
            case when trim(province)='' and trim(city)=''  then country   --针对 中国
                 when trim(city)='' and trim(country) in('台湾','香港','澳门') then province   --针对台湾、香港、澳门
                 when trim(city)='' then  '其他'   --很对其他省份 
                 else city end city,
            county,
            isp
            from %(s_dim_ip_relative)s             
            '''% vars()    
    QueryExe(hsql,name,dates)
#去重操作     
    hsql='''insert overwrite table %(s_temp_dim_ipaddress)s 
            select
            ip_address,
            ip_num,
            country,
            area,
            province,
            city,
            county,
            isp
            from(
                select
                ip_address,
                ip_num,
                country,
                area,
                province,
                city,
                county,
                isp,
                row_number() over(distribute by ip_num sort by country,province,city) rn   
                from %(s_temp_dim_ipaddress)s where ip_num is not null
                ) t where rn<=1
            '''% vars()    
    QueryExe(hsql,name,dates)      
##===========================================================================       
##生成目标数据                                               
##===========================================================================    
#删除变更数据
    hsql='''insert overwrite table %(t_dim_ipaddress)s            
            select
            t1.ip_address,
            t1.ip_num,
            t1.country,
            t1.area,
            t1.province,
            t1.city,
            t1.county,
            t1.isp,
            t1.std_org_code,
            t1.std_cop_code        
            from %(t_dim_ipaddress)s t1
            left outer join %(s_temp_dim_ipaddress)s t2 on t1.ip_num=t2.ip_num
            where t2.ip_address is null
            '''% vars()    
    QueryExe(hsql,name,dates)
#插入变更数据    
    hsql='''insert into table %(t_dim_ipaddress)s            
            select
            t1.ip_address,
            t1.ip_num,
            t1.country,
            t1.area,
            t1.province,
            t1.city,
            t1.county,
            t1.isp,
            coalesce(t2.std_org_code,135),
            coalesce(t3.std_cop_code,99999)          
            from %(s_temp_dim_ipaddress)s t1
            left outer join %(s_dim_std_organize)s t2 on t1.country=t2.country and t1.province=t2.province and t1.city=t2.city
            left outer join %(s_dim_std_carrieroperator_rel)s t3 on t1.isp=t3.std_agent_cop_name
            '''% vars()    
    QueryExe(hsql,name,dates)
##===========================================================================       
##删除临时表                                                                
##===========================================================================      
    hsql='''drop table %(s_temp_dim_ipaddress)s
            '''% vars()    
    QueryExe(hsql,name,dates)   
##===========================================================================       
##程序结束                                                                     
##===========================================================================    
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
