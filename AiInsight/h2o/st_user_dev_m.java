// ORM class for table 'st_user_dev_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 18:29:02 CST 2018
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

public class st_user_dev_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_user_dev_m with_CYCLE_ID(String CYCLE_ID) {
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
  public st_user_dev_m with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_user_dev_m with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String MGR_ADDR_ID;
  public String get_MGR_ADDR_ID() {
    return MGR_ADDR_ID;
  }
  public void set_MGR_ADDR_ID(String MGR_ADDR_ID) {
    this.MGR_ADDR_ID = MGR_ADDR_ID;
  }
  public st_user_dev_m with_MGR_ADDR_ID(String MGR_ADDR_ID) {
    this.MGR_ADDR_ID = MGR_ADDR_ID;
    return this;
  }
  private String MGR_ADDR_NAME;
  public String get_MGR_ADDR_NAME() {
    return MGR_ADDR_NAME;
  }
  public void set_MGR_ADDR_NAME(String MGR_ADDR_NAME) {
    this.MGR_ADDR_NAME = MGR_ADDR_NAME;
  }
  public st_user_dev_m with_MGR_ADDR_NAME(String MGR_ADDR_NAME) {
    this.MGR_ADDR_NAME = MGR_ADDR_NAME;
    return this;
  }
  private String COMMUNITY_ID;
  public String get_COMMUNITY_ID() {
    return COMMUNITY_ID;
  }
  public void set_COMMUNITY_ID(String COMMUNITY_ID) {
    this.COMMUNITY_ID = COMMUNITY_ID;
  }
  public st_user_dev_m with_COMMUNITY_ID(String COMMUNITY_ID) {
    this.COMMUNITY_ID = COMMUNITY_ID;
    return this;
  }
  private String COMMUNITY_NAME;
  public String get_COMMUNITY_NAME() {
    return COMMUNITY_NAME;
  }
  public void set_COMMUNITY_NAME(String COMMUNITY_NAME) {
    this.COMMUNITY_NAME = COMMUNITY_NAME;
  }
  public st_user_dev_m with_COMMUNITY_NAME(String COMMUNITY_NAME) {
    this.COMMUNITY_NAME = COMMUNITY_NAME;
    return this;
  }
  private String AREA_STD_ADDR_ID;
  public String get_AREA_STD_ADDR_ID() {
    return AREA_STD_ADDR_ID;
  }
  public void set_AREA_STD_ADDR_ID(String AREA_STD_ADDR_ID) {
    this.AREA_STD_ADDR_ID = AREA_STD_ADDR_ID;
  }
  public st_user_dev_m with_AREA_STD_ADDR_ID(String AREA_STD_ADDR_ID) {
    this.AREA_STD_ADDR_ID = AREA_STD_ADDR_ID;
    return this;
  }
  private String AREA_STD_ADDR_NAME;
  public String get_AREA_STD_ADDR_NAME() {
    return AREA_STD_ADDR_NAME;
  }
  public void set_AREA_STD_ADDR_NAME(String AREA_STD_ADDR_NAME) {
    this.AREA_STD_ADDR_NAME = AREA_STD_ADDR_NAME;
  }
  public st_user_dev_m with_AREA_STD_ADDR_NAME(String AREA_STD_ADDR_NAME) {
    this.AREA_STD_ADDR_NAME = AREA_STD_ADDR_NAME;
    return this;
  }
  private java.math.BigDecimal USER_COUNT;
  public java.math.BigDecimal get_USER_COUNT() {
    return USER_COUNT;
  }
  public void set_USER_COUNT(java.math.BigDecimal USER_COUNT) {
    this.USER_COUNT = USER_COUNT;
  }
  public st_user_dev_m with_USER_COUNT(java.math.BigDecimal USER_COUNT) {
    this.USER_COUNT = USER_COUNT;
    return this;
  }
  private java.math.BigDecimal USER_CHAIN;
  public java.math.BigDecimal get_USER_CHAIN() {
    return USER_CHAIN;
  }
  public void set_USER_CHAIN(java.math.BigDecimal USER_CHAIN) {
    this.USER_CHAIN = USER_CHAIN;
  }
  public st_user_dev_m with_USER_CHAIN(java.math.BigDecimal USER_CHAIN) {
    this.USER_CHAIN = USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal USER_EAR;
  public java.math.BigDecimal get_USER_EAR() {
    return USER_EAR;
  }
  public void set_USER_EAR(java.math.BigDecimal USER_EAR) {
    this.USER_EAR = USER_EAR;
  }
  public st_user_dev_m with_USER_EAR(java.math.BigDecimal USER_EAR) {
    this.USER_EAR = USER_EAR;
    return this;
  }
  private java.math.BigDecimal NEW_USER_COUNT;
  public java.math.BigDecimal get_NEW_USER_COUNT() {
    return NEW_USER_COUNT;
  }
  public void set_NEW_USER_COUNT(java.math.BigDecimal NEW_USER_COUNT) {
    this.NEW_USER_COUNT = NEW_USER_COUNT;
  }
  public st_user_dev_m with_NEW_USER_COUNT(java.math.BigDecimal NEW_USER_COUNT) {
    this.NEW_USER_COUNT = NEW_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal NEW_USER_CHAIN;
  public java.math.BigDecimal get_NEW_USER_CHAIN() {
    return NEW_USER_CHAIN;
  }
  public void set_NEW_USER_CHAIN(java.math.BigDecimal NEW_USER_CHAIN) {
    this.NEW_USER_CHAIN = NEW_USER_CHAIN;
  }
  public st_user_dev_m with_NEW_USER_CHAIN(java.math.BigDecimal NEW_USER_CHAIN) {
    this.NEW_USER_CHAIN = NEW_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal NEW_USER_EAR;
  public java.math.BigDecimal get_NEW_USER_EAR() {
    return NEW_USER_EAR;
  }
  public void set_NEW_USER_EAR(java.math.BigDecimal NEW_USER_EAR) {
    this.NEW_USER_EAR = NEW_USER_EAR;
  }
  public st_user_dev_m with_NEW_USER_EAR(java.math.BigDecimal NEW_USER_EAR) {
    this.NEW_USER_EAR = NEW_USER_EAR;
    return this;
  }
  private java.math.BigDecimal LOSE_USER_COUNT;
  public java.math.BigDecimal get_LOSE_USER_COUNT() {
    return LOSE_USER_COUNT;
  }
  public void set_LOSE_USER_COUNT(java.math.BigDecimal LOSE_USER_COUNT) {
    this.LOSE_USER_COUNT = LOSE_USER_COUNT;
  }
  public st_user_dev_m with_LOSE_USER_COUNT(java.math.BigDecimal LOSE_USER_COUNT) {
    this.LOSE_USER_COUNT = LOSE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CUM_LOSE_USER_COUNT;
  public java.math.BigDecimal get_CUM_LOSE_USER_COUNT() {
    return CUM_LOSE_USER_COUNT;
  }
  public void set_CUM_LOSE_USER_COUNT(java.math.BigDecimal CUM_LOSE_USER_COUNT) {
    this.CUM_LOSE_USER_COUNT = CUM_LOSE_USER_COUNT;
  }
  public st_user_dev_m with_CUM_LOSE_USER_COUNT(java.math.BigDecimal CUM_LOSE_USER_COUNT) {
    this.CUM_LOSE_USER_COUNT = CUM_LOSE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal LOSE_USER_CHAIN;
  public java.math.BigDecimal get_LOSE_USER_CHAIN() {
    return LOSE_USER_CHAIN;
  }
  public void set_LOSE_USER_CHAIN(java.math.BigDecimal LOSE_USER_CHAIN) {
    this.LOSE_USER_CHAIN = LOSE_USER_CHAIN;
  }
  public st_user_dev_m with_LOSE_USER_CHAIN(java.math.BigDecimal LOSE_USER_CHAIN) {
    this.LOSE_USER_CHAIN = LOSE_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal LOSE_USER_EAR;
  public java.math.BigDecimal get_LOSE_USER_EAR() {
    return LOSE_USER_EAR;
  }
  public void set_LOSE_USER_EAR(java.math.BigDecimal LOSE_USER_EAR) {
    this.LOSE_USER_EAR = LOSE_USER_EAR;
  }
  public st_user_dev_m with_LOSE_USER_EAR(java.math.BigDecimal LOSE_USER_EAR) {
    this.LOSE_USER_EAR = LOSE_USER_EAR;
    return this;
  }
  private java.math.BigDecimal INC_USER_COUNT;
  public java.math.BigDecimal get_INC_USER_COUNT() {
    return INC_USER_COUNT;
  }
  public void set_INC_USER_COUNT(java.math.BigDecimal INC_USER_COUNT) {
    this.INC_USER_COUNT = INC_USER_COUNT;
  }
  public st_user_dev_m with_INC_USER_COUNT(java.math.BigDecimal INC_USER_COUNT) {
    this.INC_USER_COUNT = INC_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal INC_USER_CHAIN;
  public java.math.BigDecimal get_INC_USER_CHAIN() {
    return INC_USER_CHAIN;
  }
  public void set_INC_USER_CHAIN(java.math.BigDecimal INC_USER_CHAIN) {
    this.INC_USER_CHAIN = INC_USER_CHAIN;
  }
  public st_user_dev_m with_INC_USER_CHAIN(java.math.BigDecimal INC_USER_CHAIN) {
    this.INC_USER_CHAIN = INC_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal INC_USER_EAR;
  public java.math.BigDecimal get_INC_USER_EAR() {
    return INC_USER_EAR;
  }
  public void set_INC_USER_EAR(java.math.BigDecimal INC_USER_EAR) {
    this.INC_USER_EAR = INC_USER_EAR;
  }
  public st_user_dev_m with_INC_USER_EAR(java.math.BigDecimal INC_USER_EAR) {
    this.INC_USER_EAR = INC_USER_EAR;
    return this;
  }
  private java.math.BigDecimal PAYMENT_USER_COUNT;
  public java.math.BigDecimal get_PAYMENT_USER_COUNT() {
    return PAYMENT_USER_COUNT;
  }
  public void set_PAYMENT_USER_COUNT(java.math.BigDecimal PAYMENT_USER_COUNT) {
    this.PAYMENT_USER_COUNT = PAYMENT_USER_COUNT;
  }
  public st_user_dev_m with_PAYMENT_USER_COUNT(java.math.BigDecimal PAYMENT_USER_COUNT) {
    this.PAYMENT_USER_COUNT = PAYMENT_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal PAYMENT_USER_CHAIN;
  public java.math.BigDecimal get_PAYMENT_USER_CHAIN() {
    return PAYMENT_USER_CHAIN;
  }
  public void set_PAYMENT_USER_CHAIN(java.math.BigDecimal PAYMENT_USER_CHAIN) {
    this.PAYMENT_USER_CHAIN = PAYMENT_USER_CHAIN;
  }
  public st_user_dev_m with_PAYMENT_USER_CHAIN(java.math.BigDecimal PAYMENT_USER_CHAIN) {
    this.PAYMENT_USER_CHAIN = PAYMENT_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal PAYMENT_USER_EAR;
  public java.math.BigDecimal get_PAYMENT_USER_EAR() {
    return PAYMENT_USER_EAR;
  }
  public void set_PAYMENT_USER_EAR(java.math.BigDecimal PAYMENT_USER_EAR) {
    this.PAYMENT_USER_EAR = PAYMENT_USER_EAR;
  }
  public st_user_dev_m with_PAYMENT_USER_EAR(java.math.BigDecimal PAYMENT_USER_EAR) {
    this.PAYMENT_USER_EAR = PAYMENT_USER_EAR;
    return this;
  }
  private java.math.BigDecimal PAY_USER_COUNT;
  public java.math.BigDecimal get_PAY_USER_COUNT() {
    return PAY_USER_COUNT;
  }
  public void set_PAY_USER_COUNT(java.math.BigDecimal PAY_USER_COUNT) {
    this.PAY_USER_COUNT = PAY_USER_COUNT;
  }
  public st_user_dev_m with_PAY_USER_COUNT(java.math.BigDecimal PAY_USER_COUNT) {
    this.PAY_USER_COUNT = PAY_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal PAY_USER_CHAIN;
  public java.math.BigDecimal get_PAY_USER_CHAIN() {
    return PAY_USER_CHAIN;
  }
  public void set_PAY_USER_CHAIN(java.math.BigDecimal PAY_USER_CHAIN) {
    this.PAY_USER_CHAIN = PAY_USER_CHAIN;
  }
  public st_user_dev_m with_PAY_USER_CHAIN(java.math.BigDecimal PAY_USER_CHAIN) {
    this.PAY_USER_CHAIN = PAY_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal PAY_USER_EAR;
  public java.math.BigDecimal get_PAY_USER_EAR() {
    return PAY_USER_EAR;
  }
  public void set_PAY_USER_EAR(java.math.BigDecimal PAY_USER_EAR) {
    this.PAY_USER_EAR = PAY_USER_EAR;
  }
  public st_user_dev_m with_PAY_USER_EAR(java.math.BigDecimal PAY_USER_EAR) {
    this.PAY_USER_EAR = PAY_USER_EAR;
    return this;
  }
  private java.math.BigDecimal EXPIRE_USER_COUNT;
  public java.math.BigDecimal get_EXPIRE_USER_COUNT() {
    return EXPIRE_USER_COUNT;
  }
  public void set_EXPIRE_USER_COUNT(java.math.BigDecimal EXPIRE_USER_COUNT) {
    this.EXPIRE_USER_COUNT = EXPIRE_USER_COUNT;
  }
  public st_user_dev_m with_EXPIRE_USER_COUNT(java.math.BigDecimal EXPIRE_USER_COUNT) {
    this.EXPIRE_USER_COUNT = EXPIRE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CUM_EXPIRE_USER_COUNT;
  public java.math.BigDecimal get_CUM_EXPIRE_USER_COUNT() {
    return CUM_EXPIRE_USER_COUNT;
  }
  public void set_CUM_EXPIRE_USER_COUNT(java.math.BigDecimal CUM_EXPIRE_USER_COUNT) {
    this.CUM_EXPIRE_USER_COUNT = CUM_EXPIRE_USER_COUNT;
  }
  public st_user_dev_m with_CUM_EXPIRE_USER_COUNT(java.math.BigDecimal CUM_EXPIRE_USER_COUNT) {
    this.CUM_EXPIRE_USER_COUNT = CUM_EXPIRE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal REPAY_USER_COUNT;
  public java.math.BigDecimal get_REPAY_USER_COUNT() {
    return REPAY_USER_COUNT;
  }
  public void set_REPAY_USER_COUNT(java.math.BigDecimal REPAY_USER_COUNT) {
    this.REPAY_USER_COUNT = REPAY_USER_COUNT;
  }
  public st_user_dev_m with_REPAY_USER_COUNT(java.math.BigDecimal REPAY_USER_COUNT) {
    this.REPAY_USER_COUNT = REPAY_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CUM_REPAY_USER_COUNT;
  public java.math.BigDecimal get_CUM_REPAY_USER_COUNT() {
    return CUM_REPAY_USER_COUNT;
  }
  public void set_CUM_REPAY_USER_COUNT(java.math.BigDecimal CUM_REPAY_USER_COUNT) {
    this.CUM_REPAY_USER_COUNT = CUM_REPAY_USER_COUNT;
  }
  public st_user_dev_m with_CUM_REPAY_USER_COUNT(java.math.BigDecimal CUM_REPAY_USER_COUNT) {
    this.CUM_REPAY_USER_COUNT = CUM_REPAY_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal REPAY_USER_CHAIN;
  public java.math.BigDecimal get_REPAY_USER_CHAIN() {
    return REPAY_USER_CHAIN;
  }
  public void set_REPAY_USER_CHAIN(java.math.BigDecimal REPAY_USER_CHAIN) {
    this.REPAY_USER_CHAIN = REPAY_USER_CHAIN;
  }
  public st_user_dev_m with_REPAY_USER_CHAIN(java.math.BigDecimal REPAY_USER_CHAIN) {
    this.REPAY_USER_CHAIN = REPAY_USER_CHAIN;
    return this;
  }
  private java.math.BigDecimal REPAY_USER_EAR;
  public java.math.BigDecimal get_REPAY_USER_EAR() {
    return REPAY_USER_EAR;
  }
  public void set_REPAY_USER_EAR(java.math.BigDecimal REPAY_USER_EAR) {
    this.REPAY_USER_EAR = REPAY_USER_EAR;
  }
  public st_user_dev_m with_REPAY_USER_EAR(java.math.BigDecimal REPAY_USER_EAR) {
    this.REPAY_USER_EAR = REPAY_USER_EAR;
    return this;
  }
  private java.math.BigDecimal REPAY_USER_RATE;
  public java.math.BigDecimal get_REPAY_USER_RATE() {
    return REPAY_USER_RATE;
  }
  public void set_REPAY_USER_RATE(java.math.BigDecimal REPAY_USER_RATE) {
    this.REPAY_USER_RATE = REPAY_USER_RATE;
  }
  public st_user_dev_m with_REPAY_USER_RATE(java.math.BigDecimal REPAY_USER_RATE) {
    this.REPAY_USER_RATE = REPAY_USER_RATE;
    return this;
  }
  private java.math.BigDecimal CUM_REPAY_USER_RATE;
  public java.math.BigDecimal get_CUM_REPAY_USER_RATE() {
    return CUM_REPAY_USER_RATE;
  }
  public void set_CUM_REPAY_USER_RATE(java.math.BigDecimal CUM_REPAY_USER_RATE) {
    this.CUM_REPAY_USER_RATE = CUM_REPAY_USER_RATE;
  }
  public st_user_dev_m with_CUM_REPAY_USER_RATE(java.math.BigDecimal CUM_REPAY_USER_RATE) {
    this.CUM_REPAY_USER_RATE = CUM_REPAY_USER_RATE;
    return this;
  }
  private java.math.BigDecimal EXPIRE_LOSE_USER_COUNT;
  public java.math.BigDecimal get_EXPIRE_LOSE_USER_COUNT() {
    return EXPIRE_LOSE_USER_COUNT;
  }
  public void set_EXPIRE_LOSE_USER_COUNT(java.math.BigDecimal EXPIRE_LOSE_USER_COUNT) {
    this.EXPIRE_LOSE_USER_COUNT = EXPIRE_LOSE_USER_COUNT;
  }
  public st_user_dev_m with_EXPIRE_LOSE_USER_COUNT(java.math.BigDecimal EXPIRE_LOSE_USER_COUNT) {
    this.EXPIRE_LOSE_USER_COUNT = EXPIRE_LOSE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal CUM_EXP_LOSE_USER_COUNT;
  public java.math.BigDecimal get_CUM_EXP_LOSE_USER_COUNT() {
    return CUM_EXP_LOSE_USER_COUNT;
  }
  public void set_CUM_EXP_LOSE_USER_COUNT(java.math.BigDecimal CUM_EXP_LOSE_USER_COUNT) {
    this.CUM_EXP_LOSE_USER_COUNT = CUM_EXP_LOSE_USER_COUNT;
  }
  public st_user_dev_m with_CUM_EXP_LOSE_USER_COUNT(java.math.BigDecimal CUM_EXP_LOSE_USER_COUNT) {
    this.CUM_EXP_LOSE_USER_COUNT = CUM_EXP_LOSE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal EXPIRE_LOSE_USER_RATE;
  public java.math.BigDecimal get_EXPIRE_LOSE_USER_RATE() {
    return EXPIRE_LOSE_USER_RATE;
  }
  public void set_EXPIRE_LOSE_USER_RATE(java.math.BigDecimal EXPIRE_LOSE_USER_RATE) {
    this.EXPIRE_LOSE_USER_RATE = EXPIRE_LOSE_USER_RATE;
  }
  public st_user_dev_m with_EXPIRE_LOSE_USER_RATE(java.math.BigDecimal EXPIRE_LOSE_USER_RATE) {
    this.EXPIRE_LOSE_USER_RATE = EXPIRE_LOSE_USER_RATE;
    return this;
  }
  private java.math.BigDecimal CUM_EXP_LOSE_USER_RATE;
  public java.math.BigDecimal get_CUM_EXP_LOSE_USER_RATE() {
    return CUM_EXP_LOSE_USER_RATE;
  }
  public void set_CUM_EXP_LOSE_USER_RATE(java.math.BigDecimal CUM_EXP_LOSE_USER_RATE) {
    this.CUM_EXP_LOSE_USER_RATE = CUM_EXP_LOSE_USER_RATE;
  }
  public st_user_dev_m with_CUM_EXP_LOSE_USER_RATE(java.math.BigDecimal CUM_EXP_LOSE_USER_RATE) {
    this.CUM_EXP_LOSE_USER_RATE = CUM_EXP_LOSE_USER_RATE;
    return this;
  }
  private java.math.BigDecimal SILENT_USER_COUNT;
  public java.math.BigDecimal get_SILENT_USER_COUNT() {
    return SILENT_USER_COUNT;
  }
  public void set_SILENT_USER_COUNT(java.math.BigDecimal SILENT_USER_COUNT) {
    this.SILENT_USER_COUNT = SILENT_USER_COUNT;
  }
  public st_user_dev_m with_SILENT_USER_COUNT(java.math.BigDecimal SILENT_USER_COUNT) {
    this.SILENT_USER_COUNT = SILENT_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal ACTIVE_USER_COUNT;
  public java.math.BigDecimal get_ACTIVE_USER_COUNT() {
    return ACTIVE_USER_COUNT;
  }
  public void set_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
  }
  public st_user_dev_m with_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_user_dev_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_user_dev_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_dev_m)) {
      return false;
    }
    st_user_dev_m that = (st_user_dev_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.MGR_ADDR_ID == null ? that.MGR_ADDR_ID == null : this.MGR_ADDR_ID.equals(that.MGR_ADDR_ID));
    equal = equal && (this.MGR_ADDR_NAME == null ? that.MGR_ADDR_NAME == null : this.MGR_ADDR_NAME.equals(that.MGR_ADDR_NAME));
    equal = equal && (this.COMMUNITY_ID == null ? that.COMMUNITY_ID == null : this.COMMUNITY_ID.equals(that.COMMUNITY_ID));
    equal = equal && (this.COMMUNITY_NAME == null ? that.COMMUNITY_NAME == null : this.COMMUNITY_NAME.equals(that.COMMUNITY_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.USER_COUNT == null ? that.USER_COUNT == null : this.USER_COUNT.equals(that.USER_COUNT));
    equal = equal && (this.USER_CHAIN == null ? that.USER_CHAIN == null : this.USER_CHAIN.equals(that.USER_CHAIN));
    equal = equal && (this.USER_EAR == null ? that.USER_EAR == null : this.USER_EAR.equals(that.USER_EAR));
    equal = equal && (this.NEW_USER_COUNT == null ? that.NEW_USER_COUNT == null : this.NEW_USER_COUNT.equals(that.NEW_USER_COUNT));
    equal = equal && (this.NEW_USER_CHAIN == null ? that.NEW_USER_CHAIN == null : this.NEW_USER_CHAIN.equals(that.NEW_USER_CHAIN));
    equal = equal && (this.NEW_USER_EAR == null ? that.NEW_USER_EAR == null : this.NEW_USER_EAR.equals(that.NEW_USER_EAR));
    equal = equal && (this.LOSE_USER_COUNT == null ? that.LOSE_USER_COUNT == null : this.LOSE_USER_COUNT.equals(that.LOSE_USER_COUNT));
    equal = equal && (this.CUM_LOSE_USER_COUNT == null ? that.CUM_LOSE_USER_COUNT == null : this.CUM_LOSE_USER_COUNT.equals(that.CUM_LOSE_USER_COUNT));
    equal = equal && (this.LOSE_USER_CHAIN == null ? that.LOSE_USER_CHAIN == null : this.LOSE_USER_CHAIN.equals(that.LOSE_USER_CHAIN));
    equal = equal && (this.LOSE_USER_EAR == null ? that.LOSE_USER_EAR == null : this.LOSE_USER_EAR.equals(that.LOSE_USER_EAR));
    equal = equal && (this.INC_USER_COUNT == null ? that.INC_USER_COUNT == null : this.INC_USER_COUNT.equals(that.INC_USER_COUNT));
    equal = equal && (this.INC_USER_CHAIN == null ? that.INC_USER_CHAIN == null : this.INC_USER_CHAIN.equals(that.INC_USER_CHAIN));
    equal = equal && (this.INC_USER_EAR == null ? that.INC_USER_EAR == null : this.INC_USER_EAR.equals(that.INC_USER_EAR));
    equal = equal && (this.PAYMENT_USER_COUNT == null ? that.PAYMENT_USER_COUNT == null : this.PAYMENT_USER_COUNT.equals(that.PAYMENT_USER_COUNT));
    equal = equal && (this.PAYMENT_USER_CHAIN == null ? that.PAYMENT_USER_CHAIN == null : this.PAYMENT_USER_CHAIN.equals(that.PAYMENT_USER_CHAIN));
    equal = equal && (this.PAYMENT_USER_EAR == null ? that.PAYMENT_USER_EAR == null : this.PAYMENT_USER_EAR.equals(that.PAYMENT_USER_EAR));
    equal = equal && (this.PAY_USER_COUNT == null ? that.PAY_USER_COUNT == null : this.PAY_USER_COUNT.equals(that.PAY_USER_COUNT));
    equal = equal && (this.PAY_USER_CHAIN == null ? that.PAY_USER_CHAIN == null : this.PAY_USER_CHAIN.equals(that.PAY_USER_CHAIN));
    equal = equal && (this.PAY_USER_EAR == null ? that.PAY_USER_EAR == null : this.PAY_USER_EAR.equals(that.PAY_USER_EAR));
    equal = equal && (this.EXPIRE_USER_COUNT == null ? that.EXPIRE_USER_COUNT == null : this.EXPIRE_USER_COUNT.equals(that.EXPIRE_USER_COUNT));
    equal = equal && (this.CUM_EXPIRE_USER_COUNT == null ? that.CUM_EXPIRE_USER_COUNT == null : this.CUM_EXPIRE_USER_COUNT.equals(that.CUM_EXPIRE_USER_COUNT));
    equal = equal && (this.REPAY_USER_COUNT == null ? that.REPAY_USER_COUNT == null : this.REPAY_USER_COUNT.equals(that.REPAY_USER_COUNT));
    equal = equal && (this.CUM_REPAY_USER_COUNT == null ? that.CUM_REPAY_USER_COUNT == null : this.CUM_REPAY_USER_COUNT.equals(that.CUM_REPAY_USER_COUNT));
    equal = equal && (this.REPAY_USER_CHAIN == null ? that.REPAY_USER_CHAIN == null : this.REPAY_USER_CHAIN.equals(that.REPAY_USER_CHAIN));
    equal = equal && (this.REPAY_USER_EAR == null ? that.REPAY_USER_EAR == null : this.REPAY_USER_EAR.equals(that.REPAY_USER_EAR));
    equal = equal && (this.REPAY_USER_RATE == null ? that.REPAY_USER_RATE == null : this.REPAY_USER_RATE.equals(that.REPAY_USER_RATE));
    equal = equal && (this.CUM_REPAY_USER_RATE == null ? that.CUM_REPAY_USER_RATE == null : this.CUM_REPAY_USER_RATE.equals(that.CUM_REPAY_USER_RATE));
    equal = equal && (this.EXPIRE_LOSE_USER_COUNT == null ? that.EXPIRE_LOSE_USER_COUNT == null : this.EXPIRE_LOSE_USER_COUNT.equals(that.EXPIRE_LOSE_USER_COUNT));
    equal = equal && (this.CUM_EXP_LOSE_USER_COUNT == null ? that.CUM_EXP_LOSE_USER_COUNT == null : this.CUM_EXP_LOSE_USER_COUNT.equals(that.CUM_EXP_LOSE_USER_COUNT));
    equal = equal && (this.EXPIRE_LOSE_USER_RATE == null ? that.EXPIRE_LOSE_USER_RATE == null : this.EXPIRE_LOSE_USER_RATE.equals(that.EXPIRE_LOSE_USER_RATE));
    equal = equal && (this.CUM_EXP_LOSE_USER_RATE == null ? that.CUM_EXP_LOSE_USER_RATE == null : this.CUM_EXP_LOSE_USER_RATE.equals(that.CUM_EXP_LOSE_USER_RATE));
    equal = equal && (this.SILENT_USER_COUNT == null ? that.SILENT_USER_COUNT == null : this.SILENT_USER_COUNT.equals(that.SILENT_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_user_dev_m)) {
      return false;
    }
    st_user_dev_m that = (st_user_dev_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.MGR_ADDR_ID == null ? that.MGR_ADDR_ID == null : this.MGR_ADDR_ID.equals(that.MGR_ADDR_ID));
    equal = equal && (this.MGR_ADDR_NAME == null ? that.MGR_ADDR_NAME == null : this.MGR_ADDR_NAME.equals(that.MGR_ADDR_NAME));
    equal = equal && (this.COMMUNITY_ID == null ? that.COMMUNITY_ID == null : this.COMMUNITY_ID.equals(that.COMMUNITY_ID));
    equal = equal && (this.COMMUNITY_NAME == null ? that.COMMUNITY_NAME == null : this.COMMUNITY_NAME.equals(that.COMMUNITY_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.USER_COUNT == null ? that.USER_COUNT == null : this.USER_COUNT.equals(that.USER_COUNT));
    equal = equal && (this.USER_CHAIN == null ? that.USER_CHAIN == null : this.USER_CHAIN.equals(that.USER_CHAIN));
    equal = equal && (this.USER_EAR == null ? that.USER_EAR == null : this.USER_EAR.equals(that.USER_EAR));
    equal = equal && (this.NEW_USER_COUNT == null ? that.NEW_USER_COUNT == null : this.NEW_USER_COUNT.equals(that.NEW_USER_COUNT));
    equal = equal && (this.NEW_USER_CHAIN == null ? that.NEW_USER_CHAIN == null : this.NEW_USER_CHAIN.equals(that.NEW_USER_CHAIN));
    equal = equal && (this.NEW_USER_EAR == null ? that.NEW_USER_EAR == null : this.NEW_USER_EAR.equals(that.NEW_USER_EAR));
    equal = equal && (this.LOSE_USER_COUNT == null ? that.LOSE_USER_COUNT == null : this.LOSE_USER_COUNT.equals(that.LOSE_USER_COUNT));
    equal = equal && (this.CUM_LOSE_USER_COUNT == null ? that.CUM_LOSE_USER_COUNT == null : this.CUM_LOSE_USER_COUNT.equals(that.CUM_LOSE_USER_COUNT));
    equal = equal && (this.LOSE_USER_CHAIN == null ? that.LOSE_USER_CHAIN == null : this.LOSE_USER_CHAIN.equals(that.LOSE_USER_CHAIN));
    equal = equal && (this.LOSE_USER_EAR == null ? that.LOSE_USER_EAR == null : this.LOSE_USER_EAR.equals(that.LOSE_USER_EAR));
    equal = equal && (this.INC_USER_COUNT == null ? that.INC_USER_COUNT == null : this.INC_USER_COUNT.equals(that.INC_USER_COUNT));
    equal = equal && (this.INC_USER_CHAIN == null ? that.INC_USER_CHAIN == null : this.INC_USER_CHAIN.equals(that.INC_USER_CHAIN));
    equal = equal && (this.INC_USER_EAR == null ? that.INC_USER_EAR == null : this.INC_USER_EAR.equals(that.INC_USER_EAR));
    equal = equal && (this.PAYMENT_USER_COUNT == null ? that.PAYMENT_USER_COUNT == null : this.PAYMENT_USER_COUNT.equals(that.PAYMENT_USER_COUNT));
    equal = equal && (this.PAYMENT_USER_CHAIN == null ? that.PAYMENT_USER_CHAIN == null : this.PAYMENT_USER_CHAIN.equals(that.PAYMENT_USER_CHAIN));
    equal = equal && (this.PAYMENT_USER_EAR == null ? that.PAYMENT_USER_EAR == null : this.PAYMENT_USER_EAR.equals(that.PAYMENT_USER_EAR));
    equal = equal && (this.PAY_USER_COUNT == null ? that.PAY_USER_COUNT == null : this.PAY_USER_COUNT.equals(that.PAY_USER_COUNT));
    equal = equal && (this.PAY_USER_CHAIN == null ? that.PAY_USER_CHAIN == null : this.PAY_USER_CHAIN.equals(that.PAY_USER_CHAIN));
    equal = equal && (this.PAY_USER_EAR == null ? that.PAY_USER_EAR == null : this.PAY_USER_EAR.equals(that.PAY_USER_EAR));
    equal = equal && (this.EXPIRE_USER_COUNT == null ? that.EXPIRE_USER_COUNT == null : this.EXPIRE_USER_COUNT.equals(that.EXPIRE_USER_COUNT));
    equal = equal && (this.CUM_EXPIRE_USER_COUNT == null ? that.CUM_EXPIRE_USER_COUNT == null : this.CUM_EXPIRE_USER_COUNT.equals(that.CUM_EXPIRE_USER_COUNT));
    equal = equal && (this.REPAY_USER_COUNT == null ? that.REPAY_USER_COUNT == null : this.REPAY_USER_COUNT.equals(that.REPAY_USER_COUNT));
    equal = equal && (this.CUM_REPAY_USER_COUNT == null ? that.CUM_REPAY_USER_COUNT == null : this.CUM_REPAY_USER_COUNT.equals(that.CUM_REPAY_USER_COUNT));
    equal = equal && (this.REPAY_USER_CHAIN == null ? that.REPAY_USER_CHAIN == null : this.REPAY_USER_CHAIN.equals(that.REPAY_USER_CHAIN));
    equal = equal && (this.REPAY_USER_EAR == null ? that.REPAY_USER_EAR == null : this.REPAY_USER_EAR.equals(that.REPAY_USER_EAR));
    equal = equal && (this.REPAY_USER_RATE == null ? that.REPAY_USER_RATE == null : this.REPAY_USER_RATE.equals(that.REPAY_USER_RATE));
    equal = equal && (this.CUM_REPAY_USER_RATE == null ? that.CUM_REPAY_USER_RATE == null : this.CUM_REPAY_USER_RATE.equals(that.CUM_REPAY_USER_RATE));
    equal = equal && (this.EXPIRE_LOSE_USER_COUNT == null ? that.EXPIRE_LOSE_USER_COUNT == null : this.EXPIRE_LOSE_USER_COUNT.equals(that.EXPIRE_LOSE_USER_COUNT));
    equal = equal && (this.CUM_EXP_LOSE_USER_COUNT == null ? that.CUM_EXP_LOSE_USER_COUNT == null : this.CUM_EXP_LOSE_USER_COUNT.equals(that.CUM_EXP_LOSE_USER_COUNT));
    equal = equal && (this.EXPIRE_LOSE_USER_RATE == null ? that.EXPIRE_LOSE_USER_RATE == null : this.EXPIRE_LOSE_USER_RATE.equals(that.EXPIRE_LOSE_USER_RATE));
    equal = equal && (this.CUM_EXP_LOSE_USER_RATE == null ? that.CUM_EXP_LOSE_USER_RATE == null : this.CUM_EXP_LOSE_USER_RATE.equals(that.CUM_EXP_LOSE_USER_RATE));
    equal = equal && (this.SILENT_USER_COUNT == null ? that.SILENT_USER_COUNT == null : this.SILENT_USER_COUNT.equals(that.SILENT_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.MGR_ADDR_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.MGR_ADDR_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.COMMUNITY_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.COMMUNITY_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.USER_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.USER_CHAIN = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.USER_EAR = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.NEW_USER_CHAIN = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.NEW_USER_EAR = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.CUM_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.LOSE_USER_CHAIN = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LOSE_USER_EAR = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.INC_USER_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.INC_USER_CHAIN = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.INC_USER_EAR = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.PAYMENT_USER_COUNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.PAYMENT_USER_CHAIN = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.PAYMENT_USER_EAR = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.PAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.PAY_USER_CHAIN = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.PAY_USER_EAR = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.EXPIRE_USER_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.CUM_EXPIRE_USER_COUNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.REPAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.CUM_REPAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.REPAY_USER_CHAIN = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.REPAY_USER_EAR = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.REPAY_USER_RATE = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CUM_REPAY_USER_RATE = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.EXPIRE_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.CUM_EXP_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.EXPIRE_LOSE_USER_RATE = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.CUM_EXP_LOSE_USER_RATE = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.SILENT_USER_COUNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(44, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.MGR_ADDR_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.MGR_ADDR_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.COMMUNITY_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.COMMUNITY_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.USER_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.USER_CHAIN = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.USER_EAR = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.NEW_USER_CHAIN = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.NEW_USER_EAR = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.CUM_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.LOSE_USER_CHAIN = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LOSE_USER_EAR = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.INC_USER_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.INC_USER_CHAIN = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.INC_USER_EAR = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.PAYMENT_USER_COUNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.PAYMENT_USER_CHAIN = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.PAYMENT_USER_EAR = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.PAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.PAY_USER_CHAIN = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.PAY_USER_EAR = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.EXPIRE_USER_COUNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.CUM_EXPIRE_USER_COUNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.REPAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.CUM_REPAY_USER_COUNT = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.REPAY_USER_CHAIN = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.REPAY_USER_EAR = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.REPAY_USER_RATE = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CUM_REPAY_USER_RATE = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.EXPIRE_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.CUM_EXP_LOSE_USER_COUNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.EXPIRE_LOSE_USER_RATE = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.CUM_EXP_LOSE_USER_RATE = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.SILENT_USER_COUNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(44, __dbResults);
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
    JdbcWritableBridge.writeString(MGR_ADDR_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MGR_ADDR_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMUNITY_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMUNITY_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_CHAIN, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_EAR, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CHAIN, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_EAR, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_LOSE_USER_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CHAIN, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_EAR, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_CHAIN, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_EAR, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_COUNT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_CHAIN, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_EAR, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_CHAIN, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_EAR, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_USER_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXPIRE_USER_COUNT, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_COUNT, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_REPAY_USER_COUNT, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_CHAIN, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_EAR, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_RATE, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_REPAY_USER_RATE, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_LOSE_USER_COUNT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXP_LOSE_USER_COUNT, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_LOSE_USER_RATE, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXP_LOSE_USER_RATE, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SILENT_USER_COUNT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 44 + __off, 1, __dbStmt);
    return 44;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MGR_ADDR_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MGR_ADDR_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMUNITY_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMUNITY_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_CHAIN, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_EAR, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CHAIN, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_EAR, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_LOSE_USER_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CHAIN, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_EAR, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_CHAIN, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INC_USER_EAR, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_COUNT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_CHAIN, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_USER_EAR, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_CHAIN, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAY_USER_EAR, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_USER_COUNT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXPIRE_USER_COUNT, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_COUNT, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_REPAY_USER_COUNT, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_CHAIN, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_EAR, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPAY_USER_RATE, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_REPAY_USER_RATE, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_LOSE_USER_COUNT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXP_LOSE_USER_COUNT, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(EXPIRE_LOSE_USER_RATE, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUM_EXP_LOSE_USER_RATE, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SILENT_USER_COUNT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 44 + __off, 1, __dbStmt);
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
        this.MGR_ADDR_ID = null;
    } else {
    this.MGR_ADDR_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MGR_ADDR_NAME = null;
    } else {
    this.MGR_ADDR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMUNITY_ID = null;
    } else {
    this.COMMUNITY_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMUNITY_NAME = null;
    } else {
    this.COMMUNITY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AREA_STD_ADDR_ID = null;
    } else {
    this.AREA_STD_ADDR_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AREA_STD_ADDR_NAME = null;
    } else {
    this.AREA_STD_ADDR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.USER_COUNT = null;
    } else {
    this.USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.USER_CHAIN = null;
    } else {
    this.USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.USER_EAR = null;
    } else {
    this.USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_USER_COUNT = null;
    } else {
    this.NEW_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_USER_CHAIN = null;
    } else {
    this.NEW_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_USER_EAR = null;
    } else {
    this.NEW_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_USER_COUNT = null;
    } else {
    this.LOSE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_LOSE_USER_COUNT = null;
    } else {
    this.CUM_LOSE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_USER_CHAIN = null;
    } else {
    this.LOSE_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_USER_EAR = null;
    } else {
    this.LOSE_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INC_USER_COUNT = null;
    } else {
    this.INC_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INC_USER_CHAIN = null;
    } else {
    this.INC_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INC_USER_EAR = null;
    } else {
    this.INC_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_USER_COUNT = null;
    } else {
    this.PAYMENT_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_USER_CHAIN = null;
    } else {
    this.PAYMENT_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_USER_EAR = null;
    } else {
    this.PAYMENT_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_USER_COUNT = null;
    } else {
    this.PAY_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_USER_CHAIN = null;
    } else {
    this.PAY_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAY_USER_EAR = null;
    } else {
    this.PAY_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXPIRE_USER_COUNT = null;
    } else {
    this.EXPIRE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_EXPIRE_USER_COUNT = null;
    } else {
    this.CUM_EXPIRE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPAY_USER_COUNT = null;
    } else {
    this.REPAY_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_REPAY_USER_COUNT = null;
    } else {
    this.CUM_REPAY_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPAY_USER_CHAIN = null;
    } else {
    this.REPAY_USER_CHAIN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPAY_USER_EAR = null;
    } else {
    this.REPAY_USER_EAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPAY_USER_RATE = null;
    } else {
    this.REPAY_USER_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_REPAY_USER_RATE = null;
    } else {
    this.CUM_REPAY_USER_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXPIRE_LOSE_USER_COUNT = null;
    } else {
    this.EXPIRE_LOSE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_EXP_LOSE_USER_COUNT = null;
    } else {
    this.CUM_EXP_LOSE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXPIRE_LOSE_USER_RATE = null;
    } else {
    this.EXPIRE_LOSE_USER_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUM_EXP_LOSE_USER_RATE = null;
    } else {
    this.CUM_EXP_LOSE_USER_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SILENT_USER_COUNT = null;
    } else {
    this.SILENT_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTIVE_USER_COUNT = null;
    } else {
    this.ACTIVE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.MGR_ADDR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_ADDR_ID);
    }
    if (null == this.MGR_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_ADDR_NAME);
    }
    if (null == this.COMMUNITY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMUNITY_ID);
    }
    if (null == this.COMMUNITY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMUNITY_NAME);
    }
    if (null == this.AREA_STD_ADDR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_STD_ADDR_ID);
    }
    if (null == this.AREA_STD_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_STD_ADDR_NAME);
    }
    if (null == this.USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_COUNT, __dataOut);
    }
    if (null == this.USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_CHAIN, __dataOut);
    }
    if (null == this.USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_EAR, __dataOut);
    }
    if (null == this.NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_COUNT, __dataOut);
    }
    if (null == this.NEW_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CHAIN, __dataOut);
    }
    if (null == this.NEW_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_EAR, __dataOut);
    }
    if (null == this.LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.LOSE_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CHAIN, __dataOut);
    }
    if (null == this.LOSE_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_EAR, __dataOut);
    }
    if (null == this.INC_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_COUNT, __dataOut);
    }
    if (null == this.INC_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_CHAIN, __dataOut);
    }
    if (null == this.INC_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_EAR, __dataOut);
    }
    if (null == this.PAYMENT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_CHAIN, __dataOut);
    }
    if (null == this.PAYMENT_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_EAR, __dataOut);
    }
    if (null == this.PAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_COUNT, __dataOut);
    }
    if (null == this.PAY_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_CHAIN, __dataOut);
    }
    if (null == this.PAY_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_EAR, __dataOut);
    }
    if (null == this.EXPIRE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_EXPIRE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXPIRE_USER_COUNT, __dataOut);
    }
    if (null == this.REPAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_REPAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_REPAY_USER_COUNT, __dataOut);
    }
    if (null == this.REPAY_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_CHAIN, __dataOut);
    }
    if (null == this.REPAY_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_EAR, __dataOut);
    }
    if (null == this.REPAY_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_RATE, __dataOut);
    }
    if (null == this.CUM_REPAY_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_REPAY_USER_RATE, __dataOut);
    }
    if (null == this.EXPIRE_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_EXP_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXP_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.EXPIRE_LOSE_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_LOSE_USER_RATE, __dataOut);
    }
    if (null == this.CUM_EXP_LOSE_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXP_LOSE_USER_RATE, __dataOut);
    }
    if (null == this.SILENT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SILENT_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
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
    if (null == this.MGR_ADDR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_ADDR_ID);
    }
    if (null == this.MGR_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_ADDR_NAME);
    }
    if (null == this.COMMUNITY_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMUNITY_ID);
    }
    if (null == this.COMMUNITY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMUNITY_NAME);
    }
    if (null == this.AREA_STD_ADDR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_STD_ADDR_ID);
    }
    if (null == this.AREA_STD_ADDR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AREA_STD_ADDR_NAME);
    }
    if (null == this.USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_COUNT, __dataOut);
    }
    if (null == this.USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_CHAIN, __dataOut);
    }
    if (null == this.USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_EAR, __dataOut);
    }
    if (null == this.NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_COUNT, __dataOut);
    }
    if (null == this.NEW_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CHAIN, __dataOut);
    }
    if (null == this.NEW_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_EAR, __dataOut);
    }
    if (null == this.LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.LOSE_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CHAIN, __dataOut);
    }
    if (null == this.LOSE_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_EAR, __dataOut);
    }
    if (null == this.INC_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_COUNT, __dataOut);
    }
    if (null == this.INC_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_CHAIN, __dataOut);
    }
    if (null == this.INC_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INC_USER_EAR, __dataOut);
    }
    if (null == this.PAYMENT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_CHAIN, __dataOut);
    }
    if (null == this.PAYMENT_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_USER_EAR, __dataOut);
    }
    if (null == this.PAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_COUNT, __dataOut);
    }
    if (null == this.PAY_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_CHAIN, __dataOut);
    }
    if (null == this.PAY_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAY_USER_EAR, __dataOut);
    }
    if (null == this.EXPIRE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_EXPIRE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXPIRE_USER_COUNT, __dataOut);
    }
    if (null == this.REPAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_REPAY_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_REPAY_USER_COUNT, __dataOut);
    }
    if (null == this.REPAY_USER_CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_CHAIN, __dataOut);
    }
    if (null == this.REPAY_USER_EAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_EAR, __dataOut);
    }
    if (null == this.REPAY_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPAY_USER_RATE, __dataOut);
    }
    if (null == this.CUM_REPAY_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_REPAY_USER_RATE, __dataOut);
    }
    if (null == this.EXPIRE_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.CUM_EXP_LOSE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXP_LOSE_USER_COUNT, __dataOut);
    }
    if (null == this.EXPIRE_LOSE_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EXPIRE_LOSE_USER_RATE, __dataOut);
    }
    if (null == this.CUM_EXP_LOSE_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUM_EXP_LOSE_USER_RATE, __dataOut);
    }
    if (null == this.SILENT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SILENT_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ADDR_ID==null?"null":MGR_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ADDR_NAME==null?"null":MGR_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMUNITY_ID==null?"null":COMMUNITY_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMUNITY_NAME==null?"null":COMMUNITY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_ID==null?"null":AREA_STD_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_NAME==null?"null":AREA_STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_COUNT==null?"null":USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_CHAIN==null?"null":USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_EAR==null?"null":USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_COUNT==null?"null":NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CHAIN==null?"null":NEW_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_EAR==null?"null":NEW_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_COUNT==null?"null":LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_LOSE_USER_COUNT==null?"null":CUM_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CHAIN==null?"null":LOSE_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_EAR==null?"null":LOSE_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_COUNT==null?"null":INC_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_CHAIN==null?"null":INC_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_EAR==null?"null":INC_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_COUNT==null?"null":PAYMENT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_CHAIN==null?"null":PAYMENT_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_EAR==null?"null":PAYMENT_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_COUNT==null?"null":PAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_CHAIN==null?"null":PAY_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_EAR==null?"null":PAY_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_USER_COUNT==null?"null":EXPIRE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXPIRE_USER_COUNT==null?"null":CUM_EXPIRE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_COUNT==null?"null":REPAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_REPAY_USER_COUNT==null?"null":CUM_REPAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_CHAIN==null?"null":REPAY_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_EAR==null?"null":REPAY_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_RATE==null?"null":REPAY_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_REPAY_USER_RATE==null?"null":CUM_REPAY_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_LOSE_USER_COUNT==null?"null":EXPIRE_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXP_LOSE_USER_COUNT==null?"null":CUM_EXP_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_LOSE_USER_RATE==null?"null":EXPIRE_LOSE_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXP_LOSE_USER_RATE==null?"null":CUM_EXP_LOSE_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SILENT_USER_COUNT==null?"null":SILENT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ADDR_ID==null?"null":MGR_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ADDR_NAME==null?"null":MGR_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMUNITY_ID==null?"null":COMMUNITY_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMUNITY_NAME==null?"null":COMMUNITY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_ID==null?"null":AREA_STD_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_NAME==null?"null":AREA_STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_COUNT==null?"null":USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_CHAIN==null?"null":USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_EAR==null?"null":USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_COUNT==null?"null":NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CHAIN==null?"null":NEW_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_EAR==null?"null":NEW_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_COUNT==null?"null":LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_LOSE_USER_COUNT==null?"null":CUM_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CHAIN==null?"null":LOSE_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_EAR==null?"null":LOSE_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_COUNT==null?"null":INC_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_CHAIN==null?"null":INC_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INC_USER_EAR==null?"null":INC_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_COUNT==null?"null":PAYMENT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_CHAIN==null?"null":PAYMENT_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_USER_EAR==null?"null":PAYMENT_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_COUNT==null?"null":PAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_CHAIN==null?"null":PAY_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_USER_EAR==null?"null":PAY_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_USER_COUNT==null?"null":EXPIRE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXPIRE_USER_COUNT==null?"null":CUM_EXPIRE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_COUNT==null?"null":REPAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_REPAY_USER_COUNT==null?"null":CUM_REPAY_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_CHAIN==null?"null":REPAY_USER_CHAIN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_EAR==null?"null":REPAY_USER_EAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPAY_USER_RATE==null?"null":REPAY_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_REPAY_USER_RATE==null?"null":CUM_REPAY_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_LOSE_USER_COUNT==null?"null":EXPIRE_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXP_LOSE_USER_COUNT==null?"null":CUM_EXP_LOSE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRE_LOSE_USER_RATE==null?"null":EXPIRE_LOSE_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUM_EXP_LOSE_USER_RATE==null?"null":CUM_EXP_LOSE_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SILENT_USER_COUNT==null?"null":SILENT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.MGR_ADDR_ID = null; } else {
      this.MGR_ADDR_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MGR_ADDR_NAME = null; } else {
      this.MGR_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.COMMUNITY_ID = null; } else {
      this.COMMUNITY_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.COMMUNITY_NAME = null; } else {
      this.COMMUNITY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.AREA_STD_ADDR_ID = null; } else {
      this.AREA_STD_ADDR_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.AREA_STD_ADDR_NAME = null; } else {
      this.AREA_STD_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_COUNT = null; } else {
      this.USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_CHAIN = null; } else {
      this.USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_EAR = null; } else {
      this.USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_COUNT = null; } else {
      this.NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CHAIN = null; } else {
      this.NEW_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_EAR = null; } else {
      this.NEW_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_COUNT = null; } else {
      this.LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_LOSE_USER_COUNT = null; } else {
      this.CUM_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CHAIN = null; } else {
      this.LOSE_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_EAR = null; } else {
      this.LOSE_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_COUNT = null; } else {
      this.INC_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_CHAIN = null; } else {
      this.INC_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_EAR = null; } else {
      this.INC_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_COUNT = null; } else {
      this.PAYMENT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_CHAIN = null; } else {
      this.PAYMENT_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_EAR = null; } else {
      this.PAYMENT_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_COUNT = null; } else {
      this.PAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_CHAIN = null; } else {
      this.PAY_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_EAR = null; } else {
      this.PAY_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_USER_COUNT = null; } else {
      this.EXPIRE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXPIRE_USER_COUNT = null; } else {
      this.CUM_EXPIRE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_COUNT = null; } else {
      this.REPAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_REPAY_USER_COUNT = null; } else {
      this.CUM_REPAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_CHAIN = null; } else {
      this.REPAY_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_EAR = null; } else {
      this.REPAY_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_RATE = null; } else {
      this.REPAY_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_REPAY_USER_RATE = null; } else {
      this.CUM_REPAY_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_LOSE_USER_COUNT = null; } else {
      this.EXPIRE_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXP_LOSE_USER_COUNT = null; } else {
      this.CUM_EXP_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_LOSE_USER_RATE = null; } else {
      this.EXPIRE_LOSE_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXP_LOSE_USER_RATE = null; } else {
      this.CUM_EXP_LOSE_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SILENT_USER_COUNT = null; } else {
      this.SILENT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.MGR_ADDR_ID = null; } else {
      this.MGR_ADDR_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MGR_ADDR_NAME = null; } else {
      this.MGR_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.COMMUNITY_ID = null; } else {
      this.COMMUNITY_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.COMMUNITY_NAME = null; } else {
      this.COMMUNITY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.AREA_STD_ADDR_ID = null; } else {
      this.AREA_STD_ADDR_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.AREA_STD_ADDR_NAME = null; } else {
      this.AREA_STD_ADDR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_COUNT = null; } else {
      this.USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_CHAIN = null; } else {
      this.USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.USER_EAR = null; } else {
      this.USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_COUNT = null; } else {
      this.NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CHAIN = null; } else {
      this.NEW_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_EAR = null; } else {
      this.NEW_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_COUNT = null; } else {
      this.LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_LOSE_USER_COUNT = null; } else {
      this.CUM_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CHAIN = null; } else {
      this.LOSE_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_EAR = null; } else {
      this.LOSE_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_COUNT = null; } else {
      this.INC_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_CHAIN = null; } else {
      this.INC_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.INC_USER_EAR = null; } else {
      this.INC_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_COUNT = null; } else {
      this.PAYMENT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_CHAIN = null; } else {
      this.PAYMENT_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_USER_EAR = null; } else {
      this.PAYMENT_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_COUNT = null; } else {
      this.PAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_CHAIN = null; } else {
      this.PAY_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAY_USER_EAR = null; } else {
      this.PAY_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_USER_COUNT = null; } else {
      this.EXPIRE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXPIRE_USER_COUNT = null; } else {
      this.CUM_EXPIRE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_COUNT = null; } else {
      this.REPAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_REPAY_USER_COUNT = null; } else {
      this.CUM_REPAY_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_CHAIN = null; } else {
      this.REPAY_USER_CHAIN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_EAR = null; } else {
      this.REPAY_USER_EAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.REPAY_USER_RATE = null; } else {
      this.REPAY_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_REPAY_USER_RATE = null; } else {
      this.CUM_REPAY_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_LOSE_USER_COUNT = null; } else {
      this.EXPIRE_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXP_LOSE_USER_COUNT = null; } else {
      this.CUM_EXP_LOSE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.EXPIRE_LOSE_USER_RATE = null; } else {
      this.EXPIRE_LOSE_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUM_EXP_LOSE_USER_RATE = null; } else {
      this.CUM_EXP_LOSE_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SILENT_USER_COUNT = null; } else {
      this.SILENT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
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
    st_user_dev_m o = (st_user_dev_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_user_dev_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("MGR_ADDR_ID", this.MGR_ADDR_ID);
    __sqoop$field_map.put("MGR_ADDR_NAME", this.MGR_ADDR_NAME);
    __sqoop$field_map.put("COMMUNITY_ID", this.COMMUNITY_ID);
    __sqoop$field_map.put("COMMUNITY_NAME", this.COMMUNITY_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("USER_COUNT", this.USER_COUNT);
    __sqoop$field_map.put("USER_CHAIN", this.USER_CHAIN);
    __sqoop$field_map.put("USER_EAR", this.USER_EAR);
    __sqoop$field_map.put("NEW_USER_COUNT", this.NEW_USER_COUNT);
    __sqoop$field_map.put("NEW_USER_CHAIN", this.NEW_USER_CHAIN);
    __sqoop$field_map.put("NEW_USER_EAR", this.NEW_USER_EAR);
    __sqoop$field_map.put("LOSE_USER_COUNT", this.LOSE_USER_COUNT);
    __sqoop$field_map.put("CUM_LOSE_USER_COUNT", this.CUM_LOSE_USER_COUNT);
    __sqoop$field_map.put("LOSE_USER_CHAIN", this.LOSE_USER_CHAIN);
    __sqoop$field_map.put("LOSE_USER_EAR", this.LOSE_USER_EAR);
    __sqoop$field_map.put("INC_USER_COUNT", this.INC_USER_COUNT);
    __sqoop$field_map.put("INC_USER_CHAIN", this.INC_USER_CHAIN);
    __sqoop$field_map.put("INC_USER_EAR", this.INC_USER_EAR);
    __sqoop$field_map.put("PAYMENT_USER_COUNT", this.PAYMENT_USER_COUNT);
    __sqoop$field_map.put("PAYMENT_USER_CHAIN", this.PAYMENT_USER_CHAIN);
    __sqoop$field_map.put("PAYMENT_USER_EAR", this.PAYMENT_USER_EAR);
    __sqoop$field_map.put("PAY_USER_COUNT", this.PAY_USER_COUNT);
    __sqoop$field_map.put("PAY_USER_CHAIN", this.PAY_USER_CHAIN);
    __sqoop$field_map.put("PAY_USER_EAR", this.PAY_USER_EAR);
    __sqoop$field_map.put("EXPIRE_USER_COUNT", this.EXPIRE_USER_COUNT);
    __sqoop$field_map.put("CUM_EXPIRE_USER_COUNT", this.CUM_EXPIRE_USER_COUNT);
    __sqoop$field_map.put("REPAY_USER_COUNT", this.REPAY_USER_COUNT);
    __sqoop$field_map.put("CUM_REPAY_USER_COUNT", this.CUM_REPAY_USER_COUNT);
    __sqoop$field_map.put("REPAY_USER_CHAIN", this.REPAY_USER_CHAIN);
    __sqoop$field_map.put("REPAY_USER_EAR", this.REPAY_USER_EAR);
    __sqoop$field_map.put("REPAY_USER_RATE", this.REPAY_USER_RATE);
    __sqoop$field_map.put("CUM_REPAY_USER_RATE", this.CUM_REPAY_USER_RATE);
    __sqoop$field_map.put("EXPIRE_LOSE_USER_COUNT", this.EXPIRE_LOSE_USER_COUNT);
    __sqoop$field_map.put("CUM_EXP_LOSE_USER_COUNT", this.CUM_EXP_LOSE_USER_COUNT);
    __sqoop$field_map.put("EXPIRE_LOSE_USER_RATE", this.EXPIRE_LOSE_USER_RATE);
    __sqoop$field_map.put("CUM_EXP_LOSE_USER_RATE", this.CUM_EXP_LOSE_USER_RATE);
    __sqoop$field_map.put("SILENT_USER_COUNT", this.SILENT_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("MGR_ADDR_ID", this.MGR_ADDR_ID);
    __sqoop$field_map.put("MGR_ADDR_NAME", this.MGR_ADDR_NAME);
    __sqoop$field_map.put("COMMUNITY_ID", this.COMMUNITY_ID);
    __sqoop$field_map.put("COMMUNITY_NAME", this.COMMUNITY_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("USER_COUNT", this.USER_COUNT);
    __sqoop$field_map.put("USER_CHAIN", this.USER_CHAIN);
    __sqoop$field_map.put("USER_EAR", this.USER_EAR);
    __sqoop$field_map.put("NEW_USER_COUNT", this.NEW_USER_COUNT);
    __sqoop$field_map.put("NEW_USER_CHAIN", this.NEW_USER_CHAIN);
    __sqoop$field_map.put("NEW_USER_EAR", this.NEW_USER_EAR);
    __sqoop$field_map.put("LOSE_USER_COUNT", this.LOSE_USER_COUNT);
    __sqoop$field_map.put("CUM_LOSE_USER_COUNT", this.CUM_LOSE_USER_COUNT);
    __sqoop$field_map.put("LOSE_USER_CHAIN", this.LOSE_USER_CHAIN);
    __sqoop$field_map.put("LOSE_USER_EAR", this.LOSE_USER_EAR);
    __sqoop$field_map.put("INC_USER_COUNT", this.INC_USER_COUNT);
    __sqoop$field_map.put("INC_USER_CHAIN", this.INC_USER_CHAIN);
    __sqoop$field_map.put("INC_USER_EAR", this.INC_USER_EAR);
    __sqoop$field_map.put("PAYMENT_USER_COUNT", this.PAYMENT_USER_COUNT);
    __sqoop$field_map.put("PAYMENT_USER_CHAIN", this.PAYMENT_USER_CHAIN);
    __sqoop$field_map.put("PAYMENT_USER_EAR", this.PAYMENT_USER_EAR);
    __sqoop$field_map.put("PAY_USER_COUNT", this.PAY_USER_COUNT);
    __sqoop$field_map.put("PAY_USER_CHAIN", this.PAY_USER_CHAIN);
    __sqoop$field_map.put("PAY_USER_EAR", this.PAY_USER_EAR);
    __sqoop$field_map.put("EXPIRE_USER_COUNT", this.EXPIRE_USER_COUNT);
    __sqoop$field_map.put("CUM_EXPIRE_USER_COUNT", this.CUM_EXPIRE_USER_COUNT);
    __sqoop$field_map.put("REPAY_USER_COUNT", this.REPAY_USER_COUNT);
    __sqoop$field_map.put("CUM_REPAY_USER_COUNT", this.CUM_REPAY_USER_COUNT);
    __sqoop$field_map.put("REPAY_USER_CHAIN", this.REPAY_USER_CHAIN);
    __sqoop$field_map.put("REPAY_USER_EAR", this.REPAY_USER_EAR);
    __sqoop$field_map.put("REPAY_USER_RATE", this.REPAY_USER_RATE);
    __sqoop$field_map.put("CUM_REPAY_USER_RATE", this.CUM_REPAY_USER_RATE);
    __sqoop$field_map.put("EXPIRE_LOSE_USER_COUNT", this.EXPIRE_LOSE_USER_COUNT);
    __sqoop$field_map.put("CUM_EXP_LOSE_USER_COUNT", this.CUM_EXP_LOSE_USER_COUNT);
    __sqoop$field_map.put("EXPIRE_LOSE_USER_RATE", this.EXPIRE_LOSE_USER_RATE);
    __sqoop$field_map.put("CUM_EXP_LOSE_USER_RATE", this.CUM_EXP_LOSE_USER_RATE);
    __sqoop$field_map.put("SILENT_USER_COUNT", this.SILENT_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
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
    else    if ("MGR_ADDR_ID".equals(__fieldName)) {
      this.MGR_ADDR_ID = (String) __fieldVal;
    }
    else    if ("MGR_ADDR_NAME".equals(__fieldName)) {
      this.MGR_ADDR_NAME = (String) __fieldVal;
    }
    else    if ("COMMUNITY_ID".equals(__fieldName)) {
      this.COMMUNITY_ID = (String) __fieldVal;
    }
    else    if ("COMMUNITY_NAME".equals(__fieldName)) {
      this.COMMUNITY_NAME = (String) __fieldVal;
    }
    else    if ("AREA_STD_ADDR_ID".equals(__fieldName)) {
      this.AREA_STD_ADDR_ID = (String) __fieldVal;
    }
    else    if ("AREA_STD_ADDR_NAME".equals(__fieldName)) {
      this.AREA_STD_ADDR_NAME = (String) __fieldVal;
    }
    else    if ("USER_COUNT".equals(__fieldName)) {
      this.USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("USER_CHAIN".equals(__fieldName)) {
      this.USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("USER_EAR".equals(__fieldName)) {
      this.USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_USER_COUNT".equals(__fieldName)) {
      this.NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_USER_CHAIN".equals(__fieldName)) {
      this.NEW_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_USER_EAR".equals(__fieldName)) {
      this.NEW_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_USER_COUNT".equals(__fieldName)) {
      this.LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_LOSE_USER_COUNT".equals(__fieldName)) {
      this.CUM_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_USER_CHAIN".equals(__fieldName)) {
      this.LOSE_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_USER_EAR".equals(__fieldName)) {
      this.LOSE_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INC_USER_COUNT".equals(__fieldName)) {
      this.INC_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INC_USER_CHAIN".equals(__fieldName)) {
      this.INC_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INC_USER_EAR".equals(__fieldName)) {
      this.INC_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_USER_COUNT".equals(__fieldName)) {
      this.PAYMENT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_USER_CHAIN".equals(__fieldName)) {
      this.PAYMENT_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_USER_EAR".equals(__fieldName)) {
      this.PAYMENT_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAY_USER_COUNT".equals(__fieldName)) {
      this.PAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAY_USER_CHAIN".equals(__fieldName)) {
      this.PAY_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAY_USER_EAR".equals(__fieldName)) {
      this.PAY_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXPIRE_USER_COUNT".equals(__fieldName)) {
      this.EXPIRE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_EXPIRE_USER_COUNT".equals(__fieldName)) {
      this.CUM_EXPIRE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REPAY_USER_COUNT".equals(__fieldName)) {
      this.REPAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_REPAY_USER_COUNT".equals(__fieldName)) {
      this.CUM_REPAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REPAY_USER_CHAIN".equals(__fieldName)) {
      this.REPAY_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REPAY_USER_EAR".equals(__fieldName)) {
      this.REPAY_USER_EAR = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REPAY_USER_RATE".equals(__fieldName)) {
      this.REPAY_USER_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_REPAY_USER_RATE".equals(__fieldName)) {
      this.CUM_REPAY_USER_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXPIRE_LOSE_USER_COUNT".equals(__fieldName)) {
      this.EXPIRE_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_EXP_LOSE_USER_COUNT".equals(__fieldName)) {
      this.CUM_EXP_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("EXPIRE_LOSE_USER_RATE".equals(__fieldName)) {
      this.EXPIRE_LOSE_USER_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUM_EXP_LOSE_USER_RATE".equals(__fieldName)) {
      this.CUM_EXP_LOSE_USER_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SILENT_USER_COUNT".equals(__fieldName)) {
      this.SILENT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("MGR_ADDR_ID".equals(__fieldName)) {
      this.MGR_ADDR_ID = (String) __fieldVal;
      return true;
    }
    else    if ("MGR_ADDR_NAME".equals(__fieldName)) {
      this.MGR_ADDR_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("COMMUNITY_ID".equals(__fieldName)) {
      this.COMMUNITY_ID = (String) __fieldVal;
      return true;
    }
    else    if ("COMMUNITY_NAME".equals(__fieldName)) {
      this.COMMUNITY_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("AREA_STD_ADDR_ID".equals(__fieldName)) {
      this.AREA_STD_ADDR_ID = (String) __fieldVal;
      return true;
    }
    else    if ("AREA_STD_ADDR_NAME".equals(__fieldName)) {
      this.AREA_STD_ADDR_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("USER_COUNT".equals(__fieldName)) {
      this.USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("USER_CHAIN".equals(__fieldName)) {
      this.USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("USER_EAR".equals(__fieldName)) {
      this.USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_USER_COUNT".equals(__fieldName)) {
      this.NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_USER_CHAIN".equals(__fieldName)) {
      this.NEW_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_USER_EAR".equals(__fieldName)) {
      this.NEW_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_USER_COUNT".equals(__fieldName)) {
      this.LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_LOSE_USER_COUNT".equals(__fieldName)) {
      this.CUM_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_USER_CHAIN".equals(__fieldName)) {
      this.LOSE_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_USER_EAR".equals(__fieldName)) {
      this.LOSE_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INC_USER_COUNT".equals(__fieldName)) {
      this.INC_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INC_USER_CHAIN".equals(__fieldName)) {
      this.INC_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("INC_USER_EAR".equals(__fieldName)) {
      this.INC_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_USER_COUNT".equals(__fieldName)) {
      this.PAYMENT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_USER_CHAIN".equals(__fieldName)) {
      this.PAYMENT_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_USER_EAR".equals(__fieldName)) {
      this.PAYMENT_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAY_USER_COUNT".equals(__fieldName)) {
      this.PAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAY_USER_CHAIN".equals(__fieldName)) {
      this.PAY_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAY_USER_EAR".equals(__fieldName)) {
      this.PAY_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXPIRE_USER_COUNT".equals(__fieldName)) {
      this.EXPIRE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_EXPIRE_USER_COUNT".equals(__fieldName)) {
      this.CUM_EXPIRE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REPAY_USER_COUNT".equals(__fieldName)) {
      this.REPAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_REPAY_USER_COUNT".equals(__fieldName)) {
      this.CUM_REPAY_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REPAY_USER_CHAIN".equals(__fieldName)) {
      this.REPAY_USER_CHAIN = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REPAY_USER_EAR".equals(__fieldName)) {
      this.REPAY_USER_EAR = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REPAY_USER_RATE".equals(__fieldName)) {
      this.REPAY_USER_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_REPAY_USER_RATE".equals(__fieldName)) {
      this.CUM_REPAY_USER_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXPIRE_LOSE_USER_COUNT".equals(__fieldName)) {
      this.EXPIRE_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_EXP_LOSE_USER_COUNT".equals(__fieldName)) {
      this.CUM_EXP_LOSE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("EXPIRE_LOSE_USER_RATE".equals(__fieldName)) {
      this.EXPIRE_LOSE_USER_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUM_EXP_LOSE_USER_RATE".equals(__fieldName)) {
      this.CUM_EXP_LOSE_USER_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SILENT_USER_COUNT".equals(__fieldName)) {
      this.SILENT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
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
