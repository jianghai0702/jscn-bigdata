#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2019-03-31
@author: wanju Sun
@group : 
@contact: 
"""

directory = ["config", "dim", "dw", "dwd", "kpi", "py"]
import os, sys
from os.path import normpath, realpath

rp = realpath(sys.argv[0])
dwd = os.path.dirname(rp)
AiInsight = os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re

# 正则清洗参数
if len(sys.argv) > 1:
    sdate = sys.argv[1]
regex = ur"\d{8}"
match = re.search(regex, sdate)
if match:
    dates = sdate
else:
    dates = open('/AiInsight/config/pyparameter').read()

# 脚本名称
name = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')

# 传递日期参数,生成时间字典
# -------------------------------------------------------------------------------
dicts = {}
Pama(dicts, dates)

# 引入时间字典
ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO = dicts['ARG_OPTIME_LAST1_M_ISO']  # 获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M = dicts['ARG_OPTIME_LAST2_M']  # 获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO = dicts['ARG_OPTIME_LAST2_M_ISO']  # 获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
ARG_OPTIME_MON01 = dicts['ARG_OPTIME_MON01']  # 获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_MON01_ISO = dicts['ARG_OPTIME_MON01_ISO']  # 获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMON01 = dicts['ARG_OPTIME_LASTMON01']  # 获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMON01_ISO = dicts['ARG_OPTIME_LASTMON01_ISO']  # 获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
# 源表声明
# -------------------------------------------------------------------------------
s_dim_std_organize = 'dim_std_organize'

# 临时表声明
# -------------------------------------------------------------------------------

# 目标表声明
# -------------------------------------------------------------------------------
t_st_param_add_adjust = "st_param_add_adjust"

# 开始数据处理
# -------------------------------------------------------------------------------

try:
    Start(name, dates)  # 数据处理开始，创建锁文件
    # 删除临时表
    # -------------------------------------------------------------------------------

    # -------------------------------------------------------------------------------
    # 创建临时表
    # -------------------------------------------------------------------------------


    # 生成中间数据
    # -------------------------------------------------------------------------------

    # 生成目标数据
    # -------------------------------------------------------------------------------

    hsql = '''
            insert overwrite table %(t_st_param_add_adjust)s
            select  concat(row_number()over(),'%(ARG_OPTIME_LAST1_M)s')
                   ,'%(ARG_OPTIME_LAST1_M_ISO)s'
                   ,t1.std_org_code
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,0
                   ,current_timestamp()
            from %(s_dim_std_organize)s t1
        ''' % vars()
    QueryExe(hsql, name, dates)


    End(name, dates)
except Exception, e:
    Except(name, dates, e)
