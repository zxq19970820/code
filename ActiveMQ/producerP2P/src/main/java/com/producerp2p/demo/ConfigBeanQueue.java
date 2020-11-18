package com.producerp2p.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;


//配置类--配置文件（spring的配置文件）
@Configuration
@EnableJms
public class ConfigBeanQueue {

//    属性注入的方式
    @Value("newqueue")
//    @Value("${queue-boot-name}")
    private String queueName;

//    创建队列Queue  createQueue并设置队列名称
    @Bean
    public Queue createQueue(){
        return new ActiveMQQueue(queueName);
    }


}
