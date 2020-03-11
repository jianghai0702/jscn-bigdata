##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM 获取每日未分类 url
# Pay: DIM_GET_NO_CLASSIFY_URL.py
# Purpose: 
# 
# Author:      yanal
#
# Created:     2017-9-19
# Copyright:   (c) yanal 2017
# Licence:     <your licence>
# -------------------------------
# 本脚本的目的是把 上网行为上行数据里（ 表 dwd_uplink_data ）所有网址与 网址分类表 dim_std_url 做比对
# 把网址分类表里没有的网址拿出来，先测试这些网址是否能正常访问，
# 1、如果能正常访问的，则把这些网址写入到一个按月份命名的csv文件. (/home/yanal/url_temp/url_yyyymm.csv ) 供下载后人工分类
# 2、如果不能访问的网址，写入无效网址表 dim_std_invalid_url 
#  
# 该脚本每月运行一次,然后由数据公司方当月处理并上传文件到 /home/yanal/url_type
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
import re
#from Class.Threadpool_Class import Threadpool_Class
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

##测试url能否连接的函数
def TestUrl(url,yes_list,no_list):
    try: 
        conn=httplib.HTTPConnection(url,80,timeout=2)
        conn.request("GET","/")
        r1=conn.getresponse()
        if r1.status==200:
            yes_list.append(url)
            logger.info( "可访问: %s " % url)
        else:
            no_list.append(url)
            logger.info( "不能访问: %s " % url)
        conn.close()    
    except Exception,e:            
        no_list.append(url)
        logger.info("异常，不能访问: %s " % url)
        conn.close()    

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
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    
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
    ##创建临时表
    hsql='''create table if not exists %(t_tmp_dim_get_no_classify_url)s  (
        domain_name   string,
        visit_num bigint
    )
    STORED AS RCFILE
    LOCATION '%(tmp_path)s/%(t_tmp_dim_get_no_classify_url)s'
    '''% vars()
    QueryExe(hsql,name,dates)

    hsql='''create table if not exists %(t_tmp_dim_get_no_classify_url1)s  (
        domain_name   string
    )
    STORED AS TEXTFILE
    LOCATION '%(tmp_path)s/%(t_tmp_dim_get_no_classify_url1)s'
    '''% vars()
    QueryExe(hsql,name,dates)

    ##把与 dim_std_url 和 dim_std_invalid_url 关联不上的数据放入临时表
    hsql='''insert overwrite table %(t_tmp_dim_get_no_classify_url)s
    select t1.domain_name,
        count(1) visit_num 
    from dwd_uplink_data t1
    left join %(s_dim_std_url)s t2 on t1.domain_name = t2.std_url_code
    left join %(t_dim_std_invalid_url)s t3 on t1.domain_name = t3.std_url_code
    where substr(t1.pt_time,1,6)='%(ARG_OPTIME_LAST1_M)s' and t2.std_url_code is null and t3.std_url_code is null
    group by t1.domain_name
    '''% vars() 
    QueryExe(hsql,name,dates)
    
    ##把临时表的数据拿出来测试，看看哪些可以连上，哪些连不上.不能连接的数据插入表 dim_std_invalid_url
    yes_list=[]
    no_list=[]
    
    hsql='''select domain_name from 
        (select domain_name,visit_num from %(t_tmp_dim_get_no_classify_url)s order by visit_num desc limit 600) t
    '''% vars()     
    v_domain = GetResultNolog(hsql,name,dates)

    for i in range(len(v_domain)):
        domain_i = v_domain[i][0]
        #t_obj.execute(TestUrl,domain_i)
        #logger.info( "地址: %s " % domain_i)
        TestUrl(domain_i,yes_list,no_list)
        
    #t_obj.dismiss(True)
    
    ##把不能访问的无效url数据写入文件，然后插入表 dim_std_invalid_url
    n_result = open(t_invalid_path,"w+")
    for i_no in no_list:
         n_result.write(i_no + "\n")
    n_result.close()

    ##把能访问的 url 写入到一个文件中
    url_path = t_url_path + '/url_' + ARG_OPTIME_LAST1_M + '.csv'
    print ("url_path=: %s " % url_path)
    y_result = open(url_path,"w+")
    for i_yes in yes_list:
        y_result.write(i_yes+"\n")
    y_result.close()
    
    ##数据 从本地目录复制到 hdfs 目录
    t_path =  os.path.join(tmp_path,t_tmp_dim_get_no_classify_url2)
    cmd = '%(hadoopfs)s -copyFromLocal %(t_invalid_path)s %(t_path)s' % globals()
    logger.info(cmd)
    #os.system(cmd)
    import commands
    status = commands.getoutput(cmd)
    logger.info(status)


    
    ## 把目录 t_path 的数据插入临时表 t_tmp_dim_get_no_classify_url1
    hsql='''LOAD DATA INPATH '%(t_path)s' overwrite INTO TABLE %(t_tmp_dim_get_no_classify_url1)s
    '''% vars() 
    QueryExe(hsql,name,dates)
    
    ##把临时表中数据插入到目标表
    hsql='''insert into table %(t_dim_std_invalid_url)s select * from %(t_tmp_dim_get_no_classify_url1)s 
    '''% vars() 
    QueryExe(hsql,name,dates)

    # 表数据去重
    hsql='''insert overwrite table %(t_dim_std_invalid_url)s 
            select distinct t.* 
            from %(t_dim_std_invalid_url)s t
    '''% vars()
    QueryExe(hsql,name,dates)
    


##===========================================================================       
##删除临时表                                               
##===========================================================================
    hsql='''drop table %(t_tmp_dim_get_no_classify_url)s''' %vars()
    QueryExe(hsql,name,dates)

    hsql='''drop table %(t_tmp_dim_get_no_classify_url1)s''' %vars()
    QueryExe(hsql,name,dates)

##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
