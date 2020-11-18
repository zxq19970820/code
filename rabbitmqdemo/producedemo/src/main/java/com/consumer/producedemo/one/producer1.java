package com.consumer.producedemo.one;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

//模拟生产者发送消息
public class producer1 {

    //定义队列名称
    private static  final String QUEQUE_NAME="hello";


    public static void main(String[] args) {
//     1)   与MQ连接
        ConnectionFactory cf=new ConnectionFactory();

//     2)   设置连接工厂相关配置
        cf.setHost("127.0.0.1");
        cf.setPort(5672);  //amqp端口
        cf.setUsername("guest");
        cf.setPassword("guest");
        cf.setVirtualHost("/");//设置虚拟机


        Connection connection=null;
        Channel channel=null;

        try {
            connection=cf.newConnection();

            //3)创建通道
            channel=connection.createChannel();
            //4)通道与队列关联

            //queue队列名称
            //durable是否持久化，true表示mq重启队列是还在

            //exclusive表示是否独占连接
            //autoDelete：自动删除
            //arguments扩展参数

            //                  string queue,boolean durable, boolean exclusive,boolean autoDelete,Map<String,Object> arguments

            channel.queueDeclare(QUEQUE_NAME,false,false,false,null);

            //5)发送消息         String exchange   String routingkey   basicProperties props   byte[] body
            //exchange：交换机名称，默认的交换机
//            routingkey：路由key，如果使用默认交换机，路由key与队列名称一致
//            props:  消息属性
            //body：消息内容
            String message="hello123456789,world";

            channel.basicPublish("",QUEQUE_NAME,null,message.getBytes());
            System.out.println("生产者producer1发送消息："+message);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            //6)关闭通道
            if (channel!=null){
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }
            //7)关闭连接
            if (connection!=null){
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}














