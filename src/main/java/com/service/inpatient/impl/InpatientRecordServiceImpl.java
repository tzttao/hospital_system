package com.service.inpatient.impl;

import com.dao.inpatient.InpatientRecordMapper;
import com.model.InpatientRecord;
import com.service.inpatient.InpatientRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InpatientRecordServiceImpl implements InpatientRecordService {
   @Autowired
    InpatientRecordMapper recordMapper;
   @Override
    public int addInpatientRecord(InpatientRecord inpatientRecord) {
        return recordMapper.addInpatientRecord(inpatientRecord);
    }

    @Override
    public List<InpatientRecord> selectInpatientRecord() {
        return recordMapper.selectInpatientRecord();
    }

    @Override
    public InpatientRecord selectInpatientRecordByRecordId(int pId) {
        return recordMapper.selectInpatientRecordByRecordId(pId);
    }

    @Override
    public int updateInpatientRecord(InpatientRecord inpatientRecord) {
        return recordMapper.updateInpatientRecord(inpatientRecord);
    }

    @Override
    public void deleteInpatientRecord(int pId) {
        recordMapper.deleteInpatientRecord(pId);
    }
}
