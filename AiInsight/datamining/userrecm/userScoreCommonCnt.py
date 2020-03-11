#!/usr/bin/env python
# ! coding=utf-8
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userScoreCommonCnt.py
# **  功能描述:       计算两个用户共同评论的资产数
# **  创建者:         sunwj
# **  创建日期:       2017-02-06
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
import sys
import os
from mrjob.job import MRJob
from itertools import combinations
import math

class UserScoreCommonCnt(MRJob):


    def pairwise_users(self, _, values):
        '''
        本mapper使用step1的输出作为输入，把content_id丢弃掉不再使用 
        输出结果为 （user1,user2），1
        :param _: 
        :param values: 
        :return: 
        '''

        values = values.split('"')[3]
        user_score_list = values.split(',')  # 获得商品得分列表
        users_list = [score.split(':')[0:2] for score in user_score_list]
        for item1, item2 in combinations(users_list,2):
            flag = cmp(item1[0],item2[0])
            if flag==1:
                out_key = "{user1},{cnt1},{user2},{cnt2}".format(user1=item2[0],
                                                                 cnt1=item2[1],
                                                                 user2=item1[0],
                                                                 cnt2=item1[1])
            else:
                out_key = "{user1},{cnt1},{user2},{cnt2}".format(user1=item1[0],
                                                                 cnt1=item1[1],
                                                                 user2=item2[0],
                                                                 cnt2=item2[1])
            yield out_key, 1



    def cal_common_cnt(self, key, value):
        """
        (user1 ,user2)作为Key 
        :param key: 
        :param value: 
        :return: 
        """
        yield key, sum(value)

    def steps(self):
        return [self.mr(mapper=self.pairwise_users,
                        reducer=self.cal_common_cnt)]


if __name__ == '__main__':
    os.environ['HADOOP_HOME'] = '/opt/cloudera/parcels/CDH/lib/hadoop/'
    UserScoreCommonCnt.run()

