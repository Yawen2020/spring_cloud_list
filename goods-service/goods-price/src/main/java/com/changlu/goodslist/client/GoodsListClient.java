package com.changlu.goodslist.client;

import com.changlu.goodslist.pojo.Goods1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ClassName GoodsListClient
 * @Author ChangLu
 * @Date 2021/10/4 16:36
 * @Description 远程调用
 */
@FeignClient(value = "goods-list",fallback = GoodsListClientHystrix.class)
@Primary
public interface GoodsListClient {

    @GetMapping("/goods/list")
    List<Goods1> getList();

}
