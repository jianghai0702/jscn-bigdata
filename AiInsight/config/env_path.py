#!/usr/bin/env python
# -*-coding:utf-8 -*-
# 导入预定义路径
directory = ["config", "dim", "dw", "dwd", "st"]
import os, sys
from os.path import realpath
rp = realpath(sys.argv[0])
curdir = os.path.dirname(rp)
PRJ_HOME = os.path.dirname(curdir)
for tdir in directory:
    sys.path.append(PRJ_HOME + os.sep + tdir)
