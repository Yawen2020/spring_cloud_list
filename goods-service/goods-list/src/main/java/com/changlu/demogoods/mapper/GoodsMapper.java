package com.changlu.demogoods.mapper;

import com.changlu.demogoods.pojo.Goods;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CourseMapper
 * @Author ChangLu
 * @Date 2021/10/4 12:46
 * @Description TODO
 */
@Repository
public interface GoodsMapper {

    @Select("select * from goods")
    List<Goods> getGoodsList();

}