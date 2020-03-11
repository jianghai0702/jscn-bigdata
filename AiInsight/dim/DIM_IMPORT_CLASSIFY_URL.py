##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM 导入人工分类后的 url
# Pay: DIM_IMPORT_CLASSIFY_URL.py
# Purpose: 
# 
# Author:      yanal
#
# Created:     2017-9-21
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
# -------------------------------
# 本脚本的目的是把 把数据公司方当月人工分类后的网址数据导入到表 dim_std_url
# 该脚本每月运行一次
#-------------------------------------------------------------------------------
# 修改日志：
# 2019-4-9 修改为非阻塞方法执行CMD命令 修改人 sunwj
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
import re,codecs
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
    
hadoopfs      =    '/usr/bin/hadoop fs '

def ReadFile(filePath,encoding="gbk"):
    with codecs.open(filePath,"r",encoding) as f:
        return f.read()
 
def WriteFile(filePath,u,encoding="utf-8"):
    with codecs.open(filePath,"w",encoding) as f:
        f.write(u)
 
def GBK_2_UTF8(src,dst):
    content = ReadFile(src,encoding="gbk")
    WriteFile(dst,content,encoding="utf-8")

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

##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_url_type_path    =    "/home/yanal/url_type"

    t_tmp_dim_import_classify_url   =    "tmp_dim_import_classify_url"
    t_tmp_dim_import_classify_url0   =    "tmp_dim_import_classify_url0"
    t_dim_std_url               =    "dim_std_url"
    t_dim_std_invalid_url    =    "dim_std_invalid_url"
    
##===========================================================================
    ##创建临时表
    hsql='''create table if not exists %(t_tmp_dim_import_classify_url)s  (
        url      string,
        url_name string,
        url_type string
    )
    ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
    STORED AS TEXTFILE
    LOCATION '%(tmp_path)s/%(t_tmp_dim_import_classify_url)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    ##把文件从 gbk 转换为 utf-8 格式
    t_url_type_path_gbk = t_url_type_path + '/url_' + ARG_OPTIME_LAST_M + '.csv'
    t_url_type_path_utf8 = t_url_type_path + '/url_' + ARG_OPTIME_LAST_M + '_utf8.csv'
    GBK_2_UTF8(t_url_type_path_gbk,t_url_type_path_utf8)

    ##把人工分类后的 url 数据 从本地目录复制到 hdfs 目录
    t_path =  tmp_path + '/' + t_tmp_dim_import_classify_url0 
    cmd = '%(hadoopfs)s -copyFromLocal %(t_url_type_path_utf8)s %(t_path)s' % globals()
    logger.info(cmd)
    os.system(cmd)
    
    ## 把目录 t_path 的数据插入临时表 t_tmp_dim_import_classify_url
    hsql='''LOAD DATA INPATH '%(t_path)s' overwrite INTO TABLE %(t_tmp_dim_import_classify_url)s
    '''% vars() 
    QueryExe(hsql,name,dates)
    
    ##把已分类的数据插入到dim_std_url表
    hsql='''insert into table %(t_dim_std_url)s 
        select 
            t1.url std_url_code         ,
            t1.url_name std_url_name         ,
            t1.url                  ,
            t1.url_type             ,
            '' notes                ,
            1 is_display           ,
            1 display_order        ,
            1 is_valid             ,
            %(ARG_OPTIME_LASTDAY)s update_date           
        from %(t_tmp_dim_import_classify_url)s t1
        left join %(t_dim_std_url)s t2 on t1.url=t2.std_url_code
        where t2.std_url_code is null and coalesce(t1.url_type,'' )<>''
    '''% vars() 
    QueryExe(hsql,name,dates)

    ##把未分类的数据插入到dim_std_invalid_url表
    hsql='''insert into table %(t_dim_std_invalid_url)s 
        select 
            t1.url std_url_code         
        from %(t_tmp_dim_import_classify_url)s t1
        left join %(t_dim_std_invalid_url)s t2 on t1.url=t2.std_url_code
        where t2.std_url_code is null and coalesce(t1.url_type,'' )= ''
    '''% vars() 
    QueryExe(hsql,name,dates)

    
    ## 清空临时目录 t_path
    cmd = '%(hadoopfs)s -rm -r -f %(t_path)s' % globals()
    logger.info(cmd)
    import commands
    status = commands.getoutput(cmd)
    logger.info(status)
    #os.system(cmd)
    
##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table %(t_tmp_dim_import_classify_url)s''' %vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
