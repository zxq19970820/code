package com.activemq.demo.p2p;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class JMSConsumer3 {

    public static final String ACTIVEMQ_URL = "tcp://127.0.0.1:61616";

    //    队列名称
    public static final String QUEUR_NAME = "index";


    public static void main(String[] args) throws JMSException, IOException {


//     1)获取连接工厂  ConnectionFactory,使用默认的用户名和密码admin/admin，指定URL
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        //      2) 获取连接
        Connection connection = connectionFactory.createConnection();

//      3)启动连接
        connection.start();

        //      4)创建session,参数transacted:事务,acknowledgeMode响应模式
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

//                5)创建目的地：队列
        Queue queue = session.createQueue(QUEUR_NAME);


//        6）创建消费者
        MessageConsumer messageConsumer = session.createConsumer(queue);


//        7）接收消息：获取队列中的所有消息，消费者一直接收消息

        while (true) {
//         receive阻塞方法
            TextMessage msg = (TextMessage) messageConsumer.receive();

            if (msg != null) {
//                接收到消息了
                System.out.println("JMSConsumer接收到消息:" + msg.getText());
            } else {
//                队列中的消息全部接收完毕
                System.out.println("----消息接收完毕-----");
                break;
            }

        }


    }
}
