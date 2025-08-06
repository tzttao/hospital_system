package com.dao.register;

import com.model.RegisterOnline;

public interface RegisterOnlineMapper {
    int deleteByPrimaryKey(Integer onlineId);

    int insert(RegisterOnline record);

    int insertSelective(RegisterOnline record);

    RegisterOnline selectByPrimaryKey(Integer onlineId);

    int updateByPrimaryKeySelective(RegisterOnline record);

    int updateByPrimaryKey(RegisterOnline record);
}