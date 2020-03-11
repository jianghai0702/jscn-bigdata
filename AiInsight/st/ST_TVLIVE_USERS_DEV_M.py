#!/usr/bin/python
# -*- coding: utf-8 -*-
#-----------------------------------------------------------------------------------------------------------------------
# Name        :  ST_TVLIVE_USERS_DEV_M.py
# Purpose     :  直播用户发展相关指标 数字电视用户数/开机用户数/人均收视时长
#
# Author      :  sunwj
#
# CreatedDate :  2019-07-03 10:34
# Copyright   :  Aisainfo
# Licence     :  <your licence>
#-----------------------------------------------------------------------------------------------------------------------
directory=["config","dim","dw","dwd","kpi","py"]
import os,sys
from os.path import normpath,realpath
rp=realpath(sys.argv[0])
dwd=os.path.dirname(rp)
AiInsight=os.path.dirname(dwd)
for dir in directory:
    sys.path.append(AiInsight + os.sep + dir)

from settings import *
from hqltools import *
import re

#正则清洗参数
sdate=sys.argv[1] if len(sys.argv) > 1 else '0'
regex=ur"\d{8}"
match=re.search(regex,sdate)
if match:
  dates=sdate
else:
  dates=open('/AiInsight/config/pyparameter').read()

#程序开始执行
name =  sys.argv[0][sys.argv[0].rfind(os.sep)+1:].rstrip('.py')


try:
#传递日期参数
    dicts={}
    Pama(dicts,dates)
    Start(name,dates)

#===========================================================================================
#ʱ时间参数引入
#===========================================================================================
# 引入时间字典
    ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO = dicts['ARG_OPTIME_LAST1_M_ISO']  # 获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M = dicts['ARG_OPTIME_LAST2_M']  # 获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO = dicts['ARG_OPTIME_LAST2_M_ISO']  # 获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径
##===========================================================================
##自定义变量声明---源表声明
##===========================================================================
    s_dwa_tvlive_detail                  =    "dwa_tvlive_detail"
    s_st_new_user_dev_m                  =    "st_new_user_dev_m"
    s_dim_std_organize                   =    "dim_std_organize"
    s_tmp_tvlive_user_m                  =    "tmp_tvlive_user_m"
##===========================================================================
##自定义变量声明---目标表声明
##===========================================================================
    T_ST_TVLIVE_USERS_DEV_M              =    "ST_TVLIVE_USERS_DEV_M"
##===========================================================================
# 删除临时表
##===========================================================================
    hsql = '''drop table %(s_tmp_tvlive_user_m)s''' % vars()
    QueryExe(hsql, name, dates)
##创建临时表
##===========================================================================
    hsql = '''create table if not exists %(s_tmp_tvlive_user_m)s  (
                  STD_ORG_CODE        string,
                  STD_ORG_NAME        string,
                  TVLIVE_USER_COUNT   decimal(36,0),
                  TVLIVE_DURATION     decimal(36,2)
           )
           STORED AS ORCFILE
           LOCATION '%(tmp_path)s/%(s_tmp_tvlive_user_m)s'
    ''' % vars()
    QueryExe(hsql, name, dates)

##===========================================================================
##数据处理
##===========================================================================
    hsql='''insert overwrite table %(s_tmp_tvlive_user_m)s
             select   t2.std_org_code own_corp_std_org_code
                     ,t2.std_org_name  own_corp_std_org_name
                     ,count(distinct coalesce(t1.user_id,t1.sn)) open_user_cnts
                     ,sum(t1.duration) 
             from %(s_dwa_tvlive_detail)s t1
             left join %(s_dim_std_organize)s t2 on  t1.own_corp_std_org_code = t2.std_org_code
             where  substring(t1.pt_time,1,6) = '%(ARG_OPTIME_LAST1_M)s'
                and coalesce(t1.user_id,t1.sn) is not null
             group by t2.std_org_code,t2.std_org_name
             
            '''% vars()
    QueryExe(hsql,name,dates)

    hsql = '''insert into table %(s_tmp_tvlive_user_m)s
              select
                     COALESCE(std_org_code,'10') as own_corp_std_org_code
                    ,COALESCE(std_org_name,'江苏有线') as own_corp_std_org_code
                    ,sum(TVLIVE_USER_COUNT)
                    ,sum(TVLIVE_DURATION)
             from
             (select
                      t3.std_org_code,
                      t3.std_org_name,
                      t3.p_std_org_code,
                      t1.TVLIVE_USER_COUNT,
                      t1.TVLIVE_DURATION
             from  %(s_tmp_tvlive_user_m)s t1
             left join %(s_dim_std_organize)s t2 on t1.std_org_code = t2.std_org_code
             left join %(s_dim_std_organize)s t3 on t3.std_org_code = t2.p_std_org_code
             ) T
             group by std_org_code,std_org_name,p_std_org_code
             grouping sets((std_org_code,std_org_name),(p_std_org_code))
    ''' % vars()
    QueryExe(hsql, name, dates)


    hsql = '''insert overwrite table %(T_ST_TVLIVE_USERS_DEV_M)s partition(pt_mon = '%(ARG_OPTIME_LAST1_M)s')
              SELECT   t1.own_corp_std_org_code
                     , t1.own_corp_std_org_name
                     , t1.DTV_USER_COUNT
                     , coalesce(t2.TVLIVE_USER_COUNT,0)
                     , if(coalesce(t2.TVLIVE_USER_COUNT,0)=0,0,round(coalesce(t2.TVLIVE_DURATION,0)/coalesce(t2.TVLIVE_USER_COUNT,0),2))
                     , current_timestamp()
              FROM  ( select  sum(DTV_USER_COUNT)  DTV_USER_COUNT
                                  ,OWN_CORP_STD_ORG_CODE
                                  ,own_corp_std_org_name
                           from %(s_st_new_user_dev_m)s
                           where pt_mon= '%(ARG_OPTIME_LAST1_M)s'
                           group by OWN_CORP_STD_ORG_CODE ,own_corp_std_org_name
                        ) t1
              left join %(s_tmp_tvlive_user_m)s t2
              on t1.own_corp_std_org_code = t2.STD_ORG_CODE

                 ''' % vars()
    QueryExe(hsql, name, dates)

##===========================================================================
##删除临时表
##===========================================================================

##===========================================================================
##程序结束
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)