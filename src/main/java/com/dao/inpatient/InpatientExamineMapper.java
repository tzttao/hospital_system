package com.dao.inpatient;

import com.model.InpatientExamine;

import java.util.List;

public interface InpatientExamineMapper {

    //添加检查项目
    int addInpatientExamine(InpatientExamine inpatientExamine);

    //查询检查项目
    List<InpatientExamine> selectInpatientExamine();

    //修改检查项目
    int updateInpatientExamine(InpatientExamine inpatientExamine);

    //删除检查项目
    void deleteInpatientExamine(int examineId);
}