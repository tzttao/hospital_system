package com.dao.outpatient;
/**
 * 消费账单
 */

import com.model.BillCost;

import java.util.List;

public interface BillCostMapper {
    int deleteByPrimaryKey(Integer billCostId);

    int insert(BillCost record);

    int insertSelective(BillCost record);

    BillCost selectByPrimaryKey(Integer billCostId);

    int updateByPrimaryKeySelective(BillCost record);

    int updateByPrimaryKey(BillCost record);
//    添加数据
    void saveBillCost(BillCost billCost);
    //通过id查询数据
    BillCost selectBillCostById(Integer id);
    //通过id更新数据
    void updateBillCostByID(BillCost billCost);
    //通过id删除数据
    void deleteBillCostByID(Integer id);

}