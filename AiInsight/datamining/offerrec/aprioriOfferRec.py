#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       apriorOfferRec.py
# **  功能描述:       关联推荐
# **  创建者:         sunwj
# **  创建日期:       2018-01-10
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath
import pandas as pd
import numpy as np
import pyfpgrowth as fp
# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)


dataSet = []
D = None #
numItems = 0 # 总的记录数（transcions）

from config import *
from hiveUtils import hiveClient
from paraUtils import *

try:
    dataSet = pd.read_csv(curDir+'/02_user.data',error_bad_lines=False)
    dataSet = dataSet.dropna()
    dataSet = dataSet.reset_index()
    dataSet = np.array(dataSet)

    dataSet = []
    with open(curDir+'/02_user.data') as f:
        for index, line in enumerate(f):
            items = line.split('"')
            dataSet.append([items[3]])
        f.close()
    logger.info(u'总的交易记录数\n%s', len(dataSet))
    patterns = fp.find_frequent_patterns(dataSet, 3)
    logger.info(u'规则集\n%s', patterns)
    rules = fp.generate_association_rules(patterns, 0.00001)
    logger.info(u'过滤后的推荐集\n%s', rules)
except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

