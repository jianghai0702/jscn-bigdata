#!/bin/bash

hosts=("jsgd4"
       "jsgd5"
       "jsgd6"
       "jsgd18"
       "jsgd20"
       "jsgd25"       
       "jsgd29"
       "jsgd30"
      )

command='nohup /usr/local/bin/openfortivpn -c /etc/openfortivpn/my-config  >> /var/log/openfortivpn.log 2>&1   &'

for host in "${hosts[@]}"; do
    /usr/bin/ssh  root@"${host}" "${command}"
done



