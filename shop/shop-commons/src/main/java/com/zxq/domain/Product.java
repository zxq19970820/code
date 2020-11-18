package com.zxq.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_product")   //类名与表名不一样，依赖关联表
@Data   //自动生成get，set  方法
public class Product {

    @Id
    private Long id;

    private String productName;

    private int status;   //发售状态，0下架，1在售

    private BigDecimal price;   //价格

    private String productDesc;    //商品描述

    private String caption;    //标题

    private int inventory;   //商品库存

}
