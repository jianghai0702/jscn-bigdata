#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       offerRecModel.py
# **  功能描述:       套餐推荐模型
# **  创建者:         sunwj
# **  创建日期:       2018-01-04
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
reload(sys)
sys.setdefaultencoding('utf8')

import os
from os.path import realpath
import pandas as pd
import numpy as np
import codecs
from sklearn.cluster import KMeans, MiniBatchKMeans, DBSCAN
from sklearn.preprocessing import MinMaxScaler, LabelEncoder
from sklearn import metrics

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from hiveUtils import hiveClient
from paraUtils import *
from offerRecTableDdl import *
from offerRecCharacter import *
from aprioriRules import *


setPara()

tmp = vars()
para = tmp['para']

modelData =pd.DataFrame()
clusterData = pd.DataFrame()
stand_scala = MinMaxScaler()
le = LabelEncoder()
transactions = {} # 事务集
recRules = pd.DataFrame(columns=('VALUE_CODE', 'OFFER_IDS', 'OFFER_LIST_RECM', 'CONF'))
modelData1 = pd.DataFrame(columns=('VALUE_CODE','PROD_INST_ID','OFFER_IDS'))
resultData = pd.DataFrame()
idx = 0

def getCharacters():
    """
    获取指标特征值
    :return: 
    """
    global modelData, userData, clusterData
    try:
        logger.info(u'获取模型所需的特征指标')

        hsql = ''' select %(OFFER_REC_COLS_STR)s 
                   from %(dwa_offer_rec_character)s
                   where pt_mon = '%(ARG_OPTIME_LASTMON)s'
        ''' % para

        res = hiveClient.hiveQuery(hsql)
        if res:
            modelData = pd.DataFrame(res, columns=para['OFFER_REC_COLS'])
            modelData = modelData.replace('NULL', np.NaN)
            modelData = modelData.replace({None: np.NaN})
            modelData = modelData.replace('', np.NaN)
            modelData = modelData.fillna(0)
            modelData = modelData.drop_duplicates()
            modelData['BILL_AMOUNT_1M'] = modelData['BILL_AMOUNT_1M'].astype('float64')

            clusterData = modelData[para['OFFER_REC_USER_COL']]
            clusterData = clusterData.drop_duplicates()
            clusterData = clusterData.reset_index()

        else:
            raise TypeError(u'数据集为空,请检查数据')
            sys.exit(1)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


def usrCluster():
    """
     用户聚类／价值分类
    :return: 
    """
    global clusterData, modelData
    try:
        train_data = clusterData[para['OFFER_REC_CLUSTER']]
        train_data = stand_scala.fit_transform(train_data)
        train_data = pd.DataFrame(train_data, columns=para['OFFER_REC_CLUSTER'], dtype='float64')
        #
        avg_all = train_data[['DAYS_FROM_LAST_VIEW', 'VIEW_DAYS_1M', 'BILL_AMOUNT_1M']]
        avg_all = avg_all.mean()
        avg_all = pd.DataFrame(np.array(avg_all.values).reshape((1, 3)), columns=avg_all.index.values)
        avg_all['R'] = avg_all['DAYS_FROM_LAST_VIEW']
        avg_all['F'] = avg_all['VIEW_DAYS_1M']
        avg_all['M'] = avg_all['BILL_AMOUNT_1M']
        avg_all = avg_all[['R','F','M']]

        ##
        train_data = train_data.as_matrix()
        curModel = KMeans(n_clusters = 30, max_iter=500).fit(train_data)
        centers = curModel.cluster_centers_
        labels = curModel.labels_
        ##
        clusterData['USR_LABEL'] = labels
        modelData = pd.merge(modelData, clusterData[['PROD_INST_ID', 'USR_LABEL']], on=['PROD_INST_ID'], how='left')
        modelData['VALUE_LABEL'] = modelData['USR_LABEL']
        modelData['VALUE_CODE'] = modelData['USR_LABEL']
        samples_per_class = np.bincount(labels, minlength=len(list(set(labels))))
        logger.info(samples_per_class)
        # score = metrics.silhouette_score(train_data, labels, metric='euclidean')
        # logger.info(score)
        for i in range(len(centers)):
            center = pd.DataFrame(np.array(centers[i]).reshape((1, 16)), columns=para['OFFER_REC_CLUSTER'])
            center['R'] = center['DAYS_FROM_LAST_VIEW']
            center['F'] = center['VIEW_DAYS_1M']
            center['M'] = center['BILL_AMOUNT_1M']
            code, fact_label = getFactCode(center, avg_all)
            modelData.loc[modelData['USR_LABEL'] == i, 'VALUE_LABEL'] = fact_label
            modelData.loc[modelData['USR_LABEL'] == i, 'VALUE_CODE'] = code
        # samples_per_label = np.bincount(modelData['VALUE_CODE'].tolist(), minlength=len(list(set(labels))))
        with codecs.open(curDir + '/modelData.csv', 'w', 'UTF-8') as f:
            modelData.to_csv(f, index=False, encoding='UTF-8')
            f.close()

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

def createTransactions(data,label):
    """
    生成有效的交易记录集合
    :param data: 
    :return: 
    """
    global modelData1, idx
    transactions = []
    if not data.empty:
        users = data['PROD_INST_ID'].tolist()
        users = list(set(users))
        for user in users:
            curDf = data[data.PROD_INST_ID == user]
            curDf = curDf['OFFER_ID'].tolist()
            curOffers = list(set(curDf))
            curOffers.sort()
            modelData1.loc[idx] = np.array([label, user, '#'.join(str(offer) for offer in curOffers)])
            idx += 1
            transactions.append(curOffers)
    else:
        raise TypeError(u'数据集为空')
    return transactions

def generate_rec_list():
    """
    生成用户产品推荐表 用户信息|用户价值信息|意向产品列表（推荐列表）
    无推荐列表选项的补充：1 新产品推荐
                      2 客户希望推广的产品推荐
    :param transactions: 事务集和
    :return: 
    """
    global recRules, modelData, modelData1,resultData
    # 生成 transactions集合
    unique_labels = modelData['VALUE_CODE'].unique()
    i_row = 0
    for label in unique_labels:
        curData = modelData[modelData.VALUE_CODE == label]
        curData = curData[['PROD_INST_ID', 'OFFER_ID']]
        curSaction = createTransactions(curData,label)
        # 生成每个价值类别下的关联规则
        logger.info(i_row)
        L, sup = generate_frequent_items(curSaction, 0.005)
        rec_rule = generate_rules(L, sup, 0.001)
        for item in rec_rule:
                recRules.loc[i_row] = np.array([label, '#'.join(item[0]), '#'.join(item[1]), item[2]])
                i_row += 1

    indexs = list(recRules[recRules.OFFER_IDS == recRules.OFFER_LIST_RECM].index)
    recRules = recRules.drop(indexs,1)
    with codecs.open(curDir + '/recRules.csv', 'w', 'UTF-8') as f1:
        recRules.to_csv(f1, index=False, encoding='UTF-8')
        f1.close()

    modelData1 = modelData1.drop_duplicates()
    # modelData1 = modelData1.reset_index()
    logger.info(modelData1.info())

    modelData1 = pd.merge(modelData[['PROD_INST_ID','IS_MAIN','IS_SECOND','IS_ATV', 'IS_DTV', 'IS_DITV',
                                                'IS_DFTV','IS_LAN','VALUE_LABEL']], modelData1,
                          on=['PROD_INST_ID'],how='left',right_index=False)
    modelData1 = modelData1.drop_duplicates()
    # modelData1 = modelData1.reset_index()
    logger.info(modelData1.info())

    with codecs.open(curDir + '/modelData1.csv', 'w', 'UTF-8') as f:
        modelData1.to_csv(f, index=False, encoding='UTF-8')
        f.close()


    resultData = pd.merge(modelData1, recRules,on=['VALUE_CODE','OFFER_IDS'],how='left',right_index=False)
    resultData = resultData.drop('VALUE_CODE', 1)
    resultData = resultData.drop_duplicates()
    # resultData = resultData.reset_index()
    logger.info(resultData.info())

    with open(curDir + '/offerrec_table.csv', 'w') as f:
        resultData.to_csv(f, header=False, index=False,encoding='utf-8')
        f.close()
    with open(curDir + '/offerrec_report.csv', 'w') as f:
        resultData.to_csv(f, index=False, encoding='utf-8')
        f.close()

def gener_result():
    """
    生成最终的推荐表 用户基本信息|用户价值信息|推荐列表
    :return: 
    """
    global resultData



def getFactCode(data, means):
   """
    定义实际的类别常量
   :param data: 
   :param means: 
   :return: 
   """
   code = [0,0,0]
   label = ""
   if (data.R <= means.R).all():
       code[0] = 1
   if (data.F >= means.F).all():
       code[1] = 1
   if (data.M >= means.M).all():
       code[2] = 1

   code_str = ''.join(str(x) for x in code).replace(' ','')
   if code_str == '111':
       label = u'重要价值用户'
   elif code_str == '011':
       label = u'重要保持用户'
   elif code_str == '101':
       label = u'重要发展用户'
   elif code_str == '001':
       label = u'重要挽留用户'
   elif code_str == '100':
       label = u'一般发展用户'
   elif code_str == '110':
       label = u'一般价值用户'
   elif code_str == '010':
       label = u'一般保持用户'
   elif code_str == '000':
       label = u'一般挽留用户'
   return code_str, label


try:
    # createCharacterTable()
    # setCharacters()
    getCharacters()
    usrCluster()
    generate_rec_list()
except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)