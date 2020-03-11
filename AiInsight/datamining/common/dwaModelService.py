#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       dwaModelService.py
# **  功能描述:       模型业务逻辑／共用部分提取
# **  创建者:         sunwj
# **  创建日期:       2017-01-18
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath
import pandas as pd
import numpy as np

# 工程目录配置
directory = ["common", "utils", "lossmodel", "custvalue", "offervalue", "result", "offerrec"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)



def get_value_label(data, means):
    """
    获取价值类别标签（客户或者用户）
    :param data: 样本集合
    :param center: 特征平均值
    :return: 
    """
    code = [0, 0, 0]
    label = ""
    if (data.R <= means.R).all():
        code[0] = 1
    if (data.F >= means.F).all():
        code[1] = 1
    if (data.M >= means.M).all():
        code[2] = 1

    code_str = ''.join(str(x) for x in code).replace(' ', '')
    if code_str == '111':
        label = u'重要价值类别'
    elif code_str == '011':
        label = u'重要保持类别'
    elif code_str == '101':
        label = u'重要发展类别'
    elif code_str == '001':
        label = u'重要挽留类别'
    elif code_str == '100':
        label = u'一般发展类别'
    elif code_str == '110':
        label = u'一般价值类别'
    elif code_str == '010':
        label = u'一般保持类别'
    elif code_str == '000':
        label = u'一般挽留类别'
    return code_str, label


def getModelData(columns,tablename, pt_time=None, cons=None):
    """
    获取模型所需要的特征数据集
    :param columns: 查询的字段值列表 list
    :param tablename: 查询的表名 
    :param pt_time: 分区字段及值 dict
    :param cons :删选条件 
    :return: 
    """
    try:
        hsql = ""
        if pt_time is None:
            hsql = '''select {column} from {table}'''.format(column=','.join(columns), table=tablename)
        elif len(pt_time['pt_time_value']) >=1:
            hsql = '''select {column} from {table} where {pt_mon_key} = in ( {pt_mon_value} )'''.\
                format(column=','.join(columns),
                       table=tablename,
                       pt_mon_key=pt_time['pt_time'],
                       pt_mon_value = ','.join(str(x) for x in pt_time['pt_time_value']))
        else:
            raise TypeError(u'输入分区参数pt_time有误')
        res = hiveClient.hiveQuery(hsql)
        if res:
            res = pd.DataFrame(res, columns=columns)
            res = res.replace('NULL', np.NaN)
            res = res.replace({None: np.NaN})
            res = res.replace('', np.NaN)
            res = res.fillna(0)
            res = res.drop_duplicates()
            res = res.reset_index()
        else:
            raise TypeError(u'数据集为空，请检查数据')
            sys.exit(1)
        return res
    except Exception as ex:
        pass
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


