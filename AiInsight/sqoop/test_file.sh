#!/usr/bin/env bash
#判断是否是文件夹
hadoop fs -test -d /asiainfo/hive/STG/STG_ZG_ACCT
if [ $? -eq 0 ] ;then 
    echo 'Is a directory' 
else 
    echo 'Is not a directory' 
fi

#判断是否是文件
hadoop fs -test -f /asiainfo/hive/STG/STG_ZG_ACCT
if [ $? -eq 0 ] ;then 
    echo 'Is a file' 
else 
    echo 'Is not a file' 
fi