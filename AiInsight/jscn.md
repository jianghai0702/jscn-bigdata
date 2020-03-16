#### 第一章 集群信息

###### 1.1 VPN设置

```
vpn 地址： 122.193.8.206
vpn 账号： jscn-YaXIn
vpn 密码： jsCndETAT@I90dItT@!@2018I06
```

###### 1.2 服务器

| 主机   | IP            | GATEWAY      | 登录方式 | 用户名/密码                             |
| ------ | ------------- | ------------ | -------- | --------------------------------------- |
| jsgd4  | 111.208.67.21 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd5  | 111.208.67.22 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd6  | 111.208.67.23 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd7  | 111.208.67.24 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd18 | 111.208.67.18 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd20 | 111.208.67.20 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd25 | 111.208.67.25 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd27 | 111.208.67.27 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$    oracle/JSCN2017)(* |
| jsgd29 | 111.208.67.29 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd30 | 111.208.67.30 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |
| jsgd2  | 111.208.67.19 | 111.208.67.1 | ssh2     | root/JSCN2016!@#$                       |

###### 1.3 SVN信息

```
地址:svn://10.10.100.151/boss2/BISRD/Project/JiangSu-Data/AiInsight
```

###### 1.4 CDH集群

```
地址:http://111.208.67.23:7180/cmf/home 
账号:admin
密码:admin
```

###### 1.5 Mysql数据库

| 数据库主机                | 数据库名            | 用户                                              | 密码 |
| ------------------------- | ------------------- | ------------------------------------------------- | ---- |
| 111.208.67.27 （jsgd27）  | SERVICE_NAME = orcl | "system/Abc1234，st/st dim/dim，portal/Portal123" |      |
| 111.208.67.27 （jsgd27）  | st,portal           | "st/st，portal/portal"                            |      |
| bigdata.jscndata.com:4289 | st,portal           | "st/st，portal/portal"                            |      |



###### 1.6 拨测数据API生成

```
地址：http://getdata.bonree.com/CreateUrl/create.jsp
```

###### 1.7 主机服务

| 主机   | IP            | 内存(GB) | 磁盘 | 服务项                                                       |
| ------ | ------------- | -------- | ---- | ------------------------------------------------------------ |
| jsgd4  | 111.208.67.21 | 32GB     | 2T   | HiveServer2,NodeManager,调度AZKABAN,,ftp                     |
| jsgd5  | 111.208.67.22 | 64GB     | 600G | JournalNode,NodeManager,采集                                 |
| jsgd6  | 111.208.67.23 | 64GB     | 600G | NameNode,JournalNode,ZooKeeper Server,Resource Manager ,sqoop ,hive |
| jsgd7  | 111.208.67.24 | 64GB     | 600G | NameNode,JournalNode,Resource Manager                        |
| jsgd18 | 111.208.67.18 | 32GB     | 19T  | DataNode,ZooKeeper Server,NodeManager                        |
| jsgd20 | 111.208.67.20 | 32GB     | 21T  | DataNode,NodeManager,ftp(流控)                               |
| jsgd25 | 111.208.67.25 | 32GB     | 21T  | DataNode,ZooKeeper Server,NodeManager                        |
| jsgd27 | 111.208.67.27 | 32GB     | 21T  | oracle,数据备份,mysql                                        |
| jsgd29 | 111.208.67.29 | 32GB     | 21T  | DataNode,NodeManager                                         |
| jsgd30 | 111.208.67.30 | 32GB     | 21T  | DataNode,NodeManager                                         |
| jsgd2  | 111.208.67.19 | 32GB     | 21T  |                                                              |

##### 





#### 第二章 操作层STG

###### DDL建表语句

```
use default;

--STG客户资料(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CM_CUSTOMER  (
   CUST_ID              STRING,
   CUST_CODE            STRING,
   OLD_CUST_ID          STRING,
   OLD_CUST_CODE        STRING,
   CUST_NAME            STRING,
   CUST_NAME_SHORT      STRING,
   CUST_PASSWD          STRING,
   CUST_TYPE            STRING,
   CUST_LEVEL           STRING,
   CUST_STATUS          STRING,
   CUST_STATUS_DATE     STRING,
   CUST_CERT_TYPE       STRING,
   CUST_CERT_NO         STRING,
   CUST_CERT_ADDR       STRING,
   CERT_VALID_DATE      STRING,
   CERT_EXPIRE_DATE     STRING,
   CUST_OCCUPATION      STRING,
   COMPANY_NAME         STRING,
   COMPANY_ADDR         STRING,
   BORDER_FLAG          STRING,
   REGION_ID            STRING,
   OWN_ORG_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   CREATE_DATE          STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   REMARK             STRING,
   COUNTY_ID            STRING,
   CUST_PROP            STRING,
   CUST_ORDER_ID        STRING,
   MS_AREA_ID           STRING,
   MS_AREA_NAME         STRING,
   MANAGER_ID           STRING,
   MANAGER_NAME         STRING,
   MANAGER_PHONE        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cm_customer';

--STG客户住宅表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_INS_ADDRESS  (
   CUST_ADDR_ID         STRING,
   CUST_ID		        STRING,
   STD_ADDR_ID          STRING,
   STD_ADDR_NAME        STRING,
   DOOR_NAME            STRING,
   RELOCATE_FLAG        STRING,
   CAN_TRANSFER_FLAG    STRING,
   TRANSFER_STATUS      STRING,
   AUDIT_FLAG           STRING,
   MOVE_FLAG            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   TRANSFER_NO          STRING,
   CUST_ORDER_ID        STRING,
   SET_ADDR_ID          STRING,
   SET_ADDR_NAME        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ins_address';

--STG客户住宅表历史表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_INS_ADDRESS  (
   H_ID                 STRING,
   CUST_ADDR_ID         STRING,
   CUST_ID              STRING,
   STD_ADDR_ID          STRING,
   STD_ADDR_NAME        STRING,
   DOOR_NAME            STRING,
   RELOCATE_FLAG        STRING,
   CAN_TRANSFER_FLAG    STRING,
   TRANSFER_STATUS      STRING,
   AUDIT_FLAG           STRING,
   MOVE_FLAG            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   TRANSFER_NO          STRING,
   CUST_ORDER_ID        STRING,
   SET_ADDR_ID          STRING,
   SET_ADDR_NAME        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ins_address';

--STG组织表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_SEC_ORGANIZE  (
   ORGANIZE_ID          STRING,
   ORGANIZE_NAME        STRING,
   CODE                 STRING,
   DISTRICT_ID          STRING,
   SHORT_NAME           STRING,
   ENGLISH_NAME         STRING,
   MEMBER_NUM           STRING,
   MANAGER_NAME         STRING,
   EMAIL                STRING,
   PHONE_ID             STRING,
   FAX_ID               STRING,
   ORG_ADDRESS          STRING,
   CONTACT_NAME         STRING,
   CONTACT_CARD_TYPE    STRING,
   CONTACT_CARD_ID      STRING,
   CONTACT_BILL_ID      STRING,
   POSTCODE             STRING,
   POST_PROVINCE        STRING,
   POST_CITY            STRING,
   POST_ADDRESS         STRING,
   POST_POSTCOD         STRING,
   COUNTY_ID            STRING,
   IS_LEAF              STRING,
   ORG_LEVEL            STRING,
   ORG_AREA_TYPE        STRING,
   ORG_COOP_TYPE        STRING,
   IS_CHANNEL           STRING,
   NOTES                STRING,
   STATE                STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_sec_organize';

--STG员工表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_SEC_STAFF  (
   STAFF_ID             STRING,
   STAFF_NAME           STRING,
   ORGANIZE_ID          STRING,
   PARENT_STAFF_ID      STRING,
   SHORT_NAME           STRING,
   ENGLISH_NAME         STRING,
   CARD_TYPE_ID         STRING,
   CARD_NO              STRING,
   BIRTHDAY             STRING,
   MARRY_STATUS         STRING,
   GENDER               STRING,
   RELIGION             STRING,
   NATIONAL_TYPE        STRING,
   EDUCATION_LEVEL      STRING,
   INCOME_LEVEL         STRING,
   POLITICS_FACE        STRING,
   JOB_POSITION         STRING,
   JOB_COMPANY          STRING,
   JOB_DESC             STRING,
   HOME_TEL             STRING,
   OFFICE_TEL           STRING,
   BILL_ID              STRING,
   WIRELESS_CALL        STRING,
   EMAIL                STRING,
   FAMILY_INFO          STRING,
   CONTACT_ADDRESS      STRING,
   POSTCODE             STRING,
   SECURITY_ID          STRING,
   CAR_NO               STRING,
   CHARACTER_DESC       STRING,
   ALARM_BILL_ID        STRING,
   FAX_ID               STRING,
   STAFF_LEVEL          STRING,
   STAFF_TYPE           STRING,
   BC_MGR               STRING,
   NOTES                STRING,
   STATE                STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_sec_staff';

--STG操作员(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_SEC_OPERATOR  (
   OPERATOR_ID           STRING,
   STAFF_ID              STRING,
   CODE                  STRING,
   PASSWORD              STRING,
   SECURITY_ID           STRING,
   RECENT_PASSWORD       STRING,
   RECENT_PASS_TIMES     STRING,
   ALLOW_CHANGE_PASSWORD STRING,
   ACCT_EFFECT_DATE      STRING,
   ACCT_EXPIRE_DATE      STRING,
   LAST_LOGIN_LOG_ID     STRING,
   TRY_TIMES             STRING,
   LOCK_FLAG             STRING,
   LOGIN_CHANNEL         STRING,
   PASSWORD_VALID_DATE   STRING,
   CHG_PASSWD_ALARM_DAYS STRING,
   IPMAC_FLAG            STRING,
   IS_VPN_LOGIN_FLAG     STRING,
   CHG_PASSWD_FLAG       STRING,
   IS_LOGIN              STRING,
   NOTES                 STRING,
   CANCEL_DAYS           STRING,
   STATE                 STRING,
   DONE_CODE             STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_sec_operator';

--STG产品单元(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_PRODUCT_ITEM  (
   PRODUCT_ITEM_ID      DECIMAL(12),
   EXTEND_ID            DECIMAL(12),
   CODE                 VARCHAR(50),
   NAME                 VARCHAR(200),
   ITEM_TYPE            VARCHAR(40),
   PRIORITY             DECIMAL(6),
   SORT_BY              DECIMAL(6),
   DESCRIPTION          VARCHAR(255),
   CREATER              DECIMAL(12),
   MODIFIER             DECIMAL(12),
   STATE                DECIMAL(2),
   DEL_FLAG             DECIMAL(2),
   REMARK               VARCHAR(255),
   CREATE_DATE          TIMESTAMP,
   MODIFY_DATE          TIMESTAMP,
   VALID_DATE           TIMESTAMP,
   EXPIRE_DATE          TIMESTAMP,
   USE_EFF_DATE         TIMESTAMP,
   USE_EXP_DATE         TIMESTAMP,
   ENT_ID               DECIMAL(12),
   CHECKER              DECIMAL(12),
   ISLOCK               DECIMAL(2),
   SUPPLIER_ID          VARCHAR(20),
   PROVIDER_TYPE        DECIMAL(2),
   BUSINESS_DOMAIN_ID   VARCHAR(1000),
   PLATFORM_ID          DECIMAL(12),
   EXTEND_ID2           VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   EXT1                 DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)PARTITIONED BY (PT_MON CHAR(6))
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_product_item';

--STG产品单元关系(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_ITEM_RELAT  (
   ITEM_RELAT_ID           STRING,
   RELAT_PRODUCT_ITEM_ID   STRING,
   PROD_ITEM_RELAT_KIND_ID STRING,
   EXTEND_ATTR_A           STRING,
   EXTEND_ATTR_B           STRING,
   EXTEND_ATTR_C           STRING,
   EXTEND_ATTR_D           STRING,
   EXTEND_ATTR_E           STRING,
   EXTEND_ATTR_F           STRING,
   EXTEND_ATTR_G           STRING,
   EXTEND_ATTR_H           STRING,
   EXTEND_ATTR_I           STRING,
   EXTEND_ATTR_J           STRING,
   EXTEND_ATTR_K           STRING,
   EXTEND_ATTR_L           STRING,
   EXTEND_ATTR_M           STRING,
   EXTEND_ATTR_N           STRING,
   EXTEND_ATTR_O           STRING,
   SORT_BY                 STRING,
   CREATER                 STRING,
   CREATE_DATE             STRING,
   MODIFIER                STRING,
   MODIFY_DATE             STRING,
   DEL_FLAG                STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_item_relat';

--STG产品单元关系关联价格计划(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_ITEM_RELAT_PRICE  (
   RELAT_ID                STRING,
   ITEM_RELAT_ID           STRING,
   RELAT_TYPE              STRING,
   PROD_ITEM_RELAT_KIND_ID STRING,
   ATTR_A                  STRING,
   ATTR_B                  STRING,
   ATTR_C                  STRING,
   ATTR_D                  STRING,
   ATTR_E                  STRING,
   ATTR_F                  STRING,
   ATTR_G                  STRING,
   ATTR_H                  STRING,
   ATTR_I                  STRING,
   ATTR_J                  STRING,
   ATTR_K                  STRING,
   ATTR_L                  STRING,
   ATTR_M                  STRING,
   ATTR_N                  STRING,
   ATTR_O                  STRING,
   SORT_BY                 STRING,
   CREATER                 STRING,
   CREATE_DATE             STRING,
   MODIFIER                STRING,
   MODIFY_DATE             STRING,
   DEL_FLAG                STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_item_relat_price';

--STG价格计划(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_PRICE_PLAN  (
   PRICE_PLAN_ID        STRING,
   PRICE_PLAN_TYPE_CD   STRING,
   PARA_FLAG            STRING,
   INTERFACE_CODE       STRING,
   USE_MONTH            STRING,
   PAY_MONTH            STRING,
   CREATER              STRING,
   CREATE_DATE          STRING,
   MODIFIER             STRING,
   MODIFY_DATE          STRING,
   DEL_FLAG             STRING,
   ADD_TYPE             STRING,
   FEE_VALUE            STRING,
   RES_CODE             STRING,
   APPORT_RULE          STRING,
   TIME_UNIT            STRING,
   OUT_TYPE             STRING,
   RES_COUNT            STRING,
   IS_BIND              STRING,
   CHARGE_ITEM          STRING,
   REMARK               STRING,
   APPORT_VALUE         STRING,
   MODIFY_FLAG          STRING,
   EXTEND_ATTR_A        STRING,
   EXTEND_ATTR_B        STRING,
   EXTEND_ATTR_C        STRING,
   EXTEND_ATTR_D        STRING,
   EXTEND_ATTR_E        STRING,
   UNIT                 STRING,
   FEE_FLAG             STRING,
   RESTYPE_ID           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_price_plan';

--STG产品策划(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_OFFER  (
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   VALID_TYPE           STRING,
   TRADEMARK            STRING,
   MODIFY_DATE          STRING,
   MODIFIER             STRING,
   CREATE_DATE          STRING,
   CREATER              STRING,
   DEL_FLAG             STRING,
   EXPER_TYPE           STRING,
   EXPER_PERIOD_TYPE    STRING,
   EXPER_PERIOD         STRING,
   MIN_ORDER            STRING,
   MAX_ORDER            STRING,
   EXP_TYPE             STRING,
   STAY_TIME            STRING,
   STAY_UNIT            STRING,
   MODIFY_FLAG          STRING,
   DETAIL               STRING,
   PROD_SERVICE_ID      STRING,
   VISIBLE_TYPE         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_offer';

--STG服务价格(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UP_SERVICE_PRICE  (
   SERVICE_PRICE_ID     STRING,
   SERVICE_PRICE_KIND   STRING,
   IS_MAIN              STRING,
   SUB_COND             STRING,
   SUB_PARAM            STRING,
   PACKED_FLAG          STRING,
   MULTI_FLAG           STRING,
   CREATER              STRING,
   CREATE_DATE          STRING,
   MODIFIER             STRING,
   MODIFY_DATE          STRING,
   DEL_FLAG             STRING,
   STAY_TIME            STRING,
   STAY_UNIT            STRING,
   PROD_SERVICE_ID      STRING,
   NOT_TRANS_INST       STRING,
   PS_TYPE              STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_up_service_price';

--STG产品基本信息表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_PRODUCTS  (
   PROD_ID              STRING,
   IS_PROM              STRING,
   PROD_NAME            STRING,
   SERVICE_ID           STRING,
   EXPR_ID              STRING,
   SUBSCR_PARAM         STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   DESCRIPTION          STRING,
   PRIV_ENTITY          STRING,
   SUM_TYPE             STRING,
   PROD_CLASS           STRING,
   SP_CODE              STRING,
   STD_PROD_ID          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_products';

--STG产品资费包关系表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_PROD_PKGS  (
   PROD_ID              STRING,
   VALID_DATE           STRING,
   EVENT_ID             STRING,
   ATTRIB_ID            STRING,
   EXPIRE_DATE          STRING,
   PKG_USE              STRING,
   PKG_ID               STRING,
   SCHEME_ID            STRING,
   DESCRIPTION          STRING,
   SEG_ID               STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_prod_pkgs';

--STG统一资费包定义表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_PACKAGES  (
   PKG_ID               STRING,
   SERVICE_ID           STRING,
   EVENT_ID             STRING,
   PKG_NAME             STRING,
   PKG_TYPE             STRING,
   PROTOTYPE            STRING,
   DESCRIPTION          STRING,
   INHERIT_TYPE         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_packages';

--STG固定费用资费包明细表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_RENT_PKG_DEL  (
   PKG_ID               STRING,
   ITEM_CODE            STRING,
   RATE_ID              STRING,
   ACCOUNT_TYPE         STRING,
   VALID_CYCLE          STRING,
   VALID_COUNT          STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   PRE_PAY_TYPE         STRING,
   CAL_INDI             STRING,
   DESCRIPTION          STRING,
   USE_TYPE             STRING,
   USER_STATUS_DEF      STRING,
   EXPR_ID              STRING,
   PRIORITY             STRING,
   MONTH_FEE            STRING,
   SHARE_FLAG           STRING,
   USE_MARKER_ID        STRING,
   SEG_INDI             STRING,
   SEG_REP              STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_rent_pkg_del';

--STG统一费率定义表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_RATES  (
   RATE_ID              STRING,
   RATE_NAME            STRING,
   SERVICE_ID           STRING,
   MINIMUM              STRING,
   MAXIMUM              STRING,
   RATE_PRECISION       STRING,
   RATE_ROUND           STRING,
   CURVE_ID             STRING,
   DESCRIPTION          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_rates';

--STG费率曲线表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_CURVE  (
   CURVE_ID             STRING,
   DESCRIPTION          STRING,
   CAL_DIRECT           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_curve';

--STG费率曲线段描述表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_CURVE_SEGMENTS  (
   CURVE_ID             STRING,
   SEGMENT_ID           STRING,
   START_VAL            STRING,
   END_VAL              STRING,
   BASE_VAL             STRING,
   RATE_VAL             STRING,
   CYCLE_UNIT           STRING,
   TAIL_UNIT            STRING,
   TAIL_ROUND           STRING,
   TAIL_RATE            STRING,
   DESCRIPTION          STRING,
   CALC_TYPE            STRING,
   FORMULA_ID           STRING,
   SHARE_NUM            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_curve_segments';

--STG统一科目定义表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_ITEMS  (
   ITEM_CODE            STRING,
   ITEM_NAME            STRING,
   ITEM_TYPE            STRING,
   ITEM_KEY             STRING,
   ITEM_CLASS           STRING,
   SUB_TYPE             STRING,
   ITEM_RES_TYPE        STRING,
   SUM_WAY              STRING,
   ITEM_SPOT            STRING,
   DESCRIPTION          STRING,
   PRIORITY             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_items';

--STG条件定义表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CP_PM_EXPRESSIONS  (
   EXPR_ID              STRING,
   EXPR_NAME            STRING,
   USE_TRIGGER          STRING,
   COMPILER             STRING,
   SERVICE_ID           STRING,
   EXPRESSION           STRING,
   DESCRIPTION          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_cp_pm_expressions';

--STG服务与网元内容关系表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UA_SERVICE_CONTENT_REL  (
   REL_ID             STRING,
   SERVICE_ID         STRING,
   CONTENT_ID         STRING,
   CREATE_DATE        STRING,
   CREATOR            STRING,
   MODIFY_DATE        STRING,
   MODIFIER           STRING,
   DATA_SOURCE_CD     STRING,
   ETL_CYCLE          STRING,
   ETL_DATE           STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ua_service_content_rel';

--STG服务表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UA_SERVICE  (
   SERVICE_ID        STRING,
   SERVICE_CODE      STRING,
   SERVICE_TYPE      STRING,
   SERVICE_NAME      STRING,
   SERVICE_LEVEL     STRING,
   STATE             STRING,
   DEL_FLAG          STRING,
   MODIFY_DATE       STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ua_service';

--STG网元表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UA_NET_ELEMENTS  (
   NE_ID             STRING,
   NE_NAME           STRING,
   NE_DESC           STRING,
   NET_ID            STRING,
   LOAD_TYPE         STRING,
   NE_IMPL_CLASS     STRING,
   REL_TYPE          STRING,
   NE_STATE          STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ua_net_elements';

--STG网元内容授权码表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UA_NE_CONTENT_AUTH_CODE  (
   AUTH_CODE_ID      STRING,
   CONTENT_ID        STRING,
   NE_ID             STRING,
   AUTH_CODE         STRING,
   IS_CDM            STRING,
   CA_CDM_CODE       STRING,
   CREATE_DATE       STRING,
   CREATOR           STRING,
   MODIFY_DATE       STRING,
   MODIFIER          STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ua_ne_content_auth_code';

--STG产品规格实例(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_INS_PROD  (
   PROD_INST_ID         STRING,
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   BRAND_ID             STRING,
   PROD_SPEC_ID         STRING,
   CUST_ID              STRING,
   ACCT_ID              STRING,
   PAY_TYPE             STRING,
   BILL_ID              STRING,
   SUB_BILL_ID          STRING,
   MAIN_PROD_INST_ID    STRING,
   BILL_START_DATE      STRING,
   USER_NAME            STRING,
   USER_PROP            STRING,
   USER_GROUP           STRING,
   VIP_FLAG             STRING,
   VIP_PROP             STRING,
   BODER_FLAG           STRING,
   SUBSIDY_FLAG         STRING,
   SUBSIDY_PROP         STRING,
   DEGREE_FLAG          STRING,
   FIRST_USE_DATE       STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   OPER_STATE           STRING,
   OS_STATUS            STRING,
   CREDIT_LEVEL         STRING,
   CREDIT_AMOUNT        STRING,
   PASSWORD_TYPE        STRING,
   PASSWORD             STRING,
   ADDRESS_ID           STRING,
   CONT_ID              STRING,
   POST_MODE            STRING,
   POST_ADDRESS_ID      STRING,
   ACCESS_MODE          STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   WARRANT_CUST_ID      STRING,
   REMARK               STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   EXT5                 STRING,
   EXT6                 STRING,
   USER_TYPE_ID         STRING,
   INSTALL_ADDR_ID      STRING,
   INSTALL_ADDR_NAME    STRING,
   LOGIN_NAME           STRING,
   TV_NUMBER            STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ins_prod';

--STG产品规格实例历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_INS_PROD  (
   H_ID                 STRING,
   PROD_INST_ID         STRING,
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   BRAND_ID             STRING,
   PROD_SPEC_ID         STRING,
   CUST_ID              STRING,
   ACCT_ID              STRING,
   PAY_TYPE             STRING,
   BILL_ID              STRING,
   SUB_BILL_ID          STRING,
   MAIN_PROD_INST_ID    STRING,
   BILL_START_DATE      STRING,
   USER_NAME            STRING,
   USER_PROP            STRING,
   USER_GROUP           STRING,
   VIP_FLAG             STRING,
   VIP_PROP             STRING,
   BODER_FLAG           STRING,
   SUBSIDY_FLAG         STRING,
   SUBSIDY_PROP         STRING,
   DEGREE_FLAG          STRING,
   FIRST_USE_DATE       STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   OPER_STATE           STRING,
   OS_STATUS            STRING,
   CREDIT_LEVEL         STRING,
   CREDIT_AMOUNT        STRING,
   PASSWORD_TYPE        STRING,
   PASSWORD             STRING,
   ADDRESS_ID           STRING,
   CONT_ID              STRING,
   POST_MODE            STRING,
   POST_ADDRESS_ID      STRING,
   ACCESS_MODE          STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   WARRANT_CUST_ID      STRING,
   REMARK               STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   EXT5                 STRING,
   EXT6                 STRING,
   USER_TYPE_ID         STRING,
   INSTALL_ADDR_ID      STRING,
   INSTALL_ADDR_NAME    STRING,
   LOGIN_NAME           STRING,
   TV_NUMBER            STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ins_prod';

--STG产品策划实例(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_INS_OFFER  (
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CUST_ID              STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   CANCEL_REASON        STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   OWN_ORG_ID           STRING,
   SALE_TYPE            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ins_offer';

--STG产品策划实例历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_INS_OFFER  (
   H_ID                 STRING,
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CUST_ID              STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   CANCEL_REASON        STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   OWN_ORG_ID           STRING,
   SALE_TYPE            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   CUST_ORDER_ID        STRING,
   CUST_ADDR_ID         STRING,
   EXPIRE_FOLLOW_STATE  STRING,
   OS_STATUS            STRING,
   PROD_SERVICE_ID      STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ins_offer';

--STG服务包实例(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_INS_SRVPKG  (
   SRVPKG_INST_ID       STRING,
   OFFER_INST_ID        STRING,
   SRVPKG_ID            STRING,
   PROD_INST_ID         STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   PROD_SERVICE_ID      STRING,
   OS_STATUS            STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ins_srvpkg';

--STG服务包实例历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_INS_SRVPKG  (
   H_ID                 STRING,
   SRVPKG_INST_ID       STRING,
   OFFER_INST_ID        STRING,
   SRVPKG_ID            STRING,
   PROD_INST_ID         STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   PROD_SERVICE_ID      STRING,
   OS_STATUS            STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ins_srvpkg';

--STG帐户(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_ACCT  (
   ACCT_ID              STRING,
   CUST_ID              STRING,
   ACCT_NAME            STRING,
   ADDRESS              STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   ACCT_CODE            STRING,
   CUST_CODE            STRING,
   NATION               STRING,
   PROVINCE             STRING,
   AREA                 STRING,
   COUNTY               STRING,
   POST_CODE            STRING,
   GROUP_ACCT_CODE      STRING,
   IS_SUPER_ACCT        STRING,
   IS_BAD_DEBT          STRING,
   PREPAY_AREA_ID       STRING,
   ABA_NUMBER           STRING,
   INVOICE_FORMAT_ID    STRING,
   BILL_FORMAT_ID       STRING,
   CREDIT_AMOUNT        STRING,
   BRAND_SUIT           STRING,
   SO_NBR               STRING,
   REGION_ID            STRING,
   AREA_ID              STRING,
   PAY_AREA_CODE        STRING,
   CREDIT_GRADE         STRING,
   PAYMENT_METHOD       STRING,
   IS_MAILING           STRING,
   MAILING_METHOD       STRING,
   MAILING_ADDRESS      STRING,
   ADDRESS_ID           STRING,
   CORP_ORG_ID          STRING,
   DATA_ORG_ID          STRING,
   PAY_MODE             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_acct';

--STG帐目(销帐明细)(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_ACCT_ITEM_PAYOFF  (
   BALANCE_LOG_ID       STRING,
   ACCT_BALANCE_ID      STRING,
   PAYMENT_ID           STRING,
   BILL_ID              STRING,
   ACCT_ITEM_ID         STRING,
   BILLING_CYCLE_ID     STRING,
   SERV_ID              STRING,
   ACCT_ID              STRING,
   ACCT_ITEM_TYPE_ID    STRING,
   BALANCE_TYPE_ID      STRING,
   PAYOFF_AMOUNT        STRING,
   UNPAY_AMOUNT         STRING,
   BILL_AMOUNT          STRING,
   PAYMENT_DATE         STRING,
   CORP_ORG_ID          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_acct_item_payoff';

--STG帐目切片表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_ACCT_ITEM_SLICE  (
   ACCT_ITEM_SLICE_ID   STRING,
   ACCT_ITEM_ID         STRING,
   BILL_ID              STRING,
   BILL_AMOUNT          STRING,
   ACCT_ID              STRING,
   BILLING_CYCLE_ID     STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   CREATED_DATE         STRING,
   REGION_CODE          STRING,
   CORP_ORG_ID          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_acct_item_slice';

--STG保存时间量的时间和金额消耗值(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZC_ACCP_AMOTIME_LOG  (
   SERV_ID              STRING,
   ACCT_ID              STRING,
   SO_ID                STRING,
   PROD_ID              STRING,
   TOTAL_VAL            STRING,
   ADDUP_VAL            STRING,
   CURR_VAL             STRING,
   TOTAL_AMOUNT         STRING,
   ADDUP_AMOUNT         STRING,
   CURR_AMOUNT          STRING,
   LAST_BDATE           STRING,
   CURR_BDATE           STRING,
   UP_TIME              STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zc_accp_amotime_log';

--STG帐目类型(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_ACCT_ITEM_TYPE  (
   ACCT_ITEM_TYPE_ID    STRING,
   PARTNER_ID           STRING,
   NAME                 STRING,
   ACCT_ITEM_TYPE_DESC  STRING,
   ACCT_ITEM_TYPE_KIND  STRING,
   ACCT_ITEM_TYPE_CODE  STRING,
   PRINT_PRIORITY       STRING,
   BILL_PRIORITY        STRING,
   CHARGE_MARK          STRING,
   TOTAL_MARK           STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   ITEM_FEE_TYPE        STRING,
   ACCT_ITEM_CLASS_ID   STRING,
   PARTY_ROLE_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_acct_item_type';

--STG帐目类型_分业务的关系表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_ACCT_ITEM_SERVICE  (
   ACCT_ITEM_TYPE_ID    STRING,
   SERVICE_ID           STRING,
   SORT                 STRING,
   STS                  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_acct_item_service';

--STG余额类型(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_BALANCE_TYPE  (
   BALANCE_TYPE_ID      STRING,
   PRIORITY             STRING,
   BALANCE_TYPE_NAME    STRING,
   IF_ALLOW_INVOICE     STRING,
   IF_ALLOW_DRAW        STRING,
   IF_ALLOW_TRANS       STRING,
   IF_ALLOW_RESERV      STRING,
   IS_PRESENT           STRING,
   STATE                STRING,
   MEASURE_METHOD_ID    STRING,
   CONTROL_TYPE         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_balance_type';

--STG固费资料接口表(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ZG_I_USER_MSC  (
   SO_ID                STRING,
   SERV_ID              STRING,
   PROD_ID              STRING,
   VALID_DATE           STRING,
   DONE_CODE            STRING,
   REGION_CODE          STRING,
   FUNC_TYPE            STRING,
   BUSI_TYPE            STRING,
   FUNC_PARAM           STRING,
   PROPERTY             STRING,
   PLAN_ID              STRING,
   BEGIN_DATE           STRING,
   EXPIRE_DATE          STRING,
   REMARK               STRING,
   SO_NBR               STRING,
   OFFER_INST_ID        STRING,
   OPER_TYPE            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_zg_i_user_msc';

--STG行政区域(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_OSS_DISTRICT  (
   DISTRICT_ID           STRING,
   REGION_ID             STRING,
   DISTRICT_NAME         STRING,
   DISTRICT_ENGLISH_NAME STRING,
   DISTRICT_TYPE_ID      STRING,
   PARENT_DISTRICT_ID    STRING,
   AREA_CODE             STRING,
   POST_CODE             STRING,
   NOTES                 STRING,
   SORT_ID               STRING,
   CENTER_INFO_CODE      STRING,
   DISTRICT_TWO_NUMBER   STRING,
   COURSE_FLAG           STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_oss_district';

--STG管理地址(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_OSS_ADDR_MGR_ADDR  (
   MGR_ADDR_ID          STRING,
   MGR_ADDR_NAME        STRING,
   MGR_ADDR_CODE        STRING,
   PARENT_MGR_ADDR_ID   STRING,
   STATE                STRING,
   REMARK               STRING,
   CREATE_DATE          STRING,
   MOD_DATE             STRING,
   REL_OBJ_VALUE        STRING,
   IS_LEAF              STRING,
   MGR_ADDR_SUBTYPE     STRING,
   OWN_ORG_ID           STRING,
   REL_OBJ_NAME         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_oss_addr_mgr_addr';

--STG标准地址(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_OSS_ADDR_STD_ADDR  (
   STD_ADDR_ID          STRING,
   NAME                 STRING,
   STD_ADDR_TYPE        STRING,
   DISTRICT_ID          STRING,
   STD_ADDR_CODE        STRING,
   SPELL                STRING,
   PARENT_ADDR_ID       STRING,
   STATE                STRING,
   REMARK               STRING,
   DETAIL_NAME          STRING,
   DETAIL_SPELL         STRING,
   TOPIC_WORD           STRING,
   CREATE_DATE          STRING,
   MODIFY_DATE          STRING,
   AREA_MANAGER         STRING,
   X                    STRING,
   Y                    STRING,
   GRID                 STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_oss_addr_std_addr';

--STG管理地址与标准地址关系(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_OSS_ADDR_MGR_ADDR_ADDR_REL  (
   ADDR_REL_ID         STRING,
   MGR_ADDR_TYPE       STRING,
   MGR_ADDR_ID         STRING,
   STD_ADDR_TYPE       STRING,
   STD_ADDR_ID         STRING,
   STATE               STRING,
   REMARK              STRING,
   MGR_ADDR_SUBTYPE    STRING,
   DATA_SOURCE_CD      STRING,
   ETL_CYCLE           STRING,
   ETL_DATE            STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_oss_addr_mgr_addr_addr_rel';

--STG产品规格订单(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ORD_PROD  (
   PROD_ORDER_ID        STRING,
   CUST_ORDER_ID        STRING,
   BUSIOPER_ORDER_ID    STRING,
   PROD_SPEC_ID         STRING,
   PROD_INST_ID         STRING,
   PROD_ROLE_ID         STRING,
   NEW_PROD_ORDER_ID    STRING,
   OFFER_ID             STRING,
   BRAND_ID             STRING,
   CUST_ID              STRING,
   ACCT_ID              STRING,
   PAY_TYPE             STRING,
   BILL_ID              STRING,
   SUB_BILL_ID          STRING,
   MAIN_PROD_INST_ID    STRING,
   BILL_START_DATE      STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   OS_STATUS            STRING,
   OUTLINE_FLAG         STRING,
   OWE_AMOUNT           STRING,
   PASSWORD_TYPE        STRING,
   PASSWORD             STRING,
   CONT_ID              STRING,
   ADDRESS_ID           STRING,
   VALID_TYPE           STRING,
   USER_STATE           STRING,
   DONE_CODE            STRING,
   BOOK_HOME_DATE       STRING,
   BOOK_OPEN_DATE       STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   REMARK               STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   EXT5                 STRING,
   EXT6                 STRING,
   USER_NAME            STRING,
   USER_PROP            STRING,
   USER_GROUP           STRING,
   VIP_FLAG             STRING,
   VIP_PROP             STRING,
   BODER_FLAG           STRING,
   SUBSIDY_FLAG         STRING,
   SUBSIDY_PROP         STRING,
   DEGREE_FLAG          STRING,
   FIRST_USE_DATE       STRING,
   ACCESS_MODE          STRING,
   USER_TYPE_ID         STRING,
   INSTALL_ADDR_ID      STRING,
   INSTALL_ADDR_NAME    STRING,
   LOGIN_NAME           STRING,
   TV_NUMBER            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ord_prod';

--STG产品规格订单历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_ORD_PROD  (
   PROD_ORDER_ID        STRING,
   CUST_ORDER_ID        STRING,
   BUSIOPER_ORDER_ID    STRING,
   OFFER_ORDER_ID       STRING,
   PROD_SPEC_ID         STRING,
   PROD_INST_ID         STRING,
   PROD_ROLE_ID         STRING,
   NEW_PROD_ORDER_ID    STRING,
   OFFER_ID             STRING,
   BRAND_ID             STRING,
   CUST_ID              STRING,
   ACCT_ID              STRING,
   PAY_TYPE             STRING,
   BILL_ID              STRING,
   SUB_BILL_ID          STRING,
   MAIN_PROD_INST_ID    STRING,
   BILL_START_DATE      STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   OS_STATUS            STRING,
   OUTLINE_FLAG         STRING,
   OWE_AMOUNT           STRING,
   PASSWORD_TYPE        STRING,
   PASSWORD             STRING,
   CONT_ID              STRING,
   ADDRESS_ID           STRING,
   VALID_TYPE           STRING,
   USER_STATE           STRING,
   DONE_CODE            STRING,
   BOOK_HOME_DATE       STRING,
   BOOK_OPEN_DATE       STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   REMARK               STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   EXT5                 STRING,
   EXT6                 STRING,
   USER_NAME            STRING,
   USER_PROP            STRING,
   USER_GROUP           STRING,
   VIP_FLAG             STRING,
   VIP_PROP             STRING,
   BODER_FLAG           STRING,
   SUBSIDY_FLAG         STRING,
   SUBSIDY_PROP         STRING,
   DEGREE_FLAG          STRING,
   FIRST_USE_DATE       STRING,
   ACCESS_MODE          STRING,
   USER_TYPE_ID         STRING,
   INSTALL_ADDR_ID      STRING,
   INSTALL_ADDR_NAME    STRING,
   LOGIN_NAME           STRING,
   TV_NUMBER            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ord_prod';

--STG策划订单(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ORD_OFFER  (
   OFFER_ORDER_ID       STRING,
   CUST_ORDER_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   OFFER_INST_ID        STRING,
   OBJ_OFFER_INST_ID    STRING,
   IS_MAIN_OFFER        STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   CUST_ID              STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CANCEL_REASON        STRING,
   CANCEL_DATE          STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ord_offer';

--STG策划订单历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_ORD_OFFER  (
   OFFER_ORDER_ID       STRING,
   CUST_ORDER_ID        STRING,
   BUSIOPER_ORDER_ID    STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   OFFER_INST_ID        STRING,
   OBJ_OFFER_INST_ID    STRING,
   IS_MAIN_OFFER        STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   CUST_ID              STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CANCEL_REASON        STRING,
   CANCEL_DATE          STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ord_offer';

--STG服务包订单(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ORD_SRVPKG  (
   SRVPKG_ORDER_ID      STRING,
   CUST_ORDER_ID        STRING,
   OFFER_ORDER_ID       STRING,
   SRVPKG_ID            STRING,
   SRVPKG_INST_ID       STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   PROD_ORDER_ID        STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   REGION_ID            STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   PROD_SERVICE_ID      STRING,
   OS_STATUS            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ord_srvpkg';

--STG服务包订单历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_ORD_SRVPKG  (
   SRVPKG_ORDER_ID      STRING,
   CUST_ORDER_ID        STRING,
   OFFER_ORDER_ID       STRING,
   SRVPKG_ID            STRING,
   SRVPKG_INST_ID       STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   PROD_ORDER_ID        STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   REGION_ID            STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   PROD_SERVICE_ID      STRING,
   OS_STATUS            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ord_srvpkg';

--STG价格计划订单(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_ORD_PRICE  (
   PRICEPLAN_ORDER_ID     STRING,
   PRICEPLAN_INST_ID      STRING,
   PRICEPLAN_ORDER_TYPE   STRING,
   PRICEPLAN_TYPE         STRING,
   PRICE_PLAN_ID          STRING,
   PRICE_PLAN_DETAIL_ID   STRING,
   CUST_ORDER_ID          STRING,
   OFFER_ORDER_ID         STRING,
   PRICEPLAN_PRICEITEM_ID STRING,
   PROM_KIND              STRING,
   PROM_TYPE              STRING,
   PRICEITEM_VALUE        STRING,
   FACT_PRICEITEM_VALUE   STRING,
   ORDER_NUM              STRING,
   SHOULD_MONEY           STRING,
   FACT_MONEY             STRING,
   FEE_MONTH              STRING,
   PRICEPLAN_BEGIN_DATE   STRING,
   PRICEPLAN_END_DATE     STRING,
   CUST_ID                STRING,
   IS_MEM_GRP_DISC        STRING,
   GRP_PRICEPLAN_ID       STRING,
   GRP_PRICEPLAN_INST_ID  STRING,
   VALID_TYPE             STRING,
   STATE                  STRING,
   ORDER_STATE            STRING,
   DONE_CODE              STRING,
   CREATE_DATE            STRING,
   DONE_DATE              STRING,
   VALID_DATE             STRING,
   EXPIRE_DATE            STRING,
   OP_ID                  STRING,
   ORG_ID                 STRING,
   EXT1                   STRING,
   EXT2                   STRING,
   EXT3                   STRING,
   EXT4                   STRING,
   REMARK                 STRING,
   REGION_ID              STRING,
   PRICEPLAN_DETAIL_TYPE  STRING,
   CUT_MONEY              STRING,
   BIND_FLAG              STRING,
   BASE_OFFER_ID          STRING,
   EXT5                   STRING,
   EXT6                   STRING,
   EXT7                   STRING,
   EXT8                   STRING,
   SRC_ACCT_ITEM_ID       STRING,
   SRC_ACCT_PAY_MONEY     STRING,
   PREPAY_ACCT_TYPE       STRING,
   DATA_SOURCE_CD         STRING,
   ETL_CYCLE              STRING,
   ETL_DATE               STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_ord_price';

--STG价格计划订单历史(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_H_ORD_PRICE  (
   PRICEPLAN_ORDER_ID     STRING,
   PRICEPLAN_INST_ID      STRING,
   PRICEPLAN_ORDER_TYPE   STRING,
   PRICEPLAN_TYPE         STRING,
   PRICE_PLAN_ID          STRING,
   PRICE_PLAN_DETAIL_ID   STRING,
   CUST_ORDER_ID          STRING,
   OFFER_ORDER_ID         STRING,
   MAIN_ORDER_ID          STRING,
   PRICEPLAN_PRICEITEM_ID STRING,
   PROM_KIND              STRING,
   PROM_TYPE              STRING,
   PRICEITEM_VALUE        STRING,
   FACT_PRICEITEM_VALUE   STRING,
   ORDER_NUM              STRING,
   SHOULD_MONEY           STRING,
   FACT_MONEY             STRING,
   FEE_MONTH              STRING,
   PRICEPLAN_BEGIN_DATE   STRING,
   PRICEPLAN_END_DATE     STRING,
   CUST_ID                STRING,
   IS_MEM_GRP_DISC        STRING,
   GRP_PRICEPLAN_ID       STRING,
   GRP_PRICEPLAN_INST_ID  STRING,
   VALID_TYPE             STRING,
   STATE                  STRING,
   ORDER_STATE            STRING,
   DONE_CODE              STRING,
   CREATE_DATE            STRING,
   DONE_DATE              STRING,
   VALID_DATE             STRING,
   EXPIRE_DATE            STRING,
   OP_ID                  STRING,
   ORG_ID                 STRING,
   EXT1                   STRING,
   EXT2                   STRING,
   EXT3                   STRING,
   EXT4                   STRING,
   REMARK                 STRING,
   REGION_ID              STRING,
   PRICEPLAN_DETAIL_TYPE  STRING,
   CUT_MONEY              STRING,
   BIND_FLAG              STRING,
   BASE_OFFER_ID          STRING,
   EXT5                   STRING,
   EXT6                   STRING,
   EXT7                   STRING,
   EXT8                   STRING,
   SRC_ACCT_ITEM_ID       STRING,
   SRC_ACCT_PAY_MONEY     STRING,
   PREPAY_ACCT_TYPE       STRING,
   DATA_SOURCE_CD         STRING,
   ETL_CYCLE              STRING,
   ETL_DATE               STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_h_ord_price';

--STG认证记录表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_BRD_AUTH_LOG  (
   AUTH_LOG_ID          STRING,
   LOGIN_NAME           STRING,
   LOGIN_PASSWORD       STRING,
   AUTH_TIME            STRING,
   AUTH_RESULT          STRING,
   RETURN_MESSAGE       STRING,
   MAC                  STRING,
   IP_ADDRESS           STRING,
   CORP_ORG_ID          STRING,
   ACCT_STATUS_TYPE     STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_brd_auth_log';

--STG在线记录表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_DR_BRD_EXPEND  (
   RECORD_ID            STRING,
   USER_NAME            STRING,
   ORG_CODE             STRING,
   ACCT_STATUS_TYPE     STRING,
   ACCT_START_TIME      STRING,
   ACCT_STOP_TIME       STRING,
   ACCT_SESSION_TIME    STRING,
   REQUEST_DATE         STRING,
   ACCT_INPUT_OCTETS    STRING,
   ACCT_OUTPUT_OCTETS   STRING,
   ACCT_SESSION_ID      STRING,
   SERVICE_CODE         STRING,
   ACCT_TERMINATE_CAUSE STRING,
   NAS_IDENTIFIER       STRING,
   NAS_IP_ADDRESS       STRING,
   CLIENT_IP_ADDRESS    STRING,
   NAS_PORT_ID          STRING,
   MAC_ADDRESS          STRING,
   RESERVE1             STRING,
   RESERVE2             STRING,
   RESERVE3             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_dr_brd_expend';

--STG域名统计表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_DOMAIN_STATISTICS  (
   ID                      STRING,
   DOMAIN_NAME             STRING,
   TOTAL_REQUEST_COUNT     STRING,
   REQUEST_COUNT           STRING,
   TOTAL_RESPONSE_COUNT    STRING,
   TOTAL_RESPONSE_RATE     STRING,
   FAILURE_RESPONSE_COUNT  STRING,
   FAILURE_RESPONSE_RATE   STRING,
   NXDOMAIN_COUNT          STRING,
   NXDOMAIN_RATE           STRING,
   SUCCESS_RESOLUTION_RATE STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_domain_statistics';

--STG上行数据表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_UPLINK_DATA  (
   USER_ACCOUNT         STRING,
   PROTOCOL_TYPE        STRING,
   SOURCE_IP            STRING,
   DESTINATION_IP       STRING,
   SOURCE_PORT          STRING,
   DESTINATION_PORT     STRING,
   DOMAIN_NAME          STRING,
   URL                  STRING,
   REFERER              STRING,
   USER_AGENT           STRING,
   COOKIE               STRING,
   ACCESS_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_uplink_data';

--STG网页浏览表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_WEB_BROWSE  (
   TASK_ID                  STRING,
   TASK_NAME                STRING,
   TASK_URL                 STRING,
   ERROR_DESC               STRING,
   URL_REDIRECT             STRING,
   DNS_QUERY_TIME           STRING,
   TCP_CONNET_TIME          STRING,
   SSL_HANDSHAKE_TIME       STRING,
   CLIENT_REQUEST_TIME      STRING,
   SERVER_RESPONSE_TIME     STRING,
   REDIRECT_TIME            STRING,
   BASIC_DOC_DOWNLOAD_TIME  STRING,
   RENDER_TIME              STRING,
   FIRST_PACKET_TIME        STRING,
   BASIC_DOC_DOWNLOAD_SPEED STRING,
   RENDER_SPEED             STRING,
   DOWNLOAD_SPEED           STRING,
   BASIC_DOC_ACTUAL_BYTES   STRING,
   BASIC_DOC_DOWNLOAD_BYTES STRING,
   MONITOR_DATE             STRING,
   DOWNLOAD_BYTES           STRING,
   DNS_RESOLUTION_COUNT     STRING,
   TCP_CONNECT_COUNT        STRING,
   PERFORMANCE              STRING,
   TARGET_IP                STRING,
   FIRST_SCREEN_TIME        STRING,
   TARGET_CITY              STRING,
   TARGET_OPERATOR          STRING,
   MONITOR_CITY             STRING,
   MONITOR_PROVINCE         STRING,
   MONITOR_OPERATOR         STRING,
   MONITOR_DNS              STRING,
   MONITOR_BANDWIDTH        STRING,
   MONITOR_TYPE             STRING,
   MONITOR_IP               STRING,
   MONITOR_CPU_USAGE        STRING,
   MONITOR_MEMORY_USAGE     STRING,
   CURRENT_AVG_SPEED        STRING,
   MONITOR_PROCESSES        STRING,
   INCREMENT_ID             STRING,
   MAIN_ID                  STRING,
   USER_NAME                STRING,
   BROWSER_BLOCK_TIME       STRING,
   ROUNDTRIPS               STRING,
   ELEMENT_ERROR_TAB        STRING,
   AVG_DNS_QUERY_TIME       STRING,
   AVG_TCP_CONNET_TIME      STRING,
   AVG_SEND_REQUEST_TIME    STRING,
   AVG_SERVER_RESPONSE_TIME STRING,
   AVG_DOWNLOAD_TIME        STRING,
   AVG_SSL_HANDSHAKE_TIME   STRING,
   PROJECTED_DNS_TIME       STRING,
   PROJECTED_TCP_TIME       STRING,
   PROJECTED_REQUEST_TIME   STRING,
   PROJECTED_RESPONSE_TIME  STRING,
   PROJECTED_DOWNLOAD_TIME  STRING,
   PROJECTED_SSL_TIME       STRING,
   CLIENT_ONLY_ID           STRING,
   BLOCK_PROJECTED_TIME     STRING,
   COMPLETE_DOC_TIME        STRING,
   HEADER                   STRING,
   ERROR_SNAPSHOT           STRING,
   SOURCE_CODE              STRING,
   COUNTRY                  STRING,
   BROWSER_KERNEL           STRING,
   RESOLUTION               STRING,
   CPU_NAME                 STRING,
   CPU_FREQUENCY            STRING,
   CPU_COUNT                STRING,
   MEMORY_SIZE              STRING,
   GRAPHICS                 STRING,
   CPU_CURVE                STRING,
   MEMORY_CURVE             STRING,
   REQUEST_HEADER           STRING,
   ELE_LOADED_SUCCESS_COUNT STRING,
   ELE_REDIRECT_COUNT       STRING,
   ELE_REQUEST_ERROR_COUNT  STRING,
   ELE_SERVER_ERROR_COUNT   STRING,
   ELE_UNCONNET_COUNT       STRING,
   ONLOAD_TIME              STRING,
   DOMREADY_TIME            STRING,
   ONLOAD_URL               STRING,
   FIRST_SCREEN_URL         STRING,
   CYCLE_SCREENSHOT         STRING,
   SCREEN_FULL_RENDER_TIME  STRING,
   SCREEN_ELEMENT_COUNT     STRING,
   FIRST_RENDER_TIME        STRING,
   ELEMENT_HIJACK_COUNT     STRING,
   DOMAIN_HIJACK_COUNT      STRING,
   HIJACK_COUNT             STRING,
   HIJACK_RATE              STRING,
   TARGET_PROVINCE          STRING,
   BROWSER_VERSION          STRING,
   DATA_SOURCE_CD           STRING,
   ETL_CYCLE                STRING,
   ETL_DATE                 STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_web_browse';

--STG浏览平均数据表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_BROWSE_AVG_DATA  (
   TASK_NAME                STRING,
   MONITOR_COUNT            STRING,
   SUCCESS_COUNT            STRING,
   BASIC_DOC_DNS_TIME       STRING,
   BASIC_DOC_TCP_TIME       STRING,
   BASIC_DOC_REQUEST_TIME   STRING,
   BASIC_DOC_RESPONSE_TIME  STRING,
   BASIC_DOC_DOWNLOAD_TIME  STRING,
   BASIC_DOC_DOWNLOAD_SPEED STRING,
   OVERALL_SPEED            STRING,
   RENDER_SPEED             STRING,
   ERROR_COUNT              STRING,
   AVAILABILITY             STRING,
   DOWNLOAD_BYTES           STRING,
   PERFORMANCE              STRING,
   FIRST_SCREEN_TIME        STRING,
   PROJECTED_DNS_TIME       STRING,
   PROJECTED_TCP_TIME       STRING,
   PROJECTED_RESPONSE_TIME  STRING,
   PROJECTED_DOWNLOAD_TIME  STRING,
   BASIC_DOC_DOWNLOAD_BYTES STRING,
   AVG_DNS_TIME             STRING,
   AVG_TCP_TIME             STRING,
   AVG_RESPONSE_TIME        STRING,
   AVG_DOWNLOAD_TIME        STRING,
   TCP_CONNECT_COUNT        STRING,
   DNS_RESOLUTION_COUNT     STRING,
   SSL_HANDSHAKE_TIME       STRING,
   FIRST_PACKET_TIME        STRING,
   ROUNDTRIPS               STRING,
   TOTAL_ELEMENT_COUNT      STRING,
   AVG_ERR_ELEMENT_COUNT    STRING,
   TOTAL_ERR_ELEMENT_COUNT  STRING,
   ELEMENT_AVAILABILITY     STRING,
   ERROR_TYPE               STRING,
   ERROR_CITY               STRING,
   PASS_RATE                STRING,
   ELEMENT_HIJACK_COUNT     STRING,
   DOMAIN_HIJACK_COUNT      STRING,
   HIJACK_COUNT             STRING,
   HIJACK_RATE              STRING,
   AVG_ELEMENT_COUNT        STRING,
   DATA_SOURCE_CD           STRING,
   ETL_CYCLE                STRING,
   ETL_DATE                 STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_browse_avg_data';

--STG视频体验表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_VIDEO_VIEW  (
   TASK_ID                 STRING,
   TASK_NAME               STRING,
   TASK_URL                STRING,
   VIDEO_ERROR_DESC        STRING,
   MONITOR_DATE            STRING,
   TARGET_IP               STRING,
   BUFFER_COUNT            STRING,
   DOWNLOAD_SPEED          STRING,
   FRAME_SPEED             STRING,
   VIDEO_REAL_ADDRESS      STRING,
   DOWNLOAD_BYTES          STRING,
   DNS_TIME                STRING,
   TCP_CONNET_TIME         STRING,
   RESPONSE_TIME           STRING,
   PER_SEGMENT_PLAY_STATUS STRING,
   FIRST_BUFFER_TIME       STRING,
   BUFFER_TIME             STRING,
   TARGET_CITY             STRING,
   TARGET_OPERATOR         STRING,
   MONITOR_PROVINCE        STRING,
   MONITOR_CITY            STRING,
   MONITOR_OPERATOR        STRING,
   MONITOR_DNS             STRING,
   MONITOR_BANDWIDTH       STRING,
   MONITOR_IP              STRING,
   MONITOR_TYPE            STRING,
   MONITOR_CPU_USAGE       STRING,
   MONITOR_MEMORY_USAGE    STRING,
   CURRENT_AVG_SPEED       STRING,
   MONITOR_AD_PLAY_COUNT   STRING,
   MONITOR_PROCESSES       STRING,
   FIRST_PLAY_TIME         STRING,
   THROUGHPUT              STRING,
   PLAY_STATUS             STRING,
   PLAY_STATUS_TIME_POINT  STRING,
   INCREMENT_ID            STRING,
   MAIN_ID                 STRING,
   USER_NAME               STRING,
   TARGET_CITY_ID          STRING,
   TARGET_OPERATOR_ID      STRING,
   MONITOR_CITY_ID         STRING,
   MONITOR_OPERATOR_ID     STRING,
   INTERNAL_ERROR          STRING,
   PAGE_FIRST_PKG_TIME     STRING,
   PAGE_FIRST_SCREEN_TIME  STRING,
   VIDEO_FIRST_PKG_TIME    STRING,
   FIRST_FRAME_TIME        STRING,
   THROUGHPUT_TIME         STRING,
   TOTAL_SCHEDUL_TIME      STRING,
   SCHEDUL_COUNT           STRING,
   SCHEDUL_DNS             STRING,
   SCHEDUL_TCP             STRING,
   SCHEDUL_SEND            STRING,
   SCHEDUL_RESPONSE        STRING,
   SCHEDUL_DOWNLOAD_TIME   STRING,
   CLIENT_ONLY_ID          STRING,
   WAIT_TIME_RATE          STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_video_view';

--STG流媒体
CREATE EXTERNAL TABLE IF NOT EXISTS STG_STREAMING_MEDIA  (
   VALID_MONITOR_COUNT  STRING,
   TASK_NAME            STRING,
   TASK_ID              STRING,
   TOTAL_BUFFER_COUNT   STRING,
   TOTAL_DOWNLOAD_BYTES STRING,
   AVG_DOWNLOAD_SPEED   STRING,
   FRAME_SPEED          STRING,
   DNS_TIME             STRING,
   TCP_CONNET_TIME      STRING,
   FIRST_PLAY_TIME      STRING,
   RESPONSE_TIME        STRING,
   FIRST_BUFFER_TIME    STRING,
   TOATL_BUFFER_TIME    STRING,
   VIDEO_CONNET_TIME    STRING,
   FIRST_FRAME_TIME     STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_streaming_media';

--STG网络环境表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_NETWORK  (
   TASK_ID              STRING,
   TASK_NAME            STRING,
   TASK_URL             STRING,
   DNS_ERROR_DESC       STRING,
   A_ADDRESS            STRING,
   CNAME_ADDRESS        STRING,
   DNS_TIME             STRING,
   NS_SERVER_DOMAIN     STRING,
   NS_SERVER_IP         STRING,
   TIME_DELAY           STRING,
   ICMP_ERROR_DESC      STRING,
   ICMP_SERVER_IP       STRING,
   ICMP_COUNT           STRING,
   ICMP_OVERTIME_COUNT  STRING,
   TRACERT_SERVER_IP    STRING,
   TRACERT_COUNT        STRING,
   TRACERT_IP           STRING,
   TRACERT_ERROR_DESC   STRING,
   TRACERT_TIME         STRING,
   MONITOR_DATE         STRING,
   MONITOR_PROVINCE     STRING,
   MONITOR_CITY         STRING,
   MONITOR_OPERATOR     STRING,
   MONITOR_DNS          STRING,
   MONITOR_BANDWIDTH    STRING,
   MONITOR_TYPE         STRING,
   MONITOR_IP           STRING,
   MAIN_ID              STRING,
   INCREMENT_ID         STRING,
   DNS_DETAIL_INFO      STRING,
   CLIENT_CODE          STRING,
   PACKET_LOSS_RATE     STRING,
   TARGET_CITY          STRING,
   TARGET_OPERATOR      STRING,
   CLIENT_ID            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_network';

--STG电视收视日志表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TV_VIEW_LOG  (
   DATA_TYPE_ID         STRING,
   SERIAL_ID            STRING,
   BEGIN_TIME           STRING,
   EVENT_TYPE           STRING,
   EVENT_DESC           STRING,
   DURATION             STRING,
   CORP_CODE            STRING,   
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tv_view_log';

--STG电视频道节目单信息表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CHANNEL_PROGRAM  (
   CHANNEL_NAME         STRING,
   EVENT_ID             STRING,
   PROGRAM_NAME         STRING,
   BEGIN_TIME           STRING,
   DURATION             STRING,
   EVENT_TYPE           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_channel_program';

##STG电视频道节目单信息表（各地）
CREATE TABLE stg_channel_program_local(
  program_name string , 
  channel_name string , 
  begin_time string , 
  end_time string , 
  day_of_week string , 
  setime string , 
  program_type,
  broad_type,
  corp_code string ,      
  data_source_cd string )
PARTITIONED BY ( 
  pt_time string)
ROW FORMAT SERDE 
  'org.apache.hadoop.hive.serde2.OpenCSVSerde' 
WITH SERDEPROPERTIES ( 
  'escapeChar'='\\', 
  'quoteChar'='\"', 
  'separatorChar'=',') 
STORED AS textfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/STG/stg_channel_program_local'

--STG用户表
--注：这个表是在局方拿不到BOSS源表接口的情况下，整个boss数据只能采用一个表，此表数据来自报表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_RPT_INST_PROD  (
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   CUTOVER_ADDR_NAME    STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   CREATE_DATE          STRING,
   VALID_DATE           STRING,
   REMAINDER_DAYS       STRING,
   EXPIRE_DATE          STRING,
   STATUS_NAME          STRING,
   LOGIN_NAME           STRING,
   LAN_NUMBER           STRING,
   CORP_CODE            STRING
)PARTITIONED BY (PT_MON STRING)
ROW FORMAT SERDE 
  'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES ( 
  'escapeChar'='\\', 
  'quoteChar'='\"', 
  'separatorChar'=',')
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_rpt_inst_prod';

--STG产品表（手工）
CREATE EXTERNAL TABLE IF NOT EXISTS STG_PRODUCT  (
   PRODUCT_NAME         STRING,
   OFFER_NAME           STRING,
   BANDWIDTH            STRING,
   CYCLE                STRING,
   PRICE                STRING,
   FLAG                 STRING,
   CORP_CODE            STRING
)PARTITIONED BY (PT_MON STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_product';

--STG出口平均流量(月)
CREATE EXTERNAL TABLE IF NOT EXISTS STG_NET_FLOW_M  (
   CORP_CODE            STRING,
   IN_NET_FLOW          STRING,
   OUT_NET_FLOW         STRING
)PARTITIONED BY (PT_MON STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_net_flow_m';

--STG_NGINX日志表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_NGINX_LOG  (
   REMOTE_ADDR             STRING,
   TIME_LOCAL              STRING,
   REQUEST_URL             STRING,
   RE_STATUS               STRING,
   BODY_BYTES_S            STRING,
   HTTP_USER_AGENT         STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_nginx_log';

--STG用户安装记录
CREATE EXTERNAL TABLE IF NOT EXISTS STG_PROBE_SETUP_LOG  (
   ROW_ID               STRING,
   PROBE_ID             STRING,
   UID                  STRING,
   SETUP_TIME           STRING,
   REMOVE_TIME          STRING,
   ZONE_ID              STRING,
   ADDRESS              STRING,
   TOP_ID               STRING,
   RECONN_TIMES         STRING,
   REBOOT_TIMES         STRING,
   ADSL_ACCOUNT         STRING,
   IPTV_ACCOUNT         STRING,
   IP_ADDRESS           STRING,
   LAN_ADDRESS          STRING,
   IP_CHANGES           STRING,
   USER_DBAND           STRING,
   USER_UBAND           STRING,
   BAND_MEASURES        STRING,
   BAND_GOODS           STRING,
   APPLICATION_ERRORS   STRING,
   POS_LATITUDE         STRING,
   POS_LONGTITUDE       STRING,
   GW_HWADDR            STRING,
   GW_CHANGED           STRING,
   TAP_MODE             STRING,
   TO_TAP_MODE          STRING,
   ADSL_ID              STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_probe_setup_log';

--STG用户播放行为记录
CREATE EXTERNAL TABLE IF NOT EXISTS STG_USER_PLAY_RECORDS  (
   ROW_ID               STRING,
   SETUP_ID             STRING,
   TIME                 STRING,
   END_TIME             STRING,
   UUID                 STRING,
   VNAME                STRING,
   VSOURCE_ID           STRING,
   SHARPNESS            STRING,
   VTYPE                STRING,
   VID                  STRING,
   VTIME                STRING,
   PAUSE_TIMES          STRING,
   PAUSE_TIME           STRING,
   PAUSE_POINTS         STRING,
   SEEK_FW_TIMES        STRING,
   SEEK_FW_TIME         STRING,
   SEEK_RW_TIMES        STRING,
   SEEK_RW_TIME         STRING,
   SEEK_FW_RECORDS      STRING,
   SEEK_RW_RECORDS      STRING,
   BUFFER_TIMES         STRING,
   BUFFER_TIME          STRING,
   LABEL_ID             STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   BEFOR_URI            STRING,
   AFTER_URI            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_user_play_records';

--STG探针节点记录
CREATE EXTERNAL TABLE IF NOT EXISTS STG_VISQUAL_PROBES  (
   ROW_ID               STRING,
   SN                   STRING,
   TYPE                 STRING,
   OWNER_ID             STRING,
   HWADDR               STRING,
   VENDOR               STRING,
   MODEL                STRING,
   VERSION              STRING,
   ACTIVE               STRING,
   ONLINE_TIMES         STRING,
   HISTORY_USERS        STRING,
   CURRENT_USERS        STRING,
   ALARM_TEMPLATE_ID    STRING,
   UPDATE_VERSION       STRING,
   SERVICE_OBJECT_TYPE  STRING,
   SW_UPDATE            STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   RECORD_ZBX           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_visqual_probes';

--STG网址库
CREATE EXTERNAL TABLE IF NOT EXISTS STG_URL_TYPE  (
   TYPE                 STRING,
   TITLE                STRING,
   URL                  STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_url_type';

--STG会话日志
CREATE EXTERNAL TABLE IF NOT EXISTS STG_SESSION_LOG  (
   SOURCE_IP            STRING,
   TARGET_IP            STRING,
   NAT_IP               STRING,
   SOURCE_PORT          STRING,
   TARGET_PORT          STRING,
   NAT_PORT             STRING,
   START_TIME           STRING,
   END_TIME             STRING,
   DOWN_FLOW            STRING,
   UP_FLOW              STRING,
   CONTENT_ID           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_session_log';

--STG_URL日志
CREATE EXTERNAL TABLE IF NOT EXISTS STG_URL_LOG  (
   SOURCE_IP            STRING,
   TARGET_IP            STRING,
   SOURCE_PORT          STRING,
   TARGET_PORT          STRING,
   START_TIME           STRING,
   END_TIME             STRING,
   DOWN_FLOW            STRING,
   UP_FLOW              STRING,
   CONTENT_ID           STRING,
   URL                  STRING,
   HOST                 STRING,
   REQUEST_TYPE         STRING,
   USER_AGENT           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_url_log';

--STG运营商地址段
CREATE EXTERNAL TABLE IF NOT EXISTS STG_OPERATOR_IP  (
   START_IP             STRING,
   END_IP               STRING,
   BELONG               STRING,
   OPERATOR             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ' '
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_operator_ip';

--STG应用表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_CONTENT  (
   CONTENT_ID           STRING,
   CONTENT_TYPE         STRING,
   CONTENT_NAME         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ' '
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_content';

--STG全流量协议分析数据
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_TRAFFIC  (
   NODEID               STRING,
   TRAFFIC_ID           STRING,
   TRAFFIC_TYPE         STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_traffic';

--STG分区流量数据
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_PART_LOG  (
   NODEID               STRING,
   PART_ID              STRING,
   PART_NAME            STRING,
   CYCLE_HALF_CONNS     STRING,
   CYCLE_SESSIONS       STRING,
   CYCLE_SP_CONNS       STRING,
   CURR_HOSTS           STRING,
   CURR_SESSIONS        STRING,
   CURR_HALF_CONNS      STRING,
   AVG_CONN_US_IN       STRING,
   AVG_CONN_US_OUT      STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_part_log';

--STG分区流量协议分析数据
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_PART_APP_LOG  (
   NODEID               STRING,
   CP_ID                STRING,
   CONTENT_ID           STRING,
   REFS                 STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_part_app_log';

--STG目标地址流量排名
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_SESSION_DST_BYTES_TOPN  (
   NODEID               STRING,
   DST_IP               STRING,
   AS_NAME              STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   TOTAL_BYTES          STRING,
   DATA_FLAG            STRING,
   DATA_TYPE            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_session_dst_bytes_topn';

--STG应用目标地址流量排名
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_DST_CONTENT_TOPN  (
   NODEID               STRING,
   DST_IP               STRING,
   CONTENTID            STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   TOTAL_BYTES          STRING,
   DATA_FLAG            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_dst_content_topn';

--STG总体域名流量排名
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_DNAME_TOPN  (
   NODEID               STRING,
   DST_IP               STRING,
   HOST_TEXT            STRING,
   AS_NAME              STRING,
   AS_TYPE              STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   TOTAL_BYTES          STRING,
   DATA_FLAG            STRING,
   DATA_TYPE            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_dname_topn';

--STG来源地址流量排名
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_SESSION_SRC_BYTES_TOPN  (
   NODEID               STRING,
   SRC_IP               STRING,
   IN_BYTES             STRING,
   OUT_BYTES            STRING,
   TOTAL_BYTES          STRING,
   DATA_FLAG            STRING,
   DATA_TYPE            STRING,
   CREATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_session_src_bytes_topn';

--STG_AS域流量统计
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TBL_AS_SUM_REPORT_ALL  (
   NODEID               STRING,
   CREATE_TIME          STRING,
   AS_NAME              STRING,
   AS_TYPE              STRING,
   CONTENT_ID           STRING,
   BYTES_IN             STRING,
   BYTES_OUT            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tbl_as_sum_report_all';


--STG电视频道信息表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TV_AM_CHANNEL_INFO  (
   MAC_ADDR             STRING,
   CREATE_TIME          STRING,
   CHANNEL_NUM          STRING,
   CHANNEL_TYPE         STRING,
   CHANNEL_NAME         STRING,
   CHANNEL_PID          STRING,
   CHANNEL_VID          STRING,
   CHANNEL_AID          STRING,
   CHANNEL_VOLUME       STRING,
   CHANNEL_FREQUENCE    STRING,
   CERTIFICATE          STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tv_am_channel_info';


--STG电视开关机表
CREATE EXTERNAL TABLE IF NOT EXISTS STG_TV_PB_POWER_ONOFF  (
   MAC_ADDR             STRING,
   CREATE_TIME          STRING,
   OP_TYPE              STRING,
   IP                   STRING,
   CHECKED              STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '^'
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/STG/stg_tv_pb_power_onoff';


-- STG点播回看详单表
create table stg_dr_ismp_yyyymm
(
TRADEMARK string,
DR_TYPE string,
SERVICE_ID string,
BILL_MONTH string,
VALID_RATE_PROD_ID string,
RATE_PROD_ID string,
PRODUCT_ID string,
PROMOTION_PRODS string,
PLAN_ID string,
CUST_ID string,
ACC_ID string,
USER_ID string,
CONDITION_ID string,
USER_NUMBER string,
HPLMN1 string,
HPLMN2 string,
HPLMN3 string,
START_TIME string,
STOP_TIME string,
RATING_RES string,
RATING_FLAG string,
ITEM_CODE1 string,
CHARGE1 string,
CHARGE1_DISC string,
ITEM_CODE2 string,
CHARGE2 string,
CHARGE2_DISC string,
ITEM_CODE3 string,
CHARGE3 string,
CHARGE3_DISC string,
ITEM_CODE4 string,
CHARGE4 string,
CHARGE4_DISC string,
FREE_RES_VAL string,
ADDUP_RES_VAL string,
SEQUENCE_NO string,
RECORD_TYPE string,
OPP_NUMBER string,
CP_CODE string,
CONTENT_ID string,
SERVICE_CODE string,
PPV_ID string,
BILL_FLAG string,
ORI_BASIC_CHARGE string,
ORI_OTHER_CHARGE string,
STD_BASIC_CHARGE string,
STD_OTHER_CHARGE string,
PROCESS_TIME string,
ORIGINAL_FILE string,
CORP_ORG_ID string,
ROAM_TYPE string,
USER_TYPE string,
BACKUP_DATE string,
REDO_FLAG string,
RESERVE1 string,
RESERVE2 string,
RESERVE3 string,
RESERVE4 string,
FILM_NAME string,
USER_PROPERTY string,
MONITOR_CDR string,
STD_ERR_CODE string,
ACC_ITEM_CODE1 string,
ACC_ITEM_CODE2 string,
ACC_ITEM_CODE3 string,
ACC_ITEM_CODE4 string,
LATE_LINK string,
INPUT_TIME string,
ROW_ID string,
OWN_CORP_STD_ORG_CODE string,
DATA_SOURCE_CD string,
IS_HISTORY_DATA string,
ETL_CYCLE string,
ETL_DATE string,
CHANNELID string,
CHANNELNAME string
)
partitioned by (pt_mon string)
 ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
 WITH SERDEPROPERTIES (
    "separatorChar" = ",",
    "quoteChar"     = "\"",
    "escapeChar"    = "\\"
 )
stored as textfile
location '/asiainfo/hive/STG/stg_dr_ismp_yyyymm'


-- stg 用户日全量表 BOSS2
CREATE TABLE `stg_fact_ins_prod_boss2`(
  `prod_inst_id` decimal(14,0), 
  `offer_inst_id` decimal(12,0), 
  `offer_id` decimal(12,0), 
  `brand_id` decimal(12,0), 
  `prod_spec_id` decimal(12,0), 
  `cust_id` decimal(14,0), 
  `acct_id` decimal(14,0), 
  `pay_type` decimal(2,0), 
  `user_type_id` decimal(2,0), 
  `bill_id` varchar(120), 
  `sub_bill_id` varchar(120), 
  `main_prod_inst_id` decimal(14,0), 
  `bill_start_timestamp` timestamp, 
  `user_name` varchar(255), 
  `user_prop` decimal(8,0), 
  `user_group` decimal(12,0), 
  `vip_flag` decimal(2,0), 
  `vip_prop` varchar(12), 
  `boder_flag` decimal(2,0), 
  `subsidy_flag` decimal(2,0), 
  `subsidy_prop` varchar(12), 
  `degree_flag` decimal(2,0), 
  `first_use_timestamp` timestamp, 
  `state` varchar(3), 
  `state_timestamp` timestamp, 
  `oper_state` decimal(2,0), 
  `os_status` varchar(30), 
  `address_id` decimal(12,0), 
  `install_addr_id` decimal(14,0), 
  `install_addr_name` varchar(255), 
  `cont_id` decimal(12,0), 
  `post_mode` decimal(2,0), 
  `post_address_id` decimal(12,0), 
  `access_mode` decimal(2,0), 
  `login_name` varchar(255), 
  `tv_number` varchar(15), 
  `region_id` varchar(6), 
  `sale_op_id` decimal(12,0), 
  `sale_org_id` decimal(12,0), 
  `warrant_cust_id` decimal(12,0), 
  `valid_timestamp` timestamp, 
  `expire_timestamp` timestamp, 
  `create_timestamp` timestamp, 
  `create_op_id` decimal(12,0), 
  `create_org_id` decimal(12,0), 
  `done_timestamp` timestamp, 
  `done_code` decimal(15,0), 
  `op_id` decimal(12,0), 
  `org_id` decimal(12,0), 
  `district_id` decimal(8,0), 
  `corp_org_id` decimal(12,0), 
  `own_corp_std_org_code` varchar(20), 
  `own_region_std_org_code` varchar(20), 
  `std_dis_code` varchar(20), 
  `is_atv` decimal(1,0), 
  `is_dtv` decimal(1,0), 
  `is_dftv` decimal(1,0), 
  `is_dbitv` decimal(1,0), 
  `is_ditv` decimal(1,0), 
  `is_lan` decimal(1,0), 
  `is_voip` decimal(1,0), 
  `is_amsp` decimal(1,0), 
  `is_ext1` decimal(1,0), 
  `is_ext2` decimal(1,0), 
  `is_cloud_media` decimal(1,0), 
  `is_hdtv` decimal(1,0), 
  `is_online` decimal(1,0), 
  `is_atv_online` decimal(1,0), 
  `is_dtv_online` decimal(1,0), 
  `is_dftv_online` decimal(1,0), 
  `is_dbitv_online` decimal(1,0), 
  `is_ditv_online` decimal(1,0), 
  `is_lan_online` decimal(1,0), 
  `is_voip_online` decimal(1,0), 
  `is_amsp_online` decimal(1,0), 
  `is_ext1_online` decimal(1,0), 
  `is_ext2_online` decimal(1,0), 
  `is_hdtv_online` decimal(1,0), 
  `is_up_marketing` decimal(1,0), 
  `is_main` decimal(1,0), 
  `is_second` decimal(1,0), 
  `is_mngbyself` decimal(1,0), 
  `is_mngbycorp` decimal(1,0), 
  `is_trans` decimal(1,0), 
  `is_virtual` decimal(1,0), 
  `is_opening` decimal(1,0), 
  `is_valid` decimal(1,0), 
  `is_valid1` decimal(1,0), 
  `is_valid2` decimal(1,0), 
  `is_expire_ten_days` decimal(1,0), 
  `is_suspend` decimal(1,0), 
  `is_itv_active` decimal(1,0), 
  `is_debt_stop` decimal(1,0), 
  `is_debt_cut` decimal(1,0), 
  `is_mana_stop` decimal(1,0), 
  `is_free` decimal(1,0), 
  `is_paied` decimal(1,0), 
  `is_new` decimal(1,0), 
  `is_new_online` decimal(1,0), 
  `is_lose` decimal(1,0), 
  `is_lose1` decimal(1,0), 
  `is_lose_online` decimal(1,0), 
  `tv_pay_status` decimal(1,0), 
  `is_ins` decimal(1,0), 
  `data_source_cd` varchar(10), 
  `is_history_data` decimal(1,0), 
  `etl_cycle` decimal(14,0), 
  `etl_timestamp` timestamp)
PARTITIONED BY ( 
  `pt_mon` string)
STORED AS textfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/STG/stg_fact_ins_prod_boss2'


-- STG客户全量表BOSS1
CREATE TABLE stg_fact_cust_b1(
  cust_id DECIMAL(16), 
  cust_code string, 
  old_cust_id string, 
  old_cust_code string, 
  cust_name string, 
  cust_type DECIMAL(1), 
  cust_level DECIMAL(2), 
  cust_status DECIMAL(1), 
  cust_cert_type DECIMAL(2), 
  cust_cert_no string, 
  cust_cert_addr string, 
  cert_valid_date timestamp, 
  cert_expire_date timestamp, 
  cust_occupation DECIMAL(2), 
  border_flag DECIMAL(2), 
  create_date timestamp, 
  create_op_id DECIMAL(16), 
  create_org_id DECIMAL(16), 
  valid_date timestamp, 
  expire_date timestamp, 
  done_date timestamp, 
  done_code DECIMAL(16), 
  op_id DECIMAL(16), 
  org_id DECIMAL(16), 
  corp_org_id DECIMAL(16), 
  own_corp_std_org_code string, 
  own_region_std_org_code string, 
  cust_prop DECIMAL(16), 
  atv_count DECIMAL(16), 
  dtv_count DECIMAL(16), 
  dftv_count DECIMAL(16), 
  dbitv_count DECIMAL(16), 
  ditv_count DECIMAL(16), 
  lan_count DECIMAL(16), 
  voip_count DECIMAL(16), 
  amsp_count DECIMAL(16), 
  ext1_count DECIMAL(16), 
  ext2_count DECIMAL(16), 
  hdtv_count DECIMAL(16), 
  hditv_count DECIMAL(16), 
  cloud_media_count DECIMAL(16), 
  user_count DECIMAL(16), 
  second_user_count DECIMAL(16), 
  is_cloud_media DECIMAL(1), 
  is_vaild DECIMAL(1), 
  is_vaild1 DECIMAL(1), 
  is_vaild2 DECIMAL(1), 
  is_dtv_suspend DECIMAL(1), 
  is_lan_suspend DECIMAL(1), 
  is_voip_suspend DECIMAL(1), 
  is_dtv_debt_stop DECIMAL(1), 
  is_lan_debt_stop DECIMAL(1), 
  is_voip_debt_stop DECIMAL(1), 
  is_dtv_paied DECIMAL(1), 
  is_lan_paied DECIMAL(1), 
  is_voip_paied DECIMAL(1), 
  is_free DECIMAL(1), 
  is_paied DECIMAL(1), 
  is_unpay DECIMAL(1), 
  is_itv_active DECIMAL(1), 
  is_new DECIMAL(1), 
  is_lose DECIMAL(1), 
  have_switch_on DECIMAL(1), 
  tv_pay_status DECIMAL(1), 
  tv_game_status DECIMAL(1), 
  is_ins DECIMAL(1), 
  is_exchange DECIMAL(1), 
  cust_type1 DECIMAL(1), 
  data_source_cd string, 
  is_history_data DECIMAL(1), 
  etl_cycle DECIMAL(16), 
  etl_date timestamp)
COMMENT 'Imported by sqoop on 2018/10/15 11:19:05'
PARTITIONED BY ( 
  pt_mon string)
stored AS textfile
LOCATION
  '/asiainfo/hive/STG/stg_fact_cust_b1'


-- STG客户全量表BOSS2
CREATE TABLE stg_fact_cust_b2(
  CUST_ID                       DECIMAL(14)     ,
  CUST_CODE                     STRING   ,
  OLD_CUST_ID                   STRING   ,
  OLD_CUST_CODE                 STRING   ,
  CUST_NAME                     STRING  ,
  CUST_TYPE                     DECIMAL(1)      ,
  CUST_LEVEL                    DECIMAL(2)      ,
  CUST_STATUS                   DECIMAL(1)      ,
  CUST_CERT_TYPE                DECIMAL(2)      ,
  CUST_CERT_NO                  STRING   ,
  CUST_CERT_ADDR                STRING  ,
  CERT_VALID_date               TIMESTAMP           ,
  CERT_EXPIRE_date              TIMESTAMP           ,
  CUST_OCCUPATION               DECIMAL(2)      ,
  BORDER_FLAG                   DECIMAL(2)      ,
  CREATE_date                   TIMESTAMP           ,
  CREATE_OP_ID                  DECIMAL(12)     ,
  CREATE_ORG_ID                 DECIMAL(12)     ,
  VALID_date                    TIMESTAMP           ,
  EXPIRE_date                   TIMESTAMP           ,
  DONE_date                     TIMESTAMP           ,
  DONE_CODE                     DECIMAL(15)     ,
  OP_ID                         DECIMAL(12)     ,
  ORG_ID                        DECIMAL(12)     ,
  DISTRICT_ID                   DECIMAL(8)      ,
  CORP_ORG_ID                   DECIMAL(12)     ,
  STD_ORG_CODE                             STRING   ,
  OWN_CORP_STD_ORG_CODE                    STRING   ,
  OWN_REGION_STD_ORG_CODE                  STRING   ,
  STD_DIS_CODE                             STRING   ,
  CUST_PROP                                DECIMAL(8)      ,
  ATV_COUNT                                DECIMAL(8)      ,
  DTV_COUNT                                DECIMAL(8)      ,
  DFTV_COUNT                               DECIMAL(8)      ,
  DBITV_COUNT                              DECIMAL(8)      ,
  DITV_COUNT                               DECIMAL(8)      ,
  LAN_COUNT                                DECIMAL(8)      ,
  VOIP_COUNT                               DECIMAL(8)      ,
  AMSP_COUNT                               DECIMAL(8)      ,
  EXT1_COUNT                               DECIMAL(8)      ,
  EXT2_COUNT                               DECIMAL(8)      ,
  HDTV_COUNT                               DECIMAL(8)      ,
  HDITV_COUNT                              DECIMAL(8)      ,
  USER_COUNT                               DECIMAL(8)      ,
  SECOND_USER_COUNT                        DECIMAL(8)      ,
  IS_CLOUD_MEDIA                           DECIMAL(1)      ,
  IS_VALID                                 DECIMAL(1)      ,
  IS_VALID1                                DECIMAL(1)      ,
  IS_VALID2                                DECIMAL(1)      ,
  IS_ONLINE                                DECIMAL(1)      ,
  IS_DTV_SUSPEND                           DECIMAL(1)      ,
  IS_LAN_SUSPEND                           DECIMAL(1)      ,
  IS_VOIP_SUSPEND                          DECIMAL(1)      ,
  IS_DEBT_STOP                             DECIMAL(1)      ,
  IS_DEBT_CUT                              DECIMAL(1)      ,
  IS_DTV_MANA_STOP                         DECIMAL(1)      ,
  IS_LAN_MANA_STOP                         DECIMAL(1)      ,
  IS_FREE                                  DECIMAL(1)      ,
  IS_PAIED                                 DECIMAL(1)      ,
  IS_UNPAY                                 DECIMAL(1)      ,
  IS_ITV_ACTIVE                            DECIMAL(1)      ,
  IS_NEW                                   DECIMAL(1)      ,
  IS_LOSE                                  DECIMAL(1)      ,
  IS_LOSE1                                 DECIMAL(1)      ,
  HAVE_SWITCH_ON                           DECIMAL(1)      ,
  TV_PAY_STATUS                            DECIMAL(1)      ,
  TV_GAME_STATUS                           DECIMAL(1)      ,
  IS_HOUSE                                 DECIMAL(1)      ,
  IS_INS                                   DECIMAL(1)      ,
  DATA_SOURCE_CD                           STRING   ,
  IS_HISTORY_DATA                          DECIMAL(1)      ,
  ETL_CYCLE                                DECIMAL(14)     ,
  ETL_date                                 TIMESTAMP,
  IS_DTV_PAIED                             DECIMAL(1)
)
PARTITIONED BY ( 
  pt_mon string)
stored AS textfile
LOCATION
'/asiainfo/hive/STG/stg_fact_cust_b2'


-- STG客户住宅表BOSS1
CREATE TABLE STG_FACT_INS_ADDRESS_B1  (
  CUST_ID             DECIMAL(14)  ,
  CUST_ADDR_ID        DECIMAL(14)  ,
  STD_ADDR_ID         VARCHAR(30),
  STD_ADDR_NAME       VARCHAR(255),
  MOVE_FLAG           DECIMAL(2),
  REGION_ID           VARCHAR(6),
  DOOR_NAME           VARCHAR(255),
  RELOCATE_FLAG       DECIMAL(2),
  CAN_TRANSFER_FLAG   DECIMAL(2),
  TRANSFER_STATUS     DECIMAL(2),
  TRANSFER_NO         VARCHAR(64),
  AUDIT_FLAG          DECIMAL(2),
  STREET_STD_ADDR_ID  VARCHAR(30),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    VARCHAR(30),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  MGR_ADDR_ID         VARCHAR(30),
  MGR_ADDR_NAME       VARCHAR(255),
  DISTRICT_ID         VARCHAR(30),
  DISTRICT_NAME       VARCHAR(100),
  VALID_DATE          TIMESTAMP  ,
  EXPIRE_DATE         TIMESTAMP  ,
  CREATE_DATE         TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12),
  CREATE_ORG_ID       DECIMAL(12),
  OWN_ORG_ID          DECIMAL(12),
  OWN_CORP_ORG_ID     DECIMAL(12),
  DONE_DATE           TIMESTAMP,
  DONE_CODE           DECIMAL(15),
  OP_ID               DECIMAL(12),
  ORG_ID              DECIMAL(12),
  STD_ORG_CODE        VARCHAR(20),
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  DATA_SOURCE_CD      VARCHAR(10),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP 
)
PARTITIONED BY ( 
  pt_mon string)
stored AS textfile
LOCATION
'/asiainfo/hive/STG/stg_fact_ins_address_b1'
;


-- STG客户住宅表BOSS2
CREATE TABLE STG_FACT_INS_ADDRESS_B2  (
  CUST_ADDR_ID        DECIMAL(14) ,
  CUST_ID             DECIMAL(14),
  STD_ADDR_ID         VARCHAR(40),
  STD_ADDR_NAME       VARCHAR(255),
  MOVE_FLAG           DECIMAL(2),
  REGION_ID           VARCHAR(6),
  DOOR_NAME           VARCHAR(255),
  RELOCATE_FLAG       DECIMAL(2),
  CAN_TRANSFER_FLAG   DECIMAL(2),
  TRANSFER_STATUS     DECIMAL(2),
  TRANSFER_NO         VARCHAR(64),
  AUDIT_FLAG          DECIMAL(2),
  STREET_STD_ADDR_ID  DECIMAL(14),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    DECIMAL(14),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  BUILD_STD_ADDR_ID   DECIMAL(14),
  BUILD_STD_ADDR_NAME VARCHAR(255),
  MGR_ADDR_ID         DECIMAL(14),
  MGR_ADDR_NAME       VARCHAR(255),
  DISTRICT_ID         DECIMAL(8),
  DISTRICT_NAME       VARCHAR(100),
  VALID_DATE         TIMESTAMP ,
  EXPIRE_DATE        TIMESTAMP ,
  CREATE_DATE        TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12),
  CREATE_ORG_ID       DECIMAL(12),
  OWN_ORG_ID          DECIMAL(12),
  OWN_CORP_ORG_ID     DECIMAL(12),
  DONE_DATE          TIMESTAMP,
  DONE_CODE           DECIMAL(15),
  OP_ID               DECIMAL(12),
  ORG_ID              DECIMAL(12),
  STD_ORG_CODE        VARCHAR(20),
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  STD_DIS_CODE        VARCHAR(20) ,
  DATA_SOURCE_CD      VARCHAR(10),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE           TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
stored AS textfile
LOCATION
'/asiainfo/hive/STG/stg_fact_ins_address_b2'
;

-- STG 客户网格关系表 BOSS1 
CREATE TABLE STG_GS_CUST_GRID_REL_B1  (
  CUST_ID             DECIMAL(16),
  GRID_ID             DECIMAL(16),
  GRID_NAME           VARCHAR(200),
  GRID_TYPE           DECIMAL(2),
  MGR_DEPT_ID         DECIMAL(16),
  MGR_DEPT_NAME       VARCHAR(200),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  NOTES               VARCHAR(200),
  ORG_NAME            VARCHAR(200),
  REGION_ID           DECIMAL(16),
  REGION_NAME         VARCHAR(200),
  TEAM_ID             DECIMAL(16),
  DATA_SOURCE_CD      VARCHAR(20),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon CHAR(6))
stored AS textfile
LOCATION
'/asiainfo/hive/STG/stg_gs_cust_grid_rel_b1'
;



-- STG 客户网格关系表 BOSS2 
CREATE TABLE STG_GS_CUST_GRID_REL_B2  (
  CUST_ID             DECIMAL(16),
  GRID_ID             DECIMAL(16),
  GRID_NAME           VARCHAR(200),
  GRID_TYPE           DECIMAL(2),
  MGR_DEPT_ID         DECIMAL(16),
  MGR_DEPT_NAME       VARCHAR(200),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  NOTES               VARCHAR(200),
  ORG_NAME            VARCHAR(200),
  REGION_ID           DECIMAL(16),
  REGION_NAME         VARCHAR(200),
  TEAM_ID             DECIMAL(16),
  DATA_SOURCE_CD      VARCHAR(20),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon CHAR(6))
stored AS textfile
LOCATION
'/asiainfo/hive/STG/stg_gs_cust_grid_rel_b2'
;



-- STG产品单元(BOSS2)
CREATE TABLE STG_UP_PRODUCT_ITEM_B2  (
   PRODUCT_ITEM_ID      DECIMAL(12),
   EXTEND_ID            DECIMAL(12),
   CODE                 VARCHAR(50),
   NAME                 VARCHAR(200),
   ITEM_TYPE            VARCHAR(40),
   PRIORITY             DECIMAL(6),
   SORT_BY              DECIMAL(6),
   DESCRIPTION          VARCHAR(255),
   CREATER              DECIMAL(12),
   MODIFIER             DECIMAL(12),
   STATE                DECIMAL(2),
   DEL_FLAG             DECIMAL(2),
   REMARK               VARCHAR(255),
   CREATE_DATE          TIMESTAMP,
   MODIFY_DATE          TIMESTAMP,
   VALID_DATE           TIMESTAMP,
   EXPIRE_DATE          TIMESTAMP,
   USE_EFF_DATE         TIMESTAMP,
   USE_EXP_DATE         TIMESTAMP,
   ENT_ID               DECIMAL(12),
   CHECKER              DECIMAL(12),
   ISLOCK               DECIMAL(2),
   SUPPLIER_ID          VARCHAR(20),
   PROVIDER_TYPE        DECIMAL(2),
   BUSINESS_DOMAIN_ID   VARCHAR(1000),
   PLATFORM_ID          DECIMAL(12),
   EXTEND_ID2           VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   EXT1               DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS textfile
LOCATION '/asiainfo/hive/STG/stg_up_product_item_b2'
;

-- STG产品订购月全量表(BOSS1)
CREATE TABLE STG_FACT_INS_SRVPKG  (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_NEW               DECIMAL(1),
   IS_NEW_ONLINE        DECIMAL(1),
   IS_CANCEL            DECIMAL(1),
   IS_CANCEL_ONLINE     DECIMAL(1),
   IS_INS               DECIMAL(1),
   IS_ONLINE            DECIMAL(1),
   PAR_VALUE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP 
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS textfile
LOCATION '/asiainfo/hive/STG/stg_fact_ins_srvpkg'
;

-- STG产品订购月全量表(BOSS1)
CREATE TABLE STG_FACT_INS_SRVPKG_b2  (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_UP_MARKETING      DECIMAL(1),
   IS_NEW               DECIMAL(1),
   IS_NEW_ONLINE        DECIMAL(1),
   IS_CANCEL            DECIMAL(1),
   IS_CANCEL_ONLINE     DECIMAL(1),
   IS_INS               DECIMAL(1),
   IS_ONLINE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS textfile
LOCATION '/asiainfo/hive/STG/stg_fact_ins_srvpkg_b2'

```

###### 2.2 日志采集

```
auth日志采集：
	- 第一步：通过ftp将每天的日志传输到21号机的/home/ftpuser/auth
	- 第二步：在22号机/opt/dolphin/auth_log中配置flume采集/home/ftpuser/auth中的日志，并存储到22号机的/opt/data/auth/stg_brd_auth_log/中
	- 第三步：运行21号机/AiInsight/stg/中的脚本，将22号机的/opt/data/auth/stg_brd_auth_log/中的日志临时复制一份过来，存储在/AiInsight/download/中
	- 第四步：通过21号机的脚本将存储在/AiInsight/download/中的日志加载到hive表
```

###### 2.3 stg_arpu

sqoop

```
#!/bin/bash
#######################################################
#定义变量
#######################################################
#模块名称
folder="jsbi"
#目标库名
target_database="default"
#目标表名
target_table_name="stg_arpu"
#源数据库表名（必须大写）
source_table_name="REP.KD_ARPU_2019"
#######################################################
#脚本开始
##########################################g#############
#运行日期
( echo $1 | grep "\<[0-9]\{8\}\>" -q ) && { v_cycle=$1; }
[ ! $v_cycle ] && { v_cycle=`cat /AiInsight/config/pyparameter`; }
#数据日期
etl_cycle=$(date -d "$v_cycle -1 month" +%Y%m)  # 上月
data_cycle=$(date -d "${etl_cycle}01 +1 month -1 day" +%Y%m%d)  #上月最后一天

echo ${etl_cycle}
echo ${data_cycle}
#加载数据到目标表中
su - hdfs <<EOF
/usr/bin/sqoop  --options-file /AiInsight/sqoop/hive_import.txt  --table ${source_table_name}  --hive-table  ${target_database}.${target_table_name} --hive-partition-key pt_mon --hive-partition-value "${etl_cycle}"

exit;
EOF
```





#### 第三章 明细层DWD

###### DDL建表语句

```
--DWD客户资料(3.0)
CREATE TABLE IF NOT EXISTS DWD_CM_CUSTOMER  (
   CUST_ID               STRING,
   CUST_CODE             STRING,
   OLD_CUST_ID           STRING,
   OLD_CUST_CODE         STRING,
   CUST_NAME             STRING,
   CUST_NAME_SHORT       STRING,
   CUST_PASSWD           STRING,
   CUST_TYPE             STRING,
   CUST_LEVEL            STRING,
   CUST_STATUS           STRING,
   CUST_STATUS_DATE      STRING,
   CUST_CERT_TYPE        STRING,
   CUST_CERT_NO          STRING,
   CUST_CERT_ADDR        STRING,
   CERT_VALID_DATE       STRING,
   CERT_EXPIRE_DATE      STRING,
   CUST_OCCUPATION       STRING,
   COMPANY_NAME          STRING,
   COMPANY_ADDR          STRING,
   BORDER_FLAG           STRING,
   REGION_ID             STRING,
   OWN_ORG_ID            STRING,
   SALE_ORG_ID           STRING,
   OWN_CORP_ORG_ID       STRING,
   CREATE_OP_ID          STRING,
   CREATE_ORG_ID         STRING,
   CREATE_DATE           STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   DONE_DATE             STRING,
   DONE_CODE             STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   REMARK                STRING,
   COUNTY_ID             STRING,
   CUST_PROP             STRING,
   CUST_ORDER_ID         STRING,
   MS_AREA_ID            STRING,
   MS_AREA_NAME          STRING,
   MANAGER_ID            STRING,
   MANAGER_NAME          STRING,
   MANAGER_PHONE         STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_cm_customer';

--DWD客户住宅表(3.0)
CREATE TABLE IF NOT EXISTS DWD_INS_ADDRESS  (
   CUST_ADDR_ID         STRING,
   CUST_ID		        STRING,
   STD_ADDR_ID          STRING,
   STD_ADDR_NAME        STRING,
   DOOR_NAME            STRING,
   RELOCATE_FLAG        STRING,
   CAN_TRANSFER_FLAG    STRING,
   TRANSFER_STATUS      STRING,
   AUDIT_FLAG           STRING,
   MOVE_FLAG            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   TRANSFER_NO          STRING,
   CUST_ORDER_ID        STRING,
   SET_ADDR_ID          STRING,
   SET_ADDR_NAME        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ins_address';

--DWD客户住宅表历史表(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_INS_ADDRESS  (
   H_ID                 STRING,
   CUST_ADDR_ID         STRING,
   CUST_ID              STRING,
   STD_ADDR_ID          STRING,
   STD_ADDR_NAME        STRING,
   DOOR_NAME            STRING,
   RELOCATE_FLAG        STRING,
   CAN_TRANSFER_FLAG    STRING,
   TRANSFER_STATUS      STRING,
   AUDIT_FLAG           STRING,
   MOVE_FLAG            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   CREATE_OP_ID         STRING,
   CREATE_ORG_ID        STRING,
   REGION_ID            STRING,
   OWN_ORG_ID           STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_DATE            STRING,
   DONE_CODE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   TRANSFER_NO          STRING,
   CUST_ORDER_ID        STRING,
   SET_ADDR_ID          STRING,
   SET_ADDR_NAME        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ins_address';

--DWD组织表(3.0)
CREATE TABLE IF NOT EXISTS DWD_SEC_ORGANIZE  (
   ORGANIZE_ID          STRING,
   ORGANIZE_NAME        STRING,
   CODE                 STRING,
   DISTRICT_ID          STRING,
   SHORT_NAME           STRING,
   ENGLISH_NAME         STRING,
   MEMBER_NUM           STRING,
   MANAGER_NAME         STRING,
   EMAIL                STRING,
   PHONE_ID             STRING,
   FAX_ID               STRING,
   ORG_ADDRESS          STRING,
   CONTACT_NAME         STRING,
   CONTACT_CARD_TYPE    STRING,
   CONTACT_CARD_ID      STRING,
   CONTACT_BILL_ID      STRING,
   POSTCODE             STRING,
   POST_PROVINCE        STRING,
   POST_CITY            STRING,
   POST_ADDRESS         STRING,
   POST_POSTCOD         STRING,
   COUNTY_ID            STRING,
   IS_LEAF              STRING,
   ORG_LEVEL            STRING,
   ORG_AREA_TYPE        STRING,
   ORG_COOP_TYPE        STRING,
   IS_CHANNEL           STRING,
   NOTES                STRING,
   STATE                STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   STD_ORG_CODE         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_sec_organize';

--DWD员工表(3.0)
CREATE TABLE IF NOT EXISTS DWD_SEC_STAFF  (
   STAFF_ID             STRING,
   STAFF_NAME           STRING,
   ORGANIZE_ID          STRING,
   PARENT_STAFF_ID      STRING,
   SHORT_NAME           STRING,
   ENGLISH_NAME         STRING,
   CARD_TYPE_ID         STRING,
   CARD_NO              STRING,
   BIRTHDAY             STRING,
   MARRY_STATUS         STRING,
   GENDER               STRING,
   RELIGION             STRING,
   NATIONAL_TYPE        STRING,
   EDUCATION_LEVEL      STRING,
   INCOME_LEVEL         STRING,
   POLITICS_FACE        STRING,
   JOB_POSITION         STRING,
   JOB_COMPANY          STRING,
   JOB_DESC             STRING,
   HOME_TEL             STRING,
   OFFICE_TEL           STRING,
   BILL_ID              STRING,
   WIRELESS_CALL        STRING,
   EMAIL                STRING,
   FAMILY_INFO          STRING,
   CONTACT_ADDRESS      STRING,
   POSTCODE             STRING,
   SECURITY_ID          STRING,
   CAR_NO               STRING,
   CHARACTER_DESC       STRING,
   ALARM_BILL_ID        STRING,
   FAX_ID               STRING,
   STAFF_LEVEL          STRING,
   STAFF_TYPE           STRING,
   BC_MGR               STRING,
   NOTES                STRING,
   STATE                STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_sec_staff';

--DWD操作员(3.0)
CREATE TABLE IF NOT EXISTS DWD_SEC_OPERATOR  (
   OPERATOR_ID           STRING,
   STAFF_ID              STRING,
   CODE                  STRING,
   PASSWORD              STRING,
   SECURITY_ID           STRING,
   RECENT_PASSWORD       STRING,
   RECENT_PASS_TIMES     STRING,
   ALLOW_CHANGE_PASSWORD STRING,
   ACCT_EFFECT_DATE      STRING,
   ACCT_EXPIRE_DATE      STRING,
   LAST_LOGIN_LOG_ID     STRING,
   TRY_TIMES             STRING,
   LOCK_FLAG             STRING,
   LOGIN_CHANNEL         STRING,
   PASSWORD_VALID_DATE   STRING,
   CHG_PASSWD_ALARM_DAYS STRING,
   IPMAC_FLAG            STRING,
   IS_VPN_LOGIN_FLAG     STRING,
   CHG_PASSWD_FLAG       STRING,
   IS_LOGIN              STRING,
   NOTES                 STRING,
   CANCEL_DAYS           STRING,
   STATE                 STRING,
   DONE_CODE             STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_sec_operator';

--DWD产品单元(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_PRODUCT_ITEM  (
   PRODUCT_ITEM_ID     STRING,
   EXTEND_ID           STRING,
   CODE                STRING,
   NAME                STRING,
   ITEM_TYPE           STRING,
   PRIORITY            STRING,
   SORT_BY             STRING,
   DESCRIPTION         STRING,
   CREATER             STRING,
   MODIFIER            STRING,
   STATE               STRING,
   DEL_FLAG            STRING,
   REMARK              STRING,
   CREATE_DATE         STRING,
   MODIFY_DATE         STRING,
   VALID_DATE          STRING,
   EXPIRE_DATE         STRING,
   USE_EFF_DATE        STRING,
   USE_EXP_DATE        STRING,
   ENT_ID              STRING,
   CHECKER             STRING,
   ISLOCK              STRING,
   SUPPLIER_ID         STRING,
   PROVIDER_TYPE       STRING,
   BUSINESS_DOMAIN_ID  STRING,
   PLATFORM_ID         STRING,
   EXTEND_ID2          STRING,
   OWN_CORP_ORG_ID     STRING,
   COMBINE_FLAG        STRING,
   DATA_SOURCE_CD      STRING,
   ETL_CYCLE           STRING,
   ETL_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_product_item';

--DWD产品单元关系(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_ITEM_RELAT  (
   ITEM_RELAT_ID           STRING,
   RELAT_PRODUCT_ITEM_ID   STRING,
   PROD_ITEM_RELAT_KIND_ID STRING,
   EXTEND_ATTR_A           STRING,
   EXTEND_ATTR_B           STRING,
   EXTEND_ATTR_C           STRING,
   EXTEND_ATTR_D           STRING,
   EXTEND_ATTR_E           STRING,
   EXTEND_ATTR_F           STRING,
   EXTEND_ATTR_G           STRING,
   EXTEND_ATTR_H           STRING,
   EXTEND_ATTR_I           STRING,
   EXTEND_ATTR_J           STRING,
   EXTEND_ATTR_K           STRING,
   EXTEND_ATTR_L           STRING,
   EXTEND_ATTR_M           STRING,
   EXTEND_ATTR_N           STRING,
   EXTEND_ATTR_O           STRING,
   SORT_BY                 STRING,
   CREATER                 STRING,
   CREATE_DATE             STRING,
   MODIFIER                STRING,
   MODIFY_DATE             STRING,
   DEL_FLAG                STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_item_relat';

--DWD产品单元关系关联价格计划(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_ITEM_RELAT_PRICE  (
   RELAT_ID                STRING,
   ITEM_RELAT_ID           STRING,
   RELAT_TYPE              STRING,
   PROD_ITEM_RELAT_KIND_ID STRING,
   ATTR_A                  STRING,
   ATTR_B                  STRING,
   ATTR_C                  STRING,
   ATTR_D                  STRING,
   ATTR_E                  STRING,
   ATTR_F                  STRING,
   ATTR_G                  STRING,
   ATTR_H                  STRING,
   ATTR_I                  STRING,
   ATTR_J                  STRING,
   ATTR_K                  STRING,
   ATTR_L                  STRING,
   ATTR_M                  STRING,
   ATTR_N                  STRING,
   ATTR_O                  STRING,
   SORT_BY                 STRING,
   CREATER                 STRING,
   CREATE_DATE             STRING,
   MODIFIER                STRING,
   MODIFY_DATE             STRING,
   DEL_FLAG                STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_item_relat_price';

--DWD价格计划(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_PRICE_PLAN  (
   PRICE_PLAN_ID        STRING,
   PRICE_PLAN_TYPE_CD   STRING,
   PARA_FLAG            STRING,
   INTERFACE_CODE       STRING,
   USE_MONTH            STRING,
   PAY_MONTH            STRING,
   CREATER              STRING,
   CREATE_DATE          STRING,
   MODIFIER             STRING,
   MODIFY_DATE          STRING,
   DEL_FLAG             STRING,
   ADD_TYPE             STRING,
   FEE_VALUE            STRING,
   RES_CODE             STRING,
   APPORT_RULE          STRING,
   TIME_UNIT            STRING,
   OUT_TYPE             STRING,
   RES_COUNT            STRING,
   IS_BIND              STRING,
   CHARGE_ITEM          STRING,
   REMARK               STRING,
   APPORT_VALUE         STRING,
   MODIFY_FLAG          STRING,
   EXTEND_ATTR_A        STRING,
   EXTEND_ATTR_B        STRING,
   EXTEND_ATTR_C        STRING,
   EXTEND_ATTR_D        STRING,
   EXTEND_ATTR_E        STRING,
   UNIT                 STRING,
   FEE_FLAG             STRING,
   RESTYPE_ID           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_price_plan';

--DWD产品策划(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_OFFER  (
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   VALID_TYPE           STRING,
   TRADEMARK            STRING,
   MODIFY_DATE          STRING,
   MODIFIER             STRING,
   CREATE_DATE          STRING,
   CREATER              STRING,
   DEL_FLAG             STRING,
   EXPER_TYPE           STRING,
   EXPER_PERIOD_TYPE    STRING,
   EXPER_PERIOD         STRING,
   MIN_ORDER            STRING,
   MAX_ORDER            STRING,
   EXP_TYPE             STRING,
   STAY_TIME            STRING,
   STAY_UNIT            STRING,
   MODIFY_FLAG          STRING,
   DETAIL               STRING,
   PROD_SERVICE_ID      STRING,
   VISIBLE_TYPE         STRING,
   STD_UP_OFFER_CODE    STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_offer';

--DWD服务价格(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_SERVICE_PRICE  (
   SERVICE_PRICE_ID     STRING,
   SERVICE_PRICE_KIND   STRING,
   IS_MAIN              STRING,
   SUB_COND             STRING,
   SUB_PARAM            STRING,
   PACKED_FLAG          STRING,
   MULTI_FLAG           STRING,
   CREATER              STRING,
   CREATE_DATE          STRING,
   MODIFIER             STRING,
   MODIFY_DATE          STRING,
   DEL_FLAG             STRING,
   STAY_TIME            STRING,
   STAY_UNIT            STRING,
   PROD_SERVICE_ID      STRING,
   NOT_TRANS_INST       STRING,
   PS_TYPE              STRING,
   STD_UP_PRODUCT_CODE  STRING,
   STD_PROD_CYCLE_CODE  STRING,
   STD_BANDWIDTH_CODE   STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_service_price';

--DWDCRM与帐管产品关系表(3.0)
CREATE TABLE IF NOT EXISTS DWD_UP_PRODUCT_PROD_REL  (
   PRODUCT_ITEM_ID      STRING,
   PROD_ID              STRING,
   ITEM_CODE            STRING,
   BASE_VAL             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_up_product_prod_rel';

--DWD服务与网元内容关系表(3.0)
CREATE TABLE IF NOT EXISTS DWD_UA_SERVICE_CONTENT_REL  (
   REL_ID             STRING,
   SERVICE_ID         STRING,
   CONTENT_ID         STRING,
   CREATE_DATE        STRING,
   CREATOR            STRING,
   MODIFY_DATE        STRING,
   MODIFIER           STRING,
   DATA_SOURCE_CD     STRING,
   ETL_CYCLE          STRING,
   ETL_DATE           STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ua_service_content_rel';

--DWD服务表(3.0)
CREATE TABLE IF NOT EXISTS DWD_UA_SERVICE  (
   SERVICE_ID        STRING,
   SERVICE_CODE      STRING,
   SERVICE_TYPE      STRING,
   SERVICE_NAME      STRING,
   SERVICE_LEVEL     STRING,
   STATE             STRING,
   DEL_FLAG          STRING,
   MODIFY_DATE       STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ua_service';

--DWD网元表(3.0)
CREATE TABLE IF NOT EXISTS DWD_UA_NET_ELEMENTS  (
   NE_ID             STRING,
   NE_NAME           STRING,
   NE_DESC           STRING,
   NET_ID            STRING,
   LOAD_TYPE         STRING,
   NE_IMPL_CLASS     STRING,
   REL_TYPE          STRING,
   NE_STATE          STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ua_net_elements';

--DWD网元内容授权码表(3.0)
CREATE TABLE IF NOT EXISTS DWD_UA_NE_CONTENT_AUTH_CODE  (
   AUTH_CODE_ID      STRING,
   CONTENT_ID        STRING,
   NE_ID             STRING,
   AUTH_CODE         STRING,
   IS_CDM            STRING,
   CA_CDM_CODE       STRING,
   CREATE_DATE       STRING,
   CREATOR           STRING,
   MODIFY_DATE       STRING,
   MODIFIER          STRING,
   DATA_SOURCE_CD    STRING,
   ETL_CYCLE         STRING,
   ETL_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ua_ne_content_auth_code';

--DWD产品规格实例(3.0)
CREATE TABLE IF NOT EXISTS DWD_INS_PROD  (
   PROD_INST_ID          STRING,
   OFFER_INST_ID         STRING,
   OFFER_ID              STRING,
   BRAND_ID              STRING,
   PROD_SPEC_ID          STRING,
   CUST_ID               STRING,
   ACCT_ID               STRING,
   PAY_TYPE              STRING,
   BILL_ID               STRING,
   SUB_BILL_ID           STRING,
   MAIN_PROD_INST_ID     STRING,
   BILL_START_DATE       STRING,
   USER_NAME             STRING,
   USER_PROP             STRING,
   USER_GROUP            STRING,
   VIP_FLAG              STRING,
   VIP_PROP              STRING,
   BODER_FLAG            STRING,
   SUBSIDY_FLAG          STRING,
   SUBSIDY_PROP          STRING,
   DEGREE_FLAG           STRING,
   FIRST_USE_DATE        STRING,
   VALID_TYPE            STRING,
   STATE                 STRING,
   STATE_DATE            STRING,
   OPER_STATE            STRING,
   OS_STATUS             STRING,
   CREDIT_LEVEL          STRING,
   CREDIT_AMOUNT         STRING,
   PASSWORD_TYPE         STRING,
   PASSWORD              STRING,
   ADDRESS_ID            STRING,
   CONT_ID               STRING,
   POST_MODE             STRING,
   POST_ADDRESS_ID       STRING,
   ACCESS_MODE           STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   CREATE_DATE           STRING,
   CREATE_OP_ID          STRING,
   CREATE_ORG_ID         STRING,
   REGION_ID             STRING,
   SALE_OP_ID            STRING,
   SALE_ORG_ID           STRING,
   OWN_ORG_ID            STRING,
   OWN_CORP_ORG_ID       STRING,
   DONE_DATE             STRING,
   DONE_CODE             STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   WARRANT_CUST_ID       STRING,
   REMARK                STRING,
   EXT1                  STRING,
   EXT2                  STRING,
   EXT3                  STRING,
   EXT4                  STRING,
   EXT5                  STRING,
   EXT6                  STRING,
   USER_TYPE_ID          STRING,
   INSTALL_ADDR_ID       STRING,
   INSTALL_ADDR_NAME     STRING,
   LOGIN_NAME            STRING,
   TV_NUMBER             STRING,
   CUST_ORDER_ID         STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ins_prod';

--DWD产品规格实例历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_INS_PROD  (
   H_ID                  STRING,
   PROD_INST_ID          STRING,
   OFFER_INST_ID         STRING,
   OFFER_ID              STRING,
   BRAND_ID              STRING,
   PROD_SPEC_ID          STRING,
   CUST_ID               STRING,
   ACCT_ID               STRING,
   PAY_TYPE              STRING,
   BILL_ID               STRING,
   SUB_BILL_ID           STRING,
   MAIN_PROD_INST_ID     STRING,
   BILL_START_DATE       STRING,
   USER_NAME             STRING,
   USER_PROP             STRING,
   USER_GROUP            STRING,
   VIP_FLAG              STRING,
   VIP_PROP              STRING,
   BODER_FLAG            STRING,
   SUBSIDY_FLAG          STRING,
   SUBSIDY_PROP          STRING,
   DEGREE_FLAG           STRING,
   FIRST_USE_DATE        STRING,
   VALID_TYPE            STRING,
   STATE                 STRING,
   STATE_DATE            STRING,
   OPER_STATE            STRING,
   OS_STATUS             STRING,
   CREDIT_LEVEL          STRING,
   CREDIT_AMOUNT         STRING,
   PASSWORD_TYPE         STRING,
   PASSWORD              STRING,
   ADDRESS_ID            STRING,
   CONT_ID               STRING,
   POST_MODE             STRING,
   POST_ADDRESS_ID       STRING,
   ACCESS_MODE           STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   CREATE_DATE           STRING,
   CREATE_OP_ID          STRING,
   CREATE_ORG_ID         STRING,
   REGION_ID             STRING,
   SALE_OP_ID            STRING,
   SALE_ORG_ID           STRING,
   OWN_ORG_ID            STRING,
   OWN_CORP_ORG_ID       STRING,
   DONE_DATE             STRING,
   DONE_CODE             STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   WARRANT_CUST_ID       STRING,
   REMARK                STRING,
   EXT1                  STRING,
   EXT2                  STRING,
   EXT3                  STRING,
   EXT4                  STRING,
   EXT5                  STRING,
   EXT6                  STRING,
   USER_TYPE_ID          STRING,
   INSTALL_ADDR_ID       STRING,
   INSTALL_ADDR_NAME     STRING,
   LOGIN_NAME            STRING,
   TV_NUMBER             STRING,
   CUST_ORDER_ID         STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ins_prod';

--DWD产品策划实例(3.0)
CREATE TABLE IF NOT EXISTS DWD_INS_OFFER  (
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CUST_ID              STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   CANCEL_REASON        STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   OWN_ORG_ID           STRING,
   SALE_TYPE            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   CUST_ORDER_ID        STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ins_offer';

--DWD产品策划实例历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_INS_OFFER  (
   H_ID                 STRING,
   OFFER_INST_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CUST_ID              STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   VALID_TYPE           STRING,
   OPER_STATE           STRING,
   STATE                STRING,
   CANCEL_REASON        STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   REGION_ID            STRING,
   CREATE_DATE          STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   OWN_ORG_ID           STRING,
   SALE_TYPE            STRING,
   SALE_OP_ID           STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   DONE_CODE            STRING,
   DONE_DATE            STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   CUST_ORDER_ID        STRING,
   CUST_ADDR_ID         STRING,
   EXPIRE_FOLLOW_STATE  STRING,
   OS_STATUS            STRING,
   PROD_SERVICE_ID      STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ins_offer';

--DWD服务包实例(3.0)
CREATE TABLE IF NOT EXISTS DWD_INS_SRVPKG  (
   SRVPKG_INST_ID               STRING,
   OFFER_INST_ID                STRING,
   SRVPKG_ID                    STRING,
   PROD_INST_ID                 STRING,
   VALID_TYPE                   STRING,
   OPER_STATE                   STRING,
   STATE                        STRING,
   REGION_ID                    STRING,
   CREATE_DATE                  STRING,
   DONE_CODE                    STRING,
   DONE_DATE                    STRING,
   VALID_DATE                   STRING,
   EXPIRE_DATE                  STRING,
   OP_ID                        STRING,
   ORG_ID                       STRING,
   SRC_SYSTEM_ID                STRING,
   SRC_SYSTEM_EXT_CODE          STRING,
   PROD_SERVICE_ID              STRING,
   OS_STATUS                    STRING,
   CUST_ORDER_ID                STRING,
   STD_UP_BUSI_TYPE_CODE        STRING,
   STD_SUBSCRIPTION_STATUS_CODE STRING,
   DATA_SOURCE_CD               STRING,
   ETL_CYCLE                    STRING,
   ETL_DATE                     STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ins_srvpkg';

--DWD服务包实例历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_INS_SRVPKG  (
   H_ID                  STRING,
   SRVPKG_INST_ID        STRING,
   OFFER_INST_ID         STRING,
   SRVPKG_ID             STRING,
   PROD_INST_ID          STRING,
   VALID_TYPE            STRING,
   OPER_STATE            STRING,
   STATE                 STRING,
   REGION_ID             STRING,
   CREATE_DATE           STRING,
   DONE_CODE             STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   SRC_SYSTEM_ID         STRING,
   SRC_SYSTEM_EXT_CODE   STRING,
   PROD_SERVICE_ID       STRING,
   OS_STATUS             STRING,
   CUST_ORDER_ID         STRING,
   STD_UP_BUSI_TYPE_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ins_srvpkg';

--DWD帐户(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_ACCT  (
   ACCT_ID               STRING,
   CUST_ID               STRING,
   ACCT_NAME             STRING,
   ADDRESS               STRING,
   STATE                 STRING,
   STATE_DATE            STRING,
   ACCT_CODE             STRING,
   CUST_CODE             STRING,
   NATION                STRING,
   PROVINCE              STRING,
   AREA                  STRING,
   COUNTY                STRING,
   POST_CODE             STRING,
   GROUP_ACCT_CODE       STRING,
   IS_SUPER_ACCT         STRING,
   IS_BAD_DEBT           STRING,
   PREPAY_AREA_ID        STRING,
   ABA_NUMBER            STRING,
   INVOICE_FORMAT_ID     STRING,
   BILL_FORMAT_ID        STRING,
   CREDIT_AMOUNT         STRING,
   BRAND_SUIT            STRING,
   SO_NBR                STRING,
   REGION_ID             STRING,
   AREA_ID               STRING,
   PAY_AREA_CODE         STRING,
   CREDIT_GRADE          STRING,
   PAYMENT_METHOD        STRING,
   IS_MAILING            STRING,
   MAILING_METHOD        STRING,
   MAILING_ADDRESS       STRING,
   ADDRESS_ID            STRING,
   CORP_ORG_ID           STRING,
   DATA_ORG_ID           STRING,
   PAY_MODE              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_acct';

--DWD帐目(销帐明细)(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_ACCT_ITEM_PAYOFF  (
   BALANCE_LOG_ID          STRING,
   ACCT_BALANCE_ID         STRING,
   PAYMENT_ID              STRING,
   BILL_ID                 STRING,
   ACCT_ITEM_ID            STRING,
   BILLING_CYCLE_ID        STRING,
   SERV_ID                 STRING,
   ACCT_ID                 STRING,
   ACCT_ITEM_TYPE_ID       STRING,
   BALANCE_TYPE_ID         STRING,
   PAYOFF_AMOUNT           STRING,
   UNPAY_AMOUNT            STRING,
   BILL_AMOUNT             STRING,
   PAYMENT_DATE            STRING,
   CORP_ORG_ID             STRING,
   STD_UP_BUSI_TYPE_CODE   STRING,
   STD_BALANCE_TYPE_CODE   STRING,
   STD_ACCT_ITEM_TYPE_CODE STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_acct_item_payoff';

--DWD帐目切片表(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_ACCT_ITEM_SLICE  (
   ACCT_ITEM_SLICE_ID   STRING,
   ACCT_ITEM_ID         STRING,
   BILL_ID              STRING,
   BILL_AMOUNT          STRING,
   ACCT_ID              STRING,
   BILLING_CYCLE_ID     STRING,
   STATE                STRING,
   STATE_DATE           STRING,
   CREATED_DATE         STRING,
   REGION_CODE          STRING,
   CORP_ORG_ID          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_acct_item_slice';

--DWD保存时间量的时间和金额消耗值(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZC_ACCP_AMOTIME_LOG  (
   SERV_ID              STRING,
   ACCT_ID              STRING,
   SO_ID                STRING,
   PROD_ID              STRING,
   TOTAL_VAL            STRING,
   ADDUP_VAL            STRING,
   CURR_VAL             STRING,
   TOTAL_AMOUNT         STRING,
   ADDUP_AMOUNT         STRING,
   CURR_AMOUNT          STRING,
   LAST_BDATE           STRING,
   CURR_BDATE           STRING,
   UP_TIME              STRING,
   STD_PROD_CYCLE_CODE  STRING,
   STD_BANDWIDTH_CODE   STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zc_accp_amotime_log';

--DWD帐目类型(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_ACCT_ITEM_TYPE  (
   ACCT_ITEM_TYPE_ID       STRING,
   PARTNER_ID              STRING,
   NAME                    STRING,
   ACCT_ITEM_TYPE_DESC     STRING,
   ACCT_ITEM_TYPE_KIND     STRING,
   ACCT_ITEM_TYPE_CODE     STRING,
   PRINT_PRIORITY          STRING,
   BILL_PRIORITY           STRING,
   CHARGE_MARK             STRING,
   TOTAL_MARK              STRING,
   STATE                   STRING,
   STATE_DATE              STRING,
   ITEM_FEE_TYPE           STRING,
   ACCT_ITEM_CLASS_ID      STRING,
   PARTY_ROLE_ID           STRING,
   STD_UP_BUSI_TYPE_CODE   STRING,
   STD_ACCT_ITEM_TYPE_CODE STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_acct_item_type';

--DWD帐目类型_分业务的关系表(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_ACCT_ITEM_SERVICE  (
   ACCT_ITEM_TYPE_ID    STRING,
   SERVICE_ID           STRING,
   SORT                 STRING,
   STS                  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_acct_item_service';

--DWD余额类型(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_BALANCE_TYPE  (
   BALANCE_TYPE_ID       STRING,
   PRIORITY              STRING,
   BALANCE_TYPE_NAME     STRING,
   IF_ALLOW_INVOICE      STRING,
   IF_ALLOW_DRAW         STRING,
   IF_ALLOW_TRANS        STRING,
   IF_ALLOW_RESERV       STRING,
   IS_PRESENT            STRING,
   STATE                 STRING,
   MEASURE_METHOD_ID     STRING,
   CONTROL_TYPE          STRING,
   STD_BALANCE_TYPE_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_balance_type';

--DWD固费资料接口表(3.0)
CREATE TABLE IF NOT EXISTS DWD_ZG_I_USER_MSC  (
   SO_ID                STRING,
   SERV_ID              STRING,
   PROD_ID              STRING,
   VALID_DATE           STRING,
   DONE_CODE            STRING,
   REGION_CODE          STRING,
   FUNC_TYPE            STRING,
   BUSI_TYPE            STRING,
   FUNC_PARAM           STRING,
   PROPERTY             STRING,
   PLAN_ID              STRING,
   BEGIN_DATE           STRING,
   EXPIRE_DATE          STRING,
   REMARK               STRING,
   SO_NBR               STRING,
   OFFER_INST_ID        STRING,
   OPER_TYPE            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_zg_i_user_msc';

--DWD行政区域(3.0)
CREATE TABLE IF NOT EXISTS DWD_OSS_DISTRICT  (
   DISTRICT_ID           STRING,
   REGION_ID             STRING,
   DISTRICT_NAME         STRING,
   DISTRICT_ENGLISH_NAME STRING,
   DISTRICT_TYPE_ID      STRING,
   PARENT_DISTRICT_ID    STRING,
   AREA_CODE             STRING,
   POST_CODE             STRING,
   NOTES                 STRING,
   SORT_ID               STRING,
   CENTER_INFO_CODE      STRING,
   DISTRICT_TWO_NUMBER   STRING,
   COURSE_FLAG           STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_oss_district';

--DWD管理地址(3.0)
CREATE TABLE IF NOT EXISTS DWD_OSS_ADDR_MGR_ADDR  (
   MGR_ADDR_ID          STRING,
   MGR_ADDR_NAME        STRING,
   MGR_ADDR_CODE        STRING,
   PARENT_MGR_ADDR_ID   STRING,
   STATE                STRING,
   REMARK               STRING,
   CREATE_DATE          STRING,
   MOD_DATE             STRING,
   REL_OBJ_VALUE        STRING,
   IS_LEAF              STRING,
   MGR_ADDR_SUBTYPE     STRING,
   OWN_ORG_ID           STRING,
   REL_OBJ_NAME         STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_oss_addr_mgr_addr';

--DWD标准地址(3.0)
CREATE TABLE IF NOT EXISTS DWD_OSS_ADDR_STD_ADDR  (
   STD_ADDR_ID          STRING,
   NAME                 STRING,
   STD_ADDR_TYPE        STRING,
   DISTRICT_ID          STRING,   
   STD_ADDR_CODE        STRING,
   SPELL                STRING,
   PARENT_ADDR_ID       STRING,
   STATE                STRING,
   REMARK               STRING,
   DETAIL_NAME          STRING,
   DETAIL_SPELL         STRING,
   TOPIC_WORD           STRING,
   CREATE_DATE          STRING,
   MODIFY_DATE          STRING,
   AREA_MANAGER         STRING,
   X                    STRING,
   Y                    STRING,
   GRID                 STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_oss_addr_std_addr';

--DWD管理地址与标准地址关系(3.0)
CREATE TABLE IF NOT EXISTS DWD_OSS_ADDR_MGR_ADDR_ADDR_REL  (
   ADDR_REL_ID         STRING,
   MGR_ADDR_TYPE       STRING,
   MGR_ADDR_ID         STRING,
   STD_ADDR_TYPE       STRING,
   STD_ADDR_ID         STRING,
   STATE               STRING,
   REMARK              STRING,
   MGR_ADDR_SUBTYPE    STRING,
   DATA_SOURCE_CD      STRING,
   ETL_CYCLE           STRING,
   ETL_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_oss_addr_mgr_addr_addr_rel';

--DWD产品规格订单(3.0)
CREATE TABLE IF NOT EXISTS DWD_ORD_PROD  (
   PROD_ORDER_ID         STRING,
   CUST_ORDER_ID         STRING,
   BUSIOPER_ORDER_ID     STRING,
   PROD_SPEC_ID          STRING,
   PROD_INST_ID          STRING,
   PROD_ROLE_ID          STRING,
   NEW_PROD_ORDER_ID     STRING,
   OFFER_ID              STRING,
   BRAND_ID              STRING,
   CUST_ID               STRING,
   ACCT_ID               STRING,
   PAY_TYPE              STRING,
   BILL_ID               STRING,
   SUB_BILL_ID           STRING,
   MAIN_PROD_INST_ID     STRING,
   BILL_START_DATE       STRING,
   STATE                 STRING,
   ORDER_STATE           STRING,
   OS_STATUS             STRING,
   OUTLINE_FLAG          STRING,
   OWE_AMOUNT            STRING,
   PASSWORD_TYPE         STRING,
   PASSWORD              STRING,
   CONT_ID               STRING,
   ADDRESS_ID            STRING,
   VALID_TYPE            STRING,
   USER_STATE            STRING,
   DONE_CODE             STRING,
   BOOK_HOME_DATE        STRING,
   BOOK_OPEN_DATE        STRING,
   REGION_ID             STRING,
   SALE_ORG_ID           STRING,
   OWN_CORP_ORG_ID       STRING,
   OWN_ORG_ID            STRING,
   CREATE_OP_ID          STRING,
   CREATE_ORG_ID         STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   REMARK                STRING,
   EXT1                  STRING,
   EXT2                  STRING,
   EXT3                  STRING,
   EXT4                  STRING,
   EXT5                  STRING,
   EXT6                  STRING,
   USER_NAME             STRING,
   USER_PROP             STRING,
   USER_GROUP            STRING,
   VIP_FLAG              STRING,
   VIP_PROP              STRING,
   BODER_FLAG            STRING,
   SUBSIDY_FLAG          STRING,
   SUBSIDY_PROP          STRING,
   DEGREE_FLAG           STRING,
   FIRST_USE_DATE        STRING,
   ACCESS_MODE           STRING,
   USER_TYPE_ID          STRING,
   INSTALL_ADDR_ID       STRING,
   INSTALL_ADDR_NAME     STRING,
   LOGIN_NAME            STRING,
   TV_NUMBER             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ord_prod';

--DWD产品规格订单历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_ORD_PROD  (
   PROD_ORDER_ID         STRING,
   CUST_ORDER_ID         STRING,
   BUSIOPER_ORDER_ID     STRING,
   OFFER_ORDER_ID        STRING,
   PROD_SPEC_ID          STRING,
   PROD_INST_ID          STRING,
   PROD_ROLE_ID          STRING,
   NEW_PROD_ORDER_ID     STRING,
   OFFER_ID              STRING,
   BRAND_ID              STRING,
   CUST_ID               STRING,
   ACCT_ID               STRING,
   PAY_TYPE              STRING,
   BILL_ID               STRING,
   SUB_BILL_ID           STRING,
   MAIN_PROD_INST_ID     STRING,
   BILL_START_DATE       STRING,
   STATE                 STRING,
   ORDER_STATE           STRING,
   OS_STATUS             STRING,
   OUTLINE_FLAG          STRING,
   OWE_AMOUNT            STRING,
   PASSWORD_TYPE         STRING,
   PASSWORD              STRING,
   CONT_ID               STRING,
   ADDRESS_ID            STRING,
   VALID_TYPE            STRING,
   USER_STATE            STRING,
   DONE_CODE             STRING,
   BOOK_HOME_DATE        STRING,
   BOOK_OPEN_DATE        STRING,
   REGION_ID             STRING,
   SALE_ORG_ID           STRING,
   OWN_CORP_ORG_ID       STRING,
   OWN_ORG_ID            STRING,
   CREATE_OP_ID          STRING,
   CREATE_ORG_ID         STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   REMARK                STRING,
   EXT1                  STRING,
   EXT2                  STRING,
   EXT3                  STRING,
   EXT4                  STRING,
   EXT5                  STRING,
   EXT6                  STRING,
   USER_NAME             STRING,
   USER_PROP             STRING,
   USER_GROUP            STRING,
   VIP_FLAG              STRING,
   VIP_PROP              STRING,
   BODER_FLAG            STRING,
   SUBSIDY_FLAG          STRING,
   SUBSIDY_PROP          STRING,
   DEGREE_FLAG           STRING,
   FIRST_USE_DATE        STRING,
   ACCESS_MODE           STRING,
   USER_TYPE_ID          STRING,
   INSTALL_ADDR_ID       STRING,
   INSTALL_ADDR_NAME     STRING,
   LOGIN_NAME            STRING,
   TV_NUMBER             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ord_prod';

--DWD策划订单(3.0)
CREATE TABLE IF NOT EXISTS DWD_ORD_OFFER  (
   OFFER_ORDER_ID       STRING,
   CUST_ORDER_ID        STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   OFFER_INST_ID        STRING,
   OBJ_OFFER_INST_ID    STRING,
   IS_MAIN_OFFER        STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   CUST_ID              STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CANCEL_REASON        STRING,
   CANCEL_DATE          STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ord_offer';

--DWD策划订单历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_ORD_OFFER  (
   OFFER_ORDER_ID       STRING,
   CUST_ORDER_ID        STRING,
   BUSIOPER_ORDER_ID    STRING,
   OFFER_ID             STRING,
   OFFER_TYPE           STRING,
   OFFER_INST_ID        STRING,
   OBJ_OFFER_INST_ID    STRING,
   IS_MAIN_OFFER        STRING,
   VALID_TYPE           STRING,
   STATE                STRING,
   ORDER_STATE          STRING,
   ORDER_NAME           STRING,
   CONTRACT_ID          STRING,
   CUST_ID              STRING,
   MAIN_ROLE_PROD_ID    STRING,
   CANCEL_REASON        STRING,
   CANCEL_DATE          STRING,
   DONE_CODE            STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   OP_ID                STRING,
   ORG_ID               STRING,
   SRC_SYSTEM_ID        STRING,
   EXT1                 STRING,
   EXT2                 STRING,
   EXT3                 STRING,
   EXT4                 STRING,
   REGION_ID            STRING,
   SALE_ORG_ID          STRING,
   OWN_CORP_ORG_ID      STRING,
   OWN_ORG_ID           STRING,
   CREATE_ORG_ID        STRING,
   CREATE_OP_ID         STRING,
   SRC_SYSTEM_EXT_CODE  STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ord_offer';

--DWD服务包订单(3.0)
CREATE TABLE IF NOT EXISTS DWD_ORD_SRVPKG  (
   SRVPKG_ORDER_ID       STRING,
   CUST_ORDER_ID         STRING,
   OFFER_ORDER_ID        STRING,
   SRVPKG_ID             STRING,
   SRVPKG_INST_ID        STRING,
   VALID_TYPE            STRING,
   STATE                 STRING,
   ORDER_STATE           STRING,
   PROD_ORDER_ID         STRING,
   DONE_CODE             STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   SRC_SYSTEM_ID         STRING,
   REGION_ID             STRING,
   SRC_SYSTEM_EXT_CODE   STRING,
   PROD_SERVICE_ID       STRING,
   OS_STATUS             STRING,
   STD_UP_BUSI_TYPE_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ord_srvpkg';

--DWD服务包订单历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_ORD_SRVPKG  (
   SRVPKG_ORDER_ID       STRING,
   CUST_ORDER_ID         STRING,
   OFFER_ORDER_ID        STRING,
   SRVPKG_ID             STRING,
   SRVPKG_INST_ID        STRING,
   VALID_TYPE            STRING,
   STATE                 STRING,
   ORDER_STATE           STRING,
   PROD_ORDER_ID         STRING,
   DONE_CODE             STRING,
   CREATE_DATE           STRING,
   DONE_DATE             STRING,
   VALID_DATE            STRING,
   EXPIRE_DATE           STRING,
   OP_ID                 STRING,
   ORG_ID                STRING,
   SRC_SYSTEM_ID         STRING,
   REGION_ID             STRING,
   SRC_SYSTEM_EXT_CODE   STRING,
   PROD_SERVICE_ID       STRING,
   OS_STATUS             STRING,
   STD_UP_BUSI_TYPE_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE             STRING,
   ETL_DATE              STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ord_srvpkg';

--DWD价格计划订单(3.0)
CREATE TABLE IF NOT EXISTS DWD_ORD_PRICE  (
   PRICEPLAN_ORDER_ID     STRING,
   PRICEPLAN_INST_ID      STRING,
   PRICEPLAN_ORDER_TYPE   STRING,
   PRICEPLAN_TYPE         STRING,
   PRICE_PLAN_ID          STRING,
   PRICE_PLAN_DETAIL_ID   STRING,
   CUST_ORDER_ID          STRING,
   OFFER_ORDER_ID         STRING,
   PRICEPLAN_PRICEITEM_ID STRING,
   PROM_KIND              STRING,
   PROM_TYPE              STRING,
   PRICEITEM_VALUE        STRING,
   FACT_PRICEITEM_VALUE   STRING,
   ORDER_NUM              STRING,
   SHOULD_MONEY           STRING,
   FACT_MONEY             STRING,
   FEE_MONTH              STRING,
   PRICEPLAN_BEGIN_DATE   STRING,
   PRICEPLAN_END_DATE     STRING,
   CUST_ID                STRING,
   IS_MEM_GRP_DISC        STRING,
   GRP_PRICEPLAN_ID       STRING,
   GRP_PRICEPLAN_INST_ID  STRING,
   VALID_TYPE             STRING,
   STATE                  STRING,
   ORDER_STATE            STRING,
   DONE_CODE              STRING,
   CREATE_DATE            STRING,
   DONE_DATE              STRING,
   VALID_DATE             STRING,
   EXPIRE_DATE            STRING,
   OP_ID                  STRING,
   ORG_ID                 STRING,
   EXT1                   STRING,
   EXT2                   STRING,
   EXT3                   STRING,
   EXT4                   STRING,
   REMARK                 STRING,
   REGION_ID              STRING,
   PRICEPLAN_DETAIL_TYPE  STRING,
   CUT_MONEY              STRING,
   BIND_FLAG              STRING,
   BASE_OFFER_ID          STRING,
   EXT5                   STRING,
   EXT6                   STRING,
   EXT7                   STRING,
   EXT8                   STRING,
   SRC_ACCT_ITEM_ID       STRING,
   SRC_ACCT_PAY_MONEY     STRING,
   PREPAY_ACCT_TYPE       STRING,
   DATA_SOURCE_CD         STRING,
   ETL_CYCLE              STRING,
   ETL_DATE               STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ord_price';

--DWD价格计划订单历史(3.0)
CREATE TABLE IF NOT EXISTS DWD_H_ORD_PRICE  (
   PRICEPLAN_ORDER_ID     STRING,
   PRICEPLAN_INST_ID      STRING,
   PRICEPLAN_ORDER_TYPE   STRING,
   PRICEPLAN_TYPE         STRING,
   PRICE_PLAN_ID          STRING,
   PRICE_PLAN_DETAIL_ID   STRING,
   CUST_ORDER_ID          STRING,
   OFFER_ORDER_ID         STRING,
   MAIN_ORDER_ID          STRING,
   PRICEPLAN_PRICEITEM_ID STRING,
   PROM_KIND              STRING,
   PROM_TYPE              STRING,
   PRICEITEM_VALUE        STRING,
   FACT_PRICEITEM_VALUE   STRING,
   ORDER_NUM              STRING,
   SHOULD_MONEY           STRING,
   FACT_MONEY             STRING,
   FEE_MONTH              STRING,
   PRICEPLAN_BEGIN_DATE   STRING,
   PRICEPLAN_END_DATE     STRING,
   CUST_ID                STRING,
   IS_MEM_GRP_DISC        STRING,
   GRP_PRICEPLAN_ID       STRING,
   GRP_PRICEPLAN_INST_ID  STRING,
   VALID_TYPE             STRING,
   STATE                  STRING,
   ORDER_STATE            STRING,
   DONE_CODE              STRING,
   CREATE_DATE            STRING,
   DONE_DATE              STRING,
   VALID_DATE             STRING,
   EXPIRE_DATE            STRING,
   OP_ID                  STRING,
   ORG_ID                 STRING,
   EXT1                   STRING,
   EXT2                   STRING,
   EXT3                   STRING,
   EXT4                   STRING,
   REMARK                 STRING,
   REGION_ID              STRING,
   PRICEPLAN_DETAIL_TYPE  STRING,
   CUT_MONEY              STRING,
   BIND_FLAG              STRING,
   BASE_OFFER_ID          STRING,
   EXT5                   STRING,
   EXT6                   STRING,
   EXT7                   STRING,
   EXT8                   STRING,
   SRC_ACCT_ITEM_ID       STRING,
   SRC_ACCT_PAY_MONEY     STRING,
   PREPAY_ACCT_TYPE       STRING,
   DATA_SOURCE_CD         STRING,
   ETL_CYCLE              STRING,
   ETL_DATE               STRING
)PARTITIONED BY (PT_YEAR STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_h_ord_price';

--DWD认证记录表
CREATE TABLE IF NOT EXISTS DWD_BRD_AUTH_LOG  (
   AUTH_LOG_ID          STRING,
   LOGIN_NAME           STRING,
   LOGIN_PASSWORD       STRING,
   AUTH_TIME            STRING,
   AUTH_RESULT          STRING,
   RETURN_MESSAGE       STRING,
   MAC                  STRING,
   IP_ADDRESS           STRING,
   CORP_ORG_ID          STRING,
   ACCT_STATUS_TYPE     STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_brd_auth_log';

--DWD在线记录表
CREATE TABLE IF NOT EXISTS DWD_DR_BRD_EXPEND  (
   RECORD_ID            STRING,
   USER_NAME            STRING,
   ORG_CODE             STRING,
   ACCT_STATUS_TYPE     STRING,
   ACCT_START_TIME      STRING,
   ACCT_STOP_TIME       STRING,
   ACCT_SESSION_TIME    STRING,
   REQUEST_DATE         STRING,
   ACCT_INPUT_OCTETS    STRING,
   ACCT_OUTPUT_OCTETS   STRING,
   ACCT_SESSION_ID      STRING,
   SERVICE_CODE         STRING,
   ACCT_TERMINATE_CAUSE STRING,
   NAS_IDENTIFIER       STRING,
   NAS_IP_ADDRESS       STRING,
   CLIENT_IP_ADDRESS    STRING,
   NAS_PORT_ID          STRING,
   MAC_ADDRESS          STRING,
   RESERVE1             STRING,
   RESERVE2             STRING,
   RESERVE3             STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_dr_brd_expend';

--DWD域名统计表
CREATE TABLE IF NOT EXISTS DWD_DOMAIN_STATISTICS  (
   ID                      STRING,
   DOMAIN_NAME             STRING,
   TOTAL_REQUEST_COUNT     STRING,
   REQUEST_COUNT           STRING,
   TOTAL_RESPONSE_COUNT    STRING,
   TOTAL_RESPONSE_RATE     STRING,
   FAILURE_RESPONSE_COUNT  STRING,
   FAILURE_RESPONSE_RATE   STRING,
   NXDOMAIN_COUNT          STRING,
   NXDOMAIN_RATE           STRING,
   SUCCESS_RESOLUTION_RATE STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_domain_statistics';

--DWD上行数据表
CREATE TABLE IF NOT EXISTS DWD_UPLINK_DATA  (
   USER_ACCOUNT         STRING,
   PROTOCOL_TYPE        STRING,
   SOURCE_IP            STRING,
   DESTINATION_IP       STRING,
   SOURCE_PORT          STRING,
   DESTINATION_PORT     STRING,
   DOMAIN_NAME          STRING,
   URL                  STRING,
   REFERER              STRING,
   USER_AGENT           STRING,
   COOKIE               STRING,
   ACCESS_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_uplink_data';

--DWD网页浏览表
CREATE TABLE IF NOT EXISTS DWD_WEB_BROWSE  (
   TASK_ID                  STRING,
   TASK_NAME                STRING,
   TASK_URL                 STRING,
   ERROR_DESC               STRING,
   URL_REDIRECT             STRING,
   DNS_QUERY_TIME           STRING,
   TCP_CONNET_TIME          STRING,
   SSL_HANDSHAKE_TIME       STRING,
   CLIENT_REQUEST_TIME      STRING,
   SERVER_RESPONSE_TIME     STRING,
   REDIRECT_TIME            STRING,
   BASIC_DOC_DOWNLOAD_TIME  STRING,
   RENDER_TIME              STRING,
   FIRST_PACKET_TIME        STRING,
   BASIC_DOC_DOWNLOAD_SPEED STRING,
   RENDER_SPEED             STRING,
   DOWNLOAD_SPEED           STRING,
   BASIC_DOC_ACTUAL_BYTES   STRING,
   BASIC_DOC_DOWNLOAD_BYTES STRING,
   MONITOR_DATE             STRING,
   DOWNLOAD_BYTES           STRING,
   DNS_RESOLUTION_COUNT     STRING,
   TCP_CONNECT_COUNT        STRING,
   PERFORMANCE              STRING,
   TARGET_IP                STRING,
   FIRST_SCREEN_TIME        STRING,
   TARGET_CITY              STRING,
   TARGET_OPERATOR          STRING,
   MONITOR_CITY             STRING,
   MONITOR_PROVINCE         STRING,
   MONITOR_OPERATOR         STRING,
   MONITOR_DNS              STRING,
   MONITOR_BANDWIDTH        STRING,
   MONITOR_TYPE             STRING,
   MONITOR_IP               STRING,
   MONITOR_CPU_USAGE        STRING,
   MONITOR_MEMORY_USAGE     STRING,
   CURRENT_AVG_SPEED        STRING,
   MONITOR_PROCESSES        STRING,
   INCREMENT_ID             STRING,
   MAIN_ID                  STRING,
   USER_NAME                STRING,
   BROWSER_BLOCK_TIME       STRING,
   ROUNDTRIPS               STRING,
   ELEMENT_ERROR_TAB        STRING,
   AVG_DNS_QUERY_TIME       STRING,
   AVG_TCP_CONNET_TIME      STRING,
   AVG_SEND_REQUEST_TIME    STRING,
   AVG_SERVER_RESPONSE_TIME STRING,
   AVG_DOWNLOAD_TIME        STRING,
   AVG_SSL_HANDSHAKE_TIME   STRING,
   PROJECTED_DNS_TIME       STRING,
   PROJECTED_TCP_TIME       STRING,
   PROJECTED_REQUEST_TIME   STRING,
   PROJECTED_RESPONSE_TIME  STRING,
   PROJECTED_DOWNLOAD_TIME  STRING,
   PROJECTED_SSL_TIME       STRING,
   CLIENT_ONLY_ID           STRING,
   BLOCK_PROJECTED_TIME     STRING,
   COMPLETE_DOC_TIME        STRING,
   HEADER                   STRING,
   ERROR_SNAPSHOT           STRING,
   SOURCE_CODE              STRING,
   COUNTRY                  STRING,
   BROWSER_KERNEL           STRING,
   RESOLUTION               STRING,
   CPU_NAME                 STRING,
   CPU_FREQUENCY            STRING,
   CPU_COUNT                STRING,
   MEMORY_SIZE              STRING,
   GRAPHICS                 STRING,
   CPU_CURVE                STRING,
   MEMORY_CURVE             STRING,
   REQUEST_HEADER           STRING,
   ELE_LOADED_SUCCESS_COUNT STRING,
   ELE_REDIRECT_COUNT       STRING,
   ELE_REQUEST_ERROR_COUNT  STRING,
   ELE_SERVER_ERROR_COUNT   STRING,
   ELE_UNCONNET_COUNT       STRING,
   ONLOAD_TIME              STRING,
   DOMREADY_TIME            STRING,
   ONLOAD_URL               STRING,
   FIRST_SCREEN_URL         STRING,
   CYCLE_SCREENSHOT         STRING,
   SCREEN_FULL_RENDER_TIME  STRING,
   SCREEN_ELEMENT_COUNT     STRING,
   FIRST_RENDER_TIME        STRING,
   ELEMENT_HIJACK_COUNT     STRING,
   DOMAIN_HIJACK_COUNT      STRING,
   HIJACK_COUNT             STRING,
   HIJACK_RATE              STRING,
   TARGET_PROVINCE          STRING,
   BROWSER_VERSION          STRING,
   DATA_SOURCE_CD           STRING,
   ETL_CYCLE                STRING,
   ETL_DATE                 STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_web_browse';

--DWD浏览平均数据表
CREATE TABLE IF NOT EXISTS DWD_BROWSE_AVG_DATA  (
   TASK_NAME                STRING,
   MONITOR_COUNT            STRING,
   SUCCESS_COUNT            STRING,
   BASIC_DOC_DNS_TIME       STRING,
   BASIC_DOC_TCP_TIME       STRING,
   BASIC_DOC_REQUEST_TIME   STRING,
   BASIC_DOC_RESPONSE_TIME  STRING,
   BASIC_DOC_DOWNLOAD_TIME  STRING,
   BASIC_DOC_DOWNLOAD_SPEED STRING,
   OVERALL_SPEED            STRING,
   RENDER_SPEED             STRING,
   ERROR_COUNT              STRING,
   AVAILABILITY             STRING,
   DOWNLOAD_BYTES           STRING,
   PERFORMANCE              STRING,
   FIRST_SCREEN_TIME        STRING,
   PROJECTED_DNS_TIME       STRING,
   PROJECTED_TCP_TIME       STRING,
   PROJECTED_RESPONSE_TIME  STRING,
   PROJECTED_DOWNLOAD_TIME  STRING,
   BASIC_DOC_DOWNLOAD_BYTES STRING,
   AVG_DNS_TIME             STRING,
   AVG_TCP_TIME             STRING,
   AVG_RESPONSE_TIME        STRING,
   AVG_DOWNLOAD_TIME        STRING,
   TCP_CONNECT_COUNT        STRING,
   DNS_RESOLUTION_COUNT     STRING,
   SSL_HANDSHAKE_TIME       STRING,
   FIRST_PACKET_TIME        STRING,
   ROUNDTRIPS               STRING,
   TOTAL_ELEMENT_COUNT      STRING,
   AVG_ERR_ELEMENT_COUNT    STRING,
   TOTAL_ERR_ELEMENT_COUNT  STRING,
   ELEMENT_AVAILABILITY     STRING,
   ERROR_TYPE               STRING,
   ERROR_CITY               STRING,
   PASS_RATE                STRING,
   ELEMENT_HIJACK_COUNT     STRING,
   DOMAIN_HIJACK_COUNT      STRING,
   HIJACK_COUNT             STRING,
   HIJACK_RATE              STRING,
   AVG_ELEMENT_COUNT        STRING,
   DATA_SOURCE_CD           STRING,
   ETL_CYCLE                STRING,
   ETL_DATE                 STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_browse_avg_data';

--DWD视频体验表
CREATE TABLE IF NOT EXISTS DWD_VIDEO_VIEW  (
   TASK_ID                 STRING,
   TASK_NAME               STRING,
   TASK_URL                STRING,
   VIDEO_ERROR_DESC        STRING,
   MONITOR_DATE            STRING,
   TARGET_IP               STRING,
   BUFFER_COUNT            STRING,
   DOWNLOAD_SPEED          STRING,
   FRAME_SPEED             STRING,
   VIDEO_REAL_ADDRESS      STRING,
   DOWNLOAD_BYTES          STRING,
   DNS_TIME                STRING,
   TCP_CONNET_TIME         STRING,
   RESPONSE_TIME           STRING,
   PER_SEGMENT_PLAY_STATUS STRING,
   FIRST_BUFFER_TIME       STRING,
   BUFFER_TIME             STRING,
   TARGET_CITY             STRING,
   TARGET_OPERATOR         STRING,
   MONITOR_PROVINCE        STRING,
   MONITOR_CITY            STRING,
   MONITOR_OPERATOR        STRING,
   MONITOR_DNS             STRING,
   MONITOR_BANDWIDTH       STRING,
   MONITOR_IP              STRING,
   MONITOR_TYPE            STRING,
   MONITOR_CPU_USAGE       STRING,
   MONITOR_MEMORY_USAGE    STRING,
   CURRENT_AVG_SPEED       STRING,
   MONITOR_AD_PLAY_COUNT   STRING,
   MONITOR_PROCESSES       STRING,
   FIRST_PLAY_TIME         STRING,
   THROUGHPUT              STRING,
   PLAY_STATUS             STRING,
   PLAY_STATUS_TIME_POINT  STRING,
   INCREMENT_ID            STRING,
   MAIN_ID                 STRING,
   USER_NAME               STRING,
   TARGET_CITY_ID          STRING,
   TARGET_OPERATOR_ID      STRING,
   MONITOR_CITY_ID         STRING,
   MONITOR_OPERATOR_ID     STRING,
   INTERNAL_ERROR          STRING,
   PAGE_FIRST_PKG_TIME     STRING,
   PAGE_FIRST_SCREEN_TIME  STRING,
   VIDEO_FIRST_PKG_TIME    STRING,
   FIRST_FRAME_TIME        STRING,
   THROUGHPUT_TIME         STRING,
   TOTAL_SCHEDUL_TIME      STRING,
   SCHEDUL_COUNT           STRING,
   SCHEDUL_DNS             STRING,
   SCHEDUL_TCP             STRING,
   SCHEDUL_SEND            STRING,
   SCHEDUL_RESPONSE        STRING,
   SCHEDUL_DOWNLOAD_TIME   STRING,
   CLIENT_ONLY_ID          STRING,
   WAIT_TIME_RATE          STRING,
   DATA_SOURCE_CD          STRING,
   ETL_CYCLE               STRING,
   ETL_DATE                STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_video_view';

--DWD流媒体
CREATE TABLE IF NOT EXISTS DWD_STREAMING_MEDIA  (
   VALID_MONITOR_COUNT  STRING,
   TASK_NAME            STRING,
   TASK_ID              STRING,
   TOTAL_BUFFER_COUNT   STRING,
   TOTAL_DOWNLOAD_BYTES STRING,
   AVG_DOWNLOAD_SPEED   STRING,
   FRAME_SPEED          STRING,
   DNS_TIME             STRING,
   TCP_CONNET_TIME      STRING,
   FIRST_PLAY_TIME      STRING,
   RESPONSE_TIME        STRING,
   FIRST_BUFFER_TIME    STRING,
   TOATL_BUFFER_TIME    STRING,
   VIDEO_CONNET_TIME    STRING,
   FIRST_FRAME_TIME     STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_streaming_media';

--DWD网络环境表
CREATE TABLE IF NOT EXISTS DWD_NETWORK  (
   TASK_ID              STRING,
   TASK_NAME            STRING,
   TASK_URL             STRING,
   DNS_ERROR_DESC       STRING,
   A_ADDRESS            STRING,
   CNAME_ADDRESS        STRING,
   DNS_TIME             STRING,
   NS_SERVER_DOMAIN     STRING,
   NS_SERVER_IP         STRING,
   TIME_DELAY           STRING,
   ICMP_ERROR_DESC      STRING,
   ICMP_SERVER_IP       STRING,
   ICMP_COUNT           STRING,
   ICMP_OVERTIME_COUNT  STRING,
   TRACERT_SERVER_IP    STRING,
   TRACERT_COUNT        STRING,
   TRACERT_IP           STRING,
   TRACERT_ERROR_DESC   STRING,
   TRACERT_TIME         STRING,
   MONITOR_DATE         STRING,
   MONITOR_PROVINCE     STRING,
   MONITOR_CITY         STRING,
   MONITOR_OPERATOR     STRING,
   MONITOR_DNS          STRING,
   MONITOR_BANDWIDTH    STRING,
   MONITOR_TYPE         STRING,
   MONITOR_IP           STRING,
   MAIN_ID              STRING,
   INCREMENT_ID         STRING,
   DNS_DETAIL_INFO      STRING,
   CLIENT_CODE          STRING,
   PACKET_LOSS_RATE     STRING,
   TARGET_CITY          STRING,
   TARGET_OPERATOR      STRING,
   CLIENT_ID            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_network';

--DWD电视收视日志表
CREATE TABLE IF NOT EXISTS DWD_TV_VIEW_LOG  (
   DATA_TYPE_ID         STRING,
   SERIAL_ID            STRING,
   BEGIN_TIME           STRING,
   END_TIME             STRING,
   EVENT_TYPE           STRING,
   EVENT_DESC           STRING,
   DURATION             INT,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_tv_view_log';

--DWD电视频道节目单信息表
CREATE TABLE IF NOT EXISTS DWD_CHANNEL_PROGRAM  (
   CHANNEL_NAME         STRING,
   EVENT_ID             STRING,
   PROGRAM_NAME         STRING,
   BEGIN_TIME           STRING,
   END_TIME             STRING,
   DURATION             STRING,
   EVENT_TYPE           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING,
   program_type       string,
   broad_type          string,
   pro_begin_time    string,
   pro_end_time       string,
   program_num      INT,
   pro_begin_minute_code string,
   pro_end_minute_code string
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_channel_program';

--DWD用户表
--注：这个表是在局方拿不到BOSS源表接口的情况下，整个boss数据只能采用一个表，此表数据来自报表
CREATE TABLE IF NOT EXISTS DWD_RPT_INST_PROD  (
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   CUTOVER_ADDR_NAME    STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   CREATE_DATE          STRING,
   VALID_DATE           STRING,
   REMAINDER_DAYS       STRING,
   EXPIRE_DATE          STRING,
   STATUS_NAME          STRING,
   LOGIN_NAME           STRING,
   LAN_NUMBER           STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_rpt_inst_prod';

--DWD_NGINX日志表
CREATE TABLE IF NOT EXISTS DWD_NGINX_LOG  (
   REMOTE_ADDR          STRING,
   TIME_LOCAL           STRING,
   REQUEST_URL          STRING,
   RE_STATUS            STRING,
   BODY_BYTES_S         STRING,
   HTTP_USER_AGENT      STRING,
   STD_DEVICE_CATE_CODE STRING,
   STD_DEVICE_CATE_NAME STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_nginx_log';

--DWD用户安装记录
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_PROBE_SETUP_LOG  (
   ROW_ID               STRING,
   PROBE_ID             STRING,
   UID                  STRING,
   SETUP_TIME           STRING,
   REMOVE_TIME          STRING,
   ZONE_ID              STRING,
   ADDRESS              STRING,
   TOP_ID               STRING,
   RECONN_TIMES         STRING,
   REBOOT_TIMES         STRING,
   ADSL_ACCOUNT         STRING,
   IPTV_ACCOUNT         STRING,
   IP_ADDRESS           STRING,
   LAN_ADDRESS          STRING,
   IP_CHANGES           STRING,
   USER_DBAND           STRING,
   USER_UBAND           STRING,
   BAND_MEASURES        STRING,
   BAND_GOODS           STRING,
   APPLICATION_ERRORS   STRING,
   POS_LATITUDE         STRING,
   POS_LONGTITUDE       STRING,
   GW_HWADDR            STRING,
   GW_CHANGED           STRING,
   TAP_MODE             STRING,
   TO_TAP_MODE          STRING,
   ADSL_ID              STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_probe_setup_log';

--DWD用户播放行为记录
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_USER_PLAY_RECORDS  (
   ROW_ID               STRING,
   SETUP_ID             STRING,
   TIME                 STRING,
   END_TIME             STRING,
   UUID                 STRING,
   VNAME                STRING,
   VSOURCE_ID           STRING,
   SHARPNESS            STRING,
   VTYPE                STRING,
   VID                  STRING,
   VTIME                STRING,
   PAUSE_TIMES          STRING,
   PAUSE_TIME           STRING,
   PAUSE_POINTS         STRING,
   SEEK_FW_TIMES        STRING,
   SEEK_FW_TIME         STRING,
   SEEK_RW_TIMES        STRING,
   SEEK_RW_TIME         STRING,
   SEEK_FW_RECORDS      STRING,
   SEEK_RW_RECORDS      STRING,
   BUFFER_TIMES         STRING,
   BUFFER_TIME          STRING,
   LABEL_ID             STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   BEFOR_URI            STRING,
   AFTER_URI            STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_user_play_records';

--DWD探针节点记录
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_VISQUAL_PROBES  (
   ROW_ID               STRING,
   SN                   STRING,
   TYPE                 STRING,
   OWNER_ID             STRING,
   HWADDR               STRING,
   VENDOR               STRING,
   MODEL                STRING,
   VERSION              STRING,
   ACTIVE               STRING,
   ONLINE_TIMES         STRING,
   HISTORY_USERS        STRING,
   CURRENT_USERS        STRING,
   ALARM_TEMPLATE_ID    STRING,
   UPDATE_VERSION       STRING,
   SERVICE_OBJECT_TYPE  STRING,
   SW_UPDATE            STRING,
   CREATE_TIME          STRING,
   UPDATE_TIME          STRING,
   RECORD_ZBX           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_visqual_probes';

--DWD会话日志
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_SESSION_LOG  (
   SOURCE_IP            STRING,
   TARGET_IP            STRING,
   NAT_IP               STRING,
   SOURCE_PORT          STRING,
   TARGET_PORT          STRING,
   NAT_PORT             STRING,
   START_TIME           STRING,
   END_TIME             STRING,
   DOWN_FLOW            STRING,
   UP_FLOW              STRING,
   CONTENT_ID           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_session_log';

--DWD_URL日志
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_URL_LOG  (
   SOURCE_IP            STRING,
   TARGET_IP            STRING,
   SOURCE_PORT          STRING,
   TARGET_PORT          STRING,
   START_TIME           STRING,
   END_TIME             STRING,
   DOWN_FLOW            STRING,
   UP_FLOW              STRING,
   CONTENT_ID           STRING,
   URL                  STRING,
   HOST                 STRING,
   REQUEST_TYPE         STRING,
   USER_AGENT           STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_url_log';


--DWD用户表（经分导出）
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_INS_PROD_EXT  (
   OWN_CORP_ORG_ID       STRING,
   PROD_INST_ID          STRING,
   OWN_CORP_STD_ORG_CODE STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DWD/dwd_ins_prod_ext';


-- 客户基础表
CREATE TABLE dwd_fact_cust_base(
  cust_id string, 
  cust_code string, 
  old_cust_id string, 
  old_cust_code string, 
  cust_name string, 
  cust_type string, 
  cust_type1 string, 
  cust_level string, 
  cust_status string, 
  district_id string, 
  district_name string, 
  station_name string, 
  county string, 
  towns string, 
  area string, 
  grid_name string, 
  grid_id string, 
  mgr_addr_id string, 
  mgr_addr_name string, 
  std_addr_id string, 
  std_addr_name string, 
  street_std_addr_id string, 
  street_std_addr_name string, 
  area_std_addr_id string, 
  area_std_addr_name string, 
  door_name string, 
  address string, 
  cont_dflt_mode string, 
  cont_phone1 string, 
  cont_phone2 string, 
  cont_mobile1 string, 
  cont_mobile2 string, 
  cust_cert_type string, 
  cust_cert_no string, 
  cust_cert_addr string, 
  cust_occupation string, 
  border_flag string, 
  create_date string, 
  create_op_id string, 
  create_org_id string, 
  valid_date string, 
  expire_date string, 
  done_date string, 
  op_id string, 
  org_id string, 
  atv_count string, 
  dtv_count string, 
  dftv_count string, 
  dbitv_count string, 
  lan_count string, 
  voip_count string, 
  amsp_count string, 
  hdtv_count string, 
  hditv_count string, 
  cloud_media_count string, 
  user_count string, 
  second_user_count string, 
  is_cloud_media string, 
  is_vaild string, 
  is_dtv_suspend string, 
  is_lan_suspend string, 
  is_voip_suspend string, 
  is_dtv_debt_stop string, 
  is_lan_debt_stop string, 
  is_voip_debt_stop string, 
  is_free string, 
  is_paied string, 
  is_unpay string, 
  is_itv_active string, 
  is_new string, 
  is_lose string, 
  is_entrust string, 
  is_expire_ten_days string, 
  is_high_payoff string, 
  is_dftv_high_payoff string, 
  is_ditv_high_payoff string, 
  is_exchange string, 
  first_unpay_month string, 
  have_switch_on string, 
  tv_pay_status string, 
  tv_game_status string, 
  atv_balance_amount string, 
  public_balance_amount string, 
  dtv_balance_amount string, 
  dbitv_balance_amount string, 
  private_balance_amount string, 
  active_balance_amount string, 
  lan_balance_amount string, 
  zz_balance_amount string, 
  balance_amount string, 
  arpu string, 
  dbitv_arpu string, 
  dftv_arpu string, 
  atv_unpay_amount string, 
  dtv_unpay_amount string, 
  dbitv_unpay_amount string, 
  dftv_unpay_amount string, 
  ditv_unpay_amount string, 
  lan_unpay_amount string, 
  base_unpay_amount string, 
  zz_unpay_amount string, 
  total_unpay_amount string, 
  dtv_avg_conume_amount string, 
  dbitv_avg_consume_amount string, 
  dftv_avg_consume_amount string, 
  ditv_avg_consume_amount string, 
  lan_avg_consume_amount string, 
  amsp_avg_consume_amount string, 
  zz_avg_consume_amount string, 
  avg_consume_amount string, 
  favorite_program_id1 string, 
  favorite_program_id2 string, 
  favorite_program_id3 string, 
  favorite_program_name1 string, 
  favorite_program_name2 string, 
  favorite_program_name3 string, 
  favorite_vod_id1 string, 
  favorite_vod_id2 string, 
  favorite_vod_id3 string, 
  favorite_vod_name1 string, 
  favorite_vod_name2 string, 
  favorite_vod_name3 string, 
  corp_org_id string, 
  own_corp_std_org_code string, 
  own_region_std_org_code string, 
  etl_cycle string, 
  etl_date string)
PARTITIONED BY (pt_mon string)
STORED AS ORCFILE
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DWD/dwd_fact_cust_base'


-- DWD 用户日全量表 BOSS2
CREATE TABLE `dwd_fact_ins_prod_boss2`(
  `prod_inst_id` decimal(14,0), 
  `offer_inst_id` decimal(12,0), 
  `offer_id` decimal(12,0), 
  `brand_id` decimal(12,0), 
  `prod_spec_id` decimal(12,0), 
  `cust_id` decimal(14,0), 
  `acct_id` decimal(14,0), 
  `pay_type` decimal(2,0), 
  `user_type_id` decimal(2,0), 
  `bill_id` varchar(120), 
  `sub_bill_id` varchar(120), 
  `main_prod_inst_id` decimal(14,0), 
  `bill_start_timestamp` timestamp, 
  `user_name` varchar(255), 
  `user_prop` decimal(8,0), 
  `user_group` decimal(12,0), 
  `vip_flag` decimal(2,0), 
  `vip_prop` varchar(12), 
  `boder_flag` decimal(2,0), 
  `subsidy_flag` decimal(2,0), 
  `subsidy_prop` varchar(12), 
  `degree_flag` decimal(2,0), 
  `first_use_timestamp` timestamp, 
  `state` varchar(3), 
  `state_timestamp` timestamp, 
  `oper_state` decimal(2,0), 
  `os_status` varchar(30), 
  `address_id` decimal(12,0), 
  `install_addr_id` decimal(14,0), 
  `install_addr_name` varchar(255), 
  `cont_id` decimal(12,0), 
  `post_mode` decimal(2,0), 
  `post_address_id` decimal(12,0), 
  `access_mode` decimal(2,0), 
  `login_name` varchar(255), 
  `tv_number` varchar(15), 
  `region_id` varchar(6), 
  `sale_op_id` decimal(12,0), 
  `sale_org_id` decimal(12,0), 
  `warrant_cust_id` decimal(12,0), 
  `valid_timestamp` timestamp, 
  `expire_timestamp` timestamp, 
  `create_timestamp` timestamp, 
  `create_op_id` decimal(12,0), 
  `create_org_id` decimal(12,0), 
  `done_timestamp` timestamp, 
  `done_code` decimal(15,0), 
  `op_id` decimal(12,0), 
  `org_id` decimal(12,0), 
  `district_id` decimal(8,0), 
  `corp_org_id` decimal(12,0), 
  `own_corp_std_org_code` varchar(20), 
  `own_region_std_org_code` varchar(20), 
  `std_dis_code` varchar(20), 
  `is_atv` decimal(1,0), 
  `is_dtv` decimal(1,0), 
  `is_dftv` decimal(1,0), 
  `is_dbitv` decimal(1,0), 
  `is_ditv` decimal(1,0), 
  `is_lan` decimal(1,0), 
  `is_voip` decimal(1,0), 
  `is_amsp` decimal(1,0), 
  `is_ext1` decimal(1,0), 
  `is_ext2` decimal(1,0), 
  `is_cloud_media` decimal(1,0), 
  `is_hdtv` decimal(1,0), 
  `is_online` decimal(1,0), 
  `is_atv_online` decimal(1,0), 
  `is_dtv_online` decimal(1,0), 
  `is_dftv_online` decimal(1,0), 
  `is_dbitv_online` decimal(1,0), 
  `is_ditv_online` decimal(1,0), 
  `is_lan_online` decimal(1,0), 
  `is_voip_online` decimal(1,0), 
  `is_amsp_online` decimal(1,0), 
  `is_ext1_online` decimal(1,0), 
  `is_ext2_online` decimal(1,0), 
  `is_hdtv_online` decimal(1,0), 
  `is_up_marketing` decimal(1,0), 
  `is_main` decimal(1,0), 
  `is_second` decimal(1,0), 
  `is_mngbyself` decimal(1,0), 
  `is_mngbycorp` decimal(1,0), 
  `is_trans` decimal(1,0), 
  `is_virtual` decimal(1,0), 
  `is_opening` decimal(1,0), 
  `is_valid` decimal(1,0), 
  `is_valid1` decimal(1,0), 
  `is_valid2` decimal(1,0), 
  `is_expire_ten_days` decimal(1,0), 
  `is_suspend` decimal(1,0), 
  `is_itv_active` decimal(1,0), 
  `is_debt_stop` decimal(1,0), 
  `is_debt_cut` decimal(1,0), 
  `is_mana_stop` decimal(1,0), 
  `is_free` decimal(1,0), 
  `is_paied` decimal(1,0), 
  `is_new` decimal(1,0), 
  `is_new_online` decimal(1,0), 
  `is_lose` decimal(1,0), 
  `is_lose1` decimal(1,0), 
  `is_lose_online` decimal(1,0), 
  `tv_pay_status` decimal(1,0), 
  `is_ins` decimal(1,0), 
  `data_source_cd` varchar(10), 
  `is_history_data` decimal(1,0), 
  `etl_cycle` decimal(14,0), 
  `etl_date` timestamp)
PARTITIONED BY ( 
  `pt_mon` string)
STORED AS orcfile 
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DWD/dwd_fact_ins_prod_boss2'

-- DWD客户全量表BOSS1
CREATE TABLE dwd_fact_cust_b1(
  cust_id DECIMAL(16), 
  cust_code string, 
  old_cust_id string, 
  old_cust_code string, 
  cust_name string, 
  cust_type DECIMAL(1), 
  cust_level DECIMAL(2), 
  cust_status DECIMAL(1), 
  cust_cert_type DECIMAL(2), 
  cust_cert_no string, 
  cust_cert_addr string, 
  cert_valid_date timestamp, 
  cert_expire_date timestamp, 
  cust_occupation DECIMAL(2), 
  border_flag DECIMAL(2), 
  create_date timestamp, 
  create_op_id DECIMAL(16), 
  create_org_id DECIMAL(16), 
  valid_date timestamp, 
  expire_date timestamp, 
  done_date timestamp, 
  done_code DECIMAL(16), 
  op_id DECIMAL(16), 
  org_id DECIMAL(16), 
  corp_org_id DECIMAL(16), 
  own_corp_std_org_code string, 
  own_region_std_org_code string, 
  cust_prop DECIMAL(16), 
  atv_count DECIMAL(16), 
  dtv_count DECIMAL(16), 
  dftv_count DECIMAL(16), 
  dbitv_count DECIMAL(16), 
  ditv_count DECIMAL(16), 
  lan_count DECIMAL(16), 
  voip_count DECIMAL(16), 
  amsp_count DECIMAL(16), 
  ext1_count DECIMAL(16), 
  ext2_count DECIMAL(16), 
  hdtv_count DECIMAL(16), 
  hditv_count DECIMAL(16), 
  cloud_media_count DECIMAL(16), 
  user_count DECIMAL(16), 
  second_user_count DECIMAL(16), 
  is_cloud_media DECIMAL(1), 
  is_vaild DECIMAL(1), 
  is_vaild1 DECIMAL(1), 
  is_vaild2 DECIMAL(1), 
  is_dtv_suspend DECIMAL(1), 
  is_lan_suspend DECIMAL(1), 
  is_voip_suspend DECIMAL(1), 
  is_dtv_debt_stop DECIMAL(1), 
  is_lan_debt_stop DECIMAL(1), 
  is_voip_debt_stop DECIMAL(1), 
  is_dtv_paied DECIMAL(1), 
  is_lan_paied DECIMAL(1), 
  is_voip_paied DECIMAL(1), 
  is_free DECIMAL(1), 
  is_paied DECIMAL(1), 
  is_unpay DECIMAL(1), 
  is_itv_active DECIMAL(1), 
  is_new DECIMAL(1), 
  is_lose DECIMAL(1), 
  have_switch_on DECIMAL(1), 
  tv_pay_status DECIMAL(1), 
  tv_game_status DECIMAL(1), 
  is_ins DECIMAL(1), 
  is_exchange DECIMAL(1), 
  cust_type1 DECIMAL(1), 
  data_source_cd string, 
  is_history_data DECIMAL(1), 
  etl_cycle DECIMAL(16), 
  etl_date timestamp)
  PARTITIONED BY ( 
    pt_mon string)
  stored AS orcfile
  LOCATION
  '/asiainfo/hive/DWD/dwd_fact_cust_b1'


-- DWD客户全量表BOSS2
CREATE TABLE DWD_fact_cust_b2(
  CUST_ID                       DECIMAL(14)     ,
  CUST_CODE                     STRING   ,
  OLD_CUST_ID                   STRING   ,
  OLD_CUST_CODE                 STRING   ,
  CUST_NAME                     STRING  ,
  CUST_TYPE                     DECIMAL(1)      ,
  CUST_LEVEL                    DECIMAL(2)      ,
  CUST_STATUS                   DECIMAL(1)      ,
  CUST_CERT_TYPE                DECIMAL(2)      ,
  CUST_CERT_NO                  STRING   ,
  CUST_CERT_ADDR                STRING  ,
  CERT_VALID_date               TIMESTAMP           ,
  CERT_EXPIRE_date              TIMESTAMP           ,
  CUST_OCCUPATION               DECIMAL(2)      ,
  BORDER_FLAG                   DECIMAL(2)      ,
  CREATE_date                   TIMESTAMP           ,
  CREATE_OP_ID                  DECIMAL(12)     ,
  CREATE_ORG_ID                 DECIMAL(12)     ,
  VALID_date                    TIMESTAMP           ,
  EXPIRE_date                   TIMESTAMP           ,
  DONE_date                     TIMESTAMP           ,
  DONE_CODE                     DECIMAL(15)     ,
  OP_ID                         DECIMAL(12)     ,
  ORG_ID                        DECIMAL(12)     ,
  DISTRICT_ID                   DECIMAL(8)      ,
  CORP_ORG_ID                   DECIMAL(12)     ,
  STD_ORG_CODE                             STRING   ,
  OWN_CORP_STD_ORG_CODE                    STRING   ,
  OWN_REGION_STD_ORG_CODE                  STRING   ,
  STD_DIS_CODE                             STRING   ,
  CUST_PROP                                DECIMAL(8)      ,
  ATV_COUNT                                DECIMAL(8)      ,
  DTV_COUNT                                DECIMAL(8)      ,
  DFTV_COUNT                               DECIMAL(8)      ,
  DBITV_COUNT                              DECIMAL(8)      ,
  DITV_COUNT                               DECIMAL(8)      ,
  LAN_COUNT                                DECIMAL(8)      ,
  VOIP_COUNT                               DECIMAL(8)      ,
  AMSP_COUNT                               DECIMAL(8)      ,
  EXT1_COUNT                               DECIMAL(8)      ,
  EXT2_COUNT                               DECIMAL(8)      ,
  HDTV_COUNT                               DECIMAL(8)      ,
  HDITV_COUNT                              DECIMAL(8)      ,
  CLOUD_MEDIA_COUNT                        DECIMAL(8)      ,
  USER_COUNT                               DECIMAL(8)      ,
  SECOND_USER_COUNT                        DECIMAL(8)      ,
  IS_CLOUD_MEDIA                           DECIMAL(1)      ,
  IS_VALID                                 DECIMAL(1)      ,
  IS_VALID1                                DECIMAL(1)      ,
  IS_VALID2                                DECIMAL(1)      ,
  IS_ONLINE                                DECIMAL(1)      ,
  IS_DTV_SUSPEND                           DECIMAL(1)      ,
  IS_LAN_SUSPEND                           DECIMAL(1)      ,
  IS_VOIP_SUSPEND                          DECIMAL(1)      ,
  IS_DEBT_STOP                             DECIMAL(1)      ,
  IS_DEBT_CUT                              DECIMAL(1)      ,
  IS_DTV_MANA_STOP                         DECIMAL(1)      ,
  IS_LAN_MANA_STOP                         DECIMAL(1)      ,
  IS_FREE                                  DECIMAL(1)      ,
  IS_PAIED                                 DECIMAL(1)      ,
  IS_UNPAY                                 DECIMAL(1)      ,
  IS_ITV_ACTIVE                            DECIMAL(1)      ,
  IS_NEW                                   DECIMAL(1)      ,
  IS_LOSE                                  DECIMAL(1)      ,
  IS_LOSE1                                 DECIMAL(1)      ,
  HAVE_SWITCH_ON                           DECIMAL(1)      ,
  TV_PAY_STATUS                            DECIMAL(1)      ,
  TV_GAME_STATUS                           DECIMAL(1)      ,
  IS_HOUSE                                 DECIMAL(1)      ,
  IS_INS                                   DECIMAL(1)      ,
  IS_DTV_PAIED                             DECIMAL(1)      ,
  DATA_SOURCE_CD                           STRING   ,
  IS_HISTORY_DATA                          DECIMAL(1)      ,
  ETL_CYCLE                                DECIMAL(14)     ,
  ETL_date                                 TIMESTAMP
)
  PARTITIONED BY ( 
    pt_mon string)
  stored AS orcfile
  LOCATION
  '/asiainfo/hive/DWD/dwd_fact_cust_b2'


-- DWD客户住宅表BOSS1
CREATE TABLE DWD_FACT_INS_ADDRESS_B1  (
  CUST_ID             DECIMAL(14)  ,
  CUST_ADDR_ID        DECIMAL(14)  ,
  STD_ADDR_ID         VARCHAR(30),
  STD_ADDR_NAME       VARCHAR(255),
  MOVE_FLAG           DECIMAL(2),
  REGION_ID           VARCHAR(6),
  DOOR_NAME           VARCHAR(255),
  RELOCATE_FLAG       DECIMAL(2),
  CAN_TRANSFER_FLAG   DECIMAL(2),
  TRANSFER_STATUS     DECIMAL(2),
  TRANSFER_NO         VARCHAR(64),
  AUDIT_FLAG          DECIMAL(2),
  STREET_STD_ADDR_ID  VARCHAR(30),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    VARCHAR(30),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  MGR_ADDR_ID         VARCHAR(30),
  MGR_ADDR_NAME       VARCHAR(255),
  DISTRICT_ID         VARCHAR(30),
  DISTRICT_NAME       VARCHAR(100),
  VALID_DATE          TIMESTAMP  ,
  EXPIRE_DATE         TIMESTAMP  ,
  CREATE_DATE         TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12),
  CREATE_ORG_ID       DECIMAL(12),
  OWN_ORG_ID          DECIMAL(12),
  OWN_CORP_ORG_ID     DECIMAL(12),
  DONE_DATE           TIMESTAMP,
  DONE_CODE           DECIMAL(15),
  OP_ID               DECIMAL(12),
  ORG_ID              DECIMAL(12),
  STD_ORG_CODE        VARCHAR(20),
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  DATA_SOURCE_CD      VARCHAR(10),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP 
)
PARTITIONED BY ( 
  pt_mon string)
stored AS orcfile
LOCATION
'/asiainfo/hive/DWD/dwd_fact_ins_address_b1'
;


-- DWD客户住宅表BOSS2
CREATE TABLE DWD_FACT_INS_ADDRESS_B2  (
  CUST_ADDR_ID        DECIMAL(14) ,
  CUST_ID             DECIMAL(14),
  STD_ADDR_ID         VARCHAR(40),
  STD_ADDR_NAME       VARCHAR(255),
  MOVE_FLAG           DECIMAL(2),
  REGION_ID           VARCHAR(6),
  DOOR_NAME           VARCHAR(255),
  RELOCATE_FLAG       DECIMAL(2),
  CAN_TRANSFER_FLAG   DECIMAL(2),
  TRANSFER_STATUS     DECIMAL(2),
  TRANSFER_NO         VARCHAR(64),
  AUDIT_FLAG          DECIMAL(2),
  STREET_STD_ADDR_ID  DECIMAL(14),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    DECIMAL(14),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  BUILD_STD_ADDR_ID   DECIMAL(14),
  BUILD_STD_ADDR_NAME VARCHAR(255),
  MGR_ADDR_ID         DECIMAL(14),
  MGR_ADDR_NAME       VARCHAR(255),
  DISTRICT_ID         DECIMAL(8),
  DISTRICT_NAME       VARCHAR(100),
  VALID_DATE         TIMESTAMP ,
  EXPIRE_DATE        TIMESTAMP ,
  CREATE_DATE        TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12),
  CREATE_ORG_ID       DECIMAL(12),
  OWN_ORG_ID          DECIMAL(12),
  OWN_CORP_ORG_ID     DECIMAL(12),
  DONE_DATE          TIMESTAMP,
  DONE_CODE           DECIMAL(15),
  OP_ID               DECIMAL(12),
  ORG_ID              DECIMAL(12),
  STD_ORG_CODE        VARCHAR(20),
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  STD_DIS_CODE        VARCHAR(20) ,
  DATA_SOURCE_CD      VARCHAR(10),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE           TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
stored AS orcfile
LOCATION
'/asiainfo/hive/DWD/dwd_fact_ins_address_b2'
;



-- DWD 客户网格关系表 BOSS1 
CREATE TABLE DWD_GS_CUST_GRID_REL_B1  (
  CUST_ID             DECIMAL(16),
  GRID_ID             DECIMAL(16),
  GRID_NAME           VARCHAR(200),
  GRID_TYPE           DECIMAL(2),
  MGR_DEPT_ID         DECIMAL(16),
  MGR_DEPT_NAME       VARCHAR(200),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  NOTES               VARCHAR(200),
  ORG_NAME            VARCHAR(200),
  REGION_ID           DECIMAL(16),
  REGION_NAME         VARCHAR(200),
  TEAM_ID             DECIMAL(16),
  DATA_SOURCE_CD      VARCHAR(20),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP 
)
PARTITIONED BY ( 
  pt_mon CHAR(6))
stored AS orcfile
LOCATION
'/asiainfo/hive/DWD/dwd_gs_cust_grid_rel_b1'
;



-- DWD 客户网格关系表 BOSS2 
CREATE TABLE DWD_GS_CUST_GRID_REL_B2  (
  CUST_ID             DECIMAL(16),
  GRID_ID             DECIMAL(16),
  GRID_NAME           VARCHAR(200),
  GRID_TYPE           DECIMAL(2),
  MGR_DEPT_ID         DECIMAL(16),
  MGR_DEPT_NAME       VARCHAR(200),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  NOTES               VARCHAR(200),
  ORG_NAME            VARCHAR(200),
  REGION_ID           DECIMAL(16),
  REGION_NAME         VARCHAR(200),
  TEAM_ID             DECIMAL(16),
  DATA_SOURCE_CD      VARCHAR(20),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon CHAR(6))
stored AS orcfile
LOCATION
'/asiainfo/hive/DWD/dwd_gs_cust_grid_rel_b2'
;

-- DWD产品单元(BOSS2)
CREATE TABLE DWD_UP_PRODUCT_ITEM_B2  (
   PRODUCT_ITEM_ID      DECIMAL(12),
   EXTEND_ID            DECIMAL(12),
   CODE                 VARCHAR(50),
   NAME                 VARCHAR(200),
   ITEM_TYPE            VARCHAR(40),
   PRIORITY             DECIMAL(6),
   SORT_BY              DECIMAL(6),
   DESCRIPTION          VARCHAR(255),
   CREATER              DECIMAL(12),
   MODIFIER             DECIMAL(12),
   STATE                DECIMAL(2),
   DEL_FLAG             DECIMAL(2),
   REMARK               VARCHAR(255),
   CREATE_DATE          TIMESTAMP,
   MODIFY_DATE          TIMESTAMP,
   VALID_DATE           TIMESTAMP,
   EXPIRE_DATE          TIMESTAMP,
   USE_EFF_DATE         TIMESTAMP,
   USE_EXP_DATE         TIMESTAMP,
   ENT_ID               DECIMAL(12),
   CHECKER              DECIMAL(12),
   ISLOCK               DECIMAL(2),
   SUPPLIER_ID          VARCHAR(20),
   PROVIDER_TYPE        DECIMAL(2),
   BUSINESS_DOMAIN_ID   VARCHAR(1000),
   PLATFORM_ID          DECIMAL(12),
   EXTEND_ID2           VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   EXT1               DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS orcfile
LOCATION '/asiainfo/hive/DWD/dwd_up_product_item_b2'
;

--DWD产品单元(3.0)
CREATE EXTERNAL TABLE IF NOT EXISTS DWD_UP_PRODUCT_ITEM  (
   PRODUCT_ITEM_ID      DECIMAL(12),
   EXTEND_ID            DECIMAL(12),
   CODE                 VARCHAR(50),
   NAME                 VARCHAR(200),
   ITEM_TYPE            VARCHAR(40),
   PRIORITY             DECIMAL(6),
   SORT_BY              DECIMAL(6),
   DESCRIPTION          VARCHAR(255),
   CREATER              DECIMAL(12),
   MODIFIER             DECIMAL(12),
   STATE                DECIMAL(2),
   DEL_FLAG             DECIMAL(2),
   REMARK               VARCHAR(255),
   CREATE_DATE          TIMESTAMP,
   MODIFY_DATE          TIMESTAMP,
   VALID_DATE           TIMESTAMP,
   EXPIRE_DATE          TIMESTAMP,
   USE_EFF_DATE         TIMESTAMP,
   USE_EXP_DATE         TIMESTAMP,
   ENT_ID               DECIMAL(12),
   CHECKER              DECIMAL(12),
   ISLOCK               DECIMAL(2),
   SUPPLIER_ID          VARCHAR(20),
   PROVIDER_TYPE        DECIMAL(2),
   BUSINESS_DOMAIN_ID   VARCHAR(1000),
   PLATFORM_ID          DECIMAL(12),
   EXTEND_ID2           VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   EXT1                 DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)PARTITIONED BY (PT_MON CHAR(6))
STORED AS orcfile
LOCATION '/asiainfo/hive/DWD/dwd_up_product_item';




-- DWD产品订购月全量表(BOSS1)
CREATE TABLE DWD_FACT_INS_SRVPKG  (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_NEW               DECIMAL(1),
   IS_NEW_ONLINE        DECIMAL(1),
   IS_CANCEL            DECIMAL(1),
   IS_CANCEL_ONLINE     DECIMAL(1),
   IS_INS               DECIMAL(1),
   IS_ONLINE            DECIMAL(1),
   PAR_VALUE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP 
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS orcfile
LOCATION '/asiainfo/hive/DWD/dwd_fact_ins_srvpkg'
;

-- DWD产品订购月全量表(BOSS2)
CREATE TABLE DWD_FACT_INS_SRVPKG_b2  (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_UP_MARKETING      DECIMAL(1),
   IS_NEW               DECIMAL(1),
   IS_NEW_ONLINE        DECIMAL(1),
   IS_CANCEL            DECIMAL(1),
   IS_CANCEL_ONLINE     DECIMAL(1),
   IS_INS               DECIMAL(1),
   IS_ONLINE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (pt_mon CHAR(6))
stored AS orcfile
LOCATION '/asiainfo/hive/DWD/dwd_fact_ins_srvpkg_b2'



CREATE TABLE dwd_ter_service(
  sn VARCHAR(100), 
  ucendtime timestamp, 
  time timestamp, 
  smcid VARCHAR(20), 
  uncontinue DECIMAL(16), 
  service_id VARCHAR(5), 
  ts_id VARCHAR(5), 
  frequency VARCHAR(100), 
  channel_name VARCHAR(100), 
  program_nam VARCHAR(100), 
  authority VARCHAR(100), 
  signal_strength DECIMAL(16), 
  signal_quality DECIMAL(16), 
  sdv VARCHAR(20), 
  data_source_cd VARCHAR(20), 
  is_history_data decimal(2), 
  cust_id VARCHAR(20), 
  acct_id VARCHAR(20), 
  own_corp_std_org_code VARCHAR(6), 
  user_id VARCHAR(20), 
  etl_cycle char(6), 
  etl_date timestamp)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DWD/dwd_ter_service'

```



###### DWD_BRD_AUTH_LOG

认证记录表

| **字段描述**     | **字段代码**          | **数据类型** | **长度** |      |
| ---------------- | --------------------- | ------------ | -------- | ---- |
| 序列号           | AUTH_LOG_ID           | STRING       |          |      |
| LOGIN_NAME       | LOGIN_NAME            | STRING       |          |      |
| LOGIN_PASSWORD   | LOGIN_PASSWORD        | STRING       |          |      |
| AUTH_TIME        | AUTH_TIME             | STRING       |          |      |
| AUTH_RESULT      | AUTH_RESULT           | STRING       |          |      |
| RETURN_MESSAGE   | RETURN_MESSAGE        | STRING       |          |      |
| MAC              | MAC                   | STRING       |          |      |
| IP_ADDRESS       | IP_ADDRESS            | STRING       |          |      |
| CORP_ORG_ID      | CORP_ORG_ID           | STRING       |          |      |
| ACCT_STATUS_TYPE | ACCT_STATUS_TYPE      | STRING       |          |      |
| 数据来源系统编码 | DATA_SOURCE_CD        | STRING       |          |      |
| ETL处理周期      | ETL_CYCLE             | STRING       |          |      |
| ETL处理时间      | ETL_DATE              | STRING       |          |      |
| 标准归属分公司   | OWN_CORP_STD_ORG_CODE | STRING       |          |      |

#### 第四章 维表DIM

###### DDL建表语句

```
--DIM标准组织表
CREATE TABLE IF NOT EXISTS DIM_STD_ORGANIZE  (
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
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_organize';

--DIM标准带宽
CREATE TABLE IF NOT EXISTS DIM_STD_BANDWIDTH  (
   STD_BANDWIDTH_CODE   STRING,
   STD_BANDWIDTH_NAME   STRING,
   P_STD_BANDWIDTH_CODE STRING,
   FULLPATH             STRING,
   ORIGINAL_CODE        STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_bandwidth';

--DIM标准产品周期
CREATE TABLE IF NOT EXISTS DIM_STD_PROD_CYCLE  (
   STD_PROD_CYCLE_CODE   STRING,
   STD_PROD_CYCLE_NAME   STRING,
   P_STD_PROD_CYCLE_CODE STRING,
   FULLPATH              STRING,
   ORIGINAL_CODE         STRING,
   NOTES                 STRING,
   IS_DISPLAY            STRING,
   DISPLAY_ORDER         STRING,
   IS_VALID              STRING,
   UPDATE_DATE           STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_prod_cycle';

--DIM标准频道
CREATE TABLE IF NOT EXISTS DIM_STD_CHANNEL  (
   STD_CHANNEL_CODE       VARCHAR(20),
   STD_CHANNEL_NAME       VARCHAR(100),
   P_STD_CHANNEL_CODE     VARCHAR(20),
   STD_CHANNEL_GROUP_CODE VARCHAR(20),
   STD_CHANNEL_GROUP_NAME VARCHAR(50),
   FULLPATH               VARCHAR(100),
   ORIGINAL_CODE          VARCHAR(20),
   NOTES                  VARCHAR(200),
   IS_DISPLAY             DECIMAL(2),
   DISPLAY_ORDER          DECIMAL(16),
   IS_VALID               DECIMAL(2),
   std_org_code         VARCHAR(6),
   UPDATE_DATE            TIMESTAMP
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_channel';

--DIM标准节目
CREATE TABLE IF NOT EXISTS DIM_STD_PROGRAM  (
   STD_PROGRAM_CODE       STRING,
   STD_PROGRAM_NAME       STRING,
   P_STD_PROGRAM_CODE     STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_program';

--DIM标准认证失败原因
CREATE TABLE IF NOT EXISTS DIM_STD_FAILURE_REASON  (
   STD_FAILURE_REASON_CODE   STRING,
   STD_FAILURE_REASON_NAME   STRING,
   P_STD_FAILURE_REASON_CODE STRING,
   FULLPATH                  STRING,
   ORIGINAL_CODE             STRING,
   NOTES                     STRING,
   IS_DISPLAY                STRING,
   DISPLAY_ORDER             STRING,
   IS_VALID                  STRING,
   UPDATE_DATE               STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_failure_reason';

--DIM标准认证方式
CREATE TABLE IF NOT EXISTS DIM_STD_AUTH_MODE  (
   STD_AUTH_MODE_CODE   STRING,
   STD_AUTH_MODE_NAME   STRING,
   P_STD_AUTH_MODE_CODE STRING,
   FULLPATH             STRING,
   ORIGINAL_CODE        STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_auth_mode';

--DIM标准网址库
CREATE TABLE IF NOT EXISTS DIM_STD_URL  (
   STD_URL_CODE         STRING,
   STD_URL_NAME         STRING,
   URL                  STRING,
   URL_TYPE             STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_url';

--DIM标准上网设备
CREATE TABLE IF NOT EXISTS DIM_STD_DEVICE_CATE  (
   STD_DEVICE_CATE_CODE   STRING,
   STD_DEVICE_CATE_NAME   STRING,
   P_STD_DEVICE_CATE_CODE STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_device_cate';

--DIM标准业务类型
CREATE TABLE IF NOT EXISTS DIM_STD_UP_BUSI_TYPE  (
   STD_UP_BUSI_TYPE_CODE   STRING,
   STD_UP_BUSI_TYPE_NAME   STRING,
   P_STD_UP_BUSI_TYPE_CODE STRING,
   FULLPATH                STRING,
   ORIGINAL_CODE           STRING,
   NOTES                   STRING,
   IS_DISPLAY              STRING,
   DISPLAY_ORDER           STRING,
   IS_VALID                STRING,
   UPDATE_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_up_busi_type';

--DIM标准账本类型
CREATE TABLE IF NOT EXISTS DIM_STD_BALANCE_TYPE  (
   STD_BALANCE_TYPE_CODE   STRING,
   STD_BALANCE_TYPE_NAME   STRING,
   P_STD_BALANCE_TYPE_CODE STRING,
   FULLPATH                STRING,
   ORIGINAL_CODE           STRING,
   NOTES                   STRING,
   IS_DISPLAY              STRING,
   DISPLAY_ORDER           STRING,
   IS_VALID                STRING,
   UPDATE_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_balance_type';

--DIM标准科目类型
CREATE TABLE IF NOT EXISTS DIM_STD_ACCT_ITEM_TYPE  (
   STD_ACCT_ITEM_TYPE_CODE   STRING,
   STD_ACCT_ITEM_TYPE_NAME   STRING,
   P_STD_ACCT_ITEM_TYPE_CODE STRING,
   FULLPATH                  STRING,
   ORIGINAL_CODE             STRING,
   NOTES                     STRING,
   IS_DISPLAY                STRING,
   DISPLAY_ORDER             STRING,
   IS_VALID                  STRING,
   UPDATE_DATE               STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_acct_item_type';

--DIM标准订购状态
CREATE TABLE IF NOT EXISTS DIM_STD_SUBSCRIPTION_STATUS  (
   STD_SUBSCRIPTION_STATUS_CODE   STRING,
   STD_SUBSCRIPTION_STATUS_NAME   STRING,
   P_STD_SUBSCRIPTION_STATUS_CODE STRING,
   FULLPATH                       STRING,
   ORIGINAL_CODE                  STRING,
   NOTES                          STRING,
   IS_DISPLAY                     STRING,
   DISPLAY_ORDER                  STRING,
   IS_VALID                       STRING,
   UPDATE_DATE                    STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_subscription_status';

--DIM标准用户状态
CREATE TABLE IF NOT EXISTS DIM_STD_USER_STATUS  (
   STD_USER_STATUS_CODE   STRING,
   STD_USER_STATUS_NAME   STRING,
   P_STD_USER_STATUS_CODE STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_user_status';

--DIM标准套餐
CREATE TABLE IF NOT EXISTS DIM_STD_UP_OFFER  (
   STD_UP_OFFER_CODE    STRING,
   STD_UP_OFFER_NAME    STRING,
   P_STD_UP_OFFER_CODE  STRING,
   FULLPATH             STRING,
   ORIGINAL_CODE        STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_up_offer';

--DIM标准产品表
CREATE TABLE IF NOT EXISTS DIM_STD_UP_PRODUCT  (
   STD_UP_PRODUCT_CODE   STRING,
   STD_UP_PRODUCT_NAME   STRING,
   P_STD_UP_PRODUCT_CODE STRING,
   FULLPATH              STRING,
   ORIGINAL_CODE         STRING,
   NOTES                 STRING,
   IS_DISPLAY            STRING,
   DISPLAY_ORDER         STRING,
   IS_VALID              STRING,
   UPDATE_DATE           STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_up_product';

--DIM标准获客渠道
CREATE TABLE IF NOT EXISTS DIM_STD_CUST_CHANNEL  (
   STD_CUST_CHANNEL_CODE   STRING,
   STD_CUST_CHANNEL_NAME   STRING,
   P_STD_CUST_CHANNEL_CODE STRING,
   FULLPATH                STRING,
   ORIGINAL_CODE           STRING,
   NOTES                   STRING,
   IS_DISPLAY              STRING,
   DISPLAY_ORDER           STRING,
   IS_VALID                STRING,
   UPDATE_DATE             STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_cust_channel';

--DIM标准上网时长
CREATE TABLE IF NOT EXISTS DIM_STD_ONLINE_LENGTH  (
   STD_ONLINE_LENGTH_CODE STRING,
   STD_ONLINE_LENGTH_NAME STRING,
   MIN_VALUE              STRING,
   MAX_VALUE              STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_online_length';

--DIM标准上网天数
CREATE TABLE IF NOT EXISTS DIM_STD_ONLINE_DAYS  (
   STD_ONLINE_DAYS_CODE   STRING,
   STD_ONLINE_DAYS_NAME   STRING,
   MIN_VALUE              STRING,
   MAX_VALUE              STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_online_days';

--DIM标准产品表（手工）
CREATE TABLE IF NOT EXISTS DIM_STD_PRODUCT  (
   PRODUCT_ID            STRING,
   PRODUCT_NAME          STRING,
   OFFER_NAME            STRING,
   BANDWIDTH             STRING,
   CYCLE                 STRING,
   PRICE                 STRING,
   FLAG                  STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   UPDATE_DATE           STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_product';

--DIM标准产品表（手工）
CREATE TABLE IF NOT EXISTS DIM_STD_PRODUCT2  (
   PRODUCT_ID            STRING,
   PRODUCT_NAME          STRING,
   BANDWIDTH             STRING,
   CYCLE                 STRING,
   PRICE                 STRING,
   FLAG                  STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   UPDATE_DATE           STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_product2';

--DIM标准分钟
CREATE TABLE IF NOT EXISTS DIM_STD_MINUTE  (
   STD_MINUTE_CODE        STRING,
   STD_MINUTE_NAME        STRING,
   MIN_VALUE              STRING,
   MAX_VALUE              STRING,
   FULLPATH               STRING,
   ORIGINAL_CODE          STRING,
   NOTES                  STRING,
   IS_DISPLAY             STRING,
   DISPLAY_ORDER          STRING,
   IS_VALID               STRING,
   UPDATE_DATE            STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_minute';

--DIM标准运营商地址段
CREATE TABLE IF NOT EXISTS DIM_STD_OPERATOR_IP  (
   START_IP             STRING,
   END_IP               STRING,
   START_IP_NUM         BIGINT,
   END_IP_NUM           BIGINT,
   BELONG               STRING,
   OPERATOR             STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_operator_ip';

--DIM标准内网缓存IP地址段
CREATE TABLE IF NOT EXISTS DIM_STD_INTRANET_IP  (
   START_IP             STRING,
   END_IP               STRING,
   START_IP_NUM         BIGINT,
   END_IP_NUM           BIGINT,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_intranet_ip';

--DIM标准应用表
CREATE TABLE IF NOT EXISTS DIM_STD_CONTENT  (
   STD_CONTENT_CODE     STRING,
   STD_CONTENT_NAME     STRING,
   P_STD_CONTENT_CODE   STRING,
   STD_CONTENT_TYPE     STRING,
   FULLPATH             STRING,
   ORIGINAL_CODE        STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   IS_VALID             STRING,
   UPDATE_DATE          STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_content';

--DIM腾讯节目类型
CREATE TABLE IF NOT EXISTS DIM_STD_VTYPE  (
VID         STRING,
VNAME       STRING,
VTYPEID     STRING,
VTYPENAME   STRING,
RN          INT,
ETL_DATE    STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_vtype';

--DIM城市与分公司对应关系表
CREATE TABLE IF NOT EXISTS DIM_CITY_ORG_REL  (
   CITY_NAME            STRING,
   STD_ORG_CODE         STRING
)STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_city_org_rel';
--DIM根据子网掩码计算得出的ip地址表
CREATE TABLE IF NOT EXISTS DIM_STD_INTRANET_IP  (
   ip_network string
)row format delimited fields terminated by ','
STORED AS textfile
LOCATION '/asiainfo/hive/DIM/DIM_STD_INTRANET_IP';

--DIM 无效网址库 （用于存放 上网行为数据中有，但是 url 无法访问的数据，这种数据不统计）
CREATE TABLE IF NOT EXISTS DIM_STD_INVALID_URL  (
   STD_URL_CODE         STRING
)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_invalid_url';


--DIM 手机号归属运营商表
CREATE TABLE IF NOT EXISTS DIM_STD_OPERATOR_PHONE (
       LEADING_NUM STRING,
       OPERATOR	   STRING,
       CITY_CODE   STRING,
       AREA_CODE   STRING,
       CITY_NAME   STRING,
       AREA_NAME   STRING
)
row format delimited fields terminated by ','
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/DIM/dim_std_operator_phone'
       
					   
					  
-- DIM 标准渠道类型
CREATE TABLE IF NOT EXISTS DIM_STD_CHANNEL_TYPE  (
   STD_CHANNEL_TYPE_CODE STRING,
   STD_CHANNEL_TYPE_NAME STRING,
   P_STD_CHANNEL_TYPE_CODE STRING,
   FULLPATH             STRING,
   NOTES                STRING,
   IS_DISPLAY           STRING,
   DISPLAY_ORDER        STRING,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING
)
row format delimited fields terminated by ','
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/DIM/dim_std_channel_type'

-- DIM 标准缴费支付方式
CREATE TABLE IF NOT EXISTS DIM_STD_BANK (
       BANK_ID STRING,
       BANK_NAME STRING,
       BANK_CODE STRING,
       PAYMENT_TYPE STRING
)
row format delimited fields terminated by ','
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/DIM/dim_std_bank'

-- DIM 直播电视节目类型标签
CREATE TABLE IF NOT EXISTS DIM_TV_PROGRAM_LABEL (
   PROGRAM_NAME         STRING,
   TYPE                 STRING,
   CATEGORY             ARRAY<STRING>,
   PRODUCED             ARRAY<STRING>,
   ETL_DATE             STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_tv_program_label'

-- DIM 点播回看节目类型标签
CREATE TABLE IF NOT EXISTS DIM_DR_PROGRAM_LABEL (
   PROGRAM_NAME         STRING,
   TYPE                 STRING,
   CATEGORY             ARRAY<STRING>,
   PRODUCED             ARRAY<STRING>,
   ETL_DATE             STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_dr_program_label'


-- DIM标准行政区划
CREATE TABLE DIM_STD_AREA  (
   STD_AREA_CODE        STRING,
   STD_AREA_NAME        STRING
)
row format delimited fields terminated by ','
STORED AS TEXTFILE
LOCATION '/asiainfo/hive/DIM/dim_std_area'


-- DIM标准证件类型
CREATE TABLE DIM_STD_CERT_TYPE  (
   CERT_TYPE_CODE       STRING,
   CERT_TYPE_NAME       STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_cert_type'

-- DIM春节日期
CREATE TABLE DIM_STD_CHUNJIE  (
   YEAR                 STRING,
   DAY                  STRING,
   ETL_DATE             STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_chunjie'

-- DIM标准星座划分
CREATE TABLE DIM_STD_CONSTELLATION  (
   CONSTELLATION        STRING,
   START_DATE           STRING,
   END_DATE             STRING
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_constellation'


-- DIM标准街道划分
CREATE TABLE DIM_STD_STREET  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_AREA             STRING,
   STD_STREET           STRING,
   STD_STREET_ALIAS     STRING,
   IS_DEFAULT           DECIMAL(1,0),
   IS_VALID             DECIMAL(1,0),
   UPDATE_DATE          DATE
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_street'



CREATE TABLE DIM_STD_STREET_TMP  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_AREA             STRING,
   STD_STREET           STRING,
   STD_STREET_ALIAS     STRING,
   IS_DEFAULT           DECIMAL(1,0),
   IS_VALID             DECIMAL(1,0)
)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ','
STORED AS TEXTFILE ;


--DIM标准产品表（手工）
CREATE TABLE IF NOT EXISTS DIM_STD_PRODUCT2  (
   PRODUCT_ID            STRING,
   PRODUCT_NAME          STRING,
   BANDWIDTH             STRING,
   CYCLE                 STRING,
   PRICE                 STRING,
   FLAG                  STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   UPDATE_DATE           DATE
)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DIM/dim_std_product2';


-- DIM标准产品业务类型
CREATE TABLE DIM_STD_UP_BUSI_TYPE  (
   STD_UP_BUSI_TYPE_CODE VARCHAR(20)                    ,
   STD_UP_BUSI_TYPE_NAME VARCHAR(200)                   ,
   P_STD_UP_BUSI_TYPE_CODE VARCHAR(20)                    ,
   FULLPATH             VARCHAR(255),
   NOTES                VARCHAR(255),
   IS_DISPLAY           DECIMAL(1),
   DISPLAY_ORDER        DECIMAL(6),
   VALID_DATE           DECIMAL(8),
   EXPIRE_DATE          DECIMAL(8)
)
STORED AS textfile
LOCATION '/asiainfo/hive/DIM/dim_std_up_busi_type'
;


-- DIM产品配置表
CREATE TABLE DIM_STD_UP_PRODUCT  (
   PRODUCT_ID           DECIMAL(16),
   PRODUCT_NAME         VARCHAR(100),
   PROD_SERVICE_ID      DECIMAL(12),
   BANDWIDTH            DECIMAL(16),
   CYCLE                DECIMAL(16),
   ARPU                 DECIMAL(16, 2),
   BILLING_TYPE         DECIMAL(1),
   CREATE_DATE          TIMESTAMP,
   MODIFY_DATE          TIMESTAMP,
   VALID_DATE           TIMESTAMP,
   EXPIRE_DATE          TIMESTAMP,
   USE_EFF_DATE         TIMESTAMP,
   USE_EXP_DATE         TIMESTAMP,
   data_source_cd       VARCHAR(10),
   UPDATE_DATE          TIMESTAMP 
)
stored AS orcfile
location '/asiainfo/hive/DIM/dim_std_up_product';
;


CREATE TABLE dim_std_channel_group 
(std_channel_group_code decimal(5) ,
                                                               std_channel_group_name varchar(20),
                                                               is_valid   decimal(2),
                                                               update_time timestamp,
                                                               std_org_code varchar(6)
 ) 
ROW FORMAT SERDE
'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
) 
STORED AS TEXTFILE ;


CREATE TABLE dim_std_duration
(
  duration_id decimal(2,0) ,
  duration_name varchar(10) ,
  start_times_code decimal(3,0) ,
  end_times_code decimal(3,0) ,
  duration_desc varchar(20) ,
  duration_times decimal(16,2) 
 ) 
ROW FORMAT SERDE
'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
) 
STORED AS TEXTFILE ;




CREATE TABLE dim_std_program_type
  (
    std_org_code varchar(6) ,
    area_name varchar(20),
    program_type_code   VARCHAR(10),
    program_type_name  VARCHAR(100),
    channel_name          VARCHAR(100),
    program_name         VARCHAR(500),
    program_time           VARCHAR(500),
    remark                     VARCHAR(1000)
  ) 
ROW FORMAT SERDE
'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
) 
STORED AS TEXTFILE ; 


CREATE TABLE dim_std_category
  (
    channel_name          VARCHAR(100),
    category_name         VARCHAR(500),
    start_time                 VARCHAR(6),
    start_minute_code     INT,
    END_time                VARCHAR(6),
    end_minute_code     INT,
    day_of_week           INT,
    remark                     VARCHAR(1000),
    update_time             timestamp
  ) 
ROW FORMAT SERDE
'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
) 
STORED AS TEXTFILE ; 


```



#### 第五章 数据服务层DWA

###### DDL建表语句

```
--DWA产品订购月全量表
CREATE TABLE IF NOT EXISTS DWA_FACT_INS_SRVPKG_MON  (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_NEW               DECIMAL(1),
   IS_UP_MARKETING      DECIMAL(1),
   IS_INS               DECIMAL(1),
   PAR_VALUE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (PT_MON CHAR(6))
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_ins_srvpkg_mon';


--DWA产品退订累计表
CREATE TABLE IF NOT EXISTS DWA_FACT_INS_SRVPKG_CANCEL (
   SRVPKG_INST_ID       DECIMAL(12)                      ,
   OFFER_INST_ID        DECIMAL(12)                      ,
   OFFER_ID             DECIMAL(12),
   OFFER_TYPE           VARCHAR(40),
   SRVPKG_ID            DECIMAL(12),
   SERVICE_PRICE_KIND   VARCHAR(40),
   IS_MAIN              DECIMAL(1),
   CUST_ID              DECIMAL(14)                      ,
   PROD_INST_ID         DECIMAL(14),
   PROD_SPEC_ID         DECIMAL(12)                      ,
   VALID_TYPE           DECIMAL(2),
   OPER_STATE           DECIMAL(12),
   STATE                DECIMAL(2),
   PROD_SERVICE_ID      DECIMAL(12),
   OS_STATUS            VARCHAR(30),
   SRC_SYSTEM_ID        DECIMAL(12),
   SRC_SYSTEM_EXT_CODE  VARCHAR(200),
   CUST_ORDER_ID        DECIMAL(14),
   REGION_ID            VARCHAR(6),
   CREATE_DATE          TIMESTAMP,
   DONE_CODE            DECIMAL(15),
   DONE_DATE            TIMESTAMP,
   VALID_DATE           TIMESTAMP                            ,
   EXPIRE_DATE          TIMESTAMP                            ,
   OP_ID                DECIMAL(12),
   ORG_ID               DECIMAL(12),
   STD_ORG_CODE         VARCHAR(20),
   OWN_CORP_ORG_ID      DECIMAL(12)                      ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   STD_UP_BUSI_TYPE_CODE VARCHAR(20),
   STD_UP_TYPE_CODE     VARCHAR(20),
   IS_CLOUD_MEDIA       DECIMAL(1),
   IS_UP_MARKETING      DECIMAL(1),
   IS_INS               DECIMAL(1),
   PAR_VALUE            DECIMAL(1),
   DATA_SOURCE_CD       VARCHAR(10),
   IS_HISTORY_DATA      DECIMAL(1),
   ETL_CYCLE            DECIMAL(14),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY (PT_MON CHAR(6))
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_ins_srvpkg_cancel';

--DWA客户住宅月全量表
CREATE TABLE IF NOT EXISTS DWA_FACT_INS_ADDRESS_MON  (
CUST_ADDR_ID         STRING,
CUST_ID              STRING,
STD_ADDR_ID          STRING,
STD_ADDR_NAME        STRING,
DISTRICT_ID          STRING,
DISTRICT_NAME        STRING,
STREET_STD_ADDR_ID   STRING,
STREET_STD_ADDR_NAME STRING,
COMMUNITY_ID         STRING,
COMMUNITY_NAME       STRING,
AREA_STD_ADDR_ID     STRING,
AREA_STD_ADDR_NAME   STRING,
DOOR_NAME            STRING,
REGION_ID            STRING,
MGR_ADDR_ID          STRING,
MGR_ADDR_NAME        STRING,
VALID_DATE           STRING,
EXPIRE_DATE          STRING,
CREATE_DATE          STRING,
DONE_DATE            STRING,
OWN_CORP_ORG_ID      STRING,
OWN_CORP_STD_ORG_CODE STRING,
OWN_CORP_STD_ORG_NAME STRING,
DATA_SOURCE_CD       STRING,
ETL_CYCLE            STRING,
ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_ins_address_mon';

--DWA用户月全量表
CREATE TABLE IF NOT EXISTS DWA_FACT_INS_PROD_MON  (
   PROD_INST_ID         INT,
   PROD_SPEC_ID         STRING,
   CUST_ID              STRING,
   ACCT_ID              STRING,
   BILL_ID              STRING,
   SUB_BILL_ID          STRING,
   BILL_START_DATE      STRING,
   USER_NAME            STRING,
   USER_PROP            INT,
   STATE                STRING,
   IS_VIP               INT,
   ADDRESS_ID           STRING,
   CONT_ID              STRING,
   ACCESS_MODE          INT,
   VALID_DATE           STRING,
   EXPIRE_DATE          STRING,
   CREATE_DATE          STRING,
   DONE_DATE            STRING,
   ORG_ID               INT,
   OWN_CORP_ORG_ID      INT,
   IS_ATV               INT,
   IS_DTV               INT,
   IS_DFTV              INT,
   IS_DBITV             INT,
   IS_DITV              INT,
   IS_LAN               INT,
   IS_VOIP              INT,
   IS_AMSP              INT,
   IS_MAIN              INT,
   IS_SECOND            INT,
   IS_TRANS             INT,
   IS_INS               INT,
   IS_THIS_EXPIRE       INT,
   IS_EXPIRE            INT,
   IS_THIS_REPAY        INT,
   IS_REPAY             INT,
   IS_PAIED             INT,
   IS_PAY               INT,
   IS_SILENT            INT,
   IS_ACTIVE            INT,
   IS_VALID             INT,
   IS_NEW               INT,
   THIS_MONTH_ONLINE_DAYS INT,
   STD_USER_STATUS_CODE  STRING,
   STD_CUST_CHANNEL_CODE STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD        STRING,
   ETL_CYCLE            INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_ins_prod_mon';


--DWA用户月全量表
--注：这个表是在局方拿不到BOSS源表接口的情况下，整个boss数据只能采用一个表，此表数据来自报表.主要数据来源于DWD_RPT_INST_PROD
CREATE TABLE IF NOT EXISTS DWA_FACT_RPT_INS_PROD_MON  (
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   CUTOVER_ADDR_NAME    STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   CREATE_DATE          STRING,
   VALID_DATE           STRING,
   REMAINDER_DAYS       STRING,
   EXPIRE_DATE          STRING,
   STATUS_NAME          STRING,
   LOGIN_NAME           STRING,
   LAN_NUMBER           STRING,
   IS_THIS_EXPIRE       STRING,
   IS_EXPIRE            STRING,
   IS_THIS_REPAY        STRING,
   IS_REPAY             INT,
   IS_PAIED             INT,
   IS_PAY               INT,
   IS_SILENT            INT,
   IS_ACTIVE            INT,
   IS_VALID             INT,
   IS_NEW               INT,
   THIS_MONTH_ONLINE_DAYS INT,
   IS_THIS_LOSS         INT,
   IS_LOSS              INT,
   ORDER_PRIORITY       INT,
   STD_USER_STATUS_CODE STRING,
   STD_CUST_CHANNEL_CODE STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   DATA_SOURCE_CD       STRING,
   ETL_CYCLE            STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_rpt_ins_prod_mon';

--DWA用户日上网时长(日)
CREATE TABLE IF NOT EXISTS DWA_USER_ONLINE_LENGTH_D  (
   LOGIN_NAME         STRING,
   TOTAL_MINUTES      INT,
   ETL_DATE           STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_online_length_d';

--DWA各时段使用各设备的上网用户(日)
CREATE TABLE IF NOT EXISTS DWA_DIFF_TIMES_DEVICE_USER_D  (
   STD_TIMES_CODE          STRING,
   STD_TIMES_NAME          STRING,
   STD_DEVICE_CATE_CODE   STRING,
   STD_DEVICE_CATE_NAME   STRING,
   LOGIN_NAME             STRING,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_diff_times_device_user_d';

--DWA各在线媒体用户(日)
CREATE TABLE IF NOT EXISTS DWA_DIFF_ONLINE_MEDIA_USER_D  (
   STD_ONLINE_MEDIA_CODE  STRING,
   STD_ONLINE_MEDIA_NAME  STRING,
   STD_DEVICE_CATE_CODE   STRING,
   STD_DEVICE_CATE_NAME   STRING,
   HOUR                   INT,
   LOGIN_NAME             STRING,
   ACCESS_TIME            STRING,
   ACCT_START_TIME        STRING,
   ACCT_STOP_TIME         STRING,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_TIME STRING,ETL_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_diff_online_media_user_d';

--DWA使用各设备的上网用户(日)
CREATE TABLE IF NOT EXISTS DWA_DIFF_DEVICE_CATE_USER_D  (
   STD_DEVICE_CATE_CODE   STRING,
   STD_DEVICE_CATE_NAME   STRING,
   LOGIN_NAME             STRING,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_diff_device_cate_user_d';

--DWA各时段的上网用户(日)
CREATE TABLE IF NOT EXISTS DWA_DIFF_TIMES_USER_D  (
   STD_TIMES_CODE          STRING,
   STD_TIMES_NAME          STRING,
   LOGIN_NAME             STRING,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_diff_times_user_d';

--DWA各时段丢包率(日)
CREATE TABLE IF NOT EXISTS DWA_PACKET_LOSS_D  (
   STD_TIMES_CODE          STRING,
   STD_TIMES_NAME          STRING,
   PACKET_LOSS_COUNT      INT,
   PACKET_LOSS_RATE       INT,
   ETL_DATE               STRING,
   STD_ORG_NAME           STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_packet_loss_d';

--DWA销账明细月全量(月)
CREATE TABLE IF NOT EXISTS DWA_FACT_PAYOFF_MON(
  BALANCE_LOG_ID           STRING,
  ACCT_BALANCE_ID          STRING,
  PAYMENT_ID               STRING,
  BILL_ID                  STRING,
  ACCT_ITEM_ID             STRING,
  BILLING_CYCLE_ID         STRING,
  SERV_ID                  STRING,
  ACCT_ID                  STRING,
  CUST_ID                  STRING,
  ACCT_ITEM_TYPE_ID        STRING,
  BALANCE_TYPE_ID          STRING,
  PAYOFF_AMOUNT            STRING,
  UNPAY_AMOUNT             STRING,
  BILL_AMOUNT              STRING,
  PAYMENT_DATE             STRING,
  CORP_ORG_ID              STRING,
  SRVPKG_ID                STRING,
  STD_UP_BUSI_TYPE_CODE    STRING,
  STD_BALANCE_TYPE_CODE    STRING,
  STD_ACCT_ITEM_TYPE_CODE  STRING,
  STD_PROD_CYCLE_CODE      STRING,
  STD_BANDWIDTH_CODE       STRING,
  OWN_CORP_STD_ORG_CODE    STRING,
  DATA_SOURCE_CD           STRING,
  ETL_CYCLE                STRING,
  ETL_DATE                 STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_fact_payoff_mon';

--DWA用户月全量组织(月)
CREATE TABLE IF NOT EXISTS dwa_diff_organize_user_m  (
login_name                string,
own_corp_std_org_code     string,
own_corp_std_org_name     string,
etl_data                  string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/DW/dwa_diff_organize_user_m';



--DWA用户DNS上行数据(日)
CREATE TABLE IF NOT EXISTS DWA_DNS_UP_STREAM_D(
   LOGIN_NAME           STRING,
   COUNT                INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING,ETL_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_dns_up_stream_d';


--DWA用户DNS下行数据(日)
CREATE TABLE IF NOT EXISTS DWA_DNS_DOWN_STREAM_D(
   LOGIN_NAME           STRING,
   ANSWER_CODE          STRING,
   IS_INTRANET          INT,
   COUNT                INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING,ETL_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_dns_down_stream_d';

--DWA组织用户表
create table  DWA_DIFF_ORGANIZE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
ETL_DATE                 date); 

--DWA用户直播频道月表
CREATE TABLE IF NOT EXISTS DWA_USER_TV_CHANNEL_M  (
   PROD_INST_ID         STRING,
   CHANNEL_NAME         STRING,
   TV_NUM               STRING,
   TV_TIME              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_tv_channel_m';

--DWA用户直播频道行为标签月表
CREATE TABLE IF NOT EXISTS DWA_USER_TV_CHANNEL_BEH_M  (
   PROD_INST_ID         STRING,
   CHANNEL_NAME         STRING,
   MAX_TV_NUM           STRING,
   AVG_TV_NUM           STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_tv_channel_beh_m';

--DWA用户上网时段月表
CREATE TABLE IF NOT EXISTS DWA_USER_NETWORK_TIME_M  (
   PROD_INST_ID         STRING,
   WEEK_TYPE            STRING,
   TIME_BUCKET          STRING,
   NET_NUM              STRING,
   NET_FLOW             STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_network_time_m';

--DWA用户上网设备月表
CREATE TABLE IF NOT EXISTS DWA_USER_NETWORK_DEVICE_M  (
   PROD_INST_ID         STRING,
   DEVICE_TYPE          STRING,
   NET_TIME             STRING,
   NET_NUM              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_network_device_m';

--DWA用户上网域名月表
CREATE TABLE IF NOT EXISTS DWA_USER_NETWORK_DOMAIN_M  (
   PROD_INST_ID         STRING,
   WEBSITE_TYPE         STRING,
   DOMAIN_NAME          STRING,
   NET_NUM              STRING,
   NET_FLOW             STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_network_domain_m';

--DWA用户上网行为标签月表
CREATE TABLE IF NOT EXISTS DWA_USER_NETWORK_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   BANDWIDTH            STRING,
   TOTAL_NET_FLOW       STRING,
   IS_YEMAOZI           STRING,
   IS_SHANGBANZU        STRING,
   WEEKDAY_NET_NUM_RATE STRING,
   WEEKDAY_NET_FLOW_RATE STRING,
   WEEKEND_NET_NUM_RATE STRING,
   WEEKEND_NET_FLOW_RATE STRING,
   LC_NET_NUM_RATE      STRING,
   LC_NET_FLOW_RATE     STRING,
   ZS_NET_NUM_RATE      STRING,
   ZS_NET_FLOW_RATE     STRING,
   SW_NET_NUM_RATE      STRING,
   SW_NET_FLOW_RATE     STRING,
   ZW_NET_NUM_RATE      STRING,
   ZW_NET_FLOW_RATE     STRING,
   XW_NET_NUM_RATE      STRING,
   XW_NET_FLOW_RATE     STRING,
   BW_NET_NUM_RATE      STRING,
   BW_NET_FLOW_RATE     STRING,
   WS_NET_NUM_RATE      STRING,
   WS_NET_FLOW_RATE     STRING,
   WY_NET_NUM_RATE      STRING,
   WY_NET_FLOW_RATE     STRING,
   PC_NET_TIME_RATE     STRING,
   MOBILE_NET_TIME_RATE STRING,
   DOMAIN_NAME_1        STRING,
   DOMAIN_TYPE_1        STRING,
   DOMAIN_NAME_FLOW_1   STRING,
   DOMAIN_NAME_2        STRING,
   DOMAIN_TYPE_2        STRING,
   DOMAIN_NAME_FLOW_2   STRING,
   DOMAIN_NAME_3        STRING,
   DOMAIN_TYPE_3        STRING,
   DOMAIN_NAME_FLOW_3   STRING,
   DOMAIN_NAME_4        STRING,
   DOMAIN_TYPE_4        STRING,
   DOMAIN_NAME_FLOW_4   STRING,
   DOMAIN_NAME_5        STRING,
   DOMAIN_TYPE_5        STRING,
   DOMAIN_NAME_FLOW_5   STRING,
   WEBSITE_TYPE_1       STRING,
   WEBSITE_TYPE_FLOW_1  STRING,
   WEBSITE_TYPE_2       STRING,
   WEBSITE_TYPE_FLOW_2  STRING,
   WEBSITE_TYPE_3       STRING,
   WEBSITE_TYPE_FLOW_3  STRING,
   WEBSITE_TYPE_4       STRING,
   WEBSITE_TYPE_FLOW_4  STRING,
   WEBSITE_TYPE_5       STRING,
   WEBSITE_TYPE_FLOW_5  STRING,
   VIDEO_DOMAIN_NAME_1  STRING,
   VIDEO_DOMAIN_NAME_FLOW_1 STRING,
   VIDEO_DOMAIN_NAME_2  STRING,
   VIDEO_DOMAIN_NAME_FLOW_2 STRING,
   VIDEO_DOMAIN_NAME_3  STRING,
   VIDEO_DOMAIN_NAME_FLOW_3 STRING,
   VIDEO_DOMAIN_NAME_4  STRING,
   VIDEO_DOMAIN_NAME_FLOW_4 STRING,
   VIDEO_DOMAIN_NAME_5  STRING,
   VIDEO_DOMAIN_NAME_FLOW_5 STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_network_beh_m';

--DWA用户上网网站类型行为标签月表
CREATE TABLE IF NOT EXISTS DWA_USER_NETWORK_WEBSITE_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   WEBSITE_TYPE         STRING,
   DOMAIN_NAME_1        STRING,
   DOMAIN_NAME_FLOW_1   STRING,
   DOMAIN_NAME_2        STRING,
   DOMAIN_NAME_FLOW_2   STRING,
   DOMAIN_NAME_3        STRING,
   DOMAIN_NAME_FLOW_3   STRING,
   DOMAIN_NAME_4        STRING,
   DOMAIN_NAME_FLOW_4   STRING,
   DOMAIN_NAME_5        STRING,
   DOMAIN_NAME_FLOW_5   STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_network_website_beh_m';


--DWA点播回看用户存量表
CREATE TABLE IF NOT EXISTS DWA_DR_ALL_USER_M  (
   USER_ID         STRING,
   IS_DR         STRING,
   IS_LB        STRING,
   IS_DR_THISM         STRING,
   IS_LB_THISM        STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   ETL_DATE   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/DW/dwa_dr_all_user_m';


-- DWA用户点播节目月表
CREATE TABLE IF NOT EXISTS DWA_USER_DR_PROGRAM_M  (
   PROD_INST_ID         STRING,
   PROGRAM_CODE         STRING,
   PROGRAM_NAME         STRING,
   DR_NUM               STRING,
   DR_TIME              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_dr_program_m'

 -- DWA用户回看节目明细(月)
CREATE TABLE IF NOT EXISTS DWA_USER_LB_PROGRAM_M  (
   PROD_INST_ID         STRING,
   PROGRAM_CODE         STRING,
   PROGRAM_NAME         STRING,
   LB_NUM               STRING,
   LB_TIME              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_lb_program_m'


-- DWA客户画像详细信息月表
CREATE TABLE IF NOT EXISTS DWA_CUST_FEAT_DTL_M  (
   CUST_ID              STRING,
   CUST_NAME            STRING,
   SEX                  STRING,
   AGE                  STRING,
   GENERATION           STRING,
   MARRIAGE             STRING,
   CONSTELLATION        STRING,
   ZODIAC               STRING,
   EDUCATION            STRING,
   CENSUS_REGISTER      STRING,
   NATIVE_PLACE         STRING,
   CERTIFICATE_TYPE     STRING,
   CERTIFICATE_NUM      STRING,
   PROFESSION           STRING,
   MOBILE1              STRING,
   MOBILE_OPERATOR1     STRING,
   MOBILE2              STRING,
   MOBILE_OPERATOR2     STRING,
   PHONE1               STRING,
   PHONE2               STRING,
   CORP_ORG_CODE        STRING,
   CORP_ORG_NAME        STRING,
   MGR_ADDR_NAME        STRING,
   DISTRICT_NAME        STRING,
   STREET_NAME          STRING,
   COMMUNITY_NAME       STRING,
   AREA_NAME            STRING,
   AREA_TYPE_NAME       STRING,
   USER_COUNT           STRING,
   NOT_DTV_USER_COUNT   STRING,
   DTV_USER_COUNT       STRING,
   DFTV_USER_COUNT      STRING,
   DBITV_USER_COUNT     STRING,
   DITV_USER_COUNT      STRING,
   LAN_USER_COUNT       STRING,
   CLOUD_MEDIA_USER_COUNT STRING,
   AMSP_USER_COUNT      STRING,
   HDTV_USER_COUNT      STRING,
   LAN_PARTNER_USER_COUNT STRING,
   IS_CONVERGE          STRING,
   NET_AGE              STRING,
   IS_ATV               STRING,
   IS_DTV               STRING,
   IS_DFTV              STRING,
   IS_DBITV             STRING,
   IS_DITV              STRING,
   IS_LAN               STRING,
   IS_VOIP              STRING,
   IS_AMSP              STRING,
   IS_CLOUD_MEDIA       STRING,
   IS_HDTV              STRING,
   DEV_USE_AGE          STRING,
   MONTH_AVG_CONSUM_AMOUNT STRING,
   MONTH_AVG_VOD_AMOUNT STRING,
   PAYMENT_CHANNEL      STRING,
   PAYMENT_HABIT        STRING,
   DEBT_STOP_SEN_LEV    STRING,
   CUST_VALUE           STRING,
   LATENT_LOST          STRING,
   COMPLAINT_LEVEL      STRING,
   ADVISORY_LEVEL       STRING,
   DEV_CHANGE_TYPE      STRING,
   FAMILY_CHILD         STRING,
   FAMILY_OLD           STRING,
   CUST_TYPE            STRING,
   REMARK1              STRING,
   REMARK2              STRING,
   REMARK3              STRING,
   REMARK4              STRING,
   REMARK5              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_cust_feat_dtl_m'


-- DWA客户订购产品明细月表
create table if not exists DWA_CUST_ORDER_PROD_M (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   OFFER_ID             STRING,
   OFFER_NAME           STRING,
   OFFER_CYCLE          STRING,
   PROD_SERVICE_ID      STRING,
   PROD_SERVICE_NAME    STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_cust_order_prod_m'

-- DWA账户全量表
CREATE TABLE IF NOT EXISTS DWA_ZG_ACCT  (
   ACCT_ID              STRING,
   CUST_ID              STRING,
   MIN_UNPAY_BILL_CYCLE STRING,
   MAX_UNPAY_BILL_CYCLE STRING,
   UNPAY_AMOUNT         STRING,
   SZ_UNPAY_AMOUNT      STRING,
   HD_UNPAY_AMOUNT      STRING,
   KD_UNPAY_AMOUNT      STRING,
   ZZ_UNPAY_AMOUNT      STRING,
   PAYMENT_FREQUENCY    STRING,
   CREDIT_AMOUNT        STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_zg_acct'



-- DWA用户收视月表
CREATE TABLE DWA_USER_VIEW_M  (
   PROD_INST_ID         STRING,
   FIRST_REVIEW_DATE    STRING,
   REVIEW_NUM           STRING,
   REVIEW_NUM_AVG_RATE  STRING,
   REVIEW_TIME          STRING,
   REVIEW_TIME_AVG_RATE STRING,
   REVIEW_DAYS          STRING,
   REVIEW_DAYS_AVG_RATE STRING,
   FIRST_VOD_DATE       STRING,
   VOD_NUM              STRING,
   VOD_NUM_AVG_RATE     STRING,
   VOD_TIME             STRING,
   VOD_TIME_AVG_RATE    STRING,
   VOD_DAYS             STRING,
   VOD_DAYS_AVG_RATE    STRING,
   FREE_VOD_NUM         STRING,
   FREE_VOD_NUM_AVG_RATE STRING,
   FREE_VOD_TIME        STRING,
   FREE_VOD_TIME_AVG_RATE STRING,
   FREE_VOD_DAYS        STRING,
   FREE_VOD_DAYS_AVG_RATE STRING,
   DD_VOD_NUM           STRING,
   DD_VOD_NUM_AVG_RATE  STRING,
   DD_VOD_TIME          STRING,
   DD_VOD_TIME_AVG_RATE STRING,
   DD_VOD_DAYS          STRING,
   DD_VOD_DAYS_AVG_RATE STRING,
   BY_VOD_NUM           STRING,
   BY_VOD_NUM_AVG_RATE  STRING,
   BY_VOD_TIME          STRING,
   BY_VOD_TIME_AVG_RATE STRING,
   BY_VOD_DAYS          STRING,
   BY_VOD_DAYS_AVG_RATE STRING,
   FIRST_TV_DATE        STRING,
   TV_NUM               STRING,
   TV_NUM_AVG_RATE      STRING,
   TV_TIME              STRING,
   TV_TIME_AVG_RATE     STRING,
   TV_DAYS              STRING,
   TV_DAYS_AVG_RATE     STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_view_m'

-- DWA用户收视行为标签月表
CREATE TABLE IF NOT EXISTS DWA_USER_VIEW_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   IS_BEFORE_VOD        STRING,
   IS_BEFORE_REVIEW     STRING,
   IS_BEFORE_TV         STRING,
   AVG_REVIEW_NUM       STRING,
   MAX_REVIEW_NUM       STRING,
   REVIEW_NUM_AVG_RATE  STRING,
   AVG_REVIEW_TIME      STRING,
   MAX_REVIEW_TIME      STRING,
   REVIEW_TIME_AVG_RATE STRING,
   AVG_REVIEW_DAYS      STRING,
   AVG_VOD_NUM          STRING,
   MAX_VOD_NUM          STRING,
   VOD_NUM_AVG_RATE     STRING,
   AVG_VOD_TIME         STRING,
   MAX_VOD_TIME         STRING,
   VOD_TIME_AVG_RATE    STRING,
   AVG_VOD_DAYS         STRING,
   AVG_FREE_VOD_NUM     STRING,
   MAX_FREE_VOD_NUM     STRING,
   FREE_VOD_NUM_AVG_RATE STRING,
   AVG_FREE_VOD_TIME    STRING,
   MAX_FREE_VOD_TIME    STRING,
   FREE_VOD_TIME_AVG_RATE STRING,
   AVG_FREE_VOD_DAYS    STRING,
   AVG_DD_VOD_NUM       STRING,
   MAX_DD_VOD_NUM       STRING,
   DD_VOD_NUM_AVG_RATE  STRING,
   AVG_DD_VOD_TIME      STRING,
   MAX_DD_VOD_TIME      STRING,
   DD_VOD_TIME_AVG_RATE STRING,
   AVG_DD_VOD_DAYS      STRING,
   AVG_BY_VOD_NUM       STRING,
   MAX_BY_VOD_NUM       STRING,
   BY_VOD_NUM_AVG_RATE  STRING,
   AVG_BY_VOD_TIME      STRING,
   MAX_BY_VOD_TIME      STRING,
   BY_VOD_TIME_AVG_RATE STRING,
   AVG_BY_VOD_DAYS      STRING,
   AVG_TV_NUM           STRING,
   MAX_TV_NUM           STRING,
   TV_NUM_AVG_RATE      STRING,
   AVG_TV_TIME          STRING,
   MAX_TV_TIME          STRING,
   TV_TIME_AVG_RATE     STRING,
   AVG_TV_DAYS          STRING,
   REVIEW_CHANNEL_1     STRING,
   REVIEW_CHANNEL_RATE_1 STRING,
   REVIEW_CHANNEL_2     STRING,
   REVIEW_CHANNEL_RATE_2 STRING,
   REVIEW_CHANNEL_3     STRING,
   REVIEW_CHANNEL_RATE_3 STRING,
   TV_CHANNEL_1         STRING,
   TV_CHANNEL_RATE_1    STRING,
   TV_CHANNEL_2         STRING,
   TV_CHANNEL_RATE_2    STRING,
   TV_CHANNEL_3         STRING,
   TV_CHANNEL_RATE_3    STRING,
   REVIEW_HOLIDAY_TIME_NUM STRING,
   REVIEW_HOLIDAY_TIME_1 STRING,
   REVIEW_HOLIDAY_TIME_2 STRING,
   REVIEW_HOLIDAY_TIME_3 STRING,
   HOLIDAY_TIME_AVG_REVIEW_NUM STRING,
   REVIEW_WEEKDAY_TIME_NUM STRING,
   REVIEW_WEEKDAY_TIME_1 STRING,
   REVIEW_WEEKDAY_TIME_2 STRING,
   REVIEW_WEEKDAY_TIME_3 STRING,
   WEEKDAY_TIME_AVG_REVIEW_NUM STRING,
   HOLIDAY_REVIEW_NUM_RATE STRING,
   LC_REVIEW_NUM_RATE   STRING,
   ZS_REVIEW_NUM_RATE   STRING,
   SW_REVIEW_NUM_RATE   STRING,
   ZW_REVIEW_NUM_RATE   STRING,
   XW_REVIEW_NUM_RATE   STRING,
   BW_REVIEW_NUM_RATE   STRING,
   WS_REVIEW_NUM_RATE   STRING,
   WY_REVIEW_NUM_RATE   STRING,
   VOD_HOLIDAY_TIME_NUM STRING,
   VOD_HOLIDAY_TIME_1   STRING,
   VOD_HOLIDAY_TIME_2   STRING,
   VOD_HOLIDAY_TIME_3   STRING,
   HOLIDAY_TIME_AVG_VOD_NUM STRING,
   VOD_WEEKDAY_TIME_NUM STRING,
   VOD_WEEKDAY_TIME_1   STRING,
   VOD_WEEKDAY_TIME_2   STRING,
   VOD_WEEKDAY_TIME_3   STRING,
   WEEKDAY_TIME_AVG_VOD_NUM STRING,
   HOLIDAY_VOD_NUM_RATE STRING,
   LC_VOD_NUM_RATE      STRING,
   ZS_VOD_NUM_RATE      STRING,
   SW_VOD_NUM_RATE      STRING,
   ZW_VOD_NUM_RATE      STRING,
   XW_VOD_NUM_RATE      STRING,
   BW_VOD_NUM_RATE      STRING,
   WS_VOD_NUM_RATE      STRING,
   WY_VOD_NUM_RATE      STRING,
   TV_HOLIDAY_TIME_NUM  STRING,
   TV_HOLIDAY_TIME_1    STRING,
   TV_HOLIDAY_TIME_2    STRING,
   TV_HOLIDAY_TIME_3    STRING,
   HOLIDAY_TIME_AVG_TV_NUM STRING,
   HOLIDAY_TIME_AVG_TV_TIME STRING,
   TV_WEEKDAY_TIME_NUM  STRING,
   TV_WEEKDAY_TIME_1    STRING,
   TV_WEEKDAY_TIME_2    STRING,
   TV_WEEKDAY_TIME_3    STRING,
   WEEKDAY_TIME_AVG_TV_NUM STRING,
   WEEKDAY_TIME_AVG_TV_TIME STRING,
   HOLIDAY_TV_TIME_RATE STRING,
   LC_TV_TIME_RATE      STRING,
   ZS_TV_TIME_RATE      STRING,
   SW_TV_TIME_RATE      STRING,
   ZW_TV_TIME_RATE      STRING,
   XW_TV_TIME_RATE      STRING,
   BW_TV_TIME_RATE      STRING,
   WS_TV_TIME_RATE      STRING,
   WY_TV_TIME_RATE      STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_view_beh_m' ;

-- DWA用户回看频道行为标签月表
CREATE TABLE DWA_USER_REVIEW_CHANNEL_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   CHANNEL_NAME         STRING,
   MAX_REVIEW_NUM       STRING,
   AVG_REVIEW_NUM       STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_review_channel_beh_m'
;


-- DWA用户直播频道行为标签月表
CREATE TABLE DWA_USER_TV_CHANNEL_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   CHANNEL_NAME         STRING,
   MAX_TV_NUM           STRING,
   AVG_TV_NUM           STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_tv_channel_beh_m';


-- DWA用户回看频道月表
CREATE TABLE IF NOT EXISTS DWA_USER_REVIEW_CHANNEL_M (
   PROD_INST_ID         STRING,
   CHANNEL_NAME         STRING,
   REVIEW_NUM           STRING,
   REVIEW_TIME          STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_review_channel_m';

-- DWA用户直播频道月表
CREATE TABLE IF NOT EXISTS DWA_USER_TV_CHANNEL_M  (
   PROD_INST_ID         STRING,
   CHANNEL_NAME         STRING,
   TV_NUM               STRING,
   TV_TIME              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_tv_channel_m'

-- DWA用户点播时段月表
CREATE TABLE IF NOT EXISTS DWA_USER_VOD_TIME_M  (
   PROD_INST_ID         STRING,
   HOLIDAY_TYPE         STRING,
   TIME_BUCKET          STRING,
   VOD_NUM              STRING,
   VOD_TIME             STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_vod_time_m' ;

-- DWA用户回看时段月表
CREATE TABLE IF NOT EXISTS DWA_USER_REVIEW_TIME_M  (
   PROD_INST_ID         STRING,
   HOLIDAY_TYPE         STRING,
   TIME_BUCKET          STRING,
   REVIEW_NUM           STRING,
   REVIEW_TIME          STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_review_time_m' ;

-- DWA用户直播时段月表
CREATE TABLE IF NOT EXISTS DWA_USER_TV_TIME_M  (
   PROD_INST_ID         STRING,
   HOLIDAY_TYPE         STRING,
   TIME_BUCKET          STRING,
   TV_NUM               STRING,
   TV_TIME              STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_user_tv_time_m';

-- DWA用户直播频道行为标签月表
CREATE TABLE IF NOT EXISTS DWA_USER_TV_CHANNEL_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   CHANNEL_NAME         STRING,
   MAX_TV_NUM           STRING,
   AVG_TV_NUM           STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_tv_channel_beh_m';


-- DWA用户直播节目月表
CREATE TABLE DWA_USER_TV_PROGRAM_M  (
   PROD_INST_ID         STRING,
   PROGRAM_NAME         STRING,
   TV_NUM               STRING,
   TV_TIME              STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_tv_program_m';

-- DWA用户直播内容偏好标签月表
CREATE TABLE DWA_USER_TV_PROGRAM_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   TV_TYPE_N1           STRING,
   TV_TYPE_N2           STRING,
   TV_TYPE_N3           STRING,
   TV_TYPE_N_RATE1      STRING,
   TV_TYPE_N_RATE2      STRING,
   TV_TYPE_N_RATE3      STRING,
   TV_CATEGORY_N1       STRING,
   TV_CATEGORY_N2       STRING,
   TV_CATEGORY_N3       STRING,
   TV_CATEGORY_N_RATE1  STRING,
   TV_CATEGORY_N_RATE2  STRING,
   TV_CATEGORY_N_RATE3  STRING,
   TV_PRODUCED_N1       STRING,
   TV_PRODUCED_N2       STRING,
   TV_PRODUCED_N3       STRING,
   TV_PRODUCED_N_RATE1  STRING,
   TV_PRODUCED_N_RATE2  STRING,
   TV_PRODUCED_N_RATE3  STRING,
   TV_TYPE_T1           STRING,
   TV_TYPE_T2           STRING,
   TV_TYPE_T3           STRING,
   TV_TYPE_T_RATE1      STRING,
   TV_TYPE_T_RATE2      STRING,
   TV_TYPE_T_RATE3      STRING,
   TV_CATEGORY_T1       STRING,
   TV_CATEGORY_T2       STRING,
   TV_CATEGORY_T3       STRING,
   TV_CATEGORY_T_RATE1  STRING,
   TV_CATEGORY_T_RATE2  STRING,
   TV_CATEGORY_T_RATE3  STRING,
   TV_PRODUCED_T1       STRING,
   TV_PRODUCED_T2       STRING,
   TV_PRODUCED_T3       STRING,
   TV_PRODUCED_T_RATE1  STRING,
   TV_PRODUCED_T_RATE2  STRING,
   TV_PRODUCED_T_RATE3  STRING,
   MAX_TV_TYPE_NUM      STRING,
   AVG_TV_TYPE_NUM      STRING,
   MAX_TV_CATEGORY_NUM  STRING,
   AVG_TV_CATEGORY_NUM  STRING,
   MAX_TV_PRODUCED_NUM  STRING,
   AVG_TV_PRODUCED_NUM  STRING,
   MAX_TV_TYPE_TIME     STRING,
   AVG_TV_TYPE_TIME     STRING,
   MAX_TV_CATEGORY_TIME STRING,
   AVG_TV_CATEGORY_TIME STRING,
   AVG_TV_PRODUCED_TIME STRING,
   MAX_TV_PRODUCED_TIME STRING,
   TOTAL_TV_TYPE        STRING,
   TOTAL_TV_CATEGORY    STRING,
   TOTAL_TV_PRODUCED    STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_tv_program_beh_m/'


-- DWA用户互动内容偏好标签月表
CREATE TABLE DWA_USER_DR_PROGRAM_BEH_M  (
   PROD_INST_ID         STRING,
   CUST_ID              STRING,
   DR_TYPE_1            STRING,
   DR_TYPE_2            STRING,
   DR_TYPE_3            STRING,
   DR_TYPE_RATE1        STRING,
   DR_TYPE_RATE2        STRING,
   DR_TYPE_RATE3        STRING,
   DR_CATEGORY_1        STRING,
   DR_CATEGORY_2        STRING,
   DR_CATEGORY_3        STRING,
   DR_CATEGORY_RATE1    STRING,
   DR_CATEGORY_RATE2    STRING,
   DR_CATEGORY_RATE3    STRING,
   DR_PRODUCED_1        STRING,
   DR_PRODUCED_2        STRING,
   DR_PRODUCED_3        STRING,
   DR_PRODUCED_RATE1    STRING,
   DR_PRODUCED_RATE2    STRING,
   DR_PRODUCED_RATE3    STRING,
   LB_TYPE_1            STRING,
   LB_TYPE_2            STRING,
   LB_TYPE_3            STRING,
   LB_TYPE_RATE1        STRING,
   LB_TYPE_RATE2        STRING,
   LB_TYPE_RATE3        STRING,
   LB_CATEGORY_1        STRING,
   LB_CATEGORY_2        STRING,
   LB_CATEGORY_3        STRING,
   LB_CATEGORY_RATE1    STRING,
   LB_CATEGORY_RATE2    STRING,
   LB_CATEGORY_RATE3    STRING,
   LB_PRODUCED_1        STRING,
   LB_PRODUCED_2        STRING,
   LB_PRODUCED_3        STRING,
   LB_PRODUCED_RATE1    STRING,
   LB_PRODUCED_RATE2    STRING,
   LB_PRODUCED_RATE3    STRING,
   MAX_DR_TYPE_NUM      STRING,
   AVG_DR_TYPE_NUM      STRING,
   MAX_DR_CATEGORY_NUM  STRING,
   AVG_DR_CATEGORY_NUM  STRING,
   MAX_DR_PRODUCED_NUM  STRING,
   AVG_DR_PRODUCED_NUM  STRING,
   MAX_LB_TYPE_NUM      STRING,
   AVG_LB_TYPE_NUM      STRING,
   MAX_LB_CATEGORY_NUM  STRING,
   AVG_LB_CATEGORY_NUM  STRING,
   AVG_LB_PRODUCED_NUM  STRING,
   MAX_LB_PRODUCED_NUM  STRING,
   TOTAL_DR_TYPE        STRING,
   TOTAL_DR_CATEGORY    STRING,
   TOTAL_DR_PRODUCED    STRING,
   TOTAL_LB_TYPE        STRING,
   TOTAL_LB_CATEGORY    STRING,
   TOTAL_LB_PRODUCED    STRING,
   ETL_DATE             STRING
)
partitioned by (pt_mon string)
stored as orcfile
location '/asiainfo/hive/DW/dwa_user_dr_program_beh_m' ;


-- DWA 用户月全量表 from 经分
CREATE TABLE dwa_fact_ins_prod_mon(
  prod_inst_id decimal(14,0), 
  cust_id decimal(14,0), 
  acct_id decimal(14,0), 
  pay_type decimal(2,0), 
  bill_id varchar(120), 
  sub_bill_id varchar(120), 
  main_prod_inst_id decimal(14,0), 
  bill_start_date timestamp, 
  user_name varchar(255), 
  user_group decimal(12,0), 
  vip_flag decimal(2,0), 
  vip_prop varchar(12), 
  first_use_date timestamp, 
  state varchar(3), 
  state_date timestamp, 
  oper_state decimal(2,0), 
  address_id decimal(12,0), 
  cont_id decimal(12,0), 
  access_mode decimal(2,0), 
  login_name varchar(255), 
  tv_number varchar(15), 
  region_id varchar(6), 
  valid_date timestamp, 
  expire_date timestamp, 
  create_date timestamp, 
  done_date timestamp, 
  done_code decimal(15,0), 
  corp_org_id decimal(12,0), 
  own_corp_std_org_code varchar(20), 
  own_region_std_org_code varchar(20), 
  is_atv decimal(1,0), 
  is_dtv decimal(1,0), 
  is_dftv decimal(1,0), 
  is_dbitv decimal(1,0), 
  is_ditv decimal(1,0), 
  is_lan decimal(1,0), 
  is_voip decimal(1,0), 
  is_amsp decimal(1,0), 
  is_ext1 decimal(1,0), 
  is_ext2 decimal(1,0), 
  is_cloud_media decimal(1,0), 
  is_hdtv decimal(1,0), 
  is_main decimal(1,0), 
  is_second decimal(1,0), 
  is_trans decimal(1,0), 
  is_valid decimal(1,0), 
  is_valid1 decimal(1,0), 
  is_valid2 decimal(1,0), 
  is_expire_ten_days decimal(1,0), 
  is_suspend decimal(1,0), 
  is_itv_active decimal(1,0), 
  is_debt_stop decimal(1,0), 
  is_free decimal(1,0), 
  is_paied decimal(1,0), 
  is_new decimal(1,0), 
  is_new_online decimal(1,0), 
  is_lose decimal(1,0), 
  is_lose_online decimal(1,0), 
  tv_pay_status decimal(1,0), 
  is_ins decimal(1,0), 
  data_source_cd varchar(10), 
  etl_cycle char(6), 
  etl_date timestamp)
PARTITIONED BY ( 
  pt_mon char(6))
STORED AS orcfile 
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DW/dwa_fact_ins_prod_mon'


-- DWA 客户月全量表 boss1 + boss2
CREATE TABLE DWA_FACT_CUST_MON  (
  CUST_ID             DECIMAL(14)  ,
  CUST_CODE           VARCHAR(14),
  OLD_CUST_ID         VARCHAR(64),
  OLD_CUST_CODE       VARCHAR(64),
  CUST_NAME           VARCHAR(255),
  CUST_TYPE           DECIMAL(1)  ,
  CUST_LEVEL          DECIMAL(2)  ,
  CUST_STATUS         DECIMAL(1),
  CUST_CERT_TYPE      DECIMAL(2)  ,
  CUST_CERT_NO        VARCHAR(40)  ,
  CUST_CERT_ADDR      VARCHAR(255),
  CERT_VALID_DATE     TIMESTAMP,
  CERT_EXPIRE_DATE    TIMESTAMP,
  CUST_OCCUPATION     DECIMAL(2),
  DISTRICT_ID         VARCHAR(30),
  DISTRICT_NAME       VARCHAR(255),
  MGR_ADDR_ID         VARCHAR(30),
  MGR_ADDR_NAME       VARCHAR(255),
  STD_ADDR_ID         VARCHAR(30),
  STD_ADDR_NAME       VARCHAR(255),
  STREET_STD_ADDR_ID  VARCHAR(30),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    VARCHAR(30),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  DOOR_NAME           VARCHAR(255),
  ADDRESS             VARCHAR(300),
  GRID_ID             VARCHAR(20),
  GRID_NAME           VARCHAR(100),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  BORDER_FLAG         DECIMAL(2),
  CREATE_DATE         TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12)  ,
  CREATE_ORG_ID       DECIMAL(12)  ,
  VALID_DATE          TIMESTAMP,
  EXPIRE_DATE         TIMESTAMP,
  DONE_DATE           TIMESTAMP,
  DONE_CODE           DECIMAL(15)  ,
  OP_ID               DECIMAL(12)  ,
  ORG_ID              DECIMAL(12)  ,
  CORP_ORG_ID         DECIMAL(12)  ,
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  CUST_PROP           DECIMAL(8),
  IS_CLOUD_MEDIA      DECIMAL(1),
  IS_VALID            DECIMAL(1),
  IS_VALID1           DECIMAL(1),
  IS_VALID2           DECIMAL(1),
  IS_DTV_SUSPEND      DECIMAL(1),
  IS_LAN_SUSPEND      DECIMAL(1),
  IS_VOIP_SUSPEND     DECIMAL(1),
  IS_DTV_DEBT_STOP    DECIMAL(1),
  IS_LAN_DEBT_STOP    DECIMAL(1),
  IS_VOIP_DEBT_STOP   DECIMAL(1),
  IS_DTV_PAIED        DECIMAL(1),
  IS_LAN_PAIED        DECIMAL(1),
  IS_VOIP_PAIED       DECIMAL(1),
  IS_FREE             DECIMAL(1),
  IS_PAIED            DECIMAL(1),
  IS_UNPAY            DECIMAL(1),
  IS_ITV_ACTIVE       DECIMAL(1),
  HAVE_SWITCH_ON      DECIMAL(1),
  TV_PAY_STATUS       DECIMAL(1),
  TV_GAME_STATUS      DECIMAL(1),
  IS_INS              DECIMAL(1),
  IS_EXCHANGE         DECIMAL(1),
  CUST_TYPE1          DECIMAL(1),
  IS_HOUSE            DECIMAL(1),
  IS_DTV_MANA_STOP    DECIMAL(1),
  IS_LAN_MANA_STOP    DECIMAL(1),
  IS_HISTORY_DATA     DECIMAL(1),
  ATV_COUNT                                DECIMAL(8)      ,
  DTV_COUNT                                DECIMAL(8)      ,
  DFTV_COUNT                               DECIMAL(8)      ,
  DBITV_COUNT                              DECIMAL(8)      ,
  DITV_COUNT                               DECIMAL(8)      ,
  LAN_COUNT                                DECIMAL(8)      ,
  VOIP_COUNT                               DECIMAL(8)      ,
  AMSP_COUNT                               DECIMAL(8)      ,
  EXT1_COUNT                               DECIMAL(8)      ,
  EXT2_COUNT                               DECIMAL(8)      ,
  HDTV_COUNT                               DECIMAL(8)      ,
  CLOUD_MEDIA_COUNT                              DECIMAL(8)      ,
  USER_COUNT                               DECIMAL(8)      ,
  SECOND_USER_COUNT                        DECIMAL(8)      ,
  IS_NEW              DECIMAL(1),
  CONV_OLAN_FLAG      DECIMAL(2),
  DATA_SOURCE_CD      VARCHAR(10),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile 
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DW/dwa_fact_cust_mon'


-- DWA 客户住宅月全量表
CREATE TABLE DWA_FACT_INS_ADDRESS_MON  (
  CUST_ID             DECIMAL(14) ,
  CUST_ADDR_ID        DECIMAL(14) ,
  STD_ADDR_ID         VARCHAR(30),
  STD_ADDR_NAME       VARCHAR(255),
  MOVE_FLAG           DECIMAL(2),
  REGION_ID           VARCHAR(6),
  DOOR_NAME           VARCHAR(255),
  RELOCATE_FLAG       DECIMAL(2),
  CAN_TRANSFER_FLAG   DECIMAL(2),
  TRANSFER_STATUS     DECIMAL(2),
  TRANSFER_NO         VARCHAR(64),
  AUDIT_FLAG          DECIMAL(2),
  STREET_STD_ADDR_ID  VARCHAR(30),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    VARCHAR(30),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  MGR_ADDR_ID         VARCHAR(30),
  MGR_ADDR_NAME       VARCHAR(255),
  DISTRICT_ID         VARCHAR(30),
  DISTRICT_NAME       VARCHAR(100),
  VALID_DATE          TIMESTAMP ,
  EXPIRE_DATE         TIMESTAMP ,
  CREATE_DATE         TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12),
  CREATE_ORG_ID       DECIMAL(12),
  OWN_ORG_ID          DECIMAL(12),
  OWN_CORP_ORG_ID     DECIMAL(12),
  DONE_DATE           TIMESTAMP,
  DONE_CODE           DECIMAL(15),
  OP_ID               DECIMAL(12),
  ORG_ID              DECIMAL(12),
  STD_ORG_CODE        VARCHAR(20),
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  DATA_SOURCE_CD      VARCHAR(10),
  IS_HISTORY_DATA     DECIMAL(1),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon char(6))
STORED AS orcfile 
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DW/dwa_fact_ins_address_mon'
;


-- DWA 流失客户月表 boss1 + boss2
CREATE TABLE DWA_LOST_CUST_MON  (
  CUST_ID             DECIMAL(14)  ,
  CUST_CODE           VARCHAR(14),
  OLD_CUST_ID         VARCHAR(64),
  OLD_CUST_CODE       VARCHAR(64),
  CUST_NAME           VARCHAR(255),
  CUST_TYPE           DECIMAL(1)  ,
  CUST_LEVEL          DECIMAL(2)  ,
  CUST_STATUS         DECIMAL(1),
  CUST_CERT_TYPE      DECIMAL(2)  ,
  CUST_CERT_NO        VARCHAR(40)  ,
  CUST_CERT_ADDR      VARCHAR(255),
  CERT_VALID_DATE     TIMESTAMP,
  CERT_EXPIRE_DATE    TIMESTAMP,
  CUST_OCCUPATION     DECIMAL(2),
  DISTRICT_ID         VARCHAR(30),
  DISTRICT_NAME       VARCHAR(255),
  MGR_ADDR_ID         VARCHAR(30),
  MGR_ADDR_NAME       VARCHAR(255),
  STD_ADDR_ID         VARCHAR(30),
  STD_ADDR_NAME       VARCHAR(255),
  STREET_STD_ADDR_ID  VARCHAR(30),
  STREET_STD_ADDR_NAME VARCHAR(255),
  AREA_STD_ADDR_ID    VARCHAR(30),
  AREA_STD_ADDR_NAME  VARCHAR(255),
  DOOR_NAME           VARCHAR(255),
  ADDRESS             VARCHAR(300),
  GRID_ID             VARCHAR(20),
  GRID_NAME           VARCHAR(100),
  MGR_ID              DECIMAL(16),
  MGR_NAME            VARCHAR(200),
  BORDER_FLAG         DECIMAL(2),
  CREATE_DATE         TIMESTAMP,
  CREATE_OP_ID        DECIMAL(12)  ,
  CREATE_ORG_ID       DECIMAL(12)  ,
  VALID_DATE          TIMESTAMP,
  EXPIRE_DATE         TIMESTAMP,
  DONE_DATE           TIMESTAMP,
  DONE_CODE           DECIMAL(15)  ,
  OP_ID               DECIMAL(12)  ,
  ORG_ID              DECIMAL(12)  ,
  CORP_ORG_ID         DECIMAL(12)  ,
  OWN_CORP_STD_ORG_CODE VARCHAR(20),
  OWN_REGION_STD_ORG_CODE VARCHAR(20),
  CUST_PROP           DECIMAL(8),
  IS_CLOUD_MEDIA      DECIMAL(1),
  IS_VALID            DECIMAL(1),
  IS_VALID1           DECIMAL(1),
  IS_VALID2           DECIMAL(1),
  IS_DTV_SUSPEND      DECIMAL(1),
  IS_LAN_SUSPEND      DECIMAL(1),
  IS_VOIP_SUSPEND     DECIMAL(1),
  IS_DTV_DEBT_STOP    DECIMAL(1),
  IS_LAN_DEBT_STOP    DECIMAL(1),
  IS_VOIP_DEBT_STOP   DECIMAL(1),
  IS_DTV_PAIED        DECIMAL(1),
  IS_LAN_PAIED        DECIMAL(1),
  IS_VOIP_PAIED       DECIMAL(1),
  IS_FREE             DECIMAL(1),
  IS_PAIED            DECIMAL(1),
  IS_UNPAY            DECIMAL(1),
  IS_ITV_ACTIVE       DECIMAL(1),
  HAVE_SWITCH_ON      DECIMAL(1),
  TV_PAY_STATUS       DECIMAL(1),
  TV_GAME_STATUS      DECIMAL(1),
  IS_INS              DECIMAL(1),
  IS_EXCHANGE         DECIMAL(1),
  CUST_TYPE1          DECIMAL(1),
  IS_HOUSE            DECIMAL(1),
  IS_DTV_MANA_STOP    DECIMAL(1),
  IS_LAN_MANA_STOP    DECIMAL(1),
  IS_HISTORY_DATA     DECIMAL(1),
  ATV_COUNT                                DECIMAL(8)      ,
  DTV_COUNT                                DECIMAL(8)      ,
  DFTV_COUNT                               DECIMAL(8)      ,
  DBITV_COUNT                              DECIMAL(8)      ,
  DITV_COUNT                               DECIMAL(8)      ,
  LAN_COUNT                                DECIMAL(8)      ,
  VOIP_COUNT                               DECIMAL(8)      ,
  AMSP_COUNT                               DECIMAL(8)      ,
  EXT1_COUNT                               DECIMAL(8)      ,
  EXT2_COUNT                               DECIMAL(8)      ,
  HDTV_COUNT                               DECIMAL(8)      ,
  CLOUD_MEDIA_COUNT                        DECIMAL(8)      ,
  USER_COUNT                               DECIMAL(8)      ,
  SECOND_USER_COUNT                        DECIMAL(8)      ,
  CONV_OLAN_FLAG      DECIMAL(2),
  DATA_SOURCE_CD      VARCHAR(10),
  ETL_CYCLE           DECIMAL(14),
  ETL_DATE            TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile 
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DW/dwa_lost_cust_mon'


-- DWA直播各分钟各频道收视统计(日)
CREATE TABLE IF NOT EXISTS DWA_TV_DIFF_MIN_CHANNEL_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_tv_diff_min_channel_d';

-- DWA直播收视明细表
CREATE TABLE dwa_tv_view_log (
  tv_day VARCHAR(8),
  user_id VARCHAR(20), 
  cust_id VARCHAR(20), 
  sn VARCHAR(100), 
  smcid VARCHAR(20), 
  start_time timestamp, 
  end_time timestamp, 
  duration DECIMAL(16), 
  service_id VARCHAR(5), 
  ts_id VARCHAR(5), 
  channel_name VARCHAR(100), 
  program_name VARCHAR(100), 
  own_corp_std_org_code VARCHAR(6), 
  etl_date TIMESTAMP,
  pro_begin_time VARCHAR(6),
  pro_end_time   VARCHAR(6),
  program_type   VARCHAR(20),
  broad_type      VARCHAR(10),
  program_num    INT,
   pro_begin_minute_code INT ,
   pro_end_minute_code INT 

)
PARTITIONED BY ( 
  pt_mon string,
  pt_time string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/DW/dwa_tv_view_log'

-- DWA直播各时段各频道收视统计(日)
CREATE TABLE IF NOT EXISTS DWA_TV_DIFF_TIME_CHANNEL_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE       VARCHAR(10),
   STD_TIMES_NAME       VARCHAR(12),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   std_times_duration          DECIMAL(16,2),
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_tv_diff_time_channel_d';


-- DWA直播各时段各节目收视统计(日)
CREATE TABLE IF NOT EXISTS DWA_TV_DIFF_TIME_PROGRAM_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE       VARCHAR(10),
   STD_TIMES_NAME       VARCHAR(12),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   PROGRAM_NAME             VARCHAR(500),
   std_times_duration          DECIMAL(16,2),
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
  pro_begin_time VARCHAR(6),
  pro_end_time   VARCHAR(6),
  program_type   VARCHAR(20),
  broad_type      VARCHAR(10)
  program_num    INT,
   pro_begin_minute_code INT ,
   pro_end_minute_code INT 
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_tv_diff_time_program_d';



-- DWA直播各分钟各频道收视统计(日)
CREATE TABLE IF NOT EXISTS DWA_TV_DIFF_MIN_PROGRAM_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   PROGRAM_NAME             VARCHAR(500),   
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/DW/dwa_tv_diff_min_program_d';

```





#### 第六章 数据集市ST

###### DDL建表语句

```
--ST用户发展(月)
CREATE TABLE IF NOT EXISTS ST_USER_DEV_M  (
   CYCLE_ID                STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   MGR_ADDR_ID             STRING,
   MGR_ADDR_NAME           STRING,
   COMMUNITY_ID            STRING,
   COMMUNITY_NAME          STRING,
   AREA_STD_ADDR_ID        STRING,
   AREA_STD_ADDR_NAME      STRING,
   USER_COUNT              INT,
   USER_CHAIN              DOUBLE,
   USER_EAR                DOUBLE,
   NEW_USER_COUNT          INT,
   NEW_USER_CHAIN          DOUBLE,
   NEW_USER_EAR            DOUBLE,
   LOSE_USER_COUNT         INT,
   CUM_LOSE_USER_COUNT     INT,
   LOSE_USER_CHAIN         DOUBLE,
   LOSE_USER_EAR           DOUBLE,
   INC_USER_COUNT          INT,
   INC_USER_CHAIN          DOUBLE,
   INC_USER_EAR            DOUBLE,
   PAYMENT_USER_COUNT      INT,
   PAYMENT_USER_CHAIN      DOUBLE,
   PAYMENT_USER_EAR        DOUBLE,
   PAY_USER_COUNT          INT,
   PAY_USER_CHAIN          DOUBLE,
   PAY_USER_EAR            DOUBLE,
   EXPIRE_USER_COUNT       INT,
   CUM_EXPIRE_USER_COUNT   INT,
   REPAY_USER_COUNT        INT,
   CUM_REPAY_USER_COUNT    INT,
   REPAY_USER_CHAIN        DOUBLE,
   REPAY_USER_EAR          DOUBLE,
   REPAY_USER_RATE         DOUBLE,
   CUM_REPAY_USER_RATE     DOUBLE,
   EXPIRE_LOSE_USER_COUNT  INT,
   CUM_EXP_LOSE_USER_COUNT INT,
   EXPIRE_LOSE_USER_RATE   DOUBLE,
   CUM_EXP_LOSE_USER_RATE  DOUBLE,
   SILENT_USER_COUNT       INT,
   ACTIVE_USER_COUNT       INT,
   ETL_DATE                STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_user_dev_m';

--ST用户发展按产品统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_PROD_USER_DEV_M  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   MGR_ADDR_ID           STRING,
   MGR_ADDR_NAME         STRING,
   COMMUNITY_ID          STRING,
   COMMUNITY_NAME        STRING,
   AREA_STD_ADDR_ID      STRING,
   AREA_STD_ADDR_NAME    STRING,
   STD_UP_PRODUCT_CODE   STRING,
   STD_UP_PRODUCT_NAME   STRING,
   NEW_USER_COUNT        INT,
   LOSE_USER_COUNT       INT,
   CUM_LOSE_USER_COUNT   INT,
   REPAY_USER_COUNT      INT,
   CUM_REPAY_USER_COUNT  INT,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_prod_user_dev_m';
ALTER TABLE ST_DIFF_PROD_USER_DEV_M ADD COLUMNS(USER_COUNT INT);

--ST用户发展按渠道统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_CHANNEL_USER_DEV_M  (
   CYCLE_ID               STRING,
   OWN_CORP_STD_ORG_CODE  STRING,
   OWN_CORP_STD_ORG_NAME  STRING,
   MGR_ADDR_ID            STRING,
   MGR_ADDR_NAME          STRING,
   COMMUNITY_ID           STRING,
   COMMUNITY_NAME         STRING,
   AREA_STD_ADDR_ID       STRING,
   AREA_STD_ADDR_NAME     STRING,
   STD_CUST_CHANNEL_CODE  STRING,
   STD_CUST_CHANNEL_NAME  STRING,
   NEW_USER_COUNT         INT,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_channel_user_dev_m';

--ST经营收入(月)
CREATE TABLE IF NOT EXISTS ST_INCOME_M  (
   CYCLE_ID               STRING,
   OWN_CORP_STD_ORG_CODE  STRING,
   OWN_CORP_STD_ORG_NAME  STRING,
   MGR_ADDR_ID            STRING,
   MGR_ADDR_NAME          STRING,
   COMMUNITY_ID           STRING,
   COMMUNITY_NAME         STRING,
   AREA_STD_ADDR_ID       STRING,
   AREA_STD_ADDR_NAME     STRING,
   NEW_ORDER_USER_COUNT   INT,
   NEW_ORDER_AMOUNT       DOUBLE,
   NEW_ORDER_AMOUNT_CHAIN DOUBLE,
   NEW_ORDER_AMOUNT_EAR   DOUBLE,
   NEW_ORDER_AMOUNT_ARPU  DOUBLE,
   BILL_USER_COUNT        INT,
   BILL_AMOUNT            DOUBLE,
   BILL_AMOUNT_CHAIN      DOUBLE,
   BILL_AMOUNT_EAR        DOUBLE,
   BILL_AMOUNT_ARPU       DOUBLE,
   LAN_PARTNER_AMOUNT     DOUBLE,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_income_m';

--ST经营收入按产品统计(月)
/*
CREATE TABLE IF NOT EXISTS ST_DIFF_PROD_INCOME_M  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   MGR_ADDR_ID           STRING,
   MGR_ADDR_NAME         STRING,
   COMMUNITY_ID          STRING,
   COMMUNITY_NAME        STRING,
   AREA_STD_ADDR_ID      STRING,
   AREA_STD_ADDR_NAME    STRING,
   STD_UP_PRODUCT_CODE   STRING,
   STD_UP_PRODUCT_NAME   STRING,
   NEW_ORDER_USER_COUNT  INT,
   NEW_ORDER_USER_RATE   DOUBLE,
   NEW_ORDER_AMOUNT      DOUBLE,
   NEW_ORDER_AMOUNT_RATE DOUBLE,
   BILL_USER_COUNT       INT,
   BILL_AMOUNT           DOUBLE,
   BILL_AMOUNT_RATE      DOUBLE,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_prod_income_m';
*/
CREATE TABLE IF NOT EXISTS ST_DIFF_PROD_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   STD_UP_PRODUCT_CODE            STRING,
   STD_UP_PRODUCT_NAME            STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_USER_RATE            DOUBLE,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_RATE          DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_RATE               DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_prod_income_m';

--ST经营收入按带宽统计(月)
/*
CREATE TABLE IF NOT EXISTS ST_DIFF_BANDWIDTH_INCOME_M  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   MGR_ADDR_ID           STRING,
   MGR_ADDR_NAME         STRING,
   COMMUNITY_ID          STRING,
   COMMUNITY_NAME        STRING,
   AREA_STD_ADDR_ID      STRING,
   AREA_STD_ADDR_NAME    STRING,
   STD_BANDWIDTH_CODE    STRING,
   STD_BANDWIDTH_NAME    STRING,
   NEW_ORDER_USER_COUNT  INT,
   NEW_ORDER_AMOUNT      DOUBLE,
   NEW_ORDER_AMOUNT_ARPU DOUBLE,
   PAYMENT_USER_COUNT    INT,
   BILL_USER_COUNT       INT,
   BILL_AMOUNT           DOUBLE,
   BILL_AMOUNT_ARPU      DOUBLE,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_bandwidth_income_m';
*/
CREATE TABLE IF NOT EXISTS ST_DIFF_BANDWIDTH_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   STD_BANDWIDTH_CODE             STRING,
   STD_BANDWIDTH_NAME             STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_bandwidth_income_m';


--ST经营收入按产品周期统计(月)
/*
CREATE TABLE IF NOT EXISTS ST_DIFF_CYCLE_INCOME_M  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   MGR_ADDR_ID           STRING,
   MGR_ADDR_NAME         STRING,
   COMMUNITY_ID          STRING,
   COMMUNITY_NAME        STRING,
   AREA_STD_ADDR_ID      STRING,
   AREA_STD_ADDR_NAME    STRING,
   STD_PROD_CYCLE_CODE   STRING,
   STD_PROD_CYCLE_NAME   STRING,
   NEW_ORDER_USER_COUNT  INT,
   NEW_ORDER_AMOUNT      DOUBLE,
   NEW_ORDER_AMOUNT_ARPU DOUBLE,
   PAYMENT_USER_COUNT    INT,
   BILL_USER_COUNT       INT,
   BILL_AMOUNT           DOUBLE,
   BILL_AMOUNT_ARPU      DOUBLE,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_cycle_income_m';
*/
CREATE TABLE IF NOT EXISTS ST_DIFF_CYCLE_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   STD_PROD_CYCLE_CODE            STRING,
   STD_PROD_CYCLE_NAME            STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_cycle_income_m';

--ST各时段各频道直播收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_TIME_CHANNEL_VIEW_D  (
   CYCLE_ID               VARCHAR(8),
   OWN_CORP_STD_ORG_CODE  VARCHAR(6),
   OWN_CORP_STD_ORG_NAME  VARCHAR(50),
   STD_CHANNEL_CODE       VARCHAR(20),
   STD_CHANNEL_NAME       VARCHAR(100),
   STD_TIMES_CODE         VARCHAR(10),
   STD_TIMES_NAME         VARCHAR(12),
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME                DECIMAL(16,2),
   AVG_TV_TIME            DECIMAL(16,2),
   TV_RATE                DECIMAL(16,2),
   TV_OCCUPY_RATE         DECIMAL(16,2),
   TV_ARRIVAL_RATE        DECIMAL(16,2),
   ETL_DATE               timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_time_channel_view_d';

--ST各时段直播收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_TIME_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE        VARCHAR(10),
   STD_TIMES_NAME        CHAR(11),
   tv_user_count        DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_time_view_d';

--ST直播总体收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_TOTAL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   TV_USER_COUNT         DECIMAL(16,0),
   TV_TIME                      DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_total_view_d';

--ST直播各分钟各频道收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_CHANNEL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   TV_TIME               DECIMAL(16,2),
   TV_MINUTE_TREND       DECIMAL(8,2),
   TV_RATE               DECIMAL(8,2),
   TV_OCCUPY_RATE        DECIMAL(8,2),
   ETL_DATE              TIMESTAMP
)
PARTITIONED BY (PT_MON string)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_min_channel_view_d';

--ST直播各分钟收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       CHAR(5),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_mon STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_min_view_d';

--ST直播各频道用户流入流出情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_USER_INTO_OUT_D  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_TIMES_CODE        STRING,
   STD_TIMES_NAME        STRING,
   STD_CHANNEL_CODE      STRING,
   STD_CHANNEL_NAME      STRING,
   INTO_USER_COUNT       INT,
   OUT_USER_COUNT        INT,
   INTO_TURNOVER_RATE    DOUBLE,
   OUT_TURNOVER_RATE     DOUBLE,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tv_user_into_out_d';

--ST直播各频道用户流入流出明细情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_USER_INTO_OUT_DTL_D  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_TIMES_CODE        STRING,
   STD_TIMES_NAME        STRING,
   STD_CHANNEL_CODE      STRING,
   STD_CHANNEL_NAME      STRING,
   INTO_OUT_CHANNEL      STRING,
   INTO_USER_COUNT       INT,
   OUT_USER_COUNT        INT,
   INTO_TURNOVER_RATE    DOUBLE,
   OUT_TURNOVER_RATE     DOUBLE,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tv_user_into_out_dtl_d';

--ST总体收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TOTAL_VIEW_D  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   VIEW_USER_COUNT       INT,
   TV_USER_COUNT         INT,
   VOD_USER_COUNT        INT,
   REVIEW_USER_COUNT     INT,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_total_view_d';

--ST各时段收视情况(日)
CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE        VARCHAR(10),
   STD_TIMES_NAME        VARCHAR(12),
   VIEW_USER_COUNT       DECIMAL(16),
   TV_USER_COUNT         DECIMAL(16),
   VOD_USER_COUNT        DECIMAL(16),
   REVIEW_USER_COUNT     DECIMAL(16),
   BOOT_RATE             DECIMAL(16,2),
   TV_BOOT_RATE          DECIMAL(16,2),
   VOD_BOOT_RATE         DECIMAL(16,2),
   REVIEW_BOOT_RATE      DECIMAL(16,2), 
   ETL_DATE              TIMESTAMP
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_diff_time_view_d';

--ST不同时段不同节目回看收视情况(日)
CREATE TABLE IF NOT EXISTS ST_REVIEW_DIFF_TIME_PRO_VIEW_D  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_PROGRAM_CODE      STRING,
   STD_PROGRAM_NAME      STRING,
   STD_TIMES_CODE        STRING,
   STD_TIMES_NAME        STRING,
   REVIEW_USER_COUNT     STRING,
   REVIEW_COUNT          STRING,
   REVIEW_TIME           STRING,
   AVG_REVIEW_TIME       STRING,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_review_diff_time_pro_view_d';

--ST不同时段不同节目点播收视情况(日)
CREATE TABLE IF NOT EXISTS ST_VOD_DIFF_TIME_PRO_VIEW_D  (
   CYCLE_ID              STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_PROGRAM_CODE      STRING,
   STD_PROGRAM_NAME      STRING,
   STD_TIMES_CODE        STRING,
   STD_TIMES_NAME        STRING,
   VOD_USER_COUNT        STRING,
   VOD_COUNT             STRING,
   VOD_TIME              STRING,
   AVG_VOD_TIME          STRING,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_vod_diff_time_pro_view_d';

--ST电视收看明细数据(日)
CREATE TABLE IF NOT EXISTS ST_VIEW_DTL_D  (
   CYCLE_ID            STRING,
   ID                  STRING,
   VIEW_TYPE           STRING,
   START_DATE          STRING,
   CHANNEL             STRING,
   PROGRAM             STRING,
   VIEW_TIME           STRING,
   ETL_DATE            STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_view_dtl_d';

--ST各时段各节目直播收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_TIME_PROGRAM_VIEW_D  (
   CYCLE_ID               STRING,
   OWN_CORP_STD_ORG_CODE  STRING,
   OWN_CORP_STD_ORG_NAME  STRING,
   STD_CHANNEL_CODE       STRING,
   STD_CHANNEL_NAME       STRING,
   STD_PROGRAM_CODE       STRING,
   STD_PROGRAM_NAME       STRING,
   PRO_BEGIN_TIME         STRING,
   PRO_END_TIME           STRING,
   TV_USER_COUNT          INT,
   TV_TIME                DOUBLE,
   AVG_TV_TIME            DOUBLE,
   TV_RATE                DOUBLE,
   TV_OCCUPY_RATE         DOUBLE,
   TV_ARRIVAL_RATE        DOUBLE,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_time_program_view_d';

--ST电商消费情况统计(月)
CREATE TABLE IF NOT EXISTS ST_ECOMMERCE_CONSUME_USER_M  (
   CYCLE_ID             STRING,
   STD_ECOMMERCE_CODE   STRING,
   STD_ECOMMERCE_NAME   STRING,
   USER_COUNT           STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_ecommerce_consume_user_m';

--ST各购物类别消费用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_SHOPPING_USER_M  (
   CYCLE_ID             STRING,
   STD_ECOMMERCE_CODE   STRING,
   STD_ECOMMERCE_NAME   STRING,
   STD_SHOPPING_CODE    STRING,
   STD_SHOPPING_NAME    STRING,
   USER_COUNT           STRING,
   USER_RATE            STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_shopping_user_m';

--ST各在线媒体用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_ONLINE_MEDIA_USER_M  (
   CYCLE_ID              STRING,
   STD_ONLINE_MEDIA_CODE STRING,
   STD_ONLINE_MEDIA_NAME STRING,
   USER_COUNT            STRING,
   USER_RATE             STRING,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_online_media_user_m';

--ST使用各设备的用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_DEVICE_CATE_USER_M  (
   CYCLE_ID             STRING,
   STD_DEVICE_CATE_CODE STRING,
   STD_DEVICE_CATE_NAME STRING,
   USER_COUNT           STRING,
   USER_RATE            STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_device_cate_user_m';

--ST各时段的上网用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TIMES_USER_M  (
   CYCLE_ID             STRING,
   STD_TIMES_CODE       STRING,
   STD_TIMES_NAME       STRING,
   USER_COUNT           STRING,
   USER_RATE            STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_times_user_m';

--ST不同上网天数的用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_ONLINE_DAYS_USER_M  (
   CYCLE_ID             STRING,
   STD_ONLINE_DAYS_CODE STRING,
   STD_ONLINE_DAYS_NAME STRING,
   USER_COUNT           STRING,
   USER_RATE            STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_online_days_user_m';

--ST不同上网时长的用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_ONLINE_LENGTH_USER_M  (
   CYCLE_ID               STRING,
   STD_ONLINE_LENGTH_CODE STRING,
   STD_ONLINE_LENGTH_NAME STRING,
   USER_COUNT             STRING,
   USER_RATE              STRING,
   ETL_DATE               STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_online_length_user_m';

--ST各时段使用各设备的上网用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TIMES_DEVICE_USER_M  (
   CYCLE_ID             STRING,
   STD_TIMES_CODE       STRING,
   STD_TIMES_NAME       STRING,
   STD_DEVICE_CATE_CODE STRING,
   STD_DEVICE_CATE_NAME STRING,
   USER_COUNT           STRING,
   USER_RATE            STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_times_device_user_m';

--ST各时段各网站类别的请求次数统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_WEBSITE_REQUEST_M  (
   CYCLE_ID              STRING,
   STD_TIMES_CODE        STRING,
   STD_TIMES_NAME        STRING,
   STD_WEBSITE_CATE_CODE STRING,
   STD_WEBSITE_CATE_NAME STRING,
   REQUESTS_COUNT        STRING,
   ETL_DATE              STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_time_website_request_m';

--ST不同带宽不同上网时长的用户数统计(月)
CREATE TABLE IF NOT EXISTS ST_BANDWIDTH_LENGTH_USER_M  (
   CYCLE_ID               STRING,
   STD_BANDWIDTH_CODE     STRING,
   STD_BANDWIDTH_NAME     STRING,
   STD_ONLINE_LENGTH_CODE STRING,
   STD_ONLINE_LENGTH_NAME STRING,
   USER_COUNT             STRING,
   USER_RATE              STRING,
   ETL_DATE               STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_bandwidth_length_user_m';

--ST认证总体情况统计(月)
CREATE TABLE IF NOT EXISTS ST_AUTH_M  (
   CYCLE_ID             STRING,
   AUTH_COUNT           STRING,
   AUTH_SUCCESS_COUNT   STRING,
   AUTH_SUCCESS_RATE    STRING,
   AUTH_FAILURE_COUNT   STRING,
   AUTH_FAILURE_RATE    STRING,
   AUTH_USER_COUNT      STRING,
   ONLINE_USER_COUNT    STRING,
   BROWSE_USER_COUNT    STRING,
   AUTH_RATE            STRING,
   BROWSE_RATE          STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_auth_m';

--ST认证失败原因情况统计(月)
CREATE TABLE IF NOT EXISTS ST_AUTH_FAILURE_REASON_M  (
   CYCLE_ID                STRING,
   STD_FAILURE_REASON_CODE STRING,
   STD_FAILURE_REASON_NAME STRING,
   AUTH_FAILURE_COUNT      STRING,
   AUTH_FAILURE_RATE       STRING,
   AUTH_FAILURE_USER_COUNT STRING,
   ETL_DATE                STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_auth_failure_reason_m';

--ST认证失败原因情况按产品统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_PROD_FAILURE_REASON_M  (
   CYCLE_ID                STRING,
   STD_FAILURE_REASON_CODE STRING,
   STD_FAILURE_REASON_NAME STRING,
   STD_PRODUCT_CODE        STRING,
   STD_PRODUCT_NAME        STRING,
   AUTH_FAILURE_USER_COUNT STRING,
   AUTH_FAILURE_USER_RATE  STRING,
   ETL_DATE                STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_prod_failure_reason_m';

--ST认证方式情况统计(月)
CREATE TABLE IF NOT EXISTS ST_AUTH_MODE_M  (
   CYCLE_ID             STRING,
   STD_AUTH_MODE_CODE   STRING,
   STD_AUTH_MODE_NAME   STRING,
   AUTH_COUNT           STRING,
   AUTH_RATE            STRING,
   ETL_DATE             STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_auth_mode_m';

--ST出口平均流量情况统计(月)
CREATE TABLE IF NOT EXISTS ST_NET_FLOW_M  (
   CYCLE_ID           STRING,
   IN_NET_FLOW        STRING,
   OUT_NET_FLOW       STRING,
   ETL_DATE           STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_net_flow_m';

--ST平均速率情况统计(月)
CREATE TABLE IF NOT EXISTS ST_NET_SPEED_M  (
   CYCLE_ID             STRING,
   FREE_NET_SPEED       STRING,
   BUSI_NET_SPEED       STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_net_speed_m';

--ST各时段丢包率情况统计(月)
CREATE TABLE IF NOT EXISTS ST_PACKET_LOSS_M  (
   CYCLE_ID             STRING,
   STD_TIMES_CODE       STRING,
   STD_TIMES_NAME       STRING,
   PACKET_LOSS_COUNT    STRING,
   PACKET_LOSS_RATE     STRING,
   ETL_DATE             STRING,
   STD_ORG_NAME         STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_packet_loss_m';

--ST域名请求应答情况统计(月)
CREATE TABLE IF NOT EXISTS ST_DOMAIN_REQUEST_RESPONSE_M  (
   CYCLE_ID               STRING,
   DOMAIN_NAME            STRING,
   TOTAL_REQUEST_COUNT    STRING,
   TOTAL_RESPONSE_COUNT   STRING,
   TOTAL_RESPONSE_RATE    STRING,
   FAILURE_RESPONSE_COUNT STRING,
   FAILURE_RESPONSE_RATE  STRING,
   ETL_DATE               STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_domain_request_response_m';

--ST拨测平台部署情况(月)
CREATE TABLE IF NOT EXISTS ST_BCPT_DEPLOYMENT_M  (
   CYCLE_ID             STRING,
   DATA_SOURCE          STRING,
   REGION_NAME          STRING,
   MONITOR_NUM          STRING,
   MAIN_ID_COUNT        STRING,
   INCREMENT_ID_COUNT   STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_bcpt_deployment_m';

--ST网页浏览质量总体情况(月)
CREATE TABLE IF NOT EXISTS ST_WEB_BROWSE_M  (
   CYCLE_ID             STRING,
   REGION_NAME          STRING,
   PERFORMANCE          STRING,
   FIRST_SCREEN_TIME    STRING,
   DOWNLOAD_SPEED       STRING,
   MONITOR_COUNT        STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_web_browse_m';

--ST网页浏览分任务情况(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TASK_WEB_BROWSE_M  (
   CYCLE_ID             STRING,
   TASK_NAME            STRING,
   PERFORMANCE          STRING,
   FIRST_SCREEN_TIME    STRING,
   DOWNLOAD_TIME        STRING,
   MONITOR_COUNT        STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_task_web_browse_m';

--ST视频观看质量总体情况(月)
CREATE TABLE IF NOT EXISTS ST_VIDEO_VIEW_M  (
   CYCLE_ID             STRING,
   REGION_NAME          STRING,
   BUFFER_TIME          STRING,
   FIRST_BUFFER_TIME    STRING,
   BUFFER_COUNT         STRING,
   DOWNLOAD_SPEED       STRING,
   MONITOR_COUNT        STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_video_view_m';

--ST视频观看质量分任务情况(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TASK_VIDEO_VIEW_M  (
   CYCLE_ID             STRING,
   TASK_NAME            STRING,
   BUFFER_TIME          STRING,
   FIRST_BUFFER_TIME    STRING,
   BUFFER_COUNT         STRING,
   DOWNLOAD_SPEED       STRING,
   MONITOR_COUNT        STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_task_video_view_m';

--ST异网网络网页浏览质量对比 (月)
CREATE TABLE IF NOT EXISTS ST_OTHER_WEB_BROWSE_M  (
   CYCLE_ID                STRING,
   TASK_NAME               STRING,
   OPERATOR                STRING,
   PERFORMANCE             STRING,
   USABILITY               STRING,
   PROJECTED_TCP_TIME      STRING,
   PROJECTED_RESPONSE_TIME STRING,
   PROJECTED_DOWNLOAD_TIME STRING,
   VALID_MONITOR_COUNT     STRING,
   ETL_DATE                STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_other_web_browse_m';

--ST异网网络视频观看质量对比 (月)
CREATE TABLE IF NOT EXISTS ST_OTHER_VIDEO_VIEW_M  (
   CYCLE_ID             STRING,
   TASK_NAME            STRING,
   OPERATOR             STRING,
   DOWNLOAD_SPEED       STRING,
   VIDEO_FIRST_TIME     STRING,
   DOWNLOAD_BYTES       STRING,
   VALID_MONITOR_COUNT  STRING,
   AVAILABILITY         STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_other_video_view_m';

--ST异网网络下载质量对比(月)
CREATE TABLE IF NOT EXISTS ST_OTHER_DOWNLOAD_M  (
   CYCLE_ID             STRING,
   TASK_NAME            STRING,
   OPERATOR             STRING,
   TRANSMISSION_SPEED   STRING,
   TRANSMISSION_TIME    STRING,
   DNS_TIME             STRING,
   TCP_TIME             STRING,
   TRANSMISSION_BYTES   STRING,
   VALID_MONITOR_COUNT  STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_other_download_m';

--ST城域网核心情况(月)
CREATE TABLE IF NOT EXISTS ST_MAN_MAIN_M  (
   CYCLE_ID             STRING,
   DOWN_PORT_COUNT      STRING,
   PORT_ACCESS_AREA     STRING,
   PORT_FLOW            STRING,
   FREE_PORT_COUNT      STRING,
   DEVICE_MODEL         STRING,
   COUNT                STRING,
   AGE                  STRING,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_man_main_m';

--ST城域网汇聚情况(月)
CREATE TABLE IF NOT EXISTS ST_MAN_TOTAL_M  (
   CYCLE_ID                 STRING,
   DOWN_PORT_COUNT          STRING,
   FREE_PORT_COUNT          STRING,
   DOWN_PORT_VLAN           STRING,
   DOWN_PORT_ACCESS_AREA    STRING,
   DOWN_PORT_FLOW           STRING,
   ACCESS_HEAD_DEVICE_COUNT STRING,
   DEVICE_MODEL             STRING,
   COUNT                    STRING,
   AGE                      STRING,
   ETL_DATE                 STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_man_total_m';

--ST城域网接入情况(月)
CREATE TABLE IF NOT EXISTS ST_MAN_ACCESS_M  (
   CYCLE_ID                STRING,
   HEAD_DEVICE_COUNT       STRING,
   REGION_DISTRIBUT        STRING,
   AREA_DISTRIBUT          STRING,
   DEVICE_MODEL            STRING,
   AGE                     STRING,
   AVAILABLE_MAX_BANDWIDTH STRING,
   ACCESS_TERMINAL_COUNT   STRING,
   ACCESS_BANDWIDTH        STRING,
   ETL_DATE                STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_man_access_m';

--ST城域网接入情况(月)
CREATE TABLE IF NOT EXISTS ST_MAN_ACCESS_M  (
   CYCLE_ID                STRING,
   HEAD_DEVICE_COUNT       STRING,
   REGION_DISTRIBUT        STRING,
   AREA_DISTRIBUT          STRING,
   DEVICE_MODEL            STRING,
   AGE                     STRING,
   AVAILABLE_MAX_BANDWIDTH STRING,
   ACCESS_TERMINAL_COUNT   STRING,
   ACCESS_BANDWIDTH        STRING,
   ETL_DATE                STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_man_access_m';

--ST宽带伴侣报表(日)
CREATE TABLE IF NOT EXISTS ST_TX_REPORT_D  (
   CYCLE_ID             STRING,
   TOTAL_USER_COUNT     INT,
   NEW_USER_COUNT       INT,
   ACTIVE_USER_COUNT    INT,
   PLAY_COUNT           INT,
   ACTIVE_RATE          DOUBLE,
   AVG_PLAY_COUNT       DOUBLE,
   AVG_DURATION         DOUBLE,
   PLAY_ACTIVE_RATE     DOUBLE,
   TWICE_ACTIVATED_COUNT INT,
   TWICE_ACTIVATED_RATE DOUBLE,
   PLAY_USER_COUNT      INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tx_report_d';

--ST宽带伴侣报表(周)
CREATE TABLE IF NOT EXISTS ST_TX_REPORT_W  (
   CYCLE_ID             STRING,
   ACTIVE_USER_COUNT    INT,
   ACTIVE_RATE          DOUBLE,
   ACTIVE_USER_LOSS_RATE DOUBLE,
   AVG_ACTIVE_RATE      DOUBLE,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_WEEK STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tx_report_w';

--ST宽带伴侣报表(月)
CREATE TABLE IF NOT EXISTS ST_TX_REPORT_M  (
   CYCLE_ID             STRING,
   ACTIVE_USER_COUNT    INT,
   ACTIVE_RATE          DOUBLE,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tx_report_m';

--ST宽带伴侣点播分析表(日)
CREATE TABLE IF NOT EXISTS ST_TX_VOD_ANALYSIS_D  (
   CYCLE_ID             STRING,
   VID                  STRING,
   VNAME                STRING,
   VTYPEID              STRING,
   VTYPENAME            STRING,
   PLAY_COUNT           INT,
   PLAY_USER_COUNT1     INT,
   PLAY_DURATION        DOUBLE,
   PLAY_USER_COUNT2     INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tx_vod_analysis_d';

--ST宽带伴侣点播节目类型分析表(日)
CREATE TABLE IF NOT EXISTS ST_TX_VOD_VTYPE_ANALYSIS_D  (
   CYCLE_ID             STRING,
   VTYPEID              STRING,
   VTYPENAME            STRING,
   PLAY_COUNT           INT,
   PLAY_USER_COUNT1     INT,
   PLAY_DURATION        DOUBLE,
   PLAY_USER_COUNT2     INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_tx_vod_vtype_analysis_d';

--ST流控数据流量分析统计(日)
CREATE TABLE IF NOT EXISTS ST_DPI_FLOW_D  (
   CYCLE_ID             STRING,
   NET_TYPE             STRING,
   CONTENT_TYPE         STRING,
   CONTENT_NAME         STRING,
   SOURCE_IP            STRING,
   TARGET_IP            STRING,
   TARGET_BELONG        STRING,
   OPERATOR             STRING,
   URL                  STRING,
   DOWN_FLOW            DOUBLE,
   UP_FLOW              DOUBLE,
   TOTAL_FLOW           DOUBLE,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_TIME STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_dpi_flow_d';

--ST续费用户情况（月）
CREATE TABLE IF NOT EXISTS ST_REPAY_USERS_MON  (
   CYCLE_ID             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   LOGIN_NAME           STRING,
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   SRVPKG_CREATE_DATE   STRING,
   SRVPKG_VALID_DATE    STRING,
   SRVPKG_REMAINDER_DAYS STRING,
   SRVPKG_EXPIRE_DATE   STRING,
   STATUS_NAME          STRING,
   LAN_NUMBER           STRING,
   MONTH_ONLINE_DAYS int,
   MONTH_ONLINE_DURATION DOUBLE,
   MONTH_ONLINE_DURATION_AVG DOUBLE,
   MONTH_UP_FLOW        DOUBLE,
   MONTH_UP_FLOW_AVG    DOUBLE,
   MONTH_DOWN_FLOW      DOUBLE,
   MONTH_DOWN_FLOW_AVG  DOUBLE,
   AUTH_COUNT           INT,
   AUTH_SUCCESS_RATE    DOUBLE,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_repay_users_mon';
##原上网天数修改为月有效上网次数
alter TABLE st_repay_users_mon change MONTH_ONLINE_DAYS MONTH_ONLINE_NUM int;

--ST流失用户情况（月）
CREATE TABLE IF NOT EXISTS ST_LOST_USERS_MON  (
   CYCLE_ID             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   LOGIN_NAME           STRING,
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   SRVPKG_CREATE_DATE   STRING,
   SRVPKG_VALID_DATE    STRING,
   SRVPKG_REMAINDER_DAYS STRING,
   SRVPKG_EXPIRE_DATE   STRING,
   STATUS_NAME          STRING,
   LAN_NUMBER           STRING,
   MONTH_ONLINE_DAYS INT,
   MONTH_ONLINE_DURATION DOUBLE,
   MONTH_ONLINE_DURATION_AVG DOUBLE,
   MONTH_UP_FLOW        DOUBLE,
   MONTH_UP_FLOW_AVG    DOUBLE,
   MONTH_DOWN_FLOW      DOUBLE,
   MONTH_DOWN_FLOW_AVG  DOUBLE,
   AUTH_COUNT           INT,
   AUTH_SUCCESS_RATE    DOUBLE,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_lost_users_mon';

##原上网天数修改为月有效上网次数
alter TABLE st_lost_users_mon change MONTH_ONLINE_DAYS MONTH_ONLINE_NUM int;

--ST全量用户情况（月）
CREATE TABLE IF NOT EXISTS ST_ALL_USERS_MON  (
   CYCLE_ID             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   LOGIN_NAME           STRING,
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   ADDR_NAME            STRING,
   MANAGEMENT_STATION   STRING,
   CONT_PHONE1          STRING,
   CONT_PHONE2          STRING,
   CONT_MOBILE1         STRING,
   CONT_MOBILE2         STRING,
   ACCESS_TYPE          STRING,
   SRVPKG_NAME          STRING,
   SRVPKG_CREATE_DATE   STRING,
   SRVPKG_VALID_DATE    STRING,
   SRVPKG_REMAINDER_DAYS STRING,
   SRVPKG_EXPIRE_DATE   STRING,
   STATUS_NAME          STRING,
   LAN_NUMBER           STRING,
   MONTH_ONLINE_NUM int,
   MONTH_ONLINE_DURATION DOUBLE,
   MONTH_ONLINE_DURATION_AVG DOUBLE,
   MONTH_UP_FLOW        DOUBLE,
   MONTH_UP_FLOW_AVG    DOUBLE,
   MONTH_DOWN_FLOW      DOUBLE,
   MONTH_DOWN_FLOW_AVG  DOUBLE,
   AUTH_COUNT           INT,
   AUTH_SUCCESS_RATE    DOUBLE,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_all_users_mon';




--ST本月用户上网情况（月）
--注：这个表数据取本月用户的上网情况
CREATE TABLE IF NOT EXISTS ST_USER_ONLINE_MON  (
   CYCLE_ID             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   LOGIN_NAME           STRING,
   CUST_CODE            STRING,
   CUST_NAME            STRING,
   PROD_INST_ID         STRING,
   SRVPKG_NAME          STRING,
   ARPU                 STRING,
   BANDWIDTH            STRING,
   CYCLE                STRING,
   PRICE                STRING,
   THIS_MONTH_ONLINE_DAYS INT,
   MONTH_ONLINE_DURATION_AVG DOUBLE,
   DAYS_FROM_LAST_ONLINE INT,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_user_online_mon';

##原上网天数修改为月有效上网次数
alter TABLE st_user_online_mon change THIS_MONTH_ONLINE_DAYS MONTH_ONLINE_NUM int;


--ST认证成功率统计(月)
CREATE TABLE IF NOT EXISTS ST_AUTH_RATE_M  (
   CYCLE_ID                STRING,
   OWN_CORP_STD_ORG_CODE   STRING,
   OWN_CORP_STD_ORG_NAME   STRING,
   AUTH_SUCCESS_USER_COUNT INT,
   AUTH_FAILURE_USER_COUNT INT,
   AUTH_SUCCESS_RATE       DOUBLE,
   ETL_DATE                STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_auth_rate_m';

--ST经营收入按分公司统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_CORP_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_CHAIN         DOUBLE,
   NEW_ORDER_AMOUNT_EAR           DOUBLE,
   NEW_ORDER_AMOUNT_CHAIN_GROWTH  DOUBLE,
   NEW_ORDER_AMOUNT_EAR_GROWTH    DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_CHAIN              DOUBLE,
   BILL_AMOUNT_EAR                DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   LAN_PARTNER_AMOUNT             DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_corp_income_m';

--ST经营收入按区域统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_REGION_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   MGR_ADDR_ID                    STRING,
   MGR_ADDR_NAME                  STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_region_income_m';

--ST经营收入按套餐统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_OFFER_INCOME_M  (
   CYCLE_ID                       STRING,
   OWN_CORP_STD_ORG_CODE          STRING,
   OWN_CORP_STD_ORG_NAME          STRING,
   STD_OFFER_CODE                 STRING,
   STD_OFFER_NAME                 STRING,
   NEW_ORDER_USER_COUNT           INT,
   NEW_ORDER_USER_RATE            DOUBLE,
   NEW_ORDER_AMOUNT               DOUBLE,
   NEW_ORDER_AMOUNT_RATE          DOUBLE,
   NEW_ORDER_AMOUNT_ARPU          DOUBLE,
   NEW_ORDER_AMOUNT_NOT0_ARPU     DOUBLE,
   BILL_USER_COUNT                INT,
   BILL_AMOUNT                    DOUBLE,
   BILL_AMOUNT_RATE               DOUBLE,
   BILL_AMOUNT_ARPU               DOUBLE,
   ETL_DATE                       STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_offer_income_m';

--ST用户发展按分公司统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_CORP_USER_DEV_M  (
   CYCLE_ID                   STRING,
   OWN_CORP_STD_ORG_CODE      STRING,
   OWN_CORP_STD_ORG_NAME      STRING,
   USER_COUNT                 INT,
   USER_CHAIN                 DOUBLE,
   USER_EAR                   DOUBLE,
   USER_CHAIN_GROWTH          DOUBLE,
   USER_EAR_GROWTH            DOUBLE,
   NEW_USER_COUNT             INT,
   NEW_USER_CHAIN             DOUBLE,
   NEW_USER_EAR               DOUBLE,
   NEW_USER_CHAIN_GROWTH      DOUBLE,
   NEW_USER_EAR_GROWTH        DOUBLE,
   LOSE_USER_COUNT            INT,
   CUM_LOSE_USER_COUNT        INT,
   LOSE_USER_CHAIN            DOUBLE,
   LOSE_USER_EAR              DOUBLE,
   LOSE_USER_CHAIN_GROWTH     DOUBLE,
   LOSE_USER_EAR_GROWTH       DOUBLE,
   INC_USER_COUNT             INT,
   INC_USER_CHAIN             DOUBLE,
   INC_USER_EAR               DOUBLE,
   PAYMENT_USER_COUNT         INT,
   PAYMENT_USER_CHAIN         DOUBLE,
   PAYMENT_USER_EAR           DOUBLE,
   PAY_USER_COUNT             INT,
   PAY_USER_CHAIN             DOUBLE,
   PAY_USER_EAR               DOUBLE,
   EXPIRE_USER_COUNT          INT,
   CUM_EXPIRE_USER_COUNT      INT,
   REPAY_USER_COUNT           INT,
   CUM_REPAY_USER_COUNT       INT,
   REPAY_USER_CHAIN           DOUBLE,
   REPAY_USER_EAR             DOUBLE,
   REPAY_USER_CHAIN_GROWTH    DOUBLE,
   REPAY_USER_EAR_GROWTH      DOUBLE,
   REPAY_USER_RATE            DOUBLE,
   CUM_REPAY_USER_RATE        DOUBLE,
   EXPIRE_LOSE_USER_COUNT     INT,
   CUM_EXP_LOSE_USER_COUNT    INT,
   EXPIRE_LOSE_USER_RATE      DOUBLE,
   CUM_EXP_LOSE_USER_RATE     DOUBLE,
   SILENT_USER_COUNT          INT,
   ACTIVE_USER_COUNT          INT,
   ETL_DATE                   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_corp_user_dev_m';


--ST用户发展按区域统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_REGION_USER_DEV_M  (
   CYCLE_ID                   STRING,
   OWN_CORP_STD_ORG_CODE      STRING,
   OWN_CORP_STD_ORG_NAME      STRING,
   MGR_ADDR_ID                STRING,
   MGR_ADDR_NAME              STRING,
   USER_COUNT                 INT,
   USER_RATE                  DOUBLE,
   NEW_USER_COUNT             INT,
   NEW_USER_RATE              DOUBLE,
   LOSE_USER_COUNT            INT,
   LOSE_USER_RATE             DOUBLE,
   REPAY_USER_COUNT           INT,
   REPAY_USER_RATE            DOUBLE,
   ETL_DATE                   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_region_user_dev_m';


--ST用户发展按套餐统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_OFFER_USER_DEV_M  (
   CYCLE_ID                   STRING,
   OWN_CORP_STD_ORG_CODE      STRING,
   OWN_CORP_STD_ORG_NAME      STRING,
   STD_OFFER_CODE             STRING,
   STD_OFFER_NAME             STRING,
   USER_COUNT                 INT,
   USER_RATE                  DOUBLE,
   NEW_USER_COUNT             INT,
   NEW_USER_RATE              DOUBLE,
   LOSE_USER_COUNT            INT,
   LOSE_USER_RATE             DOUBLE,
   REPAY_USER_COUNT           INT,
   REPAY_USER_RATE            DOUBLE,
   ETL_DATE                   STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_offer_user_dev_m';


--ST不同次数点播统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_NUM_DR_SUMMARY  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   DR_COUNT_TYPE        STRING,
   DR_USER_COUNT        INT,
   LB_USER_COUNT        INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_num_dr_summary';


--ST不同时段点播统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_DR_SUMMARY  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   STD_TIMES_CODE       STRING,
   STD_TIMES_NAME       STRING,
   DR_USER_COUNT        INT,
   DR_COUNT             INT,
   LB_USER_COUNT        INT,
   LB_COUNT             INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_time_dr_summary';



--ST点播概况统计(月)
CREATE TABLE IF NOT EXISTS ST_DR_SUMMARY  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   TOTAL_USER_COUNT     INT,
   ACTIVE_USER_COUNT    INT,
   DORMANT_USER_COUNT   INT,
   DR_NEW_USER_COUNT    INT,
   DR_BACK_USER_COUNT   INT,
   DR_USER_COUNT        INT,
   DR_USER_PRO          DOUBLE,
   DR_COUNT             INT,
   DR_PER_COUNT         DOUBLE,
   DR_YEAR_GROWTH       DOUBLE,
   DR_MONTH_GROWTH      DOUBLE,
   DR_PER_YEAR_GROWTH   DOUBLE,
   DR_PER_MONTH_GROWTH  DOUBLE,
   LB_NEW_USER_COUNT    INT,
   LB_BACK_USER_COUNT   INT,
   LB_USER_COUNT        INT,
   LB_USER_PRO          DOUBLE,
   LB_COUNT             INT,
   LB_PER_COUNT         DOUBLE,
   LB_YEAR_GROWTH       DOUBLE,
   LB_MONTH_GROWTH      DOUBLE,
   LB_PER_YEAR_TROWTH   DOUBLE,
   LB_PER_MONTH_TROWTH  DOUBLE,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_dr_summary';



--ST不同栏目分类点播统计(月)
CREATE TABLE IF NOT EXISTS ST_DIFF_CATEGORY_TYPE_SUMMARY  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   CATEGORY_TYPE_ID       STRING,
   CATEGORY_TYPE_NAME       STRING,
   DR_USER_COUNT        INT,
   DR_COUNT             INT,
   LB_USER_COUNT        INT,
   LB_COUNT             INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_diff_category_type_summary';

--ST不同网站访问用户
CREATE TABLE IF NOT EXISTS st_diff_url_user_m  (
OWN_CORP_STD_ORG_CODE    string,
OWN_CORP_STD_ORG_NAME    string,
URL                      string,
VISIT_COUNT              int,
VISIT_USER_COUNT         int,
ETL_DATE                 string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_url_user_m';

--ST不同网站类型访问用户
CREATE TABLE IF NOT EXISTS st_diff_url_type_user_m  (
OWN_CORP_STD_ORG_CODE    string,
OWN_CORP_STD_ORG_NAME    string,
URL_TYPE                 string,
VISIT_COUNT              int,
VISIT_USER_COUNT         int,
ETL_DATE                 string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_url_type_user_m';

--ST不同时段访问用户
CREATE TABLE IF NOT EXISTS st_diff_time_user_m  (
OWN_CORP_STD_ORG_CODE   string,
OWN_CORP_STD_ORG_NAME   string,
STD_TIMES_CODE          string,
STD_TIMES_NAME          string,
VISIT_COUNT             int,
VISIT_USER_COUNT        int,
ETL_DATE                string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_time_user_m';

--ST不同工作日类型访问用户
CREATE TABLE IF NOT EXISTS st_diff_workday_user_m  (
OWN_CORP_STD_ORG_CODE  string,
OWN_CORP_STD_ORG_NAME  string,
WORKDAY_TYPE           string,
VISIT_COUNT            int,
VISIT_USER_COUNT       int,
ETL_DATE               string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_workday_user_m';

--ST不同时段不同网站类型用户
CREATE TABLE IF NOT EXISTS st_diff_time_urltype_user_m  (
OWN_CORP_STD_ORG_CODE   string,
OWN_CORP_STD_ORG_NAME   string,
STD_TIMES_CODE          string,
STD_TIMES_NAME          string,
URL_TYPE                string,
VISIT_COUNT             int,
VISIT_USER_COUNT        int,
ETL_DATE                string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_time_urltype_user_m';

--ST不同套餐访问用户
CREATE TABLE IF NOT EXISTS st_diff_offer_user_m  (
OWN_CORP_STD_ORG_CODE   string,
OWN_CORP_STD_ORG_NAME   string,
STD_OFFER_CODE          string,
STD_OFFER_NAME          string,
VISIT_COUNT             int,
VISIT_USER_COUNT        int,
ETL_DATE                string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_offer_user_m';

--ST不同套餐不同网站类型用户
CREATE TABLE IF NOT EXISTS st_diff_offer_urltype_user_m  (
OWN_CORP_STD_ORG_CODE    string,
OWN_CORP_STD_ORG_NAME    string,
STD_OFFER_CODE           string,
STD_OFFER_NAME           string,
URL_TYPE                 string,
VISIT_COUNT              int,
VISIT_USER_COUNT         int,
ETL_DATE                 string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_offer_urltype_user_m';

--ST不同设备访问用户
CREATE TABLE IF NOT EXISTS st_diff_device_user_m  (
OWN_CORP_STD_ORG_CODE     string,
OWN_CORP_STD_ORG_NAME     string,
STD_DEVICE_CATE_CODE      string,
STD_DEVICE_CATE_NAME      string,
VISIT_COUNT               int,
VISIT_USER_COUNT          int,
ETL_DATE                  string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_device_user_m';

--ST不同网站不同设备访问用户
CREATE TABLE IF NOT EXISTS st_diff_url_diff_device_user_m  (
OWN_CORP_STD_ORG_CODE    string,
OWN_CORP_STD_ORG_NAME    string,
STD_DEVICE_CATE_CODE     string,
STD_DEVICE_CATE_NAME     string,
URL                      string,
VISIT_USER_COUNT         int,
ETL_DATE                 string
)PARTITIONED BY (PT_MON STRING)
row format delimited fields terminated by '|'
stored as textfile
location '/asiainfo/hive/ST/st_diff_url_diff_device_user_m';



--ST_DNS响应失败情况分析(月)
CREATE TABLE IF NOT EXISTS ST_DNS_RESPONSE_FAILURE_M  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   ANSWER_CODE          STRING,
   ANSWER_NAME          STRING,
   RESPONSE_COUNT       INT,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_dns_response_failure_m';



--ST_DNS响应总体情况分析(月)
CREATE TABLE IF NOT EXISTS ST_DNS_RESPONSE_M  (
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   INTRANET_SUCCESS_COUNT STRING,
   EXTRANET_SUCCESS_COUNT STRING,
   TOTAL_COUNT          INT,
   SUCCESS_RATE         DOUBLE,
   EXTRANET_COUNT       INT,
   EXTRANET_RATE        DOUBLE,
   ETL_DATE             STRING
)PARTITIONED BY (PT_MON STRING)
STORED AS RCFILE
LOCATION '/asiainfo/hive/ST/st_dns_response_m';


-- ST DNS域名请求统计(月)
CREATE TABLE ST_DNS_DOMAIN_REQUEST_M  (
   CYCLE_ID             STRING,
   DOMAIN_URL           STRING,
   DOMAIN_NAME          STRING,
   TOTAL_REQUEST_COUNT   int,
   REQUEST_RN            INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_dns_domain_request_m'


-- ST DNS域名响应统计(月)
CREATE TABLE ST_DNS_DOMAIN_RESPONSE_M  (
   CYCLE_ID             STRING,
   DOMAIN_URL           STRING,
   DOMAIN_NAME          STRING,
   TOTAL_RESPONSE_COUNT   int,
   FAILURE_RESPONSE_COUNT int,
   FAILURE_RN            INT,
   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_dns_domain_response_m'


-- ST用户上网行为分析
CREATE TABLE ST_USER_NETWORK_BEH_M  (
   CYCLE_ID             STRING,
   OWN_CORP_STD_ORG_CODE STRING,
   OWN_CORP_STD_ORG_NAME STRING,
   TOTAL_USER_COUNT     STRING,
   BW_10M_USER_COUNT     STRING,
   BW_20M_USER_COUNT     STRING,
   BW_50M_USER_COUNT     STRING,
   BW_OTHERS_USER_COUNT    STRING,
   TOTAL_NET_FLOW       STRING,
   SBZ_NOT_YMZ_COUNT    STRING,
   YMZ_NOT_SBZ_COUNT    STRING,
   YMZ_AND_SBZ_COUNT    STRING,
   OTHERS_COUNT         STRING,
   WEEKDAY_NET_NUM      STRING,
   WEEKDAY_NET_FLOW     STRING,
   WEEKEND_NET_NUM      STRING,
   WEEKEND_NET_FLOW     STRING,
   WEEKDAY_LC_NET_NUM   STRING,
   WEEKDAY_LC_NET_FLOW  STRING,
   WEEKDAY_ZS_NET_NUM   STRING,
   WEEKDAY_ZS_NET_FLOW  STRING,
   WEEKDAY_SW_NET_NUM   STRING,
   WEEKDAY_SW_NET_FLOW  STRING,
   WEEKDAY_ZW_NET_NUM   STRING,
   WEEKDAY_ZW_NET_FLOW  STRING,
   WEEKDAY_XW_NET_NUM   STRING,
   WEEKDAY_XW_NET_FLOW  STRING,
   WEEKDAY_BW_NET_NUM   STRING,
   WEEKDAY_BW_NET_FLOW  STRING,
   WEEKDAY_WS_NET_NUM   STRING,
   WEEKDAY_WS_NET_FLOW  STRING,
   WEEKDAY_WY_NET_NUM   STRING,
   WEEKDAY_WY_NET_FLOW  STRING,
   WEEKEND_LC_NET_NUM   STRING,
   WEEKEND_LC_NET_FLOW  STRING,
   WEEKEND_ZS_NET_NUM   STRING,
   WEEKEND_ZS_NET_FLOW  STRING,
   WEEKEND_SW_NET_NUM   STRING,
   WEEKEND_SW_NET_FLOW  STRING,
   WEEKEND_ZW_NET_NUM   STRING,
   WEEKEND_ZW_NET_FLOW  STRING,
   WEEKEND_XW_NET_NUM   STRING,
   WEEKEND_XW_NET_FLOW  STRING,
   WEEKEND_BW_NET_NUM   STRING,
   WEEKEND_BW_NET_FLOW  STRING,
   WEEKEND_WS_NET_NUM   STRING,
   WEEKEND_WS_NET_FLOW  STRING,
   WEEKEND_WY_NET_NUM   STRING,
   WEEKEND_WY_NET_FLOW  STRING,
   PC_NET_TOTAL_TIME    STRING,
   PC_NET_TOTAL_NUM     STRING,
   MOBILE_NET_TOTAL_TIME STRING,
   MOBILE_NET_TOTAL_NUM STRING,
   DOMAIN_NAME_1        STRING,
   DOMAIN_TYPE_1        STRING,
   DOMAIN_NAME_NUM_1    STRING,
   DOMAIN_NAME_2        STRING,
   DOMAIN_TYPE_2        STRING,
   DOMAIN_NAME_NUM_2    STRING,
   DOMAIN_NAME_3        STRING,
   DOMAIN_TYPE_3        STRING,   
   DOMAIN_NAME_NUM_3    STRING,
   DOMAIN_NAME_4        STRING,
   DOMAIN_TYPE_4        STRING,
   DOMAIN_NAME_NUM_4    STRING,
   DOMAIN_NAME_5        STRING,
   DOMAIN_TYPE_5        STRING,
   DOMAIN_NAME_NUM_5    STRING,
   DOMAIN_NAME_6        STRING,
   DOMAIN_TYPE_6        STRING,
   DOMAIN_NAME_NUM_6    STRING,
   DOMAIN_NAME_7        STRING,
   DOMAIN_TYPE_7        STRING,
   DOMAIN_NAME_NUM_7    STRING,
   DOMAIN_NAME_8        STRING,
   DOMAIN_TYPE_8        STRING,
   DOMAIN_NAME_NUM_8    STRING,
   DOMAIN_NAME_9        STRING,
   DOMAIN_TYPE_9        STRING,
   DOMAIN_NAME_NUM_9    STRING,
   DOMAIN_NAME_10        STRING,
   DOMAIN_TYPE_10        STRING,
   DOMAIN_NAME_NUM_10    STRING,

   WEBSITE_TYPE_1       STRING,
   WEBSITE_TYPE_NUM_1   STRING,
   WEBSITE_TYPE_2       STRING,
   WEBSITE_TYPE_NUM_2   STRING,
   WEBSITE_TYPE_3       STRING,
   WEBSITE_TYPE_NUM_3   STRING,
   WEBSITE_TYPE_4       STRING,
   WEBSITE_TYPE_NUM_4   STRING,
   WEBSITE_TYPE_5       STRING,
   WEBSITE_TYPE_NUM_5   STRING,

   WEBSITE_TYPE_6       STRING,
   WEBSITE_TYPE_NUM_6   STRING,
   WEBSITE_TYPE_7       STRING,
   WEBSITE_TYPE_NUM_7   STRING,
   WEBSITE_TYPE_8       STRING,
   WEBSITE_TYPE_NUM_8   STRING,
   WEBSITE_TYPE_9       STRING,
   WEBSITE_TYPE_NUM_9   STRING,
   WEBSITE_TYPE_10       STRING,
   WEBSITE_TYPE_NUM_10   STRING,

   ETL_DATE             STRING
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_user_network_beh_m'


-- ST用户月发展统计(新)
CREATE TABLE ST_NEW_USER_DEV_M(
  cycle_id char(6), 
  own_corp_std_org_code varchar(6), 
  own_corp_std_org_name varchar(32), 
  cust_type      DECIMAL(2,0),
  cust_type_name VARCHAR(20),
  dtv_user_count decimal(16,0), 
  dtv_paid_user_count decimal(16,0), 
  lan_user_count decimal(16,0), 
  lan_paid_user_count decimal(16,0), 
  new_dtv_user_count decimal(16,0), 
  new_lan_user_count decimal(16,0), 
  lose_dtv_user_count decimal(16,0), 
  lose_lan_user_count decimal(16,0), 
  etl_date timestamp)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_new_user_dev_m'


-- ST客户月发展统计
CREATE TABLE ST_CUST_DEV_M(
  cycle_id char(6), 
  own_corp_std_org_code varchar(6), 
  own_corp_std_org_name varchar(32), 
  cust_type      DECIMAL(2,0),
  cust_type_name VARCHAR(20),
  total_valid_cust_count decimal(16,0), 
  total_paid_cust_count decimal(16,0), 
  conv_valid_cust_count decimal(16,0), 
  conv_valid_user_count DECIMAL(16,0),
  conv_paid_cust_count decimal(16,0), 
  conv_paid_user_count decimal(16,0), 
  olan_valid_cust_count decimal(16,0), 
  olan_valid_user_count decimal(16,0), 
  olan_paid_cust_count decimal(16,0), 
  olan_paid_user_count decimal(16,0), 
  new_conv_cust_count decimal(16,0), 
  new_conv_user_count decimal(16,0), 
  new_olan_cust_count decimal(16,0), 
  new_olan_user_count decimal(16,0), 
  lose_conv_cust_count decimal(16,0), 
  lose_conv_user_count decimal(16,0), 
  lose_olan_cust_count decimal(16,0), 
  lose_olan_user_count decimal(16,0), 
  etl_date timestamp)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_cust_dev_m'


-- ST宽带客户-用户融合比较
CREATE TABLE ST_CONV_LAN_CHECK(
  cycle_id char(6), 
  own_corp_std_org_code varchar(6), 
  own_corp_std_org_name varchar(32), 
  total_valid_cust_count decimal(16,0), 
  conv_valid_cust_count decimal(16,0), 
  olan_valid_cust_count decimal(16,0), 
  total_valid_user_count decimal(16,0), 
  dtv_valid_user_count   decimal(16,0), 
  lan_valid_user_count   DECIMAL(16,0),
  conv_lan_user_count decimal(16,0), 
  olan_user_count decimal(16,0), 
  etl_date timestamp)
PARTITIONED BY ( 
  pt_mon char(6))
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_conv_lan_check'


-- ST网格用户发展统计
CREATE TABLE ST_GRID_USER_DEV_M  (
   CYCLE_ID             CHAR(6) ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type            DECIMAL(2,0),
   cust_type_name        VARCHAR(20),
   GRID_ID              VARCHAR(20),
   GRID_NAME            VARCHAR(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR(100),
   AREA_STD_ADDR_ID     VARCHAR(30),
   AREA_STD_ADDR_NAME   VARCHAR(255),
   DTV_VALID_USER_CNT   DECIMAL(16),
   DTV_PAID_USER_CNT    DECIMAL(16),
   NEW_DTV_USER_CNT     DECIMAL(16),
   LOSE_DTV_USER_CNT    DECIMAL(16),
   LAN_VALID_USER_CNT   DECIMAL(16),
   LAN_PAID_USER_CNT    DECIMAL(16),
   NEW_LAN_USER_CNT     DECIMAL(16),
   LOSE_LAN_USER_CNT    DECIMAL(16),
   DFTV_VALID_USER_CNT  DECIMAL(16),
   DFTV_PAID_USER_CNT   DECIMAL(16),
   NEW_DFTV_USER_CNT    DECIMAL(16),
   LOSE_DFTV_USER_CNT   DECIMAL(16),
   DBITV_VALID_USER_CNT DECIMAL(16),
   DBITV_PAID_USER_CNT  DECIMAL(16),
   NEW_DBITV_USER_CNT   DECIMAL(16),
   LOSE_DBITV_USER_CNT  DECIMAL(16),
   DITV_VALID_USER_CNT  DECIMAL(16),
   DITV_PAID_USER_CNT   DECIMAL(16),
   NEW_DITV_USER_CNT    DECIMAL(16),
   LOSE_DITV_USER_CNT   DECIMAL(16),
   AMSP_VALID_USER_CNT  DECIMAL(16),
   AMSP_PAID_USER_CNT   DECIMAL(16),
   NEW_AMSP_USER_CNT    DECIMAL(16),
   LOSE_AMSP_USER_CNT   DECIMAL(16),
   CM_VALID_USER_CNT    DECIMAL(16),
   CM_PAID_USER_CNT     DECIMAL(16),
   NEW_CM_USER_CNT      DECIMAL(16),
   LOSE_CM_USER_CNT     DECIMAL(16),
   HDTV_VALID_USER_CNT  DECIMAL(16),
   HDTV_PAID_USER_CNT   DECIMAL(16),
   NEW_HDTV_USER_CNT    DECIMAL(16),
   LOSE_HDTV_USER_CNT   DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_grid_user_dev_m'
;


-- ST网格客户发展统计
CREATE TABLE ST_GRID_CUST_DEV_M  (
   CYCLE_ID             CHAR(6) ,
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type            DECIMAL(2,0),
   cust_type_name       VARCHAR(20),
   GRID_ID              VARCHAR(20),
   GRID_NAME            VARCHAR(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR(100),
   AREA_STD_ADDR_ID     VARCHAR(30),
   AREA_STD_ADDR_NAME   VARCHAR(255),
   VALID_CUST_CNT       DECIMAL(16),
   PAID_CUST_CNT        DECIMAL(16),
   CONV_VALID_CUST_CNT       DECIMAL(16),
   CONV_VALID_USER_CNT       DECIMAL(16),
   CONV_PAID_CUST_CNT       DECIMAL(16),
   CONV_PAID_USER_CNT       DECIMAL(16),
   OLAN_VALID_CUST_CNT        DECIMAL(16),
   OLAN_VALID_USER_CNT        DECIMAL(16),
   OLAN_PAID_CUST_CNT        DECIMAL(16),
   OLAN_PAID_USER_CNT        DECIMAL(16),
   NEW_CONV_CUST_CNT       DECIMAL(16),
   NEW_CONV_USER_CNT       DECIMAL(16),
   NEW_OLAN_CUST_CNT        DECIMAL(16),
   NEW_OLAN_USER_CNT        DECIMAL(16),
   LOSE_CONV_CUST_CNT       DECIMAL(16),
   LOSE_CONV_USER_CNT       DECIMAL(16),
   LOSE_OLAN_CUST_CNT        DECIMAL(16),
   LOSE_OLAN_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_grid_cust_dev_m'
;


-- ST网格用户发展宽带产品订购统计
CREATE TABLE ST_GRID_USER_PRODUCT_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR(20),
   GRID_NAME            VARCHAR(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR(100),
   AREA_STD_ADDR_ID     VARCHAR(30),
   AREA_STD_ADDR_NAME   VARCHAR(255),
   PRODUCT_ID           DECIMAL(16),
   PRODUCT_NAME         VARCHAR(100),
   PROD_SERVICE_ID      DECIMAL(12),
   BANDWIDTH            DECIMAL(16),
   CYCLE                DECIMAL(16),
   ARPU                 DECIMAL(16, 2),
   BILLING_TYPE         DECIMAL(1),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_grid_user_product_m'
;



-- ST网格用户发展带宽统计
CREATE TABLE ST_GRID_USER_BANDWIDTH_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR(20),
   GRID_NAME            VARCHAR(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR(100),
   AREA_STD_ADDR_ID     VARCHAR(30),
   AREA_STD_ADDR_NAME   VARCHAR(255),
   BANDWIDTH            DECIMAL(16),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_grid_user_bandwidth_m'
;



-- ST网格用户发展产品计费类型统计
CREATE TABLE ST_GRID_USER_PRODUCT_BT_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR(20),
   GRID_NAME            VARCHAR(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR(100),
   AREA_STD_ADDR_ID     VARCHAR(30),
   AREA_STD_ADDR_NAME   VARCHAR(255),
   BILLING_TYPE         DECIMAL(1),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_grid_user_product_bt_m'
;


-- ST宽带产品订购统计
CREATE TABLE ST_LAN_PRODUCT_ORDER_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR(20),
   OWN_CORP_STD_ORG_NAME VARCHAR(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   PRODUCT_ID           DECIMAL(16),
   PRODUCT_NAME         VARCHAR(100),
   BANDWIDTH            DECIMAL(16),
   CYCLE                DECIMAL(16),
   ARPU                 DECIMAL(16, 2),
   BILLING_TYPE         DECIMAL(1),
   ORDER_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP
)
PARTITIONED BY ( 
  pt_mon string)
STORED AS orcfile
LOCATION
  'hdfs://nameservice1/asiainfo/hive/ST/st_lan_product_order_m'
;


--ST不同节目类型点播统计
CREATE TABLE IF NOT EXISTS ST_DR_MOVIE_TYPE_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   category                VARCHAR(50),
   dr_USER_COUNT         DECIMAL(16,0),
   dr_count                      DECIMAL(16,0),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_dr_movie_type_summary';

--ST不同节目出品地点播统计
CREATE TABLE IF NOT EXISTS ST_DR_MOVIE_PRODUCED_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   produced                VARCHAR(50),
   dr_USER_COUNT         DECIMAL(16,0),
   dr_count                      DECIMAL(16,0),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_dr_movie_produced_summary';



--ST回看频道分析
CREATE TABLE IF NOT EXISTS ST_LB_CHANNEL_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   channel_id              VARCHAR(20),
   channel_name          VARCHAR(50),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_lb_channel_summary';


--ST各时段各频道组直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_CHANNELGROUP_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_diff_time_channelgroup_view_d';

--ST各时段各频道直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_DURATION_CHANNEL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   std_channel_name   VARCHAR(100),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_diff_duration_channel_view_d';


-- 
-- ST全流量协议分析汇总
CREATE TABLE IF NOT EXISTS ST_TBL_TRAFFIC_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   create_time            TIMESTAMP,
   content_code          VARCHAR(20),
   content_NAME       VARCHAR(200),
   std_content_type     VARCHAR(100),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   total_gbs               DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_TIME STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tbl_traffic_summary';


-- ST AS域流量统计
CREATE TABLE IF NOT EXISTS ST_AS_SUM_REPORT   (
   CYCLE_ID              VARCHAR(8),
   nodeid                  VARCHAR(11),
   AS_TYPE               VARCHAR(20),
   std_area_code       VARCHAR(7),
   std_area_name       VARCHAR(100),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_TIME STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_as_sum_report';


-- ST 总体域名流量排名
CREATE TABLE IF NOT EXISTS ST_DNAME_TOPN   (
   CYCLE_ID              VARCHAR(8),
   nodeid                  VARCHAR(11),
   DNAME                VARCHAR(200),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   total_gbs                 DECIMAL(16,2),
   ETL_DATE              timestamp
)
PARTITIONED BY (PT_TIME STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_dname_topn';

--ST各时段各节目直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_DURATION_PROGRAM_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   std_channel_name   VARCHAR(100),
   program_name   VARCHAR(500),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
  pro_begin_time VARCHAR(6),
  pro_end_time   VARCHAR(6),
  program_type   VARCHAR(20),
  broad_type      VARCHAR(10),
  program_num    INT,
   pro_begin_minute_code INT ,
   pro_end_minute_code INT 
)
PARTITIONED BY (PT_MON STRING)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_diff_duration_program_view_d';


--ST直播各分钟各节目收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_PROGRAM_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   PROGRAM_NAME   VARCHAR(500),
   PRO_BEGIN_TIME          VARCHAR(20),
   PRO_END_TIME             VARCHAR(20),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   tv_time                   DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              TIMESTAMP
)
PARTITIONED BY (PT_MON string)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_tv_diff_min_program_view_d';


-- ST用户画像按分公司统计(月)
CREATE TABLE st_cust_feat_dtl_m (
  CYCLE_ID varchar(8),
  OWN_CORP_STD_ORG_CODE varchar(20),
  OWN_CORP_STD_ORG_NAME varchar(200),
  DTV_USER_COUNT decimal(16,0) ,
  DBITV_USER_COUNT decimal(16,0) ,
  DITV_USER_COUNT decimal(16,0) ,
  DFTV_USER_COUNT decimal(16,0) ,
  LAN_USER_COUNT decimal(16,0) ,
  HDTV_USER_COUNT decimal(16,0) ,
  AMSP_USER_COUNT decimal(16,0) ,
  CLOUD_MEDIA_USER_COUNT decimal(16,0) ,
  MALE_COUNT decimal(16,0) ,
  FEMALE_COUNT decimal(16,0) ,
  GENERATION_BEFORE_70S decimal(16,0) ,
  GENERATION_BETWEEN_70S_AND_90S decimal(16,0) ,
  GENERATION_BETWEEN_90S_AND_10S decimal(16,0) ,
  GENERATION_AFTER_10S decimal(16,0) ,
  FAMILY_CHILD_COUNT decimal(16,0) ,
  FAMILY_OLD_COUNT decimal(16,0) ,
  FAMILY_CHILD_FAMILT_OLD_COUNT decimal(16,0) ,
  NFAMILY_CHILD_FAMILT_OLD_COUNT decimal(16,0) ,
  CITY_COUNT decimal(16,0) ,
  SUBURB_COUNT decimal(16,0) ,
  CONVERGE_USER_COUNT decimal(16,0) ,
  ONLY_LAN_USER_COUNT decimal(16,0) ,
  TV_USER_COUNT decimal(16,0) ,
  NET_1_YEAR_USER_COUNT decimal(16,0) ,
  NET_1_TO_3_YEAR_USER_COUNT decimal(16,0) ,
  NET_3_TO_5_YEAR_USER_COUNT decimal(16,0) ,
  NET_GRANTER_5_YEAR_USER_COUNT decimal(16,0) ,
  DEV_1_YEAR_USER_COUNT decimal(16,0) ,
  dev_1_to_3_year_user_count decimal(16,0) ,
  DEV_3_TO_5_YEAR_USER_COUNT decimal(16,0) ,
  DEV_GRANTER_5_YEAR_USER_COUNT decimal(16,0) ,
  INFREQUENT_CHANGE_USER_COUNT decimal(16,0) ,
  CHANGE_ONE_TIME_USER_COUNT decimal(16,0) ,
  FREQUENT_CHANGE_USER_COUNT decimal(16,0) ,
  CONSUM_OVER_101_USER_COUNT decimal(16,0) ,
  CONSUM_51_TO_100_USER_COUNT decimal(16,0) ,
  CONSUM_21_TO_50_USER_COUNT decimal(16,0) ,
  CONSUM_LESS_20_USER_COUNT decimal(16,0) ,
  VOD_OVER_21_USER_COUNT decimal(16,0) ,
  VOD_11_TO_20_USER_COUNT decimal(16,0) ,
  VOD_6_TO_10_USER_COUNT decimal(16,0) ,
  VOD_LESS_5_USER_COUNT decimal(16,0) ,
  ACTIVE_USER_COUNT decimal(16,0) ,
  INACTIVE_USER_COUNT decimal(16,0) ,
  PAYMENT_CAHNNEL_TOP_FIVE varchar(200),
  TOP5_PAYMENT_CHANNEL_COUNT decimal(16,0),
  PAYMENT_CAHNNEL_TOP_FOUR varchar(200),
  TOP4_PAYMENT_CHANNEL_COUNT decimal(16,0),
  PAYMENT_CAHNNEL_TOP_THREE varchar(200),
  TOP3_PAYMENT_CHANNEL_COUNT decimal(16,0),
  PAYMENT_CAHNNEL_TOP_TWO varchar(200),
  TOP2_PAYMENT_CHANNEL_COUNT decimal(16,0) ,
  PAYMENT_CAHNNEL_TOP_ONE varchar(200),
  TOP1_PAYMENT_CHANNEL_COUNT decimal(16,0) ,
  PAYMENT_HABIT_TOP_THREE varchar(200),
  TOP3_PAYMENT_HABIT_COUNT decimal(16,0) ,
  PAYMENT_HABIT_TOP_TWO varchar(200),
  TOP2_PAYMENT_HABIT_COUNT decimal(16,0) ,
  PAYMENT_HABIT_TOP_ONE varchar(200),
  TOP1_PAYMENT_HABIT_COUNT decimal(16,0) ,
  DEBT_STOP_SEN_LEV_ZERO decimal(16,0) ,
  DEBT_STOP_SEN_LEV_ONE_WEEK decimal(16,0) ,
  DEBT_STOP_SEN_LEV_TWO_WEEKS decimal(16,0) ,
  DEBT_STOP_SEN_LEV_ONE_MONTH decimal(16,0) ,
  DEBT_STOP_SEN_LEV_OVER decimal(16,0) ,
  USER_COUNT_TOTAL decimal(16,0) ,
  CUST_COUNT_TOTAL decimal(16,0) ,
  ETL_DATE timestamp
)
PARTITIONED BY (PT_MON string)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_cust_feat_dtl_m';


-- ST用户画像账户按分公司统计(月)
CREATE TABLE st_zg_acct (
  CYCLE_ID varchar(8),
  OWN_CORP_STD_ORG_CODE varchar(20),
  OWN_CORP_STD_ORG_NAME varchar(200),
  PAYMENT_MONTH_COUNT decimal(16,0) ,
  PAYMENT_SIX_MONTH_COUNT decimal(16,0) ,
  PAYMENT_YEAR_COUNT decimal(16,0) ,
  PAYMENT_COUNT decimal(16,0) ,
  NO_CREDIT_AMOUNT_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_0_200_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_201_300_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_301_500_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_501_1000_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_1001_2000_COUNT decimal(16,0) ,
  CREDIT_AMOUNT_2001_COUNT decimal(16,0) ,
  LESS_ONE_MONTH_COUNT decimal(16,0) ,
  ONE_TO_SIX_MONTH_COUNT decimal(16,0) ,
  SIX_TO_TWELVE_MONTH_COUNT decimal(16,0) ,
  GRANTER_TWELVE_MONTH_COUNT decimal(16,0) ,
  SZ_UNPAY_AMOUNT_TOTAL decimal(18,2),
  SZ_UNPAY_AMOUNT_COUNT decimal(16,0) ,
  HD_UNPAY_AMOUNT_TOTAL decimal(18,2),
  HD_UNPAY_AMOUNT_COUNT decimal(16,0) ,
  KD_UNPAY_AMOUNT_TOTAL decimal(18,2),
  KD_UNPAY_AMOUNT_COUNT decimal(16,0) ,
  ZZ_UNPAY_AMOUNT_TOTAL decimal(18,2),
  ZZ_UNPAY_AMOUNT_COUNT decimal(16,0) ,
  UNPAY_AMOUNT_TOTAL decimal(18,2),
  UNPAY_TOTAL_COUNT decimal(16,0) ,
  ETL_DATE timestamp
) 
PARTITIONED BY (PT_MON string)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_zg_acct';


-- 2.4.8.3	ST用户画像上网行为分析 (月)
CREATE TABLE st_user_network_beh_m (
  CYCLE_ID varchar(6),
  OWN_CORP_STD_ORG_CODE varchar(10),
  OWN_CORP_STD_ORG_NAME varchar(20),
  TOTAL_USER_COUNT decimal(16,0),
  BW_10M_USER_COUNT decimal(16,0),
  BW_20M_USER_COUNT decimal(16,0),
  BW_50M_USER_COUNT decimal(16,0),
  BW_OTHERS_USER_COUNT decimal(16,0),
  TOTAL_NET_FLOW decimal(16,2),
  SBZ_NOT_YMZ_COUNT decimal(16,0),
  YMZ_NOT_SBZ_COUNT decimal(16,0),
  YMZ_AND_SBZ_COUNT decimal(16,0),
  OTHERS_COUNT decimal(16,0),
  WEEKDAY_NET_NUM decimal(16,0),
  WEEKDAY_NET_FLOW decimal(16,2),
  WEEKEND_NET_NUM decimal(16,0),
  WEEKEND_NET_FLOW decimal(16,2),
  WEEKDAY_LC_NET_NUM decimal(16,0),
  WEEKDAY_LC_NET_FLOW decimal(16,2),
  WEEKDAY_ZS_NET_NUM decimal(16,0),
  WEEKDAY_ZS_NET_FLOW decimal(16,2),
  WEEKDAY_SW_NET_NUM decimal(16,0),
  WEEKDAY_SW_NET_FLOW decimal(16,2),
  WEEKDAY_ZW_NET_NUM decimal(16,0),
  WEEKDAY_ZW_NET_FLOW decimal(16,2),
  WEEKDAY_XW_NET_NUM decimal(16,0),
  WEEKDAY_XW_NET_FLOW decimal(16,2),
  WEEKDAY_BW_NET_NUM decimal(16,0),
  WEEKDAY_BW_NET_FLOW decimal(16,2),
  WEEKDAY_WS_NET_NUM decimal(16,0),
  WEEKDAY_WS_NET_FLOW decimal(16,2),
  WEEKDAY_WY_NET_NUM decimal(16,0),
  WEEKDAY_WY_NET_FLOW decimal(16,2),
  WEEKEND_LC_NET_NUM decimal(16,0),
  WEEKEND_LC_NET_FLOW decimal(16,2),
  WEEKEND_ZS_NET_NUM decimal(16,0),
  WEEKEND_ZS_NET_FLOW decimal(16,2),
  WEEKEND_SW_NET_NUM decimal(16,0),
  WEEKEND_SW_NET_FLOW decimal(16,2),
  WEEKEND_ZW_NET_NUM decimal(16,0),
  WEEKEND_ZW_NET_FLOW decimal(16,2),
  WEEKEND_XW_NET_NUM decimal(16,0),
  WEEKEND_XW_NET_FLOW decimal(16,2),
  WEEKEND_BW_NET_NUM decimal(16,0),
  WEEKEND_BW_NET_FLOW decimal(16,2),
  WEEKEND_WS_NET_NUM decimal(16,0),
  WEEKEND_WS_NET_FLOW decimal(16,2),
  WEEKEND_WY_NET_NUM decimal(16,0),
  WEEKEND_WY_NET_FLOW decimal(16,2),
  PC_NET_TOTAL_TIME decimal(16,0),
  PC_NET_TOTAL_NUM decimal(16,0),
  MOBILE_NET_TOTAL_TIME decimal(16,0),
  MOBILE_NET_TOTAL_NUM decimal(16,0),
  DOMAIN_NAME_1 varchar(200),
  DOMAIN_TYPE_1 varchar(100),
  DOMAIN_NAME_NUM_1 decimal(16,0),
  DOMAIN_NAME_2 varchar(200),
  DOMAIN_TYPE_2 varchar(200),
  DOMAIN_NAME_NUM_2 decimal(16,0),
  DOMAIN_NAME_3 varchar(200),
  DOMAIN_TYPE_3 varchar(200),
  DOMAIN_NAME_NUM_3 decimal(16,0),
  DOMAIN_NAME_4 varchar(200),
  DOMAIN_TYPE_4 varchar(200),
  DOMAIN_NAME_NUM_4 decimal(16,0),
  DOMAIN_NAME_5 varchar(200),
  DOMAIN_TYPE_5 varchar(200),
  DOMAIN_NAME_NUM_5 decimal(16,0),
  DOMAIN_NAME_6 varchar(200),
  DOMAIN_TYPE_6 varchar(200),
  DOMAIN_NAME_NUM_6 decimal(16,0),
  DOMAIN_NAME_7 varchar(200),
  DOMAIN_TYPE_7 varchar(200),
  DOMAIN_NAME_NUM_7 decimal(16,0),
  DOMAIN_NAME_8 varchar(200),
  DOMAIN_TYPE_8 varchar(200),
  DOMAIN_NAME_NUM_8 decimal(16,0),
  DOMAIN_NAME_9 varchar(200),
  DOMAIN_TYPE_9 varchar(200),
  DOMAIN_NAME_NUM_9 decimal(16,0),
  DOMAIN_NAME_10 varchar(200),
  DOMAIN_TYPE_10 varchar(200),
  DOMAIN_NAME_NUM_10 decimal(16,0),
  WEBSITE_TYPE_1 varchar(200),
  WEBSITE_TYPE_NUM_1 decimal(16,0),
  WEBSITE_TYPE_2 varchar(200),
  WEBSITE_TYPE_NUM_2 decimal(16,0),
  WEBSITE_TYPE_3 varchar(200),
  WEBSITE_TYPE_NUM_3 decimal(16,0),
  WEBSITE_TYPE_4 varchar(200),
  WEBSITE_TYPE_NUM_4 decimal(16,0),
  WEBSITE_TYPE_5 varchar(200),
  WEBSITE_TYPE_NUM_5 decimal(16,0),
  WEBSITE_TYPE_6 varchar(200),
  WEBSITE_TYPE_NUM_6 decimal(16,0),
  WEBSITE_TYPE_7 varchar(200),
  WEBSITE_TYPE_NUM_7 decimal(16,0),
  WEBSITE_TYPE_8 varchar(200),
  WEBSITE_TYPE_NUM_8 decimal(16,0),
  WEBSITE_TYPE_9 varchar(200),
  WEBSITE_TYPE_NUM_9 decimal(16,0),
  WEBSITE_TYPE_10 varchar(200),
  WEBSITE_TYPE_NUM_10 decimal(16,0),
  ETL_DATE TIMESTAMP 
)
PARTITIONED BY (PT_MON string)
STORED AS ORCFILE
LOCATION '/asiainfo/hive/ST/st_user_network_beh_m';

```







#### 第七章 数据上传H2O





#### 第八章 可视化大屏

###### 8.1 可视化大屏信息

```
地址:http://111.208.67.19/#/home 
账号:admin
密码:!Aa123qaz
密码2：Abc123
```

###### 8.2 江苏省广电宽带用户分布地图

```
--  --   地图颜色深度数据 有效用户数
select   t.area area,                   -- 地市名称
         valid_user_cnt  userCnt       -- 有效用户数
 from LAN_USER_STATS_RATES t 
 left join dim_std_organize o
     on t.std_org_code = o.std_org_code
 left join dim_std_organize p 
     on o.p_std_org_code = p.std_org_code
 where t.stats_dt = '2018-12'
   and (case when p.std_org_code = '10' then '全省' 
       else trim(trailing '地区' from p.std_org_name) end)  = '全省'
order by valid_user_cnt DESC ;
```

###### 8.3 ARPU值分析

```
--   arpu值分析
 select t.lan_arpu LanArpu,  --  单宽带arpu
        t.com_arpu ComArpu   --  综合arpu
 from  dp_lan_arpu t
 where t.area = '全省'
 and stats_dt = '2018-12' ;
```

###### 8.4 总流量、万户带宽及在线率

```
SELECT t.flows,                 --  总流量
       T.flows_per_users whdk,  --  万户带宽
       coalesce(O.online_rate,ot.online_rate,0) onlineRate  --  在线率
  FROM kpi_flow_stats T
 LEFT JOIN dp_user_onlinerate o
 ON T.stats_dt = o.stats_dt
 and t.std_org_code = o.std_org_code
 left join tmp_online_rate ot
 on t.stats_dt = ot.stats_dt
 and t.std_org_code = ot.std_org_code
 WHERE T.STATS_DT = '2018-12'
   AND T.AREA = '全省'      ;    --  '全省' 或 十三个地市名称
```



#### 第九章 Mysql数据库

###### DDL建表语句

```
/*==============================================================*/
/* Table: ST_AUTH_FAILURE_REASON_M                              */
/*==============================================================*/
CREATE TABLE ST_AUTH_FAILURE_REASON_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_FAILURE_REASON_CODE VARCHAR2(20),
   STD_FAILURE_REASON_NAME VARCHAR2(200),
   AUTH_FAILURE_COUNT   NUMBER(12),
   AUTH_FAILURE_RATE    NUMBER(8,2),
   AUTH_FAILURE_USER_COUNT NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);

/*==============================================================*/
/* Table: ST_AUTH_M                                             */
/*==============================================================*/
CREATE TABLE ST_AUTH_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   AUTH_COUNT           NUMBER(12),
   AUTH_SUCCESS_COUNT   NUMBER(12),
   AUTH_SUCCESS_RATE    NUMBER(8,2),
   AUTH_FAILURE_COUNT   NUMBER(12),
   AUTH_FAILURE_RATE    NUMBER(8,2),
   AUTH_USER_COUNT      NUMBER(12),
   ONLINE_USER_COUNT    NUMBER(12),
   BROWSE_USER_COUNT    NUMBER(12),
   AUTH_RATE            NUMBER(8,2),
   BROWSE_RATE          NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);

/*==============================================================*/
/* Table: ST_AUTH_MODE_M                                        */
/*==============================================================*/
CREATE TABLE ST_AUTH_MODE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_AUTH_MODE_CODE   VARCHAR2(20),
   STD_AUTH_MODE_NAME   VARCHAR2(200),
   AUTH_COUNT           NUMBER(12),
   AUTH_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_BANDWIDTH_LENGTH_USER_M                            */
/*==============================================================*/
CREATE TABLE ST_BANDWIDTH_LENGTH_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_BANDWIDTH_CODE   VARCHAR2(20),
   STD_BANDWIDTH_NAME   VARCHAR2(200),
   STD_ONLINE_LENGTH_CODE VARCHAR2(20),
   STD_ONLINE_LENGTH_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_BCPT_DEPLOYMENT_M                                  */
/*==============================================================*/
CREATE TABLE ST_BCPT_DEPLOYMENT_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   DATA_SOURCE          VARCHAR2(50),
   REGION_NAME          VARCHAR2(200),
   MONITOR_NUM          NUMBER(12),
   MAIN_ID_COUNT        NUMBER(12),
   INCREMENT_ID_COUNT   NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_DIFF_BANDWIDTH_INCOME_M                            */
/*==============================================================*/
/*
CREATE TABLE ST_DIFF_BANDWIDTH_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   STD_BANDWIDTH_CODE   VARCHAR2(20),
   STD_BANDWIDTH_NAME   VARCHAR2(200),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   PAYMENT_USER_COUNT   NUMBER(12),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);
*/
CREATE TABLE ST_DIFF_BANDWIDTH_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_BANDWIDTH_CODE   VARCHAR2(20),
   STD_BANDWIDTH_NAME   VARCHAR2(200),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU NUMBER(8,2),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);



/*==============================================================*/
/* Table: ST_DIFF_CHANNEL_USER_DEV_M                            */
/*==============================================================*/
CREATE TABLE ST_DIFF_CHANNEL_USER_DEV_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   STD_CUST_CHANNEL_CODE VARCHAR2(20),
   STD_CUST_CHANNEL_NAME VARCHAR2(200),
   NEW_USER_COUNT       NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_DIFF_CYCLE_INCOME_M                                */
/*==============================================================*/
/*
CREATE TABLE ST_DIFF_CYCLE_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   STD_PROD_CYCLE_CODE  VARCHAR2(20),
   STD_PROD_CYCLE_NAME  VARCHAR2(200),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   PAYMENT_USER_COUNT   NUMBER(12),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);
*/
CREATE TABLE ST_DIFF_CYCLE_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_PROD_CYCLE_CODE  VARCHAR2(20),
   STD_PROD_CYCLE_NAME  VARCHAR2(200),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU NUMBER(8,2),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_DIFF_DEVICE_CATE_USER_M                            */
/*==============================================================*/
CREATE TABLE ST_DIFF_DEVICE_CATE_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_DEVICE_CATE_CODE VARCHAR2(20),
   STD_DEVICE_CATE_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_DIFF_ONLINE_DAYS_USER_M                            */
/*==============================================================*/
CREATE TABLE ST_DIFF_ONLINE_DAYS_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_ONLINE_DAYS_CODE VARCHAR2(20),
   STD_ONLINE_DAYS_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_DIFF_ONLINE_LENGTH_USER_M                          */
/*==============================================================*/
CREATE TABLE ST_DIFF_ONLINE_LENGTH_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_ONLINE_LENGTH_CODE VARCHAR2(20),
   STD_ONLINE_LENGTH_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_DIFF_ONLINE_MEDIA_USER_M                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_ONLINE_MEDIA_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_ONLINE_MEDIA_CODE VARCHAR2(20),
   STD_ONLINE_MEDIA_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_DIFF_PROD_FAILURE_REASON_M                         */
/*==============================================================*/
CREATE TABLE ST_DIFF_PROD_FAILURE_REASON_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_FAILURE_REASON_CODE VARCHAR2(20),
   STD_FAILURE_REASON_NAME VARCHAR2(200),
   STD_PRODUCT_CODE     VARCHAR2(20),
   STD_PRODUCT_NAME     VARCHAR2(200),
   AUTH_FAILURE_USER_COUNT NUMBER(12),
   AUTH_FAILURE_USER_RATE NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_DIFF_PROD_INCOME_M                                 */
/*==============================================================*/
/*
CREATE TABLE ST_DIFF_PROD_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   STD_UP_PRODUCT_CODE  VARCHAR2(20),
   STD_UP_PRODUCT_NAME  VARCHAR2(100),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_USER_RATE  NUMBER(8,2),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_RATE NUMBER(8,2),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_RATE     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);
*/
CREATE TABLE ST_DIFF_PROD_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_UP_PRODUCT_CODE  VARCHAR2(20),
   STD_UP_PRODUCT_NAME  VARCHAR2(100),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_USER_RATE  NUMBER(8,2),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_RATE NUMBER(8,2),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU NUMBER(8,2),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_RATE     NUMBER(8,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);

/*==============================================================*/
/* Table: ST_DIFF_PROD_USER_DEV_M                               */
/*==============================================================*/
CREATE TABLE ST_DIFF_PROD_USER_DEV_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   STD_UP_PRODUCT_CODE  VARCHAR2(20),
   STD_UP_PRODUCT_NAME  VARCHAR2(100),
   NEW_USER_COUNT       NUMBER(12),
   LOSE_USER_COUNT      NUMBER(12),
   CUM_LOSE_USER_COUNT  NUMBER(12),
   REPAY_USER_COUNT     NUMBER(12),
   CUM_REPAY_USER_COUNT NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);
alter table ST_DIFF_PROD_USER_DEV_M add USER_COUNT NUMBER(12);

/*==============================================================*/
/* Table: ST_DIFF_SHOPPING_USER_M                               */
/*==============================================================*/
CREATE TABLE ST_DIFF_SHOPPING_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_ECOMMERCE_CODE   VARCHAR2(20),
   STD_ECOMMERCE_NAME   VARCHAR2(200),
   STD_SHOPPING_CODE    VARCHAR2(20),
   STD_SHOPPING_NAME    VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);



/*==============================================================*/
/* Table: ST_DIFF_TASK_VIDEO_VIEW_M                             */
/*==============================================================*/
CREATE TABLE ST_DIFF_TASK_VIDEO_VIEW_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   TASK_NAME            VARCHAR2(200),
   BUFFER_TIME          NUMBER(12,2),
   FIRST_BUFFER_TIME    NUMBER(12,2),
   BUFFER_COUNT         NUMBER(12,2),
   DOWNLOAD_SPEED       NUMBER(12,2),
   MONITOR_COUNT        NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);



/*==============================================================*/
/* Table: ST_DIFF_TASK_WEB_BROWSE_M                             */
/*==============================================================*/
CREATE TABLE ST_DIFF_TASK_WEB_BROWSE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   TASK_NAME            VARCHAR2(200),
   PERFORMANCE          NUMBER(12,2),
   FIRST_SCREEN_TIME    NUMBER(12,2),
   DOWNLOAD_TIME        NUMBER(12,2),
   MONITOR_COUNT        NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);



/*==============================================================*/
/* Table: ST_DIFF_TIMES_DEVICE_USER_M                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_TIMES_DEVICE_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_TIMES_CODE       VARCHAR2(20),
   STD_TIMES_NAME       VARCHAR2(200),
   STD_DEVICE_CATE_CODE VARCHAR2(20),
   STD_DEVICE_CATE_NAME VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);



/*==============================================================*/
/* Table: ST_DIFF_TIMES_USER_M                                  */
/*==============================================================*/
CREATE TABLE ST_DIFF_TIMES_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_TIMES_CODE       VARCHAR2(200),
   STD_TIMES_NAME       VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_RATE            NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200)
);



/*==============================================================*/
/* Table: ST_DIFF_TIME_VIEW_D                                   */
/*==============================================================*/

CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE        VARCHAR(10),
   STD_TIMES_NAME        VARCHAR(12),
   VIEW_USER_COUNT       DECIMAL(16),
   TV_USER_COUNT         DECIMAL(16),
   VOD_USER_COUNT        DECIMAL(16),
   REVIEW_USER_COUNT     DECIMAL(16),
   BOOT_RATE             DECIMAL(16,2),
   TV_BOOT_RATE          DECIMAL(16,2),
   VOD_BOOT_RATE         DECIMAL(16,2),
   REVIEW_BOOT_RATE      DECIMAL(16,2), 
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;



/*==============================================================*/
/* Table: ST_DIFF_TIME_WEBSITE_REQUEST_M                        */
/*==============================================================*/
CREATE TABLE ST_DIFF_TIME_WEBSITE_REQUEST_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_TIMES_CODE       VARCHAR2(20),
   STD_TIMES_NAME       VARCHAR2(200),
   STD_WEBSITE_CATE_CODE VARCHAR2(20),
   STD_WEBSITE_CATE_NAME VARCHAR2(200),
   REQUESTS_COUNT       NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_DOMAIN_REQUEST_RESPONSE_M                          */
/*==============================================================*/
CREATE TABLE ST_DOMAIN_REQUEST_RESPONSE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   DOMAIN_NAME          VARCHAR2(255),
   TOTAL_REQUEST_COUNT  NUMBER(12),
   TOTAL_RESPONSE_COUNT NUMBER(12),
   TOTAL_RESPONSE_RATE  NUMBER(8,2),
   FAILURE_RESPONSE_COUNT NUMBER(12),
   FAILURE_RESPONSE_RATE NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_ECOMMERCE_CONSUME_USER_M                           */
/*==============================================================*/
CREATE TABLE ST_ECOMMERCE_CONSUME_USER_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_ECOMMERCE_CODE   VARCHAR2(20),
   STD_ECOMMERCE_NAME   VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_INCOME_M                                           */
/*==============================================================*/
CREATE TABLE ST_INCOME_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   NEW_ORDER_USER_COUNT NUMBER(12),
   NEW_ORDER_AMOUNT     NUMBER(20),
   NEW_ORDER_AMOUNT_CHAIN NUMBER(8,2),
   NEW_ORDER_AMOUNT_EAR NUMBER(8,2),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   BILL_USER_COUNT      NUMBER(12),
   BILL_AMOUNT          NUMBER(20,2),
   BILL_AMOUNT_CHAIN    NUMBER(8,2),
   BILL_AMOUNT_EAR      NUMBER(8,2),
   BILL_AMOUNT_ARPU     NUMBER(8,2),
   LAN_PARTNER_AMOUNT   NUMBER(20),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_MAN_ACCESS_M                                       */
/*==============================================================*/
CREATE TABLE ST_MAN_ACCESS_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   HEAD_DEVICE_COUNT    NUMBER(12),
   REGION_DISTRIBUT     VARCHAR2(200),
   AREA_DISTRIBUT       VARCHAR2(200),
   DEVICE_MODEL         VARCHAR2(200),
   AGE                  NUMBER(12),
   AVAILABLE_MAX_BANDWIDTH NUMBER(12),
   ACCESS_TERMINAL_COUNT NUMBER(12),
   ACCESS_BANDWIDTH     NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_MAN_MAIN_M                                         */
/*==============================================================*/
CREATE TABLE ST_MAN_MAIN_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   DOWN_PORT_COUNT      NUMBER(12),
   PORT_ACCESS_AREA     VARCHAR2(200),
   PORT_FLOW            NUMBER(12,2),
   FREE_PORT_COUNT      NUMBER(12),
   DEVICE_MODEL         VARCHAR2(200),
   COUNT                NUMBER(12),
   AGE                  NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_MAN_TOTAL_M                                        */
/*==============================================================*/
CREATE TABLE ST_MAN_TOTAL_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   DOWN_PORT_COUNT      NUMBER(12),
   FREE_PORT_COUNT      NUMBER(12),
   DOWN_PORT_VLAN       VARCHAR2(200),
   DOWN_PORT_ACCESS_AREA VARCHAR2(200),
   DOWN_PORT_FLOW       NUMBER(12,2),
   ACCESS_HEAD_DEVICE_COUNT NUMBER(12),
   DEVICE_MODEL         VARCHAR2(200),
   COUNT                NUMBER(12),
   AGE                  NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_NET_FLOW_M                                         */
/*==============================================================*/
CREATE TABLE ST_NET_FLOW_M 
(
   CYCLE_ID           VARCHAR2(8),
   IN_NET_FLOW        VARCHAR2(200),
   OUT_NET_FLOW       VARCHAR2(200),
   ETL_DATE           DATE,
   PT_MON             DATE
);


/*==============================================================*/
/* Table: ST_NET_SPEED_M                                        */
/*==============================================================*/
CREATE TABLE ST_NET_SPEED_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   FREE_NET_SPEED       NUMBER(12,2),
   BUSI_NET_SPEED       NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_OTHER_DOWNLOAD_M                                   */
/*==============================================================*/
CREATE TABLE ST_OTHER_DOWNLOAD_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   TASK_NAME            VARCHAR2(200),
   OPERATOR             VARCHAR2(200),
   TRANSMISSION_SPEED   NUMBER(12,2),
   TRANSMISSION_TIME    NUMBER(12,2),
   DNS_TIME             NUMBER(12,2),
   TCP_TIME             NUMBER(12,2),
   TRANSMISSION_BYTES   NUMBER(12,2),
   VALID_MONITOR_COUNT  NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_OTHER_VIDEO_VIEW_M                                 */
/*==============================================================*/
CREATE TABLE ST_OTHER_VIDEO_VIEW_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   TASK_NAME            VARCHAR2(200),
   OPERATOR             VARCHAR2(200),
   DOWNLOAD_SPEED       NUMBER(12,2),
   VIDEO_FIRST_TIME     NUMBER(12,2),
   DOWNLOAD_BYTES       NUMBER(12,2),
   VALID_MONITOR_COUNT  NUMBER(12),
   AVAILABILITY         NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_OTHER_WEB_BROWSE_M                                 */
/*==============================================================*/
CREATE TABLE ST_OTHER_WEB_BROWSE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   TASK_NAME            VARCHAR2(200),
   OPERATOR             VARCHAR2(200),
   PERFORMANCE          NUMBER(12,2),
   USABILITY            NUMBER(12,2),
   PROJECTED_TCP_TIME   NUMBER(12,2),
   PROJECTED_RESPONSE_TIME NUMBER(12,2),
   PROJECTED_DOWNLOAD_TIME NUMBER(12,2),
   VALID_MONITOR_COUNT  NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_PACKET_LOSS_M                                      */
/*==============================================================*/
CREATE TABLE ST_PACKET_LOSS_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   STD_TIMES_CODE       VARCHAR2(20),
   STD_TIMES_NAME       VARCHAR2(200),
   PACKET_LOSS_COUNT    NUMBER(12),
   PACKET_LOSS_RATE     NUMBER(8,2),
   ETL_DATE             DATE,
   PT_MON               DATE,
   STD_ORG_NAME         VARCHAR2(200)
);


/*==============================================================*/
/* Table: ST_REVIEW_DIFF_TIME_PRO_VIEW_D                        */
/*==============================================================*/
CREATE TABLE ST_REVIEW_DIFF_TIME_PRO_VIEW_D 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_PROGRAM_CODE     VARCHAR2(20),
   STD_PROGRAM_NAME     VARCHAR2(200),
   STD_TIMES_CODE       VARCHAR2(20),
   STD_TIMES_NAME       VARCHAR2(200),
   REVIEW_USER_COUNT    NUMBER(12),
   REVIEW_COUNT         NUMBER(12),
   REVIEW_TIME          NUMBER(12),
   AVG_REVIEW_TIME      NUMBER(8,2),
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TOTAL_VIEW_D                                       */
/*==============================================================*/
CREATE TABLE ST_TOTAL_VIEW_D 
(
   CYCLE_ID              VARCHAR2(8),
   OWN_CORP_STD_ORG_CODE VARCHAR2(200),
   OWN_CORP_STD_ORG_NAME VARCHAR2(200),
   VIEW_USER_COUNT       NUMBER(12),
   TV_USER_COUNT         NUMBER(12),
   VOD_USER_COUNT        NUMBER(12),
   REVIEW_USER_COUNT     NUMBER(12),
   ETL_DATE              DATE,
   PT_TIME               DATE
);


/*==============================================================*/
/* Table: ST_TV_DIFF_MIN_CHANNEL_VIEW_D                         */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_CHANNEL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   TV_TIME               DECIMAL(16,2),
   TV_MINUTE_TREND       DECIMAL(8,2),
   TV_RATE               DECIMAL(8,2),
   TV_OCCUPY_RATE        DECIMAL(8,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


/*==============================================================*/
/* Table: ST_TV_DIFF_MIN_VIEW_D                                 */
/*==============================================================*/

CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       CHAR(5),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


/*==============================================================*/
/* Table: ST_TV_DIFF_TIME_CHANNEL_VIEW_D                        */
/*==============================================================*/

CREATE TABLE IF NOT EXISTS ST_TV_DIFF_TIME_CHANNEL_VIEW_D  (
   CYCLE_ID               VARCHAR(8),
   OWN_CORP_STD_ORG_CODE  VARCHAR(6),
   OWN_CORP_STD_ORG_NAME  VARCHAR(50),
   STD_CHANNEL_CODE       VARCHAR(20),
   STD_CHANNEL_NAME       VARCHAR(100),
   STD_TIMES_CODE         VARCHAR(10),
   STD_TIMES_NAME         VARCHAR(12),
   TV_USER_COUNT          DECIMAL(16),
   TV_TIME                DECIMAL(16,2),
   AVG_TV_TIME            DECIMAL(16,2),
   TV_RATE                DECIMAL(16,2),
   TV_OCCUPY_RATE         DECIMAL(16,2),
   TV_ARRIVAL_RATE        DECIMAL(16,2),
   ETL_DATE               TIMESTAMP,
   pt_mon                  VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


/*==============================================================*/
/* Table: ST_TV_DIFF_TIME_PROGRAM_VIEW_D                        */
/*==============================================================*/
CREATE TABLE ST_TV_DIFF_TIME_PROGRAM_VIEW_D 
(
   CYCLE_ID               VARCHAR2(8),
   OWN_CORP_STD_ORG_CODE  VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME  VARCHAR2(100),
   STD_CHANNEL_CODE       VARCHAR2(20),
   STD_CHANNEL_NAME       VARCHAR2(200),
   STD_PROGRAM_CODE       VARCHAR2(20),
   STD_PROGRAM_NAME       VARCHAR2(200),
   PRO_BEGIN_TIME         VARCHAR2(20),
   PRO_END_TIME           VARCHAR2(200),
   TV_USER_COUNT          NUMBER(12),
   TV_TIME                NUMBER(12),
   AVG_TV_TIME            NUMBER(8,2),
   TV_RATE                NUMBER(8,2),
   TV_OCCUPY_RATE         NUMBER(8,2),
   TV_ARRIVAL_RATE        NUMBER(8,2),
   ETL_DATE               DATE,
   PT_TIME                DATE
);


/*==============================================================*/
/* Table: ST_TV_DIFF_TIME_VIEW_D                                */
/*==============================================================*/

-- ST各时段直播收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_TIME_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_TIMES_CODE        VARCHAR(10),
   STD_TIMES_NAME        CHAR(11),
   tv_user_count        DECIMAL(16),
   TV_TIME               DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


/*==============================================================*/
/* Table: ST_TV_TOTAL_VIEW_D                                    */
/*==============================================================*/

-- ST直播总体收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_TOTAL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   TV_USER_COUNT         DECIMAL(16,0),
   TV_TIME                      DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;



/*==============================================================*/
/* Table: ST_TV_USER_INTO_OUT_D                                 */
/*==============================================================*/
CREATE TABLE ST_TV_USER_INTO_OUT_D 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_TIMES_CODE        VARCHAR2(20),
   STD_TIMES_NAME        VARCHAR2(200),
   STD_CHANNEL_CODE     VARCHAR2(20),
   STD_CHANNEL_NAME     VARCHAR2(200),
   INTO_USER_COUNT      NUMBER(12),
   OUT_USER_COUNT       NUMBER(12),
   INTO_TURNOVER_RATE    NUMBER,
   OUT_TURNOVER_RATE     NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TV_USER_INTO_OUT_DTL_D                                 */
/*==============================================================*/
CREATE TABLE ST_TV_USER_INTO_OUT_DTL_D 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_TIMES_CODE        VARCHAR2(20),
   STD_TIMES_NAME        VARCHAR2(200),
   STD_CHANNEL_CODE     VARCHAR2(20),
   STD_CHANNEL_NAME     VARCHAR2(200),
   INTO_OUT_CHANNEL     VARCHAR2(200),
   INTO_USER_COUNT      NUMBER(12),
   OUT_USER_COUNT       NUMBER(12),
   INTO_TURNOVER_RATE    NUMBER,
   OUT_TURNOVER_RATE     NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TX_REPORT_D                                        */
/*==============================================================*/
CREATE TABLE ST_TX_REPORT_D 
(
   CYCLE_ID             VARCHAR2(8)               NOT NULL,
   TOTAL_USER_COUNT     NUMBER,
   NEW_USER_COUNT       NUMBER,
   ACTIVE_USER_COUNT    NUMBER,
   PLAY_COUNT           NUMBER,
   ACTIVE_RATE          NUMBER,
   AVG_PLAY_COUNT       NUMBER,
   AVG_DURATION         NUMBER,
   PLAY_ACTIVE_RATE     NUMBER,
   TWICE_ACTIVATED_COUNT NUMBER,
   TWICE_ACTIVATED_RATE NUMBER,
   PLAY_USER_COUNT      NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TX_REPORT_M                                        */
/*==============================================================*/
CREATE TABLE ST_TX_REPORT_M 
(
   CYCLE_ID             VARCHAR2(8)               NOT NULL,
   ACTIVE_USER_COUNT    NUMBER,
   ACTIVE_RATE          NUMBER,
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_TX_REPORT_W                                        */
/*==============================================================*/
CREATE TABLE ST_TX_REPORT_W 
(
   CYCLE_ID             VARCHAR2(8)               NOT NULL,
   ACTIVE_USER_COUNT    NUMBER,
   ACTIVE_RATE          NUMBER,
   ACTIVE_USER_LOSS_RATE NUMBER,
   AVG_ACTIVE_RATE      NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TX_VOD_ANALYSIS_D                                  */
/*==============================================================*/
CREATE TABLE ST_TX_VOD_ANALYSIS_D 
(
   CYCLE_ID             VARCHAR2(8)               NOT NULL,
   VID                  VARCHAR2(200),
   VNAME                VARCHAR2(200),
   VTYPEID              VARCHAR2(200),
   VTYPENAME            VARCHAR2(200),
   PLAY_COUNT           NUMBER,
   PLAY_USER_COUNT1     NUMBER,
   PLAY_DURATION        NUMBER,
   PLAY_USER_COUNT2     NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_TX_VOD_VTYPE_ANALYSIS_D                                  */
/*==============================================================*/
CREATE TABLE ST_TX_VOD_VTYPE_ANALYSIS_D 
(
   CYCLE_ID             VARCHAR2(8)               NOT NULL,
   VTYPEID              VARCHAR2(200),
   VTYPENAME            VARCHAR2(200),
   PLAY_COUNT           NUMBER,
   PLAY_USER_COUNT1     NUMBER,
   PLAY_DURATION        NUMBER,
   PLAY_USER_COUNT2     NUMBER,
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_USER_DEV_M                                         */
/*==============================================================*/
CREATE TABLE ST_USER_DEV_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID          VARCHAR2(20),
   MGR_ADDR_NAME        VARCHAR2(200),
   COMMUNITY_ID         VARCHAR2(20),
   COMMUNITY_NAME       VARCHAR2(200),
   AREA_STD_ADDR_ID     VARCHAR2(20),
   AREA_STD_ADDR_NAME   VARCHAR2(200),
   USER_COUNT           NUMBER(12),
   USER_CHAIN           NUMBER(8,2),
   USER_EAR             NUMBER(8,2),
   NEW_USER_COUNT       NUMBER(12),
   NEW_USER_CHAIN       NUMBER(8,2),
   NEW_USER_EAR         NUMBER(8,2),
   LOSE_USER_COUNT      NUMBER(12),
   CUM_LOSE_USER_COUNT  NUMBER(12),
   LOSE_USER_CHAIN      NUMBER(8,2),
   LOSE_USER_EAR        NUMBER(8,2),
   INC_USER_COUNT       NUMBER(12),
   INC_USER_CHAIN       NUMBER(8,2),
   INC_USER_EAR         NUMBER(8,2),
   PAYMENT_USER_COUNT   NUMBER(12),
   PAYMENT_USER_CHAIN   NUMBER(8,2),
   PAYMENT_USER_EAR     NUMBER(8,2),
   PAY_USER_COUNT       NUMBER(12),
   PAY_USER_CHAIN       NUMBER(8,2),
   PAY_USER_EAR         NUMBER(8,2),
   EXPIRE_USER_COUNT    NUMBER(12),
   CUM_EXPIRE_USER_COUNT NUMBER(12),
   REPAY_USER_COUNT     NUMBER(12),
   CUM_REPAY_USER_COUNT NUMBER(12),
   REPAY_USER_CHAIN     NUMBER(8,2),
   REPAY_USER_EAR       NUMBER(8,2),
   REPAY_USER_RATE      NUMBER(8,2),
   CUM_REPAY_USER_RATE  NUMBER(8,2),
   EXPIRE_LOSE_USER_COUNT NUMBER(12),
   CUM_EXP_LOSE_USER_COUNT NUMBER(12),
   EXPIRE_LOSE_USER_RATE NUMBER(8,2),
   CUM_EXP_LOSE_USER_RATE NUMBER(8,2),
   SILENT_USER_COUNT    NUMBER(12),
   ACTIVE_USER_COUNT    NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_USER_FEATURE_M                                     */
/*==============================================================*/
CREATE TABLE ST_USER_FEATURE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   PROD_INST_ID         NUMBER(14)           NOT NULL,
   USER_NAME            VARCHAR2(255),
   SEX                  VARCHAR2(20),
   AGE                  VARCHAR2(20),
   消费偏好                 VARCHAR2(200),
   在线媒体偏好               VARCHAR2(200),
   使用设备情况               VARCHAR2(200),
   上网时段趋势               VARCHAR2(200),
   流量使用情况               VARCHAR2(200),
   上网频次                 NUMBER(12),
   上网时长                 NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_VIDEO_VIEW_M                                       */
/*==============================================================*/
CREATE TABLE ST_VIDEO_VIEW_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   REGION_NAME          VARCHAR2(200),
   BUFFER_TIME          NUMBER(12,2),
   FIRST_BUFFER_TIME    NUMBER(12,2),
   BUFFER_COUNT         NUMBER(12,2),
   DOWNLOAD_SPEED       NUMBER(12,2),
   MONITOR_COUNT        NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);


/*==============================================================*/
/* Table: ST_VIEW_DTL_D                                         */
/*==============================================================*/
CREATE TABLE ST_VIEW_DTL_D 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   ID                   NUMBER(20),
   VIEW_TYPE            VARCHAR2(200),
   START_DATE           VARCHAR2(20),
   CHANNEL              VARCHAR2(200),
   PROGRAM              VARCHAR2(200),
   VIEW_TIME            NUMBER(12),
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_VOD_DIFF_TIME_PRO_VIEW_D                           */
/*==============================================================*/
CREATE TABLE ST_VOD_DIFF_TIME_PRO_VIEW_D 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_PROGRAM_CODE     VARCHAR2(20),
   STD_PROGRAM_NAME     VARCHAR2(200),
   STD_TIMES_CODE       VARCHAR2(20),
   STD_TIMES_NAME       VARCHAR2(200),
   VOD_USER_COUNT       NUMBER(12),
   VOD_COUNT            NUMBER(12),
   VOD_TIME             NUMBER(12),
   AVG_VOD_TIME         NUMBER(8,2),
   ETL_DATE             DATE,
   PT_TIME              DATE
);


/*==============================================================*/
/* Table: ST_WEB_BROWSE_M                                       */
/*==============================================================*/
CREATE TABLE ST_WEB_BROWSE_M 
(
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   REGION_NAME          VARCHAR2(200),
   PERFORMANCE          NUMBER(12,2),
   FIRST_SCREEN_TIME    NUMBER(12,2),
   DOWNLOAD_SPEED       NUMBER(12,2),
   MONITOR_COUNT        NUMBER(12),
   ETL_DATE             DATE,
   PT_MON               DATE
);

/*==============================================================*/
/* Table: ST_DPI_FLOW_D                                         */
/*==============================================================*/
CREATE TABLE ST_DPI_FLOW_D  (
   CYCLE_ID             VARCHAR2(8)            NOT NULL,
   NET_TYPE             VARCHAR2(200),
   CONTENT_TYPE         VARCHAR2(200),
   CONTENT_NAME         VARCHAR2(200),
   SOURCE_IP            VARCHAR2(200),
   TARGET_IP            VARCHAR2(200),
   TARGET_BELONG        VARCHAR2(200),
   OPERATOR             VARCHAR2(200),
   URL                  VARCHAR2(200),
   DOWN_FLOW            NUMBER(12,2),
   UP_FLOW              NUMBER(12,2),
   TOTAL_FLOW           NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);


-- ST续费用户情况（月）
CREATE TABLE ST.ST_REPAY_USERS_MON  (
   CYCLE_ID             int,
   OWN_CORP_STD_ORG_CODE varchar2(20),
   OWN_CORP_STD_ORG_NAME varchar2(200),
   LOGIN_NAME           varchar2(32),
   CUST_CODE            varchar2(20),
   CUST_NAME            varchar2(255),
   PROD_INST_ID         varchar2(20),
   ADDR_NAME            varchar2(400),
   MANAGEMENT_STATION   varchar2(255),
   CONT_PHONE1          varchar2(50),
   CONT_PHONE2          varchar2(50),
   CONT_MOBILE1         varchar2(50),
   CONT_MOBILE2         varchar2(50),
   ACCESS_TYPE          varchar2(20),
   SRVPKG_NAME          varchar2(255),
   SRVPKG_CREATE_DATE   varchar2(32),
   SRVPKG_VALID_DATE    varchar2(32),
   SRVPKG_REMAINDER_DAYS number(12),
   SRVPKG_EXPIRE_DATE   varchar2(32),
   STATUS_NAME          varchar2(50),
   LAN_NUMBER           varchar2(32),
   MONTH_ONLINE_DAYS number(12),
   MONTH_ONLINE_DURATION number(14,2),
   MONTH_ONLINE_DURATION_AVG number(14,2),
   MONTH_UP_FLOW        number(14,2),
   MONTH_UP_FLOW_AVG    number(14,2),
   MONTH_DOWN_FLOW      number(14,2),
   MONTH_DOWN_FLOW_AVG  number(14,2),
   AUTH_COUNT           number(12),
   AUTH_SUCCESS_RATE    number(14,2),
   ETL_DATE             date,
   PT_MON               date
 )partition by range(cycle_id)(
partition p_2016 values less than (201701),        
partition p_2017 values less than (201801),        
partition p_2018 values less than (201901),        
partition p_2019 values less than (202001),        
partition p_2020 values less than (202101),        
partition p_2021 values less than (202201), 
partition p_2022 values less than (202301),
partition p_max values less than(maxvalue)  
);

COMMENT ON TABLE ST.ST_REPAY_USERS_MON IS
'注：这个表数据要取本月续费用户的上月情况
';

-- 原上网天数修改为月有效上网次数
ALTER TABLE ST.ST_REPAY_USERS_MON RENAME COLUMN MONTH_ONLINE_DAYS TO MONTH_ONLINE_NUM; -- 修改表列名


-- ST流失用户情况（月）
CREATE TABLE ST.ST_LOST_USERS_MON  (
   CYCLE_ID             int,
   OWN_CORP_STD_ORG_CODE varchar2(20),
   OWN_CORP_STD_ORG_NAME varchar2(200),
   LOGIN_NAME           varchar2(32),
   CUST_CODE            varchar2(20),
   CUST_NAME            varchar2(255),
   PROD_INST_ID         varchar2(20),
   ADDR_NAME            varchar2(400),
   MANAGEMENT_STATION   varchar2(255),
   CONT_PHONE1          varchar2(50),
   CONT_PHONE2          varchar2(50),
   CONT_MOBILE1         varchar2(50),
   CONT_MOBILE2         varchar2(50),
   ACCESS_TYPE          varchar2(20),
   SRVPKG_NAME          varchar2(255),
   SRVPKG_CREATE_DATE   varchar2(32),
   SRVPKG_VALID_DATE    varchar2(32),
   SRVPKG_REMAINDER_DAYS number(12),
   SRVPKG_EXPIRE_DATE   varchar2(32),
   STATUS_NAME          varchar2(50),
   LAN_NUMBER           varchar2(32),
   MONTH_ONLINE_DAYS number(12),
   MONTH_ONLINE_DURATION number(14,2),
   MONTH_ONLINE_DURATION_AVG number(14,2),
   MONTH_UP_FLOW        number(14,2),
   MONTH_UP_FLOW_AVG    number(14,2),
   MONTH_DOWN_FLOW      number(14,2),
   MONTH_DOWN_FLOW_AVG  number(14,2),
   AUTH_COUNT           number(12),
   AUTH_SUCCESS_RATE    number(14,2),
   ETL_DATE             date,
   PT_MON               date
)partition by range(cycle_id)(
partition p_2016 values less than (201701),        
partition p_2017 values less than (201801),        
partition p_2018 values less than (201901),        
partition p_2019 values less than (202001),        
partition p_2020 values less than (202101),        
partition p_2021 values less than (202201), 
partition p_2022 values less than (202301),
partition p_max values less than(maxvalue)  
);
COMMENT ON TABLE ST.ST_LOST_USERS_MON IS
'注：这个表数据要取本月流失用户的上月情况
';
-- 原上网天数修改为月有效上网次数
ALTER TABLE ST.ST_LOST_USERS_MON RENAME COLUMN MONTH_ONLINE_DAYS TO MONTH_ONLINE_NUM; -- 修改表列名


-- ST全部用户情况（月）
CREATE TABLE ST.ST_ALL_USERS_MON  (
   CYCLE_ID             int,
   OWN_CORP_STD_ORG_CODE varchar2(20),
   OWN_CORP_STD_ORG_NAME varchar2(200),
   LOGIN_NAME           varchar2(32),
   CUST_CODE            varchar2(20),
   CUST_NAME            varchar2(255),
   PROD_INST_ID         varchar2(20),
   ADDR_NAME            varchar2(400),
   MANAGEMENT_STATION   varchar2(255),
   CONT_PHONE1          varchar2(50),
   CONT_PHONE2          varchar2(50),
   CONT_MOBILE1         varchar2(50),
   CONT_MOBILE2         varchar2(50),
   ACCESS_TYPE          varchar2(20),
   SRVPKG_NAME          varchar2(255),
   SRVPKG_CREATE_DATE   varchar2(32),
   SRVPKG_VALID_DATE    varchar2(32),
   SRVPKG_REMAINDER_DAYS number(12),
   SRVPKG_EXPIRE_DATE   varchar2(32),
   STATUS_NAME          varchar2(50),
   LAN_NUMBER           varchar2(32),
   MONTH_ONLINE_NUM number(12),
   MONTH_ONLINE_DURATION number(14,2),
   MONTH_ONLINE_DURATION_AVG number(14,2),
   MONTH_UP_FLOW        number(14,2),
   MONTH_UP_FLOW_AVG    number(14,2),
   MONTH_DOWN_FLOW      number(14,2),
   MONTH_DOWN_FLOW_AVG  number(14,2),
   AUTH_COUNT           number(12),
   AUTH_SUCCESS_RATE    number(14,2),
   ETL_DATE             date,
   PT_MON               date
 )partition by range(cycle_id)(
partition p_201701 values less than (201704),
partition p_201702 values less than (201707),
partition p_201703 values less than (201710),
partition p_201704 values less than (201801),
partition p_201801 values less than (201804),
partition p_201802 values less than (201807),
partition p_201803 values less than (201810),
partition p_201804 values less than (201901),
partition p_201901 values less than (201904),
partition p_201902 values less than (201907),
partition p_201903 values less than (201910),
partition p_201904 values less than (202001),
partition p_202001 values less than (202004),
partition p_202002 values less than (202007),
partition p_202003 values less than (202010),
partition p_202004 values less than (202101),
partition p_202101 values less than (202104),
partition p_202102 values less than (202107),
partition p_202103 values less than (202110),
partition p_202104 values less than (202201),
partition p_202201 values less than (202204),
partition p_202202 values less than (202207),
partition p_202203 values less than (202210),
partition p_202204 values less than (202301),
partition p_max values less than(maxvalue)  
);

COMMENT ON TABLE ST.ST_ALL_USERS_MON IS
'注：这个表数据要取全量用户的上月情况 ，数据逻辑同续费和流失用户表';


-- ST本月用户上网情况（月）
-- 注：这个表数据取本月用户的上网情况
CREATE TABLE ST.ST_USER_ONLINE_MON  (
   CYCLE_ID             int,
   OWN_CORP_STD_ORG_CODE varchar2(20),
   OWN_CORP_STD_ORG_NAME varchar2(200),
   LOGIN_NAME           varchar2(32),
   CUST_CODE            varchar2(20),
   CUST_NAME            varchar2(255),
   PROD_INST_ID         varchar2(20),
   SRVPKG_NAME          varchar2(255),
   ARPU                 number(14,2),
   BANDWIDTH            varchar2(20),
   CYCLE                int,
   PRICE                number(14,2),
   THIS_MONTH_ONLINE_DAYS number(12),
   MONTH_ONLINE_DURATION_AVG number(14,2),
   DAYS_FROM_LAST_ONLINE number(12),
   ETL_DATE             date,
   PT_MON               date
)partition by range(cycle_id)(
partition p_2016 values less than (201701),        
partition p_201701 values less than (201704),        
partition p_201702 values less than (201707),
partition p_201703 values less than (201710),        
partition p_201704 values less than (201801),        
partition p_201801 values less than (201804),        
partition p_201802 values less than (201807),
partition p_201803 values less than (201810),        
partition p_201804 values less than (201901),        
partition p_201901 values less than (201904),        
partition p_201902 values less than (201907),
partition p_201903 values less than (201910),        
partition p_201904 values less than (202001),        
partition p_202001 values less than (202004),        
partition p_202002 values less than (202007),
partition p_202003 values less than (202010),        
partition p_202004 values less than (202101),        
partition p_202101 values less than (202104),        
partition p_202102 values less than (202107),
partition p_202103 values less than (202110),        
partition p_202104 values less than (202201),                
partition p_max values less than(maxvalue)  
);

COMMENT ON TABLE ST.ST_USER_ONLINE_MON IS
'注：这个表数据取本月用户的上网情况
';

COMMENT ON COLUMN ST.ST_USER_ONLINE_MON.CYCLE IS
'周期指这个产品的时长，单位为月';

COMMENT ON COLUMN ST.ST_USER_ONLINE_MON.DAYS_FROM_LAST_ONLINE IS
'以10月数据为例，11月1号0点（或10月31日23:59:59）减去10月用户最后一次上网的时间点';

-- 原上网天数修改为月有效上网次数
ALTER TABLE ST.ST_USER_ONLINE_MON RENAME COLUMN THIS_MONTH_ONLINE_DAYS TO MONTH_ONLINE_NUM; -- 修改表列名



/*==============================================================*/
/* Table: ST认证成功率统计(月)                                  */
/*==============================================================*/
CREATE TABLE ST_AUTH_RATE_M 
(
   CYCLE_ID                INT,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(200),
   AUTH_SUCCESS_USER_COUNT NUMBER(12),
   AUTH_FAILURE_USER_COUNT NUMBER(12),
   AUTH_SUCCESS_RATE       NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               DATE
);

/*==============================================================*/
/* Table: ST_DIFF_OFFER_INCOME_M                                 */
/*==============================================================*/
CREATE TABLE ST_DIFF_OFFER_INCOME_M 
(
   CYCLE_ID              VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_OFFER_CODE        VARCHAR2(20),
   STD_OFFER_NAME        VARCHAR2(100),
   NEW_ORDER_USER_COUNT  NUMBER(12),
   NEW_ORDER_USER_RATE   NUMBER(8,2),
   NEW_ORDER_AMOUNT      NUMBER(20),
   NEW_ORDER_AMOUNT_RATE NUMBER(8,2),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU NUMBER(8,2),
   BILL_USER_COUNT       NUMBER(12),
   BILL_AMOUNT           NUMBER(20,2),
   BILL_AMOUNT_RATE      NUMBER(8,2),
   BILL_AMOUNT_ARPU      NUMBER(8,2),
   ETL_DATE              DATE,
   PT_MON                DATE
);

/*==============================================================*/
/* Table: ST_DIFF_REGION_INCOME_M                            */
/*==============================================================*/
CREATE TABLE ST_DIFF_REGION_INCOME_M 
(
   CYCLE_ID              VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID           VARCHAR2(20),
   MGR_ADDR_NAME         VARCHAR2(200),
   NEW_ORDER_USER_COUNT  NUMBER(12),
   NEW_ORDER_AMOUNT      NUMBER(20),
   NEW_ORDER_AMOUNT_ARPU NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU NUMBER(8,2),
   BILL_USER_COUNT       NUMBER(12),
   BILL_AMOUNT           NUMBER(20,2),
   BILL_AMOUNT_ARPU      NUMBER(8,2),
   ETL_DATE              DATE,
   PT_MON                DATE
);

/*==============================================================*/
/* Table: ST_DIFF_CORP_INCOME_M                                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_CORP_INCOME_M 
(
   CYCLE_ID                       VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE          VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME          VARCHAR2(100),
   NEW_ORDER_USER_COUNT           NUMBER(12),
   NEW_ORDER_AMOUNT               NUMBER(20),
   NEW_ORDER_AMOUNT_CHAIN         NUMBER(8,2),
   NEW_ORDER_AMOUNT_EAR           NUMBER(8,2),
   NEW_ORDER_AMOUNT_CHAIN_GROWTH  NUMBER(8,2),
   NEW_ORDER_AMOUNT_EAR_GROWTH    NUMBER(8,2),
   NEW_ORDER_AMOUNT_ARPU          NUMBER(8,2),
   NEW_ORDER_AMOUNT_NOT0_ARPU     NUMBER(8,2),
   BILL_USER_COUNT                NUMBER(12),
   BILL_AMOUNT                    NUMBER(20,2),
   BILL_AMOUNT_CHAIN              NUMBER(8,2),
   BILL_AMOUNT_EAR                NUMBER(8,2),
   BILL_AMOUNT_ARPU               NUMBER(8,2),
   LAN_PARTNER_AMOUNT             NUMBER(20),
   ETL_DATE                       DATE,
   PT_MON                         DATE
);

/*==============================================================*/
/* Table: ST_DIFF_CORP_USER_DEV_M                                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_CORP_USER_DEV_M 
(
   CYCLE_ID                VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME   VARCHAR2(100),
   USER_COUNT              NUMBER(12),
   USER_CHAIN              NUMBER(8,2),
   USER_EAR                NUMBER(8,2),
   USER_CHAIN_GROWTH       NUMBER(8,2),
   USER_EAR_GROWTH         NUMBER(8,2),
   NEW_USER_COUNT          NUMBER(12),
   NEW_USER_CHAIN          NUMBER(8,2),
   NEW_USER_EAR            NUMBER(8,2),
   NEW_USER_CHAIN_GROWTH   NUMBER(8,2),
   NEW_USER_EAR_GROWTH     NUMBER(8,2),
   LOSE_USER_COUNT         NUMBER(12),
   CUM_LOSE_USER_COUNT     NUMBER(12),
   LOSE_USER_CHAIN         NUMBER(8,2),
   LOSE_USER_EAR           NUMBER(8,2),
   LOSE_USER_CHAIN_GROWTH  NUMBER(8,2),
   LOSE_USER_EAR_GROWTH    NUMBER(8,2),
   INC_USER_COUNT          NUMBER(12),
   INC_USER_CHAIN          NUMBER(8,2),
   INC_USER_EAR            NUMBER(8,2),
   PAYMENT_USER_COUNT      NUMBER(12),
   PAYMENT_USER_CHAIN      NUMBER(8,2),
   PAYMENT_USER_EAR        NUMBER(8,2),
   PAY_USER_COUNT          NUMBER(12),
   PAY_USER_CHAIN          NUMBER(8,2),
   PAY_USER_EAR            NUMBER(8,2),
   EXPIRE_USER_COUNT       NUMBER(12),
   CUM_EXPIRE_USER_COUNT   NUMBER(12),
   REPAY_USER_COUNT        NUMBER(12),
   CUM_REPAY_USER_COUNT    NUMBER(12),
   REPAY_USER_CHAIN        NUMBER(8,2),
   REPAY_USER_EAR          NUMBER(8,2),
   REPAY_USER_RATE         NUMBER(8,2),
   REPAY_USER_CHAIN_GROWTH NUMBER(8,2),
   REPAY_USER_EAR_GROWTH   NUMBER(8,2),
   CUM_REPAY_USER_RATE     NUMBER(8,2),
   EXPIRE_LOSE_USER_COUNT  NUMBER(12),
   CUM_EXP_LOSE_USER_COUNT NUMBER(12),
   EXPIRE_LOSE_USER_RATE   NUMBER(8,2),
   CUM_EXP_LOSE_USER_RATE  NUMBER(8,2),
   SILENT_USER_COUNT       NUMBER(12),
   ACTIVE_USER_COUNT       NUMBER(12),
   ETL_DATE                DATE,
   PT_MON                  DATE
);

/*==============================================================*/
/* Table: ST_DIFF_REGION_USER_DEV_M                                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_REGION_USER_DEV_M 
(
   CYCLE_ID              VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   MGR_ADDR_ID           VARCHAR2(20),
   MGR_ADDR_NAME         VARCHAR2(100),
   USER_COUNT            NUMBER(12),
   USER_RATE             NUMBER(8,2),
   NEW_USER_COUNT        NUMBER(12),
   NEW_USER_RATE         NUMBER(8,2),
   LOSE_USER_COUNT       NUMBER(12),
   LOSE_USER_RATE        NUMBER(8,2),
   REPAY_USER_COUNT      NUMBER(12),
   REPAY_USER_RATE       NUMBER(8,2),
   ETL_DATE              DATE,
   PT_MON                DATE
);

/*==============================================================*/
/* Table: ST_DIFF_OFFER_USER_DEV_M                                           */
/*==============================================================*/
CREATE TABLE ST_DIFF_OFFER_USER_DEV_M 
(
   CYCLE_ID              VARCHAR2(8)            NOT NULL,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   STD_OFFER_CODE        VARCHAR2(20),
   STD_OFFER_NAME        VARCHAR2(100),
   USER_COUNT            NUMBER(12),
   USER_RATE             NUMBER(8,2),
   NEW_USER_COUNT        NUMBER(12),
   NEW_USER_RATE         NUMBER(8,2),
   LOSE_USER_COUNT       NUMBER(12),
   LOSE_USER_RATE        NUMBER(8,2),
   REPAY_USER_COUNT      NUMBER(12),
   REPAY_USER_RATE       NUMBER(8,2),
   ETL_DATE              DATE,
   PT_MON                DATE
);

CREATE TABLE DIM_STD_VTYPE
(
  VID       VARCHAR2(20),
  VNAME     VARCHAR2(200),
  VTYPEID   VARCHAR2(20),
  VTYPENAME VARCHAR2(20),
  RN        NUMBER,
  ETL_DATE  DATE
)

CREATE TABLE DIM_STD_PRODUCT  (
   PRODUCT_ID            VARCHAR2(50),
   PRODUCT_NAME          VARCHAR2(255),
   OFFER_NAME            VARCHAR2(255),
   BANDWIDTH             VARCHAR2(50),
   CYCLE                 NUMBER(9),
   PRICE                 NUMBER(9),
   FLAG                  VARCHAR2(255),
   OWN_CORP_STD_ORG_CODE VARCHAR2(50),
   UPDATE_DATE           DATE
)


/*==============================================================*/
/* Table: st_diff_num_dr_summary                                           */
/*==============================================================*/
create table st_diff_num_dr_summary
(own_corp_std_org_code  varchar2(20),
own_corp_std_org_name  varchar2(100),
dr_count_type       varchar2(50),
dr_user_count       number(12),
lb_user_count       number(12),
etl_date            date,
pt_mon              date);

/*==============================================================*/
/* Table: st_diff_time_dr_summary                                           */
/*==============================================================*/

create table st_diff_time_dr_summary
(own_corp_std_org_code  varchar2(20),
own_corp_std_org_name  varchar2(100),
std_times_code       varchar2(50),
std_times_name       varchar2(50),
dr_user_count        number(12),
dr_count             number(12),
lb_user_count        number(12),
lb_count             number(12),
etl_date             date,
pt_mon               date);

/*==============================================================*/
/* Table: ST_DIFF_MOVIE_DR_SUMMARY                                           */
/*==============================================================*/
create table ST_DIFF_MOVIE_DR_SUMMARY
(OWN_CORP_STD_ORG_CODE    varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
MOVIE_ID                varchar2(50),
MOVIE_NAME              varchar2(255),
DR_USER_COUNT           number(12),
DR_COUNT                number(12),
LB_USER_COUNT           number(12),
LB_COUNT                number(12),
ETL_DATE                date,
pt_mon               date);


/*==============================================================*/
/* Table: ST_DIFF_CATEGORY_DR_SUMMARY                                           */
/*==============================================================*/
create table ST_DIFF_CATEGORY_DR_SUMMARY
(OWN_CORP_STD_ORG_CODE     varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
CATEGORY_ID             varchar2(50),
CATEGORY_NAME           varchar2(255),
DR_USER_COUNT           number(12),
DR_COUNT                number(12),
LB_USER_COUNT           number(12),
LB_COUNT                number(12),
ETL_DATE                date,
pt_mon                  date);

/*==============================================================*/
/* Table: ST_DR_SUMMARY                                           */
/*==============================================================*/

create table  ST_DR_SUMMARY
(OWN_CORP_STD_ORG_CODE      varchar2(20),
OWN_CORP_STD_ORG_NAME    varchar2(100),
TOTAL_USER_COUNT         number(12)   ,
ACTIVE_USER_COUNT        number(12)   ,
DORMANT_USER_COUNT       number(12)   ,
DR_NEW_USER_COUNT        number(12)   ,
DR_BACK_USER_COUNT       number(12)   ,
DR_USER_COUNT            number(12)   ,
DR_USER_PRO              number(12,2), 
DR_COUNT                 number(12)   ,
DR_PER_COUNT             number(12,2)   ,
DR_YEAR_GROWTH           number(12,2), 
DR_MONTH_GROWTH          number(12,2), 
DR_PER_YEAR_GROWTH       number(12,2), 
DR_PER_MONTH_GROWTH      number(12,2), 
LB_NEW_USER_COUNT        number(12)   ,
LB_BACK_USER_COUNT       number(12)   ,
LB_USER_COUNT            number(12)   ,
LB_USER_PRO              number(12,2), 
LB_COUNT                 number(12)   ,
LB_PER_COUNT             number(12,2)   ,
LB_YEAR_GROWTH           number(12,2), 
LB_MONTH_GROWTH          number(12,2), 
LB_PER_YEAR_TROWTH       number(12,2), 
LB_PER_MONTH_TROWTH      number(12,2), 
ETL_DATE                 date,
pt_mon                  date);


/*==============================================================*/
/* Table: ST_DIFF_CATEGORY_TYPE_SUMMARY                                           */
/*==============================================================*/

create table  ST_DIFF_CATEGORY_TYPE_SUMMARY
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
CATEGORY_TYPE_ID        varchar2(50),
CATEGORY_TYPE_NAME      varchar2(255),
DR_USER_COUNT           number(12),
DR_COUNT                number(12),
LB_USER_COUNT           number(12),
LB_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);


/*==============================================================*/
/* Table: ST_DIFF_URL_DIFF_DEVICE_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_URL_DIFF_DEVICE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_DEVICE_CATE_CODE         varchar2(100),
STD_DEVICE_CATE_NAME         varchar2(100),
URL                varchar2(100),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);  


/*==============================================================*/
/* Table: ST_DIFF_DEVICE_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_DEVICE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_DEVICE_CATE_CODE         varchar2(100),
STD_DEVICE_CATE_NAME         varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date); 

/*==============================================================*/
/* Table: ST_DIFF_OFFER_URLTYPE_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_OFFER_URLTYPE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_OFFER_CODE          varchar2(100),
STD_OFFER_NAME          varchar2(100),
URL_TYPE                varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);

/*==============================================================*/
/* Table: ST_DIFF_OFFER_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_OFFER_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_OFFER_CODE          varchar2(100),
STD_OFFER_NAME          varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date); 

/*==============================================================*/
/* Table: ST_DIFF_TIME_URLTYPE_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_TIME_URLTYPE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_TIMES_CODE          varchar2(100),
STD_TIMES_NAME          varchar2(100),
URL_TYPE                varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);

/*==============================================================*/
/* Table: ST_DIFF_WORKDAY_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_WORKDAY_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
WORKDAY_TYPE        varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);

/*==============================================================*/
/* Table: ST_DIFF_TIME_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_TIME_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
STD_TIMES_CODE          varchar2(100),
STD_TIMES_NAME          varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date); 

/*==============================================================*/
/* Table: ST_DIFF_URL_TYPE_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_URL_TYPE_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
URL_TYPE        varchar2(100),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);

/*==============================================================*/
/* Table: ST_DIFF_URL_USER_M                                           */
/*==============================================================*/

create table  ST_DIFF_URL_USER_M
(OWN_CORP_STD_ORG_CODE  varchar2(20),
OWN_CORP_STD_ORG_NAME   varchar2(100),
URL        varchar2(255),
VISIT_COUNT           number(12),
VISIT_USER_COUNT                number(12),
ETL_DATE                 date,
pt_mon                  date);


/*==============================================================*/
/* Table: DWA_USER_TV_CHANNEL_BEH_M                             */
/* Table: DWA用户直播频道行为标签月表                           */
/*==============================================================*/
CREATE TABLE DWA_USER_TV_CHANNEL_BEH_M  (
   PROD_INST_ID         VARCHAR2(32),
   CHANNEL_NAME         VARCHAR2(100),
   MAX_TV_NUM           NUMBER(12),
   AVG_TV_NUM           NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               VARCHAR2(8)
);

/*==============================================================*/
/* Table: DWA_USER_NETWORK_BEH_M                                */
/* Table: DWA用户上网行为标签月表                               */
/*==============================================================*/
CREATE TABLE DWA_USER_NETWORK_BEH_M  (
   PROD_INST_ID             VARCHAR2(32),
   BANDWIDTH                VARCHAR2(100),
   TOTAL_NET_FLOW           NUMBER(12,2),
   IS_YEMAOZI               VARCHAR2(100),
   IS_SHANGBANZU            VARCHAR2(100),
   WEEKDAY_NET_NUM_RATE     NUMBER(12,2),
   WEEKDAY_NET_FLOW_RATE    NUMBER(12,2),
   WEEKEND_NET_NUM_RATE     NUMBER(12,2),
   WEEKEND_NET_FLOW_RATE    NUMBER(12,2),
   LC_NET_NUM_RATE          NUMBER(12,2),
   LC_NET_FLOW_RATE         NUMBER(12,2),
   ZS_NET_NUM_RATE          NUMBER(12,2),
   ZS_NET_FLOW_RATE         NUMBER(12,2),
   SW_NET_NUM_RATE          NUMBER(12,2),
   SW_NET_FLOW_RATE         NUMBER(12,2),
   ZW_NET_NUM_RATE          NUMBER(12,2),
   ZW_NET_FLOW_RATE         NUMBER(12,2),
   XW_NET_NUM_RATE          NUMBER(12,2),
   XW_NET_FLOW_RATE         NUMBER(12,2),
   BW_NET_NUM_RATE          NUMBER(12,2),
   BW_NET_FLOW_RATE         NUMBER(12,2),
   WS_NET_NUM_RATE          NUMBER(12,2),
   WS_NET_FLOW_RATE         NUMBER(12,2),
   WY_NET_NUM_RATE          NUMBER(12,2),
   WY_NET_FLOW_RATE         NUMBER(12,2),
   PC_NET_TIME_RATE         NUMBER(12,2),
   MOBILE_NET_TIME_RATE     NUMBER(12,2),
   DOMAIN_NAME_1            VARCHAR2(512),
   DOMAIN_NAME_FLOW_1       NUMBER(12,2),
   DOMAIN_NAME_2            VARCHAR2(512),
   DOMAIN_NAME_FLOW_2       NUMBER(12,2),
   DOMAIN_NAME_3            VARCHAR2(512),
   DOMAIN_NAME_FLOW_3       NUMBER(12,2),
   DOMAIN_NAME_4            VARCHAR2(512),
   DOMAIN_NAME_FLOW_4       NUMBER(12,2),
   DOMAIN_NAME_5            VARCHAR2(512),
   DOMAIN_NAME_FLOW_5       NUMBER(12,2),
   WEBSITE_TYPE_1           VARCHAR2(100),
   WEBSITE_TYPE_FLOW_1      NUMBER(12,2),
   WEBSITE_TYPE_2           VARCHAR2(100),
   WEBSITE_TYPE_FLOW_2      NUMBER(12,2),
   WEBSITE_TYPE_3           VARCHAR2(100),
   WEBSITE_TYPE_FLOW_3      NUMBER(12,2),
   WEBSITE_TYPE_4           VARCHAR2(100),
   WEBSITE_TYPE_FLOW_4      NUMBER(12,2),
   WEBSITE_TYPE_5           VARCHAR2(100),
   WEBSITE_TYPE_FLOW_5      NUMBER(12,2),
   VIDEO_DOMAIN_NAME_1      VARCHAR2(512),
   VIDEO_DOMAIN_NAME_FLOW_1 NUMBER(12,2),
   VIDEO_DOMAIN_NAME_2      VARCHAR2(512),
   VIDEO_DOMAIN_NAME_FLOW_2 NUMBER(12,2),
   VIDEO_DOMAIN_NAME_3      VARCHAR2(512),
   VIDEO_DOMAIN_NAME_FLOW_3 NUMBER(12,2),
   VIDEO_DOMAIN_NAME_4      VARCHAR2(512),
   VIDEO_DOMAIN_NAME_FLOW_4 NUMBER(12,2),
   VIDEO_DOMAIN_NAME_5      VARCHAR2(512),
   VIDEO_DOMAIN_NAME_FLOW_5 NUMBER(12,2),
   ETL_DATE                 DATE,
   PT_MON                   VARCHAR2(8)
);

/*==============================================================*/
/* Table: DWA_USER_NETWORK_WEBSITE_BEH_M                        */
/* Table: DWA用户上网网站类型行为标签月表                       */
/*==============================================================*/
CREATE TABLE DWA_USER_NETWORK_WEBSITE_BEH_M  (
   PROD_INST_ID         VARCHAR2(32),
   WEBSITE_TYPE         VARCHAR2(100),
   DOMAIN_NAME_1        VARCHAR2(512),
   DOMAIN_NAME_FLOW_1   NUMBER(12,2),
   DOMAIN_NAME_2        VARCHAR2(512),
   DOMAIN_NAME_FLOW_2   NUMBER(12,2),
   DOMAIN_NAME_3        VARCHAR2(512),
   DOMAIN_NAME_FLOW_3   NUMBER(12,2),
   DOMAIN_NAME_4        VARCHAR2(512),
   DOMAIN_NAME_FLOW_4   NUMBER(12,2),
   DOMAIN_NAME_5        VARCHAR2(512),
   DOMAIN_NAME_FLOW_5   NUMBER(12,2),
   ETL_DATE             DATE,
   PT_MON               VARCHAR2(8)
);



/*==============================================================*/
/* Table: ST_DNS_RESPONSE_FAILURE_M                        */
/* Table: ST_DNS响应失败情况分析(月)                       */
/*==============================================================*/
CREATE TABLE ST_DNS_RESPONSE_FAILURE_M  (
OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
OWN_CORP_STD_ORG_NAME   VARCHAR2(200),
ANSWER_CODE             VARCHAR2(200),
ANSWER_NAME             VARCHAR2(200),
RESPONSE_COUNT          NUMBER,
ETL_DATE                DATE,
PT_MON               VARCHAR2(8)
);


/*==============================================================*/
/* Table: ST_DNS_RESPONSE_M                        */
/* Table: ST_DNS响应总体情况分析(月)                       */
/*==============================================================*/
CREATE TABLE ST_DNS_RESPONSE_M  (
OWN_CORP_STD_ORG_CODE   VARCHAR2(20),
OWN_CORP_STD_ORG_NAME   VARCHAR2(200),
INTRANET_SUCCESS_COUNT  VARCHAR2(200),
EXTRANET_SUCCESS_COUNT  VARCHAR2(200),
TOTAL_COUNT             NUMBER(12),
SUCCESS_RATE            NUMBER(12,2),
EXTRANET_COUNT          NUMBER(12),
EXTRANET_RATE           NUMBER(12,2),
ETL_DATE                DATE,
PT_MON               VARCHAR2(8)
);





--  ST用户月发展统计(新)
CREATE TABLE ST_NEW_USER_DEV_M(
  cycle_id char(6), 
  own_corp_std_org_code varchar2(6),
  own_corp_std_org_name varchar2(32),
  cust_type      DECIMAL(2,0),
  cust_type_name VARCHAR(20),
  dtv_user_count decimal(16,0),
  dtv_paid_user_count decimal(16,0), 
  lan_user_count decimal(16,0), 
  lan_paid_user_count decimal(16,0), 
  new_dtv_user_count decimal(16,0), 
  new_lan_user_count decimal(16,0), 
  lose_dtv_user_count decimal(16,0), 
  lose_lan_user_count decimal(16,0), 
  etl_date TIMESTAMP,
  pt_mon   CHAR(6),
  PRIMARY KEY (cycle_id,own_corp_std_org_code)
)
TABLEspace st


--  ST客户月发展统计
CREATE TABLE ST_CUST_DEV_M(
  cycle_id char(6), 
  own_corp_std_org_code varchar2(6), 
  own_corp_std_org_name varchar2(32), 
  cust_type      DECIMAL(2,0),
  cust_type_name VARCHAR(20),
  total_valid_cust_count decimal(16,0), 
  total_paid_cust_count decimal(16,0), 
  conv_valid_cust_count decimal(16,0), 
  conv_valid_user_count DECIMAL(16,0),
  conv_paid_cust_count decimal(16,0), 
  conv_paid_user_count decimal(16,0), 
  olan_valid_cust_count decimal(16,0), 
  olan_valid_user_count decimal(16,0), 
  olan_paid_cust_count decimal(16,0), 
  olan_paid_user_count decimal(16,0), 
  new_conv_cust_count decimal(16,0), 
  new_conv_user_count decimal(16,0), 
  new_olan_cust_count decimal(16,0), 
  new_olan_user_count decimal(16,0), 
  lose_conv_cust_count decimal(16,0), 
  lose_conv_user_count decimal(16,0), 
  lose_olan_cust_count decimal(16,0), 
  lose_olan_user_count decimal(16,0), 
  etl_date TIMESTAMP,
  pt_mon char(6),
  PRIMARY KEY (cycle_id,own_corp_std_org_code)
)
tablespace st

--  网格客户发展统计
CREATE TABLE ST_GRID_USER_DEV_M  (
   CYCLE_ID             CHAR(6) ,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type            DECIMAL(2,0),
   cust_type_name        VARCHAR2(10),
   GRID_ID              VARCHAR2(20),
   GRID_NAME            VARCHAR2(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR2(100),
   AREA_STD_ADDR_ID     VARCHAR2(30),
   AREA_STD_ADDR_NAME   VARCHAR2(255),
   DTV_VALID_USER_CNT   DECIMAL(16),
   DTV_PAID_USER_CNT    DECIMAL(16),
   NEW_DTV_USER_CNT     DECIMAL(16),
   LOSE_DTV_USER_CNT    DECIMAL(16),
   LAN_VALID_USER_CNT   DECIMAL(16),
   LAN_PAID_USER_CNT    DECIMAL(16),
   NEW_LAN_USER_CNT     DECIMAL(16),
   LOSE_LAN_USER_CNT    DECIMAL(16),
   DFTV_VALID_USER_CNT  DECIMAL(16),
   DFTV_PAID_USER_CNT   DECIMAL(16),
   NEW_DFTV_USER_CNT    DECIMAL(16),
   LOSE_DFTV_USER_CNT   DECIMAL(16),
   DBITV_VALID_USER_CNT DECIMAL(16),
   DBITV_PAID_USER_CNT  DECIMAL(16),
   NEW_DBITV_USER_CNT   DECIMAL(16),
   LOSE_DBITV_USER_CNT  DECIMAL(16),
   DITV_VALID_USER_CNT  DECIMAL(16),
   DITV_PAID_USER_CNT   DECIMAL(16),
   NEW_DITV_USER_CNT    DECIMAL(16),
   LOSE_DITV_USER_CNT   DECIMAL(16),
   AMSP_VALID_USER_CNT  DECIMAL(16),
   AMSP_PAID_USER_CNT   DECIMAL(16),
   NEW_AMSP_USER_CNT    DECIMAL(16),
   LOSE_AMSP_USER_CNT   DECIMAL(16),
   CM_VALID_USER_CNT    DECIMAL(16),
   CM_PAID_USER_CNT     DECIMAL(16),
   NEW_CM_USER_CNT      DECIMAL(16),
   LOSE_CM_USER_CNT     DECIMAL(16),
   HDTV_VALID_USER_CNT  DECIMAL(16),
   HDTV_PAID_USER_CNT   DECIMAL(16),
   NEW_HDTV_USER_CNT    DECIMAL(16),
   LOSE_HDTV_USER_CNT   DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_Mon               CHAR(6)
)
tablespace st



--  ST网格用户发展统计
CREATE TABLE ST_GRID_CUST_DEV_M  (
   CYCLE_ID             CHAR(6) ,
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type            DECIMAL(2,0),
   cust_type_name       varchar2(20),
   GRID_ID              VARCHAR2(20),
   GRID_NAME            VARCHAR2(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR2(100),
   AREA_STD_ADDR_ID     VARCHAR2(30),
   AREA_STD_ADDR_NAME   VARCHAR2(255),
   VALID_CUST_CNT       DECIMAL(16),
   PAID_CUST_CNT        DECIMAL(16),
   CONV_VALID_CUST_CNT       DECIMAL(16),
   CONV_VALID_USER_CNT       DECIMAL(16),
   CONV_PAID_CUST_CNT       DECIMAL(16),
   CONV_PAID_USER_CNT       DECIMAL(16),
   OLAN_VALID_CUST_CNT        DECIMAL(16),
   OLAN_VALID_USER_CNT        DECIMAL(16),
   OLAN_PAID_CUST_CNT        DECIMAL(16),
   OLAN_PAID_USER_CNT        DECIMAL(16),
   NEW_CONV_CUST_CNT       DECIMAL(16),
   NEW_CONV_USER_CNT       DECIMAL(16),
   NEW_OLAN_CUST_CNT        DECIMAL(16),
   NEW_OLAN_USER_CNT        DECIMAL(16),
   LOSE_CONV_CUST_CNT       DECIMAL(16),
   LOSE_CONV_USER_CNT       DECIMAL(16),
   LOSE_OLAN_CUST_CNT        DECIMAL(16),
   LOSE_OLAN_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_Mon               CHAR(6)
)
tablespace st 


--  ST网格用户发展宽带产品订购统计
CREATE TABLE ST_GRID_USER_PRODUCT_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR2(20),
   GRID_NAME            VARCHAR2(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR2(100),
   AREA_STD_ADDR_ID     VARCHAR2(30),
   AREA_STD_ADDR_NAME   VARCHAR2(255),
   PRODUCT_ID           DECIMAL(16),
   PRODUCT_NAME         VARCHAR2(100),
   PROD_SERVICE_ID      DECIMAL(12),
   BANDWIDTH            DECIMAL(16),
   CYCLE                DECIMAL(16),
   ARPU                 DECIMAL(16, 2),
   BILLING_TYPE         DECIMAL(1),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_Mon               CHAR(6)
)
tablespace st



--  ST网格用户发展带宽统计
CREATE TABLE ST_GRID_USER_BANDWIDTH_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR2(20),
   GRID_NAME            VARCHAR2(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR2(100),
   AREA_STD_ADDR_ID     VARCHAR2(30),
   AREA_STD_ADDR_NAME   VARCHAR2(255),
   BANDWIDTH            DECIMAL(16),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_mon               CHAR(6)
)
tablespace st





--  ST网格用户发展产品计费类型统计
CREATE TABLE ST_GRID_USER_PRODUCT_BT_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   GRID_ID              VARCHAR2(20),
   GRID_NAME            VARCHAR2(100),
   MGR_ID               DECIMAL(16),
   MGR_NAME             VARCHAR2(100),
   AREA_STD_ADDR_ID     VARCHAR2(30),
   AREA_STD_ADDR_NAME   VARCHAR2(255),
   BILLING_TYPE         DECIMAL(1),
   VALID_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_mon                CHAR(6)
)
tablespace st 

;

--  ST宽带产品订购统计
CREATE TABLE ST_LAN_PRODUCT_ORDER_M  (
   CYCLE_ID             CHAR(6),
   OWN_CORP_STD_ORG_CODE VARCHAR2(20),
   OWN_CORP_STD_ORG_NAME VARCHAR2(100),
   cust_type      DECIMAL(2,0),
   cust_type_name VARCHAR(20),
   PRODUCT_ID           DECIMAL(16),
   PRODUCT_NAME         VARCHAR2(100),
   BANDWIDTH            DECIMAL(16),
   CYCLE                DECIMAL(16),
   ARPU                 DECIMAL(16, 2),
   BILLING_TYPE         DECIMAL(1),
   ORDER_USER_CNT       DECIMAL(16),
   NEW_USER_CNT         DECIMAL(16),
   LOSE_USER_CNT        DECIMAL(16),
   ETL_DATE             TIMESTAMP,
   pt_mon               CHAR(6)
)
tablespace st



CREATE TABLE IF NOT EXISTS DIM_STD_CHANNEL  (
   STD_CHANNEL_CODE       VARCHAR(20),
   STD_CHANNEL_NAME       VARCHAR(100),
   P_STD_CHANNEL_CODE     VARCHAR(20),
   STD_CHANNEL_GROUP_CODE VARCHAR(20),
   STD_CHANNEL_GROUP_NAME VARCHAR(50),
   FULLPATH               VARCHAR(100),
   ORIGINAL_CODE          VARCHAR(20),
   NOTES                  VARCHAR(200),
   IS_DISPLAY             DECIMAL(2),
   DISPLAY_ORDER          DECIMAL(16),
   IS_VALID               DECIMAL(2),
   std_org_code         VARCHAR(6),
   UPDATE_DATE            TIMESTAMP
)

CREATE TABLE `st_diff_duration_channel_view_d`(
  `cycle_id` varchar(8), 
  `own_corp_std_org_code` varchar(6), 
  `own_corp_std_org_name` varchar(50), 
  `std_channel_group_code` varchar(20), 
  `std_channel_group_name` varchar(50), 
  `std_channel_name` varchar(100), 
  `duration_id` decimal(2,0), 
  `duration_name` varchar(10), 
  `tv_time` decimal(26,2), 
  `all_tv_time` decimal(26,2), 
  `tv_user_count` decimal(26,0), 
  `total_user_count` decimal(16,0), 
  `tv_occupy_rate` decimal(21,2), 
  `tv_rate` decimal(18,2), 
  `tv_arrival_rate` decimal(27,2), 
  `avg_tv_time` decimal(20,2), 
  `loyalty_rate` decimal(18,2))
ENGINE=InnoDB DEFAULT CHARSET=utf8 ;



--  ST不同节目类型点播统计
CREATE TABLE IF NOT EXISTS ST_DR_MOVIE_TYPE_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   category                VARCHAR(50),
   dr_USER_COUNT         DECIMAL(16,0),
   dr_count                      DECIMAL(16,0),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


--  ST不同节目出品地点播统计
CREATE TABLE IF NOT EXISTS ST_DR_MOVIE_PRODUCED_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   produced                VARCHAR(50),
   dr_USER_COUNT         DECIMAL(16,0),
   dr_count                      DECIMAL(16,0),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


--  ST回看频道分析
CREATE TABLE IF NOT EXISTS ST_LB_CHANNEL_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   channel_id              VARCHAR(20),
   channel_name          VARCHAR(50),
   lb_USER_COUNT         DECIMAL(16,0),
   lb_count                      DECIMAL(16,0),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- ST各时段各频道组直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_TIME_CHANNELGROUP_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;



-- ST各时段各频道直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_DURATION_CHANNEL_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   std_channel_name   VARCHAR(100),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon                 VARCHAR(6)
)   ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- 宽带用户发展 
-- 经分日表
CREATE TABLE TF_LAN_USER_TOTAL_DAY (
  stats_dt VARCHAR(8),
  p_std_org_code VARCHAR(6),
  std_org_code VARCHAR(6),
  ind_code VARCHAR(8),
  day_cnt DECIMAL(16),
  year_net_incr DECIMAL(16),
  cum_cnt DECIMAL(15),
  month_net_incr DECIMAL(16),
  lan_rate DECIMAL(16,2),
  completion_rate DECIMAL(16,2)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- ST全流量协议分析汇总
CREATE TABLE IF NOT EXISTS ST_TBL_TRAFFIC_SUMMARY  (
   CYCLE_ID              VARCHAR(8),
   create_time            TIMESTAMP NULL ,
   content_code          VARCHAR(20),
   content_NAME       VARCHAR(200),
   std_content_type     VARCHAR(100),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   total_gbs               DECIMAL(16,2),
   ETL_DATE              TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
   pt_time                 VARCHAR(8)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- 标准行政区划 （省）
CREATE TABLE IF NOT EXISTS dim_std_area  (
  std_area_code VARCHAR(7) PRIMARY KEY,
  std_area_name VARCHAR(100)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- ST AS域流量统计
CREATE TABLE IF NOT EXISTS ST_AS_SUM_REPORT   (
   CYCLE_ID              VARCHAR(8),
   nodeid                  VARCHAR(11),
   AS_TYPE               VARCHAR(20),
   std_area_code       VARCHAR(7),
   std_area_name       VARCHAR(100),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_time                 VARCHAR(8),
   PRIMARY KEY (cycle_id,nodeid,as_type,std_area_code)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 ;

-- 标准as type
  CREATE TABLE ST.DIM_STD_ASTYPE 
   (	AS_TYPE_ID INT PRIMARY KEY , 
	AS_TYPE_NAME VARCHAR(200)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


-- ST 总体域名流量排名
CREATE TABLE IF NOT EXISTS ST_DNAME_TOPN   (
   CYCLE_ID              VARCHAR(8),
   nodeid                  VARCHAR(11),
   DNAME                VARCHAR(200),
   in_gbs                   DECIMAL(16,2),
   out_gbs                 DECIMAL(16,2),
   total_gbs                 DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_time                 VARCHAR(8)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;



-- ST各时段各节目直播收视情况
CREATE TABLE IF NOT EXISTS ST_DIFF_DURATION_PROGRAM_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   std_channel_group_code          VARCHAR(5),
   std_channel_group_name         VARCHAR(20),
   std_channel_name   VARCHAR(100),
   program_name   VARCHAR(500),
   duration_id             DECIMAL(2),
   duration_name        VARCHAR(20),
   tv_time                   DECIMAL(16,2),
   all_tv_time              DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
  pro_begin_time VARCHAR(6),
  pro_end_time   VARCHAR(6),
  program_type   VARCHAR(20),
  broad_type      VARCHAR(10),
  program_num    INT,
   pro_begin_minute_code INT ,
   pro_end_minute_code INT ,
   pt_mon                 VARCHAR(8)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;

-- 直播节目/栏目分类
CREATE TABLE dim_std_program_type (
  std_org_code varchar(6) NOT NULL,
  area_name varchar(20) DEFAULT NULL,
  program_type_code varchar(10) NOT NULL,
  program_type_name varchar(100) DEFAULT NULL,
  channel_name varchar(100) NOT NULL,
  program_name varchar(500) NOT NULL,
  program_time varchar(500) DEFAULT NULL,
  remark varchar(1000) DEFAULT NULL,
  PRIMARY KEY (std_org_code,program_type_code,channel_name,program_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


--ST直播各分钟各节目收视情况(日)
CREATE TABLE IF NOT EXISTS ST_TV_DIFF_MIN_PROGRAM_VIEW_D  (
   CYCLE_ID              VARCHAR(8),
   OWN_CORP_STD_ORG_CODE VARCHAR(6),
   OWN_CORP_STD_ORG_NAME VARCHAR(50),
   STD_CHANNEL_CODE      VARCHAR(20),
   STD_CHANNEL_NAME      VARCHAR(100),
   PROGRAM_NAME   VARCHAR(500),
   PRO_BEGIN_TIME          VARCHAR(20),
   PRO_END_TIME             VARCHAR(20),
   STD_MINUTE_CODE       VARCHAR(10),
   STD_MINUTE_NAME       VARCHAR(6),
   tv_time                   DECIMAL(16,2),
   tv_user_count          DECIMAL(16),
   tv_occupy_rate       DECIMAL(16,2),
   tv_rate                  DECIMAL(16,2),
   tv_arrival_rate       DECIMAL(16,2),
   avg_tv_time          DECIMAL(16,2),
    loyalty_rate          DECIMAL(16,2),
   ETL_DATE              TIMESTAMP,
   pt_mon               VARCHAR(8)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


CREATE TABLE dim_std_category
  (
    channel_name          VARCHAR(100),
    category_name         VARCHAR(500),
    start_time                 VARCHAR(6),
    start_minute_code     INT,
    end_time                VARCHAR(6),
    end_minute_code     INT,
    day_of_week           INT,
    remark                     VARCHAR(1000),
    update_time             timestamp
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


CREATE TABLE dim_std_minute (
	std_minute_code INT PRIMARY KEY ,
	std_minute_name VARCHAR(6),
	min_value VARCHAR(6),
	max_value VARCHAR(6),
	fullpath VARCHAR(255),
	original_code VARCHAR(255),
	notes VARCHAR(255),
	is_display INT,
	display_order INT,
	is_valid INT,
	update_date TIMESTAMP 
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


```



###### update_kpi_data

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_data`(IN update_month CHAR(7),internal_flow_rate DECIMAL(4,2))
BEGIN
  -- 融合非融合用户统计
  CALL update_kpi_conv_user_stats(update_month) ;
  -- 各带宽用户
  CALL update_kpi_bandwidth_user_stats(update_month) ;
  -- 宽带用户发展
  CALL update_kpi_user_dev_stats(update_month) ;

  -- 流量入库 flow_stats
  CALL update_flow_stats(update_month) ;
  -- 内网流量占比
  CALL update_internal_flow_rate(update_month,internal_flow_rate) ;
  -- 流量
  CALL update_kpi_flow_stats(update_month);

  -- 可视化用户
  CALL update_lan_user_stats_rates(update_month);
  -- arpu
  CALL update_dp_lan_arpu(update_month);

  -- 网格数据
  CALL update_dp_grid_user_stats(update_month) ;
  -- 小区数据
  CALL update_dp_area_user_stats(update_month) ;

  -- 在线率
  CALL update_dp_user_onlinerate(update_month) ;


  -- new表更新
  CALL dp_new_table_modify_proc(update_month);

END
```

###### dp_new_table_modify_proc

```
CREATE DEFINER=`st`@`%` PROCEDURE `dp_new_table_modify_proc`(IN update_month CHAR(7))
BEGIN
  DELETE FROM lan_user_stats_rates_new WHERE stats_dt = update_month;
  DELETE FROM dp_user_onlinerate_new WHERE stats_dt = update_month;
  DELETE FROM dp_lan_arpu_new WHERE stats_dt = update_month;
  DELETE FROM kpi_flow_stats_new WHERE stats_dt = update_month;

  insert into lan_user_stats_rates_new
  select  stats_dt
       ,STD_ORG_CODE
       ,AREA
       ,MUBIAO
       ,VALID_USER_CNT
       ,PAID_USER_CNT
       ,TV_PAID_USER_CNT
       ,COMPLETION_RATE
       ,PAID_RATE
       ,LAN_USER_RATE
       ,FLOWS
       ,FLOWS_PER_USERS
       ,net_acc_incr_usr_cnts
      ,current_timestamp()
  from  lan_user_stats_rates t where t.stats_dt =update_month;

  insert into dp_user_onlinerate_new
  select t.*,current_timestamp() from  dp_user_onlinerate t where t.stats_dt =update_month;
  insert into dp_lan_arpu_new
  select t.*,current_timestamp() from  dp_lan_arpu t where t.stats_dt =update_month;
  insert into kpi_flow_stats_new
  select t.*,current_timestamp() from  kpi_flow_stats t where t.stats_dt =update_month;
  commit;
END
```

###### get_last_update_month

```
CREATE DEFINER=`st`@`%` FUNCTION `get_last_update_month`() RETURNS char(7) CHARSET utf8
return (select substr(max(datemonth) from 1 for 7)  from datasource1)
```

###### param_add_adjust_pro

```
CREATE DEFINER=`st`@`%` PROCEDURE `param_add_adjust_pro`(IN update_month CHAR(7))
BEGIN

  -- 用户数
  DELETE FROM lan_user_stats_rates_new WHERE stats_dt = update_month;
  INSERT INTO lan_user_stats_rates_new
  SELECT  t1.stats_dt
         ,t2.std_org_code
         ,t2.area
         ,t2.mubiao
         ,COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0)  valid_user_cnt
         ,COALESCE(t2.paid_user_cnt,0) + COALESCE(t1.paid_user_cnt,0) paid_user_cnt
         ,t2.tv_paid_user_cnt
         ,COALESCE(ROUND((COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0)-t3.last_year_user_cnts)/NULLIF(t3.increase_mubiao,0) * 100, 2),0) completion_rate -- 指标完成率
         ,round((COALESCE(t2.paid_user_cnt,0) + COALESCE(t1.paid_user_cnt,0))/(COALESCE(t2.valid_user_cnt,0) + COALESCE(t1.valid_user_cnt,0))*100,2)  paid_rate
         ,t2.lan_user_rate  -- 宽带接入率
         ,COALESCE(t2.flows,0) + COALESCE(t1.flows,0)  -- 总流量
         ,COALESCE(t2.flows_per_users,0)+COALESCE(t1.flows_per_users,0)   flows_per_users -- 万户带宽
         ,current_timestamp()
    FROM param_add_adjust t1
    LEFT JOIN lan_user_stats_rates t2 ON t1.std_org_code = t2.std_org_code
         AND  t2.stats_dt = update_month
    LEFT JOIN t_mubiao t3 ON t1.std_org_code = t3.std_org_code and t3.m_year = substr(update_month,1,4)
    where t1.stats_dt = update_month
    ;
  COMMIT ;
  -- 在线率
  DELETE FROM dp_user_onlinerate_new WHERE stats_dt = update_month;
  INSERT INTO dp_user_onlinerate_new
  SELECT  t1.stats_dt
         ,t2.std_org_code
         ,t2.area
         ,t2.online_user_cnt
         ,coalesce(t2.paid_user_cnt,0)+coalesce(t1.paid_user_cnt,0)
         ,coalesce(t1.online_rate,0)+coalesce(t2.online_rate,0)  online_rate
         ,current_timestamp()
    FROM param_add_adjust t1
    LEFT JOIN dp_user_onlinerate t2 ON t1.std_org_code = t2.std_org_code
         AND  t2.stats_dt = update_month
    where t1.stats_dt = update_month
          ;
  COMMIT ;

  -- arpu
  DELETE FROM dp_lan_arpu_new WHERE stats_dt = update_month;
  INSERT INTO dp_lan_arpu_new
  SELECT
        t2.area
       ,t2.std_org_code
       ,coalesce(t2.lan_arpu,0)+coalesce(t1.lan_arpu,0) lan_arpu
       ,coalesce(t2.com_arpu,0)+coalesce(t1.lan_arpu,0) com_arpu
       ,t1.stats_dt
       ,current_timestamp()
  FROM param_add_adjust t1
  LEFT JOIN dp_lan_arpu t2 ON t1.std_org_code = t2.std_org_code
       AND  t2.stats_dt = update_month
  where t1.stats_dt = update_month
  ;
  COMMIT ;

  -- flows
  DELETE FROM kpi_flow_stats_new WHERE stats_dt = update_month;
  INSERT INTO kpi_flow_stats_new
  SELECT
       t1.stats_dt
       ,t2.std_org_code
       ,t2.area
       ,coalesce(t2.flows,0)+coalesce(t1.flows,0) flows
       ,t2.flow_rate
       ,t2.mix_flows
       ,t2.mix_flow_rate
       ,t2.self_pur_flows
       ,t2.internal_flows
       ,t2.internal_flow_rate
       ,coalesce(t2.lan_paid_user_cnt,0)+COALESCE(t1.paid_user_cnt,0)  paid_user_cnt -- 缴费用户数
       ,coalesce(t2.flows_per_users,0)+coalesce(t1.flows_per_users,0) flows_per_users
       ,current_timestamp()
  FROM param_add_adjust t1
  LEFT JOIN kpi_flow_stats t2 ON t1.std_org_code = t2.std_org_code
       AND  t2.stats_dt = update_month
  where t1.stats_dt = update_month
  ;
  COMMIT ;

END
```

###### update_dp_area_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_area_user_stats`(IN update_month char(7))
BEGIN 
    DELETE FROM dp_area_user_stats WHERE stats_dt = update_month ;
    INSERT INTO  dp_area_user_stats 
   select insert(t.cycle_id,5,0,'-') AS stats_dt,t.own_corp_std_org_code AS std_org_code,t.grid_id,t.grid_name,t.area_std_addr_id AS  std_area_id,t.area_std_addr_name AS std_area_name,
        t.lan_valid_user_cnt,
        t.lan_paid_user_cnt,
        t.dtv_valid_user_cnt,
        t.dtv_paid_user_cnt,
        c.paid_cust_cnt,
        t.new_lan_user_cnt,
        t.lose_lan_user_cnt,
       case when t.lan_valid_user_cnt = 0 then 0
       else round ( t.lan_paid_user_cnt/t.lan_valid_user_cnt * 100,2) end as paid_rate,
       case when COALESCE(c.paid_cust_cnt,0) = 0 then 0
              else round (t.lan_valid_user_cnt/ c.paid_cust_cnt * 100,2) end as lan_rate,
       o.short_name AS area
from st_grid_user_dev_m t
LEFT JOIN st_grid_cust_dev_m c
ON t.cycle_id = c.cycle_id
AND t.cust_type = c.cust_type
AND t.own_corp_std_org_code  = c.own_corp_std_org_code
AND t.grid_id = c.grid_id
AND t.area_std_addr_id = c.area_std_addr_id
LEFT JOIN dim_std_organize o 
ON o.std_org_code = t.own_corp_std_org_code
WHERE t.lan_valid_user_cnt > 0 
  AND t.area_std_addr_id IS NOT NULL
  AND t.own_corp_std_org_code IS NOT NULL
  AND t.cust_type = 1
  AND t.CYCLE_ID = replace(update_month,'-','') ;
  END
```

###### update_dp_grid_area_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_grid_area_user_stats`(IN update_month char(7))
BEGIN
        DELETE FROM DP_GRID_AREA_USER_STATS WHERE stats_dt = update_month;
        INSERT INTO DP_GRID_AREA_USER_STATS
        select   update_month
                ,T1.own_corp_std_org_code
                ,T1.grid_id
                ,T1.grid_name
                ,T1.area_std_addr_id
                ,T1.area_std_addr_name
                ,T1.lan_valid_user_cnt
                ,T1.lan_paid_user_cnt
                ,T1.dtv_valid_user_cnt
                ,T1.dtv_paid_user_cnt
                ,T2.paid_cust_cnt  dtv_paid_cust_cnt
                ,T2.conv_cust_cnt
                ,T2.olan_cust_cnt
                ,T1.new_lan_user_cnt
                ,T1.lose_lan_user_cnt
                ,case when T1.lan_valid_user_cnt = 0 then 0
                 else round((T1.lan_paid_user_cnt/T1.lan_valid_user_cnt)* 100,2) end as paid_rate
                ,case when COALESCE(T2.paid_cust_cnt,0) = 0 then 0
                 else round ((T1.lan_valid_user_cnt/T2.paid_cust_cnt) * 100,2) end as lan_rate
                ,T3.short_name
          From
          (select own_corp_std_org_code
                 ,grid_id
                 ,grid_name
                 ,area_std_addr_id
                 ,area_std_addr_name
                 ,sum(lan_valid_user_cnt) lan_valid_user_cnt
                 ,sum(lan_paid_user_cnt)  lan_paid_user_cnt
                 ,sum(dtv_valid_user_cnt)  dtv_valid_user_cnt
                 ,sum(DTV_PAID_USER_CNT)  dtv_paid_user_cnt
                 ,sum(new_lan_user_cnt)   new_lan_user_cnt
                 ,sum(lose_lan_user_cnt)  lose_lan_user_cnt
          from  st_grid_user_dev_m
          where pt_mon=replace(update_month,'-','')
            and area_std_addr_id is not null
          group by own_corp_std_org_code,grid_id,grid_name,area_std_addr_id,area_std_addr_name
          ) T1
          join
          (select  own_corp_std_org_code
                  ,grid_id
                  ,grid_name
                  ,area_std_addr_id
                  ,area_std_addr_name
                  ,sum(paid_cust_cnt) as paid_cust_cnt
                  ,sum(conv_valid_cust_cnt) as conv_cust_cnt
                  ,SUM(olan_valid_cust_cnt)  AS olan_cust_cnt
          from st_grid_cust_dev_m
          where pt_mon=replace(update_month,'-','')
            and area_std_addr_id is not null
          group by own_corp_std_org_code,grid_id,grid_name,area_std_addr_id,area_std_addr_name
          ) T2
          on T1.own_corp_std_org_code=T2.own_corp_std_org_code
          and T1.grid_id = T2.grid_id
          and T1.area_std_addr_id = T2.area_std_addr_id
          join dim_std_organize T3 on T1.own_corp_std_org_code=T3.std_org_code
        ;

    END
```

###### update_dp_grid_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_grid_user_stats`(IN update_month char(7) )
BEGIN
        DELETE FROM DP_GRID_USER_STATS WHERE stats_dt = update_month;
        INSERT INTO DP_GRID_USER_STATS 
        select insert(t.cycle_id,5,0,'-') AS stats_dt,t.own_corp_std_org_code AS std_org_code,
               t.grid_id,coalesce (g.grid_name,t.grid_name) grid_name,CAST(t.mgr_id AS char) AS mgr_id,coalesce(g.mgr_name,t.mgr_name) as mgr_name,
               sum(lan_valid_user_cnt) as lan_valid_user_cnt ,
               sum(lan_paid_user_cnt) as lan_paid_user_cnt,
               sum(dtv_valid_user_cnt) as dtv_valid_user_cnt,
               sum(dtv_paid_user_cnt) as dtv_paid_user_cnt,
               sum(c.paid_cust_cnt) as dtv_paid_cust_cnt,
               sum(c.conv_valid_cust_cnt) as conv_cust_cnt,
               SUM(c.olan_valid_cust_cnt)  AS olan_cust_cnt,
               sum(new_lan_user_cnt) as new_lan_user_cnt,
               sum(lose_lan_user_cnt) as lose_lan_user_cnt,
               case when sum(lan_valid_user_cnt) = 0 then 0
               else round ( sum(lan_paid_user_cnt)/sum(lan_valid_user_cnt) * 100,2) end as paid_rate,
               case when COALESCE(sum(c.paid_cust_cnt),0) = 0 then 0
                      else round (sum(lan_valid_user_cnt)/sum(c.paid_cust_cnt) * 100,2) end as lan_rate,
                      d.SHORT_NAME AS area 
        from st_grid_user_dev_m t
        LEFT JOIN st_grid_cust_dev_m c
        ON t.cycle_id = c.cycle_id
        AND t.own_corp_std_org_code  = c.own_corp_std_org_code
        AND t.grid_id = c.grid_id
        AND COALESCE(t.area_std_addr_id,'null') = COALESCE(c.area_std_addr_id,'null')
        AND t.cust_type = c.cust_type
        left join some_grid_name g
        on t.grid_id = g.grid_id
        LEFT JOIN DIM_STD_ORGANIZE d 
        ON d.STD_ORG_CODE = t.OWN_CORP_STD_ORG_CODE
        WHERE t.own_corp_std_org_code IS NOT NULL
        AND t.cust_type = 1
        AND t.CYCLE_ID = replace(update_month,'-','')
        group by t.cycle_id,t.own_corp_std_org_code,t.grid_id,coalesce (g.grid_name,t.grid_name) ,t.mgr_id,coalesce(g.mgr_name,t.mgr_name),d.SHORT_NAME  ;
   
    END
```

###### update_dp_lan_arpu

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_lan_arpu`(IN update_month CHAR(7))
BEGIN

  DELETE FROM dp_lan_arpu WHERE stats_dt = update_month ;

    -- 地区采用分公司的平均值
  insert into dp_lan_arpu
  select t1.short_name
         ,t.std_org_code
         ,t.lan_arpu
         ,t.comp_arpu
         ,update_month
  from
  (select
          round(avg(t1.lan_arpu),2) lan_arpu
         ,round(avg(t1.comp_arpu),2) comp_arpu
         ,coalesce(t2.std_org_code,t2.p_std_org_code)  std_org_code
         ,t2.p_std_org_code
  from st_arpu t1
  left join dim_std_organize t2 on regexp_replace(t1.corp_org_name,'分公司|公司|广电|中广有线','') = regexp_replace(t2.std_org_name,'分公司|公司|广电','')
  where t1.pt_mon=replace(update_month,'-','')
  group by t2.p_std_org_code,t2.std_org_code with rollup
  ) t
 left join dim_std_organize t1 on t.std_org_code = t1.std_org_code
 -- left join dp_lan_arpu t1 on t.std_org_code = t1.std_org_code
 --    and t1.stats_dt = substring(date_sub(concat(update_month, '-01'),interval 1 month),'1','7')
  where t.std_org_code > 0 and t.std_org_code is not null
     ;
  END
```

###### update_dp_user_online

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_user_online`(IN update_month CHAR(7))
BEGIN
  
  DELETE FROM dp_user_online WHERE stats_dt = update_month ; 

  INSERT INTO dp_user_online 
  SELECT t1.stats_dt,
         t1.std_org_code,
         t2.short_name AS area,
         t1.online_user_cnt,
         t1.paid_user_cnt,
         t1.online_rate
    FROM (
      SELECT substr(CAST(l.datemonth AS CHAR),1,7) AS  stats_dt,
             COALESCE(o.std_org_code,O.P_STD_ORG_CODE, '10') AS std_org_code,
             COALESCE(SUM(A.ONLINE_USER_COUNT),0) AS online_user_cnt,
             COALESCE(SUM(L.jiaofei),0) AS paid_user_cnt,
             COALESCE(ROUND(SUM(A.ONLINE_USER_COUNT) /NULLIF(SUM(L.jiaofei),0) * 100, 2),0) online_rate
        FROM DIM_STD_ORGANIZE O
               LEFT JOIN datasource1 L
                   ON l.name IN (o.STD_ORG_NAME,o.ANOTHER_NAME)
               AND l.datemonth >= DATE '2018-01-01'
               LEFT JOIN ST_AUTH_M A
                   ON A.OWN_CORP_STD_ORG_CODE = O.STD_ORG_CODE
               AND A.CYCLE_ID = date_format(l.datemonth,'%Y%m')
       WHERE length(o.STD_ORG_CODE) = 6 
         AND o.STD_ORG_CODE LIKE '%01'
         AND o.IS_DISPLAY = '1'
       GROUP BY substr(CAST(l.datemonth AS CHAR),1,7), O.P_STD_ORG_CODE,O.std_org_code WITH ROLLUP 
      HAVING  stats_dt IS NOT NULL
    ) t1 
           LEFT JOIN dim_std_organize t2
               ON t1.std_org_code = t2.std_org_code
   WHERE t1.stats_dt = update_month ;

END
```

###### update_dp_user_onlinerate

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_dp_user_onlinerate`(IN update_month CHAR(7))
BEGIN

  DELETE FROM dp_user_onlinerate WHERE stats_dt = update_month ;

  INSERT INTO dp_user_onlinerate
  select update_month
        ,T.std_org_code
        ,T1.short_name as area
        ,T.online_user_cnt
        ,T.paid_user_cnt
        ,case when T.paid_user_cnt =0 then 0 else
          round(T.online_user_cnt/T.paid_user_cnt*100,2)
        end  online_rate
  from (
      select
                COALESCE(t1.own_corp_std_org_code,COALESCE(t2.p_std_org_code,'10'))  std_org_code
                ,sum(case when t1.online_user_cnt<100 then 0
                      when t1.online_user_cnt>t3.jiaofei then t3.jiaofei
                 else t1.online_user_cnt end)  online_user_cnt
                ,sum(case when t1.online_user_cnt<100 then 0 else t3.jiaofei end) paid_user_cnt
         from ST_USER_ONLINERATE_M t1
         left join dim_std_organize t2 on t1.own_corp_std_org_code = t2.std_org_code and t2.is_display='1'
         left join datasource1  t3  on t3.name IN (t2.STD_ORG_NAME,t2.ANOTHER_NAME) and t3.datemonth = concat(update_month,'-01')
      where t1.pt_mon =replace(update_month,'-','')
           and length(t1.own_corp_std_org_code) = 6
      group by t2.p_std_org_code,t1.own_corp_std_org_code with rollup
      ) T
   left join dim_std_organize T1 on T.std_org_code = T1.std_org_code
   order by T.std_org_code
   ;
END
```

###### update_flow_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_flow_stats`(IN update_month  CHAR(7))
BEGIN
    DECLARE last_month CHAR(7) DEFAULT NULL ;
    SET last_month =  substr(CAST(CAST(concat(update_month,'-01') AS date) - INTERVAL 1 MONTH  AS char),1,7) ;

    DELETE FROM FLOW_STATS WHERE STATS_DT = update_month ;

    INSERT INTO FLOW_STATS (STD_ORG_CODE,STATS_DT,SELF_PUR_FLOW,SELF_PUR_COST,PROX_SETTLE_FLOW,ORG_NAME,MIX_FLOW,INTERNAL_FLOW,EXTERNAL_FLOW)
    SELECT STD_ORG_CODE,update_month,SELF_PUR_FLOW,SELF_PUR_COST,PROX_SETTLE_FLOW,ORG_NAME,MIX_FLOW,INTERNAL_FLOW,EXTERNAL_FLOW
      FROM FLOW_STATS
     WHERE STATS_DT = last_month ;

    -- 混合流量、自购流量数据处理
    -- CALL update_mix_flows(update_month) ;
    -- CALL update_self_flows(update_month) ;

    UPDATE flow_stats T
       SET mix_flow = COALESCE((SELECT m.mix_flow FROM tmp_mix_flow m WHERE m.stats_dt = T.stats_dt  AND m.std_org_code = T.std_org_code ),mix_flow,0),
           self_pur_flow = COALESCE((SELECT s.flow FROM tmp_self_flow S WHERE S.stats_dt = T.stats_dt  AND S.std_org_code = T.std_org_code ),self_pur_flow,0)
     WHERE T.stats_dt = update_month ;

    COMMIT ;


  END
```

###### update_internal_flow_rate

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_internal_flow_rate`(IN update_month  CHAR(7),IN internal_flow_rate DECIMAL(4,2))
BEGIN
  DELETE FROM kpi_internal_flow_rate WHERE stats_dt = update_month ;

  INSERT INTO kpi_internal_flow_rate (stats_dt,std_org_code,area,internal_flow_rate) VALUES (update_month,'10','全省',internal_flow_rate)  ; 

  COMMIT;

END
```

###### update_kpi_bandwidth_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_bandwidth_user_stats`(IN update_month CHAR(7))
BEGIN 
        DELETE FROM kpi_bandwidth_user_stats WHERE stats_dt = update_month;

        INSERT INTO kpi_bandwidth_user_stats 
        SELECT * FROM kpi_bandwidth_user_stats_base WHERE stats_dt = update_month ;
        COMMIT ; 
      END
```

###### update_kpi_conv_user_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_conv_user_stats`(IN update_month CHAR(7))
BEGIN 
        DELETE FROM kpi_conv_user_stats WHERE stats_dt = update_month;

        INSERT INTO kpi_conv_user_stats 
        SELECT * FROM kpi_conv_user_stats_base WHERE stats_dt = update_month ;
        COMMIT ; 
      END
```

###### update_kpi_flow_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_flow_stats`(IN update_month CHAR(7))
BEGIN 
          DELETE FROM kpi_flow_stats WHERE stats_dt = update_month;

          INSERT INTO kpi_flow_stats 
          SELECT a1.stats_dt,
                 a1.std_org_code,
                 a2.short_name AS area,
                 a1.flows,
                 a1.flow_rate,
                 a1.mix_flows,
                 a1.mix_flow_rate,
                 a1.self_pur_flows,
                 a1.internal_flows,
                 a1.internal_flow_rate,
                 a1.lan_paid_user_cnt,
                 a1.flows_per_users
            FROM (
              SELECT coalesce(t2.stats_dt,t1.STATS_DT) AS stats_dt,
                     COALESCE(t3.std_org_code,t3.p_std_org_code,'10') AS std_org_code,
                     SUM(COALESCE(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW, 0.00))  AS flows, 
                     COALESCE(round(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW)/NULLIF(MAX(t4.total_flows),0) *100,2),0) AS flow_rate, 
                     COALESCE(SUM(t1.mix_flow),0) AS mix_flows, 
                     COALESCE(round(SUM(t1.mix_flow)/NULLIF(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW),0) * 100 ,2),0) AS mix_flow_rate, 
                     COALESCE(SUM(t1.self_pur_flow),0) AS self_pur_flows,                                          
                     COALESCE(SUM(t1.internal_flow),0) AS internal_flows, 
                     COALESCE(round(SUM(t1.internal_flow)/NULLIF(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW),0) * 100 ,2),0) AS internal_flow_rate, 
                     COALESCE(SUM(t2.lan_paid_user_cnt),0) AS lan_paid_user_cnt,
                     COALESCE(round(SUM(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW)/(NULLIF(SUM(t2.lan_paid_user_cnt),0) /10000) ,2),0) AS flows_per_users 
                FROM dim_std_organize t3
                       LEFT JOIN  FLOW_STATS t1        
                           ON t1.std_org_code = t3.std_org_code
                       LEFT JOIN kpi_user_dev_stats  t2    
                           ON t3.std_Org_code = t2.std_org_code
                       AND LENGTH(t2.std_org_code) = 6 
                       AND COALESCE(t1.stats_dt,t2.stats_dt) = t2.stats_dt
                       LEFT JOIN (SELECT stats_dt,SUM(INTERNAL_FLOW + EXTERNAL_FLOW + MIX_FLOW + PROX_SETTLE_FLOW + SELF_PUR_FLOW) AS total_flows FROM FLOW_STATS GROUP BY stats_dt ) t4
                           ON t1.stats_dt = t4.stats_dt
               WHERE (COALESCE(T1.INTERNAL_FLOW + T1.EXTERNAL_FLOW + T1.MIX_FLOW + T1.PROX_SETTLE_FLOW + T1.SELF_PUR_FLOW,0.0) > 0.0
                      OR  t3.p_std_org_code IN ('1001','1009'))    
                 AND LENGTH(t3.std_org_code) = 6
                 AND t3.is_display = '1'
                 AND COALESCE(t2.stats_dt,t1.stats_dt) = update_month 
               GROUP BY coalesce(t2.stats_dt,t1.STATS_DT),t3.p_std_org_code,t3.std_org_code WITH ROLLUP 
              HAVING coalesce(t2.stats_dt,t1.STATS_DT) IS NOT NULL 
            ) a1 
                   LEFT JOIN dim_std_organize a2 
                       ON a1.std_org_code = a2.std_org_code ;

        END
```

###### update_kpi_user_dev_stats

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_kpi_user_dev_stats`(IN update_month CHAR(7))
BEGIN 
    DELETE FROM kpi_user_dev_stats WHERE stats_dt = update_month;

    INSERT INTO kpi_user_dev_stats 
      SELECT COALESCE(p1.stats_dt,p2.stats_dt) AS stats_dt,
             d.std_org_code,
             d.std_org_name,
             COALESCE(p1.lan_valid_user_cnt,0) AS lan_valid_user_cnt,
             COALESCE(p1.lan_paid_user_cnt,0) AS lan_paid_user_cnt,
             COALESCE(p1.paid_rate,0) AS paid_rate,
             COALESCE(p2.dtv_paid_user_cnt,0) AS dtv_paid_user_cnt,
             COALESCE(p1.new_lan_user_cnt,0) AS new_lan_user_cnt,
             COALESCE(p1.lose_lan_user_cnt,0) AS lose_lan_user_cnt,
             COALESCE(p1.lan_valid_user_cnt,0)-COALESCE(p4.last_year_user_cnts,0) as net_inc_lan_user_cnt,   
             COALESCE(p3.lan_rate,0) AS lan_user_rate
      FROM dim_std_organize d 
      LEFT JOIN 
      (  SELECT date_format(t1.datemonth,'%Y-%m') AS stats_dt,
               COALESCE(t2.std_org_code,t3.p_std_org_code,'10') AS std_org_code,
               COALESCE(SUM(t1.zaiwang),0) AS lan_valid_user_cnt,
               COALESCE(SUM(t1.jiaofei),0) AS lan_paid_user_cnt,
               COALESCE(round(SUM(t1.jiaofei)/NULLIF(SUM(t1.zaiwang),0)*100,2)) AS paid_rate, -- 缴费率
               COALESCE(SUM(t1.newnum),0) AS new_lan_user_cnt, -- 新增宽带有效用户
               COALESCE(SUM(t1.losename),0) AS lose_lan_user_cnt       
          FROM datasource1 t1
                 INNER JOIN  tmp_organize_name t2
                     ON  t1.name IN (t2.org_name,t2.another_name,t2.another_name1)
                 INNER JOIN dim_std_organize t3
                     ON t2.std_org_code = t3.std_org_code 
         WHERE  t1.datemonth >= DATE  '2018-01-01'
         GROUP BY date_format(t1.datemonth,'%Y-%m') ,t3.p_std_org_code,t2.std_org_code WITH ROLLUP 
        HAVING stats_dt IS NOT NULL 
      ) p1 
      ON d.std_org_code = p1.std_org_code 
      LEFT JOIN (
        SELECT INSERT(cycle_id,5,0,'-') AS stats_dt,
               own_corp_std_org_code AS std_org_code,
               COALESCE(SUM(dtv_paid_user_count),0) AS dtv_paid_user_cnt
          FROM st_new_user_dev_m 
         GROUP BY cycle_id,own_corp_std_org_code
      ) p2                            -- 电视缴费用户数
      ON COALESCE(p1.stats_dt,p2.stats_dt) = p2.stats_dt 
      AND d.std_org_code = p2.std_org_code
      LEFT JOIN (
            select  INSERT(substr(stats_dt,1,6),5,0,'-') AS stats_dt
                    ,lan_rate as lan_rate
                    ,std_org_code
            from TF_LAN_USER_TOTAL_DAY 
            where stats_dt = last_day(concat(replace(update_month,'-',''),'01'))
          ) p3                            -- 接入率
       ON d.std_org_code = p3.std_org_code  AND COALESCE(p1.stats_dt,p3.stats_dt) = p3.stats_dt 
      LEFT JOIN t_mubiao p4 on d.std_org_code = p4.std_org_code and p4.m_year='2019'
      WHERE COALESCE(p1.stats_dt,p2.stats_dt) = update_month ;

  END
```

###### update_lan_user_stats_rates

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_lan_user_stats_rates`(IN update_month CHAR(7))
BEGIN
  -- 修改记录
  -- 201903 swj
  -- 修改完成率  指标完成率=本年度累计净增用户数/本年度目标净增用户数
  -- 20190412 增加本年度累计净增用户数指标 = 本年度有效用户-上年度年底有效用户数
  -- 20190412 alter table lan_user_stats_rates add (net_acc_incr_usr_cnts decimal(16,0) DEFAULT 0 comment'本年度累计净增用户数')
  -- 20190702 alter table lan_user_stats_rates add(
  --     new_lan_user_cnt decimal(38,0) DEFAULT 0 COMMENT '新增宽带用户数'
  --     lose_lan_user_cnt decimal(38,0) DEFAULT 0 COMMENT '流失宽带用户数',
  -- )
  DELETE FROM lan_user_stats_rates WHERE stats_dt = update_month;
  INSERT INTO lan_user_stats_rates
  SELECT COALESCE(t2.STATS_DT,t3.stats_dt) AS stats_dt,
         t1.std_org_code AS std_org_code,
         t1.short_name AS area,
         COALESCE(t4.mubiao, 0) AS  mubiao, -- 目标
         COALESCE(t2.lan_valid_user_cnt, 0) AS  valid_user_cnt, -- 宽带有效用户数
         COALESCE(t2.lan_paid_user_cnt, 0) AS paid_user_cnt, -- 宽带缴费用户数
         COALESCE(t2.dtv_paid_user_cnt,0) AS tv_paid_user_cnt, -- 电视缴费用户数
         case when COALESCE(t2.lan_valid_user_cnt, 0)>=COALESCE(t4.mubiao, 0) and COALESCE(t4.increase_mubiao, 0)=0
             then 100
         else
         COALESCE(ROUND((COALESCE(t2.lan_valid_user_cnt, 0)-t4.last_year_user_cnts)/NULLIF(t4.increase_mubiao,0) * 100, 2),0)
         end completion_rate, -- 指标完成率
         COALESCE(t2.paid_rate,0) AS paid_rate, -- 缴费率
         COALESCE(t2.lan_user_rate, 0) AS  lan_user_rate, -- 宽带接入率
         COALESCE(t3.flows,0.0) AS flows, -- 总流量
         COALESCE(t3.flows_per_users,0.0)  AS  flows_per_users ,-- 万户带宽
         COALESCE(t2.lan_valid_user_cnt,0)-COALESCE(t4.last_year_user_cnts,0) AS net_acc_incr_usr_cnts,  -- 累计净增增用户数
         COALESCE(t2.new_lan_user_cnt,0) as new_lan_user_cnt, -- 宽带新增用户数
         COALESCE(t2.lose_lan_user_cnt,0) as lose_lan_user_cnt -- 宽带流失用户数
    FROM dim_std_organize t1
           LEFT JOIN kpi_user_dev_stats t2  -- 用户
               ON t1.std_org_code = t2.std_org_code
           AND  t2.stats_dt = update_month
           LEFT JOIN kpi_flow_stats t3     -- 流量
               ON t1.std_org_code = t3.std_org_code
           AND  t3.stats_dt = update_month
           LEFT JOIN T_MUBIAO t4 -- 目标
               ON t4.STD_ORG_CODE = T1.STD_ORG_CODE
           AND t4.M_YEAR = COALESCE(SUBSTR(T2.STATS_DT, 1, 4) ,t4.m_year)
   WHERE t1.is_display = '1' ;
  COMMIT ;
END
```

###### update_mix_flows

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_mix_flows`(IN update_month  CHAR(7))
BEGIN
  DECLARE v_month CHAR(7) DEFAULT NULL ;

  SET v_month = update_month;

  if NOT COALESCE((SELECT COUNT(1) FROM tmp_mix_flow WHERE std_org_code = '100101' AND stats_dt = v_month),0) > 0 THEN 
    INSERT INTO tmp_mix_flow (stats_dt,std_org_code,org_name,mix_flow) SELECT v_month,'100101','南京分公司',SUM(mix_flow) FROM tmp_mix_flow WHERE TRIM(org_name) LIKE '南京分公司%'  AND stats_dt = v_month AND std_org_code IS NULL  ;
  END if ;

  DELETE FROM tmp_mix_flow WHERE TRIM(org_name) LIKE '南京分公司%' AND stats_dt = v_month AND std_org_code IS NULL  ;

  UPDATE tmp_mix_flow t
     SET std_org_code = (SELECT o.std_org_code FROM tmp_organize_name o WHERE TRIM(t.org_name) IN (o.org_name,o.another_name,o.another_name1) ) 
   WHERE stats_dt = v_month;

  UPDATE tmp_mix_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE o.short_name  = TRIM(t.org_name) AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
       AND stats_dt = v_month;

  UPDATE tmp_mix_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE regexp_replace(o.short_name,'市|县|区','') = regexp_replace(TRIM(t.org_name),'市|县|区|公司','')  AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
         AND stats_dt = v_month ;

  COMMIT;

END
```

###### update_self_flows

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_self_flows`(IN update_month  CHAR(7))
BEGIN
  DECLARE v_month CHAR(7) DEFAULT NULL ;

  SET v_month = update_month;

  UPDATE tmp_self_flow t
     SET std_org_code = (SELECT o.std_org_code FROM tmp_organize_name o WHERE TRIM(t.org_name) IN (o.org_name,o.another_name,o.another_name1) ) 
   WHERE stats_dt = v_month;

  UPDATE tmp_self_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE o.short_name  = TRIM(t.org_name) AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
       AND stats_dt = v_month;

  UPDATE tmp_self_flow t
     SET  std_org_code = (SELECT o.std_org_code FROM dim_std_organize o WHERE regexp_replace(o.short_name,'市|县|区','') = regexp_replace(TRIM(t.org_name),'市|县|区','')  AND LENGTH(o.std_org_code)=6  )
   WHERE t.std_org_code IS NULL 
         AND stats_dt = v_month ;

  COMMIT;

END
```

###### update_st_operator_log

```
CREATE DEFINER=`st`@`%` PROCEDURE `update_st_operator_log`(IN update_month char(10))
BEGIN
     DELETE FROM st_operate_log_analysis WHERE stats_dt = update_month ;
     INSERT INTO st_operate_log_analysis
     select
            date(t1.create_time) as stats_dt
           ,t2.bu_code std_org_code
           ,t1.operate_type
           ,count(t1.LOGIN_NAME)  as operate_cnt
           ,'pc' DATA_SOURCE
     from portal.ai_fw_operator_log t1
     left join portal.ai_fw_operator t2 on t1.operator_id=t2.operator_id
     where date(t1.create_time) = update_month
     group by date(t1.create_time),t2.bu_code,t1.operate_type
     union all
     select  date(create_time) as stats_dt
            ,std_org_code
            ,operate_type
            ,count(LOGIN_NAME)  as operate_cnt
            ,'app' DATA_SOURCE
     from st_ai_fw_operator_log
     where date(create_time) = update_month
     group by date(create_time),std_org_code,operate_type ;

END
```





#### 第十章 Azkaban调度

###### 10.1 azkaban信息

```
地址:https://111.208.67.21:8443/index 
账号:azkaban
密码:admin@azkaban
```

###### 10.2 调度列表

| 调度                | 项目              | 执行周期 |                                    | 参数                            | 描述                                     | 序号：依赖               |
| ------------------- | ----------------- | -------- | ---------------------------------- | ------------------------------- | ---------------------------------------- | ------------------------ |
| setparameter        | timesetting       | day      | 2020-01-01 00:10:00=>10 0 * * *    |                                 | 设置dt日期格式为yyyyMMdd,例20200201      |                          |
| D_INC_SYNC_LAN_USER | jscn_everyday     | day      | 2020-01-01 16:00:00=>0 16 * * *    |                                 |                                          |                          |
| D_INC_SYNC_APP_LOG  | D_SYNC_APP_OG     | day      | 2020-01-01 01:08:00=>8 1 * * *     |                                 |                                          |                          |
| D_SCHEDULER         | jscn_everyday     | day      | 2020-01-01 22:10:00=>10 22 * * *   |                                 | 处理auth，dr，dns，network，browse等数据 |                          |
| D_TENCENT_h2o       | jscn_everyday     | day      | 2020-01-01 04:04:00=>04 04 * * *   |                                 |                                          |                          |
| data_to_gz          | d2z               | day      | 2020-01-01 12:00:00=>0 12 * * *    |                                 |                                          |                          |
| liukong_new         | liukong_h2o       | day      | 2020-01-01 05:30:00=>30 5 * * *    |                                 |                                          |                          |
| USERS_SYNC_J2M      | jscn_everyday     | day      | 2020-01-01 01:00:00=>0 1 * * *     | 无参数                          | 同步大屏数据到移动端数据库               |                          |
| collection_end      | collectionFix     | -        | -                                  | (startT=20200201,endT=20200206) | 批量采集数据auth，auth_online等          |                          |
| collection_end      | collection        | day      | 2020-03-01 13:10:00=>10 13 * * *   | (ct=20200201)                   | 每天采集数据auth，auth_online等          |                          |
|                     |                   |          |                                    |                                 |                                          |                          |
| M_BOSS_REPORT_H2O   | user_profile      | month    | 2020-01-03 03:00:00=>0 3 3  * *    | (pdate = 20200203)              | boss经营分析报告                         | 2                        |
| M_BOSS_h2o          | jscn_everyday     | month    | 2020-01-04 01:43:00=>43 1 4  * *   |                                 |                                          | 4                        |
| M_SCHEDULER_h2o     | jscn_everyday     | month    | 2020-01-01 22:00:00=>0 22 1  * *   |                                 | 处理auth，dr，dns，network，browse等数据 | 1                        |
| M_H2O_ONLINE_ARPU   | M_ARPU_ONLINERATE | month    | 2020-01-12 11:30:00=>30 11 12  * * | (pdate = 20200201)              | 计算在线率和arpu值依赖BOSS经营分析日志   | 5：依赖M_BOSS_REPORT_H2O |
| M_USER_PROFILE_H2O  | user_profile      | month    | 2020-01-03 20:00:00=>0 20 3 * *    |                                 |                                          | 3                        |



###### 10.3 调度 -  [M_SCHEDULER_h2o](https://111.208.67.21:8443/manager?project=jscn_everyday&flow=M_SCHEDULER_h2o) 

```
M_ST_DIFF_TIME_WEBSITE_REQUEST_M
M_ST_DOMAIN_REQUEST_RESPONSE_M
M_ST_BCPT_DEPLOYMENT_M
M_ST_WEB_BROWSE_M
M_ST_OTHER_VIDEO_VIEW_M
M_ST_DIFF_TASK_VIDEO_VIEW_M
M_ST_TX_REPORT_M
M_ST_VIDEO_VIEW_M
M_ST_DIFF_TASK_WEB_BROWSE_M
M_ST_OTHER_WEB_BROWSE_M
M_ST_OTHER_DOWNLOAD_M
M_ST_NET_SPEED_M
M_ST_AUTH_MODE_M
M_DIM_GET_NO_CLASSIFY_URL
M_ST_PACKET_LOSS_M
M_ST_DNS_DOMAIN_REQUEST_M
M_ST_DNS_DOMAIN_RESPONSE_M
M_SCHEDULER
M_SCHEDULER_h2o
```

###### 10.4 调度 -  [M_BOSS_h2o](https://111.208.67.21:8443/manager?project=jscn_everyday&flow=M_BOSS_h2o) 

```
M_STG_PRODUCT
M_STG_RPT_INST_PROD
M_DWD_RPT_INST_PROD
M_DIM_STD_PRODUCT
M_DWA_FACT_RPT_INS_PROD_MON
M_ST_BANDWIDTH_LENGTH_USER_M
M_ST_DIFF_DEVICE_CATE_USER_M
M_DWA_FACT_PAYOFF_MON
M_ST_USER_ONLINE_MON
M_ST_DNS_RESPONSE_M
M_ST_DIFF_TIMES_DEVICE_USER_M
M_ST_AUTH_RATE_M
M_ST_DIFF_TIMES_USER_M
M_ST_USER_DEV_M
M_ST_DIFF_PROD_USER_DEV_M
M_ST_DIFF_CORP_USER_DEV_M
M_ST_DIFF_PROD_FAILURE_REASON_M
M_ST_DIFF_ONLINE_DAYS_USER_M
M_ST_AUTH_FAILURE_REASON_M
M_ST_DNS_RESPONSE_FAILURE_M
M_DWA_DIFF_ORGANIZE_USER_M
M_ST_AUTH_M
M_ST_DIFF_ONLINE_MEDIA_USER_M
M_ST_DIFF_CHANNEL_USER_DEV_M
M_ST_ALL_USERS_MON
M_ST_DIFF_ONLINE_LENGTH_USER_M
M_ST_REPAY_USERS_MON
M_ST_LOST_USERS_MON
M_ST_DIFF_DEVICE_USER_M
M_ST_INCOME_M
M_ST_DIFF_OFFER_URLTYPE_USER_M
M_ST_DIFF_TIME_URLTYPE_USER_M
M_ST_DIFF_REGION_USER_DEV_M
M_ST_DIFF_URL_DIFF_DEVICE_USER_M
M_ST_DIFF_OFFER_USER_M
M_ST_DIFF_URL_USER_M
M_ST_DIFF_CORP_INCOME_M
M_ST_DIFF_TIME_USER_M
M_ST_DIFF_REGION_INCOME_M
M_ST_DIFF_URL_TYPE_USER_M
M_ST_DIFF_CYCLE_INCOME_M
M_ST_DIFF_BANDWIDTH_INCOME_M
M_ST_DIFF_OFFER_USER_DEV_M
M_ST_DIFF_WORKDAY_USER_M
M_ST_DIFF_OFFER_INCOME_M
M_ST_DIFF_PROD_INCOME_M
M_BOSS
M_BOSS_h2o
```

###### 10.5 调度 -  [M_USER_PROFILE_H2O](https://111.208.67.21:8443/manager?project=user_profile&flow=M_USER_PROFILE_H2O) 

```
M_STG_USERPROFILE_SQOOP
M_STG_FACT_INS_PROD
M_STG_DR_ISMP
M_STG_TER_SERVICE
M_DWD_UP_PRODUCT_ITEM
M_DWD_DR_ISMP
M_DWD_TER_SERVICE
M_DWD_FACT_CUST_BASE
M_DWD_H_INS_PROD_RES
M_DWD_REP_ORDER_PROD
M_DWD_ZG_ACCT_ITEM_TYPE
M_DWD_USER_SERVICE_CREDIT
M_DWD_FACT_INS_SRVPKG
M_DWD_FACT_INS_PROD
M_DWD_INS_PROD_RES
M_DIM_STD_CONSUME_TYPE
M_DWD_FACT_UNPAY
M_DWD_ZG_ACCT
M_DWD_FACT_PAYMENT
M_DWA_USER_REVIEW_CHANNEL_M
M_DWA_USER_VOD_TIME_M
M_DWA_USER_TV_PROGRAM_M
M_DWA_USER_DR_PROGRAM_M
M_DWA_USER_NETWORK_DOMAIN_M
M_DWA_USER_REVIEW_TIME_M
M_DIM_STD_ACCT_ITEM_TYPE
M_DWA_USER_TV_TIME_M
M_DWA_USER_LB_PROGRAM_M
M_DWA_USER_TV_CHANNEL_M
M_DWA_USER_NETWORK_TIME_M
M_DWA_USER_NETWORK_DEVICE_M
M_DWA_USER_VIEW_M
M_DWA_CUST_FEAT_DTL_M
M_DWA_ZG_ACCT
M_DWA_USER_TV_PROGRAM_BEH_M
M_DWA_USER_NETWORK_WEBSITE_BEH_M
M_DWA_USER_TV_CHANNEL_BEH_M
M_DWA_USER_VIEW_BEH_M
M_DWA_USER_DR_PROGRAM_BEH_M
M_DWA_CUST_ORDER_PROD_M
M_ST_ZG_ACCT
M_DWA_USER_NETWORK_BEH_M
M_DWA_USER_REVIEW_CHANNEL_BEH_M
M_ST_CUST_FEAT_DTL_M
M_ST_USER_NETWORK_BEH_M
M_ST_USER_VIEW_BEH_M
M_USER_PROFILE_H2O
```

###### 10.6 调度 -  [M_BOSS_REPORT_H2O](https://111.208.67.21:8443/manager?project=user_profile&flow=M_BOSS_REPORT_H2O) 

```
M_STG_FACT_INS_PROD
M_STG_UP_PRODUCT_ITEM_B2
M_STG_FACT_INS_SRVPKG_B2
M_STG_FACT_INS_PROD_BOSS2
M_STG_FACT_CUST_B2
M_STG_FACT_CUST_B1
M_STG_FACT_INS_ADDRESS_B2
M_STG_UP_PRODUCT_ITEM
M_STG_FACT_INS_ADDRESS_B1
M_STG_FACT_INS_SRVPKG
M_STG_GS_CUST_GRID_REL_B2
M_STG_GS_CUST_GRID_REL_B1
M_DWD_FACT_CUST_B2
M_DWD_FACT_CUST_B1
M_DWD_GS_CUST_GRID_REL_B1
M_DWD_GS_CUST_GRID_REL_B2
M_DWD_FACT_INS_ADDRESS_B1
M_DWD_FACT_INS_ADDRESS_B2
M_DWD_FACT_INS_PROD
M_DWD_FACT_INS_PROD_BOSS2
M_DWD_UP_PRODUCT_ITEM_B1
M_DWD_FACT_INS_SRVPKG_B1
M_DWD_UP_PRODUCT_ITEM_B2
M_DWD_FACT_INS_SRVPKG_B2
M_DWA_FACT_INS_SRVPKG_MON
M_DIM_STD_UP_PRODUCT
M_DWA_FACT_INS_PROD_MON
M_DWA_FACT_INS_SRVPKG_CANCEL
M_DWA_FACT_CUST_MON
M_DWA_LOST_USERS_MON
M_DWA_LOST_CUST_MON
M_ST_LAN_PRODUCT_ORDER_M
M_ST_NEW_USER_DEV_M
M_ST_GRID_CUST_DEV_M
M_ST_GRID_USER_DEV_M
M_ST_CUST_DEV_M
M_ST_GRID_USER_PRODUCT_M
M_ST_GRID_USER_BANDWIDTH_M
M_ST_GRID_USER_PRODUCT_BT_M
M_BOSS_REPORT
M_BOSS_REPORT_H2O
```

###### 10.7 调度 - D_INC_SYNC_LAN_USER

```
D_INC_SYNC_LAN_USER_MOBILE
D_INC_SYNC_LAN_USER_JSGD27
D_INC_SYNC_LAN_USER
```

###### 10.8 调度 - D_SCHEDULER

```
D_STG_DR_BRD_EXPEND
D_STG_VIDEO_VIEW
D_STG_WEB_BROWSE
D_STG_URL_TYPE
D_STG_BROWSE_AVG_DATA
D_STG_NETWORK
D_STG_BRD_AUTH_LOG
D_STG_UPLINK_DATA
D_STG_DNS_UPDOWN
D_STG_NGINX_LOG
D_STG_STREAMING_MEDIA
D_STG_DOMAIN_STATISTICS
D_DWD_BROWSE_AVG_DATA
D_DWD_NGINX_LOG
D_DWD_DR_BRD_EXPEND
D_DWD_WEB_BROWSE
D_DWD_UPLINK_DATA
D_DWD_BRD_AUTH_LOG
D_DWD_DOMAIN_STATISTICS
D_DWD_DNS_UP_STREAM
D_DWD_DNS_DOWN_STREAM
D_DIM_STD_URL
D_DWD_STREAMING_MEDIA
D_DWD_VIDEO_VIEW
D_DWD_NETWORK
D_DWA_USER_ONLINE_LENGTH_D
D_DIM_STD_FAILURE_REASON
D_DWA_DIFF_TIMES_USER_D
D_DWA_PACKET_LOSS_D
D_DWA_DIFF_TIMES_DEVICE_USER_D
D_DWA_DNS_DOWN_STREAM_D
D_DWA_DIFF_ONLINE_MEDIA_USER_D
D_DWA_DIFF_DEVICE_CATE_USER_D
D_DWA_DNS_UP_STREAM_D
D_SCHEDULER
```

###### 10.9 调度 - D_TENCENT_h2o

```
D_STG_USER_PLAY_RECORDS
D_STG_VISQUAL_PROBES
D_STG_PROBE_SETUP_LOG
D_DIM_STD_VTYPE
D_DWD_PROBE_SETUP_LOG
D_DWD_VISQUAL_PROBES
D_DWD_USER_PLAY_RECORDS
D_ST_TX_VOD_ANALYSIS_D
D_ST_TX_VOD_VTYPE_ANALYSIS_D
D_ST_TX_REPORT_D
D_TENCENT
D_TENCENT_h2o
```

###### 10.10 调度 - USERS_SYNC_J2M

```
USERS_SYNC_J2M
```

###### 10.11 调度 - D_INC_SYNC_APP_LOG

```
D_INC_SYNC_APP_LOG
```

###### 10.12 调度 - data_to_gz

```
data_to_gz
```

###### 10.13 调度 - liukong_new

```
D_STG_TBL_PART_APP_LOG
D_STG_TBL_AS_SUM_REPORT_ALL
D_STG_TBL_TRAFFIC
D_STG_TBL_DNAME_TOPN
D_ST_TBL_TRAFFIC_SUMMARY
D_ST_AS_SUM_REPORT
D_ST_DNAME_TOPN
liukong_new
```





#### 第十一章 Flume配置

###### 11.1 auth日志采集

```
flume:
39243 Application -f flume.conf -n myAgent
脚本：nohup flume-ng agent  --conf /opt/cloudera/parcels/CDH-5.6.1-1.cdh5.6.1.p0.3/lib/flume-ng/conf  -f flume.conf  --classpath dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  -n myAgent  -Dflume.root.logger=INFO,console  &

java:
46487 jar --staticFlag=true --taskScheduleCron=0 20 5 * * * --taskRunningType=schedule
脚本：nohup java -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection -XX:CMSInitiatingOccupancyFraction=60 -XX:+CMSParallelRemarkEnabled -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+CMSClassUnloadingEnabled -XX:SurvivorRatio=8 -XX:+DisableExplicitGC -verbose:gc -XX:+PrintGCDetails -XX:-OmitStackTraceInFastThrow  -Djava.security.egd=file:/dev/./urandom -jar dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  --staticFlag=true --taskScheduleCron="0 20 5 * * *" --taskRunningType=schedule  &
```

###### 11.2 auth_online日志采集

```
flume:
41571 Application -f flume.conf -n myAgent_auth_online
脚本：nohup flume-ng agent  --conf /opt/cloudera/parcels/CDH-5.6.1-1.cdh5.6.1.p0.3/lib/flume-ng/conf  -f flume.conf  --classpath dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar  -n myAgent_auth_online  -Dflume.root.logger=INFO,console  &

java:
41430 jar --config_service_url=10.1.235.193:8500 --dcnode.id=22a12f35-a972-4a6e-a710-34277242441d --staticFlag=true --taskScheduleCron=30 5 * * * ? --taskRunningType=schedule
nohup java -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection -XX:CMSInitiatingOccupancyFraction=60 -XX:+CMSParallelRemarkEnabled -XX:SoftRefLRUPolicyMSPerMB=0 -XX:+CMSClassUnloadingEnabled -XX:SurvivorRatio=8 -XX:+DisableExplicitGC -verbose:gc -XX:+PrintGCDetails -XX:-OmitStackTraceInFastThrow  -Djava.security.egd=file:/dev/./urandom -jar dolphin-dal-dcnode-wrapper-0.0.1-SNAPSHOT.jar --config_service_url=10.1.235.193:8500 --dcnode.id=22a12f35-a972-4a6e-a710-34277242441d  --staticFlag=true --taskScheduleCron="0 30 05 * * ?" --taskRunningType=schedule  &
```





#### 第十二章 FTP设置

```

```



#### 第十三章 Crontab设置

```

```



#### 第十四章 交接文档

```
1.前端大屏数据模型设计及数据更新
《KPI前端可视化模型设计.html》 大屏数据每月需手动更新：
    甲方每月更新用户数据表datasource1,更新在线率数据。
    甲方每月提供流量数据、流量数据，需要手动入库到tmp_mix_flow(混合流量)、tmp_self_flow(自购流量)。
    甲方每月提供内网流量占比
    最后执行存过update_kpi_data(update_month,internal_flow_rate),更新大屏数据。

2.同步数据到移动app端数据库(同步配置表为SYNC_TABLE)：
	更新之前update配置表sync_table的is_sync置为1，sync_dt改成要同步数据的月份。
	ssh至jsgd4，执行脚本 sh /AiInsight/others/data_sync_jsgd2mobile.sh
	pc端到app端的账号同步。 azkaban里面的USERS_SYNC_J2M调度流程负责每天定时同步pc端的账号信息到app端。 手动执行USERS_SYNC_J2M调度可即时同步账号信息
	
	-- 修改视图last_update_month时间
    CREATE OR REPLACE VIEW last_update_month AS SELECT '2020-01' AS update_month;
    -- 更新日期
    UPDATE sync_table t SET t.sync_dt = '2020' WHERE t.table_name = 't_mubiao'; 
    UPDATE sync_table t SET t.sync_dt = '2020-02' WHERE t.table_name != 't_mubiao'; 
	
3.未完成需求
	根据各账户每月销账金额计算总arpu金额，宽带arpu金额。
```

