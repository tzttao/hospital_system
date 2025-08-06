package com.model;

import java.io.Serializable;

public class BillCost implements Serializable {
    private Integer billCostId;//消费清单id

    private Integer rId;//处方id

    private Integer inrcdId;//住院病历id

    private Integer rgstrId;//挂号单id

    private Integer onrgstrId;//预约挂号id

    private Double bcAmount;//花费总计

    private static final long serialVersionUID = 1L;


    public Double getBcAmount() {
        return bcAmount;
    }

    public void setBcAmount(Double bcAmount) {
        this.bcAmount = bcAmount;
    }
    public Integer getOnrgstrId() {
        return onrgstrId;
    }

    public void setOnrgstrId(Integer onrgstrId) {
        this.onrgstrId = onrgstrId;
    }

    public Integer getBillCostId() {
        return billCostId;
    }

    public void setBillCostId(Integer billCostId) {
        this.billCostId = billCostId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getInrcdId() {
        return inrcdId;
    }

    public void setInrcdId(Integer inrcdId) {
        this.inrcdId = inrcdId;
    }

    public Integer getRgstrId() {
        return rgstrId;
    }

    public void setRgstrId(Integer rgstrId) {
        this.rgstrId = rgstrId;
    }
}