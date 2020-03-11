#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       custValueModel.py
# **  功能描述:       客户价值分类模型
# **  创建者:         sunwj
# **  创建日期:       2017-10-26
# **  修改日志:      分箱时，数据特征分布不均匀，需要特殊处理分割点
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

from sklearn.cluster import KMeans
from sklearn.metrics import silhouette_score,silhouette_samples
import numpy as np
import pandas as pd
import time
import sys
import os
from os.path import realpath
from sklearn.preprocessing import MinMaxScaler,LabelBinarizer
from sklearn import tree
import pydotplus
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
from custValueTableDdl import *
from custValueCharacter import *

# 全局参数引入
setPara()
tmp = vars()
para = tmp['para']

# model global variables
modelData = pd.DataFrame()  # 模型的特征数据集
modelResult = pd.DataFrame()  # 模型的结果集
custData = pd.DataFrame()  #
usrData = pd.DataFrame()

stand_scalar = MinMaxScaler()
lb = LabelBinarizer()

def get_optK(data):
    """
    get the optmistic K 
    :param data: 
    :return: 
    """
    sc_scores={}
    for k in range(2,10):
        try:
            curModel = KMeans(n_clusters=k).fit(data)
            labels = curModel.labels_
            sc_score = silhouette_score(data, labels,sample_size=len(labels))
            sc_scores[k] = np.mean(sc_score)
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下 \n %s', ex)
    optK = sorted(dict,key=lambda x:dict[x])[-1]
    return optK

def _cutData(data,flag):
    """
    :param data: pd.DataFrame or array_like data ,sigle column 
    :return: list 
    """
    tmp = data.drop_duplicates()
    if len(tmp) > 6:
        labels = [1, 2, 3, 4, 5, 6]
    elif len(tmp) == 1:
        labels = [1]
    elif len(tmp) > 1 and len(tmp) <= 6:
        labels = [i+1 for i in range(len(tmp))]
    else:
        raise TypeError(u'输入的数据格式有误，请检查')

    bins = list(pd.cut(data, len(labels), labels=labels, retbins=True)[0])
    if flag:
        bins.reverse()
        return bins
    else:
        return bins


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
       label = u'重要价值客户'
   elif code_str == '011':
       label = u'重要保持客户'
   elif code_str == '101':
       label = u'重要发展客户'
   elif code_str == '001':
       label = u'重要挽留客户'
   elif code_str == '100':
       label = u'一般发展客户'
   elif code_str == '110':
       label = u'一般价值客户'
   elif code_str == '010':
       label = u'一般保持客户'
   elif code_str == '000':
       label = u'一般挽留客户'
   return code_str, label


def getCharacter():
    """
    get the characters of cust and then deal the data
    :return: 
    """
    global modelData,modelResult
    try:
        hsql = ''' select distinct %(CUST_VALUE_FEATURE_STR)s
                    from %(dwa_cust_value_character)s  
                    where pt_mon = '%(ARG_OPTIME_LASTMON)s'
        ''' % para
        res = hiveClient.hiveQuery(hsql)
        if res:
            modelData = pd.DataFrame(res, columns=para['CUST_VALUE_FEATURE'])
            modelData = modelData.replace('NULL', np.NaN)
            modelData = modelData.replace({None: np.NaN})
            modelData = modelData.replace('', np.NaN)
            modelData = modelData.fillna(0)
            #
            modelData['bill_amount_3m'] = modelData['bill_amount_3m'].astype('float64')
            modelData['bill_amount_1m'] = modelData['bill_amount_1m'].astype('float64')
            billAgg = modelData.groupby(by=['cust_id'])['bill_amount_3m'].agg({'bill_amount_h':np.sum})
            billAgg['cust_id'] = billAgg.index.values
            billAgg['bill_amount_h'] = billAgg['bill_amount_h'].astype('float64')
            modelData = pd.merge(modelData, billAgg, on=['cust_id'], how='left')

            #
            R_Agg = modelData.groupby(by=['cust_id'])['days_from_last_view'].agg({'RecencyAgg': np.min})
            F1_Agg = modelData.groupby(by=['cust_id'])['view_num_1m'].agg({'FrequencyAgg1': np.max})
            F2_Agg = modelData.groupby(by=['cust_id'])['view_days_1m'].agg({'FrequencyAgg2': np.max})
            M_Agg = modelData.groupby(by=['cust_id'])['bill_amount_1m'].agg({'MonetaryAgg': np.sum})
            aggData = R_Agg.join(F1_Agg).join(F2_Agg).join(M_Agg)
            aggData = pd.DataFrame(aggData, dtype='float64')
            aggData['cust_id'] = aggData.index.values

            ## 分箱计算得分
            aggData['R_S'] = _cutData(aggData.RecencyAgg, flag=True)
            aggData['F1_S'] = _cutData(aggData.FrequencyAgg1, flag=False)
            aggData['F2_S'] = _cutData(aggData.FrequencyAgg2, flag=False)
            aggData['M_S'] = _cutData(aggData.MonetaryAgg, flag=True)
            # 权重 WR = 2 WF1 = 1.5 WF2=1.5 WM = 5
            aggData['RFM'] = 2 * aggData.R_S + 1.5 * aggData.F1_S + 1.5 * aggData.F2_S + 5 * aggData.M_S
            logger.info(aggData.info())
            modelData = pd.merge(modelData, aggData[['cust_id','RecencyAgg','FrequencyAgg1','FrequencyAgg2',
                                                     'MonetaryAgg','R_S','F1_S','F2_S','M_S','RFM']],
                                 on=['cust_id'], how='left')
            rfm_agg = modelData.groupby(by=['cust_id'])['RFM'].agg({'rfm_avg': np.mean})
            rfm_agg['cust_id'] = rfm_agg.index.values
            modelData = pd.merge(modelData, rfm_agg[['cust_id', 'rfm_avg']], on=['cust_id'], how='left')
            modelData['R'] = modelData['RecencyAgg']
            modelData['F'] = modelData['FrequencyAgg2']
            modelData['M'] = modelData['MonetaryAgg']
            modelData = modelData.drop_duplicates()
            modelData = modelData.reset_index()

            # kmeans 聚类
            # rfm_model()  # 计算用户的RFM分数
            kmeans_clf()
            modelResult['etl_time'] = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time()))
            modelResult = modelResult.drop_duplicates()

        else:
            raise TypeError(u'数据集为空,请检查数据')
            sys.exit(1)
    except Exception as e:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', e)


def rfm_model():
    """
    RFM_score based on the prod_inst_id
    :return: 
    """
    global modelData
    try:
        modelData['bill_amount_1m'] = modelData['bill_amount_1m'].astype('float64')
        R_Agg = modelData.groupby(by=['prod_inst_id'])['days_from_last_view'].agg({'RecencyAgg': np.min})
        F1_Agg = modelData.groupby(by=['prod_inst_id'])['view_num_1m'].agg({'FrequencyAgg1': np.max})
        F2_Agg = modelData.groupby(by=['prod_inst_id'])['view_days_1m'].agg({'FrequencyAgg2': np.max})
        M_Agg = modelData.groupby(by=['prod_inst_id'])['bill_amount_1m'].agg({'MonetaryAgg': np.sum})
        aggData = R_Agg.join(F1_Agg).join(F2_Agg).join(M_Agg)
        aggData = pd.DataFrame(aggData, dtype='float64')
        aggData['prod_inst_id'] = aggData.index.values
        aggData[['RecencyAgg','FrequencyAgg1','FrequencyAgg2','MonetaryAgg']] = stand_scalar.fit_transform(
            aggData[['RecencyAgg','FrequencyAgg1','FrequencyAgg2','MonetaryAgg']])

        ## 分箱计算得分
        aggData['R_S'] = _cutData(aggData.RecencyAgg, flag=True)
        aggData['F1_S'] = _cutData(aggData.FrequencyAgg1, flag=False)
        aggData['F2_S'] = _cutData(aggData.FrequencyAgg2,flag=False)
        aggData['M_S'] = _cutData(aggData.MonetaryAgg, flag=True)
        # 权重 WR = 2 WF1 = 1.5 WF2=1.5 WM = 5
        aggData['RFM'] = 2 * aggData.R_S + 1.5 * aggData.F1_S + 1.5 * aggData.F2_S + 5 * aggData.M_S
        logger.info(aggData.info())
        modelData = pd.merge(modelData, aggData[['prod_inst_id', 'RFM']],on=['prod_inst_id'],how='left')
        rfm_agg = modelData.groupby(by=['cust_id'])['RFM'].agg({'rfm_avg':np.mean})
        rfm_agg['cust_id'] = rfm_agg.index.values

        modelData = pd.merge(modelData, rfm_agg[['cust_id', 'rfm_avg']], on=['cust_id'], how='left')
        logger.info(modelData.info())
        logger.info(modelData.describe())

        # 方案2 用户RFM 客户的RFM值加权


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)



def kmeans_clf():
    '''
    kmeans聚类
    :param data: 
    :return: 
    '''
    global modelData, modelResult
    train_X = modelData[['R','F','M']] #para['CUSTVALUE_KMEANS_COLS']
    train_X = stand_scalar.fit_transform(train_X)
    train_X = pd.DataFrame(train_X, columns=['R','F','M'], dtype='float64')
    avg_all = train_X.mean()
    avg_all = pd.DataFrame(np.array(avg_all.values).reshape((1, 3)), columns=avg_all.index.values)
    train_X = train_X.as_matrix()
    # k = get_optK(train_X)

    try:
        curModel = KMeans(n_clusters=8).fit(train_X)
        centers = curModel.cluster_centers_
        labels = curModel.labels_
        modelData['cust_label'] = labels
        modelData['value_label'] = labels
        modelData['value_code'] = labels
        for i in range(len(centers)):
            center = pd.DataFrame(np.array(centers[i]).reshape((1,3)),columns=['R','F','M'])
            code,fact_label = getFactCode(center,avg_all)
            modelData.loc[modelData['cust_label'] == i, 'value_label'] = fact_label
            modelData.loc[modelData['cust_label'] == i, 'value_code'] = code
        logger.info(modelData.describe())
        modelResult = modelData[para['CUSTVALUE_RESULT_COLS']]
        # decision tree
        dummY = lb.fit_transform(labels)
        dummX = train_X
        tree_clf = tree.DecisionTreeClassifier(max_depth=3)
        tree_clf = tree_clf.fit(dummX, dummY)
        # with open('/sunwj_tmp/cust_value.dot','w') as outf:
        #     tree.export_graphviz(tree_clf,
        #                          feature_names=['R', 'F', 'M'],
        #                          out_file=outf,
        #                          filled=True,
        #                          rounded=True,
        #                          special_characters=True,
        #                          )
            # graph = pydotplus.graph_from_dot_data(dot_data)
            # graph.write_pdf("/sunwj_tmp/cust_value.pdf")

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下 \n %s', ex)


try:
    logger.info("model mudule is beginnig at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                 time.localtime(time.time()))))
    # 执行表定义文件
    createCharactherTable()

    # 生成特征
    setCharacters()

    # 计算目标客户价值
    getCharacter()

    with open(curDir+'/custvalue_table.csv','w') as f:
        modelResult.to_csv(f, header=False, index=False, encoding='UTF-8')
        f.close()
    with open(curDir+'/custvalue_report.csv','w') as f:
        modelResult.to_csv(f, index=False, encoding='UTF-8')
        f.close()

    logger.info("model mudule is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                      time.localtime(time.time()))))
except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)