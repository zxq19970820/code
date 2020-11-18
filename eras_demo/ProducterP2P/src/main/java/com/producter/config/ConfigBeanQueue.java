package com.producter.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;


@Configuration
@EnableJms
public class ConfigBeanQueue {

    @Value("que1")
    private String queueName1;


    @Value("que2")
    private String queueName2;


    @Bean("Queue1")
    public Queue createQueue1(){
        return new ActiveMQQueue(queueName1);
    }

    @Bean("Queue2")
    public Queue createQueue2(){
        return new ActiveMQQueue(queueName2);
    }

}
