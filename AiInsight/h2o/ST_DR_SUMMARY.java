// ORM class for table 'ST_DR_SUMMARY'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Aug 13 18:34:44 CST 2019
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

public class ST_DR_SUMMARY extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_DR_SUMMARY with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_DR_SUMMARY with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
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
  public ST_DR_SUMMARY with_TOTAL_USER_COUNT(java.math.BigDecimal TOTAL_USER_COUNT) {
    this.TOTAL_USER_COUNT = TOTAL_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal ACTIVE_USER_COUNT;
  public java.math.BigDecimal get_ACTIVE_USER_COUNT() {
    return ACTIVE_USER_COUNT;
  }
  public void set_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
  }
  public ST_DR_SUMMARY with_ACTIVE_USER_COUNT(java.math.BigDecimal ACTIVE_USER_COUNT) {
    this.ACTIVE_USER_COUNT = ACTIVE_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DORMANT_USER_COUNT;
  public java.math.BigDecimal get_DORMANT_USER_COUNT() {
    return DORMANT_USER_COUNT;
  }
  public void set_DORMANT_USER_COUNT(java.math.BigDecimal DORMANT_USER_COUNT) {
    this.DORMANT_USER_COUNT = DORMANT_USER_COUNT;
  }
  public ST_DR_SUMMARY with_DORMANT_USER_COUNT(java.math.BigDecimal DORMANT_USER_COUNT) {
    this.DORMANT_USER_COUNT = DORMANT_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_NEW_USER_COUNT;
  public java.math.BigDecimal get_DR_NEW_USER_COUNT() {
    return DR_NEW_USER_COUNT;
  }
  public void set_DR_NEW_USER_COUNT(java.math.BigDecimal DR_NEW_USER_COUNT) {
    this.DR_NEW_USER_COUNT = DR_NEW_USER_COUNT;
  }
  public ST_DR_SUMMARY with_DR_NEW_USER_COUNT(java.math.BigDecimal DR_NEW_USER_COUNT) {
    this.DR_NEW_USER_COUNT = DR_NEW_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_BACK_USER_COUNT;
  public java.math.BigDecimal get_DR_BACK_USER_COUNT() {
    return DR_BACK_USER_COUNT;
  }
  public void set_DR_BACK_USER_COUNT(java.math.BigDecimal DR_BACK_USER_COUNT) {
    this.DR_BACK_USER_COUNT = DR_BACK_USER_COUNT;
  }
  public ST_DR_SUMMARY with_DR_BACK_USER_COUNT(java.math.BigDecimal DR_BACK_USER_COUNT) {
    this.DR_BACK_USER_COUNT = DR_BACK_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_USER_COUNT;
  public java.math.BigDecimal get_DR_USER_COUNT() {
    return DR_USER_COUNT;
  }
  public void set_DR_USER_COUNT(java.math.BigDecimal DR_USER_COUNT) {
    this.DR_USER_COUNT = DR_USER_COUNT;
  }
  public ST_DR_SUMMARY with_DR_USER_COUNT(java.math.BigDecimal DR_USER_COUNT) {
    this.DR_USER_COUNT = DR_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_USER_PRO;
  public java.math.BigDecimal get_DR_USER_PRO() {
    return DR_USER_PRO;
  }
  public void set_DR_USER_PRO(java.math.BigDecimal DR_USER_PRO) {
    this.DR_USER_PRO = DR_USER_PRO;
  }
  public ST_DR_SUMMARY with_DR_USER_PRO(java.math.BigDecimal DR_USER_PRO) {
    this.DR_USER_PRO = DR_USER_PRO;
    return this;
  }
  private java.math.BigDecimal DR_COUNT;
  public java.math.BigDecimal get_DR_COUNT() {
    return DR_COUNT;
  }
  public void set_DR_COUNT(java.math.BigDecimal DR_COUNT) {
    this.DR_COUNT = DR_COUNT;
  }
  public ST_DR_SUMMARY with_DR_COUNT(java.math.BigDecimal DR_COUNT) {
    this.DR_COUNT = DR_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_PER_COUNT;
  public java.math.BigDecimal get_DR_PER_COUNT() {
    return DR_PER_COUNT;
  }
  public void set_DR_PER_COUNT(java.math.BigDecimal DR_PER_COUNT) {
    this.DR_PER_COUNT = DR_PER_COUNT;
  }
  public ST_DR_SUMMARY with_DR_PER_COUNT(java.math.BigDecimal DR_PER_COUNT) {
    this.DR_PER_COUNT = DR_PER_COUNT;
    return this;
  }
  private java.math.BigDecimal DR_YEAR_GROWTH;
  public java.math.BigDecimal get_DR_YEAR_GROWTH() {
    return DR_YEAR_GROWTH;
  }
  public void set_DR_YEAR_GROWTH(java.math.BigDecimal DR_YEAR_GROWTH) {
    this.DR_YEAR_GROWTH = DR_YEAR_GROWTH;
  }
  public ST_DR_SUMMARY with_DR_YEAR_GROWTH(java.math.BigDecimal DR_YEAR_GROWTH) {
    this.DR_YEAR_GROWTH = DR_YEAR_GROWTH;
    return this;
  }
  private java.math.BigDecimal DR_MONTH_GROWTH;
  public java.math.BigDecimal get_DR_MONTH_GROWTH() {
    return DR_MONTH_GROWTH;
  }
  public void set_DR_MONTH_GROWTH(java.math.BigDecimal DR_MONTH_GROWTH) {
    this.DR_MONTH_GROWTH = DR_MONTH_GROWTH;
  }
  public ST_DR_SUMMARY with_DR_MONTH_GROWTH(java.math.BigDecimal DR_MONTH_GROWTH) {
    this.DR_MONTH_GROWTH = DR_MONTH_GROWTH;
    return this;
  }
  private java.math.BigDecimal DR_PER_YEAR_GROWTH;
  public java.math.BigDecimal get_DR_PER_YEAR_GROWTH() {
    return DR_PER_YEAR_GROWTH;
  }
  public void set_DR_PER_YEAR_GROWTH(java.math.BigDecimal DR_PER_YEAR_GROWTH) {
    this.DR_PER_YEAR_GROWTH = DR_PER_YEAR_GROWTH;
  }
  public ST_DR_SUMMARY with_DR_PER_YEAR_GROWTH(java.math.BigDecimal DR_PER_YEAR_GROWTH) {
    this.DR_PER_YEAR_GROWTH = DR_PER_YEAR_GROWTH;
    return this;
  }
  private java.math.BigDecimal DR_PER_MONTH_GROWTH;
  public java.math.BigDecimal get_DR_PER_MONTH_GROWTH() {
    return DR_PER_MONTH_GROWTH;
  }
  public void set_DR_PER_MONTH_GROWTH(java.math.BigDecimal DR_PER_MONTH_GROWTH) {
    this.DR_PER_MONTH_GROWTH = DR_PER_MONTH_GROWTH;
  }
  public ST_DR_SUMMARY with_DR_PER_MONTH_GROWTH(java.math.BigDecimal DR_PER_MONTH_GROWTH) {
    this.DR_PER_MONTH_GROWTH = DR_PER_MONTH_GROWTH;
    return this;
  }
  private java.math.BigDecimal LB_NEW_USER_COUNT;
  public java.math.BigDecimal get_LB_NEW_USER_COUNT() {
    return LB_NEW_USER_COUNT;
  }
  public void set_LB_NEW_USER_COUNT(java.math.BigDecimal LB_NEW_USER_COUNT) {
    this.LB_NEW_USER_COUNT = LB_NEW_USER_COUNT;
  }
  public ST_DR_SUMMARY with_LB_NEW_USER_COUNT(java.math.BigDecimal LB_NEW_USER_COUNT) {
    this.LB_NEW_USER_COUNT = LB_NEW_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal LB_BACK_USER_COUNT;
  public java.math.BigDecimal get_LB_BACK_USER_COUNT() {
    return LB_BACK_USER_COUNT;
  }
  public void set_LB_BACK_USER_COUNT(java.math.BigDecimal LB_BACK_USER_COUNT) {
    this.LB_BACK_USER_COUNT = LB_BACK_USER_COUNT;
  }
  public ST_DR_SUMMARY with_LB_BACK_USER_COUNT(java.math.BigDecimal LB_BACK_USER_COUNT) {
    this.LB_BACK_USER_COUNT = LB_BACK_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal LB_USER_COUNT;
  public java.math.BigDecimal get_LB_USER_COUNT() {
    return LB_USER_COUNT;
  }
  public void set_LB_USER_COUNT(java.math.BigDecimal LB_USER_COUNT) {
    this.LB_USER_COUNT = LB_USER_COUNT;
  }
  public ST_DR_SUMMARY with_LB_USER_COUNT(java.math.BigDecimal LB_USER_COUNT) {
    this.LB_USER_COUNT = LB_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal LB_USER_PRO;
  public java.math.BigDecimal get_LB_USER_PRO() {
    return LB_USER_PRO;
  }
  public void set_LB_USER_PRO(java.math.BigDecimal LB_USER_PRO) {
    this.LB_USER_PRO = LB_USER_PRO;
  }
  public ST_DR_SUMMARY with_LB_USER_PRO(java.math.BigDecimal LB_USER_PRO) {
    this.LB_USER_PRO = LB_USER_PRO;
    return this;
  }
  private java.math.BigDecimal LB_COUNT;
  public java.math.BigDecimal get_LB_COUNT() {
    return LB_COUNT;
  }
  public void set_LB_COUNT(java.math.BigDecimal LB_COUNT) {
    this.LB_COUNT = LB_COUNT;
  }
  public ST_DR_SUMMARY with_LB_COUNT(java.math.BigDecimal LB_COUNT) {
    this.LB_COUNT = LB_COUNT;
    return this;
  }
  private java.math.BigDecimal LB_PER_COUNT;
  public java.math.BigDecimal get_LB_PER_COUNT() {
    return LB_PER_COUNT;
  }
  public void set_LB_PER_COUNT(java.math.BigDecimal LB_PER_COUNT) {
    this.LB_PER_COUNT = LB_PER_COUNT;
  }
  public ST_DR_SUMMARY with_LB_PER_COUNT(java.math.BigDecimal LB_PER_COUNT) {
    this.LB_PER_COUNT = LB_PER_COUNT;
    return this;
  }
  private java.math.BigDecimal LB_YEAR_GROWTH;
  public java.math.BigDecimal get_LB_YEAR_GROWTH() {
    return LB_YEAR_GROWTH;
  }
  public void set_LB_YEAR_GROWTH(java.math.BigDecimal LB_YEAR_GROWTH) {
    this.LB_YEAR_GROWTH = LB_YEAR_GROWTH;
  }
  public ST_DR_SUMMARY with_LB_YEAR_GROWTH(java.math.BigDecimal LB_YEAR_GROWTH) {
    this.LB_YEAR_GROWTH = LB_YEAR_GROWTH;
    return this;
  }
  private java.math.BigDecimal LB_MONTH_GROWTH;
  public java.math.BigDecimal get_LB_MONTH_GROWTH() {
    return LB_MONTH_GROWTH;
  }
  public void set_LB_MONTH_GROWTH(java.math.BigDecimal LB_MONTH_GROWTH) {
    this.LB_MONTH_GROWTH = LB_MONTH_GROWTH;
  }
  public ST_DR_SUMMARY with_LB_MONTH_GROWTH(java.math.BigDecimal LB_MONTH_GROWTH) {
    this.LB_MONTH_GROWTH = LB_MONTH_GROWTH;
    return this;
  }
  private java.math.BigDecimal LB_PER_YEAR_TROWTH;
  public java.math.BigDecimal get_LB_PER_YEAR_TROWTH() {
    return LB_PER_YEAR_TROWTH;
  }
  public void set_LB_PER_YEAR_TROWTH(java.math.BigDecimal LB_PER_YEAR_TROWTH) {
    this.LB_PER_YEAR_TROWTH = LB_PER_YEAR_TROWTH;
  }
  public ST_DR_SUMMARY with_LB_PER_YEAR_TROWTH(java.math.BigDecimal LB_PER_YEAR_TROWTH) {
    this.LB_PER_YEAR_TROWTH = LB_PER_YEAR_TROWTH;
    return this;
  }
  private java.math.BigDecimal LB_PER_MONTH_TROWTH;
  public java.math.BigDecimal get_LB_PER_MONTH_TROWTH() {
    return LB_PER_MONTH_TROWTH;
  }
  public void set_LB_PER_MONTH_TROWTH(java.math.BigDecimal LB_PER_MONTH_TROWTH) {
    this.LB_PER_MONTH_TROWTH = LB_PER_MONTH_TROWTH;
  }
  public ST_DR_SUMMARY with_LB_PER_MONTH_TROWTH(java.math.BigDecimal LB_PER_MONTH_TROWTH) {
    this.LB_PER_MONTH_TROWTH = LB_PER_MONTH_TROWTH;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_DR_SUMMARY with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_DR_SUMMARY with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DR_SUMMARY)) {
      return false;
    }
    ST_DR_SUMMARY that = (ST_DR_SUMMARY) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TOTAL_USER_COUNT == null ? that.TOTAL_USER_COUNT == null : this.TOTAL_USER_COUNT.equals(that.TOTAL_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.DORMANT_USER_COUNT == null ? that.DORMANT_USER_COUNT == null : this.DORMANT_USER_COUNT.equals(that.DORMANT_USER_COUNT));
    equal = equal && (this.DR_NEW_USER_COUNT == null ? that.DR_NEW_USER_COUNT == null : this.DR_NEW_USER_COUNT.equals(that.DR_NEW_USER_COUNT));
    equal = equal && (this.DR_BACK_USER_COUNT == null ? that.DR_BACK_USER_COUNT == null : this.DR_BACK_USER_COUNT.equals(that.DR_BACK_USER_COUNT));
    equal = equal && (this.DR_USER_COUNT == null ? that.DR_USER_COUNT == null : this.DR_USER_COUNT.equals(that.DR_USER_COUNT));
    equal = equal && (this.DR_USER_PRO == null ? that.DR_USER_PRO == null : this.DR_USER_PRO.equals(that.DR_USER_PRO));
    equal = equal && (this.DR_COUNT == null ? that.DR_COUNT == null : this.DR_COUNT.equals(that.DR_COUNT));
    equal = equal && (this.DR_PER_COUNT == null ? that.DR_PER_COUNT == null : this.DR_PER_COUNT.equals(that.DR_PER_COUNT));
    equal = equal && (this.DR_YEAR_GROWTH == null ? that.DR_YEAR_GROWTH == null : this.DR_YEAR_GROWTH.equals(that.DR_YEAR_GROWTH));
    equal = equal && (this.DR_MONTH_GROWTH == null ? that.DR_MONTH_GROWTH == null : this.DR_MONTH_GROWTH.equals(that.DR_MONTH_GROWTH));
    equal = equal && (this.DR_PER_YEAR_GROWTH == null ? that.DR_PER_YEAR_GROWTH == null : this.DR_PER_YEAR_GROWTH.equals(that.DR_PER_YEAR_GROWTH));
    equal = equal && (this.DR_PER_MONTH_GROWTH == null ? that.DR_PER_MONTH_GROWTH == null : this.DR_PER_MONTH_GROWTH.equals(that.DR_PER_MONTH_GROWTH));
    equal = equal && (this.LB_NEW_USER_COUNT == null ? that.LB_NEW_USER_COUNT == null : this.LB_NEW_USER_COUNT.equals(that.LB_NEW_USER_COUNT));
    equal = equal && (this.LB_BACK_USER_COUNT == null ? that.LB_BACK_USER_COUNT == null : this.LB_BACK_USER_COUNT.equals(that.LB_BACK_USER_COUNT));
    equal = equal && (this.LB_USER_COUNT == null ? that.LB_USER_COUNT == null : this.LB_USER_COUNT.equals(that.LB_USER_COUNT));
    equal = equal && (this.LB_USER_PRO == null ? that.LB_USER_PRO == null : this.LB_USER_PRO.equals(that.LB_USER_PRO));
    equal = equal && (this.LB_COUNT == null ? that.LB_COUNT == null : this.LB_COUNT.equals(that.LB_COUNT));
    equal = equal && (this.LB_PER_COUNT == null ? that.LB_PER_COUNT == null : this.LB_PER_COUNT.equals(that.LB_PER_COUNT));
    equal = equal && (this.LB_YEAR_GROWTH == null ? that.LB_YEAR_GROWTH == null : this.LB_YEAR_GROWTH.equals(that.LB_YEAR_GROWTH));
    equal = equal && (this.LB_MONTH_GROWTH == null ? that.LB_MONTH_GROWTH == null : this.LB_MONTH_GROWTH.equals(that.LB_MONTH_GROWTH));
    equal = equal && (this.LB_PER_YEAR_TROWTH == null ? that.LB_PER_YEAR_TROWTH == null : this.LB_PER_YEAR_TROWTH.equals(that.LB_PER_YEAR_TROWTH));
    equal = equal && (this.LB_PER_MONTH_TROWTH == null ? that.LB_PER_MONTH_TROWTH == null : this.LB_PER_MONTH_TROWTH.equals(that.LB_PER_MONTH_TROWTH));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_DR_SUMMARY)) {
      return false;
    }
    ST_DR_SUMMARY that = (ST_DR_SUMMARY) o;
    boolean equal = true;
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.TOTAL_USER_COUNT == null ? that.TOTAL_USER_COUNT == null : this.TOTAL_USER_COUNT.equals(that.TOTAL_USER_COUNT));
    equal = equal && (this.ACTIVE_USER_COUNT == null ? that.ACTIVE_USER_COUNT == null : this.ACTIVE_USER_COUNT.equals(that.ACTIVE_USER_COUNT));
    equal = equal && (this.DORMANT_USER_COUNT == null ? that.DORMANT_USER_COUNT == null : this.DORMANT_USER_COUNT.equals(that.DORMANT_USER_COUNT));
    equal = equal && (this.DR_NEW_USER_COUNT == null ? that.DR_NEW_USER_COUNT == null : this.DR_NEW_USER_COUNT.equals(that.DR_NEW_USER_COUNT));
    equal = equal && (this.DR_BACK_USER_COUNT == null ? that.DR_BACK_USER_COUNT == null : this.DR_BACK_USER_COUNT.equals(that.DR_BACK_USER_COUNT));
    equal = equal && (this.DR_USER_COUNT == null ? that.DR_USER_COUNT == null : this.DR_USER_COUNT.equals(that.DR_USER_COUNT));
    equal = equal && (this.DR_USER_PRO == null ? that.DR_USER_PRO == null : this.DR_USER_PRO.equals(that.DR_USER_PRO));
    equal = equal && (this.DR_COUNT == null ? that.DR_COUNT == null : this.DR_COUNT.equals(that.DR_COUNT));
    equal = equal && (this.DR_PER_COUNT == null ? that.DR_PER_COUNT == null : this.DR_PER_COUNT.equals(that.DR_PER_COUNT));
    equal = equal && (this.DR_YEAR_GROWTH == null ? that.DR_YEAR_GROWTH == null : this.DR_YEAR_GROWTH.equals(that.DR_YEAR_GROWTH));
    equal = equal && (this.DR_MONTH_GROWTH == null ? that.DR_MONTH_GROWTH == null : this.DR_MONTH_GROWTH.equals(that.DR_MONTH_GROWTH));
    equal = equal && (this.DR_PER_YEAR_GROWTH == null ? that.DR_PER_YEAR_GROWTH == null : this.DR_PER_YEAR_GROWTH.equals(that.DR_PER_YEAR_GROWTH));
    equal = equal && (this.DR_PER_MONTH_GROWTH == null ? that.DR_PER_MONTH_GROWTH == null : this.DR_PER_MONTH_GROWTH.equals(that.DR_PER_MONTH_GROWTH));
    equal = equal && (this.LB_NEW_USER_COUNT == null ? that.LB_NEW_USER_COUNT == null : this.LB_NEW_USER_COUNT.equals(that.LB_NEW_USER_COUNT));
    equal = equal && (this.LB_BACK_USER_COUNT == null ? that.LB_BACK_USER_COUNT == null : this.LB_BACK_USER_COUNT.equals(that.LB_BACK_USER_COUNT));
    equal = equal && (this.LB_USER_COUNT == null ? that.LB_USER_COUNT == null : this.LB_USER_COUNT.equals(that.LB_USER_COUNT));
    equal = equal && (this.LB_USER_PRO == null ? that.LB_USER_PRO == null : this.LB_USER_PRO.equals(that.LB_USER_PRO));
    equal = equal && (this.LB_COUNT == null ? that.LB_COUNT == null : this.LB_COUNT.equals(that.LB_COUNT));
    equal = equal && (this.LB_PER_COUNT == null ? that.LB_PER_COUNT == null : this.LB_PER_COUNT.equals(that.LB_PER_COUNT));
    equal = equal && (this.LB_YEAR_GROWTH == null ? that.LB_YEAR_GROWTH == null : this.LB_YEAR_GROWTH.equals(that.LB_YEAR_GROWTH));
    equal = equal && (this.LB_MONTH_GROWTH == null ? that.LB_MONTH_GROWTH == null : this.LB_MONTH_GROWTH.equals(that.LB_MONTH_GROWTH));
    equal = equal && (this.LB_PER_YEAR_TROWTH == null ? that.LB_PER_YEAR_TROWTH == null : this.LB_PER_YEAR_TROWTH.equals(that.LB_PER_YEAR_TROWTH));
    equal = equal && (this.LB_PER_MONTH_TROWTH == null ? that.LB_PER_MONTH_TROWTH == null : this.LB_PER_MONTH_TROWTH.equals(that.LB_PER_MONTH_TROWTH));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TOTAL_USER_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DORMANT_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DR_NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DR_BACK_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.DR_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.DR_USER_PRO = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DR_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.DR_PER_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.DR_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DR_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.DR_PER_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DR_PER_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LB_NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.LB_BACK_USER_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.LB_USER_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LB_USER_PRO = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.LB_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.LB_PER_COUNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.LB_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.LB_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.LB_PER_YEAR_TROWTH = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.LB_PER_MONTH_TROWTH = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TOTAL_USER_COUNT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ACTIVE_USER_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DORMANT_USER_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DR_NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.DR_BACK_USER_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.DR_USER_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.DR_USER_PRO = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.DR_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.DR_PER_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.DR_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DR_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.DR_PER_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DR_PER_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LB_NEW_USER_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.LB_BACK_USER_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.LB_USER_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LB_USER_PRO = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.LB_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.LB_PER_COUNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.LB_YEAR_GROWTH = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.LB_MONTH_GROWTH = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.LB_PER_YEAR_TROWTH = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.LB_PER_MONTH_TROWTH = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(27, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(TOTAL_USER_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DORMANT_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_NEW_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_BACK_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_USER_PRO, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_YEAR_GROWTH, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_MONTH_GROWTH, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_YEAR_GROWTH, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_MONTH_GROWTH, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_NEW_USER_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_BACK_USER_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_USER_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_USER_PRO, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_COUNT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_YEAR_GROWTH, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_MONTH_GROWTH, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_YEAR_TROWTH, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_MONTH_TROWTH, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 27 + __off, 1, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_USER_COUNT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ACTIVE_USER_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DORMANT_USER_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_NEW_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_BACK_USER_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_USER_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_USER_PRO, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_YEAR_GROWTH, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_MONTH_GROWTH, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_YEAR_GROWTH, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DR_PER_MONTH_GROWTH, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_NEW_USER_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_BACK_USER_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_USER_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_USER_PRO, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_COUNT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_YEAR_GROWTH, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_MONTH_GROWTH, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_YEAR_TROWTH, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LB_PER_MONTH_TROWTH, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 27 + __off, 1, __dbStmt);
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
        this.TOTAL_USER_COUNT = null;
    } else {
    this.TOTAL_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTIVE_USER_COUNT = null;
    } else {
    this.ACTIVE_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DORMANT_USER_COUNT = null;
    } else {
    this.DORMANT_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_NEW_USER_COUNT = null;
    } else {
    this.DR_NEW_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_BACK_USER_COUNT = null;
    } else {
    this.DR_BACK_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_USER_COUNT = null;
    } else {
    this.DR_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_USER_PRO = null;
    } else {
    this.DR_USER_PRO = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_COUNT = null;
    } else {
    this.DR_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_PER_COUNT = null;
    } else {
    this.DR_PER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_YEAR_GROWTH = null;
    } else {
    this.DR_YEAR_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_MONTH_GROWTH = null;
    } else {
    this.DR_MONTH_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_PER_YEAR_GROWTH = null;
    } else {
    this.DR_PER_YEAR_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DR_PER_MONTH_GROWTH = null;
    } else {
    this.DR_PER_MONTH_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_NEW_USER_COUNT = null;
    } else {
    this.LB_NEW_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_BACK_USER_COUNT = null;
    } else {
    this.LB_BACK_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_USER_COUNT = null;
    } else {
    this.LB_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_USER_PRO = null;
    } else {
    this.LB_USER_PRO = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_COUNT = null;
    } else {
    this.LB_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_PER_COUNT = null;
    } else {
    this.LB_PER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_YEAR_GROWTH = null;
    } else {
    this.LB_YEAR_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_MONTH_GROWTH = null;
    } else {
    this.LB_MONTH_GROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_PER_YEAR_TROWTH = null;
    } else {
    this.LB_PER_YEAR_TROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LB_PER_MONTH_TROWTH = null;
    } else {
    this.LB_PER_MONTH_TROWTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.TOTAL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.DORMANT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DORMANT_USER_COUNT, __dataOut);
    }
    if (null == this.DR_NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_NEW_USER_COUNT, __dataOut);
    }
    if (null == this.DR_BACK_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_BACK_USER_COUNT, __dataOut);
    }
    if (null == this.DR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_USER_COUNT, __dataOut);
    }
    if (null == this.DR_USER_PRO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_USER_PRO, __dataOut);
    }
    if (null == this.DR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_COUNT, __dataOut);
    }
    if (null == this.DR_PER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_COUNT, __dataOut);
    }
    if (null == this.DR_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_YEAR_GROWTH, __dataOut);
    }
    if (null == this.DR_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_MONTH_GROWTH, __dataOut);
    }
    if (null == this.DR_PER_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_YEAR_GROWTH, __dataOut);
    }
    if (null == this.DR_PER_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_MONTH_GROWTH, __dataOut);
    }
    if (null == this.LB_NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_NEW_USER_COUNT, __dataOut);
    }
    if (null == this.LB_BACK_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_BACK_USER_COUNT, __dataOut);
    }
    if (null == this.LB_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_USER_COUNT, __dataOut);
    }
    if (null == this.LB_USER_PRO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_USER_PRO, __dataOut);
    }
    if (null == this.LB_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_COUNT, __dataOut);
    }
    if (null == this.LB_PER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_COUNT, __dataOut);
    }
    if (null == this.LB_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_YEAR_GROWTH, __dataOut);
    }
    if (null == this.LB_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_MONTH_GROWTH, __dataOut);
    }
    if (null == this.LB_PER_YEAR_TROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_YEAR_TROWTH, __dataOut);
    }
    if (null == this.LB_PER_MONTH_TROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_MONTH_TROWTH, __dataOut);
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
    if (null == this.TOTAL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_USER_COUNT, __dataOut);
    }
    if (null == this.ACTIVE_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ACTIVE_USER_COUNT, __dataOut);
    }
    if (null == this.DORMANT_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DORMANT_USER_COUNT, __dataOut);
    }
    if (null == this.DR_NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_NEW_USER_COUNT, __dataOut);
    }
    if (null == this.DR_BACK_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_BACK_USER_COUNT, __dataOut);
    }
    if (null == this.DR_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_USER_COUNT, __dataOut);
    }
    if (null == this.DR_USER_PRO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_USER_PRO, __dataOut);
    }
    if (null == this.DR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_COUNT, __dataOut);
    }
    if (null == this.DR_PER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_COUNT, __dataOut);
    }
    if (null == this.DR_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_YEAR_GROWTH, __dataOut);
    }
    if (null == this.DR_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_MONTH_GROWTH, __dataOut);
    }
    if (null == this.DR_PER_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_YEAR_GROWTH, __dataOut);
    }
    if (null == this.DR_PER_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DR_PER_MONTH_GROWTH, __dataOut);
    }
    if (null == this.LB_NEW_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_NEW_USER_COUNT, __dataOut);
    }
    if (null == this.LB_BACK_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_BACK_USER_COUNT, __dataOut);
    }
    if (null == this.LB_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_USER_COUNT, __dataOut);
    }
    if (null == this.LB_USER_PRO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_USER_PRO, __dataOut);
    }
    if (null == this.LB_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_COUNT, __dataOut);
    }
    if (null == this.LB_PER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_COUNT, __dataOut);
    }
    if (null == this.LB_YEAR_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_YEAR_GROWTH, __dataOut);
    }
    if (null == this.LB_MONTH_GROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_MONTH_GROWTH, __dataOut);
    }
    if (null == this.LB_PER_YEAR_TROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_YEAR_TROWTH, __dataOut);
    }
    if (null == this.LB_PER_MONTH_TROWTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LB_PER_MONTH_TROWTH, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_USER_COUNT==null?"null":TOTAL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DORMANT_USER_COUNT==null?"null":DORMANT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_NEW_USER_COUNT==null?"null":DR_NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_BACK_USER_COUNT==null?"null":DR_BACK_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_USER_COUNT==null?"null":DR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_USER_PRO==null?"null":DR_USER_PRO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_COUNT==null?"null":DR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_COUNT==null?"null":DR_PER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_YEAR_GROWTH==null?"null":DR_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_MONTH_GROWTH==null?"null":DR_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_YEAR_GROWTH==null?"null":DR_PER_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_MONTH_GROWTH==null?"null":DR_PER_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_NEW_USER_COUNT==null?"null":LB_NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_BACK_USER_COUNT==null?"null":LB_BACK_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_USER_COUNT==null?"null":LB_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_USER_PRO==null?"null":LB_USER_PRO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_COUNT==null?"null":LB_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_COUNT==null?"null":LB_PER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_YEAR_GROWTH==null?"null":LB_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_MONTH_GROWTH==null?"null":LB_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_YEAR_TROWTH==null?"null":LB_PER_YEAR_TROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_MONTH_TROWTH==null?"null":LB_PER_MONTH_TROWTH.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_USER_COUNT==null?"null":TOTAL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_USER_COUNT==null?"null":ACTIVE_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DORMANT_USER_COUNT==null?"null":DORMANT_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_NEW_USER_COUNT==null?"null":DR_NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_BACK_USER_COUNT==null?"null":DR_BACK_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_USER_COUNT==null?"null":DR_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_USER_PRO==null?"null":DR_USER_PRO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_COUNT==null?"null":DR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_COUNT==null?"null":DR_PER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_YEAR_GROWTH==null?"null":DR_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_MONTH_GROWTH==null?"null":DR_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_YEAR_GROWTH==null?"null":DR_PER_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DR_PER_MONTH_GROWTH==null?"null":DR_PER_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_NEW_USER_COUNT==null?"null":LB_NEW_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_BACK_USER_COUNT==null?"null":LB_BACK_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_USER_COUNT==null?"null":LB_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_USER_PRO==null?"null":LB_USER_PRO.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_COUNT==null?"null":LB_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_COUNT==null?"null":LB_PER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_YEAR_GROWTH==null?"null":LB_YEAR_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_MONTH_GROWTH==null?"null":LB_MONTH_GROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_YEAR_TROWTH==null?"null":LB_PER_YEAR_TROWTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LB_PER_MONTH_TROWTH==null?"null":LB_PER_MONTH_TROWTH.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_USER_COUNT = null; } else {
      this.TOTAL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DORMANT_USER_COUNT = null; } else {
      this.DORMANT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_NEW_USER_COUNT = null; } else {
      this.DR_NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_BACK_USER_COUNT = null; } else {
      this.DR_BACK_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_USER_COUNT = null; } else {
      this.DR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_USER_PRO = null; } else {
      this.DR_USER_PRO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_COUNT = null; } else {
      this.DR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_COUNT = null; } else {
      this.DR_PER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_YEAR_GROWTH = null; } else {
      this.DR_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_MONTH_GROWTH = null; } else {
      this.DR_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_YEAR_GROWTH = null; } else {
      this.DR_PER_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_MONTH_GROWTH = null; } else {
      this.DR_PER_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_NEW_USER_COUNT = null; } else {
      this.LB_NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_BACK_USER_COUNT = null; } else {
      this.LB_BACK_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_USER_COUNT = null; } else {
      this.LB_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_USER_PRO = null; } else {
      this.LB_USER_PRO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_COUNT = null; } else {
      this.LB_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_COUNT = null; } else {
      this.LB_PER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_YEAR_GROWTH = null; } else {
      this.LB_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_MONTH_GROWTH = null; } else {
      this.LB_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_YEAR_TROWTH = null; } else {
      this.LB_PER_YEAR_TROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_MONTH_TROWTH = null; } else {
      this.LB_PER_MONTH_TROWTH = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.TOTAL_USER_COUNT = null; } else {
      this.TOTAL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ACTIVE_USER_COUNT = null; } else {
      this.ACTIVE_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DORMANT_USER_COUNT = null; } else {
      this.DORMANT_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_NEW_USER_COUNT = null; } else {
      this.DR_NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_BACK_USER_COUNT = null; } else {
      this.DR_BACK_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_USER_COUNT = null; } else {
      this.DR_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_USER_PRO = null; } else {
      this.DR_USER_PRO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_COUNT = null; } else {
      this.DR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_COUNT = null; } else {
      this.DR_PER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_YEAR_GROWTH = null; } else {
      this.DR_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_MONTH_GROWTH = null; } else {
      this.DR_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_YEAR_GROWTH = null; } else {
      this.DR_PER_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DR_PER_MONTH_GROWTH = null; } else {
      this.DR_PER_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_NEW_USER_COUNT = null; } else {
      this.LB_NEW_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_BACK_USER_COUNT = null; } else {
      this.LB_BACK_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_USER_COUNT = null; } else {
      this.LB_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_USER_PRO = null; } else {
      this.LB_USER_PRO = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_COUNT = null; } else {
      this.LB_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_COUNT = null; } else {
      this.LB_PER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_YEAR_GROWTH = null; } else {
      this.LB_YEAR_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_MONTH_GROWTH = null; } else {
      this.LB_MONTH_GROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_YEAR_TROWTH = null; } else {
      this.LB_PER_YEAR_TROWTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LB_PER_MONTH_TROWTH = null; } else {
      this.LB_PER_MONTH_TROWTH = new java.math.BigDecimal(__cur_str);
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
    ST_DR_SUMMARY o = (ST_DR_SUMMARY) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_DR_SUMMARY o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TOTAL_USER_COUNT", this.TOTAL_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
    __sqoop$field_map.put("DORMANT_USER_COUNT", this.DORMANT_USER_COUNT);
    __sqoop$field_map.put("DR_NEW_USER_COUNT", this.DR_NEW_USER_COUNT);
    __sqoop$field_map.put("DR_BACK_USER_COUNT", this.DR_BACK_USER_COUNT);
    __sqoop$field_map.put("DR_USER_COUNT", this.DR_USER_COUNT);
    __sqoop$field_map.put("DR_USER_PRO", this.DR_USER_PRO);
    __sqoop$field_map.put("DR_COUNT", this.DR_COUNT);
    __sqoop$field_map.put("DR_PER_COUNT", this.DR_PER_COUNT);
    __sqoop$field_map.put("DR_YEAR_GROWTH", this.DR_YEAR_GROWTH);
    __sqoop$field_map.put("DR_MONTH_GROWTH", this.DR_MONTH_GROWTH);
    __sqoop$field_map.put("DR_PER_YEAR_GROWTH", this.DR_PER_YEAR_GROWTH);
    __sqoop$field_map.put("DR_PER_MONTH_GROWTH", this.DR_PER_MONTH_GROWTH);
    __sqoop$field_map.put("LB_NEW_USER_COUNT", this.LB_NEW_USER_COUNT);
    __sqoop$field_map.put("LB_BACK_USER_COUNT", this.LB_BACK_USER_COUNT);
    __sqoop$field_map.put("LB_USER_COUNT", this.LB_USER_COUNT);
    __sqoop$field_map.put("LB_USER_PRO", this.LB_USER_PRO);
    __sqoop$field_map.put("LB_COUNT", this.LB_COUNT);
    __sqoop$field_map.put("LB_PER_COUNT", this.LB_PER_COUNT);
    __sqoop$field_map.put("LB_YEAR_GROWTH", this.LB_YEAR_GROWTH);
    __sqoop$field_map.put("LB_MONTH_GROWTH", this.LB_MONTH_GROWTH);
    __sqoop$field_map.put("LB_PER_YEAR_TROWTH", this.LB_PER_YEAR_TROWTH);
    __sqoop$field_map.put("LB_PER_MONTH_TROWTH", this.LB_PER_MONTH_TROWTH);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("TOTAL_USER_COUNT", this.TOTAL_USER_COUNT);
    __sqoop$field_map.put("ACTIVE_USER_COUNT", this.ACTIVE_USER_COUNT);
    __sqoop$field_map.put("DORMANT_USER_COUNT", this.DORMANT_USER_COUNT);
    __sqoop$field_map.put("DR_NEW_USER_COUNT", this.DR_NEW_USER_COUNT);
    __sqoop$field_map.put("DR_BACK_USER_COUNT", this.DR_BACK_USER_COUNT);
    __sqoop$field_map.put("DR_USER_COUNT", this.DR_USER_COUNT);
    __sqoop$field_map.put("DR_USER_PRO", this.DR_USER_PRO);
    __sqoop$field_map.put("DR_COUNT", this.DR_COUNT);
    __sqoop$field_map.put("DR_PER_COUNT", this.DR_PER_COUNT);
    __sqoop$field_map.put("DR_YEAR_GROWTH", this.DR_YEAR_GROWTH);
    __sqoop$field_map.put("DR_MONTH_GROWTH", this.DR_MONTH_GROWTH);
    __sqoop$field_map.put("DR_PER_YEAR_GROWTH", this.DR_PER_YEAR_GROWTH);
    __sqoop$field_map.put("DR_PER_MONTH_GROWTH", this.DR_PER_MONTH_GROWTH);
    __sqoop$field_map.put("LB_NEW_USER_COUNT", this.LB_NEW_USER_COUNT);
    __sqoop$field_map.put("LB_BACK_USER_COUNT", this.LB_BACK_USER_COUNT);
    __sqoop$field_map.put("LB_USER_COUNT", this.LB_USER_COUNT);
    __sqoop$field_map.put("LB_USER_PRO", this.LB_USER_PRO);
    __sqoop$field_map.put("LB_COUNT", this.LB_COUNT);
    __sqoop$field_map.put("LB_PER_COUNT", this.LB_PER_COUNT);
    __sqoop$field_map.put("LB_YEAR_GROWTH", this.LB_YEAR_GROWTH);
    __sqoop$field_map.put("LB_MONTH_GROWTH", this.LB_MONTH_GROWTH);
    __sqoop$field_map.put("LB_PER_YEAR_TROWTH", this.LB_PER_YEAR_TROWTH);
    __sqoop$field_map.put("LB_PER_MONTH_TROWTH", this.LB_PER_MONTH_TROWTH);
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
    else    if ("TOTAL_USER_COUNT".equals(__fieldName)) {
      this.TOTAL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DORMANT_USER_COUNT".equals(__fieldName)) {
      this.DORMANT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_NEW_USER_COUNT".equals(__fieldName)) {
      this.DR_NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_BACK_USER_COUNT".equals(__fieldName)) {
      this.DR_BACK_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_USER_COUNT".equals(__fieldName)) {
      this.DR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_USER_PRO".equals(__fieldName)) {
      this.DR_USER_PRO = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_COUNT".equals(__fieldName)) {
      this.DR_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_PER_COUNT".equals(__fieldName)) {
      this.DR_PER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_YEAR_GROWTH".equals(__fieldName)) {
      this.DR_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_MONTH_GROWTH".equals(__fieldName)) {
      this.DR_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_PER_YEAR_GROWTH".equals(__fieldName)) {
      this.DR_PER_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DR_PER_MONTH_GROWTH".equals(__fieldName)) {
      this.DR_PER_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_NEW_USER_COUNT".equals(__fieldName)) {
      this.LB_NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_BACK_USER_COUNT".equals(__fieldName)) {
      this.LB_BACK_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_USER_COUNT".equals(__fieldName)) {
      this.LB_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_USER_PRO".equals(__fieldName)) {
      this.LB_USER_PRO = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_COUNT".equals(__fieldName)) {
      this.LB_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_PER_COUNT".equals(__fieldName)) {
      this.LB_PER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_YEAR_GROWTH".equals(__fieldName)) {
      this.LB_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_MONTH_GROWTH".equals(__fieldName)) {
      this.LB_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_PER_YEAR_TROWTH".equals(__fieldName)) {
      this.LB_PER_YEAR_TROWTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LB_PER_MONTH_TROWTH".equals(__fieldName)) {
      this.LB_PER_MONTH_TROWTH = (java.math.BigDecimal) __fieldVal;
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
    else    if ("TOTAL_USER_COUNT".equals(__fieldName)) {
      this.TOTAL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ACTIVE_USER_COUNT".equals(__fieldName)) {
      this.ACTIVE_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DORMANT_USER_COUNT".equals(__fieldName)) {
      this.DORMANT_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_NEW_USER_COUNT".equals(__fieldName)) {
      this.DR_NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_BACK_USER_COUNT".equals(__fieldName)) {
      this.DR_BACK_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_USER_COUNT".equals(__fieldName)) {
      this.DR_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_USER_PRO".equals(__fieldName)) {
      this.DR_USER_PRO = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_COUNT".equals(__fieldName)) {
      this.DR_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_PER_COUNT".equals(__fieldName)) {
      this.DR_PER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_YEAR_GROWTH".equals(__fieldName)) {
      this.DR_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_MONTH_GROWTH".equals(__fieldName)) {
      this.DR_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_PER_YEAR_GROWTH".equals(__fieldName)) {
      this.DR_PER_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DR_PER_MONTH_GROWTH".equals(__fieldName)) {
      this.DR_PER_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_NEW_USER_COUNT".equals(__fieldName)) {
      this.LB_NEW_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_BACK_USER_COUNT".equals(__fieldName)) {
      this.LB_BACK_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_USER_COUNT".equals(__fieldName)) {
      this.LB_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_USER_PRO".equals(__fieldName)) {
      this.LB_USER_PRO = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_COUNT".equals(__fieldName)) {
      this.LB_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_PER_COUNT".equals(__fieldName)) {
      this.LB_PER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_YEAR_GROWTH".equals(__fieldName)) {
      this.LB_YEAR_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_MONTH_GROWTH".equals(__fieldName)) {
      this.LB_MONTH_GROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_PER_YEAR_TROWTH".equals(__fieldName)) {
      this.LB_PER_YEAR_TROWTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LB_PER_MONTH_TROWTH".equals(__fieldName)) {
      this.LB_PER_MONTH_TROWTH = (java.math.BigDecimal) __fieldVal;
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
