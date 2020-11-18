package com.csi.order.controller;

import com.csi.order.domain.Product;

import com.csi.order.feign.ProductServiceFeign;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 21:54
 * 4
 */

@RestController
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "fallback4Wait")
public class OrderController {


    @Autowired
    private ProductServiceFeign productServiceFeign;

//    @Autowired
//    private DiscoveryClient discoveryClient;   //服务发现类

//设置时间为4秒，请求超过4秒报错
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
//    })


//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
//    })

    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        Product product = productServiceFeign.findById(id);
        return product;



//根据service-id（服务名称）获取对应的列表
//        List<ServiceInstance> instances = discoveryClient.getInstances("PRODUCT-SERVICE");
//
//        System.out.println("----" + instances.size());
//
//
//        Product pro = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + id, Product.class);
//        return pro;
//    }


    /**
     * 回退方法的返回值必须与调用者的方法要一致，参数也要完全一致
     *
     * @param id
     * @return
     */
    public Product fallback4Wait() {
        Product product = new Product();
        product.setProductName("当前服务访问压力过大，请稍后重试！");
        return product;
    }


}
