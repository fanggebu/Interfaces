package com.qiuhen.interfaces.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: HomeRest
 * @Author: qiuhen
 * @Description: 首页
 * @Date: 2021/1/21 16:22
 * @Version: 1.0
 */
@Controller
public class HomeRest {

    @GetMapping("/index")
    public String home(){

        return "index";
    }

}
