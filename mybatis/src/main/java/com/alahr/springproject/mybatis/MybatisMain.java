package com.alahr.springproject.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alahr.springproject.mybatis.dao")
public class MybatisMain {
    public static void main(String[] args){
        SpringApplication.run(MybatisMain.class, args);
    }
}
