insert overwrite table DIM_STD_TIMES
select * from(
select 0 std_times_code,'00:00-01:00' std_times_name,0 min_value,1 max_value,'#0#' fullpath,1 original_code,'' notes,0 is_display,1 display_order,1 is_valid,20160809 update_date from dual
union all
select 1 std_times_code,'01:00-02:00' std_times_name,1 min_value,2 max_value,'#1#' fullpath,1 original_code,'' notes,0 is_display,2 display_order,1 is_valid,20160809 update_date from dual
union all
select 2 std_times_code,'02:00-03:00' std_times_name,2 min_value,3 max_value,'#2#' fullpath,1 original_code,'' notes,0 is_display,3 display_order,1 is_valid,20160809 update_date from dual
union all
select 3 std_times_code,'03:00-04:00' std_times_name,3 min_value,4 max_value,'#3#' fullpath,1 original_code,'' notes,0 is_display,4 display_order,1 is_valid,20160809 update_date from dual
union all
select 4 std_times_code,'04:00-05:00' std_times_name,4 min_value,5 max_value,'#4#' fullpath,1 original_code,'' notes,0 is_display,5 display_order,1 is_valid,20160809 update_date from dual
union all
select 5 std_times_code,'05:00-06:00' std_times_name,5 min_value,6 max_value,'#5#' fullpath,1 original_code,'' notes,0 is_display,6 display_order,1 is_valid,20160809 update_date from dual
union all
select 6 std_times_code,'06:00-07:00' std_times_name,6 min_value,7 max_value,'#6#' fullpath,1 original_code,'' notes,0 is_display,7 display_order,1 is_valid,20160809 update_date from dual
union all
select 7 std_times_code,'07:00-08:00' std_times_name,7 min_value,8 max_value,'#7#' fullpath,1 original_code,'' notes,0 is_display,8 display_order,1 is_valid,20160809 update_date from dual
union all
select 8 std_times_code,'08:00-09:00' std_times_name,8 min_value,9 max_value,'#8#' fullpath,1 original_code,'' notes,0 is_display,9 display_order,1 is_valid,20160809 update_date from dual
union all
select 9 std_times_code,'09:00-10:00' std_times_name,9 min_value,10 max_value,'#9#' fullpath,1 original_code,'' notes,0 is_display,10 display_order,1 is_valid,20160809 update_date from dual
union all
select 10 std_times_code,'10:00-11:00' std_times_name,10 min_value,11 max_value,'#10#' fullpath,1 original_code,'' notes,0 is_display,11 display_order,1 is_valid,20160809 update_date from dual
union all
select 11 std_times_code,'11:00-12:00' std_times_name,11 min_value,12 max_value,'#11#' fullpath,1 original_code,'' notes,0 is_display,12 display_order,1 is_valid,20160809 update_date from dual
union all
select 12 std_times_code,'12:00-13:00' std_times_name,12 min_value,13 max_value,'#12#' fullpath,1 original_code,'' notes,0 is_display,13 display_order,1 is_valid,20160809 update_date from dual
union all
select 13 std_times_code,'13:00-14:00' std_times_name,13 min_value,14 max_value,'#13#' fullpath,1 original_code,'' notes,0 is_display,14 display_order,1 is_valid,20160809 update_date from dual
union all
select 14 std_times_code,'14:00-15:00' std_times_name,14 min_value,15 max_value,'#14#' fullpath,1 original_code,'' notes,0 is_display,15 display_order,1 is_valid,20160809 update_date from dual
union all
select 15 std_times_code,'15:00-16:00' std_times_name,15 min_value,16 max_value,'#15#' fullpath,1 original_code,'' notes,0 is_display,16 display_order,1 is_valid,20160809 update_date from dual
union all
select 16 std_times_code,'16:00-17:00' std_times_name,16 min_value,17 max_value,'#16#' fullpath,1 original_code,'' notes,0 is_display,17 display_order,1 is_valid,20160809 update_date from dual
union all
select 17 std_times_code,'17:00-18:00' std_times_name,17 min_value,18 max_value,'#17#' fullpath,1 original_code,'' notes,0 is_display,18 display_order,1 is_valid,20160809 update_date from dual
union all
select 18 std_times_code,'18:00-19:00' std_times_name,18 min_value,19 max_value,'#18#' fullpath,1 original_code,'' notes,0 is_display,19 display_order,1 is_valid,20160809 update_date from dual
union all
select 19 std_times_code,'19:00-20:00' std_times_name,19 min_value,20 max_value,'#19#' fullpath,1 original_code,'' notes,0 is_display,20 display_order,1 is_valid,20160809 update_date from dual
union all
select 20 std_times_code,'20:00-21:00' std_times_name,20 min_value,21 max_value,'#20#' fullpath,1 original_code,'' notes,0 is_display,21 display_order,1 is_valid,20160809 update_date from dual
union all
select 21 std_times_code,'21:00-22:00' std_times_name,21 min_value,22 max_value,'#21#' fullpath,1 original_code,'' notes,0 is_display,22 display_order,1 is_valid,20160809 update_date from dual
union all
select 22 std_times_code,'22:00-23:00' std_times_name,22 min_value,23 max_value,'#22#' fullpath,1 original_code,'' notes,0 is_display,23 display_order,1 is_valid,20160809 update_date from dual
union all
select 23 std_times_code,'23:00-24:00' std_times_name,23 min_value,24 max_value,'#23#' fullpath,1 original_code,'' notes,0 is_display,24 display_order,1 is_valid,20160809 update_date from dual
union all
select 24 std_times_code,'06:00-18:00' std_times_name,6 min_value,18 max_value,'#24#' fullpath,1 original_code,'' notes,0 is_display,25 display_order,1 is_valid,20160809 update_date from dual
union all
select 25 std_times_code,'06:00-24:00' std_times_name,6 min_value,24 max_value,'#25#' fullpath,1 original_code,'' notes,0 is_display,26 display_order,1 is_valid,20160809 update_date from dual
union all
select 26 std_times_code,'17:00-22:00' std_times_name,17 min_value,22 max_value,'#26#' fullpath,1 original_code,'' notes,0 is_display,27 display_order,1 is_valid,20160809 update_date from dual
union all
select 27 std_times_code,'17:00-23:00' std_times_name,17 min_value,23 max_value,'#27#' fullpath,1 original_code,'' notes,0 is_display,28 display_order,1 is_valid,20160809 update_date from dual
union all
select 28 std_times_code,'17:00-24:00' std_times_name,17 min_value,24 max_value,'#28#' fullpath,1 original_code,'' notes,0 is_display,29 display_order,1 is_valid,20160809 update_date from dual
union all
select 29 std_times_code,'17:30-22:00' std_times_name,17.5 min_value,22 max_value,'#29#' fullpath,1 original_code,'' notes,0 is_display,30 display_order,1 is_valid,20160809 update_date from dual
union all
select 30 std_times_code,'17:30-23:00' std_times_name,17.5 min_value,23 max_value,'#30#' fullpath,1 original_code,'' notes,0 is_display,31 display_order,1 is_valid,20160809 update_date from dual
union all
select 31 std_times_code,'17:30-24:00' std_times_name,17.5 min_value,24 max_value,'#31#' fullpath,1 original_code,'' notes,0 is_display,32 display_order,1 is_valid,20160809 update_date from dual
union all
select 32 std_times_code,'18:00-22:00' std_times_name,18 min_value,22 max_value,'#32#' fullpath,1 original_code,'' notes,0 is_display,33 display_order,1 is_valid,20160809 update_date from dual
union all
select 33 std_times_code,'18:00-23:00' std_times_name,18 min_value,23 max_value,'#33#' fullpath,1 original_code,'' notes,0 is_display,34 display_order,1 is_valid,20160809 update_date from dual
union all
select 34 std_times_code,'18:00-24:00' std_times_name,18 min_value,24 max_value,'#34#' fullpath,1 original_code,'' notes,0 is_display,35 display_order,1 is_valid,20160809 update_date from dual
union all
select 35 std_times_code,'19:00-22:00' std_times_name,19 min_value,22 max_value,'#35#' fullpath,1 original_code,'' notes,0 is_display,36 display_order,1 is_valid,20160809 update_date from dual
union all
select 36 std_times_code,'19:00-23:00' std_times_name,19 min_value,23 max_value,'#36#' fullpath,1 original_code,'' notes,0 is_display,37 display_order,1 is_valid,20160809 update_date from dual
union all
select 37 std_times_code,'19:00-24:00' std_times_name,19 min_value,24 max_value,'#37#' fullpath,1 original_code,'' notes,0 is_display,38 display_order,1 is_valid,20160809 update_date from dual
)t;