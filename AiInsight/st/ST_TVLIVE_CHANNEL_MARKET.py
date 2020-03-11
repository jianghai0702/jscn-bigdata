#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  ST_TVLIVE_CHANNEL_MARKET.py
# Purpose     :  直播各频道的收视率/市场占有率等
#
# Author      :  sunwj
#
# CreatedDate :  2019-07-03 16:06
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------
directory = ["config", "dim", "dw", "dwd", "kpi", "py"]
import os, sys
from os.path import normpath, realpath

rp = realpath(sys.argv[0])
dwd = os.path.dirname(rp)
AiInsight = os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re

# 正则清洗参数
sdate = sys.argv[1] if len(sys.argv) > 1 else '0'
regex = ur"\d{8}"
match = re.search(regex, sdate)
if match:
    dates = sdate
else:
    dates = open('/AiInsight/config/pyparameter').read()

# 程序开始执行
name = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')

try:
    # 传递日期参数
    dicts = {}
    Pama(dicts, dates)
    Start(name, dates)

    # ===========================================================================================
    # ʱ时间参数引入
    # ===========================================================================================
    # 引入时间字典
    ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO = dicts['ARG_OPTIME_LAST1_M_ISO']  # 获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M = dicts['ARG_OPTIME_LAST2_M']  # 获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO = dicts['ARG_OPTIME_LAST2_M_ISO']  # 获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
    # ===========================================================================================
    # 其它参数引入
    # ===========================================================================================
    # tmp_path   临时表存放路径
    ##===========================================================================
    ##自定义变量声明---源表声明
    ##===========================================================================
    s_dwa_tvlive_detail = "dwa_tvlive_detail"
    s_dim_std_organize = "dim_std_organize"
    s_tmp_tvlive_channel_view = "tmp_tvlive_channel_view"
    s_tmp_tvlive_channel_market = "tmp_tvlive_channel_market"
    ##===========================================================================
    ##自定义变量声明---目标表声明
    ##===========================================================================
    T_ST_TVLIVE_CHANNEL_MARKET_M = "ST_TVLIVE_CHANNEL_MARKET_M"
    ##===========================================================================
    # 删除临时表
    ##===========================================================================
    hsql = '''drop table %(s_tmp_tvlive_channel_view)s''' % vars()
    QueryExe(hsql, name, dates)
    hsql = '''drop table %(s_tmp_tvlive_channel_market)s''' % vars()
    QueryExe(hsql, name, dates)
    ##创建临时表
    ##===========================================================================
    hsql = '''create table if not exists %(s_tmp_tvlive_channel_view)s  (
                  channel_name        string,
                  std_org_code        string,
                  std_org_name        string,
                  is_local            string,
                  TVLIVE_USER_COUNT   decimal(36,0),
                  TVLIVE_DURATION     double
           )
           STORED AS ORCFILE
           LOCATION '%(tmp_path)s/%(s_tmp_tvlive_channel_view)s'
    ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''create table if not exists %(s_tmp_tvlive_channel_market)s  (
                      std_org_code        string,
                      std_org_name        string,
                      TVLIVE_USER_COUNT   decimal(36,0),
                      TVLIVE_DURATION     double
               )
               STORED AS ORCFILE
               LOCATION '%(tmp_path)s/%(s_tmp_tvlive_channel_market)s'
        ''' % vars()
    QueryExe(hsql, name, dates)

    ##===========================================================================
    ##数据处理
    ##===========================================================================
    hsql = '''insert overwrite table %(s_tmp_tvlive_channel_view)s
             select  t1.channel_name
                     ,t2.std_org_code 
                     ,t2.std_org_name  
                     ,t1.is_local
                     ,count(distinct coalesce(t1.user_id,t1.sn)) open_user_cnts
                     ,sum(t1.duration) 
             from %(s_dwa_tvlive_detail)s t1
             left join %(s_dim_std_organize)s t2 on  t1.own_corp_std_org_code = t2.std_org_code
             where  substring(t1.pt_time,1,6) = '%(ARG_OPTIME_LAST1_M)s'
                and coalesce(t1.user_id,t1.sn) is not null
             group by t1.channel_name,t2.std_org_code,t2.std_org_name,t1.is_local

            ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''insert into table %(s_tmp_tvlive_channel_view)s
              select T.channel_name
                    ,COALESCE(T.std_org_code,'10') as std_org_code
                    ,COALESCE(T.std_org_name,'江苏有线') as std_org_name
                    ,T.is_local
                    ,sum(T.TVLIVE_USER_COUNT)
                    ,round(sum(T.TVLIVE_DURATION)/60,2) as  TVLIVE_DURATION
             from
             (select  t1.channel_name,
                      t3.std_org_code,
                      t3.std_org_name,
                      t3.p_std_org_code,
                      t1.is_local,
                      t1.TVLIVE_USER_COUNT,
                      t1.TVLIVE_DURATION
             from  %(s_tmp_tvlive_channel_view)s t1
             left join %(s_dim_std_organize)s t2 on t1.std_org_code = t2.std_org_code
             left join %(s_dim_std_organize)s t3 on t3.std_org_code = t2.p_std_org_code
             ) T
             group by channel_name,std_org_code,std_org_name,p_std_org_code,is_local
             grouping sets((channel_name,std_org_code,std_org_name,is_local),(channel_name,p_std_org_code,is_local))
    ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''insert overwrite table %(s_tmp_tvlive_channel_market)s
                 select 
                          t2.std_org_code 
                         ,t2.std_org_name  
                         ,count(distinct coalesce(t1.user_id,t1.sn)) open_user_cnts
                         ,sum(t1.duration) 
                 from %(s_dwa_tvlive_detail)s t1
                 left join %(s_dim_std_organize)s t2 on  t1.own_corp_std_org_code = t2.std_org_code
                 where  substring(t1.pt_time,1,6) = '%(ARG_OPTIME_LAST1_M)s'
                    and coalesce(t1.user_id,t1.sn) is not null
                 group by t2.std_org_code,t2.std_org_name,t1.is_local

                ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''insert into table %(s_tmp_tvlive_channel_market)s
                  select 
                         COALESCE(T.std_org_code,'10') as std_org_code
                        ,COALESCE(T.std_org_name,'江苏有线') as std_org_name
                        ,sum(T.TVLIVE_USER_COUNT)
                        ,sum(T.TVLIVE_DURATION)/60  as  TVLIVE_DURATION
                 from
                 (select  
                          t3.std_org_code,
                          t3.std_org_name,
                          t3.p_std_org_code,
                          t1.TVLIVE_USER_COUNT,
                          t1.TVLIVE_DURATION
                 from  %(s_tmp_tvlive_channel_market)s t1
                 left join %(s_dim_std_organize)s t2 on t1.std_org_code = t2.std_org_code
                 left join %(s_dim_std_organize)s t3 on t3.std_org_code = t2.p_std_org_code
                 ) T
                 group by std_org_code,std_org_name,p_std_org_code
                 grouping sets((std_org_code,std_org_name),(p_std_org_code))
        ''' % vars()
    QueryExe(hsql, name, dates)



    hsql = '''insert overwrite table %(T_ST_TVLIVE_CHANNEL_MARKET_M)s partition(pt_mon = '%(ARG_OPTIME_LAST1_M)s')
              select tp1.*
                    ,round(tp1.channel_view_rate*100/tp2.channel_total_rate,2)
                    ,current_timestamp()
              from
              (SELECT    t1.channel_name
                       , t1.std_org_code
                       , t1.std_org_name
                       , t1.is_local
                       , coalesce(t1.TVLIVE_USER_COUNT,0) TVLIVE_USER_COUNT
                      -- , coalesce(t2.TVLIVE_USER_COUNT,0) TVLIVE_TOTAL_COUNT
                       , t1.TVLIVE_DURATION
                       , if(coalesce(t2.TVLIVE_USER_COUNT,0)=0,0,round(coalesce(t1.TVLIVE_DURATION,0)*100/
                         (coalesce(t2.TVLIVE_USER_COUNT,0)*datediff('2019-05-31','2019-05-01')*24*60),4)) channel_view_rate
              from   %(s_tmp_tvlive_channel_view)s t1
              left join  %(s_tmp_tvlive_channel_market)s t2 on t1.std_org_code = t2.std_org_code
              ) tp1
              left join
              (
                    SELECT
                             t1.std_org_code
                           , t1.std_org_name
                           , coalesce(t1.TVLIVE_USER_COUNT,0) TVLIVE_USER_COUNT
                           , t1.TVLIVE_DURATION
                           , if(coalesce(t1.TVLIVE_USER_COUNT,0)=0,0,round(coalesce(t1.TVLIVE_DURATION,0)*100/
                             (coalesce(t1.TVLIVE_USER_COUNT,0)*datediff('2019-05-31','2019-05-01')*24*60),4)) channel_total_rate
                    FROM  %(s_tmp_tvlive_channel_market)s t1
              ) tp2
              on  tp1.std_org_code=tp2.std_org_code
              and tp1.std_org_name = tp2.std_org_name
                               ''' % vars()
    QueryExe(hsql, name, dates)

    ##===========================================================================
    ##删除临时表
    ##===========================================================================

    ##===========================================================================
    ##程序结束
    ##===========================================================================
    End(name, dates)
except Exception, e:
    Except(name, dates, e)