#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userRecmModel.py
# **  功能描述:       用户推荐模型
# **  创建者:         sunwj
# **  创建日期:       2017-02-01
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
import sys
import os
from os.path import realpath
import pandas as pd
import numpy as np
from scipy import sparse
from sklearn.preprocessing import LabelEncoder, MinMaxScaler,LabelBinarizer
from sklearn.cluster import KMeans
import gc
from itertools import combinations

stand_scalar = MinMaxScaler()
lb = LabelBinarizer()

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result", "userrecm"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from hiveUtils import hiveClient
from paraUtils import *
from userRecmTableDdl import *

# 全局参数引入
setPara()
##自定义变量声明
# 获取参数
tmp = vars()
para = tmp['para']

modelData = pd.DataFrame()
scoreData = pd.DataFrame()
userAttrData = pd.DataFrame()
le = LabelEncoder()
userAttrSim = pd.DataFrame(columns=['PROD_INST_ID2','PROD_INST_ID2','ATTR_SIM'])

def getModelData():
    """
    获取模型所需要的数据
    :return: 
    """
    global  modelData
    try:
        hsql = ''' select DISTINCT %(USER_REC_COLS_STR)s
                   from %(dwa_user_rec_character)s
                   WHERE pt_time = '%(ARG_OPTIME_LASTMON)s'
                     AND CONTENT_ID is not null
        ''' % para

        res = hiveClient.hiveQuery(hsql)
        modelData = pd.DataFrame(res, columns=para['USER_REC_COLS'])
        modelData = modelData.replace('NULL', np.NaN)
        modelData = modelData.replace(' ', np.NaN)
        modelData = modelData.replace({None: 0})
        modelData['DEV_AGE'] = modelData['DEV_AGE'].fillna('0.1') # 对于缺失"年龄"数据，以0.1填充
        modelData = modelData.fillna('0')
        modelData = modelData.drop_duplicates()
        modelData['VOD_CNT'] = modelData['VOD_CNT'].astype('float64')


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


def get_user_content_score():
    """
    数据预处理
    :return: 
    """
    global  modelData, scoreData

    scoreData = modelData[['USER_LABEL','CONTENT_ID','VOD_CNT']]

    # 用户群体对每个资产的评分 = 观看次数／总次数
    sumData = scoreData.groupby(by=['USER_LABEL'])['VOD_CNT'].agg({'VOD_SUM': np.sum})
    # 用户观看的资产总数
    cntData = scoreData.groupby(by=['USER_LABEL'])['CONTENT_ID'].agg({'TOTAL_ITEM_CNT': np.size})
    aggData = sumData.join(cntData)
    aggData = aggData.reset_index()
    aggData = aggData.drop_duplicates()

    scoreData = pd.merge(scoreData, aggData, how='left', on=['USER_LABEL'], right_index=False)
    scoreData = scoreData.reset_index()
    scoreData = scoreData.drop_duplicates()
    scoreData['ITEM_SCORE'] = scoreData['VOD_CNT'] / scoreData['VOD_SUM']
    # scoreData['ATTR_WEIGHT'] = scoreData


    # 用户群体 评分中位数 大于中位数为正向 小于中位数为负向
    medianData = scoreData.groupby(by=['USER_LABEL'])['ITEM_SCORE'].agg({'SCORE_MEDIAN': np.median})
    medianData = medianData.reset_index()
    medianData = medianData.drop_duplicates()

    scoreData = pd.merge(scoreData, medianData, how='left', on=['USER_LABEL'], right_index=False)
    scoreData = scoreData.reset_index()
    scoreData = scoreData.drop_duplicates()
    scoreData['M_ITEM_SCORE'] = scoreData['ITEM_SCORE']-scoreData['SCORE_MEDIAN']

def cal_user_cluster():
    """
    用户分群, 暂时2000个群体
    :return: 
    """
    global modelData
    train_data = modelData[para['USER_FEATURE']]
    train_data = train_data.drop_duplicates()
    logger.info(train_data.info())
    # train_data = stand_scalar.fit_transform(train_data)
    train_X = pd.DataFrame(train_data[para['USER_SIM_ATTR']], columns=para['USER_SIM_ATTR'], dtype='float64')
    train_X = train_X.as_matrix()
    try:
        curModel = KMeans(n_clusters=100).fit(train_X)
        # centers = curModel.cluster_centers_
        labels = curModel.labels_
        logger.info(len(labels))
        train_data['USER_LABEL'] = labels
        logger.info(train_data.info())
        modelData = pd.merge(modelData, train_data[['PROD_INST_ID','USER_LABEL']], on=['PROD_INST_ID'], how='left')
        modelData = modelData.drop_duplicates()
        logger.info(modelData.info())
    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下 \n %s', ex)



try:
    getModelData()

    # 用户群体聚类
    cal_user_cluster()

    get_user_content_score()
    # cal_user_attr_sim()
    data = scoreData[['USER_LABEL', 'CONTENT_ID', 'ITEM_SCORE', 'M_ITEM_SCORE', 'TOTAL_ITEM_CNT']]
    data = data.drop_duplicates()
    # userList = data[['PROD_INST_ID']]
    # userList = userList.drop_duplicates()
    # contentList = data[['CONTENT_ID']]
    # contentList = contentList.drop_duplicates()

    with open(curDir + '/usergroup_content_score.data', 'w') as f1:
        data.to_csv(f1, index=False, header=False, encoding='utf-8')
        f1.close()

    # with open(curDir + '/user_list.data','w') as f:
    #     userList.to_csv(f, header=False, encoding='utf-8')
    #     f.close()
    #
    # with open(curDir + '/content_list.data', 'w') as f:
    #     contentList.to_csv(f, header=False, encoding='utf-8')
    #     f.close()


    # with open(curDir + '/user_attr_sim.data','w') as f2:
    #     userAttrSim.to_csv(f2, index=False, header=False,encoding='utf-8')
    #     f2.close()

except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)