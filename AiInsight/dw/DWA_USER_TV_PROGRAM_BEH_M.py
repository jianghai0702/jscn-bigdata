##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户直播内容偏好标签月表
# Pay:DWA_USER_TV_PROGRAM_BEH_M.py
# Purpose:
#
# Author:      wangxx
#
# Created:     2017-10-30
# Copyright:   (c) wangxx 2017
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']         
    #获得传入的数据日期的前一天所在月份3个月前的yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的前一天所在月份4个月前yyyy-mm格式的数据日期
    ARG_OPTIME_LAST4_M        = dicts['ARG_OPTIME_LAST4_M']          #获得传入的数据日期的前一天所在月份6个月前yyyy-mm格式的数据日期
    ARG_OPTIME_LAST6_M        = dicts['ARG_OPTIME_LAST6_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dwa_user_tv_program_m                =    "dwa_user_tv_program_m"
    s_dim_tv_program_label                 =    "dim_tv_program_label"
    s_dwd_fact_ins_prod                    =    "dwd_fact_ins_prod"
    s_dwa_cust_feat_dtl_m                  =    "dwa_cust_feat_dtl_m"

    s_tmp_user_tv_program_beh_m1          =    "tmp_user_tv_program_beh_m1"
    s_tmp_user_tv_program_beh_m2          =    "tmp_user_tv_program_beh_m2"
    s_tmp_user_tv_program_beh_m3          =    "tmp_user_tv_program_beh_m3"
    s_tmp_user_tv_program_beh_m4          =    "tmp_user_tv_program_beh_m4"
    s_tmp_user_tv_program_beh_m5          =    "tmp_user_tv_program_beh_m5"
    s_tmp_user_tv_program_beh_m6          =    "tmp_user_tv_program_beh_m6"    
    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_tv_program_beh_m            =    "DWA_USER_TV_PROGRAM_BEH_M"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

#用来存放 近三月直播节目大类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m1)s
            (      
                   PROD_INST_ID STRING,
                   TYPE	    STRING,
                   TV_TIME      INT,		
                   TV_NUM	    INT,
                   TIME_RN	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月直播节目小类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m2)s
            (      
                   PROD_INST_ID STRING,
                   CATEGORY	    STRING,
                   TV_TIME          INT,		
                   TV_NUM	    INT,
                   TIME_RN	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月直播节目出品地的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m3)s
            (      
                   PROD_INST_ID     STRING,
                   PRODUCED	    STRING,
                   TV_TIME          INT,		
                   TV_NUM	    INT,
                   TIME_RN	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m3)s'
    '''% vars()
    QueryExe(hsql,name,dates)
#用来存放 近三月直播节目大类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m4)s
            (      
                   PROD_INST_ID     STRING,
                   tv_type_n1  string,
                   tv_type_n2  string,
                   tv_type_n3  string,
                   tv_type_n_rate1 string,
                   tv_type_n_rate2 string,
                   tv_type_n_rate3 string,
                   tv_type_t1  string,
                   tv_type_t2  string,
                   tv_type_t3  string,
                   tv_type_t_rate1 string,
                   tv_type_t_rate2 string,
                   tv_type_t_rate3 string,
                   max_tv_type_num  int,
                   avg_tv_type_num  int,
                   max_tv_type_time int,
                   avg_tv_type_time int,
                   total_tv_type    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m4)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月直播节目小类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m5)s
            (      
                   PROD_INST_ID     STRING,
                   tv_category_n1  string,
                   tv_category_n2  string,
                   tv_category_n3  string,
                   tv_category_n_rate1 string,
                   tv_category_n_rate2 string,
                   tv_category_n_rate3 string,
                   tv_category_t1  string,
                   tv_category_t2  string,
                   tv_category_t3  string,
                   tv_category_t_rate1 string,
                   tv_category_t_rate2 string,
                   tv_category_t_rate3 string,
                   max_tv_category_num  int,
                   avg_tv_category_num  int,
                   max_tv_category_time int,
                   avg_tv_category_time int,
                   total_tv_category    int

            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m5)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月直播节目出品地标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_tv_program_beh_m6)s
            (      
                   PROD_INST_ID     STRING,
                   tv_produced_n1  string,
                   tv_produced_n2  string,
                   tv_produced_n3  string,
                   tv_produced_n_rate1 string,
                   tv_produced_n_rate2 string,
                   tv_produced_n_rate3 string,
                   tv_produced_t1  string,
                   tv_produced_t2  string,
                   tv_produced_t3  string,
                   tv_produced_t_rate1 string,
                   tv_produced_t_rate2 string,
                   tv_produced_t_rate3 string,
                   max_tv_produced_num  int,
                   avg_tv_produced_num  int,
                   max_tv_produced_time int,
                   avg_tv_produced_time int,
                   total_tv_produced    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_tv_program_beh_m6)s'
    '''% vars()
    QueryExe(hsql,name,dates)



##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 近三月直播节目大类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_tv_program_beh_m1)s
            SELECT PROD_INST_ID
                  ,type
                  ,tv_time
                  ,tv_num
                  ,row_number() over (distribute by prod_inst_id sort by cast(tv_time as int) desc) time_rn
                  ,row_number() over (distribute by prod_inst_id sort by cast(tv_num  as int) desc) num_rn
            FROM
            ( SELECT  t1.prod_inst_id
                    ,t2.type
                    ,SUM(t1.TV_TIME) tv_time
                    ,sum(t1.tv_num) tv_num                 
            FROM %(s_dwa_user_tv_program_m)s t1
            INNER JOIN %(s_dim_tv_program_label)s t2
            ON t1.PROGRAM_NAME = t2.program_name 
            WHERE T1.PT_MON between '%(ARG_OPTIME_LAST3_M)s' 
            AND '%(ARG_OPTIME_LAST1_M)s' 
            GROUP BY t1.prod_inst_id,t2.type ) t
    '''% vars()
    QueryExe(hsql,name,dates)
    

#生成 近三月直播节目小类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_tv_program_beh_m2)s
            SELECT T.PROD_INST_ID
                  ,t.category
                  ,tv_time
                  ,tv_num
                  ,row_number() over (distribute by t.prod_inst_id sort by cast(t.tv_time as int) desc) time_rn
                  ,row_number() over (distribute by t.prod_inst_id sort by cast(t.tv_num as int) desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.category1 as category
                    ,SUM(t1.TV_TIME) tv_time
                    ,sum(t1.TV_NUM) tv_num                 
            FROM %(s_dwa_user_tv_program_m)s t1
            INNER JOIN (select program_name,category1 from %(s_dim_tv_program_label)s lateral view explode(category) mt as category1) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE T1.PT_MON between '%(ARG_OPTIME_LAST3_M)s' 
            AND '%(ARG_OPTIME_LAST1_M)s' 
            GROUP BY prod_inst_id,t2.category1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月直播节目出品地的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_tv_program_beh_m3)s
            SELECT T.PROD_INST_ID
                  ,t.produced
                  ,tv_time
                  ,tv_num
                  ,row_number() over (distribute by t.prod_inst_id sort by cast(t.tv_time as int) desc) time_rn
                  ,row_number() over (distribute by t.prod_inst_id sort by cast(t.tv_num  as int) desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.produced1 as produced
                    ,SUM(t1.TV_TIME) tv_time
                    ,sum(t1.tv_num) tv_num                 
            FROM %(s_dwa_user_tv_program_m)s t1
            INNER JOIN (select program_name,produced1 from %(s_dim_tv_program_label)s lateral view explode(produced) mt as produced1 where produced is not null) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE T1.PT_MON between %(ARG_OPTIME_LAST3_M)s 
            AND %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.produced1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月直播节目大类标签

    hsql='''insert overwrite table %(s_tmp_user_tv_program_beh_m4)s
            select t1.prod_inst_id,
                   t2.type tv_type_n1,
                   t3.type tv_type_n2,
                   t4.type tv_type_n3,
                   round(t2.tv_num/t1.total_tv_num*100,2) tv_type_n_rate1,
                   round(t3.tv_num/t1.total_tv_num*100,2) tv_type_n_rate2,
                   round(t4.tv_num/t1.total_tv_num*100,2) tv_type_n_rate3,
                   t5.type tv_type_t1,
                   t6.type tv_type_t2,
                   t7.type tv_type_t3,
                   round(t5.tv_time/t1.total_tv_time*100,2) tv_type_t_rate1,
                   round(t6.tv_time/t1.total_tv_time*100,2) tv_type_t_rate2,
                   round(t7.tv_time/t1.total_tv_time*100,2) tv_type_t_rate3,
                   t2.tv_num max_tv_type_num,
                   round(t1.total_tv_num/t1.total_tv_type,2) avg_tv_type_num,
                   t5.tv_time max_tv_type_time,
                   round(t1.total_tv_time/t1.total_tv_type,2) avg_tv_type_time,
                   t1.total_tv_type
            from ( 
                 select prod_inst_id
                        ,SUM(tv_time) total_tv_time
                        ,sum(tv_num)  total_tv_num
                        ,count(distinct type)  total_tv_type
                 from %(s_tmp_user_tv_program_beh_m1)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_tv_program_beh_m1)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_tv_program_beh_m1)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_tv_program_beh_m1)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3
            left join %(s_tmp_user_tv_program_beh_m1)s t5
            on t1.prod_inst_id=t5.prod_inst_id and t5.time_rn=1
            left join %(s_tmp_user_tv_program_beh_m1)s t6
            on t1.prod_inst_id=t6.prod_inst_id and t6.time_rn=2
            left join %(s_tmp_user_tv_program_beh_m1)s t7
            on t1.prod_inst_id=t7.prod_inst_id and t7.time_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)



#生成 近三月直播节目小类标签

    hsql='''insert overwrite table %(s_tmp_user_tv_program_beh_m5)s
            select t1.prod_inst_id,
                   t2.category tv_category_n1,
                   t3.category tv_category_n2,
                   t4.category tv_category_n3,
                   round(t2.tv_num/t1.total_tv_num*100,2) tv_category_n_rate1,
                   round(t3.tv_num/t1.total_tv_num*100,2) tv_category_n_rate2,
                   round(t4.tv_num/t1.total_tv_num*100,2) tv_category_n_rate3,
                   t5.category tv_category_t1,
                   t6.category tv_category_t2,
                   t7.category tv_category_t3,
                   round(t5.tv_time/t1.total_tv_time*100,2) tv_category_t_rate1,
                   round(t6.tv_time/t1.total_tv_time*100,2) tv_category_t_rate2,
                   round(t7.tv_time/t1.total_tv_time*100,2) tv_category_t_rate3,
                   t2.tv_num max_tv_category_num,
                   round(t1.total_tv_num/t1.total_tv_category,2) avg_tv_category_num,
                   t5.tv_time max_tv_category_time,
                   round(t1.total_tv_time/t1.total_tv_category,2) avg_tv_category_time,
                   t1.total_tv_category
            from ( 
                 select prod_inst_id
                        ,SUM(tv_time) total_tv_time
                        ,sum(tv_num)  total_tv_num
                        ,count(distinct category)  total_tv_category
                 from %(s_tmp_user_tv_program_beh_m2)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_tv_program_beh_m2)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_tv_program_beh_m2)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_tv_program_beh_m2)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3
            left join %(s_tmp_user_tv_program_beh_m2)s t5
            on t1.prod_inst_id=t5.prod_inst_id and t5.time_rn=1
            left join %(s_tmp_user_tv_program_beh_m2)s t6
            on t1.prod_inst_id=t6.prod_inst_id and t6.time_rn=2
            left join %(s_tmp_user_tv_program_beh_m2)s t7
            on t1.prod_inst_id=t7.prod_inst_id and t7.time_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)


#生成 近三月直播节目出品地标签

    hsql='''insert overwrite table %(s_tmp_user_tv_program_beh_m6)s
            select t1.prod_inst_id,
                   t2.produced tv_produced_n1,
                   t3.produced tv_produced_n2,
                   t4.produced tv_produced_n3,
                   round(t2.tv_num/t1.total_tv_num*100,2) tv_produced_n_rate1,
                   round(t3.tv_num/t1.total_tv_num*100,2) tv_produced_n_rate2,
                   round(t4.tv_num/t1.total_tv_num*100,2) tv_produced_n_rate3,
                   t5.produced tv_produced_t1,
                   t6.produced tv_produced_t2,
                   t7.produced tv_produced_t3,
                   round(t5.tv_time/t1.total_tv_time*100,2) tv_produced_t_rate1,
                   round(t6.tv_time/t1.total_tv_time*100,2) tv_produced_t_rate2,
                   round(t7.tv_time/t1.total_tv_time*100,2) tv_produced_t_rate3,
                   t2.tv_num max_tv_produced_num,
                   round(t1.total_tv_num/t1.total_tv_produced,2) avg_tv_produced_num,
                   t5.tv_time max_tv_produced_time,
                   round(t1.total_tv_time/t1.total_tv_produced,2) avg_tv_produced_time,
                   t1.total_tv_produced
            from ( 
                 select prod_inst_id
                        ,SUM(tv_time) total_tv_time
                        ,sum(tv_num)  total_tv_num
                        ,count(distinct produced)  total_tv_produced
                 from %(s_tmp_user_tv_program_beh_m3)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_tv_program_beh_m3)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_tv_program_beh_m3)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_tv_program_beh_m3)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3
            left join %(s_tmp_user_tv_program_beh_m3)s t5
            on t1.prod_inst_id=t5.prod_inst_id and t5.time_rn=1
            left join %(s_tmp_user_tv_program_beh_m3)s t6
            on t1.prod_inst_id=t6.prod_inst_id and t6.time_rn=2
            left join %(s_tmp_user_tv_program_beh_m3)s t7
            on t1.prod_inst_id=t7.prod_inst_id and t7.time_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)

    
#生成目标数据
    hsql='''insert overwrite table %(t_dwa_user_tv_program_beh_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s) 
            select t1.prod_inst_id,
                   t4.cust_id,
                   t1.tv_type_n1,
                   t1.tv_type_n2,
                   t1.tv_type_n3,
                   t1.tv_type_n_rate1,
                   t1.tv_type_n_rate2,
                   t1.tv_type_n_rate3,
                   t2.tv_category_n1,
                   t2.tv_category_n2,
                   t2.tv_category_n3,
                   t2.tv_category_n_rate1,
                   t2.tv_category_n_rate2,
                   t2.tv_category_n_rate3,
                   t3.tv_produced_n1,
                   t3.tv_produced_n2,
                   t3.tv_produced_n3,
                   t3.tv_produced_n_rate1,
                   t3.tv_produced_n_rate2,
                   t3.tv_produced_n_rate3,
                   t1.tv_type_t1,
                   t1.tv_type_t2,
                   t1.tv_type_t3,
                   t1.tv_type_t_rate1,
                   t1.tv_type_t_rate2,
                   t1.tv_type_t_rate3,
                   t2.tv_category_t1,
                   t2.tv_category_t2,
                   t2.tv_category_t3,
                   t2.tv_category_t_rate1,
                   t2.tv_category_t_rate2,
                   t2.tv_category_t_rate3,
                   t3.tv_produced_t1,
                   t3.tv_produced_t2,
                   t3.tv_produced_t3,
                   t3.tv_produced_t_rate1,
                   t3.tv_produced_t_rate2,
                   t3.tv_produced_t_rate3,
                   t1.max_tv_type_num,
                   t1.avg_tv_type_num,
                   t2.max_tv_category_num,
                   t2.avg_tv_category_num,
                   t3.max_tv_produced_num,
                   t3.avg_tv_produced_num,
                   t1.max_tv_type_time,
                   t1.avg_tv_type_time,
                   t2.max_tv_category_time,
                   t2.avg_tv_category_time,
                   t3.max_tv_produced_time,
                   t3.avg_tv_produced_time,
                   t1.total_tv_type,
                   t2.total_tv_category,
                   t3.total_tv_produced,
                   from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date       
            from %(s_tmp_user_tv_program_beh_m4)s t1
            left join %(s_tmp_user_tv_program_beh_m5)s t2
            on t1.prod_inst_id = t2.prod_inst_id
            left join %(s_tmp_user_tv_program_beh_m6)s t3
            on t1.prod_inst_id = t3.prod_inst_id
            left join %(s_dwd_fact_ins_prod)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.pt_mon=%(ARG_OPTIME_LAST1_M)s          
            inner join %(s_dwa_cust_feat_dtl_m)s t5
            on t4.cust_id = t5.cust_id
            and t5.pt_mon = %(ARG_OPTIME_LAST1_M)s          

    '''% vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m1)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m2)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m3)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m4)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m5)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    hsql='''drop table if exists %(s_tmp_user_tv_program_beh_m6)s
            '''% vars()    
    QueryExe(hsql,name,dates)

    
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
