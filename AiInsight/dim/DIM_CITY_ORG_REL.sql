insert overwrite table DIM_CITY_ORG_REL
select * from(
select '�Ͼ���' CITY_NAME,'100101' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'100201' STD_ORG_CODE from dual
union all
select '����' CITY_NAME,'100301' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'100401' STD_ORG_CODE from dual
union all
select '�γ���' CITY_NAME,'100501' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'100601' STD_ORG_CODE from dual
union all
select '���Ƹ���' CITY_NAME,'100701' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'100801' STD_ORG_CODE from dual
union all
select '̩����' CITY_NAME,'100901' STD_ORG_CODE from dual
union all
select '��Ǩ��' CITY_NAME,'101001' STD_ORG_CODE from dual
union all
select '��ͨ��' CITY_NAME,'101101' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'101201' STD_ORG_CODE from dual
union all
select '������' CITY_NAME,'101301' STD_ORG_CODE from dual
union all
select '��ɽ��' CITY_NAME,'102101' STD_ORG_CODE from dual
union all
select '�γ���' CITY_NAME,'100509' STD_ORG_CODE from dual
)t;