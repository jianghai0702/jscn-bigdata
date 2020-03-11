#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  tv_channel_xls_to_csv.py
# Purpose     :  获取本地频道的节目单
#
# Author      :  sunwj
#
# CreatedDate :  2019-06-25 14:06
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------
import re
import csv
import chardet
import os, io, sys
import datetime
from collections import defaultdict
import pandas as pd
import numpy as np
reload(sys)
sys.setdefaultencoding("utf-8")

# 通过指定表单名的方式来读取
source_path = '/AiInsight/channels/local_channels/' #'/Users/sunwj/Downloads/4.29-6.2/'
target_path = '/AiInsight/channels/locals_'
file_dicts = {}
for root, dirs, files in os.walk(source_path):
    print(files)
    for file in files:
        file_name = os.path.join(root, file)
        date_info = re.findall(r'[0-9]+', file_name.split('/')[-1])
        print(file_name,date_info)
        start_date = datetime.datetime(2019, int(date_info[0]), int(date_info[1]))
        dates = [[i+1, (start_date+datetime.timedelta(days=i)).strftime('%Y%m%d')] for i in range(7)]
        dates = pd.DataFrame(dates, columns=['days', 'pt_time'])
        df = pd.read_excel(file_name, sheet_name='bdprogram')  # 可以通过sheet_name来指定读取的表单
        df = pd.merge(df, dates, how='left', left_on='dayofwk', right_on='days')
        df.drop('days', axis=1, inplace=True)
        for i in range(7):
            curDate = (start_date+datetime.timedelta(days=i)).strftime('%Y%m%d')
            curDf = df[df['pt_time'] == curDate]
            with open(target_path + curDate + '.csv', 'a') as file:
                # 追加方式写入
                curDf.to_csv(file, index=False, header=False)
                file.close()







