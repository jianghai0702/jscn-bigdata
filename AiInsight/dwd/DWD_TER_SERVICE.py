##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWD频道收视信息表
# Pay:DWD_TER_SERVICE.py
# Purpose:
#
# Author:      zhoush
#
# Created:     05-12-2017
# Copyright:   (c) zhoush 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
# wangxx 2018-12-06 
# 1. 添加标准频道名称转换
# 2. 剔除收视时间异常的数据（退出频道时间不在当月的数据）
# sunwj  2019-06-13
# 1. 根据经分用户月表，dwa_fact_ins_prod_mon 补充用户所属分公司()
# 2.
#-------------------------------------------------------------------------------

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
    ARG_OPTIME_LAST1_M = dicts['ARG_OPTIME_LAST1_M']  # 获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================     
    s_stg_ter_service           =    "stg_ter_service"
    s_dim_std_channel_rule      =    "dim_std_channel_rule"
    s_dwa_fact_ins_prod_mon     =    "dwa_fact_ins_prod_mon"
    s_tmp_dwd_ter_service       =    "tmp_dwd_ter_service"
##===========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_dwd_ter_service           =    "dwd_ter_service"
##===========================================================================       
##创建临时表
# 处理分公司时间
    hsql='''create table if not exists %(s_tmp_dwd_ter_service)s  (
                            sn              String,
                           ucendtime        String   ,
                           time              String  ,
                           smcid             String  ,
                           uncontinue         String ,
                           service_id         String ,
                           ts_id              String ,
                           frequency          String ,
                           channel_name       String ,
                           program_nam       String,
                           authority         String  ,
                           signal_strength   String  ,
                           signal_quality    String  ,
                           sdv                String ,
                           data_source_cd      String,
                           is_history_data     String,
                           cust_id            String ,
                           acct_id            String ,
                           own_corp_std_org_code    String,
                           user_id             String
             )
             STORED AS RCFILE
             LOCATION '%(tmp_path)s/%(s_tmp_dwd_ter_service)s'
            '''% vars()
    QueryExe(hsql,name,dates)
##===========================================================================
#生成临时表数据
    hsql = ''' insert overwrite table %(s_tmp_dwd_ter_service)s
               select distinct T.*
               from
               (
                select     t1.sn ,
                           t1.ucendtime           ,
                           t1.time                ,
                           t1.smcid               ,
                           t1.uncontinue          ,
                           t1.service_id          ,
                           t1.ts_id               ,
                           t1.frequency           ,
                           t1.channel_name        ,
                           trim(t1.program_nam) as program_nam,
                           t1.authority           ,
                           t1.signal_strength     ,
                           t1.signal_quality      ,
                           t1.sdv                 ,
                           t1.data_source_cd      ,
                           t1.is_history_data     ,
                           t1.cust_id             ,
                           t1.acct_id             ,
                           t2.own_corp_std_org_code,
                           t1.user_id             
             from %(s_stg_ter_service)s t1
             left join %(s_dwa_fact_ins_prod_mon)s t2 on t2.bill_id= t1.sn and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'
             where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
               and t1.own_corp_std_org_code is null
               and t2.own_corp_std_org_code is not null
             union all
             select        t1.sn                  ,
                           t1.ucendtime           ,
                           t1.time                ,
                           t1.smcid               ,
                           t1.uncontinue          ,
                           t1.service_id          ,
                           t1.ts_id               ,
                           t1.frequency           ,
                           t1.channel_name        ,
                           trim(t1.program_nam) as program_nam,
                           t1.authority           ,
                           t1.signal_strength     ,
                           t1.signal_quality      ,
                           t1.sdv                 ,
                           t1.data_source_cd      ,
                           t1.is_history_data     ,
                           t1.cust_id             ,
                           t1.acct_id             ,
                           t2.own_corp_std_org_code,
                           t1.user_id             
             from %(s_stg_ter_service)s t1
             left join %(s_dwa_fact_ins_prod_mon)s t2 on t2.prod_inst_id= t1.user_id and t2.pt_mon='%(ARG_OPTIME_LAST1_M)s'  -- 注意数据类型不一致
             where t1.pt_mon = %(ARG_OPTIME_LAST1_M)s
               and t1.own_corp_std_org_code is null
               and t2.own_corp_std_org_code is not null
             ) T    
    ''' % vars()
    QueryExe(hsql,name,dates)
##===========================================================================       
##数据处理                                                       
##===========================================================================
#生成数据

    hsql='''insert overwrite table %(t_dwd_ter_service)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)            
            select
              t1.sn                  ,
              t1.ucendtime           ,
              t1.time                ,
              t1.smcid               ,
              t1.uncontinue          ,
              t1.service_id          ,
              t1.ts_id               ,
              t1.frequency           ,
              translate(trim(t1.channel_name),'#','') as channel_name,
              trim(t1.program_nam) as program_nam,
              t1.authority           ,
              t1.signal_strength     ,
              t1.signal_quality      ,
              t1.sdv                 ,
              t1.data_source_cd      ,
              t1.is_history_data     ,
              t1.cust_id             ,
              t1.acct_id             ,
              t1.own_corp_std_org_code,
              t1.user_id             ,
              %(ARG_OPTIME_LAST1_M)s etl_cycle ,
              current_timestamp etl_date 
            from %(s_stg_ter_service)s t1
            where t1.pt_mon=%(ARG_OPTIME_LAST1_M)s
               and t1.own_corp_std_org_code is  not null
               and t1.authority in ('true','false') -- 剔除字段错位的数据 
            '''% vars()
    QueryExe(hsql,name,dates)

# 用户分公司数据为空数据补充
    hsql='''insert into table %(t_dwd_ter_service)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)            
            select
              t1.sn                  ,
              t1.ucendtime           ,
              t1.time                ,
              t1.smcid               ,
              t1.uncontinue          ,
              t1.service_id          ,
              t1.ts_id               ,
              t1.frequency           ,
              translate(trim(t1.channel_name),'#','') as channel_name,
              trim(t1.program_nam) as program_nam,
              t1.authority           ,
              t1.signal_strength     ,
              t1.signal_quality      ,
              t1.sdv                 ,
              t1.data_source_cd      ,
              t1.is_history_data     ,
              t1.cust_id             ,
              t1.acct_id             ,
              t1.own_corp_std_org_code,
              t1.user_id             ,
              %(ARG_OPTIME_LAST1_M)s etl_cycle ,
              current_timestamp etl_date 
            from %(s_tmp_dwd_ter_service)s t1
            where  t1.own_corp_std_org_code is  not null
               and t1.authority in ('true','false') -- 剔除字段错位的数据 
            '''% vars()
    QueryExe(hsql,name,dates)

##======================================================================================================================
##删除临时表                                               
##======================================================================================================================

##======================================================================================================================
##程序结束                                               
##======================================================================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
