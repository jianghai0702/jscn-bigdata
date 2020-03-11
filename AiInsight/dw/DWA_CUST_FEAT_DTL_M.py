##!/usr/bin/env python
## -*-coding:utf-8 -*-
#-------------------------------------------------------------------------------
# Name:DWA客户画像详细信息月表     
# Pay:DWA_CUST_FEAT_DTL_M.py
# Purpose:
#
# Author:      wangxx
#
# Created:     20-08-2017
# Copyright:   (c) tapdn 2017
# Licence:     <your licence>
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
#时间参数引入
#===========================================================================================
    ARG_TODAY                 = dicts['ARG_TODAY']                    #获得yyyymmddhh格式的当前日期
    ARG_TODAY_ISO             = dicts['ARG_TODAY_ISO']                #获得yyyy-MM-dd HH格式的当前日期
    ARG_OPTIME                = dicts['ARG_OPTIME']                   #获得yyyymmdd格式的数据日期
    ARG_OPTIME_ISO            = dicts['ARG_OPTIME_ISO']               #获得yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR           = dicts['ARG_OPTIME_YEAR']              #获得yyyy格式的数据日期
    ARG_OPTIME_MONTH          = dicts['ARG_OPTIME_MONTH']             #获得yyyymm格式的数据日期
    ARG_OPTIME_MONTH01        = dicts['ARG_OPTIME_MONTH01']           #获得传入的数据日期的当年第1个月yyyy-mm格式的数据日期
    ARG_OPTIME_MONTH12        = dicts['ARG_OPTIME_MONTH12']           #获得传入的数据日期的当年第12个月yyyy-mm格式的数据日期
    ARG_OPTIME_HOUR           = dicts['ARG_OPTIME_HOUR']              #获得yyyymmddhh格式的数据日期
    ARG_OPTIME_HOUR_STD       = dicts['ARG_OPTIME_HOUR_STD']          #获得hh格式的数据日期
    ARG_OPTIME_DAY            = dicts['ARG_OPTIME_DAY']               #获得dd格式的数据日期
    ARG_OPTIME_THISMON        = dicts['ARG_OPTIME_THISMON']           #获得mm格式的数据日期
    ARG_OPTIME_LASTDAY        = dicts['ARG_OPTIME_LASTDAY']           #获得传入的数据日期的前一天yyyymmdd格式的数据日期
    ARG_OPTIME_LASTDAY_ISO    = dicts['ARG_OPTIME_LASTDAY_ISO']       #获得传入的数据日期的前一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON        = dicts['ARG_OPTIME_LASTMON']           #获得传入的数据日期的上月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON_ISO    = dicts['ARG_OPTIME_LASTMON_ISO']       #获得传入的数据日期的上月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST2MON       = dicts['ARG_OPTIME_LAST2MON']          #获得传入的数据日期的上2月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2MON_ISO   = dicts['ARG_OPTIME_LAST2MON_ISO']      #获得传入的数据日期的上2月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3MON       = dicts['ARG_OPTIME_LAST3MON']          #获得传入的数据日期的上3月同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3MON_ISO   = dicts['ARG_OPTIME_LAST3MON_ISO']      #获得传入的数据日期的上3月同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTYEAR       = dicts['ARG_OPTIME_LASTYEAR']          #获得传入的数据日期的去年同期日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTYEAR_ISO   = dicts['ARG_OPTIME_LASTYEAR_ISO']      #获得传入的数据日期的去年同期日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR01         = dicts['ARG_OPTIME_YEAR01']            #获得传入的数据日期的当年第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR01_ISO     = dicts['ARG_OPTIME_YEAR01_ISO']        #获得传入的数据日期的当年第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_YEAR12         = dicts['ARG_OPTIME_YEAR12']            #获得传入的数据日期的当年最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_YEAR12_ISO     = dicts['ARG_OPTIME_YEAR12_ISO']        #获得传入的数据日期的当年最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MON01          = dicts['ARG_OPTIME_MON01']             #获得传入的数据日期的本月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MON01_ISO      = dicts['ARG_OPTIME_MON01_ISO']         #获得传入的数据日期的本月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMON01      = dicts['ARG_OPTIME_LASTMON01']         #获得传入的数据日期的上月第一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMON01_ISO  = dicts['ARG_OPTIME_LASTMON01_ISO']     #获得传入的数据日期的上月第一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_MONEND         = dicts['ARG_OPTIME_MONEND']            #获得传入的数据日期的本月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_MONEND_ISO     = dicts['ARG_OPTIME_MONEND_ISO']        #获得传入的数据日期的本月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONEND     = dicts['ARG_OPTIME_LASTMONEND']        #获得传入的数据日期的上月最后一天日期yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONEND_ISO = dicts['ARG_OPTIME_LASTMONEND_ISO']    #获得传入的数据日期的上月最后一天日期yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST_M         = dicts['ARG_OPTIME_LAST_M']            #获得传入的数据日期前一天的所在月份yyyymm格式的数据日期
    ARG_OPTIME_LAST_M_ISO     = dicts['ARG_OPTIME_LAST_M_ISO']        #获得传入的数据日期的前一天所在月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST1_M        = dicts['ARG_OPTIME_LAST1_M']           #获得传入的数据日期的所在上一个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST1_M_ISO    = dicts['ARG_OPTIME_LAST1_M_ISO']       #获得传入的数据日期的所在上一个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_M        = dicts['ARG_OPTIME_LAST2_M']           #获得传入的数据日期的所在上两个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST2_M_ISO    = dicts['ARG_OPTIME_LAST2_M_ISO']       #获得传入的数据日期的所在上两个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST2_MEND     = dicts['ARG_OPTIME_LAST2_MEND']        #获得传入的数据日期的所在上两个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST2_MEND_ISO = dicts['ARG_OPTIME_LAST2_MEND_ISO']    #获得传入的数据日期的所在上两个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LAST3_M        = dicts['ARG_OPTIME_LAST3_M']          #获得传入的数据日期的所在上三个月份yyyymm格式的数据日期
    ARG_OPTIME_LAST3_M_ISO    = dicts['ARG_OPTIME_LAST3_M_ISO']      #获得传入的数据日期的所在上三个月份yyyy-mm格式的数据日期
    ARG_OPTIME_LAST3_MEND        = dicts['ARG_OPTIME_LAST3_MEND']          #获得传入的数据日期的所在上三个月份最后一天yyyymmdd格式的数据日期
    ARG_OPTIME_LAST3_MEND_ISO    = dicts['ARG_OPTIME_LAST3_MEND_ISO']      #获得传入的数据日期的所在上三个月份最后一天yyyy-mm-dd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY         = dicts['ARG_OPTIME_LASTMONFIRSTDAY']            #获得传入的数据日期前一天的所在月份月初yyyymmdd格式的数据日期
    ARG_OPTIME_LASTMONFIRSTDAY_ISO     = dicts['ARG_OPTIME_LASTMONFIRSTDAY_ISO']        #获得传入的数据日期的前一天所在月份月初yyyy-mm-dd格式的数据日期
    
    ARG_OPTIME_LASTYEAR1MON    = dicts['ARG_OPTIME_LASTYEAR1MON']       #获得传入的数据日期的去年上一月yyyymm格式的数据日期
    ARG_OPTIME_LASTYEAR1MON_ISO = dicts['ARG_OPTIME_LASTYEAR1MON_ISO']  #获得传入的数据日期的去年上一月yyyy-mm格式的数据日期


    ARG_OPTIME_LASTYEAR1MON01_ISO  = dicts['ARG_OPTIME_LASTYEAR1MON01_ISO']  # 获得传入的数据日期的去年上月第一天日期yyyy-mm-dd格式的数据日期

#===========================================================================================
#其它参数引入
#===========================================================================================
#tmp_path   临时表存放路径            
##===========================================================================       
##自定义变量声明---源表声明                                                          
##===========================================================================   
     
    s_dwd_fact_cust_base                 =    "dwd_fact_cust_base"
    s_dim_std_operator_phone             =    "dim_std_operator_phone"
    s_dwd_fact_ins_prod                  =    "dwd_fact_ins_prod"
    s_dwd_ins_prod_res                   =    "dwd_ins_prod_res"
    s_dwd_h_ins_prod_res                 =    "dwd_h_ins_prod_res"
    s_dwd_fact_payment                   =    "dwd_fact_payment"
    s_dim_std_channel_type               =    "dim_std_channel_type"
    s_dim_std_bank                       =    "dim_std_bank"
    s_dwd_rep_order_prod                 =    "dwd_rep_order_prod"
    s_dim_std_area                       =    "dim_std_area"
    s_dwd_ter_service                    =    "dwd_ter_service"
    s_dim_dr_program_label               =    "dim_dr_program_label"
    s_dim_tv_program_label               =    "dim_tv_program_label"    
    s_dwa_user_dr_program_m              =    "dwa_user_dr_program_m"
    s_dim_std_chunjie                    =    "dim_std_chunjie"
    s_dim_std_cert_type                  =    "dim_std_cert_type"
    s_dwd_fact_ins_srvpkg                =    "dwd_fact_ins_srvpkg"
    s_dwd_up_product_item                =    "dwd_up_product_item"
    s_dim_std_street                     =    "dim_std_street"
    s_dim_std_organize                   =    "dim_std_organize"
    
    s_tmp_dwa_cust_feat_dtl_m1           =    "tmp_dwa_cust_feat_dtl_m1"
    s_tmp_dwa_cust_feat_dtl_m2           =    "tmp_dwa_cust_feat_dtl_m2"
    s_tmp_dwa_cust_feat_dtl_m3           =    "tmp_dwa_cust_feat_dtl_m3"
    s_tmp_dwa_cust_feat_dtl_m4           =    "tmp_dwa_cust_feat_dtl_m4"
    s_tmp_dwa_cust_feat_dtl_m5           =    "tmp_dwa_cust_feat_dtl_m5"
    s_tmp_dwa_cust_feat_dtl_m6           =    "tmp_dwa_cust_feat_dtl_m6"
    s_tmp_dwa_cust_feat_dtl_m7           =    "tmp_dwa_cust_feat_dtl_m7"
    s_tmp_dwa_cust_feat_dtl_m8           =    "tmp_dwa_cust_feat_dtl_m8"
    s_tmp_dwa_cust_feat_dtl_m9           =    "tmp_dwa_cust_feat_dtl_m9"
    
    
##==========================================================================       
##自定义变量声明---目标表声明                                                        
##=========================================================================== 
    t_DWA_CUST_FEAT_DTL_M                =    "DWA_CUST_FEAT_DTL_M"    
##===========================================================================       
##创建临时表
##===========================================================================       

#存放业务类型用户分布及服务模式
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m1)s 
            (
            CUST_ID string,
            USER_COUNT string,
            DTV_USER_COUNT string,
            DFTV_USER_COUNT string,
            DBITV_USER_COUNT string,
            DITV_USER_COUNT string,
            LAN_USER_COUNT string,
            CLOUD_MEDIA_USER_COUNT string,
            AMSP_USER_COUNT string,
            HDTV_USER_COUNT string,
            IS_CONVERGE string,
            IS_ATV string,
            IS_DTV string,
            IS_DFTV string,
            IS_DBITV string,
            IS_DITV string,
            IS_LAN string,
            IS_AMSP string,
            IS_VOIP string,
            IS_CLOUD_MEDIA string,
            IS_HDTV string            
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m1)s'
         ''' % vars()
    QueryExe(hsql,name,dates)
    

#生成业务类型用户分布和服务模式数据
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m1)s 
            select CUST_ID,
	           count(distinct t.prod_inst_id) as user_count,
                   count(distinct case when t.is_dtv='1' then t.prod_inst_id else null end) as dtv_user_count,
                   count(distinct case when t.IS_DFTV='1' then t.prod_inst_id else null end) as dftv_user_count,
                   count(distinct case when t.IS_DBITV='1' then t.prod_inst_id else null end) as DBITV_user_count,
                   count(distinct case when t.IS_DITV='1' then t.prod_inst_id else null end) as ditv_user_count,
                   count(distinct case when t.IS_LAN='1' then t.prod_inst_id else null end) as lan_user_count,
                   count(distinct case when t.IS_CLOUD_MEDIA='1' then t.prod_inst_id else null end) as CLOUD_MEDIA_USER_count,
                   count(distinct case when t.IS_AMSP='1' then t.prod_inst_id else null end) as AMSP_user_count,
                   count(distinct case when t.IS_HDTV='1' then t.prod_inst_id else null end) as HDTV_USER_count,
                   CASE WHEN MAX(IS_DTV)='1' AND MAX(t.IS_LAN) = '1' THEN '1' ELSE '0' END AS IS_CONVERGE,
		   MAX(IS_ATV) AS IS_ATV,
		   MAX(IS_DTV) AS IS_DTV,
		   MAX(IS_DFTV) AS IS_DFTV,
		   MAX(IS_DBITV) AS IS_DBITV,
		   MAX(IS_DITV) AS IS_DITV,
		   MAX(IS_LAN) AS IS_LAN,
		   MAX(IS_AMSP) AS IS_AMSP,
		   MAX(IS_VOIP) AS IS_VOIP,
		   MAX(IS_CLOUD_MEDIA) AS IS_CLOUD_MEDIA,
		   MAX(IS_HDTV) AS IS_HDTV
	    FROM   %(s_dwd_fact_ins_prod)s t
	    where  t.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
	    and    t.is_vaild1 = '1'
	    GROUP BY T.CUST_ID
    ''' % vars()
    QueryExe(hsql,name,dates)


##创建临时表,统计用户缴费渠道
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m2)s 
    (
    CUST_ID string
    ,STD_CHANNEL_TYPE_CODE string
    ,STD_CHANNEL_TYPE_NAME string
    ,CHANNEL_FREQUENCY INT
    ,order_id int
    )
    stored as orcfile
    location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m2)s'
    ''' % vars()
    QueryExe(hsql,name,dates)


    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m2)s
    select t1.cust_id
    ,t1.STD_CHANNEL_TYPE_CODE
    ,t2.STD_CHANNEL_TYPE_NAME
    ,COUNT(1) channel_frequency
    ,ROW_NUMBER() OVER (distribute BY cust_id sort BY COUNT(1) DESC) order_id
    from %(s_dwd_fact_payment)s t1
    LEFT JOIN %(s_dim_std_channel_type)s t2
    on t1.STD_CHANNEL_TYPE_CODE = t2.STD_CHANNEL_TYPE_CODE
    where t1.operation_type=103000
    and t1.balance_type_id in (100,200)
    and unix_timestamp(t1.PAYMENT_DATE) > unix_timestamp(ADD_MONTHS('%(ARG_OPTIME_LASTMONEND_ISO)s',-12),'yyyy-MM-dd')
    AND unix_timestamp(t1.PAYMENT_DATE) < unix_timestamp('%(ARG_OPTIME_MON01_ISO)s','yyyy-MM-dd')
    GROUP BY T1.CUST_ID,t1.STD_CHANNEL_TYPE_CODE,t2.STD_CHANNEL_TYPE_NAME
    ''' % vars()
    QueryExe(hsql,name,dates)

#创建临时表，存放用户缴费方式频次
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m3)s 
    (
    CUST_ID STRING
    ,PAYMENT_TYPE STRING
    ,PAYMENT_FREQUENCY INT
    ,order_id INT
    )
    stored as orcfile
    location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m3)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#生成用户缴费方式频次数据
    hsql='''INSERT OVERWRITE TABLE %(s_tmp_dwa_cust_feat_dtl_m3)s
           SELECT T1.CUST_ID
                  ,t2.PAYMENT_TYPE
                  ,COUNT(1) PAYMENT_FREQUENCY
                  ,ROW_NUMBER() OVER (DISTRIBUTE BY T1.CUST_ID SORT BY COUNT(1) DESC) ORDER_ID
           FROM   %(s_dwd_fact_payment)s t1
           LEFT JOIN %(s_dim_std_bank)s t2
           ON   T1.bank_id = T2.bank_id
           WHERE t1.operation_type=103000
           and t1.balance_type_id in (100,200)
           and UNIX_TIMESTAMP(t1.PAYMENT_DATE ) > unix_timestamp(ADD_MONTHS('%(ARG_OPTIME_LASTMONEND_ISO)s',-12),'yyyy-MM-dd')
           AND UNIX_TIMESTAMP(t1.PAYMENT_DATE ) < UNIX_TIMESTAMP('%(ARG_OPTIME_MON01_ISO)s','yyyy-MM-dd')
           GROUP BY T1.CUST_ID,t2.payment_type
    ''' % vars()
    QueryExe(hsql,name,dates)

#创建临时表，计算用户一年内最短停机时间（停开机时间差）
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m4)s 
    (
    CUST_ID STRING
    ,stop_days int
    )
    stored as orcfile
    location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m4)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

#预留优化：考虑到有的用户一年内只有开机记录没有停机记录，此处可以改用full join默认停机时间使用一年前的时间
    hsql='''insert overwrite table  %(s_tmp_dwa_cust_feat_dtl_m4)s 
            select tj.cust_id,
                   min(case when COALESCE(kj.SRVPKG_CREATE_DATE,'%(ARG_OPTIME_LASTMONEND_ISO)s') > tj.SRVPKG_CREATE_DATE then datediff(COALESCE(kj.SRVPKG_CREATE_DATE,'%(ARG_OPTIME_LASTMONEND_ISO)s'),tj.SRVPKG_CREATE_DATE) else null end) stop_days
            from (
                select distinct cust_id,SRVPKG_CREATE_DATE 
                 from %(s_dwd_rep_order_prod)s 
                 where main_prod_inst_id=0
                 and business_id ='800001000077'
                 and prod_service_id='1002'
                 and pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                 and unix_timestamp(SRVPKG_CREATE_DATE)>= unix_timestamp('%(ARG_OPTIME_LASTYEAR1MON01_ISO)s','yyyy-MM-dd')
            ) tj
           left join (                             
                select distinct cust_id,SRVPKG_CREATE_DATE 
                 from %(s_dwd_rep_order_prod)s 
                 where main_prod_inst_id=0
                 and business_id = '800001000138'
                 and prod_service_id=1002
                 and pt_mon = '%(ARG_OPTIME_LAST1_M)s'
                 and unix_timestamp(SRVPKG_CREATE_DATE)>= unix_timestamp('%(ARG_OPTIME_LASTYEAR1MON01_ISO)s','yyyy-MM-dd')
           ) kj
           on tj.cust_id = kj.cust_id
           group by tj.cust_id
    ''' % vars()
    QueryExe(hsql,name,dates)



# 存放 近三月用户直播老人或小孩类节目的，直播时长、直播次数
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m5)s
         (
            cust_id  string,
            total_tv_time string,
            total_tv_num  string,
            child_tv_time_rate string,
            child_tv_num_pw string,
            max_child_daily_tv_time string,
            old_tv_time_rate    string,
            old_tv_num_pw    string,
            max_old_daily_tv_time string
           )
           stored as orcfile
           location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m5)s'
    ''' % vars()
    QueryExe(hsql,name,dates)


# 生成 近三月用户直播老人或小孩类节目的，直播时长占比、每周直播次数，最大日直播时长
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m5)s
            select t.cust_id,
                   sum(t.tv_time) total_tv_time,
                   sum(t.tv_num)  total_tv_num,
                   round(sum(t.child_tv_time)/sum(t.tv_time)*100,2)  child_tv_time_rate,
                   round(sum(t.child_tv_num)/floor(datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',concat('%(ARG_OPTIME_LAST3_M_ISO)s','-01'))/7),2)  child_tv_num_pw,
                   max(t.child_tv_time)  max_child_daily_tv_time,
                   round(sum(t.old_tv_time)/sum(t.tv_time)*100,2)    old_tv_time_rate,
                   round(sum(t.old_tv_num)/floor(datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',concat('%(ARG_OPTIME_LAST3_M_ISO)s','-01'))/7),2)    old_tv_num_pw,
                   max(t.old_tv_time)    max_old_daily_tv_time
            from 
            (select t1.cust_id,
                   from_unixtime(unix_timestamp(ucendtime),'yyyy-MM-dd') day,
                   sum(t1.uncontinue) tv_time,
                   count(1)         tv_num,
                   sum(case when t2.type='动漫' or array_contains(t2.category,'动漫') then t1.uncontinue else 0 end) child_tv_time,
                   sum(case when t2.type='动漫' or array_contains(t2.category,'动漫') then 1 else 0 end)  child_tv_num,
                   sum(case when array_contains(t2.category,'健康') or array_contains(t2.category,'养生') or array_contains(t2.category,'老人') or array_contains(t2.category,'中老年') then t1.uncontinue else 0 end) old_tv_time,
                   sum(case when array_contains(t2.category,'健康') or array_contains(t2.category,'养生') or array_contains(t2.category,'老人') or array_contains(t2.category,'中老年') then 1 else 0 end) old_tv_num
            from %(s_dwd_ter_service)s t1
            left join %(s_dim_tv_program_label)s t2
            on t1.program_nam = t2.program_name
            where t1.pt_mon >= %(ARG_OPTIME_LAST3_M)s
            and   t1.pt_mon <= %(ARG_OPTIME_LAST1_M)s
            and   coalesce(t1.cust_id,'') <> ''
            group by t1.cust_id,from_unixtime(unix_timestamp(ucendtime),'yyyy-MM-dd')) t
           group by t.cust_id
                   
    ''' % vars()
    QueryExe(hsql,name,dates)

# 存放 近三月用户点播老人或小孩类节目的数据，点播次数
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m6)s
            (
              cust_id string,
              total_dr_num string,
              child_dr_num_pw string,
              old_dr_num_pw   string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m6)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

# 生成 近三月用户点播老人或小孩类节目的数据
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m6)s 
            select t3.cust_id,
                   sum(t1.dr_num) total_dr_num,
                   round(sum(case when t2.type='动漫' or array_contains(t2.category,'动漫') then t1.dr_num else 0 end)/floor(datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',concat('%(ARG_OPTIME_LAST3_M_ISO)s','-01'))/7),2)  child_dr_num_pw,
                   round(sum(case when array_contains(t2.category,'健康') or array_contains(t2.category,'养生') or array_contains(t2.category,'老人') or array_contains(t2.category,'中老年') then t1.dr_num else 0 end)/floor(datediff('%(ARG_OPTIME_LASTMONEND_ISO)s',concat('%(ARG_OPTIME_LAST3_M_ISO)s','-01'))/7),2)   old_dr_num_pw
            from %(s_dwa_user_dr_program_m)s t1
            inner join %(s_dwd_fact_ins_prod)s t3
            on t1.prod_inst_id = t3.prod_inst_id
            and t3.pt_mon = %(ARG_OPTIME_LAST1_M)s
            left join %(s_dim_dr_program_label)s t2           
            on t1.program_name = t2.program_name
            where t1.pt_mon >= %(ARG_OPTIME_LAST3_M)s
            and   t1.pt_mon <= %(ARG_OPTIME_LAST1_M)s
            and   coalesce(t3.cust_id,'') <> ''
            group by t3.cust_id
    ''' % vars()
    QueryExe(hsql,name,dates)


# 存放待处理处理用户地址，用来获取用户街道和小区
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m7)s
            (
              cust_id string,
              address string,
              new_address  string,
              OWN_CORP_STD_ORG_CODE string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m7)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

# 地址里包含街道的处理数据
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m8)s
            (
              cust_id string,
              address string,
              STREET_NAME  string,
              AREA_NAME    string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m8)s'
    ''' % vars()
    QueryExe(hsql,name,dates)

# 地址里不包含街道的处理数据
    hsql='''create table if not exists %(s_tmp_dwa_cust_feat_dtl_m9)s
            (
              cust_id string,
              address string,
              STREET_NAME  string,
              AREA_NAME    string
            )
            stored as orcfile
            location '%(tmp_path)s/%(s_tmp_dwa_cust_feat_dtl_m9)s'
    ''' % vars()
    QueryExe(hsql,name,dates)
    
# 提取待处理的用户地址信息 
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m7)s
            select cust_id
                   ,address
                   ,regexp_replace(address,'[-()（）/?？]','')
                   ,OWN_CORP_STD_ORG_CODE
            from %(s_dwd_fact_cust_base)s t1 
            where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
              and coalesce(t1.address,'') <> ''
    ''' % vars()
    QueryExe(hsql,name,dates)

# 生成地址里包含街道的数据
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m8)s
            select t1.cust_id
                   ,t1.address
                   ,t2.std_street street_name
                   ,case when instr(t1.new_address,t2.std_street) > 0 then regexp_extract(substr(t1.new_address,instr(t1.new_address,t2.std_street)+length(t2.std_street)),"^([^0-9a-zA-Z]*)[0-9a-zA-Z]*")
                         when instr(t1.new_address,t2.std_street_alias) > 0 then regexp_extract(substr(t1.new_address,instr(t1.new_address,t2.std_street_alias)+length(t2.std_street_alias)),"^([^0-9a-zA-Z]*)[0-9a-zA-Z]*") 
                         else null
                    end  area_name
            from %(s_tmp_dwa_cust_feat_dtl_m7)s t1  
            left join %(s_dim_std_street)s t2
            on   t1.OWN_CORP_STD_ORG_CODE = t2.OWN_CORP_STD_ORG_CODE
            and  t2.is_valid = 1
            and  substr(t1.new_address,1,2) = t2.std_area
            where (instr(t1.new_address,t2.std_street) > 0  
              or   instr(t1.new_address,t2.std_street_alias) > 0)
    ''' % vars()
    QueryExe(hsql,name,dates)

# 生成地址里不包含街道的数据
    hsql='''insert overwrite table %(s_tmp_dwa_cust_feat_dtl_m9)s
            select t1.cust_id
                   ,t1.address
                   ,case when instr(t1.new_address,'测试') > 0 then '测试' 
                         else t3.std_street 
                    end  street_name
                   ,case when instr(t1.new_address,'测试') > 0 then '测试'
                         when t3.std_area is null then regexp_extract(t1.new_address,"^([^0-9a-zA-Z]*)[0-9a-zA-Z]*")
                         else regexp_extract(substr(t1.new_address,3),"^([^0-9a-zA-Z]*)[0-9a-zA-Z]*") 
                    end  area_name
            from %(s_tmp_dwa_cust_feat_dtl_m7)s t1  
            left join %(s_tmp_dwa_cust_feat_dtl_m8)s t2
            on t1.cust_id = t2.cust_id
            left join %(s_dim_std_street)s t3
            on   t1.OWN_CORP_STD_ORG_CODE = t3.OWN_CORP_STD_ORG_CODE
            and  t3.is_valid = 1
            and  t3.is_default = 1 
            and  substr(t1.new_address,1,2) = t3.std_area
            where t2.cust_id is null 
    ''' % vars()
    QueryExe(hsql,name,dates)



##===========================================================================
    
#生成目标表数据
    hsql='''insert overwrite table %(t_DWA_CUST_FEAT_DTL_M)s partition(pt_mon=%(ARG_OPTIME_LAST1_M)s)
            select
              t1.cust_id
              ,t1.cust_name
              ,CASE (CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),15,1) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),17,1) ELSE NULL END ) %% 2 WHEN 1 THEN '男' WHEN 0 THEN '女' ELSE '未知' END AS SEX
              ,case when FLOOR((CAST('%(ARG_OPTIME_LASTMONEND)s' AS INT) - CAST((CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN CONCAT('19',SUBSTR(TRIM(T1.CUST_CERT_NO),7,6)) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),7,8) ELSE '' END) AS INT))/10000)         between 1 and 100 
                    then FLOOR((CAST('%(ARG_OPTIME_LASTMONEND)s' AS INT) - CAST((CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN CONCAT('19',SUBSTR(TRIM(T1.CUST_CERT_NO),7,6)) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),7,8) ELSE '' END) AS INT))/10000) 
                    else null 
                end AS AGE  -- 注意结果为空的处理
              ,case LENGTH(TRIM(T1.CUST_CERT_NO)) 
                      when 15 then concat(substr(TRIM(T1.CUST_CERT_NO),7,1),'0')
                      when 18 then concat(substr(TRIM(T1.CUST_CERT_NO),9,1),'0')
                      else null
               end GENERATION
              ,'' MARRIAGE
              ,case 
                   when LENGTH(TRIM(T1.CUST_CERT_NO)) in (15,18) then 
              (CASE WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0321' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0420' THEN '白羊座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0421' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0520' THEN '金牛座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0521' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0621' THEN '双子座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0622' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0722' THEN '巨蟹座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0723' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0822' THEN '狮子座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0823' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0922' THEN '处女座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0923' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '1022' THEN '天枰座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '1023' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '1121' THEN '天蝎座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '1122' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '1221' THEN '射手座'
                    WHEN (SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '1222' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '1231')
                         OR (SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0101' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0119') THEN '摩羯座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0120' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0218' THEN '水瓶座'
                    WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) >= '0219' AND SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) <= '0320' THEN '双鱼座' 
              ELSE NULL END)
              else null end  CONSTELLATION
              ,CASE PMOD(cast(t16.year as int) - 1900 - (CASE WHEN SUBSTR(LPAD(TRIM(T1.CUST_CERT_NO),17,'0'),11,4) < t16.day THEN 1 ELSE 0 END),12)
                     WHEN 0 THEN '鼠'
                     WHEN 1 THEN '牛'
                     WHEN 2 THEN '虎'
                     WHEN 3 THEN '兔'
                     WHEN 4 THEN '龙'
                     WHEN 5 THEN '蛇'
                     WHEN 6 THEN '马'
                     WHEN 7 THEN '羊'
                     WHEN 8 THEN '猴'
                     WHEN 9 THEN '鸡'
                     WHEN 10 THEN '狗'
                     WHEN 11 THEN '猪'
                     ELSE NULL
               END  ZODIAC
              ,'' EDUCATION
	      ,'' CENSUS_REGISTER
              ,concat(t13.std_area_name,t14.std_area_name,t15.std_area_name) NATIVE_PLACE
              ,coalesce(t17.cert_type_name,t1.CUST_CERT_TYPE) CERTIFICATE_TYPE
              ,t1.CUST_CERT_NO CERTIFICATE_NUM
              ,'' PROFESSION
              ,t1.CONT_MOBILE1 MOBILE1
              ,t2.operator MOBILE_OPERATOR1
              ,t1.CONT_MOBILE2 MOBILE2
              ,t3.operator MOBILE_OPERATOR2
              ,t1.CONT_PHONE1 PHONE1
              ,t1.CONT_PHONE2 PHONE2
              ,t1.OWN_CORP_STD_ORG_CODE CORP_ORG_CODE
              ,t20.std_org_name         CORP_ORG_NAME
              ,t1.MGR_ADDR_NAME         MGR_ADDR_NAME
              ,CASE T6.DISTRICT_FLAG WHEN 1 THEN '乡镇' ELSE '城区' END   DISTRICT_NAME
--              ,t1.STREET_STD_ADDR_NAME  STREET_NAME
              ,coalesce(t18.street_name,t19.street_name) STREET_NAME
              ,''  COMMUNITY_NAME
--              ,t1.AREA_STD_ADDR_NAME AREA_NAME
              ,coalesce(t18.area_name,t19.area_name) AREA_NAME
              ,'' AREA_TYPE_NAME
              ,T4.USER_COUNT USER_COUNT
              ,'' NOT_DTV_USER_COUNT
              ,T4.DTV_USER_COUNT DTV_USER_COUNT
	      ,T4.DFTV_USER_COUNT DFTV_USER_COUNT
	      ,T4.DBITV_USER_COUNT DBITV_USER_COUNT
	      ,T4.DITV_USER_COUNT DITV_USER_COUNT
	      ,T4.LAN_USER_COUNT LAN_USER_COUNT
	      ,T4.CLOUD_MEDIA_USER_COUNT CLOUD_MEDIA_USER_COUNT
	      ,T4.AMSP_USER_COUNT AMSP_USER_COUNT
	      ,T4.HDTV_USER_COUNT HDTV_USER_COUNT
              ,'' LAN_PARTNER_USER_COUNT
              ,T4.IS_CONVERGE IS_CONVERGE
              ,CASE WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s',t1.CREATE_DATE) < 365 THEN '1年以内'
	      	    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s',t1.CREATE_DATE) >= 365 AND DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s',t1.CREATE_DATE) < 365*3  THEN '1年-3年'
		    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s',t1.CREATE_DATE ) >= 365*3 AND DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t1.CREATE_DATE ) < 365*5	  THEN '3年-5年'
		    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t1.CREATE_DATE ) >= 365*5 THEN '大于5年'
		    ELSE NULL
	       END NET_AGE
	      ,T4.IS_ATV
	      ,T4.IS_DTV
	      ,T4.IS_DFTV
	      ,T4.IS_DBITV
	      ,T4.IS_DITV
	      ,T4.IS_LAN
	      ,T4.IS_AMSP
	      ,T4.IS_VOIP
	      ,T4.IS_CLOUD_MEDIA
	      ,T4.IS_HDTV
              ,CASE WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) < 365 THEN '1年以内'
	      	    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) >= 365 AND DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) < 365*3  THEN '1年-3年'
		    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) >= 365*3 AND DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) < 365*5	  THEN '3年-5年'
		    WHEN DATEDIFF('%(ARG_OPTIME_LASTMONEND_ISO)s' ,t5.CREATE_DATE ) >= 365*5 THEN '大于5年'
		    ELSE NULL
	       END DEV_USE_AGE
	      ,t1.AVG_CONSUME_AMOUNT MONTH_AVG_CONSUM_AMOUNT 
	      ,t1.DITV_AVG_CONSUME_AMOUNT MONTH_AVG_VOD_AMOUNT 
              ,t7.STD_CHANNEL_TYPE_NAME  PAYMENT_CHANNEL
	      ,t8.payment_type PAYMENT_HABIT        
	      ,case when t10.stop_days is null then '无欠费停机特征' when t10.stop_days <= 7 then '欠费停机敏感客户（1周）' when t10.stop_days <= 14  then '欠费停机敏感客户（2周）' when t10.stop_days <= 30 then '欠费停机敏感客户（1月）' when t10.stop_days > 30  then '欠费停机不敏感客户' else null end  DEBT_STOP_SEN_LEV   
	      ,'' CUST_VALUE          
	      ,'' LATENT_LOST          
	      ,'' COMPLAINT_LEVEL     
	      ,'' ADVISORY_LEVEL      
	      ,CASE WHEN T9.CHANGE_FREQUENCY IS NULL  THEN '一年内无换机' WHEN T9.CHANGE_FREQUENCY = '1' THEN '一年内换机一次' WHEN T9.CHANGE_FREQUENCY > '1' THEN '一年内换机两次及以上' ELSE NULL END   DEV_CHANGE_TYPE     
	      ,case when t11.child_tv_num_pw >=2 and t11.max_child_daily_tv_time >= 30*60 then 1  when t12.child_dr_num_pw >=3 then 1 else 0 end  FAMILY_CHILD         
	      ,case when (CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),15,1) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),17,1) ELSE NULL END ) %% 2 = 1 and FLOOR((CAST('%(ARG_OPTIME_LASTMONEND)s' AS INT) - CAST((CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN CONCAT('19',SUBSTR(TRIM(T1.CUST_CERT_NO),7,6)) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),7,8) ELSE '' END) AS INT))/10000) >= 60 then 1  -- 男 年龄 >= 60
                    when (CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),15,1) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),17,1) ELSE NULL END ) %% 2 = 0 and FLOOR((CAST('%(ARG_OPTIME_LASTMONEND)s' AS INT) - CAST((CASE LENGTH(TRIM(T1.CUST_CERT_NO)) WHEN 15 THEN CONCAT('19',SUBSTR(TRIM(T1.CUST_CERT_NO),7,6)) WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),7,8) ELSE '' END) AS INT))/10000) >= 55 then 1  -- 女 年龄 >= 55
                    when t11.old_tv_time_rate >= 10 then 1 
                    when t12.old_dr_num_pw >=3 then 1
                    else 0
               end  FAMILY_OLD
              ,t1.CUST_TYPE         
	      ,'' REMARK1   
	      ,'' REMARK2 
	      ,'' REMARK3   
	      ,'' REMARK4 
	      ,'' REMARK5 
              ,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') etl_date
            from %(s_dwd_fact_cust_base)s t1 
            LEFT JOIN %(s_dim_std_operator_phone)s t2
            ON  substr(t1.CONT_MOBILE1,1,7) = t2.leading_num
            LEFT JOIN %(s_dim_std_operator_phone)s t3
            ON  substr(t1.CONT_MOBILE2,1,7) = t3.leading_num
	    LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m1)s t4
	    ON T1.CUST_ID = T4.CUST_ID
	    LEFT JOIN (SELECT cust_id,min(CREATE_DATE) create_date FROM %(s_dwd_ins_prod_res)s where pt_mon=%(ARG_OPTIME_LAST1_M)s group by cust_id) t5
	    ON T1.CUST_ID = T5.CUST_ID
            LEFT JOIN (SELECT a.cust_id,MAX(CASE WHEN instr(b.name,'农村')>0 THEN 1 ELSE 0 END) as DISTRICT_FLAG  FROM %(s_dwd_fact_ins_srvpkg)s a left join %(s_dwd_up_product_item)s b on a.srvpkg_id=b.product_item_id and b.pt_mon=%(ARG_OPTIME_LAST1_M)s where a.pt_mon=%(ARG_OPTIME_LAST1_M)s AND a.state='1' and a.prod_service_id='1002' GROUP BY a.cust_id  ) t6  -- 产品民称是否包含"农村"
            ON T1.CUST_ID = T6.CUST_ID
            LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m2)s T7
            ON T1.CUST_ID = T7.CUST_ID AND T7.order_id = '1'
            LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m3)s T8
            ON T1.cust_id = t8.cust_id AND  t8.order_id = '1'
            LEFT JOIN (SELECT CUST_ID,COUNT(DISTINCT DONE_CODE) AS CHANGE_FREQUENCY FROM %(s_dwd_h_ins_prod_res)s WHERE unix_timestamp(DONE_DATE) > unix_timestamp(ADD_MONTHS('%(ARG_OPTIME_LASTMONEND_ISO)s',-12),'yyyy-MM-dd') AND unix_timestamp(DONE_DATE) < unix_timestamp('%(ARG_OPTIME_MON01_ISO)s','yyyy-MM-dd') and pt_year=%(ARG_OPTIME_YEAR)s GROUP BY CUST_ID ) T9  
            ON T1.CUST_ID = T9.CUST_ID
            LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m4)s T10
            ON T1.CUST_ID = T10.CUST_ID
            left join %(s_tmp_dwa_cust_feat_dtl_m5)s t11
            on t1.cust_id = t11.cust_id
            left join %(s_tmp_dwa_cust_feat_dtl_m6)s t12
            on t1.cust_id = t12.cust_id
            left join %(s_dim_std_area)s t13
            on concat(substr(T1.CUST_CERT_NO,1,2),'0000') = t13.std_area_code
            left join %(s_dim_std_area)s t14
            on concat(substr(T1.CUST_CERT_NO,1,4),'00') = t14.std_area_code
            left join %(s_dim_std_area)s t15
            on substr(T1.CUST_CERT_NO,1,6) = t15.std_area_code
            left join %(s_dim_std_chunjie)s t16
            on (CASE LENGTH(TRIM(T1.CUST_CERT_NO)) 
                       WHEN 15 THEN CONCAT('19',SUBSTR(TRIM(T1.CUST_CERT_NO),7,2)) 
                       WHEN 18 THEN SUBSTR(TRIM(T1.CUST_CERT_NO),7,4) 
                       ELSE T1.CUST_CERT_NO
               END) = t16.year       
            left join %(s_dim_std_cert_type)s t17
            on  t1.CUST_CERT_TYPE = t17.cert_type_code
            LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m8)s T18
            ON T1.CUST_ID = T18.CUST_ID
            LEFT JOIN %(s_tmp_dwa_cust_feat_dtl_m9)s T19
            ON T1.CUST_ID = T19.CUST_ID
            LEFT JOIN %(s_dim_std_organize)s t20
            on t1.OWN_CORP_STD_ORG_CODE = t20.std_org_code
            where t1.pt_mon = '%(ARG_OPTIME_LAST1_M)s'
              and t1.cust_level not in (5,9,31,33)  -- 剔除测试用户
    '''% vars()
    QueryExe(hsql,name,dates)


##===========================================================================       
##删除临时表                                               
##===========================================================================
    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m1)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m2)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m3)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m4)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m5)s''' %vars()
    # QueryExe(hsql,name,dates)

    # hsql='''drop table %(s_tmp_dwa_cust_feat_dtl_m6)s''' %vars()
    # QueryExe(hsql,name,dates)

    
##===========================================================================       
##程序结束                                               
##===========================================================================
    End(name,dates)
except Exception,e:
    Except(name,dates,e)
