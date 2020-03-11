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

class TFMR0(MRJob):

    def TFInit(self,**kwargs):
        self.total = {}

    def TFMapper(self, _, line):
        keys, cnt = line.split('\t')
        word, doc = eval(keys).split(',')
        if doc not in self.total.keys():
            self.total[doc] = float(cnt)
        else:
            self.total[doc] += float(cnt)
        yield doc, [word, cnt]

    def TFReducer(self, key, values):
        for word, cnt in values:
            yield word,[key,float(cnt)/self.total[key]]

    def steps(self):
        return [self.mr(mapper_init=self.TFInit,
                        mapper=self.TFMapper,
                        reducer=self.TFReducer),]


if __name__ == "__main__":
    TFMR0.run()