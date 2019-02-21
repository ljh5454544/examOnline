package com.exam.test.dao;

import com.exam.test.pojo.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}