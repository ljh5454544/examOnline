package com.exam.test.dao;

import com.exam.test.pojo.Major;

public interface MajorMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}