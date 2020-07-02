package com.qiuhen.interfaces;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@ComponentScan(value = "indi.viyoung.viboot.*")
@MapperScan(value = "com.qiuhen.interfaces.mapper")
@EnableSwagger2
@SpringBootApplication
public class InterfacesApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterfacesApplication.class, args);
    }

}
