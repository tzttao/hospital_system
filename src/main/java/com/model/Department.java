package com.model;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer departmentId;

    private String departmentName;

    private Integer departmentPopulation;

    private Integer departmentStatus;

    private static final long serialVersionUID = 1L;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentPopulation() {
        return departmentPopulation;
    }

    public void setDepartmentPopulation(Integer departmentPopulation) {
        this.departmentPopulation = departmentPopulation;
    }

    public Integer getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(Integer departmentStatus) {
        this.departmentStatus = departmentStatus;
    }
}