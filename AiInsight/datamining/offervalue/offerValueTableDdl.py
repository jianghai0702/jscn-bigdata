#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:    offerValueTableDdl.py
# **  功能描述:    套餐价值表定义文件
# **  创建者:      sunwj
# **  创建日期:    2017-10-31
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
import os
from os.path import realpath

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

# 全局参数引入
setPara()
##自定义变量声明
# ===========================================================================================
para['tmp_valid_offer_sub2']        =  'tmp_valid_offer_sub2'
para['tmp_valid_offer_sub1']        =  'tmp_valid_offer_sub1'
para['tmp_valid_offer']             =  'tmp_valid_offer'
para['tmp_offervalue_grow']         =  'tmp_offervalue_grow'
para['tmp_offervalue_loyal']        =  'tmp_offervalue_loyal'
para['tmp_offervalue_health']       =  'tmp_offervalue_health'
para['tmp_offervalue_arpu_sub']     =  'tmp_offervalue_arpu_sub'
para['tmp_offervalue_arpu']         =  'tmp_offervalue_arpu'
para['tmp_offervalue_important']    =  'tmp_offervalue_important'
para['tmp_offervalue_review']       =  'tmp_offervalue_review'
para['tmp_offervalue_vod']          =  'tmp_offervalue_vod'
para['tmp_offervalue_tv']           =  'tmp_offervalue_tv'
para['tmp_offervalue_view']         =  'tmp_offervalue_view'

# ===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']


def createCharactherTable():
    try:
        logger.info(u'套餐价值表定义文件')

        hsqls = ''' 
                   drop table %(tmp_valid_offer_sub1)s#
                   drop table %(tmp_valid_offer_sub2)s#
                   drop table %(tmp_valid_offer)s#
                   drop table %(tmp_offervalue_grow)s#
                   drop table %(tmp_offervalue_loyal)s#
                   drop table %(tmp_offervalue_health)s#
                   drop table %(tmp_offervalue_arpu_sub)s#
                   drop table %(tmp_offervalue_arpu)s#
                   drop table %(tmp_offervalue_important)s#
                   drop table %(tmp_offervalue_view)s#
                   drop table %(tmp_offervalue_vod)s#
                   drop table %(tmp_offervalue_review)s#
                   drop table %(tmp_offervalue_tv)s
                      ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')

        # 统计期内有效的套餐订购信息
        hsql = '''create table if not exists %(tmp_valid_offer_sub1)s
                   (
                       OFFER_ID             STRING,
                       OFFER_INST_ID        STRING,
                       CREATE_DATE          STRING       
                    )
                    stored as orcfile
                    LOCATION '%(tmp_path)s/%(tmp_valid_offer_sub1)s'
                                ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''create table if not exists %(tmp_valid_offer_sub2)s
                    (
                        prod_inst_id           STRING,
                        srvpkg_id              STRING,
                        offer_inst_id          STRING       
                     )
                     stored as orcfile
                     LOCATION '%(tmp_path)s/%(tmp_valid_offer_sub2)s'
                    ''' % para
        hiveClient.hiveExe(hsql)


        hsql = '''create table if not exists %(tmp_valid_offer)s
                  (
                      OFFER_ID             STRING,
                      SRVPKG_ID            STRING,
                      PROD_INST_ID         STRING,
                      CREATE_DATE          STRING       
                   )
                   stored as orcfile
                   LOCATION '%(tmp_path)s/%(tmp_valid_offer)s'
                        ''' % para
        hiveClient.hiveExe(hsql)


        # 套餐成长性

        hsql = '''create table if not exists %(tmp_offervalue_grow)s
                  (
                      OFFER_ID          STRING,
                      NEW_CNT_3M        STRING,
                      TOTAL_CNT         STRING   
                   )
                   stored as orcfile
                   LOCATION '%(tmp_path)s/%(tmp_offervalue_grow)s'
                        ''' % para
        hiveClient.hiveExe(hsql)



        # 套餐忠诚度
        hsql = '''create table if not exists %(tmp_offervalue_loyal)s
                   (
                       OFFER_ID                STRING,
                       OFFER_LOST_CNT_3M       STRING,
                       OFFER_EXPIRE_CNT_3M     STRING
                    )
                    stored as orcfile
                    LOCATION '%(tmp_path)s/%(tmp_offervalue_loyal)s'
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐健康度
        hsql = '''create table if not exists %(tmp_offervalue_health)s
                   (
                       OFFER_ID                STRING,
                       OFFER_HE                STRING
                    )
                    stored as orcfile
                    LOCATION '%(tmp_path)s/%(tmp_offervalue_health)s'
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐ARPU 1
        hsql = '''create table if not exists %(tmp_offervalue_arpu_sub)s
                  (
                       OFFER_ID            STRING,
                       OFFER_NAME          STRING,
                       OFFER_CREATE_DATE   STRING,
                       srvpkg_id           STRING,
                       OFFER_CYCLE         STRING,
                       OFFER_CHARGE        STRING  
                   )
                   stored as orcfile
                   LOCATION '%(tmp_path)s/%(tmp_offervalue_arpu_sub)s'
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐ARPU 2
        hsql = '''create table if not exists %(tmp_offervalue_arpu)s
                          (
                               OFFER_ID            STRING,
                               OFFER_NAME          STRING,
                               OFFER_ARPU          STRING 
                          )
                           stored as orcfile
                           LOCATION '%(tmp_path)s/%(tmp_offervalue_arpu)s'
                                ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐重要性
        hsql = '''create table if not exists %(tmp_offervalue_important)s
                        (
                             OFFER_ID            STRING,
                             OFFER_IM            STRING 
                        )
                         stored as orcfile
                         LOCATION '%(tmp_path)s/%(tmp_offervalue_important)s'
                              ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐消费量
        # 创建 当月回放用户数据临时表
        hsql = '''create table if not exists %(tmp_offervalue_review)s
                            (
                               prod_inst_id         string,
                               LAST_REVIEW_DATE     string,
                               REVIEW_NUM           string,
                               REVIEW_DAYS          string
                            )
                            stored as orcfile
                            LOCATION '%(tmp_path)s/%(tmp_offervalue_review)s'
                            ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月点播用户数据临时表
        hsql = '''create table if not exists %(tmp_offervalue_vod)s
                            (
                               prod_inst_id      string,
                               LAST_VOD_DATE     string,
                               VOD_NUM           string,
                               VOD_DAYS          string,
                               vod_fee           string
                            )
                            stored as orcfile
                            LOCATION '%(tmp_path)s/%(tmp_offervalue_vod)s'
                            ''' % para
        hiveClient.hiveExe(hsql)

        # 创建 当月直播用户数据临时表
        hsql = '''create table if not exists %(tmp_offervalue_tv)s
                            (
                               prod_inst_id      string,
                               LAST_TV_DATE      string,
                               TV_NUM            string,
                               TV_DAYS           string
                            )
                            stored as orcfile
                            LOCATION '%(tmp_path)s/%(tmp_offervalue_tv)s'
                            ''' % para
        hiveClient.hiveExe(hsql)

        # 收视行为消费量
        hsql = '''create table if not exists %(tmp_offervalue_view)s
                       (
                            OFFER_ID                STRING,
                            OFFER_TV_NUM            STRING,
                            OFFER_TV_DAYS           STRING,
                            OFFER_REVIEW_NUM        STRING,
                            OFFER_REVIEW_DAYS        STRING,
                            OFFER_VOD_NUM           STRING,
                            OFFER_VOD_DAYS           STRING
                       )
                       stored as orcfile
                       LOCATION '%(tmp_path)s/%(tmp_offervalue_view)s'
                       ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐价值特征
        hsql = '''create table if not exists %(dwa_offer_value_character)s
                     (
                          OFFER_ID                STRING,
                          OFFER_NAME              STRING,
                          offer_grow              STRING,
                          offer_loyal             STRING,
                          offer_health            STRING,
                          offer_arpu              STRING,
                          offer_important         STRING,
                          offer_tv_num            STRING,  
                          offer_tv_days           STRING,
                          offer_review_num        STRING,
                          offer_review_days       STRING,
                          offer_vod_num           STRING,
                          offer_vod_days          STRING,
                          data_source_cd          STRING,
                          etl_date                STRING
                     ) PARTITIONED BY (pt_mon string)
                      stored as orcfile
                      LOCATION '%(dw_path)s/%(dwa_offer_value_character)s'
                                     ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)