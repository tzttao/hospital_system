package com.test;

import com.dao.inpatient.InpatientExamineMapper;
import com.dao.inpatient.InpatientRecordMapper;
import com.model.InpatientExamine;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ExamineTest {
    private static final Logger log =Logger.getLogger(RecordTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    InpatientExamineMapper iem= context.getBean(InpatientExamineMapper.class);
    InpatientExamine ie=new InpatientExamine();
    @Test
    public void add(){
        ie.setExamineItem("X光");
        ie.setExaminePrice(500.00);
        iem.addInpatientExamine(ie);
        select();
    }

    @Test
    public void select(){
        List<InpatientExamine> examines =iem.selectInpatientExamine();
        for (InpatientExamine examine : examines) {
            log.info(examine.getExamineId()+" "+examine.getExamineItem()+" "+examine.getExaminePrice());
        }
    }

    @Test
    public void update(){
        ie.setExamineItem("外科手术");
        ie.setExamineId(2);
        ie.setExaminePrice(14000.00);
        iem.updateInpatientExamine(ie);
        select();
    }

    @Test
    public void delete(){
        iem.deleteInpatientExamine(5);
        select();
    }
}
