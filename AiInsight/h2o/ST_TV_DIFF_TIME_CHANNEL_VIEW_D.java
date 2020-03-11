// ORM class for table 'ST_TV_DIFF_TIME_CHANNEL_VIEW_D'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 10 17:15:30 CST 2018
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

public class ST_TV_DIFF_TIME_CHANNEL_VIEW_D extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String STD_CHANNEL_CODE;
  public String get_STD_CHANNEL_CODE() {
    return STD_CHANNEL_CODE;
  }
  public void set_STD_CHANNEL_CODE(String STD_CHANNEL_CODE) {
    this.STD_CHANNEL_CODE = STD_CHANNEL_CODE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_STD_CHANNEL_CODE(String STD_CHANNEL_CODE) {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_STD_CHANNEL_NAME(String STD_CHANNEL_NAME) {
    this.STD_CHANNEL_NAME = STD_CHANNEL_NAME;
    return this;
  }
  private String STD_TIMES_CODE;
  public String get_STD_TIMES_CODE() {
    return STD_TIMES_CODE;
  }
  public void set_STD_TIMES_CODE(String STD_TIMES_CODE) {
    this.STD_TIMES_CODE = STD_TIMES_CODE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_STD_TIMES_CODE(String STD_TIMES_CODE) {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_STD_TIMES_NAME(String STD_TIMES_NAME) {
    this.STD_TIMES_NAME = STD_TIMES_NAME;
    return this;
  }
  private java.math.BigDecimal TV_USER_COUNT;
  public java.math.BigDecimal get_TV_USER_COUNT() {
    return TV_USER_COUNT;
  }
  public void set_TV_USER_COUNT(java.math.BigDecimal TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_TV_USER_COUNT(java.math.BigDecimal TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal TV_TIME;
  public java.math.BigDecimal get_TV_TIME() {
    return TV_TIME;
  }
  public void set_TV_TIME(java.math.BigDecimal TV_TIME) {
    this.TV_TIME = TV_TIME;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_TV_TIME(java.math.BigDecimal TV_TIME) {
    this.TV_TIME = TV_TIME;
    return this;
  }
  private java.math.BigDecimal AVG_TV_TIME;
  public java.math.BigDecimal get_AVG_TV_TIME() {
    return AVG_TV_TIME;
  }
  public void set_AVG_TV_TIME(java.math.BigDecimal AVG_TV_TIME) {
    this.AVG_TV_TIME = AVG_TV_TIME;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_AVG_TV_TIME(java.math.BigDecimal AVG_TV_TIME) {
    this.AVG_TV_TIME = AVG_TV_TIME;
    return this;
  }
  private java.math.BigDecimal TV_RATE;
  public java.math.BigDecimal get_TV_RATE() {
    return TV_RATE;
  }
  public void set_TV_RATE(java.math.BigDecimal TV_RATE) {
    this.TV_RATE = TV_RATE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_TV_RATE(java.math.BigDecimal TV_RATE) {
    this.TV_RATE = TV_RATE;
    return this;
  }
  private java.math.BigDecimal TV_OCCUPY_RATE;
  public java.math.BigDecimal get_TV_OCCUPY_RATE() {
    return TV_OCCUPY_RATE;
  }
  public void set_TV_OCCUPY_RATE(java.math.BigDecimal TV_OCCUPY_RATE) {
    this.TV_OCCUPY_RATE = TV_OCCUPY_RATE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_TV_OCCUPY_RATE(java.math.BigDecimal TV_OCCUPY_RATE) {
    this.TV_OCCUPY_RATE = TV_OCCUPY_RATE;
    return this;
  }
  private java.math.BigDecimal TV_ARRIVAL_RATE;
  public java.math.BigDecimal get_TV_ARRIVAL_RATE() {
    return TV_ARRIVAL_RATE;
  }
  public void set_TV_ARRIVAL_RATE(java.math.BigDecimal TV_ARRIVAL_RATE) {
    this.TV_ARRIVAL_RATE = TV_ARRIVAL_RATE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_TV_ARRIVAL_RATE(java.math.BigDecimal TV_ARRIVAL_RATE) {
    this.TV_ARRIVAL_RATE = TV_ARRIVAL_RATE;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_TV_DIFF_TIME_CHANNEL_VIEW_D with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_TV_DIFF_TIME_CHANNEL_VIEW_D)) {
      return false;
    }
    ST_TV_DIFF_TIME_CHANNEL_VIEW_D that = (ST_TV_DIFF_TIME_CHANNEL_VIEW_D) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.STD_CHANNEL_CODE == null ? that.STD_CHANNEL_CODE == null : this.STD_CHANNEL_CODE.equals(that.STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_NAME == null ? that.STD_CHANNEL_NAME == null : this.STD_CHANNEL_NAME.equals(that.STD_CHANNEL_NAME));
    equal = equal && (this.STD_TIMES_CODE == null ? that.STD_TIMES_CODE == null : this.STD_TIMES_CODE.equals(that.STD_TIMES_CODE));
    equal = equal && (this.STD_TIMES_NAME == null ? that.STD_TIMES_NAME == null : this.STD_TIMES_NAME.equals(that.STD_TIMES_NAME));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.TV_TIME == null ? that.TV_TIME == null : this.TV_TIME.equals(that.TV_TIME));
    equal = equal && (this.AVG_TV_TIME == null ? that.AVG_TV_TIME == null : this.AVG_TV_TIME.equals(that.AVG_TV_TIME));
    equal = equal && (this.TV_RATE == null ? that.TV_RATE == null : this.TV_RATE.equals(that.TV_RATE));
    equal = equal && (this.TV_OCCUPY_RATE == null ? that.TV_OCCUPY_RATE == null : this.TV_OCCUPY_RATE.equals(that.TV_OCCUPY_RATE));
    equal = equal && (this.TV_ARRIVAL_RATE == null ? that.TV_ARRIVAL_RATE == null : this.TV_ARRIVAL_RATE.equals(that.TV_ARRIVAL_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_TV_DIFF_TIME_CHANNEL_VIEW_D)) {
      return false;
    }
    ST_TV_DIFF_TIME_CHANNEL_VIEW_D that = (ST_TV_DIFF_TIME_CHANNEL_VIEW_D) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.STD_CHANNEL_CODE == null ? that.STD_CHANNEL_CODE == null : this.STD_CHANNEL_CODE.equals(that.STD_CHANNEL_CODE));
    equal = equal && (this.STD_CHANNEL_NAME == null ? that.STD_CHANNEL_NAME == null : this.STD_CHANNEL_NAME.equals(that.STD_CHANNEL_NAME));
    equal = equal && (this.STD_TIMES_CODE == null ? that.STD_TIMES_CODE == null : this.STD_TIMES_CODE.equals(that.STD_TIMES_CODE));
    equal = equal && (this.STD_TIMES_NAME == null ? that.STD_TIMES_NAME == null : this.STD_TIMES_NAME.equals(that.STD_TIMES_NAME));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.TV_TIME == null ? that.TV_TIME == null : this.TV_TIME.equals(that.TV_TIME));
    equal = equal && (this.AVG_TV_TIME == null ? that.AVG_TV_TIME == null : this.AVG_TV_TIME.equals(that.AVG_TV_TIME));
    equal = equal && (this.TV_RATE == null ? that.TV_RATE == null : this.TV_RATE.equals(that.TV_RATE));
    equal = equal && (this.TV_OCCUPY_RATE == null ? that.TV_OCCUPY_RATE == null : this.TV_OCCUPY_RATE.equals(that.TV_OCCUPY_RATE));
    equal = equal && (this.TV_ARRIVAL_RATE == null ? that.TV_ARRIVAL_RATE == null : this.TV_ARRIVAL_RATE.equals(that.TV_ARRIVAL_RATE));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_CHANNEL_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_CHANNEL_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.STD_TIMES_CODE = JdbcWritableBridge.readString(6, __dbResults);
    this.STD_TIMES_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TV_TIME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AVG_TV_TIME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.TV_RATE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.TV_OCCUPY_RATE = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.TV_ARRIVAL_RATE = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_CHANNEL_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_CHANNEL_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.STD_TIMES_CODE = JdbcWritableBridge.readString(6, __dbResults);
    this.STD_TIMES_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TV_TIME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AVG_TV_TIME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.TV_RATE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.TV_OCCUPY_RATE = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.TV_ARRIVAL_RATE = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(STD_CHANNEL_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_CODE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_TIME, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_TV_TIME, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_RATE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_OCCUPY_RATE, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_ARRIVAL_RATE, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_CHANNEL_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_CODE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_TIMES_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_TIME, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_TV_TIME, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_RATE, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_OCCUPY_RATE, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_ARRIVAL_RATE, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 15 + __off, 12, __dbStmt);
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
        this.TV_USER_COUNT = null;
    } else {
    this.TV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TV_TIME = null;
    } else {
    this.TV_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_TV_TIME = null;
    } else {
    this.AVG_TV_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TV_RATE = null;
    } else {
    this.TV_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TV_OCCUPY_RATE = null;
    } else {
    this.TV_OCCUPY_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TV_ARRIVAL_RATE = null;
    } else {
    this.TV_ARRIVAL_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_USER_COUNT, __dataOut);
    }
    if (null == this.TV_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_TIME, __dataOut);
    }
    if (null == this.AVG_TV_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_TV_TIME, __dataOut);
    }
    if (null == this.TV_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_RATE, __dataOut);
    }
    if (null == this.TV_OCCUPY_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_OCCUPY_RATE, __dataOut);
    }
    if (null == this.TV_ARRIVAL_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_ARRIVAL_RATE, __dataOut);
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
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_USER_COUNT, __dataOut);
    }
    if (null == this.TV_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_TIME, __dataOut);
    }
    if (null == this.AVG_TV_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_TV_TIME, __dataOut);
    }
    if (null == this.TV_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_RATE, __dataOut);
    }
    if (null == this.TV_OCCUPY_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_OCCUPY_RATE, __dataOut);
    }
    if (null == this.TV_ARRIVAL_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_ARRIVAL_RATE, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_CODE==null?"null":STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_NAME==null?"null":STD_CHANNEL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_CODE==null?"null":STD_TIMES_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_NAME==null?"null":STD_TIMES_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":TV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_TIME==null?"null":TV_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_TV_TIME==null?"null":AVG_TV_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_RATE==null?"null":TV_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_OCCUPY_RATE==null?"null":TV_OCCUPY_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_ARRIVAL_RATE==null?"null":TV_ARRIVAL_RATE.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_CODE==null?"null":STD_CHANNEL_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_CHANNEL_NAME==null?"null":STD_CHANNEL_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_CODE==null?"null":STD_TIMES_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_TIMES_NAME==null?"null":STD_TIMES_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":TV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_TIME==null?"null":TV_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_TV_TIME==null?"null":AVG_TV_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_RATE==null?"null":TV_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_OCCUPY_RATE==null?"null":TV_OCCUPY_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_ARRIVAL_RATE==null?"null":TV_ARRIVAL_RATE.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_CODE = null; } else {
      this.STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_NAME = null; } else {
      this.STD_CHANNEL_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_TIME = null; } else {
      this.TV_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_TV_TIME = null; } else {
      this.AVG_TV_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_RATE = null; } else {
      this.TV_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_OCCUPY_RATE = null; } else {
      this.TV_OCCUPY_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_ARRIVAL_RATE = null; } else {
      this.TV_ARRIVAL_RATE = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_CODE = null; } else {
      this.STD_CHANNEL_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_CHANNEL_NAME = null; } else {
      this.STD_CHANNEL_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_TIME = null; } else {
      this.TV_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_TV_TIME = null; } else {
      this.AVG_TV_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_RATE = null; } else {
      this.TV_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_OCCUPY_RATE = null; } else {
      this.TV_OCCUPY_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_ARRIVAL_RATE = null; } else {
      this.TV_ARRIVAL_RATE = new java.math.BigDecimal(__cur_str);
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
    ST_TV_DIFF_TIME_CHANNEL_VIEW_D o = (ST_TV_DIFF_TIME_CHANNEL_VIEW_D) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_TV_DIFF_TIME_CHANNEL_VIEW_D o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("STD_CHANNEL_CODE", this.STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_NAME", this.STD_CHANNEL_NAME);
    __sqoop$field_map.put("STD_TIMES_CODE", this.STD_TIMES_CODE);
    __sqoop$field_map.put("STD_TIMES_NAME", this.STD_TIMES_NAME);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("TV_TIME", this.TV_TIME);
    __sqoop$field_map.put("AVG_TV_TIME", this.AVG_TV_TIME);
    __sqoop$field_map.put("TV_RATE", this.TV_RATE);
    __sqoop$field_map.put("TV_OCCUPY_RATE", this.TV_OCCUPY_RATE);
    __sqoop$field_map.put("TV_ARRIVAL_RATE", this.TV_ARRIVAL_RATE);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("STD_CHANNEL_CODE", this.STD_CHANNEL_CODE);
    __sqoop$field_map.put("STD_CHANNEL_NAME", this.STD_CHANNEL_NAME);
    __sqoop$field_map.put("STD_TIMES_CODE", this.STD_TIMES_CODE);
    __sqoop$field_map.put("STD_TIMES_NAME", this.STD_TIMES_NAME);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("TV_TIME", this.TV_TIME);
    __sqoop$field_map.put("AVG_TV_TIME", this.AVG_TV_TIME);
    __sqoop$field_map.put("TV_RATE", this.TV_RATE);
    __sqoop$field_map.put("TV_OCCUPY_RATE", this.TV_OCCUPY_RATE);
    __sqoop$field_map.put("TV_ARRIVAL_RATE", this.TV_ARRIVAL_RATE);
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
    else    if ("STD_CHANNEL_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_CODE = (String) __fieldVal;
    }
    else    if ("STD_CHANNEL_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_NAME = (String) __fieldVal;
    }
    else    if ("STD_TIMES_CODE".equals(__fieldName)) {
      this.STD_TIMES_CODE = (String) __fieldVal;
    }
    else    if ("STD_TIMES_NAME".equals(__fieldName)) {
      this.STD_TIMES_NAME = (String) __fieldVal;
    }
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TV_TIME".equals(__fieldName)) {
      this.TV_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AVG_TV_TIME".equals(__fieldName)) {
      this.AVG_TV_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TV_RATE".equals(__fieldName)) {
      this.TV_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TV_OCCUPY_RATE".equals(__fieldName)) {
      this.TV_OCCUPY_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TV_ARRIVAL_RATE".equals(__fieldName)) {
      this.TV_ARRIVAL_RATE = (java.math.BigDecimal) __fieldVal;
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
    else    if ("STD_CHANNEL_CODE".equals(__fieldName)) {
      this.STD_CHANNEL_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_CHANNEL_NAME".equals(__fieldName)) {
      this.STD_CHANNEL_NAME = (String) __fieldVal;
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
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TV_TIME".equals(__fieldName)) {
      this.TV_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AVG_TV_TIME".equals(__fieldName)) {
      this.AVG_TV_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TV_RATE".equals(__fieldName)) {
      this.TV_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TV_OCCUPY_RATE".equals(__fieldName)) {
      this.TV_OCCUPY_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TV_ARRIVAL_RATE".equals(__fieldName)) {
      this.TV_ARRIVAL_RATE = (java.math.BigDecimal) __fieldVal;
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
