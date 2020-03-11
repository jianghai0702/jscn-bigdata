##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST不同次数点播统计
# Pay:ST_DIFF_NUM_DR_SUMMARY.py
# Purpose:
#
# Author:      zhangzc
#
# Created:     26-07-2017
# Copyright:   (c) zhangzc 2016
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
#?时间参数引入
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
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwd_dr_ismp              =    "dwd_dr_ismp"
    s_dim_std_organize            =    "dim_std_organize"
    tmp_st_diff_num_dr_summary1       =    "tmp_st_diff_num_dr_summary1"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_diff_num_dr_summary             =    "st_diff_num_dr_summary"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
    hsql='''create table if not exists %(tmp_st_diff_num_dr_summary1)s
            (
             own_corp_std_org_code   string,
             user_id                 string,
             dr_count                int,
             lb_count                int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(tmp_st_diff_num_dr_summary1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##数据处理                                                       
##===========================================================================

    hsql='''insert overwrite table %(tmp_st_diff_num_dr_summary1)s
select OWN_CORP_STD_ORG_CODE
,user_id
,sum(case when a.DATA_SOURCE_CD <> 'VOD' then 1 else 0 end) dr_count
,sum(case when a.DATA_SOURCE_CD = 'VOD' then 1 else 0 end) lb_count
from %(s_dwd_dr_ismp)s a
where pt_mon= %(ARG_OPTIME_LAST1_M)s
group by OWN_CORP_STD_ORG_CODE
,user_id
    '''% vars()    
    QueryExe(hsql,name,dates)

#生成 当月数据  分公司级
    hsql='''insert overwrite table %(t_st_diff_num_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)       
select a.OWN_CORP_STD_ORG_CODE
      ,b.STD_ORG_NAME
      ,a.DR_COUNT_TYPE
      ,sum(a.DR_USER_COUNT)
      ,sum(a.LB_USER_COUNT)
      ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
from (
--点播用户数
select OWN_CORP_STD_ORG_CODE
      ,(case when dr_count >0 and dr_count<=3 then '1-3次'
            when dr_count >3 and dr_count<=5 then '3-5次'
            when dr_count >5 and dr_count<=10 then '5-10次'
            when dr_count >10  then '大于10次'
         else 'null' end) as DR_COUNT_TYPE
      ,count(1) as DR_USER_COUNT--点播用户数 
      ,0 as LB_USER_COUNT--回看用户数 
from %(tmp_st_diff_num_dr_summary1)s t
where dr_count > 0
group by OWN_CORP_STD_ORG_CODE
      ,(case when dr_count >0 and dr_count<=3 then '1-3次'
            when dr_count >3 and dr_count<=5 then '3-5次'
            when dr_count >5 and dr_count<=10 then '5-10次'
            when dr_count >10  then '大于10次'
         else 'null' end)
union all 
--回看用户数
select OWN_CORP_STD_ORG_CODE
      ,(case when lb_count >0 and lb_count<=3 then '1-3次'
            when lb_count >3 and lb_count<=5 then '3-5次'
            when lb_count >5 and lb_count<=10 then '5-10次'
            when lb_count >10  then '大于10次'
         else 'null' end) as DR_COUNT_TYPE
      ,0 as DR_USER_COUNT--点播用户数
      ,count(1) as LB_USER_COUNT--回看用户数 
from %(tmp_st_diff_num_dr_summary1)s t
where lb_count > 0
group by OWN_CORP_STD_ORG_CODE
      ,(case when lb_count >0 and lb_count<=3 then '1-3次'
            when lb_count >3 and lb_count<=5 then '3-5次'
            when lb_count >5 and lb_count<=10 then '5-10次'
            when lb_count >10  then '大于10次'
         else 'null' end)
) a
inner join %(s_dim_std_organize)s b
on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
group by a.OWN_CORP_STD_ORG_CODE
      ,b.STD_ORG_NAME
      ,a.DR_COUNT_TYPE
    '''% vars()
    QueryExe(hsql,name,dates)

#生成 当月数据  地区级
    hsql='''insert into table %(t_st_diff_num_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)       
select b.P_STD_ORG_CODE
      ,c.STD_ORG_NAME
      ,a.DR_COUNT_TYPE
      ,sum(a.DR_USER_COUNT)
      ,sum(a.LB_USER_COUNT)
      ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
from %(t_st_diff_num_dr_summary)s a
inner join %(s_dim_std_organize)s b
on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
left join %(s_dim_std_organize)s c
on b.P_STD_ORG_CODE = c.STD_ORG_CODE
where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
group by b.P_STD_ORG_CODE
      ,c.STD_ORG_NAME
      ,a.DR_COUNT_TYPE
    '''% vars()
    QueryExe(hsql,name,dates)

#生成 当月数据  全省
    hsql='''insert into table %(t_st_diff_num_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)       
select '10'
      ,'江苏有线'
      ,a.DR_COUNT_TYPE
      ,sum(a.DR_USER_COUNT)
      ,sum(a.LB_USER_COUNT)
      ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
from %(t_st_diff_num_dr_summary)s a
where length(OWN_CORP_STD_ORG_CODE) = 6
and a.pt_mon = %(ARG_OPTIME_LAST1_M)s
group by a.DR_COUNT_TYPE
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