package com.dao.medicine;

import com.model.Medicine;

import java.util.List;

public interface MedicineMapper {
    int deleteByPrimaryKey(Integer medicineId);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineId);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
    //获取所有药品
    List<Medicine> findAllMedicine();
}