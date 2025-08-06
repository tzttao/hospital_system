package com.model;

import java.io.Serializable;
import java.util.Date;

public class Recipe implements Serializable {
    private Integer recipeId;//处方id

    private Integer pId;//病人id

    private Integer dId;//部门id


    private Date recipeDate;//诊断日期

    private String recipeDescription;//诊断说明

    private Integer mId;//药品id

    private String recipeMusage;//药品用法

    private String recipeMamount;//取药数量

    private Double recipeMfee;//药费

    private Double recipeEfee;//其他费用

    private Double recipeSumfee;//合计

    private Integer doctorId;//医生id

    private Integer dispenserId;//配药员id

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getDispenserId() {
        return dispenserId;
    }

    public void setDispenserId(Integer dispenserId) {
        this.dispenserId = dispenserId;
    }

    private static final long serialVersionUID = 1L;

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getpId() { return pId; }

    public void setpId(Integer pId) { this.pId = pId; }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Date getRecipeDate() {
        return recipeDate;
    }

    public void setRecipeDate(Date recipeDate) {
        this.recipeDate = recipeDate;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getRecipeMusage() {
        return recipeMusage;
    }

    public void setRecipeMusage(String recipeMusage) {
        this.recipeMusage = recipeMusage;
    }

    public String getRecipeMamount() {
        return recipeMamount;
    }

    public void setRecipeMamount(String recipeMamount) {
        this.recipeMamount = recipeMamount;
    }

    public Double getRecipeMfee() {
        return recipeMfee;
    }

    public void setRecipeMfee(Double recipeMfee) {
        this.recipeMfee = recipeMfee;
    }

    public Double getRecipeEfee() {
        return recipeEfee;
    }

    public void setRecipeEfee(Double recipeEfee) {
        this.recipeEfee = recipeEfee;
    }

    public Double getRecipeSumfee() {
        return recipeSumfee;
    }

    public void setRecipeSumfee(Double recipeSumfee) {
        this.recipeSumfee = recipeSumfee;
    }
}