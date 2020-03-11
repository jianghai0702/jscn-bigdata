#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  tv_channel_xml_csv.py
# Purpose     :  省级卫视央视直播收视频道配置信息数据xml处理成csv文件
#
# Author      :  sunwj
#
# CreatedDate :  2019-06-13 13:45
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------

import xml.dom.minidom as xmldom
from xml.dom import Node
import re
import csv
import chardet
import os, io, sys
import datetime
from collections import defaultdict
reload(sys)
sys.setdefaultencoding("utf-8")

def create_csv(path):
     with open(path, "w+", newline='\n') as file:
         # linux换行符
         csv_file = csv.writer(file)
         head = ["channelCode", "channelName", 'createTime', 'eventId',
                 'programName', 'begintime', 'duration', 'endtime',
                 'eventtype', 'language']
         csv_file.writerow(head)


def replaceXmlEncoding(filepath):
    try:
        if os.path.splitext(filepath)[1] == '.xml':
            f = open(filepath, 'rb')
            data = f.read()
            codes = chardet.detect(data)['encoding']
            f.close()
            f = io.open(filepath, 'r',encoding=codes, errors='ignore') #errors='ignore'
            content = f.read()  #文本方式读入
            content = re.sub(codes, "UTF-8", content) #替换encoding头
            f.close()
            f = open(filepath, 'w')  # 写入
            f.write(content)
            f.close()
        else:
            pass
    except:
        return

def getChannelProgram(file,channelAttr,subProgramObj, date):
    try:
        dom = xmldom.parse(file)
        root = dom.documentElement
        for child in dom.childNodes:
            if child.nodeType == Node.ELEMENT_NODE:
                for key in child.attributes.keys():
                    attr = child.attributes[key]
                    channelAttr[attr.name] = attr.value
        for child in root.childNodes:
            if child.nodeType == Node.ELEMENT_NODE:
                for key in child.attributes.keys():
                    attr = child.attributes[key]
                    channelAttr[attr.name] = attr.value
        subProgramObj['Name'] = dom.getElementsByTagName('Name')  # Name
        subProgramObj['Event'] = dom.getElementsByTagName('Event')  # Event
        subProgramObj['EventText'] = dom.getElementsByTagName('EventText')  # EventText
        with open("/AiInsight/channels/provice_"+ date +'.csv', "a") as csvfile:
            writer = csv.writer(csvfile)
            for i in range(len(subProgramObj['Name'])):
                createTime = channelAttr['creationtime']
                createTime = datetime.datetime(int(createTime[0:4]), int(createTime[4:6]), int(createTime[6:8]),
                                               int(createTime[8:10]), int(createTime[10:12]), int(createTime[12:14])
                                               )
                beginTime = subProgramObj['Event'][i].getAttribute('begintime')
                beginTime = datetime.datetime(int(beginTime[0:4]), int(beginTime[4:6]), int(beginTime[6:8]),
                                              int(beginTime[8:10]), int(beginTime[10:12]), int(beginTime[12:14])
                                              )
                duration = subProgramObj['Event'][i].getAttribute('duration')
                endTime = beginTime + datetime.timedelta(hours=int(duration[0:2]),
                                                         minutes=int(duration[2:4]),
                                                         seconds=int(duration[4:6])
                                                         )
                duration = int(duration[0:2]) * 3600 + int(duration[2:4]) * 60 + int(duration[4:6])
                writer.writerow([channelAttr['code'],
                                 channelAttr['name'],
                                 createTime,
                                 subProgramObj['Event'][i].getAttribute('eventid'),
                                 subProgramObj['Name'][i].childNodes[0].data,
                                 beginTime,
                                 duration,
                                 endTime,
                                 subProgramObj['Event'][i].getAttribute('eventtype'),
                                 subProgramObj['EventText'][i].getAttribute('language')
                                 ])
            csvfile.close()
    except Exception as e:
        print(e)


path = '/AiInsight/channels/csEPG2019.6/' #'/Users/sunwj/Downloads/'
files_dict = defaultdict(list)
for root, dirs, files in os.walk(path):
    for file in files:
        file_name = os.path.join(root, file)
        # print(root.split('/'), root.split('/')[-1], re.findall(r'[0-9]+', root.split('/')[-1]))
        ss = root.split('/')[-1]
        files_dict[ss].append(file_name)
print("files  done")
# for dir, files in files_dict.items():
#     for file in files:
#         replaceXmlEncoding(file)
for dir, files in files_dict.items():
    cur_date = re.findall(r'[0-9]+', dir)
    print(cur_date)
    if int(cur_date[1]) < 10:
        cur_date[1] = '0'+ cur_date[1]
    if int(cur_date[2]) < 10:
        cur_date[2] = '0' + cur_date[2]
    cur_date = ''.join(cur_date)
    print(cur_date)
    for file in files:
        channelAttr = {}
        subProgramObj = {}
        getChannelProgram(file, channelAttr, subProgramObj, cur_date)
        os.remove(file)

