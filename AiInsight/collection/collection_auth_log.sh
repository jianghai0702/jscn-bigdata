#!/bin/bash
#
####################################
# 数据采集 - 采集auth日志
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
dt=
ct=
nt=
if [ ! $arg1 ]; then
    ct=`cat /AiInsight/config/pyparameter`
else
    ct=$arg1
fi
dt=`date -d "$ct -1 day " +%Y%m%d`
ct=`date -d "$ct +0 day " +%Y%m%d`
nt=`date -d "$ct +1 day " +%Y%m%d`
echo "dt=${dt}"
echo "ct=${ct}"
echo "nt=${nt}"






filedate=${dt}
#远程22号机
dir_src=/home/ftpuser/auth
dir_prestament_21=/home/ftpuser/auth_pretreatment/${filedate}
dir_prestament_22=root@111.208.67.22:/home/ftpuser/auth_pretreatment/${filedate}
#删除再创建预处理文件目录
rm -rf /home/ftpuser/auth_pretreatment/${filedate}
mkdir -p /home/ftpuser/auth_pretreatment/${filedate}
#删除再创建远程22号机预处理文件目录
ssh root@111.208.67.22  rm -rf /home/ftpuser/auth_pretreatment/${filedate}
ssh root@111.208.67.22  mkdir -p /home/ftpuser/auth_pretreatment/${filedate}




# -rw-r--r-- 1 root root  380199124 3月  16 10:42 AUTH_CHANGZHOU 20200315.CSV
# -rw-r--r-- 1 root root  510898682 3月  16 10:42 AUTH_HUAIAN 20200315.CSV
# -rw-r--r-- 1 root root          0 3月  16 10:42 AUTH_LIANYUNGANG 20200315.CSV
# -rw-r--r-- 1 root root        139 3月  16 10:42 AUTH_NANJING 20200315.CSV
# -rw-r--r-- 1 root root  254865674 3月  16 10:42 AUTH_NANTONG 20200315.CSV

#AUTH_CHANGZHOU
content_add="^changzhou^AUTH"
file_src="${dir_src}/AUTH_CHANGZHOU${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_CHANGZHOU${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_HUAIAN
content_add="^huaian^AUTH"
file_src="${dir_src}/AUTH_HUAIAN${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_HUAIAN${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_LIANYUNGANG
content_add="^lianyungang^AUTH"
file_src="${dir_src}/AUTH_LIANYUNGANG${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_LIANYUNGANG${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_NANJING
content_add="^nanjing^AUTH"
file_src="${dir_src}/AUTH_NANJING${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_NANJING${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_NANTONG
content_add="^nantong^AUTH"
file_src="${dir_src}/AUTH_NANTONG${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_NANTONG${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}




# -rw-r--r-- 1 root root  164173911 3月  16 10:42 AUTH_SUQIAN 20200315.CSV
# -rw-r--r-- 1 root root        139 3月  16 10:42 AUTH_SUZHOU 20200315.CSV
# -rw-r--r-- 1 root root 2183453195 3月  16 10:42 AUTH_TAIZHOU 20200315.CSV
# -rw-r--r-- 1 root root  740723783 3月  16 10:42 AUTH_WUXI 20200315.CSV
# -rw-r--r-- 1 root root  453951837 3月  16 10:42 AUTH_XUZHOU 20200315.CSV

#AUTH_SUQIAN
content_add="^suqian^AUTH"
file_src="${dir_src}/AUTH_SUQIAN${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_SUQIAN${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_SUZHOU
content_add="^suzhou^AUTH"
file_src="${dir_src}/AUTH_SUZHOU${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_SUZHOU${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_TAIZHOU
content_add="^taizhou^AUTH"
file_src="${dir_src}/AUTH_TAIZHOU${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_TAIZHOU${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_WUXI
content_add="^wuxi^AUTH"
file_src="${dir_src}/AUTH_WUXI${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_WUXI${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_XUZHOU
content_add="^xuzhou^AUTH"
file_src="${dir_src}/AUTH_XUZHOU${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_XUZHOU${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}





# # -rw-r--r-- 1 root root  533706483 3月  16 10:42 AUTH_YANCHENG 20200315.CSV
# # -rw-r--r-- 1 root root  185883222 3月  16 10:42 AUTH_YANGZHOU 20200315.CSV
# # -rw-r--r-- 1 root root 1066863835 3月  16 10:42 AUTH_ZHENJIANG 20200315.CSV

#AUTH_YANCHENG
content_add="^yancheng^AUTH"
file_src="${dir_src}/AUTH_YANCHENG${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_YANCHENG${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_YANGZHOU
content_add="^yangzhou^AUTH"
file_src="${dir_src}/AUTH_YANGZHOU${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_YANGZHOU${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}


#AUTH_ZHENJIANG
content_add="^zhenjiang^AUTH"
file_src="${dir_src}/AUTH_ZHENJIANG${dt}.CSV"
file_prestament_21="${dir_prestament_21}/AUTH_ZHENJIANG${dt}.log"
awk -F"," '{print $1"^"$2"^"$3"^"$4"^"$5"^"$6"^"$7"^"$8"^"$9"^"$10"'${content_add}'"}' ${file_src} > ${file_prestament_21}
scp ${file_prestament_21} ${dir_prestament_22}



# # 复制到22好机的/home/ftpuser/auth_pretreatment/目录
# #scp -p /home/ftpuser/auth_pretreatment/${filedate}/* root@111.208.67.22:/home/ftpuser/auth_pretreatment/${filedate}/























