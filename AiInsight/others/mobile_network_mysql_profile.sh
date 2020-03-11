#!/bin/bash
#
#######################################################
#脚本开始
##########################################g#############
# stdout vs stderr

err() {
  echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]:[ERROR]: $@" >&2
}

log() {
  echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]:[INFO]:$@" >&1
}

log "网络状况"
log "------------------------------------------------------------"
ping -c 10 bigdata.jscndata.com 


log "------------------------------------------------------------"
log "mysql运行状况"
log "------------------------------------------------------------"
/usr/bin/mysql -h bigdata.jscndata.com -P 4289 -u st -pst -D st  <<EOF
status ;

select "------------------------------------------------------------" ;
show global status ;
select "------------------------------------------------------------" ;
show full processlist ;

select current_timestamp;
--  第一屏数据
--  宽带用户发展趋势
 select cast(substr(stats_dt,-2) AS decimal)  statsDt,
        round(user_cnt/10000,2) userCnt,                 -- 用户发展总数（万人）
        round(new_user_cnt/10000,2) newUserCnt,            -- 新增用户数
        round(lose_user_cnt/10000,2)  loseUserCnt          -- 流失用户数
 from   user_dev_trend
 where  area_name = '全省'       -- 各地市数据带入地市名称 
  and  stats_dt between substr('2018-11',1,4) and '2018-11'
 order by stats_dt ASC ; 

select current_timestamp;
--  --   宽带用户地区分布
--  --  --   有效用户数
 select  area,                   -- 地市名称
         valid_user_cnt  userCnt       -- 有效用户数
 from LAN_USER_STATS_RATES t 
 left join dim_std_organize o 
 on t.std_org_code = o.std_org_code 
 left join dim_std_organize p
 on o.p_std_org_code = p.std_org_code 
 where t.stats_dt = '2018-11' 
 and case when p.std_org_code = '10' then '全省' else trim(TRAILING '地区' FROM p.std_org_name) end  = '全省'
 order by valid_user_cnt DESC  ;

select current_timestamp;
--  移动端arpu
--  arpu走势图
--  单宽带
SELECT CAST(SUBSTR(stats_dt,-2) AS decimal) statsDt,
       lan_arpu lanArpu
  FROM dp_lan_arpu 
 WHERE std_org_code = '10'
 ORDER BY stats_dt ASC  ;

select current_timestamp;

--  地区对比
--  单宽带
SELECT t.area,
       t.lan_arpu lanArpu
  FROM dp_lan_arpu t
 left join dim_std_organize o 
 on t.std_org_code = o.std_org_code 
 left join dim_std_organize p
 on o.p_std_org_code = p.std_org_code 
 WHERE stats_dt = '2018-11'
   AND p.std_org_code = '10'
 ORDER BY lan_arpu DESC ;
               
select current_timestamp;

EOF


exit;
#EOF


