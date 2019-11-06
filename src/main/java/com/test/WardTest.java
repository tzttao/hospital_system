package com.test;

import com.dao.inpatient.InpatientWardMapper;
import com.model.InpatientWard;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class WardTest {

    private static final Logger log = Logger.getLogger(RecordTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    InpatientWardMapper iwm = context.getBean(InpatientWardMapper.class);
    InpatientWard iw = new InpatientWard();

    @Test
    public void select() {
        List<InpatientWard> inpatientWards = iwm.selectInpatientWard();
        for (InpatientWard inpatientWard : inpatientWards) {
            log.info(inpatientWard.getInwardId() + " " + inpatientWard.getInwardSurplusAmount());
        }
    }

    @Test
    public void selectBysurplus(){
        List<InpatientWard> inpatientWards = iwm.selectInpatientWardBySurplus();
        for (InpatientWard inpatientWard : inpatientWards) {
            log.info(inpatientWard.getInwardId() + " " + inpatientWard.getInwardSurplusAmount());
        }
    }
    @Test
    public void add() {
        iw.setdId(2);
        iw.setInwardAmount(5);
        iw.setInwardSurplusAmount(5);
        iw.setInwardPrice(200.00);
        iwm.addInpatientWard(iw);
        select();
    }

    @Test
    public void update(){
        iw.setInwardId(401);
        iw.setdId(3);
        iw.setInwardSurplusAmount(0);
        iwm.updateInpatientWard(iw);
        select();
    }

    @Test
    public void delete(){
        iwm.deleteInpatientWard(402);
        select();
    }
}
