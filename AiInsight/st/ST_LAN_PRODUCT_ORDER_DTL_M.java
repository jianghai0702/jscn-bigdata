// ORM class for table 'ST_LAN_PRODUCT_ORDER_DTL_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jul 16 16:52:52 CST 2019
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

public class ST_LAN_PRODUCT_ORDER_DTL_M extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String cust_id;
  public String get_cust_id() {
    return cust_id;
  }
  public void set_cust_id(String cust_id) {
    this.cust_id = cust_id;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_cust_id(String cust_id) {
    this.cust_id = cust_id;
    return this;
  }
  private String prod_inst_id;
  public String get_prod_inst_id() {
    return prod_inst_id;
  }
  public void set_prod_inst_id(String prod_inst_id) {
    this.prod_inst_id = prod_inst_id;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_prod_inst_id(String prod_inst_id) {
    this.prod_inst_id = prod_inst_id;
    return this;
  }
  private String user_name;
  public String get_user_name() {
    return user_name;
  }
  public void set_user_name(String user_name) {
    this.user_name = user_name;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_user_name(String user_name) {
    this.user_name = user_name;
    return this;
  }
  private String login_name;
  public String get_login_name() {
    return login_name;
  }
  public void set_login_name(String login_name) {
    this.login_name = login_name;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_login_name(String login_name) {
    this.login_name = login_name;
    return this;
  }
  private String std_org_code;
  public String get_std_org_code() {
    return std_org_code;
  }
  public void set_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
    return this;
  }
  private String DISTRICT_NAME;
  public String get_DISTRICT_NAME() {
    return DISTRICT_NAME;
  }
  public void set_DISTRICT_NAME(String DISTRICT_NAME) {
    this.DISTRICT_NAME = DISTRICT_NAME;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_DISTRICT_NAME(String DISTRICT_NAME) {
    this.DISTRICT_NAME = DISTRICT_NAME;
    return this;
  }
  private String STD_ADDR_NAME;
  public String get_STD_ADDR_NAME() {
    return STD_ADDR_NAME;
  }
  public void set_STD_ADDR_NAME(String STD_ADDR_NAME) {
    this.STD_ADDR_NAME = STD_ADDR_NAME;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_STD_ADDR_NAME(String STD_ADDR_NAME) {
    this.STD_ADDR_NAME = STD_ADDR_NAME;
    return this;
  }
  private java.math.BigDecimal bandwidth;
  public java.math.BigDecimal get_bandwidth() {
    return bandwidth;
  }
  public void set_bandwidth(java.math.BigDecimal bandwidth) {
    this.bandwidth = bandwidth;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_bandwidth(java.math.BigDecimal bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }
  private String pt_mon;
  public String get_pt_mon() {
    return pt_mon;
  }
  public void set_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
  }
  public ST_LAN_PRODUCT_ORDER_DTL_M with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_LAN_PRODUCT_ORDER_DTL_M)) {
      return false;
    }
    ST_LAN_PRODUCT_ORDER_DTL_M that = (ST_LAN_PRODUCT_ORDER_DTL_M) o;
    boolean equal = true;
    equal = equal && (this.cust_id == null ? that.cust_id == null : this.cust_id.equals(that.cust_id));
    equal = equal && (this.prod_inst_id == null ? that.prod_inst_id == null : this.prod_inst_id.equals(that.prod_inst_id));
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.login_name == null ? that.login_name == null : this.login_name.equals(that.login_name));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.DISTRICT_NAME == null ? that.DISTRICT_NAME == null : this.DISTRICT_NAME.equals(that.DISTRICT_NAME));
    equal = equal && (this.STD_ADDR_NAME == null ? that.STD_ADDR_NAME == null : this.STD_ADDR_NAME.equals(that.STD_ADDR_NAME));
    equal = equal && (this.bandwidth == null ? that.bandwidth == null : this.bandwidth.equals(that.bandwidth));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_LAN_PRODUCT_ORDER_DTL_M)) {
      return false;
    }
    ST_LAN_PRODUCT_ORDER_DTL_M that = (ST_LAN_PRODUCT_ORDER_DTL_M) o;
    boolean equal = true;
    equal = equal && (this.cust_id == null ? that.cust_id == null : this.cust_id.equals(that.cust_id));
    equal = equal && (this.prod_inst_id == null ? that.prod_inst_id == null : this.prod_inst_id.equals(that.prod_inst_id));
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.login_name == null ? that.login_name == null : this.login_name.equals(that.login_name));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.DISTRICT_NAME == null ? that.DISTRICT_NAME == null : this.DISTRICT_NAME.equals(that.DISTRICT_NAME));
    equal = equal && (this.STD_ADDR_NAME == null ? that.STD_ADDR_NAME == null : this.STD_ADDR_NAME.equals(that.STD_ADDR_NAME));
    equal = equal && (this.bandwidth == null ? that.bandwidth == null : this.bandwidth.equals(that.bandwidth));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cust_id = JdbcWritableBridge.readString(1, __dbResults);
    this.prod_inst_id = JdbcWritableBridge.readString(2, __dbResults);
    this.user_name = JdbcWritableBridge.readString(3, __dbResults);
    this.login_name = JdbcWritableBridge.readString(4, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(5, __dbResults);
    this.DISTRICT_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.STD_ADDR_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.bandwidth = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cust_id = JdbcWritableBridge.readString(1, __dbResults);
    this.prod_inst_id = JdbcWritableBridge.readString(2, __dbResults);
    this.user_name = JdbcWritableBridge.readString(3, __dbResults);
    this.login_name = JdbcWritableBridge.readString(4, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(5, __dbResults);
    this.DISTRICT_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.STD_ADDR_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.bandwidth = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeString(cust_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prod_inst_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(login_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_ADDR_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bandwidth, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cust_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prod_inst_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(login_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DISTRICT_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_ADDR_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(bandwidth, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.cust_id = null;
    } else {
    this.cust_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.prod_inst_id = null;
    } else {
    this.prod_inst_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_name = null;
    } else {
    this.user_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.login_name = null;
    } else {
    this.login_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_org_code = null;
    } else {
    this.std_org_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISTRICT_NAME = null;
    } else {
    this.DISTRICT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_ADDR_NAME = null;
    } else {
    this.STD_ADDR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bandwidth = null;
    } else {
    this.bandwidth = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pt_mon = null;
    } else {
    this.pt_mon = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.cust_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cust_id);
    }
    if (null == this.prod_inst_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_inst_id);
    }
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.login_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, login_name);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
    }
    if (null == this.DISTRICT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NAME);
    }
    if (null == this.STD_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_ADDR_NAME);
    }
    if (null == this.bandwidth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.bandwidth, __dataOut);
    }
    if (null == this.pt_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pt_mon);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.cust_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cust_id);
    }
    if (null == this.prod_inst_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_inst_id);
    }
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.login_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, login_name);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
    }
    if (null == this.DISTRICT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DISTRICT_NAME);
    }
    if (null == this.STD_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_ADDR_NAME);
    }
    if (null == this.bandwidth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.bandwidth, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(cust_id==null?"null":cust_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_inst_id==null?"null":prod_inst_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"null":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_name==null?"null":login_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTRICT_NAME==null?"null":DISTRICT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_ADDR_NAME==null?"null":STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bandwidth==null?"null":bandwidth.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cust_id==null?"null":cust_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_inst_id==null?"null":prod_inst_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"null":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_name==null?"null":login_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISTRICT_NAME==null?"null":DISTRICT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_ADDR_NAME==null?"null":STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bandwidth==null?"null":bandwidth.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.cust_id = null; } else {
      this.cust_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.prod_inst_id = null; } else {
      this.prod_inst_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.login_name = null; } else {
      this.login_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DISTRICT_NAME = null; } else {
      this.DISTRICT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_ADDR_NAME = null; } else {
      this.STD_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bandwidth = null; } else {
      this.bandwidth = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.cust_id = null; } else {
      this.cust_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.prod_inst_id = null; } else {
      this.prod_inst_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.login_name = null; } else {
      this.login_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DISTRICT_NAME = null; } else {
      this.DISTRICT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_ADDR_NAME = null; } else {
      this.STD_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.bandwidth = null; } else {
      this.bandwidth = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ST_LAN_PRODUCT_ORDER_DTL_M o = (ST_LAN_PRODUCT_ORDER_DTL_M) super.clone();
    return o;
  }

  public void clone0(ST_LAN_PRODUCT_ORDER_DTL_M o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("cust_id", this.cust_id);
    __sqoop$field_map.put("prod_inst_id", this.prod_inst_id);
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("login_name", this.login_name);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("DISTRICT_NAME", this.DISTRICT_NAME);
    __sqoop$field_map.put("STD_ADDR_NAME", this.STD_ADDR_NAME);
    __sqoop$field_map.put("bandwidth", this.bandwidth);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cust_id", this.cust_id);
    __sqoop$field_map.put("prod_inst_id", this.prod_inst_id);
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("login_name", this.login_name);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("DISTRICT_NAME", this.DISTRICT_NAME);
    __sqoop$field_map.put("STD_ADDR_NAME", this.STD_ADDR_NAME);
    __sqoop$field_map.put("bandwidth", this.bandwidth);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("cust_id".equals(__fieldName)) {
      this.cust_id = (String) __fieldVal;
    }
    else    if ("prod_inst_id".equals(__fieldName)) {
      this.prod_inst_id = (String) __fieldVal;
    }
    else    if ("user_name".equals(__fieldName)) {
      this.user_name = (String) __fieldVal;
    }
    else    if ("login_name".equals(__fieldName)) {
      this.login_name = (String) __fieldVal;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
    }
    else    if ("DISTRICT_NAME".equals(__fieldName)) {
      this.DISTRICT_NAME = (String) __fieldVal;
    }
    else    if ("STD_ADDR_NAME".equals(__fieldName)) {
      this.STD_ADDR_NAME = (String) __fieldVal;
    }
    else    if ("bandwidth".equals(__fieldName)) {
      this.bandwidth = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("cust_id".equals(__fieldName)) {
      this.cust_id = (String) __fieldVal;
      return true;
    }
    else    if ("prod_inst_id".equals(__fieldName)) {
      this.prod_inst_id = (String) __fieldVal;
      return true;
    }
    else    if ("user_name".equals(__fieldName)) {
      this.user_name = (String) __fieldVal;
      return true;
    }
    else    if ("login_name".equals(__fieldName)) {
      this.login_name = (String) __fieldVal;
      return true;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
      return true;
    }
    else    if ("DISTRICT_NAME".equals(__fieldName)) {
      this.DISTRICT_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("STD_ADDR_NAME".equals(__fieldName)) {
      this.STD_ADDR_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("bandwidth".equals(__fieldName)) {
      this.bandwidth = (java.math.BigDecimal) __fieldVal;
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
