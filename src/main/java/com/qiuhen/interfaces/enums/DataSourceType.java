package com.qiuhen.interfaces.enums;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.enums
 * @ClassName: DataSourceType
 * @Author: qiuhen
 * @Description: 数据源变换枚举类
 * @Date: 2021/1/23 13:55
 * @Version: 1.0
 */
public enum DataSourceType {
    db1("db1"),
    db2("db2");
    private String db;
    DataSourceType(String db) {
        this.db = db;
    }
    public String getDb() {
        return db;
    }
    public void setDb(String db) {
        this.db = db;
    }
}
