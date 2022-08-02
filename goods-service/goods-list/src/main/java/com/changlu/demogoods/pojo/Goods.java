package com.changlu.demogoods.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Goods
 * @Author ChangLu
 * @Date 2021/10/4 12:42
 * @Description TODO
 */
@Data
public class Goods implements Serializable {

    private static final long serialVersionUID = -6849794470748667710L;

    private Integer id;
    private Integer goodsId;
    private String name;
    private Integer valid;
}