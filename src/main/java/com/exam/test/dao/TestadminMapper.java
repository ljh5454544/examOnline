package com.exam.test.dao;

import com.exam.test.pojo.Testadmin;

public interface TestadminMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Testadmin record);

    int insertSelective(Testadmin record);

    Testadmin selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Testadmin record);

    int updateByPrimaryKey(Testadmin record);
}