package com.qiuhen.interfaces.service;

import com.qiuhen.interfaces.enums.DataSourceType;
import com.qiuhen.interfaces.mapper.NameMapper;
import com.qiuhen.interfaces.annotaion.DataSource;
import com.qiuhen.interfaces.pojo.NameOperate;
import com.qiuhen.interfaces.util.DataSourceContextHolder;
import com.qiuhen.interfaces.util.DynamicDataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.service
 * @ClassName: StudentSer
 * @Author: qiuhen
 * @Description: 测试数据源切换
 * @Date: 2021/1/23 14:08
 * @Version: 1.0
 */
@Service
public class OperateSqlService {

    @Autowired
    private NameMapper nameMapper;

    //从db2中获取到drive-class、url、username、password信息
    @DataSource(DataSourceType.db2)
    public int test(NameOperate nameOperate ){
        // 通过id获取到drive-class、url、username、password
//        Map<String, Object> getdb = NameMapper.getdb(id);
        String id = UUID.randomUUID().toString();
        // 配置数据源
        HikariDataSource dataSource = new HikariDataSource();
        //根据输入选择使用的数据库版本，以及设置url
        switch (nameOperate.getOperate()){
            case "0":
                dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
                dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/interface?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
                break;
            case "1":
                dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                dataSource.setJdbcUrl("jdbc:mysql://"+nameOperate.getSqlUrl()+"?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
                break;
            case "2":
                dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
                dataSource.setJdbcUrl("jdbc:mysql://"+nameOperate.getSqlUrl()+"?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
                break;
        }
        /*
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/interface?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
        */
        dataSource.setUsername(nameOperate.getUsername());
        dataSource.setPassword(nameOperate.getPassword());

        // 添加一个数据源到多数据源中
        DynamicDataSource dynamicDataSource = DynamicDataSource.getInstance();
        Map<Object, Object> dataSourceMap = dynamicDataSource.getDataSourceMap();
        dataSourceMap.put(id, dataSource);

        dynamicDataSource.setTargetDataSources(dataSourceMap);

        // 切换数据源
        DataSourceContextHolder.setDataSource(id);

        // 使用该数据源后，删除该数据源(如果不在使用)
        DynamicDataSource instance = DynamicDataSource.getInstance();

//        Map<Object, Object> dataSourceMap = instance.getDataSourceMap();
        dataSourceMap.remove(id);
        DataSourceContextHolder.setDataSource("db1");

        instance.setTargetDataSources(dataSourceMap);

        return 1;
    }

    public int updateStudent2(String username, int id){
        // 更新用户
//        int i = NameMapper.updateStudent(username, id);
        return 1;
    }


}
