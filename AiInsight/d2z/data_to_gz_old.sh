#!/bin/bash
source /etc/profile
date

#日报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "$v_cycle -1 day " +%Y%m%d`
echo $ldate

if [ 1 -eq 1 ]; then
#获取前一天文件条数
online_num_y=`sed -n '2p' /AiInsight/d2z/check`
auth_num_y=`sed -n '4p' /AiInsight/d2z/check`
nginx_num_y=`sed -n '6p' /AiInsight/d2z/check`
liu1_num_y=`sed -n '8p' /AiInsight/d2z/check`
liu2_num_y=`sed -n '10p' /AiInsight/d2z/check`
liu3_num_y=`sed -n '12p' /AiInsight/d2z/check`
liu4_num_y=`sed -n '14p' /AiInsight/d2z/check`

#插入当天文件条数记录
(echo "online_data" && cat /home/ftpuser/bak/auth/ONLINE_*$ldate.CSV | wc -l) > /AiInsight/d2z/check_t
(echo "auth_data" && cat /home/ftpuser/bak/auth/AUTH_*$ldate.CSV | wc -l) >> /AiInsight/d2z/check_t
(echo "nginx_data" && cat /home/ftpuser/bak/auth/access*$ldate.log | wc -l) >> /AiInsight/d2z/check_t
(echo "tbl_as_sum_report_all" && cat /home/ftpuser/liukong/tbl_as_sum_report_all_$v_cycle | wc -l) >> /AiInsight/d2z/check_t
(echo "tbl_dname_topn" && cat /home/ftpuser/liukong/tbl_dname_topn_$v_cycle | wc -l) >> /AiInsight/d2z/check_t
(echo "tbl_part_app_log" && cat /home/ftpuser/liukong/tbl_part_app_log_$v_cycle | wc -l) >> /AiInsight/d2z/check_t
(echo "tbl_traffic" && cat /home/ftpuser/liukong/tbl_traffic_$v_cycle | wc -l) >> /AiInsight/d2z/check_t

#获取当天文件条数
online_num_t=`sed -n '2p' /AiInsight/d2z/check_t`
auth_num_t=`sed -n '4p' /AiInsight/d2z/check_t`
nginx_num_t=`sed -n '6p' /AiInsight/d2z/check_t`
liu1_num_t=`sed -n '8p' /AiInsight/d2z/check_t`
liu2_num_t=`sed -n '10p' /AiInsight/d2z/check_t`
liu3_num_t=`sed -n '12p' /AiInsight/d2z/check_t`
liu4_num_t=`sed -n '14p' /AiInsight/d2z/check_t`

#检测文件是否存在
if [ ! -f /home/ftpuser/bak/auth/ONLINE_NANJING${ldate}.CSV ] || [ ! -f /home/ftpuser/bak/auth/AUTH_NANJING$ldate.CSV ] || \
   [ ! -f /home/ftpuser/bak/auth/access$ldate.log ] || [ ! -f /home/ftpuser/liukong/tbl_as_sum_report_all_$v_cycle ] || \
   [ ! -f /home/ftpuser/liukong/tbl_dname_topn_$v_cycle ] || [ ! -f /home/ftpuser/liukong/tbl_part_app_log_$v_cycle ] || \
   [ ! -f /home/ftpuser/liukong/tbl_traffic_$v_cycle ]; then
   echo "the data have missing,please check out." | mail -s "Data Missing" \
        liuzx@asiainfo.com yanal@asiainfo.com konglingjun@zhongshu.tv genghui@zhongshu.tv zengjunpeng@zhongshu.tv wangyuting@zhongshu.tv chenchun@jscndata.com

#检测文件条数是否正常
elif [ $online_num_t -lt `expr $online_num_y \* 8 / 10` ] || [ $auth_num_t -lt `expr $auth_num_y \* 8 / 10` ] || \
   [ $nginx_num_t -lt `expr $nginx_num_y \* 6 / 10` ] || [ $liu1_num_t -lt `expr $liu1_num_y \* 5 / 10` ] || \
   [ $liu2_num_t -lt `expr $liu2_num_y \* 5 / 10` ] || [ $liu3_num_t -lt `expr $liu3_num_y \* 5 / 10` ] || \
   [ $liu4_num_t -lt `expr $liu4_num_y \* 5 / 10` ]; then
   (echo -e "The Data Number Is Too Small,Please Check Out.\n\nFlow is the data list \n" && cat /AiInsight/d2z/check_t && \
    echo -e "\nFlow is yestoday data list\n" && cat /AiInsight/d2z/check) | mail -s "Data Little" \
         liuzx@asiainfo.com yanal@asiainfo.com konglingjun@zhongshu.tv genghui@zhongshu.tv zengjunpeng@zhongshu.tv wangyuting@zhongshu.tv chenchun@jscndata.com
else
#更新对比文件
cat /AiInsight/d2z/check_t > /AiInsight/d2z/check
fi
fi

#数据转移（40天前数据）
#设置参数
ldate_auth=`date -d "$v_cycle -41 day " +%Y%m%d`
ldate_liuk=`date -d "$v_cycle -40 day " +%Y%m%d`
#检测文件是否存在
if [ ! -f /home/ftpuser/bak/auth/ONLINE_NANJING${ldate_auth}.CSV ] || [ ! -f /home/ftpuser/bak/auth/AUTH_NANJING${ldate_auth}.CSV ] || \
   [ ! -f /home/ftpuser/bak/auth/access${ldate_auth}.log ] || [ ! -f /home/ftpuser/liukong/tbl_as_sum_report_all_${ldate_liuk} ] || \
   [ ! -f /home/ftpuser/liukong/tbl_dname_topn_${ldate_liuk} ] || [ ! -f /home/ftpuser/liukong/tbl_part_app_log_${ldate_liuk} ] || \
   [ ! -f /home/ftpuser/liukong/tbl_traffic_${ldate_liuk} ]; then
   echo "the ${ldate_liuk} data have missing,please check out." | mail -s "Data Missing" \
        liuzx@asiainfo.com
   exit
fi
#数据转移
mv /home/ftpuser/bak/auth/ONLINE_*${ldate_auth}.CSV /data/source_board/
mv /home/ftpuser/bak/auth/AUTH_*${ldate_auth}.CSV /data/source_board/
mv /home/ftpuser/bak/auth/access${ldate_auth}.log /data/source_board/
mv /home/ftpuser/liukong/tbl_as_sum_report_all_${ldate_liuk} /data/source_board/
mv /home/ftpuser/liukong/tbl_dname_topn_${ldate_liuk} /data/source_board/
mv /home/ftpuser/liukong/tbl_part_app_log_${ldate_liuk} /data/source_board/
mv /home/ftpuser/liukong/tbl_traffic_${ldate_liuk} /data/source_board/

#数据压缩
cd /data/source_board/
tar  -zcvf data_${ldate_liuk}.tar.gz *

#数据转存
scp /data/source_board/data_${ldate_liuk}.tar.gz jsgd9:/data/source_data_history/

#删除原文件
cd /data/source_board/
rm -rf *
