package com.changlu.goodslist.service;

import com.changlu.goodslist.pojo.GoodsAndPrice;
import com.changlu.goodslist.pojo.GoodsPrice;

import java.util.List;

/**
 * @ClassName GoodsPriceService
 * @Author ChangLu
 * @Date 2021/10/4 13:16
 * @Description TODO
 */
public interface GoodsPriceService {

    /**
     * 根据课程id查询到课程价格
     * @param goodsId
     * @return
     */
    GoodsPrice getGoodsPriceByGoodsId(Integer goodsId);

    /**
     * 查询出所有的课程及价格
     * @return
     */
    List<GoodsAndPrice> getAllGoodsAndPrice();
}
