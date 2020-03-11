#!/usr/bin/env python
# -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name: ST_USER_ONLINERATE_M.py
# Purpose: 用户在线率
#
# Author:      sunwj
#
# Created:     2019-04-12
# Copyright:   (c) sunwj 2019
# Licence:     <your licence>
#
#-------------------------------------------------------------------------------
# 脚本修改说明及记录
#
#
#-------------------------------------------------------------------------------
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
sdate = sys.argv[1] if len(sys.argv) > 1 else 0
regex = ur"\d{8}"
match = re.search(regex, sdate)
if match:
    dates = sdate
else:
    dates = open('/AiInsight/config/pyparameter').read()

# 脚本名称
name = sys.argv[0][sys.argv[0].rfind(os.sep) + 1:].rstrip('.py')

# 传递日期参数,生成时间字典
# -------------------------------------------------------------------------------
dicts = {}
Pama(dicts, dates)

# 引入时间字典
ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
ARG_OPTIME_LAST1_M_ISO = dicts['ARG_OPTIME_LAST1_M_ISO']  # 获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
ARG_OPTIME_LAST2_M = dicts['ARG_OPTIME_LAST2_M']  # 获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
ARG_OPTIME_LAST2_M_ISO = dicts['ARG_OPTIME_LAST2_M_ISO']  # 获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
ARG_OPTIME_MON01 = dicts['ARG_OPTIME_MON01']  # 获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_MON01_ISO = dicts['ARG_OPTIME_MON01_ISO']  # 获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMON01 = dicts['ARG_OPTIME_LASTMON01']  # 获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMON01_ISO = dicts['ARG_OPTIME_LASTMON01_ISO']  # 获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
# 源表声明
# -------------------------------------------------------------------------------
S_DWD_BRD_AUTH_LOG = "DWD_BRD_AUTH_LOG"
s_dwa_fact_ins_prod_mon = "dwa_fact_ins_prod_mon"
dim_std_organize = "dim_std_organize"
# 临时表声明
# -------------------------------------------------------------------------------
s_temp_st_online_rate = "temp_st_online_rate"
s_temp_st_valid_lan_user = "temp_st_valid_lan_user"
# 目标表声明
# -------------------------------------------------------------------------------
T_ST_USER_ONLINERATE_M = "ST_USER_ONLINERATE_M"
# 开始数据处理
# -------------------------------------------------------------------------------
try:
    Start(name, dates)  # 数据处理开始，创建锁文件
    # 删除临时表
    # -------------------------------------------------------------------------------
    hsql = '''drop table %(s_temp_st_online_rate)s''' % vars()
    QueryExe(hsql, name, dates)
    hsql = '''drop table %(s_temp_st_valid_lan_user)s''' % vars()
    QueryExe(hsql, name, dates)
    # -------------------------------------------------------------------------------
    # 创建临时表
    # -------------------------------------------------------------------------------

    hsql = '''create table if not exists %(s_temp_st_valid_lan_user)s  (
                             own_corp_std_org_code    string,
                             prod_inst_id            string,
                             login_name               string
                         )
                       STORED AS ORCFILE
                       LOCATION '%(tmp_path)s/%(s_temp_st_valid_lan_user)s'
                   ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''create table if not exists %(s_temp_st_online_rate)s  (
                             own_corp_std_org_code    string,
                             online_user_cnt          string
                         )
                       STORED AS ORCFILE
                       LOCATION '%(tmp_path)s/%(s_temp_st_online_rate)s'
                   ''' % vars()
    QueryExe(hsql, name, dates)


    # 生成中间数据
    # -------------------------------------------------------------------------------

    hsql = '''
                    insert overwrite table %(s_temp_st_valid_lan_user)s
                    select distinct 
                            t1.own_corp_std_org_code
                           ,t1.prod_inst_id
                           ,t1.login_name
                    from  %(s_dwa_fact_ins_prod_mon)s t1
                    where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                      and t1.is_valid=1
                      and t1.is_lan=1
                      and nvl(trim(t1.login_name),'')<>''
                ''' % vars()
    QueryExe(hsql, name, dates)

    hsql = '''
                insert overwrite table %(s_temp_st_online_rate)s
                select
                        t2.own_corp_std_org_code
                       ,count(distinct t2.prod_inst_id)
                from  %(S_DWD_BRD_AUTH_LOG)s t1
                inner join %(s_temp_st_valid_lan_user)s  t2 
                on  trim(t1.login_name) = trim(t2.login_name)
                where t1.pt_time between '%(ARG_OPTIME_LASTMON01)s'  and '%(ARG_OPTIME_LASTMONEND)s'
                  and nvl(trim(t1.login_name),'')<>''
                  -- and t1.auth_result = 0
                group by t2.own_corp_std_org_code
            ''' % vars()
    QueryExe(hsql, name, dates)

    # 生成目标数据
    # -------------------------------------------------------------------------------
    hsql = '''
                insert overwrite table %(T_ST_USER_ONLINERATE_M)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
                select distinct %(ARG_OPTIME_LAST1_M)s
                      ,t1.own_corp_std_org_code
                      ,t3.std_org_name own_corp_std_org_name
                      ,t1.online_user_cnt
                      ,t2.user_cnts 
                      ,round(t1.online_user_cnt/t2.user_cnts*100,2) online_rate
                      ,current_timestamp()
                from %(s_temp_st_online_rate)s t1
                left join ( select own_corp_std_org_code
                                   ,count(distinct prod_inst_id) user_cnts
                            from %(s_temp_st_valid_lan_user)s
                            group by own_corp_std_org_code
                            ) t2
                on t1.own_corp_std_org_code = t2.own_corp_std_org_code
                left join %(dim_std_organize)s t3 on t1.own_corp_std_org_code = t3.std_org_code
            ''' % vars()
    QueryExe(hsql, name, dates)

    ## 向上选取到省地区
    hsql = '''
     insert into table %(T_ST_USER_ONLINERATE_M)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
                select    cycle_id
                         ,COALESCE(std_org_code,'10') as own_corp_std_org_code
                         ,COALESCE(std_org_name,'江苏有线') as own_corp_std_org_code
                         ,sum(online_user_cnt)
                         ,sum(user_cnts)
                         ,current_timestamp()
                         ,pt_mon
                  from  
                  (select  t1.cycle_id,
                           t3.std_org_code,
                           t3.std_org_name,
                           t3.p_std_org_code,
                           t1.online_user_cnt,
                           t1.user_cnts,
                           t1.pt_mon
                  from  %(T_ST_USER_ONLINERATE_M)s t1
                  left join %(dim_std_organize)s t2 on t1.own_corp_std_org_code = t2.std_org_code
                  left join %(dim_std_organize)s t3 on t3.std_org_code = t2.p_std_org_code
                  where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                  ) T
                  group by cycle_id,std_org_code,std_org_name,p_std_org_code,pt_mon
                  grouping sets((cycle_id,std_org_code,std_org_name,pt_mon),(cycle_id,p_std_org_code,pt_mon))
    ''' % vars()
    QueryExe(hsql, name, dates)


    End(name, dates)
except Exception, e:
    Except(name, dates, e)