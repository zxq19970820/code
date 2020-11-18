package com.producter.queue;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("Queue1")
    private Queue queue1;


    @Autowired
    @Qualifier("Queue2")
    private Queue queue2;

    public void sendMsg1() {
        jmsMessagingTemplate.convertAndSend(queue1, "您已登录成功");
    }

    public void sendMsg2() {
        jmsMessagingTemplate.convertAndSend(queue2, "您已登录成功");
    }

    //定时发送消息：每隔3秒自动发送一条信息    微服务项目启动的时候自动执行使用 @Scheduled修饰的方法
    int i=1;
    @Scheduled(fixedDelay = 2000L)
    public void sendMsgScheduled() {

        jmsMessagingTemplate.convertAndSend(queue1, "QueueProducer定时发送信息到队列"+i++);
        System.out.println("------定时消息发送完成--------");
    }
}
