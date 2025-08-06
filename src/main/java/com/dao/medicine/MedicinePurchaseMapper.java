package com.dao.medicine;

import com.model.MedicinePurchase;

public interface MedicinePurchaseMapper {
    int deleteByPrimaryKey(Integer purchaseId);

    int insert(MedicinePurchase record);

    int insertSelective(MedicinePurchase record);

    MedicinePurchase selectByPrimaryKey(Integer purchaseId);

    int updateByPrimaryKeySelective(MedicinePurchase record);

    int updateByPrimaryKey(MedicinePurchase record);
}