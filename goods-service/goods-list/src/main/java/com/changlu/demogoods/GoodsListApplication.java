package com.changlu.demogoods;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.changlu.demogoods.mapper")
public class GoodsListApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsListApplication.class, args);
    }

}
