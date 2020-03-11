#!/bin/bash
source /etc/profile
date

#日报
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! ${v_cycle} ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
ldate=`date -d "${v_cycle} -1 day " +%Y%m%d`
echo $ldate

#设置变量
auth_dir='/home/ftpuser/auth/'
liukong_dir='/home/ftpuser/liukong/'
check='/AiInsight/d2z/check'
check_t='/AiInsight/d2z/check_t'

if [ 1 -eq 1 ]; then
#获取前一天文件条数
online_num_y=`sed -n '2p' ${check}`
auth_num_y=`sed -n '4p' ${check}`
nginx_num_y=`sed -n '6p' ${check}`
liu1_num_y=`sed -n '8p' ${check}`
liu2_num_y=`sed -n '10p' ${check}`
liu3_num_y=`sed -n '12p' ${check}`
liu4_num_y=`sed -n '14p' ${check}`

#插入当天文件条数记录
(echo "online_data" && cat ${auth_dir}ONLINE_*$ldate.CSV | wc -l) > ${check_t}
(echo "auth_data" && cat ${auth_dir}AUTH_*$ldate.CSV | wc -l) >> ${check_t}
(echo "nginx_data" && cat ${auth_dir}access*$ldate.log | wc -l) >> ${check_t}
(echo "tbl_as_sum_report_all" && cat ${liukong_dir}tbl_as_sum_report_all_${v_cycle} | wc -l) >> ${check_t}
(echo "tbl_dname_topn" && cat ${liukong_dir}tbl_dname_topn_${v_cycle} | wc -l) >> ${check_t}
(echo "tbl_part_app_log" && cat ${liukong_dir}tbl_part_app_log_${v_cycle} | wc -l) >> ${check_t}
(echo "tbl_traffic" && cat ${liukong_dir}tbl_traffic_${v_cycle} | wc -l) >> ${check_t}

#获取当天文件条数
online_num_t=`sed -n '2p' ${check_t}`
auth_num_t=`sed -n '4p' ${check_t}`
nginx_num_t=`sed -n '6p' ${check_t}`
liu1_num_t=`sed -n '8p' ${check_t}`
liu2_num_t=`sed -n '10p' ${check_t}`
liu3_num_t=`sed -n '12p' ${check_t}`
liu4_num_t=`sed -n '14p' ${check_t}`

#检测文件是否存在
if [ ! -f ${auth_dir}ONLINE_NANJING${ldate}.CSV ] || [ ! -f ${auth_dir}AUTH_NANJING$ldate.CSV ] || \
   [ ! -f ${auth_dir}access$ldate.log ] || [ ! -f ${liukong_dir}tbl_as_sum_report_all_${v_cycle} ] || \
   [ ! -f ${liukong_dir}tbl_dname_topn_${v_cycle} ] || [ ! -f ${liukong_dir}tbl_part_app_log_${v_cycle} ] || \
   [ ! -f ${liukong_dir}tbl_traffic_${v_cycle} ]; then
   (echo -e "the data have missing,please check out.\nFlow is the data list \n" && cat ${check_t}) | mail -s "Data Missing" \
              wangxx7@asiainfo.com  konglingjun@zhongshu.tv  zengjunpeng@zhongshu.tv wangyuting@zhongshu.tv chenchun@jscndata.com

#检测文件条数是否正常
elif [ $online_num_t -lt `expr $online_num_y \* 8 / 10` ] || [ $auth_num_t -lt `expr $auth_num_y \* 8 / 10` ] || \
   [ $nginx_num_t -lt `expr $nginx_num_y \* 8 / 10` ] || [ $liu1_num_t -lt `expr $liu1_num_y \* 5 / 10` ] || \
   [ $liu2_num_t -lt `expr $liu2_num_y \* 5 / 10` ] || [ $liu3_num_t -lt `expr $liu3_num_y \* 5 / 10` ] || \
   [ $liu4_num_t -lt `expr $liu4_num_y \* 5 / 10` ]; then
   (echo -e "The Data Number Is Too Small,Please Check Out.\n\nFlow is the data list \n" && cat ${check_t} && \
    echo -e "\nFlow is yestoday data list\n" && cat ${check}) | mail -s "Data Little" \
              wangxx7@asiainfo.com  konglingjun@zhongshu.tv  zengjunpeng@zhongshu.tv wangyuting@zhongshu.tv chenchun@jscndata.com
else
#更新对比文件
cat ${check_t} > ${check}
fi
fi

#数据转移
#设置参数
ldate_auth=`date -d "${v_cycle} -41 day " +%Y%m%d`
ldate_liuk=`date -d "${v_cycle} -40 day " +%Y%m%d`

#数据压缩
cd ${auth_dir}
tar  -zcvf /data/source_board/auth_${v_cycle}.tar.gz *${ldate}.CSV *${ldate}.log
cd ${liukong_dir}
tar  -zcvf /data/source_board/liukong_${v_cycle}.tar.gz *${v_cycle}

#数据转存
scp /data/source_board/auth_${v_cycle}.tar.gz jsgd27:/data/source_data_history/
scp /data/source_board/liukong_${v_cycle}.tar.gz jsgd27:/data/source_data_history/

#删除压缩文件
rm -f /data/source_board/auth_${v_cycle}.tar.gz
rm -f /data/source_board/liukong_${v_cycle}.tar.gz

#删除40天前源数据
rm -f ${auth_dir}*${ldate_auth}.CSV
rm -f ${auth_dir}*${ldate_auth}.log
rm -f ${liukong_dir}*_${ldate_liuk}

date
