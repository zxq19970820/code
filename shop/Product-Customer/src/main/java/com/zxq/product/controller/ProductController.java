package com.zxq.product.controller;

import com.zxq.domain.Product;
import com.zxq.product.feign.ProductServiceFeign;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/23 22:04
 * 4
 */

@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    private ProductServiceFeign productServiceFeign;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    List<Product> findAll() {
//        调用服务方
        List<Product> all = productServiceFeign.findAll();
        return all;

    }
}
















