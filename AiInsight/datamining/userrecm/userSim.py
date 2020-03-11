#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userSim.py
# **  功能描述:
# **  创建者:         sunwj
# **  创建日期:       2018-02-23
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
from mrjob.job import MRJob
import sys
import os


class UserSim(MRJob):


    def get_mapper_data(self, _, line):

        input_file = os.environ['mapreduce_map_input_file']

        # determine value of n in the current block of ngrams by parsing the filename
        # expected_tokens = int(re.findall(r'([\d]+)gram', os.path.basename(input_file))[0])
        if input_file.split('/')[-2] == 'usergroup_score_sim':
            # 用户评分相似度
            # 获得数组 矩阵
            line = line.split('\t')
            if len(line) == 2:
                values = line[0].split('"')[1].split(',')
                user1, user2, sim_score = values[0], values[1], line[1]
                key = '{user1},{user2}'.format(user1=user1, user2=user2)
                values = ['a', sim_score]
                yield key, values

        elif input_file.split('/')[-2] == 'usergroup_common':
            # 用户共同评价物品个数及各自评价物品数量
            # 获得数组 矩阵
            line = line.split('\t')
            if len(line) == 2:
                values = line[0].split('"')[1].split(',')
                flag = float(values[1]) + float(values[3]) - int(line[1])
                if flag != 0:
                    # =0 时为异常数据 抛弃
                    sup = float(line[1]) / flag
                    user1, user2, sup_data = values[0], values[2], [sup, float(line[1])]
                    key = '{user1},{user2}'.format(user1=user1, user2=user2)
                    values = ['b', sup_data]
                    yield key, values

    def reducer_sim_data(self, key, values):

        # for flag, value in values:
        #     out_key = "{key1},{key2}".format(key1=flag, key2=key)
        #     yield out_key, value
        common_goods = {}
        user_score = {}
        for flag, value in values:
            if flag == 'a':
                user_score[key] = value
            elif flag == 'b':
                common_goods[key] = value
        # 计算有相同 goods_id 乘积之和
        for user_pair in set(common_goods) & set(user_score):
            sim = float(common_goods[user_pair][0]) * float(user_score[user_pair]) / float(common_goods[user_pair][1])
            yield user_pair, sim


    def steps(self):
        return [self.mr(mapper=self.get_mapper_data,
                        reducer=self.reducer_sim_data),]


if __name__ == "__main__":
    UserSim.run()