#!/usr/bin/env python
# -*-coding:utf-8 -*-
# **-----------------------------------------------------------------------------------------------
# **  文件名称:       hiveUtils.py
# **  功能描述:       hive工具类
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
# **  修改日志:
# **  修改日期:
# **-----------------------------------------------------------------------------------------------
import os
import sys
from pyhs2 import connect
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result","userrecm"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
print(PROJ_HOME)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *


hv_host = 'jsgd6'
hv_port = 10000
hv_user = "hdfs"
hv_password = ""
hv_database = 'default'
hv_authMechanism = 'PLAIN'

class HiveClient(object):
    '''definition the utils'''
    def __init__(self, hv_host, hv_port, hv_authMechanism, hv_user, hv_password, hv_database):
        try:
            self._cnn = connect(host=hv_host,
                                port=hv_port,
                                authMechanism=hv_authMechanism,
                                user=hv_user,
                                password=hv_password,
                                database=hv_database)
            # self._cnn.setdecoding(pyodbc.SQL_CHAR, encoding='utf-8')
            self._cursor = self._cnn.cursor()
            self._query = None
            self._res = None
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


    # 查询结果 有返回结果集
    def hiveQuery(self, hsql):
        try:
            logger.info('Executive sql is:\n%s', hsql)
            self._cursor.execute(hsql)
            self._res = self._cursor.fetchall()
            logger.info('Successful implementation of this sql')
            return self._res
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

    # 执行单条语句，无返回值
    def hiveExe(self, hsql):
        try:
            logger.info('Executive sql is:\n%s', hsql)
            self._cursor.execute(hsql)
            logger.info('Successful implementation of this sql')
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

    # 批量执行多条语句
    def hiveBatchExe(self, hsqls, separator):
        hsqls = hsqls.split(separator)
        for hsql in hsqls:
            try:
                logger.info('Executive sql is:\n%s', hsql)
                self._cursor.execute(hsql)
                logger.info('Successful implementation of this sql')
            except Exception as ex:
                logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

    # 执行结束，释放资源
    def hiveEnd(self):
        try:
            logger.info(u'程序正在退出')
            self._cursor.close()
            self._cnn.close()
            sys.exit(1)
        except Exception as ex:
            logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

    # 本地CSV文件数据加载到hive
    def loadTohive(self):
        pass



hiveClient = HiveClient(hv_host,
                        hv_port,
                        hv_authMechanism,
                        hv_user,
                        hv_password,
                        hv_database)
