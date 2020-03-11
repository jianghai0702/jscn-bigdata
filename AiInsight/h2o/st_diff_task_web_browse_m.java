// ORM class for table 'st_diff_task_web_browse_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 19:43:10 CST 2018
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

public class st_diff_task_web_browse_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_diff_task_web_browse_m with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String TASK_NAME;
  public String get_TASK_NAME() {
    return TASK_NAME;
  }
  public void set_TASK_NAME(String TASK_NAME) {
    this.TASK_NAME = TASK_NAME;
  }
  public st_diff_task_web_browse_m with_TASK_NAME(String TASK_NAME) {
    this.TASK_NAME = TASK_NAME;
    return this;
  }
  private java.math.BigDecimal PERFORMANCE;
  public java.math.BigDecimal get_PERFORMANCE() {
    return PERFORMANCE;
  }
  public void set_PERFORMANCE(java.math.BigDecimal PERFORMANCE) {
    this.PERFORMANCE = PERFORMANCE;
  }
  public st_diff_task_web_browse_m with_PERFORMANCE(java.math.BigDecimal PERFORMANCE) {
    this.PERFORMANCE = PERFORMANCE;
    return this;
  }
  private java.math.BigDecimal FIRST_SCREEN_TIME;
  public java.math.BigDecimal get_FIRST_SCREEN_TIME() {
    return FIRST_SCREEN_TIME;
  }
  public void set_FIRST_SCREEN_TIME(java.math.BigDecimal FIRST_SCREEN_TIME) {
    this.FIRST_SCREEN_TIME = FIRST_SCREEN_TIME;
  }
  public st_diff_task_web_browse_m with_FIRST_SCREEN_TIME(java.math.BigDecimal FIRST_SCREEN_TIME) {
    this.FIRST_SCREEN_TIME = FIRST_SCREEN_TIME;
    return this;
  }
  private java.math.BigDecimal DOWNLOAD_TIME;
  public java.math.BigDecimal get_DOWNLOAD_TIME() {
    return DOWNLOAD_TIME;
  }
  public void set_DOWNLOAD_TIME(java.math.BigDecimal DOWNLOAD_TIME) {
    this.DOWNLOAD_TIME = DOWNLOAD_TIME;
  }
  public st_diff_task_web_browse_m with_DOWNLOAD_TIME(java.math.BigDecimal DOWNLOAD_TIME) {
    this.DOWNLOAD_TIME = DOWNLOAD_TIME;
    return this;
  }
  private java.math.BigDecimal MONITOR_COUNT;
  public java.math.BigDecimal get_MONITOR_COUNT() {
    return MONITOR_COUNT;
  }
  public void set_MONITOR_COUNT(java.math.BigDecimal MONITOR_COUNT) {
    this.MONITOR_COUNT = MONITOR_COUNT;
  }
  public st_diff_task_web_browse_m with_MONITOR_COUNT(java.math.BigDecimal MONITOR_COUNT) {
    this.MONITOR_COUNT = MONITOR_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_diff_task_web_browse_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_diff_task_web_browse_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_task_web_browse_m)) {
      return false;
    }
    st_diff_task_web_browse_m that = (st_diff_task_web_browse_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.TASK_NAME == null ? that.TASK_NAME == null : this.TASK_NAME.equals(that.TASK_NAME));
    equal = equal && (this.PERFORMANCE == null ? that.PERFORMANCE == null : this.PERFORMANCE.equals(that.PERFORMANCE));
    equal = equal && (this.FIRST_SCREEN_TIME == null ? that.FIRST_SCREEN_TIME == null : this.FIRST_SCREEN_TIME.equals(that.FIRST_SCREEN_TIME));
    equal = equal && (this.DOWNLOAD_TIME == null ? that.DOWNLOAD_TIME == null : this.DOWNLOAD_TIME.equals(that.DOWNLOAD_TIME));
    equal = equal && (this.MONITOR_COUNT == null ? that.MONITOR_COUNT == null : this.MONITOR_COUNT.equals(that.MONITOR_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_task_web_browse_m)) {
      return false;
    }
    st_diff_task_web_browse_m that = (st_diff_task_web_browse_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.TASK_NAME == null ? that.TASK_NAME == null : this.TASK_NAME.equals(that.TASK_NAME));
    equal = equal && (this.PERFORMANCE == null ? that.PERFORMANCE == null : this.PERFORMANCE.equals(that.PERFORMANCE));
    equal = equal && (this.FIRST_SCREEN_TIME == null ? that.FIRST_SCREEN_TIME == null : this.FIRST_SCREEN_TIME.equals(that.FIRST_SCREEN_TIME));
    equal = equal && (this.DOWNLOAD_TIME == null ? that.DOWNLOAD_TIME == null : this.DOWNLOAD_TIME.equals(that.DOWNLOAD_TIME));
    equal = equal && (this.MONITOR_COUNT == null ? that.MONITOR_COUNT == null : this.MONITOR_COUNT.equals(that.MONITOR_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.TASK_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.PERFORMANCE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FIRST_SCREEN_TIME = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DOWNLOAD_TIME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.MONITOR_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.TASK_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.PERFORMANCE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FIRST_SCREEN_TIME = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DOWNLOAD_TIME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.MONITOR_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeString(TASK_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERFORMANCE, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FIRST_SCREEN_TIME, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOWNLOAD_TIME, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 8 + __off, 1, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERFORMANCE, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FIRST_SCREEN_TIME, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOWNLOAD_TIME, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 8 + __off, 1, __dbStmt);
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
        this.TASK_NAME = null;
    } else {
    this.TASK_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERFORMANCE = null;
    } else {
    this.PERFORMANCE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FIRST_SCREEN_TIME = null;
    } else {
    this.FIRST_SCREEN_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOWNLOAD_TIME = null;
    } else {
    this.DOWNLOAD_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONITOR_COUNT = null;
    } else {
    this.MONITOR_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.TASK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_NAME);
    }
    if (null == this.PERFORMANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERFORMANCE, __dataOut);
    }
    if (null == this.FIRST_SCREEN_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FIRST_SCREEN_TIME, __dataOut);
    }
    if (null == this.DOWNLOAD_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOWNLOAD_TIME, __dataOut);
    }
    if (null == this.MONITOR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_COUNT, __dataOut);
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
    if (null == this.TASK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_NAME);
    }
    if (null == this.PERFORMANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERFORMANCE, __dataOut);
    }
    if (null == this.FIRST_SCREEN_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FIRST_SCREEN_TIME, __dataOut);
    }
    if (null == this.DOWNLOAD_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOWNLOAD_TIME, __dataOut);
    }
    if (null == this.MONITOR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_COUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_NAME==null?"null":TASK_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERFORMANCE==null?"null":PERFORMANCE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_SCREEN_TIME==null?"null":FIRST_SCREEN_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOWNLOAD_TIME==null?"null":DOWNLOAD_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_COUNT==null?"null":MONITOR_COUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_NAME==null?"null":TASK_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERFORMANCE==null?"null":PERFORMANCE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_SCREEN_TIME==null?"null":FIRST_SCREEN_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOWNLOAD_TIME==null?"null":DOWNLOAD_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_COUNT==null?"null":MONITOR_COUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.TASK_NAME = null; } else {
      this.TASK_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PERFORMANCE = null; } else {
      this.PERFORMANCE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FIRST_SCREEN_TIME = null; } else {
      this.FIRST_SCREEN_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOWNLOAD_TIME = null; } else {
      this.DOWNLOAD_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_COUNT = null; } else {
      this.MONITOR_COUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.TASK_NAME = null; } else {
      this.TASK_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PERFORMANCE = null; } else {
      this.PERFORMANCE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FIRST_SCREEN_TIME = null; } else {
      this.FIRST_SCREEN_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOWNLOAD_TIME = null; } else {
      this.DOWNLOAD_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_COUNT = null; } else {
      this.MONITOR_COUNT = new java.math.BigDecimal(__cur_str);
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
    st_diff_task_web_browse_m o = (st_diff_task_web_browse_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_diff_task_web_browse_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("TASK_NAME", this.TASK_NAME);
    __sqoop$field_map.put("PERFORMANCE", this.PERFORMANCE);
    __sqoop$field_map.put("FIRST_SCREEN_TIME", this.FIRST_SCREEN_TIME);
    __sqoop$field_map.put("DOWNLOAD_TIME", this.DOWNLOAD_TIME);
    __sqoop$field_map.put("MONITOR_COUNT", this.MONITOR_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("TASK_NAME", this.TASK_NAME);
    __sqoop$field_map.put("PERFORMANCE", this.PERFORMANCE);
    __sqoop$field_map.put("FIRST_SCREEN_TIME", this.FIRST_SCREEN_TIME);
    __sqoop$field_map.put("DOWNLOAD_TIME", this.DOWNLOAD_TIME);
    __sqoop$field_map.put("MONITOR_COUNT", this.MONITOR_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("TASK_NAME".equals(__fieldName)) {
      this.TASK_NAME = (String) __fieldVal;
    }
    else    if ("PERFORMANCE".equals(__fieldName)) {
      this.PERFORMANCE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FIRST_SCREEN_TIME".equals(__fieldName)) {
      this.FIRST_SCREEN_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOWNLOAD_TIME".equals(__fieldName)) {
      this.DOWNLOAD_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONITOR_COUNT".equals(__fieldName)) {
      this.MONITOR_COUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("TASK_NAME".equals(__fieldName)) {
      this.TASK_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("PERFORMANCE".equals(__fieldName)) {
      this.PERFORMANCE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FIRST_SCREEN_TIME".equals(__fieldName)) {
      this.FIRST_SCREEN_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOWNLOAD_TIME".equals(__fieldName)) {
      this.DOWNLOAD_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONITOR_COUNT".equals(__fieldName)) {
      this.MONITOR_COUNT = (java.math.BigDecimal) __fieldVal;
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
