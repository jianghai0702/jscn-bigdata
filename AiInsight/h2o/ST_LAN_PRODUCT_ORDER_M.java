// ORM class for table 'ST_LAN_PRODUCT_ORDER_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 07 11:06:03 CST 2018
// For connector: org.apache.sqoop.manager.OracleManager
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

public class ST_LAN_PRODUCT_ORDER_M extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String CYCLE_ID;
  public String get_CYCLE_ID() {
    return CYCLE_ID;
  }
  public void set_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
  }
  public ST_LAN_PRODUCT_ORDER_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_LAN_PRODUCT_ORDER_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_LAN_PRODUCT_ORDER_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal PRODUCT_ID;
  public java.math.BigDecimal get_PRODUCT_ID() {
    return PRODUCT_ID;
  }
  public void set_PRODUCT_ID(java.math.BigDecimal PRODUCT_ID) {
    this.PRODUCT_ID = PRODUCT_ID;
  }
  public ST_LAN_PRODUCT_ORDER_M with_PRODUCT_ID(java.math.BigDecimal PRODUCT_ID) {
    this.PRODUCT_ID = PRODUCT_ID;
    return this;
  }
  private String PRODUCT_NAME;
  public String get_PRODUCT_NAME() {
    return PRODUCT_NAME;
  }
  public void set_PRODUCT_NAME(String PRODUCT_NAME) {
    this.PRODUCT_NAME = PRODUCT_NAME;
  }
  public ST_LAN_PRODUCT_ORDER_M with_PRODUCT_NAME(String PRODUCT_NAME) {
    this.PRODUCT_NAME = PRODUCT_NAME;
    return this;
  }
  private java.math.BigDecimal BANDWIDTH;
  public java.math.BigDecimal get_BANDWIDTH() {
    return BANDWIDTH;
  }
  public void set_BANDWIDTH(java.math.BigDecimal BANDWIDTH) {
    this.BANDWIDTH = BANDWIDTH;
  }
  public ST_LAN_PRODUCT_ORDER_M with_BANDWIDTH(java.math.BigDecimal BANDWIDTH) {
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
  public ST_LAN_PRODUCT_ORDER_M with_CYCLE(java.math.BigDecimal CYCLE) {
    this.CYCLE = CYCLE;
    return this;
  }
  private java.math.BigDecimal ARPU;
  public java.math.BigDecimal get_ARPU() {
    return ARPU;
  }
  public void set_ARPU(java.math.BigDecimal ARPU) {
    this.ARPU = ARPU;
  }
  public ST_LAN_PRODUCT_ORDER_M with_ARPU(java.math.BigDecimal ARPU) {
    this.ARPU = ARPU;
    return this;
  }
  private java.math.BigDecimal BILLING_TYPE;
  public java.math.BigDecimal get_BILLING_TYPE() {
    return BILLING_TYPE;
  }
  public void set_BILLING_TYPE(java.math.BigDecimal BILLING_TYPE) {
    this.BILLING_TYPE = BILLING_TYPE;
  }
  public ST_LAN_PRODUCT_ORDER_M with_BILLING_TYPE(java.math.BigDecimal BILLING_TYPE) {
    this.BILLING_TYPE = BILLING_TYPE;
    return this;
  }
  private java.math.BigDecimal ORDER_USER_CNT;
  public java.math.BigDecimal get_ORDER_USER_CNT() {
    return ORDER_USER_CNT;
  }
  public void set_ORDER_USER_CNT(java.math.BigDecimal ORDER_USER_CNT) {
    this.ORDER_USER_CNT = ORDER_USER_CNT;
  }
  public ST_LAN_PRODUCT_ORDER_M with_ORDER_USER_CNT(java.math.BigDecimal ORDER_USER_CNT) {
    this.ORDER_USER_CNT = ORDER_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_USER_CNT;
  public java.math.BigDecimal get_NEW_USER_CNT() {
    return NEW_USER_CNT;
  }
  public void set_NEW_USER_CNT(java.math.BigDecimal NEW_USER_CNT) {
    this.NEW_USER_CNT = NEW_USER_CNT;
  }
  public ST_LAN_PRODUCT_ORDER_M with_NEW_USER_CNT(java.math.BigDecimal NEW_USER_CNT) {
    this.NEW_USER_CNT = NEW_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_USER_CNT;
  public java.math.BigDecimal get_LOSE_USER_CNT() {
    return LOSE_USER_CNT;
  }
  public void set_LOSE_USER_CNT(java.math.BigDecimal LOSE_USER_CNT) {
    this.LOSE_USER_CNT = LOSE_USER_CNT;
  }
  public ST_LAN_PRODUCT_ORDER_M with_LOSE_USER_CNT(java.math.BigDecimal LOSE_USER_CNT) {
    this.LOSE_USER_CNT = LOSE_USER_CNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_LAN_PRODUCT_ORDER_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_LAN_PRODUCT_ORDER_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_LAN_PRODUCT_ORDER_M)) {
      return false;
    }
    ST_LAN_PRODUCT_ORDER_M that = (ST_LAN_PRODUCT_ORDER_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PRODUCT_ID == null ? that.PRODUCT_ID == null : this.PRODUCT_ID.equals(that.PRODUCT_ID));
    equal = equal && (this.PRODUCT_NAME == null ? that.PRODUCT_NAME == null : this.PRODUCT_NAME.equals(that.PRODUCT_NAME));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.ARPU == null ? that.ARPU == null : this.ARPU.equals(that.ARPU));
    equal = equal && (this.BILLING_TYPE == null ? that.BILLING_TYPE == null : this.BILLING_TYPE.equals(that.BILLING_TYPE));
    equal = equal && (this.ORDER_USER_CNT == null ? that.ORDER_USER_CNT == null : this.ORDER_USER_CNT.equals(that.ORDER_USER_CNT));
    equal = equal && (this.NEW_USER_CNT == null ? that.NEW_USER_CNT == null : this.NEW_USER_CNT.equals(that.NEW_USER_CNT));
    equal = equal && (this.LOSE_USER_CNT == null ? that.LOSE_USER_CNT == null : this.LOSE_USER_CNT.equals(that.LOSE_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_LAN_PRODUCT_ORDER_M)) {
      return false;
    }
    ST_LAN_PRODUCT_ORDER_M that = (ST_LAN_PRODUCT_ORDER_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PRODUCT_ID == null ? that.PRODUCT_ID == null : this.PRODUCT_ID.equals(that.PRODUCT_ID));
    equal = equal && (this.PRODUCT_NAME == null ? that.PRODUCT_NAME == null : this.PRODUCT_NAME.equals(that.PRODUCT_NAME));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.ARPU == null ? that.ARPU == null : this.ARPU.equals(that.ARPU));
    equal = equal && (this.BILLING_TYPE == null ? that.BILLING_TYPE == null : this.BILLING_TYPE.equals(that.BILLING_TYPE));
    equal = equal && (this.ORDER_USER_CNT == null ? that.ORDER_USER_CNT == null : this.ORDER_USER_CNT.equals(that.ORDER_USER_CNT));
    equal = equal && (this.NEW_USER_CNT == null ? that.NEW_USER_CNT == null : this.NEW_USER_CNT.equals(that.NEW_USER_CNT));
    equal = equal && (this.LOSE_USER_CNT == null ? that.LOSE_USER_CNT == null : this.LOSE_USER_CNT.equals(that.LOSE_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.PRODUCT_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.PRODUCT_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ARPU = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BILLING_TYPE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ORDER_USER_CNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.NEW_USER_CNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.LOSE_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.PRODUCT_ID = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.PRODUCT_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ARPU = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BILLING_TYPE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ORDER_USER_CNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.NEW_USER_CNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.LOSE_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BANDWIDTH, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ARPU, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILLING_TYPE, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORDER_USER_CNT, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CNT, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 14 + __off, 1, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRODUCT_ID, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BANDWIDTH, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ARPU, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILLING_TYPE, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORDER_USER_CNT, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CNT, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 14 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CYCLE_ID = null;
    } else {
    this.CYCLE_ID = Text.readString(__dataIn);
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
        this.PRODUCT_ID = null;
    } else {
    this.PRODUCT_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_NAME = null;
    } else {
    this.PRODUCT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BANDWIDTH = null;
    } else {
    this.BANDWIDTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CYCLE = null;
    } else {
    this.CYCLE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ARPU = null;
    } else {
    this.ARPU = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BILLING_TYPE = null;
    } else {
    this.BILLING_TYPE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORDER_USER_CNT = null;
    } else {
    this.ORDER_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_USER_CNT = null;
    } else {
    this.NEW_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_USER_CNT = null;
    } else {
    this.LOSE_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    Text.writeString(__dataOut, CYCLE_ID);
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
    if (null == this.PRODUCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_ID, __dataOut);
    }
    if (null == this.PRODUCT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_NAME);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BANDWIDTH, __dataOut);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ARPU, __dataOut);
    }
    if (null == this.BILLING_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILLING_TYPE, __dataOut);
    }
    if (null == this.ORDER_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORDER_USER_CNT, __dataOut);
    }
    if (null == this.NEW_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CNT, __dataOut);
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
    Text.writeString(__dataOut, CYCLE_ID);
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
    if (null == this.PRODUCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRODUCT_ID, __dataOut);
    }
    if (null == this.PRODUCT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_NAME);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BANDWIDTH, __dataOut);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ARPU, __dataOut);
    }
    if (null == this.BILLING_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILLING_TYPE, __dataOut);
    }
    if (null == this.ORDER_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORDER_USER_CNT, __dataOut);
    }
    if (null == this.NEW_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_ID==null?"null":PRODUCT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_NAME==null?"null":PRODUCT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ARPU==null?"null":ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILLING_TYPE==null?"null":BILLING_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORDER_USER_CNT==null?"null":ORDER_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CNT==null?"null":NEW_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CNT==null?"null":LOSE_USER_CNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_ID==null?"null":PRODUCT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_NAME==null?"null":PRODUCT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ARPU==null?"null":ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILLING_TYPE==null?"null":BILLING_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORDER_USER_CNT==null?"null":ORDER_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CNT==null?"null":NEW_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CNT==null?"null":LOSE_USER_CNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.CYCLE_ID = null; } else {
      this.CYCLE_ID = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRODUCT_ID = null; } else {
      this.PRODUCT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PRODUCT_NAME = null; } else {
      this.PRODUCT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ARPU = null; } else {
      this.ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILLING_TYPE = null; } else {
      this.BILLING_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ORDER_USER_CNT = null; } else {
      this.ORDER_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CNT = null; } else {
      this.NEW_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CNT = null; } else {
      this.LOSE_USER_CNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.CYCLE_ID = null; } else {
      this.CYCLE_ID = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRODUCT_ID = null; } else {
      this.PRODUCT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PRODUCT_NAME = null; } else {
      this.PRODUCT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ARPU = null; } else {
      this.ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILLING_TYPE = null; } else {
      this.BILLING_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ORDER_USER_CNT = null; } else {
      this.ORDER_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CNT = null; } else {
      this.NEW_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CNT = null; } else {
      this.LOSE_USER_CNT = new java.math.BigDecimal(__cur_str);
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
    ST_LAN_PRODUCT_ORDER_M o = (ST_LAN_PRODUCT_ORDER_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_LAN_PRODUCT_ORDER_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PRODUCT_ID", this.PRODUCT_ID);
    __sqoop$field_map.put("PRODUCT_NAME", this.PRODUCT_NAME);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("ARPU", this.ARPU);
    __sqoop$field_map.put("BILLING_TYPE", this.BILLING_TYPE);
    __sqoop$field_map.put("ORDER_USER_CNT", this.ORDER_USER_CNT);
    __sqoop$field_map.put("NEW_USER_CNT", this.NEW_USER_CNT);
    __sqoop$field_map.put("LOSE_USER_CNT", this.LOSE_USER_CNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PRODUCT_ID", this.PRODUCT_ID);
    __sqoop$field_map.put("PRODUCT_NAME", this.PRODUCT_NAME);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("ARPU", this.ARPU);
    __sqoop$field_map.put("BILLING_TYPE", this.BILLING_TYPE);
    __sqoop$field_map.put("ORDER_USER_CNT", this.ORDER_USER_CNT);
    __sqoop$field_map.put("NEW_USER_CNT", this.NEW_USER_CNT);
    __sqoop$field_map.put("LOSE_USER_CNT", this.LOSE_USER_CNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
    }
    else    if ("PRODUCT_ID".equals(__fieldName)) {
      this.PRODUCT_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PRODUCT_NAME".equals(__fieldName)) {
      this.PRODUCT_NAME = (String) __fieldVal;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ARPU".equals(__fieldName)) {
      this.ARPU = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BILLING_TYPE".equals(__fieldName)) {
      this.BILLING_TYPE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ORDER_USER_CNT".equals(__fieldName)) {
      this.ORDER_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_USER_CNT".equals(__fieldName)) {
      this.NEW_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_USER_CNT".equals(__fieldName)) {
      this.LOSE_USER_CNT = (java.math.BigDecimal) __fieldVal;
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
      this.CYCLE_ID = (String) __fieldVal;
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
    else    if ("PRODUCT_ID".equals(__fieldName)) {
      this.PRODUCT_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PRODUCT_NAME".equals(__fieldName)) {
      this.PRODUCT_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ARPU".equals(__fieldName)) {
      this.ARPU = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BILLING_TYPE".equals(__fieldName)) {
      this.BILLING_TYPE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ORDER_USER_CNT".equals(__fieldName)) {
      this.ORDER_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_USER_CNT".equals(__fieldName)) {
      this.NEW_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_USER_CNT".equals(__fieldName)) {
      this.LOSE_USER_CNT = (java.math.BigDecimal) __fieldVal;
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