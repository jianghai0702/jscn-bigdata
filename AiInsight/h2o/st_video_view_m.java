// ORM class for table 'st_video_view_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 19:43:54 CST 2018
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

public class st_video_view_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_video_view_m with_CYCLE_ID(String CYCLE_ID) {
    this.CYCLE_ID = CYCLE_ID;
    return this;
  }
  private String REGION_NAME;
  public String get_REGION_NAME() {
    return REGION_NAME;
  }
  public void set_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
  }
  public st_video_view_m with_REGION_NAME(String REGION_NAME) {
    this.REGION_NAME = REGION_NAME;
    return this;
  }
  private java.math.BigDecimal BUFFER_TIME;
  public java.math.BigDecimal get_BUFFER_TIME() {
    return BUFFER_TIME;
  }
  public void set_BUFFER_TIME(java.math.BigDecimal BUFFER_TIME) {
    this.BUFFER_TIME = BUFFER_TIME;
  }
  public st_video_view_m with_BUFFER_TIME(java.math.BigDecimal BUFFER_TIME) {
    this.BUFFER_TIME = BUFFER_TIME;
    return this;
  }
  private java.math.BigDecimal FIRST_BUFFER_TIME;
  public java.math.BigDecimal get_FIRST_BUFFER_TIME() {
    return FIRST_BUFFER_TIME;
  }
  public void set_FIRST_BUFFER_TIME(java.math.BigDecimal FIRST_BUFFER_TIME) {
    this.FIRST_BUFFER_TIME = FIRST_BUFFER_TIME;
  }
  public st_video_view_m with_FIRST_BUFFER_TIME(java.math.BigDecimal FIRST_BUFFER_TIME) {
    this.FIRST_BUFFER_TIME = FIRST_BUFFER_TIME;
    return this;
  }
  private java.math.BigDecimal BUFFER_COUNT;
  public java.math.BigDecimal get_BUFFER_COUNT() {
    return BUFFER_COUNT;
  }
  public void set_BUFFER_COUNT(java.math.BigDecimal BUFFER_COUNT) {
    this.BUFFER_COUNT = BUFFER_COUNT;
  }
  public st_video_view_m with_BUFFER_COUNT(java.math.BigDecimal BUFFER_COUNT) {
    this.BUFFER_COUNT = BUFFER_COUNT;
    return this;
  }
  private java.math.BigDecimal DOWNLOAD_SPEED;
  public java.math.BigDecimal get_DOWNLOAD_SPEED() {
    return DOWNLOAD_SPEED;
  }
  public void set_DOWNLOAD_SPEED(java.math.BigDecimal DOWNLOAD_SPEED) {
    this.DOWNLOAD_SPEED = DOWNLOAD_SPEED;
  }
  public st_video_view_m with_DOWNLOAD_SPEED(java.math.BigDecimal DOWNLOAD_SPEED) {
    this.DOWNLOAD_SPEED = DOWNLOAD_SPEED;
    return this;
  }
  private java.math.BigDecimal MONITOR_COUNT;
  public java.math.BigDecimal get_MONITOR_COUNT() {
    return MONITOR_COUNT;
  }
  public void set_MONITOR_COUNT(java.math.BigDecimal MONITOR_COUNT) {
    this.MONITOR_COUNT = MONITOR_COUNT;
  }
  public st_video_view_m with_MONITOR_COUNT(java.math.BigDecimal MONITOR_COUNT) {
    this.MONITOR_COUNT = MONITOR_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_video_view_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private java.math.BigDecimal PAGE_FIRST_PKG_TIME;
  public java.math.BigDecimal get_PAGE_FIRST_PKG_TIME() {
    return PAGE_FIRST_PKG_TIME;
  }
  public void set_PAGE_FIRST_PKG_TIME(java.math.BigDecimal PAGE_FIRST_PKG_TIME) {
    this.PAGE_FIRST_PKG_TIME = PAGE_FIRST_PKG_TIME;
  }
  public st_video_view_m with_PAGE_FIRST_PKG_TIME(java.math.BigDecimal PAGE_FIRST_PKG_TIME) {
    this.PAGE_FIRST_PKG_TIME = PAGE_FIRST_PKG_TIME;
    return this;
  }
  private java.math.BigDecimal PAGE_FIRST_SCREEN_TIME;
  public java.math.BigDecimal get_PAGE_FIRST_SCREEN_TIME() {
    return PAGE_FIRST_SCREEN_TIME;
  }
  public void set_PAGE_FIRST_SCREEN_TIME(java.math.BigDecimal PAGE_FIRST_SCREEN_TIME) {
    this.PAGE_FIRST_SCREEN_TIME = PAGE_FIRST_SCREEN_TIME;
  }
  public st_video_view_m with_PAGE_FIRST_SCREEN_TIME(java.math.BigDecimal PAGE_FIRST_SCREEN_TIME) {
    this.PAGE_FIRST_SCREEN_TIME = PAGE_FIRST_SCREEN_TIME;
    return this;
  }
  private java.math.BigDecimal VIDEO_FIRST_PKG_TIME;
  public java.math.BigDecimal get_VIDEO_FIRST_PKG_TIME() {
    return VIDEO_FIRST_PKG_TIME;
  }
  public void set_VIDEO_FIRST_PKG_TIME(java.math.BigDecimal VIDEO_FIRST_PKG_TIME) {
    this.VIDEO_FIRST_PKG_TIME = VIDEO_FIRST_PKG_TIME;
  }
  public st_video_view_m with_VIDEO_FIRST_PKG_TIME(java.math.BigDecimal VIDEO_FIRST_PKG_TIME) {
    this.VIDEO_FIRST_PKG_TIME = VIDEO_FIRST_PKG_TIME;
    return this;
  }
  private String PT_MON;
  public String get_PT_MON() {
    return PT_MON;
  }
  public void set_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
  }
  public st_video_view_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_video_view_m)) {
      return false;
    }
    st_video_view_m that = (st_video_view_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.BUFFER_TIME == null ? that.BUFFER_TIME == null : this.BUFFER_TIME.equals(that.BUFFER_TIME));
    equal = equal && (this.FIRST_BUFFER_TIME == null ? that.FIRST_BUFFER_TIME == null : this.FIRST_BUFFER_TIME.equals(that.FIRST_BUFFER_TIME));
    equal = equal && (this.BUFFER_COUNT == null ? that.BUFFER_COUNT == null : this.BUFFER_COUNT.equals(that.BUFFER_COUNT));
    equal = equal && (this.DOWNLOAD_SPEED == null ? that.DOWNLOAD_SPEED == null : this.DOWNLOAD_SPEED.equals(that.DOWNLOAD_SPEED));
    equal = equal && (this.MONITOR_COUNT == null ? that.MONITOR_COUNT == null : this.MONITOR_COUNT.equals(that.MONITOR_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PAGE_FIRST_PKG_TIME == null ? that.PAGE_FIRST_PKG_TIME == null : this.PAGE_FIRST_PKG_TIME.equals(that.PAGE_FIRST_PKG_TIME));
    equal = equal && (this.PAGE_FIRST_SCREEN_TIME == null ? that.PAGE_FIRST_SCREEN_TIME == null : this.PAGE_FIRST_SCREEN_TIME.equals(that.PAGE_FIRST_SCREEN_TIME));
    equal = equal && (this.VIDEO_FIRST_PKG_TIME == null ? that.VIDEO_FIRST_PKG_TIME == null : this.VIDEO_FIRST_PKG_TIME.equals(that.VIDEO_FIRST_PKG_TIME));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_video_view_m)) {
      return false;
    }
    st_video_view_m that = (st_video_view_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.REGION_NAME == null ? that.REGION_NAME == null : this.REGION_NAME.equals(that.REGION_NAME));
    equal = equal && (this.BUFFER_TIME == null ? that.BUFFER_TIME == null : this.BUFFER_TIME.equals(that.BUFFER_TIME));
    equal = equal && (this.FIRST_BUFFER_TIME == null ? that.FIRST_BUFFER_TIME == null : this.FIRST_BUFFER_TIME.equals(that.FIRST_BUFFER_TIME));
    equal = equal && (this.BUFFER_COUNT == null ? that.BUFFER_COUNT == null : this.BUFFER_COUNT.equals(that.BUFFER_COUNT));
    equal = equal && (this.DOWNLOAD_SPEED == null ? that.DOWNLOAD_SPEED == null : this.DOWNLOAD_SPEED.equals(that.DOWNLOAD_SPEED));
    equal = equal && (this.MONITOR_COUNT == null ? that.MONITOR_COUNT == null : this.MONITOR_COUNT.equals(that.MONITOR_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PAGE_FIRST_PKG_TIME == null ? that.PAGE_FIRST_PKG_TIME == null : this.PAGE_FIRST_PKG_TIME.equals(that.PAGE_FIRST_PKG_TIME));
    equal = equal && (this.PAGE_FIRST_SCREEN_TIME == null ? that.PAGE_FIRST_SCREEN_TIME == null : this.PAGE_FIRST_SCREEN_TIME.equals(that.PAGE_FIRST_SCREEN_TIME));
    equal = equal && (this.VIDEO_FIRST_PKG_TIME == null ? that.VIDEO_FIRST_PKG_TIME == null : this.VIDEO_FIRST_PKG_TIME.equals(that.VIDEO_FIRST_PKG_TIME));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.BUFFER_TIME = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FIRST_BUFFER_TIME = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BUFFER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DOWNLOAD_SPEED = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.MONITOR_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.PAGE_FIRST_PKG_TIME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.PAGE_FIRST_SCREEN_TIME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VIDEO_FIRST_PKG_TIME = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.REGION_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.BUFFER_TIME = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FIRST_BUFFER_TIME = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BUFFER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DOWNLOAD_SPEED = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.MONITOR_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.PAGE_FIRST_PKG_TIME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.PAGE_FIRST_SCREEN_TIME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VIDEO_FIRST_PKG_TIME = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(12, __dbResults);
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
    JdbcWritableBridge.writeString(REGION_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUFFER_TIME, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FIRST_BUFFER_TIME, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUFFER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOWNLOAD_SPEED, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAGE_FIRST_PKG_TIME, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAGE_FIRST_SCREEN_TIME, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VIDEO_FIRST_PKG_TIME, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 12 + __off, 1, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGION_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUFFER_TIME, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FIRST_BUFFER_TIME, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUFFER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOWNLOAD_SPEED, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MONITOR_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAGE_FIRST_PKG_TIME, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAGE_FIRST_SCREEN_TIME, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VIDEO_FIRST_PKG_TIME, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 12 + __off, 1, __dbStmt);
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
        this.REGION_NAME = null;
    } else {
    this.REGION_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUFFER_TIME = null;
    } else {
    this.BUFFER_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FIRST_BUFFER_TIME = null;
    } else {
    this.FIRST_BUFFER_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUFFER_COUNT = null;
    } else {
    this.BUFFER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOWNLOAD_SPEED = null;
    } else {
    this.DOWNLOAD_SPEED = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MONITOR_COUNT = null;
    } else {
    this.MONITOR_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PAGE_FIRST_PKG_TIME = null;
    } else {
    this.PAGE_FIRST_PKG_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAGE_FIRST_SCREEN_TIME = null;
    } else {
    this.PAGE_FIRST_SCREEN_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VIDEO_FIRST_PKG_TIME = null;
    } else {
    this.VIDEO_FIRST_PKG_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.BUFFER_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUFFER_TIME, __dataOut);
    }
    if (null == this.FIRST_BUFFER_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FIRST_BUFFER_TIME, __dataOut);
    }
    if (null == this.BUFFER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUFFER_COUNT, __dataOut);
    }
    if (null == this.DOWNLOAD_SPEED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOWNLOAD_SPEED, __dataOut);
    }
    if (null == this.MONITOR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_COUNT, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.PAGE_FIRST_PKG_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAGE_FIRST_PKG_TIME, __dataOut);
    }
    if (null == this.PAGE_FIRST_SCREEN_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAGE_FIRST_SCREEN_TIME, __dataOut);
    }
    if (null == this.VIDEO_FIRST_PKG_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VIDEO_FIRST_PKG_TIME, __dataOut);
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
    if (null == this.REGION_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION_NAME);
    }
    if (null == this.BUFFER_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUFFER_TIME, __dataOut);
    }
    if (null == this.FIRST_BUFFER_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FIRST_BUFFER_TIME, __dataOut);
    }
    if (null == this.BUFFER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUFFER_COUNT, __dataOut);
    }
    if (null == this.DOWNLOAD_SPEED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOWNLOAD_SPEED, __dataOut);
    }
    if (null == this.MONITOR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MONITOR_COUNT, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
    }
    if (null == this.PAGE_FIRST_PKG_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAGE_FIRST_PKG_TIME, __dataOut);
    }
    if (null == this.PAGE_FIRST_SCREEN_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAGE_FIRST_SCREEN_TIME, __dataOut);
    }
    if (null == this.VIDEO_FIRST_PKG_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VIDEO_FIRST_PKG_TIME, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(REGION_NAME==null?"null":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUFFER_TIME==null?"null":BUFFER_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_BUFFER_TIME==null?"null":FIRST_BUFFER_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUFFER_COUNT==null?"null":BUFFER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOWNLOAD_SPEED==null?"null":DOWNLOAD_SPEED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_COUNT==null?"null":MONITOR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAGE_FIRST_PKG_TIME==null?"null":PAGE_FIRST_PKG_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAGE_FIRST_SCREEN_TIME==null?"null":PAGE_FIRST_SCREEN_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VIDEO_FIRST_PKG_TIME==null?"null":VIDEO_FIRST_PKG_TIME.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(REGION_NAME==null?"null":REGION_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUFFER_TIME==null?"null":BUFFER_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_BUFFER_TIME==null?"null":FIRST_BUFFER_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUFFER_COUNT==null?"null":BUFFER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOWNLOAD_SPEED==null?"null":DOWNLOAD_SPEED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MONITOR_COUNT==null?"null":MONITOR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAGE_FIRST_PKG_TIME==null?"null":PAGE_FIRST_PKG_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAGE_FIRST_SCREEN_TIME==null?"null":PAGE_FIRST_SCREEN_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VIDEO_FIRST_PKG_TIME==null?"null":VIDEO_FIRST_PKG_TIME.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BUFFER_TIME = null; } else {
      this.BUFFER_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FIRST_BUFFER_TIME = null; } else {
      this.FIRST_BUFFER_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BUFFER_COUNT = null; } else {
      this.BUFFER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOWNLOAD_SPEED = null; } else {
      this.DOWNLOAD_SPEED = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_COUNT = null; } else {
      this.MONITOR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAGE_FIRST_PKG_TIME = null; } else {
      this.PAGE_FIRST_PKG_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAGE_FIRST_SCREEN_TIME = null; } else {
      this.PAGE_FIRST_SCREEN_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VIDEO_FIRST_PKG_TIME = null; } else {
      this.VIDEO_FIRST_PKG_TIME = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.REGION_NAME = null; } else {
      this.REGION_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BUFFER_TIME = null; } else {
      this.BUFFER_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FIRST_BUFFER_TIME = null; } else {
      this.FIRST_BUFFER_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BUFFER_COUNT = null; } else {
      this.BUFFER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOWNLOAD_SPEED = null; } else {
      this.DOWNLOAD_SPEED = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MONITOR_COUNT = null; } else {
      this.MONITOR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAGE_FIRST_PKG_TIME = null; } else {
      this.PAGE_FIRST_PKG_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAGE_FIRST_SCREEN_TIME = null; } else {
      this.PAGE_FIRST_SCREEN_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VIDEO_FIRST_PKG_TIME = null; } else {
      this.VIDEO_FIRST_PKG_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PT_MON = null; } else {
      this.PT_MON = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    st_video_view_m o = (st_video_view_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_video_view_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("BUFFER_TIME", this.BUFFER_TIME);
    __sqoop$field_map.put("FIRST_BUFFER_TIME", this.FIRST_BUFFER_TIME);
    __sqoop$field_map.put("BUFFER_COUNT", this.BUFFER_COUNT);
    __sqoop$field_map.put("DOWNLOAD_SPEED", this.DOWNLOAD_SPEED);
    __sqoop$field_map.put("MONITOR_COUNT", this.MONITOR_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PAGE_FIRST_PKG_TIME", this.PAGE_FIRST_PKG_TIME);
    __sqoop$field_map.put("PAGE_FIRST_SCREEN_TIME", this.PAGE_FIRST_SCREEN_TIME);
    __sqoop$field_map.put("VIDEO_FIRST_PKG_TIME", this.VIDEO_FIRST_PKG_TIME);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("REGION_NAME", this.REGION_NAME);
    __sqoop$field_map.put("BUFFER_TIME", this.BUFFER_TIME);
    __sqoop$field_map.put("FIRST_BUFFER_TIME", this.FIRST_BUFFER_TIME);
    __sqoop$field_map.put("BUFFER_COUNT", this.BUFFER_COUNT);
    __sqoop$field_map.put("DOWNLOAD_SPEED", this.DOWNLOAD_SPEED);
    __sqoop$field_map.put("MONITOR_COUNT", this.MONITOR_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PAGE_FIRST_PKG_TIME", this.PAGE_FIRST_PKG_TIME);
    __sqoop$field_map.put("PAGE_FIRST_SCREEN_TIME", this.PAGE_FIRST_SCREEN_TIME);
    __sqoop$field_map.put("VIDEO_FIRST_PKG_TIME", this.VIDEO_FIRST_PKG_TIME);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CYCLE_ID".equals(__fieldName)) {
      this.CYCLE_ID = (String) __fieldVal;
    }
    else    if ("REGION_NAME".equals(__fieldName)) {
      this.REGION_NAME = (String) __fieldVal;
    }
    else    if ("BUFFER_TIME".equals(__fieldName)) {
      this.BUFFER_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FIRST_BUFFER_TIME".equals(__fieldName)) {
      this.FIRST_BUFFER_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BUFFER_COUNT".equals(__fieldName)) {
      this.BUFFER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOWNLOAD_SPEED".equals(__fieldName)) {
      this.DOWNLOAD_SPEED = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MONITOR_COUNT".equals(__fieldName)) {
      this.MONITOR_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("PAGE_FIRST_PKG_TIME".equals(__fieldName)) {
      this.PAGE_FIRST_PKG_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAGE_FIRST_SCREEN_TIME".equals(__fieldName)) {
      this.PAGE_FIRST_SCREEN_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VIDEO_FIRST_PKG_TIME".equals(__fieldName)) {
      this.VIDEO_FIRST_PKG_TIME = (java.math.BigDecimal) __fieldVal;
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
    else    if ("REGION_NAME".equals(__fieldName)) {
      this.REGION_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("BUFFER_TIME".equals(__fieldName)) {
      this.BUFFER_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FIRST_BUFFER_TIME".equals(__fieldName)) {
      this.FIRST_BUFFER_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BUFFER_COUNT".equals(__fieldName)) {
      this.BUFFER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOWNLOAD_SPEED".equals(__fieldName)) {
      this.DOWNLOAD_SPEED = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MONITOR_COUNT".equals(__fieldName)) {
      this.MONITOR_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("PAGE_FIRST_PKG_TIME".equals(__fieldName)) {
      this.PAGE_FIRST_PKG_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAGE_FIRST_SCREEN_TIME".equals(__fieldName)) {
      this.PAGE_FIRST_SCREEN_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VIDEO_FIRST_PKG_TIME".equals(__fieldName)) {
      this.VIDEO_FIRST_PKG_TIME = (java.math.BigDecimal) __fieldVal;
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
