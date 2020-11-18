package com.producertopic.demo;

import org.apache.activemq.command.ActiveMQTempTopic;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

@Configuration
@EnableJms
public class ConfigBeanTopic {

    //    注入主题属性
    @Value("${topic-boot-name}")
//    @Value("newtopic")
    private String topicName;

    //    创建主题并设置主题名称
    @Bean
    public Topic createTopic() {
        return new ActiveMQTopic(topicName);
    }
}








