// ORM class for table 'ST_ARPU'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 05 12:03:21 CST 2019
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

public class ST_ARPU extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_ARPU with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String CORP_ORG_NAME;
  public String get_CORP_ORG_NAME() {
    return CORP_ORG_NAME;
  }
  public void set_CORP_ORG_NAME(String CORP_ORG_NAME) {
    this.CORP_ORG_NAME = CORP_ORG_NAME;
  }
  public ST_ARPU with_CORP_ORG_NAME(String CORP_ORG_NAME) {
    this.CORP_ORG_NAME = CORP_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal lan_arpu;
  public java.math.BigDecimal get_lan_arpu() {
    return lan_arpu;
  }
  public void set_lan_arpu(java.math.BigDecimal lan_arpu) {
    this.lan_arpu = lan_arpu;
  }
  public ST_ARPU with_lan_arpu(java.math.BigDecimal lan_arpu) {
    this.lan_arpu = lan_arpu;
    return this;
  }
  private java.math.BigDecimal sz_arpu;
  public java.math.BigDecimal get_sz_arpu() {
    return sz_arpu;
  }
  public void set_sz_arpu(java.math.BigDecimal sz_arpu) {
    this.sz_arpu = sz_arpu;
  }
  public ST_ARPU with_sz_arpu(java.math.BigDecimal sz_arpu) {
    this.sz_arpu = sz_arpu;
    return this;
  }
  private java.math.BigDecimal comp_arpu;
  public java.math.BigDecimal get_comp_arpu() {
    return comp_arpu;
  }
  public void set_comp_arpu(java.math.BigDecimal comp_arpu) {
    this.comp_arpu = comp_arpu;
  }
  public ST_ARPU with_comp_arpu(java.math.BigDecimal comp_arpu) {
    this.comp_arpu = comp_arpu;
    return this;
  }
  private String pt_mon;
  public String get_pt_mon() {
    return pt_mon;
  }
  public void set_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
  }
  public ST_ARPU with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_ARPU)) {
      return false;
    }
    ST_ARPU that = (ST_ARPU) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.CORP_ORG_NAME == null ? that.CORP_ORG_NAME == null : this.CORP_ORG_NAME.equals(that.CORP_ORG_NAME));
    equal = equal && (this.lan_arpu == null ? that.lan_arpu == null : this.lan_arpu.equals(that.lan_arpu));
    equal = equal && (this.sz_arpu == null ? that.sz_arpu == null : this.sz_arpu.equals(that.sz_arpu));
    equal = equal && (this.comp_arpu == null ? that.comp_arpu == null : this.comp_arpu.equals(that.comp_arpu));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_ARPU)) {
      return false;
    }
    ST_ARPU that = (ST_ARPU) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.CORP_ORG_NAME == null ? that.CORP_ORG_NAME == null : this.CORP_ORG_NAME.equals(that.CORP_ORG_NAME));
    equal = equal && (this.lan_arpu == null ? that.lan_arpu == null : this.lan_arpu.equals(that.lan_arpu));
    equal = equal && (this.sz_arpu == null ? that.sz_arpu == null : this.sz_arpu.equals(that.sz_arpu));
    equal = equal && (this.comp_arpu == null ? that.comp_arpu == null : this.comp_arpu.equals(that.comp_arpu));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CORP_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.lan_arpu = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.sz_arpu = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.comp_arpu = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CORP_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.lan_arpu = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.sz_arpu = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.comp_arpu = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(CORP_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lan_arpu, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(sz_arpu, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(comp_arpu, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CORP_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lan_arpu, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(sz_arpu, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(comp_arpu, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 6 + __off, 12, __dbStmt);
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
        this.CORP_ORG_NAME = null;
    } else {
    this.CORP_ORG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lan_arpu = null;
    } else {
    this.lan_arpu = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sz_arpu = null;
    } else {
    this.sz_arpu = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comp_arpu = null;
    } else {
    this.comp_arpu = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.CORP_ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CORP_ORG_NAME);
    }
    if (null == this.lan_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lan_arpu, __dataOut);
    }
    if (null == this.sz_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.sz_arpu, __dataOut);
    }
    if (null == this.comp_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.comp_arpu, __dataOut);
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
    if (null == this.CORP_ORG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CORP_ORG_NAME);
    }
    if (null == this.lan_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lan_arpu, __dataOut);
    }
    if (null == this.sz_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.sz_arpu, __dataOut);
    }
    if (null == this.comp_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.comp_arpu, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CORP_ORG_NAME==null?"null":CORP_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lan_arpu==null?"null":lan_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sz_arpu==null?"null":sz_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comp_arpu==null?"null":comp_arpu.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CORP_ORG_NAME==null?"null":CORP_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lan_arpu==null?"null":lan_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sz_arpu==null?"null":sz_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comp_arpu==null?"null":comp_arpu.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.CORP_ORG_NAME = null; } else {
      this.CORP_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lan_arpu = null; } else {
      this.lan_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sz_arpu = null; } else {
      this.sz_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.comp_arpu = null; } else {
      this.comp_arpu = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.CORP_ORG_NAME = null; } else {
      this.CORP_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lan_arpu = null; } else {
      this.lan_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sz_arpu = null; } else {
      this.sz_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.comp_arpu = null; } else {
      this.comp_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_ARPU o = (ST_ARPU) super.clone();
    return o;
  }

  public void clone0(ST_ARPU o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("CORP_ORG_NAME", this.CORP_ORG_NAME);
    __sqoop$field_map.put("lan_arpu", this.lan_arpu);
    __sqoop$field_map.put("sz_arpu", this.sz_arpu);
    __sqoop$field_map.put("comp_arpu", this.comp_arpu);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("CORP_ORG_NAME", this.CORP_ORG_NAME);
    __sqoop$field_map.put("lan_arpu", this.lan_arpu);
    __sqoop$field_map.put("sz_arpu", this.sz_arpu);
    __sqoop$field_map.put("comp_arpu", this.comp_arpu);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("CORP_ORG_NAME".equals(__fieldName)) {
      this.CORP_ORG_NAME = (String) __fieldVal;
    }
    else    if ("lan_arpu".equals(__fieldName)) {
      this.lan_arpu = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("sz_arpu".equals(__fieldName)) {
      this.sz_arpu = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("comp_arpu".equals(__fieldName)) {
      this.comp_arpu = (java.math.BigDecimal) __fieldVal;
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
    else    if ("CORP_ORG_NAME".equals(__fieldName)) {
      this.CORP_ORG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("lan_arpu".equals(__fieldName)) {
      this.lan_arpu = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("sz_arpu".equals(__fieldName)) {
      this.sz_arpu = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("comp_arpu".equals(__fieldName)) {
      this.comp_arpu = (java.math.BigDecimal) __fieldVal;
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
