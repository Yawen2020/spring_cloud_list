package com.changlu.goodslist.controller;

import com.changlu.goodslist.client.GoodsListClient;
import com.changlu.goodslist.pojo.GoodsAndPrice;
import com.changlu.goodslist.pojo.GoodsPrice;
import com.changlu.goodslist.service.GoodsPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName GoodsPriceController
 * @Author ChangLu
 * @Date 2021/10/4 13:17
 * @Description TODO
 */
@RestController
@RequestMapping("/Goodsprice")
public class GoodsPriceController {

    @Autowired(required = false)
    private GoodsPriceService goodsPriceService;
    //远程调用动态代理类注入
    @Autowired(required = false)
    private GoodsListClient goodsListClient;

    @GetMapping("/list/{id}")
    public GoodsPrice getList(@PathVariable("id")Integer id){
        return  goodsPriceService.getGoodsPriceByGoodsId(id);
    }


    @GetMapping("/Goodsprice")
    public List<GoodsAndPrice> getAllGoodsAndPrice(){
        return goodsPriceService.getAllGoodsAndPrice();
    }

}