#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       dwa_character.py
# **  功能描述:       生成用户、客户行为宽表
# **  创建者:         sunwj
# **  创建日期:       2017-11-24
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "lossmodel", "custvalue", "offervalue","result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from hiveUtils import hiveClient
from paraUtils import *
from dwaCharacterTableDdl import *

# 全局参数引入
setPara()

# 获取参数
tmp = vars()
para = tmp['para']



def setCharacters():
    try:

        # 客户行为数据
        # 生成 客户的 客户类型、客户级别、入网账龄
        hsql = '''insert overwrite table %(tmp_dwa_character_1)s
                  select  distinct t1.cust_id
                          ,t1.cust_code
                          ,t1.cust_name
                          ,t1.own_corp_org_id corp_org_id
                          ,t2.std_org_name corp_org_name
                          ,t1.cust_type
                          ,t1.cust_level
                          ,round(datediff(to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'),
                           to_date(t1.create_date))/365,2) net_age
                  from %(stg_cm_customer)s t1
                  left join %(dim_std_organize)s t2 on t1.own_corp_org_id=t2.organize_id and t2.std_org_code = '100901'
                  where  t1.own_corp_org_id is not null
                    and t1.cust_id is not null
                    and to_date(t1.create_date) < to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s')
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 存放 客户下的用户数、互动用户数
        hsql = '''insert overwrite table %(tmp_dwa_character_2)s
                  select  t1.cust_id
                          ,count(distinct case when is_vaild1='1' then t1.prod_inst_id else null end) user_count
                          ,count(distinct case when (t1.is_dbitv = '1' or t1.is_ditv = '1') then t1.prod_inst_id
                            else null end) itv_user_count
                          ,count(distinct case when t1.is_dftv = '1' then t1.prod_inst_id else null end ) fee_usr_cnt
                          ,count(distinct case when t1.is_dbitv= '1' then t1.prod_inst_id else null end ) dbitv_usr_cnt
                          ,count(distinct case when t1.is_ditv = '1' then t1.prod_inst_id else null end) ditv_usr_cnt
                          ,count(distinct case when t1.is_hdtv = '1' then t1.prod_inst_id else null end) hdtv_usr_cnt
                          ,count(distinct case when t1.is_lan = '1' then t1.prod_inst_id else null end) lan_usr_cnt
                  from %(dwa_fact_ins_prod)s t1
                  where t1.is_vaild1 ='1'
                     and t1.pt_time = '%(ARG_OPTIME_LASTMONLASTDAY)s'
                     and t1.own_corp_std_org_code = '100901'
                     and t1.cust_id is not null
                  group by t1.cust_id''' % para
        hiveClient.hiveExe(hsql)


        # 生成客户特征数据表
        hsql = '''insert overwrite table  %(dwa_base_character_cust)s partition(pt_mon ='%(ARG_OPTIME_LASTMON)s')
                  select distinct t1.cust_id
                         ,t1.cust_code
                         ,t1.cust_name
                         ,t1.corp_org_id
                         ,t1.corp_org_name
                         ,t1.cust_type
                         ,t1.cust_level
                         ,t1.net_age
                         ,t2.user_cnt
                         ,t2.itv_user_cnt
                         ,t2.fee_usr_cnt
                         ,t2.dbitv_usr_cnt
                         ,t2.ditv_usr_cnt
                         ,t2.hdtv_usr_cnt
                         ,t2.lan_usr_cnt
                         ,'%(data_source_cd)s'
                         ,CURRENT_TIMESTAMP
                  from %(tmp_dwa_character_1)s t1
                  left join %(tmp_dwa_character_2)s t2 on t1.cust_id = t2.cust_id
                 ''' % para
        hiveClient.hiveExe(hsql)

        # 用户行为数据
        # 近1年有效套餐订购实例
        hsql = '''insert into table %(tmp_dwa_character_3)s
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
        # 近1年有效的产品订购实例（用户）
        hsql = '''insert into table %(tmp_dwa_character_4)s
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
        hsql = '''insert into table %(tmp_dwa_character_9)s
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
                  from %(tmp_dwa_character_3)s t1
                  left join %(tmp_dwa_character_4)s t2
                  on t1.offer_inst_id = t2.offer_inst_id
                  where t2.prod_inst_id is not null
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月订购的产品个数
        # hsql = ''' insert overwrite table %(tmp_dwa_character_3)s
        #            select prod_inst_id
        #                   ,count(distinct case when from_unixtime(unix_timestamp(create_date),'yyyyMM') =
        #                   '%(ARG_OPTIME_LASTMON)s' then srvpkg_id else null end) ord_prod_count_1m
        #                   ,count(distinct srvpkg_id) ord_prod_count_3m
        #            from %(stg_h_ins_srvpkg)s
        #            where from_unixtime(unix_timestamp(create_date),'yyyyMM') between '%(ARG_OPTIME_LAST3MON)s'
        #                  and '%(ARG_OPTIME_LASTMON)s'
        #                and state = '1'
        #                and prod_service_id in ('1002','1003','1005','1006','1008')
        #            group by prod_inst_id
        # ''' % para
        # hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月订购的套餐个数
        # hsql = ''' insert overwrite table %(tmp_dwa_character_4)s
        #             select t2.prod_inst_id
        #                    ,count(distinct case when from_unixtime(unix_timestamp(t1.create_date),'yyyyMM') =
        #                    '%(ARG_OPTIME_LASTMON)s' then t1.offer_id else null end) ord_offer_count_1m
        #                    ,count(distinct t1.offer_id) ord_offer_count_3m
        #             from %(stg_h_ins_offer)s t1
        #             left join %(stg_h_ins_srvpkg)s t2 on t1.offer_inst_id = t2.offer_inst_id
        #             where from_unixtime(unix_timestamp(t1.create_date),'yyyyMM') between '%(ARG_OPTIME_LAST3MON)s'
        #                   and '%(ARG_OPTIME_LASTMON)s'
        #               and from_unixtime(unix_timestamp(t2.create_date),'yyyyMM') between '%(ARG_OPTIME_LAST3MON)s'
        #                   and '%(ARG_OPTIME_LASTMON)s'
        #               and t2.state = '1'
        #               and t2.prod_service_id in ('1002','1003','1005','1006','1008')
        #               and t2.prod_inst_id is not null
        #             group by t2.prod_inst_id
        # ''' % para
        # hiveClient.hiveExe(hsql)

        # 近1个月和近3个月的出账金额
        hsql = '''insert overwrite table %(tmp_dwa_character_5)s
                  select  t.serv_id prod_inst_id
                          ,sum(case when t.billing_cycle_id='%(ARG_OPTIME_LASTMON)s' then t.amount
                           else 0 end) bill_amount_1m
                          ,sum(t.amount) bill_amount_3m
                  from %(dwd_acct_item)s t
                  where t.pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                     and t.serv_id is not null
                  group by t.serv_id
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月的点播情况 start_time
        hsql = '''insert overwrite table  %(tmp_dwa_character_6)s
                  select  user_id prod_inst_id
                         ,max(to_date(regexp_replace(start_time,'/','-'))) LAST_VOD_DATE
                         ,count(distinct case when from_unixtime(unix_timestamp(start_time),'yyyyMM') =
                                 %(ARG_OPTIME_LASTMON)s then to_date(regexp_replace(start_time,'/','-'))
                                  else null end) vod_day_1m
                         ,count(case when from_unixtime(unix_timestamp(start_time),'yyyyMM') =
                                 %(ARG_OPTIME_LASTMON)s then start_time else null end) vod_num_1m
                         ,round(sum(nvl(case when from_unixtime(unix_timestamp(start_time),'yyyyMM') =
                         %(ARG_OPTIME_LASTMON)s then charge1 else null end,0))/100,2) vod_amount_1m
                         ,count(distinct to_date(regexp_replace(start_time,'/','-'))) vod_day_3m
                         ,count(start_time) vod_num_3m 
                         ,round(sum(nvl(charge1,0))/100,2) vod_amount_3m
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                   and data_source_cd <> 'VOD'
                   and user_id is not null
                  group by user_id
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月的直播收视情况 time
        hsql = '''insert overwrite table %(tmp_dwa_character_7)s
                  select user_id
                         ,max(to_date(time)) LAST_TV_DATE
                         ,count(distinct case when to_date(time) = %(ARG_OPTIME_LASTMON_ISO)s then 
                          to_date(time) else null end) tv_day_1m
                         ,count(case when to_date(time) = %(ARG_OPTIME_LASTMON_ISO)s then time else null end) tv_num_1m
                         ,count(distinct to_date(time)) tv_day_3m
                         ,count(1) tv_num_3m
                   from %(dwd_ter_service)s
                   where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                   and OWN_CORP_STD_ORG_CODE='100901'
                   group by user_id
                    ''' % para
        hiveClient.hiveExe(hsql)


        # 用户近1个月和近3个月的回放收视情况
        hsql = '''insert overwrite table %(tmp_dwa_character_8)s
                  select  user_id prod_inst_id
                         ,max(to_date(regexp_replace(start_time,'/','-'))) LAST_REVIEW_DATE
                         ,count(distinct case when from_unixtime(unix_timestamp(start_time),'yyyyMM') = 
                          %(ARG_OPTIME_LASTMON)s then to_date(regexp_replace(start_time,'/','-')) 
                          else null end) review_day_1m
                         ,count(case when from_unixtime(unix_timestamp(start_time),'yyyyMM') =
                           %(ARG_OPTIME_LASTMON)s then start_time else null end) review_num_1m
                         ,count(distinct to_date(regexp_replace(start_time,'/','-'))) review_day_3m
                         ,count(start_time) review_num_3m
                  from %(stg_dr_ismp_yyyymm)s
                  where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                   and data_source_cd = 'VOD'
                   and user_id is not null
                  group by user_id
                  ''' % para
        hiveClient.hiveExe(hsql)

        # 设备(机顶盒)使用年龄 即用户的年龄
        hsql = '''insert overwrite table %(tmp_dwa_character_10)s
                  select  t1.prod_inst_id
                          ,round(datediff(to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'),
                                to_date(t3.valid_date))/365,2) dev_age
                  from %(stg_h_ins_prod_res)s t1
                  join %(stg_res_code_definition)s t2 on t1.res_code=t2.res_code and t2.res_type=2
                  join (
                           select t.serial_no
                                  ,t.valid_date
                                  ,row_number() over(partition by t.serial_no order by t.res_id desc) rn
                           from %(stg_res_terminal)s t
                           where t.state in ('3','4')
                             and to_date(t.valid_date) <= '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                     ) t3
                  on t1.res_equ_no=t3.serial_no and t3.rn =1
                  where t1.cust_id is not null
                  ''' % para
        hiveClient.hiveExe(hsql)



        # 近期要到期产品
        # hsql = '''insert overwrite table %(dwa_usr_list_expire)s partition(pt_mon = '%(ARG_OPTIME_LASTMON)s')
        #           select  prod_inst_id
        #                  ,expire_date
        #                  ,datediff(from_unixtime(unix_timestamp(expire_date),'yyyy-MM-dd'),
        #                    to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'))
        #           from %(stg_h_ins_srvpkg)s
        #           where from_unixtime(unix_timestamp(expire_date,'yyyy-MM-dd'),'yyyyMM') = %(ARG_OPTIME_LASTMON)s
        #             and prod_inst_id is not null
        #             and state = '1'
        #       ''' % para
        # hiveClient.hiveExe(hsql)

        # 近期要到期套餐
        # hsql = '''insert overwrite table %(dwa_usr_list_expire)s partition(pt_mon = '%(ARG_OPTIME_LASTMON)s')
        #           select  prod_inst_id
        #                  ,expire_date
        #                  ,datediff(from_unixtime(unix_timestamp(expire_date),'yyyy-MM-dd'),
        #                    to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'))
        #           from %(stg_h_ins_srvpkg)s
        #           where from_unixtime(unix_timestamp(expire_date,'yyyy-MM-dd'),'yyyyMM') = %(ARG_OPTIME_LASTMON)s
        #             and prod_inst_id is not null
        #             and state = '1'
        #               ''' % para
        # hiveClient.hiveExe(hsql)

        # 流失用户规则:上一个统计周期中有效，当前统计周期内失效的用户
        # hsql = '''insert overwrite table %(dwa_usr_list_loss)s partition (pt_mon ='%(ARG_OPTIME_LAST2MON)s')
        #                   select distinct t1.id1
        #                          ,'1' is_lost
        #                   from
        #                       (
        #                        select distinct prod_inst_id id1
        #                        from %(dwa_fact_ins_prod)s
        #                        where pt_time = '%(ARG_OPTIME_LAST2MONLASTDAY)s'
        #                           and own_corp_std_org_code = '100901'
        #                           and is_vaild1 = '1'
        #                           and cust_id is not null
        #                           and prod_inst_id is not null
        #                        ) t1
        #                       left outer join
        #                       (
        #                        select distinct prod_inst_id id2
        #                        from %(dwa_fact_ins_prod)s
        #                        where pt_time = '%(ARG_OPTIME_LASTMONLASTDAY)s'
        #                          and own_corp_std_org_code = '100901'
        #                          and is_vaild1 = '1'
        #                          and cust_id is not null
        #                          and prod_inst_id is not null
        #                       ) t2
        #                       on t1.id1 = t2.id2
        #                       where t2.id2 is null
        #                          ''' % para
        # hiveClient.hiveExe(hsql)


        # 写入用户行为数据表
        hsql = '''insert overwrite table %(dwa_base_character_usr)s partition(pt_mon ='%(ARG_OPTIME_LASTMON)s')
                  select  distinct t.prod_inst_id
                          ,t.bill_id
                          ,t.is_main
                          ,t.is_second
                          ,t.is_atv       
                          ,t.is_dtv               
                          ,t.is_dftv              
                          ,t.is_ditv              
                          ,t.is_lan 
                          ,t7.dev_age
                          ,t1.offer_id
                          ,t1.prod_id
                          ,t1.prod_type
                          ,t1.type_name
                          ,t1.create_date_prod
                          ,t1.expire_date_prod
                          ,t1.create_date_offer
                          ,t1.expire_date_offer
                          ,nvl(t3.bill_amount_1m,0)
                          ,nvl(t3.bill_amount_3m,0)
                          ,nvl(t4.VOD_DAY_1M,0)     
                          ,nvl(t4.VOD_NUM_1M,0)    
                          ,'0' VOD_DURATION_1M 
                          ,nvl(t4.VOD_AMOUNT_1M,0)  
                          ,nvl(t4.VOD_DAY_3M,0)    
                          ,nvl(t4.VOD_NUM_3M,0)      
                          ,'0' VOD_DURATION_3M 
                          ,nvl(t4.VOD_AMOUNT_3M,0)  
                          ,t4.LAST_VOD_DATE
                          ,nvl(t5.TV_DAY_1M,0)  
                          ,nvl(t5.TV_NUM_1M,0)   
                          ,'0' TV_DURATION_1M
                          ,nvl(t5.TV_DAY_3M,0)   
                          ,t5.TV_NUM_3M
                          ,'0' TV_DURATION_3M
                          ,t5.LAST_TV_DATE
                          ,nvl(t6.REVIEW_DAY_1M,0)   
                          ,nvl(t6.REVIEW_NUM_1M,0)
                          ,'0' REVIEW_DURATION_1M
                          ,nvl(t6.REVIEW_DAY_3M,0)  
                          ,nvl(t6.REVIEW_NUM_3M,0) 
                          ,'0' REVIEW_DURATION_3M
                          ,t6.LAST_REVIEW_DATE
                          ,'TZ'
                          ,CURRENT_TIMESTAMP
                  from %(dwa_fact_ins_prod)s t
                  left join %(tmp_dwa_character_9)s t1 on t.prod_inst_id = t1.prod_inst_id
                  left join %(tmp_dwa_character_5)s t3 on t.prod_inst_id = t3.prod_inst_id
                  left join %(tmp_dwa_character_6)s t4 on t.prod_inst_id = t4.prod_inst_id
                  left join %(tmp_dwa_character_7)s t5 on t.prod_inst_id = t5.prod_inst_id
                  left join %(tmp_dwa_character_8)s t6 on t.prod_inst_id = t6.prod_inst_id
                  left join %(tmp_dwa_character_10)s t7 on t.prod_inst_id = t7.prod_inst_id
                  where t.pt_time = '%(ARG_OPTIME_LASTMONLASTDAY)s'
                    and t.own_corp_std_org_code = '100901'
                    and t.cust_id is not null  
                    and t.prod_inst_id is not null
                   ''' % para
        hiveClient.hiveExe(hsql)


        # 流失用户
        # 流失用户规则:上一个统计周期中有效，当前统计周期内失效的用户
        # hsql = '''insert overwrite table %(tmp_dwa_character_9)s
        #           select distinct t1.prod_inst_id
        #                  ,'1' is_lost
        #           from
        #               (
        #                select distinct prod_inst_id
        #                from %(dwa_fact_ins_prod)s t1
        #                where substr(pt_time,0,6) = '%(ARG_OPTIME_LAST2MON)s'
        #                ) t1
        #               left outer join
        #               (
        #                select distinct prod_inst_id
        #                from %(dwa_fact_ins_prod)s t2
        #                where substr(pt_time,0,6) = '%(ARG_OPTIME_LASTMON)s'
        #               ) t2
        #           on t1.prod_inst_id = t2.prod_inst_id
        #           where t2.prod_inst_id is null
        #              ''' % para
        # hiveClient.hiveExe(hsql)
        #
        # hsql = ''' insert overwrite table %(dwa_usr_list_lost)s partition (pt_mon = '%(ARG_OPTIME_LAST2MON)s')
        #            select tp1.prod_inst_id
        #                   ,tp1.srvpkg_id
        #                   ,tp2.offer_id
        #                   ,tp1.is_lost
        #            from (
        #                   select t.prod_inst_id
        #                         ,t.is_lost
        #                         ,t1.offer_inst_id
        #                         ,t1.srvpkg_id
        #                   from %(tmp_dwa_character_9)s t
        #                   left join %(stg_h_ins_srvpkg)s t1 on t.prod_inst_id = t1.prod_inst_id
        #                   where t.pt_mon = '%(ARG_OPTIME_LASTMON)s'
        #                     and from_unixtime(unix_timestamp(t1.create_date),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
        #                     and t1.offer_inst_id is not null
        #                 ) tp1
        #            left join %(stg_h_ins_offer)s tp2 on tp1.offer_inst_id = tp2.offer_inst_id
        #            where from_unixtime(unix_timestamp(tp2.create_date),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
        # ''' % para


    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)


setCharacters()