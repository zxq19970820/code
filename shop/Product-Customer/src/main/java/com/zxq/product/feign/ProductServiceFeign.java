package com.zxq.product.feign;

import com.zxq.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/23 22:29
 * 4
 */

@FeignClient(value = "PRODUCT-SERVICE")
public interface ProductServiceFeign {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    List<Product> findAll();
}







