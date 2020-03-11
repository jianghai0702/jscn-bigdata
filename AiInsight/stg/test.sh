#!/usr/bin/env bash
#获取统计周期
#账户状态码的意义
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=$(date +%Y%m%d); }
echo $(date -d "$v_cycle -1 day " +%Y%m%d)


