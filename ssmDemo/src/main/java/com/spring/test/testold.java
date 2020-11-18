package com.spring.test;


import com.spring.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testold {
    public static void main(String[] args) {

        System.out.println("-----手动创建的对象----");
        Student student = new Student();
        System.out.println(student);//地址


        //spring负责Student对象的创建，
        // Spring配置文件中添加  <bean id="stu1" class="com.spring.entity.Student"></bean>
//        只需要通过id获取对象

        System.out.println("\n" + "-------spring负责Student对象的创建-----");

        //1)读取配置文件，BeanFactory---->ApplicationContext  从类路径下加载配置文件
//        ApplicationContext   在初始化上下文时就实例化所有单例的Bean
        ApplicationContext ac = new ClassPathXmlApplicationContext("oldapplicationContext.xml");

        //2)通过id获取对象
        Student stu1 = (Student) ac.getBean("stu1");
        System.out.println(stu1);


        System.out.println("\n" + "----判断学生对象是否相等----");

        Student stu2 = (Student) ac.getBean("stu2");
        System.out.println(stu1.equals(stu2));     //false

        Student stu3 = (Student) ac.getBean("stu2");
        System.out.println(stu3.equals(stu2));     //true  xml文件中scope为"singleton"单例模式
        //false  scope为"singleton"单例模式


//        spring创建bean时，默认采取的是单例模式<bean>标签只会new一次对象


        System.out.println("\n" + "------ClassRoom与student关系1:1---");
        System.out.println(stu2);

        System.out.println("\n" + "--------");
        Student stu4 = (Student) ac.getBean("stu3");
        System.out.println(stu4);
    }
}













