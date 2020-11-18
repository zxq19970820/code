package com.consumertopic.demo;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class consumerTopic {


    //接收消息
//    消费者监听主题，

    @JmsListener(destination = "${topic-boot-name}")
    public void receiveMsg(TextMessage textMessage) throws JMSException {
        System.out.println("发布订阅模式下消费者接收到主题中的消息--"+textMessage.getText());

    }
}
