##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: DIM 获取每日未分类 url
# Pay: DIM_GET_NO_CLASSIFY_URL.py
# Purpose: 
# 
# Author:      jianghai
#
# Created:     2019-09-20
# Copyright:   (c) jianghai 2019
# Licence:     <your licence>
# -------------------------------
# 本脚本的目的是把 上网行为上行数据里（ 表 dwd_uplink_data ）所有网址与 网址分类表 dim_std_url 做比对
# 把网址分类表里没有的网址拿出来，先测试这些网址是否能正常访问，
# 1、如果能正常访问的，则把这些网址写入到一个按月份命名的csv文件. (/home/yanal/url_temp/url_yyyymm.csv ) 供下载后人工分类
# 2、如果不能访问的网址，写入无效网址表 dim_std_invalid_url 
#  
# 该脚本每月运行一次,然后由数据公司方当月处理并上传文件到 /home/yanal/url_type 
#
# 目的：将表stg_rep_order_export表的数据以csv的格式导出
# 
#-------------------------------------------------------------------------------



# system library 系统库
################################################
import os,sys,csv
import pandas as pd
from os.path import normpath




# system config 系统变量
#############################################
# 文件路径 例：/AiInsight/stg/stg_rep_order_prod_export.py
filePath=os.path.realpath(sys.argv[0])
# 第二级目录 例：/AiInsight/stg
secondPath=os.path.dirname(filePath)
# 第一级目录 例：/AiInsight
rootPath=os.path.dirname(secondPath)
# 日期 20191001
currentDate=sys.argv[1]
# 文件名称（去除后缀）例：stg_rep_order_prod_export
fileNameNoSuffix = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')





# self library 自定义库
directory=["config","dim","dw","dwd","kpi","py"]
for dir in directory: sys.path.append(rootPath + os.sep + dir)
from settings import *
from hqltools import *
import re
import httplib



def dataToCsv(file, data, colums, target):
	data = list(data)
	colums = list(colums)
	file_data = pd.DataFrame(data, index=range(len(data)))
	file_data.to_csv(file)



# self library 自定义变量
#############################################
# 标准的格式化日期参数 parameters
dateParameters={}; Pama(dateParameters, currentDate)
# 时间参数
ARG_TODAY 			= dateParameters['ARG_TODAY']  # 获得yyyymmddhh格式的当前日期
ARG_TODAY_ISO 		= dateParameters['ARG_TODAY_ISO']  # 获得yyyy-MM-dd HH格式的当前日期
ARG_OPTIME 			= dateParameters['ARG_OPTIME']  # 获得yyyymmdd格式的数据日期
ARG_OPTIME_ISO 		= dateParameters['ARG_OPTIME_ISO']  # 获得yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTDAY 	= dateParameters['ARG_OPTIME_LASTDAY']  # 获得传入的数据日期的前一天yyyymmdd格式的数据日期
ARG_OPTIME_LAST_M 	= dateParameters['ARG_OPTIME_LAST_M']  # 获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M 	= dateParameters['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
# 文件输出路径
targetFilePath = "/home/yanal/stg_rep_order_prod_jiangsu_nanjin_export_tmp2.csv"
# 过滤
filterName = "南京"




###################################################
try:
	# 开始锁文件
	Start(fileNameNoSuffix, currentDate)
	sql = "select * from stg_rep_order_prod where corp_org_name = '南京分公司' and pt_mon = '201909' "
	#sql = "select * from dwd_acct_item limit 100"
	res = GetResultNolog(sql, fileNameNoSuffix, currentDate)
	
	# csv文件
	csvFile = open(targetFilePath, "w")
	# csv文件写对象
	csvWriter = csv.writer(csvFile)
	# 循环写文件
	for item in res:
		#写多行
		#csvWriter.writerows(res)
		#写单行
		csvWriter.writerow(item)
		#print(item)
	
	# 释放文件对象
	csvFile.close()
	# 结束锁文件
	End(fileNameNoSuffix, currentDate)
except Exception, e:
	Except(fileNameNoSuffix, currentDate, e)






