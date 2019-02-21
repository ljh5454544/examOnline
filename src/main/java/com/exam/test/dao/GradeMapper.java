package com.exam.test.dao;

import com.exam.test.pojo.Grade;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}