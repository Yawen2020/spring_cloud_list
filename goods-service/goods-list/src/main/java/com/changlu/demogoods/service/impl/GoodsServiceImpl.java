package com.changlu.demogoods.service.impl;

import com.changlu.demogoods.pojo.Goods;
import com.changlu.demogoods.service.GoodsService;
import com.changlu.demogoods.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GoodsServiceImpl
 * @Author ChangLu
 * @Date 2021/10/4 12:45
 * @Description TODO
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }
}