#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/8/9
@author: wanju Sun
@group : 
@contact: 
"""
from __future__ import division
from mrjob.job import MRJob
import os

class TFMR(MRJob):

    def mapper(self, _, line):
        input_file = os.environ['mapreduce_map_input_file']
        # docName = input_file.split('/t')[-1]  # hdfs test
        docName = os.path.splitext(input_file.split('/t')[-1])[0]  #local test
        if docName == 'wordcntperdoc':
            keys, cnt = line.split('\t')
            word, doc = eval(keys).split(',')
            yield doc, ['a', word+'#'+cnt]
        elif docName == 'docwordscnt':
            doc, cnts = line.split('\t')
            yield eval(doc), ['b', cnts]

    def reducer(self, key, values):
        dict1 = { }
        dict2 = { }
        for flag, strs in values:
            if flag == 'a':
                if key in dict1.keys():
                    dict1[key].append(strs)
                else:
                    dict1[key] = [strs]
            if flag == 'b':
                dict2[key] = strs
            inters = set(dict1.keys()).intersection(dict2.keys())
            if inters:
                for inKey in inters:
                   for ls in dict1[inKey]:
                       word, cnt = ls.split('#')
                       cnts = dict2[inKey]
                       yield word, '%s,%d,%f' %(inKey, int(cnt), round(float(cnt)/float(cnts), 6))
                   del dict1[inKey]

if __name__ == "__main__":
    TFMR.run()