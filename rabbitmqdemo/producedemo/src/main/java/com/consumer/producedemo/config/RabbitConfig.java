package com.consumer.producedemo.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//RabbitMQ的配置类
@Configuration
public class RabbitConfig {

//    加载配置属性,并赋值

    @Value("127.0.0.1")
    private String host;
    @Value("5672")
    private int port;
    @Value("guest")
    private String username;
    @Value("guest")
    private String password;

    //发布订阅模式：2个队列，1个交换机
    public static final String QUEQUE_Email = "queue_email_new";
    public static final String QUEQUE_SMS = "queue_sms_new";

    //    交换机名称
    public static final String EXCHANGE_NAME = "exchange_direct_new";

    //    路由key
    public static final String ROUTINGKEY_EMAIL = "routingkey.#.email";
    public static final String ROUTINGKEY_SMS = "routingkey.#.sms";


    //    创建connectionFactory
    @Bean  //import org.springframework.amqp.rabbit.connection.ConnectionFactory;
    public ConnectionFactory connectionFactory() {

        //     1)   与MQ连接
        CachingConnectionFactory cf = new CachingConnectionFactory(host, port);


        cf.setUsername(username);
        cf.setPassword(password);

        return cf;
    }


    //    2)创建RabbiTemplate,单例模式
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)  //默认，可以不加
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        return rabbitTemplate;
    }

    //    3）创建交换机   直连型，需要路由key
    @Bean
    public DirectExchange createExchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }


    //    4）创建2个队列
    @Bean
    public Queue createEmailQueue() {
        return new Queue(QUEQUE_Email);
    }

    @Bean
    public Queue createSMSQueue() {
        return new Queue(QUEQUE_SMS);
    }


    //    5）队列绑定交换机    with:指定路由key
    @Bean
    public Binding bindingEmail() {
        return BindingBuilder.bind(createEmailQueue()).to(createExchange()).with(ROUTINGKEY_EMAIL);
    }

    @Bean
    public Binding bindingSMS() {
        return BindingBuilder.bind(createSMSQueue()).to(createExchange()).with(ROUTINGKEY_SMS);
    }


}
