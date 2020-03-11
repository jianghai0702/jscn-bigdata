#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST流控数据流量分析统计(日)
# Pay:ST_DPI_FLOW_D.py
# Purpose:
#
# Author:      chens
#
# Created:     10-09-2016
# Copyright:   (c) chens 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from env_path import *
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
    s_dwd_url_log                  =    "dwd_url_log"
    s_dim_std_intranet_ip          =    "dim_std_intranet_ip"
    s_dim_std_operator_ip          =    "dim_std_operator_ip"
    s_dim_std_content              =    "dim_std_content"
    s_temp_st_dpi_flow_d1          =    "temp_st_dpi_flow_d1"
    s_temp_st_dpi_flow_d2          =    "temp_st_dpi_flow_d2"
    s_temp_st_dpi_flow_d3          =    "temp_st_dpi_flow_d3"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_dpi_flow_d                =    "st_dpi_flow_d"      
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#存放    不关联dim表的初步汇总数据
    hsql='''create table if not exists %(s_temp_st_dpi_flow_d1)s
            (
              content_id           string,
              source_ip            string,
              target_ip            string,
              target_ip_num        bigint,
              url                  string,
              down_flow            double,
              up_flow              double
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_dpi_flow_d1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#存放    加入了内外网维度的汇总数据
    hsql='''create table if not exists %(s_temp_st_dpi_flow_d2)s
            (
              net_type             string,
              content_id           string,
              source_ip            string,
              target_ip            string,
              target_ip_num        bigint,
              url                  string,
              down_flow            double,
              up_flow              double
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_dpi_flow_d2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#存放    加入了目标归属和运营商维度的汇总数据
    hsql='''create table if not exists %(s_temp_st_dpi_flow_d3)s
            (
              net_type             string,
              content_id           string,
              source_ip            string,
              target_ip            string,
              target_ip_num        bigint,
              target_belong        string,
              operator             string,
              url                  string,
              down_flow            double,
              up_flow              double
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_dpi_flow_d3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    不关联dim表的初步汇总数据
#原始数据中上下行流量单位是B，统计后的数据要用GB
    hsql='''insert overwrite table %(s_temp_st_dpi_flow_d1)s
            select
                t1.content_id,
                t1.source_ip,
                t1.target_ip,
                split(t1.target_ip,'\\\.')[0]*256*256*256+split(t1.target_ip,'\\\.')[1]*256*256+split(t1.target_ip,'\\\.')[2]*256+split(t1.target_ip,'\\\.')[3] target_ip_num,
                t1.host url,
                round(sum(t1.down_flow)/1024/1024/1024,2) down_flow,
                round(sum(t1.up_flow)/1024/1024/1024,2) up_flow
             from %(s_dwd_url_log)s t1
             where t1.pt_time=%(ARG_OPTIME_LASTDAY)s
            group by t1.content_id,t1.source_ip,t1.target_ip,t1.host
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成    内网的汇总数据
    hsql='''insert overwrite table %(s_temp_st_dpi_flow_d2)s
            select
                '内网' net_type,
                t1.content_id,
                t1.source_ip,
                t1.target_ip,
                t1.target_ip_num,
                t1.url,
                t1.down_flow,
                t1.up_flow
             from %(s_temp_st_dpi_flow_d1)s t1,
                  %(s_dim_std_intranet_ip)s t2
             where t1.target_ip_num>=t2.start_ip_num
                   and t1.target_ip_num<=t2.end_ip_num
          '''% vars()    
    QueryExe(hsql,name,dates)
    
#生成    外网的汇总数据
    hsql='''insert into table %(s_temp_st_dpi_flow_d2)s
            select
                '外网' net_type,
                t1.content_id,
                t1.source_ip,
                t1.target_ip,
                t1.target_ip_num,
                t1.url,
                t1.down_flow,
                t1.up_flow
             from %(s_temp_st_dpi_flow_d1)s t1
             left outer join %(s_temp_st_dpi_flow_d2)s t2 on t1.content_id=t2.content_id and t1.source_ip=t2.source_ip and t1.target_ip=t2.target_ip
                                                       and t1.target_ip_num=t2.target_ip_num and t1.url=t2.url
             where t2.net_type is null
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成    加入了目标归属和运营商维度的汇总数据
    hsql='''insert overwrite table %(s_temp_st_dpi_flow_d3)s
            select
                t1.net_type,
                t1.content_id,
                t1.source_ip,
                t1.target_ip,
                t1.target_ip_num,
                t2.belong target_belong,
                t2.operator,
                t1.url,
                t1.down_flow,
                t1.up_flow
             from %(s_temp_st_dpi_flow_d2)s t1,
                  %(s_dim_std_operator_ip)s t2
             where t1.target_ip_num>=t2.start_ip_num
                   and t1.target_ip_num<=t2.end_ip_num
          '''% vars()    
    QueryExe(hsql,name,dates)

#生成    当天的记录；
    hsql='''insert overwrite table %(t_st_dpi_flow_d)s partition(pt_time=%(ARG_OPTIME_LASTDAY)s)
            select
                %(ARG_OPTIME_LASTDAY)s cycle_id,
                t1.net_type,
                t2.std_content_type content_type,
                t2.std_content_name content_name,
                t1.source_ip,
                t1.target_ip,
                t1.target_belong,
                t1.operator,
                t1.url,
                t1.down_flow,
                t1.up_flow,
                round(t1.down_flow+t1.up_flow,2) total_flow,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
             from %(s_temp_st_dpi_flow_d3)s t1
             left outer join %(s_dim_std_content)s t2 on t1.content_id=t2.std_content_code
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_st_tv_diff_min_channel_view_d1)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_diff_min_channel_view_d2)s''' %vars()
#    QueryExe(hsql,name,dates)

#    hsql='''drop table %(s_temp_st_tv_diff_min_channel_view_d3)s''' %vars()
#    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
