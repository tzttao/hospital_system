package com.dao.inpatient;

import com.model.InpatientRecord;

import java.util.List;

public interface InpatientRecordMapper {

    //添加住院病历
    int addInpatientRecord(InpatientRecord inpatientRecord);

    //查询住院病历
    List<InpatientRecord> selectInpatientRecord();

    //通过病人id查询住院病历
    InpatientRecord selectInpatientRecordByRecordId(int pId);

    //修改住院病历
    int updateInpatientRecord(InpatientRecord inpatientRecord);

    //删除住院病历
    void deleteInpatientRecord(int pId);

}