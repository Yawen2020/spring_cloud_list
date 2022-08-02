package com.changlu.goodslist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.changlu.goodslist.client.GoodsListClient;
import com.changlu.goodslist.mapper.GoodsPriceMapper;
import com.changlu.goodslist.pojo.GoodsAndPrice;
import com.changlu.goodslist.pojo.GoodsPrice;
import com.changlu.goodslist.service.GoodsPriceService;
import com.changlu.goodslist.pojo.Goods1;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GoodsPriceServiceImpl
 * @Author ChangLu
 * @Date 2021/10/4 13:16
 * @Description TODO
 */
@Service
public class GoodsPriceServiceImpl implements GoodsPriceService {

    @Autowired(required = false)
    private GoodsPriceMapper goodsPriceMapper;
    @Autowired
    private GoodsListClient goodsListClient;

    @Override
    public GoodsPrice getGoodsPriceByGoodsId(Integer goodsId) {
        return goodsPriceMapper.selectOne(new LambdaQueryWrapper<GoodsPrice>()
                .eq(GoodsPrice::getGoodsId,goodsId)
        );
    }

    @Override
    public List<GoodsAndPrice> getAllGoodsAndPrice() {
        //远程调用查询服务，查询出所有的货物
        List<Goods1> goods = goodsPriceMapper.getGoods1List();
        List<GoodsAndPrice> newGoods = new ArrayList<>(goods.size());
        if(!CollectionUtils.isEmpty(goods)){
            for (Goods1 good : goods) {
                GoodsAndPrice goodsAndPrice = new GoodsAndPrice();
                BeanUtils.copyProperties(good, goodsAndPrice);
                //本地查询
                GoodsPrice price = this.getGoodsPriceByGoodsId(good.getGoodsId());
                System.out.println(price.getPrice());
                goodsAndPrice.setPrice(price.getPrice());
                newGoods.add(goodsAndPrice);
            }
        }
        return newGoods;
    }
}