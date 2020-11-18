package com.zxq.test;

import com.zxq.factory.dataFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/1 15:11
 * 4
 */


//初始化时检验数据库连接
public class datatest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        dataFactory df = (dataFactory) ac.getBean("da");
        System.out.println(df);

    }
}
