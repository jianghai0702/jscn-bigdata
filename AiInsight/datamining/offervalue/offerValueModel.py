#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:    offerValueModel.py
# **  功能描述:    套餐价值模型文件
# **  创建者:      sunwj
# **  创建日期:    2017-10-31
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
import os
from os.path import realpath
from sklearn.preprocessing import MinMaxScaler
import pandas as pd
import numpy as np
import time


# 工程目录配置
directory = ["common", "utils", "lossmodel", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from paraUtils import *
from hiveUtils import *
from offerValueTableDdl import *
from offerValueCharacter import *

# 全局参数引入
setPara()
##自定义变量声明
#===========================================================================================

#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']
min_max_scaler = MinMaxScaler()

modelData = pd.DataFrame()
featureData = pd.DataFrame()


def getCharacters():
    """
    
    :return: 
    """
    global modelData, featureData
    try:
        logger.info(u'获取套餐价值特征指标')
        hsql = '''select %(OFFER_VALUE_COLS_STR)s
                  from %(dwa_offer_value_character)s
                  where data_source_cd = 'TZ'
                    and pt_mon = '%(ARG_OPTIME_LASTMON)s' 
        ''' % para
        res = hiveClient.hiveQuery(hsql)
        if res:
            modelData = pd.DataFrame(res, columns=para['OFFER_VALUE_COLS'])
            modelData = modelData.replace('NULL', np.NaN)
            modelData = modelData.replace({None: np.NaN})
            modelData = modelData.replace('', np.NaN)
            modelData = modelData.fillna(0)
            modelData = pd.DataFrame(modelData)
            modelData.drop_duplicates()
            logger.info(modelData.info())

            # 由于不同类型的套餐具有不同类型的业务，为避免业务不同带来的影响，取值为最大值
            vodNum_Agg = modelData.groupby(by=['offer_id'])['offer_vod_num'].agg({'vodNum_Agg':np.max})
            vodDays_Agg = modelData.groupby(by=['offer_id'])['offer_vod_days'].agg({'vodDays_Agg': np.max})
            tvNum_Agg = modelData.groupby(by=['offer_id'])['offer_tv_num'].agg({'tvNum_Agg': np.max})
            tvDays_Agg = modelData.groupby(by=['offer_id'])['offer_tv_days'].agg({'tvDays_Agg': np.max})
            reviewNum_Agg = modelData.groupby(by=['offer_id'])['offer_tv_num'].agg({'reviewNum_Agg': np.max})
            reviewDays_Agg = modelData.groupby(by=['offer_id'])['offer_tv_days'].agg({'reviewDays_Agg': np.max})

            agg_data = vodNum_Agg.join(vodDays_Agg).join(tvNum_Agg).join(tvDays_Agg).join(reviewNum_Agg).\
                join(reviewDays_Agg)
            agg_data['offer_co_num'] = agg_data[['vodNum_Agg','tvNum_Agg','reviewNum_Agg']].max(axis=1)
            agg_data['offer_co_days'] = agg_data[['vodDays_Agg', 'tvDays_Agg', 'reviewDays_Agg']].max(axis=1)
            agg_data['offer_id'] = agg_data.index.values

            modelData = pd.merge(modelData,agg_data,on=['offer_id'],how='outer')

            featureData = modelData[para['OFFER_VALUE_FEATURE_COLS']]
            logger.info(featureData.info())
            featureData = featureData.drop_duplicates()
            featureData[para['OFFER_VALUE_FEATURE_DIM']] = min_max_scaler.fit_transform(
                featureData[para['OFFER_VALUE_FEATURE_DIM']])
            logger.info(featureData.info())
            featureData['offer_loyal'] = 1 - featureData['offer_loyal']
            featureData[para['OFFER_VALUE_FEATURE_DIM']] = featureData[para['OFFER_VALUE_FEATURE_DIM']]*10
            featureData = pd.DataFrame(featureData, columns=para['OFFER_VALUE_FEATURE_COLS'])
            featureData.drop_duplicates()

            # 计算得分
            tmpData = featureData[para['OFFER_VALUE_FEATURE_DIM']]
            tmpData = tmpData.as_matrix()
            tmpData = tmpData * np.asmatrix(para['OFFER_DIM_WIEGTH']).T
            logger.info(tmpData)
            featureData['score'] = tmpData
            featureData.drop_duplicates()
        else:
            raise TypeError(u'数据集为空，请检查原始数据')
            sys.exit(1)
    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

try:
    logger.info("model mudule is beginnig at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                      time.localtime(time.time()))))
    # createCharactherTable()
    # setCharacters()
    getCharacters()
    logger.info(featureData.describe())
    featureData = featureData.drop_duplicates()
    with open('/sunwj_tmp/offervalue_table.csv', 'w') as f:
        featureData.to_csv(f, header=False, index=False, encoding='utf-8')
        f.close()
    with open('/sunwj_tmp/offervalue_report.csv', 'w') as f1:
        featureData.to_csv(f1, index=False, encoding='utf-8')
        f.close()
    logger.info("model mudule is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                      time.localtime(time.time()))))
except Exception as ex:
    logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)