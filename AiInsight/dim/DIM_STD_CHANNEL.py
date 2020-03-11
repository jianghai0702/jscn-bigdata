##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DIM标准频道
# Pay:DIM_STD_CHANNEL.py
# Purpose:
#
# Author:      liuzx
#
# Created:     08-11-2016
# Copyright:   (c) liuzx 2016
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
    ARG_OPTIME_LAST7DAY       = dicts['ARG_OPTIME_LAST7DAY']           #获得传入的数据日期的前七天yyyymmdd格式的数据日期
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']          #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']      #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期

#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_tv_view_log                  =    "dwa_tv_view_log"
    s_dim_std_channel_group         =    "dim_std_channel_group"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dim_std_channel                      =    "dim_std_channel"
    t_dim_std_channel_tmp                  =    "dim_std_channel_tmp"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放：新增节目编号，节目名称
    hsql='''create table if not exists %(t_dim_std_channel_tmp)s
            (
        std_channel_code bigint,
        std_channel_name string,
        std_channel_group_code bigint,
        std_channel_group_name string,
        std_org_code    string
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(t_dim_std_channel_tmp)s'
    '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##数据处理                                                       
##===========================================================================   
#在临时表中删除变更数据
    hsql='''
    insert overwrite table %(t_dim_std_channel_tmp)s
            select
            row_number() over (order by t.channel_name) + if(t3.channel_code_base=0,10000000,t3.channel_code_base) std_channel_code,
              t.channel_name std_channel_name,
              t2.std_channel_group_code,
              t.channel_group_name std_channel_group_name,
              t.std_org_code
            from(
              select distinct 
                t1.channel_name,
                 case when t1.channel_name like 'CCTV%%' then '央视频道组'
                      when t1.channel_name like '%%江苏%%' then '江苏台频道组'
                      when t1.channel_name like '%%卫视%%' then '卫视频道组'
                      when t1.channel_name like '南京%%' then '南京频道组'
                      when t1.channel_name like '无锡%%' then '无锡频道组'
                      when t1.channel_name like '镇江%%' then '镇江频道组'
                      when t1.channel_name like '苏州%%' then '苏州频道组'
                      when t1.channel_name like '盐城%%' then '盐城频道组'
                      when t1.channel_name like '淮安%%' then '淮安频道组'
                      when t1.channel_name like '连云港%%' then '连云港频道组'
                      when t1.channel_name like '常州%%' then '常州频道组'
                      when t1.channel_name like '泰州%%' then '泰州频道组'
                      when t1.channel_name like '宿迁%%' then '宿迁频道组'
                      when t1.channel_name like '南通%%' then '南通频道组'
                      when t1.channel_name like '徐州%%' then '徐州频道组'
                      when t1.channel_name like '扬州%%' then '扬州频道组'
                      else '其他频道组' end as channel_group_name,
                 case when t1.channel_name like 'CCTV%%' then '10'
                      when t1.channel_name like '%%江苏%%' then '10'
                      when t1.channel_name like '%%卫视%%' then '10'
                       when t1.channel_name like '南京%%' then '1001'
                       when t1.channel_name like '无锡%%' then '1002'
                       when t1.channel_name like '镇江%%' then '1003'
                       when t1.channel_name like '苏州%%' then '1004'
                       when t1.channel_name like '盐城%%' then '1005'
                       when t1.channel_name like '淮安%%' then '1006'
                       when t1.channel_name like '连云港%%' then '1007'
                       when t1.channel_name like '常州%%' then '1008'
                       when t1.channel_name like '泰州%%' then '1009'
                       when t1.channel_name like '宿迁%%' then '1010'
                       when t1.channel_name like '南通%%' then '1011'
                       when t1.channel_name like '徐州%%' then '1012'
                       when t1.channel_name like '扬州%%' then '1013'
                      else '10' end  as std_org_code
              from %(s_dwa_tv_view_log)s  t1
              left outer join %(t_dim_std_channel)s t2 
              on t1.channel_name=t2.std_channel_name
              where coalesce(t2.std_channel_name,'') = ''
                 and t1.pt_mon='%(ARG_OPTIME_LAST1_M)s' 
           ) as t
             left join %(s_dim_std_channel_group)s as t2 
                 on t.channel_group_name = t2.std_channel_group_name
             cross join (select coalesce(max(cast(std_channel_code as int)),0) channel_code_base from %(t_dim_std_channel)s) t3
    ''' % vars()
    QueryExe(hsql,name,dates)
    
#生成目标表数据
    hsql='''insert into table %(t_dim_std_channel)s            
            select
              t1.std_channel_code,
              t1.std_channel_name,
              -1 p_std_channel_code,
              t1.std_channel_group_code,
              t1.std_channel_group_name,
              concat('#',t1.std_channel_code,'#') fullpath,
              1 original_code,
              '' notes,
              1 is_display,
              t1.std_channel_code-10000000 display_order,
              1 is_valid,
              t1.std_org_code,
              current_timestamp as update_date
              from %(t_dim_std_channel_tmp)s t1
    '''% vars()
    QueryExe(hsql,name,dates)    

##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(t_dim_std_channel_tmp)s'''
#    QueryExe(hsql,name,dates) 

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)

