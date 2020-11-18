package com.consumer.consumerdemo.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues ="queue_email_new")//监听队列,指定队列名称
public class EmailConsumerNew {

    @RabbitHandler    //  @RabbitListener接收到消息时，交给@RabbitHandler的方法处理
    public void handlerMsg(String content) {
        System.out.println("EmailConsumerNew接收消息：" + content);
    }

}













