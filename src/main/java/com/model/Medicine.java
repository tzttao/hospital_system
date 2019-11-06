package com.model;

import java.io.Serializable;

public class Medicine implements Serializable {
    private Integer medicineId;

    private String medicineName;

    private String medicineManufacturer;

    private Double medicinePrice;

    private Integer medicineAmount;

    private static final long serialVersionUID = 1L;

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineManufacturer() {
        return medicineManufacturer;
    }

    public void setMedicineManufacturer(String medicineManufacturer) {
        this.medicineManufacturer = medicineManufacturer;
    }

    public Double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public Integer getMedicineAmount() {
        return medicineAmount;
    }

    public void setMedicineAmount(Integer medicineAmount) {
        this.medicineAmount = medicineAmount;
    }
}