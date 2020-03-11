// ORM class for table 'st_diff_duration_channel_view_d'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 12 12:18:53 CST 2018
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

public class st_diff_duration_channel_view_d extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String cycle_id;
  public String get_cycle_id() {
    return cycle_id;
  }
  public void set_cycle_id(String cycle_id) {
    this.cycle_id = cycle_id;
  }
  public st_diff_duration_channel_view_d with_cycle_id(String cycle_id) {
    this.cycle_id = cycle_id;
    return this;
  }
  private String own_corp_std_org_code;
  public String get_own_corp_std_org_code() {
    return own_corp_std_org_code;
  }
  public void set_own_corp_std_org_code(String own_corp_std_org_code) {
    this.own_corp_std_org_code = own_corp_std_org_code;
  }
  public st_diff_duration_channel_view_d with_own_corp_std_org_code(String own_corp_std_org_code) {
    this.own_corp_std_org_code = own_corp_std_org_code;
    return this;
  }
  private String own_corp_std_org_name;
  public String get_own_corp_std_org_name() {
    return own_corp_std_org_name;
  }
  public void set_own_corp_std_org_name(String own_corp_std_org_name) {
    this.own_corp_std_org_name = own_corp_std_org_name;
  }
  public st_diff_duration_channel_view_d with_own_corp_std_org_name(String own_corp_std_org_name) {
    this.own_corp_std_org_name = own_corp_std_org_name;
    return this;
  }
  private String std_channel_group_code;
  public String get_std_channel_group_code() {
    return std_channel_group_code;
  }
  public void set_std_channel_group_code(String std_channel_group_code) {
    this.std_channel_group_code = std_channel_group_code;
  }
  public st_diff_duration_channel_view_d with_std_channel_group_code(String std_channel_group_code) {
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
  public st_diff_duration_channel_view_d with_std_channel_group_name(String std_channel_group_name) {
    this.std_channel_group_name = std_channel_group_name;
    return this;
  }
  private String std_channel_name;
  public String get_std_channel_name() {
    return std_channel_name;
  }
  public void set_std_channel_name(String std_channel_name) {
    this.std_channel_name = std_channel_name;
  }
  public st_diff_duration_channel_view_d with_std_channel_name(String std_channel_name) {
    this.std_channel_name = std_channel_name;
    return this;
  }
  private java.math.BigDecimal duration_id;
  public java.math.BigDecimal get_duration_id() {
    return duration_id;
  }
  public void set_duration_id(java.math.BigDecimal duration_id) {
    this.duration_id = duration_id;
  }
  public st_diff_duration_channel_view_d with_duration_id(java.math.BigDecimal duration_id) {
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
  public st_diff_duration_channel_view_d with_duration_name(String duration_name) {
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
  public st_diff_duration_channel_view_d with_tv_time(java.math.BigDecimal tv_time) {
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
  public st_diff_duration_channel_view_d with_all_tv_time(java.math.BigDecimal all_tv_time) {
    this.all_tv_time = all_tv_time;
    return this;
  }
  private java.math.BigDecimal tv_user_count;
  public java.math.BigDecimal get_tv_user_count() {
    return tv_user_count;
  }
  public void set_tv_user_count(java.math.BigDecimal tv_user_count) {
    this.tv_user_count = tv_user_count;
  }
  public st_diff_duration_channel_view_d with_tv_user_count(java.math.BigDecimal tv_user_count) {
    this.tv_user_count = tv_user_count;
    return this;
  }
  private java.math.BigDecimal total_user_count;
  public java.math.BigDecimal get_total_user_count() {
    return total_user_count;
  }
  public void set_total_user_count(java.math.BigDecimal total_user_count) {
    this.total_user_count = total_user_count;
  }
  public st_diff_duration_channel_view_d with_total_user_count(java.math.BigDecimal total_user_count) {
    this.total_user_count = total_user_count;
    return this;
  }
  private java.math.BigDecimal tv_occupy_rate;
  public java.math.BigDecimal get_tv_occupy_rate() {
    return tv_occupy_rate;
  }
  public void set_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
    this.tv_occupy_rate = tv_occupy_rate;
  }
  public st_diff_duration_channel_view_d with_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
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
  public st_diff_duration_channel_view_d with_tv_rate(java.math.BigDecimal tv_rate) {
    this.tv_rate = tv_rate;
    return this;
  }
  private java.math.BigDecimal tv_arrival_rate;
  public java.math.BigDecimal get_tv_arrival_rate() {
    return tv_arrival_rate;
  }
  public void set_tv_arrival_rate(java.math.BigDecimal tv_arrival_rate) {
    this.tv_arrival_rate = tv_arrival_rate;
  }
  public st_diff_duration_channel_view_d with_tv_arrival_rate(java.math.BigDecimal tv_arrival_rate) {
    this.tv_arrival_rate = tv_arrival_rate;
    return this;
  }
  private java.math.BigDecimal avg_tv_time;
  public java.math.BigDecimal get_avg_tv_time() {
    return avg_tv_time;
  }
  public void set_avg_tv_time(java.math.BigDecimal avg_tv_time) {
    this.avg_tv_time = avg_tv_time;
  }
  public st_diff_duration_channel_view_d with_avg_tv_time(java.math.BigDecimal avg_tv_time) {
    this.avg_tv_time = avg_tv_time;
    return this;
  }
  private java.math.BigDecimal loyalty_rate;
  public java.math.BigDecimal get_loyalty_rate() {
    return loyalty_rate;
  }
  public void set_loyalty_rate(java.math.BigDecimal loyalty_rate) {
    this.loyalty_rate = loyalty_rate;
  }
  public st_diff_duration_channel_view_d with_loyalty_rate(java.math.BigDecimal loyalty_rate) {
    this.loyalty_rate = loyalty_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_duration_channel_view_d)) {
      return false;
    }
    st_diff_duration_channel_view_d that = (st_diff_duration_channel_view_d) o;
    boolean equal = true;
    equal = equal && (this.cycle_id == null ? that.cycle_id == null : this.cycle_id.equals(that.cycle_id));
    equal = equal && (this.own_corp_std_org_code == null ? that.own_corp_std_org_code == null : this.own_corp_std_org_code.equals(that.own_corp_std_org_code));
    equal = equal && (this.own_corp_std_org_name == null ? that.own_corp_std_org_name == null : this.own_corp_std_org_name.equals(that.own_corp_std_org_name));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.std_channel_name == null ? that.std_channel_name == null : this.std_channel_name.equals(that.std_channel_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_user_count == null ? that.tv_user_count == null : this.tv_user_count.equals(that.tv_user_count));
    equal = equal && (this.total_user_count == null ? that.total_user_count == null : this.total_user_count.equals(that.total_user_count));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.tv_arrival_rate == null ? that.tv_arrival_rate == null : this.tv_arrival_rate.equals(that.tv_arrival_rate));
    equal = equal && (this.avg_tv_time == null ? that.avg_tv_time == null : this.avg_tv_time.equals(that.avg_tv_time));
    equal = equal && (this.loyalty_rate == null ? that.loyalty_rate == null : this.loyalty_rate.equals(that.loyalty_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_duration_channel_view_d)) {
      return false;
    }
    st_diff_duration_channel_view_d that = (st_diff_duration_channel_view_d) o;
    boolean equal = true;
    equal = equal && (this.cycle_id == null ? that.cycle_id == null : this.cycle_id.equals(that.cycle_id));
    equal = equal && (this.own_corp_std_org_code == null ? that.own_corp_std_org_code == null : this.own_corp_std_org_code.equals(that.own_corp_std_org_code));
    equal = equal && (this.own_corp_std_org_name == null ? that.own_corp_std_org_name == null : this.own_corp_std_org_name.equals(that.own_corp_std_org_name));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.std_channel_name == null ? that.std_channel_name == null : this.std_channel_name.equals(that.std_channel_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_user_count == null ? that.tv_user_count == null : this.tv_user_count.equals(that.tv_user_count));
    equal = equal && (this.total_user_count == null ? that.total_user_count == null : this.total_user_count.equals(that.total_user_count));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.tv_arrival_rate == null ? that.tv_arrival_rate == null : this.tv_arrival_rate.equals(that.tv_arrival_rate));
    equal = equal && (this.avg_tv_time == null ? that.avg_tv_time == null : this.avg_tv_time.equals(that.avg_tv_time));
    equal = equal && (this.loyalty_rate == null ? that.loyalty_rate == null : this.loyalty_rate.equals(that.loyalty_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cycle_id = JdbcWritableBridge.readString(1, __dbResults);
    this.own_corp_std_org_code = JdbcWritableBridge.readString(2, __dbResults);
    this.own_corp_std_org_name = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.std_channel_name = JdbcWritableBridge.readString(6, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(8, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tv_user_count = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.total_user_count = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.tv_arrival_rate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.avg_tv_time = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.loyalty_rate = JdbcWritableBridge.readBigDecimal(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cycle_id = JdbcWritableBridge.readString(1, __dbResults);
    this.own_corp_std_org_code = JdbcWritableBridge.readString(2, __dbResults);
    this.own_corp_std_org_name = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.std_channel_name = JdbcWritableBridge.readString(6, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(8, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.tv_user_count = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.total_user_count = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.tv_arrival_rate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.avg_tv_time = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.loyalty_rate = JdbcWritableBridge.readBigDecimal(17, __dbResults);
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
    JdbcWritableBridge.writeString(cycle_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(own_corp_std_org_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(own_corp_std_org_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_user_count, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total_user_count, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_arrival_rate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_tv_time, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(loyalty_rate, 17 + __off, 3, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cycle_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(own_corp_std_org_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(own_corp_std_org_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_user_count, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total_user_count, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_arrival_rate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_tv_time, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(loyalty_rate, 17 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.cycle_id = null;
    } else {
    this.cycle_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.own_corp_std_org_code = null;
    } else {
    this.own_corp_std_org_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.own_corp_std_org_name = null;
    } else {
    this.own_corp_std_org_name = Text.readString(__dataIn);
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
        this.std_channel_name = null;
    } else {
    this.std_channel_name = Text.readString(__dataIn);
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
        this.tv_user_count = null;
    } else {
    this.tv_user_count = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total_user_count = null;
    } else {
    this.total_user_count = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.tv_arrival_rate = null;
    } else {
    this.tv_arrival_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.avg_tv_time = null;
    } else {
    this.avg_tv_time = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.loyalty_rate = null;
    } else {
    this.loyalty_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.cycle_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cycle_id);
    }
    if (null == this.own_corp_std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, own_corp_std_org_code);
    }
    if (null == this.own_corp_std_org_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, own_corp_std_org_name);
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
    if (null == this.std_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_name);
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
    if (null == this.tv_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_user_count, __dataOut);
    }
    if (null == this.total_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total_user_count, __dataOut);
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
    if (null == this.tv_arrival_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_arrival_rate, __dataOut);
    }
    if (null == this.avg_tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.avg_tv_time, __dataOut);
    }
    if (null == this.loyalty_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.loyalty_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.cycle_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cycle_id);
    }
    if (null == this.own_corp_std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, own_corp_std_org_code);
    }
    if (null == this.own_corp_std_org_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, own_corp_std_org_name);
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
    if (null == this.std_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_name);
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
    if (null == this.tv_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_user_count, __dataOut);
    }
    if (null == this.total_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total_user_count, __dataOut);
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
    if (null == this.tv_arrival_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.tv_arrival_rate, __dataOut);
    }
    if (null == this.avg_tv_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.avg_tv_time, __dataOut);
    }
    if (null == this.loyalty_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.loyalty_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(cycle_id==null?"null":cycle_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_corp_std_org_code==null?"null":own_corp_std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_corp_std_org_name==null?"null":own_corp_std_org_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_code==null?"null":std_channel_group_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_name==null?"null":std_channel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_name==null?"null":std_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_id==null?"null":duration_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_name==null?"null":duration_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_time==null?"null":tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_tv_time==null?"null":all_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_user_count==null?"null":tv_user_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_user_count==null?"null":total_user_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_arrival_rate==null?"null":tv_arrival_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_tv_time==null?"null":avg_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(loyalty_rate==null?"null":loyalty_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cycle_id==null?"null":cycle_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_corp_std_org_code==null?"null":own_corp_std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_corp_std_org_name==null?"null":own_corp_std_org_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_code==null?"null":std_channel_group_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_group_name==null?"null":std_channel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_name==null?"null":std_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_id==null?"null":duration_id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_name==null?"null":duration_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_time==null?"null":tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_tv_time==null?"null":all_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_user_count==null?"null":tv_user_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_user_count==null?"null":total_user_count.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_arrival_rate==null?"null":tv_arrival_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_tv_time==null?"null":avg_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(loyalty_rate==null?"null":loyalty_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.cycle_id = null; } else {
      this.cycle_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.own_corp_std_org_code = null; } else {
      this.own_corp_std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.own_corp_std_org_name = null; } else {
      this.own_corp_std_org_name = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.std_channel_name = null; } else {
      this.std_channel_name = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_user_count = null; } else {
      this.tv_user_count = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.total_user_count = null; } else {
      this.total_user_count = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_arrival_rate = null; } else {
      this.tv_arrival_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_tv_time = null; } else {
      this.avg_tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.loyalty_rate = null; } else {
      this.loyalty_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.cycle_id = null; } else {
      this.cycle_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.own_corp_std_org_code = null; } else {
      this.own_corp_std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.own_corp_std_org_name = null; } else {
      this.own_corp_std_org_name = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.std_channel_name = null; } else {
      this.std_channel_name = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_user_count = null; } else {
      this.tv_user_count = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.total_user_count = null; } else {
      this.total_user_count = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.tv_arrival_rate = null; } else {
      this.tv_arrival_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_tv_time = null; } else {
      this.avg_tv_time = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.loyalty_rate = null; } else {
      this.loyalty_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    st_diff_duration_channel_view_d o = (st_diff_duration_channel_view_d) super.clone();
    return o;
  }

  public void clone0(st_diff_duration_channel_view_d o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("cycle_id", this.cycle_id);
    __sqoop$field_map.put("own_corp_std_org_code", this.own_corp_std_org_code);
    __sqoop$field_map.put("own_corp_std_org_name", this.own_corp_std_org_name);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("std_channel_name", this.std_channel_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_user_count", this.tv_user_count);
    __sqoop$field_map.put("total_user_count", this.total_user_count);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
    __sqoop$field_map.put("tv_arrival_rate", this.tv_arrival_rate);
    __sqoop$field_map.put("avg_tv_time", this.avg_tv_time);
    __sqoop$field_map.put("loyalty_rate", this.loyalty_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cycle_id", this.cycle_id);
    __sqoop$field_map.put("own_corp_std_org_code", this.own_corp_std_org_code);
    __sqoop$field_map.put("own_corp_std_org_name", this.own_corp_std_org_name);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("std_channel_name", this.std_channel_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_user_count", this.tv_user_count);
    __sqoop$field_map.put("total_user_count", this.total_user_count);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
    __sqoop$field_map.put("tv_arrival_rate", this.tv_arrival_rate);
    __sqoop$field_map.put("avg_tv_time", this.avg_tv_time);
    __sqoop$field_map.put("loyalty_rate", this.loyalty_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("cycle_id".equals(__fieldName)) {
      this.cycle_id = (String) __fieldVal;
    }
    else    if ("own_corp_std_org_code".equals(__fieldName)) {
      this.own_corp_std_org_code = (String) __fieldVal;
    }
    else    if ("own_corp_std_org_name".equals(__fieldName)) {
      this.own_corp_std_org_name = (String) __fieldVal;
    }
    else    if ("std_channel_group_code".equals(__fieldName)) {
      this.std_channel_group_code = (String) __fieldVal;
    }
    else    if ("std_channel_group_name".equals(__fieldName)) {
      this.std_channel_group_name = (String) __fieldVal;
    }
    else    if ("std_channel_name".equals(__fieldName)) {
      this.std_channel_name = (String) __fieldVal;
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
    else    if ("tv_user_count".equals(__fieldName)) {
      this.tv_user_count = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("total_user_count".equals(__fieldName)) {
      this.total_user_count = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tv_occupy_rate".equals(__fieldName)) {
      this.tv_occupy_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tv_rate".equals(__fieldName)) {
      this.tv_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("tv_arrival_rate".equals(__fieldName)) {
      this.tv_arrival_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("avg_tv_time".equals(__fieldName)) {
      this.avg_tv_time = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("loyalty_rate".equals(__fieldName)) {
      this.loyalty_rate = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("cycle_id".equals(__fieldName)) {
      this.cycle_id = (String) __fieldVal;
      return true;
    }
    else    if ("own_corp_std_org_code".equals(__fieldName)) {
      this.own_corp_std_org_code = (String) __fieldVal;
      return true;
    }
    else    if ("own_corp_std_org_name".equals(__fieldName)) {
      this.own_corp_std_org_name = (String) __fieldVal;
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
    else    if ("std_channel_name".equals(__fieldName)) {
      this.std_channel_name = (String) __fieldVal;
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
    else    if ("tv_user_count".equals(__fieldName)) {
      this.tv_user_count = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("total_user_count".equals(__fieldName)) {
      this.total_user_count = (java.math.BigDecimal) __fieldVal;
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
    else    if ("tv_arrival_rate".equals(__fieldName)) {
      this.tv_arrival_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("avg_tv_time".equals(__fieldName)) {
      this.avg_tv_time = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("loyalty_rate".equals(__fieldName)) {
      this.loyalty_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
