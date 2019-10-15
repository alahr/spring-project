package com.alahr.springproject.jest.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName WaybillDTO
 * @Description 运单入参类
 * @Author suguoming
 * @String 2019-05-22 17:32
 */
public class WaybillEsDO implements Serializable {
    private static final long serialVersionUID = 22L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 运单流水号（运单号+流水号）
     */
    private String waybillSerialNo;
    /**
     * 运单号
     */
    private String waybillNo;
    /**
     * 流水号
     */
    private String serialNo;
    /**
     * 母件运单号
     */
    private String masterWaybillNo;
    /**
     * 运单状态
     */
    private String waybillStatus;

    private String pickupScanTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWaybillSerialNo() {
        return waybillSerialNo;
    }

    public void setWaybillSerialNo(String waybillSerialNo) {
        this.waybillSerialNo = waybillSerialNo;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMasterWaybillNo() {
        return masterWaybillNo;
    }

    public void setMasterWaybillNo(String masterWaybillNo) {
        this.masterWaybillNo = masterWaybillNo;
    }

    public String getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(String waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public String getPickupScanTime() {
        return pickupScanTime;
    }

    public void setPickupScanTime(String pickupScanTime) {
        this.pickupScanTime = pickupScanTime;
    }
}