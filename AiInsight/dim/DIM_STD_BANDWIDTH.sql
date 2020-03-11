insert overwrite table dim_std_bandwidth
select * from(
select 0 std_bandwidth_code,'所有' std_bandwidth_name,-1 p_std_bandwidth_code,'#0#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1 std_bandwidth_code,'4M' std_bandwidth_name,0 p_std_bandwidth_code,'#0#1#' fullpath,'' original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160803 update_date from dual 
union all
select 2 std_bandwidth_code,'8M' std_bandwidth_name,0 p_std_bandwidth_code,'#0#2#' fullpath,'' original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160803 update_date from dual    
union all
select 3 std_bandwidth_code,'12M' std_bandwidth_name,0 p_std_bandwidth_code,'#0#3#' fullpath,'' original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160803 update_date from dual 
union all
select 4 std_bandwidth_code,'20M' std_bandwidth_name,0 p_std_bandwidth_code,'#0#4#' fullpath,'' original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160803 update_date from dual
union all
select 99 std_bandwidth_code,'其他' std_bandwidth_name,0 p_std_bandwidth_code,'#0#99#' fullpath,'' original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160803 update_date from dual
)t;
