package com.itheima.proxy.myself;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/11 14:04
 * 4
 */


/**
 * 动态代理，需要写实现类（被代理类），如果为每一个被代理类创建代理类的话，工作量太大，不易维护
 * 在程序运行的过程中，jdk动态生成代理对象，调用相应方法，实现功能
 * Proxy：类，代理类
 * Object static newProxyInstance:动态地生成代理对象。
 * 参数：ClassLoader：类的加载器，代理类接口的类加载器 BuyHouse.class.getClassLoader()
 * Class<?>[] interfaces:代理类实现的接口列表（Class类型）BuyHouseImpl.class.getInterfaces()
 * InvocationHandlder:处理器，接口，里面有个invoke方法，接口不能创建对象，可以写实现类，现在不写，以匿名内部类的形式去创建
 */
public class BuyHouseProxy {


    //    方法的返回值就是代理对象
    public static void main(final String[] args) {

        final BuyHouseImpl bh = new BuyHouseImpl();

        Buyhouse buyhouse = (Buyhouse) Proxy.newProxyInstance(bh.getClass().getClassLoader(),
                bh.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

                        Object result = null;

                        System.out.println("买房前");
                        result = method.invoke(bh, args);
                        System.out.println("买房后");
                        return result;
                    }
                });
        buyhouse.buyHouse();


        //    创建要被代理类的对象
//        final BuyHouseImpl target = new BuyHouseImpl();
//
//        Buyhouse bh = (Buyhouse) Proxy.newProxyInstance(BuyHouseImpl.class.getClassLoader(),
//                BuyHouseImpl.class.getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//                //该方法就相当于咱们创建代理类，重写buyHouse方法，
//                //proxy：代理对象
//                //method:要调用的目标方法，买家的buyHouse方法
//                //args：执行目标方法需要的参数
//                //该方法的返回值，就是目标方法的返回值
//                //最终是让目标方法执行，反射的形式，第一个参数是对象，哪个对象的方法，目标对象（买家）
//                //匿名内部类中调用局部变量，被final修饰，
//                //在执行目标方法之前去执行增强的操作
//
//
//                System.out.println("买房前");
//                Object result = method.invoke(target, args);
//                System.out.println("买房后");
//                return result;
//            }
//        });
//
//        bh.buyHouse();
    }


}
