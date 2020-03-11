##!/usr/bin/env python
## -*-coding:utf-8 -*-
import logging
import time
import traceback
import csv
import sys
import re
import codecs
import os
reload(sys)
sys.setdefaultencoding('utf8')

logging.basicConfig(level=logging.INFO, format='%(asctime)s %(message)s')

#txt源文件，tar目标文件，txt_dir源文件目录，tar_dir目标文件目录
def csv_from_txt():
    try:
        source_dir='/home/ftpuser/tv/tv_log/'
        in_date = sys.argv[1]
        tar_dir = "/data/tv_data/stg_tv_view_log/"               #目标文件夹
        for root,sub_dirs,files in os.walk(source_dir):
           for txt in files:                                     #将目录下文件名存入队列，循环读取队列
             if re.findall(r'tv_view_log_.*_(\d{8})\.txt',txt)[0] != str(in_date):
                 continue
             file_date = txt.split('.')[0]                       #取文件名后缀名前的部分
             corp_code = txt.split('_')[3]                       #corp_code
             
             logging.info("Start converting: From '" + txt + "' to '" + file_date + ".csv'. ")
             start_time = time.time()
             f = codecs.open(source_dir+txt,"r","gbk")           #用GBK解码打开文件
             sourceInLines = f.readlines()                       #按行读出文件内容
             f.close()
             global data_date                                    #设置日期全局变量,初始值为传入日期
             #data_date=in_date[0:4]+'-'+in_date[4:6]+'-'+in_date[6:8]
             row_count=0
             for line in sourceInLines:                          #循环读取每行数据
                 line=line.strip()                               #去除每行的换行符
                 if len(line.split('||'))<6:
                    continue
                 if re.search(r'\d{4}-\d{2}-\d{2}',line.split('||')[2]) and(line.split('||')[3]=='广播频道' or line.split('||')[3]=='VOD点播' or line.split('||')[3]=='时移节目'):
                    row_count+=1
                    wb=line.replace('||','^')+'^'+corp_code+'^TV'
                    files=codecs.open(tar_dir+file_date+str(row_count/100000).zfill(4),'a','utf-8')     #规定每个文件存放十万条数据
                    files.write(wb+'\n')                        #数据追加写入
                    files.close()
                 else:
                     continue
                   
             logging.info("Finished in %s seconds", time.time() - start_time)
          
    except Exception as e:
        print (str(e) + " " +  traceback.format_exc())
              
csv_from_txt()
