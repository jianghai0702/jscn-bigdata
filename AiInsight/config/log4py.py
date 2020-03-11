#!/usr/bin/env python
# -*-coding:utf-8 -*-
'''
Created on Sep 24, 2014

@author: wuks@
@copyright: wuks@ 2014

    usage:
    logger.debug('This is debug.')
    logger.info('This is INFO')
    logger.warn('This is WARN')
    logger.warning('This is warning')
    logger.error('This is error')
    logger.critical('This is critical')
'''
from env_path import PRJ_HOME
from os.path import basename,splitext,join
import sys,logging

base = splitext(basename(sys.argv[0]))[0]
lpath = join(PRJ_HOME,'logs')
fpath = join(lpath,base + '.log')

# set logger
logger = logging.getLogger(__name__)
logger.setLevel(logging.INFO)

# set console/file handler
cnslHandler = logging.StreamHandler()
cnslHandler.setLevel(logging.DEBUG)
fileHandler = logging.FileHandler(fpath,mode='w',encoding='utf-8')
fileHandler.setLevel(logging.DEBUG)

# set formatter
# fmt = logging.Formatter('%(asctime)s [%(levelname)s] {%(filename)s:%(lineno)s, %(processName)s:%(process)d, %(threadName)s:%(thread)d} %(message)s')
fmt = logging.Formatter('%(asctime)s [%(levelname)s] {%(filename)s:%(lineno)s} %(message)s')
cnslHandler.setFormatter(fmt)
fileHandler.setFormatter(fmt)

# add handler
logger.addHandler(cnslHandler)
logger.addHandler(fileHandler)

