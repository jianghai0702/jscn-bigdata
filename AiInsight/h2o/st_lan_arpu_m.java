// ORM class for table 'st_lan_arpu_m'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 02 14:25:14 CST 2019
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

public class st_lan_arpu_m extends SqoopRecord  implements DBWritable, Writable {
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
  public st_lan_arpu_m with_CYCLE_ID(String CYCLE_ID) {
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
  public st_lan_arpu_m with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public st_lan_arpu_m with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal LAN_ACCT_CNT;
  public java.math.BigDecimal get_LAN_ACCT_CNT() {
    return LAN_ACCT_CNT;
  }
  public void set_LAN_ACCT_CNT(java.math.BigDecimal LAN_ACCT_CNT) {
    this.LAN_ACCT_CNT = LAN_ACCT_CNT;
  }
  public st_lan_arpu_m with_LAN_ACCT_CNT(java.math.BigDecimal LAN_ACCT_CNT) {
    this.LAN_ACCT_CNT = LAN_ACCT_CNT;
    return this;
  }
  private java.math.BigDecimal ALL_ACCT_CNT;
  public java.math.BigDecimal get_ALL_ACCT_CNT() {
    return ALL_ACCT_CNT;
  }
  public void set_ALL_ACCT_CNT(java.math.BigDecimal ALL_ACCT_CNT) {
    this.ALL_ACCT_CNT = ALL_ACCT_CNT;
  }
  public st_lan_arpu_m with_ALL_ACCT_CNT(java.math.BigDecimal ALL_ACCT_CNT) {
    this.ALL_ACCT_CNT = ALL_ACCT_CNT;
    return this;
  }
  private java.math.BigDecimal LAN_ORIGINAL_AMOUNT;
  public java.math.BigDecimal get_LAN_ORIGINAL_AMOUNT() {
    return LAN_ORIGINAL_AMOUNT;
  }
  public void set_LAN_ORIGINAL_AMOUNT(java.math.BigDecimal LAN_ORIGINAL_AMOUNT) {
    this.LAN_ORIGINAL_AMOUNT = LAN_ORIGINAL_AMOUNT;
  }
  public st_lan_arpu_m with_LAN_ORIGINAL_AMOUNT(java.math.BigDecimal LAN_ORIGINAL_AMOUNT) {
    this.LAN_ORIGINAL_AMOUNT = LAN_ORIGINAL_AMOUNT;
    return this;
  }
  private java.math.BigDecimal LAN_DISCOUNT_AMOUNT;
  public java.math.BigDecimal get_LAN_DISCOUNT_AMOUNT() {
    return LAN_DISCOUNT_AMOUNT;
  }
  public void set_LAN_DISCOUNT_AMOUNT(java.math.BigDecimal LAN_DISCOUNT_AMOUNT) {
    this.LAN_DISCOUNT_AMOUNT = LAN_DISCOUNT_AMOUNT;
  }
  public st_lan_arpu_m with_LAN_DISCOUNT_AMOUNT(java.math.BigDecimal LAN_DISCOUNT_AMOUNT) {
    this.LAN_DISCOUNT_AMOUNT = LAN_DISCOUNT_AMOUNT;
    return this;
  }
  private java.math.BigDecimal ALL_ORIGINAL_AMOUNT;
  public java.math.BigDecimal get_ALL_ORIGINAL_AMOUNT() {
    return ALL_ORIGINAL_AMOUNT;
  }
  public void set_ALL_ORIGINAL_AMOUNT(java.math.BigDecimal ALL_ORIGINAL_AMOUNT) {
    this.ALL_ORIGINAL_AMOUNT = ALL_ORIGINAL_AMOUNT;
  }
  public st_lan_arpu_m with_ALL_ORIGINAL_AMOUNT(java.math.BigDecimal ALL_ORIGINAL_AMOUNT) {
    this.ALL_ORIGINAL_AMOUNT = ALL_ORIGINAL_AMOUNT;
    return this;
  }
  private java.math.BigDecimal ALL_DISCOUNT_AMOUNT;
  public java.math.BigDecimal get_ALL_DISCOUNT_AMOUNT() {
    return ALL_DISCOUNT_AMOUNT;
  }
  public void set_ALL_DISCOUNT_AMOUNT(java.math.BigDecimal ALL_DISCOUNT_AMOUNT) {
    this.ALL_DISCOUNT_AMOUNT = ALL_DISCOUNT_AMOUNT;
  }
  public st_lan_arpu_m with_ALL_DISCOUNT_AMOUNT(java.math.BigDecimal ALL_DISCOUNT_AMOUNT) {
    this.ALL_DISCOUNT_AMOUNT = ALL_DISCOUNT_AMOUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public st_lan_arpu_m with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public st_lan_arpu_m with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_lan_arpu_m)) {
      return false;
    }
    st_lan_arpu_m that = (st_lan_arpu_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LAN_ACCT_CNT == null ? that.LAN_ACCT_CNT == null : this.LAN_ACCT_CNT.equals(that.LAN_ACCT_CNT));
    equal = equal && (this.ALL_ACCT_CNT == null ? that.ALL_ACCT_CNT == null : this.ALL_ACCT_CNT.equals(that.ALL_ACCT_CNT));
    equal = equal && (this.LAN_ORIGINAL_AMOUNT == null ? that.LAN_ORIGINAL_AMOUNT == null : this.LAN_ORIGINAL_AMOUNT.equals(that.LAN_ORIGINAL_AMOUNT));
    equal = equal && (this.LAN_DISCOUNT_AMOUNT == null ? that.LAN_DISCOUNT_AMOUNT == null : this.LAN_DISCOUNT_AMOUNT.equals(that.LAN_DISCOUNT_AMOUNT));
    equal = equal && (this.ALL_ORIGINAL_AMOUNT == null ? that.ALL_ORIGINAL_AMOUNT == null : this.ALL_ORIGINAL_AMOUNT.equals(that.ALL_ORIGINAL_AMOUNT));
    equal = equal && (this.ALL_DISCOUNT_AMOUNT == null ? that.ALL_DISCOUNT_AMOUNT == null : this.ALL_DISCOUNT_AMOUNT.equals(that.ALL_DISCOUNT_AMOUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof st_lan_arpu_m)) {
      return false;
    }
    st_lan_arpu_m that = (st_lan_arpu_m) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.LAN_ACCT_CNT == null ? that.LAN_ACCT_CNT == null : this.LAN_ACCT_CNT.equals(that.LAN_ACCT_CNT));
    equal = equal && (this.ALL_ACCT_CNT == null ? that.ALL_ACCT_CNT == null : this.ALL_ACCT_CNT.equals(that.ALL_ACCT_CNT));
    equal = equal && (this.LAN_ORIGINAL_AMOUNT == null ? that.LAN_ORIGINAL_AMOUNT == null : this.LAN_ORIGINAL_AMOUNT.equals(that.LAN_ORIGINAL_AMOUNT));
    equal = equal && (this.LAN_DISCOUNT_AMOUNT == null ? that.LAN_DISCOUNT_AMOUNT == null : this.LAN_DISCOUNT_AMOUNT.equals(that.LAN_DISCOUNT_AMOUNT));
    equal = equal && (this.ALL_ORIGINAL_AMOUNT == null ? that.ALL_ORIGINAL_AMOUNT == null : this.ALL_ORIGINAL_AMOUNT.equals(that.ALL_ORIGINAL_AMOUNT));
    equal = equal && (this.ALL_DISCOUNT_AMOUNT == null ? that.ALL_DISCOUNT_AMOUNT == null : this.ALL_DISCOUNT_AMOUNT.equals(that.ALL_DISCOUNT_AMOUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.LAN_ACCT_CNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.ALL_ACCT_CNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.LAN_ORIGINAL_AMOUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.LAN_DISCOUNT_AMOUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ALL_ORIGINAL_AMOUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ALL_DISCOUNT_AMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.LAN_ACCT_CNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.ALL_ACCT_CNT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.LAN_ORIGINAL_AMOUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.LAN_DISCOUNT_AMOUNT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ALL_ORIGINAL_AMOUNT = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.ALL_DISCOUNT_AMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(11, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(LAN_ACCT_CNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_ACCT_CNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_ORIGINAL_AMOUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_DISCOUNT_AMOUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_ORIGINAL_AMOUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_DISCOUNT_AMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 11 + __off, 12, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_ACCT_CNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_ACCT_CNT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_ORIGINAL_AMOUNT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_DISCOUNT_AMOUNT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_ORIGINAL_AMOUNT, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ALL_DISCOUNT_AMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 11 + __off, 12, __dbStmt);
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
        this.LAN_ACCT_CNT = null;
    } else {
    this.LAN_ACCT_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALL_ACCT_CNT = null;
    } else {
    this.ALL_ACCT_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_ORIGINAL_AMOUNT = null;
    } else {
    this.LAN_ORIGINAL_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_DISCOUNT_AMOUNT = null;
    } else {
    this.LAN_DISCOUNT_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALL_ORIGINAL_AMOUNT = null;
    } else {
    this.ALL_ORIGINAL_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALL_DISCOUNT_AMOUNT = null;
    } else {
    this.ALL_DISCOUNT_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.LAN_ACCT_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_ACCT_CNT, __dataOut);
    }
    if (null == this.ALL_ACCT_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_ACCT_CNT, __dataOut);
    }
    if (null == this.LAN_ORIGINAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_ORIGINAL_AMOUNT, __dataOut);
    }
    if (null == this.LAN_DISCOUNT_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_DISCOUNT_AMOUNT, __dataOut);
    }
    if (null == this.ALL_ORIGINAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_ORIGINAL_AMOUNT, __dataOut);
    }
    if (null == this.ALL_DISCOUNT_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_DISCOUNT_AMOUNT, __dataOut);
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
    if (null == this.LAN_ACCT_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_ACCT_CNT, __dataOut);
    }
    if (null == this.ALL_ACCT_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_ACCT_CNT, __dataOut);
    }
    if (null == this.LAN_ORIGINAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_ORIGINAL_AMOUNT, __dataOut);
    }
    if (null == this.LAN_DISCOUNT_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_DISCOUNT_AMOUNT, __dataOut);
    }
    if (null == this.ALL_ORIGINAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_ORIGINAL_AMOUNT, __dataOut);
    }
    if (null == this.ALL_DISCOUNT_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ALL_DISCOUNT_AMOUNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_ACCT_CNT==null?"null":LAN_ACCT_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_ACCT_CNT==null?"null":ALL_ACCT_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_ORIGINAL_AMOUNT==null?"null":LAN_ORIGINAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_DISCOUNT_AMOUNT==null?"null":LAN_DISCOUNT_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_ORIGINAL_AMOUNT==null?"null":ALL_ORIGINAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_DISCOUNT_AMOUNT==null?"null":ALL_DISCOUNT_AMOUNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_ACCT_CNT==null?"null":LAN_ACCT_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_ACCT_CNT==null?"null":ALL_ACCT_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_ORIGINAL_AMOUNT==null?"null":LAN_ORIGINAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_DISCOUNT_AMOUNT==null?"null":LAN_DISCOUNT_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_ORIGINAL_AMOUNT==null?"null":ALL_ORIGINAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALL_DISCOUNT_AMOUNT==null?"null":ALL_DISCOUNT_AMOUNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_ACCT_CNT = null; } else {
      this.LAN_ACCT_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_ACCT_CNT = null; } else {
      this.ALL_ACCT_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_ORIGINAL_AMOUNT = null; } else {
      this.LAN_ORIGINAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_DISCOUNT_AMOUNT = null; } else {
      this.LAN_DISCOUNT_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_ORIGINAL_AMOUNT = null; } else {
      this.ALL_ORIGINAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_DISCOUNT_AMOUNT = null; } else {
      this.ALL_DISCOUNT_AMOUNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_ACCT_CNT = null; } else {
      this.LAN_ACCT_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_ACCT_CNT = null; } else {
      this.ALL_ACCT_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_ORIGINAL_AMOUNT = null; } else {
      this.LAN_ORIGINAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_DISCOUNT_AMOUNT = null; } else {
      this.LAN_DISCOUNT_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_ORIGINAL_AMOUNT = null; } else {
      this.ALL_ORIGINAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.ALL_DISCOUNT_AMOUNT = null; } else {
      this.ALL_DISCOUNT_AMOUNT = new java.math.BigDecimal(__cur_str);
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
    st_lan_arpu_m o = (st_lan_arpu_m) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(st_lan_arpu_m o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("LAN_ACCT_CNT", this.LAN_ACCT_CNT);
    __sqoop$field_map.put("ALL_ACCT_CNT", this.ALL_ACCT_CNT);
    __sqoop$field_map.put("LAN_ORIGINAL_AMOUNT", this.LAN_ORIGINAL_AMOUNT);
    __sqoop$field_map.put("LAN_DISCOUNT_AMOUNT", this.LAN_DISCOUNT_AMOUNT);
    __sqoop$field_map.put("ALL_ORIGINAL_AMOUNT", this.ALL_ORIGINAL_AMOUNT);
    __sqoop$field_map.put("ALL_DISCOUNT_AMOUNT", this.ALL_DISCOUNT_AMOUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("LAN_ACCT_CNT", this.LAN_ACCT_CNT);
    __sqoop$field_map.put("ALL_ACCT_CNT", this.ALL_ACCT_CNT);
    __sqoop$field_map.put("LAN_ORIGINAL_AMOUNT", this.LAN_ORIGINAL_AMOUNT);
    __sqoop$field_map.put("LAN_DISCOUNT_AMOUNT", this.LAN_DISCOUNT_AMOUNT);
    __sqoop$field_map.put("ALL_ORIGINAL_AMOUNT", this.ALL_ORIGINAL_AMOUNT);
    __sqoop$field_map.put("ALL_DISCOUNT_AMOUNT", this.ALL_DISCOUNT_AMOUNT);
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
    else    if ("LAN_ACCT_CNT".equals(__fieldName)) {
      this.LAN_ACCT_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ALL_ACCT_CNT".equals(__fieldName)) {
      this.ALL_ACCT_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LAN_ORIGINAL_AMOUNT".equals(__fieldName)) {
      this.LAN_ORIGINAL_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LAN_DISCOUNT_AMOUNT".equals(__fieldName)) {
      this.LAN_DISCOUNT_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ALL_ORIGINAL_AMOUNT".equals(__fieldName)) {
      this.ALL_ORIGINAL_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ALL_DISCOUNT_AMOUNT".equals(__fieldName)) {
      this.ALL_DISCOUNT_AMOUNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("LAN_ACCT_CNT".equals(__fieldName)) {
      this.LAN_ACCT_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ALL_ACCT_CNT".equals(__fieldName)) {
      this.ALL_ACCT_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LAN_ORIGINAL_AMOUNT".equals(__fieldName)) {
      this.LAN_ORIGINAL_AMOUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LAN_DISCOUNT_AMOUNT".equals(__fieldName)) {
      this.LAN_DISCOUNT_AMOUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ALL_ORIGINAL_AMOUNT".equals(__fieldName)) {
      this.ALL_ORIGINAL_AMOUNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ALL_DISCOUNT_AMOUNT".equals(__fieldName)) {
      this.ALL_DISCOUNT_AMOUNT = (java.math.BigDecimal) __fieldVal;
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
