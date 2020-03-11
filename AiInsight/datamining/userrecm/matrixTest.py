#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userScoreKeys.py
# **  功能描述:
# **  创建者:         sunwj
# **  创建日期:       2018-03-09
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
from mrjob.job import MRJob
import sys
import os


class Matrix(MRJob):


    def get_mapper_keys(self, _, line):

        input_file = os.environ['mapreduce_map_input_file']
        if input_file.split('/')[-1] == 'matrix_a':
            for i in range(3):
                lines = line.split('\t')
                index_1, index_2 = lines[0].split(',')
                out_key = "{index_1},{i}".format(index_1=index_1,i=i+1)
                out_value = ['a', index_2, lines[1]]
                yield out_key, out_value

        elif input_file.split('/')[-1] == 'matrix_b':
            for i in range(2):
                lines = line.split('\t')
                index_1, index_2 = lines[0].split(',')
                out_key = "{i},{index_2}".format(i=i+1,index_2=index_2)
                out_value = ['b', index_1, lines[1]]
                yield out_key, out_value

    def reducer_score_keys(self, key, values):

        matrix_a = {}
        matrix_b = {}
        for flag, index, value in values:
            if flag == 'a':
                matrix_a[index] = value
            elif flag == 'b':
                matrix_b[index] = value
        sumValue = 0
        for idx in set(matrix_a) & set(matrix_b):
            sumValue += int(matrix_a[idx]) * int(matrix_b[idx])
        yield key, sumValue



    def steps(self):
        return [self.mr(mapper=self.get_mapper_keys,
                        reducer=self.reducer_score_keys),]


if __name__ == "__main__":
    Matrix.run()