#!/usr/bin/env python
# ! coding=utf-8
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       jobRunner.py
# **  功能描述:       通过实例化runner执行job
# **  创建者:         sunwj
# **  创建日期:       2018-02-06
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import datetime
import os
from mrjob.hadoop import *


#Define common arguments
os.environ['HADOOP_HOME'] = '/opt/cloudera/parcels/CDH/lib/hadoop/'
# os.environ['HADOOP_LOG_DIR'] = '/opt/cloudera/parcels/CDH/lib/hadoop/logs'
mode = 'hadoop'
# hadoop_bin = '/usr/bin/hadoop'
# hs = HadoopFilesystem([hadoop_bin])
# status_file = True

##
# from userScoreSimStep1 import UserScoreSimStep1
# print("userScoreSimStep1 begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_content_score"
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/content_usergroup_score"
# mr_job = UserScoreSimStep1(args=['-r', mode, '--no-output', '-o', output_dir,input_file_names]) #,
# with mr_job.make_runner() as runner:
#     runner.run()
# print("userScoreSimStep1 end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))



##
# from userScoreSimStep2 import UserScoreSimStep2
# print("UserScoreSimStep2 begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = "hdfs://nameservice1/user/hdfs/dm/mrscripts/content_usergroup_score/"
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_sim"
# mr_job = UserScoreSimStep2(args=['-r', mode, '--no-output', '-o', output_dir,input_file_names])
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserScoreSimStep2 end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))

##
# from userScoreCommonCnt import UserScoreCommonCnt
# print("UserScoreCommonCnt begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = "hdfs://nameservice1/user/hdfs/dm/mrscripts/content_usergroup_score/"
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_common"
# mr_job = UserScoreCommonCnt(args=['-r', mode, '--no-output', '-o', output_dir,input_file_names])
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserScoreCommonCnt end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))


##
# from userSim import UserSim
# print("UserSim begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = [
#                     "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_sim/",
#                     "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_common/"
#                     ]
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim"
# aargs = ['-r', mode, '--no-output'] #
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
#
# mr_job = UserSim(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserSim end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))


# from userSimKeys import UserSimKeys
# print("UserSimKeys begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = ['hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim/',
#                     'hdfs://nameservice1/user/hdfs/dm/mrscripts/user_recm_keys/']
# #
# #
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim_keys"
# aargs = ['-r', mode, '--no-output'] #
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
# mr_job = UserSimKeys(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserSimKeys end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))


# from userScoreKeys import UserScoreKeys
# print("UserScoreKeys begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = ['hdfs://nameservice1/user/hdfs/dm/mrscripts/user_recm_keys/',
#                     'hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_content_score'
#                     ]
# #
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_keys"
# aargs = ['-r', mode, '--no-output'] #
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
#
# mr_job = UserScoreKeys(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserScoreKeys end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))

from userScoreKeys import UserScoreKeys
print("UserScoreKeys begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
input_file_names = [
                    'hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_content_score'
                    ]
#
output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_keys_test1"
aargs = ['-r', mode, '--no-output'] #
aargs.extend(input_file_names)
aargs.extend(['-o', output_dir])

mr_job = UserScoreKeys(args=aargs)
with mr_job.make_runner() as runner:
    runner.run()
print("UserScoreKeys end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))

from userScoreKeys import UserScoreKeys
print("UserScoreKeys begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
input_file_names = [
                    'hdfs://nameservice1/user/hdfs/dm/mrscripts/user_recm_keys/'
                    ]
#
output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_keys_test2"
aargs = ['-r', mode, '--no-output'] #
aargs.extend(input_file_names)
aargs.extend(['-o', output_dir])

mr_job = UserScoreKeys(args=aargs)
with mr_job.make_runner() as runner:
    runner.run()
print("UserScoreKeys end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))

# from userContentScoreFinal import UserContentScoreFinal
# print("UserContentScoreFinal begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = ['hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim_keys/'
#
#                     ]
# # 'hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim_keys/'
#
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_content_sim_score1"
# aargs = ['-r', mode, '--no-output']
# #'--jobconf','stream.reduce.output.field.separator=","',  '--jobconf','stream.num.reduce.output.key.fields=2'
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
#
# mr_job = UserContentScoreFinal(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserContentScoreFinal end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
#
# from userContentScoreFinal import UserContentScoreFinal
# print("UserContentScoreFinal begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = ['hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_score_keys/',
#                     'hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_sim_keys/'
#                     ]
#
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mrscripts/usergroup_content_sim_score"
# aargs = ['-r', mode, '--no-output']
# #'--jobconf','stream.reduce.output.field.separator=","',  '--jobconf','stream.num.reduce.output.key.fields=2'
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
#
# mr_job = UserContentScoreFinal(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("UserContentScoreFinal end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))

# from matrixTest import Matrix
# print("matrixMult begin time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
# input_file_names = ['hdfs://nameservice1/user/hdfs/dm/matrix_a','hdfs://nameservice1/user/hdfs/dm/matrix_b']
#
# output_dir = "hdfs://nameservice1/user/hdfs/dm/mulResult"
# aargs = ['-r', mode, '--no-output']
# aargs.extend(input_file_names)
# aargs.extend(['-o', output_dir])
#
# mr_job = Matrix(args=aargs)
# with mr_job.make_runner() as runner:
#     runner.run()
# print("matrixMult end time is: {}".format(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))





