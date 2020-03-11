#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userContentScoreFinal.py
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


class UserContentScoreFinal(MRJob):


    def get_mapper_keys(self, _, line):

        input_file = os.environ['mapreduce_map_input_file']

        if input_file.split('/')[-2] == 'usergroup_sim_keys':
            line = line.split('\t')
            if len(line) == 2:
                user_values = line[0].split('"')[1].split(',')
                keys_value = line[1].replace('[','').replace(']','').replace("'",'').strip().split(',')
                user1, user2, contents, sim_value = user_values[0],user_values[1], keys_value[:-1],keys_value[-1]
                if user1 != user2:
                    # 依据usergroup_sim_keys生成规则，user1,user2,sim_value为事实
                    for content in contents:
                        for i in range(2):
                            if i==0:
                                key = '{user1},{content}'.format(user1=user1, content=content)
                                values = ['a', user2, sim_value]
                            else:
                                key = '{user2},{content}'.format(user2=user2, content=content)
                                values = ['a', user1, sim_value]
                            yield key, values

        elif input_file.split('/')[-2] == 'usergroup_score_keys':
            line = line.split('\t')
            if len(line) == 2:
                values1 = line[0].split('"')[1].split(',')
                values2 = line[1].replace('[','').replace(']','').replace("'",'').strip().split(',')
                user1, content, users, score_value = values1[0], values1[1], values2[:-1], values2[-1]
                for user2 in users:
                    if user1 !=user2:
                        # 根据usergroup_score_keys的生成原则，user1，content,score为事实
                        key = '{user2},{content}'.format(user2=user2, content=content)
                        values = ['b', user1, score_value]
                        yield key, values


    def reducer_sim_keys(self, key, values):

        score_data = {}
        sim_data = {}
        keys = key.split(',')
        user1, content = keys[0], keys[1]
        for flag, user2, value in values:
            if flag == 'a':
                sim_data[user2+','+content] = value  #user,content,sim_Value
            elif flag == 'b':
                score_data[user2+','+content] = value #user,content,score_value
        yield [key,len(sim_data),len(score_data)],1
        # sim_score,n= 0.0,0
        # user_pairs = set(sim_data) & set(score_data)
        # n = len(user_pairs)
        # if n >0:
        #     for user_pair in user_pairs:
        #         sim_score += float(sim_data[user_pair]) * float(score_data[user_pair])
        #
        #     yield [key,n], sim_score



    def steps(self):
        return [self.mr(mapper=self.get_mapper_keys,
                        reducer=self.reducer_sim_keys),]


if __name__ == "__main__":
    UserContentScoreFinal.run()