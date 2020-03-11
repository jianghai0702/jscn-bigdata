#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       userBoughtGoods.py
# **  功能描述:       商品用户评分矩阵(购买过的商品)
# **  创建者:         sunwj
# **  创建日期:       2017-01-11
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

from mrjob.job import MRJob
import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)


class UserGoods(MRJob):
    """获得用户购买的商品与评分记录"""

    def mapper(self, _, line):
        # 解析行: 用户, 商品, 评分
        user, goods = line.split(',')
        # 输出串: 商品:评分
        output = '{goods}'.format(goods=goods)
        yield user, output

    def reducer(self, key, values):
        yield key, ','.join(values)


def main():
    UserGoods.run()


if __name__ == '__main__':
    main()