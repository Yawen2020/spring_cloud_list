package com.changlu.goodslist.client;

import com.changlu.goodslist.pojo.Goods1;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName GoodsListClientHystrix
 * @Author ChangLu
 * @Date 2021/10/4 20:30
 * @Description 断路器，对于服务不可用或其他情况进行统一的返回值返回
 */
@Component
public class GoodsListClientHystrix implements GoodsListClient{

    @Override
    public List<Goods1> getList() {
        Goods1 goods = new Goods1();
        goods.setId(0);
        goods.setGoodsId(0);
        goods.setName("马克杯");
        return Collections.singletonList(goods);
    }

}