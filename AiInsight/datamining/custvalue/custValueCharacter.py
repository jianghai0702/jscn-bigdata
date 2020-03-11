#!/usr/bin/env python
# -*-coding:utf-8 -*-
# ** -----------------------------------------------------------------------------------------------
# **  文件名称:       custValueCharacter.py
# **  功能描述:       生成客户价值特征
# **  创建者:         sunwj
# **  创建日期:       2017-09-27
# **  修改日志:
# **  修改日期:
# ** -----------------------------------------------------------------------------------------------
import sys
import os
from os.path import realpath

# 工程目录配置
directory = ["common", "utils", "custloss", "custvalue", "offervalue", "result"]
real_path = realpath(sys.argv[0])
curDir = os.path.dirname(real_path)  # 当前路径
PROJ_HOME = os.path.dirname(curDir)
for curdir in directory:
    sys.path.append(PROJ_HOME + os.sep + curdir)

from config import *
from hiveUtils import hiveClient
from paraUtils import *
from custValueTableDdl import *

# 全局参数引入
setPara()
tmp = vars()
para = tmp['para']


def setCharacters():
    try:
        logger.info(u'生成客户价值特征指标，开始...')
        # 当前统计期内 有效的客户用户信息
        hsql = '''insert overwrite table %(tmp_valid_cust_user)s
                  select distinct cust_id
                         ,prod_inst_id
                  from %(dwa_fact_ins_prod)s
                  where pt_time = '%(ARG_OPTIME_LASTMONLASTDAY)s'
                    and own_corp_std_org_code = '100901'
                    and is_vaild1 = '1'
                    and cust_id is not null
                    and prod_inst_id is not null''' % para
        hiveClient.hiveExe(hsql)

        # 客户基本信息
        hsql = '''insert overwrite table %(tmp_custvalue_base_info)s
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
                  left join %(dim_std_organize)s t2
                  on t1.own_corp_org_id = t2.organize_id and t2.std_org_code = '100901'
                  where  t1.own_corp_org_id is not null
                    and t1.cust_id is not null
                    and to_date(t1.create_date) < to_date('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s')
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 客户下的用户数(按照业务类型区分)
        hsql = '''insert overwrite table %(tmp_custvalue_busi_info)s
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

        # 用户近1个月的订购产品个数(用户的套餐数之和，不去重)
        # sub1
        hsql = '''insert overwrite table %(tmp_custvalue_prod_ord)s
                  select  distinct t1.prod_inst_id
                          ,t1.srvpkg_id  prod_id
                          ,t1.create_date
                  from %(stg_h_ins_srvpkg)s t1
                  where t1.pt_year = '%(ARG_YEAR)s'
                    and t1.prod_service_id in ('1002','1003','1005','1006','1008')
        ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table %(tmp_custvalue_prod_ord_count)s
                   select   tp.prod_inst_id
                           ,count(distinct case when from_unixtime(unix_timestamp(tp.create_date,'yyyy-MM-dd'),
                           'yyyyMM') = %(ARG_OPTIME_LASTMON)s then tp.prod_id else null end) prod_count_1m
                           ,count(distinct tp.prod_id) prod_count_3m
                   from %(tmp_custvalue_prod_ord)s tp
                   where  from_unixtime(unix_timestamp(tp.create_date,'yyyy-MM-dd'),'yyyyMM')
                          between %(ARG_OPTIME_LAST3MON)s and %(ARG_OPTIME_LASTMON)s 
                   group by tp.prod_inst_id
                 ''' % para
        hiveClient.hiveExe(hsql)

        hsql = '''insert overwrite table %(tmp_custvalue_prod_ord_date)s
                  select   tp.prod_inst_id
                           ,max(tp.create_date) last_ord_date
                  from %(tmp_custvalue_prod_ord)s tp
                  group by tp.prod_inst_id
                   ''' % para
        hiveClient.hiveExe(hsql)


        # 客户近3个月的账单收入
        hsql = ''' insert overwrite table %(tmp_custvalue_bill_info)s
                   select t.serv_id prod_inst_id
                          ,sum(case when t.billing_cycle_id = %(ARG_OPTIME_LASTMON)s then t.original_amount else 0 end) bill_amount_1m
                          ,sum(t.original_amount) bill_amount_3m
                    from ( select serv_id
                                 ,original_amount
                                 ,billing_cycle_id
                         from %(dwd_acct_item)s
                         where pt_mon between '%(ARG_OPTIME_LAST3MON)s' and '%(ARG_OPTIME_LASTMON)s'
                     ) t
                    group by t.serv_id
              ''' % para
        hiveClient.hiveExe(hsql)

        # 最近一次"收视行为"到今天的时间差，其中收视行为包括：直播、回放、点播
        # 取用户下的最小值作为客户 最近一次行为的的时间
        # 生成 当月回放用户数据
        # pt_mon数据存在问题，使用substr(start_time,1,10) = '%(ARG_OPTIME_LASTMON)s' 替换
        hsql = '''insert overwrite table %(tmp_custvalue_review_info)s
                  select  user_id
                         ,max(from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMMdd')) LAST_REVIEW_DATE
                         ,count(user_id) REVIEW_NUM
                         ,count(distinct from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMMdd')) review_days
                   from %(stg_dr_ismp_yyyymm)s
                   where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                     and data_source_cd = 'VOD'
                     and from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                   group by user_id
                    ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 当月点播用户数据
        # pt_mon数据存在问题，使用substr(start_time,1,10) = '%(ARG_OPTIME_LASTMON)s' 替换
        hsql = '''insert overwrite table %(tmp_custvalue_vod_info)s
                   select user_id
                          ,max(from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMMdd')) LAST_VOD_DATE
                          ,count(user_id) VOD_NUM
                          ,COUNT(DISTINCT from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMMdd')) vod_days
                          ,sum(charge1)
                   from %(stg_dr_ismp_yyyymm)s
                    where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                    and data_source_cd <> 'VOD'
                    and from_unixtime(unix_timestamp(start_time,'yyyy/MM/dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                    group by user_id
                   ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 当月直播用户数据
        hsql = '''insert overwrite table %(tmp_custvalue_tv_info)s
                  select user_id
                         ,min(from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyyMMdd')) LAST_TV_DATE
                         ,count(1) TV_NUM
                         ,'0' TV_TIME
                         ,count(distinct from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyyMMdd')) TV_DAYS
                  from %(dwd_ter_service)s
                  where pt_mon = '%(ARG_OPTIME_LASTMON)s'
                    and OWN_CORP_STD_ORG_CODE='100901'
                    and from_unixtime(unix_timestamp(time,'yyyy-MM-dd'),'yyyyMM') = '%(ARG_OPTIME_LASTMON)s'
                  group by user_id
        ''' % para
        hiveClient.hiveExe(hsql)

        # 生成 收视行为特征
        hsql = '''insert overwrite table %(tmp_custvalue_view_info)s
                  select distinct tp.prod_inst_id
                         ,tp.view_num_1m
                         ,tp.view_days_1m
                         ,tp.view_last_date
                  from
                       (select  distinct t1.prod_inst_id
                               ,t1.review_num      view_num_1m
                               ,t1.review_days     view_days_1m
                               ,t1.LAST_REVIEW_DATE  view_last_date
                       from %(tmp_custvalue_review_info)s t1
                       union all
                       select  distinct t2.prod_inst_id
                               ,t2.vod_num      view_num_1m
                               ,t2.vod_days     view_days_1m
                               ,t2.LAST_VOD_DATE  view_last_date
                       from %(tmp_custvalue_vod_info)s t2
                       union all
                       select  distinct t3.prod_inst_id
                               ,t3.tv_num        view_num_1m
                               ,t3.tv_days       view_days_1m
                               ,t3.LAST_TV_DATE  view_last_date
                       from %(tmp_custvalue_tv_info)s t3
                    ) tp
        ''' % para
        hiveClient.hiveExe(hsql)

        # 写入客户价值特征表
        hsql = '''insert overwrite table %(dwa_cust_value_character)s partition (pt_mon = '%(ARG_OPTIME_LASTMON)s')
                  select distinct t.cust_id
                         ,t1.cust_name
                         ,t1.corp_org_id
                         ,t1.corp_org_name
                         ,t1.cust_type
                         ,t1.cust_level
                         ,t1.net_age
                         ,nvl(t2.user_count,0)
                         ,nvl(t2.itv_user_count,0)
                         ,nvl(t2.fee_usr_cnt,0)  
                         ,nvl(t2.dbitv_usr_cnt,0)
                         ,nvl(t2.ditv_usr_cnt,0) 
                         ,nvl(t2.hdtv_usr_cnt,0) 
                         ,nvl(t2.lan_usr_cnt,0)
                         ,t.prod_inst_id
                         ,t.bill_id
                         ,nvl(t3.bill_amount_1m,0)
                         ,nvl(t3.bill_amount_3m,0)
                         ,nvl(t4.view_days_1m,0)
                         ,nvl(t4.view_num_1m,0)
                         ,case when t4.last_date_view is null then datediff('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s',
                           '%(ARG_OPTIME_LASTMON_FIRSTDAY_ISO)s') 
                           else datediff('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s',
                           from_unixtime(unix_timestamp(t4.last_date_view,'yyyyMMdd'),'yyyy-MM-dd')) end days_from_last_view
                         ,nvl(t5.prod_count_1m,0)
                         ,nvl(t5.prod_count_3m,0)
                         ,case when t6.last_date_ord is null then t6.last_date_ord
                           else datediff('%(ARG_OPTIME_LASTMONLASTDAY_ISO)s',
                           from_unixtime(unix_timestamp(t6.last_date_ord,'yyyyMMdd'),'yyyy-MM-dd')) end days_from_last_ord
                         ,'TZ' data_source_cd
                         ,CURRENT_TIMESTAMP
                  from %(dwa_fact_ins_prod)s t
                  left join %(tmp_custvalue_base_info)s t1 on t.cust_id = t1.cust_id
                  left join %(tmp_custvalue_busi_info)s t2 on t.cust_id = t2.cust_id
                  left join %(tmp_custvalue_bill_info)s t3 on t.prod_inst_id = t3.prod_inst_id
                  left join %(tmp_custvalue_view_info)s t4 on t.prod_inst_id = t4.prod_inst_id
                  left join %(tmp_custvalue_prod_ord_count)s t5 on t.prod_inst_id = t5.prod_inst_id
                  left join %(tmp_custvalue_prod_ord_date)s t6 on t.prod_inst_id = t6.prod_inst_id 
                  where t.pt_time = %(ARG_OPTIME_LASTMONLASTDAY)s 
          ''' % para
        hiveClient.hiveExe(hsql)

    except Exception as ex:
        logger.error(u'程序执行过程中发生异常, 错误信息如下\n%s', ex)