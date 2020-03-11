CREATE TABLE IF NOT EXISTS DIM_STD_INTRANET_IP  (
   START_IP        STRING,
   END_IP          STRING,
   START_IP_NUM    BIGINT,
   END_IP_NUM      BIGINT,
   IS_VALID        STRING,
   UPDATE_DATE     STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_intranet_ip';

insert overwrite table dim_std_intranet_ip
select * from (
select '111.208.17.224' start_ip,'111.208.17.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.22.224' start_ip,'111.208.22.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.25.224' start_ip,'111.208.25.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.11.224'	start_ip,'111.208.11.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.4.224'  start_ip,'111.208.4.255'  end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.27.224' start_ip,'111.208.27.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.6.224'  start_ip,'111.208.6.255'  end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.20.224' start_ip,'111.208.20.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.15.224' start_ip,'111.208.15.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '49.153.191.0'   start_ip,'49.153.191.15'  end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.6.160'  start_ip,'111.208.6.191'  end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.13.224' start_ip,'111.208.13.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.73.0'   start_ip,'111.208.73.63'  end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.73.192' start_ip,'111.208.73.223' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.73.160' start_ip,'111.208.73.191' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
union all
select '111.208.73.224' start_ip,'111.208.73.255' end_ip,'' start_ip_num,'' end_ip_num,1 is_valid,20160929 update_date from dual
) t;

insert overwrite table dim_std_intranet_ip           
select
  t1.start_ip,
  t1.end_ip,
  split(t1.start_ip,'\\.')[0]*256*256*256+split(t1.start_ip,'\\.')[1]*256*256+split(t1.start_ip,'\\.')[2]*256+split(t1.start_ip,'\\.')[3] start_ip_num,
  split(t1.end_ip,'\\.')[0]*256*256*256+split(t1.end_ip,'\\.')[1]*256*256+split(t1.end_ip,'\\.')[2]*256+split(t1.end_ip,'\\.')[3] end_ip_num,
  t1.is_valid,
  from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') update_date       
from dim_std_intranet_ip t1;