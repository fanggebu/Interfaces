package com.qiuhen.interfaces.rest;

import com.github.pagehelper.PageInfo;
import com.qiuhen.interfaces.pojo.APIResponse;
import com.qiuhen.interfaces.pojo.UserBase;
import com.qiuhen.interfaces.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: User
 * @Author: qiuhen
 * @Description: 用户实体
 * @Date: 2020/5/7 19:08
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserSer userSer;

    /**
     * 获取单个用户
     * @param id
     * @return
     */
    @GetMapping("{id}")
    @ResponseBody
    public APIResponse<UserBase> get(@PathVariable String id ){

        return new APIResponse<>();
    }

    /**
     *
     * @param pageInfo
     * @return
     */
    @PostMapping("getAll")
    @ResponseBody
    public APIResponse<PageInfo<UserBase>> getAll(@RequestBody PageInfo<UserBase> pageInfo ){

        return userSer.get(pageInfo);
    }

    /**
     * 添加用户
     * @param userBase
     * @return
     */
    @PostMapping("{id}")
    @ResponseBody
    public APIResponse<UserBase> add(@RequestBody UserBase userBase ){



        return userSer.add(userBase);
    }

    /**
     * 修改用户
     * @param id
     * @return
     */
    @GetMapping("edit/{id}")
    @ResponseBody
    public APIResponse<UserBase> edit(@PathVariable String id ){

        return new APIResponse<>();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    @ResponseBody
    public APIResponse<UserBase> del(@PathVariable String id ){
        return userSer.del(id);
    }

}
