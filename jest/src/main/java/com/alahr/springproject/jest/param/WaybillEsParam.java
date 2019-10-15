package com.alahr.springproject.jest.param;

import java.io.Serializable;

public class WaybillEsParam implements Serializable {
    private final static long serialVersionUID = 1L;
    /**
     * 当前页
     */
    private Integer currentPage = 0;

    /**
     * 分页大小
     */
    private Integer pageSize = 10;

    private String waybillNo;

    private String pickupScanTimeStart;

    private String pickupScanTimeEnd;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getPickupScanTimeStart() {
        return pickupScanTimeStart;
    }

    public void setPickupScanTimeStart(String pickupScanTimeStart) {
        this.pickupScanTimeStart = pickupScanTimeStart;
    }

    public String getPickupScanTimeEnd() {
        return pickupScanTimeEnd;
    }

    public void setPickupScanTimeEnd(String pickupScanTimeEnd) {
        this.pickupScanTimeEnd = pickupScanTimeEnd;
    }
}
