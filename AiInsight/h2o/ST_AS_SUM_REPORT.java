// ORM class for table 'ST_AS_SUM_REPORT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 26 17:43:02 CST 2018
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

public class ST_AS_SUM_REPORT extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_AS_SUM_REPORT with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String AS_TYPE;
  public String get_AS_TYPE() {
    return AS_TYPE;
  }
  public void set_AS_TYPE(String AS_TYPE) {
    this.AS_TYPE = AS_TYPE;
  }
  public ST_AS_SUM_REPORT with_AS_TYPE(String AS_TYPE) {
    this.AS_TYPE = AS_TYPE;
    return this;
  }
  private String std_area_code;
  public String get_std_area_code() {
    return std_area_code;
  }
  public void set_std_area_code(String std_area_code) {
    this.std_area_code = std_area_code;
  }
  public ST_AS_SUM_REPORT with_std_area_code(String std_area_code) {
    this.std_area_code = std_area_code;
    return this;
  }
  private String std_area_name;
  public String get_std_area_name() {
    return std_area_name;
  }
  public void set_std_area_name(String std_area_name) {
    this.std_area_name = std_area_name;
  }
  public ST_AS_SUM_REPORT with_std_area_name(String std_area_name) {
    this.std_area_name = std_area_name;
    return this;
  }
  private java.math.BigDecimal in_gbs;
  public java.math.BigDecimal get_in_gbs() {
    return in_gbs;
  }
  public void set_in_gbs(java.math.BigDecimal in_gbs) {
    this.in_gbs = in_gbs;
  }
  public ST_AS_SUM_REPORT with_in_gbs(java.math.BigDecimal in_gbs) {
    this.in_gbs = in_gbs;
    return this;
  }
  private java.math.BigDecimal out_gbs;
  public java.math.BigDecimal get_out_gbs() {
    return out_gbs;
  }
  public void set_out_gbs(java.math.BigDecimal out_gbs) {
    this.out_gbs = out_gbs;
  }
  public ST_AS_SUM_REPORT with_out_gbs(java.math.BigDecimal out_gbs) {
    this.out_gbs = out_gbs;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_AS_SUM_REPORT with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private String pt_time;
  public String get_pt_time() {
    return pt_time;
  }
  public void set_pt_time(String pt_time) {
    this.pt_time = pt_time;
  }
  public ST_AS_SUM_REPORT with_pt_time(String pt_time) {
    this.pt_time = pt_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_AS_SUM_REPORT)) {
      return false;
    }
    ST_AS_SUM_REPORT that = (ST_AS_SUM_REPORT) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.AS_TYPE == null ? that.AS_TYPE == null : this.AS_TYPE.equals(that.AS_TYPE));
    equal = equal && (this.std_area_code == null ? that.std_area_code == null : this.std_area_code.equals(that.std_area_code));
    equal = equal && (this.std_area_name == null ? that.std_area_name == null : this.std_area_name.equals(that.std_area_name));
    equal = equal && (this.in_gbs == null ? that.in_gbs == null : this.in_gbs.equals(that.in_gbs));
    equal = equal && (this.out_gbs == null ? that.out_gbs == null : this.out_gbs.equals(that.out_gbs));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_time == null ? that.pt_time == null : this.pt_time.equals(that.pt_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_AS_SUM_REPORT)) {
      return false;
    }
    ST_AS_SUM_REPORT that = (ST_AS_SUM_REPORT) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.AS_TYPE == null ? that.AS_TYPE == null : this.AS_TYPE.equals(that.AS_TYPE));
    equal = equal && (this.std_area_code == null ? that.std_area_code == null : this.std_area_code.equals(that.std_area_code));
    equal = equal && (this.std_area_name == null ? that.std_area_name == null : this.std_area_name.equals(that.std_area_name));
    equal = equal && (this.in_gbs == null ? that.in_gbs == null : this.in_gbs.equals(that.in_gbs));
    equal = equal && (this.out_gbs == null ? that.out_gbs == null : this.out_gbs.equals(that.out_gbs));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_time == null ? that.pt_time == null : this.pt_time.equals(that.pt_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.AS_TYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.std_area_code = JdbcWritableBridge.readString(3, __dbResults);
    this.std_area_name = JdbcWritableBridge.readString(4, __dbResults);
    this.in_gbs = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.out_gbs = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.pt_time = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.AS_TYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.std_area_code = JdbcWritableBridge.readString(3, __dbResults);
    this.std_area_name = JdbcWritableBridge.readString(4, __dbResults);
    this.in_gbs = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.out_gbs = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.pt_time = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeString(AS_TYPE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_area_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_area_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(in_gbs, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(out_gbs, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_time, 8 + __off, 12, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AS_TYPE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_area_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_area_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(in_gbs, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(out_gbs, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_time, 8 + __off, 12, __dbStmt);
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
        this.AS_TYPE = null;
    } else {
    this.AS_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_area_code = null;
    } else {
    this.std_area_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_area_name = null;
    } else {
    this.std_area_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.in_gbs = null;
    } else {
    this.in_gbs = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.out_gbs = null;
    } else {
    this.out_gbs = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pt_time = null;
    } else {
    this.pt_time = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CYCLE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCLE_ID);
    }
    if (null == this.AS_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AS_TYPE);
    }
    if (null == this.std_area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_area_code);
    }
    if (null == this.std_area_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_area_name);
    }
    if (null == this.in_gbs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.in_gbs, __dataOut);
    }
    if (null == this.out_gbs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.out_gbs, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.pt_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_time);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CYCLE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCLE_ID);
    }
    if (null == this.AS_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AS_TYPE);
    }
    if (null == this.std_area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_area_code);
    }
    if (null == this.std_area_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_area_name);
    }
    if (null == this.in_gbs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.in_gbs, __dataOut);
    }
    if (null == this.out_gbs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.out_gbs, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.pt_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_time);
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
    __sb.append(FieldFormatter.escapeAndEnclose(AS_TYPE==null?"null":AS_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_area_code==null?"null":std_area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_area_name==null?"null":std_area_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(in_gbs==null?"null":in_gbs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(out_gbs==null?"null":out_gbs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_time==null?"null":pt_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE_ID==null?"null":CYCLE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AS_TYPE==null?"null":AS_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_area_code==null?"null":std_area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_area_name==null?"null":std_area_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(in_gbs==null?"null":in_gbs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(out_gbs==null?"null":out_gbs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_time==null?"null":pt_time, delimiters));
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
    if (__cur_str.equals("\\N")) { this.AS_TYPE = null; } else {
      this.AS_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_area_code = null; } else {
      this.std_area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_area_name = null; } else {
      this.std_area_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.in_gbs = null; } else {
      this.in_gbs = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.out_gbs = null; } else {
      this.out_gbs = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_time = null; } else {
      this.pt_time = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.AS_TYPE = null; } else {
      this.AS_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_area_code = null; } else {
      this.std_area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_area_name = null; } else {
      this.std_area_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.in_gbs = null; } else {
      this.in_gbs = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.out_gbs = null; } else {
      this.out_gbs = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_time = null; } else {
      this.pt_time = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_AS_SUM_REPORT o = (ST_AS_SUM_REPORT) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_AS_SUM_REPORT o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("AS_TYPE", this.AS_TYPE);
    __sqoop$field_map.put("std_area_code", this.std_area_code);
    __sqoop$field_map.put("std_area_name", this.std_area_name);
    __sqoop$field_map.put("in_gbs", this.in_gbs);
    __sqoop$field_map.put("out_gbs", this.out_gbs);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_time", this.pt_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("AS_TYPE", this.AS_TYPE);
    __sqoop$field_map.put("std_area_code", this.std_area_code);
    __sqoop$field_map.put("std_area_name", this.std_area_name);
    __sqoop$field_map.put("in_gbs", this.in_gbs);
    __sqoop$field_map.put("out_gbs", this.out_gbs);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_time", this.pt_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("AS_TYPE".equals(__fieldName)) {
      this.AS_TYPE = (String) __fieldVal;
    }
    else    if ("std_area_code".equals(__fieldName)) {
      this.std_area_code = (String) __fieldVal;
    }
    else    if ("std_area_name".equals(__fieldName)) {
      this.std_area_name = (String) __fieldVal;
    }
    else    if ("in_gbs".equals(__fieldName)) {
      this.in_gbs = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("out_gbs".equals(__fieldName)) {
      this.out_gbs = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pt_time".equals(__fieldName)) {
      this.pt_time = (String) __fieldVal;
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
    else    if ("AS_TYPE".equals(__fieldName)) {
      this.AS_TYPE = (String) __fieldVal;
      return true;
    }
    else    if ("std_area_code".equals(__fieldName)) {
      this.std_area_code = (String) __fieldVal;
      return true;
    }
    else    if ("std_area_name".equals(__fieldName)) {
      this.std_area_name = (String) __fieldVal;
      return true;
    }
    else    if ("in_gbs".equals(__fieldName)) {
      this.in_gbs = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("out_gbs".equals(__fieldName)) {
      this.out_gbs = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pt_time".equals(__fieldName)) {
      this.pt_time = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
