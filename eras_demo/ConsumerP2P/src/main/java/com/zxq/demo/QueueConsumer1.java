package com.zxq.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class QueueConsumer1 {

//    接收消息--设置消费者监听目的地(队列),如果监听到队列中有消息，通过方法的形参表示接收到的消息
//    Message:TextMessage
    @JmsListener(destination="${queue-boot-name1}")
    public void receiveMSG(TextMessage textMessage) throws JMSException {
        System.out.println("P2P模式下的邮件消费者接收到消息："+textMessage.getText());
    }
}
