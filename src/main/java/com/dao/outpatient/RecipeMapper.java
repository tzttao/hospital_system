package com.dao.outpatient;
/**
 * 电子处方
 */

import com.model.Medicine;
import com.model.Recipe;

import java.util.List;

public interface RecipeMapper {
    //删除病例
    int deleteByPrimaryKey(Integer recipeId);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    Recipe selectByPrimaryKey(Integer recipeId);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);

    //获取所有药品
    List<Medicine> findAllMedicine();
    //根据药品id查询
    Medicine findMedicineById(Integer id);
    //添加病例
    void saveRecipe(Recipe recipe);
    //更新病例
    void updateRecipe(Recipe recipe);
    //根据名称模糊查询药品
    List<Medicine> findMedicineByName(String medicineName);
    //根据id获取日期
    Recipe selRecipeDateById(Integer id);



}