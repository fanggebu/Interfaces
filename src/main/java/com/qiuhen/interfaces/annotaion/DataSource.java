package com.qiuhen.interfaces.annotaion;

import com.qiuhen.interfaces.enums.DataSourceType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: DataSource
 * @Author: qiuhen
 * @Description: z
 * @Date: 2021/1/23 14:26
 * @Version: 1.0
 */
/*
 * @author Hayson
 * @description 自定义注解，用于类或方法上，优先级：方法>类
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    DataSourceType value() default DataSourceType.db1;
}
