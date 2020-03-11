// ORM class for table 'st_all_users_mon'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 18:49:06 CST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class st_all_users_mon extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.math.BigDecimal CYCLE_ID;
  public java.math.BigDecimal get_CYCLE_ID() {
    return CYCLE_ID;
  }
  public void set_CYCLE_ID(java.math.BigDecimal CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
  }
  public st_all_users_mon with_CYCLE_ID(java.math.BigDecimal CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String OWN_CORP_STD_ORG_CODE;
  public String get_OWN_CORP_STD_ORG_CODE() {
    return OWN_CORP_STD_ORG_CODE;
  }
  public void set_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
  }
  public st_all_users_mon with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
    return this;
  }
  private String OWN_CORP_STD_ORG_NAME;
  public String get_OWN_CORP_STD_ORG_NAME() {
    return OWN_CORP_STD_ORG_NAME;
  }
  public void set_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
  }
  public st_all_users_mon with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String LOGIN_NAME;
  public String get_LOGIN_NAME() {
    return LOGIN_NAME;
  }
  public void set_LOGIN_NAME(String LOGIN_NAME) {
    this.LOGIN_NAME = LOGIN_NAME;
  }
  public st_all_users_mon with_LOGIN_NAME(String LOGIN_NAME) {
    this.LOGIN_NAME = LOGIN_NAME;
    return this;
  }
  private String CUST_CODE;
  public String get_CUST_CODE() {
    return CUST_CODE;
  }
  public void set_CUST_CODE(String CUST_CODE) {
    this.CUST_CODE = CUST_CODE;
  }
  public st_all_users_mon with_CUST_CODE(String CUST_CODE) {
    this.CUST_CODE = CUST_CODE;
    return this;
  }
  private String CUST_NAME;
  public String get_CUST_NAME() {
    return CUST_NAME;
  }
  public void set_CUST_NAME(String CUST_NAME) {
    this.CUST_NAME = CUST_NAME;
  }
  public st_all_users_mon with_CUST_NAME(String CUST_NAME) {
    this.CUST_NAME = CUST_NAME;
    return this;
  }
  private String PROD_INST_ID;
  public String get_PROD_INST_ID() {
    return PROD_INST_ID;
  }
  public void set_PROD_INST_ID(String PROD_INST_ID) {
    this.PROD_INST_ID = PROD_INST_ID;
  }
  public st_all_users_mon with_PROD_INST_ID(String PROD_INST_ID) {
    this.PROD_INST_ID = PROD_INST_ID;
    return this;
  }
  private String ADDR_NAME;
  public String get_ADDR_NAME() {
    return ADDR_NAME;
  }
  public void set_ADDR_NAME(String ADDR_NAME) {
    this.ADDR_NAME = ADDR_NAME;
  }
  public st_all_users_mon with_ADDR_NAME(String ADDR_NAME) {
    this.ADDR_NAME = ADDR_NAME;
    return this;
  }
  private String MANAGEMENT_STATION;
  public String get_MANAGEMENT_STATION() {
    return MANAGEMENT_STATION;
  }
  public void set_MANAGEMENT_STATION(String MANAGEMENT_STATION) {
    this.MANAGEMENT_STATION = MANAGEMENT_STATION;
  }
  public st_all_users_mon with_MANAGEMENT_STATION(String MANAGEMENT_STATION) {
    this.MANAGEMENT_STATION = MANAGEMENT_STATION;
    return this;
  }
  private String CONT_PHONE1;
  public String get_CONT_PHONE1() {
    return CONT_PHONE1;
  }
  public void set_CONT_PHONE1(String CONT_PHONE1) {
    this.CONT_PHONE1 = CONT_PHONE1;
  }
  public st_all_users_mon with_CONT_PHONE1(String CONT_PHONE1) {
    this.CONT_PHONE1 = CONT_PHONE1;
    return this;
  }
  private String CONT_PHONE2;
  public String get_CONT_PHONE2() {
    return CONT_PHONE2;
  }
  public void set_CONT_PHONE2(String CONT_PHONE2) {
    this.CONT_PHONE2 = CONT_PHONE2;
  }
  public st_all_users_mon with_CONT_PHONE2(String CONT_PHONE2) {
    this.CONT_PHONE2 = CONT_PHONE2;
    return this;
  }
  private String CONT_MOBILE1;
  public String get_CONT_MOBILE1() {
    return CONT_MOBILE1;
  }
  public void set_CONT_MOBILE1(String CONT_MOBILE1) {
    this.CONT_MOBILE1 = CONT_MOBILE1;
  }
  public st_all_users_mon with_CONT_MOBILE1(String CONT_MOBILE1) {
    this.CONT_MOBILE1 = CONT_MOBILE1;
    return this;
  }
  private String CONT_MOBILE2;
  public String get_CONT_MOBILE2() {
    return CONT_MOBILE2;
  }
  public void set_CONT_MOBILE2(String CONT_MOBILE2) {
    this.CONT_MOBILE2 = CONT_MOBILE2;
  }
  public st_all_users_mon with_CONT_MOBILE2(String CONT_MOBILE2) {
    this.CONT_MOBILE2 = CONT_MOBILE2;
    return this;
  }
  private String ACCESS_TYPE;
  public String get_ACCESS_TYPE() {
    return ACCESS_TYPE;
  }
  public void set_ACCESS_TYPE(String ACCESS_TYPE) {
    this.ACCESS_TYPE = ACCESS_TYPE;
  }
  public st_all_users_mon with_ACCESS_TYPE(String ACCESS_TYPE) {
    this.ACCESS_TYPE = ACCESS_TYPE;
    return this;
  }
  private String SRVPKG_NAME;
  public String get_SRVPKG_NAME() {
    return SRVPKG_NAME;
  }
  public void set_SRVPKG_NAME(String SRVPKG_NAME) {
    this.SRVPKG_NAME = SRVPKG_NAME;
  }
  public st_all_users_mon with_SRVPKG_NAME(String SRVPKG_NAME) {
    this.SRVPKG_NAME = SRVPKG_NAME;
    return this;
  }
  private String SRVPKG_CREATE_DATE;
  public String get_SRVPKG_CREATE_DATE() {
    return SRVPKG_CREATE_DATE;
  }
  public void set_SRVPKG_CREATE_DATE(String SRVPKG_CREATE_DATE) {
    this.SRVPKG_CREATE_DATE = SRVPKG_CREATE_DATE;
  }
  public st_all_users_mon with_SRVPKG_CREATE_DATE(String SRVPKG_CREATE_DATE) {
    this.SRVPKG_CREATE_DATE = SRVPKG_CREATE_DATE;
    return this;
  }
  private String SRVPKG_VALID_DATE;
  public String get_SRVPKG_VALID_DATE() {
    return SRVPKG_VALID_DATE;
  }
  public void set_SRVPKG_VALID_DATE(String SRVPKG_VALID_DATE) {
    this.SRVPKG_VALID_DATE = SRVPKG_VALID_DATE;
  }
  public st_all_users_mon with_SRVPKG_VALID_DATE(String SRVPKG_VALID_DATE) {
    this.SRVPKG_VALID_DATE = SRVPKG_VALID_DATE;
    return this;
  }
  private Long SRVPKG_REMAINDER_DAYS;
  public Long get_SRVPKG_REMAINDER_DAYS() {
    return SRVPKG_REMAINDER_DAYS;
  }
  public void set_SRVPKG_REMAINDER_DAYS(Long SRVPKG_REMAINDER_DAYS) {
    this.SRVPKG_REMAINDER_DAYS = SRVPKG_REMAINDER_DAYS;
  }
  public st_all_users_mon with_SRVPKG_REMAINDER_DAYS(Long SRVPKG_REMAINDER_DAYS) {
    this.SRVPKG_REMAINDER_DAYS = SRVPKG_REMAINDER_DAYS;
    return this;
  }
  private String SRVPKG_EXPIRE_DATE;
  public String get_SRVPKG_EXPIRE_DATE() {
    return SRVPKG_EXPIRE_DATE;
  }
  public void set_SRVPKG_EXPIRE_DATE(String SRVPKG_EXPIRE_DATE) {
    this.SRVPKG_EXPIRE_DATE = SRVPKG_EXPIRE_DATE;
  }
  public st_all_users_mon with_SRVPKG_EXPIRE_DATE(String SRVPKG_EXPIRE_DATE) {
    this.SRVPKG_EXPIRE_DATE = SRVPKG_EXPIRE_DATE;
    return this;
  }
  private String STATUS_NAME;
  public String get_STATUS_NAME() {
    return STATUS_NAME;
  }
  public void set_STATUS_NAME(String STATUS_NAME) {
    this.STATUS_NAME = STATUS_NAME;
  }
  public st_all_users_mon with_STATUS_NAME(String STATUS_NAME) {
    this.STATUS_NAME = STATUS_NAME;
    return this;
  }
  private String LAN_NUMBER;
  public String get_LAN_NUMBER() {
    return LAN_NUMBER;
  }
  public void set_LAN_NUMBER(String LAN_NUMBER) {
    this.LAN_NUMBER = LAN_NUMBER;
  }
  public st_all_users_mon with_LAN_NUMBER(String LAN_NUMBER) {
    this.LAN_NUMBER = LAN_NUMBER;
    return this;
  }
  private java.math.BigDecimal MONTH_ONLINE_NUM;
  public java.math.BigDecimal get_MONTH_ONLINE_NUM() {
    return MONTH_ONLINE_NUM;
  }
  public void set_MONTH_ONLINE_NUM(java.math.BigDecimal MONTH_ONLINE_NUM) {
    this.MONTH_ONLINE_NUM = MONTH_ONLINE_NUM;
  }
  public st_all_users_mon with_MONTH_ONLINE_NUM(java.math.BigDecimal MONTH_ONLINE_NUM) {
    this.MONTH_ONLINE_NUM = MONTH_ONLINE_NUM;
    return this;
  }
  private java.math.BigDecimal MONTH_ONLINE_DURATION;
  public java.math.BigDecimal get_MONTH_ONLINE_DURATION() {
    return MONTH_ONLINE_DURATION;
  }
  public void set_MONTH_ONLINE_DURATION(java.math.BigDecimal MONTH_ONLINE_DURATION) {
    this.MONTH_ONLINE_DURATION = MONTH_ONLINE_DURATION;
  }
  public st_all_users_mon with_MONTH_ONLINE_DURATION(java.math.BigDecimal MONTH_ONLINE_DURATION) {
    this.MONTH_ONLINE_DURATION = MONTH_ONLINE_DURATION;
    return this;
  }
  private java.math.BigDecimal MONTH_ONLINE_DURATION_AVG;
  public java.math.BigDecimal get_MONTH_ONLINE_DURATION_AVG() {
    return MONTH_ONLINE_DURATION_AVG;
  }
  public void set_MONTH_ONLINE_DURATION_AVG(java.math.BigDecimal MONTH_ONLINE_DURATION_AVG) {
    this.MONTH_ONLINE_DURATION_AVG = MONTH_ONLINE_DURATION_AVG;
  }
  public st_all_users_mon with_MONTH_ONLINE_DURATION_AVG(java.math.BigDecimal MONTH_ONLINE_DURATION_AVG) {
    this.MONTH_ONLINE_DURATION_AVG = MONTH_ONLINE_DURATION_AVG;
    return this;
  }
  private java.math.BigDecimal MONTH_UP_FLOW;
  public java.math.BigDecimal get_MONTH_UP_FLOW() {
    return MONTH_UP_FLOW;
  }
  public void set_MONTH_UP_FLOW(java.math.BigDecimal MONTH_UP_FLOW) {
    this.MONTH_UP_FLOW = MONTH_UP_FLOW;
  }
  public st_all_users_mon with_MONTH_UP_FLOW(java.math.BigDecimal MONTH_UP_FLOW) {
    this.MONTH_UP_FLOW = MONTH_UP_FLOW;
    return this;
  }
  private java.math.BigDecimal MONTH_UP_FLOW_AVG;
  public java.math.BigDecimal get_MONTH_UP_FLOW_AVG() {
    return MONTH_UP_FLOW_AVG;
  }
  public void set_MONTH_UP_FLOW_AVG(java.math.BigDecimal MONTH_UP_FLOW_AVG) {
    this.MONTH_UP_FLOW_AVG = MONTH_UP_FLOW_AVG;
  }
  public st_all_users_mon with_MONTH_UP_FLOW_AVG(java.math.BigDecimal MONTH_UP_FLOW_AVG) {
    this.MONTH_UP_FLOW_AVG = MONTH_UP_FLOW_AVG;
    return this;
  }
  private java.math.BigDecimal MONTH_DOWN_FLOW;
  public java.math.BigDecimal get_MONTH_DOWN_FLOW() {
    return MONTH_DOWN_FLOW;
  }
  public void set_MONTH_DOWN_FLOW(java.math.BigDecimal MONTH_DOWN_FLOW) {
    this.MONTH_DOWN_FLOW = MONTH_DOWN_FLOW;
  }
  public st_all_users_mon with_MONTH_DOWN_FLOW(java.math.BigDecimal MONTH_DOWN_FLOW) {
    this.MONTH_DOWN_FLOW = MONTH_DOWN_FLOW;
    return this;
  }
  private java.math.BigDecimal MONTH_DOWN_FLOW_AVG;
  public java.math.BigDecimal get_MONTH_DOWN_FLOW_AVG() {
    return MONTH_DOWN_FLOW_AVG;
  }
  public void set_MONTH_DOWN_FLOW_AVG(java.math.BigDecimal MONTH_DOWN_FLOW_AVG) {
    this.MONTH_DOWN_FLOW_AVG = MONTH_DOWN_FLOW_AVG;
  }
  public st_all_users_mon with_MONTH_DOWN_FLOW_AVG(java.math.BigDecimal MONTH_DOWN_FLOW_AVG) {
    this.MONTH_DOWN_FLOW_AVG = MONTH_DOWN_FLOW_AVG;
    return this;
  }
  private java.math.BigDecimal AUTH_COUNT;
  public java.math.BigDecimal get_AUTH_COUNT() {
    return AUTH_COUNT;
  }
  public void set_AUTH_COUNT(java.math.BigDecimal AUTH_COUNT) {
    this.AUTH_COUNT = AUTH_COUNT;
  }
  public st_all_users_mon with_AUTH_COUNT(java.math.BigDecimal AUTH_COUNT) {
    this.AUTH_COUNT = AUTH_COUNT;
    return this;
  }
  private java.math.BigDecimal AUTH_SUCCESS_RATE;
  public java.math.BigDecimal get_AUTH_SUCCESS_RATE() {
    return AUTH_SUCCESS_RATE;
  }
  public void set_AUTH_SUCCESS_RATE(java.math.BigDecimal AUTH_SUCCESS_RATE) {
    this.AUTH_SUCCESS_RATE = AUTH_SUCCESS_RATE;
  }
  public st_all_users_mon with_AUTH_SUCCESS_RATE(java.math.BigDecimal AUTH_SUCCESS_RATE) {
    this.AUTH_SUCCESS_RATE = AUTH_SUCCESS_RATE;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_all_users_mon with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private String PT_MON;
  public String get_PT_MON() {
    return PT_MON;
  }
  public void set_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
  }
  public st_all_users_mon with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_all_users_mon)) {
      return false;
    }
    st_all_users_mon that = (st_all_users_mon) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LOGIN_NAME == null ? that.LOGIN_NAME == null : this.LOGIN_NAME.equals(that.LOGIN_NAME));
    equal = equal && (this.CUST_CODE == null ? that.CUST_CODE == null : this.CUST_CODE.equals(that.CUST_CODE));
    equal = equal && (this.CUST_NAME == null ? that.CUST_NAME == null : this.CUST_NAME.equals(that.CUST_NAME));
    equal = equal && (this.PROD_INST_ID == null ? that.PROD_INST_ID == null : this.PROD_INST_ID.equals(that.PROD_INST_ID));
    equal = equal && (this.ADDR_NAME == null ? that.ADDR_NAME == null : this.ADDR_NAME.equals(that.ADDR_NAME));
    equal = equal && (this.MANAGEMENT_STATION == null ? that.MANAGEMENT_STATION == null : this.MANAGEMENT_STATION.equals(that.MANAGEMENT_STATION));
    equal = equal && (this.CONT_PHONE1 == null ? that.CONT_PHONE1 == null : this.CONT_PHONE1.equals(that.CONT_PHONE1));
    equal = equal && (this.CONT_PHONE2 == null ? that.CONT_PHONE2 == null : this.CONT_PHONE2.equals(that.CONT_PHONE2));
    equal = equal && (this.CONT_MOBILE1 == null ? that.CONT_MOBILE1 == null : this.CONT_MOBILE1.equals(that.CONT_MOBILE1));
    equal = equal && (this.CONT_MOBILE2 == null ? that.CONT_MOBILE2 == null : this.CONT_MOBILE2.equals(that.CONT_MOBILE2));
    equal = equal && (this.ACCESS_TYPE == null ? that.ACCESS_TYPE == null : this.ACCESS_TYPE.equals(that.ACCESS_TYPE));
    equal = equal && (this.SRVPKG_NAME == null ? that.SRVPKG_NAME == null : this.SRVPKG_NAME.equals(that.SRVPKG_NAME));
    equal = equal && (this.SRVPKG_CREATE_DATE == null ? that.SRVPKG_CREATE_DATE == null : this.SRVPKG_CREATE_DATE.equals(that.SRVPKG_CREATE_DATE));
    equal = equal && (this.SRVPKG_VALID_DATE == null ? that.SRVPKG_VALID_DATE == null : this.SRVPKG_VALID_DATE.equals(that.SRVPKG_VALID_DATE));
    equal = equal && (this.SRVPKG_REMAINDER_DAYS == null ? that.SRVPKG_REMAINDER_DAYS == null : this.SRVPKG_REMAINDER_DAYS.equals(that.SRVPKG_REMAINDER_DAYS));
    equal = equal && (this.SRVPKG_EXPIRE_DATE == null ? that.SRVPKG_EXPIRE_DATE == null : this.SRVPKG_EXPIRE_DATE.equals(that.SRVPKG_EXPIRE_DATE));
    equal = equal && (this.STATUS_NAME == null ? that.STATUS_NAME == null : this.STATUS_NAME.equals(that.STATUS_NAME));
    equal = equal && (this.LAN_NUMBER == null ? that.LAN_NUMBER == null : this.LAN_NUMBER.equals(that.LAN_NUMBER));
    equal = equal && (this.MONTH_ONLINE_NUM == null ? that.MONTH_ONLINE_NUM == null : this.MONTH_ONLINE_NUM.equals(that.MONTH_ONLINE_NUM));
    equal = equal && (this.MONTH_ONLINE_DURATION == null ? that.MONTH_ONLINE_DURATION == null : this.MONTH_ONLINE_DURATION.equals(that.MONTH_ONLINE_DURATION));
    equal = equal && (this.MONTH_ONLINE_DURATION_AVG == null ? that.MONTH_ONLINE_DURATION_AVG == null : this.MONTH_ONLINE_DURATION_AVG.equals(that.MONTH_ONLINE_DURATION_AVG));
    equal = equal && (this.MONTH_UP_FLOW == null ? that.MONTH_UP_FLOW == null : this.MONTH_UP_FLOW.equals(that.MONTH_UP_FLOW));
    equal = equal && (this.MONTH_UP_FLOW_AVG == null ? that.MONTH_UP_FLOW_AVG == null : this.MONTH_UP_FLOW_AVG.equals(that.MONTH_UP_FLOW_AVG));
    equal = equal && (this.MONTH_DOWN_FLOW == null ? that.MONTH_DOWN_FLOW == null : this.MONTH_DOWN_FLOW.equals(that.MONTH_DOWN_FLOW));
    equal = equal && (this.MONTH_DOWN_FLOW_AVG == null ? that.MONTH_DOWN_FLOW_AVG == null : this.MONTH_DOWN_FLOW_AVG.equals(that.MONTH_DOWN_FLOW_AVG));
    equal = equal && (this.AUTH_COUNT == null ? that.AUTH_COUNT == null : this.AUTH_COUNT.equals(that.AUTH_COUNT));
    equal = equal && (this.AUTH_SUCCESS_RATE == null ? that.AUTH_SUCCESS_RATE == null : this.AUTH_SUCCESS_RATE.equals(that.AUTH_SUCCESS_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_all_users_mon)) {
      return false;
    }
    st_all_users_mon that = (st_all_users_mon) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LOGIN_NAME == null ? that.LOGIN_NAME == null : this.LOGIN_NAME.equals(that.LOGIN_NAME));
    equal = equal && (this.CUST_CODE == null ? that.CUST_CODE == null : this.CUST_CODE.equals(that.CUST_CODE));
    equal = equal && (this.CUST_NAME == null ? that.CUST_NAME == null : this.CUST_NAME.equals(that.CUST_NAME));
    equal = equal && (this.PROD_INST_ID == null ? that.PROD_INST_ID == null : this.PROD_INST_ID.equals(that.PROD_INST_ID));
    equal = equal && (this.ADDR_NAME == null ? that.ADDR_NAME == null : this.ADDR_NAME.equals(that.ADDR_NAME));
    equal = equal && (this.MANAGEMENT_STATION == null ? that.MANAGEMENT_STATION == null : this.MANAGEMENT_STATION.equals(that.MANAGEMENT_STATION));
    equal = equal && (this.CONT_PHONE1 == null ? that.CONT_PHONE1 == null : this.CONT_PHONE1.equals(that.CONT_PHONE1));
    equal = equal && (this.CONT_PHONE2 == null ? that.CONT_PHONE2 == null : this.CONT_PHONE2.equals(that.CONT_PHONE2));
    equal = equal && (this.CONT_MOBILE1 == null ? that.CONT_MOBILE1 == null : this.CONT_MOBILE1.equals(that.CONT_MOBILE1));
    equal = equal && (this.CONT_MOBILE2 == null ? that.CONT_MOBILE2 == null : this.CONT_MOBILE2.equals(that.CONT_MOBILE2));
    equal = equal && (this.ACCESS_TYPE == null ? that.ACCESS_TYPE == null : this.ACCESS_TYPE.equals(that.ACCESS_TYPE));
    equal = equal && (this.SRVPKG_NAME == null ? that.SRVPKG_NAME == null : this.SRVPKG_NAME.equals(that.SRVPKG_NAME));
    equal = equal && (this.SRVPKG_CREATE_DATE == null ? that.SRVPKG_CREATE_DATE == null : this.SRVPKG_CREATE_DATE.equals(that.SRVPKG_CREATE_DATE));
    equal = equal && (this.SRVPKG_VALID_DATE == null ? that.SRVPKG_VALID_DATE == null : this.SRVPKG_VALID_DATE.equals(that.SRVPKG_VALID_DATE));
    equal = equal && (this.SRVPKG_REMAINDER_DAYS == null ? that.SRVPKG_REMAINDER_DAYS == null : this.SRVPKG_REMAINDER_DAYS.equals(that.SRVPKG_REMAINDER_DAYS));
    equal = equal && (this.SRVPKG_EXPIRE_DATE == null ? that.SRVPKG_EXPIRE_DATE == null : this.SRVPKG_EXPIRE_DATE.equals(that.SRVPKG_EXPIRE_DATE));
    equal = equal && (this.STATUS_NAME == null ? that.STATUS_NAME == null : this.STATUS_NAME.equals(that.STATUS_NAME));
    equal = equal && (this.LAN_NUMBER == null ? that.LAN_NUMBER == null : this.LAN_NUMBER.equals(that.LAN_NUMBER));
    equal = equal && (this.MONTH_ONLINE_NUM == null ? that.MONTH_ONLINE_NUM == null : this.MONTH_ONLINE_NUM.equals(that.MONTH_ONLINE_NUM));
    equal = equal && (this.MONTH_ONLINE_DURATION == null ? that.MONTH_ONLINE_DURATION == null : this.MONTH_ONLINE_DURATION.equals(that.MONTH_ONLINE_DURATION));
    equal = equal && (this.MONTH_ONLINE_DURATION_AVG == null ? that.MONTH_ONLINE_DURATION_AVG == null : this.MONTH_ONLINE_DURATION_AVG.equals(that.MONTH_ONLINE_DURATION_AVG));
    equal = equal && (this.MONTH_UP_FLOW == null ? that.MONTH_UP_FLOW == null : this.MONTH_UP_FLOW.equals(that.MONTH_UP_FLOW));
    equal = equal && (this.MONTH_UP_FLOW_AVG == null ? that.MONTH_UP_FLOW_AVG == null : this.MONTH_UP_FLOW_AVG.equals(that.MONTH_UP_FLOW_AVG));
    equal = equal && (this.MONTH_DOWN_FLOW == null ? that.MONTH_DOWN_FLOW == null : this.MONTH_DOWN_FLOW.equals(that.MONTH_DOWN_FLOW));
    equal = equal && (this.MONTH_DOWN_FLOW_AVG == null ? that.MONTH_DOWN_FLOW_AVG == null : this.MONTH_DOWN_FLOW_AVG.equals(that.MONTH_DOWN_FLOW_AVG));
    equal = equal && (this.AUTH_COUNT == null ? that.AUTH_COUNT == null : this.AUTH_COUNT.equals(that.AUTH_COUNT));
    equal = equal && (this.AUTH_SUCCESS_RATE == null ? that.AUTH_SUCCESS_RATE == null : this.AUTH_SUCCESS_RATE.equals(that.AUTH_SUCCESS_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.LOGIN_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.CUST_CODE = JdbcWritableBridge.readString(5, __dbResults);
    this.CUST_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.PROD_INST_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.ADDR_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.MANAGEMENT_STATION = JdbcWritableBridge.readString(9, __dbResults);
    this.CONT_PHONE1 = JdbcWritableBridge.readString(10, __dbResults);
    this.CONT_PHONE2 = JdbcWritableBridge.readString(11, __dbResults);
    this.CONT_MOBILE1 = JdbcWritableBridge.readString(12, __dbResults);
    this.CONT_MOBILE2 = JdbcWritableBridge.readString(13, __dbResults);
    this.ACCESS_TYPE = JdbcWritableBridge.readString(14, __dbResults);
    this.SRVPKG_NAME = JdbcWritableBridge.readString(15, __dbResults);
    this.SRVPKG_CREATE_DATE = JdbcWritableBridge.readString(16, __dbResults);
    this.SRVPKG_VALID_DATE = JdbcWritableBridge.readString(17, __dbResults);
    this.SRVPKG_REMAINDER_DAYS = JdbcWritableBridge.readLong(18, __dbResults);
    this.SRVPKG_EXPIRE_DATE = JdbcWritableBridge.readString(19, __dbResults);
    this.STATUS_NAME = JdbcWritableBridge.readString(20, __dbResults);
    this.LAN_NUMBER = JdbcWritableBridge.readString(21, __dbResults);
    this.MONTH_ONLINE_NUM = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.MONTH_ONLINE_DURATION = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.MONTH_ONLINE_DURATION_AVG = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.MONTH_UP_FLOW = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.MONTH_UP_FLOW_AVG = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.MONTH_DOWN_FLOW = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.MONTH_DOWN_FLOW_AVG = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.AUTH_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.AUTH_SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(32, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.LOGIN_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.CUST_CODE = JdbcWritableBridge.readString(5, __dbResults);
    this.CUST_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.PROD_INST_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.ADDR_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.MANAGEMENT_STATION = JdbcWritableBridge.readString(9, __dbResults);
    this.CONT_PHONE1 = JdbcWritableBridge.readString(10, __dbResults);
    this.CONT_PHONE2 = JdbcWritableBridge.readString(11, __dbResults);
    this.CONT_MOBILE1 = JdbcWritableBridge.readString(12, __dbResults);
    this.CONT_MOBILE2 = JdbcWritableBridge.readString(13, __dbResults);
    this.ACCESS_TYPE = JdbcWritableBridge.readString(14, __dbResults);
    this.SRVPKG_NAME = JdbcWritableBridge.readString(15, __dbResults);
    this.SRVPKG_CREATE_DATE = JdbcWritableBridge.readString(16, __dbResults);
    this.SRVPKG_VALID_DATE = JdbcWritableBridge.readString(17, __dbResults);
    this.SRVPKG_REMAINDER_DAYS = JdbcWritableBridge.readLong(18, __dbResults);
    this.SRVPKG_EXPIRE_DATE = JdbcWritableBridge.readString(19, __dbResults);
    this.STATUS_NAME = JdbcWritableBridge.readString(20, __dbResults);
    this.LAN_NUMBER = JdbcWritableBridge.readString(21, __dbResults);
    this.MONTH_ONLINE_NUM = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.MONTH_ONLINE_DURATION = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.MONTH_ONLINE_DURATION_AVG = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.MONTH_UP_FLOW = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.MONTH_UP_FLOW_AVG = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.MONTH_DOWN_FLOW = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.MONTH_DOWN_FLOW_AVG = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.AUTH_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.AUTH_SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(32, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(CYCLE_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOGIN_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_CODE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROD_INST_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MANAGEMENT_STATION, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_PHONE1, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_PHONE2, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_MOBILE1, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_MOBILE2, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCESS_TYPE, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_NAME, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_CREATE_DATE, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_VALID_DATE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(SRVPKG_REMAINDER_DAYS, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_EXPIRE_DATE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS_NAME, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAN_NUMBER, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_NUM, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION_AVG, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_UP_FLOW, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_UP_FLOW_AVG, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_DOWN_FLOW, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_DOWN_FLOW_AVG, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_RATE, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 32 + __off, 1, __dbStmt);
    return 32;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(CYCLE_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOGIN_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_CODE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROD_INST_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MANAGEMENT_STATION, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_PHONE1, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_PHONE2, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_MOBILE1, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONT_MOBILE2, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCESS_TYPE, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_NAME, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_CREATE_DATE, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_VALID_DATE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(SRVPKG_REMAINDER_DAYS, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_EXPIRE_DATE, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS_NAME, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAN_NUMBER, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_NUM, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION_AVG, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_UP_FLOW, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_UP_FLOW_AVG, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_DOWN_FLOW, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_DOWN_FLOW_AVG, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_RATE, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 32 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CYCLE_ID = null;
    } else {
    this.CYCLE_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OWN_CORP_STD_ORG_CODE = null;
    } else {
    this.OWN_CORP_STD_ORG_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OWN_CORP_STD_ORG_NAME = null;
    } else {
    this.OWN_CORP_STD_ORG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOGIN_NAME = null;
    } else {
    this.LOGIN_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_CODE = null;
    } else {
    this.CUST_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_NAME = null;
    } else {
    this.CUST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PROD_INST_ID = null;
    } else {
    this.PROD_INST_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDR_NAME = null;
    } else {
    this.ADDR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MANAGEMENT_STATION = null;
    } else {
    this.MANAGEMENT_STATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONT_PHONE1 = null;
    } else {
    this.CONT_PHONE1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONT_PHONE2 = null;
    } else {
    this.CONT_PHONE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONT_MOBILE1 = null;
    } else {
    this.CONT_MOBILE1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONT_MOBILE2 = null;
    } else {
    this.CONT_MOBILE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACCESS_TYPE = null;
    } else {
    this.ACCESS_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SRVPKG_NAME = null;
    } else {
    this.SRVPKG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SRVPKG_CREATE_DATE = null;
    } else {
    this.SRVPKG_CREATE_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SRVPKG_VALID_DATE = null;
    } else {
    this.SRVPKG_VALID_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SRVPKG_REMAINDER_DAYS = null;
    } else {
    this.SRVPKG_REMAINDER_DAYS = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.SRVPKG_EXPIRE_DATE = null;
    } else {
    this.SRVPKG_EXPIRE_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS_NAME = null;
    } else {
    this.STATUS_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_NUMBER = null;
    } else {
    this.LAN_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_ONLINE_NUM = null;
    } else {
    this.MONTH_ONLINE_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_ONLINE_DURATION = null;
    } else {
    this.MONTH_ONLINE_DURATION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_ONLINE_DURATION_AVG = null;
    } else {
    this.MONTH_ONLINE_DURATION_AVG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_UP_FLOW = null;
    } else {
    this.MONTH_UP_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_UP_FLOW_AVG = null;
    } else {
    this.MONTH_UP_FLOW_AVG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_DOWN_FLOW = null;
    } else {
    this.MONTH_DOWN_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_DOWN_FLOW_AVG = null;
    } else {
    this.MONTH_DOWN_FLOW_AVG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_COUNT = null;
    } else {
    this.AUTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_SUCCESS_RATE = null;
    } else {
    this.AUTH_SUCCESS_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PT_MON = null;
    } else {
    this.PT_MON = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CYCLE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE_ID, __dataOut);
    }
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.OWN_CORP_STD_ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_NAME);
    }
    if (null == this.LOGIN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOGIN_NAME);
    }
    if (null == this.CUST_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_CODE);
    }
    if (null == this.CUST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NAME);
    }
    if (null == this.PROD_INST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROD_INST_ID);
    }
    if (null == this.ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR_NAME);
    }
    if (null == this.MANAGEMENT_STATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MANAGEMENT_STATION);
    }
    if (null == this.CONT_PHONE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_PHONE1);
    }
    if (null == this.CONT_PHONE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_PHONE2);
    }
    if (null == this.CONT_MOBILE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_MOBILE1);
    }
    if (null == this.CONT_MOBILE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_MOBILE2);
    }
    if (null == this.ACCESS_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCESS_TYPE);
    }
    if (null == this.SRVPKG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_NAME);
    }
    if (null == this.SRVPKG_CREATE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_CREATE_DATE);
    }
    if (null == this.SRVPKG_VALID_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_VALID_DATE);
    }
    if (null == this.SRVPKG_REMAINDER_DAYS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SRVPKG_REMAINDER_DAYS);
    }
    if (null == this.SRVPKG_EXPIRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_EXPIRE_DATE);
    }
    if (null == this.STATUS_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS_NAME);
    }
    if (null == this.LAN_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAN_NUMBER);
    }
    if (null == this.MONTH_ONLINE_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_NUM, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION_AVG, __dataOut);
    }
    if (null == this.MONTH_UP_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_UP_FLOW, __dataOut);
    }
    if (null == this.MONTH_UP_FLOW_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_UP_FLOW_AVG, __dataOut);
    }
    if (null == this.MONTH_DOWN_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_DOWN_FLOW, __dataOut);
    }
    if (null == this.MONTH_DOWN_FLOW_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_DOWN_FLOW_AVG, __dataOut);
    }
    if (null == this.AUTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_RATE, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.PT_MON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PT_MON);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CYCLE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE_ID, __dataOut);
    }
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.OWN_CORP_STD_ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_NAME);
    }
    if (null == this.LOGIN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOGIN_NAME);
    }
    if (null == this.CUST_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_CODE);
    }
    if (null == this.CUST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_NAME);
    }
    if (null == this.PROD_INST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROD_INST_ID);
    }
    if (null == this.ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR_NAME);
    }
    if (null == this.MANAGEMENT_STATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MANAGEMENT_STATION);
    }
    if (null == this.CONT_PHONE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_PHONE1);
    }
    if (null == this.CONT_PHONE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_PHONE2);
    }
    if (null == this.CONT_MOBILE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_MOBILE1);
    }
    if (null == this.CONT_MOBILE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONT_MOBILE2);
    }
    if (null == this.ACCESS_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCESS_TYPE);
    }
    if (null == this.SRVPKG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_NAME);
    }
    if (null == this.SRVPKG_CREATE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_CREATE_DATE);
    }
    if (null == this.SRVPKG_VALID_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_VALID_DATE);
    }
    if (null == this.SRVPKG_REMAINDER_DAYS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SRVPKG_REMAINDER_DAYS);
    }
    if (null == this.SRVPKG_EXPIRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_EXPIRE_DATE);
    }
    if (null == this.STATUS_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS_NAME);
    }
    if (null == this.LAN_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAN_NUMBER);
    }
    if (null == this.MONTH_ONLINE_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_NUM, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION_AVG, __dataOut);
    }
    if (null == this.MONTH_UP_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_UP_FLOW, __dataOut);
    }
    if (null == this.MONTH_UP_FLOW_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_UP_FLOW_AVG, __dataOut);
    }
    if (null == this.MONTH_DOWN_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_DOWN_FLOW, __dataOut);
    }
    if (null == this.MONTH_DOWN_FLOW_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_DOWN_FLOW_AVG, __dataOut);
    }
    if (null == this.AUTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_RATE, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.PT_MON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PT_MON);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOGIN_NAME==null?"null":LOGIN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_CODE==null?"null":CUST_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NAME==null?"null":CUST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROD_INST_ID==null?"null":PROD_INST_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR_NAME==null?"null":ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MANAGEMENT_STATION==null?"null":MANAGEMENT_STATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_PHONE1==null?"null":CONT_PHONE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_PHONE2==null?"null":CONT_PHONE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_MOBILE1==null?"null":CONT_MOBILE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_MOBILE2==null?"null":CONT_MOBILE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCESS_TYPE==null?"null":ACCESS_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_NAME==null?"null":SRVPKG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_CREATE_DATE==null?"null":SRVPKG_CREATE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_VALID_DATE==null?"null":SRVPKG_VALID_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_REMAINDER_DAYS==null?"null":"" + SRVPKG_REMAINDER_DAYS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_EXPIRE_DATE==null?"null":SRVPKG_EXPIRE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_NAME==null?"null":STATUS_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_NUMBER==null?"null":LAN_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_NUM==null?"null":MONTH_ONLINE_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION==null?"null":MONTH_ONLINE_DURATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION_AVG==null?"null":MONTH_ONLINE_DURATION_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_UP_FLOW==null?"null":MONTH_UP_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_UP_FLOW_AVG==null?"null":MONTH_UP_FLOW_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_DOWN_FLOW==null?"null":MONTH_DOWN_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_DOWN_FLOW_AVG==null?"null":MONTH_DOWN_FLOW_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_COUNT==null?"null":AUTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_RATE==null?"null":AUTH_SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PT_MON==null?"null":PT_MON, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOGIN_NAME==null?"null":LOGIN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_CODE==null?"null":CUST_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_NAME==null?"null":CUST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROD_INST_ID==null?"null":PROD_INST_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR_NAME==null?"null":ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MANAGEMENT_STATION==null?"null":MANAGEMENT_STATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_PHONE1==null?"null":CONT_PHONE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_PHONE2==null?"null":CONT_PHONE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_MOBILE1==null?"null":CONT_MOBILE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONT_MOBILE2==null?"null":CONT_MOBILE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCESS_TYPE==null?"null":ACCESS_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_NAME==null?"null":SRVPKG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_CREATE_DATE==null?"null":SRVPKG_CREATE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_VALID_DATE==null?"null":SRVPKG_VALID_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_REMAINDER_DAYS==null?"null":"" + SRVPKG_REMAINDER_DAYS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_EXPIRE_DATE==null?"null":SRVPKG_EXPIRE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_NAME==null?"null":STATUS_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_NUMBER==null?"null":LAN_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_NUM==null?"null":MONTH_ONLINE_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION==null?"null":MONTH_ONLINE_DURATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION_AVG==null?"null":MONTH_ONLINE_DURATION_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_UP_FLOW==null?"null":MONTH_UP_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_UP_FLOW_AVG==null?"null":MONTH_UP_FLOW_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_DOWN_FLOW==null?"null":MONTH_DOWN_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_DOWN_FLOW_AVG==null?"null":MONTH_DOWN_FLOW_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_COUNT==null?"null":AUTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_RATE==null?"null":AUTH_SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PT_MON==null?"null":PT_MON, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE_ID = null; } else {
      this.CYCLE_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.LOGIN_NAME = null; } else {
      this.LOGIN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_CODE = null; } else {
      this.CUST_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_NAME = null; } else {
      this.CUST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PROD_INST_ID = null; } else {
      this.PROD_INST_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ADDR_NAME = null; } else {
      this.ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MANAGEMENT_STATION = null; } else {
      this.MANAGEMENT_STATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_PHONE1 = null; } else {
      this.CONT_PHONE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_PHONE2 = null; } else {
      this.CONT_PHONE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_MOBILE1 = null; } else {
      this.CONT_MOBILE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_MOBILE2 = null; } else {
      this.CONT_MOBILE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ACCESS_TYPE = null; } else {
      this.ACCESS_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_NAME = null; } else {
      this.SRVPKG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_CREATE_DATE = null; } else {
      this.SRVPKG_CREATE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_VALID_DATE = null; } else {
      this.SRVPKG_VALID_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SRVPKG_REMAINDER_DAYS = null; } else {
      this.SRVPKG_REMAINDER_DAYS = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_EXPIRE_DATE = null; } else {
      this.SRVPKG_EXPIRE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STATUS_NAME = null; } else {
      this.STATUS_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.LAN_NUMBER = null; } else {
      this.LAN_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_NUM = null; } else {
      this.MONTH_ONLINE_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION = null; } else {
      this.MONTH_ONLINE_DURATION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION_AVG = null; } else {
      this.MONTH_ONLINE_DURATION_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_UP_FLOW = null; } else {
      this.MONTH_UP_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_UP_FLOW_AVG = null; } else {
      this.MONTH_UP_FLOW_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_DOWN_FLOW = null; } else {
      this.MONTH_DOWN_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_DOWN_FLOW_AVG = null; } else {
      this.MONTH_DOWN_FLOW_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_COUNT = null; } else {
      this.AUTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_RATE = null; } else {
      this.AUTH_SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PT_MON = null; } else {
      this.PT_MON = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE_ID = null; } else {
      this.CYCLE_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.LOGIN_NAME = null; } else {
      this.LOGIN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_CODE = null; } else {
      this.CUST_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_NAME = null; } else {
      this.CUST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PROD_INST_ID = null; } else {
      this.PROD_INST_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ADDR_NAME = null; } else {
      this.ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MANAGEMENT_STATION = null; } else {
      this.MANAGEMENT_STATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_PHONE1 = null; } else {
      this.CONT_PHONE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_PHONE2 = null; } else {
      this.CONT_PHONE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_MOBILE1 = null; } else {
      this.CONT_MOBILE1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CONT_MOBILE2 = null; } else {
      this.CONT_MOBILE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ACCESS_TYPE = null; } else {
      this.ACCESS_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_NAME = null; } else {
      this.SRVPKG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_CREATE_DATE = null; } else {
      this.SRVPKG_CREATE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_VALID_DATE = null; } else {
      this.SRVPKG_VALID_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SRVPKG_REMAINDER_DAYS = null; } else {
      this.SRVPKG_REMAINDER_DAYS = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.SRVPKG_EXPIRE_DATE = null; } else {
      this.SRVPKG_EXPIRE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STATUS_NAME = null; } else {
      this.STATUS_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.LAN_NUMBER = null; } else {
      this.LAN_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_NUM = null; } else {
      this.MONTH_ONLINE_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION = null; } else {
      this.MONTH_ONLINE_DURATION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION_AVG = null; } else {
      this.MONTH_ONLINE_DURATION_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_UP_FLOW = null; } else {
      this.MONTH_UP_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_UP_FLOW_AVG = null; } else {
      this.MONTH_UP_FLOW_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_DOWN_FLOW = null; } else {
      this.MONTH_DOWN_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_DOWN_FLOW_AVG = null; } else {
      this.MONTH_DOWN_FLOW_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_COUNT = null; } else {
      this.AUTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_RATE = null; } else {
      this.AUTH_SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PT_MON = null; } else {
      this.PT_MON = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    st_all_users_mon o = (st_all_users_mon) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_all_users_mon o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("LOGIN_NAME", this.LOGIN_NAME);
    __sqoop$field_map.put("CUST_CODE", this.CUST_CODE);
    __sqoop$field_map.put("CUST_NAME", this.CUST_NAME);
    __sqoop$field_map.put("PROD_INST_ID", this.PROD_INST_ID);
    __sqoop$field_map.put("ADDR_NAME", this.ADDR_NAME);
    __sqoop$field_map.put("MANAGEMENT_STATION", this.MANAGEMENT_STATION);
    __sqoop$field_map.put("CONT_PHONE1", this.CONT_PHONE1);
    __sqoop$field_map.put("CONT_PHONE2", this.CONT_PHONE2);
    __sqoop$field_map.put("CONT_MOBILE1", this.CONT_MOBILE1);
    __sqoop$field_map.put("CONT_MOBILE2", this.CONT_MOBILE2);
    __sqoop$field_map.put("ACCESS_TYPE", this.ACCESS_TYPE);
    __sqoop$field_map.put("SRVPKG_NAME", this.SRVPKG_NAME);
    __sqoop$field_map.put("SRVPKG_CREATE_DATE", this.SRVPKG_CREATE_DATE);
    __sqoop$field_map.put("SRVPKG_VALID_DATE", this.SRVPKG_VALID_DATE);
    __sqoop$field_map.put("SRVPKG_REMAINDER_DAYS", this.SRVPKG_REMAINDER_DAYS);
    __sqoop$field_map.put("SRVPKG_EXPIRE_DATE", this.SRVPKG_EXPIRE_DATE);
    __sqoop$field_map.put("STATUS_NAME", this.STATUS_NAME);
    __sqoop$field_map.put("LAN_NUMBER", this.LAN_NUMBER);
    __sqoop$field_map.put("MONTH_ONLINE_NUM", this.MONTH_ONLINE_NUM);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION", this.MONTH_ONLINE_DURATION);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION_AVG", this.MONTH_ONLINE_DURATION_AVG);
    __sqoop$field_map.put("MONTH_UP_FLOW", this.MONTH_UP_FLOW);
    __sqoop$field_map.put("MONTH_UP_FLOW_AVG", this.MONTH_UP_FLOW_AVG);
    __sqoop$field_map.put("MONTH_DOWN_FLOW", this.MONTH_DOWN_FLOW);
    __sqoop$field_map.put("MONTH_DOWN_FLOW_AVG", this.MONTH_DOWN_FLOW_AVG);
    __sqoop$field_map.put("AUTH_COUNT", this.AUTH_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_RATE", this.AUTH_SUCCESS_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("LOGIN_NAME", this.LOGIN_NAME);
    __sqoop$field_map.put("CUST_CODE", this.CUST_CODE);
    __sqoop$field_map.put("CUST_NAME", this.CUST_NAME);
    __sqoop$field_map.put("PROD_INST_ID", this.PROD_INST_ID);
    __sqoop$field_map.put("ADDR_NAME", this.ADDR_NAME);
    __sqoop$field_map.put("MANAGEMENT_STATION", this.MANAGEMENT_STATION);
    __sqoop$field_map.put("CONT_PHONE1", this.CONT_PHONE1);
    __sqoop$field_map.put("CONT_PHONE2", this.CONT_PHONE2);
    __sqoop$field_map.put("CONT_MOBILE1", this.CONT_MOBILE1);
    __sqoop$field_map.put("CONT_MOBILE2", this.CONT_MOBILE2);
    __sqoop$field_map.put("ACCESS_TYPE", this.ACCESS_TYPE);
    __sqoop$field_map.put("SRVPKG_NAME", this.SRVPKG_NAME);
    __sqoop$field_map.put("SRVPKG_CREATE_DATE", this.SRVPKG_CREATE_DATE);
    __sqoop$field_map.put("SRVPKG_VALID_DATE", this.SRVPKG_VALID_DATE);
    __sqoop$field_map.put("SRVPKG_REMAINDER_DAYS", this.SRVPKG_REMAINDER_DAYS);
    __sqoop$field_map.put("SRVPKG_EXPIRE_DATE", this.SRVPKG_EXPIRE_DATE);
    __sqoop$field_map.put("STATUS_NAME", this.STATUS_NAME);
    __sqoop$field_map.put("LAN_NUMBER", this.LAN_NUMBER);
    __sqoop$field_map.put("MONTH_ONLINE_NUM", this.MONTH_ONLINE_NUM);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION", this.MONTH_ONLINE_DURATION);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION_AVG", this.MONTH_ONLINE_DURATION_AVG);
    __sqoop$field_map.put("MONTH_UP_FLOW", this.MONTH_UP_FLOW);
    __sqoop$field_map.put("MONTH_UP_FLOW_AVG", this.MONTH_UP_FLOW_AVG);
    __sqoop$field_map.put("MONTH_DOWN_FLOW", this.MONTH_DOWN_FLOW);
    __sqoop$field_map.put("MONTH_DOWN_FLOW_AVG", this.MONTH_DOWN_FLOW_AVG);
    __sqoop$field_map.put("AUTH_COUNT", this.AUTH_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_RATE", this.AUTH_SUCCESS_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
    }
    else    if ("LOGIN_NAME".equals(__fieldName)) {
      this.LOGIN_NAME = (String) __fieldVal;
    }
    else    if ("CUST_CODE".equals(__fieldName)) {
      this.CUST_CODE = (String) __fieldVal;
    }
    else    if ("CUST_NAME".equals(__fieldName)) {
      this.CUST_NAME = (String) __fieldVal;
    }
    else    if ("PROD_INST_ID".equals(__fieldName)) {
      this.PROD_INST_ID = (String) __fieldVal;
    }
    else    if ("ADDR_NAME".equals(__fieldName)) {
      this.ADDR_NAME = (String) __fieldVal;
    }
    else    if ("MANAGEMENT_STATION".equals(__fieldName)) {
      this.MANAGEMENT_STATION = (String) __fieldVal;
    }
    else    if ("CONT_PHONE1".equals(__fieldName)) {
      this.CONT_PHONE1 = (String) __fieldVal;
    }
    else    if ("CONT_PHONE2".equals(__fieldName)) {
      this.CONT_PHONE2 = (String) __fieldVal;
    }
    else    if ("CONT_MOBILE1".equals(__fieldName)) {
      this.CONT_MOBILE1 = (String) __fieldVal;
    }
    else    if ("CONT_MOBILE2".equals(__fieldName)) {
      this.CONT_MOBILE2 = (String) __fieldVal;
    }
    else    if ("ACCESS_TYPE".equals(__fieldName)) {
      this.ACCESS_TYPE = (String) __fieldVal;
    }
    else    if ("SRVPKG_NAME".equals(__fieldName)) {
      this.SRVPKG_NAME = (String) __fieldVal;
    }
    else    if ("SRVPKG_CREATE_DATE".equals(__fieldName)) {
      this.SRVPKG_CREATE_DATE = (String) __fieldVal;
    }
    else    if ("SRVPKG_VALID_DATE".equals(__fieldName)) {
      this.SRVPKG_VALID_DATE = (String) __fieldVal;
    }
    else    if ("SRVPKG_REMAINDER_DAYS".equals(__fieldName)) {
      this.SRVPKG_REMAINDER_DAYS = (Long) __fieldVal;
    }
    else    if ("SRVPKG_EXPIRE_DATE".equals(__fieldName)) {
      this.SRVPKG_EXPIRE_DATE = (String) __fieldVal;
    }
    else    if ("STATUS_NAME".equals(__fieldName)) {
      this.STATUS_NAME = (String) __fieldVal;
    }
    else    if ("LAN_NUMBER".equals(__fieldName)) {
      this.LAN_NUMBER = (String) __fieldVal;
    }
    else    if ("MONTH_ONLINE_NUM".equals(__fieldName)) {
      this.MONTH_ONLINE_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_ONLINE_DURATION".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_ONLINE_DURATION_AVG".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION_AVG = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_UP_FLOW".equals(__fieldName)) {
      this.MONTH_UP_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_UP_FLOW_AVG".equals(__fieldName)) {
      this.MONTH_UP_FLOW_AVG = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_DOWN_FLOW".equals(__fieldName)) {
      this.MONTH_DOWN_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_DOWN_FLOW_AVG".equals(__fieldName)) {
      this.MONTH_DOWN_FLOW_AVG = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_COUNT".equals(__fieldName)) {
      this.AUTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_SUCCESS_RATE".equals(__fieldName)) {
      this.AUTH_SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("PT_MON".equals(__fieldName)) {
      this.PT_MON = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("LOGIN_NAME".equals(__fieldName)) {
      this.LOGIN_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("CUST_CODE".equals(__fieldName)) {
      this.CUST_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("CUST_NAME".equals(__fieldName)) {
      this.CUST_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("PROD_INST_ID".equals(__fieldName)) {
      this.PROD_INST_ID = (String) __fieldVal;
      return true;
    }
    else    if ("ADDR_NAME".equals(__fieldName)) {
      this.ADDR_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("MANAGEMENT_STATION".equals(__fieldName)) {
      this.MANAGEMENT_STATION = (String) __fieldVal;
      return true;
    }
    else    if ("CONT_PHONE1".equals(__fieldName)) {
      this.CONT_PHONE1 = (String) __fieldVal;
      return true;
    }
    else    if ("CONT_PHONE2".equals(__fieldName)) {
      this.CONT_PHONE2 = (String) __fieldVal;
      return true;
    }
    else    if ("CONT_MOBILE1".equals(__fieldName)) {
      this.CONT_MOBILE1 = (String) __fieldVal;
      return true;
    }
    else    if ("CONT_MOBILE2".equals(__fieldName)) {
      this.CONT_MOBILE2 = (String) __fieldVal;
      return true;
    }
    else    if ("ACCESS_TYPE".equals(__fieldName)) {
      this.ACCESS_TYPE = (String) __fieldVal;
      return true;
    }
    else    if ("SRVPKG_NAME".equals(__fieldName)) {
      this.SRVPKG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("SRVPKG_CREATE_DATE".equals(__fieldName)) {
      this.SRVPKG_CREATE_DATE = (String) __fieldVal;
      return true;
    }
    else    if ("SRVPKG_VALID_DATE".equals(__fieldName)) {
      this.SRVPKG_VALID_DATE = (String) __fieldVal;
      return true;
    }
    else    if ("SRVPKG_REMAINDER_DAYS".equals(__fieldName)) {
      this.SRVPKG_REMAINDER_DAYS = (Long) __fieldVal;
      return true;
    }
    else    if ("SRVPKG_EXPIRE_DATE".equals(__fieldName)) {
      this.SRVPKG_EXPIRE_DATE = (String) __fieldVal;
      return true;
    }
    else    if ("STATUS_NAME".equals(__fieldName)) {
      this.STATUS_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("LAN_NUMBER".equals(__fieldName)) {
      this.LAN_NUMBER = (String) __fieldVal;
      return true;
    }
    else    if ("MONTH_ONLINE_NUM".equals(__fieldName)) {
      this.MONTH_ONLINE_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_ONLINE_DURATION".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_ONLINE_DURATION_AVG".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION_AVG = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_UP_FLOW".equals(__fieldName)) {
      this.MONTH_UP_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_UP_FLOW_AVG".equals(__fieldName)) {
      this.MONTH_UP_FLOW_AVG = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_DOWN_FLOW".equals(__fieldName)) {
      this.MONTH_DOWN_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_DOWN_FLOW_AVG".equals(__fieldName)) {
      this.MONTH_DOWN_FLOW_AVG = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_COUNT".equals(__fieldName)) {
      this.AUTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_SUCCESS_RATE".equals(__fieldName)) {
      this.AUTH_SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("PT_MON".equals(__fieldName)) {
      this.PT_MON = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
