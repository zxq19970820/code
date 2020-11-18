package com.zxq.shopuserproducer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 86186
 */
public class UserTest {
    public static void main(String[] args) throws Exception {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"producer.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }



}
