#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       offerRecCharacter.py
# **  功能描述:       套餐推荐
# **  创建者:         sunwj
# **  创建日期:       2017-12-25
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
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

from config import *
from hiveUtils import hiveClient
from paraUtils import *
from offerRecTableDdl import *


setPara()

tmp=vars()
para = tmp['para']


def setCharacters():
    """
    
    :return: 
    """
    try:
        # 套餐DIM表
        hsql = ''' insert overwrite table %(tmp_dim_offers)s
                   select distinct product_item_id offer_id
                   from %(stg_up_product_item)s
                   where to_date(valid_date) < '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                     and to_date(EXPIRE_DATE) > '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                     and item_type = 'OFFER_PLAN'
            ''' % para
        hiveClient.hiveExe(hsql)

        # 产品DIM表
        hsql = ''' insert overwrite table %(tmp_dim_prods)s
                    select distinct product_item_id prod
                    from %(stg_up_product_item)s
                    where to_date(valid_date) < '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                      and to_date(EXPIRE_DATE) > '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                      and item_type = 'SERVICE_PRICE'
                    ''' % para
        hiveClient.hiveExe(hsql)


        # 用户订购的套餐表

        # 近1年有效套餐订购实例
        hsql = '''insert into table %(tmp_valid_ord_offer)s
                  select distinct offer_id
                                 ,offer_inst_id
                                 ,create_date
                                 ,expire_date
                  from %(stg_h_ins_offer)s
                  where own_corp_org_id = '3002'
                    and pt_year = '%(ARG_YEAR)s'
                    and from_unixtime(unix_timestamp(create_date),'yyyy-MM-dd') <=
                        '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 当前月份套餐使用的天数／当月的有效天数
        # hsql = '''insert overwrite table %()s
        #
        #
        #
        #
        # ''' % para
        # hiveClient.hiveExe(hsql)



        # 近1年有效的产品订购实例（用户）
        hsql = '''insert into table %(tmp_valid_ord_prod)s
                  select DISTINCT prod_inst_id
                             ,srvpkg_id
                             ,offer_inst_id
                             ,prod_service_id  prod_type
                             ,create_date
                             ,expire_date
                  from %(stg_h_ins_srvpkg)s
                  where pt_year = '%(ARG_YEAR)s' and to_date(create_date)
                     <='%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                    and state = '1'
                    and prod_inst_id is not null
                    and prod_service_id in ('1002','1003','1005','1006','1008')
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 用户订购套餐 历史数据
        hsql = '''insert into table %(tmp_oferrec_offers)s
                  select DISTINCT t2.prod_inst_id
                         ,t1.offer_id
                         ,t2.srvpkg_id prod_id
                         ,t2.prod_type
                         ,case when t2.prod_type = '1002' then '数字基本业务' 
                               when t2.prod_type = '1003' then '互动基本业务'
                               when t2.prod_type = '1004' then '宽带业务'
                               when t2.prod_type = '1005' then '付费频道业务'
                               when t2.prod_type = '1006' then '互动点播业务'
                               when t2.prod_type = '1008' then '云媒体增值业务'
                         else 0 end type_name   
                         ,t1.create_date create_date_prod
                         ,t1.expire_date expire_date_prod
                         ,t2.create_date create_date_offer
                         ,t2.expire_date expire_date_offer
                  from %(tmp_valid_ord_offer)s t1
                  left join %(tmp_valid_ord_prod)s t2
                  on t1.offer_inst_id = t2.offer_inst_id
                  where t2.prod_inst_id is not null
                   ''' % para
        hiveClient.hiveExe(hsql)

        #
        # 用户消费量
        # 生成 回放用户数据
        hsql = '''insert overwrite table %(tmp_offerrec_review)s
                  select user_id PROD_INST_ID
                         ,count(user_id) REVIEW_NUM
                         ,count(distinct substr(start_time,1,10)) REVIEW_DAYS
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                  and data_source_cd = 'VOD'
                  group by user_id
                ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 点播用户数据
        hsql = '''insert overwrite table %(tmp_offerrec_vod)s
                  select user_id PROD_INST_ID
                         ,count(user_id) VOD_NUM
                         ,COUNT(DISTINCT substr(start_time,1,10)) VOD_DAYS
                         ,sum(charge1)
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                   and data_source_cd <> 'VOD'
                   group by user_id
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 直播用户数据
        hsql = '''insert overwrite table %(tmp_offerrec_tv)s
                  select user_id PROD_INST_ID
                         ,count(1) TV_NUM
                         ,count(distinct to_date(time)) TV_DAYS
                   from %(dwd_ter_service)s
                   where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and OWN_CORP_STD_ORG_CODE='100901'
                   group by user_id
                 ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐（产品）消费量 目的在于将消费量转化为套餐的评分

        # 套餐（产品）推荐特征表
        # 近3个月的订购产品数
        hsql = '''insert overwrite table %(dwa_offer_rec_character)s partition (pt_mon ='%(ARG_OPTIME_LASTMON)s')
                  select distinct t.prod_inst_id
                         ,t4.is_main
                         ,t4.is_second
                         ,t4.is_atv
                         ,t4.is_dtv
                         ,t4.is_dftv
                         ,t4.is_ditv
                         ,t4.is_lan
                         ,t.offer_id
                         ,t.prod_id
                         ,t.prod_type
                         ,t.type_name
                         ,to_date(t.create_date_prod)
                         ,to_date(t.expire_date_prod)
                         ,to_date(t.create_date_offer)
                         ,to_date(t.expire_date_offer)
                         ,nvl(t1.tv_num,0)
                         ,nvl(t1.tv_days,0)
                         ,nvl(t2.vod_num,0)
                         ,nvl(t2.vod_days,0)
                         ,nvl(t2.vod_fee,0)
                         ,nvl(t3.review_num,0)
                         ,nvl(t3.review_days,0)
                         ,nvl(t7.days_from_last_view,30)
                         ,nvl(t7.bill_amount_1m,0)
                         ,nvl(t7.view_days_1m,0)
                         ,nvl(t7.view_num_1m,0)
                         ,'TZ' data_source_cd
                         ,CURRENT_TIMESTAMP  
                  from  %(tmp_oferrec_offers)s t
                  left join %(tmp_offerrec_tv)s t1 on t.prod_inst_id = t1.prod_inst_id
                  left join %(tmp_offerrec_vod)s t2 on t.prod_inst_id = t2.prod_inst_id
                  left join %(tmp_offerrec_review)s t3 on t.prod_inst_id = t3.prod_inst_id 
                  left join %(dwa_fact_ins_prod)s t4 on t.prod_inst_id = t4.prod_inst_id 
                      and t4.own_corp_std_org_code = '100901' and t4.pt_time = '%(ARG_OPTIME_LASTMONLASTDAY)s'
                      and t4.is_vaild1 = '1' and t4.prod_inst_id is not null
                  left join  %(tmp_dim_offers)s t5 on t.offer_id = t5.offer_id and t5.offer_id is not null
                  left join  %(tmp_dim_prods)s t6 on t.prod_id = t6.prod_id and t6.prod_id is not null
                  left join  %(dwa_cust_value_character)s t7 on t.prod_inst_id = t7.prod_inst_id and 
                       t7.pt_mon = '%(ARG_OPTIME_LASTMON)s'
                  ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)




