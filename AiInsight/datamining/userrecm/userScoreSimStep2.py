#!/usr/bin/env python
# ! coding=utf-8
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userScoreSimStep2.py
# **  功能描述:       计算用户评分相似度 job2
# **  创建者:         sunwj
# **  创建日期:       2018-02-06
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
import sys
import os
from os.path import realpath
from mrjob.job import MRJob
from itertools import combinations
import math



class UserScoreSimStep2(MRJob):


    def pairwise_users(self, _, values):
        '''
        本mapper使用step1的输出作为输入，把content_id丢弃掉不再使用 
        输出结果为 （user1,user2），(rating_1,rating_2) 
        :param _: 
        :param values: 
        :return: 
        '''
        values = values.split('"')[3]
        user_score_list = values.split(',')  # 获得商品得分列表
        users_list = [score.split(':')[0] for score in user_score_list]
        users_cnt_list = [score.split(':')[1] for score in user_score_list]
        users_score_list = [score.split(':')[2] for score in user_score_list]
        users_favor_list = [score.split(':')[3] for score in user_score_list]
        users_cnt_dict = dict(zip(users_list, users_cnt_list))
        users_score_dict = dict(zip(users_list, users_score_list))
        users_favor_dict = dict(zip(users_list, users_favor_list))

        for user1, user2 in combinations(users_list, 2):
            sim1 = 2 - 2 / (1 + math.exp(-1 * math.fabs(float(users_score_dict[user1]) -
                                                        float(users_score_dict[user2]))))
            sim2 = 1 / (1 + (math.exp(-1 * float(users_favor_dict[user1]) * float(users_favor_dict[user2]))))
            sim = float(sim1 * sim2)
            # cnt1, cnt2 = users_cnt_dict[user1], users_cnt_dict[user2]
            flag = cmp(user1, user2)
            if flag == 1:
                out_key = "{user1},{user2}".format(user1=user2, user2=user1)
            else:
                out_key = "{user1},{user2}".format(user1=user1, user2=user2)
            yield out_key, sim




    def cal_combiner(self, key, value):
        """
        (user1 ,user2)作为Key，sim(user1_rating,user2_rating) 作为该reducer的输入， 
        :param key: 
        :param value: 
        :return: 
        """

        yield key, sum(value)

    def calculate_similarity(self, key, value):
        """
        (user1 ,user2)作为Key，sim(user1_rating,user2_rating) 作为该reducer的输入， 
        :param key: 
        :param value: 
        :return: 
        """

        yield key, sum(value)



    def steps(self):
        return [self.mr(mapper=self.pairwise_users,
                        combiner=self.cal_combiner,
                        reducer=self.calculate_similarity),]


if __name__ == '__main__':
    UserScoreSimStep2.run()

