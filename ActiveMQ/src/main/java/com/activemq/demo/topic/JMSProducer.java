package com.activemq.demo.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

//模拟jms中的生产者---p2p点对点模式，目的地是队列
public class JMSProducer {

    public static final String ACTIVEMQ_URL = "tcp://127.0.0.1:61616";

    //    主题
    public static final String TOPIC_NAME = "index-topic";


    public static void main(String[] args) throws JMSException {

//      1)获取连接工厂  ConnectionFactory,使用默认的用户名和密码admin/admin，指定URL
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

//      2) 获取连接
        Connection connection = connectionFactory.createConnection();

//      3)启动连接
        connection.start();

//      4)创建session,参数transacted:事务,acknowledgeMode响应模式
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

//        5)创建目的地：主题
        Topic topic = session.createTopic(TOPIC_NAME);


//        6）创建生产者，参数destination表示目的地-topic
        MessageProducer messageProducer = session.createProducer(topic);

//        7)发送消息
        for (int i = 1; i <= 6; i++) {
            TextMessage textMessage = session.createTextMessage("index-topic中的消息：" + i);
            messageProducer.send(textMessage);

        }

//        8)关闭资源
        messageProducer.close();
        session.close();
        connection.close();


    }

}

