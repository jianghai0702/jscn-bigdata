// ORM class for table 'ST_ZG_ACCT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 01 15:45:43 CST 2019
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

public class ST_ZG_ACCT extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_ZG_ACCT with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_ZG_ACCT with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_ZG_ACCT with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal PAYMENT_MONTH_COUNT;
  public java.math.BigDecimal get_PAYMENT_MONTH_COUNT() {
    return PAYMENT_MONTH_COUNT;
  }
  public void set_PAYMENT_MONTH_COUNT(java.math.BigDecimal PAYMENT_MONTH_COUNT) {
    this.PAYMENT_MONTH_COUNT = PAYMENT_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_PAYMENT_MONTH_COUNT(java.math.BigDecimal PAYMENT_MONTH_COUNT) {
    this.PAYMENT_MONTH_COUNT = PAYMENT_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal PAYMENT_SIX_MONTH_COUNT;
  public java.math.BigDecimal get_PAYMENT_SIX_MONTH_COUNT() {
    return PAYMENT_SIX_MONTH_COUNT;
  }
  public void set_PAYMENT_SIX_MONTH_COUNT(java.math.BigDecimal PAYMENT_SIX_MONTH_COUNT) {
    this.PAYMENT_SIX_MONTH_COUNT = PAYMENT_SIX_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_PAYMENT_SIX_MONTH_COUNT(java.math.BigDecimal PAYMENT_SIX_MONTH_COUNT) {
    this.PAYMENT_SIX_MONTH_COUNT = PAYMENT_SIX_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal PAYMENT_YEAR_COUNT;
  public java.math.BigDecimal get_PAYMENT_YEAR_COUNT() {
    return PAYMENT_YEAR_COUNT;
  }
  public void set_PAYMENT_YEAR_COUNT(java.math.BigDecimal PAYMENT_YEAR_COUNT) {
    this.PAYMENT_YEAR_COUNT = PAYMENT_YEAR_COUNT;
  }
  public ST_ZG_ACCT with_PAYMENT_YEAR_COUNT(java.math.BigDecimal PAYMENT_YEAR_COUNT) {
    this.PAYMENT_YEAR_COUNT = PAYMENT_YEAR_COUNT;
    return this;
  }
  private java.math.BigDecimal PAYMENT_COUNT;
  public java.math.BigDecimal get_PAYMENT_COUNT() {
    return PAYMENT_COUNT;
  }
  public void set_PAYMENT_COUNT(java.math.BigDecimal PAYMENT_COUNT) {
    this.PAYMENT_COUNT = PAYMENT_COUNT;
  }
  public ST_ZG_ACCT with_PAYMENT_COUNT(java.math.BigDecimal PAYMENT_COUNT) {
    this.PAYMENT_COUNT = PAYMENT_COUNT;
    return this;
  }
  private java.math.BigDecimal NO_CREDIT_AMOUNT_COUNT;
  public java.math.BigDecimal get_NO_CREDIT_AMOUNT_COUNT() {
    return NO_CREDIT_AMOUNT_COUNT;
  }
  public void set_NO_CREDIT_AMOUNT_COUNT(java.math.BigDecimal NO_CREDIT_AMOUNT_COUNT) {
    this.NO_CREDIT_AMOUNT_COUNT = NO_CREDIT_AMOUNT_COUNT;
  }
  public ST_ZG_ACCT with_NO_CREDIT_AMOUNT_COUNT(java.math.BigDecimal NO_CREDIT_AMOUNT_COUNT) {
    this.NO_CREDIT_AMOUNT_COUNT = NO_CREDIT_AMOUNT_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_0_200_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_0_200_COUNT() {
    return CREDIT_AMOUNT_0_200_COUNT;
  }
  public void set_CREDIT_AMOUNT_0_200_COUNT(java.math.BigDecimal CREDIT_AMOUNT_0_200_COUNT) {
    this.CREDIT_AMOUNT_0_200_COUNT = CREDIT_AMOUNT_0_200_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_0_200_COUNT(java.math.BigDecimal CREDIT_AMOUNT_0_200_COUNT) {
    this.CREDIT_AMOUNT_0_200_COUNT = CREDIT_AMOUNT_0_200_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_201_300_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_201_300_COUNT() {
    return CREDIT_AMOUNT_201_300_COUNT;
  }
  public void set_CREDIT_AMOUNT_201_300_COUNT(java.math.BigDecimal CREDIT_AMOUNT_201_300_COUNT) {
    this.CREDIT_AMOUNT_201_300_COUNT = CREDIT_AMOUNT_201_300_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_201_300_COUNT(java.math.BigDecimal CREDIT_AMOUNT_201_300_COUNT) {
    this.CREDIT_AMOUNT_201_300_COUNT = CREDIT_AMOUNT_201_300_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_301_500_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_301_500_COUNT() {
    return CREDIT_AMOUNT_301_500_COUNT;
  }
  public void set_CREDIT_AMOUNT_301_500_COUNT(java.math.BigDecimal CREDIT_AMOUNT_301_500_COUNT) {
    this.CREDIT_AMOUNT_301_500_COUNT = CREDIT_AMOUNT_301_500_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_301_500_COUNT(java.math.BigDecimal CREDIT_AMOUNT_301_500_COUNT) {
    this.CREDIT_AMOUNT_301_500_COUNT = CREDIT_AMOUNT_301_500_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_501_1000_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_501_1000_COUNT() {
    return CREDIT_AMOUNT_501_1000_COUNT;
  }
  public void set_CREDIT_AMOUNT_501_1000_COUNT(java.math.BigDecimal CREDIT_AMOUNT_501_1000_COUNT) {
    this.CREDIT_AMOUNT_501_1000_COUNT = CREDIT_AMOUNT_501_1000_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_501_1000_COUNT(java.math.BigDecimal CREDIT_AMOUNT_501_1000_COUNT) {
    this.CREDIT_AMOUNT_501_1000_COUNT = CREDIT_AMOUNT_501_1000_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_1001_2000_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_1001_2000_COUNT() {
    return CREDIT_AMOUNT_1001_2000_COUNT;
  }
  public void set_CREDIT_AMOUNT_1001_2000_COUNT(java.math.BigDecimal CREDIT_AMOUNT_1001_2000_COUNT) {
    this.CREDIT_AMOUNT_1001_2000_COUNT = CREDIT_AMOUNT_1001_2000_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_1001_2000_COUNT(java.math.BigDecimal CREDIT_AMOUNT_1001_2000_COUNT) {
    this.CREDIT_AMOUNT_1001_2000_COUNT = CREDIT_AMOUNT_1001_2000_COUNT;
    return this;
  }
  private java.math.BigDecimal CREDIT_AMOUNT_2001_COUNT;
  public java.math.BigDecimal get_CREDIT_AMOUNT_2001_COUNT() {
    return CREDIT_AMOUNT_2001_COUNT;
  }
  public void set_CREDIT_AMOUNT_2001_COUNT(java.math.BigDecimal CREDIT_AMOUNT_2001_COUNT) {
    this.CREDIT_AMOUNT_2001_COUNT = CREDIT_AMOUNT_2001_COUNT;
  }
  public ST_ZG_ACCT with_CREDIT_AMOUNT_2001_COUNT(java.math.BigDecimal CREDIT_AMOUNT_2001_COUNT) {
    this.CREDIT_AMOUNT_2001_COUNT = CREDIT_AMOUNT_2001_COUNT;
    return this;
  }
  private java.math.BigDecimal LESS_ONE_MONTH_COUNT;
  public java.math.BigDecimal get_LESS_ONE_MONTH_COUNT() {
    return LESS_ONE_MONTH_COUNT;
  }
  public void set_LESS_ONE_MONTH_COUNT(java.math.BigDecimal LESS_ONE_MONTH_COUNT) {
    this.LESS_ONE_MONTH_COUNT = LESS_ONE_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_LESS_ONE_MONTH_COUNT(java.math.BigDecimal LESS_ONE_MONTH_COUNT) {
    this.LESS_ONE_MONTH_COUNT = LESS_ONE_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal ONE_TO_SIX_MONTH_COUNT;
  public java.math.BigDecimal get_ONE_TO_SIX_MONTH_COUNT() {
    return ONE_TO_SIX_MONTH_COUNT;
  }
  public void set_ONE_TO_SIX_MONTH_COUNT(java.math.BigDecimal ONE_TO_SIX_MONTH_COUNT) {
    this.ONE_TO_SIX_MONTH_COUNT = ONE_TO_SIX_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_ONE_TO_SIX_MONTH_COUNT(java.math.BigDecimal ONE_TO_SIX_MONTH_COUNT) {
    this.ONE_TO_SIX_MONTH_COUNT = ONE_TO_SIX_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal SIX_TO_TWELVE_MONTH_COUNT;
  public java.math.BigDecimal get_SIX_TO_TWELVE_MONTH_COUNT() {
    return SIX_TO_TWELVE_MONTH_COUNT;
  }
  public void set_SIX_TO_TWELVE_MONTH_COUNT(java.math.BigDecimal SIX_TO_TWELVE_MONTH_COUNT) {
    this.SIX_TO_TWELVE_MONTH_COUNT = SIX_TO_TWELVE_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_SIX_TO_TWELVE_MONTH_COUNT(java.math.BigDecimal SIX_TO_TWELVE_MONTH_COUNT) {
    this.SIX_TO_TWELVE_MONTH_COUNT = SIX_TO_TWELVE_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal GRANTER_TWELVE_MONTH_COUNT;
  public java.math.BigDecimal get_GRANTER_TWELVE_MONTH_COUNT() {
    return GRANTER_TWELVE_MONTH_COUNT;
  }
  public void set_GRANTER_TWELVE_MONTH_COUNT(java.math.BigDecimal GRANTER_TWELVE_MONTH_COUNT) {
    this.GRANTER_TWELVE_MONTH_COUNT = GRANTER_TWELVE_MONTH_COUNT;
  }
  public ST_ZG_ACCT with_GRANTER_TWELVE_MONTH_COUNT(java.math.BigDecimal GRANTER_TWELVE_MONTH_COUNT) {
    this.GRANTER_TWELVE_MONTH_COUNT = GRANTER_TWELVE_MONTH_COUNT;
    return this;
  }
  private java.math.BigDecimal SZ_UNPAY_AMOUNT_TOTAL;
  public java.math.BigDecimal get_SZ_UNPAY_AMOUNT_TOTAL() {
    return SZ_UNPAY_AMOUNT_TOTAL;
  }
  public void set_SZ_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal SZ_UNPAY_AMOUNT_TOTAL) {
    this.SZ_UNPAY_AMOUNT_TOTAL = SZ_UNPAY_AMOUNT_TOTAL;
  }
  public ST_ZG_ACCT with_SZ_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal SZ_UNPAY_AMOUNT_TOTAL) {
    this.SZ_UNPAY_AMOUNT_TOTAL = SZ_UNPAY_AMOUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal SZ_UNPAY_AMOUNT_COUNT;
  public java.math.BigDecimal get_SZ_UNPAY_AMOUNT_COUNT() {
    return SZ_UNPAY_AMOUNT_COUNT;
  }
  public void set_SZ_UNPAY_AMOUNT_COUNT(java.math.BigDecimal SZ_UNPAY_AMOUNT_COUNT) {
    this.SZ_UNPAY_AMOUNT_COUNT = SZ_UNPAY_AMOUNT_COUNT;
  }
  public ST_ZG_ACCT with_SZ_UNPAY_AMOUNT_COUNT(java.math.BigDecimal SZ_UNPAY_AMOUNT_COUNT) {
    this.SZ_UNPAY_AMOUNT_COUNT = SZ_UNPAY_AMOUNT_COUNT;
    return this;
  }
  private java.math.BigDecimal HD_UNPAY_AMOUNT_TOTAL;
  public java.math.BigDecimal get_HD_UNPAY_AMOUNT_TOTAL() {
    return HD_UNPAY_AMOUNT_TOTAL;
  }
  public void set_HD_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal HD_UNPAY_AMOUNT_TOTAL) {
    this.HD_UNPAY_AMOUNT_TOTAL = HD_UNPAY_AMOUNT_TOTAL;
  }
  public ST_ZG_ACCT with_HD_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal HD_UNPAY_AMOUNT_TOTAL) {
    this.HD_UNPAY_AMOUNT_TOTAL = HD_UNPAY_AMOUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal HD_UNPAY_AMOUNT_COUNT;
  public java.math.BigDecimal get_HD_UNPAY_AMOUNT_COUNT() {
    return HD_UNPAY_AMOUNT_COUNT;
  }
  public void set_HD_UNPAY_AMOUNT_COUNT(java.math.BigDecimal HD_UNPAY_AMOUNT_COUNT) {
    this.HD_UNPAY_AMOUNT_COUNT = HD_UNPAY_AMOUNT_COUNT;
  }
  public ST_ZG_ACCT with_HD_UNPAY_AMOUNT_COUNT(java.math.BigDecimal HD_UNPAY_AMOUNT_COUNT) {
    this.HD_UNPAY_AMOUNT_COUNT = HD_UNPAY_AMOUNT_COUNT;
    return this;
  }
  private java.math.BigDecimal KD_UNPAY_AMOUNT_TOTAL;
  public java.math.BigDecimal get_KD_UNPAY_AMOUNT_TOTAL() {
    return KD_UNPAY_AMOUNT_TOTAL;
  }
  public void set_KD_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal KD_UNPAY_AMOUNT_TOTAL) {
    this.KD_UNPAY_AMOUNT_TOTAL = KD_UNPAY_AMOUNT_TOTAL;
  }
  public ST_ZG_ACCT with_KD_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal KD_UNPAY_AMOUNT_TOTAL) {
    this.KD_UNPAY_AMOUNT_TOTAL = KD_UNPAY_AMOUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal KD_UNPAY_AMOUNT_COUNT;
  public java.math.BigDecimal get_KD_UNPAY_AMOUNT_COUNT() {
    return KD_UNPAY_AMOUNT_COUNT;
  }
  public void set_KD_UNPAY_AMOUNT_COUNT(java.math.BigDecimal KD_UNPAY_AMOUNT_COUNT) {
    this.KD_UNPAY_AMOUNT_COUNT = KD_UNPAY_AMOUNT_COUNT;
  }
  public ST_ZG_ACCT with_KD_UNPAY_AMOUNT_COUNT(java.math.BigDecimal KD_UNPAY_AMOUNT_COUNT) {
    this.KD_UNPAY_AMOUNT_COUNT = KD_UNPAY_AMOUNT_COUNT;
    return this;
  }
  private java.math.BigDecimal ZZ_UNPAY_AMOUNT_TOTAL;
  public java.math.BigDecimal get_ZZ_UNPAY_AMOUNT_TOTAL() {
    return ZZ_UNPAY_AMOUNT_TOTAL;
  }
  public void set_ZZ_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal ZZ_UNPAY_AMOUNT_TOTAL) {
    this.ZZ_UNPAY_AMOUNT_TOTAL = ZZ_UNPAY_AMOUNT_TOTAL;
  }
  public ST_ZG_ACCT with_ZZ_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal ZZ_UNPAY_AMOUNT_TOTAL) {
    this.ZZ_UNPAY_AMOUNT_TOTAL = ZZ_UNPAY_AMOUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal ZZ_UNPAY_AMOUNT_COUNT;
  public java.math.BigDecimal get_ZZ_UNPAY_AMOUNT_COUNT() {
    return ZZ_UNPAY_AMOUNT_COUNT;
  }
  public void set_ZZ_UNPAY_AMOUNT_COUNT(java.math.BigDecimal ZZ_UNPAY_AMOUNT_COUNT) {
    this.ZZ_UNPAY_AMOUNT_COUNT = ZZ_UNPAY_AMOUNT_COUNT;
  }
  public ST_ZG_ACCT with_ZZ_UNPAY_AMOUNT_COUNT(java.math.BigDecimal ZZ_UNPAY_AMOUNT_COUNT) {
    this.ZZ_UNPAY_AMOUNT_COUNT = ZZ_UNPAY_AMOUNT_COUNT;
    return this;
  }
  private java.math.BigDecimal UNPAY_AMOUNT_TOTAL;
  public java.math.BigDecimal get_UNPAY_AMOUNT_TOTAL() {
    return UNPAY_AMOUNT_TOTAL;
  }
  public void set_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal UNPAY_AMOUNT_TOTAL) {
    this.UNPAY_AMOUNT_TOTAL = UNPAY_AMOUNT_TOTAL;
  }
  public ST_ZG_ACCT with_UNPAY_AMOUNT_TOTAL(java.math.BigDecimal UNPAY_AMOUNT_TOTAL) {
    this.UNPAY_AMOUNT_TOTAL = UNPAY_AMOUNT_TOTAL;
    return this;
  }
  private java.math.BigDecimal UNPAY_TOTAL_COUNT;
  public java.math.BigDecimal get_UNPAY_TOTAL_COUNT() {
    return UNPAY_TOTAL_COUNT;
  }
  public void set_UNPAY_TOTAL_COUNT(java.math.BigDecimal UNPAY_TOTAL_COUNT) {
    this.UNPAY_TOTAL_COUNT = UNPAY_TOTAL_COUNT;
  }
  public ST_ZG_ACCT with_UNPAY_TOTAL_COUNT(java.math.BigDecimal UNPAY_TOTAL_COUNT) {
    this.UNPAY_TOTAL_COUNT = UNPAY_TOTAL_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_ZG_ACCT with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_ZG_ACCT with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_ZG_ACCT)) {
      return false;
    }
    ST_ZG_ACCT that = (ST_ZG_ACCT) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PAYMENT_MONTH_COUNT == null ? that.PAYMENT_MONTH_COUNT == null : this.PAYMENT_MONTH_COUNT.equals(that.PAYMENT_MONTH_COUNT));
    equal = equal && (this.PAYMENT_SIX_MONTH_COUNT == null ? that.PAYMENT_SIX_MONTH_COUNT == null : this.PAYMENT_SIX_MONTH_COUNT.equals(that.PAYMENT_SIX_MONTH_COUNT));
    equal = equal && (this.PAYMENT_YEAR_COUNT == null ? that.PAYMENT_YEAR_COUNT == null : this.PAYMENT_YEAR_COUNT.equals(that.PAYMENT_YEAR_COUNT));
    equal = equal && (this.PAYMENT_COUNT == null ? that.PAYMENT_COUNT == null : this.PAYMENT_COUNT.equals(that.PAYMENT_COUNT));
    equal = equal && (this.NO_CREDIT_AMOUNT_COUNT == null ? that.NO_CREDIT_AMOUNT_COUNT == null : this.NO_CREDIT_AMOUNT_COUNT.equals(that.NO_CREDIT_AMOUNT_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_0_200_COUNT == null ? that.CREDIT_AMOUNT_0_200_COUNT == null : this.CREDIT_AMOUNT_0_200_COUNT.equals(that.CREDIT_AMOUNT_0_200_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_201_300_COUNT == null ? that.CREDIT_AMOUNT_201_300_COUNT == null : this.CREDIT_AMOUNT_201_300_COUNT.equals(that.CREDIT_AMOUNT_201_300_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_301_500_COUNT == null ? that.CREDIT_AMOUNT_301_500_COUNT == null : this.CREDIT_AMOUNT_301_500_COUNT.equals(that.CREDIT_AMOUNT_301_500_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_501_1000_COUNT == null ? that.CREDIT_AMOUNT_501_1000_COUNT == null : this.CREDIT_AMOUNT_501_1000_COUNT.equals(that.CREDIT_AMOUNT_501_1000_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_1001_2000_COUNT == null ? that.CREDIT_AMOUNT_1001_2000_COUNT == null : this.CREDIT_AMOUNT_1001_2000_COUNT.equals(that.CREDIT_AMOUNT_1001_2000_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_2001_COUNT == null ? that.CREDIT_AMOUNT_2001_COUNT == null : this.CREDIT_AMOUNT_2001_COUNT.equals(that.CREDIT_AMOUNT_2001_COUNT));
    equal = equal && (this.LESS_ONE_MONTH_COUNT == null ? that.LESS_ONE_MONTH_COUNT == null : this.LESS_ONE_MONTH_COUNT.equals(that.LESS_ONE_MONTH_COUNT));
    equal = equal && (this.ONE_TO_SIX_MONTH_COUNT == null ? that.ONE_TO_SIX_MONTH_COUNT == null : this.ONE_TO_SIX_MONTH_COUNT.equals(that.ONE_TO_SIX_MONTH_COUNT));
    equal = equal && (this.SIX_TO_TWELVE_MONTH_COUNT == null ? that.SIX_TO_TWELVE_MONTH_COUNT == null : this.SIX_TO_TWELVE_MONTH_COUNT.equals(that.SIX_TO_TWELVE_MONTH_COUNT));
    equal = equal && (this.GRANTER_TWELVE_MONTH_COUNT == null ? that.GRANTER_TWELVE_MONTH_COUNT == null : this.GRANTER_TWELVE_MONTH_COUNT.equals(that.GRANTER_TWELVE_MONTH_COUNT));
    equal = equal && (this.SZ_UNPAY_AMOUNT_TOTAL == null ? that.SZ_UNPAY_AMOUNT_TOTAL == null : this.SZ_UNPAY_AMOUNT_TOTAL.equals(that.SZ_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.SZ_UNPAY_AMOUNT_COUNT == null ? that.SZ_UNPAY_AMOUNT_COUNT == null : this.SZ_UNPAY_AMOUNT_COUNT.equals(that.SZ_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.HD_UNPAY_AMOUNT_TOTAL == null ? that.HD_UNPAY_AMOUNT_TOTAL == null : this.HD_UNPAY_AMOUNT_TOTAL.equals(that.HD_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.HD_UNPAY_AMOUNT_COUNT == null ? that.HD_UNPAY_AMOUNT_COUNT == null : this.HD_UNPAY_AMOUNT_COUNT.equals(that.HD_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.KD_UNPAY_AMOUNT_TOTAL == null ? that.KD_UNPAY_AMOUNT_TOTAL == null : this.KD_UNPAY_AMOUNT_TOTAL.equals(that.KD_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.KD_UNPAY_AMOUNT_COUNT == null ? that.KD_UNPAY_AMOUNT_COUNT == null : this.KD_UNPAY_AMOUNT_COUNT.equals(that.KD_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.ZZ_UNPAY_AMOUNT_TOTAL == null ? that.ZZ_UNPAY_AMOUNT_TOTAL == null : this.ZZ_UNPAY_AMOUNT_TOTAL.equals(that.ZZ_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.ZZ_UNPAY_AMOUNT_COUNT == null ? that.ZZ_UNPAY_AMOUNT_COUNT == null : this.ZZ_UNPAY_AMOUNT_COUNT.equals(that.ZZ_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.UNPAY_AMOUNT_TOTAL == null ? that.UNPAY_AMOUNT_TOTAL == null : this.UNPAY_AMOUNT_TOTAL.equals(that.UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.UNPAY_TOTAL_COUNT == null ? that.UNPAY_TOTAL_COUNT == null : this.UNPAY_TOTAL_COUNT.equals(that.UNPAY_TOTAL_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_ZG_ACCT)) {
      return false;
    }
    ST_ZG_ACCT that = (ST_ZG_ACCT) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.PAYMENT_MONTH_COUNT == null ? that.PAYMENT_MONTH_COUNT == null : this.PAYMENT_MONTH_COUNT.equals(that.PAYMENT_MONTH_COUNT));
    equal = equal && (this.PAYMENT_SIX_MONTH_COUNT == null ? that.PAYMENT_SIX_MONTH_COUNT == null : this.PAYMENT_SIX_MONTH_COUNT.equals(that.PAYMENT_SIX_MONTH_COUNT));
    equal = equal && (this.PAYMENT_YEAR_COUNT == null ? that.PAYMENT_YEAR_COUNT == null : this.PAYMENT_YEAR_COUNT.equals(that.PAYMENT_YEAR_COUNT));
    equal = equal && (this.PAYMENT_COUNT == null ? that.PAYMENT_COUNT == null : this.PAYMENT_COUNT.equals(that.PAYMENT_COUNT));
    equal = equal && (this.NO_CREDIT_AMOUNT_COUNT == null ? that.NO_CREDIT_AMOUNT_COUNT == null : this.NO_CREDIT_AMOUNT_COUNT.equals(that.NO_CREDIT_AMOUNT_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_0_200_COUNT == null ? that.CREDIT_AMOUNT_0_200_COUNT == null : this.CREDIT_AMOUNT_0_200_COUNT.equals(that.CREDIT_AMOUNT_0_200_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_201_300_COUNT == null ? that.CREDIT_AMOUNT_201_300_COUNT == null : this.CREDIT_AMOUNT_201_300_COUNT.equals(that.CREDIT_AMOUNT_201_300_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_301_500_COUNT == null ? that.CREDIT_AMOUNT_301_500_COUNT == null : this.CREDIT_AMOUNT_301_500_COUNT.equals(that.CREDIT_AMOUNT_301_500_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_501_1000_COUNT == null ? that.CREDIT_AMOUNT_501_1000_COUNT == null : this.CREDIT_AMOUNT_501_1000_COUNT.equals(that.CREDIT_AMOUNT_501_1000_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_1001_2000_COUNT == null ? that.CREDIT_AMOUNT_1001_2000_COUNT == null : this.CREDIT_AMOUNT_1001_2000_COUNT.equals(that.CREDIT_AMOUNT_1001_2000_COUNT));
    equal = equal && (this.CREDIT_AMOUNT_2001_COUNT == null ? that.CREDIT_AMOUNT_2001_COUNT == null : this.CREDIT_AMOUNT_2001_COUNT.equals(that.CREDIT_AMOUNT_2001_COUNT));
    equal = equal && (this.LESS_ONE_MONTH_COUNT == null ? that.LESS_ONE_MONTH_COUNT == null : this.LESS_ONE_MONTH_COUNT.equals(that.LESS_ONE_MONTH_COUNT));
    equal = equal && (this.ONE_TO_SIX_MONTH_COUNT == null ? that.ONE_TO_SIX_MONTH_COUNT == null : this.ONE_TO_SIX_MONTH_COUNT.equals(that.ONE_TO_SIX_MONTH_COUNT));
    equal = equal && (this.SIX_TO_TWELVE_MONTH_COUNT == null ? that.SIX_TO_TWELVE_MONTH_COUNT == null : this.SIX_TO_TWELVE_MONTH_COUNT.equals(that.SIX_TO_TWELVE_MONTH_COUNT));
    equal = equal && (this.GRANTER_TWELVE_MONTH_COUNT == null ? that.GRANTER_TWELVE_MONTH_COUNT == null : this.GRANTER_TWELVE_MONTH_COUNT.equals(that.GRANTER_TWELVE_MONTH_COUNT));
    equal = equal && (this.SZ_UNPAY_AMOUNT_TOTAL == null ? that.SZ_UNPAY_AMOUNT_TOTAL == null : this.SZ_UNPAY_AMOUNT_TOTAL.equals(that.SZ_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.SZ_UNPAY_AMOUNT_COUNT == null ? that.SZ_UNPAY_AMOUNT_COUNT == null : this.SZ_UNPAY_AMOUNT_COUNT.equals(that.SZ_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.HD_UNPAY_AMOUNT_TOTAL == null ? that.HD_UNPAY_AMOUNT_TOTAL == null : this.HD_UNPAY_AMOUNT_TOTAL.equals(that.HD_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.HD_UNPAY_AMOUNT_COUNT == null ? that.HD_UNPAY_AMOUNT_COUNT == null : this.HD_UNPAY_AMOUNT_COUNT.equals(that.HD_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.KD_UNPAY_AMOUNT_TOTAL == null ? that.KD_UNPAY_AMOUNT_TOTAL == null : this.KD_UNPAY_AMOUNT_TOTAL.equals(that.KD_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.KD_UNPAY_AMOUNT_COUNT == null ? that.KD_UNPAY_AMOUNT_COUNT == null : this.KD_UNPAY_AMOUNT_COUNT.equals(that.KD_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.ZZ_UNPAY_AMOUNT_TOTAL == null ? that.ZZ_UNPAY_AMOUNT_TOTAL == null : this.ZZ_UNPAY_AMOUNT_TOTAL.equals(that.ZZ_UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.ZZ_UNPAY_AMOUNT_COUNT == null ? that.ZZ_UNPAY_AMOUNT_COUNT == null : this.ZZ_UNPAY_AMOUNT_COUNT.equals(that.ZZ_UNPAY_AMOUNT_COUNT));
    equal = equal && (this.UNPAY_AMOUNT_TOTAL == null ? that.UNPAY_AMOUNT_TOTAL == null : this.UNPAY_AMOUNT_TOTAL.equals(that.UNPAY_AMOUNT_TOTAL));
    equal = equal && (this.UNPAY_TOTAL_COUNT == null ? that.UNPAY_TOTAL_COUNT == null : this.UNPAY_TOTAL_COUNT.equals(that.UNPAY_TOTAL_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.PAYMENT_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.PAYMENT_SIX_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.PAYMENT_YEAR_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.PAYMENT_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NO_CREDIT_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.CREDIT_AMOUNT_0_200_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.CREDIT_AMOUNT_201_300_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CREDIT_AMOUNT_301_500_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.CREDIT_AMOUNT_501_1000_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.CREDIT_AMOUNT_1001_2000_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CREDIT_AMOUNT_2001_COUNT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.LESS_ONE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ONE_TO_SIX_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.SIX_TO_TWELVE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.GRANTER_TWELVE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SZ_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.SZ_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.HD_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.HD_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.KD_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.KD_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ZZ_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ZZ_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.UNPAY_TOTAL_COUNT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.PAYMENT_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.PAYMENT_SIX_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.PAYMENT_YEAR_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.PAYMENT_COUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NO_CREDIT_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.CREDIT_AMOUNT_0_200_COUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.CREDIT_AMOUNT_201_300_COUNT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CREDIT_AMOUNT_301_500_COUNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.CREDIT_AMOUNT_501_1000_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.CREDIT_AMOUNT_1001_2000_COUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CREDIT_AMOUNT_2001_COUNT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.LESS_ONE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ONE_TO_SIX_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.SIX_TO_TWELVE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.GRANTER_TWELVE_MONTH_COUNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SZ_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.SZ_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.HD_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.HD_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.KD_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.KD_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ZZ_UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ZZ_UNPAY_AMOUNT_COUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.UNPAY_AMOUNT_TOTAL = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.UNPAY_TOTAL_COUNT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(30, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(PAYMENT_MONTH_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_SIX_MONTH_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_YEAR_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NO_CREDIT_AMOUNT_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_0_200_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_201_300_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_301_500_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_501_1000_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_1001_2000_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_2001_COUNT, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LESS_ONE_MONTH_COUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONE_TO_SIX_MONTH_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SIX_TO_TWELVE_MONTH_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GRANTER_TWELVE_MONTH_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SZ_UNPAY_AMOUNT_TOTAL, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SZ_UNPAY_AMOUNT_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HD_UNPAY_AMOUNT_TOTAL, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HD_UNPAY_AMOUNT_COUNT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KD_UNPAY_AMOUNT_TOTAL, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KD_UNPAY_AMOUNT_COUNT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ZZ_UNPAY_AMOUNT_TOTAL, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ZZ_UNPAY_AMOUNT_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNPAY_AMOUNT_TOTAL, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNPAY_TOTAL_COUNT, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 30 + __off, 12, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_MONTH_COUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_SIX_MONTH_COUNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_YEAR_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PAYMENT_COUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NO_CREDIT_AMOUNT_COUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_0_200_COUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_201_300_COUNT, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_301_500_COUNT, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_501_1000_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_1001_2000_COUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CREDIT_AMOUNT_2001_COUNT, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LESS_ONE_MONTH_COUNT, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ONE_TO_SIX_MONTH_COUNT, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SIX_TO_TWELVE_MONTH_COUNT, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GRANTER_TWELVE_MONTH_COUNT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SZ_UNPAY_AMOUNT_TOTAL, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SZ_UNPAY_AMOUNT_COUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HD_UNPAY_AMOUNT_TOTAL, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HD_UNPAY_AMOUNT_COUNT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KD_UNPAY_AMOUNT_TOTAL, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KD_UNPAY_AMOUNT_COUNT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ZZ_UNPAY_AMOUNT_TOTAL, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ZZ_UNPAY_AMOUNT_COUNT, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNPAY_AMOUNT_TOTAL, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNPAY_TOTAL_COUNT, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 30 + __off, 12, __dbStmt);
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
        this.PAYMENT_MONTH_COUNT = null;
    } else {
    this.PAYMENT_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_SIX_MONTH_COUNT = null;
    } else {
    this.PAYMENT_SIX_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_YEAR_COUNT = null;
    } else {
    this.PAYMENT_YEAR_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_COUNT = null;
    } else {
    this.PAYMENT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_CREDIT_AMOUNT_COUNT = null;
    } else {
    this.NO_CREDIT_AMOUNT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_0_200_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_0_200_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_201_300_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_201_300_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_301_500_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_301_500_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_501_1000_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_501_1000_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_1001_2000_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_1001_2000_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREDIT_AMOUNT_2001_COUNT = null;
    } else {
    this.CREDIT_AMOUNT_2001_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LESS_ONE_MONTH_COUNT = null;
    } else {
    this.LESS_ONE_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ONE_TO_SIX_MONTH_COUNT = null;
    } else {
    this.ONE_TO_SIX_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SIX_TO_TWELVE_MONTH_COUNT = null;
    } else {
    this.SIX_TO_TWELVE_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRANTER_TWELVE_MONTH_COUNT = null;
    } else {
    this.GRANTER_TWELVE_MONTH_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SZ_UNPAY_AMOUNT_TOTAL = null;
    } else {
    this.SZ_UNPAY_AMOUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SZ_UNPAY_AMOUNT_COUNT = null;
    } else {
    this.SZ_UNPAY_AMOUNT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HD_UNPAY_AMOUNT_TOTAL = null;
    } else {
    this.HD_UNPAY_AMOUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HD_UNPAY_AMOUNT_COUNT = null;
    } else {
    this.HD_UNPAY_AMOUNT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KD_UNPAY_AMOUNT_TOTAL = null;
    } else {
    this.KD_UNPAY_AMOUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KD_UNPAY_AMOUNT_COUNT = null;
    } else {
    this.KD_UNPAY_AMOUNT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ZZ_UNPAY_AMOUNT_TOTAL = null;
    } else {
    this.ZZ_UNPAY_AMOUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ZZ_UNPAY_AMOUNT_COUNT = null;
    } else {
    this.ZZ_UNPAY_AMOUNT_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNPAY_AMOUNT_TOTAL = null;
    } else {
    this.UNPAY_AMOUNT_TOTAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNPAY_TOTAL_COUNT = null;
    } else {
    this.UNPAY_TOTAL_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.PAYMENT_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_MONTH_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_SIX_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_SIX_MONTH_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_YEAR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_YEAR_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_COUNT, __dataOut);
    }
    if (null == this.NO_CREDIT_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NO_CREDIT_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_0_200_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_0_200_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_201_300_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_201_300_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_301_500_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_301_500_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_501_1000_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_501_1000_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_1001_2000_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_1001_2000_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_2001_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_2001_COUNT, __dataOut);
    }
    if (null == this.LESS_ONE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LESS_ONE_MONTH_COUNT, __dataOut);
    }
    if (null == this.ONE_TO_SIX_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONE_TO_SIX_MONTH_COUNT, __dataOut);
    }
    if (null == this.SIX_TO_TWELVE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SIX_TO_TWELVE_MONTH_COUNT, __dataOut);
    }
    if (null == this.GRANTER_TWELVE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GRANTER_TWELVE_MONTH_COUNT, __dataOut);
    }
    if (null == this.SZ_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SZ_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.SZ_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SZ_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.HD_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HD_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.HD_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HD_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.KD_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KD_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.KD_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KD_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.ZZ_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ZZ_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.ZZ_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ZZ_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.UNPAY_TOTAL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNPAY_TOTAL_COUNT, __dataOut);
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
    if (null == this.PAYMENT_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_MONTH_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_SIX_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_SIX_MONTH_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_YEAR_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_YEAR_COUNT, __dataOut);
    }
    if (null == this.PAYMENT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PAYMENT_COUNT, __dataOut);
    }
    if (null == this.NO_CREDIT_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NO_CREDIT_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_0_200_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_0_200_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_201_300_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_201_300_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_301_500_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_301_500_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_501_1000_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_501_1000_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_1001_2000_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_1001_2000_COUNT, __dataOut);
    }
    if (null == this.CREDIT_AMOUNT_2001_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CREDIT_AMOUNT_2001_COUNT, __dataOut);
    }
    if (null == this.LESS_ONE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LESS_ONE_MONTH_COUNT, __dataOut);
    }
    if (null == this.ONE_TO_SIX_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ONE_TO_SIX_MONTH_COUNT, __dataOut);
    }
    if (null == this.SIX_TO_TWELVE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SIX_TO_TWELVE_MONTH_COUNT, __dataOut);
    }
    if (null == this.GRANTER_TWELVE_MONTH_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GRANTER_TWELVE_MONTH_COUNT, __dataOut);
    }
    if (null == this.SZ_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SZ_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.SZ_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SZ_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.HD_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HD_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.HD_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HD_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.KD_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KD_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.KD_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KD_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.ZZ_UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ZZ_UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.ZZ_UNPAY_AMOUNT_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ZZ_UNPAY_AMOUNT_COUNT, __dataOut);
    }
    if (null == this.UNPAY_AMOUNT_TOTAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNPAY_AMOUNT_TOTAL, __dataOut);
    }
    if (null == this.UNPAY_TOTAL_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNPAY_TOTAL_COUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_MONTH_COUNT==null?"null":PAYMENT_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_SIX_MONTH_COUNT==null?"null":PAYMENT_SIX_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_YEAR_COUNT==null?"null":PAYMENT_YEAR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_COUNT==null?"null":PAYMENT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_CREDIT_AMOUNT_COUNT==null?"null":NO_CREDIT_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_0_200_COUNT==null?"null":CREDIT_AMOUNT_0_200_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_201_300_COUNT==null?"null":CREDIT_AMOUNT_201_300_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_301_500_COUNT==null?"null":CREDIT_AMOUNT_301_500_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_501_1000_COUNT==null?"null":CREDIT_AMOUNT_501_1000_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_1001_2000_COUNT==null?"null":CREDIT_AMOUNT_1001_2000_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_2001_COUNT==null?"null":CREDIT_AMOUNT_2001_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LESS_ONE_MONTH_COUNT==null?"null":LESS_ONE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONE_TO_SIX_MONTH_COUNT==null?"null":ONE_TO_SIX_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SIX_TO_TWELVE_MONTH_COUNT==null?"null":SIX_TO_TWELVE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRANTER_TWELVE_MONTH_COUNT==null?"null":GRANTER_TWELVE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SZ_UNPAY_AMOUNT_TOTAL==null?"null":SZ_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SZ_UNPAY_AMOUNT_COUNT==null?"null":SZ_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HD_UNPAY_AMOUNT_TOTAL==null?"null":HD_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HD_UNPAY_AMOUNT_COUNT==null?"null":HD_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KD_UNPAY_AMOUNT_TOTAL==null?"null":KD_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KD_UNPAY_AMOUNT_COUNT==null?"null":KD_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ZZ_UNPAY_AMOUNT_TOTAL==null?"null":ZZ_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ZZ_UNPAY_AMOUNT_COUNT==null?"null":ZZ_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNPAY_AMOUNT_TOTAL==null?"null":UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNPAY_TOTAL_COUNT==null?"null":UNPAY_TOTAL_COUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_MONTH_COUNT==null?"null":PAYMENT_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_SIX_MONTH_COUNT==null?"null":PAYMENT_SIX_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_YEAR_COUNT==null?"null":PAYMENT_YEAR_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_COUNT==null?"null":PAYMENT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_CREDIT_AMOUNT_COUNT==null?"null":NO_CREDIT_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_0_200_COUNT==null?"null":CREDIT_AMOUNT_0_200_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_201_300_COUNT==null?"null":CREDIT_AMOUNT_201_300_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_301_500_COUNT==null?"null":CREDIT_AMOUNT_301_500_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_501_1000_COUNT==null?"null":CREDIT_AMOUNT_501_1000_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_1001_2000_COUNT==null?"null":CREDIT_AMOUNT_1001_2000_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREDIT_AMOUNT_2001_COUNT==null?"null":CREDIT_AMOUNT_2001_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LESS_ONE_MONTH_COUNT==null?"null":LESS_ONE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ONE_TO_SIX_MONTH_COUNT==null?"null":ONE_TO_SIX_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SIX_TO_TWELVE_MONTH_COUNT==null?"null":SIX_TO_TWELVE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRANTER_TWELVE_MONTH_COUNT==null?"null":GRANTER_TWELVE_MONTH_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SZ_UNPAY_AMOUNT_TOTAL==null?"null":SZ_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SZ_UNPAY_AMOUNT_COUNT==null?"null":SZ_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HD_UNPAY_AMOUNT_TOTAL==null?"null":HD_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HD_UNPAY_AMOUNT_COUNT==null?"null":HD_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KD_UNPAY_AMOUNT_TOTAL==null?"null":KD_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KD_UNPAY_AMOUNT_COUNT==null?"null":KD_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ZZ_UNPAY_AMOUNT_TOTAL==null?"null":ZZ_UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ZZ_UNPAY_AMOUNT_COUNT==null?"null":ZZ_UNPAY_AMOUNT_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNPAY_AMOUNT_TOTAL==null?"null":UNPAY_AMOUNT_TOTAL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNPAY_TOTAL_COUNT==null?"null":UNPAY_TOTAL_COUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_MONTH_COUNT = null; } else {
      this.PAYMENT_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_SIX_MONTH_COUNT = null; } else {
      this.PAYMENT_SIX_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_YEAR_COUNT = null; } else {
      this.PAYMENT_YEAR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_COUNT = null; } else {
      this.PAYMENT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_CREDIT_AMOUNT_COUNT = null; } else {
      this.NO_CREDIT_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_0_200_COUNT = null; } else {
      this.CREDIT_AMOUNT_0_200_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_201_300_COUNT = null; } else {
      this.CREDIT_AMOUNT_201_300_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_301_500_COUNT = null; } else {
      this.CREDIT_AMOUNT_301_500_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_501_1000_COUNT = null; } else {
      this.CREDIT_AMOUNT_501_1000_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_1001_2000_COUNT = null; } else {
      this.CREDIT_AMOUNT_1001_2000_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_2001_COUNT = null; } else {
      this.CREDIT_AMOUNT_2001_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LESS_ONE_MONTH_COUNT = null; } else {
      this.LESS_ONE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONE_TO_SIX_MONTH_COUNT = null; } else {
      this.ONE_TO_SIX_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SIX_TO_TWELVE_MONTH_COUNT = null; } else {
      this.SIX_TO_TWELVE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GRANTER_TWELVE_MONTH_COUNT = null; } else {
      this.GRANTER_TWELVE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SZ_UNPAY_AMOUNT_TOTAL = null; } else {
      this.SZ_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SZ_UNPAY_AMOUNT_COUNT = null; } else {
      this.SZ_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HD_UNPAY_AMOUNT_TOTAL = null; } else {
      this.HD_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HD_UNPAY_AMOUNT_COUNT = null; } else {
      this.HD_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.KD_UNPAY_AMOUNT_TOTAL = null; } else {
      this.KD_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.KD_UNPAY_AMOUNT_COUNT = null; } else {
      this.KD_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ZZ_UNPAY_AMOUNT_TOTAL = null; } else {
      this.ZZ_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ZZ_UNPAY_AMOUNT_COUNT = null; } else {
      this.ZZ_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UNPAY_AMOUNT_TOTAL = null; } else {
      this.UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UNPAY_TOTAL_COUNT = null; } else {
      this.UNPAY_TOTAL_COUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_MONTH_COUNT = null; } else {
      this.PAYMENT_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_SIX_MONTH_COUNT = null; } else {
      this.PAYMENT_SIX_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_YEAR_COUNT = null; } else {
      this.PAYMENT_YEAR_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.PAYMENT_COUNT = null; } else {
      this.PAYMENT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NO_CREDIT_AMOUNT_COUNT = null; } else {
      this.NO_CREDIT_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_0_200_COUNT = null; } else {
      this.CREDIT_AMOUNT_0_200_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_201_300_COUNT = null; } else {
      this.CREDIT_AMOUNT_201_300_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_301_500_COUNT = null; } else {
      this.CREDIT_AMOUNT_301_500_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_501_1000_COUNT = null; } else {
      this.CREDIT_AMOUNT_501_1000_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_1001_2000_COUNT = null; } else {
      this.CREDIT_AMOUNT_1001_2000_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CREDIT_AMOUNT_2001_COUNT = null; } else {
      this.CREDIT_AMOUNT_2001_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LESS_ONE_MONTH_COUNT = null; } else {
      this.LESS_ONE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ONE_TO_SIX_MONTH_COUNT = null; } else {
      this.ONE_TO_SIX_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SIX_TO_TWELVE_MONTH_COUNT = null; } else {
      this.SIX_TO_TWELVE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.GRANTER_TWELVE_MONTH_COUNT = null; } else {
      this.GRANTER_TWELVE_MONTH_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SZ_UNPAY_AMOUNT_TOTAL = null; } else {
      this.SZ_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.SZ_UNPAY_AMOUNT_COUNT = null; } else {
      this.SZ_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HD_UNPAY_AMOUNT_TOTAL = null; } else {
      this.HD_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HD_UNPAY_AMOUNT_COUNT = null; } else {
      this.HD_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.KD_UNPAY_AMOUNT_TOTAL = null; } else {
      this.KD_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.KD_UNPAY_AMOUNT_COUNT = null; } else {
      this.KD_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ZZ_UNPAY_AMOUNT_TOTAL = null; } else {
      this.ZZ_UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ZZ_UNPAY_AMOUNT_COUNT = null; } else {
      this.ZZ_UNPAY_AMOUNT_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UNPAY_AMOUNT_TOTAL = null; } else {
      this.UNPAY_AMOUNT_TOTAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.UNPAY_TOTAL_COUNT = null; } else {
      this.UNPAY_TOTAL_COUNT = new java.math.BigDecimal(__cur_str);
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
    ST_ZG_ACCT o = (ST_ZG_ACCT) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_ZG_ACCT o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PAYMENT_MONTH_COUNT", this.PAYMENT_MONTH_COUNT);
    __sqoop$field_map.put("PAYMENT_SIX_MONTH_COUNT", this.PAYMENT_SIX_MONTH_COUNT);
    __sqoop$field_map.put("PAYMENT_YEAR_COUNT", this.PAYMENT_YEAR_COUNT);
    __sqoop$field_map.put("PAYMENT_COUNT", this.PAYMENT_COUNT);
    __sqoop$field_map.put("NO_CREDIT_AMOUNT_COUNT", this.NO_CREDIT_AMOUNT_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_0_200_COUNT", this.CREDIT_AMOUNT_0_200_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_201_300_COUNT", this.CREDIT_AMOUNT_201_300_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_301_500_COUNT", this.CREDIT_AMOUNT_301_500_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_501_1000_COUNT", this.CREDIT_AMOUNT_501_1000_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_1001_2000_COUNT", this.CREDIT_AMOUNT_1001_2000_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_2001_COUNT", this.CREDIT_AMOUNT_2001_COUNT);
    __sqoop$field_map.put("LESS_ONE_MONTH_COUNT", this.LESS_ONE_MONTH_COUNT);
    __sqoop$field_map.put("ONE_TO_SIX_MONTH_COUNT", this.ONE_TO_SIX_MONTH_COUNT);
    __sqoop$field_map.put("SIX_TO_TWELVE_MONTH_COUNT", this.SIX_TO_TWELVE_MONTH_COUNT);
    __sqoop$field_map.put("GRANTER_TWELVE_MONTH_COUNT", this.GRANTER_TWELVE_MONTH_COUNT);
    __sqoop$field_map.put("SZ_UNPAY_AMOUNT_TOTAL", this.SZ_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("SZ_UNPAY_AMOUNT_COUNT", this.SZ_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("HD_UNPAY_AMOUNT_TOTAL", this.HD_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("HD_UNPAY_AMOUNT_COUNT", this.HD_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("KD_UNPAY_AMOUNT_TOTAL", this.KD_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("KD_UNPAY_AMOUNT_COUNT", this.KD_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("ZZ_UNPAY_AMOUNT_TOTAL", this.ZZ_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("ZZ_UNPAY_AMOUNT_COUNT", this.ZZ_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("UNPAY_AMOUNT_TOTAL", this.UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("UNPAY_TOTAL_COUNT", this.UNPAY_TOTAL_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("PAYMENT_MONTH_COUNT", this.PAYMENT_MONTH_COUNT);
    __sqoop$field_map.put("PAYMENT_SIX_MONTH_COUNT", this.PAYMENT_SIX_MONTH_COUNT);
    __sqoop$field_map.put("PAYMENT_YEAR_COUNT", this.PAYMENT_YEAR_COUNT);
    __sqoop$field_map.put("PAYMENT_COUNT", this.PAYMENT_COUNT);
    __sqoop$field_map.put("NO_CREDIT_AMOUNT_COUNT", this.NO_CREDIT_AMOUNT_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_0_200_COUNT", this.CREDIT_AMOUNT_0_200_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_201_300_COUNT", this.CREDIT_AMOUNT_201_300_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_301_500_COUNT", this.CREDIT_AMOUNT_301_500_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_501_1000_COUNT", this.CREDIT_AMOUNT_501_1000_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_1001_2000_COUNT", this.CREDIT_AMOUNT_1001_2000_COUNT);
    __sqoop$field_map.put("CREDIT_AMOUNT_2001_COUNT", this.CREDIT_AMOUNT_2001_COUNT);
    __sqoop$field_map.put("LESS_ONE_MONTH_COUNT", this.LESS_ONE_MONTH_COUNT);
    __sqoop$field_map.put("ONE_TO_SIX_MONTH_COUNT", this.ONE_TO_SIX_MONTH_COUNT);
    __sqoop$field_map.put("SIX_TO_TWELVE_MONTH_COUNT", this.SIX_TO_TWELVE_MONTH_COUNT);
    __sqoop$field_map.put("GRANTER_TWELVE_MONTH_COUNT", this.GRANTER_TWELVE_MONTH_COUNT);
    __sqoop$field_map.put("SZ_UNPAY_AMOUNT_TOTAL", this.SZ_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("SZ_UNPAY_AMOUNT_COUNT", this.SZ_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("HD_UNPAY_AMOUNT_TOTAL", this.HD_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("HD_UNPAY_AMOUNT_COUNT", this.HD_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("KD_UNPAY_AMOUNT_TOTAL", this.KD_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("KD_UNPAY_AMOUNT_COUNT", this.KD_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("ZZ_UNPAY_AMOUNT_TOTAL", this.ZZ_UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("ZZ_UNPAY_AMOUNT_COUNT", this.ZZ_UNPAY_AMOUNT_COUNT);
    __sqoop$field_map.put("UNPAY_AMOUNT_TOTAL", this.UNPAY_AMOUNT_TOTAL);
    __sqoop$field_map.put("UNPAY_TOTAL_COUNT", this.UNPAY_TOTAL_COUNT);
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
    else    if ("PAYMENT_MONTH_COUNT".equals(__fieldName)) {
      this.PAYMENT_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_SIX_MONTH_COUNT".equals(__fieldName)) {
      this.PAYMENT_SIX_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_YEAR_COUNT".equals(__fieldName)) {
      this.PAYMENT_YEAR_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PAYMENT_COUNT".equals(__fieldName)) {
      this.PAYMENT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NO_CREDIT_AMOUNT_COUNT".equals(__fieldName)) {
      this.NO_CREDIT_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_0_200_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_0_200_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_201_300_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_201_300_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_301_500_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_301_500_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_501_1000_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_501_1000_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_1001_2000_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_1001_2000_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CREDIT_AMOUNT_2001_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_2001_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LESS_ONE_MONTH_COUNT".equals(__fieldName)) {
      this.LESS_ONE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ONE_TO_SIX_MONTH_COUNT".equals(__fieldName)) {
      this.ONE_TO_SIX_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SIX_TO_TWELVE_MONTH_COUNT".equals(__fieldName)) {
      this.SIX_TO_TWELVE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("GRANTER_TWELVE_MONTH_COUNT".equals(__fieldName)) {
      this.GRANTER_TWELVE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SZ_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.SZ_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SZ_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.SZ_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HD_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.HD_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HD_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.HD_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KD_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.KD_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KD_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.KD_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ZZ_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.ZZ_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ZZ_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.ZZ_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("UNPAY_TOTAL_COUNT".equals(__fieldName)) {
      this.UNPAY_TOTAL_COUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("PAYMENT_MONTH_COUNT".equals(__fieldName)) {
      this.PAYMENT_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_SIX_MONTH_COUNT".equals(__fieldName)) {
      this.PAYMENT_SIX_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_YEAR_COUNT".equals(__fieldName)) {
      this.PAYMENT_YEAR_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PAYMENT_COUNT".equals(__fieldName)) {
      this.PAYMENT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NO_CREDIT_AMOUNT_COUNT".equals(__fieldName)) {
      this.NO_CREDIT_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_0_200_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_0_200_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_201_300_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_201_300_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_301_500_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_301_500_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_501_1000_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_501_1000_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_1001_2000_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_1001_2000_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CREDIT_AMOUNT_2001_COUNT".equals(__fieldName)) {
      this.CREDIT_AMOUNT_2001_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LESS_ONE_MONTH_COUNT".equals(__fieldName)) {
      this.LESS_ONE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ONE_TO_SIX_MONTH_COUNT".equals(__fieldName)) {
      this.ONE_TO_SIX_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SIX_TO_TWELVE_MONTH_COUNT".equals(__fieldName)) {
      this.SIX_TO_TWELVE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("GRANTER_TWELVE_MONTH_COUNT".equals(__fieldName)) {
      this.GRANTER_TWELVE_MONTH_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SZ_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.SZ_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("SZ_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.SZ_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HD_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.HD_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HD_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.HD_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KD_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.KD_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KD_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.KD_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ZZ_UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.ZZ_UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ZZ_UNPAY_AMOUNT_COUNT".equals(__fieldName)) {
      this.ZZ_UNPAY_AMOUNT_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("UNPAY_AMOUNT_TOTAL".equals(__fieldName)) {
      this.UNPAY_AMOUNT_TOTAL = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("UNPAY_TOTAL_COUNT".equals(__fieldName)) {
      this.UNPAY_TOTAL_COUNT = (java.math.BigDecimal) __fieldVal;
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
