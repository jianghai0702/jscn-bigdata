// ORM class for table 'ST_GRID_USER_DEV_M'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Nov 16 14:57:27 CST 2018
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

public class ST_GRID_USER_DEV_M extends SqoopRecord  implements DBWritable, Writable {
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
  public ST_GRID_USER_DEV_M with_CYCLE_ID(String CYCLE_ID) {
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
  public ST_GRID_USER_DEV_M with_OWN_CORP_STD_ORG_CODE(String OWN_CORP_STD_ORG_CODE) {
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
  public ST_GRID_USER_DEV_M with_OWN_CORP_STD_ORG_NAME(String OWN_CORP_STD_ORG_NAME) {
    this.OWN_CORP_STD_ORG_NAME = OWN_CORP_STD_ORG_NAME;
    return this;
  }
  private java.math.BigDecimal CUST_TYPE;
  public java.math.BigDecimal get_CUST_TYPE() {
    return CUST_TYPE;
  }
  public void set_CUST_TYPE(java.math.BigDecimal CUST_TYPE) {
    this.CUST_TYPE = CUST_TYPE;
  }
  public ST_GRID_USER_DEV_M with_CUST_TYPE(java.math.BigDecimal CUST_TYPE) {
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
  public ST_GRID_USER_DEV_M with_CUST_TYPE_NAME(String CUST_TYPE_NAME) {
    this.CUST_TYPE_NAME = CUST_TYPE_NAME;
    return this;
  }
  private String GRID_ID;
  public String get_GRID_ID() {
    return GRID_ID;
  }
  public void set_GRID_ID(String GRID_ID) {
    this.GRID_ID = GRID_ID;
  }
  public ST_GRID_USER_DEV_M with_GRID_ID(String GRID_ID) {
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
  public ST_GRID_USER_DEV_M with_GRID_NAME(String GRID_NAME) {
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
  public ST_GRID_USER_DEV_M with_MGR_ID(java.math.BigDecimal MGR_ID) {
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
  public ST_GRID_USER_DEV_M with_MGR_NAME(String MGR_NAME) {
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
  public ST_GRID_USER_DEV_M with_AREA_STD_ADDR_ID(String AREA_STD_ADDR_ID) {
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
  public ST_GRID_USER_DEV_M with_AREA_STD_ADDR_NAME(String AREA_STD_ADDR_NAME) {
    this.AREA_STD_ADDR_NAME = AREA_STD_ADDR_NAME;
    return this;
  }
  private java.math.BigDecimal DTV_VALID_USER_CNT;
  public java.math.BigDecimal get_DTV_VALID_USER_CNT() {
    return DTV_VALID_USER_CNT;
  }
  public void set_DTV_VALID_USER_CNT(java.math.BigDecimal DTV_VALID_USER_CNT) {
    this.DTV_VALID_USER_CNT = DTV_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DTV_VALID_USER_CNT(java.math.BigDecimal DTV_VALID_USER_CNT) {
    this.DTV_VALID_USER_CNT = DTV_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DTV_PAID_USER_CNT;
  public java.math.BigDecimal get_DTV_PAID_USER_CNT() {
    return DTV_PAID_USER_CNT;
  }
  public void set_DTV_PAID_USER_CNT(java.math.BigDecimal DTV_PAID_USER_CNT) {
    this.DTV_PAID_USER_CNT = DTV_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DTV_PAID_USER_CNT(java.math.BigDecimal DTV_PAID_USER_CNT) {
    this.DTV_PAID_USER_CNT = DTV_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_DTV_USER_CNT;
  public java.math.BigDecimal get_NEW_DTV_USER_CNT() {
    return NEW_DTV_USER_CNT;
  }
  public void set_NEW_DTV_USER_CNT(java.math.BigDecimal NEW_DTV_USER_CNT) {
    this.NEW_DTV_USER_CNT = NEW_DTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_DTV_USER_CNT(java.math.BigDecimal NEW_DTV_USER_CNT) {
    this.NEW_DTV_USER_CNT = NEW_DTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_DTV_USER_CNT;
  public java.math.BigDecimal get_LOSE_DTV_USER_CNT() {
    return LOSE_DTV_USER_CNT;
  }
  public void set_LOSE_DTV_USER_CNT(java.math.BigDecimal LOSE_DTV_USER_CNT) {
    this.LOSE_DTV_USER_CNT = LOSE_DTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_DTV_USER_CNT(java.math.BigDecimal LOSE_DTV_USER_CNT) {
    this.LOSE_DTV_USER_CNT = LOSE_DTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LAN_VALID_USER_CNT;
  public java.math.BigDecimal get_LAN_VALID_USER_CNT() {
    return LAN_VALID_USER_CNT;
  }
  public void set_LAN_VALID_USER_CNT(java.math.BigDecimal LAN_VALID_USER_CNT) {
    this.LAN_VALID_USER_CNT = LAN_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LAN_VALID_USER_CNT(java.math.BigDecimal LAN_VALID_USER_CNT) {
    this.LAN_VALID_USER_CNT = LAN_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LAN_PAID_USER_CNT;
  public java.math.BigDecimal get_LAN_PAID_USER_CNT() {
    return LAN_PAID_USER_CNT;
  }
  public void set_LAN_PAID_USER_CNT(java.math.BigDecimal LAN_PAID_USER_CNT) {
    this.LAN_PAID_USER_CNT = LAN_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LAN_PAID_USER_CNT(java.math.BigDecimal LAN_PAID_USER_CNT) {
    this.LAN_PAID_USER_CNT = LAN_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_LAN_USER_CNT;
  public java.math.BigDecimal get_NEW_LAN_USER_CNT() {
    return NEW_LAN_USER_CNT;
  }
  public void set_NEW_LAN_USER_CNT(java.math.BigDecimal NEW_LAN_USER_CNT) {
    this.NEW_LAN_USER_CNT = NEW_LAN_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_LAN_USER_CNT(java.math.BigDecimal NEW_LAN_USER_CNT) {
    this.NEW_LAN_USER_CNT = NEW_LAN_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_LAN_USER_CNT;
  public java.math.BigDecimal get_LOSE_LAN_USER_CNT() {
    return LOSE_LAN_USER_CNT;
  }
  public void set_LOSE_LAN_USER_CNT(java.math.BigDecimal LOSE_LAN_USER_CNT) {
    this.LOSE_LAN_USER_CNT = LOSE_LAN_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_LAN_USER_CNT(java.math.BigDecimal LOSE_LAN_USER_CNT) {
    this.LOSE_LAN_USER_CNT = LOSE_LAN_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DFTV_VALID_USER_CNT;
  public java.math.BigDecimal get_DFTV_VALID_USER_CNT() {
    return DFTV_VALID_USER_CNT;
  }
  public void set_DFTV_VALID_USER_CNT(java.math.BigDecimal DFTV_VALID_USER_CNT) {
    this.DFTV_VALID_USER_CNT = DFTV_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DFTV_VALID_USER_CNT(java.math.BigDecimal DFTV_VALID_USER_CNT) {
    this.DFTV_VALID_USER_CNT = DFTV_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DFTV_PAID_USER_CNT;
  public java.math.BigDecimal get_DFTV_PAID_USER_CNT() {
    return DFTV_PAID_USER_CNT;
  }
  public void set_DFTV_PAID_USER_CNT(java.math.BigDecimal DFTV_PAID_USER_CNT) {
    this.DFTV_PAID_USER_CNT = DFTV_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DFTV_PAID_USER_CNT(java.math.BigDecimal DFTV_PAID_USER_CNT) {
    this.DFTV_PAID_USER_CNT = DFTV_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_DFTV_USER_CNT;
  public java.math.BigDecimal get_NEW_DFTV_USER_CNT() {
    return NEW_DFTV_USER_CNT;
  }
  public void set_NEW_DFTV_USER_CNT(java.math.BigDecimal NEW_DFTV_USER_CNT) {
    this.NEW_DFTV_USER_CNT = NEW_DFTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_DFTV_USER_CNT(java.math.BigDecimal NEW_DFTV_USER_CNT) {
    this.NEW_DFTV_USER_CNT = NEW_DFTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_DFTV_USER_CNT;
  public java.math.BigDecimal get_LOSE_DFTV_USER_CNT() {
    return LOSE_DFTV_USER_CNT;
  }
  public void set_LOSE_DFTV_USER_CNT(java.math.BigDecimal LOSE_DFTV_USER_CNT) {
    this.LOSE_DFTV_USER_CNT = LOSE_DFTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_DFTV_USER_CNT(java.math.BigDecimal LOSE_DFTV_USER_CNT) {
    this.LOSE_DFTV_USER_CNT = LOSE_DFTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DBITV_VALID_USER_CNT;
  public java.math.BigDecimal get_DBITV_VALID_USER_CNT() {
    return DBITV_VALID_USER_CNT;
  }
  public void set_DBITV_VALID_USER_CNT(java.math.BigDecimal DBITV_VALID_USER_CNT) {
    this.DBITV_VALID_USER_CNT = DBITV_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DBITV_VALID_USER_CNT(java.math.BigDecimal DBITV_VALID_USER_CNT) {
    this.DBITV_VALID_USER_CNT = DBITV_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DBITV_PAID_USER_CNT;
  public java.math.BigDecimal get_DBITV_PAID_USER_CNT() {
    return DBITV_PAID_USER_CNT;
  }
  public void set_DBITV_PAID_USER_CNT(java.math.BigDecimal DBITV_PAID_USER_CNT) {
    this.DBITV_PAID_USER_CNT = DBITV_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DBITV_PAID_USER_CNT(java.math.BigDecimal DBITV_PAID_USER_CNT) {
    this.DBITV_PAID_USER_CNT = DBITV_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_DBITV_USER_CNT;
  public java.math.BigDecimal get_NEW_DBITV_USER_CNT() {
    return NEW_DBITV_USER_CNT;
  }
  public void set_NEW_DBITV_USER_CNT(java.math.BigDecimal NEW_DBITV_USER_CNT) {
    this.NEW_DBITV_USER_CNT = NEW_DBITV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_DBITV_USER_CNT(java.math.BigDecimal NEW_DBITV_USER_CNT) {
    this.NEW_DBITV_USER_CNT = NEW_DBITV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_DBITV_USER_CNT;
  public java.math.BigDecimal get_LOSE_DBITV_USER_CNT() {
    return LOSE_DBITV_USER_CNT;
  }
  public void set_LOSE_DBITV_USER_CNT(java.math.BigDecimal LOSE_DBITV_USER_CNT) {
    this.LOSE_DBITV_USER_CNT = LOSE_DBITV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_DBITV_USER_CNT(java.math.BigDecimal LOSE_DBITV_USER_CNT) {
    this.LOSE_DBITV_USER_CNT = LOSE_DBITV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DITV_VALID_USER_CNT;
  public java.math.BigDecimal get_DITV_VALID_USER_CNT() {
    return DITV_VALID_USER_CNT;
  }
  public void set_DITV_VALID_USER_CNT(java.math.BigDecimal DITV_VALID_USER_CNT) {
    this.DITV_VALID_USER_CNT = DITV_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DITV_VALID_USER_CNT(java.math.BigDecimal DITV_VALID_USER_CNT) {
    this.DITV_VALID_USER_CNT = DITV_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal DITV_PAID_USER_CNT;
  public java.math.BigDecimal get_DITV_PAID_USER_CNT() {
    return DITV_PAID_USER_CNT;
  }
  public void set_DITV_PAID_USER_CNT(java.math.BigDecimal DITV_PAID_USER_CNT) {
    this.DITV_PAID_USER_CNT = DITV_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_DITV_PAID_USER_CNT(java.math.BigDecimal DITV_PAID_USER_CNT) {
    this.DITV_PAID_USER_CNT = DITV_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_DITV_USER_CNT;
  public java.math.BigDecimal get_NEW_DITV_USER_CNT() {
    return NEW_DITV_USER_CNT;
  }
  public void set_NEW_DITV_USER_CNT(java.math.BigDecimal NEW_DITV_USER_CNT) {
    this.NEW_DITV_USER_CNT = NEW_DITV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_DITV_USER_CNT(java.math.BigDecimal NEW_DITV_USER_CNT) {
    this.NEW_DITV_USER_CNT = NEW_DITV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_DITV_USER_CNT;
  public java.math.BigDecimal get_LOSE_DITV_USER_CNT() {
    return LOSE_DITV_USER_CNT;
  }
  public void set_LOSE_DITV_USER_CNT(java.math.BigDecimal LOSE_DITV_USER_CNT) {
    this.LOSE_DITV_USER_CNT = LOSE_DITV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_DITV_USER_CNT(java.math.BigDecimal LOSE_DITV_USER_CNT) {
    this.LOSE_DITV_USER_CNT = LOSE_DITV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal AMSP_VALID_USER_CNT;
  public java.math.BigDecimal get_AMSP_VALID_USER_CNT() {
    return AMSP_VALID_USER_CNT;
  }
  public void set_AMSP_VALID_USER_CNT(java.math.BigDecimal AMSP_VALID_USER_CNT) {
    this.AMSP_VALID_USER_CNT = AMSP_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_AMSP_VALID_USER_CNT(java.math.BigDecimal AMSP_VALID_USER_CNT) {
    this.AMSP_VALID_USER_CNT = AMSP_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal AMSP_PAID_USER_CNT;
  public java.math.BigDecimal get_AMSP_PAID_USER_CNT() {
    return AMSP_PAID_USER_CNT;
  }
  public void set_AMSP_PAID_USER_CNT(java.math.BigDecimal AMSP_PAID_USER_CNT) {
    this.AMSP_PAID_USER_CNT = AMSP_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_AMSP_PAID_USER_CNT(java.math.BigDecimal AMSP_PAID_USER_CNT) {
    this.AMSP_PAID_USER_CNT = AMSP_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_AMSP_USER_CNT;
  public java.math.BigDecimal get_NEW_AMSP_USER_CNT() {
    return NEW_AMSP_USER_CNT;
  }
  public void set_NEW_AMSP_USER_CNT(java.math.BigDecimal NEW_AMSP_USER_CNT) {
    this.NEW_AMSP_USER_CNT = NEW_AMSP_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_AMSP_USER_CNT(java.math.BigDecimal NEW_AMSP_USER_CNT) {
    this.NEW_AMSP_USER_CNT = NEW_AMSP_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_AMSP_USER_CNT;
  public java.math.BigDecimal get_LOSE_AMSP_USER_CNT() {
    return LOSE_AMSP_USER_CNT;
  }
  public void set_LOSE_AMSP_USER_CNT(java.math.BigDecimal LOSE_AMSP_USER_CNT) {
    this.LOSE_AMSP_USER_CNT = LOSE_AMSP_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_AMSP_USER_CNT(java.math.BigDecimal LOSE_AMSP_USER_CNT) {
    this.LOSE_AMSP_USER_CNT = LOSE_AMSP_USER_CNT;
    return this;
  }
  private java.math.BigDecimal CM_VALID_USER_CNT;
  public java.math.BigDecimal get_CM_VALID_USER_CNT() {
    return CM_VALID_USER_CNT;
  }
  public void set_CM_VALID_USER_CNT(java.math.BigDecimal CM_VALID_USER_CNT) {
    this.CM_VALID_USER_CNT = CM_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_CM_VALID_USER_CNT(java.math.BigDecimal CM_VALID_USER_CNT) {
    this.CM_VALID_USER_CNT = CM_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal CM_PAID_USER_CNT;
  public java.math.BigDecimal get_CM_PAID_USER_CNT() {
    return CM_PAID_USER_CNT;
  }
  public void set_CM_PAID_USER_CNT(java.math.BigDecimal CM_PAID_USER_CNT) {
    this.CM_PAID_USER_CNT = CM_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_CM_PAID_USER_CNT(java.math.BigDecimal CM_PAID_USER_CNT) {
    this.CM_PAID_USER_CNT = CM_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_CM_USER_CNT;
  public java.math.BigDecimal get_NEW_CM_USER_CNT() {
    return NEW_CM_USER_CNT;
  }
  public void set_NEW_CM_USER_CNT(java.math.BigDecimal NEW_CM_USER_CNT) {
    this.NEW_CM_USER_CNT = NEW_CM_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_CM_USER_CNT(java.math.BigDecimal NEW_CM_USER_CNT) {
    this.NEW_CM_USER_CNT = NEW_CM_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_CM_USER_CNT;
  public java.math.BigDecimal get_LOSE_CM_USER_CNT() {
    return LOSE_CM_USER_CNT;
  }
  public void set_LOSE_CM_USER_CNT(java.math.BigDecimal LOSE_CM_USER_CNT) {
    this.LOSE_CM_USER_CNT = LOSE_CM_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_CM_USER_CNT(java.math.BigDecimal LOSE_CM_USER_CNT) {
    this.LOSE_CM_USER_CNT = LOSE_CM_USER_CNT;
    return this;
  }
  private java.math.BigDecimal HDTV_VALID_USER_CNT;
  public java.math.BigDecimal get_HDTV_VALID_USER_CNT() {
    return HDTV_VALID_USER_CNT;
  }
  public void set_HDTV_VALID_USER_CNT(java.math.BigDecimal HDTV_VALID_USER_CNT) {
    this.HDTV_VALID_USER_CNT = HDTV_VALID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_HDTV_VALID_USER_CNT(java.math.BigDecimal HDTV_VALID_USER_CNT) {
    this.HDTV_VALID_USER_CNT = HDTV_VALID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal HDTV_PAID_USER_CNT;
  public java.math.BigDecimal get_HDTV_PAID_USER_CNT() {
    return HDTV_PAID_USER_CNT;
  }
  public void set_HDTV_PAID_USER_CNT(java.math.BigDecimal HDTV_PAID_USER_CNT) {
    this.HDTV_PAID_USER_CNT = HDTV_PAID_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_HDTV_PAID_USER_CNT(java.math.BigDecimal HDTV_PAID_USER_CNT) {
    this.HDTV_PAID_USER_CNT = HDTV_PAID_USER_CNT;
    return this;
  }
  private java.math.BigDecimal NEW_HDTV_USER_CNT;
  public java.math.BigDecimal get_NEW_HDTV_USER_CNT() {
    return NEW_HDTV_USER_CNT;
  }
  public void set_NEW_HDTV_USER_CNT(java.math.BigDecimal NEW_HDTV_USER_CNT) {
    this.NEW_HDTV_USER_CNT = NEW_HDTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_NEW_HDTV_USER_CNT(java.math.BigDecimal NEW_HDTV_USER_CNT) {
    this.NEW_HDTV_USER_CNT = NEW_HDTV_USER_CNT;
    return this;
  }
  private java.math.BigDecimal LOSE_HDTV_USER_CNT;
  public java.math.BigDecimal get_LOSE_HDTV_USER_CNT() {
    return LOSE_HDTV_USER_CNT;
  }
  public void set_LOSE_HDTV_USER_CNT(java.math.BigDecimal LOSE_HDTV_USER_CNT) {
    this.LOSE_HDTV_USER_CNT = LOSE_HDTV_USER_CNT;
  }
  public ST_GRID_USER_DEV_M with_LOSE_HDTV_USER_CNT(java.math.BigDecimal LOSE_HDTV_USER_CNT) {
    this.LOSE_HDTV_USER_CNT = LOSE_HDTV_USER_CNT;
    return this;
  }
  private java.sql.Timestamp ETL_DATE;
  public java.sql.Timestamp get_ETL_DATE() {
    return ETL_DATE;
  }
  public void set_ETL_DATE(java.sql.Timestamp ETL_DATE) {
    this.ETL_DATE = ETL_DATE;
  }
  public ST_GRID_USER_DEV_M with_ETL_DATE(java.sql.Timestamp ETL_DATE) {
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
  public ST_GRID_USER_DEV_M with_PT_MON(String PT_MON) {
    this.PT_MON = PT_MON;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_GRID_USER_DEV_M)) {
      return false;
    }
    ST_GRID_USER_DEV_M that = (ST_GRID_USER_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.CUST_TYPE == null ? that.CUST_TYPE == null : this.CUST_TYPE.equals(that.CUST_TYPE));
    equal = equal && (this.CUST_TYPE_NAME == null ? that.CUST_TYPE_NAME == null : this.CUST_TYPE_NAME.equals(that.CUST_TYPE_NAME));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.MGR_ID == null ? that.MGR_ID == null : this.MGR_ID.equals(that.MGR_ID));
    equal = equal && (this.MGR_NAME == null ? that.MGR_NAME == null : this.MGR_NAME.equals(that.MGR_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.DTV_VALID_USER_CNT == null ? that.DTV_VALID_USER_CNT == null : this.DTV_VALID_USER_CNT.equals(that.DTV_VALID_USER_CNT));
    equal = equal && (this.DTV_PAID_USER_CNT == null ? that.DTV_PAID_USER_CNT == null : this.DTV_PAID_USER_CNT.equals(that.DTV_PAID_USER_CNT));
    equal = equal && (this.NEW_DTV_USER_CNT == null ? that.NEW_DTV_USER_CNT == null : this.NEW_DTV_USER_CNT.equals(that.NEW_DTV_USER_CNT));
    equal = equal && (this.LOSE_DTV_USER_CNT == null ? that.LOSE_DTV_USER_CNT == null : this.LOSE_DTV_USER_CNT.equals(that.LOSE_DTV_USER_CNT));
    equal = equal && (this.LAN_VALID_USER_CNT == null ? that.LAN_VALID_USER_CNT == null : this.LAN_VALID_USER_CNT.equals(that.LAN_VALID_USER_CNT));
    equal = equal && (this.LAN_PAID_USER_CNT == null ? that.LAN_PAID_USER_CNT == null : this.LAN_PAID_USER_CNT.equals(that.LAN_PAID_USER_CNT));
    equal = equal && (this.NEW_LAN_USER_CNT == null ? that.NEW_LAN_USER_CNT == null : this.NEW_LAN_USER_CNT.equals(that.NEW_LAN_USER_CNT));
    equal = equal && (this.LOSE_LAN_USER_CNT == null ? that.LOSE_LAN_USER_CNT == null : this.LOSE_LAN_USER_CNT.equals(that.LOSE_LAN_USER_CNT));
    equal = equal && (this.DFTV_VALID_USER_CNT == null ? that.DFTV_VALID_USER_CNT == null : this.DFTV_VALID_USER_CNT.equals(that.DFTV_VALID_USER_CNT));
    equal = equal && (this.DFTV_PAID_USER_CNT == null ? that.DFTV_PAID_USER_CNT == null : this.DFTV_PAID_USER_CNT.equals(that.DFTV_PAID_USER_CNT));
    equal = equal && (this.NEW_DFTV_USER_CNT == null ? that.NEW_DFTV_USER_CNT == null : this.NEW_DFTV_USER_CNT.equals(that.NEW_DFTV_USER_CNT));
    equal = equal && (this.LOSE_DFTV_USER_CNT == null ? that.LOSE_DFTV_USER_CNT == null : this.LOSE_DFTV_USER_CNT.equals(that.LOSE_DFTV_USER_CNT));
    equal = equal && (this.DBITV_VALID_USER_CNT == null ? that.DBITV_VALID_USER_CNT == null : this.DBITV_VALID_USER_CNT.equals(that.DBITV_VALID_USER_CNT));
    equal = equal && (this.DBITV_PAID_USER_CNT == null ? that.DBITV_PAID_USER_CNT == null : this.DBITV_PAID_USER_CNT.equals(that.DBITV_PAID_USER_CNT));
    equal = equal && (this.NEW_DBITV_USER_CNT == null ? that.NEW_DBITV_USER_CNT == null : this.NEW_DBITV_USER_CNT.equals(that.NEW_DBITV_USER_CNT));
    equal = equal && (this.LOSE_DBITV_USER_CNT == null ? that.LOSE_DBITV_USER_CNT == null : this.LOSE_DBITV_USER_CNT.equals(that.LOSE_DBITV_USER_CNT));
    equal = equal && (this.DITV_VALID_USER_CNT == null ? that.DITV_VALID_USER_CNT == null : this.DITV_VALID_USER_CNT.equals(that.DITV_VALID_USER_CNT));
    equal = equal && (this.DITV_PAID_USER_CNT == null ? that.DITV_PAID_USER_CNT == null : this.DITV_PAID_USER_CNT.equals(that.DITV_PAID_USER_CNT));
    equal = equal && (this.NEW_DITV_USER_CNT == null ? that.NEW_DITV_USER_CNT == null : this.NEW_DITV_USER_CNT.equals(that.NEW_DITV_USER_CNT));
    equal = equal && (this.LOSE_DITV_USER_CNT == null ? that.LOSE_DITV_USER_CNT == null : this.LOSE_DITV_USER_CNT.equals(that.LOSE_DITV_USER_CNT));
    equal = equal && (this.AMSP_VALID_USER_CNT == null ? that.AMSP_VALID_USER_CNT == null : this.AMSP_VALID_USER_CNT.equals(that.AMSP_VALID_USER_CNT));
    equal = equal && (this.AMSP_PAID_USER_CNT == null ? that.AMSP_PAID_USER_CNT == null : this.AMSP_PAID_USER_CNT.equals(that.AMSP_PAID_USER_CNT));
    equal = equal && (this.NEW_AMSP_USER_CNT == null ? that.NEW_AMSP_USER_CNT == null : this.NEW_AMSP_USER_CNT.equals(that.NEW_AMSP_USER_CNT));
    equal = equal && (this.LOSE_AMSP_USER_CNT == null ? that.LOSE_AMSP_USER_CNT == null : this.LOSE_AMSP_USER_CNT.equals(that.LOSE_AMSP_USER_CNT));
    equal = equal && (this.CM_VALID_USER_CNT == null ? that.CM_VALID_USER_CNT == null : this.CM_VALID_USER_CNT.equals(that.CM_VALID_USER_CNT));
    equal = equal && (this.CM_PAID_USER_CNT == null ? that.CM_PAID_USER_CNT == null : this.CM_PAID_USER_CNT.equals(that.CM_PAID_USER_CNT));
    equal = equal && (this.NEW_CM_USER_CNT == null ? that.NEW_CM_USER_CNT == null : this.NEW_CM_USER_CNT.equals(that.NEW_CM_USER_CNT));
    equal = equal && (this.LOSE_CM_USER_CNT == null ? that.LOSE_CM_USER_CNT == null : this.LOSE_CM_USER_CNT.equals(that.LOSE_CM_USER_CNT));
    equal = equal && (this.HDTV_VALID_USER_CNT == null ? that.HDTV_VALID_USER_CNT == null : this.HDTV_VALID_USER_CNT.equals(that.HDTV_VALID_USER_CNT));
    equal = equal && (this.HDTV_PAID_USER_CNT == null ? that.HDTV_PAID_USER_CNT == null : this.HDTV_PAID_USER_CNT.equals(that.HDTV_PAID_USER_CNT));
    equal = equal && (this.NEW_HDTV_USER_CNT == null ? that.NEW_HDTV_USER_CNT == null : this.NEW_HDTV_USER_CNT.equals(that.NEW_HDTV_USER_CNT));
    equal = equal && (this.LOSE_HDTV_USER_CNT == null ? that.LOSE_HDTV_USER_CNT == null : this.LOSE_HDTV_USER_CNT.equals(that.LOSE_HDTV_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ST_GRID_USER_DEV_M)) {
      return false;
    }
    ST_GRID_USER_DEV_M that = (ST_GRID_USER_DEV_M) o;
    boolean equal = true;
    equal = equal && (this.CYCLE_ID == null ? that.CYCLE_ID == null : this.CYCLE_ID.equals(that.CYCLE_ID));
    equal = equal && (this.OWN_CORP_STD_ORG_CODE == null ? that.OWN_CORP_STD_ORG_CODE == null : this.OWN_CORP_STD_ORG_CODE.equals(that.OWN_CORP_STD_ORG_CODE));
    equal = equal && (this.OWN_CORP_STD_ORG_NAME == null ? that.OWN_CORP_STD_ORG_NAME == null : this.OWN_CORP_STD_ORG_NAME.equals(that.OWN_CORP_STD_ORG_NAME));
    equal = equal && (this.CUST_TYPE == null ? that.CUST_TYPE == null : this.CUST_TYPE.equals(that.CUST_TYPE));
    equal = equal && (this.CUST_TYPE_NAME == null ? that.CUST_TYPE_NAME == null : this.CUST_TYPE_NAME.equals(that.CUST_TYPE_NAME));
    equal = equal && (this.GRID_ID == null ? that.GRID_ID == null : this.GRID_ID.equals(that.GRID_ID));
    equal = equal && (this.GRID_NAME == null ? that.GRID_NAME == null : this.GRID_NAME.equals(that.GRID_NAME));
    equal = equal && (this.MGR_ID == null ? that.MGR_ID == null : this.MGR_ID.equals(that.MGR_ID));
    equal = equal && (this.MGR_NAME == null ? that.MGR_NAME == null : this.MGR_NAME.equals(that.MGR_NAME));
    equal = equal && (this.AREA_STD_ADDR_ID == null ? that.AREA_STD_ADDR_ID == null : this.AREA_STD_ADDR_ID.equals(that.AREA_STD_ADDR_ID));
    equal = equal && (this.AREA_STD_ADDR_NAME == null ? that.AREA_STD_ADDR_NAME == null : this.AREA_STD_ADDR_NAME.equals(that.AREA_STD_ADDR_NAME));
    equal = equal && (this.DTV_VALID_USER_CNT == null ? that.DTV_VALID_USER_CNT == null : this.DTV_VALID_USER_CNT.equals(that.DTV_VALID_USER_CNT));
    equal = equal && (this.DTV_PAID_USER_CNT == null ? that.DTV_PAID_USER_CNT == null : this.DTV_PAID_USER_CNT.equals(that.DTV_PAID_USER_CNT));
    equal = equal && (this.NEW_DTV_USER_CNT == null ? that.NEW_DTV_USER_CNT == null : this.NEW_DTV_USER_CNT.equals(that.NEW_DTV_USER_CNT));
    equal = equal && (this.LOSE_DTV_USER_CNT == null ? that.LOSE_DTV_USER_CNT == null : this.LOSE_DTV_USER_CNT.equals(that.LOSE_DTV_USER_CNT));
    equal = equal && (this.LAN_VALID_USER_CNT == null ? that.LAN_VALID_USER_CNT == null : this.LAN_VALID_USER_CNT.equals(that.LAN_VALID_USER_CNT));
    equal = equal && (this.LAN_PAID_USER_CNT == null ? that.LAN_PAID_USER_CNT == null : this.LAN_PAID_USER_CNT.equals(that.LAN_PAID_USER_CNT));
    equal = equal && (this.NEW_LAN_USER_CNT == null ? that.NEW_LAN_USER_CNT == null : this.NEW_LAN_USER_CNT.equals(that.NEW_LAN_USER_CNT));
    equal = equal && (this.LOSE_LAN_USER_CNT == null ? that.LOSE_LAN_USER_CNT == null : this.LOSE_LAN_USER_CNT.equals(that.LOSE_LAN_USER_CNT));
    equal = equal && (this.DFTV_VALID_USER_CNT == null ? that.DFTV_VALID_USER_CNT == null : this.DFTV_VALID_USER_CNT.equals(that.DFTV_VALID_USER_CNT));
    equal = equal && (this.DFTV_PAID_USER_CNT == null ? that.DFTV_PAID_USER_CNT == null : this.DFTV_PAID_USER_CNT.equals(that.DFTV_PAID_USER_CNT));
    equal = equal && (this.NEW_DFTV_USER_CNT == null ? that.NEW_DFTV_USER_CNT == null : this.NEW_DFTV_USER_CNT.equals(that.NEW_DFTV_USER_CNT));
    equal = equal && (this.LOSE_DFTV_USER_CNT == null ? that.LOSE_DFTV_USER_CNT == null : this.LOSE_DFTV_USER_CNT.equals(that.LOSE_DFTV_USER_CNT));
    equal = equal && (this.DBITV_VALID_USER_CNT == null ? that.DBITV_VALID_USER_CNT == null : this.DBITV_VALID_USER_CNT.equals(that.DBITV_VALID_USER_CNT));
    equal = equal && (this.DBITV_PAID_USER_CNT == null ? that.DBITV_PAID_USER_CNT == null : this.DBITV_PAID_USER_CNT.equals(that.DBITV_PAID_USER_CNT));
    equal = equal && (this.NEW_DBITV_USER_CNT == null ? that.NEW_DBITV_USER_CNT == null : this.NEW_DBITV_USER_CNT.equals(that.NEW_DBITV_USER_CNT));
    equal = equal && (this.LOSE_DBITV_USER_CNT == null ? that.LOSE_DBITV_USER_CNT == null : this.LOSE_DBITV_USER_CNT.equals(that.LOSE_DBITV_USER_CNT));
    equal = equal && (this.DITV_VALID_USER_CNT == null ? that.DITV_VALID_USER_CNT == null : this.DITV_VALID_USER_CNT.equals(that.DITV_VALID_USER_CNT));
    equal = equal && (this.DITV_PAID_USER_CNT == null ? that.DITV_PAID_USER_CNT == null : this.DITV_PAID_USER_CNT.equals(that.DITV_PAID_USER_CNT));
    equal = equal && (this.NEW_DITV_USER_CNT == null ? that.NEW_DITV_USER_CNT == null : this.NEW_DITV_USER_CNT.equals(that.NEW_DITV_USER_CNT));
    equal = equal && (this.LOSE_DITV_USER_CNT == null ? that.LOSE_DITV_USER_CNT == null : this.LOSE_DITV_USER_CNT.equals(that.LOSE_DITV_USER_CNT));
    equal = equal && (this.AMSP_VALID_USER_CNT == null ? that.AMSP_VALID_USER_CNT == null : this.AMSP_VALID_USER_CNT.equals(that.AMSP_VALID_USER_CNT));
    equal = equal && (this.AMSP_PAID_USER_CNT == null ? that.AMSP_PAID_USER_CNT == null : this.AMSP_PAID_USER_CNT.equals(that.AMSP_PAID_USER_CNT));
    equal = equal && (this.NEW_AMSP_USER_CNT == null ? that.NEW_AMSP_USER_CNT == null : this.NEW_AMSP_USER_CNT.equals(that.NEW_AMSP_USER_CNT));
    equal = equal && (this.LOSE_AMSP_USER_CNT == null ? that.LOSE_AMSP_USER_CNT == null : this.LOSE_AMSP_USER_CNT.equals(that.LOSE_AMSP_USER_CNT));
    equal = equal && (this.CM_VALID_USER_CNT == null ? that.CM_VALID_USER_CNT == null : this.CM_VALID_USER_CNT.equals(that.CM_VALID_USER_CNT));
    equal = equal && (this.CM_PAID_USER_CNT == null ? that.CM_PAID_USER_CNT == null : this.CM_PAID_USER_CNT.equals(that.CM_PAID_USER_CNT));
    equal = equal && (this.NEW_CM_USER_CNT == null ? that.NEW_CM_USER_CNT == null : this.NEW_CM_USER_CNT.equals(that.NEW_CM_USER_CNT));
    equal = equal && (this.LOSE_CM_USER_CNT == null ? that.LOSE_CM_USER_CNT == null : this.LOSE_CM_USER_CNT.equals(that.LOSE_CM_USER_CNT));
    equal = equal && (this.HDTV_VALID_USER_CNT == null ? that.HDTV_VALID_USER_CNT == null : this.HDTV_VALID_USER_CNT.equals(that.HDTV_VALID_USER_CNT));
    equal = equal && (this.HDTV_PAID_USER_CNT == null ? that.HDTV_PAID_USER_CNT == null : this.HDTV_PAID_USER_CNT.equals(that.HDTV_PAID_USER_CNT));
    equal = equal && (this.NEW_HDTV_USER_CNT == null ? that.NEW_HDTV_USER_CNT == null : this.NEW_HDTV_USER_CNT.equals(that.NEW_HDTV_USER_CNT));
    equal = equal && (this.LOSE_HDTV_USER_CNT == null ? that.LOSE_HDTV_USER_CNT == null : this.LOSE_HDTV_USER_CNT.equals(that.LOSE_HDTV_USER_CNT));
    equal = equal && (this.ETL_DATE == null ? that.ETL_DATE == null : this.ETL_DATE.equals(that.ETL_DATE));
    equal = equal && (this.PT_MON == null ? that.PT_MON == null : this.PT_MON.equals(that.PT_MON));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.CUST_TYPE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.CUST_TYPE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.MGR_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.MGR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(10, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.DTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.NEW_DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.LOSE_DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LAN_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.LAN_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.NEW_LAN_USER_CNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LOSE_LAN_USER_CNT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.DFTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.DFTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.NEW_DFTV_USER_CNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.LOSE_DFTV_USER_CNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.DBITV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.DBITV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.NEW_DBITV_USER_CNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.LOSE_DBITV_USER_CNT = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.DITV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.DITV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.NEW_DITV_USER_CNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.LOSE_DITV_USER_CNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.AMSP_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.AMSP_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.NEW_AMSP_USER_CNT = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.LOSE_AMSP_USER_CNT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CM_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.CM_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.NEW_CM_USER_CNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.LOSE_CM_USER_CNT = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.HDTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.HDTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.NEW_HDTV_USER_CNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.LOSE_HDTV_USER_CNT = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(45, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CYCLE_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OWN_CORP_STD_ORG_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.OWN_CORP_STD_ORG_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.CUST_TYPE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.CUST_TYPE_NAME = JdbcWritableBridge.readString(5, __dbResults);
    this.GRID_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.GRID_NAME = JdbcWritableBridge.readString(7, __dbResults);
    this.MGR_ID = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.MGR_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.AREA_STD_ADDR_ID = JdbcWritableBridge.readString(10, __dbResults);
    this.AREA_STD_ADDR_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.DTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.DTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.NEW_DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.LOSE_DTV_USER_CNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.LAN_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.LAN_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.NEW_LAN_USER_CNT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.LOSE_LAN_USER_CNT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.DFTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.DFTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.NEW_DFTV_USER_CNT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.LOSE_DFTV_USER_CNT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.DBITV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.DBITV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.NEW_DBITV_USER_CNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.LOSE_DBITV_USER_CNT = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.DITV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.DITV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.NEW_DITV_USER_CNT = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.LOSE_DITV_USER_CNT = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.AMSP_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.AMSP_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.NEW_AMSP_USER_CNT = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.LOSE_AMSP_USER_CNT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.CM_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.CM_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.NEW_CM_USER_CNT = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.LOSE_CM_USER_CNT = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.HDTV_VALID_USER_CNT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.HDTV_PAID_USER_CNT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.NEW_HDTV_USER_CNT = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.LOSE_HDTV_USER_CNT = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.ETL_DATE = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.PT_MON = JdbcWritableBridge.readString(45, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(CUST_TYPE, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CUST_TYPE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MGR_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MGR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_VALID_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_PAID_USER_CNT, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DTV_USER_CNT, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DTV_USER_CNT, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_VALID_USER_CNT, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_PAID_USER_CNT, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_LAN_USER_CNT, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_LAN_USER_CNT, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_VALID_USER_CNT, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_PAID_USER_CNT, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DFTV_USER_CNT, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DFTV_USER_CNT, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_VALID_USER_CNT, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_PAID_USER_CNT, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DBITV_USER_CNT, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DBITV_USER_CNT, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_VALID_USER_CNT, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_PAID_USER_CNT, 29 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DITV_USER_CNT, 30 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DITV_USER_CNT, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_VALID_USER_CNT, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_PAID_USER_CNT, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_AMSP_USER_CNT, 34 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_AMSP_USER_CNT, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CM_VALID_USER_CNT, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CM_PAID_USER_CNT, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_CM_USER_CNT, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_CM_USER_CNT, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_VALID_USER_CNT, 40 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_PAID_USER_CNT, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_HDTV_USER_CNT, 42 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_HDTV_USER_CNT, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 45 + __off, 1, __dbStmt);
    return 45;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CYCLE_ID, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OWN_CORP_STD_ORG_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CUST_TYPE, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CUST_TYPE_NAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GRID_NAME, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MGR_ID, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MGR_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_ID, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AREA_STD_ADDR_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_VALID_USER_CNT, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DTV_PAID_USER_CNT, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DTV_USER_CNT, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DTV_USER_CNT, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_VALID_USER_CNT, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAN_PAID_USER_CNT, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_LAN_USER_CNT, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_LAN_USER_CNT, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_VALID_USER_CNT, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DFTV_PAID_USER_CNT, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DFTV_USER_CNT, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DFTV_USER_CNT, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_VALID_USER_CNT, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DBITV_PAID_USER_CNT, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DBITV_USER_CNT, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DBITV_USER_CNT, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_VALID_USER_CNT, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DITV_PAID_USER_CNT, 29 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_DITV_USER_CNT, 30 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_DITV_USER_CNT, 31 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_VALID_USER_CNT, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AMSP_PAID_USER_CNT, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_AMSP_USER_CNT, 34 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_AMSP_USER_CNT, 35 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CM_VALID_USER_CNT, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CM_PAID_USER_CNT, 37 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_CM_USER_CNT, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_CM_USER_CNT, 39 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_VALID_USER_CNT, 40 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HDTV_PAID_USER_CNT, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NEW_HDTV_USER_CNT, 42 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOSE_HDTV_USER_CNT, 43 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ETL_DATE, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PT_MON, 45 + __off, 1, __dbStmt);
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
    this.CUST_TYPE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUST_TYPE_NAME = null;
    } else {
    this.CUST_TYPE_NAME = Text.readString(__dataIn);
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
        this.DTV_VALID_USER_CNT = null;
    } else {
    this.DTV_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DTV_PAID_USER_CNT = null;
    } else {
    this.DTV_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_DTV_USER_CNT = null;
    } else {
    this.NEW_DTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_DTV_USER_CNT = null;
    } else {
    this.LOSE_DTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_VALID_USER_CNT = null;
    } else {
    this.LAN_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAN_PAID_USER_CNT = null;
    } else {
    this.LAN_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_LAN_USER_CNT = null;
    } else {
    this.NEW_LAN_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_LAN_USER_CNT = null;
    } else {
    this.LOSE_LAN_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DFTV_VALID_USER_CNT = null;
    } else {
    this.DFTV_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DFTV_PAID_USER_CNT = null;
    } else {
    this.DFTV_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_DFTV_USER_CNT = null;
    } else {
    this.NEW_DFTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_DFTV_USER_CNT = null;
    } else {
    this.LOSE_DFTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DBITV_VALID_USER_CNT = null;
    } else {
    this.DBITV_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DBITV_PAID_USER_CNT = null;
    } else {
    this.DBITV_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_DBITV_USER_CNT = null;
    } else {
    this.NEW_DBITV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_DBITV_USER_CNT = null;
    } else {
    this.LOSE_DBITV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DITV_VALID_USER_CNT = null;
    } else {
    this.DITV_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DITV_PAID_USER_CNT = null;
    } else {
    this.DITV_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_DITV_USER_CNT = null;
    } else {
    this.NEW_DITV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_DITV_USER_CNT = null;
    } else {
    this.LOSE_DITV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AMSP_VALID_USER_CNT = null;
    } else {
    this.AMSP_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AMSP_PAID_USER_CNT = null;
    } else {
    this.AMSP_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_AMSP_USER_CNT = null;
    } else {
    this.NEW_AMSP_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_AMSP_USER_CNT = null;
    } else {
    this.LOSE_AMSP_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CM_VALID_USER_CNT = null;
    } else {
    this.CM_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CM_PAID_USER_CNT = null;
    } else {
    this.CM_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_CM_USER_CNT = null;
    } else {
    this.NEW_CM_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_CM_USER_CNT = null;
    } else {
    this.LOSE_CM_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HDTV_VALID_USER_CNT = null;
    } else {
    this.HDTV_VALID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HDTV_PAID_USER_CNT = null;
    } else {
    this.HDTV_PAID_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEW_HDTV_USER_CNT = null;
    } else {
    this.NEW_HDTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOSE_HDTV_USER_CNT = null;
    } else {
    this.LOSE_HDTV_USER_CNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_TYPE, __dataOut);
    }
    if (null == this.CUST_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_TYPE_NAME);
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
    if (null == this.DTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DTV_USER_CNT, __dataOut);
    }
    if (null == this.LAN_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_VALID_USER_CNT, __dataOut);
    }
    if (null == this.LAN_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_LAN_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_LAN_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_LAN_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_LAN_USER_CNT, __dataOut);
    }
    if (null == this.DFTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DFTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DFTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DFTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DFTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DFTV_USER_CNT, __dataOut);
    }
    if (null == this.DBITV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DBITV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DBITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DBITV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DBITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DBITV_USER_CNT, __dataOut);
    }
    if (null == this.DITV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DITV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DITV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DITV_USER_CNT, __dataOut);
    }
    if (null == this.AMSP_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_VALID_USER_CNT, __dataOut);
    }
    if (null == this.AMSP_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_AMSP_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_AMSP_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_AMSP_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_AMSP_USER_CNT, __dataOut);
    }
    if (null == this.CM_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CM_VALID_USER_CNT, __dataOut);
    }
    if (null == this.CM_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CM_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_CM_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_CM_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_CM_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_CM_USER_CNT, __dataOut);
    }
    if (null == this.HDTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.HDTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_HDTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_HDTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_HDTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_HDTV_USER_CNT, __dataOut);
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
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CUST_TYPE, __dataOut);
    }
    if (null == this.CUST_TYPE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUST_TYPE_NAME);
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
    if (null == this.DTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DTV_USER_CNT, __dataOut);
    }
    if (null == this.LAN_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_VALID_USER_CNT, __dataOut);
    }
    if (null == this.LAN_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAN_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_LAN_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_LAN_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_LAN_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_LAN_USER_CNT, __dataOut);
    }
    if (null == this.DFTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DFTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DFTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DFTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DFTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DFTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DFTV_USER_CNT, __dataOut);
    }
    if (null == this.DBITV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DBITV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DBITV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DBITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DBITV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DBITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DBITV_USER_CNT, __dataOut);
    }
    if (null == this.DITV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.DITV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DITV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_DITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_DITV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_DITV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_DITV_USER_CNT, __dataOut);
    }
    if (null == this.AMSP_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_VALID_USER_CNT, __dataOut);
    }
    if (null == this.AMSP_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AMSP_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_AMSP_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_AMSP_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_AMSP_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_AMSP_USER_CNT, __dataOut);
    }
    if (null == this.CM_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CM_VALID_USER_CNT, __dataOut);
    }
    if (null == this.CM_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CM_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_CM_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_CM_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_CM_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_CM_USER_CNT, __dataOut);
    }
    if (null == this.HDTV_VALID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_VALID_USER_CNT, __dataOut);
    }
    if (null == this.HDTV_PAID_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HDTV_PAID_USER_CNT, __dataOut);
    }
    if (null == this.NEW_HDTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NEW_HDTV_USER_CNT, __dataOut);
    }
    if (null == this.LOSE_HDTV_USER_CNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOSE_HDTV_USER_CNT, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE==null?"null":CUST_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE_NAME==null?"null":CUST_TYPE_NAME, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_VALID_USER_CNT==null?"null":DTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_PAID_USER_CNT==null?"null":DTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DTV_USER_CNT==null?"null":NEW_DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DTV_USER_CNT==null?"null":LOSE_DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_VALID_USER_CNT==null?"null":LAN_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_PAID_USER_CNT==null?"null":LAN_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_LAN_USER_CNT==null?"null":NEW_LAN_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_LAN_USER_CNT==null?"null":LOSE_LAN_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_VALID_USER_CNT==null?"null":DFTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_PAID_USER_CNT==null?"null":DFTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DFTV_USER_CNT==null?"null":NEW_DFTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DFTV_USER_CNT==null?"null":LOSE_DFTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_VALID_USER_CNT==null?"null":DBITV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_PAID_USER_CNT==null?"null":DBITV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DBITV_USER_CNT==null?"null":NEW_DBITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DBITV_USER_CNT==null?"null":LOSE_DBITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_VALID_USER_CNT==null?"null":DITV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_PAID_USER_CNT==null?"null":DITV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DITV_USER_CNT==null?"null":NEW_DITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DITV_USER_CNT==null?"null":LOSE_DITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_VALID_USER_CNT==null?"null":AMSP_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_PAID_USER_CNT==null?"null":AMSP_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_AMSP_USER_CNT==null?"null":NEW_AMSP_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_AMSP_USER_CNT==null?"null":LOSE_AMSP_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CM_VALID_USER_CNT==null?"null":CM_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CM_PAID_USER_CNT==null?"null":CM_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_CM_USER_CNT==null?"null":NEW_CM_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_CM_USER_CNT==null?"null":LOSE_CM_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_VALID_USER_CNT==null?"null":HDTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_PAID_USER_CNT==null?"null":HDTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_HDTV_USER_CNT==null?"null":NEW_HDTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_HDTV_USER_CNT==null?"null":LOSE_HDTV_USER_CNT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE==null?"null":CUST_TYPE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUST_TYPE_NAME==null?"null":CUST_TYPE_NAME, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_VALID_USER_CNT==null?"null":DTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DTV_PAID_USER_CNT==null?"null":DTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DTV_USER_CNT==null?"null":NEW_DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DTV_USER_CNT==null?"null":LOSE_DTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_VALID_USER_CNT==null?"null":LAN_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAN_PAID_USER_CNT==null?"null":LAN_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_LAN_USER_CNT==null?"null":NEW_LAN_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_LAN_USER_CNT==null?"null":LOSE_LAN_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_VALID_USER_CNT==null?"null":DFTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DFTV_PAID_USER_CNT==null?"null":DFTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DFTV_USER_CNT==null?"null":NEW_DFTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DFTV_USER_CNT==null?"null":LOSE_DFTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_VALID_USER_CNT==null?"null":DBITV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DBITV_PAID_USER_CNT==null?"null":DBITV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DBITV_USER_CNT==null?"null":NEW_DBITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DBITV_USER_CNT==null?"null":LOSE_DBITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_VALID_USER_CNT==null?"null":DITV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DITV_PAID_USER_CNT==null?"null":DITV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_DITV_USER_CNT==null?"null":NEW_DITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_DITV_USER_CNT==null?"null":LOSE_DITV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_VALID_USER_CNT==null?"null":AMSP_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMSP_PAID_USER_CNT==null?"null":AMSP_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_AMSP_USER_CNT==null?"null":NEW_AMSP_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_AMSP_USER_CNT==null?"null":LOSE_AMSP_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CM_VALID_USER_CNT==null?"null":CM_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CM_PAID_USER_CNT==null?"null":CM_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_CM_USER_CNT==null?"null":NEW_CM_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_CM_USER_CNT==null?"null":LOSE_CM_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_VALID_USER_CNT==null?"null":HDTV_VALID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HDTV_PAID_USER_CNT==null?"null":HDTV_PAID_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEW_HDTV_USER_CNT==null?"null":NEW_HDTV_USER_CNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOSE_HDTV_USER_CNT==null?"null":LOSE_HDTV_USER_CNT.toPlainString(), delimiters));
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
      this.CUST_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_TYPE_NAME = null; } else {
      this.CUST_TYPE_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_VALID_USER_CNT = null; } else {
      this.DTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_PAID_USER_CNT = null; } else {
      this.DTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DTV_USER_CNT = null; } else {
      this.NEW_DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DTV_USER_CNT = null; } else {
      this.LOSE_DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_VALID_USER_CNT = null; } else {
      this.LAN_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_PAID_USER_CNT = null; } else {
      this.LAN_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_LAN_USER_CNT = null; } else {
      this.NEW_LAN_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_LAN_USER_CNT = null; } else {
      this.LOSE_LAN_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_VALID_USER_CNT = null; } else {
      this.DFTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_PAID_USER_CNT = null; } else {
      this.DFTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DFTV_USER_CNT = null; } else {
      this.NEW_DFTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DFTV_USER_CNT = null; } else {
      this.LOSE_DFTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_VALID_USER_CNT = null; } else {
      this.DBITV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_PAID_USER_CNT = null; } else {
      this.DBITV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DBITV_USER_CNT = null; } else {
      this.NEW_DBITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DBITV_USER_CNT = null; } else {
      this.LOSE_DBITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_VALID_USER_CNT = null; } else {
      this.DITV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_PAID_USER_CNT = null; } else {
      this.DITV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DITV_USER_CNT = null; } else {
      this.NEW_DITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DITV_USER_CNT = null; } else {
      this.LOSE_DITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_VALID_USER_CNT = null; } else {
      this.AMSP_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_PAID_USER_CNT = null; } else {
      this.AMSP_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_AMSP_USER_CNT = null; } else {
      this.NEW_AMSP_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_AMSP_USER_CNT = null; } else {
      this.LOSE_AMSP_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CM_VALID_USER_CNT = null; } else {
      this.CM_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CM_PAID_USER_CNT = null; } else {
      this.CM_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_CM_USER_CNT = null; } else {
      this.NEW_CM_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_CM_USER_CNT = null; } else {
      this.LOSE_CM_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_VALID_USER_CNT = null; } else {
      this.HDTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_PAID_USER_CNT = null; } else {
      this.HDTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_HDTV_USER_CNT = null; } else {
      this.NEW_HDTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_HDTV_USER_CNT = null; } else {
      this.LOSE_HDTV_USER_CNT = new java.math.BigDecimal(__cur_str);
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
      this.CUST_TYPE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.CUST_TYPE_NAME = null; } else {
      this.CUST_TYPE_NAME = __cur_str;
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_VALID_USER_CNT = null; } else {
      this.DTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DTV_PAID_USER_CNT = null; } else {
      this.DTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DTV_USER_CNT = null; } else {
      this.NEW_DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DTV_USER_CNT = null; } else {
      this.LOSE_DTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_VALID_USER_CNT = null; } else {
      this.LAN_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LAN_PAID_USER_CNT = null; } else {
      this.LAN_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_LAN_USER_CNT = null; } else {
      this.NEW_LAN_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_LAN_USER_CNT = null; } else {
      this.LOSE_LAN_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_VALID_USER_CNT = null; } else {
      this.DFTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DFTV_PAID_USER_CNT = null; } else {
      this.DFTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DFTV_USER_CNT = null; } else {
      this.NEW_DFTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DFTV_USER_CNT = null; } else {
      this.LOSE_DFTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_VALID_USER_CNT = null; } else {
      this.DBITV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DBITV_PAID_USER_CNT = null; } else {
      this.DBITV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DBITV_USER_CNT = null; } else {
      this.NEW_DBITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DBITV_USER_CNT = null; } else {
      this.LOSE_DBITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_VALID_USER_CNT = null; } else {
      this.DITV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.DITV_PAID_USER_CNT = null; } else {
      this.DITV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_DITV_USER_CNT = null; } else {
      this.NEW_DITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_DITV_USER_CNT = null; } else {
      this.LOSE_DITV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_VALID_USER_CNT = null; } else {
      this.AMSP_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.AMSP_PAID_USER_CNT = null; } else {
      this.AMSP_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_AMSP_USER_CNT = null; } else {
      this.NEW_AMSP_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_AMSP_USER_CNT = null; } else {
      this.LOSE_AMSP_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CM_VALID_USER_CNT = null; } else {
      this.CM_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.CM_PAID_USER_CNT = null; } else {
      this.CM_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_CM_USER_CNT = null; } else {
      this.NEW_CM_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_CM_USER_CNT = null; } else {
      this.LOSE_CM_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_VALID_USER_CNT = null; } else {
      this.HDTV_VALID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.HDTV_PAID_USER_CNT = null; } else {
      this.HDTV_PAID_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.NEW_HDTV_USER_CNT = null; } else {
      this.NEW_HDTV_USER_CNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.LOSE_HDTV_USER_CNT = null; } else {
      this.LOSE_HDTV_USER_CNT = new java.math.BigDecimal(__cur_str);
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
    ST_GRID_USER_DEV_M o = (ST_GRID_USER_DEV_M) super.clone();
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
    return o;
  }

  public void clone0(ST_GRID_USER_DEV_M o) throws CloneNotSupportedException {
    o.ETL_DATE = (o.ETL_DATE != null) ? (java.sql.Timestamp) o.ETL_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CYCLE_ID", this.CYCLE_ID);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_CODE", this.OWN_CORP_STD_ORG_CODE);
    __sqoop$field_map.put("OWN_CORP_STD_ORG_NAME", this.OWN_CORP_STD_ORG_NAME);
    __sqoop$field_map.put("CUST_TYPE", this.CUST_TYPE);
    __sqoop$field_map.put("CUST_TYPE_NAME", this.CUST_TYPE_NAME);
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("MGR_ID", this.MGR_ID);
    __sqoop$field_map.put("MGR_NAME", this.MGR_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("DTV_VALID_USER_CNT", this.DTV_VALID_USER_CNT);
    __sqoop$field_map.put("DTV_PAID_USER_CNT", this.DTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DTV_USER_CNT", this.NEW_DTV_USER_CNT);
    __sqoop$field_map.put("LOSE_DTV_USER_CNT", this.LOSE_DTV_USER_CNT);
    __sqoop$field_map.put("LAN_VALID_USER_CNT", this.LAN_VALID_USER_CNT);
    __sqoop$field_map.put("LAN_PAID_USER_CNT", this.LAN_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_LAN_USER_CNT", this.NEW_LAN_USER_CNT);
    __sqoop$field_map.put("LOSE_LAN_USER_CNT", this.LOSE_LAN_USER_CNT);
    __sqoop$field_map.put("DFTV_VALID_USER_CNT", this.DFTV_VALID_USER_CNT);
    __sqoop$field_map.put("DFTV_PAID_USER_CNT", this.DFTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DFTV_USER_CNT", this.NEW_DFTV_USER_CNT);
    __sqoop$field_map.put("LOSE_DFTV_USER_CNT", this.LOSE_DFTV_USER_CNT);
    __sqoop$field_map.put("DBITV_VALID_USER_CNT", this.DBITV_VALID_USER_CNT);
    __sqoop$field_map.put("DBITV_PAID_USER_CNT", this.DBITV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DBITV_USER_CNT", this.NEW_DBITV_USER_CNT);
    __sqoop$field_map.put("LOSE_DBITV_USER_CNT", this.LOSE_DBITV_USER_CNT);
    __sqoop$field_map.put("DITV_VALID_USER_CNT", this.DITV_VALID_USER_CNT);
    __sqoop$field_map.put("DITV_PAID_USER_CNT", this.DITV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DITV_USER_CNT", this.NEW_DITV_USER_CNT);
    __sqoop$field_map.put("LOSE_DITV_USER_CNT", this.LOSE_DITV_USER_CNT);
    __sqoop$field_map.put("AMSP_VALID_USER_CNT", this.AMSP_VALID_USER_CNT);
    __sqoop$field_map.put("AMSP_PAID_USER_CNT", this.AMSP_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_AMSP_USER_CNT", this.NEW_AMSP_USER_CNT);
    __sqoop$field_map.put("LOSE_AMSP_USER_CNT", this.LOSE_AMSP_USER_CNT);
    __sqoop$field_map.put("CM_VALID_USER_CNT", this.CM_VALID_USER_CNT);
    __sqoop$field_map.put("CM_PAID_USER_CNT", this.CM_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_CM_USER_CNT", this.NEW_CM_USER_CNT);
    __sqoop$field_map.put("LOSE_CM_USER_CNT", this.LOSE_CM_USER_CNT);
    __sqoop$field_map.put("HDTV_VALID_USER_CNT", this.HDTV_VALID_USER_CNT);
    __sqoop$field_map.put("HDTV_PAID_USER_CNT", this.HDTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_HDTV_USER_CNT", this.NEW_HDTV_USER_CNT);
    __sqoop$field_map.put("LOSE_HDTV_USER_CNT", this.LOSE_HDTV_USER_CNT);
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
    __sqoop$field_map.put("GRID_ID", this.GRID_ID);
    __sqoop$field_map.put("GRID_NAME", this.GRID_NAME);
    __sqoop$field_map.put("MGR_ID", this.MGR_ID);
    __sqoop$field_map.put("MGR_NAME", this.MGR_NAME);
    __sqoop$field_map.put("AREA_STD_ADDR_ID", this.AREA_STD_ADDR_ID);
    __sqoop$field_map.put("AREA_STD_ADDR_NAME", this.AREA_STD_ADDR_NAME);
    __sqoop$field_map.put("DTV_VALID_USER_CNT", this.DTV_VALID_USER_CNT);
    __sqoop$field_map.put("DTV_PAID_USER_CNT", this.DTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DTV_USER_CNT", this.NEW_DTV_USER_CNT);
    __sqoop$field_map.put("LOSE_DTV_USER_CNT", this.LOSE_DTV_USER_CNT);
    __sqoop$field_map.put("LAN_VALID_USER_CNT", this.LAN_VALID_USER_CNT);
    __sqoop$field_map.put("LAN_PAID_USER_CNT", this.LAN_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_LAN_USER_CNT", this.NEW_LAN_USER_CNT);
    __sqoop$field_map.put("LOSE_LAN_USER_CNT", this.LOSE_LAN_USER_CNT);
    __sqoop$field_map.put("DFTV_VALID_USER_CNT", this.DFTV_VALID_USER_CNT);
    __sqoop$field_map.put("DFTV_PAID_USER_CNT", this.DFTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DFTV_USER_CNT", this.NEW_DFTV_USER_CNT);
    __sqoop$field_map.put("LOSE_DFTV_USER_CNT", this.LOSE_DFTV_USER_CNT);
    __sqoop$field_map.put("DBITV_VALID_USER_CNT", this.DBITV_VALID_USER_CNT);
    __sqoop$field_map.put("DBITV_PAID_USER_CNT", this.DBITV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DBITV_USER_CNT", this.NEW_DBITV_USER_CNT);
    __sqoop$field_map.put("LOSE_DBITV_USER_CNT", this.LOSE_DBITV_USER_CNT);
    __sqoop$field_map.put("DITV_VALID_USER_CNT", this.DITV_VALID_USER_CNT);
    __sqoop$field_map.put("DITV_PAID_USER_CNT", this.DITV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_DITV_USER_CNT", this.NEW_DITV_USER_CNT);
    __sqoop$field_map.put("LOSE_DITV_USER_CNT", this.LOSE_DITV_USER_CNT);
    __sqoop$field_map.put("AMSP_VALID_USER_CNT", this.AMSP_VALID_USER_CNT);
    __sqoop$field_map.put("AMSP_PAID_USER_CNT", this.AMSP_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_AMSP_USER_CNT", this.NEW_AMSP_USER_CNT);
    __sqoop$field_map.put("LOSE_AMSP_USER_CNT", this.LOSE_AMSP_USER_CNT);
    __sqoop$field_map.put("CM_VALID_USER_CNT", this.CM_VALID_USER_CNT);
    __sqoop$field_map.put("CM_PAID_USER_CNT", this.CM_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_CM_USER_CNT", this.NEW_CM_USER_CNT);
    __sqoop$field_map.put("LOSE_CM_USER_CNT", this.LOSE_CM_USER_CNT);
    __sqoop$field_map.put("HDTV_VALID_USER_CNT", this.HDTV_VALID_USER_CNT);
    __sqoop$field_map.put("HDTV_PAID_USER_CNT", this.HDTV_PAID_USER_CNT);
    __sqoop$field_map.put("NEW_HDTV_USER_CNT", this.NEW_HDTV_USER_CNT);
    __sqoop$field_map.put("LOSE_HDTV_USER_CNT", this.LOSE_HDTV_USER_CNT);
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
      this.CUST_TYPE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUST_TYPE_NAME".equals(__fieldName)) {
      this.CUST_TYPE_NAME = (String) __fieldVal;
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
    else    if ("DTV_VALID_USER_CNT".equals(__fieldName)) {
      this.DTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DTV_PAID_USER_CNT".equals(__fieldName)) {
      this.DTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_DTV_USER_CNT".equals(__fieldName)) {
      this.NEW_DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_DTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LAN_VALID_USER_CNT".equals(__fieldName)) {
      this.LAN_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LAN_PAID_USER_CNT".equals(__fieldName)) {
      this.LAN_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_LAN_USER_CNT".equals(__fieldName)) {
      this.NEW_LAN_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_LAN_USER_CNT".equals(__fieldName)) {
      this.LOSE_LAN_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DFTV_VALID_USER_CNT".equals(__fieldName)) {
      this.DFTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DFTV_PAID_USER_CNT".equals(__fieldName)) {
      this.DFTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_DFTV_USER_CNT".equals(__fieldName)) {
      this.NEW_DFTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_DFTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DFTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DBITV_VALID_USER_CNT".equals(__fieldName)) {
      this.DBITV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DBITV_PAID_USER_CNT".equals(__fieldName)) {
      this.DBITV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_DBITV_USER_CNT".equals(__fieldName)) {
      this.NEW_DBITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_DBITV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DBITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DITV_VALID_USER_CNT".equals(__fieldName)) {
      this.DITV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DITV_PAID_USER_CNT".equals(__fieldName)) {
      this.DITV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_DITV_USER_CNT".equals(__fieldName)) {
      this.NEW_DITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_DITV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AMSP_VALID_USER_CNT".equals(__fieldName)) {
      this.AMSP_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AMSP_PAID_USER_CNT".equals(__fieldName)) {
      this.AMSP_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_AMSP_USER_CNT".equals(__fieldName)) {
      this.NEW_AMSP_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_AMSP_USER_CNT".equals(__fieldName)) {
      this.LOSE_AMSP_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CM_VALID_USER_CNT".equals(__fieldName)) {
      this.CM_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CM_PAID_USER_CNT".equals(__fieldName)) {
      this.CM_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_CM_USER_CNT".equals(__fieldName)) {
      this.NEW_CM_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_CM_USER_CNT".equals(__fieldName)) {
      this.LOSE_CM_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HDTV_VALID_USER_CNT".equals(__fieldName)) {
      this.HDTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("HDTV_PAID_USER_CNT".equals(__fieldName)) {
      this.HDTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NEW_HDTV_USER_CNT".equals(__fieldName)) {
      this.NEW_HDTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("LOSE_HDTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_HDTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
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
      this.CUST_TYPE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CUST_TYPE_NAME".equals(__fieldName)) {
      this.CUST_TYPE_NAME = (String) __fieldVal;
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
    else    if ("DTV_VALID_USER_CNT".equals(__fieldName)) {
      this.DTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DTV_PAID_USER_CNT".equals(__fieldName)) {
      this.DTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_DTV_USER_CNT".equals(__fieldName)) {
      this.NEW_DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_DTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LAN_VALID_USER_CNT".equals(__fieldName)) {
      this.LAN_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LAN_PAID_USER_CNT".equals(__fieldName)) {
      this.LAN_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_LAN_USER_CNT".equals(__fieldName)) {
      this.NEW_LAN_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_LAN_USER_CNT".equals(__fieldName)) {
      this.LOSE_LAN_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DFTV_VALID_USER_CNT".equals(__fieldName)) {
      this.DFTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DFTV_PAID_USER_CNT".equals(__fieldName)) {
      this.DFTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_DFTV_USER_CNT".equals(__fieldName)) {
      this.NEW_DFTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_DFTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DFTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DBITV_VALID_USER_CNT".equals(__fieldName)) {
      this.DBITV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DBITV_PAID_USER_CNT".equals(__fieldName)) {
      this.DBITV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_DBITV_USER_CNT".equals(__fieldName)) {
      this.NEW_DBITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_DBITV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DBITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DITV_VALID_USER_CNT".equals(__fieldName)) {
      this.DITV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DITV_PAID_USER_CNT".equals(__fieldName)) {
      this.DITV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_DITV_USER_CNT".equals(__fieldName)) {
      this.NEW_DITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_DITV_USER_CNT".equals(__fieldName)) {
      this.LOSE_DITV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AMSP_VALID_USER_CNT".equals(__fieldName)) {
      this.AMSP_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("AMSP_PAID_USER_CNT".equals(__fieldName)) {
      this.AMSP_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_AMSP_USER_CNT".equals(__fieldName)) {
      this.NEW_AMSP_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_AMSP_USER_CNT".equals(__fieldName)) {
      this.LOSE_AMSP_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CM_VALID_USER_CNT".equals(__fieldName)) {
      this.CM_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CM_PAID_USER_CNT".equals(__fieldName)) {
      this.CM_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_CM_USER_CNT".equals(__fieldName)) {
      this.NEW_CM_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_CM_USER_CNT".equals(__fieldName)) {
      this.LOSE_CM_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HDTV_VALID_USER_CNT".equals(__fieldName)) {
      this.HDTV_VALID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("HDTV_PAID_USER_CNT".equals(__fieldName)) {
      this.HDTV_PAID_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("NEW_HDTV_USER_CNT".equals(__fieldName)) {
      this.NEW_HDTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("LOSE_HDTV_USER_CNT".equals(__fieldName)) {
      this.LOSE_HDTV_USER_CNT = (java.math.BigDecimal) __fieldVal;
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
