#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       offerRecTableDdl.py
# **  功能描述:       套餐推荐表定义文件
# **  创建者:         sunwj
# **  创建日期:       2017-12-25
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath

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


# 全局参数引入
setPara()
#===========================================================================================
## 临时表
para['tmp_dim_offers'] = 'tmp_dim_offers'
para['tmp_valid_ord_offer'] = "tmp_valid_ord_offer"
para['tmp_valid_ord_prod'] = "tmp_valid_ord_prod"
para['tmp_oferrec_ord_offer'] = "tmp_oferrec_ord_offer"
para['tmp_oferrec_offers'] ='tmp_oferrec_offers'
para['tmp_offerrec_review'] = "tmp_offerrec_review"
para['tmp_offerrec_tv'] = "tmp_offerrec_tv"
para['tmp_offerrec_vod'] = "tmp_offerrec_vod"
para['tmp_dim_prods'] = 'tmp_dim_prods'
#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']

def createCharacterTable():

    try:
        logger.info(u'套餐推荐特征表定义...')
        hsqls = ''' drop table %(tmp_dim_offers)s#
                    drop table %(tmp_dim_prods)s#
                    drop table %(tmp_valid_ord_offer)s#
                    drop table %(tmp_valid_ord_prod)s# 
                    drop table %(tmp_oferrec_offers)s#
                    drop table %(tmp_offerrec_review)s#
                    drop table %(tmp_offerrec_tv)s#
                    drop table %(tmp_offerrec_vod)s
               ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')

        # 创建套餐DIM表
        hsql = '''create table if not exists %(tmp_dim_offers)s
                           (
                               OFFER_ID             STRING
                            )
                            stored as orcfile
                            LOCATION '%(tmp_path)s/%(tmp_dim_offers)s'
                ''' % para
        hiveClient.hiveExe(hsql)

        # 创建产品DIM表
        hsql = '''create table if not exists %(tmp_dim_prods)s
                  (
                      PROD_ID             STRING
                   )
                   stored as orcfile
                   LOCATION '%(tmp_path)s/%(tmp_dim_prods)s'
                        ''' % para
        hiveClient.hiveExe(hsql)


        # 套餐订购实例表
        hsql = '''create table if not exists %(tmp_valid_ord_offer)s
                       (
                             OFFER_ID             STRING,
                             OFFER_INST_ID        STRING,
                             CREATE_DATE          STRING,
                             expire_date          STRING
                          )
                          stored as orcfile
                          LOCATION '%(tmp_path)s/%(tmp_valid_ord_offer)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 产品订购实例表
        hsql = '''create table if not exists %(tmp_valid_ord_prod)s
                         (
                                prod_inst_id             STRING,
                                srvpkg_id                STRING,
                                offer_inst_id            STRING,
                                prod_type                STRING,
                                create_date              STRING,
                                expire_date              STRING       
                             )
                             stored as orcfile
                             LOCATION '%(tmp_path)s/%(tmp_valid_ord_prod)s'
                           ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐用户订购信息
        hsql = '''create table if not exists %(tmp_oferrec_offers)s
                    (
                           prod_inst_id             STRING,
                           offer_id                 STRING,
                           prod_id                  STRING,
                           prod_type                STRING,
                           type_name                STRING,
                           create_date_prod         STRING,
                           expire_date_prod         STRING,
                           create_date_offer        STRING,
                           expire_date_offer        STRING
                        )
                        stored as orcfile
                        LOCATION '%(tmp_path)s/%(tmp_oferrec_offers)s'
                      ''' % para
        hiveClient.hiveExe(hsql)

        #用户行为数据
        # 创建 当月点播用户数据临时表
        hsql = '''create table if not exists %(tmp_offerrec_vod)s
                       (
                           prod_inst_id      string,
                           VOD_NUM           string,
                           VOD_DAYS          string,
                           VOD_FEE           string
                        )
                        stored as orcfile
                        LOCATION '%(tmp_path)s/%(tmp_offerrec_vod)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月直播用户数据临时表
        hsql = '''create table if not exists %(tmp_offerrec_tv)s
                     (
                         prod_inst_id      string,
                         TV_NUM            string,
                         TV_DAYS           string
                      )
                      stored as orcfile
                      LOCATION '%(tmp_path)s/%(tmp_offerrec_tv)s'
                      ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月回放用户数据临时表
        hsql = '''create table if not exists %(tmp_offerrec_review)s
                    (
                        prod_inst_id         string,
                        REVIEW_NUM           string,
                        REVIEW_DAYS          string
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_offerrec_review)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        #创建套餐推荐特征表
        hsql = '''create table if not exists %(dwa_offer_rec_character)s (    
                             PROD_INST_ID           string,
                             IS_MAIN                string,
                             IS_SECOND              string,
                             is_atv                 string,
                             is_dtv                 string,
                             is_dftv                string,
                             is_ditv                string,
                             is_lan                 string,
                             OFFER_ID               string,        
                             prod_id                string,
                             prod_type              string,
                             type_name              string,
                             create_date_prod       string,
                             expire_date_prod       string,
                             create_date_offer      string,
                             expire_date_offer      string,
                             tv_nums                string,
                             tv_days                string,
                             vod_num                string,
                             vod_days               string,
                             vod_fee                string,
                             review_days            string,
                             review_num             string,
                             days_from_last_view    string,
                             bill_amount_1m         string,
                             view_days_1m           string,
                             view_num_1m            string,
                             data_source_cd         string,
                             ETL_DATE               string
                        ) PARTITIONED BY (pt_mon string)
                          STORED AS RCFILE
                          LOCATION '%(dw_path)s/%(dwa_offer_rec_character)s'
                      ''' % para
        hiveClient.hiveExe(hsql)

        # 有效的客户用户关联表信息
    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)
