for i in {20170801..20170801}
do
for k in {09..23}
do
for j in {00..40}
do
echo ${i}
echo ${k}
echo ${j}
su - hdfs <<EOF
hive -e"load data inpath '/asiainfo/hive/DWD/dwd_dns_up_stream1/pt_time=20170802/pt_hour=${k}/0000${j}_0'  into table dwd_dns_up_stream partition (pt_time = ${i},pt_hour = ${k})"
exit
EOF
done
done
done
