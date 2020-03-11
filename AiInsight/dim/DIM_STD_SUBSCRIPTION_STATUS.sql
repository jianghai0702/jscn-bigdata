insert overwrite table DIM_STD_SUBSCRIPTION_STATUS
select * from(
select 0 std_subscription_status_code,'所有' std_subscription_status_name,-1 p_std_subscription_status_code,'#0#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1 std_subscription_status_code,'有效' std_subscription_status_name,0 p_std_subscription_status_code,'#0#1#' fullpath,'' original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160803 update_date from dual 
union all
select 2 std_subscription_status_code,'开通' std_subscription_status_name,1 p_std_subscription_status_code,'#0#1#2#' fullpath,'' original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160803 update_date from dual    
union all
select 3 std_subscription_status_code,'暂停' std_subscription_status_name,1 p_std_subscription_status_code,'#0#1#3#' fullpath,'' original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160803 update_date from dual 
union all
select 4 std_subscription_status_code,'欠费停机' std_subscription_status_name,1 p_std_subscription_status_code,'#0#1#4#' fullpath,'' original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160803 update_date from dual
union all   
select 5 std_subscription_status_code,'移机' std_subscription_status_name,1 p_std_subscription_status_code,'#0#1#5#' fullpath,'' original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160803 update_date from dual
union all   
select 6 std_subscription_status_code,'管理停机' std_subscription_status_name,1 p_std_subscription_status_code,'#0#1#6#' fullpath,'' original_code,'' notes,1 is_display,7 display_order,1 is_valid,20160803 update_date from dual
union all   
select 7 std_subscription_status_code,'预开通' std_subscription_status_name,0 p_std_subscription_status_code,'#0#7#' fullpath,'' original_code,'' notes,1 is_display,8 display_order,1 is_valid,20160803 update_date from dual
union all   
select 8 std_subscription_status_code,'销户' std_subscription_status_name,0 p_std_subscription_status_code,'#0#8#' fullpath,'' original_code,'' notes,1 is_display,9 display_order,1 is_valid,20160803 update_date from dual
)t;
