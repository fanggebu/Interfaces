package com.qiuhen.interfaces.util;

import com.qiuhen.interfaces.mapper.OperateTableMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.util
 * @ClassName: OperateTable
 * @Author: qiuhen
 * @Description: 操作数据库表（创建、删除、是否存在）
 * @Date: 2021/1/24 21:55
 * @Version: 1.0
 */
public class OperateTable {

    @Autowired
    private OperateTableMapper operateTableMapper;

    public String existTable(String tableName){
        operateTableMapper.existTable("tableName");

        return "";
    }

    public String dropTable(String tableName){
        operateTableMapper.dropTable("tableName");
        return "";
    }

    public String createNewTable(String tableName){
        operateTableMapper.createNewTable(tableName);
        return "";
    }






}
