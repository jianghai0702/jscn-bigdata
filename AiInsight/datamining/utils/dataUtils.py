#!/usr/bin/env python
# -*-coding:utf-8 -*-
# **-----------------------------------------------------------------------------------------------
# **  文件名称:       dataUtils.py
# **  功能描述:       数据检查工具类(单个指标)
# **  创建者:         sunwj
# **  创建日期:       2017-11-16
# **  修改日志:
# **  修改日期:
# **-----------------------------------------------------------------------------------------------
import os
import sys
from os.path import realpath
import pandas as pd
import numpy as np

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
print(PROJ_HOME)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

# 自定义包引用
from config import *
from paraUtils import *
from hiveUtils import *

# 获取参数
setPara()
tmp = vars()
para = tmp['para']


class DataCheckUtils(object):
    """defining the data check class package"""

    def __init__(self, data, tableName, cols, dates):
        """
        :param data: database records or dataFrame set
        :param tableName: 
        :param cols: dtype = list
        """
        self._data = data
        self._tableName = tableName
        self._cols = cols
        self._dates = dates

    def getDescribe(self):
        """
        
        :return: 
        """

        try:
            data = pd.DataFrame(self._data)
            data = data.replace('NULL', np.NaN)
            data = data.replace('', np.NaN)
            data = data.replace(None, np.NaN)
            data = data.fillna(0)
            data = pd.DataFrame(data, dtype='float64')
            des_data = data.describe()
            des_data = des_data.T
            des_data.columns = ['count', 'mean', 'std', 'min', 'one_quart', 'two_quart', 'three_quart', 'max']
            des_data = pd.DataFrame(des_data)
            des_data['tablename'] = self._tableName
            des_data['colsname'] = self._cols
            #
            fPath = PROJ_HOME+'/result/'+self._tableName+'_'+self._dates
            with open(fPath, 'w') as f:
                des_data.to_csv(f, header=False, index=False)
                f.close()
            # 结果数据load到hive表中
            # load data local inpath '/AiInsight/datamining/lossmodel/test.txt' into table test_swj;
            # hsql = '''load data local inpath '/dwa_data_check_loss.txt' into table dwa_data_check_loss
            # partition(pt_mon='201707')
            # '''
            # hiveClient.hiveExe(hsql)
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

def type_transform(data):
    """
    aim to transform the cofusion of the   
    :param data: 
    :return: 
    """
    pass
