#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       custValueTableDdl.py
# **  功能描述:       表定义文件
# **  创建者:         sunwj
# **  创建日期:       2017-10-26
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result"]
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
para['tmp_valid_cust_user'] = 'tmp_valid_cust_user'
para['tmp_custvalue_base_info'] = "tmp_custvalue_base_info"
para['tmp_custvalue_busi_info'] = "tmp_custvalue_busi_info"
para['tmp_custvalue_prod_ord'] = "tmp_custvalue_prod_ord"
para['tmp_custvalue_prod_ord_count'] = "tmp_custvalue_prod_ord_count"
para['tmp_custvalue_prod_ord_date'] = "tmp_custvalue_prod_ord_date"
para['tmp_custvalue_bill_info'] = "tmp_custvalue_bill_info"
para['tmp_custvalue_review_info'] = "tmp_custvalue_review_info"
para['tmp_custvalue_vod_info'] = "tmp_custvalue_vod_info"
para['tmp_custvalue_tv_info'] = "tmp_custvalue_tv_info"
para['tmp_custvalue_view_info'] = "tmp_custvalue_view_info"
#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']

def createCharactherTable():

    try:
        logger.info(u'客户价值临时表及最终特征表定义...')
        hsqls = ''' drop table %(tmp_valid_cust_user)s#
                           drop table %(tmp_custvalue_base_info)s#
                           drop table %(tmp_custvalue_busi_info)s#
                           drop table %(tmp_custvalue_prod_ord)s#
                           drop table %(tmp_custvalue_prod_ord_count)s#
                           drop table %(tmp_custvalue_prod_ord_date)s#
                           drop table %(tmp_custvalue_bill_info)s#
                           drop table %(tmp_custvalue_review_info)s#
                           drop table %(tmp_custvalue_vod_info)s#
                           drop table %(tmp_custvalue_tv_info)s#
                           drop table %(tmp_custvalue_view_info)s
               ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')
        # 有效的客户用户关联表信息
        hsql = '''create table if not exists %(tmp_valid_cust_user)s (
                            CUST_ID          STRING,
                            PROD_INST_ID     STRING 
                         ) STORED AS RCFILE
                          LOCATION '%(tmp_path)s/%(tmp_valid_cust_user)s'
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 客户的 客户类型、客户级别、入网账龄临时表
        hsql = '''create table if not exists %(tmp_custvalue_base_info)s (
                               CUST_ID          STRING,
                               CUST_CODE        STRING,
                               CUST_NAME        STRING,
                               CORP_ORG_ID      STRING,
                               CORP_ORG_NAME    STRING,
                               CUST_LEVEL       STRING,
                               CUST_TYPE        STRING,
                               NET_AGE          STRING        
                           ) STORED AS RCFILE
                            LOCATION '%(tmp_path)s/%(tmp_custvalue_base_info)s'
                           ''' % para
        hiveClient.hiveExe(hsql)

        # 客户下的用户数临时表
        hsql = '''create table if not exists %(tmp_custvalue_busi_info)s (
                             CUST_ID          STRING,
                             USER_COUNT       STRING,
                             ITV_USER_COUNT   STRING,
                             FEE_USR_CNT      STRING,
                             dbitv_usr_cnt    STRING,
                             ditv_usr_cnt     STRING,
                             hdtv_usr_cnt     STRING,
                             lan_usr_cnt      STRING
                         ) STORED AS RCFILE
                          LOCATION '%(tmp_path)s/%(tmp_custvalue_busi_info)s'
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 订购临时表
        hsql = '''create table if not exists %(tmp_custvalue_prod_ord)s (
                              PROD_INST_ID     STRING,
                              PROD_ID          STRING,
                              CREATE_DATE      STRING
                      ) STORED AS RCFILE
                      LOCATION '%(tmp_path)s/%(tmp_custvalue_prod_ord)s'
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 近1／3个月的订购产品个数临时表
        hsql = '''create table if not exists %(tmp_custvalue_prod_ord_count)s (
                              PROD_INST_ID     STRING,
                              PROD_COUNT_1m    STRING,
                              PROD_COUNT_3m    STRING
                      ) STORED AS RCFILE
                      LOCATION '%(tmp_path)s/%(tmp_custvalue_prod_ord_count)s'
                   ''' % para
        hiveClient.hiveExe(hsql)

        #最近一次订购时间
        hsql = '''create table if not exists %(tmp_custvalue_prod_ord_date)s (
                             PROD_INST_ID     STRING,
                             LAST_DATE_ORD     STRING
                      ) STORED AS RCFILE
                      LOCATION '%(tmp_path)s/%(tmp_custvalue_prod_ord_date)s'
                   ''' % para
        hiveClient.hiveExe(hsql)


        # 创建 近1个月的账单收入临时表
        hsql = '''create table if not exists %(tmp_custvalue_bill_info)s (
                                 PROD_INST_ID         STRING,
                                 bill_amount_3m       STRING,
                                 bill_amount_1m       STRING
                         ) STORED AS RCFILE
                         LOCATION '%(tmp_path)s/%(tmp_custvalue_bill_info)s'
                      ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月回放用户数据临时表
        hsql = '''create table if not exists %(tmp_custvalue_review_info)s
                     (
                        prod_inst_id         string,
                        LAST_REVIEW_DATE     string,
                        REVIEW_NUM           string,
                        REVIEW_DAYS          string
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_custvalue_review_info)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月点播用户数据临时表
        hsql = '''create table if not exists %(tmp_custvalue_vod_info)s
                     (
                        prod_inst_id           string,
                        LAST_VOD_DATE     string,
                        VOD_NUM           string,
                        VOD_DAYS          string,
                        VOD_FEE           string
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_custvalue_vod_info)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月直播用户数据临时表
        hsql = '''create table if not exists %(tmp_custvalue_tv_info)s
                     (
                        prod_inst_id      string,
                        LAST_TV_DATE      string,
                        TV_NUM            string,
                        TV_TIME           string,
                        TV_DAYS           string
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_custvalue_tv_info)s'
                     ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月用户收视行为表()
        hsql = '''create table if not exists %(tmp_custvalue_view_info)s
                    (
                        prod_inst_id           STRING,
                        VIEW_NUM_1M           STRING,
                        VIEW_DAYS_1M          STRING,
                        LAST_DATE_VIEW         STRING
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_custvalue_view_info)s'
                ''' % para
        hiveClient.hiveExe(hsql)

        # 客户付费信息


        # 创建 客户价值特征表
        hsql = '''create table if not exists %(dwa_cust_value_character)s(
                        cust_id                  string,
                        cust_name                string,
                        corp_org_id              string,
                        corp_org_name            string,
                        cust_type                string,
                        cust_level               string,
                        net_age                  string,
                        user_count               string,
                        itv_usr_cnt              string,
                        fee_usr_cnt              string,
                        dbitv_usr_cnt            string,
                        ditv_usr_cnt             string,
                        hdtv_usr_cnt             string,
                        lan_usr_cnt              string,
                        prod_inst_id             string,    
                        bill_id                  string,
                        bill_amount_1m           string,
                        bill_amount_3m           string,
                        days_from_last_view      string,
                        view_days_1m             string,
                        view_num_1m              string,
                        prod_count_1m            string,
                        prod_count_3m            string,
                        days_from_last_ord       string,
                        data_source_cd           string,
                        etl_date                 string
            ) PARTITIONED BY (pt_mon string)
              stored as orcfile
              LOCATION '%(dw_path)s/%(dwa_cust_value_character)s'
        ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)