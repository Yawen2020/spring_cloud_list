package com.changlu.demogoods;

import com.changlu.demogoods.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsListApplicationTests {

    @Autowired
    private GoodsService goodsService;

    @Test
    void contextLoads() {
        System.out.println(goodsService.getGoodsList());
    }

}
