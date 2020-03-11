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

class DocWordsCnt(MRJob):

    def mapper(self, _, line):
        input_file = os.environ['mapreduce_map_input_file']
        # docName = input_file.split('/t')[-1]  # hdfs test
        docName = os.path.splitext(input_file.split('/t')[-1])[0]  #local test
        stopWords = set('is a not at if else then in and but I am we they the are to there that this'.split())
        words = [word for word in line.strip().split(' ') if word not in stopWords and word]
        yield docName, len(words)

    def reducer(self, key, values):
        yield key, sum(values)

if __name__ == "__main__":
    DocWordsCnt.run()