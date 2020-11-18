package com.zxq.shopuserconsumer;

import com.zxq.shopinterface.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author 86186
 */


public class OrderTest {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "order.xml");

        context.start();

        OrderService orderService = (OrderService)context.getBean(OrderService.class);

        orderService.initOrder(1);

        System.in.read();
    }
}
