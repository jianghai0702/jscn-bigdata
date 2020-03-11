#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       dwaCharacterTableDdl.py
# **  功能描述:       宽表定义文件（含临时表）
# **  创建者:         sunwj
# **  创建日期:       2017-11-24
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "lossmodel", "custvalue", "offervalue", "result", "offerrec"]
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
para['tmp_dwa_character_1'] = "tmp_dwa_character_1"
para['tmp_dwa_character_2'] = "tmp_dwa_character_2"
para['tmp_dwa_character_3'] = "tmp_dwa_character_3"
para['tmp_dwa_character_4'] = "tmp_dwa_character_4"
para['tmp_dwa_character_5'] = "tmp_dwa_character_5"
para['tmp_dwa_character_6'] = "tmp_dwa_character_6"
para['tmp_dwa_character_7'] = "tmp_dwa_character_7"
para['tmp_dwa_character_8'] = "tmp_dwa_character_8"
para['tmp_dwa_character_9'] = "tmp_dwa_character_9"
para['tmp_dwa_character_10'] = "tmp_dwa_character_10"
#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']

def createCharacterTable():
    try:

        hsqls = ''' drop table if exists %(tmp_dwa_character_1)s#
                    drop table if exists %(tmp_dwa_character_2)s#
                    drop table if exists %(tmp_dwa_character_3)s#
                    drop table if exists %(tmp_dwa_character_4)s# 
                    drop table if exists %(tmp_dwa_character_5)s#
                    drop table if exists %(tmp_dwa_character_6)s#
                    drop table if exists %(tmp_dwa_character_7)s#
                    drop table if exists %(tmp_dwa_character_8)s#
                    drop table if exists %(tmp_dwa_character_9)s#
                    drop table if exists %(tmp_dwa_character_10)s
                       ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')

        # 临时特征表1
        hsql = '''create table if not exists %(tmp_dwa_character_1)s (
                      CUST_ID          STRING,
                      CUST_CODE        STRING,
                      CUST_NAME        STRING,
                      CORP_ORG_ID      STRING,
                      CORP_ORG_NAME    STRING,
                      CUST_LEVEL       STRING,
                      CUST_TYPE        STRING,
                      NET_AGE          STRING
                    ) STORED AS RCFILE
                     LOCATION '%(tmp_path)s/%(tmp_dwa_character_1)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 临时特征表2
        hsql = '''create table if not exists %(tmp_dwa_character_2)s (
                           CUST_ID           STRING,
                           USER_CNT          STRING,
                           ITV_USER_CNT      STRING,
                           FEE_USR_CNT      STRING,
                           dbitv_usr_cnt    STRING,
                           ditv_usr_cnt     STRING,
                           hdtv_usr_cnt     STRING,
                           lan_usr_cnt      STRING
                         ) STORED AS RCFILE
                          LOCATION '%(tmp_path)s/%(tmp_dwa_character_2)s'
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐订购实例表
        hsql = '''create table if not exists %(tmp_dwa_character_3)s
                   (
                         OFFER_ID             STRING,
                         OFFER_INST_ID        STRING,
                         CREATE_DATE          STRING,
                         expire_date          STRING
                      )
                      stored as orcfile
                      LOCATION '%(tmp_path)s/%(tmp_dwa_character_3)s'
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 产品订购实例表
        hsql = '''create table if not exists %(tmp_dwa_character_4)s
                   (
                          prod_inst_id             STRING,
                          srvpkg_id                STRING,
                          offer_inst_id            STRING,
                          prod_type                STRING,
                          create_date              STRING,
                          expire_date              STRING       
                       )
                       stored as orcfile
                       LOCATION '%(tmp_path)s/%(tmp_dwa_character_4)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        # 出账信息
        hsql = '''create table if not exists %(tmp_dwa_character_5)s(
                        prod_inst_id    string,
                        bill_amount_1m  string,
                        bill_amount_3m  string
                   )STORED AS RCFILE
                   LOCATION '%(tmp_path)s/%(tmp_dwa_character_5)s'
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐用户订购信息
        hsql = '''create table if not exists %(tmp_dwa_character_9)s
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
                      LOCATION '%(tmp_path)s/%(tmp_dwa_character_9)s'
                             ''' % para
        hiveClient.hiveExe(hsql)

        # 临时特征表6
        hsql = '''create table if not exists %(tmp_dwa_character_6)s (
                            PROD_INST_ID       STRING,
                            LAST_VOD_DATE      STRING,
                            VOD_DAY_1M         STRING,
                            VOD_NUM_1M         STRING,
                            VOD_AMOUNT_1M     STRING,
                            VOD_DAY_3M         STRING,
                            VOD_NUM_3M         STRING,
                            VOD_AMOUNT_3M     STRING
                            ) STORED AS RCFILE
                             LOCATION '%(tmp_path)s/%(tmp_dwa_character_6)s'
                             ''' % para
        hiveClient.hiveExe(hsql)

        # 临时特征表7
        hsql = '''create table if not exists %(tmp_dwa_character_7)s (
                         PROD_INST_ID       STRING,
                         LAST_TV_DATE       STRING,
                         TV_DAY_1M          STRING,
                         TV_NUM_1M          STRING,
                         TV_DAY_3M          STRING,
                         TV_NUM_3M          STRING
                       ) STORED AS RCFILE
                        LOCATION '%(tmp_path)s/%(tmp_dwa_character_7)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 临时特征表8
        hsql = '''create table if not exists %(tmp_dwa_character_8)s (
                          PROD_INST_ID       STRING,
                          LAST_REVIEW_DATE   STRING,
                          REVIEW_DAY_1M      STRING,
                          REVIEW_NUM_1M      STRING,
                          REVIEW_DAY_3M      STRING,
                          REVIEW_NUM_3M      STRING
                        ) STORED AS RCFILE
                         LOCATION '%(tmp_path)s/%(tmp_dwa_character_8)s'
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 临时特征表9
        hsql = '''create table if not exists %(tmp_dwa_character_10)s (
                      PROD_INST_ID       STRING,
                      dev_age            STRING
                    ) STORED AS RCFILE
                     LOCATION '%(tmp_path)s/%(tmp_dwa_character_10)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        # 流失用户特征
        # hsql = '''create table if not exists %(dwa_usr_list_lost)s (
        #                  PROD_INST_ID       STRING,
        #                  SRVPKG_ID          STRING,
        #                  OFFER_ID           STRING,
        #                  IS_LOST            STRING
        #                ) PARTITIONED BY (PT_MON STRING)
        #                 STORED AS RCFILE
        #                 LOCATION '%(tmp_path)s/%(dwa_usr_list_lost)s'
        #                 ''' % para
        # hiveClient.hiveExe(hsql)


        # 客户的 客户类型、客户级别、入网账龄表定义文件
        hsql = '''create table if not exists %(dwa_base_character_cust)s (
                        CUST_ID          STRING,
                        CUST_CODE        STRING,
                        CUST_NAME        STRING,
                        CORP_ORG_ID      STRING,
                        CORP_ORG_NAME    STRING,
                        CUST_LEVEL       STRING,
                        CUST_TYPE        STRING,
                        NET_AGE          STRING,
                        USER_COUNT       STRING,
                        ITV_USER_COUNT   STRING,
                        FEE_USR_CNT      STRING,
                        dbitv_usr_cnt    STRING,
                        ditv_usr_cnt     STRING,
                        hdtv_usr_cnt     STRING,
                        lan_usr_cnt      STRING,
                        DATA_SOURCE_CD   STRING,
                        ETL_DATE         STRING
                    ) PARTITIONED BY (PT_MON STRING)
                     STORED AS RCFILE
                     LOCATION '%(dw_path)s/%(dwa_base_character_cust)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 用户行为特征
        hsql = '''create table if not exists %(dwa_base_character_usr)s
                   (  
                        PROD_INST_ID           string,
                        BILL_ID                string,
                        IS_MAIN                string,
                        IS_SECOND              string,
                        is_atv                 STRING,
                        is_dtv                 STRING,
                        is_dftv                STRING,
                        is_ditv                STRING,
                        is_lan                 STRING,
                        dev_age                STRING,
                        OFFER_ID               string,        
                        prod_id                string,
                        prod_type              string,
                        type_name              string,
                        create_date_prod       string,
                        expire_date_prod       string,
                        create_date_offer      string,
                        expire_date_offer      string,
                        BILL_AMOUNT_1M         string,
                        BILL_AMOUNT_3M         string,
                        VOD_DAYS_1M            string,
                        VOD_NUM_1M             string,
                        VOD_DURATION_1M        string,
                        VOD_AMOUNT_1M          string,
                        VOD_DAYS_3M            string,
                        VOD_NUM_3M             string,
                        VOD_DURATION_3M        string,
                        VOD_AMOUNT_3M          string,
                        LAST_VOD_DATE          string,
                        TV_DAYS_1M             string,
                        TV_NUM_1M              string,
                        TV_DURATION_1M         string,
                        TV_DAYS_3M             string,
                        TV_NUM_3M              string,
                        TV_DURATION_3M         string,
                        LAST_TV_DATE           string,
                        REVIEW_DAYS_1M          string,
                        REVIEW_NUM_1M          string,
                        REVIEW_DURATION_1M     string,
                        REVIEW_DAYS_3M          string,
                        REVIEW_NUM_3M          string,
                        REVIEW_DURATION_3M     string,
                        LAST_REVIEW_DATE       string,
                        DATA_SOURCE_CD         string,
                        ETL_DATE               string
                   ) PARTITIONED BY (PT_MON STRING)
                     STORED AS RCFILE
                     LOCATION '%(dw_path)s/%(dwa_base_character_usr)s'
                      ''' % para
        hiveClient.hiveExe(hsql)


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

# 执行表定义函数
createCharacterTable()