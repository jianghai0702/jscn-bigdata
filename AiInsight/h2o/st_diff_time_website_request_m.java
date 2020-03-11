// ORM class for table 'st_diff_time_website_request_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 19:38:17 CST 2018
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

public class st_diff_time_website_request_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_diff_time_website_request_m with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String STD_TIMES_CODE;
  public String get_STD_TIMES_CODE() {
    return STD_TIMES_CODE;
  }
  public void set_STD_TIMES_CODE(String STD_TIMES_CODE) {
    this.STD_TIMES_CODE = STD_TIMES_CODE;
  }
  public st_diff_time_website_request_m with_STD_TIMES_CODE(String STD_TIMES_CODE) {
    this.STD_TIMES_CODE = STD_TIMES_CODE;
    return this;
  }
  private String STD_TIMES_NAME;
  public String get_STD_TIMES_NAME() {
    return STD_TIMES_NAME;
  }
  public void set_STD_TIMES_NAME(String STD_TIMES_NAME) {
    this.STD_TIMES_NAME = STD_TIMES_NAME;
  }
  public st_diff_time_website_request_m with_STD_TIMES_NAME(String STD_TIMES_NAME) {
    this.STD_TIMES_NAME = STD_TIMES_NAME;
    return this;
  }
  private String STD_WEBSITE_CATE_CODE;
  public String get_STD_WEBSITE_CATE_CODE() {
    return STD_WEBSITE_CATE_CODE;
  }
  public void set_STD_WEBSITE_CATE_CODE(String STD_WEBSITE_CATE_CODE) {
    this.STD_WEBSITE_CATE_CODE = STD_WEBSITE_CATE_CODE;
  }
  public st_diff_time_website_request_m with_STD_WEBSITE_CATE_CODE(String STD_WEBSITE_CATE_CODE) {
    this.STD_WEBSITE_CATE_CODE = STD_WEBSITE_CATE_CODE;
    return this;
  }
  private String STD_WEBSITE_CATE_NAME;
  public String get_STD_WEBSITE_CATE_NAME() {
    return STD_WEBSITE_CATE_NAME;
  }
  public void set_STD_WEBSITE_CATE_NAME(String STD_WEBSITE_CATE_NAME) {
    this.STD_WEBSITE_CATE_NAME = STD_WEBSITE_CATE_NAME;
  }
  public st_diff_time_website_request_m with_STD_WEBSITE_CATE_NAME(String STD_WEBSITE_CATE_NAME) {
    this.STD_WEBSITE_CATE_NAME = STD_WEBSITE_CATE_NAME;
    return this;
  }
  private java.math.BigDecimal REQUESTS_COUNT;
  public java.math.BigDecimal get_REQUESTS_COUNT() {
    return REQUESTS_COUNT;
  }
  public void set_REQUESTS_COUNT(java.math.BigDecimal REQUESTS_COUNT) {
    this.REQUESTS_COUNT = REQUESTS_COUNT;
  }
  public st_diff_time_website_request_m with_REQUESTS_COUNT(java.math.BigDecimal REQUESTS_COUNT) {
    this.REQUESTS_COUNT = REQUESTS_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_diff_time_website_request_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_diff_time_website_request_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_time_website_request_m)) {
      return false;
    }
    st_diff_time_website_request_m that = (st_diff_time_website_request_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.STD_TIMES_CODE == null ? that.STD_TIMES_CODE == null : this.STD_TIMES_CODE.equals(that.STD_TIMES_CODE));
    equal = equal && (this.STD_TIMES_NAME == null ? that.STD_TIMES_NAME == null : this.STD_TIMES_NAME.equals(that.STD_TIMES_NAME));
    equal = equal && (this.STD_WEBSITE_CATE_CODE == null ? that.STD_WEBSITE_CATE_CODE == null : this.STD_WEBSITE_CATE_CODE.equals(that.STD_WEBSITE_CATE_CODE));
    equal = equal && (this.STD_WEBSITE_CATE_NAME == null ? that.STD_WEBSITE_CATE_NAME == null : this.STD_WEBSITE_CATE_NAME.equals(that.STD_WEBSITE_CATE_NAME));
    equal = equal && (this.REQUESTS_COUNT == null ? that.REQUESTS_COUNT == null : this.REQUESTS_COUNT.equals(that.REQUESTS_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_time_website_request_m)) {
      return false;
    }
    st_diff_time_website_request_m that = (st_diff_time_website_request_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.STD_TIMES_CODE == null ? that.STD_TIMES_CODE == null : this.STD_TIMES_CODE.equals(that.STD_TIMES_CODE));
    equal = equal && (this.STD_TIMES_NAME == null ? that.STD_TIMES_NAME == null : this.STD_TIMES_NAME.equals(that.STD_TIMES_NAME));
    equal = equal && (this.STD_WEBSITE_CATE_CODE == null ? that.STD_WEBSITE_CATE_CODE == null : this.STD_WEBSITE_CATE_CODE.equals(that.STD_WEBSITE_CATE_CODE));
    equal = equal && (this.STD_WEBSITE_CATE_NAME == null ? that.STD_WEBSITE_CATE_NAME == null : this.STD_WEBSITE_CATE_NAME.equals(that.STD_WEBSITE_CATE_NAME));
    equal = equal && (this.REQUESTS_COUNT == null ? that.REQUESTS_COUNT == null : this.REQUESTS_COUNT.equals(that.REQUESTS_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.STD_TIMES_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.STD_TIMES_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_WEBSITE_CATE_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_WEBSITE_CATE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.REQUESTS_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.STD_TIMES_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.STD_TIMES_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_WEBSITE_CATE_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_WEBSITE_CATE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.REQUESTS_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeString(STD_TIMES_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_WEBSITE_CATE_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_WEBSITE_CATE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REQUESTS_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 8 + __off, 1, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_WEBSITE_CATE_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_WEBSITE_CATE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REQUESTS_COUNT, 6 + __off, 3, __dbStmt);
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
        this.STD_TIMES_CODE = null;
    } else {
    this.STD_TIMES_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_TIMES_NAME = null;
    } else {
    this.STD_TIMES_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_WEBSITE_CATE_CODE = null;
    } else {
    this.STD_WEBSITE_CATE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_WEBSITE_CATE_NAME = null;
    } else {
    this.STD_WEBSITE_CATE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REQUESTS_COUNT = null;
    } else {
    this.REQUESTS_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.STD_TIMES_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_TIMES_CODE);
    }
    if (null == this.STD_TIMES_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_TIMES_NAME);
    }
    if (null == this.STD_WEBSITE_CATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_WEBSITE_CATE_CODE);
    }
    if (null == this.STD_WEBSITE_CATE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_WEBSITE_CATE_NAME);
    }
    if (null == this.REQUESTS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REQUESTS_COUNT, __dataOut);
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
    if (null == this.STD_TIMES_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_TIMES_CODE);
    }
    if (null == this.STD_TIMES_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_TIMES_NAME);
    }
    if (null == this.STD_WEBSITE_CATE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_WEBSITE_CATE_CODE);
    }
    if (null == this.STD_WEBSITE_CATE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_WEBSITE_CATE_NAME);
    }
    if (null == this.REQUESTS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REQUESTS_COUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_CODE==null?"null":STD_TIMES_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_NAME==null?"null":STD_TIMES_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_WEBSITE_CATE_CODE==null?"null":STD_WEBSITE_CATE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_WEBSITE_CATE_NAME==null?"null":STD_WEBSITE_CATE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REQUESTS_COUNT==null?"null":REQUESTS_COUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_CODE==null?"null":STD_TIMES_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_NAME==null?"null":STD_TIMES_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_WEBSITE_CATE_CODE==null?"null":STD_WEBSITE_CATE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_WEBSITE_CATE_NAME==null?"null":STD_WEBSITE_CATE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REQUESTS_COUNT==null?"null":REQUESTS_COUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.STD_TIMES_CODE = null; } else {
      this.STD_TIMES_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_TIMES_NAME = null; } else {
      this.STD_TIMES_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_WEBSITE_CATE_CODE = null; } else {
      this.STD_WEBSITE_CATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_WEBSITE_CATE_NAME = null; } else {
      this.STD_WEBSITE_CATE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REQUESTS_COUNT = null; } else {
      this.REQUESTS_COUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.STD_TIMES_CODE = null; } else {
      this.STD_TIMES_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_TIMES_NAME = null; } else {
      this.STD_TIMES_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_WEBSITE_CATE_CODE = null; } else {
      this.STD_WEBSITE_CATE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_WEBSITE_CATE_NAME = null; } else {
      this.STD_WEBSITE_CATE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REQUESTS_COUNT = null; } else {
      this.REQUESTS_COUNT = new java.math.BigDecimal(__cur_str);
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
    st_diff_time_website_request_m o = (st_diff_time_website_request_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_diff_time_website_request_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("STD_TIMES_CODE", this.STD_TIMES_CODE);
    __sqoop$field_map.put("STD_TIMES_NAME", this.STD_TIMES_NAME);
    __sqoop$field_map.put("STD_WEBSITE_CATE_CODE", this.STD_WEBSITE_CATE_CODE);
    __sqoop$field_map.put("STD_WEBSITE_CATE_NAME", this.STD_WEBSITE_CATE_NAME);
    __sqoop$field_map.put("REQUESTS_COUNT", this.REQUESTS_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("STD_TIMES_CODE", this.STD_TIMES_CODE);
    __sqoop$field_map.put("STD_TIMES_NAME", this.STD_TIMES_NAME);
    __sqoop$field_map.put("STD_WEBSITE_CATE_CODE", this.STD_WEBSITE_CATE_CODE);
    __sqoop$field_map.put("STD_WEBSITE_CATE_NAME", this.STD_WEBSITE_CATE_NAME);
    __sqoop$field_map.put("REQUESTS_COUNT", this.REQUESTS_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("STD_TIMES_CODE".equals(__fieldName)) {
      this.STD_TIMES_CODE = (String) __fieldVal;
    }
    else    if ("STD_TIMES_NAME".equals(__fieldName)) {
      this.STD_TIMES_NAME = (String) __fieldVal;
    }
    else    if ("STD_WEBSITE_CATE_CODE".equals(__fieldName)) {
      this.STD_WEBSITE_CATE_CODE = (String) __fieldVal;
    }
    else    if ("STD_WEBSITE_CATE_NAME".equals(__fieldName)) {
      this.STD_WEBSITE_CATE_NAME = (String) __fieldVal;
    }
    else    if ("REQUESTS_COUNT".equals(__fieldName)) {
      this.REQUESTS_COUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("STD_TIMES_CODE".equals(__fieldName)) {
      this.STD_TIMES_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_TIMES_NAME".equals(__fieldName)) {
      this.STD_TIMES_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("STD_WEBSITE_CATE_CODE".equals(__fieldName)) {
      this.STD_WEBSITE_CATE_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_WEBSITE_CATE_NAME".equals(__fieldName)) {
      this.STD_WEBSITE_CATE_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("REQUESTS_COUNT".equals(__fieldName)) {
      this.REQUESTS_COUNT = (java.math.BigDecimal) __fieldVal;
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
