##!/usr/bin/env python
## -*-coding:utf-8 -*-
import logging
import time
import traceback
import xlrd
import csv
import sys
import re
from datetime import datetime
from xlrd import xldate_as_tuple

logging.basicConfig(level=logging.INFO, format='%(asctime)s %(message)s')

#xls源文件，tar目标文件，xls_dir源文件目录，tar_dir目标文件目录
def csv_from_excel():
    xls = sys.argv[1]
    tar = xls.split('.')[0]
    xls_dir = "/home/ftpuser/boss/"
    tar_dir = "/data/boss_data/stg_product/"

    logging.info("Start converting: From '" + xls + "' to '" + tar + ".csv'. ")

    try:
        start_time = time.time()
        wb = xlrd.open_workbook(xls_dir+xls)
        #统计表单数
        count = len(wb.sheets())
        for sheet_index in range(0,count):
          target = tar_dir+tar+str(sheet_index)+".csv"
          logging.info(target)
          sh = wb.sheet_by_index(sheet_index)
          csvFile = open(target, 'wb')
          wr = csv.writer(csvFile, quoting=csv.QUOTE_ALL)
          #行处理
          for row in xrange(sh.nrows):
              #去掉第一页前面两行和最后一页后面两行
              if (sheet_index==0 and row==0):
                continue
              rowValues = sh.row_values(row)
              newValues = []
              #列处理，需要加一列城市
              for col in xrange(sh.ncols+1):
                  if (col==sh.ncols):
                      #提取文件名中的城市
                      strValue = xls.split('_')[1]
                  else:
                      #取单元格数据
                      if isinstance(sh.cell(row,col).value, unicode):
                          strValue = (str(sh.cell(row,col).value.encode("utf-8")))
                      else:
                          strValue = (str(sh.cell(row,col).value))
                  #去除异常字符
                  strValue=strValue.replace('\t','')
                  strValue=strValue.replace('\'','')
                  strValue=strValue.replace('\"','')
                  strValue=strValue.replace(',','')
                  strValue=strValue.replace('\^','')
                  isInt = bool(re.match("^([0-9]+)\.0$", strValue))
                  #数据类型清洗
                  if isInt:
                      strValue = int(float(strValue))
                  else:
                      isFloat = bool(re.match("^([0-9]+)\.([0-9]+)$", strValue))
                      isLong  = bool(re.match("^([0-9]+)\.([0-9]+)e\+([0-9]+)$", strValue))
          
                      if isFloat:
                          strValue = float(strValue)
          
                      if isLong:
                          strValue = int(float(strValue))
                  newValues.append(strValue)
          
              wr.writerow(newValues)
          
        csvFile.close()
              
        logging.info("Finished in %s seconds", time.time() - start_time)
          
    except Exception as e:
        print (str(e) + " " +  traceback.format_exc())
              
csv_from_excel()
