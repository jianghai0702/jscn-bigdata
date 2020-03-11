insert overwrite table dim_std_prod_cycle
select * from(
select 0 std_prod_cycle_code,'所有' std_prod_cycle_name,-1 p_std_prod_cycle_code,'#0#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1 std_prod_cycle_code,'1个月' std_prod_cycle_name,0 p_std_prod_cycle_code,'#0#1#' fullpath,'' original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160803 update_date from dual 
union all
select 2 std_prod_cycle_code,'3个月' std_prod_cycle_name,0 p_std_prod_cycle_code,'#0#2#' fullpath,'' original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160803 update_date from dual    
union all
select 3 std_prod_cycle_code,'12个月' std_prod_cycle_name,0 p_std_prod_cycle_code,'#0#3#' fullpath,'' original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160803 update_date from dual 
union all
select 4 std_prod_cycle_code,'24个月' std_prod_cycle_name,0 p_std_prod_cycle_code,'#0#4#' fullpath,'' original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160803 update_date from dual
union all
select 99 std_prod_cycle_code,'其他' std_prod_cycle_name,0 p_std_prod_cycle_code,'#0#99#' fullpath,'' original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160803 update_date from dual
)t;
