package com.qiuhen.interfaces.mapper;

import com.qiuhen.interfaces.pojo.Book;
import org.springframework.stereotype.Repository;



/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.dao
 * @ClassName: BookMapper
 * @Author: qiuhen
 * @Description: 书籍持久层
 * @Date: 2020/5/7 15:50
 * @Version: 1.0
 */
@Repository
public interface BookMapper {


    public Book get();
}
