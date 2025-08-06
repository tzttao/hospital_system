package com.model;
/**
 * 预约表
 */

import java.io.Serializable;
import java.util.Date;

public class RegisterOnline implements Serializable {
    private Integer onlineId;

    private Integer pId;

    private Integer dId;

    private Date onlineOrdertime;

    private Integer sId;

    private Double onlineFee;//预约费用

    private Date onlineTime;

    private static final long serialVersionUID = 1L;

    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(Integer onlineId) {
        this.onlineId = onlineId;
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

    public Date getOnlineOrdertime() {
        return onlineOrdertime;
    }

    public void setOnlineOrdertime(Date onlineOrdertime) {
        this.onlineOrdertime = onlineOrdertime;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Double getOnlineFee() {
        return onlineFee;
    }

    public void setOnlineFee(Double onlineFee) {
        this.onlineFee = onlineFee;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }
}