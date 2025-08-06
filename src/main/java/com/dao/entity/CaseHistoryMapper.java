package com.dao.entity;

import com.model.CaseHistory;

public interface CaseHistoryMapper {
    int deleteByPrimaryKey(Integer caseHistoryId);

    int insert(CaseHistory record);

    int insertSelective(CaseHistory record);

    CaseHistory selectByPrimaryKey(Integer caseHistoryId);

    int updateByPrimaryKeySelective(CaseHistory record);

    int updateByPrimaryKey(CaseHistory record);
}