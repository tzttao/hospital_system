package com.dao.outpatient;
/**
 * 医院账单
 */
import com.model.billHospital;

public interface BillHospitalMapper {
    int deleteByPrimaryKey(Integer billHospitalId);

    int insert(billHospital record);

    int insertSelective(billHospital record);

    billHospital selectByPrimaryKey(Integer billHospitalId);

    int updateByPrimaryKeySelective(billHospital record);

    int updateByPrimaryKey(billHospital record);
    //获取医院营业额

}