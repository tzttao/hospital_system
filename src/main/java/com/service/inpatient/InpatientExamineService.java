package com.service.inpatient;

import com.model.InpatientExamine;

import java.util.List;

public interface InpatientExamineService {

    List<InpatientExamine> selectExamine();

    //添加检查项目
    int addExamine(InpatientExamine inpatientExamine);

    //修改检查项目
    int updateExamine(InpatientExamine inpatientExamine);

    //删除检查项目
    void deleteExamine(int examineId);
}
