CREATE TABLE IF NOT EXISTS DIM_STD_CHANNEL_RULE  (
   CHANNEL_NAME        STRING,
   STD_CHANNEL_NAME    STRING,
   IS_VALID            STRING,
   UPDATE_DATE         STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_channel_rule';

insert overwrite table dim_std_channel_rule
select * from (
select 'CCTV-1' channel_name,'CCTV1 综合' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央一套' channel_name,'CCTV1 综合' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-2' channel_name,'CCTV2 财经' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央二套'	channel_name,'CCTV2 财经' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-3' channel_name,'CCTV3 综艺' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央三套' channel_name,'CCTV3 综艺' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-4' channel_name,'CCTV4 中文国际' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央四套' channel_name,'CCTV4 中文国际' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-5' channel_name,'CCTV5 体育' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央五套' channel_name,'CCTV5 体育' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV5+' channel_name,'CCTV 体育赛事' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-6' channel_name,'CCTV6 电影' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央六套' channel_name,'CCTV6 电影' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-7' channel_name,'CCTV7 军事农业' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央七套' channel_name,'CCTV7 军事农业' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-8' channel_name,'CCTV8 电视剧' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央八套' channel_name,'CCTV8 电视剧' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-9纪录' channel_name,'CCTV9 纪录' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央九套' channel_name,'CCTV9 纪录' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-10' channel_name,'CCTV10 科教' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十套' channel_name,'CCTV10 科教' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-11' channel_name,'CCTV11 戏曲' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十一套' channel_name,'CCTV11 戏曲' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-12' channel_name,'CCTV12 社会与法' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十二套' channel_name,'CCTV12 社会与法' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-NEWS' channel_name,'CCTV13 新闻' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-新闻' channel_name,'CCTV13 新闻' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央新闻' channel_name,'CCTV13 新闻' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-13' channel_name,'CCTV13 新闻' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十三套' channel_name,'CCTV13 新闻' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-14' channel_name,'CCTV14 少儿' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央少儿' channel_name,'CCTV14 少儿' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十四套' channel_name,'CCTV14 少儿' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-15' channel_name,'CCTV15 音乐' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央音乐' channel_name,'CCTV15 音乐' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select '中央十五套' channel_name,'CCTV15 音乐' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-1高清' channel_name,'CCTV1 综合高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-1(高清' channel_name,'CCTV1 综合高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-1(高清)' channel_name,'CCTV1 综合高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-2高清' channel_name,'CCTV2 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-3高清' channel_name,'CCTV3 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-4高清' channel_name,'CCTV4 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-5高清' channel_name,'CCTV5 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-6高清' channel_name,'CCTV6 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-7高清' channel_name,'CCTV7 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-8高清' channel_name,'CCTV8 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-9高清' channel_name,'CCTV9 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-10高清' channel_name,'CCTV10 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-11高清' channel_name,'CCTV11 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-12高清' channel_name,'CCTV12 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-13高清' channel_name,'CCTV13 高清' std_channel_name,1 is_valid,20161018 update_date from dual
union all
select 'CCTV-14高清' channel_name,'CCTV14 高清' std_channel_name,1 is_valid,20161018 update_date from dual
) t;
