package com.qiuhen.interfaces.mapper;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.mapper
 * @ClassName: OperateTableMapper
 * @Author: qiuhen
 * @Description: 操作表的mapper
 * @Date: 2021/1/24 21:58
 * @Version: 1.0
 */

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//import xx.xxx.xx.po.Trackpoint;
@Repository
public interface OperateTableMapper {

    /**
     * 判断表是否存在
     * @param tableName
     * @return
     */
    int existTable(String tableName);

    /**
     * 根据传参删除表
     * @param tableName
     * @return
     */
    int dropTable(@Param("tableName")String tableName);

    /**
     * 根据传参创建新表
     * @param tableName
     * @return
     */
    int createNewTable(@Param("tableName")String tableName);

    //插入数据操作
    // int insert(@Param("tableName")String tableName,@Param("trackpoint")Trackpoint trackpoint);
}
