# -*- coding:utf-8 -*-
"""
Created on 2017/12/1
@author: wanju Sun
@group : 
@contact: 
"""


CUST_BASE_COLS  = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name','cust_type','cust_level','net_age']
CUST_VOD_INFO = ['cust_id','vod_day_1m','vod_num_1m','vod_day_3m','vod_num_3m']
CUST_TVLIVE_INFO = ['cust_id','tv_day_1m','tv_num_1m','tv_day_3m','tv_num_3m']
CUST_REVIEW_INFO = ['cust_id','review_day_1m','review_num_1m','review_day_3m','review_num_3m']

USER_DEVICE_INFO = ['']
USER_ACCOUNT_INFO = ['cust_id','prod_inst_id','bill_amount_1m','bill_amount_3m']
USER_VOD_INFO = ['cust_id','prod_inst_id','vod_day_1m','vod_num_1m','vod_day_3m','vod_num_3m']   # vod_duration
USER_TVLIVE_INFO = ['cust_id','prod_inst_id','tv_day_1m','tv_num_1m','tv_day_3m','tv_num_3m']
USER_REVIEW_INFO = ['cust_id','prod_inst_id','review_day_1m','review_num_1m','review_day_3m','review_num_3m']
USER_ORD_INFO = ['cust_id','prod_inst_id','ord_prod_count_1m','ord_prod_count_3m']
USER_EXPIRE_INFO = ['cust_id','prod_inst_id','is_itv_offer','expire_days']

# cust loss model constants
CUST_LOSS_COLUMNS = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name','cust_type','cust_level','net_age',
                     'user_count', 'itv_user_count', 'itv_active', 'is_main','is_second', 'dev_age', 'itv_use_age',
                     'itv_expire_days', 'not_itv_expire_days', 'ord_prod_count_1m','ord_prod_count_3m', 'ord_prom_num_1m',
                     'ord_prom_num_3m', 'bill_amount_1m', 'bill_amount_3m','open_daycnt_1m', 'open_cnt_1m',
                     'open_daycnt_3m', 'open_cnt_3m', 'vod_day_1m','vod_num_1m','vod_amount_1m',
                     'vod_day_3m','vod_num_3m','vod_amount_3m','tv_day_1m','tv_num_1m','tv_day_3m','tv_num_3m',
                     'review_day_1m','review_num_1m','review_day_3m','review_num_3m','pt_mon']
CUST_LOSS_COLUMNS = ",".join(CUST_LOSS_COLUMNS)
CUST_TRAIN_FEATURE = ['cust_type','cust_level','net_age',
                     'user_count', 'itv_user_count', 'itv_active', 'is_main','is_second', 'dev_age', 'itv_use_age',
                     'itv_expire_days', 'not_itv_expire_days', 'ord_prod_count_1m','ord_prod_count_3m', 'ord_prom_num_1m',
                     'ord_prom_num_3m', 'bill_amount_1m', 'bill_amount_3m','open_daycnt_1m', 'open_cnt_1m',
                     'open_daycnt_3m', 'open_cnt_3m', 'vod_day_1m','vod_num_1m','vod_amount_1m',
                     'vod_day_3m','vod_num_3m','vod_amount_3m','tv_day_1m','tv_num_1m','tv_day_3m','tv_num_3m',
                     'review_day_1m','review_num_1m','review_day_3m','review_num_3m']
CUST_LOSS_RESULT = ['cust_id', 'cust_name', 'corp_org_id', 'corp_org_name','cust_type','cust_level',
                    'is_lost', 'is_lost_prob']

test = '''select %(CUST_LOSS_COLUMNS)s''' % vars()
print(test)
