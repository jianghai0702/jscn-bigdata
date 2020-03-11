insert overwrite table DIM_STD_DEVICE_CATE
select * from(
select 0 std_device_cate_code,'Ыљга' std_device_cate_name,-1 p_std_device_cate_code,'#0#' fullpath,1 original_code,'' notes,0 is_display,1 display_order,1 is_valid,20160809 update_date from dual
union all
select 1 std_device_cate_code,'pc' std_device_cate_name,-1 p_std_device_cate_code,'#1#' fullpath,1 original_code,'' notes,0 is_display,2 display_order,1 is_valid,20160809 update_date from dual
union all
select 2 std_device_cate_code,'mobile' std_device_cate_name,-1 p_std_device_cate_code,'#2#' fullpath,1 original_code,'' notes,0 is_display,3 display_order,1 is_valid,20160809 update_date from dual
union all
select 3 std_device_cate_code,'pad' std_device_cate_name,-1 p_std_device_cate_code,'#3#' fullpath,1 original_code,'' notes,0 is_display,4 display_order,1 is_valid,20160809 update_date from dual
)t;
