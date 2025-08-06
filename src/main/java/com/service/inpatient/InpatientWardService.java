package com.service.inpatient;

import com.model.InpatientWard;

import java.util.List;

public interface InpatientWardService {

    int addInpatientWard(InpatientWard inpatientWard);

    List<InpatientWard> selectInpatientWard();

    //查询能住的房间
    List<InpatientWard> selectInpatientWardBySurplus();

    int updateInpatientWard(InpatientWard inpatientWard);

    void deleteInpatientWard(int inwardId);
}
