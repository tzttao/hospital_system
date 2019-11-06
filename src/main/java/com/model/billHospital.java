package com.model;

import java.io.Serializable;

public class billHospital implements Serializable {
    private Integer billHospitalId;//帐单id

    private Integer bcId;//消费清单id进账

    private Integer mpId;//药品采购单id

    private Integer purchaseAmount;//营业额

    private static final long serialVersionUID = 1L;

    public Integer getBillHospitalId() {
        return billHospitalId;
    }

    public void setBillHospitalId(Integer billHospitalId) {
        this.billHospitalId = billHospitalId;
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }

    public Integer getPurchaseAmount() { return purchaseAmount; }

    public void setPurchaseAmount(Integer purchaseAmount) { this.purchaseAmount = purchaseAmount; }
}