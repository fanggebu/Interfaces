package com.qiuhen.interfaces.mapper;

import com.qiuhen.interfaces.pojo.UserBase;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface UserBaseMapper {
    int deleteByPrimaryKey(String uid);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);

    List<UserBase> getAll();
}