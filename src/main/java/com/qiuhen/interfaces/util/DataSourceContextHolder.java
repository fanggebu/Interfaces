package com.qiuhen.interfaces.util;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.util
 * @ClassName: DataSourceContextHolder
 * @Author: qiuhen
 * @Description: 数据源线程魔属性
 * @Date: 2021/1/23 13:56
 * @Version: 1.0
 */
public class DataSourceContextHolder {
    // 存放当前线程使用的数据源类型
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源
    public static void setDataSource(String type){
        contextHolder.set(type);
    }

    // 获取数据源
    public static String getDataSource(){
        return contextHolder.get();
    }

    // 清除数据源
    public static void clearDataSource(){
        contextHolder.remove();
    }
}
