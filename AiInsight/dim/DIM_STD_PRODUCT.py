##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM标准产品表（手工）
# Pay: DIM_STD_PRODUCT.py
# Purpose:
#
# Author:      yanal
#
# Created:     2016-9-11
# Copyright:   (c) yanal 2016
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
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期的前一天所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_product                     =    "stg_product"
    s_dim_std_organize                     =    "dim_std_organize"
    s_stg_rpt_inst_prod                =   "stg_rpt_inst_prod"
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dim_std_product                    =    "dim_std_product"
##===========================================================================       
##数据处理                                                       
##===========================================================================   
## 得到表中现有最大的ID
    hsql='''select 
                coalesce(max(product_id),1000000)
            from %(t_dim_std_product)s 
    '''% vars() 
    k=GetResult(hsql,name,dates)
    i=k[0][0]


#生成目标表数据,插入同一个url只有一条的这种数据
    hsql='''insert  into table %(t_dim_std_product)s            
            select
                (%(i)s + rn) PRODUCT_ID           ,
                t1.PRODUCT_NAME         ,
                t1.OFFER_NAME           ,
                t1.BANDWIDTH            ,
                t1.CYCLE                ,
                t1.PRICE                ,
                t1.FLAG                 ,
                t2.std_org_code OWN_CORP_STD_ORG_CODE ,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') UPDATE_DATE
            from 
            ( 
            select 
                PRODUCT_NAME         ,
                OFFER_NAME           ,
                BANDWIDTH            ,
                CYCLE                ,
                PRICE                ,
                FLAG                 ,
                CORP_CODE,
                row_number() over (partition by 1 order by product_name,corp_code) rn                         
            from %(s_stg_product)s 
            where pt_mon=%(ARG_OPTIME_LAST1_M)s  
              and product_name <> '产品名称' and product_name <> '其他' and product_name <> 'NULL'
            ) t1
            left join %(s_dim_std_organize)s t2 on t1.corp_code = t2.notes
            left join %(t_dim_std_product)s t3 on t1.PRODUCT_NAME = t3.PRODUCT_NAME and t2.std_org_code = t3.OWN_CORP_STD_ORG_CODE
            where t3.PRODUCT_ID is null
            '''% vars()
    QueryExe(hsql,name,dates)

## 得到表中现有最大的ID
    hsql='''select 
                coalesce(max(product_id),1000000)
            from %(t_dim_std_product)s 
    '''% vars() 
    m=GetResult(hsql,name,dates)
    n=m[0][0]

# 更新当月的产品，并加入目标表
    hsql='''insert  into table %(t_dim_std_product)s            
            select
                (%(n)s + a1.rn) PRODUCT_ID           ,
                a1.PRODUCT_NAME         ,
                concat(a1.bandwidth,'/',a1.cycle,'月/',a1.price,'元')  OFFER_NAME,
                a1.BANDWIDTH            ,
                a1.CYCLE                ,
                a1.PRICE                ,
                '' FLAG                 ,
                a2.std_org_code OWN_CORP_STD_ORG_CODE ,
                from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') UPDATE_DATE
            from (select distinct 
                         t1.srvpkg_name product_name,
                         t1.corp_code,
                         REGEXP_EXTRACT(t1.srvpkg_name,'([0-9]+M)') bandwidth,
                         CASE REGEXP_EXTRACT(T1.SRVPKG_NAME,'/[0-9个]*([月年])')
                               WHEN '月' THEN (CASE WHEN REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个月]')='' THEN 1 ELSE REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个月]') END)
                              WHEN '年' THEN (CASE WHEN REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个年]')='' THEN 12 ELSE cast(REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个年]')*12 as int) END) 
                         ELSE NULL  END  cycle,
                         case when instr(t1.srvpkg_name,'元') > 0
                              then REGEXP_EXTRACT(t1.srvpkg_name,'([0-9]+)元')
                              else 0
                         end  price,
                         row_number() over (order by t1.srvpkg_name,t1.corp_code) rn 
                  from %(s_stg_rpt_inst_prod)s t1
                  left join dim_std_product t2 on t1.srvpkg_name=t2.product_name
                  where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
                  and t1.corp_code in ('taizhou','yancheng')
                  and t2.product_name is null 
                  and coalesce(t1.srvpkg_name,'') <> '' ) a1
            left join %(s_dim_std_organize)s a2 on a1.corp_code = a2.notes
            where coalesce(a1.bandwidth,'') <> ''
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

