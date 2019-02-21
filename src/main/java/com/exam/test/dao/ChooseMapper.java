package com.exam.test.dao;

import com.exam.test.pojo.Choose;

public interface ChooseMapper {
    int deleteByPrimaryKey(Integer chId);

    int insert(Choose record);

    int insertSelective(Choose record);

    Choose selectByPrimaryKey(Integer chId);

    int updateByPrimaryKeySelective(Choose record);

    int updateByPrimaryKeyWithBLOBs(Choose record);

    int updateByPrimaryKey(Choose record);
}