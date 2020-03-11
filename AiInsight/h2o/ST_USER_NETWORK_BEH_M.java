// ORM class for table 'st_user_network_beh_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 17 19:11:27 CST 2019
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

public class st_user_network_beh_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_user_network_beh_m with_CYCLE_ID(String CYCLE_ID) {
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
  public st_user_network_beh_m with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_user_network_beh_m with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal TOTAL_USER_COUNT;
  public java.math.BigDecimal get_TOTAL_USER_COUNT() {
    return TOTAL_USER_COUNT;
  }
  public void set_TOTAL_USER_COUNT(java.math.BigDecimal TOTAL_USER_COUNT) {
    this.TOTAL_USER_COUNT = TOTAL_USER_COUNT;
  }
  public st_user_network_beh_m with_TOTAL_USER_COUNT(java.math.BigDecimal TOTAL_USER_COUNT) {
    this.TOTAL_USER_COUNT = TOTAL_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BW_10M_USER_COUNT;
  public java.math.BigDecimal get_BW_10M_USER_COUNT() {
    return BW_10M_USER_COUNT;
  }
  public void set_BW_10M_USER_COUNT(java.math.BigDecimal BW_10M_USER_COUNT) {
    this.BW_10M_USER_COUNT = BW_10M_USER_COUNT;
  }
  public st_user_network_beh_m with_BW_10M_USER_COUNT(java.math.BigDecimal BW_10M_USER_COUNT) {
    this.BW_10M_USER_COUNT = BW_10M_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BW_20M_USER_COUNT;
  public java.math.BigDecimal get_BW_20M_USER_COUNT() {
    return BW_20M_USER_COUNT;
  }
  public void set_BW_20M_USER_COUNT(java.math.BigDecimal BW_20M_USER_COUNT) {
    this.BW_20M_USER_COUNT = BW_20M_USER_COUNT;
  }
  public st_user_network_beh_m with_BW_20M_USER_COUNT(java.math.BigDecimal BW_20M_USER_COUNT) {
    this.BW_20M_USER_COUNT = BW_20M_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BW_50M_USER_COUNT;
  public java.math.BigDecimal get_BW_50M_USER_COUNT() {
    return BW_50M_USER_COUNT;
  }
  public void set_BW_50M_USER_COUNT(java.math.BigDecimal BW_50M_USER_COUNT) {
    this.BW_50M_USER_COUNT = BW_50M_USER_COUNT;
  }
  public st_user_network_beh_m with_BW_50M_USER_COUNT(java.math.BigDecimal BW_50M_USER_COUNT) {
    this.BW_50M_USER_COUNT = BW_50M_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BW_OTHERS_USER_COUNT;
  public java.math.BigDecimal get_BW_OTHERS_USER_COUNT() {
    return BW_OTHERS_USER_COUNT;
  }
  public void set_BW_OTHERS_USER_COUNT(java.math.BigDecimal BW_OTHERS_USER_COUNT) {
    this.BW_OTHERS_USER_COUNT = BW_OTHERS_USER_COUNT;
  }
  public st_user_network_beh_m with_BW_OTHERS_USER_COUNT(java.math.BigDecimal BW_OTHERS_USER_COUNT) {
    this.BW_OTHERS_USER_COUNT = BW_OTHERS_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal TOTAL_NET_FLOW;
  public java.math.BigDecimal get_TOTAL_NET_FLOW() {
    return TOTAL_NET_FLOW;
  }
  public void set_TOTAL_NET_FLOW(java.math.BigDecimal TOTAL_NET_FLOW) {
    this.TOTAL_NET_FLOW = TOTAL_NET_FLOW;
  }
  public st_user_network_beh_m with_TOTAL_NET_FLOW(java.math.BigDecimal TOTAL_NET_FLOW) {
    this.TOTAL_NET_FLOW = TOTAL_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal SBZ_NOT_YMZ_COUNT;
  public java.math.BigDecimal get_SBZ_NOT_YMZ_COUNT() {
    return SBZ_NOT_YMZ_COUNT;
  }
  public void set_SBZ_NOT_YMZ_COUNT(java.math.BigDecimal SBZ_NOT_YMZ_COUNT) {
    this.SBZ_NOT_YMZ_COUNT = SBZ_NOT_YMZ_COUNT;
  }
  public st_user_network_beh_m with_SBZ_NOT_YMZ_COUNT(java.math.BigDecimal SBZ_NOT_YMZ_COUNT) {
    this.SBZ_NOT_YMZ_COUNT = SBZ_NOT_YMZ_COUNT;
    return this;
  }
  private java.math.BigDecimal YMZ_NOT_SBZ_COUNT;
  public java.math.BigDecimal get_YMZ_NOT_SBZ_COUNT() {
    return YMZ_NOT_SBZ_COUNT;
  }
  public void set_YMZ_NOT_SBZ_COUNT(java.math.BigDecimal YMZ_NOT_SBZ_COUNT) {
    this.YMZ_NOT_SBZ_COUNT = YMZ_NOT_SBZ_COUNT;
  }
  public st_user_network_beh_m with_YMZ_NOT_SBZ_COUNT(java.math.BigDecimal YMZ_NOT_SBZ_COUNT) {
    this.YMZ_NOT_SBZ_COUNT = YMZ_NOT_SBZ_COUNT;
    return this;
  }
  private java.math.BigDecimal YMZ_AND_SBZ_COUNT;
  public java.math.BigDecimal get_YMZ_AND_SBZ_COUNT() {
    return YMZ_AND_SBZ_COUNT;
  }
  public void set_YMZ_AND_SBZ_COUNT(java.math.BigDecimal YMZ_AND_SBZ_COUNT) {
    this.YMZ_AND_SBZ_COUNT = YMZ_AND_SBZ_COUNT;
  }
  public st_user_network_beh_m with_YMZ_AND_SBZ_COUNT(java.math.BigDecimal YMZ_AND_SBZ_COUNT) {
    this.YMZ_AND_SBZ_COUNT = YMZ_AND_SBZ_COUNT;
    return this;
  }
  private java.math.BigDecimal OTHERS_COUNT;
  public java.math.BigDecimal get_OTHERS_COUNT() {
    return OTHERS_COUNT;
  }
  public void set_OTHERS_COUNT(java.math.BigDecimal OTHERS_COUNT) {
    this.OTHERS_COUNT = OTHERS_COUNT;
  }
  public st_user_network_beh_m with_OTHERS_COUNT(java.math.BigDecimal OTHERS_COUNT) {
    this.OTHERS_COUNT = OTHERS_COUNT;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_NET_NUM() {
    return WEEKDAY_NET_NUM;
  }
  public void set_WEEKDAY_NET_NUM(java.math.BigDecimal WEEKDAY_NET_NUM) {
    this.WEEKDAY_NET_NUM = WEEKDAY_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_NET_NUM(java.math.BigDecimal WEEKDAY_NET_NUM) {
    this.WEEKDAY_NET_NUM = WEEKDAY_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_NET_FLOW() {
    return WEEKDAY_NET_FLOW;
  }
  public void set_WEEKDAY_NET_FLOW(java.math.BigDecimal WEEKDAY_NET_FLOW) {
    this.WEEKDAY_NET_FLOW = WEEKDAY_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_NET_FLOW(java.math.BigDecimal WEEKDAY_NET_FLOW) {
    this.WEEKDAY_NET_FLOW = WEEKDAY_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_NET_NUM() {
    return WEEKEND_NET_NUM;
  }
  public void set_WEEKEND_NET_NUM(java.math.BigDecimal WEEKEND_NET_NUM) {
    this.WEEKEND_NET_NUM = WEEKEND_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_NET_NUM(java.math.BigDecimal WEEKEND_NET_NUM) {
    this.WEEKEND_NET_NUM = WEEKEND_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_NET_FLOW() {
    return WEEKEND_NET_FLOW;
  }
  public void set_WEEKEND_NET_FLOW(java.math.BigDecimal WEEKEND_NET_FLOW) {
    this.WEEKEND_NET_FLOW = WEEKEND_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_NET_FLOW(java.math.BigDecimal WEEKEND_NET_FLOW) {
    this.WEEKEND_NET_FLOW = WEEKEND_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_LC_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_LC_NET_NUM() {
    return WEEKDAY_LC_NET_NUM;
  }
  public void set_WEEKDAY_LC_NET_NUM(java.math.BigDecimal WEEKDAY_LC_NET_NUM) {
    this.WEEKDAY_LC_NET_NUM = WEEKDAY_LC_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_LC_NET_NUM(java.math.BigDecimal WEEKDAY_LC_NET_NUM) {
    this.WEEKDAY_LC_NET_NUM = WEEKDAY_LC_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_LC_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_LC_NET_FLOW() {
    return WEEKDAY_LC_NET_FLOW;
  }
  public void set_WEEKDAY_LC_NET_FLOW(java.math.BigDecimal WEEKDAY_LC_NET_FLOW) {
    this.WEEKDAY_LC_NET_FLOW = WEEKDAY_LC_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_LC_NET_FLOW(java.math.BigDecimal WEEKDAY_LC_NET_FLOW) {
    this.WEEKDAY_LC_NET_FLOW = WEEKDAY_LC_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_ZS_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_ZS_NET_NUM() {
    return WEEKDAY_ZS_NET_NUM;
  }
  public void set_WEEKDAY_ZS_NET_NUM(java.math.BigDecimal WEEKDAY_ZS_NET_NUM) {
    this.WEEKDAY_ZS_NET_NUM = WEEKDAY_ZS_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_ZS_NET_NUM(java.math.BigDecimal WEEKDAY_ZS_NET_NUM) {
    this.WEEKDAY_ZS_NET_NUM = WEEKDAY_ZS_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_ZS_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_ZS_NET_FLOW() {
    return WEEKDAY_ZS_NET_FLOW;
  }
  public void set_WEEKDAY_ZS_NET_FLOW(java.math.BigDecimal WEEKDAY_ZS_NET_FLOW) {
    this.WEEKDAY_ZS_NET_FLOW = WEEKDAY_ZS_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_ZS_NET_FLOW(java.math.BigDecimal WEEKDAY_ZS_NET_FLOW) {
    this.WEEKDAY_ZS_NET_FLOW = WEEKDAY_ZS_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_SW_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_SW_NET_NUM() {
    return WEEKDAY_SW_NET_NUM;
  }
  public void set_WEEKDAY_SW_NET_NUM(java.math.BigDecimal WEEKDAY_SW_NET_NUM) {
    this.WEEKDAY_SW_NET_NUM = WEEKDAY_SW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_SW_NET_NUM(java.math.BigDecimal WEEKDAY_SW_NET_NUM) {
    this.WEEKDAY_SW_NET_NUM = WEEKDAY_SW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_SW_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_SW_NET_FLOW() {
    return WEEKDAY_SW_NET_FLOW;
  }
  public void set_WEEKDAY_SW_NET_FLOW(java.math.BigDecimal WEEKDAY_SW_NET_FLOW) {
    this.WEEKDAY_SW_NET_FLOW = WEEKDAY_SW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_SW_NET_FLOW(java.math.BigDecimal WEEKDAY_SW_NET_FLOW) {
    this.WEEKDAY_SW_NET_FLOW = WEEKDAY_SW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_ZW_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_ZW_NET_NUM() {
    return WEEKDAY_ZW_NET_NUM;
  }
  public void set_WEEKDAY_ZW_NET_NUM(java.math.BigDecimal WEEKDAY_ZW_NET_NUM) {
    this.WEEKDAY_ZW_NET_NUM = WEEKDAY_ZW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_ZW_NET_NUM(java.math.BigDecimal WEEKDAY_ZW_NET_NUM) {
    this.WEEKDAY_ZW_NET_NUM = WEEKDAY_ZW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_ZW_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_ZW_NET_FLOW() {
    return WEEKDAY_ZW_NET_FLOW;
  }
  public void set_WEEKDAY_ZW_NET_FLOW(java.math.BigDecimal WEEKDAY_ZW_NET_FLOW) {
    this.WEEKDAY_ZW_NET_FLOW = WEEKDAY_ZW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_ZW_NET_FLOW(java.math.BigDecimal WEEKDAY_ZW_NET_FLOW) {
    this.WEEKDAY_ZW_NET_FLOW = WEEKDAY_ZW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_XW_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_XW_NET_NUM() {
    return WEEKDAY_XW_NET_NUM;
  }
  public void set_WEEKDAY_XW_NET_NUM(java.math.BigDecimal WEEKDAY_XW_NET_NUM) {
    this.WEEKDAY_XW_NET_NUM = WEEKDAY_XW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_XW_NET_NUM(java.math.BigDecimal WEEKDAY_XW_NET_NUM) {
    this.WEEKDAY_XW_NET_NUM = WEEKDAY_XW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_XW_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_XW_NET_FLOW() {
    return WEEKDAY_XW_NET_FLOW;
  }
  public void set_WEEKDAY_XW_NET_FLOW(java.math.BigDecimal WEEKDAY_XW_NET_FLOW) {
    this.WEEKDAY_XW_NET_FLOW = WEEKDAY_XW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_XW_NET_FLOW(java.math.BigDecimal WEEKDAY_XW_NET_FLOW) {
    this.WEEKDAY_XW_NET_FLOW = WEEKDAY_XW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_BW_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_BW_NET_NUM() {
    return WEEKDAY_BW_NET_NUM;
  }
  public void set_WEEKDAY_BW_NET_NUM(java.math.BigDecimal WEEKDAY_BW_NET_NUM) {
    this.WEEKDAY_BW_NET_NUM = WEEKDAY_BW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_BW_NET_NUM(java.math.BigDecimal WEEKDAY_BW_NET_NUM) {
    this.WEEKDAY_BW_NET_NUM = WEEKDAY_BW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_BW_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_BW_NET_FLOW() {
    return WEEKDAY_BW_NET_FLOW;
  }
  public void set_WEEKDAY_BW_NET_FLOW(java.math.BigDecimal WEEKDAY_BW_NET_FLOW) {
    this.WEEKDAY_BW_NET_FLOW = WEEKDAY_BW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_BW_NET_FLOW(java.math.BigDecimal WEEKDAY_BW_NET_FLOW) {
    this.WEEKDAY_BW_NET_FLOW = WEEKDAY_BW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_WS_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_WS_NET_NUM() {
    return WEEKDAY_WS_NET_NUM;
  }
  public void set_WEEKDAY_WS_NET_NUM(java.math.BigDecimal WEEKDAY_WS_NET_NUM) {
    this.WEEKDAY_WS_NET_NUM = WEEKDAY_WS_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_WS_NET_NUM(java.math.BigDecimal WEEKDAY_WS_NET_NUM) {
    this.WEEKDAY_WS_NET_NUM = WEEKDAY_WS_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_WS_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_WS_NET_FLOW() {
    return WEEKDAY_WS_NET_FLOW;
  }
  public void set_WEEKDAY_WS_NET_FLOW(java.math.BigDecimal WEEKDAY_WS_NET_FLOW) {
    this.WEEKDAY_WS_NET_FLOW = WEEKDAY_WS_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_WS_NET_FLOW(java.math.BigDecimal WEEKDAY_WS_NET_FLOW) {
    this.WEEKDAY_WS_NET_FLOW = WEEKDAY_WS_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_WY_NET_NUM;
  public java.math.BigDecimal get_WEEKDAY_WY_NET_NUM() {
    return WEEKDAY_WY_NET_NUM;
  }
  public void set_WEEKDAY_WY_NET_NUM(java.math.BigDecimal WEEKDAY_WY_NET_NUM) {
    this.WEEKDAY_WY_NET_NUM = WEEKDAY_WY_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKDAY_WY_NET_NUM(java.math.BigDecimal WEEKDAY_WY_NET_NUM) {
    this.WEEKDAY_WY_NET_NUM = WEEKDAY_WY_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKDAY_WY_NET_FLOW;
  public java.math.BigDecimal get_WEEKDAY_WY_NET_FLOW() {
    return WEEKDAY_WY_NET_FLOW;
  }
  public void set_WEEKDAY_WY_NET_FLOW(java.math.BigDecimal WEEKDAY_WY_NET_FLOW) {
    this.WEEKDAY_WY_NET_FLOW = WEEKDAY_WY_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKDAY_WY_NET_FLOW(java.math.BigDecimal WEEKDAY_WY_NET_FLOW) {
    this.WEEKDAY_WY_NET_FLOW = WEEKDAY_WY_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_LC_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_LC_NET_NUM() {
    return WEEKEND_LC_NET_NUM;
  }
  public void set_WEEKEND_LC_NET_NUM(java.math.BigDecimal WEEKEND_LC_NET_NUM) {
    this.WEEKEND_LC_NET_NUM = WEEKEND_LC_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_LC_NET_NUM(java.math.BigDecimal WEEKEND_LC_NET_NUM) {
    this.WEEKEND_LC_NET_NUM = WEEKEND_LC_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_LC_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_LC_NET_FLOW() {
    return WEEKEND_LC_NET_FLOW;
  }
  public void set_WEEKEND_LC_NET_FLOW(java.math.BigDecimal WEEKEND_LC_NET_FLOW) {
    this.WEEKEND_LC_NET_FLOW = WEEKEND_LC_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_LC_NET_FLOW(java.math.BigDecimal WEEKEND_LC_NET_FLOW) {
    this.WEEKEND_LC_NET_FLOW = WEEKEND_LC_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_ZS_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_ZS_NET_NUM() {
    return WEEKEND_ZS_NET_NUM;
  }
  public void set_WEEKEND_ZS_NET_NUM(java.math.BigDecimal WEEKEND_ZS_NET_NUM) {
    this.WEEKEND_ZS_NET_NUM = WEEKEND_ZS_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_ZS_NET_NUM(java.math.BigDecimal WEEKEND_ZS_NET_NUM) {
    this.WEEKEND_ZS_NET_NUM = WEEKEND_ZS_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_ZS_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_ZS_NET_FLOW() {
    return WEEKEND_ZS_NET_FLOW;
  }
  public void set_WEEKEND_ZS_NET_FLOW(java.math.BigDecimal WEEKEND_ZS_NET_FLOW) {
    this.WEEKEND_ZS_NET_FLOW = WEEKEND_ZS_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_ZS_NET_FLOW(java.math.BigDecimal WEEKEND_ZS_NET_FLOW) {
    this.WEEKEND_ZS_NET_FLOW = WEEKEND_ZS_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_SW_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_SW_NET_NUM() {
    return WEEKEND_SW_NET_NUM;
  }
  public void set_WEEKEND_SW_NET_NUM(java.math.BigDecimal WEEKEND_SW_NET_NUM) {
    this.WEEKEND_SW_NET_NUM = WEEKEND_SW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_SW_NET_NUM(java.math.BigDecimal WEEKEND_SW_NET_NUM) {
    this.WEEKEND_SW_NET_NUM = WEEKEND_SW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_SW_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_SW_NET_FLOW() {
    return WEEKEND_SW_NET_FLOW;
  }
  public void set_WEEKEND_SW_NET_FLOW(java.math.BigDecimal WEEKEND_SW_NET_FLOW) {
    this.WEEKEND_SW_NET_FLOW = WEEKEND_SW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_SW_NET_FLOW(java.math.BigDecimal WEEKEND_SW_NET_FLOW) {
    this.WEEKEND_SW_NET_FLOW = WEEKEND_SW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_ZW_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_ZW_NET_NUM() {
    return WEEKEND_ZW_NET_NUM;
  }
  public void set_WEEKEND_ZW_NET_NUM(java.math.BigDecimal WEEKEND_ZW_NET_NUM) {
    this.WEEKEND_ZW_NET_NUM = WEEKEND_ZW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_ZW_NET_NUM(java.math.BigDecimal WEEKEND_ZW_NET_NUM) {
    this.WEEKEND_ZW_NET_NUM = WEEKEND_ZW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_ZW_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_ZW_NET_FLOW() {
    return WEEKEND_ZW_NET_FLOW;
  }
  public void set_WEEKEND_ZW_NET_FLOW(java.math.BigDecimal WEEKEND_ZW_NET_FLOW) {
    this.WEEKEND_ZW_NET_FLOW = WEEKEND_ZW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_ZW_NET_FLOW(java.math.BigDecimal WEEKEND_ZW_NET_FLOW) {
    this.WEEKEND_ZW_NET_FLOW = WEEKEND_ZW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_XW_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_XW_NET_NUM() {
    return WEEKEND_XW_NET_NUM;
  }
  public void set_WEEKEND_XW_NET_NUM(java.math.BigDecimal WEEKEND_XW_NET_NUM) {
    this.WEEKEND_XW_NET_NUM = WEEKEND_XW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_XW_NET_NUM(java.math.BigDecimal WEEKEND_XW_NET_NUM) {
    this.WEEKEND_XW_NET_NUM = WEEKEND_XW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_XW_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_XW_NET_FLOW() {
    return WEEKEND_XW_NET_FLOW;
  }
  public void set_WEEKEND_XW_NET_FLOW(java.math.BigDecimal WEEKEND_XW_NET_FLOW) {
    this.WEEKEND_XW_NET_FLOW = WEEKEND_XW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_XW_NET_FLOW(java.math.BigDecimal WEEKEND_XW_NET_FLOW) {
    this.WEEKEND_XW_NET_FLOW = WEEKEND_XW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_BW_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_BW_NET_NUM() {
    return WEEKEND_BW_NET_NUM;
  }
  public void set_WEEKEND_BW_NET_NUM(java.math.BigDecimal WEEKEND_BW_NET_NUM) {
    this.WEEKEND_BW_NET_NUM = WEEKEND_BW_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_BW_NET_NUM(java.math.BigDecimal WEEKEND_BW_NET_NUM) {
    this.WEEKEND_BW_NET_NUM = WEEKEND_BW_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_BW_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_BW_NET_FLOW() {
    return WEEKEND_BW_NET_FLOW;
  }
  public void set_WEEKEND_BW_NET_FLOW(java.math.BigDecimal WEEKEND_BW_NET_FLOW) {
    this.WEEKEND_BW_NET_FLOW = WEEKEND_BW_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_BW_NET_FLOW(java.math.BigDecimal WEEKEND_BW_NET_FLOW) {
    this.WEEKEND_BW_NET_FLOW = WEEKEND_BW_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_WS_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_WS_NET_NUM() {
    return WEEKEND_WS_NET_NUM;
  }
  public void set_WEEKEND_WS_NET_NUM(java.math.BigDecimal WEEKEND_WS_NET_NUM) {
    this.WEEKEND_WS_NET_NUM = WEEKEND_WS_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_WS_NET_NUM(java.math.BigDecimal WEEKEND_WS_NET_NUM) {
    this.WEEKEND_WS_NET_NUM = WEEKEND_WS_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_WS_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_WS_NET_FLOW() {
    return WEEKEND_WS_NET_FLOW;
  }
  public void set_WEEKEND_WS_NET_FLOW(java.math.BigDecimal WEEKEND_WS_NET_FLOW) {
    this.WEEKEND_WS_NET_FLOW = WEEKEND_WS_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_WS_NET_FLOW(java.math.BigDecimal WEEKEND_WS_NET_FLOW) {
    this.WEEKEND_WS_NET_FLOW = WEEKEND_WS_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal WEEKEND_WY_NET_NUM;
  public java.math.BigDecimal get_WEEKEND_WY_NET_NUM() {
    return WEEKEND_WY_NET_NUM;
  }
  public void set_WEEKEND_WY_NET_NUM(java.math.BigDecimal WEEKEND_WY_NET_NUM) {
    this.WEEKEND_WY_NET_NUM = WEEKEND_WY_NET_NUM;
  }
  public st_user_network_beh_m with_WEEKEND_WY_NET_NUM(java.math.BigDecimal WEEKEND_WY_NET_NUM) {
    this.WEEKEND_WY_NET_NUM = WEEKEND_WY_NET_NUM;
    return this;
  }
  private java.math.BigDecimal WEEKEND_WY_NET_FLOW;
  public java.math.BigDecimal get_WEEKEND_WY_NET_FLOW() {
    return WEEKEND_WY_NET_FLOW;
  }
  public void set_WEEKEND_WY_NET_FLOW(java.math.BigDecimal WEEKEND_WY_NET_FLOW) {
    this.WEEKEND_WY_NET_FLOW = WEEKEND_WY_NET_FLOW;
  }
  public st_user_network_beh_m with_WEEKEND_WY_NET_FLOW(java.math.BigDecimal WEEKEND_WY_NET_FLOW) {
    this.WEEKEND_WY_NET_FLOW = WEEKEND_WY_NET_FLOW;
    return this;
  }
  private java.math.BigDecimal PC_NET_TOTAL_TIME;
  public java.math.BigDecimal get_PC_NET_TOTAL_TIME() {
    return PC_NET_TOTAL_TIME;
  }
  public void set_PC_NET_TOTAL_TIME(java.math.BigDecimal PC_NET_TOTAL_TIME) {
    this.PC_NET_TOTAL_TIME = PC_NET_TOTAL_TIME;
  }
  public st_user_network_beh_m with_PC_NET_TOTAL_TIME(java.math.BigDecimal PC_NET_TOTAL_TIME) {
    this.PC_NET_TOTAL_TIME = PC_NET_TOTAL_TIME;
    return this;
  }
  private java.math.BigDecimal PC_NET_TOTAL_NUM;
  public java.math.BigDecimal get_PC_NET_TOTAL_NUM() {
    return PC_NET_TOTAL_NUM;
  }
  public void set_PC_NET_TOTAL_NUM(java.math.BigDecimal PC_NET_TOTAL_NUM) {
    this.PC_NET_TOTAL_NUM = PC_NET_TOTAL_NUM;
  }
  public st_user_network_beh_m with_PC_NET_TOTAL_NUM(java.math.BigDecimal PC_NET_TOTAL_NUM) {
    this.PC_NET_TOTAL_NUM = PC_NET_TOTAL_NUM;
    return this;
  }
  private java.math.BigDecimal MOBILE_NET_TOTAL_TIME;
  public java.math.BigDecimal get_MOBILE_NET_TOTAL_TIME() {
    return MOBILE_NET_TOTAL_TIME;
  }
  public void set_MOBILE_NET_TOTAL_TIME(java.math.BigDecimal MOBILE_NET_TOTAL_TIME) {
    this.MOBILE_NET_TOTAL_TIME = MOBILE_NET_TOTAL_TIME;
  }
  public st_user_network_beh_m with_MOBILE_NET_TOTAL_TIME(java.math.BigDecimal MOBILE_NET_TOTAL_TIME) {
    this.MOBILE_NET_TOTAL_TIME = MOBILE_NET_TOTAL_TIME;
    return this;
  }
  private java.math.BigDecimal MOBILE_NET_TOTAL_NUM;
  public java.math.BigDecimal get_MOBILE_NET_TOTAL_NUM() {
    return MOBILE_NET_TOTAL_NUM;
  }
  public void set_MOBILE_NET_TOTAL_NUM(java.math.BigDecimal MOBILE_NET_TOTAL_NUM) {
    this.MOBILE_NET_TOTAL_NUM = MOBILE_NET_TOTAL_NUM;
  }
  public st_user_network_beh_m with_MOBILE_NET_TOTAL_NUM(java.math.BigDecimal MOBILE_NET_TOTAL_NUM) {
    this.MOBILE_NET_TOTAL_NUM = MOBILE_NET_TOTAL_NUM;
    return this;
  }
  private String DOMAIN_NAME_1;
  public String get_DOMAIN_NAME_1() {
    return DOMAIN_NAME_1;
  }
  public void set_DOMAIN_NAME_1(String DOMAIN_NAME_1) {
    this.DOMAIN_NAME_1 = DOMAIN_NAME_1;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_1(String DOMAIN_NAME_1) {
    this.DOMAIN_NAME_1 = DOMAIN_NAME_1;
    return this;
  }
  private String DOMAIN_TYPE_1;
  public String get_DOMAIN_TYPE_1() {
    return DOMAIN_TYPE_1;
  }
  public void set_DOMAIN_TYPE_1(String DOMAIN_TYPE_1) {
    this.DOMAIN_TYPE_1 = DOMAIN_TYPE_1;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_1(String DOMAIN_TYPE_1) {
    this.DOMAIN_TYPE_1 = DOMAIN_TYPE_1;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_1;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_1() {
    return DOMAIN_NAME_NUM_1;
  }
  public void set_DOMAIN_NAME_NUM_1(java.math.BigDecimal DOMAIN_NAME_NUM_1) {
    this.DOMAIN_NAME_NUM_1 = DOMAIN_NAME_NUM_1;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_1(java.math.BigDecimal DOMAIN_NAME_NUM_1) {
    this.DOMAIN_NAME_NUM_1 = DOMAIN_NAME_NUM_1;
    return this;
  }
  private String DOMAIN_NAME_2;
  public String get_DOMAIN_NAME_2() {
    return DOMAIN_NAME_2;
  }
  public void set_DOMAIN_NAME_2(String DOMAIN_NAME_2) {
    this.DOMAIN_NAME_2 = DOMAIN_NAME_2;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_2(String DOMAIN_NAME_2) {
    this.DOMAIN_NAME_2 = DOMAIN_NAME_2;
    return this;
  }
  private String DOMAIN_TYPE_2;
  public String get_DOMAIN_TYPE_2() {
    return DOMAIN_TYPE_2;
  }
  public void set_DOMAIN_TYPE_2(String DOMAIN_TYPE_2) {
    this.DOMAIN_TYPE_2 = DOMAIN_TYPE_2;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_2(String DOMAIN_TYPE_2) {
    this.DOMAIN_TYPE_2 = DOMAIN_TYPE_2;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_2;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_2() {
    return DOMAIN_NAME_NUM_2;
  }
  public void set_DOMAIN_NAME_NUM_2(java.math.BigDecimal DOMAIN_NAME_NUM_2) {
    this.DOMAIN_NAME_NUM_2 = DOMAIN_NAME_NUM_2;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_2(java.math.BigDecimal DOMAIN_NAME_NUM_2) {
    this.DOMAIN_NAME_NUM_2 = DOMAIN_NAME_NUM_2;
    return this;
  }
  private String DOMAIN_NAME_3;
  public String get_DOMAIN_NAME_3() {
    return DOMAIN_NAME_3;
  }
  public void set_DOMAIN_NAME_3(String DOMAIN_NAME_3) {
    this.DOMAIN_NAME_3 = DOMAIN_NAME_3;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_3(String DOMAIN_NAME_3) {
    this.DOMAIN_NAME_3 = DOMAIN_NAME_3;
    return this;
  }
  private String DOMAIN_TYPE_3;
  public String get_DOMAIN_TYPE_3() {
    return DOMAIN_TYPE_3;
  }
  public void set_DOMAIN_TYPE_3(String DOMAIN_TYPE_3) {
    this.DOMAIN_TYPE_3 = DOMAIN_TYPE_3;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_3(String DOMAIN_TYPE_3) {
    this.DOMAIN_TYPE_3 = DOMAIN_TYPE_3;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_3;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_3() {
    return DOMAIN_NAME_NUM_3;
  }
  public void set_DOMAIN_NAME_NUM_3(java.math.BigDecimal DOMAIN_NAME_NUM_3) {
    this.DOMAIN_NAME_NUM_3 = DOMAIN_NAME_NUM_3;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_3(java.math.BigDecimal DOMAIN_NAME_NUM_3) {
    this.DOMAIN_NAME_NUM_3 = DOMAIN_NAME_NUM_3;
    return this;
  }
  private String DOMAIN_NAME_4;
  public String get_DOMAIN_NAME_4() {
    return DOMAIN_NAME_4;
  }
  public void set_DOMAIN_NAME_4(String DOMAIN_NAME_4) {
    this.DOMAIN_NAME_4 = DOMAIN_NAME_4;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_4(String DOMAIN_NAME_4) {
    this.DOMAIN_NAME_4 = DOMAIN_NAME_4;
    return this;
  }
  private String DOMAIN_TYPE_4;
  public String get_DOMAIN_TYPE_4() {
    return DOMAIN_TYPE_4;
  }
  public void set_DOMAIN_TYPE_4(String DOMAIN_TYPE_4) {
    this.DOMAIN_TYPE_4 = DOMAIN_TYPE_4;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_4(String DOMAIN_TYPE_4) {
    this.DOMAIN_TYPE_4 = DOMAIN_TYPE_4;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_4;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_4() {
    return DOMAIN_NAME_NUM_4;
  }
  public void set_DOMAIN_NAME_NUM_4(java.math.BigDecimal DOMAIN_NAME_NUM_4) {
    this.DOMAIN_NAME_NUM_4 = DOMAIN_NAME_NUM_4;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_4(java.math.BigDecimal DOMAIN_NAME_NUM_4) {
    this.DOMAIN_NAME_NUM_4 = DOMAIN_NAME_NUM_4;
    return this;
  }
  private String DOMAIN_NAME_5;
  public String get_DOMAIN_NAME_5() {
    return DOMAIN_NAME_5;
  }
  public void set_DOMAIN_NAME_5(String DOMAIN_NAME_5) {
    this.DOMAIN_NAME_5 = DOMAIN_NAME_5;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_5(String DOMAIN_NAME_5) {
    this.DOMAIN_NAME_5 = DOMAIN_NAME_5;
    return this;
  }
  private String DOMAIN_TYPE_5;
  public String get_DOMAIN_TYPE_5() {
    return DOMAIN_TYPE_5;
  }
  public void set_DOMAIN_TYPE_5(String DOMAIN_TYPE_5) {
    this.DOMAIN_TYPE_5 = DOMAIN_TYPE_5;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_5(String DOMAIN_TYPE_5) {
    this.DOMAIN_TYPE_5 = DOMAIN_TYPE_5;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_5;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_5() {
    return DOMAIN_NAME_NUM_5;
  }
  public void set_DOMAIN_NAME_NUM_5(java.math.BigDecimal DOMAIN_NAME_NUM_5) {
    this.DOMAIN_NAME_NUM_5 = DOMAIN_NAME_NUM_5;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_5(java.math.BigDecimal DOMAIN_NAME_NUM_5) {
    this.DOMAIN_NAME_NUM_5 = DOMAIN_NAME_NUM_5;
    return this;
  }
  private String DOMAIN_NAME_6;
  public String get_DOMAIN_NAME_6() {
    return DOMAIN_NAME_6;
  }
  public void set_DOMAIN_NAME_6(String DOMAIN_NAME_6) {
    this.DOMAIN_NAME_6 = DOMAIN_NAME_6;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_6(String DOMAIN_NAME_6) {
    this.DOMAIN_NAME_6 = DOMAIN_NAME_6;
    return this;
  }
  private String DOMAIN_TYPE_6;
  public String get_DOMAIN_TYPE_6() {
    return DOMAIN_TYPE_6;
  }
  public void set_DOMAIN_TYPE_6(String DOMAIN_TYPE_6) {
    this.DOMAIN_TYPE_6 = DOMAIN_TYPE_6;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_6(String DOMAIN_TYPE_6) {
    this.DOMAIN_TYPE_6 = DOMAIN_TYPE_6;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_6;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_6() {
    return DOMAIN_NAME_NUM_6;
  }
  public void set_DOMAIN_NAME_NUM_6(java.math.BigDecimal DOMAIN_NAME_NUM_6) {
    this.DOMAIN_NAME_NUM_6 = DOMAIN_NAME_NUM_6;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_6(java.math.BigDecimal DOMAIN_NAME_NUM_6) {
    this.DOMAIN_NAME_NUM_6 = DOMAIN_NAME_NUM_6;
    return this;
  }
  private String DOMAIN_NAME_7;
  public String get_DOMAIN_NAME_7() {
    return DOMAIN_NAME_7;
  }
  public void set_DOMAIN_NAME_7(String DOMAIN_NAME_7) {
    this.DOMAIN_NAME_7 = DOMAIN_NAME_7;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_7(String DOMAIN_NAME_7) {
    this.DOMAIN_NAME_7 = DOMAIN_NAME_7;
    return this;
  }
  private String DOMAIN_TYPE_7;
  public String get_DOMAIN_TYPE_7() {
    return DOMAIN_TYPE_7;
  }
  public void set_DOMAIN_TYPE_7(String DOMAIN_TYPE_7) {
    this.DOMAIN_TYPE_7 = DOMAIN_TYPE_7;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_7(String DOMAIN_TYPE_7) {
    this.DOMAIN_TYPE_7 = DOMAIN_TYPE_7;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_7;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_7() {
    return DOMAIN_NAME_NUM_7;
  }
  public void set_DOMAIN_NAME_NUM_7(java.math.BigDecimal DOMAIN_NAME_NUM_7) {
    this.DOMAIN_NAME_NUM_7 = DOMAIN_NAME_NUM_7;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_7(java.math.BigDecimal DOMAIN_NAME_NUM_7) {
    this.DOMAIN_NAME_NUM_7 = DOMAIN_NAME_NUM_7;
    return this;
  }
  private String DOMAIN_NAME_8;
  public String get_DOMAIN_NAME_8() {
    return DOMAIN_NAME_8;
  }
  public void set_DOMAIN_NAME_8(String DOMAIN_NAME_8) {
    this.DOMAIN_NAME_8 = DOMAIN_NAME_8;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_8(String DOMAIN_NAME_8) {
    this.DOMAIN_NAME_8 = DOMAIN_NAME_8;
    return this;
  }
  private String DOMAIN_TYPE_8;
  public String get_DOMAIN_TYPE_8() {
    return DOMAIN_TYPE_8;
  }
  public void set_DOMAIN_TYPE_8(String DOMAIN_TYPE_8) {
    this.DOMAIN_TYPE_8 = DOMAIN_TYPE_8;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_8(String DOMAIN_TYPE_8) {
    this.DOMAIN_TYPE_8 = DOMAIN_TYPE_8;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_8;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_8() {
    return DOMAIN_NAME_NUM_8;
  }
  public void set_DOMAIN_NAME_NUM_8(java.math.BigDecimal DOMAIN_NAME_NUM_8) {
    this.DOMAIN_NAME_NUM_8 = DOMAIN_NAME_NUM_8;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_8(java.math.BigDecimal DOMAIN_NAME_NUM_8) {
    this.DOMAIN_NAME_NUM_8 = DOMAIN_NAME_NUM_8;
    return this;
  }
  private String DOMAIN_NAME_9;
  public String get_DOMAIN_NAME_9() {
    return DOMAIN_NAME_9;
  }
  public void set_DOMAIN_NAME_9(String DOMAIN_NAME_9) {
    this.DOMAIN_NAME_9 = DOMAIN_NAME_9;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_9(String DOMAIN_NAME_9) {
    this.DOMAIN_NAME_9 = DOMAIN_NAME_9;
    return this;
  }
  private String DOMAIN_TYPE_9;
  public String get_DOMAIN_TYPE_9() {
    return DOMAIN_TYPE_9;
  }
  public void set_DOMAIN_TYPE_9(String DOMAIN_TYPE_9) {
    this.DOMAIN_TYPE_9 = DOMAIN_TYPE_9;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_9(String DOMAIN_TYPE_9) {
    this.DOMAIN_TYPE_9 = DOMAIN_TYPE_9;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_9;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_9() {
    return DOMAIN_NAME_NUM_9;
  }
  public void set_DOMAIN_NAME_NUM_9(java.math.BigDecimal DOMAIN_NAME_NUM_9) {
    this.DOMAIN_NAME_NUM_9 = DOMAIN_NAME_NUM_9;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_9(java.math.BigDecimal DOMAIN_NAME_NUM_9) {
    this.DOMAIN_NAME_NUM_9 = DOMAIN_NAME_NUM_9;
    return this;
  }
  private String DOMAIN_NAME_10;
  public String get_DOMAIN_NAME_10() {
    return DOMAIN_NAME_10;
  }
  public void set_DOMAIN_NAME_10(String DOMAIN_NAME_10) {
    this.DOMAIN_NAME_10 = DOMAIN_NAME_10;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_10(String DOMAIN_NAME_10) {
    this.DOMAIN_NAME_10 = DOMAIN_NAME_10;
    return this;
  }
  private String DOMAIN_TYPE_10;
  public String get_DOMAIN_TYPE_10() {
    return DOMAIN_TYPE_10;
  }
  public void set_DOMAIN_TYPE_10(String DOMAIN_TYPE_10) {
    this.DOMAIN_TYPE_10 = DOMAIN_TYPE_10;
  }
  public st_user_network_beh_m with_DOMAIN_TYPE_10(String DOMAIN_TYPE_10) {
    this.DOMAIN_TYPE_10 = DOMAIN_TYPE_10;
    return this;
  }
  private java.math.BigDecimal DOMAIN_NAME_NUM_10;
  public java.math.BigDecimal get_DOMAIN_NAME_NUM_10() {
    return DOMAIN_NAME_NUM_10;
  }
  public void set_DOMAIN_NAME_NUM_10(java.math.BigDecimal DOMAIN_NAME_NUM_10) {
    this.DOMAIN_NAME_NUM_10 = DOMAIN_NAME_NUM_10;
  }
  public st_user_network_beh_m with_DOMAIN_NAME_NUM_10(java.math.BigDecimal DOMAIN_NAME_NUM_10) {
    this.DOMAIN_NAME_NUM_10 = DOMAIN_NAME_NUM_10;
    return this;
  }
  private String WEBSITE_TYPE_1;
  public String get_WEBSITE_TYPE_1() {
    return WEBSITE_TYPE_1;
  }
  public void set_WEBSITE_TYPE_1(String WEBSITE_TYPE_1) {
    this.WEBSITE_TYPE_1 = WEBSITE_TYPE_1;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_1(String WEBSITE_TYPE_1) {
    this.WEBSITE_TYPE_1 = WEBSITE_TYPE_1;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_1;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_1() {
    return WEBSITE_TYPE_NUM_1;
  }
  public void set_WEBSITE_TYPE_NUM_1(java.math.BigDecimal WEBSITE_TYPE_NUM_1) {
    this.WEBSITE_TYPE_NUM_1 = WEBSITE_TYPE_NUM_1;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_1(java.math.BigDecimal WEBSITE_TYPE_NUM_1) {
    this.WEBSITE_TYPE_NUM_1 = WEBSITE_TYPE_NUM_1;
    return this;
  }
  private String WEBSITE_TYPE_2;
  public String get_WEBSITE_TYPE_2() {
    return WEBSITE_TYPE_2;
  }
  public void set_WEBSITE_TYPE_2(String WEBSITE_TYPE_2) {
    this.WEBSITE_TYPE_2 = WEBSITE_TYPE_2;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_2(String WEBSITE_TYPE_2) {
    this.WEBSITE_TYPE_2 = WEBSITE_TYPE_2;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_2;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_2() {
    return WEBSITE_TYPE_NUM_2;
  }
  public void set_WEBSITE_TYPE_NUM_2(java.math.BigDecimal WEBSITE_TYPE_NUM_2) {
    this.WEBSITE_TYPE_NUM_2 = WEBSITE_TYPE_NUM_2;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_2(java.math.BigDecimal WEBSITE_TYPE_NUM_2) {
    this.WEBSITE_TYPE_NUM_2 = WEBSITE_TYPE_NUM_2;
    return this;
  }
  private String WEBSITE_TYPE_3;
  public String get_WEBSITE_TYPE_3() {
    return WEBSITE_TYPE_3;
  }
  public void set_WEBSITE_TYPE_3(String WEBSITE_TYPE_3) {
    this.WEBSITE_TYPE_3 = WEBSITE_TYPE_3;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_3(String WEBSITE_TYPE_3) {
    this.WEBSITE_TYPE_3 = WEBSITE_TYPE_3;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_3;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_3() {
    return WEBSITE_TYPE_NUM_3;
  }
  public void set_WEBSITE_TYPE_NUM_3(java.math.BigDecimal WEBSITE_TYPE_NUM_3) {
    this.WEBSITE_TYPE_NUM_3 = WEBSITE_TYPE_NUM_3;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_3(java.math.BigDecimal WEBSITE_TYPE_NUM_3) {
    this.WEBSITE_TYPE_NUM_3 = WEBSITE_TYPE_NUM_3;
    return this;
  }
  private String WEBSITE_TYPE_4;
  public String get_WEBSITE_TYPE_4() {
    return WEBSITE_TYPE_4;
  }
  public void set_WEBSITE_TYPE_4(String WEBSITE_TYPE_4) {
    this.WEBSITE_TYPE_4 = WEBSITE_TYPE_4;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_4(String WEBSITE_TYPE_4) {
    this.WEBSITE_TYPE_4 = WEBSITE_TYPE_4;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_4;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_4() {
    return WEBSITE_TYPE_NUM_4;
  }
  public void set_WEBSITE_TYPE_NUM_4(java.math.BigDecimal WEBSITE_TYPE_NUM_4) {
    this.WEBSITE_TYPE_NUM_4 = WEBSITE_TYPE_NUM_4;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_4(java.math.BigDecimal WEBSITE_TYPE_NUM_4) {
    this.WEBSITE_TYPE_NUM_4 = WEBSITE_TYPE_NUM_4;
    return this;
  }
  private String WEBSITE_TYPE_5;
  public String get_WEBSITE_TYPE_5() {
    return WEBSITE_TYPE_5;
  }
  public void set_WEBSITE_TYPE_5(String WEBSITE_TYPE_5) {
    this.WEBSITE_TYPE_5 = WEBSITE_TYPE_5;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_5(String WEBSITE_TYPE_5) {
    this.WEBSITE_TYPE_5 = WEBSITE_TYPE_5;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_5;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_5() {
    return WEBSITE_TYPE_NUM_5;
  }
  public void set_WEBSITE_TYPE_NUM_5(java.math.BigDecimal WEBSITE_TYPE_NUM_5) {
    this.WEBSITE_TYPE_NUM_5 = WEBSITE_TYPE_NUM_5;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_5(java.math.BigDecimal WEBSITE_TYPE_NUM_5) {
    this.WEBSITE_TYPE_NUM_5 = WEBSITE_TYPE_NUM_5;
    return this;
  }
  private String WEBSITE_TYPE_6;
  public String get_WEBSITE_TYPE_6() {
    return WEBSITE_TYPE_6;
  }
  public void set_WEBSITE_TYPE_6(String WEBSITE_TYPE_6) {
    this.WEBSITE_TYPE_6 = WEBSITE_TYPE_6;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_6(String WEBSITE_TYPE_6) {
    this.WEBSITE_TYPE_6 = WEBSITE_TYPE_6;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_6;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_6() {
    return WEBSITE_TYPE_NUM_6;
  }
  public void set_WEBSITE_TYPE_NUM_6(java.math.BigDecimal WEBSITE_TYPE_NUM_6) {
    this.WEBSITE_TYPE_NUM_6 = WEBSITE_TYPE_NUM_6;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_6(java.math.BigDecimal WEBSITE_TYPE_NUM_6) {
    this.WEBSITE_TYPE_NUM_6 = WEBSITE_TYPE_NUM_6;
    return this;
  }
  private String WEBSITE_TYPE_7;
  public String get_WEBSITE_TYPE_7() {
    return WEBSITE_TYPE_7;
  }
  public void set_WEBSITE_TYPE_7(String WEBSITE_TYPE_7) {
    this.WEBSITE_TYPE_7 = WEBSITE_TYPE_7;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_7(String WEBSITE_TYPE_7) {
    this.WEBSITE_TYPE_7 = WEBSITE_TYPE_7;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_7;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_7() {
    return WEBSITE_TYPE_NUM_7;
  }
  public void set_WEBSITE_TYPE_NUM_7(java.math.BigDecimal WEBSITE_TYPE_NUM_7) {
    this.WEBSITE_TYPE_NUM_7 = WEBSITE_TYPE_NUM_7;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_7(java.math.BigDecimal WEBSITE_TYPE_NUM_7) {
    this.WEBSITE_TYPE_NUM_7 = WEBSITE_TYPE_NUM_7;
    return this;
  }
  private String WEBSITE_TYPE_8;
  public String get_WEBSITE_TYPE_8() {
    return WEBSITE_TYPE_8;
  }
  public void set_WEBSITE_TYPE_8(String WEBSITE_TYPE_8) {
    this.WEBSITE_TYPE_8 = WEBSITE_TYPE_8;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_8(String WEBSITE_TYPE_8) {
    this.WEBSITE_TYPE_8 = WEBSITE_TYPE_8;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_8;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_8() {
    return WEBSITE_TYPE_NUM_8;
  }
  public void set_WEBSITE_TYPE_NUM_8(java.math.BigDecimal WEBSITE_TYPE_NUM_8) {
    this.WEBSITE_TYPE_NUM_8 = WEBSITE_TYPE_NUM_8;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_8(java.math.BigDecimal WEBSITE_TYPE_NUM_8) {
    this.WEBSITE_TYPE_NUM_8 = WEBSITE_TYPE_NUM_8;
    return this;
  }
  private String WEBSITE_TYPE_9;
  public String get_WEBSITE_TYPE_9() {
    return WEBSITE_TYPE_9;
  }
  public void set_WEBSITE_TYPE_9(String WEBSITE_TYPE_9) {
    this.WEBSITE_TYPE_9 = WEBSITE_TYPE_9;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_9(String WEBSITE_TYPE_9) {
    this.WEBSITE_TYPE_9 = WEBSITE_TYPE_9;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_9;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_9() {
    return WEBSITE_TYPE_NUM_9;
  }
  public void set_WEBSITE_TYPE_NUM_9(java.math.BigDecimal WEBSITE_TYPE_NUM_9) {
    this.WEBSITE_TYPE_NUM_9 = WEBSITE_TYPE_NUM_9;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_9(java.math.BigDecimal WEBSITE_TYPE_NUM_9) {
    this.WEBSITE_TYPE_NUM_9 = WEBSITE_TYPE_NUM_9;
    return this;
  }
  private String WEBSITE_TYPE_10;
  public String get_WEBSITE_TYPE_10() {
    return WEBSITE_TYPE_10;
  }
  public void set_WEBSITE_TYPE_10(String WEBSITE_TYPE_10) {
    this.WEBSITE_TYPE_10 = WEBSITE_TYPE_10;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_10(String WEBSITE_TYPE_10) {
    this.WEBSITE_TYPE_10 = WEBSITE_TYPE_10;
    return this;
  }
  private java.math.BigDecimal WEBSITE_TYPE_NUM_10;
  public java.math.BigDecimal get_WEBSITE_TYPE_NUM_10() {
    return WEBSITE_TYPE_NUM_10;
  }
  public void set_WEBSITE_TYPE_NUM_10(java.math.BigDecimal WEBSITE_TYPE_NUM_10) {
    this.WEBSITE_TYPE_NUM_10 = WEBSITE_TYPE_NUM_10;
  }
  public st_user_network_beh_m with_WEBSITE_TYPE_NUM_10(java.math.BigDecimal WEBSITE_TYPE_NUM_10) {
    this.WEBSITE_TYPE_NUM_10 = WEBSITE_TYPE_NUM_10;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_user_network_beh_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
    return this;
  }
  private String PT_MON;
  public String get_PT_MON() {
    return PT_MON;
  }
  public void set_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
  }
  public st_user_network_beh_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_network_beh_m)) {
      return false;
    }
    st_user_network_beh_m that = (st_user_network_beh_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TOTAL_USER_COUNT == null ? that.TOTAL_USER_COUNT == null : this.TOTAL_USER_COUNT.equals(that.TOTAL_USER_COUNT));
    equal = equal && (this.BW_10M_USER_COUNT == null ? that.BW_10M_USER_COUNT == null : this.BW_10M_USER_COUNT.equals(that.BW_10M_USER_COUNT));
    equal = equal && (this.BW_20M_USER_COUNT == null ? that.BW_20M_USER_COUNT == null : this.BW_20M_USER_COUNT.equals(that.BW_20M_USER_COUNT));
    equal = equal && (this.BW_50M_USER_COUNT == null ? that.BW_50M_USER_COUNT == null : this.BW_50M_USER_COUNT.equals(that.BW_50M_USER_COUNT));
    equal = equal && (this.BW_OTHERS_USER_COUNT == null ? that.BW_OTHERS_USER_COUNT == null : this.BW_OTHERS_USER_COUNT.equals(that.BW_OTHERS_USER_COUNT));
    equal = equal && (this.TOTAL_NET_FLOW == null ? that.TOTAL_NET_FLOW == null : this.TOTAL_NET_FLOW.equals(that.TOTAL_NET_FLOW));
    equal = equal && (this.SBZ_NOT_YMZ_COUNT == null ? that.SBZ_NOT_YMZ_COUNT == null : this.SBZ_NOT_YMZ_COUNT.equals(that.SBZ_NOT_YMZ_COUNT));
    equal = equal && (this.YMZ_NOT_SBZ_COUNT == null ? that.YMZ_NOT_SBZ_COUNT == null : this.YMZ_NOT_SBZ_COUNT.equals(that.YMZ_NOT_SBZ_COUNT));
    equal = equal && (this.YMZ_AND_SBZ_COUNT == null ? that.YMZ_AND_SBZ_COUNT == null : this.YMZ_AND_SBZ_COUNT.equals(that.YMZ_AND_SBZ_COUNT));
    equal = equal && (this.OTHERS_COUNT == null ? that.OTHERS_COUNT == null : this.OTHERS_COUNT.equals(that.OTHERS_COUNT));
    equal = equal && (this.WEEKDAY_NET_NUM == null ? that.WEEKDAY_NET_NUM == null : this.WEEKDAY_NET_NUM.equals(that.WEEKDAY_NET_NUM));
    equal = equal && (this.WEEKDAY_NET_FLOW == null ? that.WEEKDAY_NET_FLOW == null : this.WEEKDAY_NET_FLOW.equals(that.WEEKDAY_NET_FLOW));
    equal = equal && (this.WEEKEND_NET_NUM == null ? that.WEEKEND_NET_NUM == null : this.WEEKEND_NET_NUM.equals(that.WEEKEND_NET_NUM));
    equal = equal && (this.WEEKEND_NET_FLOW == null ? that.WEEKEND_NET_FLOW == null : this.WEEKEND_NET_FLOW.equals(that.WEEKEND_NET_FLOW));
    equal = equal && (this.WEEKDAY_LC_NET_NUM == null ? that.WEEKDAY_LC_NET_NUM == null : this.WEEKDAY_LC_NET_NUM.equals(that.WEEKDAY_LC_NET_NUM));
    equal = equal && (this.WEEKDAY_LC_NET_FLOW == null ? that.WEEKDAY_LC_NET_FLOW == null : this.WEEKDAY_LC_NET_FLOW.equals(that.WEEKDAY_LC_NET_FLOW));
    equal = equal && (this.WEEKDAY_ZS_NET_NUM == null ? that.WEEKDAY_ZS_NET_NUM == null : this.WEEKDAY_ZS_NET_NUM.equals(that.WEEKDAY_ZS_NET_NUM));
    equal = equal && (this.WEEKDAY_ZS_NET_FLOW == null ? that.WEEKDAY_ZS_NET_FLOW == null : this.WEEKDAY_ZS_NET_FLOW.equals(that.WEEKDAY_ZS_NET_FLOW));
    equal = equal && (this.WEEKDAY_SW_NET_NUM == null ? that.WEEKDAY_SW_NET_NUM == null : this.WEEKDAY_SW_NET_NUM.equals(that.WEEKDAY_SW_NET_NUM));
    equal = equal && (this.WEEKDAY_SW_NET_FLOW == null ? that.WEEKDAY_SW_NET_FLOW == null : this.WEEKDAY_SW_NET_FLOW.equals(that.WEEKDAY_SW_NET_FLOW));
    equal = equal && (this.WEEKDAY_ZW_NET_NUM == null ? that.WEEKDAY_ZW_NET_NUM == null : this.WEEKDAY_ZW_NET_NUM.equals(that.WEEKDAY_ZW_NET_NUM));
    equal = equal && (this.WEEKDAY_ZW_NET_FLOW == null ? that.WEEKDAY_ZW_NET_FLOW == null : this.WEEKDAY_ZW_NET_FLOW.equals(that.WEEKDAY_ZW_NET_FLOW));
    equal = equal && (this.WEEKDAY_XW_NET_NUM == null ? that.WEEKDAY_XW_NET_NUM == null : this.WEEKDAY_XW_NET_NUM.equals(that.WEEKDAY_XW_NET_NUM));
    equal = equal && (this.WEEKDAY_XW_NET_FLOW == null ? that.WEEKDAY_XW_NET_FLOW == null : this.WEEKDAY_XW_NET_FLOW.equals(that.WEEKDAY_XW_NET_FLOW));
    equal = equal && (this.WEEKDAY_BW_NET_NUM == null ? that.WEEKDAY_BW_NET_NUM == null : this.WEEKDAY_BW_NET_NUM.equals(that.WEEKDAY_BW_NET_NUM));
    equal = equal && (this.WEEKDAY_BW_NET_FLOW == null ? that.WEEKDAY_BW_NET_FLOW == null : this.WEEKDAY_BW_NET_FLOW.equals(that.WEEKDAY_BW_NET_FLOW));
    equal = equal && (this.WEEKDAY_WS_NET_NUM == null ? that.WEEKDAY_WS_NET_NUM == null : this.WEEKDAY_WS_NET_NUM.equals(that.WEEKDAY_WS_NET_NUM));
    equal = equal && (this.WEEKDAY_WS_NET_FLOW == null ? that.WEEKDAY_WS_NET_FLOW == null : this.WEEKDAY_WS_NET_FLOW.equals(that.WEEKDAY_WS_NET_FLOW));
    equal = equal && (this.WEEKDAY_WY_NET_NUM == null ? that.WEEKDAY_WY_NET_NUM == null : this.WEEKDAY_WY_NET_NUM.equals(that.WEEKDAY_WY_NET_NUM));
    equal = equal && (this.WEEKDAY_WY_NET_FLOW == null ? that.WEEKDAY_WY_NET_FLOW == null : this.WEEKDAY_WY_NET_FLOW.equals(that.WEEKDAY_WY_NET_FLOW));
    equal = equal && (this.WEEKEND_LC_NET_NUM == null ? that.WEEKEND_LC_NET_NUM == null : this.WEEKEND_LC_NET_NUM.equals(that.WEEKEND_LC_NET_NUM));
    equal = equal && (this.WEEKEND_LC_NET_FLOW == null ? that.WEEKEND_LC_NET_FLOW == null : this.WEEKEND_LC_NET_FLOW.equals(that.WEEKEND_LC_NET_FLOW));
    equal = equal && (this.WEEKEND_ZS_NET_NUM == null ? that.WEEKEND_ZS_NET_NUM == null : this.WEEKEND_ZS_NET_NUM.equals(that.WEEKEND_ZS_NET_NUM));
    equal = equal && (this.WEEKEND_ZS_NET_FLOW == null ? that.WEEKEND_ZS_NET_FLOW == null : this.WEEKEND_ZS_NET_FLOW.equals(that.WEEKEND_ZS_NET_FLOW));
    equal = equal && (this.WEEKEND_SW_NET_NUM == null ? that.WEEKEND_SW_NET_NUM == null : this.WEEKEND_SW_NET_NUM.equals(that.WEEKEND_SW_NET_NUM));
    equal = equal && (this.WEEKEND_SW_NET_FLOW == null ? that.WEEKEND_SW_NET_FLOW == null : this.WEEKEND_SW_NET_FLOW.equals(that.WEEKEND_SW_NET_FLOW));
    equal = equal && (this.WEEKEND_ZW_NET_NUM == null ? that.WEEKEND_ZW_NET_NUM == null : this.WEEKEND_ZW_NET_NUM.equals(that.WEEKEND_ZW_NET_NUM));
    equal = equal && (this.WEEKEND_ZW_NET_FLOW == null ? that.WEEKEND_ZW_NET_FLOW == null : this.WEEKEND_ZW_NET_FLOW.equals(that.WEEKEND_ZW_NET_FLOW));
    equal = equal && (this.WEEKEND_XW_NET_NUM == null ? that.WEEKEND_XW_NET_NUM == null : this.WEEKEND_XW_NET_NUM.equals(that.WEEKEND_XW_NET_NUM));
    equal = equal && (this.WEEKEND_XW_NET_FLOW == null ? that.WEEKEND_XW_NET_FLOW == null : this.WEEKEND_XW_NET_FLOW.equals(that.WEEKEND_XW_NET_FLOW));
    equal = equal && (this.WEEKEND_BW_NET_NUM == null ? that.WEEKEND_BW_NET_NUM == null : this.WEEKEND_BW_NET_NUM.equals(that.WEEKEND_BW_NET_NUM));
    equal = equal && (this.WEEKEND_BW_NET_FLOW == null ? that.WEEKEND_BW_NET_FLOW == null : this.WEEKEND_BW_NET_FLOW.equals(that.WEEKEND_BW_NET_FLOW));
    equal = equal && (this.WEEKEND_WS_NET_NUM == null ? that.WEEKEND_WS_NET_NUM == null : this.WEEKEND_WS_NET_NUM.equals(that.WEEKEND_WS_NET_NUM));
    equal = equal && (this.WEEKEND_WS_NET_FLOW == null ? that.WEEKEND_WS_NET_FLOW == null : this.WEEKEND_WS_NET_FLOW.equals(that.WEEKEND_WS_NET_FLOW));
    equal = equal && (this.WEEKEND_WY_NET_NUM == null ? that.WEEKEND_WY_NET_NUM == null : this.WEEKEND_WY_NET_NUM.equals(that.WEEKEND_WY_NET_NUM));
    equal = equal && (this.WEEKEND_WY_NET_FLOW == null ? that.WEEKEND_WY_NET_FLOW == null : this.WEEKEND_WY_NET_FLOW.equals(that.WEEKEND_WY_NET_FLOW));
    equal = equal && (this.PC_NET_TOTAL_TIME == null ? that.PC_NET_TOTAL_TIME == null : this.PC_NET_TOTAL_TIME.equals(that.PC_NET_TOTAL_TIME));
    equal = equal && (this.PC_NET_TOTAL_NUM == null ? that.PC_NET_TOTAL_NUM == null : this.PC_NET_TOTAL_NUM.equals(that.PC_NET_TOTAL_NUM));
    equal = equal && (this.MOBILE_NET_TOTAL_TIME == null ? that.MOBILE_NET_TOTAL_TIME == null : this.MOBILE_NET_TOTAL_TIME.equals(that.MOBILE_NET_TOTAL_TIME));
    equal = equal && (this.MOBILE_NET_TOTAL_NUM == null ? that.MOBILE_NET_TOTAL_NUM == null : this.MOBILE_NET_TOTAL_NUM.equals(that.MOBILE_NET_TOTAL_NUM));
    equal = equal && (this.DOMAIN_NAME_1 == null ? that.DOMAIN_NAME_1 == null : this.DOMAIN_NAME_1.equals(that.DOMAIN_NAME_1));
    equal = equal && (this.DOMAIN_TYPE_1 == null ? that.DOMAIN_TYPE_1 == null : this.DOMAIN_TYPE_1.equals(that.DOMAIN_TYPE_1));
    equal = equal && (this.DOMAIN_NAME_NUM_1 == null ? that.DOMAIN_NAME_NUM_1 == null : this.DOMAIN_NAME_NUM_1.equals(that.DOMAIN_NAME_NUM_1));
    equal = equal && (this.DOMAIN_NAME_2 == null ? that.DOMAIN_NAME_2 == null : this.DOMAIN_NAME_2.equals(that.DOMAIN_NAME_2));
    equal = equal && (this.DOMAIN_TYPE_2 == null ? that.DOMAIN_TYPE_2 == null : this.DOMAIN_TYPE_2.equals(that.DOMAIN_TYPE_2));
    equal = equal && (this.DOMAIN_NAME_NUM_2 == null ? that.DOMAIN_NAME_NUM_2 == null : this.DOMAIN_NAME_NUM_2.equals(that.DOMAIN_NAME_NUM_2));
    equal = equal && (this.DOMAIN_NAME_3 == null ? that.DOMAIN_NAME_3 == null : this.DOMAIN_NAME_3.equals(that.DOMAIN_NAME_3));
    equal = equal && (this.DOMAIN_TYPE_3 == null ? that.DOMAIN_TYPE_3 == null : this.DOMAIN_TYPE_3.equals(that.DOMAIN_TYPE_3));
    equal = equal && (this.DOMAIN_NAME_NUM_3 == null ? that.DOMAIN_NAME_NUM_3 == null : this.DOMAIN_NAME_NUM_3.equals(that.DOMAIN_NAME_NUM_3));
    equal = equal && (this.DOMAIN_NAME_4 == null ? that.DOMAIN_NAME_4 == null : this.DOMAIN_NAME_4.equals(that.DOMAIN_NAME_4));
    equal = equal && (this.DOMAIN_TYPE_4 == null ? that.DOMAIN_TYPE_4 == null : this.DOMAIN_TYPE_4.equals(that.DOMAIN_TYPE_4));
    equal = equal && (this.DOMAIN_NAME_NUM_4 == null ? that.DOMAIN_NAME_NUM_4 == null : this.DOMAIN_NAME_NUM_4.equals(that.DOMAIN_NAME_NUM_4));
    equal = equal && (this.DOMAIN_NAME_5 == null ? that.DOMAIN_NAME_5 == null : this.DOMAIN_NAME_5.equals(that.DOMAIN_NAME_5));
    equal = equal && (this.DOMAIN_TYPE_5 == null ? that.DOMAIN_TYPE_5 == null : this.DOMAIN_TYPE_5.equals(that.DOMAIN_TYPE_5));
    equal = equal && (this.DOMAIN_NAME_NUM_5 == null ? that.DOMAIN_NAME_NUM_5 == null : this.DOMAIN_NAME_NUM_5.equals(that.DOMAIN_NAME_NUM_5));
    equal = equal && (this.DOMAIN_NAME_6 == null ? that.DOMAIN_NAME_6 == null : this.DOMAIN_NAME_6.equals(that.DOMAIN_NAME_6));
    equal = equal && (this.DOMAIN_TYPE_6 == null ? that.DOMAIN_TYPE_6 == null : this.DOMAIN_TYPE_6.equals(that.DOMAIN_TYPE_6));
    equal = equal && (this.DOMAIN_NAME_NUM_6 == null ? that.DOMAIN_NAME_NUM_6 == null : this.DOMAIN_NAME_NUM_6.equals(that.DOMAIN_NAME_NUM_6));
    equal = equal && (this.DOMAIN_NAME_7 == null ? that.DOMAIN_NAME_7 == null : this.DOMAIN_NAME_7.equals(that.DOMAIN_NAME_7));
    equal = equal && (this.DOMAIN_TYPE_7 == null ? that.DOMAIN_TYPE_7 == null : this.DOMAIN_TYPE_7.equals(that.DOMAIN_TYPE_7));
    equal = equal && (this.DOMAIN_NAME_NUM_7 == null ? that.DOMAIN_NAME_NUM_7 == null : this.DOMAIN_NAME_NUM_7.equals(that.DOMAIN_NAME_NUM_7));
    equal = equal && (this.DOMAIN_NAME_8 == null ? that.DOMAIN_NAME_8 == null : this.DOMAIN_NAME_8.equals(that.DOMAIN_NAME_8));
    equal = equal && (this.DOMAIN_TYPE_8 == null ? that.DOMAIN_TYPE_8 == null : this.DOMAIN_TYPE_8.equals(that.DOMAIN_TYPE_8));
    equal = equal && (this.DOMAIN_NAME_NUM_8 == null ? that.DOMAIN_NAME_NUM_8 == null : this.DOMAIN_NAME_NUM_8.equals(that.DOMAIN_NAME_NUM_8));
    equal = equal && (this.DOMAIN_NAME_9 == null ? that.DOMAIN_NAME_9 == null : this.DOMAIN_NAME_9.equals(that.DOMAIN_NAME_9));
    equal = equal && (this.DOMAIN_TYPE_9 == null ? that.DOMAIN_TYPE_9 == null : this.DOMAIN_TYPE_9.equals(that.DOMAIN_TYPE_9));
    equal = equal && (this.DOMAIN_NAME_NUM_9 == null ? that.DOMAIN_NAME_NUM_9 == null : this.DOMAIN_NAME_NUM_9.equals(that.DOMAIN_NAME_NUM_9));
    equal = equal && (this.DOMAIN_NAME_10 == null ? that.DOMAIN_NAME_10 == null : this.DOMAIN_NAME_10.equals(that.DOMAIN_NAME_10));
    equal = equal && (this.DOMAIN_TYPE_10 == null ? that.DOMAIN_TYPE_10 == null : this.DOMAIN_TYPE_10.equals(that.DOMAIN_TYPE_10));
    equal = equal && (this.DOMAIN_NAME_NUM_10 == null ? that.DOMAIN_NAME_NUM_10 == null : this.DOMAIN_NAME_NUM_10.equals(that.DOMAIN_NAME_NUM_10));
    equal = equal && (this.WEBSITE_TYPE_1 == null ? that.WEBSITE_TYPE_1 == null : this.WEBSITE_TYPE_1.equals(that.WEBSITE_TYPE_1));
    equal = equal && (this.WEBSITE_TYPE_NUM_1 == null ? that.WEBSITE_TYPE_NUM_1 == null : this.WEBSITE_TYPE_NUM_1.equals(that.WEBSITE_TYPE_NUM_1));
    equal = equal && (this.WEBSITE_TYPE_2 == null ? that.WEBSITE_TYPE_2 == null : this.WEBSITE_TYPE_2.equals(that.WEBSITE_TYPE_2));
    equal = equal && (this.WEBSITE_TYPE_NUM_2 == null ? that.WEBSITE_TYPE_NUM_2 == null : this.WEBSITE_TYPE_NUM_2.equals(that.WEBSITE_TYPE_NUM_2));
    equal = equal && (this.WEBSITE_TYPE_3 == null ? that.WEBSITE_TYPE_3 == null : this.WEBSITE_TYPE_3.equals(that.WEBSITE_TYPE_3));
    equal = equal && (this.WEBSITE_TYPE_NUM_3 == null ? that.WEBSITE_TYPE_NUM_3 == null : this.WEBSITE_TYPE_NUM_3.equals(that.WEBSITE_TYPE_NUM_3));
    equal = equal && (this.WEBSITE_TYPE_4 == null ? that.WEBSITE_TYPE_4 == null : this.WEBSITE_TYPE_4.equals(that.WEBSITE_TYPE_4));
    equal = equal && (this.WEBSITE_TYPE_NUM_4 == null ? that.WEBSITE_TYPE_NUM_4 == null : this.WEBSITE_TYPE_NUM_4.equals(that.WEBSITE_TYPE_NUM_4));
    equal = equal && (this.WEBSITE_TYPE_5 == null ? that.WEBSITE_TYPE_5 == null : this.WEBSITE_TYPE_5.equals(that.WEBSITE_TYPE_5));
    equal = equal && (this.WEBSITE_TYPE_NUM_5 == null ? that.WEBSITE_TYPE_NUM_5 == null : this.WEBSITE_TYPE_NUM_5.equals(that.WEBSITE_TYPE_NUM_5));
    equal = equal && (this.WEBSITE_TYPE_6 == null ? that.WEBSITE_TYPE_6 == null : this.WEBSITE_TYPE_6.equals(that.WEBSITE_TYPE_6));
    equal = equal && (this.WEBSITE_TYPE_NUM_6 == null ? that.WEBSITE_TYPE_NUM_6 == null : this.WEBSITE_TYPE_NUM_6.equals(that.WEBSITE_TYPE_NUM_6));
    equal = equal && (this.WEBSITE_TYPE_7 == null ? that.WEBSITE_TYPE_7 == null : this.WEBSITE_TYPE_7.equals(that.WEBSITE_TYPE_7));
    equal = equal && (this.WEBSITE_TYPE_NUM_7 == null ? that.WEBSITE_TYPE_NUM_7 == null : this.WEBSITE_TYPE_NUM_7.equals(that.WEBSITE_TYPE_NUM_7));
    equal = equal && (this.WEBSITE_TYPE_8 == null ? that.WEBSITE_TYPE_8 == null : this.WEBSITE_TYPE_8.equals(that.WEBSITE_TYPE_8));
    equal = equal && (this.WEBSITE_TYPE_NUM_8 == null ? that.WEBSITE_TYPE_NUM_8 == null : this.WEBSITE_TYPE_NUM_8.equals(that.WEBSITE_TYPE_NUM_8));
    equal = equal && (this.WEBSITE_TYPE_9 == null ? that.WEBSITE_TYPE_9 == null : this.WEBSITE_TYPE_9.equals(that.WEBSITE_TYPE_9));
    equal = equal && (this.WEBSITE_TYPE_NUM_9 == null ? that.WEBSITE_TYPE_NUM_9 == null : this.WEBSITE_TYPE_NUM_9.equals(that.WEBSITE_TYPE_NUM_9));
    equal = equal && (this.WEBSITE_TYPE_10 == null ? that.WEBSITE_TYPE_10 == null : this.WEBSITE_TYPE_10.equals(that.WEBSITE_TYPE_10));
    equal = equal && (this.WEBSITE_TYPE_NUM_10 == null ? that.WEBSITE_TYPE_NUM_10 == null : this.WEBSITE_TYPE_NUM_10.equals(that.WEBSITE_TYPE_NUM_10));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_network_beh_m)) {
      return false;
    }
    st_user_network_beh_m that = (st_user_network_beh_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TOTAL_USER_COUNT == null ? that.TOTAL_USER_COUNT == null : this.TOTAL_USER_COUNT.equals(that.TOTAL_USER_COUNT));
    equal = equal && (this.BW_10M_USER_COUNT == null ? that.BW_10M_USER_COUNT == null : this.BW_10M_USER_COUNT.equals(that.BW_10M_USER_COUNT));
    equal = equal && (this.BW_20M_USER_COUNT == null ? that.BW_20M_USER_COUNT == null : this.BW_20M_USER_COUNT.equals(that.BW_20M_USER_COUNT));
    equal = equal && (this.BW_50M_USER_COUNT == null ? that.BW_50M_USER_COUNT == null : this.BW_50M_USER_COUNT.equals(that.BW_50M_USER_COUNT));
    equal = equal && (this.BW_OTHERS_USER_COUNT == null ? that.BW_OTHERS_USER_COUNT == null : this.BW_OTHERS_USER_COUNT.equals(that.BW_OTHERS_USER_COUNT));
    equal = equal && (this.TOTAL_NET_FLOW == null ? that.TOTAL_NET_FLOW == null : this.TOTAL_NET_FLOW.equals(that.TOTAL_NET_FLOW));
    equal = equal && (this.SBZ_NOT_YMZ_COUNT == null ? that.SBZ_NOT_YMZ_COUNT == null : this.SBZ_NOT_YMZ_COUNT.equals(that.SBZ_NOT_YMZ_COUNT));
    equal = equal && (this.YMZ_NOT_SBZ_COUNT == null ? that.YMZ_NOT_SBZ_COUNT == null : this.YMZ_NOT_SBZ_COUNT.equals(that.YMZ_NOT_SBZ_COUNT));
    equal = equal && (this.YMZ_AND_SBZ_COUNT == null ? that.YMZ_AND_SBZ_COUNT == null : this.YMZ_AND_SBZ_COUNT.equals(that.YMZ_AND_SBZ_COUNT));
    equal = equal && (this.OTHERS_COUNT == null ? that.OTHERS_COUNT == null : this.OTHERS_COUNT.equals(that.OTHERS_COUNT));
    equal = equal && (this.WEEKDAY_NET_NUM == null ? that.WEEKDAY_NET_NUM == null : this.WEEKDAY_NET_NUM.equals(that.WEEKDAY_NET_NUM));
    equal = equal && (this.WEEKDAY_NET_FLOW == null ? that.WEEKDAY_NET_FLOW == null : this.WEEKDAY_NET_FLOW.equals(that.WEEKDAY_NET_FLOW));
    equal = equal && (this.WEEKEND_NET_NUM == null ? that.WEEKEND_NET_NUM == null : this.WEEKEND_NET_NUM.equals(that.WEEKEND_NET_NUM));
    equal = equal && (this.WEEKEND_NET_FLOW == null ? that.WEEKEND_NET_FLOW == null : this.WEEKEND_NET_FLOW.equals(that.WEEKEND_NET_FLOW));
    equal = equal && (this.WEEKDAY_LC_NET_NUM == null ? that.WEEKDAY_LC_NET_NUM == null : this.WEEKDAY_LC_NET_NUM.equals(that.WEEKDAY_LC_NET_NUM));
    equal = equal && (this.WEEKDAY_LC_NET_FLOW == null ? that.WEEKDAY_LC_NET_FLOW == null : this.WEEKDAY_LC_NET_FLOW.equals(that.WEEKDAY_LC_NET_FLOW));
    equal = equal && (this.WEEKDAY_ZS_NET_NUM == null ? that.WEEKDAY_ZS_NET_NUM == null : this.WEEKDAY_ZS_NET_NUM.equals(that.WEEKDAY_ZS_NET_NUM));
    equal = equal && (this.WEEKDAY_ZS_NET_FLOW == null ? that.WEEKDAY_ZS_NET_FLOW == null : this.WEEKDAY_ZS_NET_FLOW.equals(that.WEEKDAY_ZS_NET_FLOW));
    equal = equal && (this.WEEKDAY_SW_NET_NUM == null ? that.WEEKDAY_SW_NET_NUM == null : this.WEEKDAY_SW_NET_NUM.equals(that.WEEKDAY_SW_NET_NUM));
    equal = equal && (this.WEEKDAY_SW_NET_FLOW == null ? that.WEEKDAY_SW_NET_FLOW == null : this.WEEKDAY_SW_NET_FLOW.equals(that.WEEKDAY_SW_NET_FLOW));
    equal = equal && (this.WEEKDAY_ZW_NET_NUM == null ? that.WEEKDAY_ZW_NET_NUM == null : this.WEEKDAY_ZW_NET_NUM.equals(that.WEEKDAY_ZW_NET_NUM));
    equal = equal && (this.WEEKDAY_ZW_NET_FLOW == null ? that.WEEKDAY_ZW_NET_FLOW == null : this.WEEKDAY_ZW_NET_FLOW.equals(that.WEEKDAY_ZW_NET_FLOW));
    equal = equal && (this.WEEKDAY_XW_NET_NUM == null ? that.WEEKDAY_XW_NET_NUM == null : this.WEEKDAY_XW_NET_NUM.equals(that.WEEKDAY_XW_NET_NUM));
    equal = equal && (this.WEEKDAY_XW_NET_FLOW == null ? that.WEEKDAY_XW_NET_FLOW == null : this.WEEKDAY_XW_NET_FLOW.equals(that.WEEKDAY_XW_NET_FLOW));
    equal = equal && (this.WEEKDAY_BW_NET_NUM == null ? that.WEEKDAY_BW_NET_NUM == null : this.WEEKDAY_BW_NET_NUM.equals(that.WEEKDAY_BW_NET_NUM));
    equal = equal && (this.WEEKDAY_BW_NET_FLOW == null ? that.WEEKDAY_BW_NET_FLOW == null : this.WEEKDAY_BW_NET_FLOW.equals(that.WEEKDAY_BW_NET_FLOW));
    equal = equal && (this.WEEKDAY_WS_NET_NUM == null ? that.WEEKDAY_WS_NET_NUM == null : this.WEEKDAY_WS_NET_NUM.equals(that.WEEKDAY_WS_NET_NUM));
    equal = equal && (this.WEEKDAY_WS_NET_FLOW == null ? that.WEEKDAY_WS_NET_FLOW == null : this.WEEKDAY_WS_NET_FLOW.equals(that.WEEKDAY_WS_NET_FLOW));
    equal = equal && (this.WEEKDAY_WY_NET_NUM == null ? that.WEEKDAY_WY_NET_NUM == null : this.WEEKDAY_WY_NET_NUM.equals(that.WEEKDAY_WY_NET_NUM));
    equal = equal && (this.WEEKDAY_WY_NET_FLOW == null ? that.WEEKDAY_WY_NET_FLOW == null : this.WEEKDAY_WY_NET_FLOW.equals(that.WEEKDAY_WY_NET_FLOW));
    equal = equal && (this.WEEKEND_LC_NET_NUM == null ? that.WEEKEND_LC_NET_NUM == null : this.WEEKEND_LC_NET_NUM.equals(that.WEEKEND_LC_NET_NUM));
    equal = equal && (this.WEEKEND_LC_NET_FLOW == null ? that.WEEKEND_LC_NET_FLOW == null : this.WEEKEND_LC_NET_FLOW.equals(that.WEEKEND_LC_NET_FLOW));
    equal = equal && (this.WEEKEND_ZS_NET_NUM == null ? that.WEEKEND_ZS_NET_NUM == null : this.WEEKEND_ZS_NET_NUM.equals(that.WEEKEND_ZS_NET_NUM));
    equal = equal && (this.WEEKEND_ZS_NET_FLOW == null ? that.WEEKEND_ZS_NET_FLOW == null : this.WEEKEND_ZS_NET_FLOW.equals(that.WEEKEND_ZS_NET_FLOW));
    equal = equal && (this.WEEKEND_SW_NET_NUM == null ? that.WEEKEND_SW_NET_NUM == null : this.WEEKEND_SW_NET_NUM.equals(that.WEEKEND_SW_NET_NUM));
    equal = equal && (this.WEEKEND_SW_NET_FLOW == null ? that.WEEKEND_SW_NET_FLOW == null : this.WEEKEND_SW_NET_FLOW.equals(that.WEEKEND_SW_NET_FLOW));
    equal = equal && (this.WEEKEND_ZW_NET_NUM == null ? that.WEEKEND_ZW_NET_NUM == null : this.WEEKEND_ZW_NET_NUM.equals(that.WEEKEND_ZW_NET_NUM));
    equal = equal && (this.WEEKEND_ZW_NET_FLOW == null ? that.WEEKEND_ZW_NET_FLOW == null : this.WEEKEND_ZW_NET_FLOW.equals(that.WEEKEND_ZW_NET_FLOW));
    equal = equal && (this.WEEKEND_XW_NET_NUM == null ? that.WEEKEND_XW_NET_NUM == null : this.WEEKEND_XW_NET_NUM.equals(that.WEEKEND_XW_NET_NUM));
    equal = equal && (this.WEEKEND_XW_NET_FLOW == null ? that.WEEKEND_XW_NET_FLOW == null : this.WEEKEND_XW_NET_FLOW.equals(that.WEEKEND_XW_NET_FLOW));
    equal = equal && (this.WEEKEND_BW_NET_NUM == null ? that.WEEKEND_BW_NET_NUM == null : this.WEEKEND_BW_NET_NUM.equals(that.WEEKEND_BW_NET_NUM));
    equal = equal && (this.WEEKEND_BW_NET_FLOW == null ? that.WEEKEND_BW_NET_FLOW == null : this.WEEKEND_BW_NET_FLOW.equals(that.WEEKEND_BW_NET_FLOW));
    equal = equal && (this.WEEKEND_WS_NET_NUM == null ? that.WEEKEND_WS_NET_NUM == null : this.WEEKEND_WS_NET_NUM.equals(that.WEEKEND_WS_NET_NUM));
    equal = equal && (this.WEEKEND_WS_NET_FLOW == null ? that.WEEKEND_WS_NET_FLOW == null : this.WEEKEND_WS_NET_FLOW.equals(that.WEEKEND_WS_NET_FLOW));
    equal = equal && (this.WEEKEND_WY_NET_NUM == null ? that.WEEKEND_WY_NET_NUM == null : this.WEEKEND_WY_NET_NUM.equals(that.WEEKEND_WY_NET_NUM));
    equal = equal && (this.WEEKEND_WY_NET_FLOW == null ? that.WEEKEND_WY_NET_FLOW == null : this.WEEKEND_WY_NET_FLOW.equals(that.WEEKEND_WY_NET_FLOW));
    equal = equal && (this.PC_NET_TOTAL_TIME == null ? that.PC_NET_TOTAL_TIME == null : this.PC_NET_TOTAL_TIME.equals(that.PC_NET_TOTAL_TIME));
    equal = equal && (this.PC_NET_TOTAL_NUM == null ? that.PC_NET_TOTAL_NUM == null : this.PC_NET_TOTAL_NUM.equals(that.PC_NET_TOTAL_NUM));
    equal = equal && (this.MOBILE_NET_TOTAL_TIME == null ? that.MOBILE_NET_TOTAL_TIME == null : this.MOBILE_NET_TOTAL_TIME.equals(that.MOBILE_NET_TOTAL_TIME));
    equal = equal && (this.MOBILE_NET_TOTAL_NUM == null ? that.MOBILE_NET_TOTAL_NUM == null : this.MOBILE_NET_TOTAL_NUM.equals(that.MOBILE_NET_TOTAL_NUM));
    equal = equal && (this.DOMAIN_NAME_1 == null ? that.DOMAIN_NAME_1 == null : this.DOMAIN_NAME_1.equals(that.DOMAIN_NAME_1));
    equal = equal && (this.DOMAIN_TYPE_1 == null ? that.DOMAIN_TYPE_1 == null : this.DOMAIN_TYPE_1.equals(that.DOMAIN_TYPE_1));
    equal = equal && (this.DOMAIN_NAME_NUM_1 == null ? that.DOMAIN_NAME_NUM_1 == null : this.DOMAIN_NAME_NUM_1.equals(that.DOMAIN_NAME_NUM_1));
    equal = equal && (this.DOMAIN_NAME_2 == null ? that.DOMAIN_NAME_2 == null : this.DOMAIN_NAME_2.equals(that.DOMAIN_NAME_2));
    equal = equal && (this.DOMAIN_TYPE_2 == null ? that.DOMAIN_TYPE_2 == null : this.DOMAIN_TYPE_2.equals(that.DOMAIN_TYPE_2));
    equal = equal && (this.DOMAIN_NAME_NUM_2 == null ? that.DOMAIN_NAME_NUM_2 == null : this.DOMAIN_NAME_NUM_2.equals(that.DOMAIN_NAME_NUM_2));
    equal = equal && (this.DOMAIN_NAME_3 == null ? that.DOMAIN_NAME_3 == null : this.DOMAIN_NAME_3.equals(that.DOMAIN_NAME_3));
    equal = equal && (this.DOMAIN_TYPE_3 == null ? that.DOMAIN_TYPE_3 == null : this.DOMAIN_TYPE_3.equals(that.DOMAIN_TYPE_3));
    equal = equal && (this.DOMAIN_NAME_NUM_3 == null ? that.DOMAIN_NAME_NUM_3 == null : this.DOMAIN_NAME_NUM_3.equals(that.DOMAIN_NAME_NUM_3));
    equal = equal && (this.DOMAIN_NAME_4 == null ? that.DOMAIN_NAME_4 == null : this.DOMAIN_NAME_4.equals(that.DOMAIN_NAME_4));
    equal = equal && (this.DOMAIN_TYPE_4 == null ? that.DOMAIN_TYPE_4 == null : this.DOMAIN_TYPE_4.equals(that.DOMAIN_TYPE_4));
    equal = equal && (this.DOMAIN_NAME_NUM_4 == null ? that.DOMAIN_NAME_NUM_4 == null : this.DOMAIN_NAME_NUM_4.equals(that.DOMAIN_NAME_NUM_4));
    equal = equal && (this.DOMAIN_NAME_5 == null ? that.DOMAIN_NAME_5 == null : this.DOMAIN_NAME_5.equals(that.DOMAIN_NAME_5));
    equal = equal && (this.DOMAIN_TYPE_5 == null ? that.DOMAIN_TYPE_5 == null : this.DOMAIN_TYPE_5.equals(that.DOMAIN_TYPE_5));
    equal = equal && (this.DOMAIN_NAME_NUM_5 == null ? that.DOMAIN_NAME_NUM_5 == null : this.DOMAIN_NAME_NUM_5.equals(that.DOMAIN_NAME_NUM_5));
    equal = equal && (this.DOMAIN_NAME_6 == null ? that.DOMAIN_NAME_6 == null : this.DOMAIN_NAME_6.equals(that.DOMAIN_NAME_6));
    equal = equal && (this.DOMAIN_TYPE_6 == null ? that.DOMAIN_TYPE_6 == null : this.DOMAIN_TYPE_6.equals(that.DOMAIN_TYPE_6));
    equal = equal && (this.DOMAIN_NAME_NUM_6 == null ? that.DOMAIN_NAME_NUM_6 == null : this.DOMAIN_NAME_NUM_6.equals(that.DOMAIN_NAME_NUM_6));
    equal = equal && (this.DOMAIN_NAME_7 == null ? that.DOMAIN_NAME_7 == null : this.DOMAIN_NAME_7.equals(that.DOMAIN_NAME_7));
    equal = equal && (this.DOMAIN_TYPE_7 == null ? that.DOMAIN_TYPE_7 == null : this.DOMAIN_TYPE_7.equals(that.DOMAIN_TYPE_7));
    equal = equal && (this.DOMAIN_NAME_NUM_7 == null ? that.DOMAIN_NAME_NUM_7 == null : this.DOMAIN_NAME_NUM_7.equals(that.DOMAIN_NAME_NUM_7));
    equal = equal && (this.DOMAIN_NAME_8 == null ? that.DOMAIN_NAME_8 == null : this.DOMAIN_NAME_8.equals(that.DOMAIN_NAME_8));
    equal = equal && (this.DOMAIN_TYPE_8 == null ? that.DOMAIN_TYPE_8 == null : this.DOMAIN_TYPE_8.equals(that.DOMAIN_TYPE_8));
    equal = equal && (this.DOMAIN_NAME_NUM_8 == null ? that.DOMAIN_NAME_NUM_8 == null : this.DOMAIN_NAME_NUM_8.equals(that.DOMAIN_NAME_NUM_8));
    equal = equal && (this.DOMAIN_NAME_9 == null ? that.DOMAIN_NAME_9 == null : this.DOMAIN_NAME_9.equals(that.DOMAIN_NAME_9));
    equal = equal && (this.DOMAIN_TYPE_9 == null ? that.DOMAIN_TYPE_9 == null : this.DOMAIN_TYPE_9.equals(that.DOMAIN_TYPE_9));
    equal = equal && (this.DOMAIN_NAME_NUM_9 == null ? that.DOMAIN_NAME_NUM_9 == null : this.DOMAIN_NAME_NUM_9.equals(that.DOMAIN_NAME_NUM_9));
    equal = equal && (this.DOMAIN_NAME_10 == null ? that.DOMAIN_NAME_10 == null : this.DOMAIN_NAME_10.equals(that.DOMAIN_NAME_10));
    equal = equal && (this.DOMAIN_TYPE_10 == null ? that.DOMAIN_TYPE_10 == null : this.DOMAIN_TYPE_10.equals(that.DOMAIN_TYPE_10));
    equal = equal && (this.DOMAIN_NAME_NUM_10 == null ? that.DOMAIN_NAME_NUM_10 == null : this.DOMAIN_NAME_NUM_10.equals(that.DOMAIN_NAME_NUM_10));
    equal = equal && (this.WEBSITE_TYPE_1 == null ? that.WEBSITE_TYPE_1 == null : this.WEBSITE_TYPE_1.equals(that.WEBSITE_TYPE_1));
    equal = equal && (this.WEBSITE_TYPE_NUM_1 == null ? that.WEBSITE_TYPE_NUM_1 == null : this.WEBSITE_TYPE_NUM_1.equals(that.WEBSITE_TYPE_NUM_1));
    equal = equal && (this.WEBSITE_TYPE_2 == null ? that.WEBSITE_TYPE_2 == null : this.WEBSITE_TYPE_2.equals(that.WEBSITE_TYPE_2));
    equal = equal && (this.WEBSITE_TYPE_NUM_2 == null ? that.WEBSITE_TYPE_NUM_2 == null : this.WEBSITE_TYPE_NUM_2.equals(that.WEBSITE_TYPE_NUM_2));
    equal = equal && (this.WEBSITE_TYPE_3 == null ? that.WEBSITE_TYPE_3 == null : this.WEBSITE_TYPE_3.equals(that.WEBSITE_TYPE_3));
    equal = equal && (this.WEBSITE_TYPE_NUM_3 == null ? that.WEBSITE_TYPE_NUM_3 == null : this.WEBSITE_TYPE_NUM_3.equals(that.WEBSITE_TYPE_NUM_3));
    equal = equal && (this.WEBSITE_TYPE_4 == null ? that.WEBSITE_TYPE_4 == null : this.WEBSITE_TYPE_4.equals(that.WEBSITE_TYPE_4));
    equal = equal && (this.WEBSITE_TYPE_NUM_4 == null ? that.WEBSITE_TYPE_NUM_4 == null : this.WEBSITE_TYPE_NUM_4.equals(that.WEBSITE_TYPE_NUM_4));
    equal = equal && (this.WEBSITE_TYPE_5 == null ? that.WEBSITE_TYPE_5 == null : this.WEBSITE_TYPE_5.equals(that.WEBSITE_TYPE_5));
    equal = equal && (this.WEBSITE_TYPE_NUM_5 == null ? that.WEBSITE_TYPE_NUM_5 == null : this.WEBSITE_TYPE_NUM_5.equals(that.WEBSITE_TYPE_NUM_5));
    equal = equal && (this.WEBSITE_TYPE_6 == null ? that.WEBSITE_TYPE_6 == null : this.WEBSITE_TYPE_6.equals(that.WEBSITE_TYPE_6));
    equal = equal && (this.WEBSITE_TYPE_NUM_6 == null ? that.WEBSITE_TYPE_NUM_6 == null : this.WEBSITE_TYPE_NUM_6.equals(that.WEBSITE_TYPE_NUM_6));
    equal = equal && (this.WEBSITE_TYPE_7 == null ? that.WEBSITE_TYPE_7 == null : this.WEBSITE_TYPE_7.equals(that.WEBSITE_TYPE_7));
    equal = equal && (this.WEBSITE_TYPE_NUM_7 == null ? that.WEBSITE_TYPE_NUM_7 == null : this.WEBSITE_TYPE_NUM_7.equals(that.WEBSITE_TYPE_NUM_7));
    equal = equal && (this.WEBSITE_TYPE_8 == null ? that.WEBSITE_TYPE_8 == null : this.WEBSITE_TYPE_8.equals(that.WEBSITE_TYPE_8));
    equal = equal && (this.WEBSITE_TYPE_NUM_8 == null ? that.WEBSITE_TYPE_NUM_8 == null : this.WEBSITE_TYPE_NUM_8.equals(that.WEBSITE_TYPE_NUM_8));
    equal = equal && (this.WEBSITE_TYPE_9 == null ? that.WEBSITE_TYPE_9 == null : this.WEBSITE_TYPE_9.equals(that.WEBSITE_TYPE_9));
    equal = equal && (this.WEBSITE_TYPE_NUM_9 == null ? that.WEBSITE_TYPE_NUM_9 == null : this.WEBSITE_TYPE_NUM_9.equals(that.WEBSITE_TYPE_NUM_9));
    equal = equal && (this.WEBSITE_TYPE_10 == null ? that.WEBSITE_TYPE_10 == null : this.WEBSITE_TYPE_10.equals(that.WEBSITE_TYPE_10));
    equal = equal && (this.WEBSITE_TYPE_NUM_10 == null ? that.WEBSITE_TYPE_NUM_10 == null : this.WEBSITE_TYPE_NUM_10.equals(that.WEBSITE_TYPE_NUM_10));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.TOTAL_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BW_10M_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.BW_20M_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.BW_50M_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BW_OTHERS_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TOTAL_NET_FLOW = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.SBZ_NOT_YMZ_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.YMZ_NOT_SBZ_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.YMZ_AND_SBZ_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.OTHERS_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.WEEKDAY_NET_NUM = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.WEEKDAY_NET_FLOW = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.WEEKEND_NET_NUM = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.WEEKEND_NET_FLOW = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.WEEKDAY_LC_NET_NUM = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.WEEKDAY_LC_NET_FLOW = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.WEEKDAY_ZS_NET_NUM = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.WEEKDAY_ZS_NET_FLOW = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.WEEKDAY_SW_NET_NUM = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.WEEKDAY_SW_NET_FLOW = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.WEEKDAY_ZW_NET_NUM = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.WEEKDAY_ZW_NET_FLOW = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.WEEKDAY_XW_NET_NUM = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.WEEKDAY_XW_NET_FLOW = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.WEEKDAY_BW_NET_NUM = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.WEEKDAY_BW_NET_FLOW = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.WEEKDAY_WS_NET_NUM = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.WEEKDAY_WS_NET_FLOW = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.WEEKDAY_WY_NET_NUM = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.WEEKDAY_WY_NET_FLOW = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.WEEKEND_LC_NET_NUM = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.WEEKEND_LC_NET_FLOW = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.WEEKEND_ZS_NET_NUM = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.WEEKEND_ZS_NET_FLOW = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.WEEKEND_SW_NET_NUM = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.WEEKEND_SW_NET_FLOW = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.WEEKEND_ZW_NET_NUM = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.WEEKEND_ZW_NET_FLOW = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.WEEKEND_XW_NET_NUM = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.WEEKEND_XW_NET_FLOW = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.WEEKEND_BW_NET_NUM = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.WEEKEND_BW_NET_FLOW = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.WEEKEND_WS_NET_NUM = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.WEEKEND_WS_NET_FLOW = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.WEEKEND_WY_NET_NUM = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.WEEKEND_WY_NET_FLOW = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.PC_NET_TOTAL_TIME = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.PC_NET_TOTAL_NUM = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.MOBILE_NET_TOTAL_TIME = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.MOBILE_NET_TOTAL_NUM = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.DOMAIN_NAME_1 = JdbcWritableBridge.readString(54, __dbResults);
    this.DOMAIN_TYPE_1 = JdbcWritableBridge.readString(55, __dbResults);
    this.DOMAIN_NAME_NUM_1 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.DOMAIN_NAME_2 = JdbcWritableBridge.readString(57, __dbResults);
    this.DOMAIN_TYPE_2 = JdbcWritableBridge.readString(58, __dbResults);
    this.DOMAIN_NAME_NUM_2 = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.DOMAIN_NAME_3 = JdbcWritableBridge.readString(60, __dbResults);
    this.DOMAIN_TYPE_3 = JdbcWritableBridge.readString(61, __dbResults);
    this.DOMAIN_NAME_NUM_3 = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.DOMAIN_NAME_4 = JdbcWritableBridge.readString(63, __dbResults);
    this.DOMAIN_TYPE_4 = JdbcWritableBridge.readString(64, __dbResults);
    this.DOMAIN_NAME_NUM_4 = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.DOMAIN_NAME_5 = JdbcWritableBridge.readString(66, __dbResults);
    this.DOMAIN_TYPE_5 = JdbcWritableBridge.readString(67, __dbResults);
    this.DOMAIN_NAME_NUM_5 = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.DOMAIN_NAME_6 = JdbcWritableBridge.readString(69, __dbResults);
    this.DOMAIN_TYPE_6 = JdbcWritableBridge.readString(70, __dbResults);
    this.DOMAIN_NAME_NUM_6 = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.DOMAIN_NAME_7 = JdbcWritableBridge.readString(72, __dbResults);
    this.DOMAIN_TYPE_7 = JdbcWritableBridge.readString(73, __dbResults);
    this.DOMAIN_NAME_NUM_7 = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.DOMAIN_NAME_8 = JdbcWritableBridge.readString(75, __dbResults);
    this.DOMAIN_TYPE_8 = JdbcWritableBridge.readString(76, __dbResults);
    this.DOMAIN_NAME_NUM_8 = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.DOMAIN_NAME_9 = JdbcWritableBridge.readString(78, __dbResults);
    this.DOMAIN_TYPE_9 = JdbcWritableBridge.readString(79, __dbResults);
    this.DOMAIN_NAME_NUM_9 = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.DOMAIN_NAME_10 = JdbcWritableBridge.readString(81, __dbResults);
    this.DOMAIN_TYPE_10 = JdbcWritableBridge.readString(82, __dbResults);
    this.DOMAIN_NAME_NUM_10 = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.WEBSITE_TYPE_1 = JdbcWritableBridge.readString(84, __dbResults);
    this.WEBSITE_TYPE_NUM_1 = JdbcWritableBridge.readBigDecimal(85, __dbResults);
    this.WEBSITE_TYPE_2 = JdbcWritableBridge.readString(86, __dbResults);
    this.WEBSITE_TYPE_NUM_2 = JdbcWritableBridge.readBigDecimal(87, __dbResults);
    this.WEBSITE_TYPE_3 = JdbcWritableBridge.readString(88, __dbResults);
    this.WEBSITE_TYPE_NUM_3 = JdbcWritableBridge.readBigDecimal(89, __dbResults);
    this.WEBSITE_TYPE_4 = JdbcWritableBridge.readString(90, __dbResults);
    this.WEBSITE_TYPE_NUM_4 = JdbcWritableBridge.readBigDecimal(91, __dbResults);
    this.WEBSITE_TYPE_5 = JdbcWritableBridge.readString(92, __dbResults);
    this.WEBSITE_TYPE_NUM_5 = JdbcWritableBridge.readBigDecimal(93, __dbResults);
    this.WEBSITE_TYPE_6 = JdbcWritableBridge.readString(94, __dbResults);
    this.WEBSITE_TYPE_NUM_6 = JdbcWritableBridge.readBigDecimal(95, __dbResults);
    this.WEBSITE_TYPE_7 = JdbcWritableBridge.readString(96, __dbResults);
    this.WEBSITE_TYPE_NUM_7 = JdbcWritableBridge.readBigDecimal(97, __dbResults);
    this.WEBSITE_TYPE_8 = JdbcWritableBridge.readString(98, __dbResults);
    this.WEBSITE_TYPE_NUM_8 = JdbcWritableBridge.readBigDecimal(99, __dbResults);
    this.WEBSITE_TYPE_9 = JdbcWritableBridge.readString(100, __dbResults);
    this.WEBSITE_TYPE_NUM_9 = JdbcWritableBridge.readBigDecimal(101, __dbResults);
    this.WEBSITE_TYPE_10 = JdbcWritableBridge.readString(102, __dbResults);
    this.WEBSITE_TYPE_NUM_10 = JdbcWritableBridge.readBigDecimal(103, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(104, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(105, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.TOTAL_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BW_10M_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.BW_20M_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.BW_50M_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BW_OTHERS_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.TOTAL_NET_FLOW = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.SBZ_NOT_YMZ_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.YMZ_NOT_SBZ_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.YMZ_AND_SBZ_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.OTHERS_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.WEEKDAY_NET_NUM = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.WEEKDAY_NET_FLOW = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.WEEKEND_NET_NUM = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.WEEKEND_NET_FLOW = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.WEEKDAY_LC_NET_NUM = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.WEEKDAY_LC_NET_FLOW = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.WEEKDAY_ZS_NET_NUM = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.WEEKDAY_ZS_NET_FLOW = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.WEEKDAY_SW_NET_NUM = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.WEEKDAY_SW_NET_FLOW = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.WEEKDAY_ZW_NET_NUM = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.WEEKDAY_ZW_NET_FLOW = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.WEEKDAY_XW_NET_NUM = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.WEEKDAY_XW_NET_FLOW = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.WEEKDAY_BW_NET_NUM = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.WEEKDAY_BW_NET_FLOW = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.WEEKDAY_WS_NET_NUM = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.WEEKDAY_WS_NET_FLOW = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.WEEKDAY_WY_NET_NUM = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.WEEKDAY_WY_NET_FLOW = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.WEEKEND_LC_NET_NUM = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.WEEKEND_LC_NET_FLOW = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.WEEKEND_ZS_NET_NUM = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.WEEKEND_ZS_NET_FLOW = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.WEEKEND_SW_NET_NUM = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.WEEKEND_SW_NET_FLOW = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.WEEKEND_ZW_NET_NUM = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.WEEKEND_ZW_NET_FLOW = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.WEEKEND_XW_NET_NUM = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.WEEKEND_XW_NET_FLOW = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.WEEKEND_BW_NET_NUM = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.WEEKEND_BW_NET_FLOW = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.WEEKEND_WS_NET_NUM = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.WEEKEND_WS_NET_FLOW = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.WEEKEND_WY_NET_NUM = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.WEEKEND_WY_NET_FLOW = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.PC_NET_TOTAL_TIME = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.PC_NET_TOTAL_NUM = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.MOBILE_NET_TOTAL_TIME = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.MOBILE_NET_TOTAL_NUM = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.DOMAIN_NAME_1 = JdbcWritableBridge.readString(54, __dbResults);
    this.DOMAIN_TYPE_1 = JdbcWritableBridge.readString(55, __dbResults);
    this.DOMAIN_NAME_NUM_1 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.DOMAIN_NAME_2 = JdbcWritableBridge.readString(57, __dbResults);
    this.DOMAIN_TYPE_2 = JdbcWritableBridge.readString(58, __dbResults);
    this.DOMAIN_NAME_NUM_2 = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.DOMAIN_NAME_3 = JdbcWritableBridge.readString(60, __dbResults);
    this.DOMAIN_TYPE_3 = JdbcWritableBridge.readString(61, __dbResults);
    this.DOMAIN_NAME_NUM_3 = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.DOMAIN_NAME_4 = JdbcWritableBridge.readString(63, __dbResults);
    this.DOMAIN_TYPE_4 = JdbcWritableBridge.readString(64, __dbResults);
    this.DOMAIN_NAME_NUM_4 = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.DOMAIN_NAME_5 = JdbcWritableBridge.readString(66, __dbResults);
    this.DOMAIN_TYPE_5 = JdbcWritableBridge.readString(67, __dbResults);
    this.DOMAIN_NAME_NUM_5 = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.DOMAIN_NAME_6 = JdbcWritableBridge.readString(69, __dbResults);
    this.DOMAIN_TYPE_6 = JdbcWritableBridge.readString(70, __dbResults);
    this.DOMAIN_NAME_NUM_6 = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.DOMAIN_NAME_7 = JdbcWritableBridge.readString(72, __dbResults);
    this.DOMAIN_TYPE_7 = JdbcWritableBridge.readString(73, __dbResults);
    this.DOMAIN_NAME_NUM_7 = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.DOMAIN_NAME_8 = JdbcWritableBridge.readString(75, __dbResults);
    this.DOMAIN_TYPE_8 = JdbcWritableBridge.readString(76, __dbResults);
    this.DOMAIN_NAME_NUM_8 = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.DOMAIN_NAME_9 = JdbcWritableBridge.readString(78, __dbResults);
    this.DOMAIN_TYPE_9 = JdbcWritableBridge.readString(79, __dbResults);
    this.DOMAIN_NAME_NUM_9 = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.DOMAIN_NAME_10 = JdbcWritableBridge.readString(81, __dbResults);
    this.DOMAIN_TYPE_10 = JdbcWritableBridge.readString(82, __dbResults);
    this.DOMAIN_NAME_NUM_10 = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.WEBSITE_TYPE_1 = JdbcWritableBridge.readString(84, __dbResults);
    this.WEBSITE_TYPE_NUM_1 = JdbcWritableBridge.readBigDecimal(85, __dbResults);
    this.WEBSITE_TYPE_2 = JdbcWritableBridge.readString(86, __dbResults);
    this.WEBSITE_TYPE_NUM_2 = JdbcWritableBridge.readBigDecimal(87, __dbResults);
    this.WEBSITE_TYPE_3 = JdbcWritableBridge.readString(88, __dbResults);
    this.WEBSITE_TYPE_NUM_3 = JdbcWritableBridge.readBigDecimal(89, __dbResults);
    this.WEBSITE_TYPE_4 = JdbcWritableBridge.readString(90, __dbResults);
    this.WEBSITE_TYPE_NUM_4 = JdbcWritableBridge.readBigDecimal(91, __dbResults);
    this.WEBSITE_TYPE_5 = JdbcWritableBridge.readString(92, __dbResults);
    this.WEBSITE_TYPE_NUM_5 = JdbcWritableBridge.readBigDecimal(93, __dbResults);
    this.WEBSITE_TYPE_6 = JdbcWritableBridge.readString(94, __dbResults);
    this.WEBSITE_TYPE_NUM_6 = JdbcWritableBridge.readBigDecimal(95, __dbResults);
    this.WEBSITE_TYPE_7 = JdbcWritableBridge.readString(96, __dbResults);
    this.WEBSITE_TYPE_NUM_7 = JdbcWritableBridge.readBigDecimal(97, __dbResults);
    this.WEBSITE_TYPE_8 = JdbcWritableBridge.readString(98, __dbResults);
    this.WEBSITE_TYPE_NUM_8 = JdbcWritableBridge.readBigDecimal(99, __dbResults);
    this.WEBSITE_TYPE_9 = JdbcWritableBridge.readString(100, __dbResults);
    this.WEBSITE_TYPE_NUM_9 = JdbcWritableBridge.readBigDecimal(101, __dbResults);
    this.WEBSITE_TYPE_10 = JdbcWritableBridge.readString(102, __dbResults);
    this.WEBSITE_TYPE_NUM_10 = JdbcWritableBridge.readBigDecimal(103, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(104, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(105, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(TOTAL_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_10M_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_20M_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_50M_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_OTHERS_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_NET_FLOW, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SBZ_NOT_YMZ_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YMZ_NOT_SBZ_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YMZ_AND_SBZ_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OTHERS_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_NET_NUM, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_NET_FLOW, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_NET_NUM, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_NET_FLOW, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_LC_NET_NUM, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_LC_NET_FLOW, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZS_NET_NUM, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZS_NET_FLOW, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_SW_NET_NUM, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_SW_NET_FLOW, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZW_NET_NUM, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZW_NET_FLOW, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_XW_NET_NUM, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_XW_NET_FLOW, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_BW_NET_NUM, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_BW_NET_FLOW, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WS_NET_NUM, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WS_NET_FLOW, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WY_NET_NUM, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WY_NET_FLOW, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_LC_NET_NUM, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_LC_NET_FLOW, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZS_NET_NUM, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZS_NET_FLOW, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_SW_NET_NUM, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_SW_NET_FLOW, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZW_NET_NUM, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZW_NET_FLOW, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_XW_NET_NUM, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_XW_NET_FLOW, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_BW_NET_NUM, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_BW_NET_FLOW, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WS_NET_NUM, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WS_NET_FLOW, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WY_NET_NUM, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WY_NET_FLOW, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PC_NET_TOTAL_TIME, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PC_NET_TOTAL_NUM, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MOBILE_NET_TOTAL_TIME, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MOBILE_NET_TOTAL_NUM, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_1, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_1, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_1, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_2, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_2, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_2, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_3, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_3, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_3, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_4, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_4, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_4, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_5, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_5, 67 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_5, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_6, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_6, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_6, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_7, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_7, 73 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_7, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_8, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_8, 76 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_8, 77 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_9, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_9, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_9, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_10, 81 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_10, 82 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_10, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_1, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_1, 85 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_2, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_2, 87 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_3, 88 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_3, 89 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_4, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_4, 91 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_5, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_5, 93 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_6, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_6, 95 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_7, 96 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_7, 97 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_8, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_8, 99 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_9, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_9, 101 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_10, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_10, 103 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 104 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 105 + __off, 12, __dbStmt);
    return 105;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_10M_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_20M_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_50M_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BW_OTHERS_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_NET_FLOW, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SBZ_NOT_YMZ_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YMZ_NOT_SBZ_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YMZ_AND_SBZ_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OTHERS_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_NET_NUM, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_NET_FLOW, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_NET_NUM, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_NET_FLOW, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_LC_NET_NUM, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_LC_NET_FLOW, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZS_NET_NUM, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZS_NET_FLOW, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_SW_NET_NUM, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_SW_NET_FLOW, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZW_NET_NUM, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_ZW_NET_FLOW, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_XW_NET_NUM, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_XW_NET_FLOW, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_BW_NET_NUM, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_BW_NET_FLOW, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WS_NET_NUM, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WS_NET_FLOW, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WY_NET_NUM, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKDAY_WY_NET_FLOW, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_LC_NET_NUM, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_LC_NET_FLOW, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZS_NET_NUM, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZS_NET_FLOW, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_SW_NET_NUM, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_SW_NET_FLOW, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZW_NET_NUM, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_ZW_NET_FLOW, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_XW_NET_NUM, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_XW_NET_FLOW, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_BW_NET_NUM, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_BW_NET_FLOW, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WS_NET_NUM, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WS_NET_FLOW, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WY_NET_NUM, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEEKEND_WY_NET_FLOW, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PC_NET_TOTAL_TIME, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PC_NET_TOTAL_NUM, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MOBILE_NET_TOTAL_TIME, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MOBILE_NET_TOTAL_NUM, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_1, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_1, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_1, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_2, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_2, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_2, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_3, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_3, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_3, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_4, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_4, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_4, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_5, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_5, 67 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_5, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_6, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_6, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_6, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_7, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_7, 73 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_7, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_8, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_8, 76 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_8, 77 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_9, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_9, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_9, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_NAME_10, 81 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMAIN_TYPE_10, 82 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DOMAIN_NAME_NUM_10, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_1, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_1, 85 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_2, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_2, 87 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_3, 88 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_3, 89 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_4, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_4, 91 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_5, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_5, 93 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_6, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_6, 95 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_7, 96 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_7, 97 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_8, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_8, 99 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_9, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_9, 101 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(WEBSITE_TYPE_10, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WEBSITE_TYPE_NUM_10, 103 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 104 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 105 + __off, 12, __dbStmt);
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
        this.TOTAL_USER_COUNT = null;
    } else {
    this.TOTAL_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BW_10M_USER_COUNT = null;
    } else {
    this.BW_10M_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BW_20M_USER_COUNT = null;
    } else {
    this.BW_20M_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BW_50M_USER_COUNT = null;
    } else {
    this.BW_50M_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BW_OTHERS_USER_COUNT = null;
    } else {
    this.BW_OTHERS_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOTAL_NET_FLOW = null;
    } else {
    this.TOTAL_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SBZ_NOT_YMZ_COUNT = null;
    } else {
    this.SBZ_NOT_YMZ_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMZ_NOT_SBZ_COUNT = null;
    } else {
    this.YMZ_NOT_SBZ_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMZ_AND_SBZ_COUNT = null;
    } else {
    this.YMZ_AND_SBZ_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OTHERS_COUNT = null;
    } else {
    this.OTHERS_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_NET_NUM = null;
    } else {
    this.WEEKDAY_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_NET_FLOW = null;
    } else {
    this.WEEKDAY_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_NET_NUM = null;
    } else {
    this.WEEKEND_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_NET_FLOW = null;
    } else {
    this.WEEKEND_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_LC_NET_NUM = null;
    } else {
    this.WEEKDAY_LC_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_LC_NET_FLOW = null;
    } else {
    this.WEEKDAY_LC_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_ZS_NET_NUM = null;
    } else {
    this.WEEKDAY_ZS_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_ZS_NET_FLOW = null;
    } else {
    this.WEEKDAY_ZS_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_SW_NET_NUM = null;
    } else {
    this.WEEKDAY_SW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_SW_NET_FLOW = null;
    } else {
    this.WEEKDAY_SW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_ZW_NET_NUM = null;
    } else {
    this.WEEKDAY_ZW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_ZW_NET_FLOW = null;
    } else {
    this.WEEKDAY_ZW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_XW_NET_NUM = null;
    } else {
    this.WEEKDAY_XW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_XW_NET_FLOW = null;
    } else {
    this.WEEKDAY_XW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_BW_NET_NUM = null;
    } else {
    this.WEEKDAY_BW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_BW_NET_FLOW = null;
    } else {
    this.WEEKDAY_BW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_WS_NET_NUM = null;
    } else {
    this.WEEKDAY_WS_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_WS_NET_FLOW = null;
    } else {
    this.WEEKDAY_WS_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_WY_NET_NUM = null;
    } else {
    this.WEEKDAY_WY_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKDAY_WY_NET_FLOW = null;
    } else {
    this.WEEKDAY_WY_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_LC_NET_NUM = null;
    } else {
    this.WEEKEND_LC_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_LC_NET_FLOW = null;
    } else {
    this.WEEKEND_LC_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_ZS_NET_NUM = null;
    } else {
    this.WEEKEND_ZS_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_ZS_NET_FLOW = null;
    } else {
    this.WEEKEND_ZS_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_SW_NET_NUM = null;
    } else {
    this.WEEKEND_SW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_SW_NET_FLOW = null;
    } else {
    this.WEEKEND_SW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_ZW_NET_NUM = null;
    } else {
    this.WEEKEND_ZW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_ZW_NET_FLOW = null;
    } else {
    this.WEEKEND_ZW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_XW_NET_NUM = null;
    } else {
    this.WEEKEND_XW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_XW_NET_FLOW = null;
    } else {
    this.WEEKEND_XW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_BW_NET_NUM = null;
    } else {
    this.WEEKEND_BW_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_BW_NET_FLOW = null;
    } else {
    this.WEEKEND_BW_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_WS_NET_NUM = null;
    } else {
    this.WEEKEND_WS_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_WS_NET_FLOW = null;
    } else {
    this.WEEKEND_WS_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_WY_NET_NUM = null;
    } else {
    this.WEEKEND_WY_NET_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEEKEND_WY_NET_FLOW = null;
    } else {
    this.WEEKEND_WY_NET_FLOW = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PC_NET_TOTAL_TIME = null;
    } else {
    this.PC_NET_TOTAL_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PC_NET_TOTAL_NUM = null;
    } else {
    this.PC_NET_TOTAL_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MOBILE_NET_TOTAL_TIME = null;
    } else {
    this.MOBILE_NET_TOTAL_TIME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MOBILE_NET_TOTAL_NUM = null;
    } else {
    this.MOBILE_NET_TOTAL_NUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_1 = null;
    } else {
    this.DOMAIN_NAME_1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_1 = null;
    } else {
    this.DOMAIN_TYPE_1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_1 = null;
    } else {
    this.DOMAIN_NAME_NUM_1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_2 = null;
    } else {
    this.DOMAIN_NAME_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_2 = null;
    } else {
    this.DOMAIN_TYPE_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_2 = null;
    } else {
    this.DOMAIN_NAME_NUM_2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_3 = null;
    } else {
    this.DOMAIN_NAME_3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_3 = null;
    } else {
    this.DOMAIN_TYPE_3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_3 = null;
    } else {
    this.DOMAIN_NAME_NUM_3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_4 = null;
    } else {
    this.DOMAIN_NAME_4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_4 = null;
    } else {
    this.DOMAIN_TYPE_4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_4 = null;
    } else {
    this.DOMAIN_NAME_NUM_4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_5 = null;
    } else {
    this.DOMAIN_NAME_5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_5 = null;
    } else {
    this.DOMAIN_TYPE_5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_5 = null;
    } else {
    this.DOMAIN_NAME_NUM_5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_6 = null;
    } else {
    this.DOMAIN_NAME_6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_6 = null;
    } else {
    this.DOMAIN_TYPE_6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_6 = null;
    } else {
    this.DOMAIN_NAME_NUM_6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_7 = null;
    } else {
    this.DOMAIN_NAME_7 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_7 = null;
    } else {
    this.DOMAIN_TYPE_7 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_7 = null;
    } else {
    this.DOMAIN_NAME_NUM_7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_8 = null;
    } else {
    this.DOMAIN_NAME_8 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_8 = null;
    } else {
    this.DOMAIN_TYPE_8 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_8 = null;
    } else {
    this.DOMAIN_NAME_NUM_8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_9 = null;
    } else {
    this.DOMAIN_NAME_9 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_9 = null;
    } else {
    this.DOMAIN_TYPE_9 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_9 = null;
    } else {
    this.DOMAIN_NAME_NUM_9 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_10 = null;
    } else {
    this.DOMAIN_NAME_10 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_TYPE_10 = null;
    } else {
    this.DOMAIN_TYPE_10 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMAIN_NAME_NUM_10 = null;
    } else {
    this.DOMAIN_NAME_NUM_10 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_1 = null;
    } else {
    this.WEBSITE_TYPE_1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_1 = null;
    } else {
    this.WEBSITE_TYPE_NUM_1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_2 = null;
    } else {
    this.WEBSITE_TYPE_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_2 = null;
    } else {
    this.WEBSITE_TYPE_NUM_2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_3 = null;
    } else {
    this.WEBSITE_TYPE_3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_3 = null;
    } else {
    this.WEBSITE_TYPE_NUM_3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_4 = null;
    } else {
    this.WEBSITE_TYPE_4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_4 = null;
    } else {
    this.WEBSITE_TYPE_NUM_4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_5 = null;
    } else {
    this.WEBSITE_TYPE_5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_5 = null;
    } else {
    this.WEBSITE_TYPE_NUM_5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_6 = null;
    } else {
    this.WEBSITE_TYPE_6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_6 = null;
    } else {
    this.WEBSITE_TYPE_NUM_6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_7 = null;
    } else {
    this.WEBSITE_TYPE_7 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_7 = null;
    } else {
    this.WEBSITE_TYPE_NUM_7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_8 = null;
    } else {
    this.WEBSITE_TYPE_8 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_8 = null;
    } else {
    this.WEBSITE_TYPE_NUM_8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_9 = null;
    } else {
    this.WEBSITE_TYPE_9 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_9 = null;
    } else {
    this.WEBSITE_TYPE_NUM_9 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_10 = null;
    } else {
    this.WEBSITE_TYPE_10 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WEBSITE_TYPE_NUM_10 = null;
    } else {
    this.WEBSITE_TYPE_NUM_10 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ETL_DATE = null;
    } else {
    this.ETL_DATE = new Timestamp(__dataIn.readLong());
    this.ETL_DATE.setNanos(__dataIn.readInt());
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
    if (null == this.TOTAL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_USER_COUNT, __dataOut);
    }
    if (null == this.BW_10M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_10M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_20M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_20M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_50M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_50M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_OTHERS_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_OTHERS_USER_COUNT, __dataOut);
    }
    if (null == this.TOTAL_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_NET_FLOW, __dataOut);
    }
    if (null == this.SBZ_NOT_YMZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SBZ_NOT_YMZ_COUNT, __dataOut);
    }
    if (null == this.YMZ_NOT_SBZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YMZ_NOT_SBZ_COUNT, __dataOut);
    }
    if (null == this.YMZ_AND_SBZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YMZ_AND_SBZ_COUNT, __dataOut);
    }
    if (null == this.OTHERS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OTHERS_COUNT, __dataOut);
    }
    if (null == this.WEEKDAY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_LC_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_LC_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_LC_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_LC_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_ZS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_ZS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_SW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_SW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_SW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_SW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_ZW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_ZW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_XW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_XW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_XW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_XW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_BW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_BW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_BW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_BW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_WS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_WS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_WY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_WY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WY_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_LC_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_LC_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_LC_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_LC_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_ZS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_ZS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_SW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_SW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_SW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_SW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_ZW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_ZW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_XW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_XW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_XW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_XW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_BW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_BW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_BW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_BW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_WS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_WS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_WY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_WY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WY_NET_FLOW, __dataOut);
    }
    if (null == this.PC_NET_TOTAL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PC_NET_TOTAL_TIME, __dataOut);
    }
    if (null == this.PC_NET_TOTAL_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PC_NET_TOTAL_NUM, __dataOut);
    }
    if (null == this.MOBILE_NET_TOTAL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MOBILE_NET_TOTAL_TIME, __dataOut);
    }
    if (null == this.MOBILE_NET_TOTAL_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MOBILE_NET_TOTAL_NUM, __dataOut);
    }
    if (null == this.DOMAIN_NAME_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_1);
    }
    if (null == this.DOMAIN_TYPE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_1);
    }
    if (null == this.DOMAIN_NAME_NUM_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_1, __dataOut);
    }
    if (null == this.DOMAIN_NAME_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_2);
    }
    if (null == this.DOMAIN_TYPE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_2);
    }
    if (null == this.DOMAIN_NAME_NUM_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_2, __dataOut);
    }
    if (null == this.DOMAIN_NAME_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_3);
    }
    if (null == this.DOMAIN_TYPE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_3);
    }
    if (null == this.DOMAIN_NAME_NUM_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_3, __dataOut);
    }
    if (null == this.DOMAIN_NAME_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_4);
    }
    if (null == this.DOMAIN_TYPE_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_4);
    }
    if (null == this.DOMAIN_NAME_NUM_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_4, __dataOut);
    }
    if (null == this.DOMAIN_NAME_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_5);
    }
    if (null == this.DOMAIN_TYPE_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_5);
    }
    if (null == this.DOMAIN_NAME_NUM_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_5, __dataOut);
    }
    if (null == this.DOMAIN_NAME_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_6);
    }
    if (null == this.DOMAIN_TYPE_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_6);
    }
    if (null == this.DOMAIN_NAME_NUM_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_6, __dataOut);
    }
    if (null == this.DOMAIN_NAME_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_7);
    }
    if (null == this.DOMAIN_TYPE_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_7);
    }
    if (null == this.DOMAIN_NAME_NUM_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_7, __dataOut);
    }
    if (null == this.DOMAIN_NAME_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_8);
    }
    if (null == this.DOMAIN_TYPE_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_8);
    }
    if (null == this.DOMAIN_NAME_NUM_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_8, __dataOut);
    }
    if (null == this.DOMAIN_NAME_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_9);
    }
    if (null == this.DOMAIN_TYPE_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_9);
    }
    if (null == this.DOMAIN_NAME_NUM_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_9, __dataOut);
    }
    if (null == this.DOMAIN_NAME_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_10);
    }
    if (null == this.DOMAIN_TYPE_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_10);
    }
    if (null == this.DOMAIN_NAME_NUM_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_10, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_1);
    }
    if (null == this.WEBSITE_TYPE_NUM_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_1, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_2);
    }
    if (null == this.WEBSITE_TYPE_NUM_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_2, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_3);
    }
    if (null == this.WEBSITE_TYPE_NUM_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_3, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_4);
    }
    if (null == this.WEBSITE_TYPE_NUM_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_4, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_5);
    }
    if (null == this.WEBSITE_TYPE_NUM_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_5, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_6);
    }
    if (null == this.WEBSITE_TYPE_NUM_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_6, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_7);
    }
    if (null == this.WEBSITE_TYPE_NUM_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_7, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_8);
    }
    if (null == this.WEBSITE_TYPE_NUM_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_8, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_9);
    }
    if (null == this.WEBSITE_TYPE_NUM_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_9, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_10);
    }
    if (null == this.WEBSITE_TYPE_NUM_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_10, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
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
    if (null == this.TOTAL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_USER_COUNT, __dataOut);
    }
    if (null == this.BW_10M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_10M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_20M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_20M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_50M_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_50M_USER_COUNT, __dataOut);
    }
    if (null == this.BW_OTHERS_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BW_OTHERS_USER_COUNT, __dataOut);
    }
    if (null == this.TOTAL_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_NET_FLOW, __dataOut);
    }
    if (null == this.SBZ_NOT_YMZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SBZ_NOT_YMZ_COUNT, __dataOut);
    }
    if (null == this.YMZ_NOT_SBZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YMZ_NOT_SBZ_COUNT, __dataOut);
    }
    if (null == this.YMZ_AND_SBZ_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YMZ_AND_SBZ_COUNT, __dataOut);
    }
    if (null == this.OTHERS_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OTHERS_COUNT, __dataOut);
    }
    if (null == this.WEEKDAY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_LC_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_LC_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_LC_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_LC_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_ZS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_ZS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_SW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_SW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_SW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_SW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_ZW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_ZW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_ZW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_XW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_XW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_XW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_XW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_BW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_BW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_BW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_BW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_WS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_WS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKDAY_WY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKDAY_WY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKDAY_WY_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_LC_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_LC_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_LC_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_LC_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_ZS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_ZS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_SW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_SW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_SW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_SW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_ZW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_ZW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_ZW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_XW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_XW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_XW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_XW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_BW_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_BW_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_BW_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_BW_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_WS_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WS_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_WS_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WS_NET_FLOW, __dataOut);
    }
    if (null == this.WEEKEND_WY_NET_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WY_NET_NUM, __dataOut);
    }
    if (null == this.WEEKEND_WY_NET_FLOW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEEKEND_WY_NET_FLOW, __dataOut);
    }
    if (null == this.PC_NET_TOTAL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PC_NET_TOTAL_TIME, __dataOut);
    }
    if (null == this.PC_NET_TOTAL_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PC_NET_TOTAL_NUM, __dataOut);
    }
    if (null == this.MOBILE_NET_TOTAL_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MOBILE_NET_TOTAL_TIME, __dataOut);
    }
    if (null == this.MOBILE_NET_TOTAL_NUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MOBILE_NET_TOTAL_NUM, __dataOut);
    }
    if (null == this.DOMAIN_NAME_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_1);
    }
    if (null == this.DOMAIN_TYPE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_1);
    }
    if (null == this.DOMAIN_NAME_NUM_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_1, __dataOut);
    }
    if (null == this.DOMAIN_NAME_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_2);
    }
    if (null == this.DOMAIN_TYPE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_2);
    }
    if (null == this.DOMAIN_NAME_NUM_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_2, __dataOut);
    }
    if (null == this.DOMAIN_NAME_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_3);
    }
    if (null == this.DOMAIN_TYPE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_3);
    }
    if (null == this.DOMAIN_NAME_NUM_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_3, __dataOut);
    }
    if (null == this.DOMAIN_NAME_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_4);
    }
    if (null == this.DOMAIN_TYPE_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_4);
    }
    if (null == this.DOMAIN_NAME_NUM_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_4, __dataOut);
    }
    if (null == this.DOMAIN_NAME_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_5);
    }
    if (null == this.DOMAIN_TYPE_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_5);
    }
    if (null == this.DOMAIN_NAME_NUM_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_5, __dataOut);
    }
    if (null == this.DOMAIN_NAME_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_6);
    }
    if (null == this.DOMAIN_TYPE_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_6);
    }
    if (null == this.DOMAIN_NAME_NUM_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_6, __dataOut);
    }
    if (null == this.DOMAIN_NAME_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_7);
    }
    if (null == this.DOMAIN_TYPE_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_7);
    }
    if (null == this.DOMAIN_NAME_NUM_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_7, __dataOut);
    }
    if (null == this.DOMAIN_NAME_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_8);
    }
    if (null == this.DOMAIN_TYPE_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_8);
    }
    if (null == this.DOMAIN_NAME_NUM_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_8, __dataOut);
    }
    if (null == this.DOMAIN_NAME_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_9);
    }
    if (null == this.DOMAIN_TYPE_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_9);
    }
    if (null == this.DOMAIN_NAME_NUM_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_9, __dataOut);
    }
    if (null == this.DOMAIN_NAME_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_NAME_10);
    }
    if (null == this.DOMAIN_TYPE_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMAIN_TYPE_10);
    }
    if (null == this.DOMAIN_NAME_NUM_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DOMAIN_NAME_NUM_10, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_1);
    }
    if (null == this.WEBSITE_TYPE_NUM_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_1, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_2);
    }
    if (null == this.WEBSITE_TYPE_NUM_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_2, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_3);
    }
    if (null == this.WEBSITE_TYPE_NUM_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_3, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_4);
    }
    if (null == this.WEBSITE_TYPE_NUM_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_4, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_5);
    }
    if (null == this.WEBSITE_TYPE_NUM_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_5, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_6);
    }
    if (null == this.WEBSITE_TYPE_NUM_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_6, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_7);
    }
    if (null == this.WEBSITE_TYPE_NUM_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_7, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_8);
    }
    if (null == this.WEBSITE_TYPE_NUM_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_8, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_9);
    }
    if (null == this.WEBSITE_TYPE_NUM_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_9, __dataOut);
    }
    if (null == this.WEBSITE_TYPE_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WEBSITE_TYPE_10);
    }
    if (null == this.WEBSITE_TYPE_NUM_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WEBSITE_TYPE_NUM_10, __dataOut);
    }
    if (null == this.ETL_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ETL_DATE.getTime());
    __dataOut.writeInt(this.ETL_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_USER_COUNT==null?"null":TOTAL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_10M_USER_COUNT==null?"null":BW_10M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_20M_USER_COUNT==null?"null":BW_20M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_50M_USER_COUNT==null?"null":BW_50M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_OTHERS_USER_COUNT==null?"null":BW_OTHERS_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_NET_FLOW==null?"null":TOTAL_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SBZ_NOT_YMZ_COUNT==null?"null":SBZ_NOT_YMZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMZ_NOT_SBZ_COUNT==null?"null":YMZ_NOT_SBZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMZ_AND_SBZ_COUNT==null?"null":YMZ_AND_SBZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OTHERS_COUNT==null?"null":OTHERS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_NET_NUM==null?"null":WEEKDAY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_NET_FLOW==null?"null":WEEKDAY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_NET_NUM==null?"null":WEEKEND_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_NET_FLOW==null?"null":WEEKEND_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_LC_NET_NUM==null?"null":WEEKDAY_LC_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_LC_NET_FLOW==null?"null":WEEKDAY_LC_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZS_NET_NUM==null?"null":WEEKDAY_ZS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZS_NET_FLOW==null?"null":WEEKDAY_ZS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_SW_NET_NUM==null?"null":WEEKDAY_SW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_SW_NET_FLOW==null?"null":WEEKDAY_SW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZW_NET_NUM==null?"null":WEEKDAY_ZW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZW_NET_FLOW==null?"null":WEEKDAY_ZW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_XW_NET_NUM==null?"null":WEEKDAY_XW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_XW_NET_FLOW==null?"null":WEEKDAY_XW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_BW_NET_NUM==null?"null":WEEKDAY_BW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_BW_NET_FLOW==null?"null":WEEKDAY_BW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WS_NET_NUM==null?"null":WEEKDAY_WS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WS_NET_FLOW==null?"null":WEEKDAY_WS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WY_NET_NUM==null?"null":WEEKDAY_WY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WY_NET_FLOW==null?"null":WEEKDAY_WY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_LC_NET_NUM==null?"null":WEEKEND_LC_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_LC_NET_FLOW==null?"null":WEEKEND_LC_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZS_NET_NUM==null?"null":WEEKEND_ZS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZS_NET_FLOW==null?"null":WEEKEND_ZS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_SW_NET_NUM==null?"null":WEEKEND_SW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_SW_NET_FLOW==null?"null":WEEKEND_SW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZW_NET_NUM==null?"null":WEEKEND_ZW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZW_NET_FLOW==null?"null":WEEKEND_ZW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_XW_NET_NUM==null?"null":WEEKEND_XW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_XW_NET_FLOW==null?"null":WEEKEND_XW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_BW_NET_NUM==null?"null":WEEKEND_BW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_BW_NET_FLOW==null?"null":WEEKEND_BW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WS_NET_NUM==null?"null":WEEKEND_WS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WS_NET_FLOW==null?"null":WEEKEND_WS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WY_NET_NUM==null?"null":WEEKEND_WY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WY_NET_FLOW==null?"null":WEEKEND_WY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PC_NET_TOTAL_TIME==null?"null":PC_NET_TOTAL_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PC_NET_TOTAL_NUM==null?"null":PC_NET_TOTAL_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_NET_TOTAL_TIME==null?"null":MOBILE_NET_TOTAL_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_NET_TOTAL_NUM==null?"null":MOBILE_NET_TOTAL_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_1==null?"null":DOMAIN_NAME_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_1==null?"null":DOMAIN_TYPE_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_1==null?"null":DOMAIN_NAME_NUM_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_2==null?"null":DOMAIN_NAME_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_2==null?"null":DOMAIN_TYPE_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_2==null?"null":DOMAIN_NAME_NUM_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_3==null?"null":DOMAIN_NAME_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_3==null?"null":DOMAIN_TYPE_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_3==null?"null":DOMAIN_NAME_NUM_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_4==null?"null":DOMAIN_NAME_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_4==null?"null":DOMAIN_TYPE_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_4==null?"null":DOMAIN_NAME_NUM_4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_5==null?"null":DOMAIN_NAME_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_5==null?"null":DOMAIN_TYPE_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_5==null?"null":DOMAIN_NAME_NUM_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_6==null?"null":DOMAIN_NAME_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_6==null?"null":DOMAIN_TYPE_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_6==null?"null":DOMAIN_NAME_NUM_6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_7==null?"null":DOMAIN_NAME_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_7==null?"null":DOMAIN_TYPE_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_7==null?"null":DOMAIN_NAME_NUM_7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_8==null?"null":DOMAIN_NAME_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_8==null?"null":DOMAIN_TYPE_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_8==null?"null":DOMAIN_NAME_NUM_8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_9==null?"null":DOMAIN_NAME_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_9==null?"null":DOMAIN_TYPE_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_9==null?"null":DOMAIN_NAME_NUM_9.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_10==null?"null":DOMAIN_NAME_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_10==null?"null":DOMAIN_TYPE_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_10==null?"null":DOMAIN_NAME_NUM_10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_1==null?"null":WEBSITE_TYPE_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_1==null?"null":WEBSITE_TYPE_NUM_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_2==null?"null":WEBSITE_TYPE_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_2==null?"null":WEBSITE_TYPE_NUM_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_3==null?"null":WEBSITE_TYPE_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_3==null?"null":WEBSITE_TYPE_NUM_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_4==null?"null":WEBSITE_TYPE_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_4==null?"null":WEBSITE_TYPE_NUM_4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_5==null?"null":WEBSITE_TYPE_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_5==null?"null":WEBSITE_TYPE_NUM_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_6==null?"null":WEBSITE_TYPE_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_6==null?"null":WEBSITE_TYPE_NUM_6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_7==null?"null":WEBSITE_TYPE_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_7==null?"null":WEBSITE_TYPE_NUM_7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_8==null?"null":WEBSITE_TYPE_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_8==null?"null":WEBSITE_TYPE_NUM_8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_9==null?"null":WEBSITE_TYPE_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_9==null?"null":WEBSITE_TYPE_NUM_9.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_10==null?"null":WEBSITE_TYPE_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_10==null?"null":WEBSITE_TYPE_NUM_10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_USER_COUNT==null?"null":TOTAL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_10M_USER_COUNT==null?"null":BW_10M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_20M_USER_COUNT==null?"null":BW_20M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_50M_USER_COUNT==null?"null":BW_50M_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BW_OTHERS_USER_COUNT==null?"null":BW_OTHERS_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_NET_FLOW==null?"null":TOTAL_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SBZ_NOT_YMZ_COUNT==null?"null":SBZ_NOT_YMZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMZ_NOT_SBZ_COUNT==null?"null":YMZ_NOT_SBZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMZ_AND_SBZ_COUNT==null?"null":YMZ_AND_SBZ_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OTHERS_COUNT==null?"null":OTHERS_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_NET_NUM==null?"null":WEEKDAY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_NET_FLOW==null?"null":WEEKDAY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_NET_NUM==null?"null":WEEKEND_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_NET_FLOW==null?"null":WEEKEND_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_LC_NET_NUM==null?"null":WEEKDAY_LC_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_LC_NET_FLOW==null?"null":WEEKDAY_LC_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZS_NET_NUM==null?"null":WEEKDAY_ZS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZS_NET_FLOW==null?"null":WEEKDAY_ZS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_SW_NET_NUM==null?"null":WEEKDAY_SW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_SW_NET_FLOW==null?"null":WEEKDAY_SW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZW_NET_NUM==null?"null":WEEKDAY_ZW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_ZW_NET_FLOW==null?"null":WEEKDAY_ZW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_XW_NET_NUM==null?"null":WEEKDAY_XW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_XW_NET_FLOW==null?"null":WEEKDAY_XW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_BW_NET_NUM==null?"null":WEEKDAY_BW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_BW_NET_FLOW==null?"null":WEEKDAY_BW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WS_NET_NUM==null?"null":WEEKDAY_WS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WS_NET_FLOW==null?"null":WEEKDAY_WS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WY_NET_NUM==null?"null":WEEKDAY_WY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKDAY_WY_NET_FLOW==null?"null":WEEKDAY_WY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_LC_NET_NUM==null?"null":WEEKEND_LC_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_LC_NET_FLOW==null?"null":WEEKEND_LC_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZS_NET_NUM==null?"null":WEEKEND_ZS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZS_NET_FLOW==null?"null":WEEKEND_ZS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_SW_NET_NUM==null?"null":WEEKEND_SW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_SW_NET_FLOW==null?"null":WEEKEND_SW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZW_NET_NUM==null?"null":WEEKEND_ZW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_ZW_NET_FLOW==null?"null":WEEKEND_ZW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_XW_NET_NUM==null?"null":WEEKEND_XW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_XW_NET_FLOW==null?"null":WEEKEND_XW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_BW_NET_NUM==null?"null":WEEKEND_BW_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_BW_NET_FLOW==null?"null":WEEKEND_BW_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WS_NET_NUM==null?"null":WEEKEND_WS_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WS_NET_FLOW==null?"null":WEEKEND_WS_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WY_NET_NUM==null?"null":WEEKEND_WY_NET_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEEKEND_WY_NET_FLOW==null?"null":WEEKEND_WY_NET_FLOW.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PC_NET_TOTAL_TIME==null?"null":PC_NET_TOTAL_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PC_NET_TOTAL_NUM==null?"null":PC_NET_TOTAL_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_NET_TOTAL_TIME==null?"null":MOBILE_NET_TOTAL_TIME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOBILE_NET_TOTAL_NUM==null?"null":MOBILE_NET_TOTAL_NUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_1==null?"null":DOMAIN_NAME_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_1==null?"null":DOMAIN_TYPE_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_1==null?"null":DOMAIN_NAME_NUM_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_2==null?"null":DOMAIN_NAME_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_2==null?"null":DOMAIN_TYPE_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_2==null?"null":DOMAIN_NAME_NUM_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_3==null?"null":DOMAIN_NAME_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_3==null?"null":DOMAIN_TYPE_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_3==null?"null":DOMAIN_NAME_NUM_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_4==null?"null":DOMAIN_NAME_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_4==null?"null":DOMAIN_TYPE_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_4==null?"null":DOMAIN_NAME_NUM_4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_5==null?"null":DOMAIN_NAME_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_5==null?"null":DOMAIN_TYPE_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_5==null?"null":DOMAIN_NAME_NUM_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_6==null?"null":DOMAIN_NAME_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_6==null?"null":DOMAIN_TYPE_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_6==null?"null":DOMAIN_NAME_NUM_6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_7==null?"null":DOMAIN_NAME_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_7==null?"null":DOMAIN_TYPE_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_7==null?"null":DOMAIN_NAME_NUM_7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_8==null?"null":DOMAIN_NAME_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_8==null?"null":DOMAIN_TYPE_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_8==null?"null":DOMAIN_NAME_NUM_8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_9==null?"null":DOMAIN_NAME_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_9==null?"null":DOMAIN_TYPE_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_9==null?"null":DOMAIN_NAME_NUM_9.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_10==null?"null":DOMAIN_NAME_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_TYPE_10==null?"null":DOMAIN_TYPE_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMAIN_NAME_NUM_10==null?"null":DOMAIN_NAME_NUM_10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_1==null?"null":WEBSITE_TYPE_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_1==null?"null":WEBSITE_TYPE_NUM_1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_2==null?"null":WEBSITE_TYPE_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_2==null?"null":WEBSITE_TYPE_NUM_2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_3==null?"null":WEBSITE_TYPE_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_3==null?"null":WEBSITE_TYPE_NUM_3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_4==null?"null":WEBSITE_TYPE_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_4==null?"null":WEBSITE_TYPE_NUM_4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_5==null?"null":WEBSITE_TYPE_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_5==null?"null":WEBSITE_TYPE_NUM_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_6==null?"null":WEBSITE_TYPE_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_6==null?"null":WEBSITE_TYPE_NUM_6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_7==null?"null":WEBSITE_TYPE_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_7==null?"null":WEBSITE_TYPE_NUM_7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_8==null?"null":WEBSITE_TYPE_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_8==null?"null":WEBSITE_TYPE_NUM_8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_9==null?"null":WEBSITE_TYPE_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_9==null?"null":WEBSITE_TYPE_NUM_9.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_10==null?"null":WEBSITE_TYPE_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WEBSITE_TYPE_NUM_10==null?"null":WEBSITE_TYPE_NUM_10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ETL_DATE==null?"null":"" + ETL_DATE, delimiters));
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_USER_COUNT = null; } else {
      this.TOTAL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_10M_USER_COUNT = null; } else {
      this.BW_10M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_20M_USER_COUNT = null; } else {
      this.BW_20M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_50M_USER_COUNT = null; } else {
      this.BW_50M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_OTHERS_USER_COUNT = null; } else {
      this.BW_OTHERS_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_NET_FLOW = null; } else {
      this.TOTAL_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SBZ_NOT_YMZ_COUNT = null; } else {
      this.SBZ_NOT_YMZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.YMZ_NOT_SBZ_COUNT = null; } else {
      this.YMZ_NOT_SBZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.YMZ_AND_SBZ_COUNT = null; } else {
      this.YMZ_AND_SBZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.OTHERS_COUNT = null; } else {
      this.OTHERS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_NET_NUM = null; } else {
      this.WEEKDAY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_NET_FLOW = null; } else {
      this.WEEKDAY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_NET_NUM = null; } else {
      this.WEEKEND_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_NET_FLOW = null; } else {
      this.WEEKEND_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_LC_NET_NUM = null; } else {
      this.WEEKDAY_LC_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_LC_NET_FLOW = null; } else {
      this.WEEKDAY_LC_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZS_NET_NUM = null; } else {
      this.WEEKDAY_ZS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZS_NET_FLOW = null; } else {
      this.WEEKDAY_ZS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_SW_NET_NUM = null; } else {
      this.WEEKDAY_SW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_SW_NET_FLOW = null; } else {
      this.WEEKDAY_SW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZW_NET_NUM = null; } else {
      this.WEEKDAY_ZW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZW_NET_FLOW = null; } else {
      this.WEEKDAY_ZW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_XW_NET_NUM = null; } else {
      this.WEEKDAY_XW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_XW_NET_FLOW = null; } else {
      this.WEEKDAY_XW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_BW_NET_NUM = null; } else {
      this.WEEKDAY_BW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_BW_NET_FLOW = null; } else {
      this.WEEKDAY_BW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WS_NET_NUM = null; } else {
      this.WEEKDAY_WS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WS_NET_FLOW = null; } else {
      this.WEEKDAY_WS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WY_NET_NUM = null; } else {
      this.WEEKDAY_WY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WY_NET_FLOW = null; } else {
      this.WEEKDAY_WY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_LC_NET_NUM = null; } else {
      this.WEEKEND_LC_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_LC_NET_FLOW = null; } else {
      this.WEEKEND_LC_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZS_NET_NUM = null; } else {
      this.WEEKEND_ZS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZS_NET_FLOW = null; } else {
      this.WEEKEND_ZS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_SW_NET_NUM = null; } else {
      this.WEEKEND_SW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_SW_NET_FLOW = null; } else {
      this.WEEKEND_SW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZW_NET_NUM = null; } else {
      this.WEEKEND_ZW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZW_NET_FLOW = null; } else {
      this.WEEKEND_ZW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_XW_NET_NUM = null; } else {
      this.WEEKEND_XW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_XW_NET_FLOW = null; } else {
      this.WEEKEND_XW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_BW_NET_NUM = null; } else {
      this.WEEKEND_BW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_BW_NET_FLOW = null; } else {
      this.WEEKEND_BW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WS_NET_NUM = null; } else {
      this.WEEKEND_WS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WS_NET_FLOW = null; } else {
      this.WEEKEND_WS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WY_NET_NUM = null; } else {
      this.WEEKEND_WY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WY_NET_FLOW = null; } else {
      this.WEEKEND_WY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PC_NET_TOTAL_TIME = null; } else {
      this.PC_NET_TOTAL_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PC_NET_TOTAL_NUM = null; } else {
      this.PC_NET_TOTAL_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MOBILE_NET_TOTAL_TIME = null; } else {
      this.MOBILE_NET_TOTAL_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MOBILE_NET_TOTAL_NUM = null; } else {
      this.MOBILE_NET_TOTAL_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_1 = null; } else {
      this.DOMAIN_NAME_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_1 = null; } else {
      this.DOMAIN_TYPE_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_1 = null; } else {
      this.DOMAIN_NAME_NUM_1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_2 = null; } else {
      this.DOMAIN_NAME_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_2 = null; } else {
      this.DOMAIN_TYPE_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_2 = null; } else {
      this.DOMAIN_NAME_NUM_2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_3 = null; } else {
      this.DOMAIN_NAME_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_3 = null; } else {
      this.DOMAIN_TYPE_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_3 = null; } else {
      this.DOMAIN_NAME_NUM_3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_4 = null; } else {
      this.DOMAIN_NAME_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_4 = null; } else {
      this.DOMAIN_TYPE_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_4 = null; } else {
      this.DOMAIN_NAME_NUM_4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_5 = null; } else {
      this.DOMAIN_NAME_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_5 = null; } else {
      this.DOMAIN_TYPE_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_5 = null; } else {
      this.DOMAIN_NAME_NUM_5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_6 = null; } else {
      this.DOMAIN_NAME_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_6 = null; } else {
      this.DOMAIN_TYPE_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_6 = null; } else {
      this.DOMAIN_NAME_NUM_6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_7 = null; } else {
      this.DOMAIN_NAME_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_7 = null; } else {
      this.DOMAIN_TYPE_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_7 = null; } else {
      this.DOMAIN_NAME_NUM_7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_8 = null; } else {
      this.DOMAIN_NAME_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_8 = null; } else {
      this.DOMAIN_TYPE_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_8 = null; } else {
      this.DOMAIN_NAME_NUM_8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_9 = null; } else {
      this.DOMAIN_NAME_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_9 = null; } else {
      this.DOMAIN_TYPE_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_9 = null; } else {
      this.DOMAIN_NAME_NUM_9 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_10 = null; } else {
      this.DOMAIN_NAME_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_10 = null; } else {
      this.DOMAIN_TYPE_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_10 = null; } else {
      this.DOMAIN_NAME_NUM_10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_1 = null; } else {
      this.WEBSITE_TYPE_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_1 = null; } else {
      this.WEBSITE_TYPE_NUM_1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_2 = null; } else {
      this.WEBSITE_TYPE_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_2 = null; } else {
      this.WEBSITE_TYPE_NUM_2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_3 = null; } else {
      this.WEBSITE_TYPE_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_3 = null; } else {
      this.WEBSITE_TYPE_NUM_3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_4 = null; } else {
      this.WEBSITE_TYPE_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_4 = null; } else {
      this.WEBSITE_TYPE_NUM_4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_5 = null; } else {
      this.WEBSITE_TYPE_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_5 = null; } else {
      this.WEBSITE_TYPE_NUM_5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_6 = null; } else {
      this.WEBSITE_TYPE_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_6 = null; } else {
      this.WEBSITE_TYPE_NUM_6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_7 = null; } else {
      this.WEBSITE_TYPE_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_7 = null; } else {
      this.WEBSITE_TYPE_NUM_7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_8 = null; } else {
      this.WEBSITE_TYPE_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_8 = null; } else {
      this.WEBSITE_TYPE_NUM_8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_9 = null; } else {
      this.WEBSITE_TYPE_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_9 = null; } else {
      this.WEBSITE_TYPE_NUM_9 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_10 = null; } else {
      this.WEBSITE_TYPE_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_10 = null; } else {
      this.WEBSITE_TYPE_NUM_10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_USER_COUNT = null; } else {
      this.TOTAL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_10M_USER_COUNT = null; } else {
      this.BW_10M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_20M_USER_COUNT = null; } else {
      this.BW_20M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_50M_USER_COUNT = null; } else {
      this.BW_50M_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BW_OTHERS_USER_COUNT = null; } else {
      this.BW_OTHERS_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_NET_FLOW = null; } else {
      this.TOTAL_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SBZ_NOT_YMZ_COUNT = null; } else {
      this.SBZ_NOT_YMZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.YMZ_NOT_SBZ_COUNT = null; } else {
      this.YMZ_NOT_SBZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.YMZ_AND_SBZ_COUNT = null; } else {
      this.YMZ_AND_SBZ_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.OTHERS_COUNT = null; } else {
      this.OTHERS_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_NET_NUM = null; } else {
      this.WEEKDAY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_NET_FLOW = null; } else {
      this.WEEKDAY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_NET_NUM = null; } else {
      this.WEEKEND_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_NET_FLOW = null; } else {
      this.WEEKEND_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_LC_NET_NUM = null; } else {
      this.WEEKDAY_LC_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_LC_NET_FLOW = null; } else {
      this.WEEKDAY_LC_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZS_NET_NUM = null; } else {
      this.WEEKDAY_ZS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZS_NET_FLOW = null; } else {
      this.WEEKDAY_ZS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_SW_NET_NUM = null; } else {
      this.WEEKDAY_SW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_SW_NET_FLOW = null; } else {
      this.WEEKDAY_SW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZW_NET_NUM = null; } else {
      this.WEEKDAY_ZW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_ZW_NET_FLOW = null; } else {
      this.WEEKDAY_ZW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_XW_NET_NUM = null; } else {
      this.WEEKDAY_XW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_XW_NET_FLOW = null; } else {
      this.WEEKDAY_XW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_BW_NET_NUM = null; } else {
      this.WEEKDAY_BW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_BW_NET_FLOW = null; } else {
      this.WEEKDAY_BW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WS_NET_NUM = null; } else {
      this.WEEKDAY_WS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WS_NET_FLOW = null; } else {
      this.WEEKDAY_WS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WY_NET_NUM = null; } else {
      this.WEEKDAY_WY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKDAY_WY_NET_FLOW = null; } else {
      this.WEEKDAY_WY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_LC_NET_NUM = null; } else {
      this.WEEKEND_LC_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_LC_NET_FLOW = null; } else {
      this.WEEKEND_LC_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZS_NET_NUM = null; } else {
      this.WEEKEND_ZS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZS_NET_FLOW = null; } else {
      this.WEEKEND_ZS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_SW_NET_NUM = null; } else {
      this.WEEKEND_SW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_SW_NET_FLOW = null; } else {
      this.WEEKEND_SW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZW_NET_NUM = null; } else {
      this.WEEKEND_ZW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_ZW_NET_FLOW = null; } else {
      this.WEEKEND_ZW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_XW_NET_NUM = null; } else {
      this.WEEKEND_XW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_XW_NET_FLOW = null; } else {
      this.WEEKEND_XW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_BW_NET_NUM = null; } else {
      this.WEEKEND_BW_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_BW_NET_FLOW = null; } else {
      this.WEEKEND_BW_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WS_NET_NUM = null; } else {
      this.WEEKEND_WS_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WS_NET_FLOW = null; } else {
      this.WEEKEND_WS_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WY_NET_NUM = null; } else {
      this.WEEKEND_WY_NET_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEEKEND_WY_NET_FLOW = null; } else {
      this.WEEKEND_WY_NET_FLOW = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PC_NET_TOTAL_TIME = null; } else {
      this.PC_NET_TOTAL_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PC_NET_TOTAL_NUM = null; } else {
      this.PC_NET_TOTAL_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MOBILE_NET_TOTAL_TIME = null; } else {
      this.MOBILE_NET_TOTAL_TIME = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MOBILE_NET_TOTAL_NUM = null; } else {
      this.MOBILE_NET_TOTAL_NUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_1 = null; } else {
      this.DOMAIN_NAME_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_1 = null; } else {
      this.DOMAIN_TYPE_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_1 = null; } else {
      this.DOMAIN_NAME_NUM_1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_2 = null; } else {
      this.DOMAIN_NAME_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_2 = null; } else {
      this.DOMAIN_TYPE_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_2 = null; } else {
      this.DOMAIN_NAME_NUM_2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_3 = null; } else {
      this.DOMAIN_NAME_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_3 = null; } else {
      this.DOMAIN_TYPE_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_3 = null; } else {
      this.DOMAIN_NAME_NUM_3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_4 = null; } else {
      this.DOMAIN_NAME_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_4 = null; } else {
      this.DOMAIN_TYPE_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_4 = null; } else {
      this.DOMAIN_NAME_NUM_4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_5 = null; } else {
      this.DOMAIN_NAME_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_5 = null; } else {
      this.DOMAIN_TYPE_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_5 = null; } else {
      this.DOMAIN_NAME_NUM_5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_6 = null; } else {
      this.DOMAIN_NAME_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_6 = null; } else {
      this.DOMAIN_TYPE_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_6 = null; } else {
      this.DOMAIN_NAME_NUM_6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_7 = null; } else {
      this.DOMAIN_NAME_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_7 = null; } else {
      this.DOMAIN_TYPE_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_7 = null; } else {
      this.DOMAIN_NAME_NUM_7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_8 = null; } else {
      this.DOMAIN_NAME_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_8 = null; } else {
      this.DOMAIN_TYPE_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_8 = null; } else {
      this.DOMAIN_NAME_NUM_8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_9 = null; } else {
      this.DOMAIN_NAME_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_9 = null; } else {
      this.DOMAIN_TYPE_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_9 = null; } else {
      this.DOMAIN_NAME_NUM_9 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_NAME_10 = null; } else {
      this.DOMAIN_NAME_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.DOMAIN_TYPE_10 = null; } else {
      this.DOMAIN_TYPE_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DOMAIN_NAME_NUM_10 = null; } else {
      this.DOMAIN_NAME_NUM_10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_1 = null; } else {
      this.WEBSITE_TYPE_1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_1 = null; } else {
      this.WEBSITE_TYPE_NUM_1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_2 = null; } else {
      this.WEBSITE_TYPE_2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_2 = null; } else {
      this.WEBSITE_TYPE_NUM_2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_3 = null; } else {
      this.WEBSITE_TYPE_3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_3 = null; } else {
      this.WEBSITE_TYPE_NUM_3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_4 = null; } else {
      this.WEBSITE_TYPE_4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_4 = null; } else {
      this.WEBSITE_TYPE_NUM_4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_5 = null; } else {
      this.WEBSITE_TYPE_5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_5 = null; } else {
      this.WEBSITE_TYPE_NUM_5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_6 = null; } else {
      this.WEBSITE_TYPE_6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_6 = null; } else {
      this.WEBSITE_TYPE_NUM_6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_7 = null; } else {
      this.WEBSITE_TYPE_7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_7 = null; } else {
      this.WEBSITE_TYPE_NUM_7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_8 = null; } else {
      this.WEBSITE_TYPE_8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_8 = null; } else {
      this.WEBSITE_TYPE_NUM_8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_9 = null; } else {
      this.WEBSITE_TYPE_9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_9 = null; } else {
      this.WEBSITE_TYPE_NUM_9 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.WEBSITE_TYPE_10 = null; } else {
      this.WEBSITE_TYPE_10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.WEBSITE_TYPE_NUM_10 = null; } else {
      this.WEBSITE_TYPE_NUM_10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ETL_DATE = null; } else {
      this.ETL_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PT_MON = null; } else {
      this.PT_MON = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    st_user_network_beh_m o = (st_user_network_beh_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_user_network_beh_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TOTAL_USER_COUNT", this.TOTAL_USER_COUNT);
    __sqoop$field_map.put("BW_10M_USER_COUNT", this.BW_10M_USER_COUNT);
    __sqoop$field_map.put("BW_20M_USER_COUNT", this.BW_20M_USER_COUNT);
    __sqoop$field_map.put("BW_50M_USER_COUNT", this.BW_50M_USER_COUNT);
    __sqoop$field_map.put("BW_OTHERS_USER_COUNT", this.BW_OTHERS_USER_COUNT);
    __sqoop$field_map.put("TOTAL_NET_FLOW", this.TOTAL_NET_FLOW);
    __sqoop$field_map.put("SBZ_NOT_YMZ_COUNT", this.SBZ_NOT_YMZ_COUNT);
    __sqoop$field_map.put("YMZ_NOT_SBZ_COUNT", this.YMZ_NOT_SBZ_COUNT);
    __sqoop$field_map.put("YMZ_AND_SBZ_COUNT", this.YMZ_AND_SBZ_COUNT);
    __sqoop$field_map.put("OTHERS_COUNT", this.OTHERS_COUNT);
    __sqoop$field_map.put("WEEKDAY_NET_NUM", this.WEEKDAY_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_NET_FLOW", this.WEEKDAY_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_NET_NUM", this.WEEKEND_NET_NUM);
    __sqoop$field_map.put("WEEKEND_NET_FLOW", this.WEEKEND_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_LC_NET_NUM", this.WEEKDAY_LC_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_LC_NET_FLOW", this.WEEKDAY_LC_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_ZS_NET_NUM", this.WEEKDAY_ZS_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_ZS_NET_FLOW", this.WEEKDAY_ZS_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_SW_NET_NUM", this.WEEKDAY_SW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_SW_NET_FLOW", this.WEEKDAY_SW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_ZW_NET_NUM", this.WEEKDAY_ZW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_ZW_NET_FLOW", this.WEEKDAY_ZW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_XW_NET_NUM", this.WEEKDAY_XW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_XW_NET_FLOW", this.WEEKDAY_XW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_BW_NET_NUM", this.WEEKDAY_BW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_BW_NET_FLOW", this.WEEKDAY_BW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_WS_NET_NUM", this.WEEKDAY_WS_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_WS_NET_FLOW", this.WEEKDAY_WS_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_WY_NET_NUM", this.WEEKDAY_WY_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_WY_NET_FLOW", this.WEEKDAY_WY_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_LC_NET_NUM", this.WEEKEND_LC_NET_NUM);
    __sqoop$field_map.put("WEEKEND_LC_NET_FLOW", this.WEEKEND_LC_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_ZS_NET_NUM", this.WEEKEND_ZS_NET_NUM);
    __sqoop$field_map.put("WEEKEND_ZS_NET_FLOW", this.WEEKEND_ZS_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_SW_NET_NUM", this.WEEKEND_SW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_SW_NET_FLOW", this.WEEKEND_SW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_ZW_NET_NUM", this.WEEKEND_ZW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_ZW_NET_FLOW", this.WEEKEND_ZW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_XW_NET_NUM", this.WEEKEND_XW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_XW_NET_FLOW", this.WEEKEND_XW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_BW_NET_NUM", this.WEEKEND_BW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_BW_NET_FLOW", this.WEEKEND_BW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_WS_NET_NUM", this.WEEKEND_WS_NET_NUM);
    __sqoop$field_map.put("WEEKEND_WS_NET_FLOW", this.WEEKEND_WS_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_WY_NET_NUM", this.WEEKEND_WY_NET_NUM);
    __sqoop$field_map.put("WEEKEND_WY_NET_FLOW", this.WEEKEND_WY_NET_FLOW);
    __sqoop$field_map.put("PC_NET_TOTAL_TIME", this.PC_NET_TOTAL_TIME);
    __sqoop$field_map.put("PC_NET_TOTAL_NUM", this.PC_NET_TOTAL_NUM);
    __sqoop$field_map.put("MOBILE_NET_TOTAL_TIME", this.MOBILE_NET_TOTAL_TIME);
    __sqoop$field_map.put("MOBILE_NET_TOTAL_NUM", this.MOBILE_NET_TOTAL_NUM);
    __sqoop$field_map.put("DOMAIN_NAME_1", this.DOMAIN_NAME_1);
    __sqoop$field_map.put("DOMAIN_TYPE_1", this.DOMAIN_TYPE_1);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_1", this.DOMAIN_NAME_NUM_1);
    __sqoop$field_map.put("DOMAIN_NAME_2", this.DOMAIN_NAME_2);
    __sqoop$field_map.put("DOMAIN_TYPE_2", this.DOMAIN_TYPE_2);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_2", this.DOMAIN_NAME_NUM_2);
    __sqoop$field_map.put("DOMAIN_NAME_3", this.DOMAIN_NAME_3);
    __sqoop$field_map.put("DOMAIN_TYPE_3", this.DOMAIN_TYPE_3);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_3", this.DOMAIN_NAME_NUM_3);
    __sqoop$field_map.put("DOMAIN_NAME_4", this.DOMAIN_NAME_4);
    __sqoop$field_map.put("DOMAIN_TYPE_4", this.DOMAIN_TYPE_4);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_4", this.DOMAIN_NAME_NUM_4);
    __sqoop$field_map.put("DOMAIN_NAME_5", this.DOMAIN_NAME_5);
    __sqoop$field_map.put("DOMAIN_TYPE_5", this.DOMAIN_TYPE_5);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_5", this.DOMAIN_NAME_NUM_5);
    __sqoop$field_map.put("DOMAIN_NAME_6", this.DOMAIN_NAME_6);
    __sqoop$field_map.put("DOMAIN_TYPE_6", this.DOMAIN_TYPE_6);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_6", this.DOMAIN_NAME_NUM_6);
    __sqoop$field_map.put("DOMAIN_NAME_7", this.DOMAIN_NAME_7);
    __sqoop$field_map.put("DOMAIN_TYPE_7", this.DOMAIN_TYPE_7);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_7", this.DOMAIN_NAME_NUM_7);
    __sqoop$field_map.put("DOMAIN_NAME_8", this.DOMAIN_NAME_8);
    __sqoop$field_map.put("DOMAIN_TYPE_8", this.DOMAIN_TYPE_8);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_8", this.DOMAIN_NAME_NUM_8);
    __sqoop$field_map.put("DOMAIN_NAME_9", this.DOMAIN_NAME_9);
    __sqoop$field_map.put("DOMAIN_TYPE_9", this.DOMAIN_TYPE_9);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_9", this.DOMAIN_NAME_NUM_9);
    __sqoop$field_map.put("DOMAIN_NAME_10", this.DOMAIN_NAME_10);
    __sqoop$field_map.put("DOMAIN_TYPE_10", this.DOMAIN_TYPE_10);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_10", this.DOMAIN_NAME_NUM_10);
    __sqoop$field_map.put("WEBSITE_TYPE_1", this.WEBSITE_TYPE_1);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_1", this.WEBSITE_TYPE_NUM_1);
    __sqoop$field_map.put("WEBSITE_TYPE_2", this.WEBSITE_TYPE_2);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_2", this.WEBSITE_TYPE_NUM_2);
    __sqoop$field_map.put("WEBSITE_TYPE_3", this.WEBSITE_TYPE_3);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_3", this.WEBSITE_TYPE_NUM_3);
    __sqoop$field_map.put("WEBSITE_TYPE_4", this.WEBSITE_TYPE_4);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_4", this.WEBSITE_TYPE_NUM_4);
    __sqoop$field_map.put("WEBSITE_TYPE_5", this.WEBSITE_TYPE_5);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_5", this.WEBSITE_TYPE_NUM_5);
    __sqoop$field_map.put("WEBSITE_TYPE_6", this.WEBSITE_TYPE_6);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_6", this.WEBSITE_TYPE_NUM_6);
    __sqoop$field_map.put("WEBSITE_TYPE_7", this.WEBSITE_TYPE_7);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_7", this.WEBSITE_TYPE_NUM_7);
    __sqoop$field_map.put("WEBSITE_TYPE_8", this.WEBSITE_TYPE_8);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_8", this.WEBSITE_TYPE_NUM_8);
    __sqoop$field_map.put("WEBSITE_TYPE_9", this.WEBSITE_TYPE_9);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_9", this.WEBSITE_TYPE_NUM_9);
    __sqoop$field_map.put("WEBSITE_TYPE_10", this.WEBSITE_TYPE_10);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_10", this.WEBSITE_TYPE_NUM_10);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TOTAL_USER_COUNT", this.TOTAL_USER_COUNT);
    __sqoop$field_map.put("BW_10M_USER_COUNT", this.BW_10M_USER_COUNT);
    __sqoop$field_map.put("BW_20M_USER_COUNT", this.BW_20M_USER_COUNT);
    __sqoop$field_map.put("BW_50M_USER_COUNT", this.BW_50M_USER_COUNT);
    __sqoop$field_map.put("BW_OTHERS_USER_COUNT", this.BW_OTHERS_USER_COUNT);
    __sqoop$field_map.put("TOTAL_NET_FLOW", this.TOTAL_NET_FLOW);
    __sqoop$field_map.put("SBZ_NOT_YMZ_COUNT", this.SBZ_NOT_YMZ_COUNT);
    __sqoop$field_map.put("YMZ_NOT_SBZ_COUNT", this.YMZ_NOT_SBZ_COUNT);
    __sqoop$field_map.put("YMZ_AND_SBZ_COUNT", this.YMZ_AND_SBZ_COUNT);
    __sqoop$field_map.put("OTHERS_COUNT", this.OTHERS_COUNT);
    __sqoop$field_map.put("WEEKDAY_NET_NUM", this.WEEKDAY_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_NET_FLOW", this.WEEKDAY_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_NET_NUM", this.WEEKEND_NET_NUM);
    __sqoop$field_map.put("WEEKEND_NET_FLOW", this.WEEKEND_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_LC_NET_NUM", this.WEEKDAY_LC_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_LC_NET_FLOW", this.WEEKDAY_LC_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_ZS_NET_NUM", this.WEEKDAY_ZS_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_ZS_NET_FLOW", this.WEEKDAY_ZS_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_SW_NET_NUM", this.WEEKDAY_SW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_SW_NET_FLOW", this.WEEKDAY_SW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_ZW_NET_NUM", this.WEEKDAY_ZW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_ZW_NET_FLOW", this.WEEKDAY_ZW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_XW_NET_NUM", this.WEEKDAY_XW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_XW_NET_FLOW", this.WEEKDAY_XW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_BW_NET_NUM", this.WEEKDAY_BW_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_BW_NET_FLOW", this.WEEKDAY_BW_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_WS_NET_NUM", this.WEEKDAY_WS_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_WS_NET_FLOW", this.WEEKDAY_WS_NET_FLOW);
    __sqoop$field_map.put("WEEKDAY_WY_NET_NUM", this.WEEKDAY_WY_NET_NUM);
    __sqoop$field_map.put("WEEKDAY_WY_NET_FLOW", this.WEEKDAY_WY_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_LC_NET_NUM", this.WEEKEND_LC_NET_NUM);
    __sqoop$field_map.put("WEEKEND_LC_NET_FLOW", this.WEEKEND_LC_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_ZS_NET_NUM", this.WEEKEND_ZS_NET_NUM);
    __sqoop$field_map.put("WEEKEND_ZS_NET_FLOW", this.WEEKEND_ZS_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_SW_NET_NUM", this.WEEKEND_SW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_SW_NET_FLOW", this.WEEKEND_SW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_ZW_NET_NUM", this.WEEKEND_ZW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_ZW_NET_FLOW", this.WEEKEND_ZW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_XW_NET_NUM", this.WEEKEND_XW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_XW_NET_FLOW", this.WEEKEND_XW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_BW_NET_NUM", this.WEEKEND_BW_NET_NUM);
    __sqoop$field_map.put("WEEKEND_BW_NET_FLOW", this.WEEKEND_BW_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_WS_NET_NUM", this.WEEKEND_WS_NET_NUM);
    __sqoop$field_map.put("WEEKEND_WS_NET_FLOW", this.WEEKEND_WS_NET_FLOW);
    __sqoop$field_map.put("WEEKEND_WY_NET_NUM", this.WEEKEND_WY_NET_NUM);
    __sqoop$field_map.put("WEEKEND_WY_NET_FLOW", this.WEEKEND_WY_NET_FLOW);
    __sqoop$field_map.put("PC_NET_TOTAL_TIME", this.PC_NET_TOTAL_TIME);
    __sqoop$field_map.put("PC_NET_TOTAL_NUM", this.PC_NET_TOTAL_NUM);
    __sqoop$field_map.put("MOBILE_NET_TOTAL_TIME", this.MOBILE_NET_TOTAL_TIME);
    __sqoop$field_map.put("MOBILE_NET_TOTAL_NUM", this.MOBILE_NET_TOTAL_NUM);
    __sqoop$field_map.put("DOMAIN_NAME_1", this.DOMAIN_NAME_1);
    __sqoop$field_map.put("DOMAIN_TYPE_1", this.DOMAIN_TYPE_1);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_1", this.DOMAIN_NAME_NUM_1);
    __sqoop$field_map.put("DOMAIN_NAME_2", this.DOMAIN_NAME_2);
    __sqoop$field_map.put("DOMAIN_TYPE_2", this.DOMAIN_TYPE_2);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_2", this.DOMAIN_NAME_NUM_2);
    __sqoop$field_map.put("DOMAIN_NAME_3", this.DOMAIN_NAME_3);
    __sqoop$field_map.put("DOMAIN_TYPE_3", this.DOMAIN_TYPE_3);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_3", this.DOMAIN_NAME_NUM_3);
    __sqoop$field_map.put("DOMAIN_NAME_4", this.DOMAIN_NAME_4);
    __sqoop$field_map.put("DOMAIN_TYPE_4", this.DOMAIN_TYPE_4);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_4", this.DOMAIN_NAME_NUM_4);
    __sqoop$field_map.put("DOMAIN_NAME_5", this.DOMAIN_NAME_5);
    __sqoop$field_map.put("DOMAIN_TYPE_5", this.DOMAIN_TYPE_5);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_5", this.DOMAIN_NAME_NUM_5);
    __sqoop$field_map.put("DOMAIN_NAME_6", this.DOMAIN_NAME_6);
    __sqoop$field_map.put("DOMAIN_TYPE_6", this.DOMAIN_TYPE_6);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_6", this.DOMAIN_NAME_NUM_6);
    __sqoop$field_map.put("DOMAIN_NAME_7", this.DOMAIN_NAME_7);
    __sqoop$field_map.put("DOMAIN_TYPE_7", this.DOMAIN_TYPE_7);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_7", this.DOMAIN_NAME_NUM_7);
    __sqoop$field_map.put("DOMAIN_NAME_8", this.DOMAIN_NAME_8);
    __sqoop$field_map.put("DOMAIN_TYPE_8", this.DOMAIN_TYPE_8);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_8", this.DOMAIN_NAME_NUM_8);
    __sqoop$field_map.put("DOMAIN_NAME_9", this.DOMAIN_NAME_9);
    __sqoop$field_map.put("DOMAIN_TYPE_9", this.DOMAIN_TYPE_9);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_9", this.DOMAIN_NAME_NUM_9);
    __sqoop$field_map.put("DOMAIN_NAME_10", this.DOMAIN_NAME_10);
    __sqoop$field_map.put("DOMAIN_TYPE_10", this.DOMAIN_TYPE_10);
    __sqoop$field_map.put("DOMAIN_NAME_NUM_10", this.DOMAIN_NAME_NUM_10);
    __sqoop$field_map.put("WEBSITE_TYPE_1", this.WEBSITE_TYPE_1);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_1", this.WEBSITE_TYPE_NUM_1);
    __sqoop$field_map.put("WEBSITE_TYPE_2", this.WEBSITE_TYPE_2);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_2", this.WEBSITE_TYPE_NUM_2);
    __sqoop$field_map.put("WEBSITE_TYPE_3", this.WEBSITE_TYPE_3);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_3", this.WEBSITE_TYPE_NUM_3);
    __sqoop$field_map.put("WEBSITE_TYPE_4", this.WEBSITE_TYPE_4);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_4", this.WEBSITE_TYPE_NUM_4);
    __sqoop$field_map.put("WEBSITE_TYPE_5", this.WEBSITE_TYPE_5);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_5", this.WEBSITE_TYPE_NUM_5);
    __sqoop$field_map.put("WEBSITE_TYPE_6", this.WEBSITE_TYPE_6);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_6", this.WEBSITE_TYPE_NUM_6);
    __sqoop$field_map.put("WEBSITE_TYPE_7", this.WEBSITE_TYPE_7);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_7", this.WEBSITE_TYPE_NUM_7);
    __sqoop$field_map.put("WEBSITE_TYPE_8", this.WEBSITE_TYPE_8);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_8", this.WEBSITE_TYPE_NUM_8);
    __sqoop$field_map.put("WEBSITE_TYPE_9", this.WEBSITE_TYPE_9);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_9", this.WEBSITE_TYPE_NUM_9);
    __sqoop$field_map.put("WEBSITE_TYPE_10", this.WEBSITE_TYPE_10);
    __sqoop$field_map.put("WEBSITE_TYPE_NUM_10", this.WEBSITE_TYPE_NUM_10);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
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
    else    if ("TOTAL_USER_COUNT".equals(__fieldName)) {
      this.TOTAL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BW_10M_USER_COUNT".equals(__fieldName)) {
      this.BW_10M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BW_20M_USER_COUNT".equals(__fieldName)) {
      this.BW_20M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BW_50M_USER_COUNT".equals(__fieldName)) {
      this.BW_50M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BW_OTHERS_USER_COUNT".equals(__fieldName)) {
      this.BW_OTHERS_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOTAL_NET_FLOW".equals(__fieldName)) {
      this.TOTAL_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SBZ_NOT_YMZ_COUNT".equals(__fieldName)) {
      this.SBZ_NOT_YMZ_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("YMZ_NOT_SBZ_COUNT".equals(__fieldName)) {
      this.YMZ_NOT_SBZ_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("YMZ_AND_SBZ_COUNT".equals(__fieldName)) {
      this.YMZ_AND_SBZ_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("OTHERS_COUNT".equals(__fieldName)) {
      this.OTHERS_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_LC_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_LC_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_LC_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_LC_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_ZS_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_ZS_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_ZS_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_ZS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_SW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_SW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_SW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_SW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_ZW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_ZW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_ZW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_ZW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_XW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_XW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_XW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_XW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_BW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_BW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_BW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_BW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_WS_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_WS_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_WS_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_WS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_WY_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_WY_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKDAY_WY_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_WY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_LC_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_LC_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_LC_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_LC_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_ZS_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_ZS_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_ZS_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_ZS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_SW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_SW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_SW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_SW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_ZW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_ZW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_ZW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_ZW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_XW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_XW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_XW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_XW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_BW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_BW_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_BW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_BW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_WS_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_WS_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_WS_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_WS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_WY_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_WY_NET_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEEKEND_WY_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_WY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PC_NET_TOTAL_TIME".equals(__fieldName)) {
      this.PC_NET_TOTAL_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PC_NET_TOTAL_NUM".equals(__fieldName)) {
      this.PC_NET_TOTAL_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MOBILE_NET_TOTAL_TIME".equals(__fieldName)) {
      this.MOBILE_NET_TOTAL_TIME = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MOBILE_NET_TOTAL_NUM".equals(__fieldName)) {
      this.MOBILE_NET_TOTAL_NUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_1".equals(__fieldName)) {
      this.DOMAIN_NAME_1 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_1".equals(__fieldName)) {
      this.DOMAIN_TYPE_1 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_1".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_2".equals(__fieldName)) {
      this.DOMAIN_NAME_2 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_2".equals(__fieldName)) {
      this.DOMAIN_TYPE_2 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_2".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_3".equals(__fieldName)) {
      this.DOMAIN_NAME_3 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_3".equals(__fieldName)) {
      this.DOMAIN_TYPE_3 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_3".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_4".equals(__fieldName)) {
      this.DOMAIN_NAME_4 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_4".equals(__fieldName)) {
      this.DOMAIN_TYPE_4 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_4".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_5".equals(__fieldName)) {
      this.DOMAIN_NAME_5 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_5".equals(__fieldName)) {
      this.DOMAIN_TYPE_5 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_5".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_6".equals(__fieldName)) {
      this.DOMAIN_NAME_6 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_6".equals(__fieldName)) {
      this.DOMAIN_TYPE_6 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_6".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_7".equals(__fieldName)) {
      this.DOMAIN_NAME_7 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_7".equals(__fieldName)) {
      this.DOMAIN_TYPE_7 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_7".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_8".equals(__fieldName)) {
      this.DOMAIN_NAME_8 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_8".equals(__fieldName)) {
      this.DOMAIN_TYPE_8 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_8".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_9".equals(__fieldName)) {
      this.DOMAIN_NAME_9 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_9".equals(__fieldName)) {
      this.DOMAIN_TYPE_9 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_9".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_9 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DOMAIN_NAME_10".equals(__fieldName)) {
      this.DOMAIN_NAME_10 = (String) __fieldVal;
    }
    else    if ("DOMAIN_TYPE_10".equals(__fieldName)) {
      this.DOMAIN_TYPE_10 = (String) __fieldVal;
    }
    else    if ("DOMAIN_NAME_NUM_10".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_10 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_1".equals(__fieldName)) {
      this.WEBSITE_TYPE_1 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_1".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_2".equals(__fieldName)) {
      this.WEBSITE_TYPE_2 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_2".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_3".equals(__fieldName)) {
      this.WEBSITE_TYPE_3 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_3".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_4".equals(__fieldName)) {
      this.WEBSITE_TYPE_4 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_4".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_5".equals(__fieldName)) {
      this.WEBSITE_TYPE_5 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_5".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_6".equals(__fieldName)) {
      this.WEBSITE_TYPE_6 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_6".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_7".equals(__fieldName)) {
      this.WEBSITE_TYPE_7 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_7".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_8".equals(__fieldName)) {
      this.WEBSITE_TYPE_8 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_8".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_9".equals(__fieldName)) {
      this.WEBSITE_TYPE_9 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_9".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_9 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_10".equals(__fieldName)) {
      this.WEBSITE_TYPE_10 = (String) __fieldVal;
    }
    else    if ("WEBSITE_TYPE_NUM_10".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_10 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
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
    else    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("TOTAL_USER_COUNT".equals(__fieldName)) {
      this.TOTAL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BW_10M_USER_COUNT".equals(__fieldName)) {
      this.BW_10M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BW_20M_USER_COUNT".equals(__fieldName)) {
      this.BW_20M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BW_50M_USER_COUNT".equals(__fieldName)) {
      this.BW_50M_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BW_OTHERS_USER_COUNT".equals(__fieldName)) {
      this.BW_OTHERS_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOTAL_NET_FLOW".equals(__fieldName)) {
      this.TOTAL_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SBZ_NOT_YMZ_COUNT".equals(__fieldName)) {
      this.SBZ_NOT_YMZ_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("YMZ_NOT_SBZ_COUNT".equals(__fieldName)) {
      this.YMZ_NOT_SBZ_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("YMZ_AND_SBZ_COUNT".equals(__fieldName)) {
      this.YMZ_AND_SBZ_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("OTHERS_COUNT".equals(__fieldName)) {
      this.OTHERS_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_LC_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_LC_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_LC_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_LC_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_ZS_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_ZS_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_ZS_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_ZS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_SW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_SW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_SW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_SW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_ZW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_ZW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_ZW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_ZW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_XW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_XW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_XW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_XW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_BW_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_BW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_BW_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_BW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_WS_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_WS_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_WS_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_WS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_WY_NET_NUM".equals(__fieldName)) {
      this.WEEKDAY_WY_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKDAY_WY_NET_FLOW".equals(__fieldName)) {
      this.WEEKDAY_WY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_LC_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_LC_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_LC_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_LC_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_ZS_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_ZS_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_ZS_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_ZS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_SW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_SW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_SW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_SW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_ZW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_ZW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_ZW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_ZW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_XW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_XW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_XW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_XW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_BW_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_BW_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_BW_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_BW_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_WS_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_WS_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_WS_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_WS_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_WY_NET_NUM".equals(__fieldName)) {
      this.WEEKEND_WY_NET_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEEKEND_WY_NET_FLOW".equals(__fieldName)) {
      this.WEEKEND_WY_NET_FLOW = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PC_NET_TOTAL_TIME".equals(__fieldName)) {
      this.PC_NET_TOTAL_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PC_NET_TOTAL_NUM".equals(__fieldName)) {
      this.PC_NET_TOTAL_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MOBILE_NET_TOTAL_TIME".equals(__fieldName)) {
      this.MOBILE_NET_TOTAL_TIME = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MOBILE_NET_TOTAL_NUM".equals(__fieldName)) {
      this.MOBILE_NET_TOTAL_NUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_1".equals(__fieldName)) {
      this.DOMAIN_NAME_1 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_1".equals(__fieldName)) {
      this.DOMAIN_TYPE_1 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_1".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_2".equals(__fieldName)) {
      this.DOMAIN_NAME_2 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_2".equals(__fieldName)) {
      this.DOMAIN_TYPE_2 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_2".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_3".equals(__fieldName)) {
      this.DOMAIN_NAME_3 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_3".equals(__fieldName)) {
      this.DOMAIN_TYPE_3 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_3".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_4".equals(__fieldName)) {
      this.DOMAIN_NAME_4 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_4".equals(__fieldName)) {
      this.DOMAIN_TYPE_4 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_4".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_5".equals(__fieldName)) {
      this.DOMAIN_NAME_5 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_5".equals(__fieldName)) {
      this.DOMAIN_TYPE_5 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_5".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_6".equals(__fieldName)) {
      this.DOMAIN_NAME_6 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_6".equals(__fieldName)) {
      this.DOMAIN_TYPE_6 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_6".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_7".equals(__fieldName)) {
      this.DOMAIN_NAME_7 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_7".equals(__fieldName)) {
      this.DOMAIN_TYPE_7 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_7".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_8".equals(__fieldName)) {
      this.DOMAIN_NAME_8 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_8".equals(__fieldName)) {
      this.DOMAIN_TYPE_8 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_8".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_9".equals(__fieldName)) {
      this.DOMAIN_NAME_9 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_9".equals(__fieldName)) {
      this.DOMAIN_TYPE_9 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_9".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_9 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_10".equals(__fieldName)) {
      this.DOMAIN_NAME_10 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_TYPE_10".equals(__fieldName)) {
      this.DOMAIN_TYPE_10 = (String) __fieldVal;
      return true;
    }
    else    if ("DOMAIN_NAME_NUM_10".equals(__fieldName)) {
      this.DOMAIN_NAME_NUM_10 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_1".equals(__fieldName)) {
      this.WEBSITE_TYPE_1 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_1".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_2".equals(__fieldName)) {
      this.WEBSITE_TYPE_2 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_2".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_3".equals(__fieldName)) {
      this.WEBSITE_TYPE_3 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_3".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_4".equals(__fieldName)) {
      this.WEBSITE_TYPE_4 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_4".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_5".equals(__fieldName)) {
      this.WEBSITE_TYPE_5 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_5".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_6".equals(__fieldName)) {
      this.WEBSITE_TYPE_6 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_6".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_7".equals(__fieldName)) {
      this.WEBSITE_TYPE_7 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_7".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_8".equals(__fieldName)) {
      this.WEBSITE_TYPE_8 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_8".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_9".equals(__fieldName)) {
      this.WEBSITE_TYPE_9 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_9".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_9 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_10".equals(__fieldName)) {
      this.WEBSITE_TYPE_10 = (String) __fieldVal;
      return true;
    }
    else    if ("WEBSITE_TYPE_NUM_10".equals(__fieldName)) {
      this.WEBSITE_TYPE_NUM_10 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ETL_DATE".equals(__fieldName)) {
      this.ETL_DATE = (java.sql.Timestamp) __fieldVal;
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
