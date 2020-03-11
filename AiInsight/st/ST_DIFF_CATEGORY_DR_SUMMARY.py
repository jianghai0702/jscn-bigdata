##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:ST不同栏目点播统计
# Pay:ST_DIFF_CATEGORY_DR_SUMMARY.py
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
    s_dwd_dr_ismp_yyyymm               =    "dwd_dr_ismp"
    s_dwd_dim_std_organize               =    "dwd_dim_std_organize"
    s_dwd_vod_movie_master               =    "dwd_vod_movie_master"
    s_dwd_vod_category_master               =   "dwd_vod_category_master"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_diff_category_dr_summary              =    "st_diff_category_dr_summary"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 当天数据
    hsql='''insert overwrite table %(t_st_diff_category_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)
           select a.OWN_CORP_STD_ORG_CODE
            ,b.STD_ORG_NAME
            ,c.categoryid    --栏目id
            ,d.CATEGORYNAME  --栏目名称
            ,count(distinct case when a.DATA_SOURCE_CD like '%%DR_ISMP%%' then user_id else null end)
            ,sum(case when a.DATA_SOURCE_CD like '%%DR_ISMP%%' then 1 else 0 end)
            ,count(distinct case when a.DATA_SOURCE_CD = 'VOD' then user_id else null end)
            ,sum(case when a.DATA_SOURCE_CD = 'VOD' then 1 else 0 end)
            ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date--ETL处理时间
     from %(s_dwd_dr_ismp_yyyymm)s a
     left join %(s_dwd_dim_std_organize)s b
       on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
      and b.pt_mon = %(ARG_OPTIME_LAST1_M)s
     left join %(s_dwd_vod_movie_master)s c
       on a.CONTENT_ID = c.MOVASSETID
      and c.pt_mon = %(ARG_OPTIME_LAST1_M)s
     left join %(s_dwd_vod_category_master)s d
       on c.categoryid = d.categoryid
      and d.pt_mon = %(ARG_OPTIME_LAST1_M)s
     where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
     group by a.OWN_CORP_STD_ORG_CODE
            ,b.STD_ORG_NAME
            ,c.categoryid
            ,d.CATEGORYNAME    
            '''% vars()
    QueryExe(hsql,name,dates)


#生成 当月数据  地区级
    hsql='''insert into table %(t_st_diff_category_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)       
select b.P_STD_ORG_CODE
      ,c.STD_ORG_NAME
      ,a.CATEGORY_ID
      ,a.CATEGORY_NAME
      ,sum(a.DR_USER_COUNT)
      ,sum(a.DR_COUNT)
      ,sum(a.LB_USER_COUNT)
      ,sum(a.LB_COUNT)
      ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
from %(t_st_diff_category_dr_summary)s a
inner join %(s_dwd_dim_std_organize)s b
on a.OWN_CORP_STD_ORG_CODE = b.STD_ORG_CODE
and b.pt_mon= %(ARG_OPTIME_LAST1_M)s
left join %(s_dwd_dim_std_organize)s c
on b.P_STD_ORG_CODE = c.STD_ORG_CODE
and c.pt_mon= %(ARG_OPTIME_LAST1_M)s
where a.pt_mon = %(ARG_OPTIME_LAST1_M)s
group by b.P_STD_ORG_CODE
      ,c.STD_ORG_NAME
      ,a.CATEGORY_ID
      ,a.CATEGORY_NAME
    '''% vars()
    QueryExe(hsql,name,dates)

#生成 当月数据  全省
    hsql='''insert into table %(t_st_diff_category_dr_summary)s PARTITION(pt_mon = %(ARG_OPTIME_LAST1_M)s)       
select '10'
      ,'江苏有线'
      ,a.CATEGORY_ID
      ,a.CATEGORY_NAME
      ,sum(a.DR_USER_COUNT)
      ,sum(a.DR_COUNT)
      ,sum(a.LB_USER_COUNT)
      ,sum(a.LB_COUNT)
      ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
from %(t_st_diff_category_dr_summary)s a
where length(OWN_CORP_STD_ORG_CODE) = 6
and a.pt_mon = %(ARG_OPTIME_LAST1_M)s
group by a.CATEGORY_ID
      ,a.CATEGORY_NAME
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
ppend(PRJ_HOME + os.sep + tdir)
