package com.changlu.demogoods.controller;

import com.changlu.demogoods.service.GoodsService;
import com.changlu.demogoods.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CourseController
 * @Author ChangLu
 * @Date 2021/10/4 13:03
 * @Description 控制器
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired(required = false)
    private GoodsService goodsService;

    @GetMapping("/list")
    public List<Goods> getList(){
        return  goodsService.getGoodsList();
    }//

}