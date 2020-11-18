package com.csi.order;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 22:13
 * 4
 */

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableFeignClients
@SpringCloudApplication
public class OrderApplication {

//    @Bean  //将当前返回的对象放入spring容器中
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }


    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class, args);
    }
}











