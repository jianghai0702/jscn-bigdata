#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户上网时段月表
# Pay:DWA_USER_NETWORK_TIME_M.py
# Purpose:
#
# Author:      chens
#
# Created:     25-08-2017
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
    s_dwd_dr_brd_expend                      =    "dwd_dr_brd_expend"

    s_dwd_fact_ins_prod                      =    "dwd_fact_ins_prod"
    s_temp_dwa_user_network_time_m1          =    "temp_dwa_user_network_time_m1"
    s_temp_dwa_user_network_time_m2          =    "temp_dwa_user_network_time_m2"
    s_temp_dwa_user_network_time_m3          =    "temp_dwa_user_network_time_m3"
    s_temp_dwa_user_network_time_m4          =    "temp_dwa_user_network_time_m4"
    s_temp_dwa_user_network_time_m5          =    "temp_dwa_user_network_time_m5"
    s_temp_dwa_user_network_time_m6          =    "temp_dwa_user_network_time_m6"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_network_time_m                =    "dwa_user_network_time_m" 
##===========================================================================       
##创建临时表                                                        
##===========================================================================
#用来存放用户各时段的上网次数
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m1)s
            (
              prod_inst_id      string,
              week_type         string,
              time_bucket       string,
              net_num           string,
              net_flow          string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)

#用来存放用户各时段的上网流量
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m2)s
            (
              prod_inst_id      string,
              week_type         string,
              time_bucket       string,
              net_num           string,
              net_flow          string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m2)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放有效的在线记录中间结果数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m3)s
            (
              user_name          string,
              acct_start_time    string,
              acct_stop_time     string,
              acct_input_octets  string,
              acct_output_octets string              
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m3)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放在线记录中每条记录对应的每秒平均流量
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m4)s
            (
              user_name          string,
              acct_start_time    string,
              acct_stop_time     string,
              avg_flow           string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m4)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放拆分跨时段的数据为多条数据
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m5)s
            (
              user_name          string,
              acct_start_time    string,
              acct_stop_time     string,
              avg_flow           string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m5)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
#用来存放各时段的上网时长
    hsql='''create table if not exists %(s_temp_dwa_user_network_time_m6)s
            (
              prod_inst_id              string,
              week_type                 string,
              time_bucket_duration_1    string,
              time_bucket_duration_2    string,
              time_bucket_duration_3    string,
              time_bucket_duration_4    string,
              time_bucket_duration_5    string,
              time_bucket_duration_6    string,
              time_bucket_duration_7    string,
              time_bucket_duration_8    string,
              avg_flow                  string
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_dwa_user_network_time_m6)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##生成临时表数据                                                      
##===========================================================================
#生成  临时表1
#工作日类型：1:工作日(周一到周四)  0:非工作日(周五到周日)
#时段：凌晨是指0点到2点，早晨指6点至8点，上午是指8点至12点，中午指12点至14点，下午指14点至18，傍晚是指18点至19点，晚上指19点至24点，午夜指2点到6点
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m1)s
            select
                t2.prod_inst_id,
                case when pmod(datediff(t1.access_time,'1920-01-01')-3,7) in ('1','2','3','4') then '工作日' else '非工作日' end week_type,
                case when t1.hour in ('0','1') then '凌晨'
                     when t1.hour in ('2','3','4','5') then '午夜'
                     when t1.hour in ('6','7') then '早晨'
                     when t1.hour in ('8','9','10','11') then '上午'
                     when t1.hour in ('12','13') then '中午'
                     when t1.hour in ('14','15','16','17') then '下午'
                     when t1.hour in ('18') then '傍晚'
                     when t1.hour in ('19','20','21','22','23') then '晚上' 
                     end time_bucket,
                count(1) net_num,
                0 net_flow
            from %(s_dwa_diff_online_media_user_d)s t1
            join %(s_dwd_fact_ins_prod)s t2 on t1.login_name=t2.login_name and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'
            where substr(t1.pt_time,1,6)='%(ARG_OPTIME_LAST1_M)s'
            group by t2.prod_inst_id,
                     case when pmod(datediff(t1.access_time,'1920-01-01')-3,7) in ('1','2','3','4') then '工作日' else '非工作日' end,
                     case when t1.hour in ('0','1') then '凌晨'
                          when t1.hour in ('2','3','4','5') then '午夜'
                          when t1.hour in ('6','7') then '早晨'
                          when t1.hour in ('8','9','10','11') then '上午'
                          when t1.hour in ('12','13') then '中午'
                          when t1.hour in ('14','15','16','17') then '下午'
                          when t1.hour in ('18') then '傍晚'
                          when t1.hour in ('19','20','21','22','23') then '晚上' 
                          end
         '''% vars()
    QueryExe(hsql,name,dates)    
    
#生成  临时表3
#插入当月有效在线记录
#在线超过3天会自动踢下线，超过3天的是异常数据
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m3)s
            select 
                t1.user_name,
                t1.acct_start_time,
                t1.acct_stop_time,
                t1.acct_input_octets,
                t1.acct_output_octets
            from %(s_dwd_dr_brd_expend)s t1
            where substr(t1.pt_time,1,6)='%(ARG_OPTIME_LAST1_M)s'
                  and datediff(t1.acct_stop_time,t1.acct_start_time)>=0
                  and datediff(t1.acct_stop_time,t1.acct_start_time)<=3
            '''% vars()
    QueryExe(hsql,name,dates)

#排除开始时间相同的，保留结束时间最大的
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m3)s
            select 
                t1.user_name,
                t1.acct_start_time,
                t1.acct_stop_time,
                t1.acct_input_octets,
                t1.acct_output_octets
            from (select 
                      t.*,row_number()over(partition by user_name,acct_start_time order by acct_stop_time desc) rn
                  from %(s_temp_dwa_user_network_time_m3)s t
                  ) t1
            where t1.rn = 1
            '''% vars()
    QueryExe(hsql,name,dates)
    
#排除结束时间相同的，保留开始时间最小的
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m3)s
            select 
                t1.user_name,
                t1.acct_start_time,
                t1.acct_stop_time,
                t1.acct_input_octets,
                t1.acct_output_octets
            from (select 
                      t.*,row_number()over(partition by user_name,acct_stop_time order by acct_start_time asc) rn
                  from %(s_temp_dwa_user_network_time_m3)s t
                  ) t1
            where t1.rn = 1
            '''% vars()
    QueryExe(hsql,name,dates)

#生成  临时表4
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m4)s
            select 
                t1.user_name,
                t1.acct_start_time,
                t1.acct_stop_time,
                (t1.acct_input_octets+t1.acct_output_octets)/(unix_timestamp(acct_stop_time,'yyyy-MM-dd HH:mm:ss')-unix_timestamp(acct_start_time,'yyyy-MM-dd HH:mm:ss')) avg_flow
            from %(s_temp_dwa_user_network_time_m3)s t1
            '''% vars()
    QueryExe(hsql,name,dates)

#生成  临时表5    
#拆分跨时段的数据为多条数据
#插入不跨天的数据
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m5)s
            select 
                t1.user_name,
                t1.acct_start_time,
                t1.acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=0
            '''% vars()
    QueryExe(hsql,name,dates)
    
#插入跨一天的数据
    hsql='''insert into table %(s_temp_dwa_user_network_time_m5)s
            select * from (
            select 
                t1.user_name,
                t1.acct_start_time,
                concat(to_date(t1.acct_start_time),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=1
            union all
            select 
                t1.user_name,
                concat(to_date(t1.acct_stop_time),' 00:00:00') acct_start_time,
                t1.acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=1            
            ) a               
            '''% vars()
    QueryExe(hsql,name,dates)
    
#插入跨两天的数据
    hsql='''insert into table %(s_temp_dwa_user_network_time_m5)s
            select * from (
            select 
                t1.user_name,
                t1.acct_start_time,
                concat(to_date(t1.acct_start_time),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=2
            union all
            select 
                t1.user_name,
                concat(date_add(to_date(t1.acct_start_time),1),' 00:00:00') acct_start_time,
                concat(date_add(to_date(t1.acct_start_time),1),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=2 
            union all
            select 
                t1.user_name,
                concat(to_date(t1.acct_stop_time),' 00:00:00') acct_start_time,
                t1.acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=2            
            ) a               
            '''% vars()
    QueryExe(hsql,name,dates)
    
#插入跨三天的数据
    hsql='''insert into table %(s_temp_dwa_user_network_time_m5)s
            select * from (
            select 
                t1.user_name,
                t1.acct_start_time,
                concat(to_date(t1.acct_start_time),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=3
            union all
            select 
                t1.user_name,
                concat(date_add(to_date(t1.acct_start_time),1),' 00:00:00') acct_start_time,
                concat(date_add(to_date(t1.acct_start_time),1),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=3 
            union all
            select 
                t1.user_name,
                concat(date_add(to_date(t1.acct_start_time),2),' 00:00:00') acct_start_time,
                concat(date_add(to_date(t1.acct_start_time),2),' 23:59:59') acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=3 
            union all
            select 
                t1.user_name,
                concat(to_date(t1.acct_stop_time),' 00:00:00') acct_start_time,
                t1.acct_stop_time,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m4)s t1
            where datediff(t1.acct_stop_time,t1.acct_start_time)=3            
            ) a               
            '''% vars()
    QueryExe(hsql,name,dates)
    
#生成  临时表6
#工作日类型：1:工作日(周一到周四)  0:非工作日(周五到周日)
#时段：凌晨是指0点到2点，早晨指6点至8点，上午是指8点至12点，中午指12点至14点，下午指14点至18，傍晚是指18点至19点，晚上指19点至24点，午夜指2点到6点
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m6)s
            select
                t2.prod_inst_id,
                case when pmod(datediff(t1.acct_start_time,'1920-01-01')-3,7) in ('1','2','3','4') then '工作日' else '非工作日' end week_type,
                case when hour(t1.acct_start_time) in (0,1) and hour(t1.acct_stop_time) in (0,1) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (0,1) and hour(t1.acct_stop_time)>1 then unix_timestamp(concat(to_date(t1.acct_start_time),' 01:59:59'))-unix_timestamp(t1.acct_start_time)
                     else 0 end time_bucket_duration_1,
                case when hour(t1.acct_start_time) in (2,3,4,5) and hour(t1.acct_stop_time) in (2,3,4,5) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (2,3,4,5) and hour(t1.acct_stop_time)>5 then unix_timestamp(concat(to_date(t1.acct_start_time),' 05:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<2 and hour(t1.acct_stop_time) in (2,3,4,5) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 02:00:00'))
                     when hour(t1.acct_start_time)<2 and hour(t1.acct_stop_time)>5 then 14400
                     else 0 end time_bucket_duration_2,
                case when hour(t1.acct_start_time) in (6,7) and hour(t1.acct_stop_time) in (6,7) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (6,7) and hour(t1.acct_stop_time)>7 then unix_timestamp(concat(to_date(t1.acct_start_time),' 07:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<6 and hour(t1.acct_stop_time) in (6,7) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 06:00:00'))
                     when hour(t1.acct_start_time)<6 and hour(t1.acct_stop_time)>7 then 7200
                     else 0 end time_bucket_duration_3,
                case when hour(t1.acct_start_time) in (8,9,10,11) and hour(t1.acct_stop_time) in (8,9,10,11) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (8,9,10,11) and hour(t1.acct_stop_time)>11 then unix_timestamp(concat(to_date(t1.acct_start_time),' 11:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<8 and hour(t1.acct_stop_time) in (8,9,10,11) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 08:00:00'))
                     when hour(t1.acct_start_time)<8 and hour(t1.acct_stop_time)>11 then 14400
                     else 0 end time_bucket_duration_4,
                case when hour(t1.acct_start_time) in (12,13) and hour(t1.acct_stop_time) in (12,13) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (12,13) and hour(t1.acct_stop_time)>13 then unix_timestamp(concat(to_date(t1.acct_start_time),' 13:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<12 and hour(t1.acct_stop_time) in (12,13) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 12:00:00'))
                     when hour(t1.acct_start_time)<12 and hour(t1.acct_stop_time)>13 then 7200
                     else 0 end time_bucket_duration_5,
                case when hour(t1.acct_start_time) in (14,15,16,17) and hour(t1.acct_stop_time) in (14,15,16,17) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (14,15,16,17) and hour(t1.acct_stop_time)>17 then unix_timestamp(concat(to_date(t1.acct_start_time),' 17:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<14 and hour(t1.acct_stop_time) in (14,15,16,17) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 14:00:00'))
                     when hour(t1.acct_start_time)<14 and hour(t1.acct_stop_time)>17 then 14400
                     else 0 end time_bucket_duration_6,
                case when hour(t1.acct_start_time) in (18) and hour(t1.acct_stop_time) in (18) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time) in (18) and hour(t1.acct_stop_time)>18 then unix_timestamp(concat(to_date(t1.acct_start_time),' 18:59:59'))-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<18 and hour(t1.acct_stop_time) in (18) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 18:00:00'))
                     when hour(t1.acct_start_time)<18 and hour(t1.acct_stop_time)>18 then 3600
                     else 0 end time_bucket_duration_7,
                case when hour(t1.acct_start_time) in (19,20,21,22,23) and hour(t1.acct_stop_time) in (19,20,21,22,23) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(t1.acct_start_time)
                     when hour(t1.acct_start_time)<19 and hour(t1.acct_stop_time) in (19,20,21,22,23) then unix_timestamp(t1.acct_stop_time)-unix_timestamp(concat(to_date(t1.acct_stop_time),' 19:00:00'))
                     else 0 end time_bucket_duration_8,
                t1.avg_flow
            from %(s_temp_dwa_user_network_time_m5)s t1
            join %(s_dwd_fact_ins_prod)s t2 on t1.user_name=t2.login_name and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'
         '''% vars()
    QueryExe(hsql,name,dates) 

#生成  临时表2
    hsql='''insert overwrite table %(s_temp_dwa_user_network_time_m2)s
            select
                t1.prod_inst_id,
                t1.week_type,
                t1.time_bucket,
                0 net_num,
                t1.net_flow 
            from (select 
                      t.prod_inst_id,t.week_type,'凌晨' time_bucket,round(sum(t.time_bucket_duration_1*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_1>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'午夜' time_bucket,round(sum(t.time_bucket_duration_2*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_2>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'早晨' time_bucket,round(sum(t.time_bucket_duration_3*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_3>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'上午' time_bucket,round(sum(t.time_bucket_duration_4*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_4>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'中午' time_bucket,round(sum(t.time_bucket_duration_5*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_5>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'下午' time_bucket,round(sum(t.time_bucket_duration_6*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_6>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'傍晚' time_bucket,round(sum(t.time_bucket_duration_7*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_7>0
                  group by t.prod_inst_id,t.week_type
                  union all
                  select 
                      t.prod_inst_id,t.week_type,'晚上' time_bucket,round(sum(t.time_bucket_duration_8*t.avg_flow),2) net_flow
                  from %(s_temp_dwa_user_network_time_m6)s t
                  where t.time_bucket_duration_8>0
                  group by t.prod_inst_id,t.week_type
                  ) t1
         '''% vars()
    QueryExe(hsql,name,dates)     
    
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成    当周期的记录
    hsql='''insert overwrite table %(t_dwa_user_network_time_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
                t1.prod_inst_id,
                t1.week_type,
                t1.time_bucket,
                t1.net_num,
                t2.net_flow,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_dwa_user_network_time_m1)s t1
            join %(s_temp_dwa_user_network_time_m2)s t2 on t1.prod_inst_id=t2.prod_inst_id and t1.week_type=t2.week_type and t1.time_bucket=t2.time_bucket
          '''% vars()    
    QueryExe(hsql,name,dates)

##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table %(s_temp_dwa_user_network_time_m1)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_time_m2)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_time_m3)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_time_m4)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_time_m5)s''' %vars()
    QueryExe(hsql,name,dates)
    hsql='''drop table %(s_temp_dwa_user_network_time_m6)s''' %vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
