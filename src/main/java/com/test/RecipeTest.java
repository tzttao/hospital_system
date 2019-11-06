package com.test;


import com.dao.outpatient.RecipeMapper;
import com.model.Medicine;
import com.model.Recipe;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;


public class RecipeTest {
    private static final Logger log =Logger.getLogger(RecipeTest.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    RecipeMapper recipeMapper= context.getBean(RecipeMapper.class);
    Recipe recipe=new Recipe();
    @Test
    public void findAllMedicine(){
        List<Medicine> medicines=recipeMapper.findAllMedicine();
        for (Medicine medicine:medicines){
            log.info(medicine.getMedicineId()+" "+medicine.getMedicineName()+" "+medicine.getMedicineManufacturer()+" "+medicine.getMedicinePrice()+" "+medicine.getMedicineAmount());
        }
    }
    @Test
    public void findMedicineById(){
        Medicine medicine=new Medicine();
        medicine=recipeMapper.findMedicineById(1);
        System.out.println(medicine.getMedicineAmount());
        System.out.println(medicine.getMedicinePrice());
    }
    @Test
    public void deleteByPrimaryKey(){

        recipeMapper.deleteByPrimaryKey(100002);
    }
    @Test
    public void saveRecipe(){
        recipe.setpId(1);
        recipe.setdId(1);
        recipe.setRecipeDate(new Date());
        recipe.setRecipeDescription("要死了");
        recipe.setmId(1);
        recipe.setRecipeMusage("每天一次");
        String recipeMamount="8";
        recipe.setRecipeMamount(recipeMamount);
        Medicine medicine=new Medicine();
        medicine=recipeMapper.findMedicineById(1);
        Double medicinePrice=medicine.getMedicinePrice();
        int intRecipeMamount=Integer.parseInt(recipeMamount);
        Double recipeMfee=(Double)(intRecipeMamount*medicinePrice);
        recipe.setRecipeMfee(recipeMfee);
        Double recipeEfee=60.0;
        recipe.setRecipeEfee(recipeEfee);
        recipe.setRecipeSumfee((recipeMfee+recipeEfee));
        recipeMapper.saveRecipe(recipe);
    }
    @Test
    public void updateRecipe(){
        recipe.setRecipeDate(new Date());
        recipe.setRecipeDescription("要活了");
        recipe.setRecipeId(100002);
        recipeMapper.updateRecipe(recipe);
    }
    @Test
    public void findMedicineByName(){
        List<Medicine> medicines= recipeMapper.findMedicineByName("%王%");
        for (Medicine medicine:medicines){
            System.out.println(medicine.getMedicineName());
        }
    }
}
