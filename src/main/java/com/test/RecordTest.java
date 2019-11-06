package com.test;


import com.dao.inpatient.InpatientRecordMapper;
import com.model.InpatientRecord;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;


public class RecordTest {
    private static final Logger log =Logger.getLogger(RecordTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    InpatientRecordMapper irm= context.getBean(InpatientRecordMapper.class);
    @Test
    public void add(){

        InpatientRecord ir=new InpatientRecord();
            ir.setpId(1);
            ir.setInrecordInDate(new Date());
            ir.setdId(1);
            ir.setInwdId(401);
            ir.setsId(10001);
            ir.setInemId(1);
            ir.setrId(100001);
            ir.setInrecordOutDate(new Date());
            irm.addInpatientRecord(ir);
            select();
    }
    @org.junit.Test
    public void select(){
        List<InpatientRecord> records=irm.selectInpatientRecord();
        for (InpatientRecord record : records) {
            log.info("inrecordId"+record.getInrecordId()+"did:"+record.getdId());
        }
    }

    @Test
    public void selectById(){
        InpatientRecord ir=irm.selectInpatientRecordByRecordId(1);
        System.out.println(ir);
    }
    @org.junit.Test
    public void update(){
        InpatientRecord ir=new InpatientRecord();
        ir.setdId(2);
        ir.setInrecordId(2);
        ir.setInrecordInDate(new Date());
        irm.updateInpatientRecord(ir);
    }

    @org.junit.Test
    public void delete(){
        irm.deleteInpatientRecord(1);
        select();
    }
}