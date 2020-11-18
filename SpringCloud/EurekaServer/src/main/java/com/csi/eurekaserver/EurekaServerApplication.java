package com.csi.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/16 14:40
 * 4
 */


@SpringBootApplication
@EnableEurekaServer   //开启eureka
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
