// ORM class for table 'ST_GRID_USER_PRODUCT_BT_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 06 15:31:47 CST 2018
// For connector: org.apache.sqoop.manager.OracleManager
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

public class ST_GRID_USER_PRODUCT_BT_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_GRID_USER_PRODUCT_BT_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_GRID_USER_PRODUCT_BT_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_GRID_USER_PRODUCT_BT_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private String GRID_ID;
  public String get_GRID_ID() {
    return GRID_ID;
  }
  public void set_GRID_ID(String GRID_ID) {
    this.GRID_ID = GRID_ID;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_GRID_ID(String GRID_ID) {
    this.GRID_ID = GRID_ID;
    return this;
  }
  private String GRID_NAME;
  public String get_GRID_NAME() {
    return GRID_NAME;
  }
  public void set_GRID_NAME(String GRID_NAME) {
    this.GRID_NAME = GRID_NAME;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_GRID_NAME(String GRID_NAME) {
    this.GRID_NAME = GRID_NAME;
    return this;
  }
  private java.math.BigDecimal MGR_ID;
  public java.math.BigDecimal get_MGR_ID() {
    return MGR_ID;
  }
  public void set_MGR_ID(java.math.BigDecimal MGR_ID) {
    this.MGR_ID = MGR_ID;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_MGR_ID(java.math.BigDecimal MGR_ID) {
    this.MGR_ID = MGR_ID;
    return this;
  }
  private String MGR_NAME;
  public String get_MGR_NAME() {
    return MGR_NAME;
  }
  public void set_MGR_NAME(String MGR_NAME) {
    this.MGR_NAME = MGR_NAME;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_MGR_NAME(String MGR_NAME) {
    this.MGR_NAME = MGR_NAME;
    return this;
  }
  private String AREA_STD_ADDR_ID;
  public String get_AREA_STD_ADDR_ID() {
    return AREA_STD_ADDR_ID;
  }
  public void set_AREA_STD_ADDR_ID(String AREA_STD_ADDR_ID) {
    this.AREA_STD_ADDR_ID = AREA_STD_ADDR_ID;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_AREA_STD_ADDR_ID(String AREA_STD_ADDR_ID) {
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
  public ST_GRID_USER_PRODUCT_BT_M with_AREA_STD_ADDR_NAME(String AREA_STD_ADDR_NAME) {
    this.AREA_STD_ADDR_NAME = AREA_STD_ADDR_NAME;
    return this;
  }
  private java.math.BigDecimal BILLING_TYPE;
  public java.math.BigDecimal get_BILLING_TYPE() {
    return BILLING_TYPE;
  }
  public void set_BILLING_TYPE(java.math.BigDecimal BILLING_TYPE) {
    this.BILLING_TYPE = BILLING_TYPE;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_BILLING_TYPE(java.math.BigDecimal BILLING_TYPE) {
    this.BILLING_TYPE = BILLING_TYPE;
    return this;
  }
  private java.math.BigDecimal VALID_USER_CNT;
  public java.math.BigDecimal get_VALID_USER_CNT() {
    return VALID_USER_CNT;
  }
  public void set_VALID_USER_CNT(java.math.BigDecimal VALID_USER_CNT) {
    this.VALID_USER_CNT = VALID_USER_CNT;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_VALID_USER_CNT(java.math.BigDecimal VALID_USER_CNT) {
    this.VALID_USER_CNT = VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_USER_CNT;
  public java.math.BigDecimal get_NEW_USER_CNT() {
    return NEW_USER_CNT;
  }
  public void set_NEW_USER_CNT(java.math.BigDecimal NEW_USER_CNT) {
    this.NEW_USER_CNT = NEW_USER_CNT;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_NEW_USER_CNT(java.math.BigDecimal NEW_USER_CNT) {
    this.NEW_USER_CNT = NEW_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_USER_CNT;
  public java.math.BigDecimal get_LOSE_USER_CNT() {
    return LOSE_USER_CNT;
  }
  public void set_LOSE_USER_CNT(java.math.BigDecimal LOSE_USER_CNT) {
    this.LOSE_USER_CNT = LOSE_USER_CNT;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_LOSE_USER_CNT(java.math.BigDecimal LOSE_USER_CNT) {
    this.LOSE_USER_CNT = LOSE_USER_CNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_GRID_USER_PRODUCT_BT_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_GRID_USER_PRODUCT_BT_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_GRID_USER_PRODUCT_BT_M)) {
      return false;
    }
    ST_GRID_USER_PRODUCT_BT_M that = (ST_GRID_USER_PRODUCT_BT_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.MGR_ID == null ? that.MGR_ID == null : this.MGR_ID.equals(that.MGR_ID));
    equal = equal && (this.MGR_NAME == null ? that.MGR_NAME == null : this.MGR_NAME.equals(that.MGR_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.BILLING_TYPE == null ? that.BILLING_TYPE == null : this.BILLING_TYPE.equals(that.BILLING_TYPE));
    equal = equal && (this.VALID_USER_CNT == null ? that.VALID_USER_CNT == null : this.VALID_USER_CNT.equals(that.VALID_USER_CNT));
    equal = equal && (this.NEW_USER_CNT == null ? that.NEW_USER_CNT == null : this.NEW_USER_CNT.equals(that.NEW_USER_CNT));
    equal = equal && (this.LOSE_USER_CNT == null ? that.LOSE_USER_CNT == null : this.LOSE_USER_CNT.equals(that.LOSE_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_GRID_USER_PRODUCT_BT_M)) {
      return false;
    }
    ST_GRID_USER_PRODUCT_BT_M that = (ST_GRID_USER_PRODUCT_BT_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.MGR_ID == null ? that.MGR_ID == null : this.MGR_ID.equals(that.MGR_ID));
    equal = equal && (this.MGR_NAME == null ? that.MGR_NAME == null : this.MGR_NAME.equals(that.MGR_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.BILLING_TYPE == null ? that.BILLING_TYPE == null : this.BILLING_TYPE.equals(that.BILLING_TYPE));
    equal = equal && (this.VALID_USER_CNT == null ? that.VALID_USER_CNT == null : this.VALID_USER_CNT.equals(that.VALID_USER_CNT));
    equal = equal && (this.NEW_USER_CNT == null ? that.NEW_USER_CNT == null : this.NEW_USER_CNT.equals(that.NEW_USER_CNT));
    equal = equal && (this.LOSE_USER_CNT == null ? that.LOSE_USER_CNT == null : this.LOSE_USER_CNT.equals(that.LOSE_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.MGR_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.MGR_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.BILLING_TYPE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.NEW_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.LOSE_USER_CNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(4, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.MGR_ID = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.MGR_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.BILLING_TYPE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.NEW_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.LOSE_USER_CNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
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
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MGR_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MGR_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILLING_TYPE, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VALID_USER_CNT, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CNT, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 1, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_ID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MGR_ID, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MGR_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BILLING_TYPE, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VALID_USER_CNT, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_USER_CNT, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 15 + __off, 1, __dbStmt);
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
        this.GRID_ID = null;
    } else {
    this.GRID_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRID_NAME = null;
    } else {
    this.GRID_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MGR_ID = null;
    } else {
    this.MGR_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MGR_NAME = null;
    } else {
    this.MGR_NAME = Text.readString(__dataIn);
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
        this.BILLING_TYPE = null;
    } else {
    this.BILLING_TYPE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VALID_USER_CNT = null;
    } else {
    this.VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_USER_CNT = null;
    } else {
    this.NEW_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_USER_CNT = null;
    } else {
    this.LOSE_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.GRID_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_ID);
    }
    if (null == this.GRID_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_NAME);
    }
    if (null == this.MGR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MGR_ID, __dataOut);
    }
    if (null == this.MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_NAME);
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
    if (null == this.BILLING_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILLING_TYPE, __dataOut);
    }
    if (null == this.VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VALID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CNT, __dataOut);
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
    if (null == this.GRID_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_ID);
    }
    if (null == this.GRID_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRID_NAME);
    }
    if (null == this.MGR_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MGR_ID, __dataOut);
    }
    if (null == this.MGR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MGR_NAME);
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
    if (null == this.BILLING_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BILLING_TYPE, __dataOut);
    }
    if (null == this.VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VALID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_USER_CNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_ID==null?"null":GRID_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_NAME==null?"null":GRID_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ID==null?"null":MGR_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_NAME==null?"null":MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_ID==null?"null":AREA_STD_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_NAME==null?"null":AREA_STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILLING_TYPE==null?"null":BILLING_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALID_USER_CNT==null?"null":VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CNT==null?"null":NEW_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CNT==null?"null":LOSE_USER_CNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_ID==null?"null":GRID_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRID_NAME==null?"null":GRID_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_ID==null?"null":MGR_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MGR_NAME==null?"null":MGR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_ID==null?"null":AREA_STD_ADDR_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA_STD_ADDR_NAME==null?"null":AREA_STD_ADDR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BILLING_TYPE==null?"null":BILLING_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALID_USER_CNT==null?"null":VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_USER_CNT==null?"null":NEW_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_USER_CNT==null?"null":LOSE_USER_CNT.toPlainString(), delimiters));
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
    if (__cur_str.equals("\\N")) { this.GRID_ID = null; } else {
      this.GRID_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.GRID_NAME = null; } else {
      this.GRID_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MGR_ID = null; } else {
      this.MGR_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MGR_NAME = null; } else {
      this.MGR_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILLING_TYPE = null; } else {
      this.BILLING_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VALID_USER_CNT = null; } else {
      this.VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CNT = null; } else {
      this.NEW_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CNT = null; } else {
      this.LOSE_USER_CNT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("\\N")) { this.GRID_ID = null; } else {
      this.GRID_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.GRID_NAME = null; } else {
      this.GRID_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.MGR_ID = null; } else {
      this.MGR_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.MGR_NAME = null; } else {
      this.MGR_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.BILLING_TYPE = null; } else {
      this.BILLING_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.VALID_USER_CNT = null; } else {
      this.VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_USER_CNT = null; } else {
      this.NEW_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_USER_CNT = null; } else {
      this.LOSE_USER_CNT = new java.math.BigDecimal(__cur_str);
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
    ST_GRID_USER_PRODUCT_BT_M o = (ST_GRID_USER_PRODUCT_BT_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_GRID_USER_PRODUCT_BT_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("MGR_ID", this.MGR_ID);
    __sqoop$field_map.put("MGR_NAME", this.MGR_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("BILLING_TYPE", this.BILLING_TYPE);
    __sqoop$field_map.put("VALID_USER_CNT", this.VALID_USER_CNT);
    __sqoop$field_map.put("NEW_USER_CNT", this.NEW_USER_CNT);
    __sqoop$field_map.put("LOSE_USER_CNT", this.LOSE_USER_CNT);
    __sqoop$field_map.put("ETL_DATE", this.ETL_DATE);
    __sqoop$field_map.put("PT_MON", this.PT_MON);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("MGR_ID", this.MGR_ID);
    __sqoop$field_map.put("MGR_NAME", this.MGR_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("BILLING_TYPE", this.BILLING_TYPE);
    __sqoop$field_map.put("VALID_USER_CNT", this.VALID_USER_CNT);
    __sqoop$field_map.put("NEW_USER_CNT", this.NEW_USER_CNT);
    __sqoop$field_map.put("LOSE_USER_CNT", this.LOSE_USER_CNT);
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
    else    if ("GRID_ID".equals(__fieldName)) {
      this.GRID_ID = (String) __fieldVal;
    }
    else    if ("GRID_NAME".equals(__fieldName)) {
      this.GRID_NAME = (String) __fieldVal;
    }
    else    if ("MGR_ID".equals(__fieldName)) {
      this.MGR_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MGR_NAME".equals(__fieldName)) {
      this.MGR_NAME = (String) __fieldVal;
    }
    else    if ("AREA_STD_ADDR_ID".equals(__fieldName)) {
      this.AREA_STD_ADDR_ID = (String) __fieldVal;
    }
    else    if ("AREA_STD_ADDR_NAME".equals(__fieldName)) {
      this.AREA_STD_ADDR_NAME = (String) __fieldVal;
    }
    else    if ("BILLING_TYPE".equals(__fieldName)) {
      this.BILLING_TYPE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("VALID_USER_CNT".equals(__fieldName)) {
      this.VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_USER_CNT".equals(__fieldName)) {
      this.NEW_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_USER_CNT".equals(__fieldName)) {
      this.LOSE_USER_CNT = (java.math.BigDecimal) __fieldVal;
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
    else    if ("GRID_ID".equals(__fieldName)) {
      this.GRID_ID = (String) __fieldVal;
      return true;
    }
    else    if ("GRID_NAME".equals(__fieldName)) {
      this.GRID_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("MGR_ID".equals(__fieldName)) {
      this.MGR_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MGR_NAME".equals(__fieldName)) {
      this.MGR_NAME = (String) __fieldVal;
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
    else    if ("BILLING_TYPE".equals(__fieldName)) {
      this.BILLING_TYPE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("VALID_USER_CNT".equals(__fieldName)) {
      this.VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_USER_CNT".equals(__fieldName)) {
      this.NEW_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_USER_CNT".equals(__fieldName)) {
      this.LOSE_USER_CNT = (java.math.BigDecimal) __fieldVal;
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
