package com.jluzh.sysmanagement.domain.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@ToString
public class WinvStockLog implements Serializable {
    /**
     * 表ID，主键，供其他表做外键
     */

    private Long id;

    /**
     * 单据id
     */

    private Long billId;

    /**
     * 单据行id
     */

    private Long billLineId;

    /**
     * 单据编号
     */

    private String billCode;

    /**
     * 单据类型id
     */

    private Long billTypeId;

    /**
     * 单据类型
     */

    private String billType;

    /**
     * 来源单据id
     */

    private Long sourceBillId;

    /**
     * 来源单据编号
     */

    private String sourceBillCode;

    /**
     * 同步单据编号
     */

    private String syncBillCode;

    /**
     * 库存组织id
     */
    private Long orgId;

    /**
     * 库存组织code
     */
    private String orgCode;

    /**
     * 仓库id
     */
    private Long warehouseId;

    /**
     * 仓库code
     */
    private String warehouseCode;

    /**
     * 货主id
     */
    private Long ownerId;

    /**
     * 货主code
     */
    private String ownerCode;

    /**
     * 库区id
     */
    private Long whareaId;

    /**
     * 库区编码
     */
    private String whareaCode;

    /**
     * 库位id
     */
    private Long locationId;

    /**
     * 库位编码
     */
    private String locationCode;

    /**
     * 托盘id
     */
    private Long cidId;

    /**
     * 托盘编码
     */
    private String cidCode;

    /**
     * 物料id
     */
    private Long goodsId;

    /**
     * 品名
     */
    private String sku;

    /**
     * 批次id
     */
    private Long batchId;

    /**
     * 批次编码
     */
    private String batchCode;

    /**
     * 单位id
     */
    private Long uomId;

    /**
     * 单位code
     */
    private String uomCode;

    /**
     * 数量
     */
    private BigDecimal qty;

    /**
     * 辅助单位id（非主单位处理必输）
     */
    private Long secondUomId;

    /**
     * 辅助单位code
     */
    private String secondUomCode;

    /**
     * 辅助数量
     */
    private BigDecimal secondQty;

    /**
     * 单据来源模块
     */
    private String moduleCode;

    /**
     * 来源功能
     */
    private String functionCode;

    /**
     * 事务处理类型
     */
    private String logType;

    /**
     * 事务处理时间
     */
    private Date logDate;

    /**
     * 来源设备
     */
    private String deviceCode;

    /**
     * 回传标识
     */
    private Boolean uploadFlag;

    /**
     * 启用标识
     */
    private Boolean enabledFlag;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 租户ID,hpfm_tenant.tenant_id
     */
    private Long tenantId;

    /**
     * 行版本号，用来处理锁
     */
    private Long objectVersionNumber;

    private Date creationDate;

    private Long createdBy;

    private Long lastUpdatedBy;

    private Date lastUpdateDate;

    private String attributeCategory;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;

    private static final long serialVersionUID = 1L;

    public static final String COL_BILL_ID = "bill_id";

    public static final String COL_BILL_LINE_ID = "bill_line_id";

    public static final String COL_BILL_CODE = "bill_code";

    public static final String COL_BILL_TYPE_ID = "bill_type_id";

    public static final String COL_BILL_TYPE = "bill_type";

    public static final String COL_SOURCE_BILL_ID = "source_bill_id";

    public static final String COL_SOURCE_BILL_CODE = "source_bill_code";

    public static final String COL_SYNC_BILL_CODE = "sync_bill_code";

    public static final String COL_ORG_ID = "org_id";

    public static final String COL_ORG_CODE = "org_code";

    public static final String COL_WAREHOUSE_ID = "warehouse_id";

    public static final String COL_WAREHOUSE_CODE = "warehouse_code";

    public static final String COL_OWNER_ID = "owner_id";

    public static final String COL_OWNER_CODE = "owner_code";

    public static final String COL_WHAREA_ID = "wharea_id";

    public static final String COL_WHAREA_CODE = "wharea_code";

    public static final String COL_LOCATION_ID = "location_id";

    public static final String COL_LOCATION_CODE = "location_code";

    public static final String COL_CID_ID = "cid_id";

    public static final String COL_CID_CODE = "cid_code";

    public static final String COL_GOODS_ID = "goods_id";

    public static final String COL_SKU = "sku";

    public static final String COL_BATCH_ID = "batch_id";

    public static final String COL_BATCH_CODE = "batch_code";

    public static final String COL_UOM_ID = "uom_id";

    public static final String COL_UOM_CODE = "uom_code";

    public static final String COL_QTY = "qty";

    public static final String COL_SECOND_UOM_ID = "second_uom_id";

    public static final String COL_SECOND_UOM_CODE = "second_uom_code";

    public static final String COL_SECOND_QTY = "second_qty";

    public static final String COL_MODULE_CODE = "module_code";

    public static final String COL_FUNCTION_CODE = "function_code";

    public static final String COL_LOG_TYPE = "log_type";

    public static final String COL_LOG_DATE = "log_date";

    public static final String COL_DEVICE_CODE = "device_code";

    public static final String COL_UPLOAD_FLAG = "upload_flag";

    public static final String COL_ENABLED_FLAG = "enabled_flag";

    public static final String COL_REMARK = "remark";

    public static final String COL_TENANT_ID = "tenant_id";

    public static final String COL_OBJECT_VERSION_NUMBER = "object_version_number";

    public static final String COL_CREATION_DATE = "creation_date";

    public static final String COL_CREATED_BY = "created_by";

    public static final String COL_LAST_UPDATED_BY = "last_updated_by";

    public static final String COL_LAST_UPDATE_DATE = "last_update_date";

    public static final String COL_ATTRIBUTE_CATEGORY = "ATTRIBUTE_CATEGORY";

    public static final String COL_ATTRIBUTE1 = "ATTRIBUTE1";

    public static final String COL_ATTRIBUTE2 = "ATTRIBUTE2";

    public static final String COL_ATTRIBUTE3 = "ATTRIBUTE3";

    public static final String COL_ATTRIBUTE4 = "ATTRIBUTE4";

    public static final String COL_ATTRIBUTE5 = "ATTRIBUTE5";

    public static final String COL_ATTRIBUTE6 = "ATTRIBUTE6";

    public static final String COL_ATTRIBUTE7 = "ATTRIBUTE7";

    public static final String COL_ATTRIBUTE8 = "ATTRIBUTE8";

    public static final String COL_ATTRIBUTE9 = "ATTRIBUTE9";

    public static final String COL_ATTRIBUTE10 = "ATTRIBUTE10";

    public static final String COL_ATTRIBUTE11 = "ATTRIBUTE11";

    public static final String COL_ATTRIBUTE12 = "ATTRIBUTE12";

    public static final String COL_ATTRIBUTE13 = "ATTRIBUTE13";

    public static final String COL_ATTRIBUTE14 = "ATTRIBUTE14";

    public static final String COL_ATTRIBUTE15 = "ATTRIBUTE15";
}