// ORM class for table 'st_diff_offer_income_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 18 18:45:17 CST 2018
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

public class st_diff_offer_income_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_diff_offer_income_m with_CYCLE_ID(String CYCLE_ID) {
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
  public st_diff_offer_income_m with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_diff_offer_income_m with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String STD_OFFER_CODE;
  public String get_STD_OFFER_CODE() {
    return STD_OFFER_CODE;
  }
  public void set_STD_OFFER_CODE(String STD_OFFER_CODE) {
    this.STD_OFFER_CODE = STD_OFFER_CODE;
  }
  public st_diff_offer_income_m with_STD_OFFER_CODE(String STD_OFFER_CODE) {
    this.STD_OFFER_CODE = STD_OFFER_CODE;
    return this;
  }
  private String STD_OFFER_NAME;
  public String get_STD_OFFER_NAME() {
    return STD_OFFER_NAME;
  }
  public void set_STD_OFFER_NAME(String STD_OFFER_NAME) {
    this.STD_OFFER_NAME = STD_OFFER_NAME;
  }
  public st_diff_offer_income_m with_STD_OFFER_NAME(String STD_OFFER_NAME) {
    this.STD_OFFER_NAME = STD_OFFER_NAME;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_USER_COUNT;
  public java.math.BigDecimal get_NEW_ORDER_USER_COUNT() {
    return NEW_ORDER_USER_COUNT;
  }
  public void set_NEW_ORDER_USER_COUNT(java.math.BigDecimal NEW_ORDER_USER_COUNT) {
    this.NEW_ORDER_USER_COUNT = NEW_ORDER_USER_COUNT;
  }
  public st_diff_offer_income_m with_NEW_ORDER_USER_COUNT(java.math.BigDecimal NEW_ORDER_USER_COUNT) {
    this.NEW_ORDER_USER_COUNT = NEW_ORDER_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_USER_RATE;
  public java.math.BigDecimal get_NEW_ORDER_USER_RATE() {
    return NEW_ORDER_USER_RATE;
  }
  public void set_NEW_ORDER_USER_RATE(java.math.BigDecimal NEW_ORDER_USER_RATE) {
    this.NEW_ORDER_USER_RATE = NEW_ORDER_USER_RATE;
  }
  public st_diff_offer_income_m with_NEW_ORDER_USER_RATE(java.math.BigDecimal NEW_ORDER_USER_RATE) {
    this.NEW_ORDER_USER_RATE = NEW_ORDER_USER_RATE;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_AMOUNT;
  public java.math.BigDecimal get_NEW_ORDER_AMOUNT() {
    return NEW_ORDER_AMOUNT;
  }
  public void set_NEW_ORDER_AMOUNT(java.math.BigDecimal NEW_ORDER_AMOUNT) {
    this.NEW_ORDER_AMOUNT = NEW_ORDER_AMOUNT;
  }
  public st_diff_offer_income_m with_NEW_ORDER_AMOUNT(java.math.BigDecimal NEW_ORDER_AMOUNT) {
    this.NEW_ORDER_AMOUNT = NEW_ORDER_AMOUNT;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_AMOUNT_RATE;
  public java.math.BigDecimal get_NEW_ORDER_AMOUNT_RATE() {
    return NEW_ORDER_AMOUNT_RATE;
  }
  public void set_NEW_ORDER_AMOUNT_RATE(java.math.BigDecimal NEW_ORDER_AMOUNT_RATE) {
    this.NEW_ORDER_AMOUNT_RATE = NEW_ORDER_AMOUNT_RATE;
  }
  public st_diff_offer_income_m with_NEW_ORDER_AMOUNT_RATE(java.math.BigDecimal NEW_ORDER_AMOUNT_RATE) {
    this.NEW_ORDER_AMOUNT_RATE = NEW_ORDER_AMOUNT_RATE;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_AMOUNT_ARPU;
  public java.math.BigDecimal get_NEW_ORDER_AMOUNT_ARPU() {
    return NEW_ORDER_AMOUNT_ARPU;
  }
  public void set_NEW_ORDER_AMOUNT_ARPU(java.math.BigDecimal NEW_ORDER_AMOUNT_ARPU) {
    this.NEW_ORDER_AMOUNT_ARPU = NEW_ORDER_AMOUNT_ARPU;
  }
  public st_diff_offer_income_m with_NEW_ORDER_AMOUNT_ARPU(java.math.BigDecimal NEW_ORDER_AMOUNT_ARPU) {
    this.NEW_ORDER_AMOUNT_ARPU = NEW_ORDER_AMOUNT_ARPU;
    return this;
  }
  private java.math.BigDecimal NEW_ORDER_AMOUNT_NOT0_ARPU;
  public java.math.BigDecimal get_NEW_ORDER_AMOUNT_NOT0_ARPU() {
    return NEW_ORDER_AMOUNT_NOT0_ARPU;
  }
  public void set_NEW_ORDER_AMOUNT_NOT0_ARPU(java.math.BigDecimal NEW_ORDER_AMOUNT_NOT0_ARPU) {
    this.NEW_ORDER_AMOUNT_NOT0_ARPU = NEW_ORDER_AMOUNT_NOT0_ARPU;
  }
  public st_diff_offer_income_m with_NEW_ORDER_AMOUNT_NOT0_ARPU(java.math.BigDecimal NEW_ORDER_AMOUNT_NOT0_ARPU) {
    this.NEW_ORDER_AMOUNT_NOT0_ARPU = NEW_ORDER_AMOUNT_NOT0_ARPU;
    return this;
  }
  private java.math.BigDecimal BILL_USER_COUNT;
  public java.math.BigDecimal get_BILL_USER_COUNT() {
    return BILL_USER_COUNT;
  }
  public void set_BILL_USER_COUNT(java.math.BigDecimal BILL_USER_COUNT) {
    this.BILL_USER_COUNT = BILL_USER_COUNT;
  }
  public st_diff_offer_income_m with_BILL_USER_COUNT(java.math.BigDecimal BILL_USER_COUNT) {
    this.BILL_USER_COUNT = BILL_USER_COUNT;
    return this;
  }
  private java.math.BigDecimal BILL_AMOUNT;
  public java.math.BigDecimal get_BILL_AMOUNT() {
    return BILL_AMOUNT;
  }
  public void set_BILL_AMOUNT(java.math.BigDecimal BILL_AMOUNT) {
    this.BILL_AMOUNT = BILL_AMOUNT;
  }
  public st_diff_offer_income_m with_BILL_AMOUNT(java.math.BigDecimal BILL_AMOUNT) {
    this.BILL_AMOUNT = BILL_AMOUNT;
    return this;
  }
  private java.math.BigDecimal BILL_AMOUNT_RATE;
  public java.math.BigDecimal get_BILL_AMOUNT_RATE() {
    return BILL_AMOUNT_RATE;
  }
  public void set_BILL_AMOUNT_RATE(java.math.BigDecimal BILL_AMOUNT_RATE) {
    this.BILL_AMOUNT_RATE = BILL_AMOUNT_RATE;
  }
  public st_diff_offer_income_m with_BILL_AMOUNT_RATE(java.math.BigDecimal BILL_AMOUNT_RATE) {
    this.BILL_AMOUNT_RATE = BILL_AMOUNT_RATE;
    return this;
  }
  private java.math.BigDecimal BILL_AMOUNT_ARPU;
  public java.math.BigDecimal get_BILL_AMOUNT_ARPU() {
    return BILL_AMOUNT_ARPU;
  }
  public void set_BILL_AMOUNT_ARPU(java.math.BigDecimal BILL_AMOUNT_ARPU) {
    this.BILL_AMOUNT_ARPU = BILL_AMOUNT_ARPU;
  }
  public st_diff_offer_income_m with_BILL_AMOUNT_ARPU(java.math.BigDecimal BILL_AMOUNT_ARPU) {
    this.BILL_AMOUNT_ARPU = BILL_AMOUNT_ARPU;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_diff_offer_income_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_diff_offer_income_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_offer_income_m)) {
      return false;
    }
    st_diff_offer_income_m that = (st_diff_offer_income_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.STD_OFFER_CODE == null ? that.STD_OFFER_CODE == null : this.STD_OFFER_CODE.equals(that.STD_OFFER_CODE));
    equal = equal && (this.STD_OFFER_NAME == null ? that.STD_OFFER_NAME == null : this.STD_OFFER_NAME.equals(that.STD_OFFER_NAME));
    equal = equal && (this.NEW_ORDER_USER_COUNT == null ? that.NEW_ORDER_USER_COUNT == null : this.NEW_ORDER_USER_COUNT.equals(that.NEW_ORDER_USER_COUNT));
    equal = equal && (this.NEW_ORDER_USER_RATE == null ? that.NEW_ORDER_USER_RATE == null : this.NEW_ORDER_USER_RATE.equals(that.NEW_ORDER_USER_RATE));
    equal = equal && (this.NEW_ORDER_AMOUNT == null ? that.NEW_ORDER_AMOUNT == null : this.NEW_ORDER_AMOUNT.equals(that.NEW_ORDER_AMOUNT));
    equal = equal && (this.NEW_ORDER_AMOUNT_RATE == null ? that.NEW_ORDER_AMOUNT_RATE == null : this.NEW_ORDER_AMOUNT_RATE.equals(that.NEW_ORDER_AMOUNT_RATE));
    equal = equal && (this.NEW_ORDER_AMOUNT_ARPU == null ? that.NEW_ORDER_AMOUNT_ARPU == null : this.NEW_ORDER_AMOUNT_ARPU.equals(that.NEW_ORDER_AMOUNT_ARPU));
    equal = equal && (this.NEW_ORDER_AMOUNT_NOT0_ARPU == null ? that.NEW_ORDER_AMOUNT_NOT0_ARPU == null : this.NEW_ORDER_AMOUNT_NOT0_ARPU.equals(that.NEW_ORDER_AMOUNT_NOT0_ARPU));
    equal = equal && (this.BILL_USER_COUNT == null ? that.BILL_USER_COUNT == null : this.BILL_USER_COUNT.equals(that.BILL_USER_COUNT));
    equal = equal && (this.BILL_AMOUNT == null ? that.BILL_AMOUNT == null : this.BILL_AMOUNT.equals(that.BILL_AMOUNT));
    equal = equal && (this.BILL_AMOUNT_RATE == null ? that.BILL_AMOUNT_RATE == null : this.BILL_AMOUNT_RATE.equals(that.BILL_AMOUNT_RATE));
    equal = equal && (this.BILL_AMOUNT_ARPU == null ? that.BILL_AMOUNT_ARPU == null : this.BILL_AMOUNT_ARPU.equals(that.BILL_AMOUNT_ARPU));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_diff_offer_income_m)) {
      return false;
    }
    st_diff_offer_income_m that = (st_diff_offer_income_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.STD_OFFER_CODE == null ? that.STD_OFFER_CODE == null : this.STD_OFFER_CODE.equals(that.STD_OFFER_CODE));
    equal = equal && (this.STD_OFFER_NAME == null ? that.STD_OFFER_NAME == null : this.STD_OFFER_NAME.equals(that.STD_OFFER_NAME));
    equal = equal && (this.NEW_ORDER_USER_COUNT == null ? that.NEW_ORDER_USER_COUNT == null : this.NEW_ORDER_USER_COUNT.equals(that.NEW_ORDER_USER_COUNT));
    equal = equal && (this.NEW_ORDER_USER_RATE == null ? that.NEW_ORDER_USER_RATE == null : this.NEW_ORDER_USER_RATE.equals(that.NEW_ORDER_USER_RATE));
    equal = equal && (this.NEW_ORDER_AMOUNT == null ? that.NEW_ORDER_AMOUNT == null : this.NEW_ORDER_AMOUNT.equals(that.NEW_ORDER_AMOUNT));
    equal = equal && (this.NEW_ORDER_AMOUNT_RATE == null ? that.NEW_ORDER_AMOUNT_RATE == null : this.NEW_ORDER_AMOUNT_RATE.equals(that.NEW_ORDER_AMOUNT_RATE));
    equal = equal && (this.NEW_ORDER_AMOUNT_ARPU == null ? that.NEW_ORDER_AMOUNT_ARPU == null : this.NEW_ORDER_AMOUNT_ARPU.equals(that.NEW_ORDER_AMOUNT_ARPU));
    equal = equal && (this.NEW_ORDER_AMOUNT_NOT0_ARPU == null ? that.NEW_ORDER_AMOUNT_NOT0_ARPU == null : this.NEW_ORDER_AMOUNT_NOT0_ARPU.equals(that.NEW_ORDER_AMOUNT_NOT0_ARPU));
    equal = equal && (this.BILL_USER_COUNT == null ? that.BILL_USER_COUNT == null : this.BILL_USER_COUNT.equals(that.BILL_USER_COUNT));
    equal = equal && (this.BILL_AMOUNT == null ? that.BILL_AMOUNT == null : this.BILL_AMOUNT.equals(that.BILL_AMOUNT));
    equal = equal && (this.BILL_AMOUNT_RATE == null ? that.BILL_AMOUNT_RATE == null : this.BILL_AMOUNT_RATE.equals(that.BILL_AMOUNT_RATE));
    equal = equal && (this.BILL_AMOUNT_ARPU == null ? that.BILL_AMOUNT_ARPU == null : this.BILL_AMOUNT_ARPU.equals(that.BILL_AMOUNT_ARPU));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_OFFER_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_OFFER_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.NEW_ORDER_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.NEW_ORDER_USER_RATE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NEW_ORDER_AMOUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.NEW_ORDER_AMOUNT_RATE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.NEW_ORDER_AMOUNT_ARPU = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.NEW_ORDER_AMOUNT_NOT0_ARPU = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BILL_USER_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.BILL_AMOUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.BILL_AMOUNT_RATE = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.BILL_AMOUNT_ARPU = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.STD_OFFER_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.STD_OFFER_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.NEW_ORDER_USER_COUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.NEW_ORDER_USER_RATE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.NEW_ORDER_AMOUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.NEW_ORDER_AMOUNT_RATE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.NEW_ORDER_AMOUNT_ARPU = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.NEW_ORDER_AMOUNT_NOT0_ARPU = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BILL_USER_COUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.BILL_AMOUNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.BILL_AMOUNT_RATE = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.BILL_AMOUNT_ARPU = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(17, __dbResults);
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
    JdbcWritableBridge.writeString(STD_OFFER_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_OFFER_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_USER_RATE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_RATE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_ARPU, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_NOT0_ARPU, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_USER_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT_RATE, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT_ARPU, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 17 + __off, 1, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_OFFER_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STD_OFFER_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_USER_COUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_USER_RATE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_RATE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_ARPU, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_ORDER_AMOUNT_NOT0_ARPU, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_USER_COUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT_RATE, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILL_AMOUNT_ARPU, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 17 + __off, 1, __dbStmt);
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
        this.STD_OFFER_CODE = null;
    } else {
    this.STD_OFFER_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STD_OFFER_NAME = null;
    } else {
    this.STD_OFFER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_USER_COUNT = null;
    } else {
    this.NEW_ORDER_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_USER_RATE = null;
    } else {
    this.NEW_ORDER_USER_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_AMOUNT = null;
    } else {
    this.NEW_ORDER_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_AMOUNT_RATE = null;
    } else {
    this.NEW_ORDER_AMOUNT_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_AMOUNT_ARPU = null;
    } else {
    this.NEW_ORDER_AMOUNT_ARPU = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_ORDER_AMOUNT_NOT0_ARPU = null;
    } else {
    this.NEW_ORDER_AMOUNT_NOT0_ARPU = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BILL_USER_COUNT = null;
    } else {
    this.BILL_USER_COUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BILL_AMOUNT = null;
    } else {
    this.BILL_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BILL_AMOUNT_RATE = null;
    } else {
    this.BILL_AMOUNT_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BILL_AMOUNT_ARPU = null;
    } else {
    this.BILL_AMOUNT_ARPU = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.STD_OFFER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_OFFER_CODE);
    }
    if (null == this.STD_OFFER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_OFFER_NAME);
    }
    if (null == this.NEW_ORDER_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_USER_COUNT, __dataOut);
    }
    if (null == this.NEW_ORDER_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_USER_RATE, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_RATE, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_ARPU, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_NOT0_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_NOT0_ARPU, __dataOut);
    }
    if (null == this.BILL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_USER_COUNT, __dataOut);
    }
    if (null == this.BILL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT, __dataOut);
    }
    if (null == this.BILL_AMOUNT_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT_RATE, __dataOut);
    }
    if (null == this.BILL_AMOUNT_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT_ARPU, __dataOut);
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
    if (null == this.STD_OFFER_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_OFFER_CODE);
    }
    if (null == this.STD_OFFER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STD_OFFER_NAME);
    }
    if (null == this.NEW_ORDER_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_USER_COUNT, __dataOut);
    }
    if (null == this.NEW_ORDER_USER_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_USER_RATE, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_RATE, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_ARPU, __dataOut);
    }
    if (null == this.NEW_ORDER_AMOUNT_NOT0_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_ORDER_AMOUNT_NOT0_ARPU, __dataOut);
    }
    if (null == this.BILL_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_USER_COUNT, __dataOut);
    }
    if (null == this.BILL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT, __dataOut);
    }
    if (null == this.BILL_AMOUNT_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT_RATE, __dataOut);
    }
    if (null == this.BILL_AMOUNT_ARPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILL_AMOUNT_ARPU, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_OFFER_CODE==null?"null":STD_OFFER_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_OFFER_NAME==null?"null":STD_OFFER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_USER_COUNT==null?"null":NEW_ORDER_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_USER_RATE==null?"null":NEW_ORDER_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT==null?"null":NEW_ORDER_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_RATE==null?"null":NEW_ORDER_AMOUNT_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_ARPU==null?"null":NEW_ORDER_AMOUNT_ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_NOT0_ARPU==null?"null":NEW_ORDER_AMOUNT_NOT0_ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_USER_COUNT==null?"null":BILL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT==null?"null":BILL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT_RATE==null?"null":BILL_AMOUNT_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT_ARPU==null?"null":BILL_AMOUNT_ARPU.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(STD_OFFER_CODE==null?"null":STD_OFFER_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STD_OFFER_NAME==null?"null":STD_OFFER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_USER_COUNT==null?"null":NEW_ORDER_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_USER_RATE==null?"null":NEW_ORDER_USER_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT==null?"null":NEW_ORDER_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_RATE==null?"null":NEW_ORDER_AMOUNT_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_ARPU==null?"null":NEW_ORDER_AMOUNT_ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_ORDER_AMOUNT_NOT0_ARPU==null?"null":NEW_ORDER_AMOUNT_NOT0_ARPU.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_USER_COUNT==null?"null":BILL_USER_COUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT==null?"null":BILL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT_RATE==null?"null":BILL_AMOUNT_RATE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILL_AMOUNT_ARPU==null?"null":BILL_AMOUNT_ARPU.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.STD_OFFER_CODE = null; } else {
      this.STD_OFFER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_OFFER_NAME = null; } else {
      this.STD_OFFER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_USER_COUNT = null; } else {
      this.NEW_ORDER_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_USER_RATE = null; } else {
      this.NEW_ORDER_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT = null; } else {
      this.NEW_ORDER_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_RATE = null; } else {
      this.NEW_ORDER_AMOUNT_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_ARPU = null; } else {
      this.NEW_ORDER_AMOUNT_ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_NOT0_ARPU = null; } else {
      this.NEW_ORDER_AMOUNT_NOT0_ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_USER_COUNT = null; } else {
      this.BILL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT = null; } else {
      this.BILL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT_RATE = null; } else {
      this.BILL_AMOUNT_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT_ARPU = null; } else {
      this.BILL_AMOUNT_ARPU = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.STD_OFFER_CODE = null; } else {
      this.STD_OFFER_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.STD_OFFER_NAME = null; } else {
      this.STD_OFFER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_USER_COUNT = null; } else {
      this.NEW_ORDER_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_USER_RATE = null; } else {
      this.NEW_ORDER_USER_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT = null; } else {
      this.NEW_ORDER_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_RATE = null; } else {
      this.NEW_ORDER_AMOUNT_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_ARPU = null; } else {
      this.NEW_ORDER_AMOUNT_ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_ORDER_AMOUNT_NOT0_ARPU = null; } else {
      this.NEW_ORDER_AMOUNT_NOT0_ARPU = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_USER_COUNT = null; } else {
      this.BILL_USER_COUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT = null; } else {
      this.BILL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT_RATE = null; } else {
      this.BILL_AMOUNT_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILL_AMOUNT_ARPU = null; } else {
      this.BILL_AMOUNT_ARPU = new java.math.BigDecimal(__cur_str);
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
    st_diff_offer_income_m o = (st_diff_offer_income_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_diff_offer_income_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("STD_OFFER_CODE", this.STD_OFFER_CODE);
    __sqoop$field_map.put("STD_OFFER_NAME", this.STD_OFFER_NAME);
    __sqoop$field_map.put("NEW_ORDER_USER_COUNT", this.NEW_ORDER_USER_COUNT);
    __sqoop$field_map.put("NEW_ORDER_USER_RATE", this.NEW_ORDER_USER_RATE);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT", this.NEW_ORDER_AMOUNT);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_RATE", this.NEW_ORDER_AMOUNT_RATE);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_ARPU", this.NEW_ORDER_AMOUNT_ARPU);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_NOT0_ARPU", this.NEW_ORDER_AMOUNT_NOT0_ARPU);
    __sqoop$field_map.put("BILL_USER_COUNT", this.BILL_USER_COUNT);
    __sqoop$field_map.put("BILL_AMOUNT", this.BILL_AMOUNT);
    __sqoop$field_map.put("BILL_AMOUNT_RATE", this.BILL_AMOUNT_RATE);
    __sqoop$field_map.put("BILL_AMOUNT_ARPU", this.BILL_AMOUNT_ARPU);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("STD_OFFER_CODE", this.STD_OFFER_CODE);
    __sqoop$field_map.put("STD_OFFER_NAME", this.STD_OFFER_NAME);
    __sqoop$field_map.put("NEW_ORDER_USER_COUNT", this.NEW_ORDER_USER_COUNT);
    __sqoop$field_map.put("NEW_ORDER_USER_RATE", this.NEW_ORDER_USER_RATE);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT", this.NEW_ORDER_AMOUNT);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_RATE", this.NEW_ORDER_AMOUNT_RATE);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_ARPU", this.NEW_ORDER_AMOUNT_ARPU);
    __sqoop$field_map.put("NEW_ORDER_AMOUNT_NOT0_ARPU", this.NEW_ORDER_AMOUNT_NOT0_ARPU);
    __sqoop$field_map.put("BILL_USER_COUNT", this.BILL_USER_COUNT);
    __sqoop$field_map.put("BILL_AMOUNT", this.BILL_AMOUNT);
    __sqoop$field_map.put("BILL_AMOUNT_RATE", this.BILL_AMOUNT_RATE);
    __sqoop$field_map.put("BILL_AMOUNT_ARPU", this.BILL_AMOUNT_ARPU);
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
    else    if ("STD_OFFER_CODE".equals(__fieldName)) {
      this.STD_OFFER_CODE = (String) __fieldVal;
    }
    else    if ("STD_OFFER_NAME".equals(__fieldName)) {
      this.STD_OFFER_NAME = (String) __fieldVal;
    }
    else    if ("NEW_ORDER_USER_COUNT".equals(__fieldName)) {
      this.NEW_ORDER_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_ORDER_USER_RATE".equals(__fieldName)) {
      this.NEW_ORDER_USER_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_ORDER_AMOUNT".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_ORDER_AMOUNT_RATE".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_ORDER_AMOUNT_ARPU".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_ARPU = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_ORDER_AMOUNT_NOT0_ARPU".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_NOT0_ARPU = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BILL_USER_COUNT".equals(__fieldName)) {
      this.BILL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BILL_AMOUNT".equals(__fieldName)) {
      this.BILL_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BILL_AMOUNT_RATE".equals(__fieldName)) {
      this.BILL_AMOUNT_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BILL_AMOUNT_ARPU".equals(__fieldName)) {
      this.BILL_AMOUNT_ARPU = (java.math.BigDecimal) __fieldVal;
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
    else    if ("STD_OFFER_CODE".equals(__fieldName)) {
      this.STD_OFFER_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STD_OFFER_NAME".equals(__fieldName)) {
      this.STD_OFFER_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_USER_COUNT".equals(__fieldName)) {
      this.NEW_ORDER_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_USER_RATE".equals(__fieldName)) {
      this.NEW_ORDER_USER_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_AMOUNT".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_AMOUNT_RATE".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_AMOUNT_ARPU".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_ARPU = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_ORDER_AMOUNT_NOT0_ARPU".equals(__fieldName)) {
      this.NEW_ORDER_AMOUNT_NOT0_ARPU = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BILL_USER_COUNT".equals(__fieldName)) {
      this.BILL_USER_COUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BILL_AMOUNT".equals(__fieldName)) {
      this.BILL_AMOUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BILL_AMOUNT_RATE".equals(__fieldName)) {
      this.BILL_AMOUNT_RATE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BILL_AMOUNT_ARPU".equals(__fieldName)) {
      this.BILL_AMOUNT_ARPU = (java.math.BigDecimal) __fieldVal;
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
