// ORM class for table 'ST_NEW_USER_DEV_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 28 18:15:07 CST 2018
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

public class ST_NEW_USER_DEV_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_NEW_USER_DEV_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_NEW_USER_DEV_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_NEW_USER_DEV_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private Integer CUST_TYPE;
  public Integer get_CUST_TYPE() {
    return CUST_TYPE;
  }
  public void set_CUST_TYPE(Integer CUST_TYPE) {
    this.CUST_TYPE = CUST_TYPE;
  }
  public ST_NEW_USER_DEV_M with_CUST_TYPE(Integer CUST_TYPE) {
    this.CUST_TYPE = CUST_TYPE;
    return this;
  }
  private String CUST_TYPE_NAME;
  public String get_CUST_TYPE_NAME() {
    return CUST_TYPE_NAME;
  }
  public void set_CUST_TYPE_NAME(String CUST_TYPE_NAME) {
    this.CUST_TYPE_NAME = CUST_TYPE_NAME;
  }
  public ST_NEW_USER_DEV_M with_CUST_TYPE_NAME(String CUST_TYPE_NAME) {
    this.CUST_TYPE_NAME = CUST_TYPE_NAME;
    return this;
  }
  private Long DTV_USER_COUNT;
  public Long get_DTV_USER_COUNT() {
    return DTV_USER_COUNT;
  }
  public void set_DTV_USER_COUNT(Long DTV_USER_COUNT) {
    this.DTV_USER_COUNT = DTV_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_DTV_USER_COUNT(Long DTV_USER_COUNT) {
    this.DTV_USER_COUNT = DTV_USER_COUNT;
    return this;
  }
  private Long DTV_PAID_USER_COUNT;
  public Long get_DTV_PAID_USER_COUNT() {
    return DTV_PAID_USER_COUNT;
  }
  public void set_DTV_PAID_USER_COUNT(Long DTV_PAID_USER_COUNT) {
    this.DTV_PAID_USER_COUNT = DTV_PAID_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_DTV_PAID_USER_COUNT(Long DTV_PAID_USER_COUNT) {
    this.DTV_PAID_USER_COUNT = DTV_PAID_USER_COUNT;
    return this;
  }
  private Long LAN_USER_COUNT;
  public Long get_LAN_USER_COUNT() {
    return LAN_USER_COUNT;
  }
  public void set_LAN_USER_COUNT(Long LAN_USER_COUNT) {
    this.LAN_USER_COUNT = LAN_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_LAN_USER_COUNT(Long LAN_USER_COUNT) {
    this.LAN_USER_COUNT = LAN_USER_COUNT;
    return this;
  }
  private Long LAN_PAID_USER_COUNT;
  public Long get_LAN_PAID_USER_COUNT() {
    return LAN_PAID_USER_COUNT;
  }
  public void set_LAN_PAID_USER_COUNT(Long LAN_PAID_USER_COUNT) {
    this.LAN_PAID_USER_COUNT = LAN_PAID_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_LAN_PAID_USER_COUNT(Long LAN_PAID_USER_COUNT) {
    this.LAN_PAID_USER_COUNT = LAN_PAID_USER_COUNT;
    return this;
  }
  private Long NEW_DTV_USER_COUNT;
  public Long get_NEW_DTV_USER_COUNT() {
    return NEW_DTV_USER_COUNT;
  }
  public void set_NEW_DTV_USER_COUNT(Long NEW_DTV_USER_COUNT) {
    this.NEW_DTV_USER_COUNT = NEW_DTV_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_NEW_DTV_USER_COUNT(Long NEW_DTV_USER_COUNT) {
    this.NEW_DTV_USER_COUNT = NEW_DTV_USER_COUNT;
    return this;
  }
  private Long NEW_LAN_USER_COUNT;
  public Long get_NEW_LAN_USER_COUNT() {
    return NEW_LAN_USER_COUNT;
  }
  public void set_NEW_LAN_USER_COUNT(Long NEW_LAN_USER_COUNT) {
    this.NEW_LAN_USER_COUNT = NEW_LAN_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_NEW_LAN_USER_COUNT(Long NEW_LAN_USER_COUNT) {
    this.NEW_LAN_USER_COUNT = NEW_LAN_USER_COUNT;
    return this;
  }
  private Long LOSE_DTV_USER_COUNT;
  public Long get_LOSE_DTV_USER_COUNT() {
    return LOSE_DTV_USER_COUNT;
  }
  public void set_LOSE_DTV_USER_COUNT(Long LOSE_DTV_USER_COUNT) {
    this.LOSE_DTV_USER_COUNT = LOSE_DTV_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_LOSE_DTV_USER_COUNT(Long LOSE_DTV_USER_COUNT) {
    this.LOSE_DTV_USER_COUNT = LOSE_DTV_USER_COUNT;
    return this;
  }
  private Long LOSE_LAN_USER_COUNT;
  public Long get_LOSE_LAN_USER_COUNT() {
    return LOSE_LAN_USER_COUNT;
  }
  public void set_LOSE_LAN_USER_COUNT(Long LOSE_LAN_USER_COUNT) {
    this.LOSE_LAN_USER_COUNT = LOSE_LAN_USER_COUNT;
  }
  public ST_NEW_USER_DEV_M with_LOSE_LAN_USER_COUNT(Long LOSE_LAN_USER_COUNT) {
    this.LOSE_LAN_USER_COUNT = LOSE_LAN_USER_COUNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_NEW_USER_DEV_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_NEW_USER_DEV_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_NEW_USER_DEV_M)) {
      return false;
    }
    ST_NEW_USER_DEV_M that = (ST_NEW_USER_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.CUST_TYPE == null ? that.CUST_TYPE == null : this.CUST_TYPE.equals(that.CUST_TYPE));
    equal = equal && (this.CUST_TYPE_NAME == null ? that.CUST_TYPE_NAME == null : this.CUST_TYPE_NAME.equals(that.CUST_TYPE_NAME));
    equal = equal && (this.DTV_USER_COUNT == null ? that.DTV_USER_COUNT == null : this.DTV_USER_COUNT.equals(that.DTV_USER_COUNT));
    equal = equal && (this.DTV_PAID_USER_COUNT == null ? that.DTV_PAID_USER_COUNT == null : this.DTV_PAID_USER_COUNT.equals(that.DTV_PAID_USER_COUNT));
    equal = equal && (this.LAN_USER_COUNT == null ? that.LAN_USER_COUNT == null : this.LAN_USER_COUNT.equals(that.LAN_USER_COUNT));
    equal = equal && (this.LAN_PAID_USER_COUNT == null ? that.LAN_PAID_USER_COUNT == null : this.LAN_PAID_USER_COUNT.equals(that.LAN_PAID_USER_COUNT));
    equal = equal && (this.NEW_DTV_USER_COUNT == null ? that.NEW_DTV_USER_COUNT == null : this.NEW_DTV_USER_COUNT.equals(that.NEW_DTV_USER_COUNT));
    equal = equal && (this.NEW_LAN_USER_COUNT == null ? that.NEW_LAN_USER_COUNT == null : this.NEW_LAN_USER_COUNT.equals(that.NEW_LAN_USER_COUNT));
    equal = equal && (this.LOSE_DTV_USER_COUNT == null ? that.LOSE_DTV_USER_COUNT == null : this.LOSE_DTV_USER_COUNT.equals(that.LOSE_DTV_USER_COUNT));
    equal = equal && (this.LOSE_LAN_USER_COUNT == null ? that.LOSE_LAN_USER_COUNT == null : this.LOSE_LAN_USER_COUNT.equals(that.LOSE_LAN_USER_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_NEW_USER_DEV_M)) {
      return false;
    }
    ST_NEW_USER_DEV_M that = (ST_NEW_USER_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.CUST_TYPE == null ? that.CUST_TYPE == null : this.CUST_TYPE.equals(that.CUST_TYPE));
    equal = equal && (this.CUST_TYPE_NAME == null ? that.CUST_TYPE_NAME == null : this.CUST_TYPE_NAME.equals(that.CUST_TYPE_NAME));
    equal = equal && (this.DTV_USER_COUNT == null ? that.DTV_USER_COUNT == null : this.DTV_USER_COUNT.equals(that.DTV_USER_COUNT));
    equal = equal && (this.DTV_PAID_USER_COUNT == null ? that.DTV_PAID_USER_COUNT == null : this.DTV_PAID_USER_COUNT.equals(that.DTV_PAID_USER_COUNT));
    equal = equal && (this.LAN_USER_COUNT == null ? that.LAN_USER_COUNT == null : this.LAN_USER_COUNT.equals(that.LAN_USER_COUNT));
    equal = equal && (this.LAN_PAID_USER_COUNT == null ? that.LAN_PAID_USER_COUNT == null : this.LAN_PAID_USER_COUNT.equals(that.LAN_PAID_USER_COUNT));
    equal = equal && (this.NEW_DTV_USER_COUNT == null ? that.NEW_DTV_USER_COUNT == null : this.NEW_DTV_USER_COUNT.equals(that.NEW_DTV_USER_COUNT));
    equal = equal && (this.NEW_LAN_USER_COUNT == null ? that.NEW_LAN_USER_COUNT == null : this.NEW_LAN_USER_COUNT.equals(that.NEW_LAN_USER_COUNT));
    equal = equal && (this.LOSE_DTV_USER_COUNT == null ? that.LOSE_DTV_USER_COUNT == null : this.LOSE_DTV_USER_COUNT.equals(that.LOSE_DTV_USER_COUNT));
    equal = equal && (this.LOSE_LAN_USER_COUNT == null ? that.LOSE_LAN_USER_COUNT == null : this.LOSE_LAN_USER_COUNT.equals(that.LOSE_LAN_USER_COUNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.CUST_TYPE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.CUST_TYPE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.DTV_USER_COUNT = JdbcWritableBridge.readLong(6, __dbResults);
    this.DTV_PAID_USER_COUNT = JdbcWritableBridge.readLong(7, __dbResults);
    this.LAN_USER_COUNT = JdbcWritableBridge.readLong(8, __dbResults);
    this.LAN_PAID_USER_COUNT = JdbcWritableBridge.readLong(9, __dbResults);
    this.NEW_DTV_USER_COUNT = JdbcWritableBridge.readLong(10, __dbResults);
    this.NEW_LAN_USER_COUNT = JdbcWritableBridge.readLong(11, __dbResults);
    this.LOSE_DTV_USER_COUNT = JdbcWritableBridge.readLong(12, __dbResults);
    this.LOSE_LAN_USER_COUNT = JdbcWritableBridge.readLong(13, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.CUST_TYPE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.CUST_TYPE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.DTV_USER_COUNT = JdbcWritableBridge.readLong(6, __dbResults);
    this.DTV_PAID_USER_COUNT = JdbcWritableBridge.readLong(7, __dbResults);
    this.LAN_USER_COUNT = JdbcWritableBridge.readLong(8, __dbResults);
    this.LAN_PAID_USER_COUNT = JdbcWritableBridge.readLong(9, __dbResults);
    this.NEW_DTV_USER_COUNT = JdbcWritableBridge.readLong(10, __dbResults);
    this.NEW_LAN_USER_COUNT = JdbcWritableBridge.readLong(11, __dbResults);
    this.LOSE_DTV_USER_COUNT = JdbcWritableBridge.readLong(12, __dbResults);
    this.LOSE_LAN_USER_COUNT = JdbcWritableBridge.readLong(13, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(CUST_TYPE, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CUST_TYPE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(DTV_USER_COUNT, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(DTV_PAID_USER_COUNT, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LAN_USER_COUNT, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LAN_PAID_USER_COUNT, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NEW_DTV_USER_COUNT, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NEW_LAN_USER_COUNT, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LOSE_DTV_USER_COUNT, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LOSE_LAN_USER_COUNT, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CUST_TYPE, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CUST_TYPE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(DTV_USER_COUNT, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(DTV_PAID_USER_COUNT, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LAN_USER_COUNT, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LAN_PAID_USER_COUNT, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NEW_DTV_USER_COUNT, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(NEW_LAN_USER_COUNT, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LOSE_DTV_USER_COUNT, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(LOSE_LAN_USER_COUNT, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 12, __dbStmt);
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
        this.CUST_TYPE = null;
    } else {
    this.CUST_TYPE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_TYPE_NAME = null;
    } else {
    this.CUST_TYPE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DTV_USER_COUNT = null;
    } else {
    this.DTV_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.DTV_PAID_USER_COUNT = null;
    } else {
    this.DTV_PAID_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_USER_COUNT = null;
    } else {
    this.LAN_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_PAID_USER_COUNT = null;
    } else {
    this.LAN_PAID_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_DTV_USER_COUNT = null;
    } else {
    this.NEW_DTV_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_LAN_USER_COUNT = null;
    } else {
    this.NEW_LAN_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_DTV_USER_COUNT = null;
    } else {
    this.LOSE_DTV_USER_COUNT = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_LAN_USER_COUNT = null;
    } else {
    this.LOSE_LAN_USER_COUNT = Long.valueOf(__dataIn.readLong());
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
    if (null == this.CUST_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CUST_TYPE);
    }
    if (null == this.CUST_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_TYPE_NAME);
    }
    if (null == this.DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DTV_USER_COUNT);
    }
    if (null == this.DTV_PAID_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DTV_PAID_USER_COUNT);
    }
    if (null == this.LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LAN_USER_COUNT);
    }
    if (null == this.LAN_PAID_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LAN_PAID_USER_COUNT);
    }
    if (null == this.NEW_DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NEW_DTV_USER_COUNT);
    }
    if (null == this.NEW_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NEW_LAN_USER_COUNT);
    }
    if (null == this.LOSE_DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOSE_DTV_USER_COUNT);
    }
    if (null == this.LOSE_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOSE_LAN_USER_COUNT);
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
    if (null == this.CUST_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CUST_TYPE);
    }
    if (null == this.CUST_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_TYPE_NAME);
    }
    if (null == this.DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DTV_USER_COUNT);
    }
    if (null == this.DTV_PAID_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DTV_PAID_USER_COUNT);
    }
    if (null == this.LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LAN_USER_COUNT);
    }
    if (null == this.LAN_PAID_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LAN_PAID_USER_COUNT);
    }
    if (null == this.NEW_DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NEW_DTV_USER_COUNT);
    }
    if (null == this.NEW_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.NEW_LAN_USER_COUNT);
    }
    if (null == this.LOSE_DTV_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOSE_DTV_USER_COUNT);
    }
    if (null == this.LOSE_LAN_USER_COUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOSE_LAN_USER_COUNT);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE==null?"null":"" + CUST_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE_NAME==null?"null":CUST_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_COUNT==null?"null":"" + DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_PAID_USER_COUNT==null?"null":"" + DTV_PAID_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_USER_COUNT==null?"null":"" + LAN_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_PAID_USER_COUNT==null?"null":"" + LAN_PAID_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DTV_USER_COUNT==null?"null":"" + NEW_DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_LAN_USER_COUNT==null?"null":"" + NEW_LAN_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DTV_USER_COUNT==null?"null":"" + LOSE_DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_LAN_USER_COUNT==null?"null":"" + LOSE_LAN_USER_COUNT, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE==null?"null":"" + CUST_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE_NAME==null?"null":CUST_TYPE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_USER_COUNT==null?"null":"" + DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_PAID_USER_COUNT==null?"null":"" + DTV_PAID_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_USER_COUNT==null?"null":"" + LAN_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_PAID_USER_COUNT==null?"null":"" + LAN_PAID_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DTV_USER_COUNT==null?"null":"" + NEW_DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_LAN_USER_COUNT==null?"null":"" + NEW_LAN_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DTV_USER_COUNT==null?"null":"" + LOSE_DTV_USER_COUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_LAN_USER_COUNT==null?"null":"" + LOSE_LAN_USER_COUNT, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUST_TYPE = null; } else {
      this.CUST_TYPE = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_TYPE_NAME = null; } else {
      this.CUST_TYPE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_COUNT = null; } else {
      this.DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_PAID_USER_COUNT = null; } else {
      this.DTV_PAID_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_USER_COUNT = null; } else {
      this.LAN_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_PAID_USER_COUNT = null; } else {
      this.LAN_PAID_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DTV_USER_COUNT = null; } else {
      this.NEW_DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_LAN_USER_COUNT = null; } else {
      this.NEW_LAN_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DTV_USER_COUNT = null; } else {
      this.LOSE_DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_LAN_USER_COUNT = null; } else {
      this.LOSE_LAN_USER_COUNT = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CUST_TYPE = null; } else {
      this.CUST_TYPE = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_TYPE_NAME = null; } else {
      this.CUST_TYPE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_USER_COUNT = null; } else {
      this.DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_PAID_USER_COUNT = null; } else {
      this.DTV_PAID_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_USER_COUNT = null; } else {
      this.LAN_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_PAID_USER_COUNT = null; } else {
      this.LAN_PAID_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DTV_USER_COUNT = null; } else {
      this.NEW_DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_LAN_USER_COUNT = null; } else {
      this.NEW_LAN_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DTV_USER_COUNT = null; } else {
      this.LOSE_DTV_USER_COUNT = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_LAN_USER_COUNT = null; } else {
      this.LOSE_LAN_USER_COUNT = Long.valueOf(__cur_str);
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
    ST_NEW_USER_DEV_M o = (ST_NEW_USER_DEV_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_NEW_USER_DEV_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("CUST_TYPE", this.CUST_TYPE);
    __sqoop$field_map.put("CUST_TYPE_NAME", this.CUST_TYPE_NAME);
    __sqoop$field_map.put("DTV_USER_COUNT", this.DTV_USER_COUNT);
    __sqoop$field_map.put("DTV_PAID_USER_COUNT", this.DTV_PAID_USER_COUNT);
    __sqoop$field_map.put("LAN_USER_COUNT", this.LAN_USER_COUNT);
    __sqoop$field_map.put("LAN_PAID_USER_COUNT", this.LAN_PAID_USER_COUNT);
    __sqoop$field_map.put("NEW_DTV_USER_COUNT", this.NEW_DTV_USER_COUNT);
    __sqoop$field_map.put("NEW_LAN_USER_COUNT", this.NEW_LAN_USER_COUNT);
    __sqoop$field_map.put("LOSE_DTV_USER_COUNT", this.LOSE_DTV_USER_COUNT);
    __sqoop$field_map.put("LOSE_LAN_USER_COUNT", this.LOSE_LAN_USER_COUNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("CUST_TYPE", this.CUST_TYPE);
    __sqoop$field_map.put("CUST_TYPE_NAME", this.CUST_TYPE_NAME);
    __sqoop$field_map.put("DTV_USER_COUNT", this.DTV_USER_COUNT);
    __sqoop$field_map.put("DTV_PAID_USER_COUNT", this.DTV_PAID_USER_COUNT);
    __sqoop$field_map.put("LAN_USER_COUNT", this.LAN_USER_COUNT);
    __sqoop$field_map.put("LAN_PAID_USER_COUNT", this.LAN_PAID_USER_COUNT);
    __sqoop$field_map.put("NEW_DTV_USER_COUNT", this.NEW_DTV_USER_COUNT);
    __sqoop$field_map.put("NEW_LAN_USER_COUNT", this.NEW_LAN_USER_COUNT);
    __sqoop$field_map.put("LOSE_DTV_USER_COUNT", this.LOSE_DTV_USER_COUNT);
    __sqoop$field_map.put("LOSE_LAN_USER_COUNT", this.LOSE_LAN_USER_COUNT);
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
    else    if ("CUST_TYPE".equals(__fieldName)) {
      this.CUST_TYPE = (Integer) __fieldVal;
    }
    else    if ("CUST_TYPE_NAME".equals(__fieldName)) {
      this.CUST_TYPE_NAME = (String) __fieldVal;
    }
    else    if ("DTV_USER_COUNT".equals(__fieldName)) {
      this.DTV_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("DTV_PAID_USER_COUNT".equals(__fieldName)) {
      this.DTV_PAID_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("LAN_USER_COUNT".equals(__fieldName)) {
      this.LAN_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("LAN_PAID_USER_COUNT".equals(__fieldName)) {
      this.LAN_PAID_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("NEW_DTV_USER_COUNT".equals(__fieldName)) {
      this.NEW_DTV_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("NEW_LAN_USER_COUNT".equals(__fieldName)) {
      this.NEW_LAN_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("LOSE_DTV_USER_COUNT".equals(__fieldName)) {
      this.LOSE_DTV_USER_COUNT = (Long) __fieldVal;
    }
    else    if ("LOSE_LAN_USER_COUNT".equals(__fieldName)) {
      this.LOSE_LAN_USER_COUNT = (Long) __fieldVal;
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
    else    if ("CUST_TYPE".equals(__fieldName)) {
      this.CUST_TYPE = (Integer) __fieldVal;
      return true;
    }
    else    if ("CUST_TYPE_NAME".equals(__fieldName)) {
      this.CUST_TYPE_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("DTV_USER_COUNT".equals(__fieldName)) {
      this.DTV_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("DTV_PAID_USER_COUNT".equals(__fieldName)) {
      this.DTV_PAID_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("LAN_USER_COUNT".equals(__fieldName)) {
      this.LAN_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("LAN_PAID_USER_COUNT".equals(__fieldName)) {
      this.LAN_PAID_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("NEW_DTV_USER_COUNT".equals(__fieldName)) {
      this.NEW_DTV_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("NEW_LAN_USER_COUNT".equals(__fieldName)) {
      this.NEW_LAN_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("LOSE_DTV_USER_COUNT".equals(__fieldName)) {
      this.LOSE_DTV_USER_COUNT = (Long) __fieldVal;
      return true;
    }
    else    if ("LOSE_LAN_USER_COUNT".equals(__fieldName)) {
      this.LOSE_LAN_USER_COUNT = (Long) __fieldVal;
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