package com.consumer.producedemo.config;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

//模拟生产者发送消息   RabbitTemplate
@Component
public class ProducerNew {

    //  注入属性RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //发送消息
    public void sendMsg(String content) {
//        随机
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());

//          交换机            路由key            消息                                      标识
//        String exchange, String routingKey, Object object, @Nullable CorrelationData correlationData
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTINGKEY_EMAIL, content, correlationData);
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTINGKEY_SMS, content, correlationData);
    }
}
























