package com.csi.order.feign;

import com.csi.order.domain.Product;
import com.csi.order.hystrix.FailbackDefault;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/22 14:31
 * 4
 */

//value表示要调用的服务名称
@FeignClient(value = "PRODUCT-SERVICE", fallback = FailbackDefault.class)
public interface ProductServiceFeign {

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable Long id);
}















