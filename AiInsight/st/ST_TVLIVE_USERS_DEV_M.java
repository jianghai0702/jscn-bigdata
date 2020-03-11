// ORM class for table 'ST_TVLIVE_USERS_DEV_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jul 03 14:59:19 CST 2019
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

public class ST_TVLIVE_USERS_DEV_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_TVLIVE_USERS_DEV_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_TVLIVE_USERS_DEV_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal DTV_USER_CNT;
  public java.math.BigDecimal get_DTV_USER_CNT() {
    return DTV_USER_CNT;
  }
  public void set_DTV_USER_CNT(java.math.BigDecimal DTV_USER_CNT) {
    this.DTV_USER_CNT = DTV_USER_CNT;
  }
  public ST_TVLIVE_USERS_DEV_M with_DTV_USER_CNT(java.math.BigDecimal DTV_USER_CNT) {
    this.DTV_USER_CNT = DTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal TVLIVE_OPEN_USR_CNT;
  public java.math.BigDecimal get_TVLIVE_OPEN_USR_CNT() {
    return TVLIVE_OPEN_USR_CNT;
  }
  public void set_TVLIVE_OPEN_USR_CNT(java.math.BigDecimal TVLIVE_OPEN_USR_CNT) {
    this.TVLIVE_OPEN_USR_CNT = TVLIVE_OPEN_USR_CNT;
  }
  public ST_TVLIVE_USERS_DEV_M with_TVLIVE_OPEN_USR_CNT(java.math.BigDecimal TVLIVE_OPEN_USR_CNT) {
    this.TVLIVE_OPEN_USR_CNT = TVLIVE_OPEN_USR_CNT;
    return this;
  }
  private java.math.BigDecimal AVG_USER_DURATION;
  public java.math.BigDecimal get_AVG_USER_DURATION() {
    return AVG_USER_DURATION;
  }
  public void set_AVG_USER_DURATION(java.math.BigDecimal AVG_USER_DURATION) {
    this.AVG_USER_DURATION = AVG_USER_DURATION;
  }
  public ST_TVLIVE_USERS_DEV_M with_AVG_USER_DURATION(java.math.BigDecimal AVG_USER_DURATION) {
    this.AVG_USER_DURATION = AVG_USER_DURATION;
    return this;
  }
  private java.sql.Timestamp etl_time;
  public java.sql.Timestamp get_etl_time() {
    return etl_time;
  }
  public void set_etl_time(java.sql.Timestamp etl_time) {
    this.etl_time = etl_time;
  }
  public ST_TVLIVE_USERS_DEV_M with_etl_time(java.sql.Timestamp etl_time) {
    this.etl_time = etl_time;
    return this;
  }
  private String pt_mon;
  public String get_pt_mon() {
    return pt_mon;
  }
  public void set_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
  }
  public ST_TVLIVE_USERS_DEV_M with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_TVLIVE_USERS_DEV_M)) {
      return false;
    }
    ST_TVLIVE_USERS_DEV_M that = (ST_TVLIVE_USERS_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.DTV_USER_CNT == null ? that.DTV_USER_CNT == null : this.DTV_USER_CNT.equals(that.DTV_USER_CNT));
    equal = equal && (this.TVLIVE_OPEN_USR_CNT == null ? that.TVLIVE_OPEN_USR_CNT == null : this.TVLIVE_OPEN_USR_CNT.equals(that.TVLIVE_OPEN_USR_CNT));
    equal = equal && (this.AVG_USER_DURATION == null ? that.AVG_USER_DURATION == null : this.AVG_USER_DURATION.equals(that.AVG_USER_DURATION));
    equal = equal && (this.etl_time == null ? that.etl_time == null : this.etl_time.equals(that.etl_time));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_TVLIVE_USERS_DEV_M)) {
      return false;
    }
    ST_TVLIVE_USERS_DEV_M that = (ST_TVLIVE_USERS_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.DTV_USER_CNT == null ? that.DTV_USER_CNT == null : this.DTV_USER_CNT.equals(that.DTV_USER_CNT));
    equal = equal && (this.TVLIVE_OPEN_USR_CNT == null ? that.TVLIVE_OPEN_USR_CNT == null : this.TVLIVE_OPEN_USR_CNT.equals(that.TVLIVE_OPEN_USR_CNT));
    equal = equal && (this.AVG_USER_DURATION == null ? that.AVG_USER_DURATION == null : this.AVG_USER_DURATION.equals(that.AVG_USER_DURATION));
    equal = equal && (this.etl_time == null ? that.etl_time == null : this.etl_time.equals(that.etl_time));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.TVLIVE_OPEN_USR_CNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.AVG_USER_DURATION = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.etl_time = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.TVLIVE_OPEN_USR_CNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.AVG_USER_DURATION = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.etl_time = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(DTV_USER_CNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TVLIVE_OPEN_USR_CNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_USER_DURATION, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(etl_time, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_USER_CNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TVLIVE_OPEN_USR_CNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_USER_DURATION, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(etl_time, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 7 + __off, 12, __dbStmt);
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
        this.DTV_USER_CNT = null;
    } else {
    this.DTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TVLIVE_OPEN_USR_CNT = null;
    } else {
    this.TVLIVE_OPEN_USR_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_USER_DURATION = null;
    } else {
    this.AVG_USER_DURATION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.etl_time = null;
    } else {
    this.etl_time = new Timestamp(__dataIn.readLong());
    this.etl_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pt_mon = null;
    } else {
    this.pt_mon = Text.readString(__dataIn);
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
    if (null == this.DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_USER_CNT, __dataOut);
    }
    if (null == this.TVLIVE_OPEN_USR_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TVLIVE_OPEN_USR_CNT, __dataOut);
    }
    if (null == this.AVG_USER_DURATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_USER_DURATION, __dataOut);
    }
    if (null == this.etl_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.etl_time.getTime());
    __dataOut.writeInt(this.etl_time.getNanos());
    }
    if (null == this.pt_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_mon);
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
    if (null == this.DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_USER_CNT, __dataOut);
    }
    if (null == this.TVLIVE_OPEN_USR_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TVLIVE_OPEN_USR_CNT, __dataOut);
    }
    if (null == this.AVG_USER_DURATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_USER_DURATION, __dataOut);
    }
    if (null == this.etl_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.etl_time.getTime());
    __dataOut.writeInt(this.etl_time.getNanos());
    }
    if (null == this.pt_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_mon);
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_CNT==null?"null":DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TVLIVE_OPEN_USR_CNT==null?"null":TVLIVE_OPEN_USR_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_USER_DURATION==null?"null":AVG_USER_DURATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(etl_time==null?"null":"" + etl_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_CNT==null?"null":DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TVLIVE_OPEN_USR_CNT==null?"null":TVLIVE_OPEN_USR_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_USER_DURATION==null?"null":AVG_USER_DURATION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(etl_time==null?"null":"" + etl_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_CNT = null; } else {
      this.DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TVLIVE_OPEN_USR_CNT = null; } else {
      this.TVLIVE_OPEN_USR_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_USER_DURATION = null; } else {
      this.AVG_USER_DURATION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.etl_time = null; } else {
      this.etl_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_CNT = null; } else {
      this.DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TVLIVE_OPEN_USR_CNT = null; } else {
      this.TVLIVE_OPEN_USR_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_USER_DURATION = null; } else {
      this.AVG_USER_DURATION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.etl_time = null; } else {
      this.etl_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_TVLIVE_USERS_DEV_M o = (ST_TVLIVE_USERS_DEV_M) super.clone();
    o.etl_time = (o.etl_time != null) ? (java.sql.Timestamp) o.etl_time.clone() : null;
    return o;
  }

  public void clone0(ST_TVLIVE_USERS_DEV_M o) throws CloneNotSupportedException {
    o.etl_time = (o.etl_time != null) ? (java.sql.Timestamp) o.etl_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("DTV_USER_CNT", this.DTV_USER_CNT);
    __sqoop$field_map.put("TVLIVE_OPEN_USR_CNT", this.TVLIVE_OPEN_USR_CNT);
    __sqoop$field_map.put("AVG_USER_DURATION", this.AVG_USER_DURATION);
    __sqoop$field_map.put("etl_time", this.etl_time);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("DTV_USER_CNT", this.DTV_USER_CNT);
    __sqoop$field_map.put("TVLIVE_OPEN_USR_CNT", this.TVLIVE_OPEN_USR_CNT);
    __sqoop$field_map.put("AVG_USER_DURATION", this.AVG_USER_DURATION);
    __sqoop$field_map.put("etl_time", this.etl_time);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
    }
    else    if ("DTV_USER_CNT".equals(__fieldName)) {
      this.DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TVLIVE_OPEN_USR_CNT".equals(__fieldName)) {
      this.TVLIVE_OPEN_USR_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AVG_USER_DURATION".equals(__fieldName)) {
      this.AVG_USER_DURATION = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("etl_time".equals(__fieldName)) {
      this.etl_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
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
    else    if ("DTV_USER_CNT".equals(__fieldName)) {
      this.DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TVLIVE_OPEN_USR_CNT".equals(__fieldName)) {
      this.TVLIVE_OPEN_USR_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AVG_USER_DURATION".equals(__fieldName)) {
      this.AVG_USER_DURATION = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("etl_time".equals(__fieldName)) {
      this.etl_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
