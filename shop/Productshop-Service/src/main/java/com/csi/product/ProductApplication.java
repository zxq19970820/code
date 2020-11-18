package com.csi.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.persistence.Entity;


/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 21:21
 * 4
 */

//@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.zxq.domain")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
