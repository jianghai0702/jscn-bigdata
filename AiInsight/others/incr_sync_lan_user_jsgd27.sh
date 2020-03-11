#!/bin/bash
# 经分宽带用户发展表，更新每天宽带用户统计
kettle_dir="/opt/data-integration"
trans_dir="${kettle_dir}/My-work/transformations"

#获取脚本所在路径
# DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# 执行kettle脚本，同步表
sh "${kettle_dir}/pan.sh" -file "${trans_dir}/incr_sync_lan_user_jsgd27.ktr" -norep
