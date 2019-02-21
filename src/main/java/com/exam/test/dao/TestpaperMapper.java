package com.exam.test.dao;

import com.exam.test.pojo.Testpaper;

public interface TestpaperMapper {
    int deleteByPrimaryKey(Integer tpId);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);
}