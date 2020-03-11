// ORM class for table 'ST_AUTH_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 05 12:32:27 CST 2019
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

public class ST_AUTH_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_AUTH_M with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private java.math.BigDecimal AUTH_COUNT;
  public java.math.BigDecimal get_AUTH_COUNT() {
    return AUTH_COUNT;
  }
  public void set_AUTH_COUNT(java.math.BigDecimal AUTH_COUNT) {
    this.AUTH_COUNT = AUTH_COUNT;
  }
  public ST_AUTH_M with_AUTH_COUNT(java.math.BigDecimal AUTH_COUNT) {
    this.AUTH_COUNT = AUTH_COUNT;
    return this;
  }
  private java.math.BigDecimal AUTH_SUCCESS_COUNT;
  public java.math.BigDecimal get_AUTH_SUCCESS_COUNT() {
    return AUTH_SUCCESS_COUNT;
  }
  public void set_AUTH_SUCCESS_COUNT(java.math.BigDecimal AUTH_SUCCESS_COUNT) {
    this.AUTH_SUCCESS_COUNT = AUTH_SUCCESS_COUNT;
  }
  public ST_AUTH_M with_AUTH_SUCCESS_COUNT(java.math.BigDecimal AUTH_SUCCESS_COUNT) {
    this.AUTH_SUCCESS_COUNT = AUTH_SUCCESS_COUNT;
    return this;
  }
  private java.math.BigDecimal AUTH_SUCCESS_RATE;
  public java.math.BigDecimal get_AUTH_SUCCESS_RATE() {
    return AUTH_SUCCESS_RATE;
  }
  public void set_AUTH_SUCCESS_RATE(java.math.BigDecimal AUTH_SUCCESS_RATE) {
    this.AUTH_SUCCESS_RATE = AUTH_SUCCESS_RATE;
  }
  public ST_AUTH_M with_AUTH_SUCCESS_RATE(java.math.BigDecimal AUTH_SUCCESS_RATE) {
    this.AUTH_SUCCESS_RATE = AUTH_SUCCESS_RATE;
    return this;
  }
  private java.math.BigDecimal AUTH_FAILURE_COUNT;
  public java.math.BigDecimal get_AUTH_FAILURE_COUNT() {
    return AUTH_FAILURE_COUNT;
  }
  public void set_AUTH_FAILURE_COUNT(java.math.BigDecimal AUTH_FAILURE_COUNT) {
    this.AUTH_FAILURE_COUNT = AUTH_FAILURE_COUNT;
  }
  public ST_AUTH_M with_AUTH_FAILURE_COUNT(java.math.BigDecimal AUTH_FAILURE_COUNT) {
    this.AUTH_FAILURE_COUNT = AUTH_FAILURE_COUNT;
    return this;
  }
  private java.math.BigDecimal AUTH_FAILURE_RATE;
  public java.math.BigDecimal get_AUTH_FAILURE_RATE() {
    return AUTH_FAILURE_RATE;
  }
  public void set_AUTH_FAILURE_RATE(java.math.BigDecimal AUTH_FAILURE_RATE) {
    this.AUTH_FAILURE_RATE = AUTH_FAILURE_RATE;
  }
  public ST_AUTH_M with_AUTH_FAILURE_RATE(java.math.BigDecimal AUTH_FAILURE_RATE) {
    this.AUTH_FAILURE_RATE = AUTH_FAILURE_RATE;
    return this;
  }
  private java.math.BigDecimal AUTH_USER_COUNT;
  public java.math.BigDecimal get_AUTH_USER_COUNT() {
    return AUTH_USER_COUNT;
  }
  public void set_AUTH_USER_COUNT(java.math.BigDecimal AUTH_USER_COUNT) {
    this.AUTH_USER_COUNT = AUTH_USER_COUNT;
  }
  public ST_AUTH_M with_AUTH_USER_COUNT(java.math.BigDecimal AUTH_USER_COUNT) {
    this.AUTH_USER_COUNT = AUTH_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal ONLINE_USER_COUNT;
  public java.math.BigDecimal get_ONLINE_USER_COUNT() {
    return ONLINE_USER_COUNT;
  }
  public void set_ONLINE_USER_COUNT(java.math.BigDecimal ONLINE_USER_COUNT) {
    this.ONLINE_USER_COUNT = ONLINE_USER_COUNT;
  }
  public ST_AUTH_M with_ONLINE_USER_COUNT(java.math.BigDecimal ONLINE_USER_COUNT) {
    this.ONLINE_USER_COUNT = ONLINE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BROWSE_USER_COUNT;
  public java.math.BigDecimal get_BROWSE_USER_COUNT() {
    return BROWSE_USER_COUNT;
  }
  public void set_BROWSE_USER_COUNT(java.math.BigDecimal BROWSE_USER_COUNT) {
    this.BROWSE_USER_COUNT = BROWSE_USER_COUNT;
  }
  public ST_AUTH_M with_BROWSE_USER_COUNT(java.math.BigDecimal BROWSE_USER_COUNT) {
    this.BROWSE_USER_COUNT = BROWSE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal AUTH_RATE;
  public java.math.BigDecimal get_AUTH_RATE() {
    return AUTH_RATE;
  }
  public void set_AUTH_RATE(java.math.BigDecimal AUTH_RATE) {
    this.AUTH_RATE = AUTH_RATE;
  }
  public ST_AUTH_M with_AUTH_RATE(java.math.BigDecimal AUTH_RATE) {
    this.AUTH_RATE = AUTH_RATE;
    return this;
  }
  private java.math.BigDecimal BROWSE_RATE;
  public java.math.BigDecimal get_BROWSE_RATE() {
    return BROWSE_RATE;
  }
  public void set_BROWSE_RATE(java.math.BigDecimal BROWSE_RATE) {
    this.BROWSE_RATE = BROWSE_RATE;
  }
  public ST_AUTH_M with_BROWSE_RATE(java.math.BigDecimal BROWSE_RATE) {
    this.BROWSE_RATE = BROWSE_RATE;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_AUTH_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private String OWN_CORP_STD_ORG_CODE;
  public String get_OWN_CORP_STD_ORG_CODE() {
    return OWN_CORP_STD_ORG_CODE;
  }
  public void set_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
  }
  public ST_AUTH_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_AUTH_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String PT_MON;
  public String get_PT_MON() {
    return PT_MON;
  }
  public void set_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
  }
  public ST_AUTH_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_AUTH_M)) {
      return false;
    }
    ST_AUTH_M that = (ST_AUTH_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.AUTH_COUNT == null ? that.AUTH_COUNT == null : this.AUTH_COUNT.equals(that.AUTH_COUNT));
    equal = equal && (this.AUTH_SUCCESS_COUNT == null ? that.AUTH_SUCCESS_COUNT == null : this.AUTH_SUCCESS_COUNT.equals(that.AUTH_SUCCESS_COUNT));
    equal = equal && (this.AUTH_SUCCESS_RATE == null ? that.AUTH_SUCCESS_RATE == null : this.AUTH_SUCCESS_RATE.equals(that.AUTH_SUCCESS_RATE));
    equal = equal && (this.AUTH_FAILURE_COUNT == null ? that.AUTH_FAILURE_COUNT == null : this.AUTH_FAILURE_COUNT.equals(that.AUTH_FAILURE_COUNT));
    equal = equal && (this.AUTH_FAILURE_RATE == null ? that.AUTH_FAILURE_RATE == null : this.AUTH_FAILURE_RATE.equals(that.AUTH_FAILURE_RATE));
    equal = equal && (this.AUTH_USER_COUNT == null ? that.AUTH_USER_COUNT == null : this.AUTH_USER_COUNT.equals(that.AUTH_USER_COUNT));
    equal = equal && (this.ONLINE_USER_COUNT == null ? that.ONLINE_USER_COUNT == null : this.ONLINE_USER_COUNT.equals(that.ONLINE_USER_COUNT));
    equal = equal && (this.BROWSE_USER_COUNT == null ? that.BROWSE_USER_COUNT == null : this.BROWSE_USER_COUNT.equals(that.BROWSE_USER_COUNT));
    equal = equal && (this.AUTH_RATE == null ? that.AUTH_RATE == null : this.AUTH_RATE.equals(that.AUTH_RATE));
    equal = equal && (this.BROWSE_RATE == null ? that.BROWSE_RATE == null : this.BROWSE_RATE.equals(that.BROWSE_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_AUTH_M)) {
      return false;
    }
    ST_AUTH_M that = (ST_AUTH_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.AUTH_COUNT == null ? that.AUTH_COUNT == null : this.AUTH_COUNT.equals(that.AUTH_COUNT));
    equal = equal && (this.AUTH_SUCCESS_COUNT == null ? that.AUTH_SUCCESS_COUNT == null : this.AUTH_SUCCESS_COUNT.equals(that.AUTH_SUCCESS_COUNT));
    equal = equal && (this.AUTH_SUCCESS_RATE == null ? that.AUTH_SUCCESS_RATE == null : this.AUTH_SUCCESS_RATE.equals(that.AUTH_SUCCESS_RATE));
    equal = equal && (this.AUTH_FAILURE_COUNT == null ? that.AUTH_FAILURE_COUNT == null : this.AUTH_FAILURE_COUNT.equals(that.AUTH_FAILURE_COUNT));
    equal = equal && (this.AUTH_FAILURE_RATE == null ? that.AUTH_FAILURE_RATE == null : this.AUTH_FAILURE_RATE.equals(that.AUTH_FAILURE_RATE));
    equal = equal && (this.AUTH_USER_COUNT == null ? that.AUTH_USER_COUNT == null : this.AUTH_USER_COUNT.equals(that.AUTH_USER_COUNT));
    equal = equal && (this.ONLINE_USER_COUNT == null ? that.ONLINE_USER_COUNT == null : this.ONLINE_USER_COUNT.equals(that.ONLINE_USER_COUNT));
    equal = equal && (this.BROWSE_USER_COUNT == null ? that.BROWSE_USER_COUNT == null : this.BROWSE_USER_COUNT.equals(that.BROWSE_USER_COUNT));
    equal = equal && (this.AUTH_RATE == null ? that.AUTH_RATE == null : this.AUTH_RATE.equals(that.AUTH_RATE));
    equal = equal && (this.BROWSE_RATE == null ? that.BROWSE_RATE == null : this.BROWSE_RATE.equals(that.BROWSE_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.AUTH_COUNT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.AUTH_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.AUTH_SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.AUTH_FAILURE_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.AUTH_FAILURE_RATE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.AUTH_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ONLINE_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BROWSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AUTH_RATE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.BROWSE_RATE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(13, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(14, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.AUTH_COUNT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.AUTH_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.AUTH_SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.AUTH_FAILURE_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.AUTH_FAILURE_RATE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.AUTH_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ONLINE_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BROWSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AUTH_RATE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.BROWSE_RATE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(13, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(14, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_COUNT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_RATE, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_FAILURE_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_FAILURE_RATE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONLINE_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BROWSE_USER_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_RATE, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BROWSE_RATE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 1, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_COUNT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_SUCCESS_RATE, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_FAILURE_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_FAILURE_RATE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONLINE_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BROWSE_USER_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AUTH_RATE, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BROWSE_RATE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 1, __dbStmt);
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
        this.AUTH_COUNT = null;
    } else {
    this.AUTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_SUCCESS_COUNT = null;
    } else {
    this.AUTH_SUCCESS_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_SUCCESS_RATE = null;
    } else {
    this.AUTH_SUCCESS_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_FAILURE_COUNT = null;
    } else {
    this.AUTH_FAILURE_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_FAILURE_RATE = null;
    } else {
    this.AUTH_FAILURE_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_USER_COUNT = null;
    } else {
    this.AUTH_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ONLINE_USER_COUNT = null;
    } else {
    this.ONLINE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BROWSE_USER_COUNT = null;
    } else {
    this.BROWSE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUTH_RATE = null;
    } else {
    this.AUTH_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BROWSE_RATE = null;
    } else {
    this.BROWSE_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
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
    if (null == this.AUTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_RATE, __dataOut);
    }
    if (null == this.AUTH_FAILURE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_FAILURE_COUNT, __dataOut);
    }
    if (null == this.AUTH_FAILURE_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_FAILURE_RATE, __dataOut);
    }
    if (null == this.AUTH_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_USER_COUNT, __dataOut);
    }
    if (null == this.ONLINE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONLINE_USER_COUNT, __dataOut);
    }
    if (null == this.BROWSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BROWSE_USER_COUNT, __dataOut);
    }
    if (null == this.AUTH_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_RATE, __dataOut);
    }
    if (null == this.BROWSE_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BROWSE_RATE, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
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
    if (null == this.AUTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.AUTH_SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_SUCCESS_RATE, __dataOut);
    }
    if (null == this.AUTH_FAILURE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_FAILURE_COUNT, __dataOut);
    }
    if (null == this.AUTH_FAILURE_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_FAILURE_RATE, __dataOut);
    }
    if (null == this.AUTH_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_USER_COUNT, __dataOut);
    }
    if (null == this.ONLINE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONLINE_USER_COUNT, __dataOut);
    }
    if (null == this.BROWSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BROWSE_USER_COUNT, __dataOut);
    }
    if (null == this.AUTH_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AUTH_RATE, __dataOut);
    }
    if (null == this.BROWSE_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BROWSE_RATE, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_COUNT==null?"null":AUTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_COUNT==null?"null":AUTH_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_RATE==null?"null":AUTH_SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_FAILURE_COUNT==null?"null":AUTH_FAILURE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_FAILURE_RATE==null?"null":AUTH_FAILURE_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_USER_COUNT==null?"null":AUTH_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONLINE_USER_COUNT==null?"null":ONLINE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROWSE_USER_COUNT==null?"null":BROWSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_RATE==null?"null":AUTH_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROWSE_RATE==null?"null":BROWSE_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_COUNT==null?"null":AUTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_COUNT==null?"null":AUTH_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_SUCCESS_RATE==null?"null":AUTH_SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_FAILURE_COUNT==null?"null":AUTH_FAILURE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_FAILURE_RATE==null?"null":AUTH_FAILURE_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_USER_COUNT==null?"null":AUTH_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONLINE_USER_COUNT==null?"null":ONLINE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROWSE_USER_COUNT==null?"null":BROWSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUTH_RATE==null?"null":AUTH_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROWSE_RATE==null?"null":BROWSE_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_COUNT = null; } else {
      this.AUTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_COUNT = null; } else {
      this.AUTH_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_RATE = null; } else {
      this.AUTH_SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_FAILURE_COUNT = null; } else {
      this.AUTH_FAILURE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_FAILURE_RATE = null; } else {
      this.AUTH_FAILURE_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_USER_COUNT = null; } else {
      this.AUTH_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONLINE_USER_COUNT = null; } else {
      this.ONLINE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BROWSE_USER_COUNT = null; } else {
      this.BROWSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_RATE = null; } else {
      this.AUTH_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BROWSE_RATE = null; } else {
      this.BROWSE_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_COUNT = null; } else {
      this.AUTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_COUNT = null; } else {
      this.AUTH_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_SUCCESS_RATE = null; } else {
      this.AUTH_SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_FAILURE_COUNT = null; } else {
      this.AUTH_FAILURE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_FAILURE_RATE = null; } else {
      this.AUTH_FAILURE_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_USER_COUNT = null; } else {
      this.AUTH_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONLINE_USER_COUNT = null; } else {
      this.ONLINE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BROWSE_USER_COUNT = null; } else {
      this.BROWSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AUTH_RATE = null; } else {
      this.AUTH_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BROWSE_RATE = null; } else {
      this.BROWSE_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.PT_MON = null; } else {
      this.PT_MON = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_AUTH_M o = (ST_AUTH_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_AUTH_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("AUTH_COUNT", this.AUTH_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_COUNT", this.AUTH_SUCCESS_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_RATE", this.AUTH_SUCCESS_RATE);
    __sqoop$field_map.put("AUTH_FAILURE_COUNT", this.AUTH_FAILURE_COUNT);
    __sqoop$field_map.put("AUTH_FAILURE_RATE", this.AUTH_FAILURE_RATE);
    __sqoop$field_map.put("AUTH_USER_COUNT", this.AUTH_USER_COUNT);
    __sqoop$field_map.put("ONLINE_USER_COUNT", this.ONLINE_USER_COUNT);
    __sqoop$field_map.put("BROWSE_USER_COUNT", this.BROWSE_USER_COUNT);
    __sqoop$field_map.put("AUTH_RATE", this.AUTH_RATE);
    __sqoop$field_map.put("BROWSE_RATE", this.BROWSE_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("AUTH_COUNT", this.AUTH_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_COUNT", this.AUTH_SUCCESS_COUNT);
    __sqoop$field_map.put("AUTH_SUCCESS_RATE", this.AUTH_SUCCESS_RATE);
    __sqoop$field_map.put("AUTH_FAILURE_COUNT", this.AUTH_FAILURE_COUNT);
    __sqoop$field_map.put("AUTH_FAILURE_RATE", this.AUTH_FAILURE_RATE);
    __sqoop$field_map.put("AUTH_USER_COUNT", this.AUTH_USER_COUNT);
    __sqoop$field_map.put("ONLINE_USER_COUNT", this.ONLINE_USER_COUNT);
    __sqoop$field_map.put("BROWSE_USER_COUNT", this.BROWSE_USER_COUNT);
    __sqoop$field_map.put("AUTH_RATE", this.AUTH_RATE);
    __sqoop$field_map.put("BROWSE_RATE", this.BROWSE_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("AUTH_COUNT".equals(__fieldName)) {
      this.AUTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_SUCCESS_COUNT".equals(__fieldName)) {
      this.AUTH_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_SUCCESS_RATE".equals(__fieldName)) {
      this.AUTH_SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_FAILURE_COUNT".equals(__fieldName)) {
      this.AUTH_FAILURE_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_FAILURE_RATE".equals(__fieldName)) {
      this.AUTH_FAILURE_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_USER_COUNT".equals(__fieldName)) {
      this.AUTH_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ONLINE_USER_COUNT".equals(__fieldName)) {
      this.ONLINE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BROWSE_USER_COUNT".equals(__fieldName)) {
      this.BROWSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AUTH_RATE".equals(__fieldName)) {
      this.AUTH_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BROWSE_RATE".equals(__fieldName)) {
      this.BROWSE_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
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
    else    if ("AUTH_COUNT".equals(__fieldName)) {
      this.AUTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_SUCCESS_COUNT".equals(__fieldName)) {
      this.AUTH_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_SUCCESS_RATE".equals(__fieldName)) {
      this.AUTH_SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_FAILURE_COUNT".equals(__fieldName)) {
      this.AUTH_FAILURE_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_FAILURE_RATE".equals(__fieldName)) {
      this.AUTH_FAILURE_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_USER_COUNT".equals(__fieldName)) {
      this.AUTH_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ONLINE_USER_COUNT".equals(__fieldName)) {
      this.ONLINE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BROWSE_USER_COUNT".equals(__fieldName)) {
      this.BROWSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AUTH_RATE".equals(__fieldName)) {
      this.AUTH_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BROWSE_RATE".equals(__fieldName)) {
      this.BROWSE_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
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
    else    if ("PT_MON".equals(__fieldName)) {
      this.PT_MON = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}