#!/usr/bin/env python
# -*-coding:utf-8 -*-
"""
Created on 2018/8/9
@author: wanju Sun
@group : 
@contact: 
"""
from mrjob.job import MRJob
import os
import re

class WordDocsCnt(MRJob):

    def mapper(self, _, line):
        # use wordcntperdoc
        keys, cnt = line.split('\t')
        word, doc = eval(keys).split(',')
        yield word, doc

    def reducer(self, key, values):
        myDict = {}
        docsDict = {} # total docs num
        docsDict[values] = 1
        if key in myDict.keys():
            myDict[key] += 1
        else:
            myDict[key] = 1
        for word, cnts in myDict.items():
            yield word, cnts



if __name__ == "__main__":
    WordDocsCnt.run()


