insert overwrite table DIM_STD_ONLINE_LENGTH
select * from(
select 1 std_online_length_code,'0小时' std_online_length_name,0 min_value,0 max_value,'#1#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160818 update_date from dual
union all
select 2 std_online_length_code,'0~3小时' std_online_length_name,0 min_value,3 max_value,'#2#' fullpath,'' original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160818 update_date from dual
union all
select 3 std_online_length_code,'3~5小时' std_online_length_name,3 min_value,5 max_value,'#3#' fullpath,'' original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160818 update_date from dual
union all
select 4 std_online_length_code,'5~8小时' std_online_length_name,5 min_value,8 max_value,'#4#' fullpath,'' original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160818 update_date from dual
union all
select 5 std_online_length_code,'8~10小时' std_online_length_name,8 min_value,10 max_value,'#5#' fullpath,'' original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160818 update_date from dual
union all
select 6 std_online_length_code,'10小时以上' std_online_length_name,10 min_value,24 max_value,'#6#' fullpath,'' original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160818 update_date from dual
)t;
