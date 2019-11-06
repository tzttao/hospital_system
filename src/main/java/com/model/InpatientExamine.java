package com.model;
/**
 * 住院检查
 */

import java.io.Serializable;

public class InpatientExamine implements Serializable {
    private Integer examineId;

    private String examineItem;

    private Double examinePrice;//检查费用

    private static final long serialVersionUID = 1L;

    public Double getExaminePrice() {
        return examinePrice;
    }

    public void setExaminePrice(Double examinePrice) {
        this.examinePrice = examinePrice;
    }

    public Integer getExamineId() {
        return examineId;
    }

    public void setExamineId(Integer examineId) {
        this.examineId = examineId;
    }

    public String getExamineItem() {
        return examineItem;
    }

    public void setExamineItem(String examineItem) {
        this.examineItem = examineItem;
    }
}