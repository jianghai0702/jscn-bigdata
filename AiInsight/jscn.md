#### 第一章 集群信息

###### 1.1 VPN设置

```
vpn 地址： 122.193.8.206
vpn 账号： jscn-YaXIn
vpn 密码： jsCndETAT@I90dItT@!@2018I06
```

###### 1.2 服务器

| 主机   | IP            | GATEWAY      | 登录方式 | 用户名/密码                             |
| ------ | ------------- | ------------ | -------- | --------------------------------------- |
| jsgd4  | 111.208.67.21 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd5  | 111.208.67.22 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd6  | 111.208.67.23 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd7  | 111.208.67.24 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd18 | 111.208.67.18 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd20 | 111.208.67.20 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd25 | 111.208.67.25 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd27 | 111.208.67.27 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$    oracle/JSCN2017)(* |
| jsgd29 | 111.208.67.29 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd30 | 111.208.67.30 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd2  | 111.208.67.19 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |

###### 1.3 SVN信息

```
地址:svn://10.10.100.151/boss2/BISRD/Project/JiangSu-Data/AiInsight
```

###### 1.4 CDH集群

```
地址:http://111.208.67.23:7180/cmf/home 
账号:admin
密码:admin
```

###### 1.5 Mysql数据库

| 数据库主机                | 数据库名            | 用户                                              | 密码 |
| ------------------------- | ------------------- | ------------------------------------------------- | ---- |
| 111.208.67.27 （jsgd27）  | SERVICE_NAME = orcl | "system/Abc1234，st/st dim/dim，portal/Portal123" |      |
| 111.208.67.27 （jsgd27）  | st,portal           | "st/st，portal/portal"                            |      |
| bigdata.jscndata.com:4289 | st,portal           | "st/st，portal/portal"                            |      |

###### 1.6 拨测数据API生成

```
地址：http://getdata.bonree.com/CreateUrl/create.jsp
```

###### 1.7 主机服务

| 主机   | IP            | 内存(GB) | 磁盘 | 服务项                                                       |
| ------ | ------------- | -------- | ---- | ------------------------------------------------------------ |
| jsgd4  | 111.208.67.21 | 32GB     | 2T   | HiveServer2,NodeManager,调度AZKABAN,,ftp                     |
| jsgd5  | 111.208.67.22 | 64GB     | 600G | JournalNode,NodeManager,采集                                 |
| jsgd6  | 111.208.67.23 | 64GB     | 600G | NameNode,JournalNode,ZooKeeper Server,Resource Manager ,sqoop ,hive |
| jsgd7  | 111.208.67.24 | 64GB     | 600G | NameNode,JournalNode,Resource Manager                        |
| jsgd18 | 111.208.67.18 | 32GB     | 19T  | DataNode,ZooKeeper Server,NodeManager                        |
| jsgd20 | 111.208.67.20 | 32GB     | 21T  | DataNode,NodeManager,ftp(流控)                               |
| jsgd25 | 111.208.67.25 | 32GB     | 21T  | DataNode,ZooKeeper Server,NodeManager                        |
| jsgd27 | 111.208.67.27 | 32GB     | 21T  | oracle,数据备份,mysql                                        |
| jsgd29 | 111.208.67.29 | 32GB     | 21T  | DataNode,NodeManager                                         |
| jsgd30 | 111.208.67.30 | 32GB     | 21T  | DataNode,NodeManager                                         |
| jsgd2  | 111.208.67.19 | 32GB     | 21T  |                                                              |

##### 





#### 第二章 操作层STG

###### 2.1 日志采集

```
auth日志采集：
	- 第一步：通过ftp将每天的日志传输到21号机的/home/ftpuser/auth
	- 第二步：在22号机/opt/dolphin/auth_log中配置flume采集/home/ftpuser/auth中的日志，并存储到22号机的/opt/data/auth/stg_brd_auth_log/中
	- 第三步：运行21号机/AiInsight/stg/中的脚本，将22号机的/opt/data/auth/stg_brd_auth_log/中的日志临时复制一份过来，存储在/AiInsight/download/中
	- 第四步：通过21号机的脚本将存储在/AiInsight/download/中的日志加载到hive表
```



###### stg_arpu

```
#!/bin/bash
#######################################################
#定义变量
#######################################################
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="stg_arpu"
#源数据库表名（必须大写）
source_table_name="REP.KD_ARPU_2019"
#######################################################
#脚本开始
##########################################g#############
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天

echo ${etl_cycle}
echo ${data_cycle}
#加载数据到目标表中
su - hdfs <<EOF
/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_import.txt  --table ${source_table_name}  --hive-table  ${target_database}.${target_table_name} --hive-partition-key pt_mon --hive-partition-value "${etl_cycle}"

exit;
EOF
```





#### 第三章 明细层DWD



#### 第四章 维表DIM



#### 第五章 数据服务层DWS



#### 第六章 数据集市ST



#### 第七章 数据上传H2O





#### 第八章 可视化大屏

###### 8.1 可视化大屏信息

```
地址:http://111.208.67.19/#/home 
账号:admin
密码:!Aa123qaz
```

###### 8.2 江苏省广电宽带用户分布地图

```
--  --   地图颜色深度数据 有效用户数
select   t.area area,                   -- 地市名称
         valid_user_cnt  userCnt       -- 有效用户数
 from LAN_USER_STATS_RATES t 
 left join dim_std_organize o
     on t.std_org_code = o.std_org_code
 left join dim_std_organize p 
     on o.p_std_org_code = p.std_org_code
 where t.stats_dt = '2018-12'
   and (case when p.std_org_code = '10' then '全省' 
       else trim(trailing '地区' from p.std_org_name) end)  = '全省'
order by valid_user_cnt DESC ;
```

###### 8.3 ARPU值分析

```
--   arpu值分析
 select t.lan_arpu LanArpu,  --  单宽带arpu
        t.com_arpu ComArpu   --  综合arpu
 from  dp_lan_arpu t
 where t.area = '全省'
 and stats_dt = '2018-12' ;
```



#### 第九章 Mysql存储过程

###### update_kpi_data

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_data`(IN update_month CHAR(7),internal_flow_rate DECIMAL(4,2))
BEGIN
  -- 融合非融合用户统计
  CALL update_kpi_conv_user_stats(update_month) ;
  -- 各带宽用户
  CALL update_kpi_bandwidth_user_stats(update_month) ;
  -- 宽带用户发展
  CALL update_kpi_user_dev_stats(update_month) ;

  -- 流量入库 flow_stats
  CALL update_flow_stats(update_month) ;
  -- 内网流量占比
  CALL update_internal_flow_rate(update_month,internal_flow_rate) ;
  -- 流量
  CALL update_kpi_flow_stats(update_month);

  -- 可视化用户
  CALL update_lan_user_stats_rates(update_month);
  -- arpu
  CALL update_dp_lan_arpu(update_month);

  -- 网格数据
  CALL update_dp_grid_user_stats(update_month) ;
  -- 小区数据
  CALL update_dp_area_user_stats(update_month) ;

  -- 在线率
  CALL update_dp_user_onlinerate(update_month) ;


  -- new表更新
  CALL dp_new_table_modify_proc(update_month);

END
```

###### dp_new_table_modify_proc

```
CREATE DEFINER=`st`@`%` PROCEDURE `dp_new_table_modify_proc`(IN update_month CHAR(7))
BEGIN
  DELETE FROM lan_user_stats_rates_new WHERE stats_dt = update_month;
  DELETE FROM dp_user_onlinerate_new WHERE stats_dt = update_month;
  DELETE FROM dp_lan_arpu_new WHERE stats_dt = update_month;
  DELETE FROM kpi_flow_stats_new WHERE stats_dt = update_month;

  insert into lan_user_stats_rates_new
  select  stats_dt
       ,STD_ORG_CODE
       ,AREA
       ,MUBIAO
       ,VALID_USER_CNT
       ,PAID_USER_CNT
       ,TV_PAID_USER_CNT
       ,COMPLETION_RATE
       ,PAID_RATE
       ,LAN_USER_RATE
       ,FLOWS
       ,FLOWS_PER_USERS
       ,net_acc_incr_usr_cnts
      ,current_timestamp()
  from  lan_user_stats_rates t where t.stats_dt =update_month;

  insert into dp_user_onlinerate_new
  select t.*,current_timestamp() from  dp_user_onlinerate t where t.stats_dt =update_month;
  insert into dp_lan_arpu_new
  select t.*,current_timestamp() from  dp_lan_arpu t where t.stats_dt =update_month;
  insert into kpi_flow_stats_new
  select t.*,current_timestamp() from  kpi_flow_stats t where t.stats_dt =update_month;
  commit;
END
```

###### get_last_update_month

```
CREATE DEFINER=`st`@`%` FUNCTION `get_last_update_month`() RETURNS char(7) CHARSET utf8
return (select substr(max(datemonth) from 1 for 7)  from datasource1)
```

###### param_add_adjust_pro

```
CREATE DEFINER=`st`@`%` PROCEDURE `param_add_adjust_pro`(IN update_month CHAR(7))
BEGIN

  -- 用户数
  DELETE FROM lan_user_stats_rates_new WHERE stats_dt = update_month;
  INSERT INTO lan_user_stats_rates_new
  SELECT  t1.stats_dt
         ,t2.std_org_code
         ,t2.area
         ,t2.mubiao
         ,COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0)  valid_user_cnt
         ,COALESCE(t2.paid_user_cnt,0) + COALESCE(t1.paid_user_cnt,0) paid_user_cnt
         ,t2.tv_paid_user_cnt
         ,COALESCE(ROUND((COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0)-t3.last_year_user_cnts)/NULLIF(t3.increase_mubiao,0) * 100, 2),0) completion_rate -- 指标完成率
         ,round((COALESCE(t2.paid_user_cnt,0) + COALESCE(t1.paid_user_cnt,0))/(COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0))*100,2)  paid_rate
         ,t2.lan_user_rate  -- 宽带接入率
         ,COALESCE(t2.flows,0) + COALESCE(t1.flows,0)  -- 总流量
         ,COALESCE(t2.flows_per_users,0)+COALESCE(t1.flows_per_users,0)   flows_per_users -- 万户带宽
         ,current_timestamp()
    FROM param_add_adjust t1
    LEFT JOIN lan_user_stats_rates t2 ON t1.std_org_code = t2.std_org_code
         AND  t2.stats_dt = update_month
    LEFT JOIN t_mubiao t3 ON t1.std_org_code = t3.std_org_code and t3.m_year = substr(update_month,1,4)
    where t1.stats_dt = update_month
    ;
  COMMIT ;
  -- 在线率
  DELETE FROM dp_user_onlinerate_new WHERE stats_dt = update_month;
  INSERT INTO dp_user_onlinerate_new
  SELECT  t1.stats_dt
         ,t2.std_org_code
         ,t2.area
         ,t2.online_user_cnt
         ,coalesce(t2.paid_user_cnt,0)+coalesce(t1.paid_user_cnt,0)
         ,coalesce(t1.online_rate,0)+coalesce(t2.online_rate,0)  online_rate
         ,current_timestamp()
    FROM param_add_adjust t1
    LEFT JOIN dp_user_onlinerate t2 ON t1.std_org_code = t2.std_org_code
         AND  t2.stats_dt = update_month
    where t1.stats_dt = update_month
          ;
  COMMIT ;

  -- arpu
  DELETE FROM dp_lan_arpu_new WHERE stats_dt = update_month;
  INSERT INTO dp_lan_arpu_new
  SELECT
        t2.area
       ,t2.std_org_code
       ,coalesce(t2.lan_arpu,0)+coalesce(t1.lan_arpu,0) lan_arpu
       ,coalesce(t2.com_arpu,0)+coalesce(t1.lan_arpu,0) com_arpu
       ,t1.stats_dt
       ,current_timestamp()
  FROM param_add_adjust t1
  LEFT JOIN dp_lan_arpu t2 ON t1.std_org_code = t2.std_org_code
       AND  t2.stats_dt = update_month
  where t1.stats_dt = update_month
  ;
  COMMIT ;

  -- flows
  DELETE FROM kpi_flow_stats_new WHERE stats_dt = update_month;
  INSERT INTO kpi_flow_stats_new
  SELECT
       t1.stats_dt
       ,t2.std_org_code
       ,t2.area
       ,coalesce(t2.flows,0)+coalesce(t1.flows,0) flows
       ,t2.flow_rate
       ,t2.mix_flows
       ,t2.mix_flow_rate
       ,t2.self_pur_flows
       ,t2.internal_flows
       ,t2.internal_flow_rate
       ,coalesce(t2.lan_paid_user_cnt,0)+COALESCE(t1.paid_user_cnt,0)  paid_user_cnt -- 缴费用户数
       ,coalesce(t2.flows_per_users,0)+coalesce(t1.flows_per_users,0) flows_per_users
       ,current_timestamp()
  FROM param_add_adjust t1
  LEFT JOIN kpi_flow_stats t2 ON t1.std_org_code = t2.std_org_code
       AND  t2.stats_dt = update_month
  where t1.stats_dt = update_month
  ;
  COMMIT ;

END
```

###### update_dp_area_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_area_user_stats`(IN update_month char(7))
BEGIN 
    DELETE FROM dp_area_user_stats WHERE stats_dt = update_month ;
    INSERT INTO  dp_area_user_stats 
   select insert(t.cycle_id,5,0,'-') AS stats_dt,t.own_corp_std_org_code AS std_org_code,t.grid_id,t.grid_name,t.area_std_addr_id AS  std_area_id,t.area_std_addr_name AS std_area_name,
        t.lan_valid_user_cnt,
        t.lan_paid_user_cnt,
        t.dtv_valid_user_cnt,
        t.dtv_paid_user_cnt,
        c.paid_cust_cnt,
        t.new_lan_user_cnt,
        t.lose_lan_user_cnt,
       case when t.lan_valid_user_cnt = 0 then 0
       else round ( t.lan_paid_user_cnt/t.lan_valid_user_cnt * 100,2) end as paid_rate,
       case when COALESCE(c.paid_cust_cnt,0) = 0 then 0
              else round (t.lan_valid_user_cnt/ c.paid_cust_cnt * 100,2) end as lan_rate,
       o.short_name AS area
from st_grid_user_dev_m t
LEFT JOIN st_grid_cust_dev_m c
ON t.cycle_id = c.cycle_id
AND t.cust_type = c.cust_type
AND t.own_corp_std_org_code  = c.own_corp_std_org_code
AND t.grid_id = c.grid_id
AND t.area_std_addr_id = c.area_std_addr_id
LEFT JOIN dim_std_organize o 
ON o.std_org_code = t.own_corp_std_org_code
WHERE t.lan_valid_user_cnt > 0 
  AND t.area_std_addr_id IS NOT NULL
  AND t.own_corp_std_org_code IS NOT NULL
  AND t.cust_type = 1
  AND t.CYCLE_ID = replace(update_month,'-','') ;
  END
```

###### update_dp_grid_area_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_grid_area_user_stats`(IN update_month char(7))
BEGIN
        DELETE FROM DP_GRID_AREA_USER_STATS WHERE stats_dt = update_month;
        INSERT INTO DP_GRID_AREA_USER_STATS
        select   update_month
                ,T1.own_corp_std_org_code
                ,T1.grid_id
                ,T1.grid_name
                ,T1.area_std_addr_id
                ,T1.area_std_addr_name
                ,T1.lan_valid_user_cnt
                ,T1.lan_paid_user_cnt
                ,T1.dtv_valid_user_cnt
                ,T1.dtv_paid_user_cnt
                ,T2.paid_cust_cnt  dtv_paid_cust_cnt
                ,T2.conv_cust_cnt
                ,T2.olan_cust_cnt
                ,T1.new_lan_user_cnt
                ,T1.lose_lan_user_cnt
                ,case when T1.lan_valid_user_cnt = 0 then 0
                 else round((T1.lan_paid_user_cnt/T1.lan_valid_user_cnt)* 100,2) end as paid_rate
                ,case when COALESCE(T2.paid_cust_cnt,0) = 0 then 0
                 else round ((T1.lan_valid_user_cnt/T2.paid_cust_cnt) * 100,2) end as lan_rate
                ,T3.short_name
          From
          (select own_corp_std_org_code
                 ,grid_id
                 ,grid_name
                 ,area_std_addr_id
                 ,area_std_addr_name
                 ,sum(lan_valid_user_cnt) lan_valid_user_cnt
                 ,sum(lan_paid_user_cnt)  lan_paid_user_cnt
                 ,sum(dtv_valid_user_cnt)  dtv_valid_user_cnt
                 ,sum(DTV_PAID_USER_CNT)  dtv_paid_user_cnt
                 ,sum(new_lan_user_cnt)   new_lan_user_cnt
                 ,sum(lose_lan_user_cnt)  lose_lan_user_cnt
          from  st_grid_user_dev_m
          where pt_mon=replace(update_month,'-','')
            and area_std_addr_id is not null
          group by own_corp_std_org_code,grid_id,grid_name,area_std_addr_id,area_std_addr_name
          ) T1
          join
          (select  own_corp_std_org_code
                  ,grid_id
                  ,grid_name
                  ,area_std_addr_id
                  ,area_std_addr_name
                  ,sum(paid_cust_cnt) as paid_cust_cnt
                  ,sum(conv_valid_cust_cnt) as conv_cust_cnt
                  ,SUM(olan_valid_cust_cnt)  AS olan_cust_cnt
          from st_grid_cust_dev_m
          where pt_mon=replace(update_month,'-','')
            and area_std_addr_id is not null
          group by own_corp_std_org_code,grid_id,grid_name,area_std_addr_id,area_std_addr_name
          ) T2
          on T1.own_corp_std_org_code=T2.own_corp_std_org_code
          and T1.grid_id = T2.grid_id
          and T1.area_std_addr_id = T2.area_std_addr_id
          join dim_std_organize T3 on T1.own_corp_std_org_code=T3.std_org_code
        ;

    END
```

###### update_dp_grid_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_grid_user_stats`(IN update_month char(7) )
BEGIN
        DELETE FROM DP_GRID_USER_STATS WHERE stats_dt = update_month;
        INSERT INTO DP_GRID_USER_STATS 
        select insert(t.cycle_id,5,0,'-') AS stats_dt,t.own_corp_std_org_code AS std_org_code,
               t.grid_id,coalesce (g.grid_name,t.grid_name) grid_name,CAST(t.mgr_id AS char) AS mgr_id,coalesce(g.mgr_name,t.mgr_name) as mgr_name,
               sum(lan_valid_user_cnt) as lan_valid_user_cnt ,
               sum(lan_paid_user_cnt) as lan_paid_user_cnt,
               sum(dtv_valid_user_cnt) as dtv_valid_user_cnt,
               sum(dtv_paid_user_cnt) as dtv_paid_user_cnt,
               sum(c.paid_cust_cnt) as dtv_paid_cust_cnt,
               sum(c.conv_valid_cust_cnt) as conv_cust_cnt,
               SUM(c.olan_valid_cust_cnt)  AS olan_cust_cnt,
               sum(new_lan_user_cnt) as new_lan_user_cnt,
               sum(lose_lan_user_cnt) as lose_lan_user_cnt,
               case when sum(lan_valid_user_cnt) = 0 then 0
               else round ( sum(lan_paid_user_cnt)/sum(lan_valid_user_cnt) * 100,2) end as paid_rate,
               case when COALESCE(sum(c.paid_cust_cnt),0) = 0 then 0
                      else round (sum(lan_valid_user_cnt)/sum(c.paid_cust_cnt) * 100,2) end as lan_rate,
                      d.SHORT_NAME AS area 
        from st_grid_user_dev_m t
        LEFT JOIN st_grid_cust_dev_m c
        ON t.cycle_id = c.cycle_id
        AND t.own_corp_std_org_code  = c.own_corp_std_org_code
        AND t.grid_id = c.grid_id
        AND COALESCE(t.area_std_addr_id,'null') = COALESCE(c.area_std_addr_id,'null')
        AND t.cust_type = c.cust_type
        left join some_grid_name g
        on t.grid_id = g.grid_id
        LEFT JOIN DIM_STD_ORGANIZE d 
        ON d.STD_ORG_CODE = t.OWN_CORP_STD_ORG_CODE
        WHERE t.own_corp_std_org_code IS NOT NULL
        AND t.cust_type = 1
        AND t.CYCLE_ID = replace(update_month,'-','')
        group by t.cycle_id,t.own_corp_std_org_code,t.grid_id,coalesce (g.grid_name,t.grid_name) ,t.mgr_id,coalesce(g.mgr_name,t.mgr_name),d.SHORT_NAME  ;
   
    END
```

###### update_dp_lan_arpu

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_lan_arpu`(IN update_month CHAR(7))
BEGIN

  DELETE FROM dp_lan_arpu WHERE stats_dt = update_month ;

    -- 地区采用分公司的平均值
  insert into dp_lan_arpu
  select t1.short_name
         ,t.std_org_code
         ,t.lan_arpu
         ,t.comp_arpu
         ,update_month
  from
  (select
          round(avg(t1.lan_arpu),2) lan_arpu
         ,round(avg(t1.comp_arpu),2) comp_arpu
         ,coalesce(t2.std_org_code,t2.p_std_org_code)  std_org_code
         ,t2.p_std_org_code
  from st_arpu t1
  left join dim_std_organize t2 on regexp_replace(t1.corp_org_name,'分公司|公司|广电|中广有线','') = regexp_replace(t2.std_org_name,'分公司|公司|广电','')
  where t1.pt_mon=replace(update_month,'-','')
  group by t2.p_std_org_code,t2.std_org_code with rollup
  ) t
 left join dim_std_organize t1 on t.std_org_code = t1.std_org_code
 -- left join dp_lan_arpu t1 on t.std_org_code = t1.std_org_code
 --    and t1.stats_dt = substring(date_sub(concat(update_month, '-01'),interval 1 month),'1','7')
  where t.std_org_code > 0 and t.std_org_code is not null
     ;
  END
```

###### update_dp_user_online

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_user_online`(IN update_month CHAR(7))
BEGIN
  
  DELETE FROM dp_user_online WHERE stats_dt = update_month ; 

  INSERT INTO dp_user_online 
  SELECT t1.stats_dt,
         t1.std_org_code,
         t2.short_name AS area,
         t1.online_user_cnt,
         t1.paid_user_cnt,
         t1.online_rate
    FROM (
      SELECT substr(CAST(l.datemonth AS CHAR),1,7) AS  stats_dt,
             COALESCE(o.std_org_code,O.P_STD_ORG_CODE, '10') AS std_org_code,
             COALESCE(SUM(A.ONLINE_USER_COUNT),0) AS online_user_cnt,
             COALESCE(SUM(L.jiaofei),0) AS paid_user_cnt,
             COALESCE(ROUND(SUM(A.ONLINE_USER_COUNT) /NULLIF(SUM(L.jiaofei),0) * 100, 2),0) online_rate
        FROM DIM_STD_ORGANIZE O
               LEFT JOIN datasource1 L
                   ON l.name IN (o.STD_ORG_NAME,o.ANOTHER_NAME)
               AND l.datemonth >= DATE '2018-01-01'
               LEFT JOIN ST_AUTH_M A
                   ON A.OWN_CORP_STD_ORG_CODE = O.STD_ORG_CODE
               AND A.CYCLE_ID = date_format(l.datemonth,'%Y%m')
       WHERE length(o.STD_ORG_CODE) = 6 
         AND o.STD_ORG_CODE LIKE '%01'
         AND o.IS_DISPLAY = '1'
       GROUP BY substr(CAST(l.datemonth AS CHAR),1,7), O.P_STD_ORG_CODE,O.std_org_code WITH ROLLUP 
      HAVING  stats_dt IS NOT NULL
    ) t1 
           LEFT JOIN dim_std_organize t2
               ON t1.std_org_code = t2.std_org_code
   WHERE t1.stats_dt = update_month ;

END
```

###### update_dp_user_onlinerate

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_user_onlinerate`(IN update_month CHAR(7))
BEGIN

  DELETE FROM dp_user_onlinerate WHERE stats_dt = update_month ;

  INSERT INTO dp_user_onlinerate
  select update_month
        ,T.std_org_code
        ,T1.short_name as area
        ,T.online_user_cnt
        ,T.paid_user_cnt
        ,case when T.paid_user_cnt =0 then 0 else
          round(T.online_user_cnt/T.paid_user_cnt*100,2)
        end  online_rate
  from (
      select
                COALESCE(t1.own_corp_std_org_code,COALESCE(t2.p_std_org_code,'10'))  std_org_code
                ,sum(case when t1.online_user_cnt<100 then 0
                      when t1.online_user_cnt>t3.jiaofei then t3.jiaofei
                 else t1.online_user_cnt end)  online_user_cnt
                ,sum(case when t1.online_user_cnt<100 then 0 else t3.jiaofei end) paid_user_cnt
         from ST_USER_ONLINERATE_M t1
         left join dim_std_organize t2 on t1.own_corp_std_org_code = t2.std_org_code and t2.is_display='1'
         left join datasource1  t3  on t3.name IN (t2.STD_ORG_NAME,t2.ANOTHER_NAME) and t3.datemonth = concat(update_month,'-01')
      where t1.pt_mon =replace(update_month,'-','')
           and length(t1.own_corp_std_org_code) = 6
      group by t2.p_std_org_code,t1.own_corp_std_org_code with rollup
      ) T
   left join dim_std_organize T1 on T.std_org_code = T1.std_org_code
   order by T.std_org_code
   ;
END
```

###### update_flow_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_flow_stats`(IN update_month  CHAR(7))
BEGIN
    DECLARE last_month CHAR(7) DEFAULT NULL ;
    SET last_month =  substr(CAST(CAST(concat(update_month,'-01') AS date) - INTERVAL 1 MONTH  AS char),1,7) ;

    DELETE FROM FLOW_STATS WHERE STATS_DT = update_month ;

    INSERT INTO FLOW_STATS (STD_ORG_CODE,STATS_DT,SELF_PUR_FLOW,SELF_PUR_COST,PROX_SETTLE_FLOW,ORG_NAME,MIX_FLOW,INTERNAL_FLOW,EXTERNAL_FLOW)
    SELECT STD_ORG_CODE,update_month,SELF_PUR_FLOW,SELF_PUR_COST,PROX_SETTLE_FLOW,ORG_NAME,MIX_FLOW,INTERNAL_FLOW,EXTERNAL_FLOW
      FROM FLOW_STATS
     WHERE STATS_DT = last_month ;

    -- 混合流量、自购流量数据处理
    -- CALL update_mix_flows(update_month) ;
    -- CALL update_self_flows(update_month) ;

    UPDATE flow_stats T
       SET mix_flow = COALESCE((SELECT m.mix_flow FROM tmp_mix_flow m WHERE m.stats_dt = T.stats_dt  AND m.std_org_code = T.std_org_code ),mix_flow,0),
           self_pur_flow = COALESCE((SELECT s.flow FROM tmp_self_flow S WHERE S.stats_dt = T.stats_dt  AND S.std_org_code = T.std_org_code ),self_pur_flow,0)
     WHERE T.stats_dt = update_month ;

    COMMIT ;


  END
```

###### update_internal_flow_rate

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_internal_flow_rate`(IN update_month  CHAR(7),IN internal_flow_rate DECIMAL(4,2))
BEGIN
  DELETE FROM kpi_internal_flow_rate WHERE stats_dt = update_month ;

  INSERT INTO kpi_internal_flow_rate (stats_dt,std_org_code,area,internal_flow_rate) VALUES (update_month,'10','全省',internal_flow_rate)  ; 

  COMMIT;

END
```

###### update_kpi_bandwidth_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_bandwidth_user_stats`(IN update_month CHAR(7))
BEGIN 
        DELETE FROM kpi_bandwidth_user_stats WHERE stats_dt = update_month;

        INSERT INTO kpi_bandwidth_user_stats 
        SELECT * FROM kpi_bandwidth_user_stats_base WHERE stats_dt = update_month ;
        COMMIT ; 
      END
```

###### update_kpi_conv_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_conv_user_stats`(IN update_month CHAR(7))
BEGIN 
        DELETE FROM kpi_conv_user_stats WHERE stats_dt = update_month;

        INSERT INTO kpi_conv_user_stats 
        SELECT * FROM kpi_conv_user_stats_base WHERE stats_dt = update_month ;
        COMMIT ; 
      END
```

###### update_kpi_flow_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_flow_stats`(IN update_month CHAR(7))
BEGIN 
          DELETE FROM kpi_flow_stats WHERE stats_dt = update_month;

          INSERT INTO kpi_flow_stats 
          SELECT a1.stats_dt,
                 a1.std_org_code,
                 a2.short_name AS area,
                 a1.flows,
                 a1.flow_rate,
                 a1.mix_flows,
                 a1.mix_flow_rate,
                 a1.self_pur_flows,
                 a1.internal_flows,
                 a1.internal_flow_rate,
                 a1.lan_paid_user_cnt,
                 a1.flows_per_users
            FROM (
              SELECT coalesce(t2.stats_dt,t1.STATS_DT) AS stats_dt,
                     COALESCE(t3.std_org_code,t3.p_std_org_code,'10') AS std_org_code,
                     SUM(COALESCE(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW, 0.00))  AS flows, 
                     COALESCE(round(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW)/NULLIF(MAX(t4.total_flows),0) *100,2),0) AS flow_rate, 
                     COALESCE(SUM(t1.mix_flow),0) AS mix_flows, 
                     COALESCE(round(SUM(t1.mix_flow)/NULLIF(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW),0) * 100 ,2),0) AS mix_flow_rate, 
                     COALESCE(SUM(t1.self_pur_flow),0) AS self_pur_flows,                                          
                     COALESCE(SUM(t1.internal_flow),0) AS internal_flows, 
                     COALESCE(round(SUM(t1.internal_flow)/NULLIF(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW),0) * 100 ,2),0) AS internal_flow_rate, 
                     COALESCE(SUM(t2.lan_paid_user_cnt),0) AS lan_paid_user_cnt,
                     COALESCE(round(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW)/(NULLIF(SUM(t2.lan_paid_user_cnt),0) /10000) ,2),0) AS flows_per_users 
                FROM dim_std_organize t3
                       LEFT JOIN  FLOW_STATS t1        
                           ON t1.std_org_code = t3.std_org_code
                       LEFT JOIN kpi_user_dev_stats  t2    
                           ON t3.std_Org_code = t2.std_org_code
                       AND LENGTH(t2.std_org_code) = 6 
                       AND COALESCE(t1.stats_dt,t2.stats_dt) = t2.stats_dt
                       LEFT JOIN (SELECT stats_dt,SUM(INTERNAL_FLOW + EXTERNAL_FLOW + MIX_FLOW + PROX_SETTLE_FLOW + SELF_PUR_FLOW) AS total_flows FROM FLOW_STATS GROUP BY stats_dt ) t4
                           ON t1.stats_dt = t4.stats_dt
               WHERE (COALESCE(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW,0.0) > 0.0
                      OR  t3.p_std_org_code IN ('1001','1009'))    
                 AND LENGTH(t3.std_org_code) = 6
                 AND t3.is_display = '1'
                 AND COALESCE(t2.stats_dt,t1.stats_dt) = update_month 
               GROUP BY coalesce(t2.stats_dt,t1.STATS_DT),t3.p_std_org_code,t3.std_org_code WITH ROLLUP 
              HAVING coalesce(t2.stats_dt,t1.STATS_DT) IS NOT NULL 
            ) a1 
                   LEFT JOIN dim_std_organize a2 
                       ON a1.std_org_code = a2.std_org_code ;

        END
```

###### update_kpi_user_dev_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_user_dev_stats`(IN update_month CHAR(7))
BEGIN 
    DELETE FROM kpi_user_dev_stats WHERE stats_dt = update_month;

    INSERT INTO kpi_user_dev_stats 
      SELECT COALESCE(p1.stats_dt,p2.stats_dt) AS stats_dt,
             d.std_org_code,
             d.std_org_name,
             COALESCE(p1.lan_valid_user_cnt,0) AS lan_valid_user_cnt,
             COALESCE(p1.lan_paid_user_cnt,0) AS lan_paid_user_cnt,
             COALESCE(p1.paid_rate,0) AS paid_rate,
             COALESCE(p2.dtv_paid_user_cnt,0) AS dtv_paid_user_cnt,
             COALESCE(p1.new_lan_user_cnt,0) AS new_lan_user_cnt,
             COALESCE(p1.lose_lan_user_cnt,0) AS lose_lan_user_cnt,
             COALESCE(p1.lan_valid_user_cnt,0)-COALESCE(p4.last_year_user_cnts,0) as net_inc_lan_user_cnt,   
             COALESCE(p3.lan_rate,0) AS lan_user_rate
      FROM dim_std_organize d 
      LEFT JOIN 
      (  SELECT date_format(t1.datemonth,'%Y-%m') AS stats_dt,
               COALESCE(t2.std_org_code,t3.p_std_org_code,'10') AS std_org_code,
               COALESCE(SUM(t1.zaiwang),0) AS lan_valid_user_cnt,
               COALESCE(SUM(t1.jiaofei),0) AS lan_paid_user_cnt,
               COALESCE(round(SUM(t1.jiaofei)/NULLIF(SUM(t1.zaiwang),0)*100,2)) AS paid_rate, -- 缴费率
               COALESCE(SUM(t1.newnum),0) AS new_lan_user_cnt, -- 新增宽带有效用户
               COALESCE(SUM(t1.losename),0) AS lose_lan_user_cnt       
          FROM datasource1 t1
                 INNER JOIN  tmp_organize_name t2
                     ON  t1.name IN (t2.org_name,t2.another_name,t2.another_name1)
                 INNER JOIN dim_std_organize t3
                     ON t2.std_org_code = t3.std_org_code 
         WHERE  t1.datemonth >= DATE  '2018-01-01'
         GROUP BY date_format(t1.datemonth,'%Y-%m') ,t3.p_std_org_code,t2.std_org_code WITH ROLLUP 
        HAVING stats_dt IS NOT NULL 
      ) p1 
      ON d.std_org_code = p1.std_org_code 
      LEFT JOIN (
        SELECT INSERT(cycle_id,5,0,'-') AS stats_dt,
               own_corp_std_org_code AS std_org_code,
               COALESCE(SUM(dtv_paid_user_count),0) AS dtv_paid_user_cnt
          FROM st_new_user_dev_m 
         GROUP BY cycle_id,own_corp_std_org_code
      ) p2                            -- 电视缴费用户数
      ON COALESCE(p1.stats_dt,p2.stats_dt) = p2.stats_dt 
      AND d.std_org_code = p2.std_org_code
      LEFT JOIN (
            select  INSERT(substr(stats_dt,1,6),5,0,'-') AS stats_dt
                    ,lan_rate as lan_rate
                    ,std_org_code
            from TF_LAN_USER_TOTAL_DAY 
            where stats_dt = last_day(concat(replace(update_month,'-',''),'01'))
          ) p3                            -- 接入率
       ON d.std_org_code = p3.std_org_code  AND COALESCE(p1.stats_dt,p3.stats_dt) = p3.stats_dt 
      LEFT JOIN t_mubiao p4 on d.std_org_code = p4.std_org_code and p4.m_year='2019'
      WHERE COALESCE(p1.stats_dt,p2.stats_dt) = update_month ;

  END
```

###### update_lan_user_stats_rates

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_lan_user_stats_rates`(IN update_month CHAR(7))
BEGIN
  -- 修改记录
  -- 201903 swj
  -- 修改完成率  指标完成率=本年度累计净增用户数/本年度目标净增用户数
  -- 20190412 增加本年度累计净增用户数指标 = 本年度有效用户-上年度年底有效用户数
  -- 20190412 alter table lan_user_stats_rates add (net_acc_incr_usr_cnts decimal(16,0) DEFAULT 0 comment'本年度累计净增用户数')
  -- 20190702 alter table lan_user_stats_rates add(
  --     new_lan_user_cnt decimal(38,0) DEFAULT 0 COMMENT '新增宽带用户数'
  --     lose_lan_user_cnt decimal(38,0) DEFAULT 0 COMMENT '流失宽带用户数',
  -- )
  DELETE FROM lan_user_stats_rates WHERE stats_dt = update_month;
  INSERT INTO lan_user_stats_rates
  SELECT COALESCE(t2.STATS_DT,t3.stats_dt) AS stats_dt,
         t1.std_org_code AS std_org_code,
         t1.short_name AS area,
         COALESCE(t4.mubiao, 0) AS  mubiao, -- 目标
         COALESCE(t2.lan_valid_user_cnt, 0) AS  valid_user_cnt, -- 宽带有效用户数
         COALESCE(t2.lan_paid_user_cnt, 0) AS paid_user_cnt, -- 宽带缴费用户数
         COALESCE(t2.dtv_paid_user_cnt,0) AS tv_paid_user_cnt, -- 电视缴费用户数
         case when COALESCE(t2.lan_valid_user_cnt, 0)>=COALESCE(t4.mubiao, 0) and COALESCE(t4.increase_mubiao, 0)=0
             then 100
         else
         COALESCE(ROUND((COALESCE(t2.lan_valid_user_cnt, 0)-t4.last_year_user_cnts)/NULLIF(t4.increase_mubiao,0) * 100, 2),0)
         end completion_rate, -- 指标完成率
         COALESCE(t2.paid_rate,0) AS paid_rate, -- 缴费率
         COALESCE(t2.lan_user_rate, 0) AS  lan_user_rate, -- 宽带接入率
         COALESCE(t3.flows,0.0) AS flows, -- 总流量
         COALESCE(t3.flows_per_users,0.0)  AS  flows_per_users ,-- 万户带宽
         COALESCE(t2.lan_valid_user_cnt,0)-COALESCE(t4.last_year_user_cnts,0) AS net_acc_incr_usr_cnts,  -- 累计净增增用户数
         COALESCE(t2.new_lan_user_cnt,0) as new_lan_user_cnt, -- 宽带新增用户数
         COALESCE(t2.lose_lan_user_cnt,0) as lose_lan_user_cnt -- 宽带流失用户数
    FROM dim_std_organize t1
           LEFT JOIN kpi_user_dev_stats t2  -- 用户
               ON t1.std_org_code = t2.std_org_code
           AND  t2.stats_dt = update_month
           LEFT JOIN kpi_flow_stats t3     -- 流量
               ON t1.std_org_code = t3.std_org_code
           AND  t3.stats_dt = update_month
           LEFT JOIN T_MUBIAO t4 -- 目标
               ON t4.STD_ORG_CODE = T1.STD_ORG_CODE
           AND t4.M_YEAR = COALESCE(SUBSTR(T2.STATS_DT, 1, 4) ,t4.m_year)
   WHERE t1.is_display = '1' ;
  COMMIT ;
END
```

###### update_mix_flows

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_mix_flows`(IN update_month  CHAR(7))
BEGIN
  DECLARE v_month CHAR(7) DEFAULT NULL ;

  SET v_month = update_month;

  if NOT COALESCE((SELECT COUNT(1) FROM tmp_mix_flow WHERE std_org_code = '100101' AND stats_dt = v_month),0) > 0 THEN 
    INSERT INTO tmp_mix_flow (stats_dt,std_org_code,org_name,mix_flow) SELECT v_month,'100101','南京分公司',SUM(mix_flow) FROM tmp_mix_flow WHERE TRIM(org_name) LIKE '南京分公司%'  AND stats_dt = v_month AND std_org_code IS NULL  ;
  END if ;

  DELETE FROM tmp_mix_flow WHERE TRIM(org_name) LIKE '南京分公司%' AND stats_dt = v_month AND std_org_code IS NULL  ;

  UPDATE tmp_mix_flow t
     SET std_org_code = (SELECT o.std_org_code FROM tmp_organize_name o WHERE TRIM(t.org_name) IN (o.org_name,o.another_name,o.another_name1) ) 
   WHERE stats_dt = v_month;

  UPDATE tmp_mix_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE o.short_name  = TRIM(t.org_name) AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
       AND stats_dt = v_month;

  UPDATE tmp_mix_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE regexp_replace(o.short_name,'市|县|区','') = regexp_replace(TRIM(t.org_name),'市|县|区|公司','')  AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
         AND stats_dt = v_month ;

  COMMIT;

END
```

###### update_self_flows

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_self_flows`(IN update_month  CHAR(7))
BEGIN
  DECLARE v_month CHAR(7) DEFAULT NULL ;

  SET v_month = update_month;

  UPDATE tmp_self_flow t
     SET std_org_code = (SELECT o.std_org_code FROM tmp_organize_name o WHERE TRIM(t.org_name) IN (o.org_name,o.another_name,o.another_name1) ) 
   WHERE stats_dt = v_month;

  UPDATE tmp_self_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE o.short_name  = TRIM(t.org_name) AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
       AND stats_dt = v_month;

  UPDATE tmp_self_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE regexp_replace(o.short_name,'市|县|区','') = regexp_replace(TRIM(t.org_name),'市|县|区','')  AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
         AND stats_dt = v_month ;

  COMMIT;

END
```

###### update_st_operator_log

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_st_operator_log`(IN update_month char(10))
BEGIN
     DELETE FROM st_operate_log_analysis WHERE stats_dt = update_month ;
     INSERT INTO st_operate_log_analysis
     select
            date(t1.create_time) as stats_dt
           ,t2.bu_code std_org_code
           ,t1.operate_type
           ,count(t1.LOGIN_NAME)  as operate_cnt
           ,'pc' DATA_SOURCE
     from portal.ai_fw_operator_log t1
     left join portal.ai_fw_operator t2 on t1.operator_id=t2.operator_id
     where date(t1.create_time) = update_month
     group by date(t1.create_time),t2.bu_code,t1.operate_type
     union all
     select  date(create_time) as stats_dt
            ,std_org_code
            ,operate_type
            ,count(LOGIN_NAME)  as operate_cnt
            ,'app' DATA_SOURCE
     from st_ai_fw_operator_log
     where date(create_time) = update_month
     group by date(create_time),std_org_code,operate_type ;

END
```





#### 第十章 Azkaban调度

###### 10.1 azkaban信息

```
地址:https://111.208.67.21:8443/index 
账号:azkaban
密码:admin@azkaban
```



#### 第十一章 Flume配置

###### 11.1 auth日志采集

```
flume:
39243 Application -f flume.conf -n myAgent
脚本：nohup flume-ng agent  --conf /opt/cloudera/parcels/CDH-5.6.1-1.cdh5.6.1.p0.3/lib/flume-ng/conf  -f flume.conf  --classpath dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  -n myAgent  -Dflume.root.logger=INFO,console  &

java:
40987 jar --staticFlag=true --taskScheduleCron=0 20 05 * * ? --taskRunningType=schedule
脚本：nohup java -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection -XX:CMSInitiatingOccupancyFraction=60 -XX:+CMSParallelRemarkEnabled -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+CMSClassUnloadingEnabled -XX:SurvivorRatio=8 -XX:+DisableExplicitGC -verbose:gc -XX:+PrintGCDetails -XX:-OmitStackTraceInFastThrow  -Djava.security.egd=file:/dev/./urandom -jar dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  --staticFlag=true --taskScheduleCron="0 20 05 * * ?" --taskRunningType=schedule  &
```

###### 11.2 auth_online日志采集

```
flume:
41571 Application -f flume.conf -n myAgent_auth_online
脚本：nohup flume-ng agent  --conf /opt/cloudera/parcels/CDH-5.6.1-1.cdh5.6.1.p0.3/lib/flume-ng/conf  -f flume.conf  --classpath dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  -n myAgent_auth_online  -Dflume.root.logger=INFO,console  &

java:
41430 jar --config_service_url=10.1.235.193:8500 --dcnode.id=22a12f35-a972-4a6e-a710-34277242441d --staticFlag=true --taskScheduleCron=0 30 05 * * ? --taskRunningType=schedule
nohup java -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection -XX:CMSInitiatingOccupancyFraction=60 -XX:+CMSParallelRemarkEnabled -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+CMSClassUnloadingEnabled -XX:SurvivorRatio=8 -XX:+DisableExplicitGC -verbose:gc -XX:+PrintGCDetails -XX:-OmitStackTraceInFastThrow  -Djava.security.egd=file:/dev/./urandom -jar dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar --config_service_url=10.1.235.193:8500 --dcnode.id=22a12f35-a972-4a6e-a710-34277242441d  --staticFlag=true --taskScheduleCron="0 30 05 * * ?" --taskRunningType=schedule  &
```





#### 第十二章 FTP设置

```

```



#### 第十三章 Crontab设置

```

```

