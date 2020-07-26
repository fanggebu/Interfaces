package com.qiuhen.interfaces.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiuhen.interfaces.mapper.UserBaseMapper;
import com.qiuhen.interfaces.pojo.APIResponse;
import com.qiuhen.interfaces.pojo.UserBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.service
 * @ClassName: UserSer
 * @Author: qiuhen
 * @Description: 用户
 * @Date: 2020/7/26 7:11
 * @Version: 1.0
 */
@Service
public class UserSer {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Transactional
    public APIResponse<UserBase> del(String id) {
        APIResponse<UserBase> apiResponse = new APIResponse<>();
        try{
            userBaseMapper.deleteByPrimaryKey(id);
            apiResponse.setCode("success");
        }catch (Exception e){
            apiResponse.setCode("fail");
            apiResponse.setMsg(e.getMessage());
        }


        return apiResponse;
    }

    public APIResponse<UserBase> add(UserBase userBase) {
        APIResponse<UserBase> apiResponse = new APIResponse<>();
        try{
            userBase.setUid(UUID.randomUUID().toString());
            userBase.setCreateTime(new Date());
            userBaseMapper.insert(userBase);
            apiResponse.setCode("success");
        }catch (Exception e){
            apiResponse.setCode("fail");
            apiResponse.setMsg(e.getMessage());
        }


        return apiResponse;




    }

    public APIResponse<PageInfo<UserBase>> get(PageInfo<UserBase> pageInfo) {

        APIResponse<PageInfo<UserBase>> apiResponse = new APIResponse<>();
        try{
            PageHelper.startPage(pageInfo.getStartRow(),pageInfo.getEndRow());

            List<UserBase> list = userBaseMapper.getAll();
            PageInfo<UserBase> pageInfo1 = new PageInfo<>(list);
            apiResponse.setData(pageInfo1);
            apiResponse.setCode("success");
        }catch (Exception e){
            apiResponse.setCode("fail");
            apiResponse.setMsg(e.getMessage());
        }


        return apiResponse;
    }
}
