#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userScoreSim.py
# **  功能描述:       计算最终的用户评分值
# **  创建者:         sunwj
# **  创建日期:       2018-02-23
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
import sys
import os
from os.path import realpath
import time
from hdfs import InsecureClient
from json import dumps
# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result", "userrecm"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)


supData = {}
scoreSim = {}
# client = Client("http://111.208.67.23:50070", proxy='hdfs')
client = InsecureClient("http://111.208.67.23:50070", user='hdfs')



def get_all_data():
    """

    :return: 
    """
    global supData, scoreSim

    try:
        get_item_data_1()
    except Exception as ex:
        print(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

    finally:
        try:
            get_item_data_2()
        except Exception as ex:
            print(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)

def get_item_data_1():
    """
    获取用户共同评价的信息
    :return: 
    """
    global supData

    hdfs_path = '/user/hdfs/dm/mrscripts/user_common'
    files = client.parts(hdfs_path)
    for file in files:
        with client.read(hdfs_path + os.sep + file, encoding='utf-8', delimiter='\n') as reader:
            print("{file} start at: {times}".format(file=file, times=time.strftime('%Y-%m-%d %H:%M:%S',
                                                                         time.localtime(time.time()))))
            for line in reader:
                line = line.strip()
                line = line.split('\t')
                if len(line) == 2:
                    values = line[0].split('"')[1].split(',')
                    flag = float(values[1]) + float(values[3]) - int(line[1])
                    if flag != 0:
                        # =0 时为异常数据 抛弃
                        sup = float(line[1]) / flag
                        supData[values[0] + ',' + values[2]] = [sup, float(line[1])]

def get_item_data_2():
    """

    :return: 
    """
    global scoreSim, supData
    # 用户评分相似度 初始值
    hdfs_path = '/user/hdfs/dm/mrscripts/user_score_sim'
    files = client.parts(hdfs_path)
    for file in files:
        with client.read(hdfs_path + os.sep + file, encoding='utf-8', delimiter='\n') as reader:
            print("{file} start at: {times}".format(file=file,times=time.strftime('%Y-%m-%d %H:%M:%S',
                                                                     time.localtime(time.time()))))
            for line in reader:
                line = line.strip()
                line = line.split('\t')
                if len(line) == 2:
                    values = line[0].split('"')[1]
                    print(values)
                    flag = str(values) in supData.keys()
                    print(flag)
                    if flag:
                        sim = supData[values][0] * float(line[1]) / supData[values][1]
                        print(sim)
                        # data = "{user1},{user2},{sim}".format(user1=values[0], user2=values[1], sim=sim)
                        # append_to_hdfs('/user/hdfs/dm/mrscripts/user_sim',
                        #                str(values[0]) + ',' + str(values[1]) + ',' + str(sim) + '\n')
                        scoreSim[values[0] + ',' + values[1]] = sim
    values = set(scoreSim) & set(supData)
    client.write('/user/hdfs/dm/mrscripts/user_sim', data=dumps(values), encoding='utf-8', overwrite=False,
                 append=True)

def append_to_hdfs(hdfs_path, data):
    """

    :param hdfs_path: 
    :param data: 
    :return: 
    """
    client.write('/user/hdfs/dm/mrscripts/user_sim', data=data, encoding='utf-8',overwrite=False, append=True)


if __name__ == "__main__":
    print("model mudule is start at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                 time.localtime(time.time()))))
    get_all_data()  # 执行脚本

    print("model mudule is end at {}".format(time.strftime('%Y-%m-%d %H:%M:%S',
                                                                   time.localtime(time.time()))))
