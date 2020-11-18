package com.consumer.consumerdemo.three;

import com.rabbitmq.client.*;

//模拟邮件消费者
public class SMSConsumer {


    //定义队列名称  邮件
    private static final String QUEQUE_sms = "query_sms";

    //    定义交换机名称
    private static final String EXCHANGE_NAME = "exchange_fanout";


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

//          4  声明队列
            channel.queueDeclare(QUEQUE_sms, false, false, false, null);

//          5  声明交换机
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

//            6交换机和队列绑定
            channel.queueBind(QUEQUE_sms, EXCHANGE_NAME, "");


            //7)接收消息
            DeliverCallback dc = (str1, delivery) -> {
//                Delivery表示接收的消息
//                获取消息的内容
                byte[] msg = delivery.getBody();
//                byte[]-->string
                String message = new String(msg, "UTF-8");
                System.out.println("消费者consumer1接收的消息为" + message);
            };

            CancelCallback cc = str2 -> {
            };
            channel.basicConsume(QUEQUE_sms, true, dc, cc);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
