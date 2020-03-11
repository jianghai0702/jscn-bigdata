// ORM class for table 'st_user_view_beh_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 28 18:31:56 CST 2018
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

public class st_user_view_beh_m extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String OWN_CORP_STD_ORG_CODE;
  public String get_OWN_CORP_STD_ORG_CODE() {
    return OWN_CORP_STD_ORG_CODE;
  }
  public void set_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
    this.OWN_CORP_STD_ORG_CODE = OWN_CORP_STD_ORG_CODE;
  }
  public st_user_view_beh_m with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_user_view_beh_m with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private Long TV_USER_COUNT;
  public Long get_TV_USER_COUNT() {
    return TV_USER_COUNT;
  }
  public void set_TV_USER_COUNT(Long TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
  }
  public st_user_view_beh_m with_TV_USER_COUNT(Long TV_USER_COUNT) {
    this.TV_USER_COUNT = TV_USER_COUNT;
    return this;
  }
  private Long NO_TV_USER_COUNT;
  public Long get_NO_TV_USER_COUNT() {
    return NO_TV_USER_COUNT;
  }
  public void set_NO_TV_USER_COUNT(Long NO_TV_USER_COUNT) {
    this.NO_TV_USER_COUNT = NO_TV_USER_COUNT;
  }
  public st_user_view_beh_m with_NO_TV_USER_COUNT(Long NO_TV_USER_COUNT) {
    this.NO_TV_USER_COUNT = NO_TV_USER_COUNT;
    return this;
  }
  private String TV_CHANNEL_NAME_TOP1;
  public String get_TV_CHANNEL_NAME_TOP1() {
    return TV_CHANNEL_NAME_TOP1;
  }
  public void set_TV_CHANNEL_NAME_TOP1(String TV_CHANNEL_NAME_TOP1) {
    this.TV_CHANNEL_NAME_TOP1 = TV_CHANNEL_NAME_TOP1;
  }
  public st_user_view_beh_m with_TV_CHANNEL_NAME_TOP1(String TV_CHANNEL_NAME_TOP1) {
    this.TV_CHANNEL_NAME_TOP1 = TV_CHANNEL_NAME_TOP1;
    return this;
  }
  private java.math.BigDecimal TOP1_AVG_TV_COUNT;
  public java.math.BigDecimal get_TOP1_AVG_TV_COUNT() {
    return TOP1_AVG_TV_COUNT;
  }
  public void set_TOP1_AVG_TV_COUNT(java.math.BigDecimal TOP1_AVG_TV_COUNT) {
    this.TOP1_AVG_TV_COUNT = TOP1_AVG_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP1_AVG_TV_COUNT(java.math.BigDecimal TOP1_AVG_TV_COUNT) {
    this.TOP1_AVG_TV_COUNT = TOP1_AVG_TV_COUNT;
    return this;
  }
  private Long TOP1_MAX_TV_COUNT;
  public Long get_TOP1_MAX_TV_COUNT() {
    return TOP1_MAX_TV_COUNT;
  }
  public void set_TOP1_MAX_TV_COUNT(Long TOP1_MAX_TV_COUNT) {
    this.TOP1_MAX_TV_COUNT = TOP1_MAX_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP1_MAX_TV_COUNT(Long TOP1_MAX_TV_COUNT) {
    this.TOP1_MAX_TV_COUNT = TOP1_MAX_TV_COUNT;
    return this;
  }
  private String TV_CHANNEL_NAME_TOP2;
  public String get_TV_CHANNEL_NAME_TOP2() {
    return TV_CHANNEL_NAME_TOP2;
  }
  public void set_TV_CHANNEL_NAME_TOP2(String TV_CHANNEL_NAME_TOP2) {
    this.TV_CHANNEL_NAME_TOP2 = TV_CHANNEL_NAME_TOP2;
  }
  public st_user_view_beh_m with_TV_CHANNEL_NAME_TOP2(String TV_CHANNEL_NAME_TOP2) {
    this.TV_CHANNEL_NAME_TOP2 = TV_CHANNEL_NAME_TOP2;
    return this;
  }
  private java.math.BigDecimal TOP2_AVG_TV_COUNT;
  public java.math.BigDecimal get_TOP2_AVG_TV_COUNT() {
    return TOP2_AVG_TV_COUNT;
  }
  public void set_TOP2_AVG_TV_COUNT(java.math.BigDecimal TOP2_AVG_TV_COUNT) {
    this.TOP2_AVG_TV_COUNT = TOP2_AVG_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP2_AVG_TV_COUNT(java.math.BigDecimal TOP2_AVG_TV_COUNT) {
    this.TOP2_AVG_TV_COUNT = TOP2_AVG_TV_COUNT;
    return this;
  }
  private Long TOP2_MAX_TV_COUNT;
  public Long get_TOP2_MAX_TV_COUNT() {
    return TOP2_MAX_TV_COUNT;
  }
  public void set_TOP2_MAX_TV_COUNT(Long TOP2_MAX_TV_COUNT) {
    this.TOP2_MAX_TV_COUNT = TOP2_MAX_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP2_MAX_TV_COUNT(Long TOP2_MAX_TV_COUNT) {
    this.TOP2_MAX_TV_COUNT = TOP2_MAX_TV_COUNT;
    return this;
  }
  private String TV_CHANNEL_NAME_TOP3;
  public String get_TV_CHANNEL_NAME_TOP3() {
    return TV_CHANNEL_NAME_TOP3;
  }
  public void set_TV_CHANNEL_NAME_TOP3(String TV_CHANNEL_NAME_TOP3) {
    this.TV_CHANNEL_NAME_TOP3 = TV_CHANNEL_NAME_TOP3;
  }
  public st_user_view_beh_m with_TV_CHANNEL_NAME_TOP3(String TV_CHANNEL_NAME_TOP3) {
    this.TV_CHANNEL_NAME_TOP3 = TV_CHANNEL_NAME_TOP3;
    return this;
  }
  private java.math.BigDecimal TOP3_AVG_TV_COUNT;
  public java.math.BigDecimal get_TOP3_AVG_TV_COUNT() {
    return TOP3_AVG_TV_COUNT;
  }
  public void set_TOP3_AVG_TV_COUNT(java.math.BigDecimal TOP3_AVG_TV_COUNT) {
    this.TOP3_AVG_TV_COUNT = TOP3_AVG_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP3_AVG_TV_COUNT(java.math.BigDecimal TOP3_AVG_TV_COUNT) {
    this.TOP3_AVG_TV_COUNT = TOP3_AVG_TV_COUNT;
    return this;
  }
  private Long TOP3_MAX_TV_COUNT;
  public Long get_TOP3_MAX_TV_COUNT() {
    return TOP3_MAX_TV_COUNT;
  }
  public void set_TOP3_MAX_TV_COUNT(Long TOP3_MAX_TV_COUNT) {
    this.TOP3_MAX_TV_COUNT = TOP3_MAX_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP3_MAX_TV_COUNT(Long TOP3_MAX_TV_COUNT) {
    this.TOP3_MAX_TV_COUNT = TOP3_MAX_TV_COUNT;
    return this;
  }
  private String TV_CHANNEL_NAME_TOP4;
  public String get_TV_CHANNEL_NAME_TOP4() {
    return TV_CHANNEL_NAME_TOP4;
  }
  public void set_TV_CHANNEL_NAME_TOP4(String TV_CHANNEL_NAME_TOP4) {
    this.TV_CHANNEL_NAME_TOP4 = TV_CHANNEL_NAME_TOP4;
  }
  public st_user_view_beh_m with_TV_CHANNEL_NAME_TOP4(String TV_CHANNEL_NAME_TOP4) {
    this.TV_CHANNEL_NAME_TOP4 = TV_CHANNEL_NAME_TOP4;
    return this;
  }
  private java.math.BigDecimal TOP4_AVG_TV_COUNT;
  public java.math.BigDecimal get_TOP4_AVG_TV_COUNT() {
    return TOP4_AVG_TV_COUNT;
  }
  public void set_TOP4_AVG_TV_COUNT(java.math.BigDecimal TOP4_AVG_TV_COUNT) {
    this.TOP4_AVG_TV_COUNT = TOP4_AVG_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP4_AVG_TV_COUNT(java.math.BigDecimal TOP4_AVG_TV_COUNT) {
    this.TOP4_AVG_TV_COUNT = TOP4_AVG_TV_COUNT;
    return this;
  }
  private Long TOP4_MAX_TV_COUNT;
  public Long get_TOP4_MAX_TV_COUNT() {
    return TOP4_MAX_TV_COUNT;
  }
  public void set_TOP4_MAX_TV_COUNT(Long TOP4_MAX_TV_COUNT) {
    this.TOP4_MAX_TV_COUNT = TOP4_MAX_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP4_MAX_TV_COUNT(Long TOP4_MAX_TV_COUNT) {
    this.TOP4_MAX_TV_COUNT = TOP4_MAX_TV_COUNT;
    return this;
  }
  private String TV_CHANNEL_NAME_TOP5;
  public String get_TV_CHANNEL_NAME_TOP5() {
    return TV_CHANNEL_NAME_TOP5;
  }
  public void set_TV_CHANNEL_NAME_TOP5(String TV_CHANNEL_NAME_TOP5) {
    this.TV_CHANNEL_NAME_TOP5 = TV_CHANNEL_NAME_TOP5;
  }
  public st_user_view_beh_m with_TV_CHANNEL_NAME_TOP5(String TV_CHANNEL_NAME_TOP5) {
    this.TV_CHANNEL_NAME_TOP5 = TV_CHANNEL_NAME_TOP5;
    return this;
  }
  private java.math.BigDecimal TOP5_AVG_TV_COUNT;
  public java.math.BigDecimal get_TOP5_AVG_TV_COUNT() {
    return TOP5_AVG_TV_COUNT;
  }
  public void set_TOP5_AVG_TV_COUNT(java.math.BigDecimal TOP5_AVG_TV_COUNT) {
    this.TOP5_AVG_TV_COUNT = TOP5_AVG_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP5_AVG_TV_COUNT(java.math.BigDecimal TOP5_AVG_TV_COUNT) {
    this.TOP5_AVG_TV_COUNT = TOP5_AVG_TV_COUNT;
    return this;
  }
  private Long TOP5_MAX_TV_COUNT;
  public Long get_TOP5_MAX_TV_COUNT() {
    return TOP5_MAX_TV_COUNT;
  }
  public void set_TOP5_MAX_TV_COUNT(Long TOP5_MAX_TV_COUNT) {
    this.TOP5_MAX_TV_COUNT = TOP5_MAX_TV_COUNT;
  }
  public st_user_view_beh_m with_TOP5_MAX_TV_COUNT(Long TOP5_MAX_TV_COUNT) {
    this.TOP5_MAX_TV_COUNT = TOP5_MAX_TV_COUNT;
    return this;
  }
  private Long HOLIDAY_TV_COUNT1;
  public Long get_HOLIDAY_TV_COUNT1() {
    return HOLIDAY_TV_COUNT1;
  }
  public void set_HOLIDAY_TV_COUNT1(Long HOLIDAY_TV_COUNT1) {
    this.HOLIDAY_TV_COUNT1 = HOLIDAY_TV_COUNT1;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT1(Long HOLIDAY_TV_COUNT1) {
    this.HOLIDAY_TV_COUNT1 = HOLIDAY_TV_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT1;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT1() {
    return AVG_HOLIDAY_TV_COUNT1;
  }
  public void set_AVG_HOLIDAY_TV_COUNT1(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT1) {
    this.AVG_HOLIDAY_TV_COUNT1 = AVG_HOLIDAY_TV_COUNT1;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT1(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT1) {
    this.AVG_HOLIDAY_TV_COUNT1 = AVG_HOLIDAY_TV_COUNT1;
    return this;
  }
  private Long HOLIDAY_TV_COUNT2;
  public Long get_HOLIDAY_TV_COUNT2() {
    return HOLIDAY_TV_COUNT2;
  }
  public void set_HOLIDAY_TV_COUNT2(Long HOLIDAY_TV_COUNT2) {
    this.HOLIDAY_TV_COUNT2 = HOLIDAY_TV_COUNT2;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT2(Long HOLIDAY_TV_COUNT2) {
    this.HOLIDAY_TV_COUNT2 = HOLIDAY_TV_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT2;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT2() {
    return AVG_HOLIDAY_TV_COUNT2;
  }
  public void set_AVG_HOLIDAY_TV_COUNT2(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT2) {
    this.AVG_HOLIDAY_TV_COUNT2 = AVG_HOLIDAY_TV_COUNT2;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT2(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT2) {
    this.AVG_HOLIDAY_TV_COUNT2 = AVG_HOLIDAY_TV_COUNT2;
    return this;
  }
  private Long HOLIDAY_TV_COUNT3;
  public Long get_HOLIDAY_TV_COUNT3() {
    return HOLIDAY_TV_COUNT3;
  }
  public void set_HOLIDAY_TV_COUNT3(Long HOLIDAY_TV_COUNT3) {
    this.HOLIDAY_TV_COUNT3 = HOLIDAY_TV_COUNT3;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT3(Long HOLIDAY_TV_COUNT3) {
    this.HOLIDAY_TV_COUNT3 = HOLIDAY_TV_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT3;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT3() {
    return AVG_HOLIDAY_TV_COUNT3;
  }
  public void set_AVG_HOLIDAY_TV_COUNT3(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT3) {
    this.AVG_HOLIDAY_TV_COUNT3 = AVG_HOLIDAY_TV_COUNT3;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT3(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT3) {
    this.AVG_HOLIDAY_TV_COUNT3 = AVG_HOLIDAY_TV_COUNT3;
    return this;
  }
  private Long HOLIDAY_TV_COUNT4;
  public Long get_HOLIDAY_TV_COUNT4() {
    return HOLIDAY_TV_COUNT4;
  }
  public void set_HOLIDAY_TV_COUNT4(Long HOLIDAY_TV_COUNT4) {
    this.HOLIDAY_TV_COUNT4 = HOLIDAY_TV_COUNT4;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT4(Long HOLIDAY_TV_COUNT4) {
    this.HOLIDAY_TV_COUNT4 = HOLIDAY_TV_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT4;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT4() {
    return AVG_HOLIDAY_TV_COUNT4;
  }
  public void set_AVG_HOLIDAY_TV_COUNT4(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT4) {
    this.AVG_HOLIDAY_TV_COUNT4 = AVG_HOLIDAY_TV_COUNT4;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT4(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT4) {
    this.AVG_HOLIDAY_TV_COUNT4 = AVG_HOLIDAY_TV_COUNT4;
    return this;
  }
  private Long HOLIDAY_TV_COUNT5;
  public Long get_HOLIDAY_TV_COUNT5() {
    return HOLIDAY_TV_COUNT5;
  }
  public void set_HOLIDAY_TV_COUNT5(Long HOLIDAY_TV_COUNT5) {
    this.HOLIDAY_TV_COUNT5 = HOLIDAY_TV_COUNT5;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT5(Long HOLIDAY_TV_COUNT5) {
    this.HOLIDAY_TV_COUNT5 = HOLIDAY_TV_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT5;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT5() {
    return AVG_HOLIDAY_TV_COUNT5;
  }
  public void set_AVG_HOLIDAY_TV_COUNT5(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT5) {
    this.AVG_HOLIDAY_TV_COUNT5 = AVG_HOLIDAY_TV_COUNT5;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT5(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT5) {
    this.AVG_HOLIDAY_TV_COUNT5 = AVG_HOLIDAY_TV_COUNT5;
    return this;
  }
  private Long HOLIDAY_TV_COUNT6;
  public Long get_HOLIDAY_TV_COUNT6() {
    return HOLIDAY_TV_COUNT6;
  }
  public void set_HOLIDAY_TV_COUNT6(Long HOLIDAY_TV_COUNT6) {
    this.HOLIDAY_TV_COUNT6 = HOLIDAY_TV_COUNT6;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT6(Long HOLIDAY_TV_COUNT6) {
    this.HOLIDAY_TV_COUNT6 = HOLIDAY_TV_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT6;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT6() {
    return AVG_HOLIDAY_TV_COUNT6;
  }
  public void set_AVG_HOLIDAY_TV_COUNT6(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT6) {
    this.AVG_HOLIDAY_TV_COUNT6 = AVG_HOLIDAY_TV_COUNT6;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT6(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT6) {
    this.AVG_HOLIDAY_TV_COUNT6 = AVG_HOLIDAY_TV_COUNT6;
    return this;
  }
  private Long HOLIDAY_TV_COUNT7;
  public Long get_HOLIDAY_TV_COUNT7() {
    return HOLIDAY_TV_COUNT7;
  }
  public void set_HOLIDAY_TV_COUNT7(Long HOLIDAY_TV_COUNT7) {
    this.HOLIDAY_TV_COUNT7 = HOLIDAY_TV_COUNT7;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT7(Long HOLIDAY_TV_COUNT7) {
    this.HOLIDAY_TV_COUNT7 = HOLIDAY_TV_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT7;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT7() {
    return AVG_HOLIDAY_TV_COUNT7;
  }
  public void set_AVG_HOLIDAY_TV_COUNT7(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT7) {
    this.AVG_HOLIDAY_TV_COUNT7 = AVG_HOLIDAY_TV_COUNT7;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT7(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT7) {
    this.AVG_HOLIDAY_TV_COUNT7 = AVG_HOLIDAY_TV_COUNT7;
    return this;
  }
  private Long HOLIDAY_TV_COUNT8;
  public Long get_HOLIDAY_TV_COUNT8() {
    return HOLIDAY_TV_COUNT8;
  }
  public void set_HOLIDAY_TV_COUNT8(Long HOLIDAY_TV_COUNT8) {
    this.HOLIDAY_TV_COUNT8 = HOLIDAY_TV_COUNT8;
  }
  public st_user_view_beh_m with_HOLIDAY_TV_COUNT8(Long HOLIDAY_TV_COUNT8) {
    this.HOLIDAY_TV_COUNT8 = HOLIDAY_TV_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_TV_COUNT8;
  public java.math.BigDecimal get_AVG_HOLIDAY_TV_COUNT8() {
    return AVG_HOLIDAY_TV_COUNT8;
  }
  public void set_AVG_HOLIDAY_TV_COUNT8(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT8) {
    this.AVG_HOLIDAY_TV_COUNT8 = AVG_HOLIDAY_TV_COUNT8;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_TV_COUNT8(java.math.BigDecimal AVG_HOLIDAY_TV_COUNT8) {
    this.AVG_HOLIDAY_TV_COUNT8 = AVG_HOLIDAY_TV_COUNT8;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT1;
  public Long get_NO_HOLIDAY_TV_COUNT1() {
    return NO_HOLIDAY_TV_COUNT1;
  }
  public void set_NO_HOLIDAY_TV_COUNT1(Long NO_HOLIDAY_TV_COUNT1) {
    this.NO_HOLIDAY_TV_COUNT1 = NO_HOLIDAY_TV_COUNT1;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT1(Long NO_HOLIDAY_TV_COUNT1) {
    this.NO_HOLIDAY_TV_COUNT1 = NO_HOLIDAY_TV_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT1;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT1() {
    return AVG_NO_HOLIDAY_TV_COUNT1;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT1(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT1) {
    this.AVG_NO_HOLIDAY_TV_COUNT1 = AVG_NO_HOLIDAY_TV_COUNT1;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT1(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT1) {
    this.AVG_NO_HOLIDAY_TV_COUNT1 = AVG_NO_HOLIDAY_TV_COUNT1;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT2;
  public Long get_NO_HOLIDAY_TV_COUNT2() {
    return NO_HOLIDAY_TV_COUNT2;
  }
  public void set_NO_HOLIDAY_TV_COUNT2(Long NO_HOLIDAY_TV_COUNT2) {
    this.NO_HOLIDAY_TV_COUNT2 = NO_HOLIDAY_TV_COUNT2;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT2(Long NO_HOLIDAY_TV_COUNT2) {
    this.NO_HOLIDAY_TV_COUNT2 = NO_HOLIDAY_TV_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT2;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT2() {
    return AVG_NO_HOLIDAY_TV_COUNT2;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT2(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT2) {
    this.AVG_NO_HOLIDAY_TV_COUNT2 = AVG_NO_HOLIDAY_TV_COUNT2;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT2(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT2) {
    this.AVG_NO_HOLIDAY_TV_COUNT2 = AVG_NO_HOLIDAY_TV_COUNT2;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT3;
  public Long get_NO_HOLIDAY_TV_COUNT3() {
    return NO_HOLIDAY_TV_COUNT3;
  }
  public void set_NO_HOLIDAY_TV_COUNT3(Long NO_HOLIDAY_TV_COUNT3) {
    this.NO_HOLIDAY_TV_COUNT3 = NO_HOLIDAY_TV_COUNT3;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT3(Long NO_HOLIDAY_TV_COUNT3) {
    this.NO_HOLIDAY_TV_COUNT3 = NO_HOLIDAY_TV_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT3;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT3() {
    return AVG_NO_HOLIDAY_TV_COUNT3;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT3(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT3) {
    this.AVG_NO_HOLIDAY_TV_COUNT3 = AVG_NO_HOLIDAY_TV_COUNT3;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT3(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT3) {
    this.AVG_NO_HOLIDAY_TV_COUNT3 = AVG_NO_HOLIDAY_TV_COUNT3;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT4;
  public Long get_NO_HOLIDAY_TV_COUNT4() {
    return NO_HOLIDAY_TV_COUNT4;
  }
  public void set_NO_HOLIDAY_TV_COUNT4(Long NO_HOLIDAY_TV_COUNT4) {
    this.NO_HOLIDAY_TV_COUNT4 = NO_HOLIDAY_TV_COUNT4;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT4(Long NO_HOLIDAY_TV_COUNT4) {
    this.NO_HOLIDAY_TV_COUNT4 = NO_HOLIDAY_TV_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT4;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT4() {
    return AVG_NO_HOLIDAY_TV_COUNT4;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT4(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT4) {
    this.AVG_NO_HOLIDAY_TV_COUNT4 = AVG_NO_HOLIDAY_TV_COUNT4;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT4(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT4) {
    this.AVG_NO_HOLIDAY_TV_COUNT4 = AVG_NO_HOLIDAY_TV_COUNT4;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT5;
  public Long get_NO_HOLIDAY_TV_COUNT5() {
    return NO_HOLIDAY_TV_COUNT5;
  }
  public void set_NO_HOLIDAY_TV_COUNT5(Long NO_HOLIDAY_TV_COUNT5) {
    this.NO_HOLIDAY_TV_COUNT5 = NO_HOLIDAY_TV_COUNT5;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT5(Long NO_HOLIDAY_TV_COUNT5) {
    this.NO_HOLIDAY_TV_COUNT5 = NO_HOLIDAY_TV_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT5;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT5() {
    return AVG_NO_HOLIDAY_TV_COUNT5;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT5(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT5) {
    this.AVG_NO_HOLIDAY_TV_COUNT5 = AVG_NO_HOLIDAY_TV_COUNT5;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT5(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT5) {
    this.AVG_NO_HOLIDAY_TV_COUNT5 = AVG_NO_HOLIDAY_TV_COUNT5;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT6;
  public Long get_NO_HOLIDAY_TV_COUNT6() {
    return NO_HOLIDAY_TV_COUNT6;
  }
  public void set_NO_HOLIDAY_TV_COUNT6(Long NO_HOLIDAY_TV_COUNT6) {
    this.NO_HOLIDAY_TV_COUNT6 = NO_HOLIDAY_TV_COUNT6;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT6(Long NO_HOLIDAY_TV_COUNT6) {
    this.NO_HOLIDAY_TV_COUNT6 = NO_HOLIDAY_TV_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT6;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT6() {
    return AVG_NO_HOLIDAY_TV_COUNT6;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT6(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT6) {
    this.AVG_NO_HOLIDAY_TV_COUNT6 = AVG_NO_HOLIDAY_TV_COUNT6;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT6(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT6) {
    this.AVG_NO_HOLIDAY_TV_COUNT6 = AVG_NO_HOLIDAY_TV_COUNT6;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT7;
  public Long get_NO_HOLIDAY_TV_COUNT7() {
    return NO_HOLIDAY_TV_COUNT7;
  }
  public void set_NO_HOLIDAY_TV_COUNT7(Long NO_HOLIDAY_TV_COUNT7) {
    this.NO_HOLIDAY_TV_COUNT7 = NO_HOLIDAY_TV_COUNT7;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT7(Long NO_HOLIDAY_TV_COUNT7) {
    this.NO_HOLIDAY_TV_COUNT7 = NO_HOLIDAY_TV_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT7;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT7() {
    return AVG_NO_HOLIDAY_TV_COUNT7;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT7(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT7) {
    this.AVG_NO_HOLIDAY_TV_COUNT7 = AVG_NO_HOLIDAY_TV_COUNT7;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT7(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT7) {
    this.AVG_NO_HOLIDAY_TV_COUNT7 = AVG_NO_HOLIDAY_TV_COUNT7;
    return this;
  }
  private Long NO_HOLIDAY_TV_COUNT8;
  public Long get_NO_HOLIDAY_TV_COUNT8() {
    return NO_HOLIDAY_TV_COUNT8;
  }
  public void set_NO_HOLIDAY_TV_COUNT8(Long NO_HOLIDAY_TV_COUNT8) {
    this.NO_HOLIDAY_TV_COUNT8 = NO_HOLIDAY_TV_COUNT8;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_TV_COUNT8(Long NO_HOLIDAY_TV_COUNT8) {
    this.NO_HOLIDAY_TV_COUNT8 = NO_HOLIDAY_TV_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT8;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_TV_COUNT8() {
    return AVG_NO_HOLIDAY_TV_COUNT8;
  }
  public void set_AVG_NO_HOLIDAY_TV_COUNT8(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT8) {
    this.AVG_NO_HOLIDAY_TV_COUNT8 = AVG_NO_HOLIDAY_TV_COUNT8;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_TV_COUNT8(java.math.BigDecimal AVG_NO_HOLIDAY_TV_COUNT8) {
    this.AVG_NO_HOLIDAY_TV_COUNT8 = AVG_NO_HOLIDAY_TV_COUNT8;
    return this;
  }
  private Long REVIEW_USER_COUNT;
  public Long get_REVIEW_USER_COUNT() {
    return REVIEW_USER_COUNT;
  }
  public void set_REVIEW_USER_COUNT(Long REVIEW_USER_COUNT) {
    this.REVIEW_USER_COUNT = REVIEW_USER_COUNT;
  }
  public st_user_view_beh_m with_REVIEW_USER_COUNT(Long REVIEW_USER_COUNT) {
    this.REVIEW_USER_COUNT = REVIEW_USER_COUNT;
    return this;
  }
  private Long NO_REVIEW_USER_COUNT;
  public Long get_NO_REVIEW_USER_COUNT() {
    return NO_REVIEW_USER_COUNT;
  }
  public void set_NO_REVIEW_USER_COUNT(Long NO_REVIEW_USER_COUNT) {
    this.NO_REVIEW_USER_COUNT = NO_REVIEW_USER_COUNT;
  }
  public st_user_view_beh_m with_NO_REVIEW_USER_COUNT(Long NO_REVIEW_USER_COUNT) {
    this.NO_REVIEW_USER_COUNT = NO_REVIEW_USER_COUNT;
    return this;
  }
  private String REVIEW_CHANNEL_NAME_TOP1;
  public String get_REVIEW_CHANNEL_NAME_TOP1() {
    return REVIEW_CHANNEL_NAME_TOP1;
  }
  public void set_REVIEW_CHANNEL_NAME_TOP1(String REVIEW_CHANNEL_NAME_TOP1) {
    this.REVIEW_CHANNEL_NAME_TOP1 = REVIEW_CHANNEL_NAME_TOP1;
  }
  public st_user_view_beh_m with_REVIEW_CHANNEL_NAME_TOP1(String REVIEW_CHANNEL_NAME_TOP1) {
    this.REVIEW_CHANNEL_NAME_TOP1 = REVIEW_CHANNEL_NAME_TOP1;
    return this;
  }
  private java.math.BigDecimal TOP1_AVG_REVIEW_COUNT;
  public java.math.BigDecimal get_TOP1_AVG_REVIEW_COUNT() {
    return TOP1_AVG_REVIEW_COUNT;
  }
  public void set_TOP1_AVG_REVIEW_COUNT(java.math.BigDecimal TOP1_AVG_REVIEW_COUNT) {
    this.TOP1_AVG_REVIEW_COUNT = TOP1_AVG_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP1_AVG_REVIEW_COUNT(java.math.BigDecimal TOP1_AVG_REVIEW_COUNT) {
    this.TOP1_AVG_REVIEW_COUNT = TOP1_AVG_REVIEW_COUNT;
    return this;
  }
  private Long TOP1_MAX_REVIEW_COUNT;
  public Long get_TOP1_MAX_REVIEW_COUNT() {
    return TOP1_MAX_REVIEW_COUNT;
  }
  public void set_TOP1_MAX_REVIEW_COUNT(Long TOP1_MAX_REVIEW_COUNT) {
    this.TOP1_MAX_REVIEW_COUNT = TOP1_MAX_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP1_MAX_REVIEW_COUNT(Long TOP1_MAX_REVIEW_COUNT) {
    this.TOP1_MAX_REVIEW_COUNT = TOP1_MAX_REVIEW_COUNT;
    return this;
  }
  private String REVIEW_CHANNEL_NAME_TOP2;
  public String get_REVIEW_CHANNEL_NAME_TOP2() {
    return REVIEW_CHANNEL_NAME_TOP2;
  }
  public void set_REVIEW_CHANNEL_NAME_TOP2(String REVIEW_CHANNEL_NAME_TOP2) {
    this.REVIEW_CHANNEL_NAME_TOP2 = REVIEW_CHANNEL_NAME_TOP2;
  }
  public st_user_view_beh_m with_REVIEW_CHANNEL_NAME_TOP2(String REVIEW_CHANNEL_NAME_TOP2) {
    this.REVIEW_CHANNEL_NAME_TOP2 = REVIEW_CHANNEL_NAME_TOP2;
    return this;
  }
  private java.math.BigDecimal TOP2_AVG_REVIEW_COUNT;
  public java.math.BigDecimal get_TOP2_AVG_REVIEW_COUNT() {
    return TOP2_AVG_REVIEW_COUNT;
  }
  public void set_TOP2_AVG_REVIEW_COUNT(java.math.BigDecimal TOP2_AVG_REVIEW_COUNT) {
    this.TOP2_AVG_REVIEW_COUNT = TOP2_AVG_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP2_AVG_REVIEW_COUNT(java.math.BigDecimal TOP2_AVG_REVIEW_COUNT) {
    this.TOP2_AVG_REVIEW_COUNT = TOP2_AVG_REVIEW_COUNT;
    return this;
  }
  private Long TOP2_MAX_REVIEW_COUNT;
  public Long get_TOP2_MAX_REVIEW_COUNT() {
    return TOP2_MAX_REVIEW_COUNT;
  }
  public void set_TOP2_MAX_REVIEW_COUNT(Long TOP2_MAX_REVIEW_COUNT) {
    this.TOP2_MAX_REVIEW_COUNT = TOP2_MAX_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP2_MAX_REVIEW_COUNT(Long TOP2_MAX_REVIEW_COUNT) {
    this.TOP2_MAX_REVIEW_COUNT = TOP2_MAX_REVIEW_COUNT;
    return this;
  }
  private String REVIEW_CHANNEL_NAME_TOP3;
  public String get_REVIEW_CHANNEL_NAME_TOP3() {
    return REVIEW_CHANNEL_NAME_TOP3;
  }
  public void set_REVIEW_CHANNEL_NAME_TOP3(String REVIEW_CHANNEL_NAME_TOP3) {
    this.REVIEW_CHANNEL_NAME_TOP3 = REVIEW_CHANNEL_NAME_TOP3;
  }
  public st_user_view_beh_m with_REVIEW_CHANNEL_NAME_TOP3(String REVIEW_CHANNEL_NAME_TOP3) {
    this.REVIEW_CHANNEL_NAME_TOP3 = REVIEW_CHANNEL_NAME_TOP3;
    return this;
  }
  private java.math.BigDecimal TOP3_AVG_REVIEW_COUNT;
  public java.math.BigDecimal get_TOP3_AVG_REVIEW_COUNT() {
    return TOP3_AVG_REVIEW_COUNT;
  }
  public void set_TOP3_AVG_REVIEW_COUNT(java.math.BigDecimal TOP3_AVG_REVIEW_COUNT) {
    this.TOP3_AVG_REVIEW_COUNT = TOP3_AVG_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP3_AVG_REVIEW_COUNT(java.math.BigDecimal TOP3_AVG_REVIEW_COUNT) {
    this.TOP3_AVG_REVIEW_COUNT = TOP3_AVG_REVIEW_COUNT;
    return this;
  }
  private Long TOP3_MAX_REVIEW_COUNT;
  public Long get_TOP3_MAX_REVIEW_COUNT() {
    return TOP3_MAX_REVIEW_COUNT;
  }
  public void set_TOP3_MAX_REVIEW_COUNT(Long TOP3_MAX_REVIEW_COUNT) {
    this.TOP3_MAX_REVIEW_COUNT = TOP3_MAX_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP3_MAX_REVIEW_COUNT(Long TOP3_MAX_REVIEW_COUNT) {
    this.TOP3_MAX_REVIEW_COUNT = TOP3_MAX_REVIEW_COUNT;
    return this;
  }
  private String REVIEW_CHANNEL_NAME_TOP4;
  public String get_REVIEW_CHANNEL_NAME_TOP4() {
    return REVIEW_CHANNEL_NAME_TOP4;
  }
  public void set_REVIEW_CHANNEL_NAME_TOP4(String REVIEW_CHANNEL_NAME_TOP4) {
    this.REVIEW_CHANNEL_NAME_TOP4 = REVIEW_CHANNEL_NAME_TOP4;
  }
  public st_user_view_beh_m with_REVIEW_CHANNEL_NAME_TOP4(String REVIEW_CHANNEL_NAME_TOP4) {
    this.REVIEW_CHANNEL_NAME_TOP4 = REVIEW_CHANNEL_NAME_TOP4;
    return this;
  }
  private java.math.BigDecimal TOP4_AVG_REVIEW_COUNT;
  public java.math.BigDecimal get_TOP4_AVG_REVIEW_COUNT() {
    return TOP4_AVG_REVIEW_COUNT;
  }
  public void set_TOP4_AVG_REVIEW_COUNT(java.math.BigDecimal TOP4_AVG_REVIEW_COUNT) {
    this.TOP4_AVG_REVIEW_COUNT = TOP4_AVG_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP4_AVG_REVIEW_COUNT(java.math.BigDecimal TOP4_AVG_REVIEW_COUNT) {
    this.TOP4_AVG_REVIEW_COUNT = TOP4_AVG_REVIEW_COUNT;
    return this;
  }
  private Long TOP4_MAX_REVIEW_COUNT;
  public Long get_TOP4_MAX_REVIEW_COUNT() {
    return TOP4_MAX_REVIEW_COUNT;
  }
  public void set_TOP4_MAX_REVIEW_COUNT(Long TOP4_MAX_REVIEW_COUNT) {
    this.TOP4_MAX_REVIEW_COUNT = TOP4_MAX_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP4_MAX_REVIEW_COUNT(Long TOP4_MAX_REVIEW_COUNT) {
    this.TOP4_MAX_REVIEW_COUNT = TOP4_MAX_REVIEW_COUNT;
    return this;
  }
  private String REVIEW_CHANNEL_NAME_TOP5;
  public String get_REVIEW_CHANNEL_NAME_TOP5() {
    return REVIEW_CHANNEL_NAME_TOP5;
  }
  public void set_REVIEW_CHANNEL_NAME_TOP5(String REVIEW_CHANNEL_NAME_TOP5) {
    this.REVIEW_CHANNEL_NAME_TOP5 = REVIEW_CHANNEL_NAME_TOP5;
  }
  public st_user_view_beh_m with_REVIEW_CHANNEL_NAME_TOP5(String REVIEW_CHANNEL_NAME_TOP5) {
    this.REVIEW_CHANNEL_NAME_TOP5 = REVIEW_CHANNEL_NAME_TOP5;
    return this;
  }
  private java.math.BigDecimal TOP5_AVG_REVIEW_COUNT;
  public java.math.BigDecimal get_TOP5_AVG_REVIEW_COUNT() {
    return TOP5_AVG_REVIEW_COUNT;
  }
  public void set_TOP5_AVG_REVIEW_COUNT(java.math.BigDecimal TOP5_AVG_REVIEW_COUNT) {
    this.TOP5_AVG_REVIEW_COUNT = TOP5_AVG_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP5_AVG_REVIEW_COUNT(java.math.BigDecimal TOP5_AVG_REVIEW_COUNT) {
    this.TOP5_AVG_REVIEW_COUNT = TOP5_AVG_REVIEW_COUNT;
    return this;
  }
  private Long TOP5_MAX_REVIEW_COUNT;
  public Long get_TOP5_MAX_REVIEW_COUNT() {
    return TOP5_MAX_REVIEW_COUNT;
  }
  public void set_TOP5_MAX_REVIEW_COUNT(Long TOP5_MAX_REVIEW_COUNT) {
    this.TOP5_MAX_REVIEW_COUNT = TOP5_MAX_REVIEW_COUNT;
  }
  public st_user_view_beh_m with_TOP5_MAX_REVIEW_COUNT(Long TOP5_MAX_REVIEW_COUNT) {
    this.TOP5_MAX_REVIEW_COUNT = TOP5_MAX_REVIEW_COUNT;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT1;
  public Long get_HOLIDAY_REVIEW_COUNT1() {
    return HOLIDAY_REVIEW_COUNT1;
  }
  public void set_HOLIDAY_REVIEW_COUNT1(Long HOLIDAY_REVIEW_COUNT1) {
    this.HOLIDAY_REVIEW_COUNT1 = HOLIDAY_REVIEW_COUNT1;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT1(Long HOLIDAY_REVIEW_COUNT1) {
    this.HOLIDAY_REVIEW_COUNT1 = HOLIDAY_REVIEW_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT1;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT1() {
    return AVG_HOLIDAY_REVIEW_COUNT1;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT1(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT1) {
    this.AVG_HOLIDAY_REVIEW_COUNT1 = AVG_HOLIDAY_REVIEW_COUNT1;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT1(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT1) {
    this.AVG_HOLIDAY_REVIEW_COUNT1 = AVG_HOLIDAY_REVIEW_COUNT1;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT2;
  public Long get_HOLIDAY_REVIEW_COUNT2() {
    return HOLIDAY_REVIEW_COUNT2;
  }
  public void set_HOLIDAY_REVIEW_COUNT2(Long HOLIDAY_REVIEW_COUNT2) {
    this.HOLIDAY_REVIEW_COUNT2 = HOLIDAY_REVIEW_COUNT2;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT2(Long HOLIDAY_REVIEW_COUNT2) {
    this.HOLIDAY_REVIEW_COUNT2 = HOLIDAY_REVIEW_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT2;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT2() {
    return AVG_HOLIDAY_REVIEW_COUNT2;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT2(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT2) {
    this.AVG_HOLIDAY_REVIEW_COUNT2 = AVG_HOLIDAY_REVIEW_COUNT2;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT2(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT2) {
    this.AVG_HOLIDAY_REVIEW_COUNT2 = AVG_HOLIDAY_REVIEW_COUNT2;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT3;
  public Long get_HOLIDAY_REVIEW_COUNT3() {
    return HOLIDAY_REVIEW_COUNT3;
  }
  public void set_HOLIDAY_REVIEW_COUNT3(Long HOLIDAY_REVIEW_COUNT3) {
    this.HOLIDAY_REVIEW_COUNT3 = HOLIDAY_REVIEW_COUNT3;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT3(Long HOLIDAY_REVIEW_COUNT3) {
    this.HOLIDAY_REVIEW_COUNT3 = HOLIDAY_REVIEW_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT3;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT3() {
    return AVG_HOLIDAY_REVIEW_COUNT3;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT3(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT3) {
    this.AVG_HOLIDAY_REVIEW_COUNT3 = AVG_HOLIDAY_REVIEW_COUNT3;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT3(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT3) {
    this.AVG_HOLIDAY_REVIEW_COUNT3 = AVG_HOLIDAY_REVIEW_COUNT3;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT4;
  public Long get_HOLIDAY_REVIEW_COUNT4() {
    return HOLIDAY_REVIEW_COUNT4;
  }
  public void set_HOLIDAY_REVIEW_COUNT4(Long HOLIDAY_REVIEW_COUNT4) {
    this.HOLIDAY_REVIEW_COUNT4 = HOLIDAY_REVIEW_COUNT4;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT4(Long HOLIDAY_REVIEW_COUNT4) {
    this.HOLIDAY_REVIEW_COUNT4 = HOLIDAY_REVIEW_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT4;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT4() {
    return AVG_HOLIDAY_REVIEW_COUNT4;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT4(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT4) {
    this.AVG_HOLIDAY_REVIEW_COUNT4 = AVG_HOLIDAY_REVIEW_COUNT4;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT4(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT4) {
    this.AVG_HOLIDAY_REVIEW_COUNT4 = AVG_HOLIDAY_REVIEW_COUNT4;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT5;
  public Long get_HOLIDAY_REVIEW_COUNT5() {
    return HOLIDAY_REVIEW_COUNT5;
  }
  public void set_HOLIDAY_REVIEW_COUNT5(Long HOLIDAY_REVIEW_COUNT5) {
    this.HOLIDAY_REVIEW_COUNT5 = HOLIDAY_REVIEW_COUNT5;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT5(Long HOLIDAY_REVIEW_COUNT5) {
    this.HOLIDAY_REVIEW_COUNT5 = HOLIDAY_REVIEW_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT5;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT5() {
    return AVG_HOLIDAY_REVIEW_COUNT5;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT5(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT5) {
    this.AVG_HOLIDAY_REVIEW_COUNT5 = AVG_HOLIDAY_REVIEW_COUNT5;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT5(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT5) {
    this.AVG_HOLIDAY_REVIEW_COUNT5 = AVG_HOLIDAY_REVIEW_COUNT5;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT6;
  public Long get_HOLIDAY_REVIEW_COUNT6() {
    return HOLIDAY_REVIEW_COUNT6;
  }
  public void set_HOLIDAY_REVIEW_COUNT6(Long HOLIDAY_REVIEW_COUNT6) {
    this.HOLIDAY_REVIEW_COUNT6 = HOLIDAY_REVIEW_COUNT6;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT6(Long HOLIDAY_REVIEW_COUNT6) {
    this.HOLIDAY_REVIEW_COUNT6 = HOLIDAY_REVIEW_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT6;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT6() {
    return AVG_HOLIDAY_REVIEW_COUNT6;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT6(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT6) {
    this.AVG_HOLIDAY_REVIEW_COUNT6 = AVG_HOLIDAY_REVIEW_COUNT6;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT6(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT6) {
    this.AVG_HOLIDAY_REVIEW_COUNT6 = AVG_HOLIDAY_REVIEW_COUNT6;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT7;
  public Long get_HOLIDAY_REVIEW_COUNT7() {
    return HOLIDAY_REVIEW_COUNT7;
  }
  public void set_HOLIDAY_REVIEW_COUNT7(Long HOLIDAY_REVIEW_COUNT7) {
    this.HOLIDAY_REVIEW_COUNT7 = HOLIDAY_REVIEW_COUNT7;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT7(Long HOLIDAY_REVIEW_COUNT7) {
    this.HOLIDAY_REVIEW_COUNT7 = HOLIDAY_REVIEW_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT7;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT7() {
    return AVG_HOLIDAY_REVIEW_COUNT7;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT7(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT7) {
    this.AVG_HOLIDAY_REVIEW_COUNT7 = AVG_HOLIDAY_REVIEW_COUNT7;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT7(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT7) {
    this.AVG_HOLIDAY_REVIEW_COUNT7 = AVG_HOLIDAY_REVIEW_COUNT7;
    return this;
  }
  private Long HOLIDAY_REVIEW_COUNT8;
  public Long get_HOLIDAY_REVIEW_COUNT8() {
    return HOLIDAY_REVIEW_COUNT8;
  }
  public void set_HOLIDAY_REVIEW_COUNT8(Long HOLIDAY_REVIEW_COUNT8) {
    this.HOLIDAY_REVIEW_COUNT8 = HOLIDAY_REVIEW_COUNT8;
  }
  public st_user_view_beh_m with_HOLIDAY_REVIEW_COUNT8(Long HOLIDAY_REVIEW_COUNT8) {
    this.HOLIDAY_REVIEW_COUNT8 = HOLIDAY_REVIEW_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT8;
  public java.math.BigDecimal get_AVG_HOLIDAY_REVIEW_COUNT8() {
    return AVG_HOLIDAY_REVIEW_COUNT8;
  }
  public void set_AVG_HOLIDAY_REVIEW_COUNT8(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT8) {
    this.AVG_HOLIDAY_REVIEW_COUNT8 = AVG_HOLIDAY_REVIEW_COUNT8;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_REVIEW_COUNT8(java.math.BigDecimal AVG_HOLIDAY_REVIEW_COUNT8) {
    this.AVG_HOLIDAY_REVIEW_COUNT8 = AVG_HOLIDAY_REVIEW_COUNT8;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT1;
  public Long get_NHOLIDAY_REVIEW_COUNT1() {
    return NHOLIDAY_REVIEW_COUNT1;
  }
  public void set_NHOLIDAY_REVIEW_COUNT1(Long NHOLIDAY_REVIEW_COUNT1) {
    this.NHOLIDAY_REVIEW_COUNT1 = NHOLIDAY_REVIEW_COUNT1;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT1(Long NHOLIDAY_REVIEW_COUNT1) {
    this.NHOLIDAY_REVIEW_COUNT1 = NHOLIDAY_REVIEW_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT1;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT1() {
    return AVG_NHOLIDAY_REVIEW_COUNT1;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT1(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT1) {
    this.AVG_NHOLIDAY_REVIEW_COUNT1 = AVG_NHOLIDAY_REVIEW_COUNT1;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT1(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT1) {
    this.AVG_NHOLIDAY_REVIEW_COUNT1 = AVG_NHOLIDAY_REVIEW_COUNT1;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT2;
  public Long get_NHOLIDAY_REVIEW_COUNT2() {
    return NHOLIDAY_REVIEW_COUNT2;
  }
  public void set_NHOLIDAY_REVIEW_COUNT2(Long NHOLIDAY_REVIEW_COUNT2) {
    this.NHOLIDAY_REVIEW_COUNT2 = NHOLIDAY_REVIEW_COUNT2;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT2(Long NHOLIDAY_REVIEW_COUNT2) {
    this.NHOLIDAY_REVIEW_COUNT2 = NHOLIDAY_REVIEW_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT2;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT2() {
    return AVG_NHOLIDAY_REVIEW_COUNT2;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT2(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT2) {
    this.AVG_NHOLIDAY_REVIEW_COUNT2 = AVG_NHOLIDAY_REVIEW_COUNT2;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT2(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT2) {
    this.AVG_NHOLIDAY_REVIEW_COUNT2 = AVG_NHOLIDAY_REVIEW_COUNT2;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT3;
  public Long get_NHOLIDAY_REVIEW_COUNT3() {
    return NHOLIDAY_REVIEW_COUNT3;
  }
  public void set_NHOLIDAY_REVIEW_COUNT3(Long NHOLIDAY_REVIEW_COUNT3) {
    this.NHOLIDAY_REVIEW_COUNT3 = NHOLIDAY_REVIEW_COUNT3;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT3(Long NHOLIDAY_REVIEW_COUNT3) {
    this.NHOLIDAY_REVIEW_COUNT3 = NHOLIDAY_REVIEW_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT3;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT3() {
    return AVG_NHOLIDAY_REVIEW_COUNT3;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT3(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT3) {
    this.AVG_NHOLIDAY_REVIEW_COUNT3 = AVG_NHOLIDAY_REVIEW_COUNT3;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT3(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT3) {
    this.AVG_NHOLIDAY_REVIEW_COUNT3 = AVG_NHOLIDAY_REVIEW_COUNT3;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT4;
  public Long get_NHOLIDAY_REVIEW_COUNT4() {
    return NHOLIDAY_REVIEW_COUNT4;
  }
  public void set_NHOLIDAY_REVIEW_COUNT4(Long NHOLIDAY_REVIEW_COUNT4) {
    this.NHOLIDAY_REVIEW_COUNT4 = NHOLIDAY_REVIEW_COUNT4;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT4(Long NHOLIDAY_REVIEW_COUNT4) {
    this.NHOLIDAY_REVIEW_COUNT4 = NHOLIDAY_REVIEW_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT4;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT4() {
    return AVG_NHOLIDAY_REVIEW_COUNT4;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT4(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT4) {
    this.AVG_NHOLIDAY_REVIEW_COUNT4 = AVG_NHOLIDAY_REVIEW_COUNT4;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT4(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT4) {
    this.AVG_NHOLIDAY_REVIEW_COUNT4 = AVG_NHOLIDAY_REVIEW_COUNT4;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT5;
  public Long get_NHOLIDAY_REVIEW_COUNT5() {
    return NHOLIDAY_REVIEW_COUNT5;
  }
  public void set_NHOLIDAY_REVIEW_COUNT5(Long NHOLIDAY_REVIEW_COUNT5) {
    this.NHOLIDAY_REVIEW_COUNT5 = NHOLIDAY_REVIEW_COUNT5;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT5(Long NHOLIDAY_REVIEW_COUNT5) {
    this.NHOLIDAY_REVIEW_COUNT5 = NHOLIDAY_REVIEW_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT5;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT5() {
    return AVG_NHOLIDAY_REVIEW_COUNT5;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT5(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT5) {
    this.AVG_NHOLIDAY_REVIEW_COUNT5 = AVG_NHOLIDAY_REVIEW_COUNT5;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT5(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT5) {
    this.AVG_NHOLIDAY_REVIEW_COUNT5 = AVG_NHOLIDAY_REVIEW_COUNT5;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT6;
  public Long get_NHOLIDAY_REVIEW_COUNT6() {
    return NHOLIDAY_REVIEW_COUNT6;
  }
  public void set_NHOLIDAY_REVIEW_COUNT6(Long NHOLIDAY_REVIEW_COUNT6) {
    this.NHOLIDAY_REVIEW_COUNT6 = NHOLIDAY_REVIEW_COUNT6;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT6(Long NHOLIDAY_REVIEW_COUNT6) {
    this.NHOLIDAY_REVIEW_COUNT6 = NHOLIDAY_REVIEW_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT6;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT6() {
    return AVG_NHOLIDAY_REVIEW_COUNT6;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT6(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT6) {
    this.AVG_NHOLIDAY_REVIEW_COUNT6 = AVG_NHOLIDAY_REVIEW_COUNT6;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT6(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT6) {
    this.AVG_NHOLIDAY_REVIEW_COUNT6 = AVG_NHOLIDAY_REVIEW_COUNT6;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT7;
  public Long get_NHOLIDAY_REVIEW_COUNT7() {
    return NHOLIDAY_REVIEW_COUNT7;
  }
  public void set_NHOLIDAY_REVIEW_COUNT7(Long NHOLIDAY_REVIEW_COUNT7) {
    this.NHOLIDAY_REVIEW_COUNT7 = NHOLIDAY_REVIEW_COUNT7;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT7(Long NHOLIDAY_REVIEW_COUNT7) {
    this.NHOLIDAY_REVIEW_COUNT7 = NHOLIDAY_REVIEW_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT7;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT7() {
    return AVG_NHOLIDAY_REVIEW_COUNT7;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT7(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT7) {
    this.AVG_NHOLIDAY_REVIEW_COUNT7 = AVG_NHOLIDAY_REVIEW_COUNT7;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT7(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT7) {
    this.AVG_NHOLIDAY_REVIEW_COUNT7 = AVG_NHOLIDAY_REVIEW_COUNT7;
    return this;
  }
  private Long NHOLIDAY_REVIEW_COUNT8;
  public Long get_NHOLIDAY_REVIEW_COUNT8() {
    return NHOLIDAY_REVIEW_COUNT8;
  }
  public void set_NHOLIDAY_REVIEW_COUNT8(Long NHOLIDAY_REVIEW_COUNT8) {
    this.NHOLIDAY_REVIEW_COUNT8 = NHOLIDAY_REVIEW_COUNT8;
  }
  public st_user_view_beh_m with_NHOLIDAY_REVIEW_COUNT8(Long NHOLIDAY_REVIEW_COUNT8) {
    this.NHOLIDAY_REVIEW_COUNT8 = NHOLIDAY_REVIEW_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT8;
  public java.math.BigDecimal get_AVG_NHOLIDAY_REVIEW_COUNT8() {
    return AVG_NHOLIDAY_REVIEW_COUNT8;
  }
  public void set_AVG_NHOLIDAY_REVIEW_COUNT8(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT8) {
    this.AVG_NHOLIDAY_REVIEW_COUNT8 = AVG_NHOLIDAY_REVIEW_COUNT8;
  }
  public st_user_view_beh_m with_AVG_NHOLIDAY_REVIEW_COUNT8(java.math.BigDecimal AVG_NHOLIDAY_REVIEW_COUNT8) {
    this.AVG_NHOLIDAY_REVIEW_COUNT8 = AVG_NHOLIDAY_REVIEW_COUNT8;
    return this;
  }
  private Long VOD_USER_COUNT;
  public Long get_VOD_USER_COUNT() {
    return VOD_USER_COUNT;
  }
  public void set_VOD_USER_COUNT(Long VOD_USER_COUNT) {
    this.VOD_USER_COUNT = VOD_USER_COUNT;
  }
  public st_user_view_beh_m with_VOD_USER_COUNT(Long VOD_USER_COUNT) {
    this.VOD_USER_COUNT = VOD_USER_COUNT;
    return this;
  }
  private Long NO_VOD_USER_COUNT;
  public Long get_NO_VOD_USER_COUNT() {
    return NO_VOD_USER_COUNT;
  }
  public void set_NO_VOD_USER_COUNT(Long NO_VOD_USER_COUNT) {
    this.NO_VOD_USER_COUNT = NO_VOD_USER_COUNT;
  }
  public st_user_view_beh_m with_NO_VOD_USER_COUNT(Long NO_VOD_USER_COUNT) {
    this.NO_VOD_USER_COUNT = NO_VOD_USER_COUNT;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT1;
  public Long get_HOLIDAY_VOD_COUNT1() {
    return HOLIDAY_VOD_COUNT1;
  }
  public void set_HOLIDAY_VOD_COUNT1(Long HOLIDAY_VOD_COUNT1) {
    this.HOLIDAY_VOD_COUNT1 = HOLIDAY_VOD_COUNT1;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT1(Long HOLIDAY_VOD_COUNT1) {
    this.HOLIDAY_VOD_COUNT1 = HOLIDAY_VOD_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT1;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT1() {
    return AVG_HOLIDAY_VOD_COUNT1;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT1(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT1) {
    this.AVG_HOLIDAY_VOD_COUNT1 = AVG_HOLIDAY_VOD_COUNT1;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT1(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT1) {
    this.AVG_HOLIDAY_VOD_COUNT1 = AVG_HOLIDAY_VOD_COUNT1;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT2;
  public Long get_HOLIDAY_VOD_COUNT2() {
    return HOLIDAY_VOD_COUNT2;
  }
  public void set_HOLIDAY_VOD_COUNT2(Long HOLIDAY_VOD_COUNT2) {
    this.HOLIDAY_VOD_COUNT2 = HOLIDAY_VOD_COUNT2;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT2(Long HOLIDAY_VOD_COUNT2) {
    this.HOLIDAY_VOD_COUNT2 = HOLIDAY_VOD_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT2;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT2() {
    return AVG_HOLIDAY_VOD_COUNT2;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT2(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT2) {
    this.AVG_HOLIDAY_VOD_COUNT2 = AVG_HOLIDAY_VOD_COUNT2;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT2(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT2) {
    this.AVG_HOLIDAY_VOD_COUNT2 = AVG_HOLIDAY_VOD_COUNT2;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT3;
  public Long get_HOLIDAY_VOD_COUNT3() {
    return HOLIDAY_VOD_COUNT3;
  }
  public void set_HOLIDAY_VOD_COUNT3(Long HOLIDAY_VOD_COUNT3) {
    this.HOLIDAY_VOD_COUNT3 = HOLIDAY_VOD_COUNT3;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT3(Long HOLIDAY_VOD_COUNT3) {
    this.HOLIDAY_VOD_COUNT3 = HOLIDAY_VOD_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT3;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT3() {
    return AVG_HOLIDAY_VOD_COUNT3;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT3(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT3) {
    this.AVG_HOLIDAY_VOD_COUNT3 = AVG_HOLIDAY_VOD_COUNT3;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT3(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT3) {
    this.AVG_HOLIDAY_VOD_COUNT3 = AVG_HOLIDAY_VOD_COUNT3;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT4;
  public Long get_HOLIDAY_VOD_COUNT4() {
    return HOLIDAY_VOD_COUNT4;
  }
  public void set_HOLIDAY_VOD_COUNT4(Long HOLIDAY_VOD_COUNT4) {
    this.HOLIDAY_VOD_COUNT4 = HOLIDAY_VOD_COUNT4;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT4(Long HOLIDAY_VOD_COUNT4) {
    this.HOLIDAY_VOD_COUNT4 = HOLIDAY_VOD_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT4;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT4() {
    return AVG_HOLIDAY_VOD_COUNT4;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT4(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT4) {
    this.AVG_HOLIDAY_VOD_COUNT4 = AVG_HOLIDAY_VOD_COUNT4;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT4(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT4) {
    this.AVG_HOLIDAY_VOD_COUNT4 = AVG_HOLIDAY_VOD_COUNT4;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT5;
  public Long get_HOLIDAY_VOD_COUNT5() {
    return HOLIDAY_VOD_COUNT5;
  }
  public void set_HOLIDAY_VOD_COUNT5(Long HOLIDAY_VOD_COUNT5) {
    this.HOLIDAY_VOD_COUNT5 = HOLIDAY_VOD_COUNT5;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT5(Long HOLIDAY_VOD_COUNT5) {
    this.HOLIDAY_VOD_COUNT5 = HOLIDAY_VOD_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT5;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT5() {
    return AVG_HOLIDAY_VOD_COUNT5;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT5(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT5) {
    this.AVG_HOLIDAY_VOD_COUNT5 = AVG_HOLIDAY_VOD_COUNT5;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT5(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT5) {
    this.AVG_HOLIDAY_VOD_COUNT5 = AVG_HOLIDAY_VOD_COUNT5;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT6;
  public Long get_HOLIDAY_VOD_COUNT6() {
    return HOLIDAY_VOD_COUNT6;
  }
  public void set_HOLIDAY_VOD_COUNT6(Long HOLIDAY_VOD_COUNT6) {
    this.HOLIDAY_VOD_COUNT6 = HOLIDAY_VOD_COUNT6;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT6(Long HOLIDAY_VOD_COUNT6) {
    this.HOLIDAY_VOD_COUNT6 = HOLIDAY_VOD_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT6;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT6() {
    return AVG_HOLIDAY_VOD_COUNT6;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT6(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT6) {
    this.AVG_HOLIDAY_VOD_COUNT6 = AVG_HOLIDAY_VOD_COUNT6;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT6(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT6) {
    this.AVG_HOLIDAY_VOD_COUNT6 = AVG_HOLIDAY_VOD_COUNT6;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT7;
  public Long get_HOLIDAY_VOD_COUNT7() {
    return HOLIDAY_VOD_COUNT7;
  }
  public void set_HOLIDAY_VOD_COUNT7(Long HOLIDAY_VOD_COUNT7) {
    this.HOLIDAY_VOD_COUNT7 = HOLIDAY_VOD_COUNT7;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT7(Long HOLIDAY_VOD_COUNT7) {
    this.HOLIDAY_VOD_COUNT7 = HOLIDAY_VOD_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT7;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT7() {
    return AVG_HOLIDAY_VOD_COUNT7;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT7(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT7) {
    this.AVG_HOLIDAY_VOD_COUNT7 = AVG_HOLIDAY_VOD_COUNT7;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT7(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT7) {
    this.AVG_HOLIDAY_VOD_COUNT7 = AVG_HOLIDAY_VOD_COUNT7;
    return this;
  }
  private Long HOLIDAY_VOD_COUNT8;
  public Long get_HOLIDAY_VOD_COUNT8() {
    return HOLIDAY_VOD_COUNT8;
  }
  public void set_HOLIDAY_VOD_COUNT8(Long HOLIDAY_VOD_COUNT8) {
    this.HOLIDAY_VOD_COUNT8 = HOLIDAY_VOD_COUNT8;
  }
  public st_user_view_beh_m with_HOLIDAY_VOD_COUNT8(Long HOLIDAY_VOD_COUNT8) {
    this.HOLIDAY_VOD_COUNT8 = HOLIDAY_VOD_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT8;
  public java.math.BigDecimal get_AVG_HOLIDAY_VOD_COUNT8() {
    return AVG_HOLIDAY_VOD_COUNT8;
  }
  public void set_AVG_HOLIDAY_VOD_COUNT8(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT8) {
    this.AVG_HOLIDAY_VOD_COUNT8 = AVG_HOLIDAY_VOD_COUNT8;
  }
  public st_user_view_beh_m with_AVG_HOLIDAY_VOD_COUNT8(java.math.BigDecimal AVG_HOLIDAY_VOD_COUNT8) {
    this.AVG_HOLIDAY_VOD_COUNT8 = AVG_HOLIDAY_VOD_COUNT8;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT1;
  public Long get_NO_HOLIDAY_VOD_COUNT1() {
    return NO_HOLIDAY_VOD_COUNT1;
  }
  public void set_NO_HOLIDAY_VOD_COUNT1(Long NO_HOLIDAY_VOD_COUNT1) {
    this.NO_HOLIDAY_VOD_COUNT1 = NO_HOLIDAY_VOD_COUNT1;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT1(Long NO_HOLIDAY_VOD_COUNT1) {
    this.NO_HOLIDAY_VOD_COUNT1 = NO_HOLIDAY_VOD_COUNT1;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT1;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT1() {
    return AVG_NO_HOLIDAY_VOD_COUNT1;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT1(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT1) {
    this.AVG_NO_HOLIDAY_VOD_COUNT1 = AVG_NO_HOLIDAY_VOD_COUNT1;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT1(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT1) {
    this.AVG_NO_HOLIDAY_VOD_COUNT1 = AVG_NO_HOLIDAY_VOD_COUNT1;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT2;
  public Long get_NO_HOLIDAY_VOD_COUNT2() {
    return NO_HOLIDAY_VOD_COUNT2;
  }
  public void set_NO_HOLIDAY_VOD_COUNT2(Long NO_HOLIDAY_VOD_COUNT2) {
    this.NO_HOLIDAY_VOD_COUNT2 = NO_HOLIDAY_VOD_COUNT2;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT2(Long NO_HOLIDAY_VOD_COUNT2) {
    this.NO_HOLIDAY_VOD_COUNT2 = NO_HOLIDAY_VOD_COUNT2;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT2;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT2() {
    return AVG_NO_HOLIDAY_VOD_COUNT2;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT2(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT2) {
    this.AVG_NO_HOLIDAY_VOD_COUNT2 = AVG_NO_HOLIDAY_VOD_COUNT2;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT2(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT2) {
    this.AVG_NO_HOLIDAY_VOD_COUNT2 = AVG_NO_HOLIDAY_VOD_COUNT2;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT3;
  public Long get_NO_HOLIDAY_VOD_COUNT3() {
    return NO_HOLIDAY_VOD_COUNT3;
  }
  public void set_NO_HOLIDAY_VOD_COUNT3(Long NO_HOLIDAY_VOD_COUNT3) {
    this.NO_HOLIDAY_VOD_COUNT3 = NO_HOLIDAY_VOD_COUNT3;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT3(Long NO_HOLIDAY_VOD_COUNT3) {
    this.NO_HOLIDAY_VOD_COUNT3 = NO_HOLIDAY_VOD_COUNT3;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT3;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT3() {
    return AVG_NO_HOLIDAY_VOD_COUNT3;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT3(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT3) {
    this.AVG_NO_HOLIDAY_VOD_COUNT3 = AVG_NO_HOLIDAY_VOD_COUNT3;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT3(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT3) {
    this.AVG_NO_HOLIDAY_VOD_COUNT3 = AVG_NO_HOLIDAY_VOD_COUNT3;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT4;
  public Long get_NO_HOLIDAY_VOD_COUNT4() {
    return NO_HOLIDAY_VOD_COUNT4;
  }
  public void set_NO_HOLIDAY_VOD_COUNT4(Long NO_HOLIDAY_VOD_COUNT4) {
    this.NO_HOLIDAY_VOD_COUNT4 = NO_HOLIDAY_VOD_COUNT4;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT4(Long NO_HOLIDAY_VOD_COUNT4) {
    this.NO_HOLIDAY_VOD_COUNT4 = NO_HOLIDAY_VOD_COUNT4;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT4;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT4() {
    return AVG_NO_HOLIDAY_VOD_COUNT4;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT4(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT4) {
    this.AVG_NO_HOLIDAY_VOD_COUNT4 = AVG_NO_HOLIDAY_VOD_COUNT4;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT4(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT4) {
    this.AVG_NO_HOLIDAY_VOD_COUNT4 = AVG_NO_HOLIDAY_VOD_COUNT4;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT5;
  public Long get_NO_HOLIDAY_VOD_COUNT5() {
    return NO_HOLIDAY_VOD_COUNT5;
  }
  public void set_NO_HOLIDAY_VOD_COUNT5(Long NO_HOLIDAY_VOD_COUNT5) {
    this.NO_HOLIDAY_VOD_COUNT5 = NO_HOLIDAY_VOD_COUNT5;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT5(Long NO_HOLIDAY_VOD_COUNT5) {
    this.NO_HOLIDAY_VOD_COUNT5 = NO_HOLIDAY_VOD_COUNT5;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT5;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT5() {
    return AVG_NO_HOLIDAY_VOD_COUNT5;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT5(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT5) {
    this.AVG_NO_HOLIDAY_VOD_COUNT5 = AVG_NO_HOLIDAY_VOD_COUNT5;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT5(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT5) {
    this.AVG_NO_HOLIDAY_VOD_COUNT5 = AVG_NO_HOLIDAY_VOD_COUNT5;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT6;
  public Long get_NO_HOLIDAY_VOD_COUNT6() {
    return NO_HOLIDAY_VOD_COUNT6;
  }
  public void set_NO_HOLIDAY_VOD_COUNT6(Long NO_HOLIDAY_VOD_COUNT6) {
    this.NO_HOLIDAY_VOD_COUNT6 = NO_HOLIDAY_VOD_COUNT6;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT6(Long NO_HOLIDAY_VOD_COUNT6) {
    this.NO_HOLIDAY_VOD_COUNT6 = NO_HOLIDAY_VOD_COUNT6;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT6;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT6() {
    return AVG_NO_HOLIDAY_VOD_COUNT6;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT6(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT6) {
    this.AVG_NO_HOLIDAY_VOD_COUNT6 = AVG_NO_HOLIDAY_VOD_COUNT6;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT6(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT6) {
    this.AVG_NO_HOLIDAY_VOD_COUNT6 = AVG_NO_HOLIDAY_VOD_COUNT6;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT7;
  public Long get_NO_HOLIDAY_VOD_COUNT7() {
    return NO_HOLIDAY_VOD_COUNT7;
  }
  public void set_NO_HOLIDAY_VOD_COUNT7(Long NO_HOLIDAY_VOD_COUNT7) {
    this.NO_HOLIDAY_VOD_COUNT7 = NO_HOLIDAY_VOD_COUNT7;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT7(Long NO_HOLIDAY_VOD_COUNT7) {
    this.NO_HOLIDAY_VOD_COUNT7 = NO_HOLIDAY_VOD_COUNT7;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT7;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT7() {
    return AVG_NO_HOLIDAY_VOD_COUNT7;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT7(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT7) {
    this.AVG_NO_HOLIDAY_VOD_COUNT7 = AVG_NO_HOLIDAY_VOD_COUNT7;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT7(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT7) {
    this.AVG_NO_HOLIDAY_VOD_COUNT7 = AVG_NO_HOLIDAY_VOD_COUNT7;
    return this;
  }
  private Long NO_HOLIDAY_VOD_COUNT8;
  public Long get_NO_HOLIDAY_VOD_COUNT8() {
    return NO_HOLIDAY_VOD_COUNT8;
  }
  public void set_NO_HOLIDAY_VOD_COUNT8(Long NO_HOLIDAY_VOD_COUNT8) {
    this.NO_HOLIDAY_VOD_COUNT8 = NO_HOLIDAY_VOD_COUNT8;
  }
  public st_user_view_beh_m with_NO_HOLIDAY_VOD_COUNT8(Long NO_HOLIDAY_VOD_COUNT8) {
    this.NO_HOLIDAY_VOD_COUNT8 = NO_HOLIDAY_VOD_COUNT8;
    return this;
  }
  private java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT8;
  public java.math.BigDecimal get_AVG_NO_HOLIDAY_VOD_COUNT8() {
    return AVG_NO_HOLIDAY_VOD_COUNT8;
  }
  public void set_AVG_NO_HOLIDAY_VOD_COUNT8(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT8) {
    this.AVG_NO_HOLIDAY_VOD_COUNT8 = AVG_NO_HOLIDAY_VOD_COUNT8;
  }
  public st_user_view_beh_m with_AVG_NO_HOLIDAY_VOD_COUNT8(java.math.BigDecimal AVG_NO_HOLIDAY_VOD_COUNT8) {
    this.AVG_NO_HOLIDAY_VOD_COUNT8 = AVG_NO_HOLIDAY_VOD_COUNT8;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_user_view_beh_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_user_view_beh_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_view_beh_m)) {
      return false;
    }
    st_user_view_beh_m that = (st_user_view_beh_m) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.NO_TV_USER_COUNT == null ? that.NO_TV_USER_COUNT == null : this.NO_TV_USER_COUNT.equals(that.NO_TV_USER_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP1 == null ? that.TV_CHANNEL_NAME_TOP1 == null : this.TV_CHANNEL_NAME_TOP1.equals(that.TV_CHANNEL_NAME_TOP1));
    equal = equal && (this.TOP1_AVG_TV_COUNT == null ? that.TOP1_AVG_TV_COUNT == null : this.TOP1_AVG_TV_COUNT.equals(that.TOP1_AVG_TV_COUNT));
    equal = equal && (this.TOP1_MAX_TV_COUNT == null ? that.TOP1_MAX_TV_COUNT == null : this.TOP1_MAX_TV_COUNT.equals(that.TOP1_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP2 == null ? that.TV_CHANNEL_NAME_TOP2 == null : this.TV_CHANNEL_NAME_TOP2.equals(that.TV_CHANNEL_NAME_TOP2));
    equal = equal && (this.TOP2_AVG_TV_COUNT == null ? that.TOP2_AVG_TV_COUNT == null : this.TOP2_AVG_TV_COUNT.equals(that.TOP2_AVG_TV_COUNT));
    equal = equal && (this.TOP2_MAX_TV_COUNT == null ? that.TOP2_MAX_TV_COUNT == null : this.TOP2_MAX_TV_COUNT.equals(that.TOP2_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP3 == null ? that.TV_CHANNEL_NAME_TOP3 == null : this.TV_CHANNEL_NAME_TOP3.equals(that.TV_CHANNEL_NAME_TOP3));
    equal = equal && (this.TOP3_AVG_TV_COUNT == null ? that.TOP3_AVG_TV_COUNT == null : this.TOP3_AVG_TV_COUNT.equals(that.TOP3_AVG_TV_COUNT));
    equal = equal && (this.TOP3_MAX_TV_COUNT == null ? that.TOP3_MAX_TV_COUNT == null : this.TOP3_MAX_TV_COUNT.equals(that.TOP3_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP4 == null ? that.TV_CHANNEL_NAME_TOP4 == null : this.TV_CHANNEL_NAME_TOP4.equals(that.TV_CHANNEL_NAME_TOP4));
    equal = equal && (this.TOP4_AVG_TV_COUNT == null ? that.TOP4_AVG_TV_COUNT == null : this.TOP4_AVG_TV_COUNT.equals(that.TOP4_AVG_TV_COUNT));
    equal = equal && (this.TOP4_MAX_TV_COUNT == null ? that.TOP4_MAX_TV_COUNT == null : this.TOP4_MAX_TV_COUNT.equals(that.TOP4_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP5 == null ? that.TV_CHANNEL_NAME_TOP5 == null : this.TV_CHANNEL_NAME_TOP5.equals(that.TV_CHANNEL_NAME_TOP5));
    equal = equal && (this.TOP5_AVG_TV_COUNT == null ? that.TOP5_AVG_TV_COUNT == null : this.TOP5_AVG_TV_COUNT.equals(that.TOP5_AVG_TV_COUNT));
    equal = equal && (this.TOP5_MAX_TV_COUNT == null ? that.TOP5_MAX_TV_COUNT == null : this.TOP5_MAX_TV_COUNT.equals(that.TOP5_MAX_TV_COUNT));
    equal = equal && (this.HOLIDAY_TV_COUNT1 == null ? that.HOLIDAY_TV_COUNT1 == null : this.HOLIDAY_TV_COUNT1.equals(that.HOLIDAY_TV_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT1 == null ? that.AVG_HOLIDAY_TV_COUNT1 == null : this.AVG_HOLIDAY_TV_COUNT1.equals(that.AVG_HOLIDAY_TV_COUNT1));
    equal = equal && (this.HOLIDAY_TV_COUNT2 == null ? that.HOLIDAY_TV_COUNT2 == null : this.HOLIDAY_TV_COUNT2.equals(that.HOLIDAY_TV_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT2 == null ? that.AVG_HOLIDAY_TV_COUNT2 == null : this.AVG_HOLIDAY_TV_COUNT2.equals(that.AVG_HOLIDAY_TV_COUNT2));
    equal = equal && (this.HOLIDAY_TV_COUNT3 == null ? that.HOLIDAY_TV_COUNT3 == null : this.HOLIDAY_TV_COUNT3.equals(that.HOLIDAY_TV_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT3 == null ? that.AVG_HOLIDAY_TV_COUNT3 == null : this.AVG_HOLIDAY_TV_COUNT3.equals(that.AVG_HOLIDAY_TV_COUNT3));
    equal = equal && (this.HOLIDAY_TV_COUNT4 == null ? that.HOLIDAY_TV_COUNT4 == null : this.HOLIDAY_TV_COUNT4.equals(that.HOLIDAY_TV_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT4 == null ? that.AVG_HOLIDAY_TV_COUNT4 == null : this.AVG_HOLIDAY_TV_COUNT4.equals(that.AVG_HOLIDAY_TV_COUNT4));
    equal = equal && (this.HOLIDAY_TV_COUNT5 == null ? that.HOLIDAY_TV_COUNT5 == null : this.HOLIDAY_TV_COUNT5.equals(that.HOLIDAY_TV_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT5 == null ? that.AVG_HOLIDAY_TV_COUNT5 == null : this.AVG_HOLIDAY_TV_COUNT5.equals(that.AVG_HOLIDAY_TV_COUNT5));
    equal = equal && (this.HOLIDAY_TV_COUNT6 == null ? that.HOLIDAY_TV_COUNT6 == null : this.HOLIDAY_TV_COUNT6.equals(that.HOLIDAY_TV_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT6 == null ? that.AVG_HOLIDAY_TV_COUNT6 == null : this.AVG_HOLIDAY_TV_COUNT6.equals(that.AVG_HOLIDAY_TV_COUNT6));
    equal = equal && (this.HOLIDAY_TV_COUNT7 == null ? that.HOLIDAY_TV_COUNT7 == null : this.HOLIDAY_TV_COUNT7.equals(that.HOLIDAY_TV_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT7 == null ? that.AVG_HOLIDAY_TV_COUNT7 == null : this.AVG_HOLIDAY_TV_COUNT7.equals(that.AVG_HOLIDAY_TV_COUNT7));
    equal = equal && (this.HOLIDAY_TV_COUNT8 == null ? that.HOLIDAY_TV_COUNT8 == null : this.HOLIDAY_TV_COUNT8.equals(that.HOLIDAY_TV_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT8 == null ? that.AVG_HOLIDAY_TV_COUNT8 == null : this.AVG_HOLIDAY_TV_COUNT8.equals(that.AVG_HOLIDAY_TV_COUNT8));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT1 == null ? that.NO_HOLIDAY_TV_COUNT1 == null : this.NO_HOLIDAY_TV_COUNT1.equals(that.NO_HOLIDAY_TV_COUNT1));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT1 == null ? that.AVG_NO_HOLIDAY_TV_COUNT1 == null : this.AVG_NO_HOLIDAY_TV_COUNT1.equals(that.AVG_NO_HOLIDAY_TV_COUNT1));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT2 == null ? that.NO_HOLIDAY_TV_COUNT2 == null : this.NO_HOLIDAY_TV_COUNT2.equals(that.NO_HOLIDAY_TV_COUNT2));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT2 == null ? that.AVG_NO_HOLIDAY_TV_COUNT2 == null : this.AVG_NO_HOLIDAY_TV_COUNT2.equals(that.AVG_NO_HOLIDAY_TV_COUNT2));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT3 == null ? that.NO_HOLIDAY_TV_COUNT3 == null : this.NO_HOLIDAY_TV_COUNT3.equals(that.NO_HOLIDAY_TV_COUNT3));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT3 == null ? that.AVG_NO_HOLIDAY_TV_COUNT3 == null : this.AVG_NO_HOLIDAY_TV_COUNT3.equals(that.AVG_NO_HOLIDAY_TV_COUNT3));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT4 == null ? that.NO_HOLIDAY_TV_COUNT4 == null : this.NO_HOLIDAY_TV_COUNT4.equals(that.NO_HOLIDAY_TV_COUNT4));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT4 == null ? that.AVG_NO_HOLIDAY_TV_COUNT4 == null : this.AVG_NO_HOLIDAY_TV_COUNT4.equals(that.AVG_NO_HOLIDAY_TV_COUNT4));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT5 == null ? that.NO_HOLIDAY_TV_COUNT5 == null : this.NO_HOLIDAY_TV_COUNT5.equals(that.NO_HOLIDAY_TV_COUNT5));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT5 == null ? that.AVG_NO_HOLIDAY_TV_COUNT5 == null : this.AVG_NO_HOLIDAY_TV_COUNT5.equals(that.AVG_NO_HOLIDAY_TV_COUNT5));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT6 == null ? that.NO_HOLIDAY_TV_COUNT6 == null : this.NO_HOLIDAY_TV_COUNT6.equals(that.NO_HOLIDAY_TV_COUNT6));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT6 == null ? that.AVG_NO_HOLIDAY_TV_COUNT6 == null : this.AVG_NO_HOLIDAY_TV_COUNT6.equals(that.AVG_NO_HOLIDAY_TV_COUNT6));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT7 == null ? that.NO_HOLIDAY_TV_COUNT7 == null : this.NO_HOLIDAY_TV_COUNT7.equals(that.NO_HOLIDAY_TV_COUNT7));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT7 == null ? that.AVG_NO_HOLIDAY_TV_COUNT7 == null : this.AVG_NO_HOLIDAY_TV_COUNT7.equals(that.AVG_NO_HOLIDAY_TV_COUNT7));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT8 == null ? that.NO_HOLIDAY_TV_COUNT8 == null : this.NO_HOLIDAY_TV_COUNT8.equals(that.NO_HOLIDAY_TV_COUNT8));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT8 == null ? that.AVG_NO_HOLIDAY_TV_COUNT8 == null : this.AVG_NO_HOLIDAY_TV_COUNT8.equals(that.AVG_NO_HOLIDAY_TV_COUNT8));
    equal = equal && (this.REVIEW_USER_COUNT == null ? that.REVIEW_USER_COUNT == null : this.REVIEW_USER_COUNT.equals(that.REVIEW_USER_COUNT));
    equal = equal && (this.NO_REVIEW_USER_COUNT == null ? that.NO_REVIEW_USER_COUNT == null : this.NO_REVIEW_USER_COUNT.equals(that.NO_REVIEW_USER_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP1 == null ? that.REVIEW_CHANNEL_NAME_TOP1 == null : this.REVIEW_CHANNEL_NAME_TOP1.equals(that.REVIEW_CHANNEL_NAME_TOP1));
    equal = equal && (this.TOP1_AVG_REVIEW_COUNT == null ? that.TOP1_AVG_REVIEW_COUNT == null : this.TOP1_AVG_REVIEW_COUNT.equals(that.TOP1_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP1_MAX_REVIEW_COUNT == null ? that.TOP1_MAX_REVIEW_COUNT == null : this.TOP1_MAX_REVIEW_COUNT.equals(that.TOP1_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP2 == null ? that.REVIEW_CHANNEL_NAME_TOP2 == null : this.REVIEW_CHANNEL_NAME_TOP2.equals(that.REVIEW_CHANNEL_NAME_TOP2));
    equal = equal && (this.TOP2_AVG_REVIEW_COUNT == null ? that.TOP2_AVG_REVIEW_COUNT == null : this.TOP2_AVG_REVIEW_COUNT.equals(that.TOP2_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP2_MAX_REVIEW_COUNT == null ? that.TOP2_MAX_REVIEW_COUNT == null : this.TOP2_MAX_REVIEW_COUNT.equals(that.TOP2_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP3 == null ? that.REVIEW_CHANNEL_NAME_TOP3 == null : this.REVIEW_CHANNEL_NAME_TOP3.equals(that.REVIEW_CHANNEL_NAME_TOP3));
    equal = equal && (this.TOP3_AVG_REVIEW_COUNT == null ? that.TOP3_AVG_REVIEW_COUNT == null : this.TOP3_AVG_REVIEW_COUNT.equals(that.TOP3_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP3_MAX_REVIEW_COUNT == null ? that.TOP3_MAX_REVIEW_COUNT == null : this.TOP3_MAX_REVIEW_COUNT.equals(that.TOP3_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP4 == null ? that.REVIEW_CHANNEL_NAME_TOP4 == null : this.REVIEW_CHANNEL_NAME_TOP4.equals(that.REVIEW_CHANNEL_NAME_TOP4));
    equal = equal && (this.TOP4_AVG_REVIEW_COUNT == null ? that.TOP4_AVG_REVIEW_COUNT == null : this.TOP4_AVG_REVIEW_COUNT.equals(that.TOP4_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP4_MAX_REVIEW_COUNT == null ? that.TOP4_MAX_REVIEW_COUNT == null : this.TOP4_MAX_REVIEW_COUNT.equals(that.TOP4_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP5 == null ? that.REVIEW_CHANNEL_NAME_TOP5 == null : this.REVIEW_CHANNEL_NAME_TOP5.equals(that.REVIEW_CHANNEL_NAME_TOP5));
    equal = equal && (this.TOP5_AVG_REVIEW_COUNT == null ? that.TOP5_AVG_REVIEW_COUNT == null : this.TOP5_AVG_REVIEW_COUNT.equals(that.TOP5_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP5_MAX_REVIEW_COUNT == null ? that.TOP5_MAX_REVIEW_COUNT == null : this.TOP5_MAX_REVIEW_COUNT.equals(that.TOP5_MAX_REVIEW_COUNT));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT1 == null ? that.HOLIDAY_REVIEW_COUNT1 == null : this.HOLIDAY_REVIEW_COUNT1.equals(that.HOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT1 == null ? that.AVG_HOLIDAY_REVIEW_COUNT1 == null : this.AVG_HOLIDAY_REVIEW_COUNT1.equals(that.AVG_HOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT2 == null ? that.HOLIDAY_REVIEW_COUNT2 == null : this.HOLIDAY_REVIEW_COUNT2.equals(that.HOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT2 == null ? that.AVG_HOLIDAY_REVIEW_COUNT2 == null : this.AVG_HOLIDAY_REVIEW_COUNT2.equals(that.AVG_HOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT3 == null ? that.HOLIDAY_REVIEW_COUNT3 == null : this.HOLIDAY_REVIEW_COUNT3.equals(that.HOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT3 == null ? that.AVG_HOLIDAY_REVIEW_COUNT3 == null : this.AVG_HOLIDAY_REVIEW_COUNT3.equals(that.AVG_HOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT4 == null ? that.HOLIDAY_REVIEW_COUNT4 == null : this.HOLIDAY_REVIEW_COUNT4.equals(that.HOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT4 == null ? that.AVG_HOLIDAY_REVIEW_COUNT4 == null : this.AVG_HOLIDAY_REVIEW_COUNT4.equals(that.AVG_HOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT5 == null ? that.HOLIDAY_REVIEW_COUNT5 == null : this.HOLIDAY_REVIEW_COUNT5.equals(that.HOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT5 == null ? that.AVG_HOLIDAY_REVIEW_COUNT5 == null : this.AVG_HOLIDAY_REVIEW_COUNT5.equals(that.AVG_HOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT6 == null ? that.HOLIDAY_REVIEW_COUNT6 == null : this.HOLIDAY_REVIEW_COUNT6.equals(that.HOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT6 == null ? that.AVG_HOLIDAY_REVIEW_COUNT6 == null : this.AVG_HOLIDAY_REVIEW_COUNT6.equals(that.AVG_HOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT7 == null ? that.HOLIDAY_REVIEW_COUNT7 == null : this.HOLIDAY_REVIEW_COUNT7.equals(that.HOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT7 == null ? that.AVG_HOLIDAY_REVIEW_COUNT7 == null : this.AVG_HOLIDAY_REVIEW_COUNT7.equals(that.AVG_HOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT8 == null ? that.HOLIDAY_REVIEW_COUNT8 == null : this.HOLIDAY_REVIEW_COUNT8.equals(that.HOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT8 == null ? that.AVG_HOLIDAY_REVIEW_COUNT8 == null : this.AVG_HOLIDAY_REVIEW_COUNT8.equals(that.AVG_HOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT1 == null ? that.NHOLIDAY_REVIEW_COUNT1 == null : this.NHOLIDAY_REVIEW_COUNT1.equals(that.NHOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT1 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT1 == null : this.AVG_NHOLIDAY_REVIEW_COUNT1.equals(that.AVG_NHOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT2 == null ? that.NHOLIDAY_REVIEW_COUNT2 == null : this.NHOLIDAY_REVIEW_COUNT2.equals(that.NHOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT2 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT2 == null : this.AVG_NHOLIDAY_REVIEW_COUNT2.equals(that.AVG_NHOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT3 == null ? that.NHOLIDAY_REVIEW_COUNT3 == null : this.NHOLIDAY_REVIEW_COUNT3.equals(that.NHOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT3 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT3 == null : this.AVG_NHOLIDAY_REVIEW_COUNT3.equals(that.AVG_NHOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT4 == null ? that.NHOLIDAY_REVIEW_COUNT4 == null : this.NHOLIDAY_REVIEW_COUNT4.equals(that.NHOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT4 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT4 == null : this.AVG_NHOLIDAY_REVIEW_COUNT4.equals(that.AVG_NHOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT5 == null ? that.NHOLIDAY_REVIEW_COUNT5 == null : this.NHOLIDAY_REVIEW_COUNT5.equals(that.NHOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT5 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT5 == null : this.AVG_NHOLIDAY_REVIEW_COUNT5.equals(that.AVG_NHOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT6 == null ? that.NHOLIDAY_REVIEW_COUNT6 == null : this.NHOLIDAY_REVIEW_COUNT6.equals(that.NHOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT6 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT6 == null : this.AVG_NHOLIDAY_REVIEW_COUNT6.equals(that.AVG_NHOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT7 == null ? that.NHOLIDAY_REVIEW_COUNT7 == null : this.NHOLIDAY_REVIEW_COUNT7.equals(that.NHOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT7 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT7 == null : this.AVG_NHOLIDAY_REVIEW_COUNT7.equals(that.AVG_NHOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT8 == null ? that.NHOLIDAY_REVIEW_COUNT8 == null : this.NHOLIDAY_REVIEW_COUNT8.equals(that.NHOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT8 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT8 == null : this.AVG_NHOLIDAY_REVIEW_COUNT8.equals(that.AVG_NHOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.VOD_USER_COUNT == null ? that.VOD_USER_COUNT == null : this.VOD_USER_COUNT.equals(that.VOD_USER_COUNT));
    equal = equal && (this.NO_VOD_USER_COUNT == null ? that.NO_VOD_USER_COUNT == null : this.NO_VOD_USER_COUNT.equals(that.NO_VOD_USER_COUNT));
    equal = equal && (this.HOLIDAY_VOD_COUNT1 == null ? that.HOLIDAY_VOD_COUNT1 == null : this.HOLIDAY_VOD_COUNT1.equals(that.HOLIDAY_VOD_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT1 == null ? that.AVG_HOLIDAY_VOD_COUNT1 == null : this.AVG_HOLIDAY_VOD_COUNT1.equals(that.AVG_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.HOLIDAY_VOD_COUNT2 == null ? that.HOLIDAY_VOD_COUNT2 == null : this.HOLIDAY_VOD_COUNT2.equals(that.HOLIDAY_VOD_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT2 == null ? that.AVG_HOLIDAY_VOD_COUNT2 == null : this.AVG_HOLIDAY_VOD_COUNT2.equals(that.AVG_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.HOLIDAY_VOD_COUNT3 == null ? that.HOLIDAY_VOD_COUNT3 == null : this.HOLIDAY_VOD_COUNT3.equals(that.HOLIDAY_VOD_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT3 == null ? that.AVG_HOLIDAY_VOD_COUNT3 == null : this.AVG_HOLIDAY_VOD_COUNT3.equals(that.AVG_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.HOLIDAY_VOD_COUNT4 == null ? that.HOLIDAY_VOD_COUNT4 == null : this.HOLIDAY_VOD_COUNT4.equals(that.HOLIDAY_VOD_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT4 == null ? that.AVG_HOLIDAY_VOD_COUNT4 == null : this.AVG_HOLIDAY_VOD_COUNT4.equals(that.AVG_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.HOLIDAY_VOD_COUNT5 == null ? that.HOLIDAY_VOD_COUNT5 == null : this.HOLIDAY_VOD_COUNT5.equals(that.HOLIDAY_VOD_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT5 == null ? that.AVG_HOLIDAY_VOD_COUNT5 == null : this.AVG_HOLIDAY_VOD_COUNT5.equals(that.AVG_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.HOLIDAY_VOD_COUNT6 == null ? that.HOLIDAY_VOD_COUNT6 == null : this.HOLIDAY_VOD_COUNT6.equals(that.HOLIDAY_VOD_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT6 == null ? that.AVG_HOLIDAY_VOD_COUNT6 == null : this.AVG_HOLIDAY_VOD_COUNT6.equals(that.AVG_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.HOLIDAY_VOD_COUNT7 == null ? that.HOLIDAY_VOD_COUNT7 == null : this.HOLIDAY_VOD_COUNT7.equals(that.HOLIDAY_VOD_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT7 == null ? that.AVG_HOLIDAY_VOD_COUNT7 == null : this.AVG_HOLIDAY_VOD_COUNT7.equals(that.AVG_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.HOLIDAY_VOD_COUNT8 == null ? that.HOLIDAY_VOD_COUNT8 == null : this.HOLIDAY_VOD_COUNT8.equals(that.HOLIDAY_VOD_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT8 == null ? that.AVG_HOLIDAY_VOD_COUNT8 == null : this.AVG_HOLIDAY_VOD_COUNT8.equals(that.AVG_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT1 == null ? that.NO_HOLIDAY_VOD_COUNT1 == null : this.NO_HOLIDAY_VOD_COUNT1.equals(that.NO_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT1 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT1 == null : this.AVG_NO_HOLIDAY_VOD_COUNT1.equals(that.AVG_NO_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT2 == null ? that.NO_HOLIDAY_VOD_COUNT2 == null : this.NO_HOLIDAY_VOD_COUNT2.equals(that.NO_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT2 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT2 == null : this.AVG_NO_HOLIDAY_VOD_COUNT2.equals(that.AVG_NO_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT3 == null ? that.NO_HOLIDAY_VOD_COUNT3 == null : this.NO_HOLIDAY_VOD_COUNT3.equals(that.NO_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT3 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT3 == null : this.AVG_NO_HOLIDAY_VOD_COUNT3.equals(that.AVG_NO_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT4 == null ? that.NO_HOLIDAY_VOD_COUNT4 == null : this.NO_HOLIDAY_VOD_COUNT4.equals(that.NO_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT4 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT4 == null : this.AVG_NO_HOLIDAY_VOD_COUNT4.equals(that.AVG_NO_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT5 == null ? that.NO_HOLIDAY_VOD_COUNT5 == null : this.NO_HOLIDAY_VOD_COUNT5.equals(that.NO_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT5 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT5 == null : this.AVG_NO_HOLIDAY_VOD_COUNT5.equals(that.AVG_NO_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT6 == null ? that.NO_HOLIDAY_VOD_COUNT6 == null : this.NO_HOLIDAY_VOD_COUNT6.equals(that.NO_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT6 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT6 == null : this.AVG_NO_HOLIDAY_VOD_COUNT6.equals(that.AVG_NO_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT7 == null ? that.NO_HOLIDAY_VOD_COUNT7 == null : this.NO_HOLIDAY_VOD_COUNT7.equals(that.NO_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT7 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT7 == null : this.AVG_NO_HOLIDAY_VOD_COUNT7.equals(that.AVG_NO_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT8 == null ? that.NO_HOLIDAY_VOD_COUNT8 == null : this.NO_HOLIDAY_VOD_COUNT8.equals(that.NO_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT8 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT8 == null : this.AVG_NO_HOLIDAY_VOD_COUNT8.equals(that.AVG_NO_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_view_beh_m)) {
      return false;
    }
    st_user_view_beh_m that = (st_user_view_beh_m) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TV_USER_COUNT == null ? that.TV_USER_COUNT == null : this.TV_USER_COUNT.equals(that.TV_USER_COUNT));
    equal = equal && (this.NO_TV_USER_COUNT == null ? that.NO_TV_USER_COUNT == null : this.NO_TV_USER_COUNT.equals(that.NO_TV_USER_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP1 == null ? that.TV_CHANNEL_NAME_TOP1 == null : this.TV_CHANNEL_NAME_TOP1.equals(that.TV_CHANNEL_NAME_TOP1));
    equal = equal && (this.TOP1_AVG_TV_COUNT == null ? that.TOP1_AVG_TV_COUNT == null : this.TOP1_AVG_TV_COUNT.equals(that.TOP1_AVG_TV_COUNT));
    equal = equal && (this.TOP1_MAX_TV_COUNT == null ? that.TOP1_MAX_TV_COUNT == null : this.TOP1_MAX_TV_COUNT.equals(that.TOP1_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP2 == null ? that.TV_CHANNEL_NAME_TOP2 == null : this.TV_CHANNEL_NAME_TOP2.equals(that.TV_CHANNEL_NAME_TOP2));
    equal = equal && (this.TOP2_AVG_TV_COUNT == null ? that.TOP2_AVG_TV_COUNT == null : this.TOP2_AVG_TV_COUNT.equals(that.TOP2_AVG_TV_COUNT));
    equal = equal && (this.TOP2_MAX_TV_COUNT == null ? that.TOP2_MAX_TV_COUNT == null : this.TOP2_MAX_TV_COUNT.equals(that.TOP2_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP3 == null ? that.TV_CHANNEL_NAME_TOP3 == null : this.TV_CHANNEL_NAME_TOP3.equals(that.TV_CHANNEL_NAME_TOP3));
    equal = equal && (this.TOP3_AVG_TV_COUNT == null ? that.TOP3_AVG_TV_COUNT == null : this.TOP3_AVG_TV_COUNT.equals(that.TOP3_AVG_TV_COUNT));
    equal = equal && (this.TOP3_MAX_TV_COUNT == null ? that.TOP3_MAX_TV_COUNT == null : this.TOP3_MAX_TV_COUNT.equals(that.TOP3_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP4 == null ? that.TV_CHANNEL_NAME_TOP4 == null : this.TV_CHANNEL_NAME_TOP4.equals(that.TV_CHANNEL_NAME_TOP4));
    equal = equal && (this.TOP4_AVG_TV_COUNT == null ? that.TOP4_AVG_TV_COUNT == null : this.TOP4_AVG_TV_COUNT.equals(that.TOP4_AVG_TV_COUNT));
    equal = equal && (this.TOP4_MAX_TV_COUNT == null ? that.TOP4_MAX_TV_COUNT == null : this.TOP4_MAX_TV_COUNT.equals(that.TOP4_MAX_TV_COUNT));
    equal = equal && (this.TV_CHANNEL_NAME_TOP5 == null ? that.TV_CHANNEL_NAME_TOP5 == null : this.TV_CHANNEL_NAME_TOP5.equals(that.TV_CHANNEL_NAME_TOP5));
    equal = equal && (this.TOP5_AVG_TV_COUNT == null ? that.TOP5_AVG_TV_COUNT == null : this.TOP5_AVG_TV_COUNT.equals(that.TOP5_AVG_TV_COUNT));
    equal = equal && (this.TOP5_MAX_TV_COUNT == null ? that.TOP5_MAX_TV_COUNT == null : this.TOP5_MAX_TV_COUNT.equals(that.TOP5_MAX_TV_COUNT));
    equal = equal && (this.HOLIDAY_TV_COUNT1 == null ? that.HOLIDAY_TV_COUNT1 == null : this.HOLIDAY_TV_COUNT1.equals(that.HOLIDAY_TV_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT1 == null ? that.AVG_HOLIDAY_TV_COUNT1 == null : this.AVG_HOLIDAY_TV_COUNT1.equals(that.AVG_HOLIDAY_TV_COUNT1));
    equal = equal && (this.HOLIDAY_TV_COUNT2 == null ? that.HOLIDAY_TV_COUNT2 == null : this.HOLIDAY_TV_COUNT2.equals(that.HOLIDAY_TV_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT2 == null ? that.AVG_HOLIDAY_TV_COUNT2 == null : this.AVG_HOLIDAY_TV_COUNT2.equals(that.AVG_HOLIDAY_TV_COUNT2));
    equal = equal && (this.HOLIDAY_TV_COUNT3 == null ? that.HOLIDAY_TV_COUNT3 == null : this.HOLIDAY_TV_COUNT3.equals(that.HOLIDAY_TV_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT3 == null ? that.AVG_HOLIDAY_TV_COUNT3 == null : this.AVG_HOLIDAY_TV_COUNT3.equals(that.AVG_HOLIDAY_TV_COUNT3));
    equal = equal && (this.HOLIDAY_TV_COUNT4 == null ? that.HOLIDAY_TV_COUNT4 == null : this.HOLIDAY_TV_COUNT4.equals(that.HOLIDAY_TV_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT4 == null ? that.AVG_HOLIDAY_TV_COUNT4 == null : this.AVG_HOLIDAY_TV_COUNT4.equals(that.AVG_HOLIDAY_TV_COUNT4));
    equal = equal && (this.HOLIDAY_TV_COUNT5 == null ? that.HOLIDAY_TV_COUNT5 == null : this.HOLIDAY_TV_COUNT5.equals(that.HOLIDAY_TV_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT5 == null ? that.AVG_HOLIDAY_TV_COUNT5 == null : this.AVG_HOLIDAY_TV_COUNT5.equals(that.AVG_HOLIDAY_TV_COUNT5));
    equal = equal && (this.HOLIDAY_TV_COUNT6 == null ? that.HOLIDAY_TV_COUNT6 == null : this.HOLIDAY_TV_COUNT6.equals(that.HOLIDAY_TV_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT6 == null ? that.AVG_HOLIDAY_TV_COUNT6 == null : this.AVG_HOLIDAY_TV_COUNT6.equals(that.AVG_HOLIDAY_TV_COUNT6));
    equal = equal && (this.HOLIDAY_TV_COUNT7 == null ? that.HOLIDAY_TV_COUNT7 == null : this.HOLIDAY_TV_COUNT7.equals(that.HOLIDAY_TV_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT7 == null ? that.AVG_HOLIDAY_TV_COUNT7 == null : this.AVG_HOLIDAY_TV_COUNT7.equals(that.AVG_HOLIDAY_TV_COUNT7));
    equal = equal && (this.HOLIDAY_TV_COUNT8 == null ? that.HOLIDAY_TV_COUNT8 == null : this.HOLIDAY_TV_COUNT8.equals(that.HOLIDAY_TV_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_TV_COUNT8 == null ? that.AVG_HOLIDAY_TV_COUNT8 == null : this.AVG_HOLIDAY_TV_COUNT8.equals(that.AVG_HOLIDAY_TV_COUNT8));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT1 == null ? that.NO_HOLIDAY_TV_COUNT1 == null : this.NO_HOLIDAY_TV_COUNT1.equals(that.NO_HOLIDAY_TV_COUNT1));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT1 == null ? that.AVG_NO_HOLIDAY_TV_COUNT1 == null : this.AVG_NO_HOLIDAY_TV_COUNT1.equals(that.AVG_NO_HOLIDAY_TV_COUNT1));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT2 == null ? that.NO_HOLIDAY_TV_COUNT2 == null : this.NO_HOLIDAY_TV_COUNT2.equals(that.NO_HOLIDAY_TV_COUNT2));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT2 == null ? that.AVG_NO_HOLIDAY_TV_COUNT2 == null : this.AVG_NO_HOLIDAY_TV_COUNT2.equals(that.AVG_NO_HOLIDAY_TV_COUNT2));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT3 == null ? that.NO_HOLIDAY_TV_COUNT3 == null : this.NO_HOLIDAY_TV_COUNT3.equals(that.NO_HOLIDAY_TV_COUNT3));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT3 == null ? that.AVG_NO_HOLIDAY_TV_COUNT3 == null : this.AVG_NO_HOLIDAY_TV_COUNT3.equals(that.AVG_NO_HOLIDAY_TV_COUNT3));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT4 == null ? that.NO_HOLIDAY_TV_COUNT4 == null : this.NO_HOLIDAY_TV_COUNT4.equals(that.NO_HOLIDAY_TV_COUNT4));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT4 == null ? that.AVG_NO_HOLIDAY_TV_COUNT4 == null : this.AVG_NO_HOLIDAY_TV_COUNT4.equals(that.AVG_NO_HOLIDAY_TV_COUNT4));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT5 == null ? that.NO_HOLIDAY_TV_COUNT5 == null : this.NO_HOLIDAY_TV_COUNT5.equals(that.NO_HOLIDAY_TV_COUNT5));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT5 == null ? that.AVG_NO_HOLIDAY_TV_COUNT5 == null : this.AVG_NO_HOLIDAY_TV_COUNT5.equals(that.AVG_NO_HOLIDAY_TV_COUNT5));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT6 == null ? that.NO_HOLIDAY_TV_COUNT6 == null : this.NO_HOLIDAY_TV_COUNT6.equals(that.NO_HOLIDAY_TV_COUNT6));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT6 == null ? that.AVG_NO_HOLIDAY_TV_COUNT6 == null : this.AVG_NO_HOLIDAY_TV_COUNT6.equals(that.AVG_NO_HOLIDAY_TV_COUNT6));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT7 == null ? that.NO_HOLIDAY_TV_COUNT7 == null : this.NO_HOLIDAY_TV_COUNT7.equals(that.NO_HOLIDAY_TV_COUNT7));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT7 == null ? that.AVG_NO_HOLIDAY_TV_COUNT7 == null : this.AVG_NO_HOLIDAY_TV_COUNT7.equals(that.AVG_NO_HOLIDAY_TV_COUNT7));
    equal = equal && (this.NO_HOLIDAY_TV_COUNT8 == null ? that.NO_HOLIDAY_TV_COUNT8 == null : this.NO_HOLIDAY_TV_COUNT8.equals(that.NO_HOLIDAY_TV_COUNT8));
    equal = equal && (this.AVG_NO_HOLIDAY_TV_COUNT8 == null ? that.AVG_NO_HOLIDAY_TV_COUNT8 == null : this.AVG_NO_HOLIDAY_TV_COUNT8.equals(that.AVG_NO_HOLIDAY_TV_COUNT8));
    equal = equal && (this.REVIEW_USER_COUNT == null ? that.REVIEW_USER_COUNT == null : this.REVIEW_USER_COUNT.equals(that.REVIEW_USER_COUNT));
    equal = equal && (this.NO_REVIEW_USER_COUNT == null ? that.NO_REVIEW_USER_COUNT == null : this.NO_REVIEW_USER_COUNT.equals(that.NO_REVIEW_USER_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP1 == null ? that.REVIEW_CHANNEL_NAME_TOP1 == null : this.REVIEW_CHANNEL_NAME_TOP1.equals(that.REVIEW_CHANNEL_NAME_TOP1));
    equal = equal && (this.TOP1_AVG_REVIEW_COUNT == null ? that.TOP1_AVG_REVIEW_COUNT == null : this.TOP1_AVG_REVIEW_COUNT.equals(that.TOP1_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP1_MAX_REVIEW_COUNT == null ? that.TOP1_MAX_REVIEW_COUNT == null : this.TOP1_MAX_REVIEW_COUNT.equals(that.TOP1_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP2 == null ? that.REVIEW_CHANNEL_NAME_TOP2 == null : this.REVIEW_CHANNEL_NAME_TOP2.equals(that.REVIEW_CHANNEL_NAME_TOP2));
    equal = equal && (this.TOP2_AVG_REVIEW_COUNT == null ? that.TOP2_AVG_REVIEW_COUNT == null : this.TOP2_AVG_REVIEW_COUNT.equals(that.TOP2_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP2_MAX_REVIEW_COUNT == null ? that.TOP2_MAX_REVIEW_COUNT == null : this.TOP2_MAX_REVIEW_COUNT.equals(that.TOP2_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP3 == null ? that.REVIEW_CHANNEL_NAME_TOP3 == null : this.REVIEW_CHANNEL_NAME_TOP3.equals(that.REVIEW_CHANNEL_NAME_TOP3));
    equal = equal && (this.TOP3_AVG_REVIEW_COUNT == null ? that.TOP3_AVG_REVIEW_COUNT == null : this.TOP3_AVG_REVIEW_COUNT.equals(that.TOP3_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP3_MAX_REVIEW_COUNT == null ? that.TOP3_MAX_REVIEW_COUNT == null : this.TOP3_MAX_REVIEW_COUNT.equals(that.TOP3_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP4 == null ? that.REVIEW_CHANNEL_NAME_TOP4 == null : this.REVIEW_CHANNEL_NAME_TOP4.equals(that.REVIEW_CHANNEL_NAME_TOP4));
    equal = equal && (this.TOP4_AVG_REVIEW_COUNT == null ? that.TOP4_AVG_REVIEW_COUNT == null : this.TOP4_AVG_REVIEW_COUNT.equals(that.TOP4_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP4_MAX_REVIEW_COUNT == null ? that.TOP4_MAX_REVIEW_COUNT == null : this.TOP4_MAX_REVIEW_COUNT.equals(that.TOP4_MAX_REVIEW_COUNT));
    equal = equal && (this.REVIEW_CHANNEL_NAME_TOP5 == null ? that.REVIEW_CHANNEL_NAME_TOP5 == null : this.REVIEW_CHANNEL_NAME_TOP5.equals(that.REVIEW_CHANNEL_NAME_TOP5));
    equal = equal && (this.TOP5_AVG_REVIEW_COUNT == null ? that.TOP5_AVG_REVIEW_COUNT == null : this.TOP5_AVG_REVIEW_COUNT.equals(that.TOP5_AVG_REVIEW_COUNT));
    equal = equal && (this.TOP5_MAX_REVIEW_COUNT == null ? that.TOP5_MAX_REVIEW_COUNT == null : this.TOP5_MAX_REVIEW_COUNT.equals(that.TOP5_MAX_REVIEW_COUNT));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT1 == null ? that.HOLIDAY_REVIEW_COUNT1 == null : this.HOLIDAY_REVIEW_COUNT1.equals(that.HOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT1 == null ? that.AVG_HOLIDAY_REVIEW_COUNT1 == null : this.AVG_HOLIDAY_REVIEW_COUNT1.equals(that.AVG_HOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT2 == null ? that.HOLIDAY_REVIEW_COUNT2 == null : this.HOLIDAY_REVIEW_COUNT2.equals(that.HOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT2 == null ? that.AVG_HOLIDAY_REVIEW_COUNT2 == null : this.AVG_HOLIDAY_REVIEW_COUNT2.equals(that.AVG_HOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT3 == null ? that.HOLIDAY_REVIEW_COUNT3 == null : this.HOLIDAY_REVIEW_COUNT3.equals(that.HOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT3 == null ? that.AVG_HOLIDAY_REVIEW_COUNT3 == null : this.AVG_HOLIDAY_REVIEW_COUNT3.equals(that.AVG_HOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT4 == null ? that.HOLIDAY_REVIEW_COUNT4 == null : this.HOLIDAY_REVIEW_COUNT4.equals(that.HOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT4 == null ? that.AVG_HOLIDAY_REVIEW_COUNT4 == null : this.AVG_HOLIDAY_REVIEW_COUNT4.equals(that.AVG_HOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT5 == null ? that.HOLIDAY_REVIEW_COUNT5 == null : this.HOLIDAY_REVIEW_COUNT5.equals(that.HOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT5 == null ? that.AVG_HOLIDAY_REVIEW_COUNT5 == null : this.AVG_HOLIDAY_REVIEW_COUNT5.equals(that.AVG_HOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT6 == null ? that.HOLIDAY_REVIEW_COUNT6 == null : this.HOLIDAY_REVIEW_COUNT6.equals(that.HOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT6 == null ? that.AVG_HOLIDAY_REVIEW_COUNT6 == null : this.AVG_HOLIDAY_REVIEW_COUNT6.equals(that.AVG_HOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT7 == null ? that.HOLIDAY_REVIEW_COUNT7 == null : this.HOLIDAY_REVIEW_COUNT7.equals(that.HOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT7 == null ? that.AVG_HOLIDAY_REVIEW_COUNT7 == null : this.AVG_HOLIDAY_REVIEW_COUNT7.equals(that.AVG_HOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.HOLIDAY_REVIEW_COUNT8 == null ? that.HOLIDAY_REVIEW_COUNT8 == null : this.HOLIDAY_REVIEW_COUNT8.equals(that.HOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_REVIEW_COUNT8 == null ? that.AVG_HOLIDAY_REVIEW_COUNT8 == null : this.AVG_HOLIDAY_REVIEW_COUNT8.equals(that.AVG_HOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT1 == null ? that.NHOLIDAY_REVIEW_COUNT1 == null : this.NHOLIDAY_REVIEW_COUNT1.equals(that.NHOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT1 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT1 == null : this.AVG_NHOLIDAY_REVIEW_COUNT1.equals(that.AVG_NHOLIDAY_REVIEW_COUNT1));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT2 == null ? that.NHOLIDAY_REVIEW_COUNT2 == null : this.NHOLIDAY_REVIEW_COUNT2.equals(that.NHOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT2 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT2 == null : this.AVG_NHOLIDAY_REVIEW_COUNT2.equals(that.AVG_NHOLIDAY_REVIEW_COUNT2));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT3 == null ? that.NHOLIDAY_REVIEW_COUNT3 == null : this.NHOLIDAY_REVIEW_COUNT3.equals(that.NHOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT3 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT3 == null : this.AVG_NHOLIDAY_REVIEW_COUNT3.equals(that.AVG_NHOLIDAY_REVIEW_COUNT3));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT4 == null ? that.NHOLIDAY_REVIEW_COUNT4 == null : this.NHOLIDAY_REVIEW_COUNT4.equals(that.NHOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT4 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT4 == null : this.AVG_NHOLIDAY_REVIEW_COUNT4.equals(that.AVG_NHOLIDAY_REVIEW_COUNT4));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT5 == null ? that.NHOLIDAY_REVIEW_COUNT5 == null : this.NHOLIDAY_REVIEW_COUNT5.equals(that.NHOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT5 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT5 == null : this.AVG_NHOLIDAY_REVIEW_COUNT5.equals(that.AVG_NHOLIDAY_REVIEW_COUNT5));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT6 == null ? that.NHOLIDAY_REVIEW_COUNT6 == null : this.NHOLIDAY_REVIEW_COUNT6.equals(that.NHOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT6 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT6 == null : this.AVG_NHOLIDAY_REVIEW_COUNT6.equals(that.AVG_NHOLIDAY_REVIEW_COUNT6));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT7 == null ? that.NHOLIDAY_REVIEW_COUNT7 == null : this.NHOLIDAY_REVIEW_COUNT7.equals(that.NHOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT7 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT7 == null : this.AVG_NHOLIDAY_REVIEW_COUNT7.equals(that.AVG_NHOLIDAY_REVIEW_COUNT7));
    equal = equal && (this.NHOLIDAY_REVIEW_COUNT8 == null ? that.NHOLIDAY_REVIEW_COUNT8 == null : this.NHOLIDAY_REVIEW_COUNT8.equals(that.NHOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.AVG_NHOLIDAY_REVIEW_COUNT8 == null ? that.AVG_NHOLIDAY_REVIEW_COUNT8 == null : this.AVG_NHOLIDAY_REVIEW_COUNT8.equals(that.AVG_NHOLIDAY_REVIEW_COUNT8));
    equal = equal && (this.VOD_USER_COUNT == null ? that.VOD_USER_COUNT == null : this.VOD_USER_COUNT.equals(that.VOD_USER_COUNT));
    equal = equal && (this.NO_VOD_USER_COUNT == null ? that.NO_VOD_USER_COUNT == null : this.NO_VOD_USER_COUNT.equals(that.NO_VOD_USER_COUNT));
    equal = equal && (this.HOLIDAY_VOD_COUNT1 == null ? that.HOLIDAY_VOD_COUNT1 == null : this.HOLIDAY_VOD_COUNT1.equals(that.HOLIDAY_VOD_COUNT1));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT1 == null ? that.AVG_HOLIDAY_VOD_COUNT1 == null : this.AVG_HOLIDAY_VOD_COUNT1.equals(that.AVG_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.HOLIDAY_VOD_COUNT2 == null ? that.HOLIDAY_VOD_COUNT2 == null : this.HOLIDAY_VOD_COUNT2.equals(that.HOLIDAY_VOD_COUNT2));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT2 == null ? that.AVG_HOLIDAY_VOD_COUNT2 == null : this.AVG_HOLIDAY_VOD_COUNT2.equals(that.AVG_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.HOLIDAY_VOD_COUNT3 == null ? that.HOLIDAY_VOD_COUNT3 == null : this.HOLIDAY_VOD_COUNT3.equals(that.HOLIDAY_VOD_COUNT3));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT3 == null ? that.AVG_HOLIDAY_VOD_COUNT3 == null : this.AVG_HOLIDAY_VOD_COUNT3.equals(that.AVG_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.HOLIDAY_VOD_COUNT4 == null ? that.HOLIDAY_VOD_COUNT4 == null : this.HOLIDAY_VOD_COUNT4.equals(that.HOLIDAY_VOD_COUNT4));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT4 == null ? that.AVG_HOLIDAY_VOD_COUNT4 == null : this.AVG_HOLIDAY_VOD_COUNT4.equals(that.AVG_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.HOLIDAY_VOD_COUNT5 == null ? that.HOLIDAY_VOD_COUNT5 == null : this.HOLIDAY_VOD_COUNT5.equals(that.HOLIDAY_VOD_COUNT5));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT5 == null ? that.AVG_HOLIDAY_VOD_COUNT5 == null : this.AVG_HOLIDAY_VOD_COUNT5.equals(that.AVG_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.HOLIDAY_VOD_COUNT6 == null ? that.HOLIDAY_VOD_COUNT6 == null : this.HOLIDAY_VOD_COUNT6.equals(that.HOLIDAY_VOD_COUNT6));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT6 == null ? that.AVG_HOLIDAY_VOD_COUNT6 == null : this.AVG_HOLIDAY_VOD_COUNT6.equals(that.AVG_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.HOLIDAY_VOD_COUNT7 == null ? that.HOLIDAY_VOD_COUNT7 == null : this.HOLIDAY_VOD_COUNT7.equals(that.HOLIDAY_VOD_COUNT7));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT7 == null ? that.AVG_HOLIDAY_VOD_COUNT7 == null : this.AVG_HOLIDAY_VOD_COUNT7.equals(that.AVG_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.HOLIDAY_VOD_COUNT8 == null ? that.HOLIDAY_VOD_COUNT8 == null : this.HOLIDAY_VOD_COUNT8.equals(that.HOLIDAY_VOD_COUNT8));
    equal = equal && (this.AVG_HOLIDAY_VOD_COUNT8 == null ? that.AVG_HOLIDAY_VOD_COUNT8 == null : this.AVG_HOLIDAY_VOD_COUNT8.equals(that.AVG_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT1 == null ? that.NO_HOLIDAY_VOD_COUNT1 == null : this.NO_HOLIDAY_VOD_COUNT1.equals(that.NO_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT1 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT1 == null : this.AVG_NO_HOLIDAY_VOD_COUNT1.equals(that.AVG_NO_HOLIDAY_VOD_COUNT1));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT2 == null ? that.NO_HOLIDAY_VOD_COUNT2 == null : this.NO_HOLIDAY_VOD_COUNT2.equals(that.NO_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT2 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT2 == null : this.AVG_NO_HOLIDAY_VOD_COUNT2.equals(that.AVG_NO_HOLIDAY_VOD_COUNT2));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT3 == null ? that.NO_HOLIDAY_VOD_COUNT3 == null : this.NO_HOLIDAY_VOD_COUNT3.equals(that.NO_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT3 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT3 == null : this.AVG_NO_HOLIDAY_VOD_COUNT3.equals(that.AVG_NO_HOLIDAY_VOD_COUNT3));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT4 == null ? that.NO_HOLIDAY_VOD_COUNT4 == null : this.NO_HOLIDAY_VOD_COUNT4.equals(that.NO_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT4 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT4 == null : this.AVG_NO_HOLIDAY_VOD_COUNT4.equals(that.AVG_NO_HOLIDAY_VOD_COUNT4));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT5 == null ? that.NO_HOLIDAY_VOD_COUNT5 == null : this.NO_HOLIDAY_VOD_COUNT5.equals(that.NO_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT5 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT5 == null : this.AVG_NO_HOLIDAY_VOD_COUNT5.equals(that.AVG_NO_HOLIDAY_VOD_COUNT5));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT6 == null ? that.NO_HOLIDAY_VOD_COUNT6 == null : this.NO_HOLIDAY_VOD_COUNT6.equals(that.NO_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT6 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT6 == null : this.AVG_NO_HOLIDAY_VOD_COUNT6.equals(that.AVG_NO_HOLIDAY_VOD_COUNT6));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT7 == null ? that.NO_HOLIDAY_VOD_COUNT7 == null : this.NO_HOLIDAY_VOD_COUNT7.equals(that.NO_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT7 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT7 == null : this.AVG_NO_HOLIDAY_VOD_COUNT7.equals(that.AVG_NO_HOLIDAY_VOD_COUNT7));
    equal = equal && (this.NO_HOLIDAY_VOD_COUNT8 == null ? that.NO_HOLIDAY_VOD_COUNT8 == null : this.NO_HOLIDAY_VOD_COUNT8.equals(that.NO_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.AVG_NO_HOLIDAY_VOD_COUNT8 == null ? that.AVG_NO_HOLIDAY_VOD_COUNT8 == null : this.AVG_NO_HOLIDAY_VOD_COUNT8.equals(that.AVG_NO_HOLIDAY_VOD_COUNT8));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readLong(3, __dbResults);
    this.NO_TV_USER_COUNT = JdbcWritableBridge.readLong(4, __dbResults);
    this.TV_CHANNEL_NAME_TOP1 = JdbcWritableBridge.readString(5, __dbResults);
    this.TOP1_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.TOP1_MAX_TV_COUNT = JdbcWritableBridge.readLong(7, __dbResults);
    this.TV_CHANNEL_NAME_TOP2 = JdbcWritableBridge.readString(8, __dbResults);
    this.TOP2_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.TOP2_MAX_TV_COUNT = JdbcWritableBridge.readLong(10, __dbResults);
    this.TV_CHANNEL_NAME_TOP3 = JdbcWritableBridge.readString(11, __dbResults);
    this.TOP3_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.TOP3_MAX_TV_COUNT = JdbcWritableBridge.readLong(13, __dbResults);
    this.TV_CHANNEL_NAME_TOP4 = JdbcWritableBridge.readString(14, __dbResults);
    this.TOP4_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.TOP4_MAX_TV_COUNT = JdbcWritableBridge.readLong(16, __dbResults);
    this.TV_CHANNEL_NAME_TOP5 = JdbcWritableBridge.readString(17, __dbResults);
    this.TOP5_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.TOP5_MAX_TV_COUNT = JdbcWritableBridge.readLong(19, __dbResults);
    this.HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readLong(20, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readLong(22, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readLong(24, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readLong(26, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readLong(28, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readLong(30, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readLong(32, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readLong(34, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.NO_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readLong(36, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.NO_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readLong(38, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.NO_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readLong(40, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.NO_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readLong(42, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.NO_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readLong(44, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.NO_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readLong(46, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.NO_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readLong(48, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.NO_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readLong(50, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.REVIEW_USER_COUNT = JdbcWritableBridge.readLong(52, __dbResults);
    this.NO_REVIEW_USER_COUNT = JdbcWritableBridge.readLong(53, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP1 = JdbcWritableBridge.readString(54, __dbResults);
    this.TOP1_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.TOP1_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(56, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP2 = JdbcWritableBridge.readString(57, __dbResults);
    this.TOP2_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.TOP2_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(59, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP3 = JdbcWritableBridge.readString(60, __dbResults);
    this.TOP3_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.TOP3_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(62, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP4 = JdbcWritableBridge.readString(63, __dbResults);
    this.TOP4_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.TOP4_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(65, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP5 = JdbcWritableBridge.readString(66, __dbResults);
    this.TOP5_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.TOP5_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(68, __dbResults);
    this.HOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readLong(69, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.HOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readLong(71, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.HOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readLong(73, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.HOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readLong(75, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readBigDecimal(76, __dbResults);
    this.HOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readLong(77, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.HOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readLong(79, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.HOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readLong(81, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.HOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readLong(83, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readLong(85, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readBigDecimal(86, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readLong(87, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readBigDecimal(88, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readLong(89, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readBigDecimal(90, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readLong(91, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readBigDecimal(92, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readLong(93, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readBigDecimal(94, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readLong(95, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readBigDecimal(96, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readLong(97, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readBigDecimal(98, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readLong(99, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readBigDecimal(100, __dbResults);
    this.VOD_USER_COUNT = JdbcWritableBridge.readLong(101, __dbResults);
    this.NO_VOD_USER_COUNT = JdbcWritableBridge.readLong(102, __dbResults);
    this.HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readLong(103, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readBigDecimal(104, __dbResults);
    this.HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readLong(105, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readBigDecimal(106, __dbResults);
    this.HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readLong(107, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readBigDecimal(108, __dbResults);
    this.HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readLong(109, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readBigDecimal(110, __dbResults);
    this.HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readLong(111, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readBigDecimal(112, __dbResults);
    this.HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readLong(113, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readBigDecimal(114, __dbResults);
    this.HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readLong(115, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readBigDecimal(116, __dbResults);
    this.HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readLong(117, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readBigDecimal(118, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readLong(119, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readBigDecimal(120, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readLong(121, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readBigDecimal(122, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readLong(123, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readBigDecimal(124, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readLong(125, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readBigDecimal(126, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readLong(127, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readBigDecimal(128, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readLong(129, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readBigDecimal(130, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readLong(131, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readBigDecimal(132, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readLong(133, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readBigDecimal(134, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(135, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(136, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TV_USER_COUNT = JdbcWritableBridge.readLong(3, __dbResults);
    this.NO_TV_USER_COUNT = JdbcWritableBridge.readLong(4, __dbResults);
    this.TV_CHANNEL_NAME_TOP1 = JdbcWritableBridge.readString(5, __dbResults);
    this.TOP1_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.TOP1_MAX_TV_COUNT = JdbcWritableBridge.readLong(7, __dbResults);
    this.TV_CHANNEL_NAME_TOP2 = JdbcWritableBridge.readString(8, __dbResults);
    this.TOP2_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.TOP2_MAX_TV_COUNT = JdbcWritableBridge.readLong(10, __dbResults);
    this.TV_CHANNEL_NAME_TOP3 = JdbcWritableBridge.readString(11, __dbResults);
    this.TOP3_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.TOP3_MAX_TV_COUNT = JdbcWritableBridge.readLong(13, __dbResults);
    this.TV_CHANNEL_NAME_TOP4 = JdbcWritableBridge.readString(14, __dbResults);
    this.TOP4_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.TOP4_MAX_TV_COUNT = JdbcWritableBridge.readLong(16, __dbResults);
    this.TV_CHANNEL_NAME_TOP5 = JdbcWritableBridge.readString(17, __dbResults);
    this.TOP5_AVG_TV_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.TOP5_MAX_TV_COUNT = JdbcWritableBridge.readLong(19, __dbResults);
    this.HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readLong(20, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readLong(22, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readLong(24, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readLong(26, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readLong(28, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readLong(30, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readLong(32, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readLong(34, __dbResults);
    this.AVG_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.NO_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readLong(36, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT1 = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.NO_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readLong(38, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT2 = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.NO_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readLong(40, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT3 = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.NO_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readLong(42, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT4 = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.NO_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readLong(44, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT5 = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.NO_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readLong(46, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT6 = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.NO_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readLong(48, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT7 = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.NO_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readLong(50, __dbResults);
    this.AVG_NO_HOLIDAY_TV_COUNT8 = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.REVIEW_USER_COUNT = JdbcWritableBridge.readLong(52, __dbResults);
    this.NO_REVIEW_USER_COUNT = JdbcWritableBridge.readLong(53, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP1 = JdbcWritableBridge.readString(54, __dbResults);
    this.TOP1_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.TOP1_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(56, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP2 = JdbcWritableBridge.readString(57, __dbResults);
    this.TOP2_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.TOP2_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(59, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP3 = JdbcWritableBridge.readString(60, __dbResults);
    this.TOP3_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.TOP3_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(62, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP4 = JdbcWritableBridge.readString(63, __dbResults);
    this.TOP4_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.TOP4_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(65, __dbResults);
    this.REVIEW_CHANNEL_NAME_TOP5 = JdbcWritableBridge.readString(66, __dbResults);
    this.TOP5_AVG_REVIEW_COUNT = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.TOP5_MAX_REVIEW_COUNT = JdbcWritableBridge.readLong(68, __dbResults);
    this.HOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readLong(69, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.HOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readLong(71, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.HOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readLong(73, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.HOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readLong(75, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readBigDecimal(76, __dbResults);
    this.HOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readLong(77, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.HOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readLong(79, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.HOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readLong(81, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.HOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readLong(83, __dbResults);
    this.AVG_HOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readLong(85, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT1 = JdbcWritableBridge.readBigDecimal(86, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readLong(87, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT2 = JdbcWritableBridge.readBigDecimal(88, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readLong(89, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT3 = JdbcWritableBridge.readBigDecimal(90, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readLong(91, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT4 = JdbcWritableBridge.readBigDecimal(92, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readLong(93, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT5 = JdbcWritableBridge.readBigDecimal(94, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readLong(95, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT6 = JdbcWritableBridge.readBigDecimal(96, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readLong(97, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT7 = JdbcWritableBridge.readBigDecimal(98, __dbResults);
    this.NHOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readLong(99, __dbResults);
    this.AVG_NHOLIDAY_REVIEW_COUNT8 = JdbcWritableBridge.readBigDecimal(100, __dbResults);
    this.VOD_USER_COUNT = JdbcWritableBridge.readLong(101, __dbResults);
    this.NO_VOD_USER_COUNT = JdbcWritableBridge.readLong(102, __dbResults);
    this.HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readLong(103, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readBigDecimal(104, __dbResults);
    this.HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readLong(105, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readBigDecimal(106, __dbResults);
    this.HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readLong(107, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readBigDecimal(108, __dbResults);
    this.HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readLong(109, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readBigDecimal(110, __dbResults);
    this.HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readLong(111, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readBigDecimal(112, __dbResults);
    this.HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readLong(113, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readBigDecimal(114, __dbResults);
    this.HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readLong(115, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readBigDecimal(116, __dbResults);
    this.HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readLong(117, __dbResults);
    this.AVG_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readBigDecimal(118, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readLong(119, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT1 = JdbcWritableBridge.readBigDecimal(120, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readLong(121, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT2 = JdbcWritableBridge.readBigDecimal(122, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readLong(123, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT3 = JdbcWritableBridge.readBigDecimal(124, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readLong(125, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT4 = JdbcWritableBridge.readBigDecimal(126, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readLong(127, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT5 = JdbcWritableBridge.readBigDecimal(128, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readLong(129, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT6 = JdbcWritableBridge.readBigDecimal(130, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readLong(131, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT7 = JdbcWritableBridge.readBigDecimal(132, __dbResults);
    this.NO_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readLong(133, __dbResults);
    this.AVG_NO_HOLIDAY_VOD_COUNT8 = JdbcWritableBridge.readBigDecimal(134, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(135, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(136, __dbResults);
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
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TV_USER_COUNT, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_TV_USER_COUNT, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP1, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_AVG_TV_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP1_MAX_TV_COUNT, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP2, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_AVG_TV_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP2_MAX_TV_COUNT, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP3, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_AVG_TV_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_MAX_TV_COUNT, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP4, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP4_AVG_TV_COUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_MAX_TV_COUNT, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP5, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP5_AVG_TV_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_MAX_TV_COUNT, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT1, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT1, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT2, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT2, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT3, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT3, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT4, 26 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT4, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT5, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT5, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT6, 30 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT6, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT7, 32 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT7, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT8, 34 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT8, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT1, 36 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT1, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT2, 38 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT2, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT3, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT3, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT4, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT4, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT5, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT5, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT6, 46 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT6, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT7, 48 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT7, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT8, 50 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT8, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(REVIEW_USER_COUNT, 52 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_REVIEW_USER_COUNT, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP1, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_AVG_REVIEW_COUNT, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP1_MAX_REVIEW_COUNT, 56 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP2, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_AVG_REVIEW_COUNT, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP2_MAX_REVIEW_COUNT, 59 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP3, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_AVG_REVIEW_COUNT, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_MAX_REVIEW_COUNT, 62 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP4, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP4_AVG_REVIEW_COUNT, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_MAX_REVIEW_COUNT, 65 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP5, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP5_AVG_REVIEW_COUNT, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_MAX_REVIEW_COUNT, 68 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT1, 69 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT1, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT2, 71 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT2, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT3, 73 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT3, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT4, 75 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT4, 76 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT5, 77 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT5, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT6, 79 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT6, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT7, 81 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT7, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT8, 83 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT8, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT1, 85 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT1, 86 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT2, 87 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT2, 88 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT3, 89 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT3, 90 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT4, 91 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT4, 92 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT5, 93 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT5, 94 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT6, 95 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT6, 96 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT7, 97 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT7, 98 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT8, 99 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT8, 100 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(VOD_USER_COUNT, 101 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_VOD_USER_COUNT, 102 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT1, 103 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT1, 104 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT2, 105 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT2, 106 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT3, 107 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT3, 108 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT4, 109 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT4, 110 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT5, 111 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT5, 112 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT6, 113 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT6, 114 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT7, 115 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT7, 116 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT8, 117 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT8, 118 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT1, 119 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT1, 120 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT2, 121 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT2, 122 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT3, 123 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT3, 124 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT4, 125 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT4, 126 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT5, 127 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT5, 128 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT6, 129 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT6, 130 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT7, 131 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT7, 132 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT8, 133 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT8, 134 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 135 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 136 + __off, 12, __dbStmt);
    return 136;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(TV_USER_COUNT, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_TV_USER_COUNT, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP1, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_AVG_TV_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP1_MAX_TV_COUNT, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP2, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_AVG_TV_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP2_MAX_TV_COUNT, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP3, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_AVG_TV_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_MAX_TV_COUNT, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP4, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP4_AVG_TV_COUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_MAX_TV_COUNT, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TV_CHANNEL_NAME_TOP5, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP5_AVG_TV_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_MAX_TV_COUNT, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT1, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT1, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT2, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT2, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT3, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT3, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT4, 26 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT4, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT5, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT5, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT6, 30 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT6, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT7, 32 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT7, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_TV_COUNT8, 34 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_TV_COUNT8, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT1, 36 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT1, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT2, 38 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT2, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT3, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT3, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT4, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT4, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT5, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT5, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT6, 46 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT6, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT7, 48 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT7, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_TV_COUNT8, 50 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_TV_COUNT8, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(REVIEW_USER_COUNT, 52 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_REVIEW_USER_COUNT, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP1, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP1_AVG_REVIEW_COUNT, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP1_MAX_REVIEW_COUNT, 56 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP2, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP2_AVG_REVIEW_COUNT, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP2_MAX_REVIEW_COUNT, 59 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP3, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP3_AVG_REVIEW_COUNT, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP3_MAX_REVIEW_COUNT, 62 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP4, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP4_AVG_REVIEW_COUNT, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP4_MAX_REVIEW_COUNT, 65 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(REVIEW_CHANNEL_NAME_TOP5, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOP5_AVG_REVIEW_COUNT, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(TOP5_MAX_REVIEW_COUNT, 68 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT1, 69 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT1, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT2, 71 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT2, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT3, 73 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT3, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT4, 75 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT4, 76 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT5, 77 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT5, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT6, 79 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT6, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT7, 81 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT7, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_REVIEW_COUNT8, 83 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_REVIEW_COUNT8, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT1, 85 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT1, 86 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT2, 87 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT2, 88 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT3, 89 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT3, 90 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT4, 91 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT4, 92 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT5, 93 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT5, 94 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT6, 95 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT6, 96 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT7, 97 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT7, 98 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NHOLIDAY_REVIEW_COUNT8, 99 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NHOLIDAY_REVIEW_COUNT8, 100 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(VOD_USER_COUNT, 101 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NO_VOD_USER_COUNT, 102 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT1, 103 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT1, 104 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT2, 105 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT2, 106 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT3, 107 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT3, 108 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT4, 109 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT4, 110 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT5, 111 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT5, 112 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT6, 113 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT6, 114 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT7, 115 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT7, 116 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(HOLIDAY_VOD_COUNT8, 117 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_HOLIDAY_VOD_COUNT8, 118 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT1, 119 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT1, 120 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT2, 121 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT2, 122 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT3, 123 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT3, 124 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT4, 125 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT4, 126 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT5, 127 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT5, 128 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT6, 129 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT6, 130 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT7, 131 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT7, 132 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeLong(NO_HOLIDAY_VOD_COUNT8, 133 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVG_NO_HOLIDAY_VOD_COUNT8, 134 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 135 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 136 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
        this.TV_USER_COUNT = null;
    } else {
    this.TV_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.NO_TV_USER_COUNT = null;
    } else {
    this.NO_TV_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TV_CHANNEL_NAME_TOP1 = null;
    } else {
    this.TV_CHANNEL_NAME_TOP1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_AVG_TV_COUNT = null;
    } else {
    this.TOP1_AVG_TV_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_MAX_TV_COUNT = null;
    } else {
    this.TOP1_MAX_TV_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TV_CHANNEL_NAME_TOP2 = null;
    } else {
    this.TV_CHANNEL_NAME_TOP2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_AVG_TV_COUNT = null;
    } else {
    this.TOP2_AVG_TV_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_MAX_TV_COUNT = null;
    } else {
    this.TOP2_MAX_TV_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TV_CHANNEL_NAME_TOP3 = null;
    } else {
    this.TV_CHANNEL_NAME_TOP3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_AVG_TV_COUNT = null;
    } else {
    this.TOP3_AVG_TV_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_MAX_TV_COUNT = null;
    } else {
    this.TOP3_MAX_TV_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TV_CHANNEL_NAME_TOP4 = null;
    } else {
    this.TV_CHANNEL_NAME_TOP4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP4_AVG_TV_COUNT = null;
    } else {
    this.TOP4_AVG_TV_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP4_MAX_TV_COUNT = null;
    } else {
    this.TOP4_MAX_TV_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TV_CHANNEL_NAME_TOP5 = null;
    } else {
    this.TV_CHANNEL_NAME_TOP5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP5_AVG_TV_COUNT = null;
    } else {
    this.TOP5_AVG_TV_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP5_MAX_TV_COUNT = null;
    } else {
    this.TOP5_MAX_TV_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT1 = null;
    } else {
    this.HOLIDAY_TV_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT1 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT2 = null;
    } else {
    this.HOLIDAY_TV_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT2 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT3 = null;
    } else {
    this.HOLIDAY_TV_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT3 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT4 = null;
    } else {
    this.HOLIDAY_TV_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT4 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT5 = null;
    } else {
    this.HOLIDAY_TV_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT5 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT6 = null;
    } else {
    this.HOLIDAY_TV_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT6 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT7 = null;
    } else {
    this.HOLIDAY_TV_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT7 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_TV_COUNT8 = null;
    } else {
    this.HOLIDAY_TV_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_TV_COUNT8 = null;
    } else {
    this.AVG_HOLIDAY_TV_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT1 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT1 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT2 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT2 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT3 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT3 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT4 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT4 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT5 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT5 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT6 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT6 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT7 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT7 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_TV_COUNT8 = null;
    } else {
    this.NO_HOLIDAY_TV_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_TV_COUNT8 = null;
    } else {
    this.AVG_NO_HOLIDAY_TV_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_USER_COUNT = null;
    } else {
    this.REVIEW_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.NO_REVIEW_USER_COUNT = null;
    } else {
    this.NO_REVIEW_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_CHANNEL_NAME_TOP1 = null;
    } else {
    this.REVIEW_CHANNEL_NAME_TOP1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_AVG_REVIEW_COUNT = null;
    } else {
    this.TOP1_AVG_REVIEW_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP1_MAX_REVIEW_COUNT = null;
    } else {
    this.TOP1_MAX_REVIEW_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_CHANNEL_NAME_TOP2 = null;
    } else {
    this.REVIEW_CHANNEL_NAME_TOP2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_AVG_REVIEW_COUNT = null;
    } else {
    this.TOP2_AVG_REVIEW_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP2_MAX_REVIEW_COUNT = null;
    } else {
    this.TOP2_MAX_REVIEW_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_CHANNEL_NAME_TOP3 = null;
    } else {
    this.REVIEW_CHANNEL_NAME_TOP3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_AVG_REVIEW_COUNT = null;
    } else {
    this.TOP3_AVG_REVIEW_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP3_MAX_REVIEW_COUNT = null;
    } else {
    this.TOP3_MAX_REVIEW_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_CHANNEL_NAME_TOP4 = null;
    } else {
    this.REVIEW_CHANNEL_NAME_TOP4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP4_AVG_REVIEW_COUNT = null;
    } else {
    this.TOP4_AVG_REVIEW_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP4_MAX_REVIEW_COUNT = null;
    } else {
    this.TOP4_MAX_REVIEW_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.REVIEW_CHANNEL_NAME_TOP5 = null;
    } else {
    this.REVIEW_CHANNEL_NAME_TOP5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP5_AVG_REVIEW_COUNT = null;
    } else {
    this.TOP5_AVG_REVIEW_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOP5_MAX_REVIEW_COUNT = null;
    } else {
    this.TOP5_MAX_REVIEW_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT1 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT1 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT2 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT2 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT3 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT3 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT4 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT4 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT5 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT5 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT6 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT6 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT7 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT7 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_REVIEW_COUNT8 = null;
    } else {
    this.HOLIDAY_REVIEW_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_REVIEW_COUNT8 = null;
    } else {
    this.AVG_HOLIDAY_REVIEW_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT1 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT1 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT2 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT2 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT3 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT3 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT4 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT4 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT5 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT5 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT6 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT6 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT7 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT7 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NHOLIDAY_REVIEW_COUNT8 = null;
    } else {
    this.NHOLIDAY_REVIEW_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NHOLIDAY_REVIEW_COUNT8 = null;
    } else {
    this.AVG_NHOLIDAY_REVIEW_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOD_USER_COUNT = null;
    } else {
    this.VOD_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.NO_VOD_USER_COUNT = null;
    } else {
    this.NO_VOD_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT1 = null;
    } else {
    this.HOLIDAY_VOD_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT1 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT2 = null;
    } else {
    this.HOLIDAY_VOD_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT2 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT3 = null;
    } else {
    this.HOLIDAY_VOD_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT3 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT4 = null;
    } else {
    this.HOLIDAY_VOD_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT4 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT5 = null;
    } else {
    this.HOLIDAY_VOD_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT5 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT6 = null;
    } else {
    this.HOLIDAY_VOD_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT6 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT7 = null;
    } else {
    this.HOLIDAY_VOD_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT7 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOLIDAY_VOD_COUNT8 = null;
    } else {
    this.HOLIDAY_VOD_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_HOLIDAY_VOD_COUNT8 = null;
    } else {
    this.AVG_HOLIDAY_VOD_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT1 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT1 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT1 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT2 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT2 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT2 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT3 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT3 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT3 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT4 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT4 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT4 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT5 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT5 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT5 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT5 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT6 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT6 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT6 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT6 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT7 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT7 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT7 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT7 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_HOLIDAY_VOD_COUNT8 = null;
    } else {
    this.NO_HOLIDAY_VOD_COUNT8 = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.AVG_NO_HOLIDAY_VOD_COUNT8 = null;
    } else {
    this.AVG_NO_HOLIDAY_VOD_COUNT8 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TV_USER_COUNT);
    }
    if (null == this.NO_TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_TV_USER_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP1);
    }
    if (null == this.TOP1_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP1_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP1_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP2);
    }
    if (null == this.TOP2_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP2_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP2_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP3);
    }
    if (null == this.TOP3_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP3_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP4);
    }
    if (null == this.TOP4_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP4_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP4_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP5);
    }
    if (null == this.TOP5_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP5_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP5_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_MAX_TV_COUNT);
    }
    if (null == this.HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT8, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT1);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT1, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT2);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT2, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT3);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT3, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT4);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT4, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT5);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT5, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT6);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT6, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT7);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT7, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT8);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT8, __dataOut);
    }
    if (null == this.REVIEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.REVIEW_USER_COUNT);
    }
    if (null == this.NO_REVIEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_REVIEW_USER_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP1);
    }
    if (null == this.TOP1_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP1_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP1_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP2);
    }
    if (null == this.TOP2_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP2_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP2_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP3);
    }
    if (null == this.TOP3_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP3_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP4);
    }
    if (null == this.TOP4_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP4_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP4_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP5);
    }
    if (null == this.TOP5_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP5_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP5_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_MAX_REVIEW_COUNT);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT8, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT1);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT1, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT2);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT2, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT3);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT3, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT4);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT4, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT5);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT5, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT6);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT6, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT7);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT7, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT8);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT8, __dataOut);
    }
    if (null == this.VOD_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VOD_USER_COUNT);
    }
    if (null == this.NO_VOD_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_VOD_USER_COUNT);
    }
    if (null == this.HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT8, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT1);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT1, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT2);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT2, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT3);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT3, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT4);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT4, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT5);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT5, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT6);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT6, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT7);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT7, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT8);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT8, __dataOut);
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
    if (null == this.TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TV_USER_COUNT);
    }
    if (null == this.NO_TV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_TV_USER_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP1);
    }
    if (null == this.TOP1_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP1_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP1_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP2);
    }
    if (null == this.TOP2_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP2_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP2_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP3);
    }
    if (null == this.TOP3_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP3_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP4);
    }
    if (null == this.TOP4_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP4_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP4_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_MAX_TV_COUNT);
    }
    if (null == this.TV_CHANNEL_NAME_TOP5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TV_CHANNEL_NAME_TOP5);
    }
    if (null == this.TOP5_AVG_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP5_AVG_TV_COUNT, __dataOut);
    }
    if (null == this.TOP5_MAX_TV_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_MAX_TV_COUNT);
    }
    if (null == this.HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_TV_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_TV_COUNT8, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT1);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT1, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT2);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT2, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT3);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT3, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT4);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT4, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT5);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT5, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT6);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT6, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT7);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT7, __dataOut);
    }
    if (null == this.NO_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_TV_COUNT8);
    }
    if (null == this.AVG_NO_HOLIDAY_TV_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_TV_COUNT8, __dataOut);
    }
    if (null == this.REVIEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.REVIEW_USER_COUNT);
    }
    if (null == this.NO_REVIEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_REVIEW_USER_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP1);
    }
    if (null == this.TOP1_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP1_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP1_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP1_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP2);
    }
    if (null == this.TOP2_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP2_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP2_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP2_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP3);
    }
    if (null == this.TOP3_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP3_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP3_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP3_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP4);
    }
    if (null == this.TOP4_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP4_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP4_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP4_MAX_REVIEW_COUNT);
    }
    if (null == this.REVIEW_CHANNEL_NAME_TOP5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REVIEW_CHANNEL_NAME_TOP5);
    }
    if (null == this.TOP5_AVG_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOP5_AVG_REVIEW_COUNT, __dataOut);
    }
    if (null == this.TOP5_MAX_REVIEW_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TOP5_MAX_REVIEW_COUNT);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_REVIEW_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_REVIEW_COUNT8, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT1);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT1, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT2);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT2, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT3);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT3, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT4);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT4, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT5);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT5, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT6);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT6, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT7);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT7, __dataOut);
    }
    if (null == this.NHOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NHOLIDAY_REVIEW_COUNT8);
    }
    if (null == this.AVG_NHOLIDAY_REVIEW_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NHOLIDAY_REVIEW_COUNT8, __dataOut);
    }
    if (null == this.VOD_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VOD_USER_COUNT);
    }
    if (null == this.NO_VOD_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_VOD_USER_COUNT);
    }
    if (null == this.HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT1);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT1, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT2);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT2, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT3);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT3, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT4);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT4, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT5);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT5, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT6);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT6, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT7);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT7, __dataOut);
    }
    if (null == this.HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HOLIDAY_VOD_COUNT8);
    }
    if (null == this.AVG_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_HOLIDAY_VOD_COUNT8, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT1);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT1, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT2);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT2, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT3);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT3, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT4);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT4, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT5);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT5, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT6);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT6, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT7);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT7, __dataOut);
    }
    if (null == this.NO_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NO_HOLIDAY_VOD_COUNT8);
    }
    if (null == this.AVG_NO_HOLIDAY_VOD_COUNT8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVG_NO_HOLIDAY_VOD_COUNT8, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":"" + TV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_TV_USER_COUNT==null?"null":"" + NO_TV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP1==null?"null":TV_CHANNEL_NAME_TOP1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_AVG_TV_COUNT==null?"null":TOP1_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_MAX_TV_COUNT==null?"null":"" + TOP1_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP2==null?"null":TV_CHANNEL_NAME_TOP2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_AVG_TV_COUNT==null?"null":TOP2_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_MAX_TV_COUNT==null?"null":"" + TOP2_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP3==null?"null":TV_CHANNEL_NAME_TOP3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_AVG_TV_COUNT==null?"null":TOP3_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_MAX_TV_COUNT==null?"null":"" + TOP3_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP4==null?"null":TV_CHANNEL_NAME_TOP4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_AVG_TV_COUNT==null?"null":TOP4_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_MAX_TV_COUNT==null?"null":"" + TOP4_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP5==null?"null":TV_CHANNEL_NAME_TOP5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_AVG_TV_COUNT==null?"null":TOP5_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_MAX_TV_COUNT==null?"null":"" + TOP5_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT1==null?"null":"" + HOLIDAY_TV_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT1==null?"null":AVG_HOLIDAY_TV_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT2==null?"null":"" + HOLIDAY_TV_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT2==null?"null":AVG_HOLIDAY_TV_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT3==null?"null":"" + HOLIDAY_TV_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT3==null?"null":AVG_HOLIDAY_TV_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT4==null?"null":"" + HOLIDAY_TV_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT4==null?"null":AVG_HOLIDAY_TV_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT5==null?"null":"" + HOLIDAY_TV_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT5==null?"null":AVG_HOLIDAY_TV_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT6==null?"null":"" + HOLIDAY_TV_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT6==null?"null":AVG_HOLIDAY_TV_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT7==null?"null":"" + HOLIDAY_TV_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT7==null?"null":AVG_HOLIDAY_TV_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT8==null?"null":"" + HOLIDAY_TV_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT8==null?"null":AVG_HOLIDAY_TV_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT1==null?"null":"" + NO_HOLIDAY_TV_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT1==null?"null":AVG_NO_HOLIDAY_TV_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT2==null?"null":"" + NO_HOLIDAY_TV_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT2==null?"null":AVG_NO_HOLIDAY_TV_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT3==null?"null":"" + NO_HOLIDAY_TV_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT3==null?"null":AVG_NO_HOLIDAY_TV_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT4==null?"null":"" + NO_HOLIDAY_TV_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT4==null?"null":AVG_NO_HOLIDAY_TV_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT5==null?"null":"" + NO_HOLIDAY_TV_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT5==null?"null":AVG_NO_HOLIDAY_TV_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT6==null?"null":"" + NO_HOLIDAY_TV_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT6==null?"null":AVG_NO_HOLIDAY_TV_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT7==null?"null":"" + NO_HOLIDAY_TV_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT7==null?"null":AVG_NO_HOLIDAY_TV_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT8==null?"null":"" + NO_HOLIDAY_TV_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT8==null?"null":AVG_NO_HOLIDAY_TV_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_USER_COUNT==null?"null":"" + REVIEW_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_REVIEW_USER_COUNT==null?"null":"" + NO_REVIEW_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP1==null?"null":REVIEW_CHANNEL_NAME_TOP1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_AVG_REVIEW_COUNT==null?"null":TOP1_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_MAX_REVIEW_COUNT==null?"null":"" + TOP1_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP2==null?"null":REVIEW_CHANNEL_NAME_TOP2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_AVG_REVIEW_COUNT==null?"null":TOP2_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_MAX_REVIEW_COUNT==null?"null":"" + TOP2_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP3==null?"null":REVIEW_CHANNEL_NAME_TOP3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_AVG_REVIEW_COUNT==null?"null":TOP3_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_MAX_REVIEW_COUNT==null?"null":"" + TOP3_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP4==null?"null":REVIEW_CHANNEL_NAME_TOP4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_AVG_REVIEW_COUNT==null?"null":TOP4_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_MAX_REVIEW_COUNT==null?"null":"" + TOP4_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP5==null?"null":REVIEW_CHANNEL_NAME_TOP5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_AVG_REVIEW_COUNT==null?"null":TOP5_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_MAX_REVIEW_COUNT==null?"null":"" + TOP5_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT1==null?"null":"" + HOLIDAY_REVIEW_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT1==null?"null":AVG_HOLIDAY_REVIEW_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT2==null?"null":"" + HOLIDAY_REVIEW_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT2==null?"null":AVG_HOLIDAY_REVIEW_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT3==null?"null":"" + HOLIDAY_REVIEW_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT3==null?"null":AVG_HOLIDAY_REVIEW_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT4==null?"null":"" + HOLIDAY_REVIEW_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT4==null?"null":AVG_HOLIDAY_REVIEW_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT5==null?"null":"" + HOLIDAY_REVIEW_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT5==null?"null":AVG_HOLIDAY_REVIEW_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT6==null?"null":"" + HOLIDAY_REVIEW_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT6==null?"null":AVG_HOLIDAY_REVIEW_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT7==null?"null":"" + HOLIDAY_REVIEW_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT7==null?"null":AVG_HOLIDAY_REVIEW_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT8==null?"null":"" + HOLIDAY_REVIEW_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT8==null?"null":AVG_HOLIDAY_REVIEW_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT1==null?"null":"" + NHOLIDAY_REVIEW_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT1==null?"null":AVG_NHOLIDAY_REVIEW_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT2==null?"null":"" + NHOLIDAY_REVIEW_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT2==null?"null":AVG_NHOLIDAY_REVIEW_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT3==null?"null":"" + NHOLIDAY_REVIEW_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT3==null?"null":AVG_NHOLIDAY_REVIEW_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT4==null?"null":"" + NHOLIDAY_REVIEW_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT4==null?"null":AVG_NHOLIDAY_REVIEW_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT5==null?"null":"" + NHOLIDAY_REVIEW_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT5==null?"null":AVG_NHOLIDAY_REVIEW_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT6==null?"null":"" + NHOLIDAY_REVIEW_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT6==null?"null":AVG_NHOLIDAY_REVIEW_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT7==null?"null":"" + NHOLIDAY_REVIEW_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT7==null?"null":AVG_NHOLIDAY_REVIEW_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT8==null?"null":"" + NHOLIDAY_REVIEW_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT8==null?"null":AVG_NHOLIDAY_REVIEW_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_USER_COUNT==null?"null":"" + VOD_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_VOD_USER_COUNT==null?"null":"" + NO_VOD_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT1==null?"null":"" + HOLIDAY_VOD_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT1==null?"null":AVG_HOLIDAY_VOD_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT2==null?"null":"" + HOLIDAY_VOD_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT2==null?"null":AVG_HOLIDAY_VOD_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT3==null?"null":"" + HOLIDAY_VOD_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT3==null?"null":AVG_HOLIDAY_VOD_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT4==null?"null":"" + HOLIDAY_VOD_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT4==null?"null":AVG_HOLIDAY_VOD_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT5==null?"null":"" + HOLIDAY_VOD_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT5==null?"null":AVG_HOLIDAY_VOD_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT6==null?"null":"" + HOLIDAY_VOD_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT6==null?"null":AVG_HOLIDAY_VOD_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT7==null?"null":"" + HOLIDAY_VOD_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT7==null?"null":AVG_HOLIDAY_VOD_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT8==null?"null":"" + HOLIDAY_VOD_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT8==null?"null":AVG_HOLIDAY_VOD_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT1==null?"null":"" + NO_HOLIDAY_VOD_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT1==null?"null":AVG_NO_HOLIDAY_VOD_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT2==null?"null":"" + NO_HOLIDAY_VOD_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT2==null?"null":AVG_NO_HOLIDAY_VOD_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT3==null?"null":"" + NO_HOLIDAY_VOD_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT3==null?"null":AVG_NO_HOLIDAY_VOD_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT4==null?"null":"" + NO_HOLIDAY_VOD_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT4==null?"null":AVG_NO_HOLIDAY_VOD_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT5==null?"null":"" + NO_HOLIDAY_VOD_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT5==null?"null":AVG_NO_HOLIDAY_VOD_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT6==null?"null":"" + NO_HOLIDAY_VOD_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT6==null?"null":AVG_NO_HOLIDAY_VOD_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT7==null?"null":"" + NO_HOLIDAY_VOD_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT7==null?"null":AVG_NO_HOLIDAY_VOD_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT8==null?"null":"" + NO_HOLIDAY_VOD_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT8==null?"null":AVG_NO_HOLIDAY_VOD_COUNT8.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_CODE==null?"null":OWN_CORP_STD_ORG_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OWN_CORP_STD_ORG_NAME==null?"null":OWN_CORP_STD_ORG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_USER_COUNT==null?"null":"" + TV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_TV_USER_COUNT==null?"null":"" + NO_TV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP1==null?"null":TV_CHANNEL_NAME_TOP1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_AVG_TV_COUNT==null?"null":TOP1_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_MAX_TV_COUNT==null?"null":"" + TOP1_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP2==null?"null":TV_CHANNEL_NAME_TOP2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_AVG_TV_COUNT==null?"null":TOP2_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_MAX_TV_COUNT==null?"null":"" + TOP2_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP3==null?"null":TV_CHANNEL_NAME_TOP3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_AVG_TV_COUNT==null?"null":TOP3_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_MAX_TV_COUNT==null?"null":"" + TOP3_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP4==null?"null":TV_CHANNEL_NAME_TOP4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_AVG_TV_COUNT==null?"null":TOP4_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_MAX_TV_COUNT==null?"null":"" + TOP4_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TV_CHANNEL_NAME_TOP5==null?"null":TV_CHANNEL_NAME_TOP5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_AVG_TV_COUNT==null?"null":TOP5_AVG_TV_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_MAX_TV_COUNT==null?"null":"" + TOP5_MAX_TV_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT1==null?"null":"" + HOLIDAY_TV_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT1==null?"null":AVG_HOLIDAY_TV_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT2==null?"null":"" + HOLIDAY_TV_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT2==null?"null":AVG_HOLIDAY_TV_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT3==null?"null":"" + HOLIDAY_TV_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT3==null?"null":AVG_HOLIDAY_TV_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT4==null?"null":"" + HOLIDAY_TV_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT4==null?"null":AVG_HOLIDAY_TV_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT5==null?"null":"" + HOLIDAY_TV_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT5==null?"null":AVG_HOLIDAY_TV_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT6==null?"null":"" + HOLIDAY_TV_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT6==null?"null":AVG_HOLIDAY_TV_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT7==null?"null":"" + HOLIDAY_TV_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT7==null?"null":AVG_HOLIDAY_TV_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_TV_COUNT8==null?"null":"" + HOLIDAY_TV_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_TV_COUNT8==null?"null":AVG_HOLIDAY_TV_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT1==null?"null":"" + NO_HOLIDAY_TV_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT1==null?"null":AVG_NO_HOLIDAY_TV_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT2==null?"null":"" + NO_HOLIDAY_TV_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT2==null?"null":AVG_NO_HOLIDAY_TV_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT3==null?"null":"" + NO_HOLIDAY_TV_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT3==null?"null":AVG_NO_HOLIDAY_TV_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT4==null?"null":"" + NO_HOLIDAY_TV_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT4==null?"null":AVG_NO_HOLIDAY_TV_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT5==null?"null":"" + NO_HOLIDAY_TV_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT5==null?"null":AVG_NO_HOLIDAY_TV_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT6==null?"null":"" + NO_HOLIDAY_TV_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT6==null?"null":AVG_NO_HOLIDAY_TV_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT7==null?"null":"" + NO_HOLIDAY_TV_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT7==null?"null":AVG_NO_HOLIDAY_TV_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_TV_COUNT8==null?"null":"" + NO_HOLIDAY_TV_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_TV_COUNT8==null?"null":AVG_NO_HOLIDAY_TV_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_USER_COUNT==null?"null":"" + REVIEW_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_REVIEW_USER_COUNT==null?"null":"" + NO_REVIEW_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP1==null?"null":REVIEW_CHANNEL_NAME_TOP1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_AVG_REVIEW_COUNT==null?"null":TOP1_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP1_MAX_REVIEW_COUNT==null?"null":"" + TOP1_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP2==null?"null":REVIEW_CHANNEL_NAME_TOP2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_AVG_REVIEW_COUNT==null?"null":TOP2_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP2_MAX_REVIEW_COUNT==null?"null":"" + TOP2_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP3==null?"null":REVIEW_CHANNEL_NAME_TOP3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_AVG_REVIEW_COUNT==null?"null":TOP3_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP3_MAX_REVIEW_COUNT==null?"null":"" + TOP3_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP4==null?"null":REVIEW_CHANNEL_NAME_TOP4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_AVG_REVIEW_COUNT==null?"null":TOP4_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP4_MAX_REVIEW_COUNT==null?"null":"" + TOP4_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REVIEW_CHANNEL_NAME_TOP5==null?"null":REVIEW_CHANNEL_NAME_TOP5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_AVG_REVIEW_COUNT==null?"null":TOP5_AVG_REVIEW_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOP5_MAX_REVIEW_COUNT==null?"null":"" + TOP5_MAX_REVIEW_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT1==null?"null":"" + HOLIDAY_REVIEW_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT1==null?"null":AVG_HOLIDAY_REVIEW_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT2==null?"null":"" + HOLIDAY_REVIEW_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT2==null?"null":AVG_HOLIDAY_REVIEW_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT3==null?"null":"" + HOLIDAY_REVIEW_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT3==null?"null":AVG_HOLIDAY_REVIEW_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT4==null?"null":"" + HOLIDAY_REVIEW_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT4==null?"null":AVG_HOLIDAY_REVIEW_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT5==null?"null":"" + HOLIDAY_REVIEW_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT5==null?"null":AVG_HOLIDAY_REVIEW_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT6==null?"null":"" + HOLIDAY_REVIEW_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT6==null?"null":AVG_HOLIDAY_REVIEW_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT7==null?"null":"" + HOLIDAY_REVIEW_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT7==null?"null":AVG_HOLIDAY_REVIEW_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_REVIEW_COUNT8==null?"null":"" + HOLIDAY_REVIEW_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_REVIEW_COUNT8==null?"null":AVG_HOLIDAY_REVIEW_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT1==null?"null":"" + NHOLIDAY_REVIEW_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT1==null?"null":AVG_NHOLIDAY_REVIEW_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT2==null?"null":"" + NHOLIDAY_REVIEW_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT2==null?"null":AVG_NHOLIDAY_REVIEW_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT3==null?"null":"" + NHOLIDAY_REVIEW_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT3==null?"null":AVG_NHOLIDAY_REVIEW_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT4==null?"null":"" + NHOLIDAY_REVIEW_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT4==null?"null":AVG_NHOLIDAY_REVIEW_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT5==null?"null":"" + NHOLIDAY_REVIEW_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT5==null?"null":AVG_NHOLIDAY_REVIEW_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT6==null?"null":"" + NHOLIDAY_REVIEW_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT6==null?"null":AVG_NHOLIDAY_REVIEW_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT7==null?"null":"" + NHOLIDAY_REVIEW_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT7==null?"null":AVG_NHOLIDAY_REVIEW_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NHOLIDAY_REVIEW_COUNT8==null?"null":"" + NHOLIDAY_REVIEW_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NHOLIDAY_REVIEW_COUNT8==null?"null":AVG_NHOLIDAY_REVIEW_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOD_USER_COUNT==null?"null":"" + VOD_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_VOD_USER_COUNT==null?"null":"" + NO_VOD_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT1==null?"null":"" + HOLIDAY_VOD_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT1==null?"null":AVG_HOLIDAY_VOD_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT2==null?"null":"" + HOLIDAY_VOD_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT2==null?"null":AVG_HOLIDAY_VOD_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT3==null?"null":"" + HOLIDAY_VOD_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT3==null?"null":AVG_HOLIDAY_VOD_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT4==null?"null":"" + HOLIDAY_VOD_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT4==null?"null":AVG_HOLIDAY_VOD_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT5==null?"null":"" + HOLIDAY_VOD_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT5==null?"null":AVG_HOLIDAY_VOD_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT6==null?"null":"" + HOLIDAY_VOD_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT6==null?"null":AVG_HOLIDAY_VOD_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT7==null?"null":"" + HOLIDAY_VOD_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT7==null?"null":AVG_HOLIDAY_VOD_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOLIDAY_VOD_COUNT8==null?"null":"" + HOLIDAY_VOD_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_HOLIDAY_VOD_COUNT8==null?"null":AVG_HOLIDAY_VOD_COUNT8.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT1==null?"null":"" + NO_HOLIDAY_VOD_COUNT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT1==null?"null":AVG_NO_HOLIDAY_VOD_COUNT1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT2==null?"null":"" + NO_HOLIDAY_VOD_COUNT2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT2==null?"null":AVG_NO_HOLIDAY_VOD_COUNT2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT3==null?"null":"" + NO_HOLIDAY_VOD_COUNT3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT3==null?"null":AVG_NO_HOLIDAY_VOD_COUNT3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT4==null?"null":"" + NO_HOLIDAY_VOD_COUNT4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT4==null?"null":AVG_NO_HOLIDAY_VOD_COUNT4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT5==null?"null":"" + NO_HOLIDAY_VOD_COUNT5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT5==null?"null":AVG_NO_HOLIDAY_VOD_COUNT5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT6==null?"null":"" + NO_HOLIDAY_VOD_COUNT6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT6==null?"null":AVG_NO_HOLIDAY_VOD_COUNT6.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT7==null?"null":"" + NO_HOLIDAY_VOD_COUNT7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT7==null?"null":AVG_NO_HOLIDAY_VOD_COUNT7.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_HOLIDAY_VOD_COUNT8==null?"null":"" + NO_HOLIDAY_VOD_COUNT8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVG_NO_HOLIDAY_VOD_COUNT8==null?"null":AVG_NO_HOLIDAY_VOD_COUNT8.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_TV_USER_COUNT = null; } else {
      this.NO_TV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP1 = null; } else {
      this.TV_CHANNEL_NAME_TOP1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_AVG_TV_COUNT = null; } else {
      this.TOP1_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_MAX_TV_COUNT = null; } else {
      this.TOP1_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP2 = null; } else {
      this.TV_CHANNEL_NAME_TOP2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_AVG_TV_COUNT = null; } else {
      this.TOP2_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_MAX_TV_COUNT = null; } else {
      this.TOP2_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP3 = null; } else {
      this.TV_CHANNEL_NAME_TOP3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_AVG_TV_COUNT = null; } else {
      this.TOP3_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_MAX_TV_COUNT = null; } else {
      this.TOP3_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP4 = null; } else {
      this.TV_CHANNEL_NAME_TOP4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_AVG_TV_COUNT = null; } else {
      this.TOP4_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_MAX_TV_COUNT = null; } else {
      this.TOP4_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP5 = null; } else {
      this.TV_CHANNEL_NAME_TOP5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_AVG_TV_COUNT = null; } else {
      this.TOP5_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_MAX_TV_COUNT = null; } else {
      this.TOP5_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT1 = null; } else {
      this.HOLIDAY_TV_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT1 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT2 = null; } else {
      this.HOLIDAY_TV_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT2 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT3 = null; } else {
      this.HOLIDAY_TV_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT3 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT4 = null; } else {
      this.HOLIDAY_TV_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT4 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT5 = null; } else {
      this.HOLIDAY_TV_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT5 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT6 = null; } else {
      this.HOLIDAY_TV_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT6 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT7 = null; } else {
      this.HOLIDAY_TV_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT7 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT8 = null; } else {
      this.HOLIDAY_TV_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT8 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT1 = null; } else {
      this.NO_HOLIDAY_TV_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT1 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT2 = null; } else {
      this.NO_HOLIDAY_TV_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT2 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT3 = null; } else {
      this.NO_HOLIDAY_TV_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT3 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT4 = null; } else {
      this.NO_HOLIDAY_TV_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT4 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT5 = null; } else {
      this.NO_HOLIDAY_TV_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT5 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT6 = null; } else {
      this.NO_HOLIDAY_TV_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT6 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT7 = null; } else {
      this.NO_HOLIDAY_TV_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT7 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT8 = null; } else {
      this.NO_HOLIDAY_TV_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT8 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REVIEW_USER_COUNT = null; } else {
      this.REVIEW_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_REVIEW_USER_COUNT = null; } else {
      this.NO_REVIEW_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP1 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_AVG_REVIEW_COUNT = null; } else {
      this.TOP1_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_MAX_REVIEW_COUNT = null; } else {
      this.TOP1_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP2 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_AVG_REVIEW_COUNT = null; } else {
      this.TOP2_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_MAX_REVIEW_COUNT = null; } else {
      this.TOP2_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP3 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_AVG_REVIEW_COUNT = null; } else {
      this.TOP3_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_MAX_REVIEW_COUNT = null; } else {
      this.TOP3_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP4 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_AVG_REVIEW_COUNT = null; } else {
      this.TOP4_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_MAX_REVIEW_COUNT = null; } else {
      this.TOP4_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP5 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_AVG_REVIEW_COUNT = null; } else {
      this.TOP5_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_MAX_REVIEW_COUNT = null; } else {
      this.TOP5_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT1 = null; } else {
      this.HOLIDAY_REVIEW_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT1 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT2 = null; } else {
      this.HOLIDAY_REVIEW_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT2 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT3 = null; } else {
      this.HOLIDAY_REVIEW_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT3 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT4 = null; } else {
      this.HOLIDAY_REVIEW_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT4 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT5 = null; } else {
      this.HOLIDAY_REVIEW_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT5 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT6 = null; } else {
      this.HOLIDAY_REVIEW_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT6 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT7 = null; } else {
      this.HOLIDAY_REVIEW_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT7 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT8 = null; } else {
      this.HOLIDAY_REVIEW_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT8 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT1 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT1 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT2 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT2 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT3 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT3 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT4 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT4 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT5 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT5 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT6 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT6 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT7 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT7 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT8 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT8 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_USER_COUNT = null; } else {
      this.VOD_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_VOD_USER_COUNT = null; } else {
      this.NO_VOD_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT1 = null; } else {
      this.HOLIDAY_VOD_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT1 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT2 = null; } else {
      this.HOLIDAY_VOD_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT2 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT3 = null; } else {
      this.HOLIDAY_VOD_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT3 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT4 = null; } else {
      this.HOLIDAY_VOD_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT4 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT5 = null; } else {
      this.HOLIDAY_VOD_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT5 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT6 = null; } else {
      this.HOLIDAY_VOD_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT6 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT7 = null; } else {
      this.HOLIDAY_VOD_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT7 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT8 = null; } else {
      this.HOLIDAY_VOD_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT8 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT1 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT1 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT2 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT2 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT3 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT3 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT4 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT4 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT5 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT5 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT6 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT6 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT7 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT7 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT8 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT8 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT8 = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_CODE = null; } else {
      this.OWN_CORP_STD_ORG_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.OWN_CORP_STD_ORG_NAME = null; } else {
      this.OWN_CORP_STD_ORG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TV_USER_COUNT = null; } else {
      this.TV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_TV_USER_COUNT = null; } else {
      this.NO_TV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP1 = null; } else {
      this.TV_CHANNEL_NAME_TOP1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_AVG_TV_COUNT = null; } else {
      this.TOP1_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_MAX_TV_COUNT = null; } else {
      this.TOP1_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP2 = null; } else {
      this.TV_CHANNEL_NAME_TOP2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_AVG_TV_COUNT = null; } else {
      this.TOP2_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_MAX_TV_COUNT = null; } else {
      this.TOP2_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP3 = null; } else {
      this.TV_CHANNEL_NAME_TOP3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_AVG_TV_COUNT = null; } else {
      this.TOP3_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_MAX_TV_COUNT = null; } else {
      this.TOP3_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP4 = null; } else {
      this.TV_CHANNEL_NAME_TOP4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_AVG_TV_COUNT = null; } else {
      this.TOP4_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_MAX_TV_COUNT = null; } else {
      this.TOP4_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.TV_CHANNEL_NAME_TOP5 = null; } else {
      this.TV_CHANNEL_NAME_TOP5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_AVG_TV_COUNT = null; } else {
      this.TOP5_AVG_TV_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_MAX_TV_COUNT = null; } else {
      this.TOP5_MAX_TV_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT1 = null; } else {
      this.HOLIDAY_TV_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT1 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT2 = null; } else {
      this.HOLIDAY_TV_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT2 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT3 = null; } else {
      this.HOLIDAY_TV_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT3 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT4 = null; } else {
      this.HOLIDAY_TV_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT4 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT5 = null; } else {
      this.HOLIDAY_TV_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT5 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT6 = null; } else {
      this.HOLIDAY_TV_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT6 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT7 = null; } else {
      this.HOLIDAY_TV_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT7 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_TV_COUNT8 = null; } else {
      this.HOLIDAY_TV_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_TV_COUNT8 = null; } else {
      this.AVG_HOLIDAY_TV_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT1 = null; } else {
      this.NO_HOLIDAY_TV_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT1 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT2 = null; } else {
      this.NO_HOLIDAY_TV_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT2 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT3 = null; } else {
      this.NO_HOLIDAY_TV_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT3 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT4 = null; } else {
      this.NO_HOLIDAY_TV_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT4 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT5 = null; } else {
      this.NO_HOLIDAY_TV_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT5 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT6 = null; } else {
      this.NO_HOLIDAY_TV_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT6 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT7 = null; } else {
      this.NO_HOLIDAY_TV_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT7 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_TV_COUNT8 = null; } else {
      this.NO_HOLIDAY_TV_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_TV_COUNT8 = null; } else {
      this.AVG_NO_HOLIDAY_TV_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REVIEW_USER_COUNT = null; } else {
      this.REVIEW_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_REVIEW_USER_COUNT = null; } else {
      this.NO_REVIEW_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP1 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_AVG_REVIEW_COUNT = null; } else {
      this.TOP1_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP1_MAX_REVIEW_COUNT = null; } else {
      this.TOP1_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP2 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_AVG_REVIEW_COUNT = null; } else {
      this.TOP2_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP2_MAX_REVIEW_COUNT = null; } else {
      this.TOP2_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP3 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_AVG_REVIEW_COUNT = null; } else {
      this.TOP3_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP3_MAX_REVIEW_COUNT = null; } else {
      this.TOP3_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP4 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_AVG_REVIEW_COUNT = null; } else {
      this.TOP4_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP4_MAX_REVIEW_COUNT = null; } else {
      this.TOP4_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.REVIEW_CHANNEL_NAME_TOP5 = null; } else {
      this.REVIEW_CHANNEL_NAME_TOP5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_AVG_REVIEW_COUNT = null; } else {
      this.TOP5_AVG_REVIEW_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOP5_MAX_REVIEW_COUNT = null; } else {
      this.TOP5_MAX_REVIEW_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT1 = null; } else {
      this.HOLIDAY_REVIEW_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT1 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT2 = null; } else {
      this.HOLIDAY_REVIEW_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT2 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT3 = null; } else {
      this.HOLIDAY_REVIEW_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT3 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT4 = null; } else {
      this.HOLIDAY_REVIEW_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT4 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT5 = null; } else {
      this.HOLIDAY_REVIEW_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT5 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT6 = null; } else {
      this.HOLIDAY_REVIEW_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT6 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT7 = null; } else {
      this.HOLIDAY_REVIEW_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT7 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_REVIEW_COUNT8 = null; } else {
      this.HOLIDAY_REVIEW_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_REVIEW_COUNT8 = null; } else {
      this.AVG_HOLIDAY_REVIEW_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT1 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT1 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT2 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT2 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT3 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT3 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT4 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT4 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT5 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT5 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT6 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT6 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT7 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT7 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NHOLIDAY_REVIEW_COUNT8 = null; } else {
      this.NHOLIDAY_REVIEW_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NHOLIDAY_REVIEW_COUNT8 = null; } else {
      this.AVG_NHOLIDAY_REVIEW_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VOD_USER_COUNT = null; } else {
      this.VOD_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_VOD_USER_COUNT = null; } else {
      this.NO_VOD_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT1 = null; } else {
      this.HOLIDAY_VOD_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT1 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT2 = null; } else {
      this.HOLIDAY_VOD_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT2 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT3 = null; } else {
      this.HOLIDAY_VOD_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT3 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT4 = null; } else {
      this.HOLIDAY_VOD_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT4 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT5 = null; } else {
      this.HOLIDAY_VOD_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT5 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT6 = null; } else {
      this.HOLIDAY_VOD_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT6 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT7 = null; } else {
      this.HOLIDAY_VOD_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT7 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HOLIDAY_VOD_COUNT8 = null; } else {
      this.HOLIDAY_VOD_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_HOLIDAY_VOD_COUNT8 = null; } else {
      this.AVG_HOLIDAY_VOD_COUNT8 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT1 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT1 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT1 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT2 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT2 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT2 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT3 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT3 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT3 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT4 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT4 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT4 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT5 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT5 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT5 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT5 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT6 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT6 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT6 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT6 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT7 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT7 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT7 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT7 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_HOLIDAY_VOD_COUNT8 = null; } else {
      this.NO_HOLIDAY_VOD_COUNT8 = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AVG_NO_HOLIDAY_VOD_COUNT8 = null; } else {
      this.AVG_NO_HOLIDAY_VOD_COUNT8 = new java.math.BigDecimal(__cur_str);
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
    st_user_view_beh_m o = (st_user_view_beh_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_user_view_beh_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("NO_TV_USER_COUNT", this.NO_TV_USER_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP1", this.TV_CHANNEL_NAME_TOP1);
    __sqoop$field_map.put("TOP1_AVG_TV_COUNT", this.TOP1_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP1_MAX_TV_COUNT", this.TOP1_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP2", this.TV_CHANNEL_NAME_TOP2);
    __sqoop$field_map.put("TOP2_AVG_TV_COUNT", this.TOP2_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP2_MAX_TV_COUNT", this.TOP2_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP3", this.TV_CHANNEL_NAME_TOP3);
    __sqoop$field_map.put("TOP3_AVG_TV_COUNT", this.TOP3_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP3_MAX_TV_COUNT", this.TOP3_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP4", this.TV_CHANNEL_NAME_TOP4);
    __sqoop$field_map.put("TOP4_AVG_TV_COUNT", this.TOP4_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP4_MAX_TV_COUNT", this.TOP4_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP5", this.TV_CHANNEL_NAME_TOP5);
    __sqoop$field_map.put("TOP5_AVG_TV_COUNT", this.TOP5_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP5_MAX_TV_COUNT", this.TOP5_MAX_TV_COUNT);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT1", this.HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT1", this.AVG_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT2", this.HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT2", this.AVG_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT3", this.HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT3", this.AVG_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT4", this.HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT4", this.AVG_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT5", this.HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT5", this.AVG_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT6", this.HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT6", this.AVG_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT7", this.HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT7", this.AVG_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT8", this.HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT8", this.AVG_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT1", this.NO_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT1", this.AVG_NO_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT2", this.NO_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT2", this.AVG_NO_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT3", this.NO_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT3", this.AVG_NO_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT4", this.NO_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT4", this.AVG_NO_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT5", this.NO_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT5", this.AVG_NO_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT6", this.NO_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT6", this.AVG_NO_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT7", this.NO_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT7", this.AVG_NO_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT8", this.NO_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT8", this.AVG_NO_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("REVIEW_USER_COUNT", this.REVIEW_USER_COUNT);
    __sqoop$field_map.put("NO_REVIEW_USER_COUNT", this.NO_REVIEW_USER_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP1", this.REVIEW_CHANNEL_NAME_TOP1);
    __sqoop$field_map.put("TOP1_AVG_REVIEW_COUNT", this.TOP1_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP1_MAX_REVIEW_COUNT", this.TOP1_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP2", this.REVIEW_CHANNEL_NAME_TOP2);
    __sqoop$field_map.put("TOP2_AVG_REVIEW_COUNT", this.TOP2_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP2_MAX_REVIEW_COUNT", this.TOP2_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP3", this.REVIEW_CHANNEL_NAME_TOP3);
    __sqoop$field_map.put("TOP3_AVG_REVIEW_COUNT", this.TOP3_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP3_MAX_REVIEW_COUNT", this.TOP3_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP4", this.REVIEW_CHANNEL_NAME_TOP4);
    __sqoop$field_map.put("TOP4_AVG_REVIEW_COUNT", this.TOP4_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP4_MAX_REVIEW_COUNT", this.TOP4_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP5", this.REVIEW_CHANNEL_NAME_TOP5);
    __sqoop$field_map.put("TOP5_AVG_REVIEW_COUNT", this.TOP5_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP5_MAX_REVIEW_COUNT", this.TOP5_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT1", this.HOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT1", this.AVG_HOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT2", this.HOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT2", this.AVG_HOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT3", this.HOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT3", this.AVG_HOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT4", this.HOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT4", this.AVG_HOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT5", this.HOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT5", this.AVG_HOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT6", this.HOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT6", this.AVG_HOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT7", this.HOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT7", this.AVG_HOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT8", this.HOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT8", this.AVG_HOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT1", this.NHOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT1", this.AVG_NHOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT2", this.NHOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT2", this.AVG_NHOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT3", this.NHOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT3", this.AVG_NHOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT4", this.NHOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT4", this.AVG_NHOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT5", this.NHOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT5", this.AVG_NHOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT6", this.NHOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT6", this.AVG_NHOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT7", this.NHOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT7", this.AVG_NHOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT8", this.NHOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT8", this.AVG_NHOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("VOD_USER_COUNT", this.VOD_USER_COUNT);
    __sqoop$field_map.put("NO_VOD_USER_COUNT", this.NO_VOD_USER_COUNT);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT1", this.HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT1", this.AVG_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT2", this.HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT2", this.AVG_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT3", this.HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT3", this.AVG_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT4", this.HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT4", this.AVG_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT5", this.HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT5", this.AVG_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT6", this.HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT6", this.AVG_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT7", this.HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT7", this.AVG_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT8", this.HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT8", this.AVG_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT1", this.NO_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT1", this.AVG_NO_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT2", this.NO_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT2", this.AVG_NO_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT3", this.NO_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT3", this.AVG_NO_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT4", this.NO_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT4", this.AVG_NO_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT5", this.NO_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT5", this.AVG_NO_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT6", this.NO_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT6", this.AVG_NO_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT7", this.NO_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT7", this.AVG_NO_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT8", this.NO_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT8", this.AVG_NO_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TV_USER_COUNT", this.TV_USER_COUNT);
    __sqoop$field_map.put("NO_TV_USER_COUNT", this.NO_TV_USER_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP1", this.TV_CHANNEL_NAME_TOP1);
    __sqoop$field_map.put("TOP1_AVG_TV_COUNT", this.TOP1_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP1_MAX_TV_COUNT", this.TOP1_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP2", this.TV_CHANNEL_NAME_TOP2);
    __sqoop$field_map.put("TOP2_AVG_TV_COUNT", this.TOP2_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP2_MAX_TV_COUNT", this.TOP2_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP3", this.TV_CHANNEL_NAME_TOP3);
    __sqoop$field_map.put("TOP3_AVG_TV_COUNT", this.TOP3_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP3_MAX_TV_COUNT", this.TOP3_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP4", this.TV_CHANNEL_NAME_TOP4);
    __sqoop$field_map.put("TOP4_AVG_TV_COUNT", this.TOP4_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP4_MAX_TV_COUNT", this.TOP4_MAX_TV_COUNT);
    __sqoop$field_map.put("TV_CHANNEL_NAME_TOP5", this.TV_CHANNEL_NAME_TOP5);
    __sqoop$field_map.put("TOP5_AVG_TV_COUNT", this.TOP5_AVG_TV_COUNT);
    __sqoop$field_map.put("TOP5_MAX_TV_COUNT", this.TOP5_MAX_TV_COUNT);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT1", this.HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT1", this.AVG_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT2", this.HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT2", this.AVG_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT3", this.HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT3", this.AVG_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT4", this.HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT4", this.AVG_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT5", this.HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT5", this.AVG_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT6", this.HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT6", this.AVG_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT7", this.HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT7", this.AVG_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("HOLIDAY_TV_COUNT8", this.HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_TV_COUNT8", this.AVG_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT1", this.NO_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT1", this.AVG_NO_HOLIDAY_TV_COUNT1);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT2", this.NO_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT2", this.AVG_NO_HOLIDAY_TV_COUNT2);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT3", this.NO_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT3", this.AVG_NO_HOLIDAY_TV_COUNT3);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT4", this.NO_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT4", this.AVG_NO_HOLIDAY_TV_COUNT4);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT5", this.NO_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT5", this.AVG_NO_HOLIDAY_TV_COUNT5);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT6", this.NO_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT6", this.AVG_NO_HOLIDAY_TV_COUNT6);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT7", this.NO_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT7", this.AVG_NO_HOLIDAY_TV_COUNT7);
    __sqoop$field_map.put("NO_HOLIDAY_TV_COUNT8", this.NO_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_TV_COUNT8", this.AVG_NO_HOLIDAY_TV_COUNT8);
    __sqoop$field_map.put("REVIEW_USER_COUNT", this.REVIEW_USER_COUNT);
    __sqoop$field_map.put("NO_REVIEW_USER_COUNT", this.NO_REVIEW_USER_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP1", this.REVIEW_CHANNEL_NAME_TOP1);
    __sqoop$field_map.put("TOP1_AVG_REVIEW_COUNT", this.TOP1_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP1_MAX_REVIEW_COUNT", this.TOP1_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP2", this.REVIEW_CHANNEL_NAME_TOP2);
    __sqoop$field_map.put("TOP2_AVG_REVIEW_COUNT", this.TOP2_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP2_MAX_REVIEW_COUNT", this.TOP2_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP3", this.REVIEW_CHANNEL_NAME_TOP3);
    __sqoop$field_map.put("TOP3_AVG_REVIEW_COUNT", this.TOP3_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP3_MAX_REVIEW_COUNT", this.TOP3_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP4", this.REVIEW_CHANNEL_NAME_TOP4);
    __sqoop$field_map.put("TOP4_AVG_REVIEW_COUNT", this.TOP4_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP4_MAX_REVIEW_COUNT", this.TOP4_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("REVIEW_CHANNEL_NAME_TOP5", this.REVIEW_CHANNEL_NAME_TOP5);
    __sqoop$field_map.put("TOP5_AVG_REVIEW_COUNT", this.TOP5_AVG_REVIEW_COUNT);
    __sqoop$field_map.put("TOP5_MAX_REVIEW_COUNT", this.TOP5_MAX_REVIEW_COUNT);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT1", this.HOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT1", this.AVG_HOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT2", this.HOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT2", this.AVG_HOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT3", this.HOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT3", this.AVG_HOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT4", this.HOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT4", this.AVG_HOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT5", this.HOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT5", this.AVG_HOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT6", this.HOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT6", this.AVG_HOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT7", this.HOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT7", this.AVG_HOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("HOLIDAY_REVIEW_COUNT8", this.HOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_REVIEW_COUNT8", this.AVG_HOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT1", this.NHOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT1", this.AVG_NHOLIDAY_REVIEW_COUNT1);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT2", this.NHOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT2", this.AVG_NHOLIDAY_REVIEW_COUNT2);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT3", this.NHOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT3", this.AVG_NHOLIDAY_REVIEW_COUNT3);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT4", this.NHOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT4", this.AVG_NHOLIDAY_REVIEW_COUNT4);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT5", this.NHOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT5", this.AVG_NHOLIDAY_REVIEW_COUNT5);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT6", this.NHOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT6", this.AVG_NHOLIDAY_REVIEW_COUNT6);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT7", this.NHOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT7", this.AVG_NHOLIDAY_REVIEW_COUNT7);
    __sqoop$field_map.put("NHOLIDAY_REVIEW_COUNT8", this.NHOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("AVG_NHOLIDAY_REVIEW_COUNT8", this.AVG_NHOLIDAY_REVIEW_COUNT8);
    __sqoop$field_map.put("VOD_USER_COUNT", this.VOD_USER_COUNT);
    __sqoop$field_map.put("NO_VOD_USER_COUNT", this.NO_VOD_USER_COUNT);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT1", this.HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT1", this.AVG_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT2", this.HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT2", this.AVG_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT3", this.HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT3", this.AVG_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT4", this.HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT4", this.AVG_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT5", this.HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT5", this.AVG_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT6", this.HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT6", this.AVG_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT7", this.HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT7", this.AVG_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("HOLIDAY_VOD_COUNT8", this.HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("AVG_HOLIDAY_VOD_COUNT8", this.AVG_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT1", this.NO_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT1", this.AVG_NO_HOLIDAY_VOD_COUNT1);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT2", this.NO_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT2", this.AVG_NO_HOLIDAY_VOD_COUNT2);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT3", this.NO_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT3", this.AVG_NO_HOLIDAY_VOD_COUNT3);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT4", this.NO_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT4", this.AVG_NO_HOLIDAY_VOD_COUNT4);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT5", this.NO_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT5", this.AVG_NO_HOLIDAY_VOD_COUNT5);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT6", this.NO_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT6", this.AVG_NO_HOLIDAY_VOD_COUNT6);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT7", this.NO_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT7", this.AVG_NO_HOLIDAY_VOD_COUNT7);
    __sqoop$field_map.put("NO_HOLIDAY_VOD_COUNT8", this.NO_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("AVG_NO_HOLIDAY_VOD_COUNT8", this.AVG_NO_HOLIDAY_VOD_COUNT8);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
    }
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("NO_TV_USER_COUNT".equals(__fieldName)) {
      this.NO_TV_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("TV_CHANNEL_NAME_TOP1".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP1 = (String) __fieldVal;
    }
    else    if ("TOP1_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP1_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP1_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP1_MAX_TV_COUNT = (Long) __fieldVal;
    }
    else    if ("TV_CHANNEL_NAME_TOP2".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP2 = (String) __fieldVal;
    }
    else    if ("TOP2_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP2_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP2_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP2_MAX_TV_COUNT = (Long) __fieldVal;
    }
    else    if ("TV_CHANNEL_NAME_TOP3".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP3 = (String) __fieldVal;
    }
    else    if ("TOP3_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP3_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP3_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP3_MAX_TV_COUNT = (Long) __fieldVal;
    }
    else    if ("TV_CHANNEL_NAME_TOP4".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP4 = (String) __fieldVal;
    }
    else    if ("TOP4_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP4_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP4_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP4_MAX_TV_COUNT = (Long) __fieldVal;
    }
    else    if ("TV_CHANNEL_NAME_TOP5".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP5 = (String) __fieldVal;
    }
    else    if ("TOP5_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP5_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP5_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP5_MAX_TV_COUNT = (Long) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REVIEW_USER_COUNT".equals(__fieldName)) {
      this.REVIEW_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("NO_REVIEW_USER_COUNT".equals(__fieldName)) {
      this.NO_REVIEW_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP1".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP1 = (String) __fieldVal;
    }
    else    if ("TOP1_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP1_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP1_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP1_MAX_REVIEW_COUNT = (Long) __fieldVal;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP2".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP2 = (String) __fieldVal;
    }
    else    if ("TOP2_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP2_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP2_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP2_MAX_REVIEW_COUNT = (Long) __fieldVal;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP3".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP3 = (String) __fieldVal;
    }
    else    if ("TOP3_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP3_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP3_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP3_MAX_REVIEW_COUNT = (Long) __fieldVal;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP4".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP4 = (String) __fieldVal;
    }
    else    if ("TOP4_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP4_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP4_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP4_MAX_REVIEW_COUNT = (Long) __fieldVal;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP5".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP5 = (String) __fieldVal;
    }
    else    if ("TOP5_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP5_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TOP5_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP5_MAX_REVIEW_COUNT = (Long) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VOD_USER_COUNT".equals(__fieldName)) {
      this.VOD_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("NO_VOD_USER_COUNT".equals(__fieldName)) {
      this.NO_VOD_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT8 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT1 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT1 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT2 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT2 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT3 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT3 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT4 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT4 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT5 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT5 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT6 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT6 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT7 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT7 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT8 = (Long) __fieldVal;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT8 = (java.math.BigDecimal) __fieldVal;
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
    if ("OWN_CORP_STD_ORG_CODE".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("OWN_CORP_STD_ORG_NAME".equals(__fieldName)) {
      this.OWN_CORP_STD_ORG_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("TV_USER_COUNT".equals(__fieldName)) {
      this.TV_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("NO_TV_USER_COUNT".equals(__fieldName)) {
      this.NO_TV_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("TV_CHANNEL_NAME_TOP1".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP1 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP1_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP1_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP1_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP1_MAX_TV_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("TV_CHANNEL_NAME_TOP2".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP2 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP2_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP2_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP2_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP2_MAX_TV_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("TV_CHANNEL_NAME_TOP3".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP3 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP3_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP3_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP3_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP3_MAX_TV_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("TV_CHANNEL_NAME_TOP4".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP4 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP4_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP4_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP4_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP4_MAX_TV_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("TV_CHANNEL_NAME_TOP5".equals(__fieldName)) {
      this.TV_CHANNEL_NAME_TOP5 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP5_AVG_TV_COUNT".equals(__fieldName)) {
      this.TOP5_AVG_TV_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP5_MAX_TV_COUNT".equals(__fieldName)) {
      this.TOP5_MAX_TV_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_TV_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_TV_COUNT8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT1".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT2".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT3".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT4".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT5".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT6".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT7".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.NO_HOLIDAY_TV_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_TV_COUNT8".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_TV_COUNT8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REVIEW_USER_COUNT".equals(__fieldName)) {
      this.REVIEW_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("NO_REVIEW_USER_COUNT".equals(__fieldName)) {
      this.NO_REVIEW_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP1".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP1 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP1_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP1_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP1_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP1_MAX_REVIEW_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP2".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP2 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP2_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP2_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP2_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP2_MAX_REVIEW_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP3".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP3 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP3_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP3_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP3_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP3_MAX_REVIEW_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP4".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP4 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP4_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP4_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP4_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP4_MAX_REVIEW_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("REVIEW_CHANNEL_NAME_TOP5".equals(__fieldName)) {
      this.REVIEW_CHANNEL_NAME_TOP5 = (String) __fieldVal;
      return true;
    }
    else    if ("TOP5_AVG_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP5_AVG_REVIEW_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TOP5_MAX_REVIEW_COUNT".equals(__fieldName)) {
      this.TOP5_MAX_REVIEW_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_REVIEW_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_REVIEW_COUNT8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT1".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT2".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT3".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT4".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT5".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT6".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT7".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NHOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.NHOLIDAY_REVIEW_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NHOLIDAY_REVIEW_COUNT8".equals(__fieldName)) {
      this.AVG_NHOLIDAY_REVIEW_COUNT8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VOD_USER_COUNT".equals(__fieldName)) {
      this.VOD_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("NO_VOD_USER_COUNT".equals(__fieldName)) {
      this.NO_VOD_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.HOLIDAY_VOD_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.AVG_HOLIDAY_VOD_COUNT8 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT1 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT1".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT1 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT2 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT2".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT2 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT3 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT3".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT3 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT4 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT4".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT4 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT5 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT5".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT5 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT6 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT6".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT6 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT7 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT7".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT7 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.NO_HOLIDAY_VOD_COUNT8 = (Long) __fieldVal;
      return true;
    }
    else    if ("AVG_NO_HOLIDAY_VOD_COUNT8".equals(__fieldName)) {
      this.AVG_NO_HOLIDAY_VOD_COUNT8 = (java.math.BigDecimal) __fieldVal;
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
