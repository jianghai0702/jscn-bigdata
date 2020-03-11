#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       apiroriRules.py
# **  功能描述:       关联规则模型
# **  创建者:         sunwj
# **  创建日期:       2017-01-15
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
from __future__ import division
import copy
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

def find_items(transactions):
    """
    初步扫描事务集，从事务集里获取候选1项集
    :param transactions: 事务集合 list type []
    :return: 
    """
    candidate = set()
    for transaction in transactions:
        for item in transaction:
            if item not in candidate:
                candidate.add(frozenset([item]))
    return candidate

def find_frequent_items(transactions, candidate, minSup):
    """
    从候选项集里找出频繁项集
    :param transactions: 所有的交易记录集合
    :param dataset: 候选集
    :param minSup: 最小支持度
    :return: 
    """
    supportCnt = {}
    supportData = {}
    L = set()
    total_items = len(transactions)
    freq = minSup*total_items
    for transaction in transactions:
        for can in candidate:
            if can.issubset(transaction):
                supportCnt[can] = supportCnt.get(can, 0) + 1
    # supportCnt = [{k:v} for k,v in supportCnt.items() if v>= minSup]
    for k,v in supportCnt.items(): #v3.X
       if v >= freq:
           L.add(k)
           # L.extend(list(k))
           supportData[k] = round(v/total_items, 2)
    return L, supportData

def gernerate_candidate(LK, k):
    """
    通过频繁k-1项集产生候选K项集，并通过先验定理对候选n项集进行剪枝 
    :param LK: 
    :param k: 
    :return: 
    """
    candidate = set()
    list_LK = list(LK)
    for i in range(len(LK)):
        for j in range(1, len(LK)):
            l1 = list(list_LK[i])
            l2 = list(list_LK[j])
            l1.sort()
            l2.sort()
            if l1[0:k - 2] == l2[0:k - 2]:
                Ck_item = list_LK[i] | list_LK[j]
                # pruning
                if is_apriori(Ck_item, list_LK):
                    candidate.add(Ck_item)
    return candidate

def is_apriori(CK,LK):
    """
    剪枝操作，思想：如果一个集合是频繁项集合，那么它的所有子集都是频繁项集
    :param CK: 频繁K项候选集
    :param LK: 满足最小支持度的频繁（K_1）项集合
    :return: 
    """
    for item in CK:
        sub_Ck = CK - frozenset([item])
        if sub_Ck not in LK:
            return False
    return True

def generate_frequent_items(transactions,minSup):
    """
    生成所有的频繁项集和 
    :param transactions: 事务集合
    :param minSup: 最小支持度
    :return: 
    """
    supportData = {}
    C1 = find_items(transactions)
    L1, supportData = find_frequent_items(transactions,C1,minSup)
    tmpL = copy.deepcopy(L1)
    L = [tmpL]
    k = 2
    while(len(L[k-2])>0):
        CK = gernerate_candidate(L[k-2], k)
        Lk, supK = find_frequent_items(transactions, CK, minSup)
        tmpLk = copy.deepcopy(Lk)
        L.append(tmpLk)
        supportData.update(supK)
        k += 1
    return L, supportData

def generate_rules(L, supportData, minConf):
    """
    生成规则集合 A->B （满足最小支持度和最小频繁度）
    :param L: 所有满足最小支持度的频繁项集合
    :param supportData: 频繁项的支持度 dict
    :param minConf: 最小置信度
    :return: 
    """
    rule_list = []
    sub_set_list = []
    for i in range(0, len(L)):
        for freq_set in L[i]:
            for sub_set in sub_set_list:
                if sub_set.issubset(freq_set):
                    conf = float(supportData[freq_set]) / float(supportData[freq_set - sub_set])
                    if freq_set != freq_set - sub_set:
                        big_rule = (freq_set - sub_set, sub_set, conf)
                        if conf >= minConf and big_rule not in rule_list:
                        # print freq_set-sub_set, " => ", sub_set, "conf: ", conf
                          rule_list.append(big_rule)
            sub_set_list.append(freq_set)
    return rule_list


# simpDat = [['r', 'z', 'h', 'j', 'p'],
#                ['z', 'y', 'x', 'w', 'v', 'u', 't', 's'],
#                ['z'],
#                ['r', 'x', 'n', 'o', 's'],
#                ['y', 'r', 'x', 'z', 'q', 't', 'p'],
#                ['y', 'z', 'x', 'e', 'q', 's', 't', 'm']]
# C1 = find_items(simpDat)
# L1,sup1 = find_frequent_items(simpDat,C1,0.3)
# # print('C1:\n',C1,'\nL1:\n',L1,'\nsup1\n',sup1)
# C2 = gernerate_candidate(L1, 1)
# L2,sup2 = find_frequent_items(simpDat,C2,0.3)
# print('C2:\n',C2,'\nL2:\n',L2,'\nsup2:\n',sup2)
# L,sup = generate_frequent_items(simpDat, 0.5)
# # print('L:\n',L,'\nsup:\n',sup)
# rules1 = generate_rules(L,sup,0.7)
# print(len(rules1),'\n',rules1)
#
# patterns = fp.find_frequent_patterns(simpDat, 3)
# rules = fp.generate_association_rules(patterns, 0.7)
# print(len(rules),'\n',rules)


