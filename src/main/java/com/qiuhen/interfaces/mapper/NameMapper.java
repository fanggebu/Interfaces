package com.qiuhen.interfaces.mapper;

import com.qiuhen.interfaces.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;


/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.dao
 * @ClassName: NameMapper
 * @Author: qiuhen
 * @Description: 名称持久层
 * @Date: 2021/1/23 15:50
 * @Version: 1.0
 */
@Repository
public interface NameMapper {

    @Insert("insert into name(name,num) values('12','122')")
    public int add();
}
