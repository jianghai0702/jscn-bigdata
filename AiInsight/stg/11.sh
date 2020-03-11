for i in {20170802..20170802}
do
for j in {00..10}
do
echo ${i}
echo ${j}
mkdir -p /home/zzc/PT_TIME=${i}/pt_hour=${j}
hive -e "select  req_ans_flag,source_adress,service_address,domain_name ,visit_time  from dwd_dns_up_stream1 where pt_hour=${j} and PT_TIME=${i}" > /home/zzc/PT_TIME=${i}/pt_hour=${j}/000000_0
exit
done
done
