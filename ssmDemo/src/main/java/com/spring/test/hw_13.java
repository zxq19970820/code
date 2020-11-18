package com.spring.test;

import com.spring.entity.Cart;

import com.spring.entity.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hw_13 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("hw_413.xml");

        System.out.println("---------用户-----------");
        Users u1 = (Users) ac.getBean("u1");
        System.out.println(u1);


        System.out.println("\n" + "---------购物车-------");
        Cart c1 = (Cart) ac.getBean("c2");
        System.out.println(c1);


    }
}
