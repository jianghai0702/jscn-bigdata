##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA用户互动内容偏好标签月表
# Pay:DWA_USER_DR_PROGRAM_BEH_M.py
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
    s_dwa_user_dr_program_m                =    "dwa_user_dr_program_m"
    s_dwa_user_lb_program_m                =    "dwa_user_lb_program_m"
    s_dim_dr_program_label                 =    "dim_dr_program_label"
    s_dwd_fact_ins_prod                    =    "dwd_fact_ins_prod"
    s_dwa_cust_feat_dtl_m                  =    "dwa_cust_feat_dtl_m"

    s_tmp_user_dr_program_beh_m1          =    "tmp_user_dr_program_beh_m1"
    s_tmp_user_dr_program_beh_m2          =    "tmp_user_dr_program_beh_m2"
    s_tmp_user_dr_program_beh_m3          =    "tmp_user_dr_program_beh_m3"
    s_tmp_user_dr_program_beh_m4          =    "tmp_user_dr_program_beh_m4"
    s_tmp_user_dr_program_beh_m5          =    "tmp_user_dr_program_beh_m5"
    s_tmp_user_dr_program_beh_m6          =    "tmp_user_dr_program_beh_m6"
    s_tmp_user_dr_program_beh_m7          =    "tmp_user_dr_program_beh_m7"
    s_tmp_user_dr_program_beh_m8          =    "tmp_user_dr_program_beh_m8"
    s_tmp_user_dr_program_beh_m9          =    "tmp_user_dr_program_beh_m9"
    s_tmp_user_dr_program_beh_m10         =    "tmp_user_dr_program_beh_m10"
    s_tmp_user_dr_program_beh_m11         =    "tmp_user_dr_program_beh_m11"
    s_tmp_user_dr_program_beh_m12         =    "tmp_user_dr_program_beh_m12" 
    s_tmp_user_dr_program_beh_m13         =    "tmp_user_dr_program_beh_m13"
    s_tmp_user_dr_program_beh_m14         =    "tmp_user_dr_program_beh_m14" 
    s_tmp_user_dr_program_beh_m15         =    "tmp_user_dr_program_beh_m15" 
    s_tmp_user_dr_program_beh_m16         =    "tmp_user_dr_program_beh_m16" 
    s_tmp_user_dr_program_beh_m17         =    "tmp_user_dr_program_beh_m17" 

    
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwa_user_dr_program_beh_m            =    "DWA_USER_DR_PROGRAM_BEH_M"
##===========================================================================       
##创建临时表                                                                       
##===========================================================================

#用来存放 近三月点播节目大类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m1)s
            (      
                   PROD_INST_ID STRING,
                   TYPE	    STRING,
                   DR_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m1)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月点播节目小类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m2)s
            (      
                   PROD_INST_ID STRING,
                   CATEGORY	    STRING,
                   DR_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m2)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月点播节目出品地的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m3)s
            (      
                   PROD_INST_ID     STRING,
                   PRODUCED	    STRING,
                   DR_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m3)s'
    '''% vars()
    QueryExe(hsql,name,dates)
#用来存放 近三月点播节目大类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m4)s
            (      
                   PROD_INST_ID     STRING,
                   dr_type_1  string,
                   dr_type_2  string,
                   dr_type_3  string,
                   dr_type_rate1 string,
                   dr_type_rate2 string,
                   dr_type_rate3 string,
                   max_dr_type_num  int,
                   avg_dr_type_num  string,
                   total_dr_type    int,
                   total_dr_num     int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m4)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月点播节目小类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m5)s
            (      
                   PROD_INST_ID     STRING,
                   dr_category_1  string,
                   dr_category_2  string,
                   dr_category_3  string,
                   dr_category_rate1 string,
                   dr_category_rate2 string,
                   dr_category_rate3 string,
                   max_dr_category_num  int,
                   avg_dr_category_num  string,
                   total_dr_category    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m5)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月点播节目出品地标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m6)s
            (      
                   PROD_INST_ID     STRING,
                   dr_produced_1  string,
                   dr_produced_2  string,
                   dr_produced_3  string,
                   dr_produced_rate1 string,
                   dr_produced_rate2 string,
                   dr_produced_rate3 string,
                   max_dr_produced_num  int,
                   avg_dr_produced_num  string,
                   total_dr_produced    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m6)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月点播节目标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m7)s
            (      
                   PROD_INST_ID     STRING,
                   is_dianyingdaren  int,
                   is_dianshijudaren int,
                   is_jilumi         int,
                   is_tiyuaihaozhe   int,
                   is_chihuo         int,
                   is_yinyueyizu     int,
                   is_xinwenyizu     int,
                   is_yulemi         int,
                   is_dongmanaihaozhe int,
                   is_youximi        int,
                   dr_type_1  string,
                   dr_type_2  string,
                   dr_type_3  string,
                   dr_type_rate1 string,
                   dr_type_rate2 string,
                   dr_type_rate3 string,
                   dr_category_1  string,
                   dr_category_2  string,
                   dr_category_3  string,
                   dr_category_rate1 string,
                   dr_category_rate2 string,
                   dr_category_rate3 string,
                   dr_produced_1  string,
                   dr_produced_2  string,
                   dr_produced_3  string,
                   dr_produced_rate1 string,
                   dr_produced_rate2 string,
                   dr_produced_rate3 string,
                   max_dr_type_num  int,
                   avg_dr_type_num  string,
                   max_dr_category_num  int,
                   avg_dr_category_num  string,
                   max_dr_produced_num  int,
                   avg_dr_produced_num  string,
                   total_dr_type    int,  
                   total_dr_category    int,                 
                   total_dr_produced    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m7)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月回看节目大类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m8)s
            (      
                   PROD_INST_ID STRING,
                   TYPE	    STRING,
                   LB_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m8)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月回看节目小类的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m9)s
            (      
                   PROD_INST_ID STRING,
                   CATEGORY	    STRING,
                   LB_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m9)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月回看节目出品地的统计数据
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m10)s
            (      
                   PROD_INST_ID     STRING,
                   PRODUCED	    STRING,
                   LB_NUM	    INT,
                   NUM_RN	    INT
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m10)s'
    '''% vars()
    QueryExe(hsql,name,dates)
#用来存放 近三月回看节目大类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m11)s
            (      
                   PROD_INST_ID     STRING,
                   lb_type_1  string,
                   lb_type_2  string,
                   lb_type_3  string,
                   lb_type_rate1 string,
                   lb_type_rate2 string,
                   lb_type_rate3 string,
                   max_lb_type_num  int,
                   avg_lb_type_num  string,
                   total_lb_type    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m11)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月回看节目小类标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m12)s
            (      
                   PROD_INST_ID     STRING,
                   lb_category_1  string,
                   lb_category_2  string,
                   lb_category_3  string,
                   lb_category_rate1 string,
                   lb_category_rate2 string,
                   lb_category_rate3 string,
                   max_lb_category_num  int,
                   avg_lb_category_num  string,
                   total_lb_category    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m12)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月回看节目出品地标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m13)s
            (      
                   PROD_INST_ID     STRING,
                   lb_produced_1  string,
                   lb_produced_2  string,
                   lb_produced_3  string,
                   lb_produced_rate1 string,
                   lb_produced_rate2 string,
                   lb_produced_rate3 string,
                   max_lb_produced_num  int,
                   avg_lb_produced_num  string,
                   total_lb_produced    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m13)s'
    '''% vars()
    QueryExe(hsql,name,dates)


#用来存放 近三月回看节目标签
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m14)s
            (      
                   PROD_INST_ID     STRING,
                   lb_type_1  string,
                   lb_type_2  string,
                   lb_type_3  string,
                   lb_type_rate1 string,
                   lb_type_rate2 string,
                   lb_type_rate3 string,
                   lb_category_1  string,
                   lb_category_2  string,
                   lb_category_3  string,
                   lb_category_rate1 string,
                   lb_category_rate2 string,
                   lb_category_rate3 string,
                   lb_produced_1  string,
                   lb_produced_2  string,
                   lb_produced_3  string,
                   lb_produced_rate1 string,
                   lb_produced_rate2 string,
                   lb_produced_rate3 string,
                   max_lb_type_num  int,
                   avg_lb_type_num  string,
                   max_lb_category_num  int,
                   avg_lb_category_num  string,
                   max_lb_produced_num  int,
                   avg_lb_produced_num  string,
                   total_lb_type    int,  
                   total_lb_category    int,                 
                   total_lb_produced    int
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m14)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#用来存放 近三月指定节目大类，点播次数和点播次数占比
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m15)s
            (      
                   PROD_INST_ID     STRING,
                   TYPE             STRING,
                   DR_NUM           STRING,
                   DR_NUM_RATE      STRING
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m15)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#存放 近三月指定节目大类，点播次数前50%
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m16)s
            (      
                   PROD_INST_ID     STRING,
                   TYPE             STRING,
                   DR_NUM_RATE      STRING
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m16)s'
    '''% vars()
    QueryExe(hsql,name,dates)

#存放 近三月指定节目大类，点播次数前50%，且点播次数占比前50%的客户
    hsql='''CREATE TABLE IF NOT EXISTS %(s_tmp_user_dr_program_beh_m17)s
            (      
                   PROD_INST_ID     STRING,
                   TYPE             STRING
            )
            stored as orcfile
            LOCATION '%(tmp_path)s/%(s_tmp_user_dr_program_beh_m17)s'
    '''% vars()
    QueryExe(hsql,name,dates)



##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成 近三月点播节目大类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m1)s
            SELECT T.PROD_INST_ID
                  ,t.type
                  ,dr_num
                  ,row_number() over (distribute by t.prod_inst_id sort by t.dr_num desc) num_rn
            FROM
            ( SELECT  t1.prod_inst_id
                    ,t2.type
                    ,sum(dr_num) dr_num                 
            FROM %(s_dwa_user_dr_program_m)s t1
            INNER JOIN %(s_dim_dr_program_label)s t2
            ON t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s  
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.type ) t
    '''% vars()
    QueryExe(hsql,name,dates)
    

#生成 近三月点播节目小类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m2)s
            SELECT T.PROD_INST_ID
                  ,t.category
                  ,dr_num
                  ,row_number() over (distribute by t.prod_inst_id sort by t.dr_num desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.category1 as category
                    ,sum(dr_num) dr_num                 
            FROM %(s_dwa_user_dr_program_m)s t1
            INNER JOIN (select program_name,category1 from %(s_dim_dr_program_label)s lateral view explode(category) mt as category1) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s 
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.category1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月点播节目出品地的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m3)s
            SELECT T.PROD_INST_ID
                  ,t.produced
                  ,dr_num
                  ,row_number() over (distribute by t.prod_inst_id sort by t.dr_num desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.produced1 as produced
                    ,sum(dr_num) dr_num                 
            FROM %(s_dwa_user_dr_program_m)s t1
            INNER JOIN (select program_name,produced1 from %(s_dim_dr_program_label)s lateral view explode(produced) mt as produced1 where produced is not null) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s 
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.produced1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月点播节目大类标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m4)s
            select t1.prod_inst_id,
                   t2.type dr_type_1,
                   t3.type dr_type_2,
                   t4.type dr_type_3,
                   round(t2.dr_num/t1.total_dr_num*100,2) dr_type_rate1,
                   round(t3.dr_num/t1.total_dr_num*100,2) dr_type_rate2,
                   round(t4.dr_num/t1.total_dr_num*100,2) dr_type_rate3,
                   t2.dr_num max_dr_type_num,
                   round(t1.total_dr_num/t1.total_dr_type,2) avg_dr_type_num,
                   t1.total_dr_type,
                   t1.total_dr_num
            from ( 
                 select prod_inst_id
                        ,sum(dr_num)  total_dr_num
                        ,count(distinct type)  total_dr_type
                 from %(s_tmp_user_dr_program_beh_m1)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m1)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m1)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m1)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3
    ''' % vars()
    QueryExe(hsql,name,dates)


#生成 近三月点播节目小类标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m5)s
            select t1.prod_inst_id,
                   t2.category dr_category_1,
                   t3.category dr_category_2,
                   t4.category dr_category_3,
                   round(t2.dr_num/t1.total_dr_num*100,2) dr_category_rate1,
                   round(t3.dr_num/t1.total_dr_num*100,2) dr_category_rate2,
                   round(t4.dr_num/t1.total_dr_num*100,2) dr_category_rate3,
                   t2.dr_num max_dr_category_num,
                   round(t1.total_dr_num/t1.total_dr_category,2) avg_dr_category_num,
                   t1.total_dr_category
            from ( 
                 select prod_inst_id
                        ,sum(dr_num)  total_dr_num
                        ,count(distinct category)  total_dr_category
                 from %(s_tmp_user_dr_program_beh_m2)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m2)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m2)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m2)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)


#生成 近三月点播节目出品地标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m6)s
            select t1.prod_inst_id,
                   t2.produced dr_produced_1,
                   t3.produced dr_produced_2,
                   t4.produced dr_produced_3,
                   round(t2.dr_num/t1.total_dr_num*100,2) dr_produced_rate1,
                   round(t3.dr_num/t1.total_dr_num*100,2) dr_produced_rate2,
                   round(t4.dr_num/t1.total_dr_num*100,2) dr_produced_rate3,
                   t2.dr_num max_dr_produced_num,
                   round(t1.total_dr_num/t1.total_dr_produced,2) avg_dr_produced_num,
                   t1.total_dr_produced
            from ( 
                 select prod_inst_id
                        ,sum(dr_num)  total_dr_num
                        ,count(distinct produced)  total_dr_produced
                 from %(s_tmp_user_dr_program_beh_m3)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m3)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m3)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m3)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 近三月指定节目大类，点播次数和点播次数占比
    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m15)s 
            select  t1.prod_inst_id
                    ,t1.type
                    ,t1.dr_num
                    ,round(t1.dr_num/t2.total_dr_num*100,2) dr_num_rate
            from    %(s_tmp_user_dr_program_beh_m1)s t1
            left join %(s_tmp_user_dr_program_beh_m4)s t2
            on      t1.prod_inst_id = t2.prod_inst_id      
            where   t1.type in ('电影','电视剧','纪录片','体育','美食','音乐','新闻','娱乐','动漫','游戏')
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 近三月指定节目大类，点播次数前50%
    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m16)s
            select  t1.prod_inst_id
                    ,t1.type
                    ,t1.dr_num_rate
            from    (select  prod_inst_id
                             ,type
                             ,dr_num_rate
                             ,row_number() over (distribute by type sort by dr_num desc) rn
                    from     %(s_tmp_user_dr_program_beh_m15)s 
                    ) t1
            left join (select  type
                               ,count(1) total
                      from     %(s_tmp_user_dr_program_beh_m15)s 
                      group by type 
                      ) t2
            on       t1.type = t2.type
            where    t1.rn <= round(t2.total/2,0)
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 近三月指定节目大类，点播次数前50%，且点播次数占比前50%的客户
    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m17)s
            select  t1.prod_inst_id
                    ,t1.type
            from    (select  prod_inst_id
                             ,type
                             ,row_number() over (distribute by type sort by dr_num_rate desc) rn
                    from     %(s_tmp_user_dr_program_beh_m16)s
                    ) t1
            left join (select  type
                               ,count(1) total
                      from     %(s_tmp_user_dr_program_beh_m16)s
                      group by type
                      ) t2
            on      t1.type = t2.type
            where   t1.rn <= round(t2.total/2,0)
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 点播节目标签
    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m7)s
            select t1.prod_inst_id,
                   case when t4.prod_inst_id is not null then 1 else 0 end  is_dianyingdaren,
                   case when t5.prod_inst_id is not null then 1 else 0 end  is_dianshijudaren,
                   case when t6.prod_inst_id is not null then 1 else 0 end  is_jilumi,
                   case when t7.prod_inst_id is not null then 1 else 0 end  is_tiyuaihaozhe,
                   case when t8.prod_inst_id is not null then 1 else 0 end  is_chihuo,
                   case when t9.prod_inst_id is not null then 1 else 0 end  is_yinyueyizu,
                   case when t10.prod_inst_id is not null then 1 else 0 end  is_xinwenyizu,
                   case when t11.prod_inst_id is not null then 1 else 0 end  is_yulemi,
                   case when t12.prod_inst_id is not null then 1 else 0 end  is_dongmanaihaozhe,
                   case when t13.prod_inst_id is not null then 1 else 0 end  is_youximi,
                   t1.dr_type_1,
                   t1.dr_type_2,
                   t1.dr_type_3,
                   t1.dr_type_rate1,
                   t1.dr_type_rate2,
                   t1.dr_type_rate3,
                   t2.dr_category_1,
                   t2.dr_category_2,
                   t2.dr_category_3,
                   t2.dr_category_rate1,
                   t2.dr_category_rate2,
                   t2.dr_category_rate3,
                   t3.dr_produced_1,
                   t3.dr_produced_2,
                   t3.dr_produced_3,
                   t3.dr_produced_rate1,
                   t3.dr_produced_rate2,
                   t3.dr_produced_rate3,
                   t1.max_dr_type_num,
                   t1.avg_dr_type_num,
                   t2.max_dr_category_num,
                   t2.avg_dr_category_num,
                   t3.max_dr_produced_num,
                   t3.avg_dr_produced_num,
                   t1.total_dr_type,
                   t2.total_dr_category,
                   t3.total_dr_produced                   
            from %(s_tmp_user_dr_program_beh_m4)s t1
            left join %(s_tmp_user_dr_program_beh_m5)s t2
            on  t1.prod_inst_id = t2.prod_inst_id
            left join %(s_tmp_user_dr_program_beh_m6)s t3
            on t1.prod_inst_id = t3.prod_inst_id

            left join %(s_tmp_user_dr_program_beh_m17)s t4
            on t1.prod_inst_id = t4.prod_inst_id
            and t4.type = '电影'
            left join %(s_tmp_user_dr_program_beh_m17)s t5
            on t1.prod_inst_id = t5.prod_inst_id
            and t5.type = '电视剧'
            left join %(s_tmp_user_dr_program_beh_m17)s t6
            on t1.prod_inst_id = t6.prod_inst_id
            and t6.type = '纪录片'
            left join %(s_tmp_user_dr_program_beh_m17)s t7
            on t1.prod_inst_id = t7.prod_inst_id
            and t7.type = '体育'
            left join %(s_tmp_user_dr_program_beh_m17)s t8
            on t1.prod_inst_id = t8.prod_inst_id
            and t8.type = '美食'
            left join %(s_tmp_user_dr_program_beh_m17)s t9
            on t1.prod_inst_id = t9.prod_inst_id
            and t9.type = '音乐'
            left join %(s_tmp_user_dr_program_beh_m17)s t10
            on t1.prod_inst_id = t10.prod_inst_id
            and t10.type = '新闻'
            left join %(s_tmp_user_dr_program_beh_m17)s t11
            on t1.prod_inst_id = t11.prod_inst_id
            and t11.type = '娱乐'
            left join %(s_tmp_user_dr_program_beh_m17)s t12
            on t1.prod_inst_id = t12.prod_inst_id
            and t12.type = '动漫'
            left join %(s_tmp_user_dr_program_beh_m17)s t13
            on t1.prod_inst_id = t13.prod_inst_id
            and t13.type = '游戏'
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 近三月回看节目大类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m8)s
            SELECT T.PROD_INST_ID
                  ,t.type
                  ,lb_num
                  ,row_number() over (distribute  by t.prod_inst_id sort by t.lb_num desc) num_rn
            FROM
            ( SELECT t1.prod_inst_id
                    ,t2.type
                    ,sum(lb_num) lb_num                 
            FROM %(s_dwa_user_lb_program_m)s t1
            INNER JOIN %(s_dim_dr_program_label)s t2
            ON t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s  
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.type ) t
    '''% vars()
    QueryExe(hsql,name,dates)
    

#生成 近三月回看节目小类的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m9)s
            SELECT T.PROD_INST_ID
                  ,t.category
                  ,lb_num
                  ,row_number() over (distribute by t.prod_inst_id sort by t.lb_num desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.category1 as category
                    ,sum(lb_num) lb_num                 
            FROM %(s_dwa_user_lb_program_m)s t1
            INNER JOIN (select program_name,category1 from %(s_dim_dr_program_label)s lateral view explode(category) mt as category1) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s 
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.category1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月回看节目出品地的统计数据
 
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_user_dr_program_beh_m10)s
            SELECT T.PROD_INST_ID
                  ,t.produced
                  ,lb_num
                  ,row_number() over (distribute by t.prod_inst_id sort by t.lb_num desc) num_rn
            FROM 
            ( SELECT  t1.prod_inst_id
                    ,t2.produced1 as produced
                    ,sum(lb_num) lb_num                 
            FROM %(s_dwa_user_lb_program_m)s t1
            INNER JOIN (select program_name,produced1 from %(s_dim_dr_program_label)s lateral view explode(produced) mt as produced1 where produced is not null) t2
            ON  t1.PROGRAM_NAME = t2.program_name 
            WHERE pt_mon >= %(ARG_OPTIME_LAST3_M)s 
            AND pt_mon <= %(ARG_OPTIME_LAST1_M)s 
            GROUP BY prod_inst_id,t2.produced1 ) t
    '''% vars()
    QueryExe(hsql,name,dates)


#生成 近三月回看节目大类标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m11)s
            select t1.prod_inst_id,
                   t2.type lb_type_1,
                   t3.type lb_type_2,
                   t4.type lb_type_3,
                   round(t2.lb_num/t1.total_lb_num*100,2) lb_type_rate1,
                   round(t3.lb_num/t1.total_lb_num*100,2) lb_type_rate2,
                   round(t4.lb_num/t1.total_lb_num*100,2) lb_type_rate3,
                   t2.lb_num max_lb_type_num,
                   round(t1.total_lb_num/t1.total_lb_type,2) avg_lb_type_num,
                   t1.total_lb_type
            from ( 
                 select prod_inst_id
                        ,sum(lb_num)  total_lb_num
                        ,count(distinct type)  total_lb_type
                 from %(s_tmp_user_dr_program_beh_m8)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m8)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m8)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m8)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)



#生成 近三月回看节目小类标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m12)s
            select t1.prod_inst_id,
                   t2.category lb_category_1,
                   t3.category lb_category_2,
                   t4.category lb_category_3,
                   round(t2.lb_num/t1.total_lb_num*100,2) lb_category_rate1,
                   round(t3.lb_num/t1.total_lb_num*100,2) lb_category_rate2,
                   round(t4.lb_num/t1.total_lb_num*100,2) lb_category_rate3,
                   t2.lb_num max_lb_category_num,
                   round(t1.total_lb_num/t1.total_lb_category,2) avg_lb_category_num,
                   t1.total_lb_category
            from ( 
                 select prod_inst_id
                        ,sum(lb_num)  total_lb_num
                        ,count(distinct category)  total_lb_category
                 from %(s_tmp_user_dr_program_beh_m9)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m9)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m9)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m9)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)


#生成 近三月回看节目出品地标签

    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m13)s
            select t1.prod_inst_id,
                   t2.produced lb_produced_1,
                   t3.produced lb_produced_2,
                   t4.produced lb_produced_3,
                   round(t2.lb_num/t1.total_lb_num*100,2) lb_produced_rate1,
                   round(t3.lb_num/t1.total_lb_num*100,2) lb_produced_rate2,
                   round(t4.lb_num/t1.total_lb_num*100,2) lb_produced_rate3,
                   t2.lb_num max_lb_produced_num,
                   round(t1.total_lb_num/t1.total_lb_produced,2) avg_lb_produced_num,
                   t1.total_lb_produced
            from ( 
                 select prod_inst_id
                        ,sum(lb_num)  total_lb_num
                        ,count(distinct produced)  total_lb_produced
                 from %(s_tmp_user_dr_program_beh_m10)s
                 group by prod_inst_id
            ) t1
            left join %(s_tmp_user_dr_program_beh_m10)s t2 
            on t1.prod_inst_id=t2.prod_inst_id and t2.num_rn=1
            left join %(s_tmp_user_dr_program_beh_m10)s t3 
            on t1.prod_inst_id=t3.prod_inst_id and t3.num_rn=2
            left join %(s_tmp_user_dr_program_beh_m10)s t4
            on t1.prod_inst_id=t4.prod_inst_id and t4.num_rn=3

    ''' % vars()
    QueryExe(hsql,name,dates)

#生成 回看节目标签
    hsql='''insert overwrite table %(s_tmp_user_dr_program_beh_m14)s
            select t1.prod_inst_id,
                   t1.lb_type_1,
                   t1.lb_type_2,
                   t1.lb_type_3,
                   t1.lb_type_rate1,
                   t1.lb_type_rate2,
                   t1.lb_type_rate3,
                   t2.lb_category_1,
                   t2.lb_category_2,
                   t2.lb_category_3,
                   t2.lb_category_rate1,
                   t2.lb_category_rate2,
                   t2.lb_category_rate3,
                   t3.lb_produced_1,
                   t3.lb_produced_2,
                   t3.lb_produced_3,
                   t3.lb_produced_rate1,
                   t3.lb_produced_rate2,
                   t3.lb_produced_rate3,
                   t1.max_lb_type_num,
                   t1.avg_lb_type_num,
                   t2.max_lb_category_num,
                   t2.avg_lb_category_num,
                   t3.max_lb_produced_num,
                   t3.avg_lb_produced_num,
                   t1.total_lb_type,
                   t2.total_lb_category,
                   t3.total_lb_produced                   
            from %(s_tmp_user_dr_program_beh_m11)s t1
            left join %(s_tmp_user_dr_program_beh_m12)s t2
            on t1.prod_inst_id = t2.prod_inst_id
            left join %(s_tmp_user_dr_program_beh_m13)s t3
            on t1.prod_inst_id = t3.prod_inst_id
        
    ''' % vars()
    QueryExe(hsql,name,dates)



#生成目标数据
    hsql='''insert overwrite table %(t_dwa_user_dr_program_beh_m)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s) 
            select coalesce(t1.prod_inst_id,t2.prod_inst_id) prod_inst_id,
                   t3.cust_id,
                   coalesce(t1.is_dianyingdaren,0),
                   coalesce(t1.is_dianshijudaren,0),
                   coalesce(t1.is_jilumi,0),
                   coalesce(t1.is_tiyuaihaozhe,0),
                   coalesce(t1.is_chihuo,0),
                   coalesce(t1.is_yinyueyizu,0),
                   coalesce(t1.is_xinwenyizu,0),
                   coalesce(t1.is_yulemi,0),
                   coalesce(t1.is_dongmanaihaozhe,0),
                   coalesce(t1.is_youximi,0),
                   coalesce(t1.dr_type_1,''),
                   coalesce(t1.dr_type_2,''),
                   coalesce(t1.dr_type_3,''),
                   coalesce(t1.dr_type_rate1,0),
                   coalesce(t1.dr_type_rate2,0),
                   coalesce(t1.dr_type_rate3,0),
                   coalesce(t1.dr_category_1,''),
                   coalesce(t1.dr_category_2,''),
                   coalesce(t1.dr_category_3,''),
                   coalesce(t1.dr_category_rate1,0),
                   coalesce(t1.dr_category_rate2,0),
                   coalesce(t1.dr_category_rate3,0),
                   coalesce(t1.dr_produced_1,''),
                   coalesce(t1.dr_produced_2,''),
                   coalesce(t1.dr_produced_3,''),
                   coalesce(t1.dr_produced_rate1,0),
                   coalesce(t1.dr_produced_rate2,0),
                   coalesce(t1.dr_produced_rate3,0),
                   coalesce(t2.lb_type_1,''),
                   coalesce(t2.lb_type_2,''),
                   coalesce(t2.lb_type_3,''),
                   coalesce(t2.lb_type_rate1,0),
                   coalesce(t2.lb_type_rate2,0),
                   coalesce(t2.lb_type_rate3,0),
                   coalesce(t2.lb_category_1,''),
                   coalesce(t2.lb_category_2,''),
                   coalesce(t2.lb_category_3,''),
                   coalesce(t2.lb_category_rate1,0),
                   coalesce(t2.lb_category_rate2,0),
                   coalesce(t2.lb_category_rate3,0),
                   coalesce(t2.lb_produced_1,''),
                   coalesce(t2.lb_produced_2,''),
                   coalesce(t2.lb_produced_3,''),
                   coalesce(t2.lb_produced_rate1,0),
                   coalesce(t2.lb_produced_rate2,0),
                   coalesce(t2.lb_produced_rate3,0),
                   coalesce(t1.max_dr_type_num,0),
                   coalesce(t1.avg_dr_type_num,0),
                   coalesce(t1.max_dr_category_num,0),
                   coalesce(t1.avg_dr_category_num,0),
                   coalesce(t1.max_dr_produced_num,0),
                   coalesce(t1.avg_dr_produced_num,0),
                   coalesce(t2.max_lb_type_num,0),
                   coalesce(t2.avg_lb_type_num,0),
                   coalesce(t2.max_lb_category_num,0),
                   coalesce(t2.avg_lb_category_num,0),
                   coalesce(t2.max_lb_produced_num,0),
                   coalesce(t2.avg_lb_produced_num,0),
                   coalesce(t1.total_dr_type,0),
                   coalesce(t1.total_dr_category,0),
                   coalesce(t1.total_dr_produced,0),
                   coalesce(t2.total_lb_type,0),
                   coalesce(t2.total_lb_category,0),
                   coalesce(t2.total_lb_produced,0),
                   from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date       
            from %(s_tmp_user_dr_program_beh_m7)s t1
            full join %(s_tmp_user_dr_program_beh_m14)s t2
            on t1.prod_inst_id = t2.prod_inst_id
            left join %(s_dwd_fact_ins_prod)s t3 
            on coalesce(t1.prod_inst_id,t2.prod_inst_id) = t3.prod_inst_id
            and t3.pt_mon=%(ARG_OPTIME_LAST1_M)s
            inner join %(s_dwa_cust_feat_dtl_m)s t4
            on t3.cust_id = t4.cust_id
            and t4.pt_mon = %(ARG_OPTIME_LAST1_M)s

    '''% vars()
    QueryExe(hsql,name,dates)
    
##===========================================================================       
##删除临时表                                               
##===========================================================================
    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m1)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m2)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m3)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m4)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m5)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m6)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)


    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m7)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m8)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m9)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m10)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m11)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m12)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m13)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m14)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m15)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m16)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)

    # hsql='''drop table if exists %(s_tmp_user_dr_program_beh_m17)s
    #         '''% vars()    
    # QueryExe(hsql,name,dates)
    
    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
 
