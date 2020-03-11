#!/usr/bin/env python
# -*-coding:utf-8 -*-
# **-----------------------------------------------------------------------------------------------
# **  文件名称:       paraUtils.py
# **  功能描述:       参数配置文件
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
# **

import time
import datetime
import sys
import os
from os.path import realpath
import numpy as np
import pandas as pd

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "offerrec","result","userrecm"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *

tmp = vars()
para = {}

def setPara():
    global para
    try:
        # 日期参数
        if len(sys.argv) == 2 and len(sys.argv[1])>=8:
            '''手动输入执行日期，输入形如 20170801'''
            curYear = str(sys.argv[1][0:4])
            curMon = str(sys.argv[1][4:6])
            curDays = str(sys.argv[1][6:8])
        else:
            curYear = time.strftime('%Y', time.localtime(time.time()))
            curMon = time.strftime('%m', time.localtime(time.time()))
            curDays = time.strftime('%d', time.localtime(time.time()))

        today = time.strftime('%Y%m%d%H%M%S', time.localtime(time.time()))
        today_iso = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time()))
        days = datetime.date(int(curYear), int(curMon), int(curDays))
        lastMon = datetime.date(days.year, days.month, 01) - datetime.timedelta(1)
        last2Mon = datetime.date(lastMon.year, lastMon.month, 01) - datetime.timedelta(1)
        last3Mon = datetime.date(last2Mon.year, last2Mon.month, 01) - datetime.timedelta(1)
        last4Mon = datetime.date(last3Mon.year, last3Mon.month, 01) - datetime.timedelta(1)
        last5Mon = datetime.date(last4Mon.year, last4Mon.month, 01) - datetime.timedelta(1)
        last6Mon = datetime.date(last5Mon.year, last5Mon.month, 01) - datetime.timedelta(1)
        lastMonlastDay = datetime.date(days.year, days.month, 01) - datetime.timedelta(1)
        #nextMon = datetime.date(days.year, days.month, 01) + datetime.timedelta(31)
        nextMon = datetime.date(days.year, days.month, 01)
        lastMonFirstDay = datetime.date(lastMon.year, lastMon.month, 01)

        last2MonlastDay = datetime.date(lastMon.year, lastMon.month, 01) - datetime.timedelta(1)

        # 两种昂类型格式
        para['ARG_TODAY'] = today
        para['ARG_YEAR'] = lastMon.strftime('%Y')
        para['ARG_OPTIME_LASTMON'] = lastMon.strftime('%Y%m')
        para['ARG_OPTIME_LAST2MON'] = last2Mon.strftime('%Y%m')
        para['ARG_OPTIME_LAST3MON'] = last3Mon.strftime('%Y%m')
        para['ARG_OPTIME_LAST4MON'] = last4Mon.strftime('%Y%m')
        para['ARG_OPTIME_LAST5MON'] = last5Mon.strftime('%Y%m')
        para['ARG_OPTIME_LAST6MON'] = last6Mon.strftime('%Y%m')
        para['ARG_OPTIME_LASTMONLASTDAY'] = lastMonlastDay.strftime('%Y%m%d')
        para['ARG_OPTIME_NEXTMON'] = nextMon.strftime('%Y%m')
        para['ARG_OPTIME_LASTMON_FIRSTDAY'] = lastMonFirstDay.strftime('%Y%m%d')
        para['ARG_OPTIME_LAST2MONLASTDAY'] = last2MonlastDay.strftime('%Y%m%d')

        para['ARG_OPTIME_LASTMON_ISO'] = lastMon.strftime('%Y-%m')
        para['ARG_OPTIME_LAST2MON_ISO'] = last2Mon.strftime('%Y-%m')
        para['ARG_OPTIME_LAST3MON_ISO'] = last3Mon.strftime('%Y-%m')
        para['ARG_OPTIME_LAST4MON_ISO'] = last4Mon.strftime('%Y-%m')
        para['ARG_OPTIME_LAST5MON_ISO'] = last5Mon.strftime('%Y-%m')
        para['ARG_OPTIME_LAST6MON_ISO'] = last6Mon.strftime('%Y-%m')
        para['ARG_OPTIME_LASTMONLASTDAY_ISO'] = lastMonlastDay.strftime('%Y-%m-%d')
        para['ARG_OPTIME_LAST2MONLASTDAY_ISO'] = last2MonlastDay.strftime('%Y-%m-%d')
        para['ARG_OPTIME_NEXTMON_ISO'] = nextMon.strftime('%Y-%m')
        para['ARG_OPTIME_LASTMON_FIRSTDAY_ISO'] = lastMonFirstDay.strftime('%Y-%m-%d')

        # 系统路径参数
        para['dw_path'] = tmp['dw_path']
        para['tmp_path'] = tmp['tmp_path']

        # 设置模型相关的源表参数
        para['std_org_code'] = '100901' # 泰州组织机构代码
        para['data_source_cd'] = 'TZ'
        para['district_code'] = {'TZ':'100901'}

        para['dwa_base_character_cust'] = 'dwa_base_character_cust'
        para['dwa_base_character_usr'] = 'dwa_base_character_usr'
        para['dwd_cm_customer'] = 'dwd_cm_customer'
        para['dim_std_organize'] = 'dim_std_organize'
        para['dwd_fact_ins_prod'] = 'dwd_fact_ins_prod'
        para['dim_std_organize'] = 'dim_std_organize'
        para['dwd_h_ins_prod_res'] = 'dwd_h_ins_prod_res'
        para['dwd_res_code_definition'] = 'dwd_res_code_definition'
        para['dwd_res_terminal'] = 'dwd_res_terminal'
        para['dwd_h_ins_srvpkg'] = 'dwd_h_ins_srvpkg'
        para['dwd_h_ins_offer'] = 'dwd_h_ins_offer'
        para['dwd_ord_price'] = 'dwd_ord_price'
        para['dwd_tv_view_log'] = 'dwd_tv_view_log'
        para['dwd_zg_acct_item'] = 'dwd_zg_acct_item'
        para['dwd_dr_ismp'] = 'dwd_dr_ismp'
        para['dwd_rep_order_prod'] = 'dwd_rep_order_prod'
        para['dwd_ter_service'] = 'dwd_ter_service'
        para['dwd_up_product_item'] = 'dwd_up_product_item'

        # 模型目标表参数
        para['dwa_base_character_cust'] = 'dwa_base_character_cust'
        para['dwa_base_character_usr'] = 'dwa_base_character_usr'
        para['dwa_usr_list_loss'] = 'dwa_usr_list_loss'
        para['dwa_usr_list_expire'] = 'dwa_usr_list_expire'
        para['dwa_data_check_loss'] = 'dwa_data_check_loss'
        para['dwa_cust_loss_character'] = 'dwa_cust_loss_character'
        para['dwa_offer_value_character'] = 'dwa_offer_value_character'
        para['dwa_cust_value_character'] = 'dwa_cust_value_character'
        para['dwa_offer_rec_character'] = 'dwa_offer_rec_character'
        para['dwa_user_rec_character'] = 'dwa_user_rec_character'


        # '设置模型字段常量
        para['model_name'] = ['cust_loss_model','cust_value_mode','offer_value']

        # cust loss model constants
        para['CUST_LOSS_COLUMNS'] = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name', 'cust_type', 'cust_level',
                                     'net_age', 'user_count', 'itv_user_count', 'itv_active','prod_inst_id', 'is_main',
                                     'is_second','dev_age', 'itv_use_age', 'itv_expire_days', 'not_itv_expire_days',
                                     'ord_prod_count_1m', 'ord_prod_count_3m', 'ord_prom_num_1m', 'ord_prom_num_3m',
                                     'bill_amount_1m', 'bill_amount_3m', 'open_daycnt_1m', 'open_cnt_1m',
                                     'open_daycnt_3m','open_cnt_3m', 'vod_day_1m', 'vod_num_1m', 'vod_amount_1m',
                                     'vod_day_3m','vod_num_3m', 'vod_amount_3m', 'tv_day_1m', 'tv_num_1m', 'tv_day_3m',
                                     'tv_num_3m','review_day_1m', 'review_num_1m', 'review_day_3m', 'review_num_3m',
                                     'is_lost','pt_mon']
        para['CUST_LOSS_COLUMNS_STR'] = ",".join(para['CUST_LOSS_COLUMNS'])

        para['CUST_TRAIN_X'] = ['cust_type', 'cust_level', 'net_age','user_count', 'itv_user_count', 'itv_active',
                                'dev_age','itv_use_age', 'itv_expire_days',
                                'not_itv_expire_days', 'ord_prod_count_1m','ord_prod_count_3m', 'ord_prom_num_1m',
                                'ord_prom_num_3m', 'bill_amount_1m','bill_amount_3m', 'open_daycnt_1m',
                                'open_cnt_1m', 'open_daycnt_3m','open_cnt_3m','vod_day_1m', 'vod_num_1m',
                                'vod_amount_1m', 'vod_day_3m', 'vod_num_3m','vod_amount_3m', 'tv_day_1m',
                                'tv_num_1m', 'tv_day_3m', 'tv_num_3m','review_day_1m', 'review_num_1m',
                                'review_day_3m', 'review_num_3m'] # 'is_main','is_second',
        para['CUST_TRAIN_Y'] = ['is_lost']
        para['CUST_TRAIN_FEATURE'] = para['CUST_TRAIN_X'] + para['CUST_TRAIN_Y']
        para['CUST_LOSS_RESULT_0'] = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name', 'cust_type', 'cust_level',
                                    'net_age', 'user_count', 'itv_user_count', 'itv_active', 'prod_inst_id', 'is_main',
                                    'is_second', 'dev_age', 'itv_use_age', 'itv_expire_days', 'not_itv_expire_days',
                                    'ord_prod_count_1m', 'ord_prod_count_3m', 'ord_prom_num_1m', 'ord_prom_num_3m',
                                    'bill_amount_1m', 'bill_amount_3m', 'open_daycnt_1m', 'open_cnt_1m',
                                    'open_daycnt_3m', 'open_cnt_3m', 'vod_day_1m', 'vod_num_1m', 'vod_amount_1m',
                                    'vod_day_3m', 'vod_num_3m', 'vod_amount_3m', 'tv_day_1m', 'tv_num_1m', 'tv_day_3m',
                                    'tv_num_3m', 'review_day_1m', 'review_num_1m', 'review_day_3m', 'review_num_3m',
                                    'is_lost']
        para['CUST_LOSS_RESULT_1'] = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name', 'cust_type', 'cust_level',
                                     'net_age', 'user_count', 'itv_user_count', 'itv_active','prod_inst_id', 'is_main',
                                     'is_second','dev_age', 'itv_use_age', 'itv_expire_days', 'not_itv_expire_days',
                                     'ord_prod_count_1m', 'ord_prod_count_3m', 'ord_prom_num_1m', 'ord_prom_num_3m',
                                     'bill_amount_1m', 'bill_amount_3m', 'open_daycnt_1m', 'open_cnt_1m',
                                     'open_daycnt_3m','open_cnt_3m', 'vod_day_1m', 'vod_num_1m', 'vod_amount_1m',
                                     'vod_day_3m','vod_num_3m', 'vod_amount_3m', 'tv_day_1m', 'tv_num_1m', 'tv_day_3m',
                                     'tv_num_3m','review_day_1m', 'review_num_1m', 'review_day_3m', 'review_num_3m',
                                     'is_lost','is_lost_predict_nn', 'is_lost_prob_nn', 'is_lost_predict_rf',
                                    'is_lost_prob_rf','is_lost_predict_dt', 'is_lost_prob_dt','etl_time']

        # cust value model constants
        para['CUST_VALUE_FEATURE'] = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name', 'cust_type', 'cust_level',
                                      'net_age','user_count','itv_usr_cnt','fee_usr_cnt','dbitv_usr_cnt','ditv_usr_cnt',
                                      'hdtv_usr_cnt','lan_usr_cnt','prod_inst_id', 'bill_id', 'prod_count_1m',
                                      'prod_count_3m','days_from_last_ord','bill_amount_1m','bill_amount_3m',
                                      'days_from_last_view', 'view_days_1m', 'view_num_1m']
        para['CUST_VALUE_FEATURE_STR'] = ",".join(para['CUST_VALUE_FEATURE'])

        para['USER_RFM_FEATURE'] = ['prod_inst_id', 'bill_amount_1m', 'days_from_last', 'sum_num']
        para['CUSTVALUE_KMEANS_COLS'] = ['cust_type', 'cust_level', 'net_age', 'user_count', 'itv_usr_cnt',
                                         'fee_usr_cnt','dbitv_usr_cnt','ditv_usr_cnt','hdtv_usr_cnt',
                                         'lan_usr_cnt','prod_count','bill_amount_h','rfm_avg']

        para['CUSTVALUE_RESULT_COLS'] = ['cust_id', 'cust_name', 'cust_type', 'cust_level', 'net_age', 'user_count',
                                         'itv_usr_cnt','prod_count','bill_amount_h','R','F','M','value_code',
                                         'value_label']


        # offer value model constants
        para['OFFER_VALUE_COLS'] = ['offer_id', 'offer_name', 'offer_grow', 'offer_loyal', 'offer_health', 'offer_arpu',
                                    'offer_important', 'offer_tv_num', 'offer_tv_days', 'offer_review_num',
                                    'offer_review_days','offer_vod_num', 'offer_vod_days']
        para['OFFER_VALUE_COLS_STR'] = ",".join(para['OFFER_VALUE_COLS'])
        para['OFFER_VALUE_FEATURE_COLS'] = ['offer_id','offer_name','offer_grow', 'offer_loyal', 'offer_health',
                                           'offer_arpu', 'offer_important','offer_co_num', 'offer_co_days']
        para['OFFER_VALUE_FEATURE_DIM'] = ['offer_grow', 'offer_loyal', 'offer_health','offer_arpu', 'offer_important',
                                           'offer_co_num', 'offer_co_days']
        # para['dim_weigth'] = np.array([45, 40.0, 35, 42.5, 45, 32, 10.5])
        para['OFFER_DIM_WIEGTH'] = pd.DataFrame([{'offer_grow': 4.5, 'offer_loyal': 4.00, 'offer_health': 3.5,
                                                  'offer_arpu':4.25,'offer_important': 4.5, 'offer_co_num': 3.2,
                                                  'offer_co_days': 1.05}])


        # offer rec model constants
        para['OFFER_REC_COLS'] = ['PROD_INST_ID','IS_MAIN','IS_SECOND','IS_ATV','IS_DTV','IS_DITV','IS_DFTV','IS_LAN',
                                  'OFFER_ID','PROD_ID','TV_NUMS','TV_DAYS','VOD_NUM','VOD_DAYS','VOD_FEE','REVIEW_NUM',
                                  'REVIEW_DAYS','DAYS_FROM_LAST_VIEW','BILL_AMOUNT_1M','VIEW_DAYS_1M','VIEW_NUM_1M']
        para['OFFER_REC_COLS_STR'] = ",".join(para['OFFER_REC_COLS'])

        para['OFFER_REC_USER_COL'] = ['PROD_INST_ID','IS_MAIN','IS_SECOND','IS_ATV', 'IS_DTV', 'IS_DITV', 'IS_DFTV',
                                      'IS_LAN', 'TV_NUMS','TV_DAYS','VOD_NUM', 'VOD_DAYS', 'VOD_FEE', 'REVIEW_NUM',
                                      'REVIEW_DAYS','DAYS_FROM_LAST_VIEW', 'BILL_AMOUNT_1M', 'VIEW_DAYS_1M',
                                      'VIEW_NUM_1M']
        para['OFFER_REC_CLUSTER'] = ['IS_MAIN','IS_DTV','IS_DITV','IS_DFTV','IS_LAN','TV_NUMS',
                                     'TV_DAYS','VOD_NUM','VOD_DAYS','VOD_FEE','REVIEW_NUM','REVIEW_DAYS',
                                     'DAYS_FROM_LAST_VIEW','BILL_AMOUNT_1M','VIEW_DAYS_1M','VIEW_NUM_1M']
        para['OFFER_REC_RESULT'] = ['PROD_INST_ID','IS_MAIN','IS_SECOND','IS_ATV', 'IS_DTV', 'IS_DITV', 'IS_DFTV',
                                  'IS_LAN','VALUE_LABEL','VALUE_CODE','OFFER_ID']


        # 用户推荐模型
        para['USER_REC_COLS'] = ['PROD_INST_ID','IS_MAIN','IS_SECOND','IS_ATV', 'IS_DTV', 'IS_DITV', 'IS_DFTV','IS_LAN',
                                 'DEV_AGE','CONTENT_ID','SUB_FILM_NAME', 'VOD_CNT', 'VOD_DURATION']
        para['USER_REC_COLS_STR'] = ",".join(para['USER_REC_COLS'])
        para['USER_SIM_ATTR'] = ['IS_MAIN', 'IS_SECOND', 'IS_ATV', 'IS_DTV', 'IS_DITV', 'IS_DFTV',
                                 'IS_LAN', 'DEV_AGE', 'VOD_CNT']
        para['USER_FEATURE'] = para['USER_SIM_ATTR'] + ['PROD_INST_ID']
        para['USER_CONTENT'] = ['PROD_INST_ID','CONTENT_ID','VOD_CNT','VOD_DURATION']




        # 模型异常信息设置
        # para['DATA_INPUT_ERROR_MSG'] = 'date input error.'
        # para['NETWORK_URL_ERROR_MSG'] = u'获取失败，请检查网络和URL'
        # para['DATE_CHK_MSG'] = u'年度输入错误：请输入1989年以后的年份数字，格式：YYYY'
        # para['DATA_CHK_NULL_MSG'] = u'数据集为空：请检查原始数据'


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)