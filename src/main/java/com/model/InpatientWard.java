package com.model;

import java.io.Serializable;

public class InpatientWard implements Serializable {
    private Integer inwardId;

    private Integer dId;

    private Integer inwardAmount;

    private Integer inwardSurplusAmount;

    private Double inwardPrice;

    private static final long serialVersionUID = 1L;

    public Double getInwardPrice() {
        return inwardPrice;
    }

    public void setInwardPrice(Double inwardPrice) {
        this.inwardPrice = inwardPrice;
    }

    public Integer getInwardId() {
        return inwardId;
    }

    public void setInwardId(Integer inwardId) {
        this.inwardId = inwardId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getInwardAmount() {
        return inwardAmount;
    }

    public void setInwardAmount(Integer inwardAmount) {
        this.inwardAmount = inwardAmount;
    }

    public Integer getInwardSurplusAmount() {
        return inwardSurplusAmount;
    }

    public void setInwardSurplusAmount(Integer inwardSurplusAmount) {
        this.inwardSurplusAmount = inwardSurplusAmount;
    }
}