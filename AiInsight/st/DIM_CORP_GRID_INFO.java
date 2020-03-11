// ORM class for table 'DIM_CORP_GRID_INFO'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 05 11:55:46 CST 2019
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

public class DIM_CORP_GRID_INFO extends SqoopRecord  implements DBWritable, Writable {
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
  public DIM_CORP_GRID_INFO with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
    return this;
  }
  private String GRID_ID;
  public String get_GRID_ID() {
    return GRID_ID;
  }
  public void set_GRID_ID(String GRID_ID) {
    this.GRID_ID = GRID_ID;
  }
  public DIM_CORP_GRID_INFO with_GRID_ID(String GRID_ID) {
    this.GRID_ID = GRID_ID;
    return this;
  }
  private String GRID_NAME;
  public String get_GRID_NAME() {
    return GRID_NAME;
  }
  public void set_GRID_NAME(String GRID_NAME) {
    this.GRID_NAME = GRID_NAME;
  }
  public DIM_CORP_GRID_INFO with_GRID_NAME(String GRID_NAME) {
    this.GRID_NAME = GRID_NAME;
    return this;
  }
  private java.sql.Timestamp etl_time;
  public java.sql.Timestamp get_etl_time() {
    return etl_time;
  }
  public void set_etl_time(java.sql.Timestamp etl_time) {
    this.etl_time = etl_time;
  }
  public DIM_CORP_GRID_INFO with_etl_time(java.sql.Timestamp etl_time) {
    this.etl_time = etl_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DIM_CORP_GRID_INFO)) {
      return false;
    }
    DIM_CORP_GRID_INFO that = (DIM_CORP_GRID_INFO) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.etl_time == null ? that.etl_time == null : this.etl_time.equals(that.etl_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DIM_CORP_GRID_INFO)) {
      return false;
    }
    DIM_CORP_GRID_INFO that = (DIM_CORP_GRID_INFO) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.etl_time == null ? that.etl_time == null : this.etl_time.equals(that.etl_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.etl_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.etl_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
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
    JdbcWritableBridge.writeString(GRID_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(etl_time, 4 + __off, 93, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(etl_time, 4 + __off, 93, __dbStmt);
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
        this.GRID_ID = null;
    } else {
    this.GRID_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRID_NAME = null;
    } else {
    this.GRID_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.etl_time = null;
    } else {
    this.etl_time = new Timestamp(__dataIn.readLong());
    this.etl_time.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.GRID_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_ID);
    }
    if (null == this.GRID_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_NAME);
    }
    if (null == this.etl_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.etl_time.getTime());
    __dataOut.writeInt(this.etl_time.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.GRID_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_ID);
    }
    if (null == this.GRID_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_NAME);
    }
    if (null == this.etl_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.etl_time.getTime());
    __dataOut.writeInt(this.etl_time.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_ID==null?"null":GRID_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_NAME==null?"null":GRID_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(etl_time==null?"null":"" + etl_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_ID==null?"null":GRID_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_NAME==null?"null":GRID_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(etl_time==null?"null":"" + etl_time, delimiters));
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
    if (__cur_str.equals("\\N")) { this.GRID_ID = null; } else {
      this.GRID_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.GRID_NAME = null; } else {
      this.GRID_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.etl_time = null; } else {
      this.etl_time = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.GRID_ID = null; } else {
      this.GRID_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.GRID_NAME = null; } else {
      this.GRID_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.etl_time = null; } else {
      this.etl_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    DIM_CORP_GRID_INFO o = (DIM_CORP_GRID_INFO) super.clone();
    o.etl_time = (o.etl_time != null) ? (java.sql.Timestamp) o.etl_time.clone() : null;
    return o;
  }

  public void clone0(DIM_CORP_GRID_INFO o) throws CloneNotSupportedException {
    o.etl_time = (o.etl_time != null) ? (java.sql.Timestamp) o.etl_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("etl_time", this.etl_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("etl_time", this.etl_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("GRID_ID".equals(__fieldName)) {
      this.GRID_ID = (String) __fieldVal;
    }
    else    if ("GRID_NAME".equals(__fieldName)) {
      this.GRID_NAME = (String) __fieldVal;
    }
    else    if ("etl_time".equals(__fieldName)) {
      this.etl_time = (java.sql.Timestamp) __fieldVal;
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
    else    if ("GRID_ID".equals(__fieldName)) {
      this.GRID_ID = (String) __fieldVal;
      return true;
    }
    else    if ("GRID_NAME".equals(__fieldName)) {
      this.GRID_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("etl_time".equals(__fieldName)) {
      this.etl_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
