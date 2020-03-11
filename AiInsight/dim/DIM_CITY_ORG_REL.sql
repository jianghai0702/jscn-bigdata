insert overwrite table DIM_CITY_ORG_REL
select * from(
select '南京市' CITY_NAME,'100101' STD_ORG_CODE from dual
union all
select '无锡市' CITY_NAME,'100201' STD_ORG_CODE from dual
union all
select '镇江市' CITY_NAME,'100301' STD_ORG_CODE from dual
union all
select '苏州市' CITY_NAME,'100401' STD_ORG_CODE from dual
union all
select '盐城市' CITY_NAME,'100501' STD_ORG_CODE from dual
union all
select '淮安市' CITY_NAME,'100601' STD_ORG_CODE from dual
union all
select '连云港市' CITY_NAME,'100701' STD_ORG_CODE from dual
union all
select '常州市' CITY_NAME,'100801' STD_ORG_CODE from dual
union all
select '泰州市' CITY_NAME,'100901' STD_ORG_CODE from dual
union all
select '宿迁市' CITY_NAME,'101001' STD_ORG_CODE from dual
union all
select '南通市' CITY_NAME,'101101' STD_ORG_CODE from dual
union all
select '徐州市' CITY_NAME,'101201' STD_ORG_CODE from dual
union all
select '扬州市' CITY_NAME,'101301' STD_ORG_CODE from dual
union all
select '马鞍山市' CITY_NAME,'102101' STD_ORG_CODE from dual
union all
select '盐城市' CITY_NAME,'100509' STD_ORG_CODE from dual
)t;