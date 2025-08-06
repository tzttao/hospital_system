package com.test;

import com.dao.outpatient.BillCostMapper;
import com.model.BillCost;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class BillCostTest {
    private static final Logger log =Logger.getLogger(BillCostTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BillCostMapper billCostMapper= context.getBean(BillCostMapper.class);
    BillCost billCost=new BillCost();
    @Test
    public void saveBillCost(){
        billCost.setrId(100004);
//        billCost.setInrcdId(1);
//        billCost.setRgstrId(1);
//        billCost.setOnrgstrId(1);
        billCost.setBcAmount(100.00);
        billCostMapper.saveBillCost(billCost);
    }
    @Test
    public void selectBillCostById(){
        billCost= billCostMapper.selectBillCostById(1);
        System.out.println("结果"+billCost.getBcAmount());
//        billCost.setBillCostId(10);
//        billCostMapper.updateBillCostByID(billCost);
    }
    @Test
    public void updateBillCostByID(){
        billCost.setBillCostId(10);
        billCost.setBcAmount(50.0);
        billCostMapper.updateBillCostByID(billCost);
    }
    @Test
    public void deleteBillCostByID(){
        billCostMapper.deleteBillCostByID(12);
    }
}
