// ORM class for table 'param_add_adjust_test_1'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Apr 01 15:25:50 CST 2019
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

public class param_add_adjust_test_1 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public param_add_adjust_test_1 with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String stats_dt;
  public String get_stats_dt() {
    return stats_dt;
  }
  public void set_stats_dt(String stats_dt) {
    this.stats_dt = stats_dt;
  }
  public param_add_adjust_test_1 with_stats_dt(String stats_dt) {
    this.stats_dt = stats_dt;
    return this;
  }
  private String std_org_code;
  public String get_std_org_code() {
    return std_org_code;
  }
  public void set_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
  }
  public param_add_adjust_test_1 with_std_org_code(String std_org_code) {
    this.std_org_code = std_org_code;
    return this;
  }
  private java.math.BigDecimal valid_user_cnt;
  public java.math.BigDecimal get_valid_user_cnt() {
    return valid_user_cnt;
  }
  public void set_valid_user_cnt(java.math.BigDecimal valid_user_cnt) {
    this.valid_user_cnt = valid_user_cnt;
  }
  public param_add_adjust_test_1 with_valid_user_cnt(java.math.BigDecimal valid_user_cnt) {
    this.valid_user_cnt = valid_user_cnt;
    return this;
  }
  private java.math.BigDecimal paid_user_cnt;
  public java.math.BigDecimal get_paid_user_cnt() {
    return paid_user_cnt;
  }
  public void set_paid_user_cnt(java.math.BigDecimal paid_user_cnt) {
    this.paid_user_cnt = paid_user_cnt;
  }
  public param_add_adjust_test_1 with_paid_user_cnt(java.math.BigDecimal paid_user_cnt) {
    this.paid_user_cnt = paid_user_cnt;
    return this;
  }
  private java.math.BigDecimal online_rate;
  public java.math.BigDecimal get_online_rate() {
    return online_rate;
  }
  public void set_online_rate(java.math.BigDecimal online_rate) {
    this.online_rate = online_rate;
  }
  public param_add_adjust_test_1 with_online_rate(java.math.BigDecimal online_rate) {
    this.online_rate = online_rate;
    return this;
  }
  private java.math.BigDecimal lan_arpu;
  public java.math.BigDecimal get_lan_arpu() {
    return lan_arpu;
  }
  public void set_lan_arpu(java.math.BigDecimal lan_arpu) {
    this.lan_arpu = lan_arpu;
  }
  public param_add_adjust_test_1 with_lan_arpu(java.math.BigDecimal lan_arpu) {
    this.lan_arpu = lan_arpu;
    return this;
  }
  private java.math.BigDecimal com_arpu;
  public java.math.BigDecimal get_com_arpu() {
    return com_arpu;
  }
  public void set_com_arpu(java.math.BigDecimal com_arpu) {
    this.com_arpu = com_arpu;
  }
  public param_add_adjust_test_1 with_com_arpu(java.math.BigDecimal com_arpu) {
    this.com_arpu = com_arpu;
    return this;
  }
  private java.math.BigDecimal flows_per_users;
  public java.math.BigDecimal get_flows_per_users() {
    return flows_per_users;
  }
  public void set_flows_per_users(java.math.BigDecimal flows_per_users) {
    this.flows_per_users = flows_per_users;
  }
  public param_add_adjust_test_1 with_flows_per_users(java.math.BigDecimal flows_per_users) {
    this.flows_per_users = flows_per_users;
    return this;
  }
  private java.math.BigDecimal flows;
  public java.math.BigDecimal get_flows() {
    return flows;
  }
  public void set_flows(java.math.BigDecimal flows) {
    this.flows = flows;
  }
  public param_add_adjust_test_1 with_flows(java.math.BigDecimal flows) {
    this.flows = flows;
    return this;
  }
  private java.math.BigDecimal ext1;
  public java.math.BigDecimal get_ext1() {
    return ext1;
  }
  public void set_ext1(java.math.BigDecimal ext1) {
    this.ext1 = ext1;
  }
  public param_add_adjust_test_1 with_ext1(java.math.BigDecimal ext1) {
    this.ext1 = ext1;
    return this;
  }
  private java.math.BigDecimal ext2;
  public java.math.BigDecimal get_ext2() {
    return ext2;
  }
  public void set_ext2(java.math.BigDecimal ext2) {
    this.ext2 = ext2;
  }
  public param_add_adjust_test_1 with_ext2(java.math.BigDecimal ext2) {
    this.ext2 = ext2;
    return this;
  }
  private java.math.BigDecimal ext3;
  public java.math.BigDecimal get_ext3() {
    return ext3;
  }
  public void set_ext3(java.math.BigDecimal ext3) {
    this.ext3 = ext3;
  }
  public param_add_adjust_test_1 with_ext3(java.math.BigDecimal ext3) {
    this.ext3 = ext3;
    return this;
  }
  private java.math.BigDecimal ext4;
  public java.math.BigDecimal get_ext4() {
    return ext4;
  }
  public void set_ext4(java.math.BigDecimal ext4) {
    this.ext4 = ext4;
  }
  public param_add_adjust_test_1 with_ext4(java.math.BigDecimal ext4) {
    this.ext4 = ext4;
    return this;
  }
  private String operate_id;
  public String get_operate_id() {
    return operate_id;
  }
  public void set_operate_id(String operate_id) {
    this.operate_id = operate_id;
  }
  public param_add_adjust_test_1 with_operate_id(String operate_id) {
    this.operate_id = operate_id;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public param_add_adjust_test_1 with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof param_add_adjust_test_1)) {
      return false;
    }
    param_add_adjust_test_1 that = (param_add_adjust_test_1) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.stats_dt == null ? that.stats_dt == null : this.stats_dt.equals(that.stats_dt));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.valid_user_cnt == null ? that.valid_user_cnt == null : this.valid_user_cnt.equals(that.valid_user_cnt));
    equal = equal && (this.paid_user_cnt == null ? that.paid_user_cnt == null : this.paid_user_cnt.equals(that.paid_user_cnt));
    equal = equal && (this.online_rate == null ? that.online_rate == null : this.online_rate.equals(that.online_rate));
    equal = equal && (this.lan_arpu == null ? that.lan_arpu == null : this.lan_arpu.equals(that.lan_arpu));
    equal = equal && (this.com_arpu == null ? that.com_arpu == null : this.com_arpu.equals(that.com_arpu));
    equal = equal && (this.flows_per_users == null ? that.flows_per_users == null : this.flows_per_users.equals(that.flows_per_users));
    equal = equal && (this.flows == null ? that.flows == null : this.flows.equals(that.flows));
    equal = equal && (this.ext1 == null ? that.ext1 == null : this.ext1.equals(that.ext1));
    equal = equal && (this.ext2 == null ? that.ext2 == null : this.ext2.equals(that.ext2));
    equal = equal && (this.ext3 == null ? that.ext3 == null : this.ext3.equals(that.ext3));
    equal = equal && (this.ext4 == null ? that.ext4 == null : this.ext4.equals(that.ext4));
    equal = equal && (this.operate_id == null ? that.operate_id == null : this.operate_id.equals(that.operate_id));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof param_add_adjust_test_1)) {
      return false;
    }
    param_add_adjust_test_1 that = (param_add_adjust_test_1) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.stats_dt == null ? that.stats_dt == null : this.stats_dt.equals(that.stats_dt));
    equal = equal && (this.std_org_code == null ? that.std_org_code == null : this.std_org_code.equals(that.std_org_code));
    equal = equal && (this.valid_user_cnt == null ? that.valid_user_cnt == null : this.valid_user_cnt.equals(that.valid_user_cnt));
    equal = equal && (this.paid_user_cnt == null ? that.paid_user_cnt == null : this.paid_user_cnt.equals(that.paid_user_cnt));
    equal = equal && (this.online_rate == null ? that.online_rate == null : this.online_rate.equals(that.online_rate));
    equal = equal && (this.lan_arpu == null ? that.lan_arpu == null : this.lan_arpu.equals(that.lan_arpu));
    equal = equal && (this.com_arpu == null ? that.com_arpu == null : this.com_arpu.equals(that.com_arpu));
    equal = equal && (this.flows_per_users == null ? that.flows_per_users == null : this.flows_per_users.equals(that.flows_per_users));
    equal = equal && (this.flows == null ? that.flows == null : this.flows.equals(that.flows));
    equal = equal && (this.ext1 == null ? that.ext1 == null : this.ext1.equals(that.ext1));
    equal = equal && (this.ext2 == null ? that.ext2 == null : this.ext2.equals(that.ext2));
    equal = equal && (this.ext3 == null ? that.ext3 == null : this.ext3.equals(that.ext3));
    equal = equal && (this.ext4 == null ? that.ext4 == null : this.ext4.equals(that.ext4));
    equal = equal && (this.operate_id == null ? that.operate_id == null : this.operate_id.equals(that.operate_id));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.stats_dt = JdbcWritableBridge.readString(2, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(3, __dbResults);
    this.valid_user_cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.paid_user_cnt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.online_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.lan_arpu = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.com_arpu = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flows_per_users = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.flows = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.ext1 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ext2 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.ext3 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ext4 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.operate_id = JdbcWritableBridge.readString(15, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.stats_dt = JdbcWritableBridge.readString(2, __dbResults);
    this.std_org_code = JdbcWritableBridge.readString(3, __dbResults);
    this.valid_user_cnt = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.paid_user_cnt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.online_rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.lan_arpu = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.com_arpu = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flows_per_users = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.flows = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.ext1 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.ext2 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.ext3 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ext4 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.operate_id = JdbcWritableBridge.readString(15, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(stats_dt, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valid_user_cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(paid_user_cnt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lan_arpu, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(com_arpu, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(flows_per_users, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(flows, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext1, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext2, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext3, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext4, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(operate_id, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(stats_dt, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_org_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valid_user_cnt, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(paid_user_cnt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(online_rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lan_arpu, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(com_arpu, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(flows_per_users, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(flows, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext1, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext2, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext3, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ext4, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(operate_id, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.stats_dt = null;
    } else {
    this.stats_dt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.std_org_code = null;
    } else {
    this.std_org_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.valid_user_cnt = null;
    } else {
    this.valid_user_cnt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.paid_user_cnt = null;
    } else {
    this.paid_user_cnt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.online_rate = null;
    } else {
    this.online_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lan_arpu = null;
    } else {
    this.lan_arpu = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.com_arpu = null;
    } else {
    this.com_arpu = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flows_per_users = null;
    } else {
    this.flows_per_users = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flows = null;
    } else {
    this.flows = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ext1 = null;
    } else {
    this.ext1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ext2 = null;
    } else {
    this.ext2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ext3 = null;
    } else {
    this.ext3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ext4 = null;
    } else {
    this.ext4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.operate_id = null;
    } else {
    this.operate_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.stats_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stats_dt);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
    }
    if (null == this.valid_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valid_user_cnt, __dataOut);
    }
    if (null == this.paid_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.paid_user_cnt, __dataOut);
    }
    if (null == this.online_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_rate, __dataOut);
    }
    if (null == this.lan_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lan_arpu, __dataOut);
    }
    if (null == this.com_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.com_arpu, __dataOut);
    }
    if (null == this.flows_per_users) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.flows_per_users, __dataOut);
    }
    if (null == this.flows) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.flows, __dataOut);
    }
    if (null == this.ext1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext1, __dataOut);
    }
    if (null == this.ext2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext2, __dataOut);
    }
    if (null == this.ext3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext3, __dataOut);
    }
    if (null == this.ext4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext4, __dataOut);
    }
    if (null == this.operate_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operate_id);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.stats_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stats_dt);
    }
    if (null == this.std_org_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_org_code);
    }
    if (null == this.valid_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valid_user_cnt, __dataOut);
    }
    if (null == this.paid_user_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.paid_user_cnt, __dataOut);
    }
    if (null == this.online_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.online_rate, __dataOut);
    }
    if (null == this.lan_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lan_arpu, __dataOut);
    }
    if (null == this.com_arpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.com_arpu, __dataOut);
    }
    if (null == this.flows_per_users) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.flows_per_users, __dataOut);
    }
    if (null == this.flows) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.flows, __dataOut);
    }
    if (null == this.ext1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext1, __dataOut);
    }
    if (null == this.ext2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext2, __dataOut);
    }
    if (null == this.ext3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext3, __dataOut);
    }
    if (null == this.ext4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ext4, __dataOut);
    }
    if (null == this.operate_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operate_id);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stats_dt==null?"null":stats_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valid_user_cnt==null?"null":valid_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(paid_user_cnt==null?"null":paid_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_rate==null?"null":online_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lan_arpu==null?"null":lan_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(com_arpu==null?"null":com_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flows_per_users==null?"null":flows_per_users.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flows==null?"null":flows.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext1==null?"null":ext1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext2==null?"null":ext2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext3==null?"null":ext3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext4==null?"null":ext4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operate_id==null?"null":operate_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stats_dt==null?"null":stats_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(std_org_code==null?"null":std_org_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valid_user_cnt==null?"null":valid_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(paid_user_cnt==null?"null":paid_user_cnt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_rate==null?"null":online_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lan_arpu==null?"null":lan_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(com_arpu==null?"null":com_arpu.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flows_per_users==null?"null":flows_per_users.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flows==null?"null":flows.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext1==null?"null":ext1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext2==null?"null":ext2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext3==null?"null":ext3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext4==null?"null":ext4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operate_id==null?"null":operate_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stats_dt = null; } else {
      this.stats_dt = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.valid_user_cnt = null; } else {
      this.valid_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.paid_user_cnt = null; } else {
      this.paid_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_rate = null; } else {
      this.online_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lan_arpu = null; } else {
      this.lan_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.com_arpu = null; } else {
      this.com_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.flows_per_users = null; } else {
      this.flows_per_users = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.flows = null; } else {
      this.flows = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext1 = null; } else {
      this.ext1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext2 = null; } else {
      this.ext2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext3 = null; } else {
      this.ext3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext4 = null; } else {
      this.ext4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.operate_id = null; } else {
      this.operate_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stats_dt = null; } else {
      this.stats_dt = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.std_org_code = null; } else {
      this.std_org_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.valid_user_cnt = null; } else {
      this.valid_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.paid_user_cnt = null; } else {
      this.paid_user_cnt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_rate = null; } else {
      this.online_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lan_arpu = null; } else {
      this.lan_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.com_arpu = null; } else {
      this.com_arpu = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.flows_per_users = null; } else {
      this.flows_per_users = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.flows = null; } else {
      this.flows = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext1 = null; } else {
      this.ext1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext2 = null; } else {
      this.ext2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext3 = null; } else {
      this.ext3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ext4 = null; } else {
      this.ext4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.operate_id = null; } else {
      this.operate_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    param_add_adjust_test_1 o = (param_add_adjust_test_1) super.clone();
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(param_add_adjust_test_1 o) throws CloneNotSupportedException {
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("stats_dt", this.stats_dt);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("valid_user_cnt", this.valid_user_cnt);
    __sqoop$field_map.put("paid_user_cnt", this.paid_user_cnt);
    __sqoop$field_map.put("online_rate", this.online_rate);
    __sqoop$field_map.put("lan_arpu", this.lan_arpu);
    __sqoop$field_map.put("com_arpu", this.com_arpu);
    __sqoop$field_map.put("flows_per_users", this.flows_per_users);
    __sqoop$field_map.put("flows", this.flows);
    __sqoop$field_map.put("ext1", this.ext1);
    __sqoop$field_map.put("ext2", this.ext2);
    __sqoop$field_map.put("ext3", this.ext3);
    __sqoop$field_map.put("ext4", this.ext4);
    __sqoop$field_map.put("operate_id", this.operate_id);
    __sqoop$field_map.put("update_time", this.update_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("stats_dt", this.stats_dt);
    __sqoop$field_map.put("std_org_code", this.std_org_code);
    __sqoop$field_map.put("valid_user_cnt", this.valid_user_cnt);
    __sqoop$field_map.put("paid_user_cnt", this.paid_user_cnt);
    __sqoop$field_map.put("online_rate", this.online_rate);
    __sqoop$field_map.put("lan_arpu", this.lan_arpu);
    __sqoop$field_map.put("com_arpu", this.com_arpu);
    __sqoop$field_map.put("flows_per_users", this.flows_per_users);
    __sqoop$field_map.put("flows", this.flows);
    __sqoop$field_map.put("ext1", this.ext1);
    __sqoop$field_map.put("ext2", this.ext2);
    __sqoop$field_map.put("ext3", this.ext3);
    __sqoop$field_map.put("ext4", this.ext4);
    __sqoop$field_map.put("operate_id", this.operate_id);
    __sqoop$field_map.put("update_time", this.update_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("stats_dt".equals(__fieldName)) {
      this.stats_dt = (String) __fieldVal;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
    }
    else    if ("valid_user_cnt".equals(__fieldName)) {
      this.valid_user_cnt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("paid_user_cnt".equals(__fieldName)) {
      this.paid_user_cnt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("online_rate".equals(__fieldName)) {
      this.online_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("lan_arpu".equals(__fieldName)) {
      this.lan_arpu = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("com_arpu".equals(__fieldName)) {
      this.com_arpu = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("flows_per_users".equals(__fieldName)) {
      this.flows_per_users = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("flows".equals(__fieldName)) {
      this.flows = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ext1".equals(__fieldName)) {
      this.ext1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ext2".equals(__fieldName)) {
      this.ext2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ext3".equals(__fieldName)) {
      this.ext3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ext4".equals(__fieldName)) {
      this.ext4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("operate_id".equals(__fieldName)) {
      this.operate_id = (String) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
      return true;
    }
    else    if ("stats_dt".equals(__fieldName)) {
      this.stats_dt = (String) __fieldVal;
      return true;
    }
    else    if ("std_org_code".equals(__fieldName)) {
      this.std_org_code = (String) __fieldVal;
      return true;
    }
    else    if ("valid_user_cnt".equals(__fieldName)) {
      this.valid_user_cnt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("paid_user_cnt".equals(__fieldName)) {
      this.paid_user_cnt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("online_rate".equals(__fieldName)) {
      this.online_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("lan_arpu".equals(__fieldName)) {
      this.lan_arpu = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("com_arpu".equals(__fieldName)) {
      this.com_arpu = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("flows_per_users".equals(__fieldName)) {
      this.flows_per_users = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("flows".equals(__fieldName)) {
      this.flows = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ext1".equals(__fieldName)) {
      this.ext1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ext2".equals(__fieldName)) {
      this.ext2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ext3".equals(__fieldName)) {
      this.ext3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ext4".equals(__fieldName)) {
      this.ext4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("operate_id".equals(__fieldName)) {
      this.operate_id = (String) __fieldVal;
      return true;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
