package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//开启springboot注解
@SpringBootApplication
//开启dubbo注解
@EnableDubbo
//开启事务管理器
@EnableTransactionManagement
public class AddressServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AddressServiceApplication.class,args);
    }
}
