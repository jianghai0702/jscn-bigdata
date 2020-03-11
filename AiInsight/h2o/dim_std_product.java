// ORM class for table 'dim_std_product'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 18:58:19 CST 2018
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

public class dim_std_product extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String PRODUCT_ID;
  public String get_PRODUCT_ID() {
    return PRODUCT_ID;
  }
  public void set_PRODUCT_ID(String PRODUCT_ID) {
    this.PRODUCT_ID = PRODUCT_ID;
  }
  public dim_std_product with_PRODUCT_ID(String PRODUCT_ID) {
    this.PRODUCT_ID = PRODUCT_ID;
    return this;
  }
  private String PRODUCT_NAME;
  public String get_PRODUCT_NAME() {
    return PRODUCT_NAME;
  }
  public void set_PRODUCT_NAME(String PRODUCT_NAME) {
    this.PRODUCT_NAME = PRODUCT_NAME;
  }
  public dim_std_product with_PRODUCT_NAME(String PRODUCT_NAME) {
    this.PRODUCT_NAME = PRODUCT_NAME;
    return this;
  }
  private String OFFER_NAME;
  public String get_OFFER_NAME() {
    return OFFER_NAME;
  }
  public void set_OFFER_NAME(String OFFER_NAME) {
    this.OFFER_NAME = OFFER_NAME;
  }
  public dim_std_product with_OFFER_NAME(String OFFER_NAME) {
    this.OFFER_NAME = OFFER_NAME;
    return this;
  }
  private String BANDWIDTH;
  public String get_BANDWIDTH() {
    return BANDWIDTH;
  }
  public void set_BANDWIDTH(String BANDWIDTH) {
    this.BANDWIDTH = BANDWIDTH;
  }
  public dim_std_product with_BANDWIDTH(String BANDWIDTH) {
    this.BANDWIDTH = BANDWIDTH;
    return this;
  }
  private java.math.BigDecimal CYCLE;
  public java.math.BigDecimal get_CYCLE() {
    return CYCLE;
  }
  public void set_CYCLE(java.math.BigDecimal CYCLE) {
    this.CYCLE = CYCLE;
  }
  public dim_std_product with_CYCLE(java.math.BigDecimal CYCLE) {
    this.CYCLE = CYCLE;
    return this;
  }
  private java.math.BigDecimal PRICE;
  public java.math.BigDecimal get_PRICE() {
    return PRICE;
  }
  public void set_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
  }
  public dim_std_product with_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
    return this;
  }
  private String FLAG;
  public String get_FLAG() {
    return FLAG;
  }
  public void set_FLAG(String FLAG) {
    this.FLAG = FLAG;
  }
  public dim_std_product with_FLAG(String FLAG) {
    this.FLAG = FLAG;
    return this;
  }
  private String OWN_CORP_STD_ORG_CODE;
  public String get_OWN_CORP_STD_ORG_CODE() {
    return OWN_CORP_STD_ORG_CODE;
  }
  public void set_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
  }
  public dim_std_product with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
    return this;
  }
  private java.sql.Timestamp UPDATE_DATE;
  public java.sql.Timestamp get_UPDATE_DATE() {
    return UPDATE_DATE;
  }
  public void set_UPDATE_DATE(java.sql.Timestamp UPDATE_DATE) {
    this.UPDATE_DATE = UPDATE_DATE;
  }
  public dim_std_product with_UPDATE_DATE(java.sql.Timestamp UPDATE_DATE) {
    this.UPDATE_DATE = UPDATE_DATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_product)) {
      return false;
    }
    dim_std_product that = (dim_std_product) o;
    boolean equal = true;
    equal = equal && (this.PRODUCT_ID == null ? that.PRODUCT_ID == null : this.PRODUCT_ID.equals(that.PRODUCT_ID));
    equal = equal && (this.PRODUCT_NAME == null ? that.PRODUCT_NAME == null : this.PRODUCT_NAME.equals(that.PRODUCT_NAME));
    equal = equal && (this.OFFER_NAME == null ? that.OFFER_NAME == null : this.OFFER_NAME.equals(that.OFFER_NAME));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.FLAG == null ? that.FLAG == null : this.FLAG.equals(that.FLAG));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.UPDATE_DATE == null ? that.UPDATE_DATE == null : this.UPDATE_DATE.equals(that.UPDATE_DATE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_product)) {
      return false;
    }
    dim_std_product that = (dim_std_product) o;
    boolean equal = true;
    equal = equal && (this.PRODUCT_ID == null ? that.PRODUCT_ID == null : this.PRODUCT_ID.equals(that.PRODUCT_ID));
    equal = equal && (this.PRODUCT_NAME == null ? that.PRODUCT_NAME == null : this.PRODUCT_NAME.equals(that.PRODUCT_NAME));
    equal = equal && (this.OFFER_NAME == null ? that.OFFER_NAME == null : this.OFFER_NAME.equals(that.OFFER_NAME));
    equal = equal && (this.BANDWIDTH == null ? that.BANDWIDTH == null : this.BANDWIDTH.equals(that.BANDWIDTH));
    equal = equal && (this.CYCLE == null ? that.CYCLE == null : this.CYCLE.equals(that.CYCLE));
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.FLAG == null ? that.FLAG == null : this.FLAG.equals(that.FLAG));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.UPDATE_DATE == null ? that.UPDATE_DATE == null : this.UPDATE_DATE.equals(that.UPDATE_DATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.PRODUCT_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.PRODUCT_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.OFFER_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readString(4, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.FLAG = JdbcWritableBridge.readString(7, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(8, __dbResults);
    this.UPDATE_DATE = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.PRODUCT_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.PRODUCT_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.OFFER_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.BANDWIDTH = JdbcWritableBridge.readString(4, __dbResults);
    this.CYCLE = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.FLAG = JdbcWritableBridge.readString(7, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(8, __dbResults);
    this.UPDATE_DATE = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeString(PRODUCT_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OFFER_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BANDWIDTH, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(FLAG, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DATE, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(PRODUCT_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRODUCT_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OFFER_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BANDWIDTH, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CYCLE, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(FLAG, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DATE, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_ID = null;
    } else {
    this.PRODUCT_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRODUCT_NAME = null;
    } else {
    this.PRODUCT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OFFER_NAME = null;
    } else {
    this.OFFER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BANDWIDTH = null;
    } else {
    this.BANDWIDTH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CYCLE = null;
    } else {
    this.CYCLE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICE = null;
    } else {
    this.PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FLAG = null;
    } else {
    this.FLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OWN_CORP_STD_ORG_CODE = null;
    } else {
    this.OWN_CORP_STD_ORG_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATE_DATE = null;
    } else {
    this.UPDATE_DATE = new Timestamp(__dataIn.readLong());
    this.UPDATE_DATE.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.PRODUCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_ID);
    }
    if (null == this.PRODUCT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_NAME);
    }
    if (null == this.OFFER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OFFER_NAME);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BANDWIDTH);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FLAG);
    }
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.UPDATE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DATE.getTime());
    __dataOut.writeInt(this.UPDATE_DATE.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.PRODUCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_ID);
    }
    if (null == this.PRODUCT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRODUCT_NAME);
    }
    if (null == this.OFFER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OFFER_NAME);
    }
    if (null == this.BANDWIDTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BANDWIDTH);
    }
    if (null == this.CYCLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CYCLE, __dataOut);
    }
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FLAG);
    }
    if (null == this.OWN_CORP_STD_ORG_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OWN_CORP_STD_ORG_CODE);
    }
    if (null == this.UPDATE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATE_DATE.getTime());
    __dataOut.writeInt(this.UPDATE_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_ID==null?"null":PRODUCT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_NAME==null?"null":PRODUCT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OFFER_NAME==null?"null":OFFER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLAG==null?"null":FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DATE==null?"null":"" + UPDATE_DATE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_ID==null?"null":PRODUCT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRODUCT_NAME==null?"null":PRODUCT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OFFER_NAME==null?"null":OFFER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BANDWIDTH==null?"null":BANDWIDTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCLE==null?"null":CYCLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLAG==null?"null":FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DATE==null?"null":"" + UPDATE_DATE, delimiters));
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
    if (__cur_str.equals("\\N")) { this.PRODUCT_ID = null; } else {
      this.PRODUCT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PRODUCT_NAME = null; } else {
      this.PRODUCT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OFFER_NAME = null; } else {
      this.OFFER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.FLAG = null; } else {
      this.FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UPDATE_DATE = null; } else {
      this.UPDATE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PRODUCT_ID = null; } else {
      this.PRODUCT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PRODUCT_NAME = null; } else {
      this.PRODUCT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OFFER_NAME = null; } else {
      this.OFFER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.BANDWIDTH = null; } else {
      this.BANDWIDTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CYCLE = null; } else {
      this.CYCLE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.FLAG = null; } else {
      this.FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UPDATE_DATE = null; } else {
      this.UPDATE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dim_std_product o = (dim_std_product) super.clone();
    o.UPDATE_DATE = (o.UPDATE_DATE != null) ? (java.sql.Timestamp) o.UPDATE_DATE.clone() : null;
    return o;
  }

  public void clone0(dim_std_product o) throws CloneNotSupportedException {
    o.UPDATE_DATE = (o.UPDATE_DATE != null) ? (java.sql.Timestamp) o.UPDATE_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("PRODUCT_ID", this.PRODUCT_ID);
    __sqoop$field_map.put("PRODUCT_NAME", this.PRODUCT_NAME);
    __sqoop$field_map.put("OFFER_NAME", this.OFFER_NAME);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("FLAG", this.FLAG);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("UPDATE_DATE", this.UPDATE_DATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("PRODUCT_ID", this.PRODUCT_ID);
    __sqoop$field_map.put("PRODUCT_NAME", this.PRODUCT_NAME);
    __sqoop$field_map.put("OFFER_NAME", this.OFFER_NAME);
    __sqoop$field_map.put("BANDWIDTH", this.BANDWIDTH);
    __sqoop$field_map.put("CYCLE", this.CYCLE);
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("FLAG", this.FLAG);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("UPDATE_DATE", this.UPDATE_DATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("PRODUCT_ID".equals(__fieldName)) {
      this.PRODUCT_ID = (String) __fieldVal;
    }
    else    if ("PRODUCT_NAME".equals(__fieldName)) {
      this.PRODUCT_NAME = (String) __fieldVal;
    }
    else    if ("OFFER_NAME".equals(__fieldName)) {
      this.OFFER_NAME = (String) __fieldVal;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (String) __fieldVal;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PRICE".equals(__fieldName)) {
      this.PRICE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FLAG".equals(__fieldName)) {
      this.FLAG = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("UPDATE_DATE".equals(__fieldName)) {
      this.UPDATE_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("PRODUCT_ID".equals(__fieldName)) {
      this.PRODUCT_ID = (String) __fieldVal;
      return true;
    }
    else    if ("PRODUCT_NAME".equals(__fieldName)) {
      this.PRODUCT_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("OFFER_NAME".equals(__fieldName)) {
      this.OFFER_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("BANDWIDTH".equals(__fieldName)) {
      this.BANDWIDTH = (String) __fieldVal;
      return true;
    }
    else    if ("CYCLE".equals(__fieldName)) {
      this.CYCLE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PRICE".equals(__fieldName)) {
      this.PRICE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FLAG".equals(__fieldName)) {
      this.FLAG = (String) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("UPDATE_DATE".equals(__fieldName)) {
      this.UPDATE_DATE = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
