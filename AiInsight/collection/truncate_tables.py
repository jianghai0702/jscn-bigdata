#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  truncate_tables.py
# Purpose     :  删除历史数据
#
# Author      :  sunwj
#
# CreatedDate :  2019-06-18 14:55
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------

directory=["config","dim","dw","dwd","kpi","py"]
import os,sys
from os.path import normpath,realpath
rp=realpath(sys.argv[0])
dwd=os.path.dirname(rp)
AiInsight=os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

# from settings import *
# from hqltools import *
import re
import commands

# 程序开始执行
name = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')
lists = ['zg','szzg','st','stg','dw','dwa','dwd','dim',
         'ZG','SZZG','ST','STG','DW','DWA','DWD','DIM']
command = "hdfs dfs -ls  /asiainfo/hive/"
ss1 = commands.getstatus(command)
print(ss1)



