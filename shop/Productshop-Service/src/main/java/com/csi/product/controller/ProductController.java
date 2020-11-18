package com.csi.product.controller;

import com.csi.product.service.ProductService;

import com.zxq.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 21:15
 * 4
 */


@RestController    //Rest表示风格，返回json数据
@RequestMapping("/product")
@Slf4j
//@ResponseBody
public class ProductController {


    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;


    @RequestMapping(value = "/save")
    public void save(Product product) {
        productService.saveOrUpdate(product);
    }


    @RequestMapping(value = "/update")
    public void update(Product product) {
        productService.saveOrUpdate(product);
    }


    @RequestMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @RequestMapping(value = "/list")
    public List<Product> findAll() {
        return productService.findAll();
    }


    @RequestMapping(value = "/{id}")
    public Product findById(@PathVariable Long id) {

//        log.info("--------");

        System.out.println("======IP:" + ip + "=======PORT:" + port);

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return productService.findById(id);
    }
}




















