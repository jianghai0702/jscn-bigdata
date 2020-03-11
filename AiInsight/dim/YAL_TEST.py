##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: yal_test
# Pay: YAL_TEST.py
# Purpose: 
# 
# Author:      yanal
#
# Created:     2017-9-25
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
# -------------------------------
# 测试
#-------------------------------------------------------------------------------
directory=["config","dim","dw","dwd","kpi","py"]
import os,sys
from os.path import normpath,realpath
rp=realpath(sys.argv[0])
dim=os.path.dirname(rp)
AiInsight=os.path.dirname(dim)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re
import httplib


#正则清洗参数
sdate=sys.argv[1]
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
#时间参数引入
#===========================================================================================
    ARG_TODAY                 = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO            = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_dim_std_url        =    "dim_std_url"
    s_dwd_uplink_data    =    "dwd_uplink_data"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_invalid_path     =    "/home/yanal/url_invalid/invalid.txt"
    t_url_path         =    "/home/yanal/url_temp"

    t_tmp_dim_get_no_classify_url   =    "tmp_dim_get_no_classify_url"
    t_tmp_dim_get_no_classify_url1     =    "tmp_dim_get_no_classify_url1"
    t_tmp_dim_get_no_classify_url2     =    "tmp_dim_get_no_classify_url2"

    t_dim_std_invalid_url     =    "dim_std_invalid_url"
##===========================================================================
    ##测试 sql 
    hsql='''select t1.std_url_code,notes,t2.* from 
        dim_std_url t1 
        join yal_test t2 on t1.std_url_code = t2.url
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
