package com.eras.eras_demo.controller;

import com.eras.eras_demo.JsoupUtils;
import com.eras.eras_demo.entity.Product;
import com.eras.eras_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private JsoupUtils jsoupUtils;

    @Autowired
    private ProductService productService;

    @RequestMapping("/addPros")
    @ResponseBody
    public String adds(){
        List<Product> prosByJsoup = jsoupUtils.getProsByJsoup();
        for(Product product:prosByJsoup){
            productService.adds(product);
        }
        return "插入成功！";
    }

    @RequestMapping("/getPinventory")
    @ResponseBody  //响应JSON
    public List<Product> getPinventory(){
        //模拟，假设id=1和id=2的商品库存=0
        List<Product> pros = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(1);
        pros.add(product1);
        Product product2 = new Product();
        product2.setId(2);
        pros.add(product2);
        return pros;
    }
}
