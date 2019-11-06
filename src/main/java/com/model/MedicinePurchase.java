package com.model;
/**
 * 购药
 */

import java.io.Serializable;
import java.util.Date;

public class MedicinePurchase implements Serializable {
    private Integer purchaseId;

    private Integer mId;

    private Date purchaseDate;

    private Double purchaseInPrice;//买药花费


    private static final long serialVersionUID = 1L;

    public Date getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Double getPurchaseInPrice() {
        return purchaseInPrice;
    }

    public void setPurchaseInPrice(Double purchaseInPrice) {
        this.purchaseInPrice = purchaseInPrice;
    }

}