package com.qiuhen.interfaces.aspect;

import com.qiuhen.interfaces.rest.BookRest;
import com.qiuhen.interfaces.annotaion.DataSource;
import com.qiuhen.interfaces.util.DataSourceContextHolder;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.util
 * @ClassName: DataSourceAspect
 * @Author: qiuhen
 * @Description: 数据源切面
 * @Date: 2021/1/23 14:04
 * @Version: 1.0
 */
public class DataSourceAspect {
    private static final Logger logger = LoggerFactory.getLogger(BookRest.class);

    @Before("@annotation(ds)")
    public void beforeDataSource(DataSource ds) {
        // 修改为String
        String value = ds.value().getDb();
        DataSourceContextHolder.setDataSource(value);
        logger.info("当前使用的数据源为：{}", value);
    }


}
