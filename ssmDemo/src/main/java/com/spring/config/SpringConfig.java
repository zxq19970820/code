package com.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring配置文件
@Configuration

//组件扫描
//@ComponentScan(value ={ " ","  "})
@ComponentScan("com.spring")
public class SpringConfig {

    public SpringConfig() {
        System.out.println("-------SpringConfig初始化-------");
    }
}
