insert overwrite table DIM_STD_AUTH_MODE
select * from(
select 0 std_auth_mode_code,'Ыљга' std_auth_mode_name,-1 p_std_auth_mode_code,'#0#' fullpath,1 original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160811 update_date from dual
union all
select 1 std_auth_mode_code,'pppoe' std_auth_mode_name,-1 p_std_auth_mode_code,'#1#' fullpath,1 original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160811 update_date from dual
union all
select 2 std_auth_mode_code,'web' std_auth_mode_name,-1 p_std_auth_mode_code,'#2#' fullpath,1 original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160811 update_date from dual
)t;
