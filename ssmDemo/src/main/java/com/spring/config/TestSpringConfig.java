package com.spring.config;

import com.spring.entity.ClassRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfig {
    public static void main(String[] args) {

        //1)加载spring配置类  ,Spring创建SpringConfig对象
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

//        2）获取Bean---Spring创建的
        ClassRoom cr = (ClassRoom) ac.getBean("classRoom403");
        System.out.println(cr);

//        //        调用服务层UsersServiceImpl的getAllUsers()
//        UserServiceImpl usi = (UserServiceImpl) ac.getBean("usersServiceImpl");
//
//        Map<Integer, Users> allUsers = usi.getAllUsers();
//        System.out.println(allUsers);

    }

}
