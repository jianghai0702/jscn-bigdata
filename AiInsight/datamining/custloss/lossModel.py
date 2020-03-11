#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       lossModel.py
# **  功能描述:       流失模型
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
# **  修改日志:  2018-3-5 更改快到期1月的条件筛选 预测是否流失
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
# **
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
from sklearn import ensemble
from sklearn.externals import joblib
from sklearn.metrics import classification_report

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


# 全局参数引入
setPara()
tmp = vars()
para = tmp['para']

modelData = pd.DataFrame()  # 模型数据特征集
trainData = pd.DataFrame()
predictData = pd.DataFrame()
modelResult = pd.DataFrame()  # 预测结果
esResult = pd.DataFrame()  # 模型评价结果

lb = LabelBinarizer()

# 模型结果文件目录
result_dir = PROJ_HOME + '''/lossmodel/result/result_%(ARG_OPTIME_LASTMON)s.csv''' % para
# 模型评价结果目录
es_dir = PROJ_HOME + '''/lossmodel/result/es_%(ARG_OPTIME_LASTMON)s.csv''' % para
# 预测日期
pDate = '''%(ARG_OPTIME_LASTMON)s''' % para

def get_predict_data():

    """
    :param pDate: 获取预测日期数据 format YYYYmm 为空时提供近一个月的数据
    :return: dataFrame
    """
    global modelData, trainData, predictData
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
        if  res:
            modelData = pd.DataFrame(res, columns=para['CUST_LOSS_COLUMNS'])
            modelData = modelData.replace('NULL', np.NaN)
            modelData = modelData.replace({None: 0})
            modelData = modelData.fillna(0)
            modelData = modelData.drop_duplicates()
            modelData['corp_org_id'] ='3002'
            modelData['corp_org_name'] = u'泰州分公司'
            trainData = modelData[(modelData.pt_mon < pDate) & (modelData.is_main=='1')]
            trainData = trainData[para['CUST_TRAIN_FEATURE']]
            predictData = modelData[(modelData.pt_mon == pDate) & (modelData.is_main=='1')]
            predictData = predictData.drop(['pt_mon'], axis=1)

            # 软件平台测试数据
            with open(curDir + '/custfeature.txt', 'a+') as f:
                lens = len(predictData.columns)
                f.write(','.join(predictData.columns) + '\n')
                for line in predictData.values:
                    for i in range(lens - 1):
                        f.write(str(line[i]) + ',')
                    f.write(str(line[i + 1]) + '\n')
                f.close()


            # 决策树模型
            # decisionTreeModel()

            # 随机森林模型
            # randomForestModel()

        else:
            raise TypeError(u'数据集为空，请检查原始数据')
            sys.exit(1)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

def randomForestModel():
    """
    random Forest Model
    :return: 
    """
    global trainData, predictData
    try:
        logger.info("randomForest model is beginnig at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                          time.localtime(time.time()))))
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

        ## 参数寻优：迭代次数、最大深度、最小分割样本数、叶结点最少样本数、最大特征数
        #参数1：迭代次数参数寻优 n_estimators
        param_test1 = {'n_estimators': range(1, 100, 1)}
        gsearch1 = GridSearchCV(estimator=RandomForestClassifier(min_samples_split=100,
                                                                 min_samples_leaf=20, max_depth=8, max_features='sqrt',
                                                                 random_state=10),
                                param_grid=param_test1, scoring='roc_auc', cv=5)
        gsearch1.fit(X_train, Y_train)
        logger.info(gsearch1.best_params_)
        logger.info(gsearch1.best_score_)

        opt_estimators = gsearch1.best_params_['n_estimators']

        #参数2： max_depth,min_samples_split进行网格搜索
        param_test2 = {'max_depth': range(3, 14, 2), 'min_samples_split': range(50, 201, 20)}
        gsearch2 = GridSearchCV(estimator=RandomForestClassifier(n_estimators=opt_estimators,
                                                                 min_samples_leaf=20, max_features='sqrt',
                                                                 oob_score=True, random_state=10),
                                param_grid=param_test2, scoring='roc_auc', iid=False, cv=5)
        gsearch2.fit(X_train, Y_train)
        logger.info(gsearch2.best_params_)
        logger.info(gsearch2.best_score_)

        opt_max_depth = gsearch2.best_params_['max_depth']


        #参数3： 再对内部节点再划分所需最小样本数min_samples_split和叶子节点最少样本数min_samples_leaf一起调参
        param_test3 = {'min_samples_split': range(80, 150, 20), 'min_samples_leaf': range(10, 60, 10)}
        gsearch3 = GridSearchCV(estimator=RandomForestClassifier(n_estimators=opt_estimators, max_depth=opt_max_depth,
                                                                 max_features='sqrt', oob_score=True, random_state=10),
                                param_grid=param_test3, scoring='roc_auc', iid=False, cv=5)
        gsearch3.fit(X_train, Y_train)
        logger.info(gsearch3.best_params_)
        logger.info(gsearch3.best_score_)

        opt_min_samples_split = gsearch3.best_params_['min_samples_split']
        opt_min_samples_leaf = gsearch3.best_params_['min_samples_leaf']

        #参数4： 对最大特征数max_features做调参:
        import math
        param_test4 = {'max_features': range(3, 33, 2)}
        gsearch4 = GridSearchCV(estimator=RandomForestClassifier(n_estimators=opt_estimators, max_depth=opt_max_depth,
                                                                 min_samples_split=opt_min_samples_split,
                                                                 min_samples_leaf=opt_min_samples_leaf,
                                                                 oob_score=True, random_state=10),
                                param_grid=param_test4, scoring='roc_auc', iid=False, cv=5)
        gsearch4.fit(X_train, Y_train)
        logger.info(gsearch4.best_params_)
        logger.info(gsearch4.best_score_)

        opt_max_features = gsearch4.best_params_['max_features']

        # 随机森林拟合 及 预测
        rf = RandomForestClassifier(n_estimators=opt_estimators, max_depth=opt_max_depth,
                                    min_samples_split=opt_min_samples_split, min_samples_leaf=opt_min_samples_leaf,
                                    max_features=opt_max_features, oob_score=True, random_state=10)
        rf.fit(X_train, Y_train)
        logger.info(rf.oob_score_)
        Y_test_pred = rf.predict(X_test)
        rf_train_rep = classification_report(Y_test, Y_test_pred)
        with open(curDir + '/rf_train_rep.txt', 'w') as f:
            f.write(rf_train_rep)
            f.close()

        # 模型预测结果
        y_predprob = rf.predict_proba(X_predit)[:, 1]
        y_predpred = rf.predict(X_predit)
        rf_pred_rep = classification_report(Y_predit, y_predpred)
        with open(curDir + '/rf_pred_rep.txt', 'w') as f:
            f.write(rf_pred_rep)
            f.close()

        predictData['is_lost_predict'] = y_predpred
        predictData['is_lost_prob'] = y_predprob

        logger.info("randomForest model is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                                time.localtime(time.time()))))

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


def decisionTreeModel():
    """
    决策树模型
    :return: 
    """
    global trainData, predictData
    try:
        logger.info("decisionTre model is beginnig at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                                 time.localtime(time.time()))))
        ## 类别平衡 解决方案1
        # 采用"过采样的方式" 复制稀有类别的样本
        lost_sample = trainData[trainData.is_lost == '1']
        # import math
        # rtio  = int(trainData.index.size/lost_sample.index.size)
        # logger.info(rtio)
        # if rtio > 1:
        #     for i in range(rtio - 1):
        #         trainData = trainData.append(lost_sample)

        data = trainData[para['CUST_TRAIN_X']]
        data = pd.DataFrame(data, dtype='float64')
        logger.info(data.info())
        target = trainData[para['CUST_TRAIN_Y']]
        X = np.array(data)
        Y = np.array(target).astype('int')  # target.as_matrix()

        # 特征选择
        # 输出指标重要性
        from sklearn.ensemble import ExtraTreesClassifier
        clf = ExtraTreesClassifier()
        clf = clf.fit(X, Y)
        importance = clf.feature_importances_
        importance_df = pd.DataFrame(importance, columns=['value'], index=para['CUST_TRAIN_X'])
        with open(curDir + '/importance.txt', 'w') as f:
            importance_df.to_csv(f, encoding='utf-8')
            f.close()
        from sklearn.feature_selection import SelectFromModel
        # model = SelectFromModel(clf, prefit=True)
        # X_new = model.transform(X)
        importance_df = importance_df[importance_df.value > 0.0]
        new_data = trainData[importance_df.index]
        new_data = pd.DataFrame(new_data, dtype='float64')
        X_new = np.array(new_data)
        X_predit = predictData[importance_df.index]   # #predictData[para['CUST_TRAIN_X']]
        X_predit = pd.DataFrame(X_predit, dtype='float64')
        logger.info(X_predit.info())
        X_predit = X_predit.as_matrix()
        ## 模型部分
        X_train, X_test, Y_train, Y_test = train_test_split(X_new, Y)
        tree_clf = tree.DecisionTreeClassifier()


        ##  SMOTE 样本采样
        from imblearn.over_sampling import SMOTE
        sm = SMOTE()
        X_resampled, Y_resampled = sm.fit_sample(X_train, Y_train)
        logger.info('smote前样本量：is_lost= 1, %s, is_lost =0, %s \n', np.sum(Y_train == 1), np.sum(Y_train == 0))
        logger.info('smote后样本量：is_lost= 1, %s, is_lost =0, %s \n', np.sum(Y_resampled == 1),np.sum(Y_resampled == 0))
        resampled_tree = tree_clf.fit(X_resampled, Y_resampled)
        y_resampled_pred = resampled_tree.predict(np.array(X_test))
        resampled_test_rep = classification_report(Y_test, y_resampled_pred)
        with open(curDir + '/resampled_train_rep.txt', 'w') as f:
            f.write(resampled_test_rep)
            f.close()
        # joblib.dump(tree_clf, curDir+'/resampled_decisionTree.model')
        # with open(curDir+ '/resampled_cust_loss_dt.dot', 'w') as outf:
        #     tree.export_graphviz(resampled_tree,
        #                      out_file=outf,
        #                      feature_names=data.columns, #new_data
        #                      class_names='IS_LOST',
                             # leaves_parallel=True,
                             # node_ids=True,
                             # filled=True,
                             # rounded=True,
                             # special_characters=True
                             # )
        # dot -Tpdf tree.dot -o tree.pdf
        # 模型预测结果
        Y_test_resampled_pred = resampled_tree.predict(X_predit)
        Y_resampled_prob = resampled_tree.predict_proba(X_predit)[:, 1]
        predictData['is_lost_predict'] = Y_test_resampled_pred
        predictData['is_lost_prob'] = Y_resampled_prob

        ## 泛化能力结果
        is_lost = pd.DataFrame(predictData['is_lost'], dtype='int')
        resampled_pred_rep = classification_report(np.array(is_lost['is_lost'].tolist()), Y_test_resampled_pred)
        with open(curDir + '/resampled_pred_rep.txt', 'w') as f:
            f.write(resampled_pred_rep)
            f.close()

        ## 非均衡样本情况下
        unresampled_tree = tree_clf.fit(X_train, Y_train)
        y_unresampled_pred = unresampled_tree.predict(np.array(X_test))
        unresampled_test_rep = classification_report(Y_test, y_unresampled_pred)
        with open(curDir + '/unresampled_train_rep.txt', 'w') as f:
            f.write(unresampled_test_rep)
            f.close()
        Y_test_unresampled_pred = unresampled_tree.predict(X_predit)
        Y_unresampled_prob = unresampled_tree.predict_proba(X_predit)[:, 1]
        is_lost = pd.DataFrame(predictData['is_lost'], dtype='int')
        unresampled_pred_rep = classification_report(np.array(is_lost['is_lost'].tolist()), Y_test_unresampled_pred)
        with open(curDir + '/unresampled_pred_rep.txt', 'w') as f:
            f.write(unresampled_pred_rep)
            f.close()
        logger.info("decisionTre model is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                               time.localtime(time.time()))))
    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

try:
    logger.info("model mudule is beginnig at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                      time.localtime(time.time()))))
    # 执行表定义函数
    # createCharactherTable()
    # 执行特征生成函数
    # setCharacters()
    #
    get_predict_data()
    # predictData['etl_time'] = time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
    # # 输出数据
    # with open(curDir+'/custloss_table.csv', 'w') as f:
    #     predictData.to_csv(f, index=False, header=False, encoding='utf-8')
    #     f.close()

    logger.info("model mudule is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                 time.localtime(time.time()))))
except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)