#!/bin/bash
# 从jsgd27同步大屏数据到移动端数据库。
kettle_dir="/opt/data-integration"
trans_dir="${kettle_dir}/My-work/jobs"

#获取脚本所在路径
# DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# 执行kettle脚本，同步表
sh "${kettle_dir}/kitchen.sh" -file "${trans_dir}/Jsgd2mobile.kjb" -norep
