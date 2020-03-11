#config全局配置

1、proessDate.ini中配置了程序调度时使用的时间，格式为（yyyyMMdd）20191101
2、任何的crontab任务必须使用文件方式执行（sh crontab_xxx_task.sh），通常我们可以通过命令crontab -l查看所有任务