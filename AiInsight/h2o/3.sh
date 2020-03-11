if [ ! -n "$1" ] ;then
    file="`date -d "$1 -1 day" +%Y%m%d`"
    file_30="`date -d "$1 -30 day" +%Y%m%d`"
else
   file=$1
   file_30="`date -d "$1 -29 day" +%Y%m%d`"
fi

echo $file
