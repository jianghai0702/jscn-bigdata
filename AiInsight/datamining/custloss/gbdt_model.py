#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/9/19
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
from sklearn.ensemble import GradientBoostingClassifier
from sklearn.metrics import classification_report

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
        target = trainData[para['CUST_TRAIN_Y']]
        X = np.array(data)  # data.as_matrix()
        Y = np.array(target).astype('int')  # target.as_matrix()

        X_predit = predictData[para['CUST_TRAIN_X']]
        X_predit = pd.DataFrame(X_predit, dtype='float64')
        X_predit = X_predit.as_matrix()
        is_lost = pd.DataFrame(predictData['is_lost'], dtype='int')
        Y_predit = np.array(is_lost)

        X_train, X_test, Y_train, Y_test = train_test_split(X, Y)



        ## gbdt model
        ### search best params
        param_best = {}

        ## step1
        param_test = {'n_estimators': range(20, 81, 10)}
        gsearch1 = GridSearchCV(estimator=GradientBoostingClassifier(learning_rate=0.1,
                                                                     min_samples_split=300,
                                                                     min_samples_leaf=20,
                                                                     max_depth=8,
                                                                     max_features='sqrt',
                                                                     subsample=0.8,
                                                                     random_state=10),
                                param_grid=param_test,
                                scoring='roc_auc',
                                iid=False,
                                cv=5)
        gsearch1.fit(X_train, Y_train)
        logger.info(gsearch1.best_params_)
        param_best['n_estimators'] = gsearch1.best_params_['n_estimators']

        ## step2
        param_test = {'max_depth': range(3, 14, 2), 'min_samples_split': range(50, 201, 20)}
        gsearch2 = GridSearchCV(estimator=GradientBoostingClassifier(learning_rate=0.1,
                                                                    min_samples_split=300,
                                                                    min_samples_leaf=20,
                                                                    max_depth=8,
                                                                    max_features='sqrt',
                                                                    subsample=0.8,
                                                                    random_state=10),
                               param_grid=param_test,
                               scoring='roc_auc',
                               iid=False,
                               cv=5)
        gsearch2.fit(X_train, Y_train)
        logger.info(gsearch2.best_params_)
        param_best['max_depth'] = gsearch2.best_params_['max_depth']
        param_best['min_samples_split'] = gsearch2.best_params_['min_samples_split']

        ## step3
        param_test = {'min_samples_split': range(50, 300, 20), 'min_samples_leaf': range(10, 200, 10)}
        gsearch3 = GridSearchCV(estimator=GradientBoostingClassifier(learning_rate=0.1,
                                                                    min_samples_split=300,
                                                                    min_samples_leaf=20,
                                                                    max_depth=8,
                                                                    max_features='sqrt',
                                                                    subsample=0.8,
                                                                    random_state=10),
                               param_grid=param_test,
                               scoring='roc_auc',
                               iid=False,
                               cv=5)
        gsearch3.fit(X_train, Y_train)
        logger.info(gsearch3.best_params_)
        param_best['min_samples_split'] = gsearch3.best_params_['min_samples_split']
        param_best['min_samples_leaf'] = gsearch3.best_params_['min_samples_leaf']

        ### step4： model
        gbdt_model = GradientBoostingClassifier(learning_rate=0.1,
                                 n_estimators=param_best['n_estimators'],
                                 max_depth=param_best['max_depth'],
                                 min_samples_leaf =param_best['min_samples_leaf'],
                                 min_samples_split =param_best['min_samples_split'],
                                 max_features='sqrt',
                                 subsample=0.8,
                                 random_state=10)
        gbdt_model.fit(X_train, Y_train)
        y_pred = gbdt_model.predict(X_test)
        # y_prob = gbdt_model.predict_proba(X)[:, 1]
        rep = classification_report(Y_test, y_pred)
        logger.info(rep)
        with open(curDir + '/gbdt_train_rep.txt', 'w') as f:
            f.write(rep)
            f.close()

        # 模型预测结果
        y_prob = gbdt_model.predict_proba(X_predit)[:, 1]
        y_pred = gbdt_model.predict(X_predit)
        predictData['is_lost_predict'] = y_pred
        predictData['is_lost_prob'] = y_prob
        predictData['etl_time'] = time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
        # # 输出数据
        with open(curDir+'/custloss_table.csv', 'w') as f:
            predictData.to_csv(f, index=False, header=False, encoding='utf-8')
            f.close()

    else:
        raise TypeError(u'数据集为空，请检查原始数据')
        sys.exit(1)

except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)
