package com.consumer.producedemo.three;


import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

//模拟生产者发送消息
public class producerPublish {

    //定义队列名称  邮件，短信
    private static final String QUEQUE_Email = "query_email";
    private static final String QUEQUE_sms = "query_sms";

    //    交换机名称
    private static final String EXCHANGE_NAME = "exchange_fanout";


    public static void main(String[] args) {
//     1)   与MQ连接
        ConnectionFactory cf = new ConnectionFactory();

//     2)   设置连接工厂相关配置
        cf.setHost("127.0.0.1");
        cf.setPort(5672);  //amqp端口
        cf.setUsername("guest");
        cf.setPassword("guest");
        cf.setVirtualHost("/");//设置虚拟机


        Connection connection = null;  //连接
        Channel channel = null;     //通道

        try {
            connection = cf.newConnection();

            //3)创建通道
            channel = connection.createChannel();

            //4)通道与队列关联

            //queue队列名称
            //durable是否持久化，true表示mq重启队列是还在
            //exclusive表示是否独占连接
            //autoDelete：自动删除
            //arguments扩展参数
            //                  string queue,boolean durable, boolean exclusive,boolean autoDelete,Map<String,Object> arguments

            //4声明两个队列
            channel.queueDeclare(QUEQUE_Email, false, false, false, null);
            channel.queueDeclare(QUEQUE_sms, false, false, false, null);

//            5)声明交换机(string exchange,string type)
//            exchange  交换机名称
//            type  交换机类型 “fanout”
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

//            6)交换机和队列绑定string queue,string exchange,string routingKey
//            queue  队列名称
//            exchange  交换机名字
//            routingKey：路由key，不能为null
            channel.queueBind(QUEQUE_Email, EXCHANGE_NAME, "");
            channel.queueBind(QUEQUE_sms, EXCHANGE_NAME, "");


//            7）发送消息到交换机
            //exchange：交换机名称，默认的交换机
//            routingkey：路由key，如果使用默认交换机，路由key与队列名称一致

            for (int i = 1; i <= 10; i++) {

                String message = "hello123456789,world,第" + i + "条消息";

//                String exchange,String routingkey, BasicProperties props,byte[] body;
                channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
                System.out.println("生产者producerPublish发送消息：" + message);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //6)关闭通道
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }
            //7)关闭连接
            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}














