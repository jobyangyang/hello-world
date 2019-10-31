package com.zhiy.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.zhiy.zy.mapper")
@SpringBootApplication
public class ZyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyApplication.class, args);
    }

}
