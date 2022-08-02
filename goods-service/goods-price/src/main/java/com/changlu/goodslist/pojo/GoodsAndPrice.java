package com.changlu.goodslist.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName GoodsAndPrice
 * @Author ChangLu
 * @Date 2021/10/5 7:15
 * @Description TODO
 */
@Data
public class GoodsAndPrice extends Goods1 implements Serializable {

    private static final long serialVersionUID = -6855794470748667710L;

    private BigDecimal price;
}