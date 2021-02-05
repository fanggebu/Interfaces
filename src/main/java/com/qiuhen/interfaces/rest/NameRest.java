package com.qiuhen.interfaces.rest;

import com.qiuhen.interfaces.pojo.NameOperate;
import com.qiuhen.interfaces.service.NameSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: NameRest
 * @Author: qiuhen
 * @Description: 名称管理器
 * @Date: 2021/1/23 11:30
 * @Version: 1.0
 */
@Controller
public class NameRest {


    @Autowired
    private NameSer nameSer;

    @PostMapping("/name")
    @ResponseBody
    public String peopleName(NameOperate nameOperate){

        System.out.println(nameOperate.toString());

        nameSer.peopleName(nameOperate);

        return "fgdg";
    }

    @GetMapping("/name1")
    public String ggName(String title){

        System.out.println(title);
        nameSer.add();

        return "index";
    }





}
