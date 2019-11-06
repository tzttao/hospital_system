package com.model;

import java.io.Serializable;
import java.util.Date;

public class CaseHistory implements Serializable {
    private Integer caseHistoryId;

    private Integer pId;

    private Integer dId;

    private Integer sId;

    private String caseHistoryDescribe;

    private Integer rId;

    private Date caseHistoryDate;

    private Integer caseHistoryInstatus;

    private Integer inrcdId;

    private String caseHistoryDhistory;

    private static final long serialVersionUID = 1L;

    public Integer getCaseHistoryId() {
        return caseHistoryId;
    }

    public void setCaseHistoryId(Integer caseHistoryId) {
        this.caseHistoryId = caseHistoryId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getCaseHistoryDescribe() {
        return caseHistoryDescribe;
    }

    public void setCaseHistoryDescribe(String caseHistoryDescribe) {
        this.caseHistoryDescribe = caseHistoryDescribe;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Date getCaseHistoryDate() {
        return caseHistoryDate;
    }

    public void setCaseHistoryDate(Date caseHistoryDate) {
        this.caseHistoryDate = caseHistoryDate;
    }

    public Integer getCaseHistoryInstatus() {
        return caseHistoryInstatus;
    }

    public void setCaseHistoryInstatus(Integer caseHistoryInstatus) {
        this.caseHistoryInstatus = caseHistoryInstatus;
    }

    public Integer getInrcdId() {
        return inrcdId;
    }

    public void setInrcdId(Integer inrcdId) {
        this.inrcdId = inrcdId;
    }

    public String getCaseHistoryDhistory() {
        return caseHistoryDhistory;
    }

    public void setCaseHistoryDhistory(String caseHistoryDhistory) {
        this.caseHistoryDhistory = caseHistoryDhistory;
    }
}