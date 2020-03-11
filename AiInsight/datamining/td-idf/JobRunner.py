#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/8/9
@author: wanju Sun
@group : 
@contact: 
"""
import datetime
import os

from tdidfPkg.WordCntPerDoc import WordCntPerDoc

os.environ['HADOOP_HOME'] = '/opt/cloudera/parcels/CDH/lib/hadoop/'
mode ='hadoop'

## 计算单词在文档中出现的次数
print("WordCntPerDoc begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
input_file_names = ['hdfs://nameservice1/sunwj/map_input_file/doc0',
                    'hdfs://nameservice1/sunwj/map_input_file/doc1',
                    'hdfs://nameservice1/sunwj/map_input_file/doc2']
#
output_dir = "hdfs://nameservice1/sunwj/map_input_file/wordcntperdoc"
aargs = ['-r', mode, '--no-output']
aargs.extend(input_file_names)
aargs.extend(['-o', output_dir])
mr_job = WordCntPerDoc(args=aargs)
with mr_job.make_runner() as runner:
    runner.run()
print("WordCntPerDoc end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))