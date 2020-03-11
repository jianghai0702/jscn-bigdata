#!/bin/bash


org_name="泰州分公司"
file_name="stg_rep_order_prod_jiangsu_taizhou_export"


# SELECT
# t_o.MAIN_PROD_INST_ID,
# t_o.CUST_ID,
# t_o.OFFER_ID,
# t_o.ORG_NAME,
# t_o.corp_org_name,
# if(t_p.CUTOVER_ADDR_NAME IS NULL, "NULL",t_p.CUTOVER_ADDR_NAME),
# if(t_res.RES_EQU_NO2 IS NULL, "NULL",t_res.RES_EQU_NO2)
# FROM STG_REP_ORDER_PROD t_o  
# LEFT JOIN STG_RPT_INST_PROD t_p    ON  t_o.MAIN_PROD_INST_ID = t_p.PROD_INST_ID
# LEFT JOIN STG_INS_PROD_RES  t_res  ON  t_o.CUST_ID = t_res.CUST_ID
# WHERE 
# t_o.corp_org_name = '宿迁分公司' AND
# t_o.pt_mon = '201909' AND
# t_o.MAIN_PROD_INST_ID > 0 AND
# t_o.CUST_ID IS NOT NULL
# GROUP BY 
# t_o.MAIN_PROD_INST_ID,
# t_o.CUST_ID,
# t_o.OFFER_ID,
# t_o.ORG_NAME,
# t_o.corp_org_name,
# t_p.CUTOVER_ADDR_NAME,
# t_res.RES_EQU_NO2



#hadoop导出文件
echo "SQL IS: select * from STG_REP_ORDER_PROD where corp_org_name = '${org_name}' and pt_mon = '201909'"
hive -e """
SELECT
t_o.MAIN_PROD_INST_ID,
t_o.CUST_ID,
t_o.OFFER_ID,
t_o.ORG_NAME,
t_o.corp_org_name,
if(t_p.CUTOVER_ADDR_NAME IS NULL, "NULL",t_p.CUTOVER_ADDR_NAME),
if(t_res.RES_EQU_NO2 IS NULL, "NULL",t_res.RES_EQU_NO2)
FROM STG_REP_ORDER_PROD t_o  
LEFT JOIN STG_RPT_INST_PROD t_p    ON  t_o.MAIN_PROD_INST_ID = t_p.PROD_INST_ID
LEFT JOIN STG_INS_PROD_RES  t_res  ON  t_o.CUST_ID = t_res.CUST_ID
WHERE 
t_o.corp_org_name = '${org_name}' AND
t_o.pt_mon = '201909' AND
t_o.MAIN_PROD_INST_ID > 0 AND
t_o.CUST_ID IS NOT NULL
GROUP BY 
t_o.MAIN_PROD_INST_ID,
t_o.CUST_ID,
t_o.OFFER_ID,
t_o.ORG_NAME,
t_o.corp_org_name,
t_p.CUTOVER_ADDR_NAME,
t_res.RES_EQU_NO2
"""  >  /home/yanal/${file_name}.txt


# 43个域
# echo "SQL IS: /home/yanal/${file_name}.csv"
# echo "SQL IS: /home/yanal/${file_name}.txt"
awk -F" " '{ print $1","$2","$3","$4","$5","$6","$7  >  "/home/yanal/stg_rep_order_prod_jiangsu_taizhou_export.csv" }'  /home/yanal/${file_name}.txt


# zip压缩
zip -r /home/yanal/${file_name}.zip  /home/yanal/${file_name}.csv


# 要的字段主要是[用户ID]，[客户ID]，机顶盒mac地址、[套餐]、管理站，[营业厅]、[所属分公司]这些数据
# 主用户编号: MAIN_PROD_INST_ID
# 客户标识: CUST_ID
# 机顶盒mac地址:  IP
# 套餐: OFFER_ID
# 管理站: 
# 营业厅: ORG_NAME
# 所属分公司: OWN_CORP_STD_ORG_CODE


# hive> desc stg_rep_order_prod;
# 
# srvpkg_order_id         string
# prod_order_id           string
# cust_order_id           string
# srvpkg_inst_id          string
# cust_id                 string
# business_id             string
# business_name           string
# prod_inst_id            string
# main_prod_inst_id       string
# prod_spec_id            string
# bill_id                 string
# sub_bill_id             string
# access_mode             string
# offer_id                string
# offer_name              string
# offer_create_date       string
# offer_state             string
# srvpkg_id               string
# srvpkg_name             string
# srvpkg_create_date      string
# srvpkg_done_code        string
# srvpkg_done_date        string
# srvpkg_valid_date       string
# srvpkg_expire_date      string
# srvpkg_ord_date         string
# srvpkg_original_date    string
# state                   string
# order_state             string
# prod_service_id         string
# op_id                   string
# op_name                 string
# org_id                  string
# org_name                string
# corp_org_id             string
# corp_org_name           string
# own_corp_std_org_code   string
# std_up_busi_type_code   string
# std_up_type_code        string
# data_source_cd          string
# is_history_data         string
# etl_cycle               string
# etl_date                string
# pt_mon                  string


