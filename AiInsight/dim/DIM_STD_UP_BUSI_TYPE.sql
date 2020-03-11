insert overwrite table DIM_STD_UP_BUSI_TYPE
select * from(
select 10 std_up_busi_type_code,'所有' std_up_busi_type_name,-1 p_std_up_busi_type_code,'#10#' fullpath,'' original_code,'' notes,1 is_display,1 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1001 std_up_busi_type_code,'模拟基本业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1001#' fullpath,1001 original_code,'' notes,1 is_display,2 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1002 std_up_busi_type_code,'数字基本业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1002#' fullpath,1002 original_code,'' notes,1 is_display,3 display_order,1 is_valid,20160803 update_date from dual    
union all
select 1003 std_up_busi_type_code,'互动基本业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1003#' fullpath,1003 original_code,'' notes,1 is_display,4 display_order,1 is_valid,20160803 update_date from dual 
union all
select 1004 std_up_busi_type_code,'宽带业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1004#' fullpath,1004 original_code,'' notes,1 is_display,5 display_order,1 is_valid,20160803 update_date from dual
union all   
select 1005 std_up_busi_type_code,'付费节目业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1005#' fullpath,1005 original_code,'' notes,1 is_display,6 display_order,1 is_valid,20160803 update_date from dual
union all   
select 1006 std_up_busi_type_code,'互动点播业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1006#' fullpath,1006 original_code,'' notes,1 is_display,7 display_order,1 is_valid,20160803 update_date from dual
union all   
select 1007 std_up_busi_type_code,'语音业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1007#' fullpath,1007 original_code,'' notes,1 is_display,8 display_order,1 is_valid,20160803 update_date from dual
union all   
select 1008 std_up_busi_type_code,'增值业务' std_up_busi_type_name,10 p_std_up_busi_type_code,'#10#1008#' fullpath,1008 original_code,'' notes,1 is_display,9 display_order,1 is_valid,20160803 update_date from dual
)t;
