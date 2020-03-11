##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST用户发展按套餐统计(月)
# Pay: ST_DIFF_OFFER_USER_DEV_M.py
# Purpose:
#
# Author:      chens
#
# Created:     2017-2-25
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
    ARG_TODAY                     = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO                 = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                    = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO                = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR               = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH              = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01            = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy-mm格式的数据日期
    ARG_OPTIME_MONTH12            = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy-mm格式的数据日期
    ARG_OPTIME_HOUR               = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD           = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY                = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON            = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY            = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO        = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON            = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO        = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2MON           = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO       = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3MON           = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO       = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTYEAR           = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO       = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR01             = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO         = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR12             = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO         = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MON01              = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO          = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON01          = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO      = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MONEND             = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO         = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND         = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO     = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST_Y             = dicts['ARG_OPTIME_LAST_Y']            #获得传入的数据日期的前一天所在年份yyyy格式的数据日期
    ARG_OPTIME_LAST_M             = dicts['ARG_OPTIME_LAST_M']            # 获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M            = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2MONTH         = dicts['ARG_OPTIME_LAST2MONTH']        #获得传入的数据日期的上2月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON       = dicts['ARG_OPTIME_LASTYEAR1MON']      #获得传入的数据日期的去年前一个月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON01_ISO = dicts['ARG_OPTIME_LASTYEAR1MON01_ISO'] #获得传入的数据日期的去年前一个月第一天yyyy-mm-dd格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_fact_rpt_ins_prod_mon               =    "dwa_fact_rpt_ins_prod_mon"
    s_st_diff_corp_user_dev_m                 =    "st_diff_corp_user_dev_m"
    s_dim_std_organize                        =    "dim_std_organize"
    s_dim_std_product                         =    "dim_std_product"
    s_temp_st_diff_offer_user_dev_m1          =    "temp_st_diff_offer_user_dev_m1"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_st_diff_offer_user_dev_m                =    "st_diff_offer_user_dev_m"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================
#用来存放中间结果数据，当月数据
    hsql='''create table if not exists %(s_temp_st_diff_offer_user_dev_m1)s
            (
              own_corp_std_org_code   string,
              own_corp_std_org_name   string,
              std_offer_code          string,
              std_offer_name          string,
              user_count              int,
              new_user_count          int,
              lose_user_count         int,
              repay_user_count        int
            )
            stored as rcfile
            LOCATION '%(tmp_path)s/%(s_temp_st_diff_offer_user_dev_m1)s'
            '''% vars()    
    QueryExe(hsql,name,dates)


##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成基础数据
    hsql='''insert overwrite table %(s_temp_st_diff_offer_user_dev_m1)s
            select
              t1.own_corp_std_org_code,
              t2.std_org_name own_corp_std_org_name,
              '' std_offer_code,
              t3.offer_name std_offer_name,
              sum(case when t1.is_valid=1 then 1 else 0 end) user_count,
              sum(case when t1.is_new=1 then 1 else 0 end) new_user_count,
              sum(case when t1.is_this_loss=1 then 1 else 0 end) lose_user_count,
              sum(case when t1.is_this_repay=1 then 1 else 0 end) repay_user_count
            from %(s_dwa_fact_rpt_ins_prod_mon)s t1
            left join %(s_dim_std_organize)s t2 on t1.own_corp_std_org_code=t2.std_org_code
            left outer join %(s_dim_std_product)s t3 on t1.srvpkg_name=t3.product_name and t1.own_corp_std_org_code=t3.own_corp_std_org_code
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
            group by t1.own_corp_std_org_code,t2.std_org_name,t3.offer_name
            '''% vars()
    QueryExe(hsql,name,dates)

#生成目标表数据
    hsql='''insert overwrite table %(t_st_diff_offer_user_dev_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              %(ARG_OPTIME_LAST1_M)s cycle_id,
              t1.own_corp_std_org_code,
              t1.own_corp_std_org_name,
              t1.std_offer_code,
              t1.std_offer_name,
              t1.user_count,
              case when coalesce(t2.user_count,0)=0 then 0 else round(t1.user_count/t2.user_count*100,2) end user_rate,
              t1.new_user_count,
              case when coalesce(t2.new_user_count,0)=0 then 0 else round(t1.new_user_count/t2.new_user_count*100,2) end new_user_rate,
              t1.lose_user_count,
              case when coalesce(t2.lose_user_count,0)=0 then 0 else round(t1.lose_user_count/t2.lose_user_count*100,2) end lose_user_rate,
              t1.repay_user_count,
              case when coalesce(t2.repay_user_count,0)=0 then 0 else round(t1.repay_user_count/t2.repay_user_count*100,2) end repay_user_rate,
              from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_temp_st_diff_offer_user_dev_m1)s t1
            left join %(s_st_diff_corp_user_dev_m)s t2 on t1.own_corp_std_org_code=t2.own_corp_std_org_code
                                                          and t1.own_corp_std_org_name=t2.own_corp_std_org_name
                                                          and t2.pt_mon=%(ARG_OPTIME_LAST1_M)s
            where t1.own_corp_std_org_code is not null
                  and trim(t1.own_corp_std_org_code)<>'' 
                  and lower(t1.own_corp_std_org_code)<>'null'
                  and t1.std_offer_name is not null
                  and trim(t1.std_offer_name)<>'' 
                  and lower(t1.std_offer_name)<>'null'
            '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##删除临时表                                               
##===========================================================================
#    hsql='''drop table %(s_temp_st_diff_offer_user_dev_m1)s''' %vars()
#    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
