package com.qiuhen.interfaces.rest;

import com.qiuhen.interfaces.pojo.APIResponse;
import com.qiuhen.interfaces.pojo.Book;
import com.qiuhen.interfaces.service.BookSer;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: BookRest
 * @Author: qiuhen
 * @Description: 书籍接口
 * @Date: 2020/5/7 15:43
 * @Version: 1.0
 */

@Controller
@RequestMapping("/book")
@Api(value = "book|一个用来测试swagger注解的控制器")
public class BookRest {

    private static final Logger logger = LoggerFactory.getLogger(BookRest.class);


    @Autowired
    private BookSer bookSer;

    @GetMapping("/get")
    @ResponseBody
    public APIResponse get(Book rebook){
        logger.info("/getBooks");
        Book book = bookSer.get();
        APIResponse res = new APIResponse();
        res.setCode("0");
        res.setData(book);

        return res;
    }

    @PostMapping("/add")
    @ResponseBody
    public APIResponse add(Book rebook){
        logger.info("/addBook");
        Book book = bookSer.get();
        APIResponse res = new APIResponse();
        res.setCode("0");
        res.setData(book);

        return res;
    }

    @DeleteMapping("/del/{id}")
    @ResponseBody
    public APIResponse del(@PathVariable String id){
        logger.info("/delBook");
        Book book = bookSer.get();
        APIResponse res = new APIResponse();
        res.setCode("0");
        res.setData(book);

        return res;
    }

    @PostMapping("/edit")
    @ResponseBody
    public APIResponse edit(Book rebook){
        logger.info("/editBook");
        Book book = bookSer.get();
        APIResponse res = new APIResponse();
        res.setCode("0");
        res.setData(book);

        return res;
    }





}
