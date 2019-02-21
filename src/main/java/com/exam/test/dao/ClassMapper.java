package com.exam.test.dao;

import com.exam.test.pojo.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}