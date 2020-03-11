#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userRecmCharacter.py
# **  功能描述:       用户推荐指标特征
# **  创建者:         sunwj
# **  创建日期:       2017-01-29
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
from userRecmTableDdl import *
# 全局参数引入
setPara()
##自定义变量声明
# ===========================================================================================
# ===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']


def setCharacters():
    """

    :return: 
    """
    try:

        # 执行表定义函数
        createCharacterTable()


        # 生成 点播用户数据
        hsql = '''insert overwrite table %(tmp_user_recm_character_1)s
                  select user_id PROD_INST_ID
                         ,content_id
                         ,film_name
                         ,count(user_id) VOD_NUM
                         ,count(distinct to_date(regexp_replace(start_time,'/','-'))) VOD_DAYS
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                    and data_source_cd <> 'VOD'
                  group by user_id,content_id,film_name
                   ''' % para
        hiveClient.hiveExe(hsql)


        # 用户推荐特征表
        hsql = '''insert overwrite table %(dwa_user_rec_character)s partition (PT_TIME ='%(ARG_OPTIME_LASTMON)s')
                  select distinct t.prod_inst_id
                         ,t.is_main
                         ,t.is_second
                         ,t.is_atv
                         ,t.is_dtv
                         ,t.is_dftv
                         ,t.is_ditv
                         ,t.is_lan
                         ,t.dev_age
                         ,t1.content_id
                         ,nvl(t1.film_name,'')
                         ,nvl(split(t1.film_name,' ')[0],'')
                         ,nvl(t1.vod_cnt,0)
                         ,nvl(t1.vod_duration,0)
                         ,'TZ' 
                         ,CURRENT_TIMESTAMP  
                  from %(dwa_base_character_usr)s t 
                  left join %(tmp_user_recm_character_1)s t1 on t.prod_inst_id = t1.prod_inst_id
                  where t.pt_mon = '%(ARG_OPTIME_LASTMON)s'
                  ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


setCharacters()