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

class TFMR(MRJob):

    def mapper(self, _, line):
        docName = os.environ['mapreduce_map_input_file']
        docName = docName.split('/')[-1]
        if docName == 'input1':
            name, id = line.strip().split(',')
            yield id, ['a', name]
        elif docName == 'input2':
            id, addr = line.strip().split(',')
            yield id, ['b', addr]

    def reducer(self, key, values):
        lastId = ""
        name = ""
        addr = ""
        tag = False
        for flag, strs in values:
            if key != lastId:
                if flag == 'a':
                    name = strs
                    tag = True
            elif key == lastId:
                if flag == 'b':
                    addr = strs
                    if tag:
                        yield id, [name, addr]


if __name__ == "__main__":
    TFMR.run()

