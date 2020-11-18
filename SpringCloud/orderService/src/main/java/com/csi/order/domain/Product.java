package com.csi.order.domain;

import lombok.Data;

import java.math.BigDecimal;


@Data   //自动生成get，set  方法
public class Product {


    private Long id ;

    private String productName ;

    private int status ;   //发售状态，0下架，1在售

    private BigDecimal price ;   //价格

    private String productDesc ;    //商品描述

    private String caption ;    //标题

    private int inventory ;   //商品库存

}
