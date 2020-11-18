package com.csi.order.hystrix;

import com.csi.order.domain.Product;
import com.csi.order.feign.ProductServiceFeign;
import org.springframework.stereotype.Component;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/23 15:43
 * 4
 */

@Component
public class FailbackDefault implements ProductServiceFeign {

    @Override
    public Product findById(Long id) {

        Product product=new Product();
        product.setProductName("服务器压力过大，请稍后....");

        return product;
    }
}
