// ORM class for table 'st_user_online_mon'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 18:39:55 CST 2018
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

public class st_user_online_mon extends SqoopRecord  implements DBWritable, Writable {
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
  public st_user_online_mon with_CYCLE_ID(java.math.BigDecimal CYCLE_ID) {
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
  public st_user_online_mon with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_user_online_mon with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
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
  public st_user_online_mon with_LOGIN_NAME(String LOGIN_NAME) {
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
  public st_user_online_mon with_CUST_CODE(String CUST_CODE) {
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
  public st_user_online_mon with_CUST_NAME(String CUST_NAME) {
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
  public st_user_online_mon with_PROD_INST_ID(String PROD_INST_ID) {
    this.PROD_INST_ID = PROD_INST_ID;
    return this;
  }
  private String SRVPKG_NAME;
  public String get_SRVPKG_NAME() {
    return SRVPKG_NAME;
  }
  public void set_SRVPKG_NAME(String SRVPKG_NAME) {
    this.SRVPKG_NAME = SRVPKG_NAME;
  }
  public st_user_online_mon with_SRVPKG_NAME(String SRVPKG_NAME) {
    this.SRVPKG_NAME = SRVPKG_NAME;
    return this;
  }
  private java.math.BigDecimal ARPU;
  public java.math.BigDecimal get_ARPU() {
    return ARPU;
  }
  public void set_ARPU(java.math.BigDecimal ARPU) {
    this.ARPU = ARPU;
  }
  public st_user_online_mon with_ARPU(java.math.BigDecimal ARPU) {
    this.ARPU = ARPU;
    return this;
  }
  private String BANDWIDTH;
  public String get_BANDWIDTH() {
    return BANDWIDTH;
  }
  public void set_BANDWIDTH(String BANDWIDTH) {
    this.BANDWIDTH = BANDWIDTH;
  }
  public st_user_online_mon with_BANDWIDTH(String BANDWIDTH) {
    this.BANDWIDTH = BANDWIDTH;
    return this;
  }
  private java.math.BigDecimal CYCLE;
  public java.math.BigDecimal get_CYCLE() {
    return CYCLE;
  }
  public void set_CYCLE(java.math.BigDecimal CYCLE) {
    this.CYCLE = CYCLE;
  }
  public st_user_online_mon with_CYCLE(java.math.BigDecimal CYCLE) {
    this.CYCLE = CYCLE;
    return this;
  }
  private java.math.BigDecimal PRICE;
  public java.math.BigDecimal get_PRICE() {
    return PRICE;
  }
  public void set_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
  }
  public st_user_online_mon with_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
    return this;
  }
  private java.math.BigDecimal MONTH_ONLINE_NUM;
  public java.math.BigDecimal get_MONTH_ONLINE_NUM() {
    return MONTH_ONLINE_NUM;
  }
  public void set_MONTH_ONLINE_NUM(java.math.BigDecimal MONTH_ONLINE_NUM) {
    this.MONTH_ONLINE_NUM = MONTH_ONLINE_NUM;
  }
  public st_user_online_mon with_MONTH_ONLINE_NUM(java.math.BigDecimal MONTH_ONLINE_NUM) {
    this.MONTH_ONLINE_NUM = MONTH_ONLINE_NUM;
    return this;
  }
  private java.math.BigDecimal MONTH_ONLINE_DURATION_AVG;
  public java.math.BigDecimal get_MONTH_ONLINE_DURATION_AVG() {
    return MONTH_ONLINE_DURATION_AVG;
  }
  public void set_MONTH_ONLINE_DURATION_AVG(java.math.BigDecimal MONTH_ONLINE_DURATION_AVG) {
    this.MONTH_ONLINE_DURATION_AVG = MONTH_ONLINE_DURATION_AVG;
  }
  public st_user_online_mon with_MONTH_ONLINE_DURATION_AVG(java.math.BigDecimal MONTH_ONLINE_DURATION_AVG) {
    this.MONTH_ONLINE_DURATION_AVG = MONTH_ONLINE_DURATION_AVG;
    return this;
  }
  private java.math.BigDecimal DAYS_FROM_LAST_ONLINE;
  public java.math.BigDecimal get_DAYS_FROM_LAST_ONLINE() {
    return DAYS_FROM_LAST_ONLINE;
  }
  public void set_DAYS_FROM_LAST_ONLINE(java.math.BigDecimal DAYS_FROM_LAST_ONLINE) {
    this.DAYS_FROM_LAST_ONLINE = DAYS_FROM_LAST_ONLINE;
  }
  public st_user_online_mon with_DAYS_FROM_LAST_ONLINE(java.math.BigDecimal DAYS_FROM_LAST_ONLINE) {
    this.DAYS_FROM_LAST_ONLINE = DAYS_FROM_LAST_ONLINE;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_user_online_mon with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_user_online_mon with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_online_mon)) {
      return false;
    }
    st_user_online_mon that = (st_user_online_mon) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LOGIN_NAME == null ? that.LOGIN_NAME == null : this.LOGIN_NAME.equals(that.LOGIN_NAME));
    equal = equal && (this.CUST_CODE == null ? that.CUST_CODE == null : this.CUST_CODE.equals(that.CUST_CODE));
    equal = equal && (this.CUST_NAME == null ? that.CUST_NAME == null : this.CUST_NAME.equals(that.CUST_NAME));
    equal = equal && (this.PROD_INST_ID == null ? that.PROD_INST_ID == null : this.PROD_INST_ID.equals(that.PROD_INST_ID));
    equal = equal && (this.SRVPKG_NAME == null ? that.SRVPKG_NAME == null : this.SRVPKG_NAME.equals(that.SRVPKG_NAME));
    equal = equal && (this.ARPU == null ? that.ARPU == null : this.ARPU.equals(that.ARPU));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.MONTH_ONLINE_NUM == null ? that.MONTH_ONLINE_NUM == null : this.MONTH_ONLINE_NUM.equals(that.MONTH_ONLINE_NUM));
    equal = equal && (this.MONTH_ONLINE_DURATION_AVG == null ? that.MONTH_ONLINE_DURATION_AVG == null : this.MONTH_ONLINE_DURATION_AVG.equals(that.MONTH_ONLINE_DURATION_AVG));
    equal = equal && (this.DAYS_FROM_LAST_ONLINE == null ? that.DAYS_FROM_LAST_ONLINE == null : this.DAYS_FROM_LAST_ONLINE.equals(that.DAYS_FROM_LAST_ONLINE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_online_mon)) {
      return false;
    }
    st_user_online_mon that = (st_user_online_mon) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LOGIN_NAME == null ? that.LOGIN_NAME == null : this.LOGIN_NAME.equals(that.LOGIN_NAME));
    equal = equal && (this.CUST_CODE == null ? that.CUST_CODE == null : this.CUST_CODE.equals(that.CUST_CODE));
    equal = equal && (this.CUST_NAME == null ? that.CUST_NAME == null : this.CUST_NAME.equals(that.CUST_NAME));
    equal = equal && (this.PROD_INST_ID == null ? that.PROD_INST_ID == null : this.PROD_INST_ID.equals(that.PROD_INST_ID));
    equal = equal && (this.SRVPKG_NAME == null ? that.SRVPKG_NAME == null : this.SRVPKG_NAME.equals(that.SRVPKG_NAME));
    equal = equal && (this.ARPU == null ? that.ARPU == null : this.ARPU.equals(that.ARPU));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.MONTH_ONLINE_NUM == null ? that.MONTH_ONLINE_NUM == null : this.MONTH_ONLINE_NUM.equals(that.MONTH_ONLINE_NUM));
    equal = equal && (this.MONTH_ONLINE_DURATION_AVG == null ? that.MONTH_ONLINE_DURATION_AVG == null : this.MONTH_ONLINE_DURATION_AVG.equals(that.MONTH_ONLINE_DURATION_AVG));
    equal = equal && (this.DAYS_FROM_LAST_ONLINE == null ? that.DAYS_FROM_LAST_ONLINE == null : this.DAYS_FROM_LAST_ONLINE.equals(that.DAYS_FROM_LAST_ONLINE));
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
    this.SRVPKG_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.ARPU = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readString(10, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.MONTH_ONLINE_NUM = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.MONTH_ONLINE_DURATION_AVG = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DAYS_FROM_LAST_ONLINE = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.LOGIN_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.CUST_CODE = JdbcWritableBridge.readString(5, __dbResults);
    this.CUST_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.PROD_INST_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.SRVPKG_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.ARPU = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readString(10, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.MONTH_ONLINE_NUM = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.MONTH_ONLINE_DURATION_AVG = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DAYS_FROM_LAST_ONLINE = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(17, __dbResults);
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
    JdbcWritableBridge.writeString(SRVPKG_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ARPU, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(BANDWIDTH, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_NUM, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION_AVG, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYS_FROM_LAST_ONLINE, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 17 + __off, 1, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(CYCLE_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOGIN_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_CODE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CUST_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROD_INST_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SRVPKG_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ARPU, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(BANDWIDTH, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_NUM, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONTH_ONLINE_DURATION_AVG, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DAYS_FROM_LAST_ONLINE, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 17 + __off, 1, __dbStmt);
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
        this.SRVPKG_NAME = null;
    } else {
    this.SRVPKG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ARPU = null;
    } else {
    this.ARPU = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BANDWIDTH = null;
    } else {
    this.BANDWIDTH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CYCLE = null;
    } else {
    this.CYCLE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICE = null;
    } else {
    this.PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_ONLINE_NUM = null;
    } else {
    this.MONTH_ONLINE_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONTH_ONLINE_DURATION_AVG = null;
    } else {
    this.MONTH_ONLINE_DURATION_AVG = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DAYS_FROM_LAST_ONLINE = null;
    } else {
    this.DAYS_FROM_LAST_ONLINE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.SRVPKG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_NAME);
    }
    if (null == this.ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ARPU, __dataOut);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BANDWIDTH);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.MONTH_ONLINE_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_NUM, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION_AVG, __dataOut);
    }
    if (null == this.DAYS_FROM_LAST_ONLINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYS_FROM_LAST_ONLINE, __dataOut);
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
    if (null == this.SRVPKG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SRVPKG_NAME);
    }
    if (null == this.ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ARPU, __dataOut);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BANDWIDTH);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.MONTH_ONLINE_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_NUM, __dataOut);
    }
    if (null == this.MONTH_ONLINE_DURATION_AVG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONTH_ONLINE_DURATION_AVG, __dataOut);
    }
    if (null == this.DAYS_FROM_LAST_ONLINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DAYS_FROM_LAST_ONLINE, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_NAME==null?"null":SRVPKG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ARPU==null?"null":ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_NUM==null?"null":MONTH_ONLINE_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION_AVG==null?"null":MONTH_ONLINE_DURATION_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYS_FROM_LAST_ONLINE==null?"null":DAYS_FROM_LAST_ONLINE.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(SRVPKG_NAME==null?"null":SRVPKG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ARPU==null?"null":ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_NUM==null?"null":MONTH_ONLINE_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONTH_ONLINE_DURATION_AVG==null?"null":MONTH_ONLINE_DURATION_AVG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DAYS_FROM_LAST_ONLINE==null?"null":DAYS_FROM_LAST_ONLINE.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.SRVPKG_NAME = null; } else {
      this.SRVPKG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ARPU = null; } else {
      this.ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_NUM = null; } else {
      this.MONTH_ONLINE_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION_AVG = null; } else {
      this.MONTH_ONLINE_DURATION_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DAYS_FROM_LAST_ONLINE = null; } else {
      this.DAYS_FROM_LAST_ONLINE = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.SRVPKG_NAME = null; } else {
      this.SRVPKG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ARPU = null; } else {
      this.ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_NUM = null; } else {
      this.MONTH_ONLINE_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONTH_ONLINE_DURATION_AVG = null; } else {
      this.MONTH_ONLINE_DURATION_AVG = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DAYS_FROM_LAST_ONLINE = null; } else {
      this.DAYS_FROM_LAST_ONLINE = new java.math.BigDecimal(__cur_str);
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
    st_user_online_mon o = (st_user_online_mon) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_user_online_mon o) throws CloneNotSupportedException {
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
    __sqoop$field_map.put("SRVPKG_NAME", this.SRVPKG_NAME);
    __sqoop$field_map.put("ARPU", this.ARPU);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("MONTH_ONLINE_NUM", this.MONTH_ONLINE_NUM);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION_AVG", this.MONTH_ONLINE_DURATION_AVG);
    __sqoop$field_map.put("DAYS_FROM_LAST_ONLINE", this.DAYS_FROM_LAST_ONLINE);
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
    __sqoop$field_map.put("SRVPKG_NAME", this.SRVPKG_NAME);
    __sqoop$field_map.put("ARPU", this.ARPU);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("MONTH_ONLINE_NUM", this.MONTH_ONLINE_NUM);
    __sqoop$field_map.put("MONTH_ONLINE_DURATION_AVG", this.MONTH_ONLINE_DURATION_AVG);
    __sqoop$field_map.put("DAYS_FROM_LAST_ONLINE", this.DAYS_FROM_LAST_ONLINE);
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
    else    if ("SRVPKG_NAME".equals(__fieldName)) {
      this.SRVPKG_NAME = (String) __fieldVal;
    }
    else    if ("ARPU".equals(__fieldName)) {
      this.ARPU = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (String) __fieldVal;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PRICE".equals(__fieldName)) {
      this.PRICE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_ONLINE_NUM".equals(__fieldName)) {
      this.MONTH_ONLINE_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONTH_ONLINE_DURATION_AVG".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION_AVG = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DAYS_FROM_LAST_ONLINE".equals(__fieldName)) {
      this.DAYS_FROM_LAST_ONLINE = (java.math.BigDecimal) __fieldVal;
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
    else    if ("SRVPKG_NAME".equals(__fieldName)) {
      this.SRVPKG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("ARPU".equals(__fieldName)) {
      this.ARPU = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (String) __fieldVal;
      return true;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PRICE".equals(__fieldName)) {
      this.PRICE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_ONLINE_NUM".equals(__fieldName)) {
      this.MONTH_ONLINE_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONTH_ONLINE_DURATION_AVG".equals(__fieldName)) {
      this.MONTH_ONLINE_DURATION_AVG = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DAYS_FROM_LAST_ONLINE".equals(__fieldName)) {
      this.DAYS_FROM_LAST_ONLINE = (java.math.BigDecimal) __fieldVal;
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
