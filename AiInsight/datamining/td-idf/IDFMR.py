#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/8/10
@author: wanju Sun
@group : 
@contact: 
"""

from __future__ import division
from mrjob.job import MRJob
import os
import math

class IDFMR(MRJob):

    def mapper(self, _, line):
        totalDocs = 3  #已知
        input_file = os.environ['mapreduce_map_input_file']
        docName = input_file.split('/t')[-1]  # hdfs test
        # docName = os.path.splitext(input_file.split('/t')[-1])[0]  #local test
        if docName == "tf":
            word, strs = line.split('\t')
            word = eval(word)
            doc, wordCnt, wordTf = eval(strs).split(',')
            yield word, ['a', doc+'#'+str(wordCnt)+'#'+str(wordTf)]
        elif docName == 'worddocscnt':
            word, cnt = line.split('\t')
            word = eval(word)
            idf = math.log(float(totalDocs)/float(cnt))
            yield word, ['b', cnt+'#'+str(idf)]


    def reducer(self, key, values):
        myDict1 = {}
        myDict2 = {}
        for flag, strs in values:
            if flag == 'a':
                myDict1[key] = strs
            elif flag == 'b':
                myDict2[key] = strs
                ##
                inters = set(myDict1.keys()).intersection(set(myDict2.keys()))
                if inters:
                    for inKey in inters:
                        doc,wordCnt,wordTF = myDict1[inKey].split('#')
                        docCnt,wordIdf = myDict2[inKey].split('#')
                        del myDict1[inKey]
                        del myDict2[inKey]
                        yield key, '%s,%s,%s,%s,%s' %(doc,wordCnt,docCnt,wordTF,wordIdf)


if __name__ == "__main__":
    IDFMR.run()