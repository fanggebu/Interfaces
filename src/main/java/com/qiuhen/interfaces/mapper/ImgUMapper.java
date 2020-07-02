package com.qiuhen.interfaces.mapper;

import com.qiuhen.interfaces.pojo.ImgU;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImgUMapper {

    int deleteByPrimaryKey(String id);                      //根据主键删除

    int insert(ImgU record);                                //添加数据

    int insertSelective(ImgU record);

    ImgU selectByPrimaryKey(String id);                     //根据主键查询某实体

    int updateByPrimaryKeySelective(ImgU record);

    int updateByPrimaryKey(ImgU record);                    //根据主键修改

    List<ImgU> select(ImgU img);                            //查询且模糊查询
}