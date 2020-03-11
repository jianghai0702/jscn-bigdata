#!/bin/bash

su hdfs << EOF
hdfs dfs -test -f dm/mrscripts/user_content_score
eq1="$?"
hdfs dfs -test -f dm/mrscripts/user_common
eq2=$?
hdfs dfs -test -f dm/mrscripts/user_score_sim
eq3=$?
echo $?,$?,$?
echo $eq1,$eq2,$eq3