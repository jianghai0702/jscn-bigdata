#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/9/29
@author: wanju Sun
@group : 
@contact: 
"""
import sys
import os
from os.path import realpath
import time
import datetime
import pandas as pd
import numpy as np
from sklearn import tree, metrics
from sklearn.model_selection import train_test_split
from sklearn.model_selection import GridSearchCV
from sklearn.pipeline import Pipeline
from sklearn.neural_network import MLPClassifier
from sklearn.preprocessing import MinMaxScaler
from sklearn.preprocessing import LabelBinarizer
from sklearn.ensemble import RandomForestClassifier
from sklearn.externals import joblib

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)
from config import *
from hiveUtils import *
from paraUtils import *
from lossModelTableDdl import *
from lossCharacter import *
import xgboost as xgb
from sklearn.metrics import classification_report
import matplotlib

# 全局参数引入
setPara()
tmp = vars()
para = tmp['para']

# 模型结果文件目录
# result_dir = PROJ_HOME + '''/lossmodel/result/result_%(ARG_OPTIME_LASTMON)s.csv''' % para
# 模型评价结果目录
# es_dir = PROJ_HOME + '''/lossmodel/result/es_%(ARG_OPTIME_LASTMON)s.csv''' % para
# 预测日期
pDate = '''%(ARG_OPTIME_LASTMON)s''' % para

try:
    hsql = '''select %(CUST_LOSS_COLUMNS_STR)s 
              from %(dwa_cust_loss_character)s
              WHERE pt_mon IN ('%(ARG_OPTIME_LASTMON)s', '%(ARG_OPTIME_LAST2MON)s', 
                '%(ARG_OPTIME_LAST3MON)s','%(ARG_OPTIME_LAST4MON)s')
                AND ( ITV_EXPIRE_DAYS <=60 or 
                      NOT_ITV_EXPIRE_DAYS <=60
                     )
    ''' % para
    res = hiveClient.hiveQuery(hsql)
    if res:
        modelData = pd.DataFrame(res, columns=para['CUST_LOSS_COLUMNS'])
        modelData = modelData.replace('NULL', np.NaN)
        modelData = modelData.replace({None: 0})
        modelData = modelData.fillna(0)
        modelData = modelData.drop_duplicates()
        modelData['corp_org_id'] = '3002'
        modelData['corp_org_name'] = u'泰州分公司'


        ##
        trainData = modelData[(modelData.pt_mon < pDate) & (modelData.is_main == '1')]
        trainData = trainData[para['CUST_TRAIN_FEATURE']]

        ##
        predictData = modelData[(modelData.pt_mon == pDate) & (modelData.is_main == '1')]
        predictData = predictData.drop(['pt_mon'], axis=1)

        data = trainData[para['CUST_TRAIN_X']]
        data = pd.DataFrame(data, dtype='float64')
        logger.info(data.info())
        target = trainData[para['CUST_TRAIN_Y']]
        X = np.array(data)  # data.as_matrix()
        Y = np.array(target).astype('int')  # target.as_matrix()

        X_predit = predictData[para['CUST_TRAIN_X']]
        X_predit = pd.DataFrame(X_predit, dtype='float64')
        X_predit = X_predit.as_matrix()
        is_lost = pd.DataFrame(predictData['is_lost'], dtype='int')
        Y_predit = np.array(is_lost)

        X_train, X_test, Y_train, Y_test = train_test_split(X, Y)

        ### xgboost model
        model = xgb.XGBClassifier(max_depth=5, learning_rate=0.1, n_estimators=160, silent=True)
        model.fit(X_train, Y_train)

        # feature importance
        feat_imp = model.feature_importances_
        feat_imp = pd.DataFrame(feat_imp, columns=['importance'], index=para['CUST_TRAIN_X'])
        logger.info(feat_imp)
        # 属于第一类的概率
        pred0 = model.predict(X_test)
        # translate the probility into 1 or 0
        Y_pred = [round(value) for value in pred0]
        rep = classification_report(Y_test, Y_pred)
        logger.info(rep)

    else:
        raise TypeError(u'数据集为空，请检查原始数据')
        sys.exit(1)

except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)
