package com.zxq.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/23 22:12
 * 4
 */

//在运行时，不自动运行与数据源相关的类
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EntityScan("com.zxq.domain")
@EnableFeignClients
public class ProductCustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProductCustomerApplication.class, args);

    }
}
