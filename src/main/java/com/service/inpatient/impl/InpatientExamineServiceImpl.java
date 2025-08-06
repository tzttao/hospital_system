package com.service.inpatient.impl;

import com.dao.inpatient.InpatientExamineMapper;
import com.dao.inpatient.InpatientWardMapper;
import com.model.InpatientExamine;
import com.service.inpatient.InpatientExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InpatientExamineServiceImpl implements InpatientExamineService {

    @Autowired
    InpatientExamineMapper examineMapper;

    @Override
    public List<InpatientExamine> selectExamine() {
        return examineMapper.selectInpatientExamine();
    }

    @Override
    public int addExamine(InpatientExamine inpatientExamine) {

        return examineMapper.addInpatientExamine(inpatientExamine);
    }

    @Override
    public int updateExamine(InpatientExamine inpatientExamine) {

        return examineMapper.updateInpatientExamine(inpatientExamine);
    }

    @Override
    public void deleteExamine(int examineId) {
        examineMapper.deleteInpatientExamine(examineId);
    }
}
