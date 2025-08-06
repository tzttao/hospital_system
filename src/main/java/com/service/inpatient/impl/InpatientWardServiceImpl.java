package com.service.inpatient.impl;

import com.dao.inpatient.InpatientWardMapper;
import com.model.InpatientWard;
import com.service.inpatient.InpatientWardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InpatientWardServiceImpl implements InpatientWardService {
    @Autowired
    InpatientWardMapper wardMapper;

    @Override
    public int addInpatientWard(InpatientWard inpatientWard) {
        return wardMapper.addInpatientWard(inpatientWard);
    }

    @Override
    public List<InpatientWard> selectInpatientWard() {
        return wardMapper.selectInpatientWard();
    }

    @Override
    public List<InpatientWard> selectInpatientWardBySurplus() {
        return wardMapper.selectInpatientWardBySurplus();
    }

    @Override
    public int updateInpatientWard(InpatientWard inpatientWard) {
        return wardMapper.updateInpatientWard(inpatientWard);
    }

    @Override
    public void deleteInpatientWard(int inwardId) {
        wardMapper.deleteInpatientWard(inwardId);
    }
}
