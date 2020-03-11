// ORM class for table 'st_diff_duration_program_view_d'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jan 09 18:53:55 CST 2019
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

public class st_diff_duration_program_view_d extends SqoopRecord  implements DBWritable, Writable {
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
  public st_diff_duration_program_view_d with_CYCLE_ID(String CYCLE_ID) {
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
  public st_diff_duration_program_view_d with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_diff_duration_program_view_d with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
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
  public st_diff_duration_program_view_d with_std_channel_group_code(String std_channel_group_code) {
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
  public st_diff_duration_program_view_d with_std_channel_group_name(String std_channel_group_name) {
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
  public st_diff_duration_program_view_d with_std_channel_name(String std_channel_name) {
    this.std_channel_name = std_channel_name;
    return this;
  }
  private String program_name;
  public String get_program_name() {
    return program_name;
  }
  public void set_program_name(String program_name) {
    this.program_name = program_name;
  }
  public st_diff_duration_program_view_d with_program_name(String program_name) {
    this.program_name = program_name;
    return this;
  }
  private String program_type_code;
  public String get_program_type_code() {
    return program_type_code;
  }
  public void set_program_type_code(String program_type_code) {
    this.program_type_code = program_type_code;
  }
  public st_diff_duration_program_view_d with_program_type_code(String program_type_code) {
    this.program_type_code = program_type_code;
    return this;
  }
  private String program_type_name;
  public String get_program_type_name() {
    return program_type_name;
  }
  public void set_program_type_name(String program_type_name) {
    this.program_type_name = program_type_name;
  }
  public st_diff_duration_program_view_d with_program_type_name(String program_type_name) {
    this.program_type_name = program_type_name;
    return this;
  }
  private java.math.BigDecimal duration_id;
  public java.math.BigDecimal get_duration_id() {
    return duration_id;
  }
  public void set_duration_id(java.math.BigDecimal duration_id) {
    this.duration_id = duration_id;
  }
  public st_diff_duration_program_view_d with_duration_id(java.math.BigDecimal duration_id) {
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
  public st_diff_duration_program_view_d with_duration_name(String duration_name) {
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
  public st_diff_duration_program_view_d with_tv_time(java.math.BigDecimal tv_time) {
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
  public st_diff_duration_program_view_d with_all_tv_time(java.math.BigDecimal all_tv_time) {
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
  public st_diff_duration_program_view_d with_tv_user_count(java.math.BigDecimal tv_user_count) {
    this.tv_user_count = tv_user_count;
    return this;
  }
  private java.math.BigDecimal tv_occupy_rate;
  public java.math.BigDecimal get_tv_occupy_rate() {
    return tv_occupy_rate;
  }
  public void set_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
    this.tv_occupy_rate = tv_occupy_rate;
  }
  public st_diff_duration_program_view_d with_tv_occupy_rate(java.math.BigDecimal tv_occupy_rate) {
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
  public st_diff_duration_program_view_d with_tv_rate(java.math.BigDecimal tv_rate) {
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
  public st_diff_duration_program_view_d with_tv_arrival_rate(java.math.BigDecimal tv_arrival_rate) {
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
  public st_diff_duration_program_view_d with_avg_tv_time(java.math.BigDecimal avg_tv_time) {
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
  public st_diff_duration_program_view_d with_loyalty_rate(java.math.BigDecimal loyalty_rate) {
    this.loyalty_rate = loyalty_rate;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_diff_duration_program_view_d with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_diff_duration_program_view_d with_pt_mon(String pt_mon) {
    this.pt_mon = pt_mon;
    return this;
  }
  private String pro_begin_time;
  public String get_pro_begin_time() {
    return pro_begin_time;
  }
  public void set_pro_begin_time(String pro_begin_time) {
    this.pro_begin_time = pro_begin_time;
  }
  public st_diff_duration_program_view_d with_pro_begin_time(String pro_begin_time) {
    this.pro_begin_time = pro_begin_time;
    return this;
  }
  private String pro_end_time;
  public String get_pro_end_time() {
    return pro_end_time;
  }
  public void set_pro_end_time(String pro_end_time) {
    this.pro_end_time = pro_end_time;
  }
  public st_diff_duration_program_view_d with_pro_end_time(String pro_end_time) {
    this.pro_end_time = pro_end_time;
    return this;
  }
  private String program_type;
  public String get_program_type() {
    return program_type;
  }
  public void set_program_type(String program_type) {
    this.program_type = program_type;
  }
  public st_diff_duration_program_view_d with_program_type(String program_type) {
    this.program_type = program_type;
    return this;
  }
  private String broad_type;
  public String get_broad_type() {
    return broad_type;
  }
  public void set_broad_type(String broad_type) {
    this.broad_type = broad_type;
  }
  public st_diff_duration_program_view_d with_broad_type(String broad_type) {
    this.broad_type = broad_type;
    return this;
  }
  private Integer program_num;
  public Integer get_program_num() {
    return program_num;
  }
  public void set_program_num(Integer program_num) {
    this.program_num = program_num;
  }
  public st_diff_duration_program_view_d with_program_num(Integer program_num) {
    this.program_num = program_num;
    return this;
  }
  private Integer pro_begin_minute_code;
  public Integer get_pro_begin_minute_code() {
    return pro_begin_minute_code;
  }
  public void set_pro_begin_minute_code(Integer pro_begin_minute_code) {
    this.pro_begin_minute_code = pro_begin_minute_code;
  }
  public st_diff_duration_program_view_d with_pro_begin_minute_code(Integer pro_begin_minute_code) {
    this.pro_begin_minute_code = pro_begin_minute_code;
    return this;
  }
  private Integer pro_end_minute_code;
  public Integer get_pro_end_minute_code() {
    return pro_end_minute_code;
  }
  public void set_pro_end_minute_code(Integer pro_end_minute_code) {
    this.pro_end_minute_code = pro_end_minute_code;
  }
  public st_diff_duration_program_view_d with_pro_end_minute_code(Integer pro_end_minute_code) {
    this.pro_end_minute_code = pro_end_minute_code;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_duration_program_view_d)) {
      return false;
    }
    st_diff_duration_program_view_d that = (st_diff_duration_program_view_d) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.std_channel_name == null ? that.std_channel_name == null : this.std_channel_name.equals(that.std_channel_name));
    equal = equal && (this.program_name == null ? that.program_name == null : this.program_name.equals(that.program_name));
    equal = equal && (this.program_type_code == null ? that.program_type_code == null : this.program_type_code.equals(that.program_type_code));
    equal = equal && (this.program_type_name == null ? that.program_type_name == null : this.program_type_name.equals(that.program_type_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_user_count == null ? that.tv_user_count == null : this.tv_user_count.equals(that.tv_user_count));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.tv_arrival_rate == null ? that.tv_arrival_rate == null : this.tv_arrival_rate.equals(that.tv_arrival_rate));
    equal = equal && (this.avg_tv_time == null ? that.avg_tv_time == null : this.avg_tv_time.equals(that.avg_tv_time));
    equal = equal && (this.loyalty_rate == null ? that.loyalty_rate == null : this.loyalty_rate.equals(that.loyalty_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    equal = equal && (this.pro_begin_time == null ? that.pro_begin_time == null : this.pro_begin_time.equals(that.pro_begin_time));
    equal = equal && (this.pro_end_time == null ? that.pro_end_time == null : this.pro_end_time.equals(that.pro_end_time));
    equal = equal && (this.program_type == null ? that.program_type == null : this.program_type.equals(that.program_type));
    equal = equal && (this.broad_type == null ? that.broad_type == null : this.broad_type.equals(that.broad_type));
    equal = equal && (this.program_num == null ? that.program_num == null : this.program_num.equals(that.program_num));
    equal = equal && (this.pro_begin_minute_code == null ? that.pro_begin_minute_code == null : this.pro_begin_minute_code.equals(that.pro_begin_minute_code));
    equal = equal && (this.pro_end_minute_code == null ? that.pro_end_minute_code == null : this.pro_end_minute_code.equals(that.pro_end_minute_code));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_duration_program_view_d)) {
      return false;
    }
    st_diff_duration_program_view_d that = (st_diff_duration_program_view_d) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.std_channel_group_code == null ? that.std_channel_group_code == null : this.std_channel_group_code.equals(that.std_channel_group_code));
    equal = equal && (this.std_channel_group_name == null ? that.std_channel_group_name == null : this.std_channel_group_name.equals(that.std_channel_group_name));
    equal = equal && (this.std_channel_name == null ? that.std_channel_name == null : this.std_channel_name.equals(that.std_channel_name));
    equal = equal && (this.program_name == null ? that.program_name == null : this.program_name.equals(that.program_name));
    equal = equal && (this.program_type_code == null ? that.program_type_code == null : this.program_type_code.equals(that.program_type_code));
    equal = equal && (this.program_type_name == null ? that.program_type_name == null : this.program_type_name.equals(that.program_type_name));
    equal = equal && (this.duration_id == null ? that.duration_id == null : this.duration_id.equals(that.duration_id));
    equal = equal && (this.duration_name == null ? that.duration_name == null : this.duration_name.equals(that.duration_name));
    equal = equal && (this.tv_time == null ? that.tv_time == null : this.tv_time.equals(that.tv_time));
    equal = equal && (this.all_tv_time == null ? that.all_tv_time == null : this.all_tv_time.equals(that.all_tv_time));
    equal = equal && (this.tv_user_count == null ? that.tv_user_count == null : this.tv_user_count.equals(that.tv_user_count));
    equal = equal && (this.tv_occupy_rate == null ? that.tv_occupy_rate == null : this.tv_occupy_rate.equals(that.tv_occupy_rate));
    equal = equal && (this.tv_rate == null ? that.tv_rate == null : this.tv_rate.equals(that.tv_rate));
    equal = equal && (this.tv_arrival_rate == null ? that.tv_arrival_rate == null : this.tv_arrival_rate.equals(that.tv_arrival_rate));
    equal = equal && (this.avg_tv_time == null ? that.avg_tv_time == null : this.avg_tv_time.equals(that.avg_tv_time));
    equal = equal && (this.loyalty_rate == null ? that.loyalty_rate == null : this.loyalty_rate.equals(that.loyalty_rate));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.pt_mon == null ? that.pt_mon == null : this.pt_mon.equals(that.pt_mon));
    equal = equal && (this.pro_begin_time == null ? that.pro_begin_time == null : this.pro_begin_time.equals(that.pro_begin_time));
    equal = equal && (this.pro_end_time == null ? that.pro_end_time == null : this.pro_end_time.equals(that.pro_end_time));
    equal = equal && (this.program_type == null ? that.program_type == null : this.program_type.equals(that.program_type));
    equal = equal && (this.broad_type == null ? that.broad_type == null : this.broad_type.equals(that.broad_type));
    equal = equal && (this.program_num == null ? that.program_num == null : this.program_num.equals(that.program_num));
    equal = equal && (this.pro_begin_minute_code == null ? that.pro_begin_minute_code == null : this.pro_begin_minute_code.equals(that.pro_begin_minute_code));
    equal = equal && (this.pro_end_minute_code == null ? that.pro_end_minute_code == null : this.pro_end_minute_code.equals(that.pro_end_minute_code));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.std_channel_name = JdbcWritableBridge.readString(6, __dbResults);
    this.program_name = JdbcWritableBridge.readString(7, __dbResults);
    this.program_type_code = JdbcWritableBridge.readString(8, __dbResults);
    this.program_type_name = JdbcWritableBridge.readString(9, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(11, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.tv_user_count = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.tv_arrival_rate = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.avg_tv_time = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.loyalty_rate = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(21, __dbResults);
    this.pro_begin_time = JdbcWritableBridge.readString(22, __dbResults);
    this.pro_end_time = JdbcWritableBridge.readString(23, __dbResults);
    this.program_type = JdbcWritableBridge.readString(24, __dbResults);
    this.broad_type = JdbcWritableBridge.readString(25, __dbResults);
    this.program_num = JdbcWritableBridge.readInteger(26, __dbResults);
    this.pro_begin_minute_code = JdbcWritableBridge.readInteger(27, __dbResults);
    this.pro_end_minute_code = JdbcWritableBridge.readInteger(28, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.std_channel_group_code = JdbcWritableBridge.readString(4, __dbResults);
    this.std_channel_group_name = JdbcWritableBridge.readString(5, __dbResults);
    this.std_channel_name = JdbcWritableBridge.readString(6, __dbResults);
    this.program_name = JdbcWritableBridge.readString(7, __dbResults);
    this.program_type_code = JdbcWritableBridge.readString(8, __dbResults);
    this.program_type_name = JdbcWritableBridge.readString(9, __dbResults);
    this.duration_id = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.duration_name = JdbcWritableBridge.readString(11, __dbResults);
    this.tv_time = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.all_tv_time = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.tv_user_count = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.tv_occupy_rate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.tv_rate = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.tv_arrival_rate = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.avg_tv_time = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.loyalty_rate = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.pt_mon = JdbcWritableBridge.readString(21, __dbResults);
    this.pro_begin_time = JdbcWritableBridge.readString(22, __dbResults);
    this.pro_end_time = JdbcWritableBridge.readString(23, __dbResults);
    this.program_type = JdbcWritableBridge.readString(24, __dbResults);
    this.broad_type = JdbcWritableBridge.readString(25, __dbResults);
    this.program_num = JdbcWritableBridge.readInteger(26, __dbResults);
    this.pro_begin_minute_code = JdbcWritableBridge.readInteger(27, __dbResults);
    this.pro_end_minute_code = JdbcWritableBridge.readInteger(28, __dbResults);
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
    JdbcWritableBridge.writeString(std_channel_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type_name, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_user_count, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_arrival_rate, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_tv_time, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(loyalty_rate, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pro_begin_time, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pro_end_time, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(broad_type, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(program_num, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pro_begin_minute_code, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pro_end_minute_code, 28 + __off, 4, __dbStmt);
    return 28;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_group_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(std_channel_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type_name, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(duration_id, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(duration_name, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_time, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(all_tv_time, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_user_count, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_occupy_rate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_rate, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(tv_arrival_rate, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_tv_time, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(loyalty_rate, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pt_mon, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pro_begin_time, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pro_end_time, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(program_type, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(broad_type, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(program_num, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pro_begin_minute_code, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pro_end_minute_code, 28 + __off, 4, __dbStmt);
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
        this.std_channel_name = null;
    } else {
    this.std_channel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.program_name = null;
    } else {
    this.program_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.program_type_code = null;
    } else {
    this.program_type_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.program_type_name = null;
    } else {
    this.program_type_name = Text.readString(__dataIn);
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
    if (__dataIn.readBoolean()) { 
        this.pro_begin_time = null;
    } else {
    this.pro_begin_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pro_end_time = null;
    } else {
    this.pro_end_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.program_type = null;
    } else {
    this.program_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.broad_type = null;
    } else {
    this.broad_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.program_num = null;
    } else {
    this.program_num = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pro_begin_minute_code = null;
    } else {
    this.pro_begin_minute_code = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pro_end_minute_code = null;
    } else {
    this.pro_end_minute_code = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.std_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_name);
    }
    if (null == this.program_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_name);
    }
    if (null == this.program_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type_code);
    }
    if (null == this.program_type_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type_name);
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
    if (null == this.pro_begin_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pro_begin_time);
    }
    if (null == this.pro_end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pro_end_time);
    }
    if (null == this.program_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type);
    }
    if (null == this.broad_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, broad_type);
    }
    if (null == this.program_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.program_num);
    }
    if (null == this.pro_begin_minute_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pro_begin_minute_code);
    }
    if (null == this.pro_end_minute_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pro_end_minute_code);
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
    if (null == this.std_channel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, std_channel_name);
    }
    if (null == this.program_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_name);
    }
    if (null == this.program_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type_code);
    }
    if (null == this.program_type_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type_name);
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
    if (null == this.pro_begin_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pro_begin_time);
    }
    if (null == this.pro_end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pro_end_time);
    }
    if (null == this.program_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, program_type);
    }
    if (null == this.broad_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, broad_type);
    }
    if (null == this.program_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.program_num);
    }
    if (null == this.pro_begin_minute_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pro_begin_minute_code);
    }
    if (null == this.pro_end_minute_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pro_end_minute_code);
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
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_name==null?"null":std_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_name==null?"null":program_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type_code==null?"null":program_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type_name==null?"null":program_type_name, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_arrival_rate==null?"null":tv_arrival_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_tv_time==null?"null":avg_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(loyalty_rate==null?"null":loyalty_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_begin_time==null?"null":pro_begin_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_end_time==null?"null":pro_end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type==null?"null":program_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(broad_type==null?"null":broad_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_num==null?"null":"" + program_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_begin_minute_code==null?"null":"" + pro_begin_minute_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_end_minute_code==null?"null":"" + pro_end_minute_code, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(std_channel_name==null?"null":std_channel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_name==null?"null":program_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type_code==null?"null":program_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type_name==null?"null":program_type_name, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(tv_occupy_rate==null?"null":tv_occupy_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_rate==null?"null":tv_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv_arrival_rate==null?"null":tv_arrival_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_tv_time==null?"null":avg_tv_time.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(loyalty_rate==null?"null":loyalty_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pt_mon==null?"null":pt_mon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_begin_time==null?"null":pro_begin_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_end_time==null?"null":pro_end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_type==null?"null":program_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(broad_type==null?"null":broad_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(program_num==null?"null":"" + program_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_begin_minute_code==null?"null":"" + pro_begin_minute_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pro_end_minute_code==null?"null":"" + pro_end_minute_code, delimiters));
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
    if (__cur_str.equals("\\N")) { this.std_channel_name = null; } else {
      this.std_channel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_name = null; } else {
      this.program_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type_code = null; } else {
      this.program_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type_name = null; } else {
      this.program_type_name = __cur_str;
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

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pro_begin_time = null; } else {
      this.pro_begin_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pro_end_time = null; } else {
      this.pro_end_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type = null; } else {
      this.program_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.broad_type = null; } else {
      this.broad_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.program_num = null; } else {
      this.program_num = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pro_begin_minute_code = null; } else {
      this.pro_begin_minute_code = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pro_end_minute_code = null; } else {
      this.pro_end_minute_code = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.std_channel_name = null; } else {
      this.std_channel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_name = null; } else {
      this.program_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type_code = null; } else {
      this.program_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type_name = null; } else {
      this.program_type_name = __cur_str;
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

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pt_mon = null; } else {
      this.pt_mon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pro_begin_time = null; } else {
      this.pro_begin_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pro_end_time = null; } else {
      this.pro_end_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.program_type = null; } else {
      this.program_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.broad_type = null; } else {
      this.broad_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.program_num = null; } else {
      this.program_num = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pro_begin_minute_code = null; } else {
      this.pro_begin_minute_code = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pro_end_minute_code = null; } else {
      this.pro_end_minute_code = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    st_diff_duration_program_view_d o = (st_diff_duration_program_view_d) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_diff_duration_program_view_d o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("std_channel_name", this.std_channel_name);
    __sqoop$field_map.put("program_name", this.program_name);
    __sqoop$field_map.put("program_type_code", this.program_type_code);
    __sqoop$field_map.put("program_type_name", this.program_type_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_user_count", this.tv_user_count);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
    __sqoop$field_map.put("tv_arrival_rate", this.tv_arrival_rate);
    __sqoop$field_map.put("avg_tv_time", this.avg_tv_time);
    __sqoop$field_map.put("loyalty_rate", this.loyalty_rate);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    __sqoop$field_map.put("pro_begin_time", this.pro_begin_time);
    __sqoop$field_map.put("pro_end_time", this.pro_end_time);
    __sqoop$field_map.put("program_type", this.program_type);
    __sqoop$field_map.put("broad_type", this.broad_type);
    __sqoop$field_map.put("program_num", this.program_num);
    __sqoop$field_map.put("pro_begin_minute_code", this.pro_begin_minute_code);
    __sqoop$field_map.put("pro_end_minute_code", this.pro_end_minute_code);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("std_channel_group_code", this.std_channel_group_code);
    __sqoop$field_map.put("std_channel_group_name", this.std_channel_group_name);
    __sqoop$field_map.put("std_channel_name", this.std_channel_name);
    __sqoop$field_map.put("program_name", this.program_name);
    __sqoop$field_map.put("program_type_code", this.program_type_code);
    __sqoop$field_map.put("program_type_name", this.program_type_name);
    __sqoop$field_map.put("duration_id", this.duration_id);
    __sqoop$field_map.put("duration_name", this.duration_name);
    __sqoop$field_map.put("tv_time", this.tv_time);
    __sqoop$field_map.put("all_tv_time", this.all_tv_time);
    __sqoop$field_map.put("tv_user_count", this.tv_user_count);
    __sqoop$field_map.put("tv_occupy_rate", this.tv_occupy_rate);
    __sqoop$field_map.put("tv_rate", this.tv_rate);
    __sqoop$field_map.put("tv_arrival_rate", this.tv_arrival_rate);
    __sqoop$field_map.put("avg_tv_time", this.avg_tv_time);
    __sqoop$field_map.put("loyalty_rate", this.loyalty_rate);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("pt_mon", this.pt_mon);
    __sqoop$field_map.put("pro_begin_time", this.pro_begin_time);
    __sqoop$field_map.put("pro_end_time", this.pro_end_time);
    __sqoop$field_map.put("program_type", this.program_type);
    __sqoop$field_map.put("broad_type", this.broad_type);
    __sqoop$field_map.put("program_num", this.program_num);
    __sqoop$field_map.put("pro_begin_minute_code", this.pro_begin_minute_code);
    __sqoop$field_map.put("pro_end_minute_code", this.pro_end_minute_code);
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
    else    if ("std_channel_name".equals(__fieldName)) {
      this.std_channel_name = (String) __fieldVal;
    }
    else    if ("program_name".equals(__fieldName)) {
      this.program_name = (String) __fieldVal;
    }
    else    if ("program_type_code".equals(__fieldName)) {
      this.program_type_code = (String) __fieldVal;
    }
    else    if ("program_type_name".equals(__fieldName)) {
      this.program_type_name = (String) __fieldVal;
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
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
    }
    else    if ("pro_begin_time".equals(__fieldName)) {
      this.pro_begin_time = (String) __fieldVal;
    }
    else    if ("pro_end_time".equals(__fieldName)) {
      this.pro_end_time = (String) __fieldVal;
    }
    else    if ("program_type".equals(__fieldName)) {
      this.program_type = (String) __fieldVal;
    }
    else    if ("broad_type".equals(__fieldName)) {
      this.broad_type = (String) __fieldVal;
    }
    else    if ("program_num".equals(__fieldName)) {
      this.program_num = (Integer) __fieldVal;
    }
    else    if ("pro_begin_minute_code".equals(__fieldName)) {
      this.pro_begin_minute_code = (Integer) __fieldVal;
    }
    else    if ("pro_end_minute_code".equals(__fieldName)) {
      this.pro_end_minute_code = (Integer) __fieldVal;
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
    else    if ("std_channel_name".equals(__fieldName)) {
      this.std_channel_name = (String) __fieldVal;
      return true;
    }
    else    if ("program_name".equals(__fieldName)) {
      this.program_name = (String) __fieldVal;
      return true;
    }
    else    if ("program_type_code".equals(__fieldName)) {
      this.program_type_code = (String) __fieldVal;
      return true;
    }
    else    if ("program_type_name".equals(__fieldName)) {
      this.program_type_name = (String) __fieldVal;
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
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pt_mon".equals(__fieldName)) {
      this.pt_mon = (String) __fieldVal;
      return true;
    }
    else    if ("pro_begin_time".equals(__fieldName)) {
      this.pro_begin_time = (String) __fieldVal;
      return true;
    }
    else    if ("pro_end_time".equals(__fieldName)) {
      this.pro_end_time = (String) __fieldVal;
      return true;
    }
    else    if ("program_type".equals(__fieldName)) {
      this.program_type = (String) __fieldVal;
      return true;
    }
    else    if ("broad_type".equals(__fieldName)) {
      this.broad_type = (String) __fieldVal;
      return true;
    }
    else    if ("program_num".equals(__fieldName)) {
      this.program_num = (Integer) __fieldVal;
      return true;
    }
    else    if ("pro_begin_minute_code".equals(__fieldName)) {
      this.pro_begin_minute_code = (Integer) __fieldVal;
      return true;
    }
    else    if ("pro_end_minute_code".equals(__fieldName)) {
      this.pro_end_minute_code = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
