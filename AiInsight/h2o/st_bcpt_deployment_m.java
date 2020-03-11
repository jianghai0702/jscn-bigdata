// ORM class for table 'st_bcpt_deployment_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 19:41:29 CST 2018
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

public class st_bcpt_deployment_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_bcpt_deployment_m with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String DATA_SOURCE;
  public String get_DATA_SOURCE() {
    return DATA_SOURCE;
  }
  public void set_DATA_SOURCE(String DATA_SOURCE) {
    this.DATA_SOURCE = DATA_SOURCE;
  }
  public st_bcpt_deployment_m with_DATA_SOURCE(String DATA_SOURCE) {
    this.DATA_SOURCE = DATA_SOURCE;
    return this;
  }
  private String REGION_NAME;
  public String get_REGION_NAME() {
    return REGION_NAME;
  }
  public void set_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
  }
  public st_bcpt_deployment_m with_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
    return this;
  }
  private java.math.BigDecimal MONITOR_NUM;
  public java.math.BigDecimal get_MONITOR_NUM() {
    return MONITOR_NUM;
  }
  public void set_MONITOR_NUM(java.math.BigDecimal MONITOR_NUM) {
    this.MONITOR_NUM = MONITOR_NUM;
  }
  public st_bcpt_deployment_m with_MONITOR_NUM(java.math.BigDecimal MONITOR_NUM) {
    this.MONITOR_NUM = MONITOR_NUM;
    return this;
  }
  private java.math.BigDecimal MAIN_ID_COUNT;
  public java.math.BigDecimal get_MAIN_ID_COUNT() {
    return MAIN_ID_COUNT;
  }
  public void set_MAIN_ID_COUNT(java.math.BigDecimal MAIN_ID_COUNT) {
    this.MAIN_ID_COUNT = MAIN_ID_COUNT;
  }
  public st_bcpt_deployment_m with_MAIN_ID_COUNT(java.math.BigDecimal MAIN_ID_COUNT) {
    this.MAIN_ID_COUNT = MAIN_ID_COUNT;
    return this;
  }
  private java.math.BigDecimal INCREMENT_ID_COUNT;
  public java.math.BigDecimal get_INCREMENT_ID_COUNT() {
    return INCREMENT_ID_COUNT;
  }
  public void set_INCREMENT_ID_COUNT(java.math.BigDecimal INCREMENT_ID_COUNT) {
    this.INCREMENT_ID_COUNT = INCREMENT_ID_COUNT;
  }
  public st_bcpt_deployment_m with_INCREMENT_ID_COUNT(java.math.BigDecimal INCREMENT_ID_COUNT) {
    this.INCREMENT_ID_COUNT = INCREMENT_ID_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_bcpt_deployment_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_bcpt_deployment_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_bcpt_deployment_m)) {
      return false;
    }
    st_bcpt_deployment_m that = (st_bcpt_deployment_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.DATA_SOURCE == null ? that.DATA_SOURCE == null : this.DATA_SOURCE.equals(that.DATA_SOURCE));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.MONITOR_NUM == null ? that.MONITOR_NUM == null : this.MONITOR_NUM.equals(that.MONITOR_NUM));
    equal = equal && (this.MAIN_ID_COUNT == null ? that.MAIN_ID_COUNT == null : this.MAIN_ID_COUNT.equals(that.MAIN_ID_COUNT));
    equal = equal && (this.INCREMENT_ID_COUNT == null ? that.INCREMENT_ID_COUNT == null : this.INCREMENT_ID_COUNT.equals(that.INCREMENT_ID_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_bcpt_deployment_m)) {
      return false;
    }
    st_bcpt_deployment_m that = (st_bcpt_deployment_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.DATA_SOURCE == null ? that.DATA_SOURCE == null : this.DATA_SOURCE.equals(that.DATA_SOURCE));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.MONITOR_NUM == null ? that.MONITOR_NUM == null : this.MONITOR_NUM.equals(that.MONITOR_NUM));
    equal = equal && (this.MAIN_ID_COUNT == null ? that.MAIN_ID_COUNT == null : this.MAIN_ID_COUNT.equals(that.MAIN_ID_COUNT));
    equal = equal && (this.INCREMENT_ID_COUNT == null ? that.INCREMENT_ID_COUNT == null : this.INCREMENT_ID_COUNT.equals(that.INCREMENT_ID_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.DATA_SOURCE = JdbcWritableBridge.readString(2, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.MONITOR_NUM = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.MAIN_ID_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.INCREMENT_ID_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.DATA_SOURCE = JdbcWritableBridge.readString(2, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.MONITOR_NUM = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.MAIN_ID_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.INCREMENT_ID_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeString(DATA_SOURCE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGION_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_NUM, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_ID_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCREMENT_ID_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 8 + __off, 1, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATA_SOURCE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGION_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_NUM, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIN_ID_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INCREMENT_ID_COUNT, 6 + __off, 3, __dbStmt);
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
        this.DATA_SOURCE = null;
    } else {
    this.DATA_SOURCE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGION_NAME = null;
    } else {
    this.REGION_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONITOR_NUM = null;
    } else {
    this.MONITOR_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIN_ID_COUNT = null;
    } else {
    this.MAIN_ID_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCREMENT_ID_COUNT = null;
    } else {
    this.INCREMENT_ID_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.DATA_SOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_SOURCE);
    }
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.MONITOR_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_NUM, __dataOut);
    }
    if (null == this.MAIN_ID_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_ID_COUNT, __dataOut);
    }
    if (null == this.INCREMENT_ID_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INCREMENT_ID_COUNT, __dataOut);
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
    if (null == this.DATA_SOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_SOURCE);
    }
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.MONITOR_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_NUM, __dataOut);
    }
    if (null == this.MAIN_ID_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIN_ID_COUNT, __dataOut);
    }
    if (null == this.INCREMENT_ID_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INCREMENT_ID_COUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SOURCE==null?"null":DATA_SOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGION_NAME==null?"null":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_NUM==null?"null":MONITOR_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_ID_COUNT==null?"null":MAIN_ID_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCREMENT_ID_COUNT==null?"null":INCREMENT_ID_COUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SOURCE==null?"null":DATA_SOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGION_NAME==null?"null":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_NUM==null?"null":MONITOR_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIN_ID_COUNT==null?"null":MAIN_ID_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCREMENT_ID_COUNT==null?"null":INCREMENT_ID_COUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.DATA_SOURCE = null; } else {
      this.DATA_SOURCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_NUM = null; } else {
      this.MONITOR_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MAIN_ID_COUNT = null; } else {
      this.MAIN_ID_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INCREMENT_ID_COUNT = null; } else {
      this.INCREMENT_ID_COUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.DATA_SOURCE = null; } else {
      this.DATA_SOURCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_NUM = null; } else {
      this.MONITOR_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MAIN_ID_COUNT = null; } else {
      this.MAIN_ID_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INCREMENT_ID_COUNT = null; } else {
      this.INCREMENT_ID_COUNT = new java.math.BigDecimal(__cur_str);
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
    st_bcpt_deployment_m o = (st_bcpt_deployment_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_bcpt_deployment_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("DATA_SOURCE", this.DATA_SOURCE);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("MONITOR_NUM", this.MONITOR_NUM);
    __sqoop$field_map.put("MAIN_ID_COUNT", this.MAIN_ID_COUNT);
    __sqoop$field_map.put("INCREMENT_ID_COUNT", this.INCREMENT_ID_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("DATA_SOURCE", this.DATA_SOURCE);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("MONITOR_NUM", this.MONITOR_NUM);
    __sqoop$field_map.put("MAIN_ID_COUNT", this.MAIN_ID_COUNT);
    __sqoop$field_map.put("INCREMENT_ID_COUNT", this.INCREMENT_ID_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("DATA_SOURCE".equals(__fieldName)) {
      this.DATA_SOURCE = (String) __fieldVal;
    }
    else    if ("REGION_NAME".equals(__fieldName)) {
      this.REGION_NAME = (String) __fieldVal;
    }
    else    if ("MONITOR_NUM".equals(__fieldName)) {
      this.MONITOR_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MAIN_ID_COUNT".equals(__fieldName)) {
      this.MAIN_ID_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INCREMENT_ID_COUNT".equals(__fieldName)) {
      this.INCREMENT_ID_COUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("DATA_SOURCE".equals(__fieldName)) {
      this.DATA_SOURCE = (String) __fieldVal;
      return true;
    }
    else    if ("REGION_NAME".equals(__fieldName)) {
      this.REGION_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("MONITOR_NUM".equals(__fieldName)) {
      this.MONITOR_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MAIN_ID_COUNT".equals(__fieldName)) {
      this.MAIN_ID_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INCREMENT_ID_COUNT".equals(__fieldName)) {
      this.INCREMENT_ID_COUNT = (java.math.BigDecimal) __fieldVal;
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
