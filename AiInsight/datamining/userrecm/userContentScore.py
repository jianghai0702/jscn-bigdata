# !/usr/bin/env python
# -*- coding: utf-8 -*-

from mrjob.job import MRJob

import os


class Matrix(MRJob):
    flag = None  # 用于标记数据是哪个矩阵来的

    def mapper(self, _, line):
        file_name = os.environ['mapreduce_map_input_file']

        if file_name == 'hdfs://nameservice1/user/hdfs/dm/mrscripts/user_score_sim':
            # 用户评分相似度
            # 获得数组 矩阵
            user1, user2, sim_value = self._get_matrix_item_1(line)
            key = '{user1},{user2}'.format(user1=user1,user2=user2)
            yield key, ('a', sim_value)

        elif file_name == 'hdfs://nameservice1/user/hdfs/dm/mrscripts/user_common':
            # 用户共同评价物品个数及各自评价物品数量
            # 获得数组 矩阵
            user1, user2, sup_value = self._get_matrix_item_2(line)
            key = '{user1},{user2}'.format(user1=user1, user2=user2)
            # value = []

            yield key, ('b', sup_value)

    def reducer(self, key, values):
        common_goods = {}
        user_score = {}
        for flag, value in values:
            if flag == 'a':
                common_goods[key] = value
            elif flag == 'b':
                user_score[key] = value
        # 计算有相同 goods_id 乘积之和
        for user_pair in set(common_goods) & set(user_score):
            sim = float(common_goods[user_pair][0]) * float(user_score[user_pair]) / float(common_goods[user_pair][1])
            yield user_pair, sim

    def _get_matrix_item_1(self, line):
        """
        获取 user_score_sim
        :param line: 
        :return: 
        """
        user1, user2, sim_score = 0,0,0
        line = line.strip()
        line = line.split('\t')
        if len(line) == 2:
            values = line[0].split('"')[1]
            user1, user2, sim_score = values[0], values[1], line[1]
        return  user1, user2, sim_score


    def _get_matrix_item_2(self, line):
        """
        获取 user_common 
        :param line: 
        :return: 
        """
        line = line.strip()
        line = line.split('\t')
        user1, user2, sup_data = 0, 0, 0
        if len(line) == 2:
            values = line[0].split('"')[1].split(',')
            flag = float(values[1]) + float(values[3]) - int(line[1])
            if flag != 0:
                # =0 时为异常数据 抛弃
                sup = float(line[1]) / flag
                user1,user2,sup_data = values[0],values[2],[sup, float(line[1])]
        return user1, user2, sup_data


if __name__ == "__main__":
    Matrix.run()

