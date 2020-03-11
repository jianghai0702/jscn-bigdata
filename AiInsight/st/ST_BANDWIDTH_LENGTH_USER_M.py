##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST不同带宽不同上网时长的用户数统计(月)
# Pay: ST_BANDWIDTH_LENGTH_USER_M.py
# Purpose:
#
# Author:      liuyf7
#
# Created:     2016-8-27
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
    ARG_OPTIME_LAST_Y         = dicts['ARG_OPTIME_LAST_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            # 获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_user_online_length_d                  =    "dwa_user_online_length_d"
    s_dwa_fact_ins_prod_mon                     =    "dwa_fact_ins_prod_mon"
    s_dim_std_online_length                     =    "dim_std_online_length"
    s_dim_std_product                           =    "dim_std_product"
    s_dim_std_organize                          =    "dim_std_organize"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_bandwidth_length_user_m     =    "st_bandwidth_length_user_m"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

##===========================================================================       
##数据处理                                                       
##===========================================================================

#生成目标表数据
    # hsql='''insert overwrite table %(t_st_bandwidth_length_user_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
    #         select
    #           %(ARG_OPTIME_LAST1_M)s cycle_id,
    #           t2.bandwidth std_bandwidth_code,
    #           t2.bandwidth std_bandwidth_name,
    #           t2.std_online_length_code,
    #           t2.std_online_length_name,
    #           t2.user_count,
    #           if(t1.total_user_count=0,0,round(t2.user_count/t1.total_user_count*100,2)),
    #           from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date,
    #           t1.own_corp_std_org_code,
    #           t4.std_org_name
    #         from (--总付费用户数
    #               select own_corp_std_org_code,count(distinct prod_inst_id) total_user_count
    #                 from %(s_dwa_fact_ins_prod_mon)s
    #                where is_valid = 1
    #                  and is_lan = 1
    #                  and (is_paid = 1 or IS_SUSPEND=1) --缴费和暂停用户即为付费用户
    #                  and pt_mon = %(ARG_OPTIME_LAST1_M)s
    #                group by own_corp_std_org_code
    #               ) t1
    #         inner join (--按上网时长和带宽分组，统计用户数
    #              select a.bandwidth,
    #                     a.own_corp_std_org_code,
    #                     b.std_online_length_code,
    #                     b.std_online_length_name,
    #                     count(distinct a.prod_inst_id) user_count
    #                from (--计算各用户平均每天上网时长，上网时长/实际上网天数
    #                      select tt1.own_corp_std_org_code
    #                             ,tt1.prod_inst_id
    #                             ,tt2.bandwidth
    #                             ,sum(case when tt.total_minutes>1440 then 1440 else tt.total_minutes end)/60/count(distinct tt.pt_time) duration
    #                        from %(s_dwa_user_online_length_d)s tt
    #                       inner join %(s_dwa_fact_ins_prod_mon)s tt1 on tt.login_name = tt1.login_name  --
    #                        left join %(s_dim_std_product)s tt2 on tt1.srvpkg_name = tt2.product_name
    #                       where substr(tt.pt_time,1,6) = %(ARG_OPTIME_LAST1_M)s
    #                         and tt1.pt_mon = %(ARG_OPTIME_LAST1_M)s
    #                         and tt1.is_valid = 1
    #                       group by tt1.own_corp_std_org_code
    #                                ,tt1.prod_inst_id
    #                                ,tt2.bandwidth
    #                     ) a
    #                     ,%(s_dim_std_online_length)s b
    #                  where a.duration <= b.max_value
    #                    and a.duration > b.min_value
    #               group by a.bandwidth,a.own_corp_std_org_code,b.std_online_length_code,b.std_online_length_name
    #              ) t2 on t1.own_corp_std_org_code = t2.own_corp_std_org_code
    #         left join %(s_dim_std_organize)s t4 on t1.own_corp_std_org_code=t4.std_org_code
    #         '''% vars()
    # QueryExe(hsql,name,dates)


##===========================================================================       
##删除临时表                                               
##===========================================================================

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
