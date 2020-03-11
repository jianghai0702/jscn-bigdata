-- yanal

CREATE TABLE IF NOT EXISTS tmp_org  (
STD_ORG_CODE         STRING,
STD_ORG_NAME         STRING,
P_STD_ORG_CODE       STRING,
STD_ORG_TYPE_CODE    STRING,
SHORT_NAME           STRING,
FULLPATH             STRING,
NOTES                STRING,
IS_DISPLAY           STRING,
DISPLAY_ORDER        STRING,
VALID_DATE           STRING,
EXPIRE_DATE          STRING,
ORGANIZE_ID          STRING,
ORGANIZE_ID2         STRING,
IS_VIRTUAL           STRING,
EXT1                 STRING,
EXT2                 STRING,
EXT3                 STRING,
EXT4                 STRING,
EXT5                 STRING,
EXT6                 STRING,
IS_HB_DISPLAY        STRING
)
row format delimited
fields  terminated by '\|'
stored as textfile;


load data local inpath "/AiInsight/dim/dim_std_organize_160810.dat" overwrite into table tmp_org ;

--数据插入 dim 表，并且把分公司对应地市名称的拼音 放到 dim 表的notes 字段 ，在处理手工导入数据需要区分分公司时能够用得上
insert overwrite table dim_std_organize 
select 
t1.STD_ORG_CODE         ,
t1.STD_ORG_NAME         ,
t1.P_STD_ORG_CODE       ,
t1.STD_ORG_TYPE_CODE    ,
t1.SHORT_NAME           ,
t1.FULLPATH             ,
(case when t1.std_org_name = '江苏有线' then 'jiangsuyouxian'
when t1.std_org_name = '南京地区' then 'nanjingdiqu'
when t1.std_org_name = '南京分公司' then 'nanjing'
when t1.std_org_name = '南京江宁公司' then 'nanjingjiangning'
when t1.std_org_name = '南京六合公司' then 'nanjingliuhe'
when t1.std_org_name = '南京浦口公司' then 'nanjingpukou'
when t1.std_org_name = '南京高淳公司' then 'nanjinggaochun'
when t1.std_org_name = '南京溧水公司' then 'nanjinglishui'
when t1.std_org_name = '南京雨花广电' then 'nanjingyuhua'
when t1.std_org_name = '南京栖霞广电' then 'nanjingqixia'
when t1.std_org_name = '南京红花站' then 'nanjinghonghuazhan'
when t1.std_org_name = '无锡地区' then 'wuxidiqu'
when t1.std_org_name = '无锡分公司' then 'wuxi'
when t1.std_org_name = '无锡宜兴广电' then 'wuxiyixing'
when t1.std_org_name = '无锡江阴广电' then 'wuxijiangyin'
when t1.std_org_name = '镇江地区' then 'zhenjiangdiqu'
when t1.std_org_name = '镇江分公司' then 'zhenjiang'
when t1.std_org_name = '镇江扬中广电' then 'zhenjiangyangzhong'
when t1.std_org_name = '镇江句容广电' then 'zhenjiangjurong'
when t1.std_org_name = '镇江丹阳广电' then 'zhenjiangdanyang'
when t1.std_org_name = '镇江丹徒广电' then 'zhenjiangdantu'
when t1.std_org_name = '苏州地区' then 'suzhoudiqu'
when t1.std_org_name = '苏州分公司' then 'suzhou'
when t1.std_org_name = '苏州张家港广电' then 'suzhouzhangjiagang'
when t1.std_org_name = '苏州常熟广电' then 'suzhouchangshu'
when t1.std_org_name = '苏州吴江广电' then 'suzhouwujiang'
when t1.std_org_name = '苏州太仓广电' then 'suzhoutaicang'
when t1.std_org_name = '盐城地区' then 'yanchengdiqu'
when t1.std_org_name = '盐城分公司' then 'yancheng'
when t1.std_org_name = '盐城东台广电' then 'yanchengdongtai'
when t1.std_org_name = '盐城建湖广电' then 'yanchengjianhu'
when t1.std_org_name = '盐城滨海广电' then 'yanchengbinhai'
when t1.std_org_name = '盐城响水广电' then 'yanchengxiangshui'
when t1.std_org_name = '盐城阜宁分公司' then 'yanchengfuning'
when t1.std_org_name = '盐城射阳分公司' then 'yanchengsheyang'
when t1.std_org_name = '盐城大丰分公司' then 'yanchengdafeng'
when t1.std_org_name = '淮安地区' then 'huaiandiqu'
when t1.std_org_name = '淮安分公司' then 'huaian'
when t1.std_org_name = '淮安淮阴广电' then 'huaianhuaiyin'
when t1.std_org_name = '淮安洪泽广电' then 'huaianhongze'
when t1.std_org_name = '淮安金湖广电' then 'huaianjinhu'
when t1.std_org_name = '淮安涟水广电' then 'huaianlianshui'
when t1.std_org_name = '淮安区广电' then 'huaianqu'
when t1.std_org_name = '淮安盱眙分公司' then 'huaianxuyi'
when t1.std_org_name = '连云港地区' then 'lianyungangdiqu'
when t1.std_org_name = '连云港分公司' then 'lianyungang'
when t1.std_org_name = '连云港东海广电' then 'lianyungangdonghai'
when t1.std_org_name = '连云港赣榆广电' then 'lianyungangganyu'
when t1.std_org_name = '连云港灌云广电' then 'lianyungangguanyun'
when t1.std_org_name = '连云港灌南广电' then 'lianyungangguannan'
when t1.std_org_name = '常州地区' then 'changzhoudiqu'
when t1.std_org_name = '常州分公司' then 'changzhou'
when t1.std_org_name = '常州武进广电' then 'changzhouwujin'
when t1.std_org_name = '常州金坛广电' then 'changzhoujintan'
when t1.std_org_name = '常州溧阳分公司' then 'changzhouliyang'
when t1.std_org_name = '泰州地区' then 'taizhoudiqu'
when t1.std_org_name = '泰州分公司' then 'taizhou'
when t1.std_org_name = '泰州兴化广电' then 'taizhouxinghua'
when t1.std_org_name = '泰州姜堰广电' then 'taizhoujiangyan'
when t1.std_org_name = '泰州靖江广电' then 'taizhoujingjiang'
when t1.std_org_name = '泰州泰兴广电' then 'taizhoutaixing'
when t1.std_org_name = '宿迁地区' then 'suqiandiqu'
when t1.std_org_name = '宿迁分公司' then 'suqian'
when t1.std_org_name = '宿迁泗洪广电' then 'suqiansihong'
when t1.std_org_name = '宿迁泗阳广电' then 'suqiansiyang'
when t1.std_org_name = '沭阳分公司' then 'shuyang'
when t1.std_org_name = '南通地区' then 'nantongdiqu'
when t1.std_org_name = '中广有线南通分公司' then 'nantong'
when t1.std_org_name = '南通海安广电' then 'nantonghaian'
when t1.std_org_name = '南通通州广电' then 'nantongtongzhou'
when t1.std_org_name = '南通海门广电' then 'nantonghaimen'
when t1.std_org_name = '南通启东广电' then 'nantongqidong'
when t1.std_org_name = '南通如东广电' then 'nantongrudong'
when t1.std_org_name = '南通如皋分公司' then 'nantongrugao'
when t1.std_org_name = '徐州地区' then 'xuzhoudiqu'
when t1.std_org_name = '中广有线徐州分公司' then 'xuzhou'
when t1.std_org_name = '徐州新沂广电' then 'xuzhouxinyi'
when t1.std_org_name = '徐州丰县广电' then 'xuzhoufengxian'
when t1.std_org_name = '徐州邳州广电' then 'xuzhoupizhou'
when t1.std_org_name = '徐州睢宁广电' then 'xuzhousuining'
when t1.std_org_name = '徐州沛县广电' then 'xuzhoupeixian'
when t1.std_org_name = '徐州铜山广电' then 'xuzhoutongshan'
when t1.std_org_name = '徐州贾汪分公司' then 'xuzhoujiawang'
when t1.std_org_name = '扬州地区' then 'yangzhoudiqu'
when t1.std_org_name = '扬州广电网络公司' then 'yangzhou'
when t1.std_org_name = '扬州江都广电' then 'yangzhoujiangdou'
when t1.std_org_name = '扬州仪征广电' then 'yangzhouyizheng'
when t1.std_org_name = '扬州高邮广电' then 'yangzhougaoyou'
when t1.std_org_name = '扬州宝应广电' then 'yangzhoubaoying'
when t1.std_org_name = '马鞍山地区' then 'maanshandiqu'
when t1.std_org_name = '中广有线马鞍山分公司' then 'maanshan'
when t1.std_org_name = '盐城盐都分公司' then 'yanchengyandou' else '' end ) notes,
t1.IS_DISPLAY           ,
t1.DISPLAY_ORDER        ,
t1.VALID_DATE           ,
t1.EXPIRE_DATE          ,
t1.ORGANIZE_ID          ,
t1.ORGANIZE_ID2         ,
t1.IS_VIRTUAL           ,
t1.EXT1                 ,
t1.EXT2                 ,
t1.EXT3                 ,
t1.EXT4                 ,
t1.EXT5                 ,
t1.EXT6                 ,
t1.IS_HB_DISPLAY        
from tmp_org t1 
left join  dim_std_organize t2 on t1.STD_ORG_CODE = t2.STD_ORG_CODE 
where t2.STD_ORG_CODE is null and t1.STD_ORG_TYPE_CODE <> 'B1';