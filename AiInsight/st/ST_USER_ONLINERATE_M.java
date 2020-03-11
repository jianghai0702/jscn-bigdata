// ORM class for table 'ST_USER_ONLINERATE_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 16 10:59:02 CST 2019
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

public class ST_USER_ONLINERATE_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_USER_ONLINERATE_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_USER_ONLINERATE_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_USER_ONLINERATE_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal online_user_cnt;
  public java.math.BigDecimal get_online_user_cnt() {
    return online_user_cnt;
  }
  public void set_online_user_cnt(java.math.BigDecimal online_user_cnt) {
    this.online_user_cnt = online_user_cnt;
  }
  public ST_USER_ONLINERATE_M with_online_user_cnt(java.math.BigDecimal online_user_cnt) {
    this.online_user_cnt = online_user_cnt;
    return this;
  }
  private java.math.BigDecimal user_cnts;
  public java.math.BigDecimal get_user_cnts() {
    return user_cnts;
  }
  public void set_user_cnts(java.math.BigDecimal user_cnts) {
    this.user_cnts = user_cnts;
  }
  public ST_USER_ONLINERATE_M with_user_cnts(java.math.BigDecimal user_cnts) {
    this.user_cnts = user_cnts;
    return this;
  }
  private java.math.BigDecimal online_rate;
  public java.math.BigDecimal get_online_rate() {
    return online_rate;
  }
  public void set_online_rate(java.math.BigDecimal online_rate) {
    this.online_rate = online_rate;
  }
  public ST_USER_ONLINERATE_M with_online_rate(java.math.BigDecimal online_rate) {
    this.online_rate = online_rate;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_USER_ONLINERATE_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private String pt_mon;
  public String get_pt_mon() {
    return pt_mon;
  }
  public void set_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
  }
  public ST_USER_ONLINERATE_M with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_USER_ONLINERATE_M)) {
      return false;
    }
    ST_USER_ONLINERATE_M that = (ST_USER_ONLINERATE_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.online_user_cnt == null ? that.online_user_cnt == null : this.online_user_cnt.equals(that.online_user_cnt));
    equal = equal && (this.user_cnts == null ? that.user_cnts == null : this.user_cnts.equals(that.user_cnts));
    equal = equal && (this.online_rate == null ? that.online_rate == null : this.online_rate.equals(that.online_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_USER_ONLINERATE_M)) {
      return false;
    }
    ST_USER_ONLINERATE_M that = (ST_USER_ONLINERATE_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.online_user_cnt == null ? that.online_user_cnt == null : this.online_user_cnt.equals(that.online_user_cnt));
    equal = equal && (this.user_cnts == null ? that.user_cnts == null : this.user_cnts.equals(that.user_cnts));
    equal = equal && (this.online_rate == null ? that.online_rate == null : this.online_rate.equals(that.online_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.online_user_cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.user_cnts = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.online_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.online_user_cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.user_cnts = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.online_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_user_cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(user_cnts, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 8 + __off, 12, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_user_cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(user_cnts, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 8 + __off, 12, __dbStmt);
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
        this.online_user_cnt = null;
    } else {
    this.online_user_cnt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_cnts = null;
    } else {
    this.user_cnts = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.online_rate = null;
    } else {
    this.online_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pt_mon = null;
    } else {
    this.pt_mon = Text.readString(__dataIn);
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
    if (null == this.online_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_user_cnt, __dataOut);
    }
    if (null == this.user_cnts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.user_cnts, __dataOut);
    }
    if (null == this.online_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_rate, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.pt_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_mon);
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
    if (null == this.online_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_user_cnt, __dataOut);
    }
    if (null == this.user_cnts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.user_cnts, __dataOut);
    }
    if (null == this.online_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_rate, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_user_cnt==null?"null":online_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_cnts==null?"null":user_cnts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_rate==null?"null":online_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(online_user_cnt==null?"null":online_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_cnts==null?"null":user_cnts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_rate==null?"null":online_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_user_cnt = null; } else {
      this.online_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_cnts = null; } else {
      this.user_cnts = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_rate = null; } else {
      this.online_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_user_cnt = null; } else {
      this.online_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_cnts = null; } else {
      this.user_cnts = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_rate = null; } else {
      this.online_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_USER_ONLINERATE_M o = (ST_USER_ONLINERATE_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_USER_ONLINERATE_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("online_user_cnt", this.online_user_cnt);
    __sqoop$field_map.put("user_cnts", this.user_cnts);
    __sqoop$field_map.put("online_rate", this.online_rate);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("online_user_cnt", this.online_user_cnt);
    __sqoop$field_map.put("user_cnts", this.user_cnts);
    __sqoop$field_map.put("online_rate", this.online_rate);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
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
    else    if ("online_user_cnt".equals(__fieldName)) {
      this.online_user_cnt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("user_cnts".equals(__fieldName)) {
      this.user_cnts = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("online_rate".equals(__fieldName)) {
      this.online_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
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
    else    if ("online_user_cnt".equals(__fieldName)) {
      this.online_user_cnt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("user_cnts".equals(__fieldName)) {
      this.user_cnts = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("online_rate".equals(__fieldName)) {
      this.online_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
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
