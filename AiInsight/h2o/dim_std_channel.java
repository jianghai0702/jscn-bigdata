// ORM class for table 'dim_std_channel'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 10 15:02:49 CST 2018
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

public class dim_std_channel extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String STD_CHANNEL_CODE;
  public String get_STD_CHANNEL_CODE() {
    return STD_CHANNEL_CODE;
  }
  public void set_STD_CHANNEL_CODE(String STD_CHANNEL_CODE) {
    this.STD_CHANNEL_CODE = STD_CHANNEL_CODE;
  }
  public dim_std_channel with_STD_CHANNEL_CODE(String STD_CHANNEL_CODE) {
    this.STD_CHANNEL_CODE = STD_CHANNEL_CODE;
    return this;
  }
  private String STD_CHANNEL_NAME;
  public String get_STD_CHANNEL_NAME() {
    return STD_CHANNEL_NAME;
  }
  public void set_STD_CHANNEL_NAME(String STD_CHANNEL_NAME) {
    this.STD_CHANNEL_NAME = STD_CHANNEL_NAME;
  }
  public dim_std_channel with_STD_CHANNEL_NAME(String STD_CHANNEL_NAME) {
    this.STD_CHANNEL_NAME = STD_CHANNEL_NAME;
    return this;
  }
  private String P_STD_CHANNEL_CODE;
  public String get_P_STD_CHANNEL_CODE() {
    return P_STD_CHANNEL_CODE;
  }
  public void set_P_STD_CHANNEL_CODE(String P_STD_CHANNEL_CODE) {
    this.P_STD_CHANNEL_CODE = P_STD_CHANNEL_CODE;
  }
  public dim_std_channel with_P_STD_CHANNEL_CODE(String P_STD_CHANNEL_CODE) {
    this.P_STD_CHANNEL_CODE = P_STD_CHANNEL_CODE;
    return this;
  }
  private String STD_CHANNEL_GROUP_CODE;
  public String get_STD_CHANNEL_GROUP_CODE() {
    return STD_CHANNEL_GROUP_CODE;
  }
  public void set_STD_CHANNEL_GROUP_CODE(String STD_CHANNEL_GROUP_CODE) {
    this.STD_CHANNEL_GROUP_CODE = STD_CHANNEL_GROUP_CODE;
  }
  public dim_std_channel with_STD_CHANNEL_GROUP_CODE(String STD_CHANNEL_GROUP_CODE) {
    this.STD_CHANNEL_GROUP_CODE = STD_CHANNEL_GROUP_CODE;
    return this;
  }
  private String STD_CHANNEL_GROUP_NAME;
  public String get_STD_CHANNEL_GROUP_NAME() {
    return STD_CHANNEL_GROUP_NAME;
  }
  public void set_STD_CHANNEL_GROUP_NAME(String STD_CHANNEL_GROUP_NAME) {
    this.STD_CHANNEL_GROUP_NAME = STD_CHANNEL_GROUP_NAME;
  }
  public dim_std_channel with_STD_CHANNEL_GROUP_NAME(String STD_CHANNEL_GROUP_NAME) {
    this.STD_CHANNEL_GROUP_NAME = STD_CHANNEL_GROUP_NAME;
    return this;
  }
  private String FULLPATH;
  public String get_FULLPATH() {
    return FULLPATH;
  }
  public void set_FULLPATH(String FULLPATH) {
    this.FULLPATH = FULLPATH;
  }
  public dim_std_channel with_FULLPATH(String FULLPATH) {
    this.FULLPATH = FULLPATH;
    return this;
  }
  private String ORIGINAL_CODE;
  public String get_ORIGINAL_CODE() {
    return ORIGINAL_CODE;
  }
  public void set_ORIGINAL_CODE(String ORIGINAL_CODE) {
    this.ORIGINAL_CODE = ORIGINAL_CODE;
  }
  public dim_std_channel with_ORIGINAL_CODE(String ORIGINAL_CODE) {
    this.ORIGINAL_CODE = ORIGINAL_CODE;
    return this;
  }
  private String NOTES;
  public String get_NOTES() {
    return NOTES;
  }
  public void set_NOTES(String NOTES) {
    this.NOTES = NOTES;
  }
  public dim_std_channel with_NOTES(String NOTES) {
    this.NOTES = NOTES;
    return this;
  }
  private java.math.BigDecimal IS_DISPLAY;
  public java.math.BigDecimal get_IS_DISPLAY() {
    return IS_DISPLAY;
  }
  public void set_IS_DISPLAY(java.math.BigDecimal IS_DISPLAY) {
    this.IS_DISPLAY = IS_DISPLAY;
  }
  public dim_std_channel with_IS_DISPLAY(java.math.BigDecimal IS_DISPLAY) {
    this.IS_DISPLAY = IS_DISPLAY;
    return this;
  }
  private java.math.BigDecimal DISPLAY_ORDER;
  public java.math.BigDecimal get_DISPLAY_ORDER() {
    return DISPLAY_ORDER;
  }
  public void set_DISPLAY_ORDER(java.math.BigDecimal DISPLAY_ORDER) {
    this.DISPLAY_ORDER = DISPLAY_ORDER;
  }
  public dim_std_channel with_DISPLAY_ORDER(java.math.BigDecimal DISPLAY_ORDER) {
    this.DISPLAY_ORDER = DISPLAY_ORDER;
    return this;
  }
  private java.math.BigDecimal IS_VALID;
  public java.math.BigDecimal get_IS_VALID() {
    return IS_VALID;
  }
  public void set_IS_VALID(java.math.BigDecimal IS_VALID) {
    this.IS_VALID = IS_VALID;
  }
  public dim_std_channel with_IS_VALID(java.math.BigDecimal IS_VALID) {
    this.IS_VALID = IS_VALID;
    return this;
  }
  private String std_org_code;
  public String get_std_org_code() {
    return std_org_code;
  }
  public void set_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
  }
  public dim_std_channel with_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
    return this;
  }
  private java.sql.Timestamp UPDATE_DATE;
  public java.sql.Timestamp get_UPDATE_DATE() {
    return UPDATE_DATE;
  }
  public void set_UPDATE_DATE(java.sql.Timestamp UPDATE_DATE) {
    this.UPDATE_DATE = UPDATE_DATE;
  }
  public dim_std_channel with_UPDATE_DATE(java.sql.Timestamp UPDATE_DATE) {
    this.UPDATE_DATE = UPDATE_DATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_channel)) {
      return false;
    }
    dim_std_channel that = (dim_std_channel) o;
    boolean equal = true;
    equal = equal && (this.STD_CHANNEL_CODE == null ? that.STD_CHANNEL_CODE == null : this.STD_CHANNEL_CODE.equals(that.STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_NAME == null ? that.STD_CHANNEL_NAME == null : this.STD_CHANNEL_NAME.equals(that.STD_CHANNEL_NAME));
    equal = equal && (this.P_STD_CHANNEL_CODE == null ? that.P_STD_CHANNEL_CODE == null : this.P_STD_CHANNEL_CODE.equals(that.P_STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_GROUP_CODE == null ? that.STD_CHANNEL_GROUP_CODE == null : this.STD_CHANNEL_GROUP_CODE.equals(that.STD_CHANNEL_GROUP_CODE));
    equal = equal && (this.STD_CHANNEL_GROUP_NAME == null ? that.STD_CHANNEL_GROUP_NAME == null : this.STD_CHANNEL_GROUP_NAME.equals(that.STD_CHANNEL_GROUP_NAME));
    equal = equal && (this.FULLPATH == null ? that.FULLPATH == null : this.FULLPATH.equals(that.FULLPATH));
    equal = equal && (this.ORIGINAL_CODE == null ? that.ORIGINAL_CODE == null : this.ORIGINAL_CODE.equals(that.ORIGINAL_CODE));
    equal = equal && (this.NOTES == null ? that.NOTES == null : this.NOTES.equals(that.NOTES));
    equal = equal && (this.IS_DISPLAY == null ? that.IS_DISPLAY == null : this.IS_DISPLAY.equals(that.IS_DISPLAY));
    equal = equal && (this.DISPLAY_ORDER == null ? that.DISPLAY_ORDER == null : this.DISPLAY_ORDER.equals(that.DISPLAY_ORDER));
    equal = equal && (this.IS_VALID == null ? that.IS_VALID == null : this.IS_VALID.equals(that.IS_VALID));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.UPDATE_DATE == null ? that.UPDATE_DATE == null : this.UPDATE_DATE.equals(that.UPDATE_DATE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_std_channel)) {
      return false;
    }
    dim_std_channel that = (dim_std_channel) o;
    boolean equal = true;
    equal = equal && (this.STD_CHANNEL_CODE == null ? that.STD_CHANNEL_CODE == null : this.STD_CHANNEL_CODE.equals(that.STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_NAME == null ? that.STD_CHANNEL_NAME == null : this.STD_CHANNEL_NAME.equals(that.STD_CHANNEL_NAME));
    equal = equal && (this.P_STD_CHANNEL_CODE == null ? that.P_STD_CHANNEL_CODE == null : this.P_STD_CHANNEL_CODE.equals(that.P_STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_GROUP_CODE == null ? that.STD_CHANNEL_GROUP_CODE == null : this.STD_CHANNEL_GROUP_CODE.equals(that.STD_CHANNEL_GROUP_CODE));
    equal = equal && (this.STD_CHANNEL_GROUP_NAME == null ? that.STD_CHANNEL_GROUP_NAME == null : this.STD_CHANNEL_GROUP_NAME.equals(that.STD_CHANNEL_GROUP_NAME));
    equal = equal && (this.FULLPATH == null ? that.FULLPATH == null : this.FULLPATH.equals(that.FULLPATH));
    equal = equal && (this.ORIGINAL_CODE == null ? that.ORIGINAL_CODE == null : this.ORIGINAL_CODE.equals(that.ORIGINAL_CODE));
    equal = equal && (this.NOTES == null ? that.NOTES == null : this.NOTES.equals(that.NOTES));
    equal = equal && (this.IS_DISPLAY == null ? that.IS_DISPLAY == null : this.IS_DISPLAY.equals(that.IS_DISPLAY));
    equal = equal && (this.DISPLAY_ORDER == null ? that.DISPLAY_ORDER == null : this.DISPLAY_ORDER.equals(that.DISPLAY_ORDER));
    equal = equal && (this.IS_VALID == null ? that.IS_VALID == null : this.IS_VALID.equals(that.IS_VALID));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.UPDATE_DATE == null ? that.UPDATE_DATE == null : this.UPDATE_DATE.equals(that.UPDATE_DATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STD_CHANNEL_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.STD_CHANNEL_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.P_STD_CHANNEL_CODE = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_CHANNEL_GROUP_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_CHANNEL_GROUP_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.FULLPATH = JdbcWritableBridge.readString(6, __dbResults);
    this.ORIGINAL_CODE = JdbcWritableBridge.readString(7, __dbResults);
    this.NOTES = JdbcWritableBridge.readString(8, __dbResults);
    this.IS_DISPLAY = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DISPLAY_ORDER = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.IS_VALID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(12, __dbResults);
    this.UPDATE_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STD_CHANNEL_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.STD_CHANNEL_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.P_STD_CHANNEL_CODE = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_CHANNEL_GROUP_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_CHANNEL_GROUP_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.FULLPATH = JdbcWritableBridge.readString(6, __dbResults);
    this.ORIGINAL_CODE = JdbcWritableBridge.readString(7, __dbResults);
    this.NOTES = JdbcWritableBridge.readString(8, __dbResults);
    this.IS_DISPLAY = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DISPLAY_ORDER = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.IS_VALID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(12, __dbResults);
    this.UPDATE_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeString(STD_CHANNEL_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(P_STD_CHANNEL_CODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_GROUP_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_GROUP_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FULLPATH, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORIGINAL_CODE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NOTES, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_DISPLAY, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DISPLAY_ORDER, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_VALID, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DATE, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STD_CHANNEL_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(P_STD_CHANNEL_CODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_GROUP_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_GROUP_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FULLPATH, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORIGINAL_CODE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NOTES, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_DISPLAY, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DISPLAY_ORDER, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(IS_VALID, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATE_DATE, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.STD_CHANNEL_CODE = null;
    } else {
    this.STD_CHANNEL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_CHANNEL_NAME = null;
    } else {
    this.STD_CHANNEL_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.P_STD_CHANNEL_CODE = null;
    } else {
    this.P_STD_CHANNEL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_CHANNEL_GROUP_CODE = null;
    } else {
    this.STD_CHANNEL_GROUP_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_CHANNEL_GROUP_NAME = null;
    } else {
    this.STD_CHANNEL_GROUP_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FULLPATH = null;
    } else {
    this.FULLPATH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORIGINAL_CODE = null;
    } else {
    this.ORIGINAL_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NOTES = null;
    } else {
    this.NOTES = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IS_DISPLAY = null;
    } else {
    this.IS_DISPLAY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DISPLAY_ORDER = null;
    } else {
    this.DISPLAY_ORDER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IS_VALID = null;
    } else {
    this.IS_VALID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_org_code = null;
    } else {
    this.std_org_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATE_DATE = null;
    } else {
    this.UPDATE_DATE = new Timestamp(__dataIn.readLong());
    this.UPDATE_DATE.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STD_CHANNEL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_CODE);
    }
    if (null == this.STD_CHANNEL_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_NAME);
    }
    if (null == this.P_STD_CHANNEL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, P_STD_CHANNEL_CODE);
    }
    if (null == this.STD_CHANNEL_GROUP_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_GROUP_CODE);
    }
    if (null == this.STD_CHANNEL_GROUP_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_GROUP_NAME);
    }
    if (null == this.FULLPATH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FULLPATH);
    }
    if (null == this.ORIGINAL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORIGINAL_CODE);
    }
    if (null == this.NOTES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NOTES);
    }
    if (null == this.IS_DISPLAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_DISPLAY, __dataOut);
    }
    if (null == this.DISPLAY_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DISPLAY_ORDER, __dataOut);
    }
    if (null == this.IS_VALID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_VALID, __dataOut);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
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
    if (null == this.STD_CHANNEL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_CODE);
    }
    if (null == this.STD_CHANNEL_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_NAME);
    }
    if (null == this.P_STD_CHANNEL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, P_STD_CHANNEL_CODE);
    }
    if (null == this.STD_CHANNEL_GROUP_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_GROUP_CODE);
    }
    if (null == this.STD_CHANNEL_GROUP_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_CHANNEL_GROUP_NAME);
    }
    if (null == this.FULLPATH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FULLPATH);
    }
    if (null == this.ORIGINAL_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORIGINAL_CODE);
    }
    if (null == this.NOTES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NOTES);
    }
    if (null == this.IS_DISPLAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_DISPLAY, __dataOut);
    }
    if (null == this.DISPLAY_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DISPLAY_ORDER, __dataOut);
    }
    if (null == this.IS_VALID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IS_VALID, __dataOut);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_CODE==null?"null":STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_NAME==null?"null":STD_CHANNEL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(P_STD_CHANNEL_CODE==null?"null":P_STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_GROUP_CODE==null?"null":STD_CHANNEL_GROUP_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_GROUP_NAME==null?"null":STD_CHANNEL_GROUP_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FULLPATH==null?"null":FULLPATH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORIGINAL_CODE==null?"null":ORIGINAL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOTES==null?"null":NOTES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_DISPLAY==null?"null":IS_DISPLAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISPLAY_ORDER==null?"null":DISPLAY_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_VALID==null?"null":IS_VALID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATE_DATE==null?"null":"" + UPDATE_DATE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_CODE==null?"null":STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_NAME==null?"null":STD_CHANNEL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(P_STD_CHANNEL_CODE==null?"null":P_STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_GROUP_CODE==null?"null":STD_CHANNEL_GROUP_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_GROUP_NAME==null?"null":STD_CHANNEL_GROUP_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FULLPATH==null?"null":FULLPATH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORIGINAL_CODE==null?"null":ORIGINAL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOTES==null?"null":NOTES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_DISPLAY==null?"null":IS_DISPLAY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DISPLAY_ORDER==null?"null":DISPLAY_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_VALID==null?"null":IS_VALID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
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
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_CODE = null; } else {
      this.STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_NAME = null; } else {
      this.STD_CHANNEL_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.P_STD_CHANNEL_CODE = null; } else {
      this.P_STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_GROUP_CODE = null; } else {
      this.STD_CHANNEL_GROUP_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_GROUP_NAME = null; } else {
      this.STD_CHANNEL_GROUP_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.FULLPATH = null; } else {
      this.FULLPATH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ORIGINAL_CODE = null; } else {
      this.ORIGINAL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.NOTES = null; } else {
      this.NOTES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.IS_DISPLAY = null; } else {
      this.IS_DISPLAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DISPLAY_ORDER = null; } else {
      this.DISPLAY_ORDER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.IS_VALID = null; } else {
      this.IS_VALID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_CODE = null; } else {
      this.STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_NAME = null; } else {
      this.STD_CHANNEL_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.P_STD_CHANNEL_CODE = null; } else {
      this.P_STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_GROUP_CODE = null; } else {
      this.STD_CHANNEL_GROUP_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_GROUP_NAME = null; } else {
      this.STD_CHANNEL_GROUP_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.FULLPATH = null; } else {
      this.FULLPATH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.ORIGINAL_CODE = null; } else {
      this.ORIGINAL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.NOTES = null; } else {
      this.NOTES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.IS_DISPLAY = null; } else {
      this.IS_DISPLAY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DISPLAY_ORDER = null; } else {
      this.DISPLAY_ORDER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.IS_VALID = null; } else {
      this.IS_VALID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UPDATE_DATE = null; } else {
      this.UPDATE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dim_std_channel o = (dim_std_channel) super.clone();
    o.UPDATE_DATE = (o.UPDATE_DATE != null) ? (java.sql.Timestamp) o.UPDATE_DATE.clone() : null;
    return o;
  }

  public void clone0(dim_std_channel o) throws CloneNotSupportedException {
    o.UPDATE_DATE = (o.UPDATE_DATE != null) ? (java.sql.Timestamp) o.UPDATE_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("STD_CHANNEL_CODE", this.STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_NAME", this.STD_CHANNEL_NAME);
    __sqoop$field_map.put("P_STD_CHANNEL_CODE", this.P_STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_GROUP_CODE", this.STD_CHANNEL_GROUP_CODE);
    __sqoop$field_map.put("STD_CHANNEL_GROUP_NAME", this.STD_CHANNEL_GROUP_NAME);
    __sqoop$field_map.put("FULLPATH", this.FULLPATH);
    __sqoop$field_map.put("ORIGINAL_CODE", this.ORIGINAL_CODE);
    __sqoop$field_map.put("NOTES", this.NOTES);
    __sqoop$field_map.put("IS_DISPLAY", this.IS_DISPLAY);
    __sqoop$field_map.put("DISPLAY_ORDER", this.DISPLAY_ORDER);
    __sqoop$field_map.put("IS_VALID", this.IS_VALID);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("UPDATE_DATE", this.UPDATE_DATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STD_CHANNEL_CODE", this.STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_NAME", this.STD_CHANNEL_NAME);
    __sqoop$field_map.put("P_STD_CHANNEL_CODE", this.P_STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_GROUP_CODE", this.STD_CHANNEL_GROUP_CODE);
    __sqoop$field_map.put("STD_CHANNEL_GROUP_NAME", this.STD_CHANNEL_GROUP_NAME);
    __sqoop$field_map.put("FULLPATH", this.FULLPATH);
    __sqoop$field_map.put("ORIGINAL_CODE", this.ORIGINAL_CODE);
    __sqoop$field_map.put("NOTES", this.NOTES);
    __sqoop$field_map.put("IS_DISPLAY", this.IS_DISPLAY);
    __sqoop$field_map.put("DISPLAY_ORDER", this.DISPLAY_ORDER);
    __sqoop$field_map.put("IS_VALID", this.IS_VALID);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("UPDATE_DATE", this.UPDATE_DATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("STD_CHANNEL_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_CODE = (String) __fieldVal;
    }
    else    if ("STD_CHANNEL_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_NAME = (String) __fieldVal;
    }
    else    if ("P_STD_CHANNEL_CODE".equals(__fieldName)) {
      this.P_STD_CHANNEL_CODE = (String) __fieldVal;
    }
    else    if ("STD_CHANNEL_GROUP_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_GROUP_CODE = (String) __fieldVal;
    }
    else    if ("STD_CHANNEL_GROUP_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_GROUP_NAME = (String) __fieldVal;
    }
    else    if ("FULLPATH".equals(__fieldName)) {
      this.FULLPATH = (String) __fieldVal;
    }
    else    if ("ORIGINAL_CODE".equals(__fieldName)) {
      this.ORIGINAL_CODE = (String) __fieldVal;
    }
    else    if ("NOTES".equals(__fieldName)) {
      this.NOTES = (String) __fieldVal;
    }
    else    if ("IS_DISPLAY".equals(__fieldName)) {
      this.IS_DISPLAY = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DISPLAY_ORDER".equals(__fieldName)) {
      this.DISPLAY_ORDER = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("IS_VALID".equals(__fieldName)) {
      this.IS_VALID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
    }
    else    if ("UPDATE_DATE".equals(__fieldName)) {
      this.UPDATE_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("STD_CHANNEL_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_CHANNEL_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("P_STD_CHANNEL_CODE".equals(__fieldName)) {
      this.P_STD_CHANNEL_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_CHANNEL_GROUP_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_GROUP_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_CHANNEL_GROUP_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_GROUP_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("FULLPATH".equals(__fieldName)) {
      this.FULLPATH = (String) __fieldVal;
      return true;
    }
    else    if ("ORIGINAL_CODE".equals(__fieldName)) {
      this.ORIGINAL_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("NOTES".equals(__fieldName)) {
      this.NOTES = (String) __fieldVal;
      return true;
    }
    else    if ("IS_DISPLAY".equals(__fieldName)) {
      this.IS_DISPLAY = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DISPLAY_ORDER".equals(__fieldName)) {
      this.DISPLAY_ORDER = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("IS_VALID".equals(__fieldName)) {
      this.IS_VALID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
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
