package com.zxq.config;

import com.zxq.service.HelloService;
import com.zxq.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Configuration;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 14:54
 * 4
 */

@Configuration
public class ConfigDemo {

//    @Bean       //把方法的返回值存入spring容器，bean对象的id是方法名
    public HelloService helloService(){
        return new HelloServiceImpl();
    }

}
