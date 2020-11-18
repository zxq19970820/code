package com.consumer.consumerdemo.two;

import com.rabbitmq.client.*;

public class wConsumer2 {

    //定义队列名称
    private static final String QUEQUE_NAME = "workspace";


    public static void main(String[] args) {
//        1与MQ连接
        ConnectionFactory cf = new ConnectionFactory();

//        2设置连接工厂相关配置
        cf.setHost("127.0.0.1");
        cf.setPort(5672);  //amqp端口
        cf.setUsername("guest");
        cf.setPassword("guest");
        cf.setVirtualHost("/");//设置虚拟机

        Connection connection = null;
        Channel channel = null;

        try {
            connection = cf.newConnection();

            //3创建通道

            channel = connection.createChannel();
            //4通道与队列关联
            //queue队列名称
            //durable是否持久化，true表示mq重启队列是还在
            //exclusive表示是否独占连接
            //autoDelete：自动删除
            //arguments扩展参数
            //                  string queue,boolean durable, boolean exclusive,boolean autoDelete,Map<String,Object> arguments

            channel.queueDeclare(QUEQUE_NAME, false, false, false, null);

            //5)接收消息
            DeliverCallback dc = (str1, delivery) -> {
//                Delivery表示接收的消息
//                获取消息的内容
                byte[] msg = delivery.getBody();
//                byte[]-->string
                String message = new String(msg, "UTF-8");
                System.out.println("消费者wconsumer2接收的消息为" + message);
            };
            CancelCallback cc = str2 -> { };
            channel.basicConsume(QUEQUE_NAME, true, dc, cc);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
