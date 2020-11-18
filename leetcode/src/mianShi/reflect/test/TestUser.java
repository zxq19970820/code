package mianShi.reflect.test;

import mianShi.reflect.domain.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 先编译成User.class,运行，User.class加载到内存，面向对象，也得管理字节码文件
 * Class管理，都是该类的对象
 */
public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //想获取User类的Class对象
        Class clazz = Class.forName("mianShi.reflect.domain.Person");

        //2
        User user1 = new User();
        Class<? extends User> clazz2 = user1.getClass();

        //3
        Class<User> aClass = User.class;

        //创建
        User user = (User) aClass.newInstance();
        user.setUsername("rose");
        user.setPassword("123");
        System.out.println(user);
        System.out.println("&&&&&&&&&&&&&&&&&&&&");

        //获取所有的构造方法,公共的，public修饰，如果要获取所有getDeclaredConstructors
        Constructor[] constructors = clazz.getConstructors();
        //遍历数组
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
        //想要获取第二个参数
        Constructor constructor = aClass.getConstructor(String.class, String.class);
        //调用方法
        User user2  = (User) constructor.newInstance("jack", "abc");
        System.out.println(user2);
        System.out.println("============================");

        //获取属性，可以通过名称获取一个，也可以获取所有的，public  如果getDeclaredField
        Field username = aClass.getDeclaredField("username");
        //设置私有的可以访问
        username.setAccessible(true);
        username.set(user2,"zhangsan");
        System.out.println(user2);

        System.out.println("**************************");

        Method method = aClass.getMethod("setPassword", String.class);
        //调用方法
        method.invoke(user2,"xyz");
        System.out.println(user2);
    }
}
