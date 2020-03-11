#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       lossModelTableDdl.py
# **  功能描述:       表定义文件
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
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
from dataUtils import *

# 全局参数引入
setPara()
#===========================================================================================
## 临时表
para['tmp_cust_base_info']       =   "tmp_cust_base_info"
para['tmp_cust_busi_info']       =   "tmp_cust_busi_info"
para['tmp_cust_dev_info']        =   "tmp_cust_dev_info"
para['tmp_cust_itv_info']        =   "tmp_cust_itv_info"
para['tmp_cust_expire_info']     =   "tmp_cust_expire_info"
para['tmp_cust_prod_ord_info']   =   "tmp_cust_prod_ord_info"
para['tmp_cust_bill_info']       =   "tmp_cust_bill_info"
para['tmp_cust_vod_info']        =   "tmp_cust_vod_info"
para['tmp_cust_tv_info']         =   "tmp_cust_tv_info"
para['tmp_cust_review_info']     =   "tmp_cust_review_info"
para['tmp_valid_user']           =   "tmp_valid_user"
#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']


def createCharactherTable():
    try:
        logger.info(u'客户价值临时表及最终特征表定义...')

        hsqls = ''' drop table %(tmp_cust_base_info)s#
                    drop table %(tmp_cust_busi_info)s#
                    drop table %(tmp_cust_dev_info)s#
                    drop table %(tmp_cust_itv_info)s#
                    drop table %(tmp_cust_expire_info)s#
                    drop table %(tmp_cust_prod_ord_info)s#
                    drop table %(tmp_cust_bill_info)s#
                    drop table %(tmp_cust_vod_info)s#
                    drop table %(tmp_cust_tv_info)s#
                    drop table %(tmp_cust_review_info)s#
                    drop table %(tmp_valid_user)s
                       ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')

        hsql_1 = '''create table if not exists %(tmp_cust_base_info)s (
                        CUST_ID          STRING,
                        CUST_CODE        STRING,
                        CUST_NAME        STRING,
                        CORP_ORG_ID      STRING,
                        CORP_ORG_NAME    STRING,
                        CUST_LEVEL       STRING,
                        CUST_TYPE        STRING,
                        NET_AGE          STRING
                    ) STORED AS RCFILE
                     LOCATION '%(tmp_path)s/%(tmp_cust_base_info)s'
                    ''' % para

        hsql_2 = '''create table if not exists %(tmp_cust_busi_info)s (
                           CUST_ID              STRING,
                           USER_COUNT           STRING,
                           ITV_USER_COUNT       STRING
                       ) STORED AS RCFILE
                        LOCATION '%(tmp_path)s/%(tmp_cust_busi_info)s'
                       ''' % para

        hsql_3 = '''create table if not exists %(tmp_cust_dev_info)s (
                               prod_inst_id        STRING,
                               dev_age             STRING
                           ) STORED AS RCFILE
                            LOCATION '%(tmp_path)s/%(tmp_cust_dev_info)s'
                           ''' % para

        hsql_4 = '''create table if not EXISTS %(tmp_cust_itv_info)s(
                            prod_inst_id             STRING,
                            ITV_USE_AGE              STRING
                        ) STORED AS RCFILE
                         LOCATION '%(tmp_path)s/%(tmp_cust_itv_info)s'
                        ''' % para

        hsql_5 = '''create table  if not EXISTS %(tmp_cust_expire_info)s(
                             prod_inst_id   string,
                             is_itv_offer   string,
                             expire_days    string
                        ) STORED AS RCFILE
                          LOCATION '%(tmp_path)s/%(tmp_cust_expire_info)s'
                ''' % para

        hsql_6 = '''create table if not exists %(tmp_cust_prod_ord_info)s(
                          prod_inst_id          string,
                          ord_prod_count_1m     string,
                          ord_prod_count_3m     string
                     )STORED AS RCFILE
                     LOCATION '%(tmp_path)s/%(tmp_cust_prod_ord_info)s'
                   ''' % para

        hsql_7 = '''create table if not exists %(tmp_cust_bill_info)s(
                       prod_inst_id    string,
                       bill_amount_1m  string,
                       bill_amount_3m  string
                  )STORED AS RCFILE
                  LOCATION '%(tmp_path)s/%(tmp_cust_bill_info)s'
            ''' % para

        # 点播数据
        hsql_8 = ''' create table if not exists %(tmp_cust_vod_info)s (
                              prod_inst_id            string,
                              vod_day_1m              string,
                              vod_num_1m              string,
                              vod_day_3m              string,
                              vod_num_3m              string,
                              vod_amount_1m           string,
                              vod_amount_3m           string
                       )STORED AS RCFILE
                        LOCATION '%(tmp_path)s/%(tmp_cust_vod_info)s'
                       ''' % para


        # 直播数据
        hsql_9 = '''create table if not exists %(tmp_cust_tv_info)s (
                              prod_inst_id                string,
                              tv_day_1m              string,
                              tv_num_1m              string,
                              tv_day_3m              string,
                              tv_num_3m              string
                        )STORED AS RCFILE
                         LOCATION '%(tmp_path)s/%(tmp_cust_tv_info)s'
                      ''' % para

        # 回放数据
        hsql_10 = '''create table if not exists %(tmp_cust_review_info)s (
                              prod_inst_id                string,
                              review_day_1m           string,
                              review_num_1m           string,
                              review_day_3m           string,
                              review_num_3m           string
                          )STORED AS RCFILE
                          LOCATION '%(tmp_path)s/%(tmp_cust_review_info)s'
                        ''' % para

        # 有效的用户表(需要预测的用户)
        hsql_11 = '''create table if not exists %(tmp_valid_user)s (
                              cust_id              string,
                              prod_inst_id         string,
                              bill_id              string,
                              is_main              string,
                              is_second            string
                       )STORED AS RCFILE
                        LOCATION '%(tmp_path)s/%(tmp_valid_user)s'       
        ''' % para

        # 统计月份即将到期用户（重点预测为即将到期用户和销户的用户，销户和流失的用户都将不会出现在用户全量表中）
        hsql_12 = '''create table if not exists %(dwa_usr_list_expire)s (
                          prod_inst_id           string,
                          expire_date            string,
                          left_days_to_expire    string                 
                   ) PARTITIONED BY (pt_mon string)
                   STORED AS RCFILE
                   LOCATION '%(dw_path)s/%(dwa_usr_list_expire)s'
        ''' % para

        # 流失用户表
        # 流失规则 用户套餐到期后 两个月内均无续费或购买其他产品行为 通过用户月全量表和历史订购表选择判断流失用户
        hsql_13 = '''create table if not exists %(dwa_usr_list_loss)s(
                          prod_inst_id  string,
                          is_lost       string
                    )PARTITIONED BY (pt_mon string)
                    STORED AS RCFILE
                    LOCATION '%(dw_path)s/%(dwa_usr_list_loss)s' 
        ''' % para

        # 流失特征数据质量审核
        hsql_14 = '''create table if not exists %(dwa_data_check_loss)s(
                                     count         string, 
                                     mean          string,
                                     std           string,
                                     min           string,
                                     one_quart     string,
                                     two_quart     string,
                                     three_quart   string,
                                     max           string,
                                     tablename     string,
                                     cols          string
                          ) PARTITIONED BY (pt_mon string)
                            row format delimited fields terminated by ',' 
                            STORED AS TEXTFILE
                            LOCATION '%(dw_path)s/%(dwa_data_check_loss)s' 
                        ''' % para

        hsqls = hsql_1 + '#' + hsql_2 + '#' + hsql_3 + '#' + hsql_4 + '#' + hsql_5 + '#' + hsql_6 + '#' + \
                hsql_7 + '#' + hsql_8 + '#' + hsql_9 + '#' + hsql_10 + '#' + hsql_11 + '#' + hsql_12 + '#' + \
                hsql_13 + '#' + hsql_14
        hiveClient.hiveBatchExe(hsqls, '#')

        hsql = '''create table if not exists %(dwa_cust_loss_character)s
                   (    CYCLE_ID               string,
                        CUST_ID                string,
                        CUST_CODE              string,
                        CUST_NAME              string,
                        CORP_ORG_ID            string,
                        CORP_ORG_NAME          string,
                        CUST_TYPE              string,
                        CUST_LEVEL             string,
                        NET_AGE                string,
                        USER_COUNT             string,
                        ITV_USER_COUNT         string,
                        ITV_ACTIVE             string,
                        PROD_INST_ID           string,
                        BILL_ID                string,
                        IS_MAIN                string,
                        IS_SECOND              string,
                        DEV_AGE                string,
                        ITV_USE_AGE            string,
                        ITV_EXPIRE_DAYS        string,
                        NOT_ITV_EXPIRE_DAYS    string,
                        ORD_PROD_COUNT_1M      string,
                        ORD_PROD_COUNT_3M      string,
                        ORD_PROM_NUM_1M        string,
                        ORD_PROM_NUM_3M        string,
                        BILL_AMOUNT_1M         string,
                        BILL_AMOUNT_3M         string,
                        OPEN_DAYCNT_1M         string,
                        OPEN_CNT_1M            string,
                        OPEN_DAYCNT_3M         string,
                        OPEN_CNT_3M            string,
                        VOD_DAY_1M             string,
                        VOD_NUM_1M             string,
                        VOD_DURATION_1M        string,
                        VOD_AMOUNT_1M          string,
                        VOD_DAY_3M             string,
                        VOD_NUM_3M             string,
                        VOD_DURATION_3M        string,
                        VOD_AMOUNT_3M          string,
                        TV_DAY_1M              string,
                        TV_NUM_1M              string,
                        TV_DAY_3M              string,
                        TV_NUM_3M              string,
                        REVIEW_DAY_1M          string,
                        REVIEW_NUM_1M          string,
                        REVIEW_DAY_3M          string,
                        REVIEW_NUM_3M          string,
                        IS_LOST                string,
                        DATA_SOURCE_CD         string,
                        ETL_DATE               string
                   ) PARTITIONED BY (pt_mon string)
                     STORED AS RCFILE
                     LOCATION '%(dw_path)s/%(dwa_cust_loss_character)s'
              ''' % para
        hiveClient.hiveExe(hsql)


       # hiveClient.hiveEnd()
    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)