package com.zxq.test;


import com.zxq.dao.AccountDao;
import com.zxq.dao.impl.AccountDaoImpl;
import com.zxq.service.AccountService;
import com.zxq.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 2 * @Author: com.zxq
 * 3 * @Date: 2020/7/17 20:20
 * 4
 */

public class test {

    /**
     * 获取spring的ioc核心容器，并根据id获取对象
     * ApplicationContext的三个常用实现类：
     * <p>
     * ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。(更常用)
     * FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件(必须有访问权限）
     * <p>
     * AnnotationConfigApplicationContext：它是用于读取注解创建容器的，是明天的内容。
     * <p>
     * <p>
     * 核心容器的两个接口引发出的问题：
     * *  ApplicationContext:     单例对象适用              采用此接口
     * *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。
     * 也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
     * *
     * *  BeanFactory:            多例对象使用
     * *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。
     * 也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     *
     * @param args
     */
    public static void main(String[] args) {


//获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

//        这是验证生命周期的
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");


//根据id获取Bean对象
        AccountService as1 = (AccountService) ac.getBean("accountService");

//        AccountDao adao = ac.getBean("accountDao", AccountDao.class);
//        AccountDao dao=new AccountDaoImpl();
        System.out.println(as1);
//        System.out.println(adao);

        as1.saveAccount();

        ac.close();


//        AccountService as2 = (AccountService) ac.getBean("accountService");
//        System.out.println(as1==as2);
    }
}
