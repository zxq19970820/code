package com.producerp2p.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class QueueProducer {

    //属性注入
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    //    发送一条消息
    public void sendMsg() {
        jmsMessagingTemplate.convertAndSend(queue, "QueueProducer发送信息到队列");
    }

    //定时发送消息：每隔3秒自动发送一条信息    微服务项目启动的时候自动执行使用 @Scheduled修饰的方法
    int i=1;
    @Scheduled(fixedDelay = 3000L)
    public void sendMsgScheduled() {

        jmsMessagingTemplate.convertAndSend(queue, "QueueProducer定时发送信息到队列"+i++);
        System.out.println("------定时消息发送完成--------");
    }
}
