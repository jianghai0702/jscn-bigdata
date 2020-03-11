insert overwrite table DIM_STD_CUST_CHANNEL
select * from(
select 0 std_cust_channel_code,'所有' std_cust_channel_name,-1 p_std_cust_channel_code,'#0#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1 std_cust_channel_code,'营业厅' std_cust_channel_name,0 p_std_cust_channel_code,'#0#1#' fullpath,'' original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160803 update_date from dual 
union all
select 2 std_cust_channel_code,'网厅' std_cust_channel_name,0 p_std_cust_channel_code,'#0#2#' fullpath,'' original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160803 update_date from dual    
union all
select 3 std_cust_channel_code,'淘宝' std_cust_channel_name,0 p_std_cust_channel_code,'#0#3#' fullpath,'' original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160803 update_date from dual 
union all
select 4 std_cust_channel_code,'微信' std_cust_channel_name,0 p_std_cust_channel_code,'#0#4#' fullpath,'' original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160803 update_date from dual
union all   
select 99 std_cust_channel_code,'其他' std_cust_channel_name,0 p_std_cust_channel_code,'#0#99#' fullpath,'' original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160803 update_date from dual
)t;