package com.producertopic.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class ProducerTopic {

    //    注入属性
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Autowired
    private Topic topic;

    int i = 1;

    @Scheduled(fixedDelay = 3000L)
    public void sendMsgScheduled() {

        jmsMessagingTemplate.convertAndSend(topic, "topicProducer定时发送信息到队列" + i++);
        System.out.println("------定时消息发送完成--------");
    }
}
