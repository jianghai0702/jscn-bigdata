// ORM class for table 'ST_DIFF_TIME_CHANNELGROUP_VIEW_D'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 14 14:18:08 CST 2018
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

public class ST_DIFF_TIME_CHANNELGROUP_VIEW_D extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String std_channel_group_code;
  public String get_std_channel_group_code() {
    return std_channel_group_code;
  }
  public void set_std_channel_group_code(String std_channel_group_code) {
    this.std_channel_group_code = std_channel_group_code;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_std_channel_group_code(String std_channel_group_code) {
    this.std_channel_group_code = std_channel_group_code;
    return this;
  }
  private String std_channel_group_name;
  public String get_std_channel_group_name() {
    return std_channel_group_name;
  }
  public void set_std_channel_group_name(String std_channel_group_name) {
    this.std_channel_group_name = std_channel_group_name;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_std_channel_group_name(String std_channel_group_name) {
    this.std_channel_group_name = std_channel_group_name;
    return this;
  }
  private java.math.BigDecimal duration_id;
  public java.math.BigDecimal get_duration_id() {
    return duration_id;
  }
  public void set_duration_id(java.math.BigDecimal duration_id) {
    this.duration_id = duration_id;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_duration_id(java.math.BigDecimal duration_id) {
    this.duration_id = duration_id;
    return this;
  }
  private String duration_name;
  public String get_duration_name() {
    return duration_name;
  }
  public void set_duration_name(String duration_name) {
    this.duration_name = duration_name;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_duration_name(String duration_name) {
    this.duration_name = duration_name;
    return this;
  }
  private java.math.BigDecimal tv_time;
  public java.math.BigDecimal get_tv_time() {
    return tv_time;
  }
  public void set_tv_time(java.math.BigDecimal tv_time) {
    this.tv_time = tv_time;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_tv_time(java.math.BigDecimal tv_time) {
    this.tv_time = tv_time;
    return this;
  }
  private java.math.BigDecimal all_tv_time;
  public java.math.BigDecimal get_all_tv_time() {
    return all_tv_time;
  }
  public void set_all_tv_time(java.math.BigDecimal all_tv_time) {
    this.all_tv_time = all_tv_time;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_all_tv_time(java.math.BigDecimal all_tv_time) {
    this.all_tv_time = all_tv_time;
    return this;
  }
  private java.math.BigDecimal tv_occupy_rate;
  public java.math.BigDecimal get_tv_occupy_rate() {
    return tv_occupy_rate;
  }
  public void set_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
    this.tv_occupy_rate = tv_occupy_rate;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
    this.tv_occupy_rate = tv_occupy_rate;
    return this;
  }
  private java.math.BigDecimal tv_rate;
  public java.math.BigDecimal get_tv_rate() {
    return tv_rate;
  }
  public void set_tv_rate(java.math.BigDecimal tv_rate) {
    this.tv_rate = tv_rate;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_tv_rate(java.math.BigDecimal tv_rate) {
    this.tv_rate = tv_rate;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_DIFF_TIME_CHANNELGROUP_VIEW_D with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DIFF_TIME_CHANNELGROUP_VIEW_D)) {
      return false;
    }
    ST_DIFF_TIME_CHANNELGROUP_VIEW_D that = (ST_DIFF_TIME_CHANNELGROUP_VIEW_D) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DIFF_TIME_CHANNELGROUP_VIEW_D)) {
      return false;
    }
    ST_DIFF_TIME_CHANNELGROUP_VIEW_D that = (ST_DIFF_TIME_CHANNELGROUP_VIEW_D) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(7, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(7, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(13, __dbResults);
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
    JdbcWritableBridge.writeString(std_channel_group_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 13 + __off, 12, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 13 + __off, 12, __dbStmt);
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
        this.std_channel_group_code = null;
    } else {
    this.std_channel_group_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_channel_group_name = null;
    } else {
    this.std_channel_group_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.duration_id = null;
    } else {
    this.duration_id = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.duration_name = null;
    } else {
    this.duration_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tv_time = null;
    } else {
    this.tv_time = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.all_tv_time = null;
    } else {
    this.all_tv_time = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tv_occupy_rate = null;
    } else {
    this.tv_occupy_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tv_rate = null;
    } else {
    this.tv_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.std_channel_group_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_group_code);
    }
    if (null == this.std_channel_group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_group_name);
    }
    if (null == this.duration_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.duration_id, __dataOut);
    }
    if (null == this.duration_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, duration_name);
    }
    if (null == this.tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_time, __dataOut);
    }
    if (null == this.all_tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.all_tv_time, __dataOut);
    }
    if (null == this.tv_occupy_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_occupy_rate, __dataOut);
    }
    if (null == this.tv_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_rate, __dataOut);
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
    if (null == this.std_channel_group_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_group_code);
    }
    if (null == this.std_channel_group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_group_name);
    }
    if (null == this.duration_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.duration_id, __dataOut);
    }
    if (null == this.duration_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, duration_name);
    }
    if (null == this.tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_time, __dataOut);
    }
    if (null == this.all_tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.all_tv_time, __dataOut);
    }
    if (null == this.tv_occupy_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_occupy_rate, __dataOut);
    }
    if (null == this.tv_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_code==null?"null":std_channel_group_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_name==null?"null":std_channel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_id==null?"null":duration_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_name==null?"null":duration_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_time==null?"null":tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_tv_time==null?"null":all_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_code==null?"null":std_channel_group_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_name==null?"null":std_channel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_id==null?"null":duration_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_name==null?"null":duration_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_time==null?"null":tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_tv_time==null?"null":all_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.std_channel_group_code = null; } else {
      this.std_channel_group_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_channel_group_name = null; } else {
      this.std_channel_group_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.duration_id = null; } else {
      this.duration_id = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.duration_name = null; } else {
      this.duration_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_time = null; } else {
      this.tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.all_tv_time = null; } else {
      this.all_tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_occupy_rate = null; } else {
      this.tv_occupy_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_rate = null; } else {
      this.tv_rate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.std_channel_group_code = null; } else {
      this.std_channel_group_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_channel_group_name = null; } else {
      this.std_channel_group_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.duration_id = null; } else {
      this.duration_id = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.duration_name = null; } else {
      this.duration_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_time = null; } else {
      this.tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.all_tv_time = null; } else {
      this.all_tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_occupy_rate = null; } else {
      this.tv_occupy_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_rate = null; } else {
      this.tv_rate = new java.math.BigDecimal(__cur_str);
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
    ST_DIFF_TIME_CHANNELGROUP_VIEW_D o = (ST_DIFF_TIME_CHANNELGROUP_VIEW_D) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_DIFF_TIME_CHANNELGROUP_VIEW_D o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
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
    else    if ("std_channel_group_code".equals(__fieldName)) {
      this.std_channel_group_code = (String) __fieldVal;
    }
    else    if ("std_channel_group_name".equals(__fieldName)) {
      this.std_channel_group_name = (String) __fieldVal;
    }
    else    if ("duration_id".equals(__fieldName)) {
      this.duration_id = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("duration_name".equals(__fieldName)) {
      this.duration_name = (String) __fieldVal;
    }
    else    if ("tv_time".equals(__fieldName)) {
      this.tv_time = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("all_tv_time".equals(__fieldName)) {
      this.all_tv_time = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tv_occupy_rate".equals(__fieldName)) {
      this.tv_occupy_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tv_rate".equals(__fieldName)) {
      this.tv_rate = (java.math.BigDecimal) __fieldVal;
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
    else    if ("std_channel_group_code".equals(__fieldName)) {
      this.std_channel_group_code = (String) __fieldVal;
      return true;
    }
    else    if ("std_channel_group_name".equals(__fieldName)) {
      this.std_channel_group_name = (String) __fieldVal;
      return true;
    }
    else    if ("duration_id".equals(__fieldName)) {
      this.duration_id = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("duration_name".equals(__fieldName)) {
      this.duration_name = (String) __fieldVal;
      return true;
    }
    else    if ("tv_time".equals(__fieldName)) {
      this.tv_time = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("all_tv_time".equals(__fieldName)) {
      this.all_tv_time = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tv_occupy_rate".equals(__fieldName)) {
      this.tv_occupy_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("tv_rate".equals(__fieldName)) {
      this.tv_rate = (java.math.BigDecimal) __fieldVal;
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
