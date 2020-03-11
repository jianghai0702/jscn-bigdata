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

class WordCntPerDoc(MRJob):

    def mapper(self, _, line):
        input_file = os.environ['mapreduce_map_input_file']
        docName = os.path.splitext(input_file.split('/t')[-1])[0]
        stopWords = set('is a not at if else then in and but I am we they the are to there that this'.split())
        words = [word.lower() for word in line.split(' ') if word.lower() not in stopWords and word]
        for word in words:
            #key1 = '{word},{doc}'.format(word=word, doc=docName)
            yield '%s,%s' % (word, docName), 1

    def reducer(self, key, values):
        yield key, sum(values)


if __name__ == "__main__":
    WordCntPerDoc.run()