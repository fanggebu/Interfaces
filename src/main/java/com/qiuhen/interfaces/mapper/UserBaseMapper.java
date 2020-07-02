package com.qiuhen.interfaces.mapper;

import com.qiuhen.interfaces.pojo.UserBase;

public interface UserBaseMapper {
    int deleteByPrimaryKey(String uid);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
}