package com.test;

import com.dao.medicine.MedicineMapper;
import com.model.Medicine;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.logging.Logger;

public class MedicineTest {
//    private static final Logger log =Logger.getLogger(MedicineTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    MedicineMapper medicineMapper= context.getBean(MedicineMapper.class);
    @Test
    public void findAllMedicine(){
        List<Medicine> medicines=medicineMapper.findAllMedicine();
        for (Medicine medicine:medicines){
            System.out.println(medicine.getMedicineId()+" "+medicine.getMedicineName()+" "+medicine.getMedicineManufacturer()+" "+medicine.getMedicinePrice()+" "+medicine.getMedicineAmount());
        }
    }
}
