#!/bin/bash
#
####################################
# 功能：数据采集 - 采集auth日志 -
# 编辑者: jianghai
# 创建时间：2020-02-16
# 描述:1.用于采集一个时间段的日志， 2.需要传参数1.startT:20200202  2.endT:20200231
####################################
#
# 需要处理
# -rw-r--r-- 1 root root  380199124 3月  16 10:42 AUTH_CHANGZHOU20200315.CSV d
# -rw-r--r-- 1 root root  510898682 3月  16 10:42 AUTH_HUAIAN20200315.CSV d
# -rw-r--r-- 1 root root          0 3月  16 10:42 AUTH_LIANYUNGANG20200315.CSV d
# -rw-r--r-- 1 root root        139 3月  16 10:42 AUTH_NANJING20200315.CSV d
# -rw-r--r-- 1 root root  254865674 3月  16 10:42 AUTH_NANTONG20200315.CSV d

# -rw-r--r-- 1 root root  164173911 3月  16 10:42 AUTH_SUQIAN20200315.CSV d
# -rw-r--r-- 1 root root        139 3月  16 10:42 AUTH_SUZHOU20200315.CSV d
# -rw-r--r-- 1 root root 2183453195 3月  16 10:42 AUTH_TAIZHOU20200315.CSV d
# -rw-r--r-- 1 root root  740723783 3月  16 10:42 AUTH_WUXI20200315.CSV
# -rw-r--r-- 1 root root  453951837 3月  16 10:42 AUTH_XUZHOU20200315.CSV d

# -rw-r--r-- 1 root root  533706483 3月  16 10:42 AUTH_YANCHENG20200315.CSV
# -rw-r--r-- 1 root root  185883222 3月  16 10:42 AUTH_YANGZHOU20200315.CSV
# -rw-r--r-- 1 root root 1066863835 3月  16 10:42 AUTH_ZHENJIANG20200315.CSV
#
# 示例数据：
# 41409681794,0385379,<CHAP-Password>,2020-02-21 23:59:35,018,User not any subscription,6C-2C-DC-C8-EF-7A,,412,
#41409681847,0460512,<CHAP-Password>,2020-02-21 23:59:35,018,User not any subscription,94-28-2E-AA-F6-89,,412,
#41409681852,0451205,<CHAP-Password>,2020-02-21 23:59:34,018,User not any subscription,74-FF-4C-9D-64-7D,,412,
#41409687024,0460179,<CHAP-Password>,2020-02-21 23:59:42,006,Search Err or User not exists,0C-4B-54-2E-93-4A,,412,
#
#
# 处理后数据：
#
# 42423543789^13801505752^<CHAP-Password>^2020-03-12 00:25:46^006^Search Err or User not exists^8C-A6-DF-67-AE-D6^^404^^changzhou^AUTH
# 42423543807^2:3u2bXwPbkJS^<CHAP-Password>^2020-03-12 00:25:47^006^Search Err or User not exists^cc:2d:21:17:8f:10^^404^^changzhou^AUTH
# 42423549008^GDF8519020442634^<CHAP-Password>^2020-03-12 00:25:54^018^User not any subscription^0C-D8-6C-43-93-7F^^404^^changzhou^AUTH
# 42423549076^GDF8519020249359^<CHAP-Password>^2020-03-12 00:25:54^018^User not any subscription^C0-61-18-07-24-F1^^404^^changzhou^AUTH
#########################
# 时间设置
#########################
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { arg1=$1; }
( echo $2 | grep "\<[0-9]\{8\}\>" -q ) && { arg2=$2; }

if [ ! $arg1 ]; then
    echo "参数错误：请传入startT，endT"
    exit 0;
fi

if [ ! $arg2 ]; then
    echo "参数错误：请传入startT，endT"
    exit 0;
fi

# startT
dt1=
ct1=$arg1
nt1=
dt1=`date -d "$ct1 -1 day " +%Y%m%d`
ct1=`date -d "$ct1 +0 day " +%Y%m%d`
nt1=`date -d "$ct1 +1 day " +%Y%m%d`

# endT
dt2=
ct2=$arg2
nt2=
dt2=`date -d "$ct2 -1 day " +%Y%m%d`
ct2=`date -d "$ct2 +0 day " +%Y%m%d`
nt2=`date -d "$ct2 +1 day " +%Y%m%d`



# sh collection_auth_log_fix.sh 20200202 20200206



#计算时间差
dt1_dash=`date -d "$ct1 -1 day " +%Y-%m-%d`
dt2_dash=`date -d "$ct2 -1 day " +%Y-%m-%d`
timeoff=$(($(date +%s -d "$dt2_dash 00:00:00") - $(date +%s -d "$dt1_dash 00:00:00")))
dayOff=$(($timeoff/60/60/24))







content_add_arr=(
	"^changzhou^AUTH"
	"^huaian^AUTH"
	"^lianyungang^AUTH"
	"^nanjing^AUTH"
	"^nantong^AUTH"

	"^suqian^AUTH"
	"^suzhou^AUTH"
	"^taizhou^AUTH"
	"^wuxi^AUTH"
	"^xuzhou^AUTH"

	"^yancheng^AUTH"
	"^yangzhou^AUTH"
	"^zhenjiang^AUTH"
)

filename_arr=(
	"AUTH_CHANGZHOU"
	"AUTH_HUAIAN"
	"AUTH_LIANYUNGANG"
	"AUTH_NANJING"
	"AUTH_NANTONG"

	"AUTH_SUQIAN"
	"AUTH_SUZHOU"
	"AUTH_TAIZHOU"
	"AUTH_WUXI"
	"AUTH_XUZHOU"

	"AUTH_YANCHENG"
	"AUTH_YANGZHOU"
	"AUTH_ZHENJIANG"
)



for((i=0;i<=$dayOff;i++));do
	dt_tmp=`date -d "$dt1 +$i day " +%Y%m%d`
	filedate=${dt_tmp}
	echo "程序正在采集${filedate}的auth日志,进度$(($i+1))/$(($dayOff+1))天"

	#21号机
	auth_log_dir_21=/home/ftpuser/auth
	auth_log_dir_pstm_21=/opt/data/auth/stg_brd_auth_log/${filedate}
	rm -rf ${auth_log_dir_pstm_21}
	mkdir -p ${auth_log_dir_pstm_21}

	#22号机
	server_22=root@111.208.67.22
	auth_log_dir_pstm_22=/opt/data/auth/stg_brd_auth_log/${filedate}
	ssh ${server_22}  rm -rf ${auth_log_dir_pstm_22}
	ssh ${server_22}  mkdir -p ${auth_log_dir_pstm_22}


	# 日志轮询
	for (( j=0; j<${#filename_arr[*]}; j++ )); do
		content_add=${content_add_arr[j]}
		filename=${filename_arr[j]}
		file_src="${auth_log_dir_21}/${filename}${filedate}.CSV"
		auth_log_pstm_21="${auth_log_dir_pstm_21}/${filename}${filedate}.log"
		#awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${auth_log_pstm_21}
		#scp ${auth_log_pstm_21} ${server_22}:${auth_log_dir_pstm_22}
		#echo "$i    $j"
	done

done
