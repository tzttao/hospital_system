package com.model;
/**
 * 挂号
 */

import java.io.Serializable;
import java.util.Date;

public class Register implements Serializable {
    private Integer registerId;

    private Integer pId;

    private Integer dId;

    private Integer doctorId;

    private Integer registrarId;

    private Double registerFee;//挂号费用

    private Date registerTime;

    private static final long serialVersionUID = 1L;

    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getRegistrarId() {
        return registrarId;
    }

    public void setRegistrarId(Integer registrarId) {
        this.registrarId = registrarId;
    }

    public Double getRegisterFee() {
        return registerFee;
    }

    public void setRegisterFee(Double registerFee) {
        this.registerFee = registerFee;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}