#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userSimKeys.py
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


class UserSimKeys(MRJob):


    def get_mapper_keys(self, _, line):

        input_file = os.environ['mapreduce_map_input_file']

        if input_file.split('/')[-2] == 'usergroup_sim':
            line = line.split('\t')
            if len(line) == 2:
                values = line[0].split('"')[1].split(',')
                user1, user2, sim_value = values[0], values[1], line[1]
                if user2 != user1:
                    for i in range(2):
                        if i == 0:
                            key = '{user1},{user2}'.format(user1=user1, user2=user2)
                        else:
                            key = '{user2},{user1}'.format(user2=user2, user1=user1)
                        values = ['a', sim_value]
                        yield key, values

        elif input_file.split('/')[-2] == 'user_recm_keys':
            line = line.strip()
            user1, user2, content = line.split(',')
            if user1 != user2:
                key = '{user1},{user2}'.format(user1=user1, user2=user2)
                values = ['b', content]
                yield key, values



    def reducer_sim_keys(self, key, values):

        sim_data = {}
        content_date = {}
        for flag, value in values:
            if flag == 'a':
                sim_data[key] = value  #sim
            elif flag == 'b' and len(content_date.keys())<=1:
                if key in content_date.keys():
                    content_date[key].append(value)
                else:
                    content_date[key] = [value]
        content_key = list(content_date.keys())
        contents = content_date[content_key[0]]

        for pair_key in set(sim_data):
            user1,user2 = pair_key.split(',')
            reduce_key = "{user1},{user2}".format(user1=user1, user2=user2, content=contents)
            yield reduce_key, [contents, float(sim_data[pair_key])]


    def steps(self):
        return [self.mr(mapper=self.get_mapper_keys,
                        reducer=self.reducer_sim_keys),]


if __name__ == "__main__":
    UserSimKeys.run()