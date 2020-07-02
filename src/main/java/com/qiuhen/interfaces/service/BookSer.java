package com.qiuhen.interfaces.service;

import com.qiuhen.interfaces.mapper.BookMapper;
import com.qiuhen.interfaces.pojo.Book;
import com.qiuhen.interfaces.rest.BookRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.service
 * @ClassName: BookSer
 * @Author: qiuhen
 * @Description: 书籍处理
 * @Date: 2020/5/7 15:48
 * @Version: 1.0
 */
@Service
public class BookSer {

    private static final Logger logger = LoggerFactory.getLogger(BookSer.class);

    @Autowired
    private BookMapper bookMapper;

    public Book get() {
        Book book = bookMapper.get();
        return book;
    }
}
