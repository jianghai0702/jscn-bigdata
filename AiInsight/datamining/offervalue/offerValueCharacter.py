#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:    offerValueCharacter.py
# **  功能描述:    套餐价值临时表定义文件
# **  创建者:      sunwj
# **  创建日期:    2017-10-31
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "lossmodel", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from paraUtils import *
from hiveUtils import *
from offerValueTableDdl import *

# 全局参数引入
setPara()
##自定义变量声明
#===========================================================================================


#===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']

def setCharacters():
    """
    
    :return: 
    """
    try:

        # 套餐重要性     套餐收益在总套餐中的贡献度 套餐优惠后计费收入／套餐优惠后总收入
        # 套餐成长性     套餐用户增长情况 ｛在网用户数, 近三个月新增用户／当前在网总用户｝
        # 套餐的收益性    套餐优惠后ARPU｛套餐价格／套餐周期｝
        # 套餐忠诚度     流失用户占到期用户的比例｛最近三个月流失用户／最近三个月到期用户数｝
        # 套餐消费量     用户活跃度｛平均套餐"上网"时长 等价于 点播天数（次数）／回放天数（次数）／直播收视天数（次数）｝
        # 套餐健康度     用户粘性｛套餐每天平均上网时长超过2小时的用户数 等价于
        #                      平均每月 点播天数（次数）／回放天数（次数）／直播收视天数（次数）> X天（次数） ｝

        logger.info('套餐价值特征....')
        #
        # 套餐 DIM表
        hsql = '''insert overwrite table %(tmp_dim_offer)s
                  select product_item_id
                  from %()s
                  where item_type='OFFER_PLAN'
                    and use_exp_date >= '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
        ''' % para

        # 近1年有效的用户和套餐、产品订购数据
        hsql = '''insert into table %(tmp_valid_offer_sub1)s
                   select distinct offer_id
                                  ,offer_inst_id
                                  ,create_date
                   from %(stg_h_ins_offer)s
                   where own_corp_org_id = '3002'
                     and pt_year = '%(ARG_YEAR)s'
                     and from_unixtime(unix_timestamp(create_date),'yyyy-MM-dd') <=
                         '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'

        ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert into table %(tmp_valid_offer_sub2)s
                  select DISTINCT prod_inst_id
                            ,srvpkg_id
                            ,offer_inst_id
                     from %(stg_h_ins_srvpkg)s
                     where pt_year = '%(ARG_YEAR)s' and from_unixtime(unix_timestamp(create_date),'yyyy-MM-dd')
                        <='%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                       and state = '1'
                       and prod_inst_id is not null
                       and prod_service_id in ('1002','1003','1005','1006','1008')
        ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert into table %(tmp_valid_offer)s
                  select DISTINCT t1.offer_id
                         ,t2.srvpkg_id
                         ,t2.prod_inst_id
                         ,t1.create_date
                  from %(tmp_valid_offer_sub1)s t1
                  left join %(tmp_valid_offer_sub2)s t2
                  on t1.offer_inst_id = t2.offer_inst_id
                  where t2.prod_inst_id is not null
        ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐成长性 当前在网用户数 新增用户数
        hsql = '''insert overwrite table %(tmp_offervalue_grow)s
                  select  t.offer_id
                          ,count(distinct case when from_unixtime(unix_timestamp(t.create_date),'yyyy-MM') =
                           '%(ARG_OPTIME_LASTMON_ISO)s' then t.prod_inst_id else null end) NEW_CNT_3M
                          ,count(distinct prod_inst_id) TOTAL_CNT
                  from  %(tmp_valid_offer)s t
                  group by offer_id
                      ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐忠诚度 流失用户占到期用户的比例｛最近三个月流失用户／最近三个月到期用户数｝
        hsql = '''insert overwrite table %(tmp_offervalue_loyal)s
                  select t.offer_id
                         ,count(distinct t1.prod_inst_id) OFFER_LOST_CNT_3M
                         ,count(distinct t2.prod_inst_id) OFFER_EXPIRE_CNT_3M
                  from %(tmp_valid_offer)s t
                  left join %(dwa_usr_list_expire)s t1 on t.prod_inst_id = t1.prod_inst_id
                  left join %(dwa_usr_list_loss)s t2 on t.prod_inst_id = t2.prod_inst_id
                  and t2.pt_mon between %(ARG_OPTIME_LAST3MON)s and %(ARG_OPTIME_LASTMON)s
                  where t1.pt_mon between %(ARG_OPTIME_LAST3MON)s and %(ARG_OPTIME_LASTMON)s
                  group by t.offer_id
            ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐健康度
        # 由于无法得到时长数据，因此以使用天数作为判断的规则
        hsql = '''insert overwrite table %(tmp_offervalue_health)s
                  select distinct t.offer_id
                         ,'0'
                  from %(tmp_valid_offer)s t
                  where t.prod_inst_id is not null
        ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐的ARPU = 套餐周期/费用
        # 生成目标表数据, prod_service_id ='1004' 宽带产品
        # 目前只有201708的数据
        hsql = '''insert overwrite table %(tmp_offervalue_arpu_sub)s
                  select distinct T1.OFFER_ID
                         ,T1.OFFER_NAME
                         ,T1.OFFER_CREATE_DATE
                         ,t1.srvpkg_id
                         ,CASE REGEXP_EXTRACT(SRVPKG_NAME,'([_]*)([0-9]+\\.[0-9]*)([元]*)([/0-9]*)([个]*)([月年]+)',6)
                          WHEN '月' THEN case length(REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个月]',1))
                                         when 0 then 1 else REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个月]',1) end
                          WHEN '年' THEN case length(REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个年]',1))
                                         when 0 then 12 else REGEXP_EXTRACT(T1.SRVPKG_NAME,'/([0-9]*)[个月]',1)*12 end
                          ELSE null  END  OFFER_CYCLE
                         ,CASE REGEXP_EXTRACT(SRVPKG_NAME,'([_]*)([0-9]+\\.[0-9]*)([元]*)([/0-9]*)([个]*)([月年]+)',3)
                          WHEN '元' THEN COALESCE(REGEXP_EXTRACT(SRVPKG_NAME,
                              '([_]*)([0-9]+\\.[0-9]*)([元/]*)([0-9]*)([个]*)([月年]+)',2),0)
                          ELSE 0  END  OFFER_CHARGE
                  FROM %(stg_rep_order_prod)s T1
                  WHERE T1.PT_MON = '201708'
                    AND T1.STATE = '1'
                    AND T1.PROD_SERVICE_ID in ('1002','1003','1005','1006','1008')
            ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table %(tmp_offervalue_arpu)s
                  select   tp.offer_id
                          ,tp.offer_name
                          ,round(sum(tp.v_arpu),2) offer_arpu
                  from
                  (
                    select offer_id
                           ,offer_name
                           ,case when (OFFER_CYCLE is null or offer_cycle = 0) then 0 else
                                      round(OFFER_CHARGE/offer_cycle,2) end v_arpu
                    from %(tmp_offervalue_arpu_sub)s
                  ) tp
                  group by tp.offer_id,tp.offer_name
        ''' % para
        hiveClient.hiveExe(hsql)

        # 套餐重要性  套餐计费总收入占比 = 套餐优惠后计费收入／优惠后总收入
        hsql = '''insert overwrite table %(tmp_offervalue_important)s
                  select distinct t1.offer_id
                         ,case when t2.sum_arpu <> '0' then round(t1.offer_arpu/t2.sum_arpu,5) else 0 end offer_important
                  from %(tmp_offervalue_arpu)s t1,
                   (
                   select sum(offer_arpu)  sum_arpu
                   from %(tmp_offervalue_arpu)s
                   ) t2
        ''' % para
        hiveClient.hiveExe(hsql)

        # 用户消费量
        # 生成 回放用户数据
        hsql = '''insert overwrite table %(tmp_offervalue_review)s
                  select user_id PROD_INST_ID
                         ,max(to_date(regexp_replace(start_time,'/','-'))) LAST_REVIEW_DATE
                         ,count(user_id) REVIEW_NUM
                         ,count(distinct substr(start_time,1,10)) REVIEW_DAYS
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                  and data_source_cd = 'VOD'
                  group by user_id
                        ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 点播用户数据
        hsql = '''insert overwrite table %(tmp_offervalue_vod)s
                  select user_id PROD_INST_ID
                         ,max(to_date(regexp_replace(start_time,'/','-'))) LAST_VOD_DATE
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
        hsql = '''insert overwrite table %(tmp_offervalue_tv)s
                  select user_id PROD_INST_ID
                         ,max(from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyy-MM-dd')) LAST_TV_DATE
                         ,count(1) TV_NUM
                         ,count(distinct from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyy-MM-dd')) TV_DAYS
                   from %(dwd_ter_service)s
                   where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and OWN_CORP_STD_ORG_CODE='100901'
                   group by user_id
                 ''' % para
        hiveClient.hiveExe(hsql)


        # 套餐的总的"消耗"特征（平均）
        hsql = '''insert overwrite table %(tmp_offervalue_view)s
                  select t.offer_id
                        ,avg(nvl(t3.tv_num,0))   offer_tv_num
                        ,avg(nvl(t3.tv_days,0))  offer_tv_days
                        ,avg(nvl(t1.REVIEW_NUM,0))  offer_review_num
                        ,avg(nvl(t1.REVIEW_DAYS,0)) offer_review_days
                        ,avg(nvl(t2.VOD_NUM,0))  offer_vod_num
                        ,avg(nvl(t2.VOD_DAYS,0)) offer_vod_days
                  from %(tmp_valid_offer)s t
                  left join %(tmp_offervalue_review)s t1 on t.prod_inst_id = t1.prod_inst_id
                  left join %(tmp_offervalue_vod)s t2 on t.prod_inst_id = t2.prod_inst_id
                  left join %(tmp_offervalue_tv)s t3 on t.prod_inst_id = t3.prod_inst_id
                  group by t.offer_id
        ''' % para
        hiveClient.hiveExe(hsql)

        # 生成套餐价值特征
        hsql = '''insert overwrite table %(dwa_offer_value_character)s partition (pt_mon = '%(ARG_OPTIME_LASTMON)s')
                  select distinct t.offer_id
                         ,t4.offer_name
                         ,case when t1.TOTAL_CNT<>0 and t1.TOTAL_CNT is not null then 
                                round(t1.NEW_CNT_3M/t1.TOTAL_CNT,5) else 0 end offer_grow
                         ,case when t2.offer_expire_cnt_3m<>'0' and t2.offer_expire_cnt_3m is not null then
                                 round(t2.offer_lost_cnt_3m/t2.offer_expire_cnt_3m,2) else 0 end offer_loyal
                         ,t3.offer_he
                         ,t4.offer_arpu
                         ,t5.offer_im
                         ,t6.tv_num
                         ,t6.tv_days
                         ,t7.review_num
                         ,t7.review_days
                         ,t8.vod_num
                         ,t8.vod_days
                         ,'TZ' data_source_cd
                         ,CURRENT_TIMESTAMP
                  from %(tmp_valid_offer)s t
                  left join %(tmp_offervalue_grow)s t1 on t.offer_id = t1.offer_id
                  left join %(tmp_offervalue_loyal)s t2 on t.offer_id = t2.offer_id
                  left join %(tmp_offervalue_health)s t3 on t.offer_id = t3.offer_id
                  left join %(tmp_offervalue_arpu)s t4 on t.offer_id = t4.offer_id
                  left join %(tmp_offervalue_important)s t5 on t.offer_id = t5.offer_id
                  left join %(tmp_offervalue_tv)s t6 on t.prod_inst_id = t6.prod_inst_id
                  left join %(tmp_offervalue_review)s t7 on t.prod_inst_id = t7.prod_inst_id
                  left join %(tmp_offervalue_vod)s t8 on t.prod_inst_id = t8.prod_inst_id
        ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)