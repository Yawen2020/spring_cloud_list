package com.changlu.goodslist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.changlu.goodslist.mapper")
@EnableFeignClients
@EnableCircuitBreaker    //打开断路器
public class GoodsPriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsPriceApplication.class, args);
    }

}
