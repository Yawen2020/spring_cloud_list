package com.changlu.goodslist;

import com.changlu.goodslist.service.GoodsPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsPricePriceApplicationTests {

    @Autowired
    private GoodsPriceService goodsPriceService;

    @Test
    void contextLoads() {
        System.out.println(goodsPriceService.getGoodsPriceByGoodsId(362));
    }

}
