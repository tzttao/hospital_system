package com.model;
/**
 * 住院
 */

import java.io.Serializable;
import java.util.Date;

public class InpatientRecord implements Serializable {
    private Integer inrecordId;

    private Integer pId;

    private Date inrecordInDate;

    private Integer dId;

    private Integer inwdId;

    private Integer sId;

    private Integer inemId;

    private Integer rId;

    private Date inrecordOutDate;

    private Double inrecordAmount;//住院消费
    private static final long serialVersionUID = 1L;

    public Double getInrecordAmount() {
        return inrecordAmount;
    }

    public void setInrecordAmount(Double inrecordAmount) {
        this.inrecordAmount = inrecordAmount;
    }

    public Integer getInrecordId() {
        return inrecordId;
    }

    public void setInrecordId(Integer inrecordId) {
        this.inrecordId = inrecordId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Date getInrecordInDate() {
        return inrecordInDate;
    }

    public void setInrecordInDate(Date inrecordInDate) {
        this.inrecordInDate = inrecordInDate;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getInwdId() {
        return inwdId;
    }

    public void setInwdId(Integer inwdId) {
        this.inwdId = inwdId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getInemId() {
        return inemId;
    }

    public void setInemId(Integer inemId) {
        this.inemId = inemId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Date getInrecordOutDate() {
        return inrecordOutDate;
    }

    public void setInrecordOutDate(Date inrecordOutDate) {
        this.inrecordOutDate = inrecordOutDate;
    }
}