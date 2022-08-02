package com.changlu.goodslist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.changlu.goodslist.pojo.GoodsPrice;
import org.apache.ibatis.annotations.Select;
import com.changlu.goodslist.pojo.Goods1;

import java.util.List;

/**
 * @ClassName GoodsPriceMapper
 * @Author ChangLu
 * @Date 2021/10/4 13:16
 * @Description TODO
 */
public interface GoodsPriceMapper extends BaseMapper<GoodsPrice> {
    @Select("select * from goods1")
    List<Goods1> getGoods1List();
}
