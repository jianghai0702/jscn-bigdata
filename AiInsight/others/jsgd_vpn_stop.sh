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

command=$(cat <<'EOF'
ps -ef|grep ppp|grep -v grep |awk '{print $2}' | xargs kill
EOF
)

for host in "${hosts[@]}"; do
    ssh  root@"${host}" "${command}" 
done

