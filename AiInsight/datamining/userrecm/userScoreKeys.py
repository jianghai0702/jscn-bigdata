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


class UserScoreKeys(MRJob):


    def get_mapper_keys(self, _, line):

        input_file = os.environ['mapreduce_map_input_file']

        # determine value of n in the current block of ngrams by parsing the filename
        # expected_tokens = int(re.findall(r'([\d]+)gram', os.path.basename(input_file))[0])
        if input_file.split('/')[-1] == 'usergroup_content_score':
            line = line.strip()
            user, content, score1, score2, item_cnt = line.split(',')
            out_key = '{user1},{content}'.format(user1=user, content=content)
            out_value = ['a', score1]
            yield out_key, out_value

        elif input_file.split('/')[-2] == 'user_recm_keys':
            line = line.strip()
            user1, user2, content = line.split(',')
            if user1 != user2:
                for i in range(2):
                    if i == 0:
                        out_key = '{user1},{content}'.format(user1=user1, content=content)
                        out_value = ['b', user2]
                    else:
                        out_key = '{user1},{content}'.format(user1=user2, content=content)
                        out_value = ['b', user1]
                    yield out_key, out_value

    def reducer_score_keys(self, key, values):

        score_data = {}
        user_data = {}
        for flag, value in values:
            if flag == 'a':
                score_data[key] = value  #value=score,key="user1,content"
            elif flag == 'b' and len(user_data.keys())<=1:
                if key in user_data.keys():
                    user_data[key].append(value)
                else:
                    user_data[key] = [value]
        user_key = list(user_data.keys())
        users = user_data[user_key[0]]

        for pair_keys in set(score_data):
            # keys="user1,content"
            # 保持user1对content的评分为score的顺序，以user2为新加的矩阵index
            # user1, content = pair_keys.split(',')
            # reduce_key = "{user1},{content}".format(user1=user1,content=content)
            yield pair_keys, [users, float(score_data[pair_keys])]



    def steps(self):
        return [self.mr(mapper=self.get_mapper_keys),]
                        # reducer=self.reducer_score_keys),]


if __name__ == "__main__":
    UserScoreKeys.run()