#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       lossCharacter.py
# **  功能描述:       生成流失特征
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------

import sys
import os
from os.path import realpath
reload(sys)
sys.setdefaultencoding('utf8')

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from hiveUtils import *
from paraUtils import *
from lossModelTableDdl import *
from dataUtils import *

# 全局参数引入
setPara()
##自定义变量声明
# ===========================================================================================
para['tmp_table1'] = 'tmp_table1'
para['tmp_table2'] = 'tmp_table2'
para['tmp_table3'] = 'tmp_table3'
para['tmp_table4'] = 'tmp_table4'
para['tmp_table5'] = 'tmp_table5'
para['tmp_table6'] = 'tmp_table6'
# ===========================================================================================
# 获取参数
tmp = vars()
para = tmp['para']



# 临时表定义，筛选各个字段的值
def setCharacters():
    try:
        logger.info('begin to handle loss character......')
        #
        # 有效的用户和机顶盒匹配信息
        hsql = '''insert overwrite table %(tmp_valid_user)s
                   select distinct cust_id
                          ,prod_inst_id
                          ,bill_id
                          ,is_main
                          ,is_second
                   from %(dwd_fact_ins_prod)s
                   where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and own_corp_std_org_code = '100901'
                     and is_vaild1 = '1'
                     and cust_id is not null
                     and prod_inst_id is not null''' % para
        hiveClient.hiveExe(hsql)
        #
        # # 生成 客户的 客户类型、客户级别、入网账龄 tmp_loss_character_tz_1
        hsql = '''insert overwrite table %(tmp_cust_base_info)s
                   select  distinct t1.cust_id
                           ,t1.cust_code
                           ,t1.cust_name
                           ,t1.own_corp_org_id corp_org_id
                           ,t2.std_org_name corp_org_name
                           ,t1.cust_type
                           ,t1.cust_level
                           ,round(datediff(to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'),
                            to_date(t1.create_date))/365,2) net_age
                   from %(dwd_cm_customer)s t1
                   left join %(dim_std_organize)s t2
                   on t1.own_corp_org_id=t2.organize_id and t2.std_org_code = '100901'
                   where  t1.pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and t1.own_corp_org_id is not null
                     and t1.cust_id is not null
                     and to_date(t1.create_date) < to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s')
                     ''' % para
        hiveClient.hiveExe(hsql)

        # # 存放 客户下的用户数、互动用户数
        hsql = '''insert overwrite table  %(tmp_cust_busi_info)s
                   select  t1.cust_id
                          ,count(distinct t1.prod_inst_id) user_count
                          ,count(distinct case when (t1.is_dbitv = '1' or t1.is_ditv = '1') then t1.prod_inst_id
                            else null end) itv_user_count
                   from %(dwd_fact_ins_prod)s t1
                   where t1.is_vaild ='1'
                     and t1.pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and own_corp_std_org_code = '100901'
                     and t1.cust_id is not null
                   group by t1.cust_id''' % para
        hiveClient.hiveExe(hsql)

        # 存放 设备(机顶盒)使用年龄 tmp_cust_dev_info
        hsql = '''insert overwrite table %(tmp_cust_dev_info)s
                  select  t1.prod_inst_id
                          ,round(datediff(to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'),
                                to_date(t3.valid_date))/365,2) dev_age
                  from %(dwd_h_ins_prod_res)s t1
                  join %(dwd_res_code_definition)s t2 on t1.res_code=t2.res_code and t2.res_type=2
                  join (
                           select t.serial_no
                                  ,t.valid_date
                                  ,row_number() over(partition by t.serial_no order by t.res_id desc) rn
                           from %(dwd_res_terminal)s t
                           where t.state in ('3','4')
                             and to_date(t.valid_date) <= '%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'
                     ) t3
                  on t1.res_equ_no=t3.serial_no and t3.rn =1
                  where t1.cust_id is not null
                  ''' % para
        hiveClient.hiveExe(hsql)

        # 互动在网时长 tmp_loss_character_tz_4
        # 创建临时表
        hsql = '''create table if not exists %(tmp_table1)s (
                         prod_inst_id             string,
                         ord_age                  string
                     ) STORED AS RCFILE
                      LOCATION '%(tmp_path)s/%(tmp_table1)s'
                    ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table  %(tmp_table1)s
                  select  t.prod_inst_id
                          ,round(datediff(to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'),to_date(t.valid_date))/365,2) ord_age
                  from %(dwd_h_ins_srvpkg)s t
                  where t.prod_inst_id is not null
                     and t.prod_service_id in ('1003','1004')
                     and t.state='1'
                     and t.pt_year='%(ARG_YEAR)s'
               ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table  %(tmp_cust_itv_info)s
                  select distinct t.prod_inst_id
                         ,t.ord_age itv_use_age
                  from
                      (select prod_inst_id
                             ,ord_age
                             ,row_number()over(partition by prod_inst_id order by ord_age desc) rn
                      from %(tmp_table1)s
                      ) t
                  where t.rn=1
                    and t.prod_inst_id is not null
        ''' % para
        hiveClient.hiveExe(hsql)


        # 套餐到期时间与月底之间的时间差 tmp_loss_character_tz_5
        # 临时表
        # 需要确定套餐类型
        hsql = '''create table  if not EXISTS %(tmp_table2)s(
                        prod_inst_id   string,
                        srvpkg_id      string,
                        expire_days    string,
                        is_itv_offer   string,
                        rn             string
                   ) STORED AS RCFILE
                   LOCATION '%(tmp_path)s/%(tmp_table2)s'
                  ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table %(tmp_table2)s
                  select  t.prod_inst_id
                         ,t.srvpkg_id
                         ,t.expire_days
                         ,t.is_itv_offer
                         ,row_number() over (partition by t.prod_inst_id,t.is_itv_offer order by t.expire_days desc) rn
                  from
                    (select distinct prod_inst_id
                            ,srvpkg_id
                            ,expire_date
                            ,datediff(from_unixtime(unix_timestamp(expire_date),'yyyy-MM-dd'),
                             to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'))  expire_days
                            ,case when prod_service_id = '1006' then 1 else 0 end is_itv_offer
                     from %(dwd_h_ins_srvpkg)s
                     where from_unixtime(unix_timestamp(expire_date),'yyyyMM') between '%(ARG_OPTIME_LASTMON)s'
                         and '%(ARG_OPTIME_NEXTMON)s'
                       and state = '1'
                    ) t
                  where t.prod_inst_id is not null
               ''' % para
        hiveClient.hiveExe(hsql)

        hsql = ''' insert overwrite table  %(tmp_cust_expire_info)s
                    select  t.prod_inst_id
                           ,t.is_itv_offer
                           ,t.expire_days
                    from %(tmp_table2)s t
                    where t.rn=1
                ''' % para
        hiveClient.hiveExe(hsql)

        # # 客户近1个月和近3个月订购的产品个数 tmp_loss_character_tz_6
        # # 订购价格 stg_ord_price 待确认？？
        # 用户近1个月和近3个月订购的产品个数
        hsql = ''' insert overwrite table %(tmp_cust_prod_ord_info)s
                   select prod_inst_id
                          ,count(distinct case when to_date(create_date) = '%(ARG_OPTIME_LASTMON)s' then srvpkg_id
                               else null end) ord_prod_count_1m
                          ,count(distinct srvpkg_id) ord_prod_count_3m
                   from %(dwd_h_ins_srvpkg)s
                   where from_unixtime(unix_timestamp(create_date),'yyyyMM') between '%(ARG_OPTIME_LAST3MON)s'
                         and '%(ARG_OPTIME_LASTMON)s'
                       and state = '1'
                       and prod_serv_id in ('1002','1003','1005','1006','1008')
              ''' % para

        # # 用户近1个月和近3个月的出账金额 tmp_loss_character_tz_7  dwd_acct_item
        hsql = '''insert overwrite table %(tmp_cust_bill_info)s
                  select  t.serv_id prod_inst_id
                          ,sum(case when t.billing_cycle_id='%(ARG_OPTIME_LASTMON)s' then t.original_amount
                           else 0 end) bill_amount_1m
                          ,sum(t.original_amount) bill_amount_3m
                  from %(dwd_zg_acct_item)s t
                  where t.pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                    and serv_id is not null
                  group by t.serv_id
               ''' % para
        hiveClient.hiveExe(hsql)
        #
        # # 客户近1个月和近3个月的点播情况 dwd.dwd_jf_dr_ismp_yyyymm tmp_loss_character_tz_8
        hsql = '''insert overwrite table  %(tmp_cust_vod_info)s
                   select  user_id  prod_inst_id
                          ,count(distinct case when to_date(regexp_replace(start_time,'/','-')) =
                                  %(ARG_OPTIME_LASTMON_ISO)s then to_date(regexp_replace(start_time,'/','-'))
                                   else null end) vod_day_1m
                          ,count(case when to_date(regexp_replace(start_time,'/','-')) =
                                  %(ARG_OPTIME_LASTMON_ISO)s then start_time else null end) vod_num_1m
                          ,count(distinct to_date(regexp_replace(start_time,'/','-'))) vod_day_3m
                          ,count(1) vod_num_3m
                          ,round(sum(nvl(case when to_date(regexp_replace(start_time,'/','-')) =
                          %(ARG_OPTIME_LASTMON)s then charge1 else null end,0))/100,2) vod_amount_1m
                          ,round(sum(nvl(charge1,0))/100,2) vod_amount_3m
                   from %(dwd_dr_ismp)s
                   where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                    and data_source_cd <> 'VOD'
                    and from_unixtime(unix_timestamp(start_time,'yyyy-MM-dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                    and user_id is not null
                   group by user_id
               ''' % para
        hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月的直播收视情况 time
        hsql = '''insert overwrite table %(tmp_cust_tv_info)s
                  select user_id
                         ,count(distinct case when from_unixtime(unix_timestamp(time),'yyyyMM') =
                                  %(ARG_OPTIME_LASTMON)s then from_unixtime(unix_timestamp(time),'yyyyMMdd')
                                  else null end) tv_day_1m
                         ,count(case when from_unixtime(unix_timestamp(time),'yyyyMM') =
                                  %(ARG_OPTIME_LASTMON)s then time else null end) tv_num_1m
                         ,count(distinct to_date(time)) tv_day_3m
                         ,count(1) tv_num_3m
                   from %(dwd_ter_service)s
                   where pt_mon between %(ARG_OPTIME_LAST3MON)s and %(ARG_OPTIME_LASTMON)s
                   and OWN_CORP_STD_ORG_CODE='100901'
                   and from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                   group by user_id
                ''' % para
        hiveClient.hiveExe(hsql)

        # 用户近1个月和近3个月的回放收视情况
        hsql = '''insert overwrite table %(tmp_cust_review_info)s
                  select  user_id
                         ,count(distinct case when to_date(regexp_replace(start_time,'/','-')) =
                                 %(ARG_OPTIME_LASTMON_ISO)s then to_date(regexp_replace(start_time,'/','-'))
                                  else null end) review_day_1m
                         ,count(case when to_date(regexp_replace(start_time,'/','-')) =
                                 %(ARG_OPTIME_LASTMON_ISO)s then start_time else null end) review_num_1m
                         ,count(distinct to_date(regexp_replace(start_time,'/','-'))) review_day_3m
                         ,count(1) review_num_3m
                  from %(dwd_dr_ismp)s
                  where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                   and data_source_cd = 'VOD'
                   and from_unixtime(unix_timestamp(start_time,'yyyy-MM-dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                   and user_id is not null
                  group by user_id
                  ''' % para
        hiveClient.hiveExe(hsql)

        # # 产品即将到期用户
        hsql = '''insert overwrite table %(dwa_usr_list_expire)s partition(pt_mon = '%(ARG_OPTIME_LASTMON)s')
                    select  prod_inst_id
                           ,expire_date
                           ,datediff(from_unixtime(unix_timestamp(expire_date),'yyyy-MM-dd'),
                             to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s'))
                    from %(dwd_h_ins_srvpkg)s
                    where from_unixtime(unix_timestamp(expire_date,'yyyy-MM-dd'),'yyyyMM') = %(ARG_OPTIME_LASTMON)s
                      and prod_inst_id is not null
                      and state = '1'
          ''' % para
        hiveClient.hiveExe(hsql)

        # 根据历史数据 判断流失用户
        # 流失用户规则：2个月前套餐到期的用户，在后两个月均无续费行为的用户
        # hsql = '''insert overwrite table %(dwa_usr_list_loss)s partition (pt_time ='%(ARG_OPTIME_LASTMON)s')
        #               select distinct t1.prod_inst_id
        #                     ,'1' is_loss
        #               from %(dwa_usr_list_expire)s t1
        #               left outer join %(dwa_fact_ins_prod)s t2
        #               on t1.prod_inst_id = t2.prod_inst_id
        #               where t1.pt_time = '%(ARG_OPTIME_LAST3MON)s'
        #                 and substr(t2.pt_time,0,6) in ('%(ARG_OPTIME_LAST2MON)s','%(ARG_OPTIME_LASTMON)s')
        #                 and t2.prod_inst_id is null
        #               ''' % para

        # 流失用户规则:上一个统计周期中有效，当前统计周期内失效的用户
        hsql = '''insert overwrite table %(dwa_usr_list_loss)s partition (pt_mon ='%(ARG_OPTIME_LAST2MON)s')
                  select distinct t1.id1
                         ,'1' is_lost
                  from
                      (
                       select distinct prod_inst_id id1
                       from %(dwd_fact_ins_prod)s 
                       where pt_mon = '%(ARG_OPTIME_LAST2MON)s'
                          and own_corp_std_org_code = '100901'
                          and is_vaild1 = '1'
                          and cust_id is not null
                          and prod_inst_id is not null
                       ) t1
                      left outer join
                      (
                       select distinct prod_inst_id id2
                       from %(dwd_fact_ins_prod)s 
                       where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                         and own_corp_std_org_code = '100901'
                         and is_vaild1 = '1'
                         and cust_id is not null
                         and prod_inst_id is not null
                      ) t2
                      on t1.id1 = t2.id2
                      where t2.id2 is null
                         ''' % para
        hiveClient.hiveExe(hsql)

        # 生成流失特征
        hsql = ''' insert overwrite table %(dwa_cust_loss_character)s partition (pt_mon = '%(ARG_OPTIME_LASTMON)s')
                   select distinct %(ARG_OPTIME_LASTMON)s cycle_id
                         ,t.CUST_ID
                         ,t1.CUST_CODE
                         ,t1.CUST_NAME
                         ,t1.CORP_ORG_ID
                         ,t1.CORP_ORG_NAME
                         ,t1.CUST_TYPE
                         ,t1.CUST_LEVEl
                         ,t1.NET_AGE
                         ,t2.USER_COUNT
                         ,t2.ITV_USER_COUNT
                         ,'0' ITV_ACTIVE
                         ,t.PROD_INST_ID
                         ,t.BILL_ID
                         ,t.is_main
                         ,t.is_second
                         ,t3.dev_age
                         ,t4.ITV_USE_AGE
                         ,t5.EXPIRE_DAYS  ITV_EXPIRE_DAYS
                         ,t6.EXPIRE_DAYS  NOT_ITV_EXPIRE_DAYS
                         ,t7.ORD_PROD_COUNT_1M
                         ,t7.ORD_PROD_COUNT_3M
                         ,0 ORD_PROM_NUM_1M
                         ,0 ORD_PROM_NUM_3M
                         ,t8.BILL_AMOUNT_1M
                         ,t8.BILL_AMOUNT_3M
                         ,0 OPEN_DAYCNT_1M
                         ,0 OPEN_CNT_1M
                         ,0 OPEN_DAYCNT_3M
                         ,0 OPEN_CNT_3M
                         ,t9.VOD_DAY_1M
                         ,t9.VOD_NUM_1M
                         ,0 VOD_DURATION_1M
                         ,t9.VOD_AMOUNT_1M
                         ,t9.VOD_DAY_3M
                         ,t9.VOD_NUM_3M
                         ,0 VOD_DURATION_3M
                         ,t9.VOD_AMOUNT_3M
                         ,t10.tv_day_1m
                         ,t10.tv_num_1m
                         ,t10.tv_day_3m
                         ,t10.tv_num_3m
                         ,t11.review_day_1m
                         ,t11.review_num_1m
                         ,t11.review_day_3m
                         ,t11.review_num_3m
                         ,0 is_lost
                         ,'TZ'
                         ,CURRENT_TIMESTAMP
                  from  %(tmp_valid_user)s t
                  left join %(tmp_cust_base_info)s t1 on t.cust_id = t1.cust_id
                  left join %(tmp_cust_busi_info)s t2 on t.cust_id = t2.cust_id
                  left join %(tmp_cust_dev_info)s t3 on t.prod_inst_id = t3.prod_inst_id
                  left join %(tmp_cust_itv_info)s t4 on t.prod_inst_id =t4.prod_inst_id
                  left join %(tmp_cust_expire_info)s t5 on t.prod_inst_id = t5.prod_inst_id and t5.is_itv_offer=1
                  left join %(tmp_cust_expire_info)s t6 on t.prod_inst_id = t6.prod_inst_id and t6.is_itv_offer=0
                  left join %(tmp_cust_prod_ord_info)s t7 on t.prod_inst_id = t7.prod_inst_id
                  left join %(tmp_cust_bill_info)s t8 on t.prod_inst_id = t8.prod_inst_id
                  left join %(tmp_cust_vod_info)s t9 on t.prod_inst_id = t9.prod_inst_id
                  left join %(tmp_cust_tv_info)s t10 on t.prod_inst_id = t10.prod_inst_id
                  left join %(tmp_cust_review_info)s t11 on t.prod_inst_id = t11.prod_inst_id
                  where t.cust_id is not null
                    and t.prod_inst_id is not null
        ''' % para
        hiveClient.hiveExe(hsql)

        # 更新上一个周期的流失数据
        hsql = ''' insert overwrite table %(dwa_cust_loss_character)s partition(pt_mon='%(ARG_OPTIME_LAST2MON)s')
                   select t1.cycle_id
                          ,t1.CUST_ID
                          ,t1.CUST_CODE
                          ,t1.CUST_NAME
                          ,t1.CORP_ORG_ID
                          ,t1.CORP_ORG_NAME
                          ,t1.CUST_TYPE
                          ,t1.CUST_LEVEl
                          ,t1.NET_AGE
                          ,t1.USER_COUNT
                          ,t1.ITV_USER_COUNT
                          ,t1.ITV_ACTIVE
                          ,t1.PROD_INST_ID
                          ,t1.BILL_ID
                          ,t1.is_main
                          ,t1.is_second
                          ,t1.dev_age
                          ,t1.ITV_USE_AGE
                          ,t1.ITV_EXPIRE_DAYS
                          ,t1.NOT_ITV_EXPIRE_DAYS
                          ,t1.ORD_PROD_COUNT_1M
                          ,t1.ORD_PROD_COUNT_3M
                          ,t1.ORD_PROM_NUM_1M
                          ,t1.ORD_PROM_NUM_3M
                          ,t1.BILL_AMOUNT_1M
                          ,t1.BILL_AMOUNT_3M
                          ,t1.OPEN_DAYCNT_1M
                          ,t1.OPEN_CNT_1M
                          ,t1.OPEN_DAYCNT_3M
                          ,t1.OPEN_CNT_3M
                          ,t1.VOD_DAY_1M
                          ,t1.VOD_NUM_1M
                          ,t1.VOD_DURATION_1M
                          ,t1.VOD_AMOUNT_1M
                          ,t1.VOD_DAY_3M
                          ,t1.VOD_NUM_3M
                          ,t1.VOD_DURATION_3M
                          ,t1.VOD_AMOUNT_3M
                          ,t1.TV_DAY_1M
                          ,t1.TV_NUM_1M
                          ,t1.TV_DAY_3M
                          ,t1.TV_NUM_3M
                          ,t1.REVIEW_DAY_1M
                          ,t1.REVIEW_NUM_1M
                          ,t1.REVIEW_DAY_3M
                          ,t1.REVIEW_NUM_3M
                          ,case when t2.is_lost = '1' and (t1.is_main = '1' or (t1.is_main='0' and 
                           t1.is_second='0')) then 1 else 0 end is_lost
                          ,t1.data_source_cd
                          ,CURRENT_TIMESTAMP
                    from %(dwa_cust_loss_character)s t1
                    left join %(dwa_usr_list_loss)s t2 
                    on t1.prod_inst_id = t2.prod_inst_id and t2.pt_mon='%(ARG_OPTIME_LAST2MON)s'
                    where t1.pt_mon = '%(ARG_OPTIME_LAST2MON)s'                    
                    ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)