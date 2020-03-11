#!/usr/bin/env python
# coding=utf-8
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userScoreSimStep1.py
# **  功能描述:       计算用户评分相似度 job1
# **  创建者:         sunwj
# **  创建日期:       2018-02-06
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from mrjob.job import MRJob
import os
import sys

class UserScoreSimStep1(MRJob):
    """  
    聚合单个资产的下的所有用户的评分数据 
    格式为：user_id, (item_count, rating_sum, [(item_id,rating)...]) 
    """
    os.environ['HADOOP_HOME'] = '/opt/cloudera/parcels/CDH/lib/hadoop/'
    third_libs = ["numpy/numpy/lib/python2.7", "mrjob/mrjob/lib/python2.7"]

    for lib in third_libs:
        sys.path.append(lib)


    def group_by_user_rating(self, _, line):
        """
        
        :param _: 
        :param line: 
        :return: 
        """

        # 解析行: 用户,资产,评分,兴趣评分,评价总条数
        user, content, score1, score2, item_cnt = line.split(',')
        # 输出串: 资产,用户,评价总条数,评分,兴趣评分
        values = "{user}:{cnt}:{score1}:{score2}".format(user=user, cnt=item_cnt, score1=score1, score2=score2)
        yield content, values


    def count_ratings_users_freq(self, key, values):
        """
        
        :param key: 
        :param values: 
        :return: 
        """
        yield key, ",".join(values)


    def steps(self):
        return [self.mr(mapper=self.group_by_user_rating,
                        reducer=self.count_ratings_users_freq)]


if __name__ == '__main__':

    UserScoreSimStep1.run()