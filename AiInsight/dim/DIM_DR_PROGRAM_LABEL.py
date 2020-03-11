##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM 直播电视节目类型标签
# Pay: DIM_DR_PROGRAM_LABEL.py
# Purpose: 
# 
# Author:      wangxx
#
# Created:     2017-10-30
# Copyright:   (c) wangxx 2017
# Licence:     <your licence>
# -------------------------------
# 本脚本的目的是把手工分类打好标签的直播电视节目数据导入表 dim_dr_program_label
# 每月运行一次
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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的上一个月份yyyymm格式的数据日期

##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     

##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    t_program_path    =    "/home/yanal/program_label"
    t_dr_program      =   t_program_path + '/dr_' + ARG_OPTIME_LAST1_M + '.txt'

    t_dim_dr_program_label          =    "dim_dr_program_label"
    t_tmp_dim_dr_program_label      =    "tmp_dim_dr_program_label"
    t_tmp_dim_dr_program_label0      =    "tmp_dim_dr_program_label0"    

    
##===========================================================================
##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table if exists %(t_tmp_dim_dr_program_label)s''' %vars()
    QueryExe(hsql,name,dates)

##创建临时表
    hsql='''create table if not exists %(t_tmp_dim_dr_program_label)s  (
           PROGRAM_NAME         STRING,
           TYPE                 STRING,
           CATEGORY             ARRAY<STRING>,
           PRODUCED             ARRAY<STRING>
    )
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t'
    COLLECTION ITEMS TERMINATED BY ','
    STORED AS TEXTFILE
    LOCATION '%(tmp_path)s/%(t_tmp_dim_dr_program_label)s'
    '''% vars()
    QueryExe(hsql,name,dates)
    
    ##把文件从 gbk 转换为 utf-8 格式
    # t_dr_program_gbk = t_program_path + '/dr_' + ARG_OPTIME_LAST_M + '.txt'
    # t_dr_program_utf8 = t_program_path + '/dr_' + ARG_OPTIME_LAST_M + '_utf8.txt'
    # GBK_2_UTF8(t_dr_program_gbk,t_dr_program_utf8)

    #把 数据 从本地目录复制到 hdfs 目录
    t_path =  tmp_path + '/' + t_tmp_dim_dr_program_label0
    cmd = '%(hadoopfs)s -copyFromLocal %(t_dr_program)s %(t_path)s' % globals()
    logger.info(cmd)
    #os.system(cmd)
    import commands
    status = commands.getoutput(cmd)
    logger.info(status)
    
    ## 把目录 t_path 的数据插入临时表 t_tmp_dim_import_classify_url
    hsql='''LOAD DATA INPATH '%(t_path)s' overwrite INTO TABLE %(t_tmp_dim_dr_program_label)s
    '''% vars() 
    QueryExe(hsql,name,dates)
    
    ##把已分类的数据插入到dim_std_url表
    hsql='''insert into table %(t_dim_dr_program_label)s 
        select 
            t1.program_name,
            t1.type,
            t1.category,
            t1.produced,
            from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss')  ETL_DATE           
        from %(t_tmp_dim_dr_program_label)s t1
        left join %(t_dim_dr_program_label)s t2 on t1.program_name=t2.program_name
        where t2.program_name is null
        and coalesce(t1.program_name,'') <> ''
        and coalesce(t1.type,'') <> ''
    '''% vars() 
    QueryExe(hsql,name,dates)

    
    # ## 清空临时目录 t_path
    # cmd = '%(hadoopfs)s -rm -r -f %(t_path)s' % globals()
    # logger.info(cmd)
    # os.system(cmd)
    
##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table if exists %(t_tmp_dim_dr_program_label)s''' %vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
