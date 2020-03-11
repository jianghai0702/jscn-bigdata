// ORM class for table 'ST_CUST_FEAT_DTL_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 01 15:44:32 CST 2019
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

public class ST_CUST_FEAT_DTL_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_CUST_FEAT_DTL_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_CUST_FEAT_DTL_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_CUST_FEAT_DTL_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal DTV_USER_COUNT;
  public java.math.BigDecimal get_DTV_USER_COUNT() {
    return DTV_USER_COUNT;
  }
  public void set_DTV_USER_COUNT(java.math.BigDecimal DTV_USER_COUNT) {
    this.DTV_USER_COUNT = DTV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DTV_USER_COUNT(java.math.BigDecimal DTV_USER_COUNT) {
    this.DTV_USER_COUNT = DTV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DBITV_USER_COUNT;
  public java.math.BigDecimal get_DBITV_USER_COUNT() {
    return DBITV_USER_COUNT;
  }
  public void set_DBITV_USER_COUNT(java.math.BigDecimal DBITV_USER_COUNT) {
    this.DBITV_USER_COUNT = DBITV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DBITV_USER_COUNT(java.math.BigDecimal DBITV_USER_COUNT) {
    this.DBITV_USER_COUNT = DBITV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DITV_USER_COUNT;
  public java.math.BigDecimal get_DITV_USER_COUNT() {
    return DITV_USER_COUNT;
  }
  public void set_DITV_USER_COUNT(java.math.BigDecimal DITV_USER_COUNT) {
    this.DITV_USER_COUNT = DITV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DITV_USER_COUNT(java.math.BigDecimal DITV_USER_COUNT) {
    this.DITV_USER_COUNT = DITV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DFTV_USER_COUNT;
  public java.math.BigDecimal get_DFTV_USER_COUNT() {
    return DFTV_USER_COUNT;
  }
  public void set_DFTV_USER_COUNT(java.math.BigDecimal DFTV_USER_COUNT) {
    this.DFTV_USER_COUNT = DFTV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DFTV_USER_COUNT(java.math.BigDecimal DFTV_USER_COUNT) {
    this.DFTV_USER_COUNT = DFTV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal LAN_USER_COUNT;
  public java.math.BigDecimal get_LAN_USER_COUNT() {
    return LAN_USER_COUNT;
  }
  public void set_LAN_USER_COUNT(java.math.BigDecimal LAN_USER_COUNT) {
    this.LAN_USER_COUNT = LAN_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_LAN_USER_COUNT(java.math.BigDecimal LAN_USER_COUNT) {
    this.LAN_USER_COUNT = LAN_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal HDTV_USER_COUNT;
  public java.math.BigDecimal get_HDTV_USER_COUNT() {
    return HDTV_USER_COUNT;
  }
  public void set_HDTV_USER_COUNT(java.math.BigDecimal HDTV_USER_COUNT) {
    this.HDTV_USER_COUNT = HDTV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_HDTV_USER_COUNT(java.math.BigDecimal HDTV_USER_COUNT) {
    this.HDTV_USER_COUNT = HDTV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal AMSP_USER_COUNT;
  public java.math.BigDecimal get_AMSP_USER_COUNT() {
    return AMSP_USER_COUNT;
  }
  public void set_AMSP_USER_COUNT(java.math.BigDecimal AMSP_USER_COUNT) {
    this.AMSP_USER_COUNT = AMSP_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_AMSP_USER_COUNT(java.math.BigDecimal AMSP_USER_COUNT) {
    this.AMSP_USER_COUNT = AMSP_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CLOUD_MEDIA_USER_COUNT;
  public java.math.BigDecimal get_CLOUD_MEDIA_USER_COUNT() {
    return CLOUD_MEDIA_USER_COUNT;
  }
  public void set_CLOUD_MEDIA_USER_COUNT(java.math.BigDecimal CLOUD_MEDIA_USER_COUNT) {
    this.CLOUD_MEDIA_USER_COUNT = CLOUD_MEDIA_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CLOUD_MEDIA_USER_COUNT(java.math.BigDecimal CLOUD_MEDIA_USER_COUNT) {
    this.CLOUD_MEDIA_USER_COUNT = CLOUD_MEDIA_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal MALE_COUNT;
  public java.math.BigDecimal get_MALE_COUNT() {
    return MALE_COUNT;
  }
  public void set_MALE_COUNT(java.math.BigDecimal MALE_COUNT) {
    this.MALE_COUNT = MALE_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_MALE_COUNT(java.math.BigDecimal MALE_COUNT) {
    this.MALE_COUNT = MALE_COUNT;
    return this;
  }
  private java.math.BigDecimal FEMALE_COUNT;
  public java.math.BigDecimal get_FEMALE_COUNT() {
    return FEMALE_COUNT;
  }
  public void set_FEMALE_COUNT(java.math.BigDecimal FEMALE_COUNT) {
    this.FEMALE_COUNT = FEMALE_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_FEMALE_COUNT(java.math.BigDecimal FEMALE_COUNT) {
    this.FEMALE_COUNT = FEMALE_COUNT;
    return this;
  }
  private java.math.BigDecimal GENERATION_BEFORE_70S;
  public java.math.BigDecimal get_GENERATION_BEFORE_70S() {
    return GENERATION_BEFORE_70S;
  }
  public void set_GENERATION_BEFORE_70S(java.math.BigDecimal GENERATION_BEFORE_70S) {
    this.GENERATION_BEFORE_70S = GENERATION_BEFORE_70S;
  }
  public ST_CUST_FEAT_DTL_M with_GENERATION_BEFORE_70S(java.math.BigDecimal GENERATION_BEFORE_70S) {
    this.GENERATION_BEFORE_70S = GENERATION_BEFORE_70S;
    return this;
  }
  private java.math.BigDecimal GENERATION_BETWEEN_70S_AND_90S;
  public java.math.BigDecimal get_GENERATION_BETWEEN_70S_AND_90S() {
    return GENERATION_BETWEEN_70S_AND_90S;
  }
  public void set_GENERATION_BETWEEN_70S_AND_90S(java.math.BigDecimal GENERATION_BETWEEN_70S_AND_90S) {
    this.GENERATION_BETWEEN_70S_AND_90S = GENERATION_BETWEEN_70S_AND_90S;
  }
  public ST_CUST_FEAT_DTL_M with_GENERATION_BETWEEN_70S_AND_90S(java.math.BigDecimal GENERATION_BETWEEN_70S_AND_90S) {
    this.GENERATION_BETWEEN_70S_AND_90S = GENERATION_BETWEEN_70S_AND_90S;
    return this;
  }
  private java.math.BigDecimal GENERATION_BETWEEN_90S_AND_10S;
  public java.math.BigDecimal get_GENERATION_BETWEEN_90S_AND_10S() {
    return GENERATION_BETWEEN_90S_AND_10S;
  }
  public void set_GENERATION_BETWEEN_90S_AND_10S(java.math.BigDecimal GENERATION_BETWEEN_90S_AND_10S) {
    this.GENERATION_BETWEEN_90S_AND_10S = GENERATION_BETWEEN_90S_AND_10S;
  }
  public ST_CUST_FEAT_DTL_M with_GENERATION_BETWEEN_90S_AND_10S(java.math.BigDecimal GENERATION_BETWEEN_90S_AND_10S) {
    this.GENERATION_BETWEEN_90S_AND_10S = GENERATION_BETWEEN_90S_AND_10S;
    return this;
  }
  private java.math.BigDecimal GENERATION_AFTER_10S;
  public java.math.BigDecimal get_GENERATION_AFTER_10S() {
    return GENERATION_AFTER_10S;
  }
  public void set_GENERATION_AFTER_10S(java.math.BigDecimal GENERATION_AFTER_10S) {
    this.GENERATION_AFTER_10S = GENERATION_AFTER_10S;
  }
  public ST_CUST_FEAT_DTL_M with_GENERATION_AFTER_10S(java.math.BigDecimal GENERATION_AFTER_10S) {
    this.GENERATION_AFTER_10S = GENERATION_AFTER_10S;
    return this;
  }
  private java.math.BigDecimal FAMILY_CHILD_COUNT;
  public java.math.BigDecimal get_FAMILY_CHILD_COUNT() {
    return FAMILY_CHILD_COUNT;
  }
  public void set_FAMILY_CHILD_COUNT(java.math.BigDecimal FAMILY_CHILD_COUNT) {
    this.FAMILY_CHILD_COUNT = FAMILY_CHILD_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_FAMILY_CHILD_COUNT(java.math.BigDecimal FAMILY_CHILD_COUNT) {
    this.FAMILY_CHILD_COUNT = FAMILY_CHILD_COUNT;
    return this;
  }
  private java.math.BigDecimal FAMILY_OLD_COUNT;
  public java.math.BigDecimal get_FAMILY_OLD_COUNT() {
    return FAMILY_OLD_COUNT;
  }
  public void set_FAMILY_OLD_COUNT(java.math.BigDecimal FAMILY_OLD_COUNT) {
    this.FAMILY_OLD_COUNT = FAMILY_OLD_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_FAMILY_OLD_COUNT(java.math.BigDecimal FAMILY_OLD_COUNT) {
    this.FAMILY_OLD_COUNT = FAMILY_OLD_COUNT;
    return this;
  }
  private java.math.BigDecimal FAMILY_CHILD_FAMILT_OLD_COUNT;
  public java.math.BigDecimal get_FAMILY_CHILD_FAMILT_OLD_COUNT() {
    return FAMILY_CHILD_FAMILT_OLD_COUNT;
  }
  public void set_FAMILY_CHILD_FAMILT_OLD_COUNT(java.math.BigDecimal FAMILY_CHILD_FAMILT_OLD_COUNT) {
    this.FAMILY_CHILD_FAMILT_OLD_COUNT = FAMILY_CHILD_FAMILT_OLD_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_FAMILY_CHILD_FAMILT_OLD_COUNT(java.math.BigDecimal FAMILY_CHILD_FAMILT_OLD_COUNT) {
    this.FAMILY_CHILD_FAMILT_OLD_COUNT = FAMILY_CHILD_FAMILT_OLD_COUNT;
    return this;
  }
  private java.math.BigDecimal NFAMILY_CHILD_FAMILT_OLD_COUNT;
  public java.math.BigDecimal get_NFAMILY_CHILD_FAMILT_OLD_COUNT() {
    return NFAMILY_CHILD_FAMILT_OLD_COUNT;
  }
  public void set_NFAMILY_CHILD_FAMILT_OLD_COUNT(java.math.BigDecimal NFAMILY_CHILD_FAMILT_OLD_COUNT) {
    this.NFAMILY_CHILD_FAMILT_OLD_COUNT = NFAMILY_CHILD_FAMILT_OLD_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_NFAMILY_CHILD_FAMILT_OLD_COUNT(java.math.BigDecimal NFAMILY_CHILD_FAMILT_OLD_COUNT) {
    this.NFAMILY_CHILD_FAMILT_OLD_COUNT = NFAMILY_CHILD_FAMILT_OLD_COUNT;
    return this;
  }
  private java.math.BigDecimal CITY_COUNT;
  public java.math.BigDecimal get_CITY_COUNT() {
    return CITY_COUNT;
  }
  public void set_CITY_COUNT(java.math.BigDecimal CITY_COUNT) {
    this.CITY_COUNT = CITY_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CITY_COUNT(java.math.BigDecimal CITY_COUNT) {
    this.CITY_COUNT = CITY_COUNT;
    return this;
  }
  private java.math.BigDecimal SUBURB_COUNT;
  public java.math.BigDecimal get_SUBURB_COUNT() {
    return SUBURB_COUNT;
  }
  public void set_SUBURB_COUNT(java.math.BigDecimal SUBURB_COUNT) {
    this.SUBURB_COUNT = SUBURB_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_SUBURB_COUNT(java.math.BigDecimal SUBURB_COUNT) {
    this.SUBURB_COUNT = SUBURB_COUNT;
    return this;
  }
  private java.math.BigDecimal CONVERGE_USER_COUNT;
  public java.math.BigDecimal get_CONVERGE_USER_COUNT() {
    return CONVERGE_USER_COUNT;
  }
  public void set_CONVERGE_USER_COUNT(java.math.BigDecimal CONVERGE_USER_COUNT) {
    this.CONVERGE_USER_COUNT = CONVERGE_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CONVERGE_USER_COUNT(java.math.BigDecimal CONVERGE_USER_COUNT) {
    this.CONVERGE_USER_COUNT = CONVERGE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal ONLY_LAN_USER_COUNT;
  public java.math.BigDecimal get_ONLY_LAN_USER_COUNT() {
    return ONLY_LAN_USER_COUNT;
  }
  public void set_ONLY_LAN_USER_COUNT(java.math.BigDecimal ONLY_LAN_USER_COUNT) {
    this.ONLY_LAN_USER_COUNT = ONLY_LAN_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_ONLY_LAN_USER_COUNT(java.math.BigDecimal ONLY_LAN_USER_COUNT) {
    this.ONLY_LAN_USER_COUNT = ONLY_LAN_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal TV_USER_COUNT;
  public java.math.BigDecimal get_TV_USER_COUNT() {
    return TV_USER_COUNT;
  }
  public void set_TV_USER_COUNT(java.math.BigDecimal TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TV_USER_COUNT(java.math.BigDecimal TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal NET_1_YEAR_USER_COUNT;
  public java.math.BigDecimal get_NET_1_YEAR_USER_COUNT() {
    return NET_1_YEAR_USER_COUNT;
  }
  public void set_NET_1_YEAR_USER_COUNT(java.math.BigDecimal NET_1_YEAR_USER_COUNT) {
    this.NET_1_YEAR_USER_COUNT = NET_1_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_NET_1_YEAR_USER_COUNT(java.math.BigDecimal NET_1_YEAR_USER_COUNT) {
    this.NET_1_YEAR_USER_COUNT = NET_1_YEAR_USER_COUNT;
    return this;
  }
  private Integer NET_1_TO_3_YEAR_USER_COUNT;
  public Integer get_NET_1_TO_3_YEAR_USER_COUNT() {
    return NET_1_TO_3_YEAR_USER_COUNT;
  }
  public void set_NET_1_TO_3_YEAR_USER_COUNT(Integer NET_1_TO_3_YEAR_USER_COUNT) {
    this.NET_1_TO_3_YEAR_USER_COUNT = NET_1_TO_3_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_NET_1_TO_3_YEAR_USER_COUNT(Integer NET_1_TO_3_YEAR_USER_COUNT) {
    this.NET_1_TO_3_YEAR_USER_COUNT = NET_1_TO_3_YEAR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal NET_3_TO_5_YEAR_USER_COUNT;
  public java.math.BigDecimal get_NET_3_TO_5_YEAR_USER_COUNT() {
    return NET_3_TO_5_YEAR_USER_COUNT;
  }
  public void set_NET_3_TO_5_YEAR_USER_COUNT(java.math.BigDecimal NET_3_TO_5_YEAR_USER_COUNT) {
    this.NET_3_TO_5_YEAR_USER_COUNT = NET_3_TO_5_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_NET_3_TO_5_YEAR_USER_COUNT(java.math.BigDecimal NET_3_TO_5_YEAR_USER_COUNT) {
    this.NET_3_TO_5_YEAR_USER_COUNT = NET_3_TO_5_YEAR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal NET_GRANTER_5_YEAR_USER_COUNT;
  public java.math.BigDecimal get_NET_GRANTER_5_YEAR_USER_COUNT() {
    return NET_GRANTER_5_YEAR_USER_COUNT;
  }
  public void set_NET_GRANTER_5_YEAR_USER_COUNT(java.math.BigDecimal NET_GRANTER_5_YEAR_USER_COUNT) {
    this.NET_GRANTER_5_YEAR_USER_COUNT = NET_GRANTER_5_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_NET_GRANTER_5_YEAR_USER_COUNT(java.math.BigDecimal NET_GRANTER_5_YEAR_USER_COUNT) {
    this.NET_GRANTER_5_YEAR_USER_COUNT = NET_GRANTER_5_YEAR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DEV_1_YEAR_USER_COUNT;
  public java.math.BigDecimal get_DEV_1_YEAR_USER_COUNT() {
    return DEV_1_YEAR_USER_COUNT;
  }
  public void set_DEV_1_YEAR_USER_COUNT(java.math.BigDecimal DEV_1_YEAR_USER_COUNT) {
    this.DEV_1_YEAR_USER_COUNT = DEV_1_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DEV_1_YEAR_USER_COUNT(java.math.BigDecimal DEV_1_YEAR_USER_COUNT) {
    this.DEV_1_YEAR_USER_COUNT = DEV_1_YEAR_USER_COUNT;
    return this;
  }
  private Integer dev_1_to_3_year_user_count;
  public Integer get_dev_1_to_3_year_user_count() {
    return dev_1_to_3_year_user_count;
  }
  public void set_dev_1_to_3_year_user_count(Integer dev_1_to_3_year_user_count) {
    this.dev_1_to_3_year_user_count = dev_1_to_3_year_user_count;
  }
  public ST_CUST_FEAT_DTL_M with_dev_1_to_3_year_user_count(Integer dev_1_to_3_year_user_count) {
    this.dev_1_to_3_year_user_count = dev_1_to_3_year_user_count;
    return this;
  }
  private java.math.BigDecimal DEV_3_TO_5_YEAR_USER_COUNT;
  public java.math.BigDecimal get_DEV_3_TO_5_YEAR_USER_COUNT() {
    return DEV_3_TO_5_YEAR_USER_COUNT;
  }
  public void set_DEV_3_TO_5_YEAR_USER_COUNT(java.math.BigDecimal DEV_3_TO_5_YEAR_USER_COUNT) {
    this.DEV_3_TO_5_YEAR_USER_COUNT = DEV_3_TO_5_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DEV_3_TO_5_YEAR_USER_COUNT(java.math.BigDecimal DEV_3_TO_5_YEAR_USER_COUNT) {
    this.DEV_3_TO_5_YEAR_USER_COUNT = DEV_3_TO_5_YEAR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DEV_GRANTER_5_YEAR_USER_COUNT;
  public java.math.BigDecimal get_DEV_GRANTER_5_YEAR_USER_COUNT() {
    return DEV_GRANTER_5_YEAR_USER_COUNT;
  }
  public void set_DEV_GRANTER_5_YEAR_USER_COUNT(java.math.BigDecimal DEV_GRANTER_5_YEAR_USER_COUNT) {
    this.DEV_GRANTER_5_YEAR_USER_COUNT = DEV_GRANTER_5_YEAR_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_DEV_GRANTER_5_YEAR_USER_COUNT(java.math.BigDecimal DEV_GRANTER_5_YEAR_USER_COUNT) {
    this.DEV_GRANTER_5_YEAR_USER_COUNT = DEV_GRANTER_5_YEAR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal INFREQUENT_CHANGE_USER_COUNT;
  public java.math.BigDecimal get_INFREQUENT_CHANGE_USER_COUNT() {
    return INFREQUENT_CHANGE_USER_COUNT;
  }
  public void set_INFREQUENT_CHANGE_USER_COUNT(java.math.BigDecimal INFREQUENT_CHANGE_USER_COUNT) {
    this.INFREQUENT_CHANGE_USER_COUNT = INFREQUENT_CHANGE_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_INFREQUENT_CHANGE_USER_COUNT(java.math.BigDecimal INFREQUENT_CHANGE_USER_COUNT) {
    this.INFREQUENT_CHANGE_USER_COUNT = INFREQUENT_CHANGE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CHANGE_ONE_TIME_USER_COUNT;
  public java.math.BigDecimal get_CHANGE_ONE_TIME_USER_COUNT() {
    return CHANGE_ONE_TIME_USER_COUNT;
  }
  public void set_CHANGE_ONE_TIME_USER_COUNT(java.math.BigDecimal CHANGE_ONE_TIME_USER_COUNT) {
    this.CHANGE_ONE_TIME_USER_COUNT = CHANGE_ONE_TIME_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CHANGE_ONE_TIME_USER_COUNT(java.math.BigDecimal CHANGE_ONE_TIME_USER_COUNT) {
    this.CHANGE_ONE_TIME_USER_COUNT = CHANGE_ONE_TIME_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal FREQUENT_CHANGE_USER_COUNT;
  public java.math.BigDecimal get_FREQUENT_CHANGE_USER_COUNT() {
    return FREQUENT_CHANGE_USER_COUNT;
  }
  public void set_FREQUENT_CHANGE_USER_COUNT(java.math.BigDecimal FREQUENT_CHANGE_USER_COUNT) {
    this.FREQUENT_CHANGE_USER_COUNT = FREQUENT_CHANGE_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_FREQUENT_CHANGE_USER_COUNT(java.math.BigDecimal FREQUENT_CHANGE_USER_COUNT) {
    this.FREQUENT_CHANGE_USER_COUNT = FREQUENT_CHANGE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CONSUM_OVER_101_USER_COUNT;
  public java.math.BigDecimal get_CONSUM_OVER_101_USER_COUNT() {
    return CONSUM_OVER_101_USER_COUNT;
  }
  public void set_CONSUM_OVER_101_USER_COUNT(java.math.BigDecimal CONSUM_OVER_101_USER_COUNT) {
    this.CONSUM_OVER_101_USER_COUNT = CONSUM_OVER_101_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CONSUM_OVER_101_USER_COUNT(java.math.BigDecimal CONSUM_OVER_101_USER_COUNT) {
    this.CONSUM_OVER_101_USER_COUNT = CONSUM_OVER_101_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CONSUM_51_TO_100_USER_COUNT;
  public java.math.BigDecimal get_CONSUM_51_TO_100_USER_COUNT() {
    return CONSUM_51_TO_100_USER_COUNT;
  }
  public void set_CONSUM_51_TO_100_USER_COUNT(java.math.BigDecimal CONSUM_51_TO_100_USER_COUNT) {
    this.CONSUM_51_TO_100_USER_COUNT = CONSUM_51_TO_100_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CONSUM_51_TO_100_USER_COUNT(java.math.BigDecimal CONSUM_51_TO_100_USER_COUNT) {
    this.CONSUM_51_TO_100_USER_COUNT = CONSUM_51_TO_100_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CONSUM_21_TO_50_USER_COUNT;
  public java.math.BigDecimal get_CONSUM_21_TO_50_USER_COUNT() {
    return CONSUM_21_TO_50_USER_COUNT;
  }
  public void set_CONSUM_21_TO_50_USER_COUNT(java.math.BigDecimal CONSUM_21_TO_50_USER_COUNT) {
    this.CONSUM_21_TO_50_USER_COUNT = CONSUM_21_TO_50_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CONSUM_21_TO_50_USER_COUNT(java.math.BigDecimal CONSUM_21_TO_50_USER_COUNT) {
    this.CONSUM_21_TO_50_USER_COUNT = CONSUM_21_TO_50_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CONSUM_LESS_20_USER_COUNT;
  public java.math.BigDecimal get_CONSUM_LESS_20_USER_COUNT() {
    return CONSUM_LESS_20_USER_COUNT;
  }
  public void set_CONSUM_LESS_20_USER_COUNT(java.math.BigDecimal CONSUM_LESS_20_USER_COUNT) {
    this.CONSUM_LESS_20_USER_COUNT = CONSUM_LESS_20_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_CONSUM_LESS_20_USER_COUNT(java.math.BigDecimal CONSUM_LESS_20_USER_COUNT) {
    this.CONSUM_LESS_20_USER_COUNT = CONSUM_LESS_20_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal VOD_OVER_21_USER_COUNT;
  public java.math.BigDecimal get_VOD_OVER_21_USER_COUNT() {
    return VOD_OVER_21_USER_COUNT;
  }
  public void set_VOD_OVER_21_USER_COUNT(java.math.BigDecimal VOD_OVER_21_USER_COUNT) {
    this.VOD_OVER_21_USER_COUNT = VOD_OVER_21_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_VOD_OVER_21_USER_COUNT(java.math.BigDecimal VOD_OVER_21_USER_COUNT) {
    this.VOD_OVER_21_USER_COUNT = VOD_OVER_21_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal VOD_11_TO_20_USER_COUNT;
  public java.math.BigDecimal get_VOD_11_TO_20_USER_COUNT() {
    return VOD_11_TO_20_USER_COUNT;
  }
  public void set_VOD_11_TO_20_USER_COUNT(java.math.BigDecimal VOD_11_TO_20_USER_COUNT) {
    this.VOD_11_TO_20_USER_COUNT = VOD_11_TO_20_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_VOD_11_TO_20_USER_COUNT(java.math.BigDecimal VOD_11_TO_20_USER_COUNT) {
    this.VOD_11_TO_20_USER_COUNT = VOD_11_TO_20_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal VOD_6_TO_10_USER_COUNT;
  public java.math.BigDecimal get_VOD_6_TO_10_USER_COUNT() {
    return VOD_6_TO_10_USER_COUNT;
  }
  public void set_VOD_6_TO_10_USER_COUNT(java.math.BigDecimal VOD_6_TO_10_USER_COUNT) {
    this.VOD_6_TO_10_USER_COUNT = VOD_6_TO_10_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_VOD_6_TO_10_USER_COUNT(java.math.BigDecimal VOD_6_TO_10_USER_COUNT) {
    this.VOD_6_TO_10_USER_COUNT = VOD_6_TO_10_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal VOD_LESS_5_USER_COUNT;
  public java.math.BigDecimal get_VOD_LESS_5_USER_COUNT() {
    return VOD_LESS_5_USER_COUNT;
  }
  public void set_VOD_LESS_5_USER_COUNT(java.math.BigDecimal VOD_LESS_5_USER_COUNT) {
    this.VOD_LESS_5_USER_COUNT = VOD_LESS_5_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_VOD_LESS_5_USER_COUNT(java.math.BigDecimal VOD_LESS_5_USER_COUNT) {
    this.VOD_LESS_5_USER_COUNT = VOD_LESS_5_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal ACTIVE_USER_COUNT;
  public java.math.BigDecimal get_ACTIVE_USER_COUNT() {
    return ACTIVE_USER_COUNT;
  }
  public void set_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal INACTIVE_USER_COUNT;
  public java.math.BigDecimal get_INACTIVE_USER_COUNT() {
    return INACTIVE_USER_COUNT;
  }
  public void set_INACTIVE_USER_COUNT(java.math.BigDecimal INACTIVE_USER_COUNT) {
    this.INACTIVE_USER_COUNT = INACTIVE_USER_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_INACTIVE_USER_COUNT(java.math.BigDecimal INACTIVE_USER_COUNT) {
    this.INACTIVE_USER_COUNT = INACTIVE_USER_COUNT;
    return this;
  }
  private String PAYMENT_CAHNNEL_TOP_FIVE;
  public String get_PAYMENT_CAHNNEL_TOP_FIVE() {
    return PAYMENT_CAHNNEL_TOP_FIVE;
  }
  public void set_PAYMENT_CAHNNEL_TOP_FIVE(String PAYMENT_CAHNNEL_TOP_FIVE) {
    this.PAYMENT_CAHNNEL_TOP_FIVE = PAYMENT_CAHNNEL_TOP_FIVE;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_CAHNNEL_TOP_FIVE(String PAYMENT_CAHNNEL_TOP_FIVE) {
    this.PAYMENT_CAHNNEL_TOP_FIVE = PAYMENT_CAHNNEL_TOP_FIVE;
    return this;
  }
  private Long TOP5_PAYMENT_CHANNEL_COUNT;
  public Long get_TOP5_PAYMENT_CHANNEL_COUNT() {
    return TOP5_PAYMENT_CHANNEL_COUNT;
  }
  public void set_TOP5_PAYMENT_CHANNEL_COUNT(Long TOP5_PAYMENT_CHANNEL_COUNT) {
    this.TOP5_PAYMENT_CHANNEL_COUNT = TOP5_PAYMENT_CHANNEL_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP5_PAYMENT_CHANNEL_COUNT(Long TOP5_PAYMENT_CHANNEL_COUNT) {
    this.TOP5_PAYMENT_CHANNEL_COUNT = TOP5_PAYMENT_CHANNEL_COUNT;
    return this;
  }
  private String PAYMENT_CAHNNEL_TOP_FOUR;
  public String get_PAYMENT_CAHNNEL_TOP_FOUR() {
    return PAYMENT_CAHNNEL_TOP_FOUR;
  }
  public void set_PAYMENT_CAHNNEL_TOP_FOUR(String PAYMENT_CAHNNEL_TOP_FOUR) {
    this.PAYMENT_CAHNNEL_TOP_FOUR = PAYMENT_CAHNNEL_TOP_FOUR;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_CAHNNEL_TOP_FOUR(String PAYMENT_CAHNNEL_TOP_FOUR) {
    this.PAYMENT_CAHNNEL_TOP_FOUR = PAYMENT_CAHNNEL_TOP_FOUR;
    return this;
  }
  private Long TOP4_PAYMENT_CHANNEL_COUNT;
  public Long get_TOP4_PAYMENT_CHANNEL_COUNT() {
    return TOP4_PAYMENT_CHANNEL_COUNT;
  }
  public void set_TOP4_PAYMENT_CHANNEL_COUNT(Long TOP4_PAYMENT_CHANNEL_COUNT) {
    this.TOP4_PAYMENT_CHANNEL_COUNT = TOP4_PAYMENT_CHANNEL_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP4_PAYMENT_CHANNEL_COUNT(Long TOP4_PAYMENT_CHANNEL_COUNT) {
    this.TOP4_PAYMENT_CHANNEL_COUNT = TOP4_PAYMENT_CHANNEL_COUNT;
    return this;
  }
  private String PAYMENT_CAHNNEL_TOP_THREE;
  public String get_PAYMENT_CAHNNEL_TOP_THREE() {
    return PAYMENT_CAHNNEL_TOP_THREE;
  }
  public void set_PAYMENT_CAHNNEL_TOP_THREE(String PAYMENT_CAHNNEL_TOP_THREE) {
    this.PAYMENT_CAHNNEL_TOP_THREE = PAYMENT_CAHNNEL_TOP_THREE;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_CAHNNEL_TOP_THREE(String PAYMENT_CAHNNEL_TOP_THREE) {
    this.PAYMENT_CAHNNEL_TOP_THREE = PAYMENT_CAHNNEL_TOP_THREE;
    return this;
  }
  private Long TOP3_PAYMENT_CHANNEL_COUNT;
  public Long get_TOP3_PAYMENT_CHANNEL_COUNT() {
    return TOP3_PAYMENT_CHANNEL_COUNT;
  }
  public void set_TOP3_PAYMENT_CHANNEL_COUNT(Long TOP3_PAYMENT_CHANNEL_COUNT) {
    this.TOP3_PAYMENT_CHANNEL_COUNT = TOP3_PAYMENT_CHANNEL_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP3_PAYMENT_CHANNEL_COUNT(Long TOP3_PAYMENT_CHANNEL_COUNT) {
    this.TOP3_PAYMENT_CHANNEL_COUNT = TOP3_PAYMENT_CHANNEL_COUNT;
    return this;
  }
  private String PAYMENT_CAHNNEL_TOP_TWO;
  public String get_PAYMENT_CAHNNEL_TOP_TWO() {
    return PAYMENT_CAHNNEL_TOP_TWO;
  }
  public void set_PAYMENT_CAHNNEL_TOP_TWO(String PAYMENT_CAHNNEL_TOP_TWO) {
    this.PAYMENT_CAHNNEL_TOP_TWO = PAYMENT_CAHNNEL_TOP_TWO;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_CAHNNEL_TOP_TWO(String PAYMENT_CAHNNEL_TOP_TWO) {
    this.PAYMENT_CAHNNEL_TOP_TWO = PAYMENT_CAHNNEL_TOP_TWO;
    return this;
  }
  private java.math.BigDecimal TOP2_PAYMENT_CHANNEL_COUNT;
  public java.math.BigDecimal get_TOP2_PAYMENT_CHANNEL_COUNT() {
    return TOP2_PAYMENT_CHANNEL_COUNT;
  }
  public void set_TOP2_PAYMENT_CHANNEL_COUNT(java.math.BigDecimal TOP2_PAYMENT_CHANNEL_COUNT) {
    this.TOP2_PAYMENT_CHANNEL_COUNT = TOP2_PAYMENT_CHANNEL_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP2_PAYMENT_CHANNEL_COUNT(java.math.BigDecimal TOP2_PAYMENT_CHANNEL_COUNT) {
    this.TOP2_PAYMENT_CHANNEL_COUNT = TOP2_PAYMENT_CHANNEL_COUNT;
    return this;
  }
  private String PAYMENT_CAHNNEL_TOP_ONE;
  public String get_PAYMENT_CAHNNEL_TOP_ONE() {
    return PAYMENT_CAHNNEL_TOP_ONE;
  }
  public void set_PAYMENT_CAHNNEL_TOP_ONE(String PAYMENT_CAHNNEL_TOP_ONE) {
    this.PAYMENT_CAHNNEL_TOP_ONE = PAYMENT_CAHNNEL_TOP_ONE;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_CAHNNEL_TOP_ONE(String PAYMENT_CAHNNEL_TOP_ONE) {
    this.PAYMENT_CAHNNEL_TOP_ONE = PAYMENT_CAHNNEL_TOP_ONE;
    return this;
  }
  private java.math.BigDecimal TOP1_PAYMENT_CHANNEL_COUNT;
  public java.math.BigDecimal get_TOP1_PAYMENT_CHANNEL_COUNT() {
    return TOP1_PAYMENT_CHANNEL_COUNT;
  }
  public void set_TOP1_PAYMENT_CHANNEL_COUNT(java.math.BigDecimal TOP1_PAYMENT_CHANNEL_COUNT) {
    this.TOP1_PAYMENT_CHANNEL_COUNT = TOP1_PAYMENT_CHANNEL_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP1_PAYMENT_CHANNEL_COUNT(java.math.BigDecimal TOP1_PAYMENT_CHANNEL_COUNT) {
    this.TOP1_PAYMENT_CHANNEL_COUNT = TOP1_PAYMENT_CHANNEL_COUNT;
    return this;
  }
  private String PAYMENT_HABIT_TOP_THREE;
  public String get_PAYMENT_HABIT_TOP_THREE() {
    return PAYMENT_HABIT_TOP_THREE;
  }
  public void set_PAYMENT_HABIT_TOP_THREE(String PAYMENT_HABIT_TOP_THREE) {
    this.PAYMENT_HABIT_TOP_THREE = PAYMENT_HABIT_TOP_THREE;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_HABIT_TOP_THREE(String PAYMENT_HABIT_TOP_THREE) {
    this.PAYMENT_HABIT_TOP_THREE = PAYMENT_HABIT_TOP_THREE;
    return this;
  }
  private java.math.BigDecimal TOP3_PAYMENT_HABIT_COUNT;
  public java.math.BigDecimal get_TOP3_PAYMENT_HABIT_COUNT() {
    return TOP3_PAYMENT_HABIT_COUNT;
  }
  public void set_TOP3_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP3_PAYMENT_HABIT_COUNT) {
    this.TOP3_PAYMENT_HABIT_COUNT = TOP3_PAYMENT_HABIT_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP3_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP3_PAYMENT_HABIT_COUNT) {
    this.TOP3_PAYMENT_HABIT_COUNT = TOP3_PAYMENT_HABIT_COUNT;
    return this;
  }
  private String PAYMENT_HABIT_TOP_TWO;
  public String get_PAYMENT_HABIT_TOP_TWO() {
    return PAYMENT_HABIT_TOP_TWO;
  }
  public void set_PAYMENT_HABIT_TOP_TWO(String PAYMENT_HABIT_TOP_TWO) {
    this.PAYMENT_HABIT_TOP_TWO = PAYMENT_HABIT_TOP_TWO;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_HABIT_TOP_TWO(String PAYMENT_HABIT_TOP_TWO) {
    this.PAYMENT_HABIT_TOP_TWO = PAYMENT_HABIT_TOP_TWO;
    return this;
  }
  private java.math.BigDecimal TOP2_PAYMENT_HABIT_COUNT;
  public java.math.BigDecimal get_TOP2_PAYMENT_HABIT_COUNT() {
    return TOP2_PAYMENT_HABIT_COUNT;
  }
  public void set_TOP2_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP2_PAYMENT_HABIT_COUNT) {
    this.TOP2_PAYMENT_HABIT_COUNT = TOP2_PAYMENT_HABIT_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP2_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP2_PAYMENT_HABIT_COUNT) {
    this.TOP2_PAYMENT_HABIT_COUNT = TOP2_PAYMENT_HABIT_COUNT;
    return this;
  }
  private String PAYMENT_HABIT_TOP_ONE;
  public String get_PAYMENT_HABIT_TOP_ONE() {
    return PAYMENT_HABIT_TOP_ONE;
  }
  public void set_PAYMENT_HABIT_TOP_ONE(String PAYMENT_HABIT_TOP_ONE) {
    this.PAYMENT_HABIT_TOP_ONE = PAYMENT_HABIT_TOP_ONE;
  }
  public ST_CUST_FEAT_DTL_M with_PAYMENT_HABIT_TOP_ONE(String PAYMENT_HABIT_TOP_ONE) {
    this.PAYMENT_HABIT_TOP_ONE = PAYMENT_HABIT_TOP_ONE;
    return this;
  }
  private java.math.BigDecimal TOP1_PAYMENT_HABIT_COUNT;
  public java.math.BigDecimal get_TOP1_PAYMENT_HABIT_COUNT() {
    return TOP1_PAYMENT_HABIT_COUNT;
  }
  public void set_TOP1_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP1_PAYMENT_HABIT_COUNT) {
    this.TOP1_PAYMENT_HABIT_COUNT = TOP1_PAYMENT_HABIT_COUNT;
  }
  public ST_CUST_FEAT_DTL_M with_TOP1_PAYMENT_HABIT_COUNT(java.math.BigDecimal TOP1_PAYMENT_HABIT_COUNT) {
    this.TOP1_PAYMENT_HABIT_COUNT = TOP1_PAYMENT_HABIT_COUNT;
    return this;
  }
  private java.math.BigDecimal DEBT_STOP_SEN_LEV_ZERO;
  public java.math.BigDecimal get_DEBT_STOP_SEN_LEV_ZERO() {
    return DEBT_STOP_SEN_LEV_ZERO;
  }
  public void set_DEBT_STOP_SEN_LEV_ZERO(java.math.BigDecimal DEBT_STOP_SEN_LEV_ZERO) {
    this.DEBT_STOP_SEN_LEV_ZERO = DEBT_STOP_SEN_LEV_ZERO;
  }
  public ST_CUST_FEAT_DTL_M with_DEBT_STOP_SEN_LEV_ZERO(java.math.BigDecimal DEBT_STOP_SEN_LEV_ZERO) {
    this.DEBT_STOP_SEN_LEV_ZERO = DEBT_STOP_SEN_LEV_ZERO;
    return this;
  }
  private java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_WEEK;
  public java.math.BigDecimal get_DEBT_STOP_SEN_LEV_ONE_WEEK() {
    return DEBT_STOP_SEN_LEV_ONE_WEEK;
  }
  public void set_DEBT_STOP_SEN_LEV_ONE_WEEK(java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_WEEK) {
    this.DEBT_STOP_SEN_LEV_ONE_WEEK = DEBT_STOP_SEN_LEV_ONE_WEEK;
  }
  public ST_CUST_FEAT_DTL_M with_DEBT_STOP_SEN_LEV_ONE_WEEK(java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_WEEK) {
    this.DEBT_STOP_SEN_LEV_ONE_WEEK = DEBT_STOP_SEN_LEV_ONE_WEEK;
    return this;
  }
  private java.math.BigDecimal DEBT_STOP_SEN_LEV_TWO_WEEKS;
  public java.math.BigDecimal get_DEBT_STOP_SEN_LEV_TWO_WEEKS() {
    return DEBT_STOP_SEN_LEV_TWO_WEEKS;
  }
  public void set_DEBT_STOP_SEN_LEV_TWO_WEEKS(java.math.BigDecimal DEBT_STOP_SEN_LEV_TWO_WEEKS) {
    this.DEBT_STOP_SEN_LEV_TWO_WEEKS = DEBT_STOP_SEN_LEV_TWO_WEEKS;
  }
  public ST_CUST_FEAT_DTL_M with_DEBT_STOP_SEN_LEV_TWO_WEEKS(java.math.BigDecimal DEBT_STOP_SEN_LEV_TWO_WEEKS) {
    this.DEBT_STOP_SEN_LEV_TWO_WEEKS = DEBT_STOP_SEN_LEV_TWO_WEEKS;
    return this;
  }
  private java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_MONTH;
  public java.math.BigDecimal get_DEBT_STOP_SEN_LEV_ONE_MONTH() {
    return DEBT_STOP_SEN_LEV_ONE_MONTH;
  }
  public void set_DEBT_STOP_SEN_LEV_ONE_MONTH(java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_MONTH) {
    this.DEBT_STOP_SEN_LEV_ONE_MONTH = DEBT_STOP_SEN_LEV_ONE_MONTH;
  }
  public ST_CUST_FEAT_DTL_M with_DEBT_STOP_SEN_LEV_ONE_MONTH(java.math.BigDecimal DEBT_STOP_SEN_LEV_ONE_MONTH) {
    this.DEBT_STOP_SEN_LEV_ONE_MONTH = DEBT_STOP_SEN_LEV_ONE_MONTH;
    return this;
  }
  private java.math.BigDecimal DEBT_STOP_SEN_LEV_OVER;
  public java.math.BigDecimal get_DEBT_STOP_SEN_LEV_OVER() {
    return DEBT_STOP_SEN_LEV_OVER;
  }
  public void set_DEBT_STOP_SEN_LEV_OVER(java.math.BigDecimal DEBT_STOP_SEN_LEV_OVER) {
    this.DEBT_STOP_SEN_LEV_OVER = DEBT_STOP_SEN_LEV_OVER;
  }
  public ST_CUST_FEAT_DTL_M with_DEBT_STOP_SEN_LEV_OVER(java.math.BigDecimal DEBT_STOP_SEN_LEV_OVER) {
    this.DEBT_STOP_SEN_LEV_OVER = DEBT_STOP_SEN_LEV_OVER;
    return this;
  }
  private java.math.BigDecimal USER_COUNT_TOTAL;
  public java.math.BigDecimal get_USER_COUNT_TOTAL() {
    return USER_COUNT_TOTAL;
  }
  public void set_USER_COUNT_TOTAL(java.math.BigDecimal USER_COUNT_TOTAL) {
    this.USER_COUNT_TOTAL = USER_COUNT_TOTAL;
  }
  public ST_CUST_FEAT_DTL_M with_USER_COUNT_TOTAL(java.math.BigDecimal USER_COUNT_TOTAL) {
    this.USER_COUNT_TOTAL = USER_COUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal CUST_COUNT_TOTAL;
  public java.math.BigDecimal get_CUST_COUNT_TOTAL() {
    return CUST_COUNT_TOTAL;
  }
  public void set_CUST_COUNT_TOTAL(java.math.BigDecimal CUST_COUNT_TOTAL) {
    this.CUST_COUNT_TOTAL = CUST_COUNT_TOTAL;
  }
  public ST_CUST_FEAT_DTL_M with_CUST_COUNT_TOTAL(java.math.BigDecimal CUST_COUNT_TOTAL) {
    this.CUST_COUNT_TOTAL = CUST_COUNT_TOTAL;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_CUST_FEAT_DTL_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_CUST_FEAT_DTL_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_CUST_FEAT_DTL_M)) {
      return false;
    }
    ST_CUST_FEAT_DTL_M that = (ST_CUST_FEAT_DTL_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.DTV_USER_COUNT == null ? that.DTV_USER_COUNT == null : this.DTV_USER_COUNT.equals(that.DTV_USER_COUNT));
    equal = equal && (this.DBITV_USER_COUNT == null ? that.DBITV_USER_COUNT == null : this.DBITV_USER_COUNT.equals(that.DBITV_USER_COUNT));
    equal = equal && (this.DITV_USER_COUNT == null ? that.DITV_USER_COUNT == null : this.DITV_USER_COUNT.equals(that.DITV_USER_COUNT));
    equal = equal && (this.DFTV_USER_COUNT == null ? that.DFTV_USER_COUNT == null : this.DFTV_USER_COUNT.equals(that.DFTV_USER_COUNT));
    equal = equal && (this.LAN_USER_COUNT == null ? that.LAN_USER_COUNT == null : this.LAN_USER_COUNT.equals(that.LAN_USER_COUNT));
    equal = equal && (this.HDTV_USER_COUNT == null ? that.HDTV_USER_COUNT == null : this.HDTV_USER_COUNT.equals(that.HDTV_USER_COUNT));
    equal = equal && (this.AMSP_USER_COUNT == null ? that.AMSP_USER_COUNT == null : this.AMSP_USER_COUNT.equals(that.AMSP_USER_COUNT));
    equal = equal && (this.CLOUD_MEDIA_USER_COUNT == null ? that.CLOUD_MEDIA_USER_COUNT == null : this.CLOUD_MEDIA_USER_COUNT.equals(that.CLOUD_MEDIA_USER_COUNT));
    equal = equal && (this.MALE_COUNT == null ? that.MALE_COUNT == null : this.MALE_COUNT.equals(that.MALE_COUNT));
    equal = equal && (this.FEMALE_COUNT == null ? that.FEMALE_COUNT == null : this.FEMALE_COUNT.equals(that.FEMALE_COUNT));
    equal = equal && (this.GENERATION_BEFORE_70S == null ? that.GENERATION_BEFORE_70S == null : this.GENERATION_BEFORE_70S.equals(that.GENERATION_BEFORE_70S));
    equal = equal && (this.GENERATION_BETWEEN_70S_AND_90S == null ? that.GENERATION_BETWEEN_70S_AND_90S == null : this.GENERATION_BETWEEN_70S_AND_90S.equals(that.GENERATION_BETWEEN_70S_AND_90S));
    equal = equal && (this.GENERATION_BETWEEN_90S_AND_10S == null ? that.GENERATION_BETWEEN_90S_AND_10S == null : this.GENERATION_BETWEEN_90S_AND_10S.equals(that.GENERATION_BETWEEN_90S_AND_10S));
    equal = equal && (this.GENERATION_AFTER_10S == null ? that.GENERATION_AFTER_10S == null : this.GENERATION_AFTER_10S.equals(that.GENERATION_AFTER_10S));
    equal = equal && (this.FAMILY_CHILD_COUNT == null ? that.FAMILY_CHILD_COUNT == null : this.FAMILY_CHILD_COUNT.equals(that.FAMILY_CHILD_COUNT));
    equal = equal && (this.FAMILY_OLD_COUNT == null ? that.FAMILY_OLD_COUNT == null : this.FAMILY_OLD_COUNT.equals(that.FAMILY_OLD_COUNT));
    equal = equal && (this.FAMILY_CHILD_FAMILT_OLD_COUNT == null ? that.FAMILY_CHILD_FAMILT_OLD_COUNT == null : this.FAMILY_CHILD_FAMILT_OLD_COUNT.equals(that.FAMILY_CHILD_FAMILT_OLD_COUNT));
    equal = equal && (this.NFAMILY_CHILD_FAMILT_OLD_COUNT == null ? that.NFAMILY_CHILD_FAMILT_OLD_COUNT == null : this.NFAMILY_CHILD_FAMILT_OLD_COUNT.equals(that.NFAMILY_CHILD_FAMILT_OLD_COUNT));
    equal = equal && (this.CITY_COUNT == null ? that.CITY_COUNT == null : this.CITY_COUNT.equals(that.CITY_COUNT));
    equal = equal && (this.SUBURB_COUNT == null ? that.SUBURB_COUNT == null : this.SUBURB_COUNT.equals(that.SUBURB_COUNT));
    equal = equal && (this.CONVERGE_USER_COUNT == null ? that.CONVERGE_USER_COUNT == null : this.CONVERGE_USER_COUNT.equals(that.CONVERGE_USER_COUNT));
    equal = equal && (this.ONLY_LAN_USER_COUNT == null ? that.ONLY_LAN_USER_COUNT == null : this.ONLY_LAN_USER_COUNT.equals(that.ONLY_LAN_USER_COUNT));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.NET_1_YEAR_USER_COUNT == null ? that.NET_1_YEAR_USER_COUNT == null : this.NET_1_YEAR_USER_COUNT.equals(that.NET_1_YEAR_USER_COUNT));
    equal = equal && (this.NET_1_TO_3_YEAR_USER_COUNT == null ? that.NET_1_TO_3_YEAR_USER_COUNT == null : this.NET_1_TO_3_YEAR_USER_COUNT.equals(that.NET_1_TO_3_YEAR_USER_COUNT));
    equal = equal && (this.NET_3_TO_5_YEAR_USER_COUNT == null ? that.NET_3_TO_5_YEAR_USER_COUNT == null : this.NET_3_TO_5_YEAR_USER_COUNT.equals(that.NET_3_TO_5_YEAR_USER_COUNT));
    equal = equal && (this.NET_GRANTER_5_YEAR_USER_COUNT == null ? that.NET_GRANTER_5_YEAR_USER_COUNT == null : this.NET_GRANTER_5_YEAR_USER_COUNT.equals(that.NET_GRANTER_5_YEAR_USER_COUNT));
    equal = equal && (this.DEV_1_YEAR_USER_COUNT == null ? that.DEV_1_YEAR_USER_COUNT == null : this.DEV_1_YEAR_USER_COUNT.equals(that.DEV_1_YEAR_USER_COUNT));
    equal = equal && (this.dev_1_to_3_year_user_count == null ? that.dev_1_to_3_year_user_count == null : this.dev_1_to_3_year_user_count.equals(that.dev_1_to_3_year_user_count));
    equal = equal && (this.DEV_3_TO_5_YEAR_USER_COUNT == null ? that.DEV_3_TO_5_YEAR_USER_COUNT == null : this.DEV_3_TO_5_YEAR_USER_COUNT.equals(that.DEV_3_TO_5_YEAR_USER_COUNT));
    equal = equal && (this.DEV_GRANTER_5_YEAR_USER_COUNT == null ? that.DEV_GRANTER_5_YEAR_USER_COUNT == null : this.DEV_GRANTER_5_YEAR_USER_COUNT.equals(that.DEV_GRANTER_5_YEAR_USER_COUNT));
    equal = equal && (this.INFREQUENT_CHANGE_USER_COUNT == null ? that.INFREQUENT_CHANGE_USER_COUNT == null : this.INFREQUENT_CHANGE_USER_COUNT.equals(that.INFREQUENT_CHANGE_USER_COUNT));
    equal = equal && (this.CHANGE_ONE_TIME_USER_COUNT == null ? that.CHANGE_ONE_TIME_USER_COUNT == null : this.CHANGE_ONE_TIME_USER_COUNT.equals(that.CHANGE_ONE_TIME_USER_COUNT));
    equal = equal && (this.FREQUENT_CHANGE_USER_COUNT == null ? that.FREQUENT_CHANGE_USER_COUNT == null : this.FREQUENT_CHANGE_USER_COUNT.equals(that.FREQUENT_CHANGE_USER_COUNT));
    equal = equal && (this.CONSUM_OVER_101_USER_COUNT == null ? that.CONSUM_OVER_101_USER_COUNT == null : this.CONSUM_OVER_101_USER_COUNT.equals(that.CONSUM_OVER_101_USER_COUNT));
    equal = equal && (this.CONSUM_51_TO_100_USER_COUNT == null ? that.CONSUM_51_TO_100_USER_COUNT == null : this.CONSUM_51_TO_100_USER_COUNT.equals(that.CONSUM_51_TO_100_USER_COUNT));
    equal = equal && (this.CONSUM_21_TO_50_USER_COUNT == null ? that.CONSUM_21_TO_50_USER_COUNT == null : this.CONSUM_21_TO_50_USER_COUNT.equals(that.CONSUM_21_TO_50_USER_COUNT));
    equal = equal && (this.CONSUM_LESS_20_USER_COUNT == null ? that.CONSUM_LESS_20_USER_COUNT == null : this.CONSUM_LESS_20_USER_COUNT.equals(that.CONSUM_LESS_20_USER_COUNT));
    equal = equal && (this.VOD_OVER_21_USER_COUNT == null ? that.VOD_OVER_21_USER_COUNT == null : this.VOD_OVER_21_USER_COUNT.equals(that.VOD_OVER_21_USER_COUNT));
    equal = equal && (this.VOD_11_TO_20_USER_COUNT == null ? that.VOD_11_TO_20_USER_COUNT == null : this.VOD_11_TO_20_USER_COUNT.equals(that.VOD_11_TO_20_USER_COUNT));
    equal = equal && (this.VOD_6_TO_10_USER_COUNT == null ? that.VOD_6_TO_10_USER_COUNT == null : this.VOD_6_TO_10_USER_COUNT.equals(that.VOD_6_TO_10_USER_COUNT));
    equal = equal && (this.VOD_LESS_5_USER_COUNT == null ? that.VOD_LESS_5_USER_COUNT == null : this.VOD_LESS_5_USER_COUNT.equals(that.VOD_LESS_5_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.INACTIVE_USER_COUNT == null ? that.INACTIVE_USER_COUNT == null : this.INACTIVE_USER_COUNT.equals(that.INACTIVE_USER_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_FIVE == null ? that.PAYMENT_CAHNNEL_TOP_FIVE == null : this.PAYMENT_CAHNNEL_TOP_FIVE.equals(that.PAYMENT_CAHNNEL_TOP_FIVE));
    equal = equal && (this.TOP5_PAYMENT_CHANNEL_COUNT == null ? that.TOP5_PAYMENT_CHANNEL_COUNT == null : this.TOP5_PAYMENT_CHANNEL_COUNT.equals(that.TOP5_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_FOUR == null ? that.PAYMENT_CAHNNEL_TOP_FOUR == null : this.PAYMENT_CAHNNEL_TOP_FOUR.equals(that.PAYMENT_CAHNNEL_TOP_FOUR));
    equal = equal && (this.TOP4_PAYMENT_CHANNEL_COUNT == null ? that.TOP4_PAYMENT_CHANNEL_COUNT == null : this.TOP4_PAYMENT_CHANNEL_COUNT.equals(that.TOP4_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_THREE == null ? that.PAYMENT_CAHNNEL_TOP_THREE == null : this.PAYMENT_CAHNNEL_TOP_THREE.equals(that.PAYMENT_CAHNNEL_TOP_THREE));
    equal = equal && (this.TOP3_PAYMENT_CHANNEL_COUNT == null ? that.TOP3_PAYMENT_CHANNEL_COUNT == null : this.TOP3_PAYMENT_CHANNEL_COUNT.equals(that.TOP3_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_TWO == null ? that.PAYMENT_CAHNNEL_TOP_TWO == null : this.PAYMENT_CAHNNEL_TOP_TWO.equals(that.PAYMENT_CAHNNEL_TOP_TWO));
    equal = equal && (this.TOP2_PAYMENT_CHANNEL_COUNT == null ? that.TOP2_PAYMENT_CHANNEL_COUNT == null : this.TOP2_PAYMENT_CHANNEL_COUNT.equals(that.TOP2_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_ONE == null ? that.PAYMENT_CAHNNEL_TOP_ONE == null : this.PAYMENT_CAHNNEL_TOP_ONE.equals(that.PAYMENT_CAHNNEL_TOP_ONE));
    equal = equal && (this.TOP1_PAYMENT_CHANNEL_COUNT == null ? that.TOP1_PAYMENT_CHANNEL_COUNT == null : this.TOP1_PAYMENT_CHANNEL_COUNT.equals(that.TOP1_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_THREE == null ? that.PAYMENT_HABIT_TOP_THREE == null : this.PAYMENT_HABIT_TOP_THREE.equals(that.PAYMENT_HABIT_TOP_THREE));
    equal = equal && (this.TOP3_PAYMENT_HABIT_COUNT == null ? that.TOP3_PAYMENT_HABIT_COUNT == null : this.TOP3_PAYMENT_HABIT_COUNT.equals(that.TOP3_PAYMENT_HABIT_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_TWO == null ? that.PAYMENT_HABIT_TOP_TWO == null : this.PAYMENT_HABIT_TOP_TWO.equals(that.PAYMENT_HABIT_TOP_TWO));
    equal = equal && (this.TOP2_PAYMENT_HABIT_COUNT == null ? that.TOP2_PAYMENT_HABIT_COUNT == null : this.TOP2_PAYMENT_HABIT_COUNT.equals(that.TOP2_PAYMENT_HABIT_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_ONE == null ? that.PAYMENT_HABIT_TOP_ONE == null : this.PAYMENT_HABIT_TOP_ONE.equals(that.PAYMENT_HABIT_TOP_ONE));
    equal = equal && (this.TOP1_PAYMENT_HABIT_COUNT == null ? that.TOP1_PAYMENT_HABIT_COUNT == null : this.TOP1_PAYMENT_HABIT_COUNT.equals(that.TOP1_PAYMENT_HABIT_COUNT));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ZERO == null ? that.DEBT_STOP_SEN_LEV_ZERO == null : this.DEBT_STOP_SEN_LEV_ZERO.equals(that.DEBT_STOP_SEN_LEV_ZERO));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ONE_WEEK == null ? that.DEBT_STOP_SEN_LEV_ONE_WEEK == null : this.DEBT_STOP_SEN_LEV_ONE_WEEK.equals(that.DEBT_STOP_SEN_LEV_ONE_WEEK));
    equal = equal && (this.DEBT_STOP_SEN_LEV_TWO_WEEKS == null ? that.DEBT_STOP_SEN_LEV_TWO_WEEKS == null : this.DEBT_STOP_SEN_LEV_TWO_WEEKS.equals(that.DEBT_STOP_SEN_LEV_TWO_WEEKS));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ONE_MONTH == null ? that.DEBT_STOP_SEN_LEV_ONE_MONTH == null : this.DEBT_STOP_SEN_LEV_ONE_MONTH.equals(that.DEBT_STOP_SEN_LEV_ONE_MONTH));
    equal = equal && (this.DEBT_STOP_SEN_LEV_OVER == null ? that.DEBT_STOP_SEN_LEV_OVER == null : this.DEBT_STOP_SEN_LEV_OVER.equals(that.DEBT_STOP_SEN_LEV_OVER));
    equal = equal && (this.USER_COUNT_TOTAL == null ? that.USER_COUNT_TOTAL == null : this.USER_COUNT_TOTAL.equals(that.USER_COUNT_TOTAL));
    equal = equal && (this.CUST_COUNT_TOTAL == null ? that.CUST_COUNT_TOTAL == null : this.CUST_COUNT_TOTAL.equals(that.CUST_COUNT_TOTAL));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_CUST_FEAT_DTL_M)) {
      return false;
    }
    ST_CUST_FEAT_DTL_M that = (ST_CUST_FEAT_DTL_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.DTV_USER_COUNT == null ? that.DTV_USER_COUNT == null : this.DTV_USER_COUNT.equals(that.DTV_USER_COUNT));
    equal = equal && (this.DBITV_USER_COUNT == null ? that.DBITV_USER_COUNT == null : this.DBITV_USER_COUNT.equals(that.DBITV_USER_COUNT));
    equal = equal && (this.DITV_USER_COUNT == null ? that.DITV_USER_COUNT == null : this.DITV_USER_COUNT.equals(that.DITV_USER_COUNT));
    equal = equal && (this.DFTV_USER_COUNT == null ? that.DFTV_USER_COUNT == null : this.DFTV_USER_COUNT.equals(that.DFTV_USER_COUNT));
    equal = equal && (this.LAN_USER_COUNT == null ? that.LAN_USER_COUNT == null : this.LAN_USER_COUNT.equals(that.LAN_USER_COUNT));
    equal = equal && (this.HDTV_USER_COUNT == null ? that.HDTV_USER_COUNT == null : this.HDTV_USER_COUNT.equals(that.HDTV_USER_COUNT));
    equal = equal && (this.AMSP_USER_COUNT == null ? that.AMSP_USER_COUNT == null : this.AMSP_USER_COUNT.equals(that.AMSP_USER_COUNT));
    equal = equal && (this.CLOUD_MEDIA_USER_COUNT == null ? that.CLOUD_MEDIA_USER_COUNT == null : this.CLOUD_MEDIA_USER_COUNT.equals(that.CLOUD_MEDIA_USER_COUNT));
    equal = equal && (this.MALE_COUNT == null ? that.MALE_COUNT == null : this.MALE_COUNT.equals(that.MALE_COUNT));
    equal = equal && (this.FEMALE_COUNT == null ? that.FEMALE_COUNT == null : this.FEMALE_COUNT.equals(that.FEMALE_COUNT));
    equal = equal && (this.GENERATION_BEFORE_70S == null ? that.GENERATION_BEFORE_70S == null : this.GENERATION_BEFORE_70S.equals(that.GENERATION_BEFORE_70S));
    equal = equal && (this.GENERATION_BETWEEN_70S_AND_90S == null ? that.GENERATION_BETWEEN_70S_AND_90S == null : this.GENERATION_BETWEEN_70S_AND_90S.equals(that.GENERATION_BETWEEN_70S_AND_90S));
    equal = equal && (this.GENERATION_BETWEEN_90S_AND_10S == null ? that.GENERATION_BETWEEN_90S_AND_10S == null : this.GENERATION_BETWEEN_90S_AND_10S.equals(that.GENERATION_BETWEEN_90S_AND_10S));
    equal = equal && (this.GENERATION_AFTER_10S == null ? that.GENERATION_AFTER_10S == null : this.GENERATION_AFTER_10S.equals(that.GENERATION_AFTER_10S));
    equal = equal && (this.FAMILY_CHILD_COUNT == null ? that.FAMILY_CHILD_COUNT == null : this.FAMILY_CHILD_COUNT.equals(that.FAMILY_CHILD_COUNT));
    equal = equal && (this.FAMILY_OLD_COUNT == null ? that.FAMILY_OLD_COUNT == null : this.FAMILY_OLD_COUNT.equals(that.FAMILY_OLD_COUNT));
    equal = equal && (this.FAMILY_CHILD_FAMILT_OLD_COUNT == null ? that.FAMILY_CHILD_FAMILT_OLD_COUNT == null : this.FAMILY_CHILD_FAMILT_OLD_COUNT.equals(that.FAMILY_CHILD_FAMILT_OLD_COUNT));
    equal = equal && (this.NFAMILY_CHILD_FAMILT_OLD_COUNT == null ? that.NFAMILY_CHILD_FAMILT_OLD_COUNT == null : this.NFAMILY_CHILD_FAMILT_OLD_COUNT.equals(that.NFAMILY_CHILD_FAMILT_OLD_COUNT));
    equal = equal && (this.CITY_COUNT == null ? that.CITY_COUNT == null : this.CITY_COUNT.equals(that.CITY_COUNT));
    equal = equal && (this.SUBURB_COUNT == null ? that.SUBURB_COUNT == null : this.SUBURB_COUNT.equals(that.SUBURB_COUNT));
    equal = equal && (this.CONVERGE_USER_COUNT == null ? that.CONVERGE_USER_COUNT == null : this.CONVERGE_USER_COUNT.equals(that.CONVERGE_USER_COUNT));
    equal = equal && (this.ONLY_LAN_USER_COUNT == null ? that.ONLY_LAN_USER_COUNT == null : this.ONLY_LAN_USER_COUNT.equals(that.ONLY_LAN_USER_COUNT));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.NET_1_YEAR_USER_COUNT == null ? that.NET_1_YEAR_USER_COUNT == null : this.NET_1_YEAR_USER_COUNT.equals(that.NET_1_YEAR_USER_COUNT));
    equal = equal && (this.NET_1_TO_3_YEAR_USER_COUNT == null ? that.NET_1_TO_3_YEAR_USER_COUNT == null : this.NET_1_TO_3_YEAR_USER_COUNT.equals(that.NET_1_TO_3_YEAR_USER_COUNT));
    equal = equal && (this.NET_3_TO_5_YEAR_USER_COUNT == null ? that.NET_3_TO_5_YEAR_USER_COUNT == null : this.NET_3_TO_5_YEAR_USER_COUNT.equals(that.NET_3_TO_5_YEAR_USER_COUNT));
    equal = equal && (this.NET_GRANTER_5_YEAR_USER_COUNT == null ? that.NET_GRANTER_5_YEAR_USER_COUNT == null : this.NET_GRANTER_5_YEAR_USER_COUNT.equals(that.NET_GRANTER_5_YEAR_USER_COUNT));
    equal = equal && (this.DEV_1_YEAR_USER_COUNT == null ? that.DEV_1_YEAR_USER_COUNT == null : this.DEV_1_YEAR_USER_COUNT.equals(that.DEV_1_YEAR_USER_COUNT));
    equal = equal && (this.dev_1_to_3_year_user_count == null ? that.dev_1_to_3_year_user_count == null : this.dev_1_to_3_year_user_count.equals(that.dev_1_to_3_year_user_count));
    equal = equal && (this.DEV_3_TO_5_YEAR_USER_COUNT == null ? that.DEV_3_TO_5_YEAR_USER_COUNT == null : this.DEV_3_TO_5_YEAR_USER_COUNT.equals(that.DEV_3_TO_5_YEAR_USER_COUNT));
    equal = equal && (this.DEV_GRANTER_5_YEAR_USER_COUNT == null ? that.DEV_GRANTER_5_YEAR_USER_COUNT == null : this.DEV_GRANTER_5_YEAR_USER_COUNT.equals(that.DEV_GRANTER_5_YEAR_USER_COUNT));
    equal = equal && (this.INFREQUENT_CHANGE_USER_COUNT == null ? that.INFREQUENT_CHANGE_USER_COUNT == null : this.INFREQUENT_CHANGE_USER_COUNT.equals(that.INFREQUENT_CHANGE_USER_COUNT));
    equal = equal && (this.CHANGE_ONE_TIME_USER_COUNT == null ? that.CHANGE_ONE_TIME_USER_COUNT == null : this.CHANGE_ONE_TIME_USER_COUNT.equals(that.CHANGE_ONE_TIME_USER_COUNT));
    equal = equal && (this.FREQUENT_CHANGE_USER_COUNT == null ? that.FREQUENT_CHANGE_USER_COUNT == null : this.FREQUENT_CHANGE_USER_COUNT.equals(that.FREQUENT_CHANGE_USER_COUNT));
    equal = equal && (this.CONSUM_OVER_101_USER_COUNT == null ? that.CONSUM_OVER_101_USER_COUNT == null : this.CONSUM_OVER_101_USER_COUNT.equals(that.CONSUM_OVER_101_USER_COUNT));
    equal = equal && (this.CONSUM_51_TO_100_USER_COUNT == null ? that.CONSUM_51_TO_100_USER_COUNT == null : this.CONSUM_51_TO_100_USER_COUNT.equals(that.CONSUM_51_TO_100_USER_COUNT));
    equal = equal && (this.CONSUM_21_TO_50_USER_COUNT == null ? that.CONSUM_21_TO_50_USER_COUNT == null : this.CONSUM_21_TO_50_USER_COUNT.equals(that.CONSUM_21_TO_50_USER_COUNT));
    equal = equal && (this.CONSUM_LESS_20_USER_COUNT == null ? that.CONSUM_LESS_20_USER_COUNT == null : this.CONSUM_LESS_20_USER_COUNT.equals(that.CONSUM_LESS_20_USER_COUNT));
    equal = equal && (this.VOD_OVER_21_USER_COUNT == null ? that.VOD_OVER_21_USER_COUNT == null : this.VOD_OVER_21_USER_COUNT.equals(that.VOD_OVER_21_USER_COUNT));
    equal = equal && (this.VOD_11_TO_20_USER_COUNT == null ? that.VOD_11_TO_20_USER_COUNT == null : this.VOD_11_TO_20_USER_COUNT.equals(that.VOD_11_TO_20_USER_COUNT));
    equal = equal && (this.VOD_6_TO_10_USER_COUNT == null ? that.VOD_6_TO_10_USER_COUNT == null : this.VOD_6_TO_10_USER_COUNT.equals(that.VOD_6_TO_10_USER_COUNT));
    equal = equal && (this.VOD_LESS_5_USER_COUNT == null ? that.VOD_LESS_5_USER_COUNT == null : this.VOD_LESS_5_USER_COUNT.equals(that.VOD_LESS_5_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.INACTIVE_USER_COUNT == null ? that.INACTIVE_USER_COUNT == null : this.INACTIVE_USER_COUNT.equals(that.INACTIVE_USER_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_FIVE == null ? that.PAYMENT_CAHNNEL_TOP_FIVE == null : this.PAYMENT_CAHNNEL_TOP_FIVE.equals(that.PAYMENT_CAHNNEL_TOP_FIVE));
    equal = equal && (this.TOP5_PAYMENT_CHANNEL_COUNT == null ? that.TOP5_PAYMENT_CHANNEL_COUNT == null : this.TOP5_PAYMENT_CHANNEL_COUNT.equals(that.TOP5_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_FOUR == null ? that.PAYMENT_CAHNNEL_TOP_FOUR == null : this.PAYMENT_CAHNNEL_TOP_FOUR.equals(that.PAYMENT_CAHNNEL_TOP_FOUR));
    equal = equal && (this.TOP4_PAYMENT_CHANNEL_COUNT == null ? that.TOP4_PAYMENT_CHANNEL_COUNT == null : this.TOP4_PAYMENT_CHANNEL_COUNT.equals(that.TOP4_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_THREE == null ? that.PAYMENT_CAHNNEL_TOP_THREE == null : this.PAYMENT_CAHNNEL_TOP_THREE.equals(that.PAYMENT_CAHNNEL_TOP_THREE));
    equal = equal && (this.TOP3_PAYMENT_CHANNEL_COUNT == null ? that.TOP3_PAYMENT_CHANNEL_COUNT == null : this.TOP3_PAYMENT_CHANNEL_COUNT.equals(that.TOP3_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_TWO == null ? that.PAYMENT_CAHNNEL_TOP_TWO == null : this.PAYMENT_CAHNNEL_TOP_TWO.equals(that.PAYMENT_CAHNNEL_TOP_TWO));
    equal = equal && (this.TOP2_PAYMENT_CHANNEL_COUNT == null ? that.TOP2_PAYMENT_CHANNEL_COUNT == null : this.TOP2_PAYMENT_CHANNEL_COUNT.equals(that.TOP2_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_CAHNNEL_TOP_ONE == null ? that.PAYMENT_CAHNNEL_TOP_ONE == null : this.PAYMENT_CAHNNEL_TOP_ONE.equals(that.PAYMENT_CAHNNEL_TOP_ONE));
    equal = equal && (this.TOP1_PAYMENT_CHANNEL_COUNT == null ? that.TOP1_PAYMENT_CHANNEL_COUNT == null : this.TOP1_PAYMENT_CHANNEL_COUNT.equals(that.TOP1_PAYMENT_CHANNEL_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_THREE == null ? that.PAYMENT_HABIT_TOP_THREE == null : this.PAYMENT_HABIT_TOP_THREE.equals(that.PAYMENT_HABIT_TOP_THREE));
    equal = equal && (this.TOP3_PAYMENT_HABIT_COUNT == null ? that.TOP3_PAYMENT_HABIT_COUNT == null : this.TOP3_PAYMENT_HABIT_COUNT.equals(that.TOP3_PAYMENT_HABIT_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_TWO == null ? that.PAYMENT_HABIT_TOP_TWO == null : this.PAYMENT_HABIT_TOP_TWO.equals(that.PAYMENT_HABIT_TOP_TWO));
    equal = equal && (this.TOP2_PAYMENT_HABIT_COUNT == null ? that.TOP2_PAYMENT_HABIT_COUNT == null : this.TOP2_PAYMENT_HABIT_COUNT.equals(that.TOP2_PAYMENT_HABIT_COUNT));
    equal = equal && (this.PAYMENT_HABIT_TOP_ONE == null ? that.PAYMENT_HABIT_TOP_ONE == null : this.PAYMENT_HABIT_TOP_ONE.equals(that.PAYMENT_HABIT_TOP_ONE));
    equal = equal && (this.TOP1_PAYMENT_HABIT_COUNT == null ? that.TOP1_PAYMENT_HABIT_COUNT == null : this.TOP1_PAYMENT_HABIT_COUNT.equals(that.TOP1_PAYMENT_HABIT_COUNT));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ZERO == null ? that.DEBT_STOP_SEN_LEV_ZERO == null : this.DEBT_STOP_SEN_LEV_ZERO.equals(that.DEBT_STOP_SEN_LEV_ZERO));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ONE_WEEK == null ? that.DEBT_STOP_SEN_LEV_ONE_WEEK == null : this.DEBT_STOP_SEN_LEV_ONE_WEEK.equals(that.DEBT_STOP_SEN_LEV_ONE_WEEK));
    equal = equal && (this.DEBT_STOP_SEN_LEV_TWO_WEEKS == null ? that.DEBT_STOP_SEN_LEV_TWO_WEEKS == null : this.DEBT_STOP_SEN_LEV_TWO_WEEKS.equals(that.DEBT_STOP_SEN_LEV_TWO_WEEKS));
    equal = equal && (this.DEBT_STOP_SEN_LEV_ONE_MONTH == null ? that.DEBT_STOP_SEN_LEV_ONE_MONTH == null : this.DEBT_STOP_SEN_LEV_ONE_MONTH.equals(that.DEBT_STOP_SEN_LEV_ONE_MONTH));
    equal = equal && (this.DEBT_STOP_SEN_LEV_OVER == null ? that.DEBT_STOP_SEN_LEV_OVER == null : this.DEBT_STOP_SEN_LEV_OVER.equals(that.DEBT_STOP_SEN_LEV_OVER));
    equal = equal && (this.USER_COUNT_TOTAL == null ? that.USER_COUNT_TOTAL == null : this.USER_COUNT_TOTAL.equals(that.USER_COUNT_TOTAL));
    equal = equal && (this.CUST_COUNT_TOTAL == null ? that.CUST_COUNT_TOTAL == null : this.CUST_COUNT_TOTAL.equals(that.CUST_COUNT_TOTAL));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.DTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DBITV_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DITV_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DFTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.LAN_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.HDTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AMSP_USER_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CLOUD_MEDIA_USER_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.MALE_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FEMALE_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.GENERATION_BEFORE_70S = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.GENERATION_BETWEEN_70S_AND_90S = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.GENERATION_BETWEEN_90S_AND_10S = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.GENERATION_AFTER_10S = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.FAMILY_CHILD_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.FAMILY_OLD_COUNT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.FAMILY_CHILD_FAMILT_OLD_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.NFAMILY_CHILD_FAMILT_OLD_COUNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.CITY_COUNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.SUBURB_COUNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.CONVERGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ONLY_LAN_USER_COUNT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.NET_1_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.NET_1_TO_3_YEAR_USER_COUNT = JdbcWritableBridge.readInteger(28, __dbResults);
    this.NET_3_TO_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.NET_GRANTER_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.DEV_1_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.dev_1_to_3_year_user_count = JdbcWritableBridge.readInteger(32, __dbResults);
    this.DEV_3_TO_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.DEV_GRANTER_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.INFREQUENT_CHANGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CHANGE_ONE_TIME_USER_COUNT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.FREQUENT_CHANGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.CONSUM_OVER_101_USER_COUNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.CONSUM_51_TO_100_USER_COUNT = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.CONSUM_21_TO_50_USER_COUNT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.CONSUM_LESS_20_USER_COUNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.VOD_OVER_21_USER_COUNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.VOD_11_TO_20_USER_COUNT = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.VOD_6_TO_10_USER_COUNT = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.VOD_LESS_5_USER_COUNT = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.INACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_FIVE = JdbcWritableBridge.readString(48, __dbResults);
    this.TOP5_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(49, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_FOUR = JdbcWritableBridge.readString(50, __dbResults);
    this.TOP4_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(51, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_THREE = JdbcWritableBridge.readString(52, __dbResults);
    this.TOP3_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(53, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_TWO = JdbcWritableBridge.readString(54, __dbResults);
    this.TOP2_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_ONE = JdbcWritableBridge.readString(56, __dbResults);
    this.TOP1_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.PAYMENT_HABIT_TOP_THREE = JdbcWritableBridge.readString(58, __dbResults);
    this.TOP3_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.PAYMENT_HABIT_TOP_TWO = JdbcWritableBridge.readString(60, __dbResults);
    this.TOP2_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.PAYMENT_HABIT_TOP_ONE = JdbcWritableBridge.readString(62, __dbResults);
    this.TOP1_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.DEBT_STOP_SEN_LEV_ZERO = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.DEBT_STOP_SEN_LEV_ONE_WEEK = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.DEBT_STOP_SEN_LEV_TWO_WEEKS = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.DEBT_STOP_SEN_LEV_ONE_MONTH = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.DEBT_STOP_SEN_LEV_OVER = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.USER_COUNT_TOTAL = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.CUST_COUNT_TOTAL = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(71, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(72, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.DTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DBITV_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DITV_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DFTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.LAN_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.HDTV_USER_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.AMSP_USER_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CLOUD_MEDIA_USER_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.MALE_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FEMALE_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.GENERATION_BEFORE_70S = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.GENERATION_BETWEEN_70S_AND_90S = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.GENERATION_BETWEEN_90S_AND_10S = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.GENERATION_AFTER_10S = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.FAMILY_CHILD_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.FAMILY_OLD_COUNT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.FAMILY_CHILD_FAMILT_OLD_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.NFAMILY_CHILD_FAMILT_OLD_COUNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.CITY_COUNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.SUBURB_COUNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.CONVERGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ONLY_LAN_USER_COUNT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.NET_1_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.NET_1_TO_3_YEAR_USER_COUNT = JdbcWritableBridge.readInteger(28, __dbResults);
    this.NET_3_TO_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.NET_GRANTER_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.DEV_1_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.dev_1_to_3_year_user_count = JdbcWritableBridge.readInteger(32, __dbResults);
    this.DEV_3_TO_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.DEV_GRANTER_5_YEAR_USER_COUNT = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.INFREQUENT_CHANGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CHANGE_ONE_TIME_USER_COUNT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.FREQUENT_CHANGE_USER_COUNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.CONSUM_OVER_101_USER_COUNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.CONSUM_51_TO_100_USER_COUNT = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.CONSUM_21_TO_50_USER_COUNT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.CONSUM_LESS_20_USER_COUNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.VOD_OVER_21_USER_COUNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.VOD_11_TO_20_USER_COUNT = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.VOD_6_TO_10_USER_COUNT = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.VOD_LESS_5_USER_COUNT = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.INACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_FIVE = JdbcWritableBridge.readString(48, __dbResults);
    this.TOP5_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(49, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_FOUR = JdbcWritableBridge.readString(50, __dbResults);
    this.TOP4_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(51, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_THREE = JdbcWritableBridge.readString(52, __dbResults);
    this.TOP3_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readLong(53, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_TWO = JdbcWritableBridge.readString(54, __dbResults);
    this.TOP2_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.PAYMENT_CAHNNEL_TOP_ONE = JdbcWritableBridge.readString(56, __dbResults);
    this.TOP1_PAYMENT_CHANNEL_COUNT = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.PAYMENT_HABIT_TOP_THREE = JdbcWritableBridge.readString(58, __dbResults);
    this.TOP3_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.PAYMENT_HABIT_TOP_TWO = JdbcWritableBridge.readString(60, __dbResults);
    this.TOP2_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.PAYMENT_HABIT_TOP_ONE = JdbcWritableBridge.readString(62, __dbResults);
    this.TOP1_PAYMENT_HABIT_COUNT = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.DEBT_STOP_SEN_LEV_ZERO = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.DEBT_STOP_SEN_LEV_ONE_WEEK = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.DEBT_STOP_SEN_LEV_TWO_WEEKS = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.DEBT_STOP_SEN_LEV_ONE_MONTH = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.DEBT_STOP_SEN_LEV_OVER = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.USER_COUNT_TOTAL = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.CUST_COUNT_TOTAL = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(71, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(72, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(DTV_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_USER_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_USER_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CLOUD_MEDIA_USER_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MALE_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FEMALE_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BEFORE_70S, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BETWEEN_70S_AND_90S, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BETWEEN_90S_AND_10S, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_AFTER_10S, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_CHILD_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_OLD_COUNT, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_CHILD_FAMILT_OLD_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NFAMILY_CHILD_FAMILT_OLD_COUNT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CITY_COUNT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SUBURB_COUNT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONVERGE_USER_COUNT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONLY_LAN_USER_COUNT, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_USER_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_1_YEAR_USER_COUNT, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(NET_1_TO_3_YEAR_USER_COUNT, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_3_TO_5_YEAR_USER_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_GRANTER_5_YEAR_USER_COUNT, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_1_YEAR_USER_COUNT, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(dev_1_to_3_year_user_count, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_3_TO_5_YEAR_USER_COUNT, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_GRANTER_5_YEAR_USER_COUNT, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INFREQUENT_CHANGE_USER_COUNT, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CHANGE_ONE_TIME_USER_COUNT, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FREQUENT_CHANGE_USER_COUNT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_OVER_101_USER_COUNT, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_51_TO_100_USER_COUNT, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_21_TO_50_USER_COUNT, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_LESS_20_USER_COUNT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_OVER_21_USER_COUNT, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_11_TO_20_USER_COUNT, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_6_TO_10_USER_COUNT, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_LESS_5_USER_COUNT, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INACTIVE_USER_COUNT, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_FIVE, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_PAYMENT_CHANNEL_COUNT, 49 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_FOUR, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_PAYMENT_CHANNEL_COUNT, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_THREE, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_PAYMENT_CHANNEL_COUNT, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_TWO, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_PAYMENT_CHANNEL_COUNT, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_ONE, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_PAYMENT_CHANNEL_COUNT, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_THREE, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_PAYMENT_HABIT_COUNT, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_TWO, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_PAYMENT_HABIT_COUNT, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_ONE, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_PAYMENT_HABIT_COUNT, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ZERO, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ONE_WEEK, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_TWO_WEEKS, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ONE_MONTH, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_OVER, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_COUNT_TOTAL, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUST_COUNT_TOTAL, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 71 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 72 + __off, 12, __dbStmt);
    return 72;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_USER_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_USER_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CLOUD_MEDIA_USER_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MALE_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FEMALE_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BEFORE_70S, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BETWEEN_70S_AND_90S, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_BETWEEN_90S_AND_10S, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GENERATION_AFTER_10S, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_CHILD_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_OLD_COUNT, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FAMILY_CHILD_FAMILT_OLD_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NFAMILY_CHILD_FAMILT_OLD_COUNT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CITY_COUNT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SUBURB_COUNT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONVERGE_USER_COUNT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONLY_LAN_USER_COUNT, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TV_USER_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_1_YEAR_USER_COUNT, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(NET_1_TO_3_YEAR_USER_COUNT, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_3_TO_5_YEAR_USER_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_GRANTER_5_YEAR_USER_COUNT, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_1_YEAR_USER_COUNT, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(dev_1_to_3_year_user_count, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_3_TO_5_YEAR_USER_COUNT, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEV_GRANTER_5_YEAR_USER_COUNT, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INFREQUENT_CHANGE_USER_COUNT, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CHANGE_ONE_TIME_USER_COUNT, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FREQUENT_CHANGE_USER_COUNT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_OVER_101_USER_COUNT, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_51_TO_100_USER_COUNT, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_21_TO_50_USER_COUNT, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONSUM_LESS_20_USER_COUNT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_OVER_21_USER_COUNT, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_11_TO_20_USER_COUNT, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_6_TO_10_USER_COUNT, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOD_LESS_5_USER_COUNT, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INACTIVE_USER_COUNT, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_FIVE, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_PAYMENT_CHANNEL_COUNT, 49 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_FOUR, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_PAYMENT_CHANNEL_COUNT, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_THREE, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_PAYMENT_CHANNEL_COUNT, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_TWO, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_PAYMENT_CHANNEL_COUNT, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_CAHNNEL_TOP_ONE, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_PAYMENT_CHANNEL_COUNT, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_THREE, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_PAYMENT_HABIT_COUNT, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_TWO, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_PAYMENT_HABIT_COUNT, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_HABIT_TOP_ONE, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_PAYMENT_HABIT_COUNT, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ZERO, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ONE_WEEK, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_TWO_WEEKS, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_ONE_MONTH, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEBT_STOP_SEN_LEV_OVER, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_COUNT_TOTAL, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUST_COUNT_TOTAL, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 71 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 72 + __off, 12, __dbStmt);
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
        this.DTV_USER_COUNT = null;
    } else {
    this.DTV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DBITV_USER_COUNT = null;
    } else {
    this.DBITV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DITV_USER_COUNT = null;
    } else {
    this.DITV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DFTV_USER_COUNT = null;
    } else {
    this.DFTV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_USER_COUNT = null;
    } else {
    this.LAN_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HDTV_USER_COUNT = null;
    } else {
    this.HDTV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AMSP_USER_COUNT = null;
    } else {
    this.AMSP_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLOUD_MEDIA_USER_COUNT = null;
    } else {
    this.CLOUD_MEDIA_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MALE_COUNT = null;
    } else {
    this.MALE_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FEMALE_COUNT = null;
    } else {
    this.FEMALE_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GENERATION_BEFORE_70S = null;
    } else {
    this.GENERATION_BEFORE_70S = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GENERATION_BETWEEN_70S_AND_90S = null;
    } else {
    this.GENERATION_BETWEEN_70S_AND_90S = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GENERATION_BETWEEN_90S_AND_10S = null;
    } else {
    this.GENERATION_BETWEEN_90S_AND_10S = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GENERATION_AFTER_10S = null;
    } else {
    this.GENERATION_AFTER_10S = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAMILY_CHILD_COUNT = null;
    } else {
    this.FAMILY_CHILD_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAMILY_OLD_COUNT = null;
    } else {
    this.FAMILY_OLD_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FAMILY_CHILD_FAMILT_OLD_COUNT = null;
    } else {
    this.FAMILY_CHILD_FAMILT_OLD_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NFAMILY_CHILD_FAMILT_OLD_COUNT = null;
    } else {
    this.NFAMILY_CHILD_FAMILT_OLD_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CITY_COUNT = null;
    } else {
    this.CITY_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUBURB_COUNT = null;
    } else {
    this.SUBURB_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONVERGE_USER_COUNT = null;
    } else {
    this.CONVERGE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ONLY_LAN_USER_COUNT = null;
    } else {
    this.ONLY_LAN_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TV_USER_COUNT = null;
    } else {
    this.TV_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NET_1_YEAR_USER_COUNT = null;
    } else {
    this.NET_1_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NET_1_TO_3_YEAR_USER_COUNT = null;
    } else {
    this.NET_1_TO_3_YEAR_USER_COUNT = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.NET_3_TO_5_YEAR_USER_COUNT = null;
    } else {
    this.NET_3_TO_5_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NET_GRANTER_5_YEAR_USER_COUNT = null;
    } else {
    this.NET_GRANTER_5_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEV_1_YEAR_USER_COUNT = null;
    } else {
    this.DEV_1_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dev_1_to_3_year_user_count = null;
    } else {
    this.dev_1_to_3_year_user_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DEV_3_TO_5_YEAR_USER_COUNT = null;
    } else {
    this.DEV_3_TO_5_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEV_GRANTER_5_YEAR_USER_COUNT = null;
    } else {
    this.DEV_GRANTER_5_YEAR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INFREQUENT_CHANGE_USER_COUNT = null;
    } else {
    this.INFREQUENT_CHANGE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHANGE_ONE_TIME_USER_COUNT = null;
    } else {
    this.CHANGE_ONE_TIME_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FREQUENT_CHANGE_USER_COUNT = null;
    } else {
    this.FREQUENT_CHANGE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUM_OVER_101_USER_COUNT = null;
    } else {
    this.CONSUM_OVER_101_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUM_51_TO_100_USER_COUNT = null;
    } else {
    this.CONSUM_51_TO_100_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUM_21_TO_50_USER_COUNT = null;
    } else {
    this.CONSUM_21_TO_50_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONSUM_LESS_20_USER_COUNT = null;
    } else {
    this.CONSUM_LESS_20_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOD_OVER_21_USER_COUNT = null;
    } else {
    this.VOD_OVER_21_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOD_11_TO_20_USER_COUNT = null;
    } else {
    this.VOD_11_TO_20_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOD_6_TO_10_USER_COUNT = null;
    } else {
    this.VOD_6_TO_10_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOD_LESS_5_USER_COUNT = null;
    } else {
    this.VOD_LESS_5_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTIVE_USER_COUNT = null;
    } else {
    this.ACTIVE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INACTIVE_USER_COUNT = null;
    } else {
    this.INACTIVE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_CAHNNEL_TOP_FIVE = null;
    } else {
    this.PAYMENT_CAHNNEL_TOP_FIVE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP5_PAYMENT_CHANNEL_COUNT = null;
    } else {
    this.TOP5_PAYMENT_CHANNEL_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_CAHNNEL_TOP_FOUR = null;
    } else {
    this.PAYMENT_CAHNNEL_TOP_FOUR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP4_PAYMENT_CHANNEL_COUNT = null;
    } else {
    this.TOP4_PAYMENT_CHANNEL_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_CAHNNEL_TOP_THREE = null;
    } else {
    this.PAYMENT_CAHNNEL_TOP_THREE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_PAYMENT_CHANNEL_COUNT = null;
    } else {
    this.TOP3_PAYMENT_CHANNEL_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_CAHNNEL_TOP_TWO = null;
    } else {
    this.PAYMENT_CAHNNEL_TOP_TWO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_PAYMENT_CHANNEL_COUNT = null;
    } else {
    this.TOP2_PAYMENT_CHANNEL_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_CAHNNEL_TOP_ONE = null;
    } else {
    this.PAYMENT_CAHNNEL_TOP_ONE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_PAYMENT_CHANNEL_COUNT = null;
    } else {
    this.TOP1_PAYMENT_CHANNEL_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_HABIT_TOP_THREE = null;
    } else {
    this.PAYMENT_HABIT_TOP_THREE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_PAYMENT_HABIT_COUNT = null;
    } else {
    this.TOP3_PAYMENT_HABIT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_HABIT_TOP_TWO = null;
    } else {
    this.PAYMENT_HABIT_TOP_TWO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_PAYMENT_HABIT_COUNT = null;
    } else {
    this.TOP2_PAYMENT_HABIT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_HABIT_TOP_ONE = null;
    } else {
    this.PAYMENT_HABIT_TOP_ONE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_PAYMENT_HABIT_COUNT = null;
    } else {
    this.TOP1_PAYMENT_HABIT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEBT_STOP_SEN_LEV_ZERO = null;
    } else {
    this.DEBT_STOP_SEN_LEV_ZERO = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEBT_STOP_SEN_LEV_ONE_WEEK = null;
    } else {
    this.DEBT_STOP_SEN_LEV_ONE_WEEK = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEBT_STOP_SEN_LEV_TWO_WEEKS = null;
    } else {
    this.DEBT_STOP_SEN_LEV_TWO_WEEKS = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEBT_STOP_SEN_LEV_ONE_MONTH = null;
    } else {
    this.DEBT_STOP_SEN_LEV_ONE_MONTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEBT_STOP_SEN_LEV_OVER = null;
    } else {
    this.DEBT_STOP_SEN_LEV_OVER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.USER_COUNT_TOTAL = null;
    } else {
    this.USER_COUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_COUNT_TOTAL = null;
    } else {
    this.CUST_COUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_USER_COUNT, __dataOut);
    }
    if (null == this.DBITV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_USER_COUNT, __dataOut);
    }
    if (null == this.DITV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_USER_COUNT, __dataOut);
    }
    if (null == this.DFTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_USER_COUNT, __dataOut);
    }
    if (null == this.LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_USER_COUNT, __dataOut);
    }
    if (null == this.HDTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_USER_COUNT, __dataOut);
    }
    if (null == this.AMSP_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_USER_COUNT, __dataOut);
    }
    if (null == this.CLOUD_MEDIA_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CLOUD_MEDIA_USER_COUNT, __dataOut);
    }
    if (null == this.MALE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MALE_COUNT, __dataOut);
    }
    if (null == this.FEMALE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FEMALE_COUNT, __dataOut);
    }
    if (null == this.GENERATION_BEFORE_70S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BEFORE_70S, __dataOut);
    }
    if (null == this.GENERATION_BETWEEN_70S_AND_90S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BETWEEN_70S_AND_90S, __dataOut);
    }
    if (null == this.GENERATION_BETWEEN_90S_AND_10S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BETWEEN_90S_AND_10S, __dataOut);
    }
    if (null == this.GENERATION_AFTER_10S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_AFTER_10S, __dataOut);
    }
    if (null == this.FAMILY_CHILD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_CHILD_COUNT, __dataOut);
    }
    if (null == this.FAMILY_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_OLD_COUNT, __dataOut);
    }
    if (null == this.FAMILY_CHILD_FAMILT_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_CHILD_FAMILT_OLD_COUNT, __dataOut);
    }
    if (null == this.NFAMILY_CHILD_FAMILT_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NFAMILY_CHILD_FAMILT_OLD_COUNT, __dataOut);
    }
    if (null == this.CITY_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CITY_COUNT, __dataOut);
    }
    if (null == this.SUBURB_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SUBURB_COUNT, __dataOut);
    }
    if (null == this.CONVERGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONVERGE_USER_COUNT, __dataOut);
    }
    if (null == this.ONLY_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONLY_LAN_USER_COUNT, __dataOut);
    }
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_USER_COUNT, __dataOut);
    }
    if (null == this.NET_1_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_1_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.NET_1_TO_3_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NET_1_TO_3_YEAR_USER_COUNT);
    }
    if (null == this.NET_3_TO_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_3_TO_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.NET_GRANTER_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_GRANTER_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.DEV_1_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_1_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.dev_1_to_3_year_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dev_1_to_3_year_user_count);
    }
    if (null == this.DEV_3_TO_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_3_TO_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.DEV_GRANTER_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_GRANTER_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.INFREQUENT_CHANGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INFREQUENT_CHANGE_USER_COUNT, __dataOut);
    }
    if (null == this.CHANGE_ONE_TIME_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CHANGE_ONE_TIME_USER_COUNT, __dataOut);
    }
    if (null == this.FREQUENT_CHANGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FREQUENT_CHANGE_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_OVER_101_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_OVER_101_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_51_TO_100_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_51_TO_100_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_21_TO_50_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_21_TO_50_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_LESS_20_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_LESS_20_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_OVER_21_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_OVER_21_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_11_TO_20_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_11_TO_20_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_6_TO_10_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_6_TO_10_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_LESS_5_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_LESS_5_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.INACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_FIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_FIVE);
    }
    if (null == this.TOP5_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_FOUR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_FOUR);
    }
    if (null == this.TOP4_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_THREE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_THREE);
    }
    if (null == this.TOP3_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_TWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_TWO);
    }
    if (null == this.TOP2_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_PAYMENT_CHANNEL_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_ONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_ONE);
    }
    if (null == this.TOP1_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_PAYMENT_CHANNEL_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_THREE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_THREE);
    }
    if (null == this.TOP3_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_TWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_TWO);
    }
    if (null == this.TOP2_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_ONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_ONE);
    }
    if (null == this.TOP1_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ZERO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ZERO, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ONE_WEEK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ONE_WEEK, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_TWO_WEEKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_TWO_WEEKS, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ONE_MONTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ONE_MONTH, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_OVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_OVER, __dataOut);
    }
    if (null == this.USER_COUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_COUNT_TOTAL, __dataOut);
    }
    if (null == this.CUST_COUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_COUNT_TOTAL, __dataOut);
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
    if (null == this.DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_USER_COUNT, __dataOut);
    }
    if (null == this.DBITV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_USER_COUNT, __dataOut);
    }
    if (null == this.DITV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_USER_COUNT, __dataOut);
    }
    if (null == this.DFTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_USER_COUNT, __dataOut);
    }
    if (null == this.LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_USER_COUNT, __dataOut);
    }
    if (null == this.HDTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_USER_COUNT, __dataOut);
    }
    if (null == this.AMSP_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_USER_COUNT, __dataOut);
    }
    if (null == this.CLOUD_MEDIA_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CLOUD_MEDIA_USER_COUNT, __dataOut);
    }
    if (null == this.MALE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MALE_COUNT, __dataOut);
    }
    if (null == this.FEMALE_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FEMALE_COUNT, __dataOut);
    }
    if (null == this.GENERATION_BEFORE_70S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BEFORE_70S, __dataOut);
    }
    if (null == this.GENERATION_BETWEEN_70S_AND_90S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BETWEEN_70S_AND_90S, __dataOut);
    }
    if (null == this.GENERATION_BETWEEN_90S_AND_10S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_BETWEEN_90S_AND_10S, __dataOut);
    }
    if (null == this.GENERATION_AFTER_10S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GENERATION_AFTER_10S, __dataOut);
    }
    if (null == this.FAMILY_CHILD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_CHILD_COUNT, __dataOut);
    }
    if (null == this.FAMILY_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_OLD_COUNT, __dataOut);
    }
    if (null == this.FAMILY_CHILD_FAMILT_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FAMILY_CHILD_FAMILT_OLD_COUNT, __dataOut);
    }
    if (null == this.NFAMILY_CHILD_FAMILT_OLD_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NFAMILY_CHILD_FAMILT_OLD_COUNT, __dataOut);
    }
    if (null == this.CITY_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CITY_COUNT, __dataOut);
    }
    if (null == this.SUBURB_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SUBURB_COUNT, __dataOut);
    }
    if (null == this.CONVERGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONVERGE_USER_COUNT, __dataOut);
    }
    if (null == this.ONLY_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONLY_LAN_USER_COUNT, __dataOut);
    }
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TV_USER_COUNT, __dataOut);
    }
    if (null == this.NET_1_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_1_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.NET_1_TO_3_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NET_1_TO_3_YEAR_USER_COUNT);
    }
    if (null == this.NET_3_TO_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_3_TO_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.NET_GRANTER_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_GRANTER_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.DEV_1_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_1_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.dev_1_to_3_year_user_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dev_1_to_3_year_user_count);
    }
    if (null == this.DEV_3_TO_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_3_TO_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.DEV_GRANTER_5_YEAR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEV_GRANTER_5_YEAR_USER_COUNT, __dataOut);
    }
    if (null == this.INFREQUENT_CHANGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INFREQUENT_CHANGE_USER_COUNT, __dataOut);
    }
    if (null == this.CHANGE_ONE_TIME_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CHANGE_ONE_TIME_USER_COUNT, __dataOut);
    }
    if (null == this.FREQUENT_CHANGE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FREQUENT_CHANGE_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_OVER_101_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_OVER_101_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_51_TO_100_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_51_TO_100_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_21_TO_50_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_21_TO_50_USER_COUNT, __dataOut);
    }
    if (null == this.CONSUM_LESS_20_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONSUM_LESS_20_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_OVER_21_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_OVER_21_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_11_TO_20_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_11_TO_20_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_6_TO_10_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_6_TO_10_USER_COUNT, __dataOut);
    }
    if (null == this.VOD_LESS_5_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOD_LESS_5_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.INACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_FIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_FIVE);
    }
    if (null == this.TOP5_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_FOUR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_FOUR);
    }
    if (null == this.TOP4_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_THREE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_THREE);
    }
    if (null == this.TOP3_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_PAYMENT_CHANNEL_COUNT);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_TWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_TWO);
    }
    if (null == this.TOP2_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_PAYMENT_CHANNEL_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_CAHNNEL_TOP_ONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_CAHNNEL_TOP_ONE);
    }
    if (null == this.TOP1_PAYMENT_CHANNEL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_PAYMENT_CHANNEL_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_THREE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_THREE);
    }
    if (null == this.TOP3_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_TWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_TWO);
    }
    if (null == this.TOP2_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_HABIT_TOP_ONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_HABIT_TOP_ONE);
    }
    if (null == this.TOP1_PAYMENT_HABIT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_PAYMENT_HABIT_COUNT, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ZERO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ZERO, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ONE_WEEK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ONE_WEEK, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_TWO_WEEKS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_TWO_WEEKS, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_ONE_MONTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_ONE_MONTH, __dataOut);
    }
    if (null == this.DEBT_STOP_SEN_LEV_OVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEBT_STOP_SEN_LEV_OVER, __dataOut);
    }
    if (null == this.USER_COUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_COUNT_TOTAL, __dataOut);
    }
    if (null == this.CUST_COUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_COUNT_TOTAL, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_COUNT==null?"null":DTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_USER_COUNT==null?"null":DBITV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_USER_COUNT==null?"null":DITV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_USER_COUNT==null?"null":DFTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_USER_COUNT==null?"null":LAN_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_USER_COUNT==null?"null":HDTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_USER_COUNT==null?"null":AMSP_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOUD_MEDIA_USER_COUNT==null?"null":CLOUD_MEDIA_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MALE_COUNT==null?"null":MALE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEMALE_COUNT==null?"null":FEMALE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BEFORE_70S==null?"null":GENERATION_BEFORE_70S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BETWEEN_70S_AND_90S==null?"null":GENERATION_BETWEEN_70S_AND_90S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BETWEEN_90S_AND_10S==null?"null":GENERATION_BETWEEN_90S_AND_10S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_AFTER_10S==null?"null":GENERATION_AFTER_10S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_CHILD_COUNT==null?"null":FAMILY_CHILD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_OLD_COUNT==null?"null":FAMILY_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_CHILD_FAMILT_OLD_COUNT==null?"null":FAMILY_CHILD_FAMILT_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NFAMILY_CHILD_FAMILT_OLD_COUNT==null?"null":NFAMILY_CHILD_FAMILT_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY_COUNT==null?"null":CITY_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBURB_COUNT==null?"null":SUBURB_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONVERGE_USER_COUNT==null?"null":CONVERGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONLY_LAN_USER_COUNT==null?"null":ONLY_LAN_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":TV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_1_YEAR_USER_COUNT==null?"null":NET_1_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_1_TO_3_YEAR_USER_COUNT==null?"null":"" + NET_1_TO_3_YEAR_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_3_TO_5_YEAR_USER_COUNT==null?"null":NET_3_TO_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_GRANTER_5_YEAR_USER_COUNT==null?"null":NET_GRANTER_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_1_YEAR_USER_COUNT==null?"null":DEV_1_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dev_1_to_3_year_user_count==null?"null":"" + dev_1_to_3_year_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_3_TO_5_YEAR_USER_COUNT==null?"null":DEV_3_TO_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_GRANTER_5_YEAR_USER_COUNT==null?"null":DEV_GRANTER_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INFREQUENT_CHANGE_USER_COUNT==null?"null":INFREQUENT_CHANGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_ONE_TIME_USER_COUNT==null?"null":CHANGE_ONE_TIME_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FREQUENT_CHANGE_USER_COUNT==null?"null":FREQUENT_CHANGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_OVER_101_USER_COUNT==null?"null":CONSUM_OVER_101_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_51_TO_100_USER_COUNT==null?"null":CONSUM_51_TO_100_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_21_TO_50_USER_COUNT==null?"null":CONSUM_21_TO_50_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_LESS_20_USER_COUNT==null?"null":CONSUM_LESS_20_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_OVER_21_USER_COUNT==null?"null":VOD_OVER_21_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_11_TO_20_USER_COUNT==null?"null":VOD_11_TO_20_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_6_TO_10_USER_COUNT==null?"null":VOD_6_TO_10_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_LESS_5_USER_COUNT==null?"null":VOD_LESS_5_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INACTIVE_USER_COUNT==null?"null":INACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_FIVE==null?"null":PAYMENT_CAHNNEL_TOP_FIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP5_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_FOUR==null?"null":PAYMENT_CAHNNEL_TOP_FOUR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP4_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_THREE==null?"null":PAYMENT_CAHNNEL_TOP_THREE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP3_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_TWO==null?"null":PAYMENT_CAHNNEL_TOP_TWO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_PAYMENT_CHANNEL_COUNT==null?"null":TOP2_PAYMENT_CHANNEL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_ONE==null?"null":PAYMENT_CAHNNEL_TOP_ONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_PAYMENT_CHANNEL_COUNT==null?"null":TOP1_PAYMENT_CHANNEL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_THREE==null?"null":PAYMENT_HABIT_TOP_THREE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_PAYMENT_HABIT_COUNT==null?"null":TOP3_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_TWO==null?"null":PAYMENT_HABIT_TOP_TWO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_PAYMENT_HABIT_COUNT==null?"null":TOP2_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_ONE==null?"null":PAYMENT_HABIT_TOP_ONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_PAYMENT_HABIT_COUNT==null?"null":TOP1_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ZERO==null?"null":DEBT_STOP_SEN_LEV_ZERO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ONE_WEEK==null?"null":DEBT_STOP_SEN_LEV_ONE_WEEK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_TWO_WEEKS==null?"null":DEBT_STOP_SEN_LEV_TWO_WEEKS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ONE_MONTH==null?"null":DEBT_STOP_SEN_LEV_ONE_MONTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_OVER==null?"null":DEBT_STOP_SEN_LEV_OVER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_COUNT_TOTAL==null?"null":USER_COUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_COUNT_TOTAL==null?"null":CUST_COUNT_TOTAL.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_COUNT==null?"null":DTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_USER_COUNT==null?"null":DBITV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_USER_COUNT==null?"null":DITV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_USER_COUNT==null?"null":DFTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_USER_COUNT==null?"null":LAN_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_USER_COUNT==null?"null":HDTV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_USER_COUNT==null?"null":AMSP_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOUD_MEDIA_USER_COUNT==null?"null":CLOUD_MEDIA_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MALE_COUNT==null?"null":MALE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEMALE_COUNT==null?"null":FEMALE_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BEFORE_70S==null?"null":GENERATION_BEFORE_70S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BETWEEN_70S_AND_90S==null?"null":GENERATION_BETWEEN_70S_AND_90S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_BETWEEN_90S_AND_10S==null?"null":GENERATION_BETWEEN_90S_AND_10S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GENERATION_AFTER_10S==null?"null":GENERATION_AFTER_10S.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_CHILD_COUNT==null?"null":FAMILY_CHILD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_OLD_COUNT==null?"null":FAMILY_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FAMILY_CHILD_FAMILT_OLD_COUNT==null?"null":FAMILY_CHILD_FAMILT_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NFAMILY_CHILD_FAMILT_OLD_COUNT==null?"null":NFAMILY_CHILD_FAMILT_OLD_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY_COUNT==null?"null":CITY_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBURB_COUNT==null?"null":SUBURB_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONVERGE_USER_COUNT==null?"null":CONVERGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONLY_LAN_USER_COUNT==null?"null":ONLY_LAN_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":TV_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_1_YEAR_USER_COUNT==null?"null":NET_1_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_1_TO_3_YEAR_USER_COUNT==null?"null":"" + NET_1_TO_3_YEAR_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_3_TO_5_YEAR_USER_COUNT==null?"null":NET_3_TO_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_GRANTER_5_YEAR_USER_COUNT==null?"null":NET_GRANTER_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_1_YEAR_USER_COUNT==null?"null":DEV_1_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dev_1_to_3_year_user_count==null?"null":"" + dev_1_to_3_year_user_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_3_TO_5_YEAR_USER_COUNT==null?"null":DEV_3_TO_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEV_GRANTER_5_YEAR_USER_COUNT==null?"null":DEV_GRANTER_5_YEAR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INFREQUENT_CHANGE_USER_COUNT==null?"null":INFREQUENT_CHANGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_ONE_TIME_USER_COUNT==null?"null":CHANGE_ONE_TIME_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FREQUENT_CHANGE_USER_COUNT==null?"null":FREQUENT_CHANGE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_OVER_101_USER_COUNT==null?"null":CONSUM_OVER_101_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_51_TO_100_USER_COUNT==null?"null":CONSUM_51_TO_100_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_21_TO_50_USER_COUNT==null?"null":CONSUM_21_TO_50_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONSUM_LESS_20_USER_COUNT==null?"null":CONSUM_LESS_20_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_OVER_21_USER_COUNT==null?"null":VOD_OVER_21_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_11_TO_20_USER_COUNT==null?"null":VOD_11_TO_20_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_6_TO_10_USER_COUNT==null?"null":VOD_6_TO_10_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_LESS_5_USER_COUNT==null?"null":VOD_LESS_5_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INACTIVE_USER_COUNT==null?"null":INACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_FIVE==null?"null":PAYMENT_CAHNNEL_TOP_FIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP5_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_FOUR==null?"null":PAYMENT_CAHNNEL_TOP_FOUR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP4_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_THREE==null?"null":PAYMENT_CAHNNEL_TOP_THREE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_PAYMENT_CHANNEL_COUNT==null?"null":"" + TOP3_PAYMENT_CHANNEL_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_TWO==null?"null":PAYMENT_CAHNNEL_TOP_TWO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_PAYMENT_CHANNEL_COUNT==null?"null":TOP2_PAYMENT_CHANNEL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_CAHNNEL_TOP_ONE==null?"null":PAYMENT_CAHNNEL_TOP_ONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_PAYMENT_CHANNEL_COUNT==null?"null":TOP1_PAYMENT_CHANNEL_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_THREE==null?"null":PAYMENT_HABIT_TOP_THREE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_PAYMENT_HABIT_COUNT==null?"null":TOP3_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_TWO==null?"null":PAYMENT_HABIT_TOP_TWO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_PAYMENT_HABIT_COUNT==null?"null":TOP2_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_HABIT_TOP_ONE==null?"null":PAYMENT_HABIT_TOP_ONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_PAYMENT_HABIT_COUNT==null?"null":TOP1_PAYMENT_HABIT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ZERO==null?"null":DEBT_STOP_SEN_LEV_ZERO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ONE_WEEK==null?"null":DEBT_STOP_SEN_LEV_ONE_WEEK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_TWO_WEEKS==null?"null":DEBT_STOP_SEN_LEV_TWO_WEEKS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_ONE_MONTH==null?"null":DEBT_STOP_SEN_LEV_ONE_MONTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEBT_STOP_SEN_LEV_OVER==null?"null":DEBT_STOP_SEN_LEV_OVER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_COUNT_TOTAL==null?"null":USER_COUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_COUNT_TOTAL==null?"null":CUST_COUNT_TOTAL.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_COUNT = null; } else {
      this.DTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_USER_COUNT = null; } else {
      this.DBITV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_USER_COUNT = null; } else {
      this.DITV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_USER_COUNT = null; } else {
      this.DFTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_USER_COUNT = null; } else {
      this.LAN_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_USER_COUNT = null; } else {
      this.HDTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_USER_COUNT = null; } else {
      this.AMSP_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CLOUD_MEDIA_USER_COUNT = null; } else {
      this.CLOUD_MEDIA_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MALE_COUNT = null; } else {
      this.MALE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FEMALE_COUNT = null; } else {
      this.FEMALE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BEFORE_70S = null; } else {
      this.GENERATION_BEFORE_70S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BETWEEN_70S_AND_90S = null; } else {
      this.GENERATION_BETWEEN_70S_AND_90S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BETWEEN_90S_AND_10S = null; } else {
      this.GENERATION_BETWEEN_90S_AND_10S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_AFTER_10S = null; } else {
      this.GENERATION_AFTER_10S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_CHILD_COUNT = null; } else {
      this.FAMILY_CHILD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_OLD_COUNT = null; } else {
      this.FAMILY_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_CHILD_FAMILT_OLD_COUNT = null; } else {
      this.FAMILY_CHILD_FAMILT_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NFAMILY_CHILD_FAMILT_OLD_COUNT = null; } else {
      this.NFAMILY_CHILD_FAMILT_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CITY_COUNT = null; } else {
      this.CITY_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SUBURB_COUNT = null; } else {
      this.SUBURB_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONVERGE_USER_COUNT = null; } else {
      this.CONVERGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONLY_LAN_USER_COUNT = null; } else {
      this.ONLY_LAN_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_1_YEAR_USER_COUNT = null; } else {
      this.NET_1_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_1_TO_3_YEAR_USER_COUNT = null; } else {
      this.NET_1_TO_3_YEAR_USER_COUNT = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_3_TO_5_YEAR_USER_COUNT = null; } else {
      this.NET_3_TO_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_GRANTER_5_YEAR_USER_COUNT = null; } else {
      this.NET_GRANTER_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_1_YEAR_USER_COUNT = null; } else {
      this.DEV_1_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dev_1_to_3_year_user_count = null; } else {
      this.dev_1_to_3_year_user_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_3_TO_5_YEAR_USER_COUNT = null; } else {
      this.DEV_3_TO_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_GRANTER_5_YEAR_USER_COUNT = null; } else {
      this.DEV_GRANTER_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INFREQUENT_CHANGE_USER_COUNT = null; } else {
      this.INFREQUENT_CHANGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CHANGE_ONE_TIME_USER_COUNT = null; } else {
      this.CHANGE_ONE_TIME_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FREQUENT_CHANGE_USER_COUNT = null; } else {
      this.FREQUENT_CHANGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_OVER_101_USER_COUNT = null; } else {
      this.CONSUM_OVER_101_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_51_TO_100_USER_COUNT = null; } else {
      this.CONSUM_51_TO_100_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_21_TO_50_USER_COUNT = null; } else {
      this.CONSUM_21_TO_50_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_LESS_20_USER_COUNT = null; } else {
      this.CONSUM_LESS_20_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_OVER_21_USER_COUNT = null; } else {
      this.VOD_OVER_21_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_11_TO_20_USER_COUNT = null; } else {
      this.VOD_11_TO_20_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_6_TO_10_USER_COUNT = null; } else {
      this.VOD_6_TO_10_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_LESS_5_USER_COUNT = null; } else {
      this.VOD_LESS_5_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INACTIVE_USER_COUNT = null; } else {
      this.INACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_FIVE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_FIVE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP5_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_FOUR = null; } else {
      this.PAYMENT_CAHNNEL_TOP_FOUR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP4_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_THREE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_THREE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP3_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_TWO = null; } else {
      this.PAYMENT_CAHNNEL_TOP_TWO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP2_PAYMENT_CHANNEL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_ONE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_ONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP1_PAYMENT_CHANNEL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_THREE = null; } else {
      this.PAYMENT_HABIT_TOP_THREE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP3_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_TWO = null; } else {
      this.PAYMENT_HABIT_TOP_TWO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP2_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_ONE = null; } else {
      this.PAYMENT_HABIT_TOP_ONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP1_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ZERO = null; } else {
      this.DEBT_STOP_SEN_LEV_ZERO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ONE_WEEK = null; } else {
      this.DEBT_STOP_SEN_LEV_ONE_WEEK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_TWO_WEEKS = null; } else {
      this.DEBT_STOP_SEN_LEV_TWO_WEEKS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ONE_MONTH = null; } else {
      this.DEBT_STOP_SEN_LEV_ONE_MONTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_OVER = null; } else {
      this.DEBT_STOP_SEN_LEV_OVER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_COUNT_TOTAL = null; } else {
      this.USER_COUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUST_COUNT_TOTAL = null; } else {
      this.CUST_COUNT_TOTAL = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_COUNT = null; } else {
      this.DTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_USER_COUNT = null; } else {
      this.DBITV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_USER_COUNT = null; } else {
      this.DITV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_USER_COUNT = null; } else {
      this.DFTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_USER_COUNT = null; } else {
      this.LAN_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_USER_COUNT = null; } else {
      this.HDTV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_USER_COUNT = null; } else {
      this.AMSP_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CLOUD_MEDIA_USER_COUNT = null; } else {
      this.CLOUD_MEDIA_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MALE_COUNT = null; } else {
      this.MALE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FEMALE_COUNT = null; } else {
      this.FEMALE_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BEFORE_70S = null; } else {
      this.GENERATION_BEFORE_70S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BETWEEN_70S_AND_90S = null; } else {
      this.GENERATION_BETWEEN_70S_AND_90S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_BETWEEN_90S_AND_10S = null; } else {
      this.GENERATION_BETWEEN_90S_AND_10S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GENERATION_AFTER_10S = null; } else {
      this.GENERATION_AFTER_10S = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_CHILD_COUNT = null; } else {
      this.FAMILY_CHILD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_OLD_COUNT = null; } else {
      this.FAMILY_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FAMILY_CHILD_FAMILT_OLD_COUNT = null; } else {
      this.FAMILY_CHILD_FAMILT_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NFAMILY_CHILD_FAMILT_OLD_COUNT = null; } else {
      this.NFAMILY_CHILD_FAMILT_OLD_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CITY_COUNT = null; } else {
      this.CITY_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SUBURB_COUNT = null; } else {
      this.SUBURB_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONVERGE_USER_COUNT = null; } else {
      this.CONVERGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONLY_LAN_USER_COUNT = null; } else {
      this.ONLY_LAN_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_1_YEAR_USER_COUNT = null; } else {
      this.NET_1_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_1_TO_3_YEAR_USER_COUNT = null; } else {
      this.NET_1_TO_3_YEAR_USER_COUNT = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_3_TO_5_YEAR_USER_COUNT = null; } else {
      this.NET_3_TO_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NET_GRANTER_5_YEAR_USER_COUNT = null; } else {
      this.NET_GRANTER_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_1_YEAR_USER_COUNT = null; } else {
      this.DEV_1_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dev_1_to_3_year_user_count = null; } else {
      this.dev_1_to_3_year_user_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_3_TO_5_YEAR_USER_COUNT = null; } else {
      this.DEV_3_TO_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEV_GRANTER_5_YEAR_USER_COUNT = null; } else {
      this.DEV_GRANTER_5_YEAR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INFREQUENT_CHANGE_USER_COUNT = null; } else {
      this.INFREQUENT_CHANGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CHANGE_ONE_TIME_USER_COUNT = null; } else {
      this.CHANGE_ONE_TIME_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.FREQUENT_CHANGE_USER_COUNT = null; } else {
      this.FREQUENT_CHANGE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_OVER_101_USER_COUNT = null; } else {
      this.CONSUM_OVER_101_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_51_TO_100_USER_COUNT = null; } else {
      this.CONSUM_51_TO_100_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_21_TO_50_USER_COUNT = null; } else {
      this.CONSUM_21_TO_50_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CONSUM_LESS_20_USER_COUNT = null; } else {
      this.CONSUM_LESS_20_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_OVER_21_USER_COUNT = null; } else {
      this.VOD_OVER_21_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_11_TO_20_USER_COUNT = null; } else {
      this.VOD_11_TO_20_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_6_TO_10_USER_COUNT = null; } else {
      this.VOD_6_TO_10_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_LESS_5_USER_COUNT = null; } else {
      this.VOD_LESS_5_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INACTIVE_USER_COUNT = null; } else {
      this.INACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_FIVE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_FIVE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP5_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_FOUR = null; } else {
      this.PAYMENT_CAHNNEL_TOP_FOUR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP4_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_THREE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_THREE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP3_PAYMENT_CHANNEL_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_TWO = null; } else {
      this.PAYMENT_CAHNNEL_TOP_TWO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP2_PAYMENT_CHANNEL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_CAHNNEL_TOP_ONE = null; } else {
      this.PAYMENT_CAHNNEL_TOP_ONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_PAYMENT_CHANNEL_COUNT = null; } else {
      this.TOP1_PAYMENT_CHANNEL_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_THREE = null; } else {
      this.PAYMENT_HABIT_TOP_THREE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP3_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_TWO = null; } else {
      this.PAYMENT_HABIT_TOP_TWO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP2_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.PAYMENT_HABIT_TOP_ONE = null; } else {
      this.PAYMENT_HABIT_TOP_ONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_PAYMENT_HABIT_COUNT = null; } else {
      this.TOP1_PAYMENT_HABIT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ZERO = null; } else {
      this.DEBT_STOP_SEN_LEV_ZERO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ONE_WEEK = null; } else {
      this.DEBT_STOP_SEN_LEV_ONE_WEEK = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_TWO_WEEKS = null; } else {
      this.DEBT_STOP_SEN_LEV_TWO_WEEKS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_ONE_MONTH = null; } else {
      this.DEBT_STOP_SEN_LEV_ONE_MONTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DEBT_STOP_SEN_LEV_OVER = null; } else {
      this.DEBT_STOP_SEN_LEV_OVER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_COUNT_TOTAL = null; } else {
      this.USER_COUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUST_COUNT_TOTAL = null; } else {
      this.CUST_COUNT_TOTAL = new java.math.BigDecimal(__cur_str);
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
    ST_CUST_FEAT_DTL_M o = (ST_CUST_FEAT_DTL_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_CUST_FEAT_DTL_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("DTV_USER_COUNT", this.DTV_USER_COUNT);
    __sqoop$field_map.put("DBITV_USER_COUNT", this.DBITV_USER_COUNT);
    __sqoop$field_map.put("DITV_USER_COUNT", this.DITV_USER_COUNT);
    __sqoop$field_map.put("DFTV_USER_COUNT", this.DFTV_USER_COUNT);
    __sqoop$field_map.put("LAN_USER_COUNT", this.LAN_USER_COUNT);
    __sqoop$field_map.put("HDTV_USER_COUNT", this.HDTV_USER_COUNT);
    __sqoop$field_map.put("AMSP_USER_COUNT", this.AMSP_USER_COUNT);
    __sqoop$field_map.put("CLOUD_MEDIA_USER_COUNT", this.CLOUD_MEDIA_USER_COUNT);
    __sqoop$field_map.put("MALE_COUNT", this.MALE_COUNT);
    __sqoop$field_map.put("FEMALE_COUNT", this.FEMALE_COUNT);
    __sqoop$field_map.put("GENERATION_BEFORE_70S", this.GENERATION_BEFORE_70S);
    __sqoop$field_map.put("GENERATION_BETWEEN_70S_AND_90S", this.GENERATION_BETWEEN_70S_AND_90S);
    __sqoop$field_map.put("GENERATION_BETWEEN_90S_AND_10S", this.GENERATION_BETWEEN_90S_AND_10S);
    __sqoop$field_map.put("GENERATION_AFTER_10S", this.GENERATION_AFTER_10S);
    __sqoop$field_map.put("FAMILY_CHILD_COUNT", this.FAMILY_CHILD_COUNT);
    __sqoop$field_map.put("FAMILY_OLD_COUNT", this.FAMILY_OLD_COUNT);
    __sqoop$field_map.put("FAMILY_CHILD_FAMILT_OLD_COUNT", this.FAMILY_CHILD_FAMILT_OLD_COUNT);
    __sqoop$field_map.put("NFAMILY_CHILD_FAMILT_OLD_COUNT", this.NFAMILY_CHILD_FAMILT_OLD_COUNT);
    __sqoop$field_map.put("CITY_COUNT", this.CITY_COUNT);
    __sqoop$field_map.put("SUBURB_COUNT", this.SUBURB_COUNT);
    __sqoop$field_map.put("CONVERGE_USER_COUNT", this.CONVERGE_USER_COUNT);
    __sqoop$field_map.put("ONLY_LAN_USER_COUNT", this.ONLY_LAN_USER_COUNT);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("NET_1_YEAR_USER_COUNT", this.NET_1_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_1_TO_3_YEAR_USER_COUNT", this.NET_1_TO_3_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_3_TO_5_YEAR_USER_COUNT", this.NET_3_TO_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_GRANTER_5_YEAR_USER_COUNT", this.NET_GRANTER_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("DEV_1_YEAR_USER_COUNT", this.DEV_1_YEAR_USER_COUNT);
    __sqoop$field_map.put("dev_1_to_3_year_user_count", this.dev_1_to_3_year_user_count);
    __sqoop$field_map.put("DEV_3_TO_5_YEAR_USER_COUNT", this.DEV_3_TO_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("DEV_GRANTER_5_YEAR_USER_COUNT", this.DEV_GRANTER_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("INFREQUENT_CHANGE_USER_COUNT", this.INFREQUENT_CHANGE_USER_COUNT);
    __sqoop$field_map.put("CHANGE_ONE_TIME_USER_COUNT", this.CHANGE_ONE_TIME_USER_COUNT);
    __sqoop$field_map.put("FREQUENT_CHANGE_USER_COUNT", this.FREQUENT_CHANGE_USER_COUNT);
    __sqoop$field_map.put("CONSUM_OVER_101_USER_COUNT", this.CONSUM_OVER_101_USER_COUNT);
    __sqoop$field_map.put("CONSUM_51_TO_100_USER_COUNT", this.CONSUM_51_TO_100_USER_COUNT);
    __sqoop$field_map.put("CONSUM_21_TO_50_USER_COUNT", this.CONSUM_21_TO_50_USER_COUNT);
    __sqoop$field_map.put("CONSUM_LESS_20_USER_COUNT", this.CONSUM_LESS_20_USER_COUNT);
    __sqoop$field_map.put("VOD_OVER_21_USER_COUNT", this.VOD_OVER_21_USER_COUNT);
    __sqoop$field_map.put("VOD_11_TO_20_USER_COUNT", this.VOD_11_TO_20_USER_COUNT);
    __sqoop$field_map.put("VOD_6_TO_10_USER_COUNT", this.VOD_6_TO_10_USER_COUNT);
    __sqoop$field_map.put("VOD_LESS_5_USER_COUNT", this.VOD_LESS_5_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
    __sqoop$field_map.put("INACTIVE_USER_COUNT", this.INACTIVE_USER_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_FIVE", this.PAYMENT_CAHNNEL_TOP_FIVE);
    __sqoop$field_map.put("TOP5_PAYMENT_CHANNEL_COUNT", this.TOP5_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_FOUR", this.PAYMENT_CAHNNEL_TOP_FOUR);
    __sqoop$field_map.put("TOP4_PAYMENT_CHANNEL_COUNT", this.TOP4_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_THREE", this.PAYMENT_CAHNNEL_TOP_THREE);
    __sqoop$field_map.put("TOP3_PAYMENT_CHANNEL_COUNT", this.TOP3_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_TWO", this.PAYMENT_CAHNNEL_TOP_TWO);
    __sqoop$field_map.put("TOP2_PAYMENT_CHANNEL_COUNT", this.TOP2_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_ONE", this.PAYMENT_CAHNNEL_TOP_ONE);
    __sqoop$field_map.put("TOP1_PAYMENT_CHANNEL_COUNT", this.TOP1_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_THREE", this.PAYMENT_HABIT_TOP_THREE);
    __sqoop$field_map.put("TOP3_PAYMENT_HABIT_COUNT", this.TOP3_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_TWO", this.PAYMENT_HABIT_TOP_TWO);
    __sqoop$field_map.put("TOP2_PAYMENT_HABIT_COUNT", this.TOP2_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_ONE", this.PAYMENT_HABIT_TOP_ONE);
    __sqoop$field_map.put("TOP1_PAYMENT_HABIT_COUNT", this.TOP1_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ZERO", this.DEBT_STOP_SEN_LEV_ZERO);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ONE_WEEK", this.DEBT_STOP_SEN_LEV_ONE_WEEK);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_TWO_WEEKS", this.DEBT_STOP_SEN_LEV_TWO_WEEKS);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ONE_MONTH", this.DEBT_STOP_SEN_LEV_ONE_MONTH);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_OVER", this.DEBT_STOP_SEN_LEV_OVER);
    __sqoop$field_map.put("USER_COUNT_TOTAL", this.USER_COUNT_TOTAL);
    __sqoop$field_map.put("CUST_COUNT_TOTAL", this.CUST_COUNT_TOTAL);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("DTV_USER_COUNT", this.DTV_USER_COUNT);
    __sqoop$field_map.put("DBITV_USER_COUNT", this.DBITV_USER_COUNT);
    __sqoop$field_map.put("DITV_USER_COUNT", this.DITV_USER_COUNT);
    __sqoop$field_map.put("DFTV_USER_COUNT", this.DFTV_USER_COUNT);
    __sqoop$field_map.put("LAN_USER_COUNT", this.LAN_USER_COUNT);
    __sqoop$field_map.put("HDTV_USER_COUNT", this.HDTV_USER_COUNT);
    __sqoop$field_map.put("AMSP_USER_COUNT", this.AMSP_USER_COUNT);
    __sqoop$field_map.put("CLOUD_MEDIA_USER_COUNT", this.CLOUD_MEDIA_USER_COUNT);
    __sqoop$field_map.put("MALE_COUNT", this.MALE_COUNT);
    __sqoop$field_map.put("FEMALE_COUNT", this.FEMALE_COUNT);
    __sqoop$field_map.put("GENERATION_BEFORE_70S", this.GENERATION_BEFORE_70S);
    __sqoop$field_map.put("GENERATION_BETWEEN_70S_AND_90S", this.GENERATION_BETWEEN_70S_AND_90S);
    __sqoop$field_map.put("GENERATION_BETWEEN_90S_AND_10S", this.GENERATION_BETWEEN_90S_AND_10S);
    __sqoop$field_map.put("GENERATION_AFTER_10S", this.GENERATION_AFTER_10S);
    __sqoop$field_map.put("FAMILY_CHILD_COUNT", this.FAMILY_CHILD_COUNT);
    __sqoop$field_map.put("FAMILY_OLD_COUNT", this.FAMILY_OLD_COUNT);
    __sqoop$field_map.put("FAMILY_CHILD_FAMILT_OLD_COUNT", this.FAMILY_CHILD_FAMILT_OLD_COUNT);
    __sqoop$field_map.put("NFAMILY_CHILD_FAMILT_OLD_COUNT", this.NFAMILY_CHILD_FAMILT_OLD_COUNT);
    __sqoop$field_map.put("CITY_COUNT", this.CITY_COUNT);
    __sqoop$field_map.put("SUBURB_COUNT", this.SUBURB_COUNT);
    __sqoop$field_map.put("CONVERGE_USER_COUNT", this.CONVERGE_USER_COUNT);
    __sqoop$field_map.put("ONLY_LAN_USER_COUNT", this.ONLY_LAN_USER_COUNT);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("NET_1_YEAR_USER_COUNT", this.NET_1_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_1_TO_3_YEAR_USER_COUNT", this.NET_1_TO_3_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_3_TO_5_YEAR_USER_COUNT", this.NET_3_TO_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("NET_GRANTER_5_YEAR_USER_COUNT", this.NET_GRANTER_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("DEV_1_YEAR_USER_COUNT", this.DEV_1_YEAR_USER_COUNT);
    __sqoop$field_map.put("dev_1_to_3_year_user_count", this.dev_1_to_3_year_user_count);
    __sqoop$field_map.put("DEV_3_TO_5_YEAR_USER_COUNT", this.DEV_3_TO_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("DEV_GRANTER_5_YEAR_USER_COUNT", this.DEV_GRANTER_5_YEAR_USER_COUNT);
    __sqoop$field_map.put("INFREQUENT_CHANGE_USER_COUNT", this.INFREQUENT_CHANGE_USER_COUNT);
    __sqoop$field_map.put("CHANGE_ONE_TIME_USER_COUNT", this.CHANGE_ONE_TIME_USER_COUNT);
    __sqoop$field_map.put("FREQUENT_CHANGE_USER_COUNT", this.FREQUENT_CHANGE_USER_COUNT);
    __sqoop$field_map.put("CONSUM_OVER_101_USER_COUNT", this.CONSUM_OVER_101_USER_COUNT);
    __sqoop$field_map.put("CONSUM_51_TO_100_USER_COUNT", this.CONSUM_51_TO_100_USER_COUNT);
    __sqoop$field_map.put("CONSUM_21_TO_50_USER_COUNT", this.CONSUM_21_TO_50_USER_COUNT);
    __sqoop$field_map.put("CONSUM_LESS_20_USER_COUNT", this.CONSUM_LESS_20_USER_COUNT);
    __sqoop$field_map.put("VOD_OVER_21_USER_COUNT", this.VOD_OVER_21_USER_COUNT);
    __sqoop$field_map.put("VOD_11_TO_20_USER_COUNT", this.VOD_11_TO_20_USER_COUNT);
    __sqoop$field_map.put("VOD_6_TO_10_USER_COUNT", this.VOD_6_TO_10_USER_COUNT);
    __sqoop$field_map.put("VOD_LESS_5_USER_COUNT", this.VOD_LESS_5_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
    __sqoop$field_map.put("INACTIVE_USER_COUNT", this.INACTIVE_USER_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_FIVE", this.PAYMENT_CAHNNEL_TOP_FIVE);
    __sqoop$field_map.put("TOP5_PAYMENT_CHANNEL_COUNT", this.TOP5_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_FOUR", this.PAYMENT_CAHNNEL_TOP_FOUR);
    __sqoop$field_map.put("TOP4_PAYMENT_CHANNEL_COUNT", this.TOP4_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_THREE", this.PAYMENT_CAHNNEL_TOP_THREE);
    __sqoop$field_map.put("TOP3_PAYMENT_CHANNEL_COUNT", this.TOP3_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_TWO", this.PAYMENT_CAHNNEL_TOP_TWO);
    __sqoop$field_map.put("TOP2_PAYMENT_CHANNEL_COUNT", this.TOP2_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_CAHNNEL_TOP_ONE", this.PAYMENT_CAHNNEL_TOP_ONE);
    __sqoop$field_map.put("TOP1_PAYMENT_CHANNEL_COUNT", this.TOP1_PAYMENT_CHANNEL_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_THREE", this.PAYMENT_HABIT_TOP_THREE);
    __sqoop$field_map.put("TOP3_PAYMENT_HABIT_COUNT", this.TOP3_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_TWO", this.PAYMENT_HABIT_TOP_TWO);
    __sqoop$field_map.put("TOP2_PAYMENT_HABIT_COUNT", this.TOP2_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("PAYMENT_HABIT_TOP_ONE", this.PAYMENT_HABIT_TOP_ONE);
    __sqoop$field_map.put("TOP1_PAYMENT_HABIT_COUNT", this.TOP1_PAYMENT_HABIT_COUNT);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ZERO", this.DEBT_STOP_SEN_LEV_ZERO);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ONE_WEEK", this.DEBT_STOP_SEN_LEV_ONE_WEEK);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_TWO_WEEKS", this.DEBT_STOP_SEN_LEV_TWO_WEEKS);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_ONE_MONTH", this.DEBT_STOP_SEN_LEV_ONE_MONTH);
    __sqoop$field_map.put("DEBT_STOP_SEN_LEV_OVER", this.DEBT_STOP_SEN_LEV_OVER);
    __sqoop$field_map.put("USER_COUNT_TOTAL", this.USER_COUNT_TOTAL);
    __sqoop$field_map.put("CUST_COUNT_TOTAL", this.CUST_COUNT_TOTAL);
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
    else    if ("DTV_USER_COUNT".equals(__fieldName)) {
      this.DTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DBITV_USER_COUNT".equals(__fieldName)) {
      this.DBITV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DITV_USER_COUNT".equals(__fieldName)) {
      this.DITV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DFTV_USER_COUNT".equals(__fieldName)) {
      this.DFTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LAN_USER_COUNT".equals(__fieldName)) {
      this.LAN_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HDTV_USER_COUNT".equals(__fieldName)) {
      this.HDTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AMSP_USER_COUNT".equals(__fieldName)) {
      this.AMSP_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CLOUD_MEDIA_USER_COUNT".equals(__fieldName)) {
      this.CLOUD_MEDIA_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MALE_COUNT".equals(__fieldName)) {
      this.MALE_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FEMALE_COUNT".equals(__fieldName)) {
      this.FEMALE_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("GENERATION_BEFORE_70S".equals(__fieldName)) {
      this.GENERATION_BEFORE_70S = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("GENERATION_BETWEEN_70S_AND_90S".equals(__fieldName)) {
      this.GENERATION_BETWEEN_70S_AND_90S = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("GENERATION_BETWEEN_90S_AND_10S".equals(__fieldName)) {
      this.GENERATION_BETWEEN_90S_AND_10S = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("GENERATION_AFTER_10S".equals(__fieldName)) {
      this.GENERATION_AFTER_10S = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FAMILY_CHILD_COUNT".equals(__fieldName)) {
      this.FAMILY_CHILD_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FAMILY_OLD_COUNT".equals(__fieldName)) {
      this.FAMILY_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FAMILY_CHILD_FAMILT_OLD_COUNT".equals(__fieldName)) {
      this.FAMILY_CHILD_FAMILT_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NFAMILY_CHILD_FAMILT_OLD_COUNT".equals(__fieldName)) {
      this.NFAMILY_CHILD_FAMILT_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CITY_COUNT".equals(__fieldName)) {
      this.CITY_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SUBURB_COUNT".equals(__fieldName)) {
      this.SUBURB_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONVERGE_USER_COUNT".equals(__fieldName)) {
      this.CONVERGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ONLY_LAN_USER_COUNT".equals(__fieldName)) {
      this.ONLY_LAN_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NET_1_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_1_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NET_1_TO_3_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_1_TO_3_YEAR_USER_COUNT = (Integer) __fieldVal;
    }
    else    if ("NET_3_TO_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_3_TO_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NET_GRANTER_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_GRANTER_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEV_1_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_1_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("dev_1_to_3_year_user_count".equals(__fieldName)) {
      this.dev_1_to_3_year_user_count = (Integer) __fieldVal;
    }
    else    if ("DEV_3_TO_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_3_TO_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEV_GRANTER_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_GRANTER_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INFREQUENT_CHANGE_USER_COUNT".equals(__fieldName)) {
      this.INFREQUENT_CHANGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CHANGE_ONE_TIME_USER_COUNT".equals(__fieldName)) {
      this.CHANGE_ONE_TIME_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FREQUENT_CHANGE_USER_COUNT".equals(__fieldName)) {
      this.FREQUENT_CHANGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONSUM_OVER_101_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_OVER_101_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONSUM_51_TO_100_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_51_TO_100_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONSUM_21_TO_50_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_21_TO_50_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONSUM_LESS_20_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_LESS_20_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VOD_OVER_21_USER_COUNT".equals(__fieldName)) {
      this.VOD_OVER_21_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VOD_11_TO_20_USER_COUNT".equals(__fieldName)) {
      this.VOD_11_TO_20_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VOD_6_TO_10_USER_COUNT".equals(__fieldName)) {
      this.VOD_6_TO_10_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VOD_LESS_5_USER_COUNT".equals(__fieldName)) {
      this.VOD_LESS_5_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INACTIVE_USER_COUNT".equals(__fieldName)) {
      this.INACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_FIVE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_FIVE = (String) __fieldVal;
    }
    else    if ("TOP5_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP5_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_FOUR".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_FOUR = (String) __fieldVal;
    }
    else    if ("TOP4_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP4_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_THREE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_THREE = (String) __fieldVal;
    }
    else    if ("TOP3_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP3_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_TWO".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_TWO = (String) __fieldVal;
    }
    else    if ("TOP2_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP2_PAYMENT_CHANNEL_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_ONE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_ONE = (String) __fieldVal;
    }
    else    if ("TOP1_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP1_PAYMENT_CHANNEL_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_HABIT_TOP_THREE".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_THREE = (String) __fieldVal;
    }
    else    if ("TOP3_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP3_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_HABIT_TOP_TWO".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_TWO = (String) __fieldVal;
    }
    else    if ("TOP2_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP2_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_HABIT_TOP_ONE".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_ONE = (String) __fieldVal;
    }
    else    if ("TOP1_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP1_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEBT_STOP_SEN_LEV_ZERO".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ZERO = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEBT_STOP_SEN_LEV_ONE_WEEK".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ONE_WEEK = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEBT_STOP_SEN_LEV_TWO_WEEKS".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_TWO_WEEKS = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEBT_STOP_SEN_LEV_ONE_MONTH".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ONE_MONTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DEBT_STOP_SEN_LEV_OVER".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_OVER = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("USER_COUNT_TOTAL".equals(__fieldName)) {
      this.USER_COUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUST_COUNT_TOTAL".equals(__fieldName)) {
      this.CUST_COUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
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
    else    if ("DTV_USER_COUNT".equals(__fieldName)) {
      this.DTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DBITV_USER_COUNT".equals(__fieldName)) {
      this.DBITV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DITV_USER_COUNT".equals(__fieldName)) {
      this.DITV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DFTV_USER_COUNT".equals(__fieldName)) {
      this.DFTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LAN_USER_COUNT".equals(__fieldName)) {
      this.LAN_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HDTV_USER_COUNT".equals(__fieldName)) {
      this.HDTV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AMSP_USER_COUNT".equals(__fieldName)) {
      this.AMSP_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CLOUD_MEDIA_USER_COUNT".equals(__fieldName)) {
      this.CLOUD_MEDIA_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MALE_COUNT".equals(__fieldName)) {
      this.MALE_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FEMALE_COUNT".equals(__fieldName)) {
      this.FEMALE_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("GENERATION_BEFORE_70S".equals(__fieldName)) {
      this.GENERATION_BEFORE_70S = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("GENERATION_BETWEEN_70S_AND_90S".equals(__fieldName)) {
      this.GENERATION_BETWEEN_70S_AND_90S = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("GENERATION_BETWEEN_90S_AND_10S".equals(__fieldName)) {
      this.GENERATION_BETWEEN_90S_AND_10S = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("GENERATION_AFTER_10S".equals(__fieldName)) {
      this.GENERATION_AFTER_10S = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FAMILY_CHILD_COUNT".equals(__fieldName)) {
      this.FAMILY_CHILD_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FAMILY_OLD_COUNT".equals(__fieldName)) {
      this.FAMILY_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FAMILY_CHILD_FAMILT_OLD_COUNT".equals(__fieldName)) {
      this.FAMILY_CHILD_FAMILT_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NFAMILY_CHILD_FAMILT_OLD_COUNT".equals(__fieldName)) {
      this.NFAMILY_CHILD_FAMILT_OLD_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CITY_COUNT".equals(__fieldName)) {
      this.CITY_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SUBURB_COUNT".equals(__fieldName)) {
      this.SUBURB_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONVERGE_USER_COUNT".equals(__fieldName)) {
      this.CONVERGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ONLY_LAN_USER_COUNT".equals(__fieldName)) {
      this.ONLY_LAN_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NET_1_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_1_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NET_1_TO_3_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_1_TO_3_YEAR_USER_COUNT = (Integer) __fieldVal;
      return true;
    }
    else    if ("NET_3_TO_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_3_TO_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NET_GRANTER_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.NET_GRANTER_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEV_1_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_1_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("dev_1_to_3_year_user_count".equals(__fieldName)) {
      this.dev_1_to_3_year_user_count = (Integer) __fieldVal;
      return true;
    }
    else    if ("DEV_3_TO_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_3_TO_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEV_GRANTER_5_YEAR_USER_COUNT".equals(__fieldName)) {
      this.DEV_GRANTER_5_YEAR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INFREQUENT_CHANGE_USER_COUNT".equals(__fieldName)) {
      this.INFREQUENT_CHANGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CHANGE_ONE_TIME_USER_COUNT".equals(__fieldName)) {
      this.CHANGE_ONE_TIME_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FREQUENT_CHANGE_USER_COUNT".equals(__fieldName)) {
      this.FREQUENT_CHANGE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONSUM_OVER_101_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_OVER_101_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONSUM_51_TO_100_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_51_TO_100_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONSUM_21_TO_50_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_21_TO_50_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONSUM_LESS_20_USER_COUNT".equals(__fieldName)) {
      this.CONSUM_LESS_20_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VOD_OVER_21_USER_COUNT".equals(__fieldName)) {
      this.VOD_OVER_21_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VOD_11_TO_20_USER_COUNT".equals(__fieldName)) {
      this.VOD_11_TO_20_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VOD_6_TO_10_USER_COUNT".equals(__fieldName)) {
      this.VOD_6_TO_10_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VOD_LESS_5_USER_COUNT".equals(__fieldName)) {
      this.VOD_LESS_5_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INACTIVE_USER_COUNT".equals(__fieldName)) {
      this.INACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_FIVE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_FIVE = (String) __fieldVal;
      return true;
    }
    else    if ("TOP5_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP5_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_FOUR".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_FOUR = (String) __fieldVal;
      return true;
    }
    else    if ("TOP4_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP4_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_THREE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_THREE = (String) __fieldVal;
      return true;
    }
    else    if ("TOP3_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP3_PAYMENT_CHANNEL_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_TWO".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_TWO = (String) __fieldVal;
      return true;
    }
    else    if ("TOP2_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP2_PAYMENT_CHANNEL_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_CAHNNEL_TOP_ONE".equals(__fieldName)) {
      this.PAYMENT_CAHNNEL_TOP_ONE = (String) __fieldVal;
      return true;
    }
    else    if ("TOP1_PAYMENT_CHANNEL_COUNT".equals(__fieldName)) {
      this.TOP1_PAYMENT_CHANNEL_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_HABIT_TOP_THREE".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_THREE = (String) __fieldVal;
      return true;
    }
    else    if ("TOP3_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP3_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_HABIT_TOP_TWO".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_TWO = (String) __fieldVal;
      return true;
    }
    else    if ("TOP2_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP2_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_HABIT_TOP_ONE".equals(__fieldName)) {
      this.PAYMENT_HABIT_TOP_ONE = (String) __fieldVal;
      return true;
    }
    else    if ("TOP1_PAYMENT_HABIT_COUNT".equals(__fieldName)) {
      this.TOP1_PAYMENT_HABIT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEBT_STOP_SEN_LEV_ZERO".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ZERO = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEBT_STOP_SEN_LEV_ONE_WEEK".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ONE_WEEK = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEBT_STOP_SEN_LEV_TWO_WEEKS".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_TWO_WEEKS = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEBT_STOP_SEN_LEV_ONE_MONTH".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_ONE_MONTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DEBT_STOP_SEN_LEV_OVER".equals(__fieldName)) {
      this.DEBT_STOP_SEN_LEV_OVER = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("USER_COUNT_TOTAL".equals(__fieldName)) {
      this.USER_COUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUST_COUNT_TOTAL".equals(__fieldName)) {
      this.CUST_COUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
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
