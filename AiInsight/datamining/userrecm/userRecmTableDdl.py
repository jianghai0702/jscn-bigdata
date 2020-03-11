#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userRecmTableDdl.py
# **  功能描述:       用户推荐指标表定义
# **  创建者:         sunwj
# **  创建日期:       2017-01-26
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import copy
import sys
import os
from os.path import realpath
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

# 全局参数引入
setPara()
#===========================================================================================
## 临时表
para['tmp_user_recm_character_1'] = "tmp_user_recm_character_1"
#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']

def createCharacterTable():
    try:

        hsqls = ''' drop table if exists %(tmp_user_recm_character_1)s
                       ''' % para
        hiveClient.hiveBatchExe(hsqls, '#')

        #

        # 用户点播信息基础表 duration 实际为空的数据
        hsql = '''create table if not exists %(tmp_user_recm_character_1)s (
                     PROD_INST_ID          STRING,
                     CONTENT_ID            STRING,
                     FILM_NAME             STRING,
                     VOD_CNT               STRING,
                     VOD_DURATION          STRING
                   ) STORED AS RCFILE
                    LOCATION '%(tmp_path)s/%(tmp_user_recm_character_1)s'
                       ''' % para
        hiveClient.hiveExe(hsql)

        #
        # 按天更新数据??
        hsql = '''create table if not exists %(dwa_user_rec_character)s(
                      PROD_INST_ID          STRING,
                      IS_MAIN               STRING,
                      IS_SECOND             STRING,
                      is_atv                STRING,
                      is_dtv                STRING,
                      is_dftv               STRING,
                      is_ditv               STRING,
                      is_lan                STRING,
                      DEV_AGE               STRING,
                      CONTENT_ID            STRING,
                      SUB_FILM_NAME         STRING,
                      FILM_NAME             STRING,
                      VOD_CNT               STRING,
                      VOD_DURATION          STRING,
                      data_source_cd        STRING,
                      etl_time              STRING
                    )PARTITIONED BY (PT_TIME STRING)
                     STORED AS RCFILE
                     LOCATION '%(dw_path)s/%(dwa_user_rec_character)s'
                        ''' % para
        hiveClient.hiveExe(hsql)


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)
