#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:    config.py
# **  功能描述:    配置文件
# **  创建者:      sunwj
# **  创建日期:    2017-09-26
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
import logging.config
from os.path import realpath
from os.path import basename, splitext, join

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result","userrecm"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

# 日志文件配置
base = splitext(basename(sys.argv[0]))[0]
lpath = join(PROJ_HOME, 'logs')
fpath = join(lpath, base + '.log')

# set logger
logger = logging.getLogger(__name__)
logger.setLevel(logging.INFO)

# set console/file handler
cnslHandler = logging.StreamHandler()
cnslHandler.setLevel(logging.DEBUG)
fileHandler = logging.FileHandler(fpath, mode='w', encoding='utf-8')
fileHandler.setLevel(logging.DEBUG)

# set formatter
# fmt = logging.Formatter('%(asctime)s [%(levelname)s] {%(filename)s:%(lineno)s, %(processName)s:%(process)d, %(threadName)s:%(thread)d} %(message)s')
fmt = logging.Formatter('%(asctime)s [%(levelname)s] {%(filename)s:%(lineno)s} %(message)s')
cnslHandler.setFormatter(fmt)
fileHandler.setFormatter(fmt)

# add handler
logger.addHandler(cnslHandler)
logger.addHandler(fileHandler)

#
# 定义hive仓库路径
dim_path = '/user/hive/warehouse/test.db'
dw_path  = '/user/hive/warehouse/test.db'
dwd_path = '/user/hive/warehouse/test.db'
st_path  = '/user/hive/warehouse/test.db'
#stg_path = '/user/hive/warehouse/test.db'
# 定义表存放路径
tmp_path = '/user/hive/TEMP'
# 定义hive表的存储格式
store_fmt = 'RCFILE'