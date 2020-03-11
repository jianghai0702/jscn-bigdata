// ORM class for table 'ST_DNS_RESPONSE_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 05 12:35:23 CST 2019
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

public class ST_DNS_RESPONSE_M extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String OWN_CORP_STD_ORG_CODE;
  public String get_OWN_CORP_STD_ORG_CODE() {
    return OWN_CORP_STD_ORG_CODE;
  }
  public void set_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
  }
  public ST_DNS_RESPONSE_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_DNS_RESPONSE_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal INTRANET_SUCCESS_COUNT;
  public java.math.BigDecimal get_INTRANET_SUCCESS_COUNT() {
    return INTRANET_SUCCESS_COUNT;
  }
  public void set_INTRANET_SUCCESS_COUNT(java.math.BigDecimal INTRANET_SUCCESS_COUNT) {
    this.INTRANET_SUCCESS_COUNT = INTRANET_SUCCESS_COUNT;
  }
  public ST_DNS_RESPONSE_M with_INTRANET_SUCCESS_COUNT(java.math.BigDecimal INTRANET_SUCCESS_COUNT) {
    this.INTRANET_SUCCESS_COUNT = INTRANET_SUCCESS_COUNT;
    return this;
  }
  private java.math.BigDecimal EXTRANET_SUCCESS_COUNT;
  public java.math.BigDecimal get_EXTRANET_SUCCESS_COUNT() {
    return EXTRANET_SUCCESS_COUNT;
  }
  public void set_EXTRANET_SUCCESS_COUNT(java.math.BigDecimal EXTRANET_SUCCESS_COUNT) {
    this.EXTRANET_SUCCESS_COUNT = EXTRANET_SUCCESS_COUNT;
  }
  public ST_DNS_RESPONSE_M with_EXTRANET_SUCCESS_COUNT(java.math.BigDecimal EXTRANET_SUCCESS_COUNT) {
    this.EXTRANET_SUCCESS_COUNT = EXTRANET_SUCCESS_COUNT;
    return this;
  }
  private java.math.BigDecimal TOTAL_COUNT;
  public java.math.BigDecimal get_TOTAL_COUNT() {
    return TOTAL_COUNT;
  }
  public void set_TOTAL_COUNT(java.math.BigDecimal TOTAL_COUNT) {
    this.TOTAL_COUNT = TOTAL_COUNT;
  }
  public ST_DNS_RESPONSE_M with_TOTAL_COUNT(java.math.BigDecimal TOTAL_COUNT) {
    this.TOTAL_COUNT = TOTAL_COUNT;
    return this;
  }
  private java.math.BigDecimal SUCCESS_RATE;
  public java.math.BigDecimal get_SUCCESS_RATE() {
    return SUCCESS_RATE;
  }
  public void set_SUCCESS_RATE(java.math.BigDecimal SUCCESS_RATE) {
    this.SUCCESS_RATE = SUCCESS_RATE;
  }
  public ST_DNS_RESPONSE_M with_SUCCESS_RATE(java.math.BigDecimal SUCCESS_RATE) {
    this.SUCCESS_RATE = SUCCESS_RATE;
    return this;
  }
  private java.math.BigDecimal EXTRANET_COUNT;
  public java.math.BigDecimal get_EXTRANET_COUNT() {
    return EXTRANET_COUNT;
  }
  public void set_EXTRANET_COUNT(java.math.BigDecimal EXTRANET_COUNT) {
    this.EXTRANET_COUNT = EXTRANET_COUNT;
  }
  public ST_DNS_RESPONSE_M with_EXTRANET_COUNT(java.math.BigDecimal EXTRANET_COUNT) {
    this.EXTRANET_COUNT = EXTRANET_COUNT;
    return this;
  }
  private java.math.BigDecimal EXTRANET_RATE;
  public java.math.BigDecimal get_EXTRANET_RATE() {
    return EXTRANET_RATE;
  }
  public void set_EXTRANET_RATE(java.math.BigDecimal EXTRANET_RATE) {
    this.EXTRANET_RATE = EXTRANET_RATE;
  }
  public ST_DNS_RESPONSE_M with_EXTRANET_RATE(java.math.BigDecimal EXTRANET_RATE) {
    this.EXTRANET_RATE = EXTRANET_RATE;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_DNS_RESPONSE_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_DNS_RESPONSE_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DNS_RESPONSE_M)) {
      return false;
    }
    ST_DNS_RESPONSE_M that = (ST_DNS_RESPONSE_M) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.INTRANET_SUCCESS_COUNT == null ? that.INTRANET_SUCCESS_COUNT == null : this.INTRANET_SUCCESS_COUNT.equals(that.INTRANET_SUCCESS_COUNT));
    equal = equal && (this.EXTRANET_SUCCESS_COUNT == null ? that.EXTRANET_SUCCESS_COUNT == null : this.EXTRANET_SUCCESS_COUNT.equals(that.EXTRANET_SUCCESS_COUNT));
    equal = equal && (this.TOTAL_COUNT == null ? that.TOTAL_COUNT == null : this.TOTAL_COUNT.equals(that.TOTAL_COUNT));
    equal = equal && (this.SUCCESS_RATE == null ? that.SUCCESS_RATE == null : this.SUCCESS_RATE.equals(that.SUCCESS_RATE));
    equal = equal && (this.EXTRANET_COUNT == null ? that.EXTRANET_COUNT == null : this.EXTRANET_COUNT.equals(that.EXTRANET_COUNT));
    equal = equal && (this.EXTRANET_RATE == null ? that.EXTRANET_RATE == null : this.EXTRANET_RATE.equals(that.EXTRANET_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DNS_RESPONSE_M)) {
      return false;
    }
    ST_DNS_RESPONSE_M that = (ST_DNS_RESPONSE_M) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.INTRANET_SUCCESS_COUNT == null ? that.INTRANET_SUCCESS_COUNT == null : this.INTRANET_SUCCESS_COUNT.equals(that.INTRANET_SUCCESS_COUNT));
    equal = equal && (this.EXTRANET_SUCCESS_COUNT == null ? that.EXTRANET_SUCCESS_COUNT == null : this.EXTRANET_SUCCESS_COUNT.equals(that.EXTRANET_SUCCESS_COUNT));
    equal = equal && (this.TOTAL_COUNT == null ? that.TOTAL_COUNT == null : this.TOTAL_COUNT.equals(that.TOTAL_COUNT));
    equal = equal && (this.SUCCESS_RATE == null ? that.SUCCESS_RATE == null : this.SUCCESS_RATE.equals(that.SUCCESS_RATE));
    equal = equal && (this.EXTRANET_COUNT == null ? that.EXTRANET_COUNT == null : this.EXTRANET_COUNT.equals(that.EXTRANET_COUNT));
    equal = equal && (this.EXTRANET_RATE == null ? that.EXTRANET_RATE == null : this.EXTRANET_RATE.equals(that.EXTRANET_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.INTRANET_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.EXTRANET_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.TOTAL_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.EXTRANET_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.EXTRANET_RATE = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.INTRANET_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.EXTRANET_SUCCESS_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.TOTAL_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.SUCCESS_RATE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.EXTRANET_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.EXTRANET_RATE = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INTRANET_SUCCESS_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_SUCCESS_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SUCCESS_RATE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_RATE, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INTRANET_SUCCESS_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_SUCCESS_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SUCCESS_RATE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXTRANET_RATE, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 10 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
        this.INTRANET_SUCCESS_COUNT = null;
    } else {
    this.INTRANET_SUCCESS_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXTRANET_SUCCESS_COUNT = null;
    } else {
    this.EXTRANET_SUCCESS_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOTAL_COUNT = null;
    } else {
    this.TOTAL_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUCCESS_RATE = null;
    } else {
    this.SUCCESS_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXTRANET_COUNT = null;
    } else {
    this.EXTRANET_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXTRANET_RATE = null;
    } else {
    this.EXTRANET_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.INTRANET_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INTRANET_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.EXTRANET_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.TOTAL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_COUNT, __dataOut);
    }
    if (null == this.SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SUCCESS_RATE, __dataOut);
    }
    if (null == this.EXTRANET_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_COUNT, __dataOut);
    }
    if (null == this.EXTRANET_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_RATE, __dataOut);
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
    if (null == this.INTRANET_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INTRANET_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.EXTRANET_SUCCESS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_SUCCESS_COUNT, __dataOut);
    }
    if (null == this.TOTAL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_COUNT, __dataOut);
    }
    if (null == this.SUCCESS_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SUCCESS_RATE, __dataOut);
    }
    if (null == this.EXTRANET_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_COUNT, __dataOut);
    }
    if (null == this.EXTRANET_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXTRANET_RATE, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INTRANET_SUCCESS_COUNT==null?"null":INTRANET_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_SUCCESS_COUNT==null?"null":EXTRANET_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_COUNT==null?"null":TOTAL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUCCESS_RATE==null?"null":SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_COUNT==null?"null":EXTRANET_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_RATE==null?"null":EXTRANET_RATE.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INTRANET_SUCCESS_COUNT==null?"null":INTRANET_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_SUCCESS_COUNT==null?"null":EXTRANET_SUCCESS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_COUNT==null?"null":TOTAL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUCCESS_RATE==null?"null":SUCCESS_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_COUNT==null?"null":EXTRANET_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTRANET_RATE==null?"null":EXTRANET_RATE.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INTRANET_SUCCESS_COUNT = null; } else {
      this.INTRANET_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_SUCCESS_COUNT = null; } else {
      this.EXTRANET_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_COUNT = null; } else {
      this.TOTAL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SUCCESS_RATE = null; } else {
      this.SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_COUNT = null; } else {
      this.EXTRANET_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_RATE = null; } else {
      this.EXTRANET_RATE = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INTRANET_SUCCESS_COUNT = null; } else {
      this.INTRANET_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_SUCCESS_COUNT = null; } else {
      this.EXTRANET_SUCCESS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_COUNT = null; } else {
      this.TOTAL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SUCCESS_RATE = null; } else {
      this.SUCCESS_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_COUNT = null; } else {
      this.EXTRANET_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXTRANET_RATE = null; } else {
      this.EXTRANET_RATE = new java.math.BigDecimal(__cur_str);
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
    ST_DNS_RESPONSE_M o = (ST_DNS_RESPONSE_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_DNS_RESPONSE_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("INTRANET_SUCCESS_COUNT", this.INTRANET_SUCCESS_COUNT);
    __sqoop$field_map.put("EXTRANET_SUCCESS_COUNT", this.EXTRANET_SUCCESS_COUNT);
    __sqoop$field_map.put("TOTAL_COUNT", this.TOTAL_COUNT);
    __sqoop$field_map.put("SUCCESS_RATE", this.SUCCESS_RATE);
    __sqoop$field_map.put("EXTRANET_COUNT", this.EXTRANET_COUNT);
    __sqoop$field_map.put("EXTRANET_RATE", this.EXTRANET_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("INTRANET_SUCCESS_COUNT", this.INTRANET_SUCCESS_COUNT);
    __sqoop$field_map.put("EXTRANET_SUCCESS_COUNT", this.EXTRANET_SUCCESS_COUNT);
    __sqoop$field_map.put("TOTAL_COUNT", this.TOTAL_COUNT);
    __sqoop$field_map.put("SUCCESS_RATE", this.SUCCESS_RATE);
    __sqoop$field_map.put("EXTRANET_COUNT", this.EXTRANET_COUNT);
    __sqoop$field_map.put("EXTRANET_RATE", this.EXTRANET_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
    }
    else    if ("INTRANET_SUCCESS_COUNT".equals(__fieldName)) {
      this.INTRANET_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXTRANET_SUCCESS_COUNT".equals(__fieldName)) {
      this.EXTRANET_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOTAL_COUNT".equals(__fieldName)) {
      this.TOTAL_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SUCCESS_RATE".equals(__fieldName)) {
      this.SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXTRANET_COUNT".equals(__fieldName)) {
      this.EXTRANET_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXTRANET_RATE".equals(__fieldName)) {
      this.EXTRANET_RATE = (java.math.BigDecimal) __fieldVal;
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
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("INTRANET_SUCCESS_COUNT".equals(__fieldName)) {
      this.INTRANET_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXTRANET_SUCCESS_COUNT".equals(__fieldName)) {
      this.EXTRANET_SUCCESS_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOTAL_COUNT".equals(__fieldName)) {
      this.TOTAL_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SUCCESS_RATE".equals(__fieldName)) {
      this.SUCCESS_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXTRANET_COUNT".equals(__fieldName)) {
      this.EXTRANET_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXTRANET_RATE".equals(__fieldName)) {
      this.EXTRANET_RATE = (java.math.BigDecimal) __fieldVal;
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
