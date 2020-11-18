package com.activemq.demo.topic;


import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class JMSConsumer {


    public static final String ACTIVEMQ_URL = "tcp://127.0.0.1:61616";


    //    主题名称
    public static final String TOPIC_NAME = "index-topic";

    public static void main(String[] args) throws JMSException, IOException {


//     1)获取连接工厂  ConnectionFactory,使用默认的用户名和密码admin/admin，指定URL
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

//      2) 获取连接
        Connection connection = connectionFactory.createConnection();

//      3)启动连接
        connection.start();

//      4)创建session,参数transacted:事务,acknowledgeMode响应模式
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);


//       5） 创建目的地：主题

        Topic topic = session.createTopic(TOPIC_NAME);

//        6）创建消费者
        MessageConsumer messageConsumer = session.createConsumer(topic);


//        7）接收消息：获取队列中的所有消息，消费者一直接收消息


//        通过监听的方式接受消息，方法参数是MessageListener接口,匿名内部类--非阻塞
//        有消息就接受，没消息就结束监听
        messageConsumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if (message != null && message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
//                处理消息的方法
                    try {
                        System.out.println("index-topic中的消息：" + textMessage.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

//        保证控制台不关闭
        System.in.read();
        messageConsumer.close();
        session.close();
        connection.close();


    }


}
