package FanShe.constructor;

import java.lang.reflect.Constructor;

public class constructor {
    public static void main(String[] args) {

        try {
            //获取字节码文件对象
            Class c=Class.forName("jihe.mapTest.Student");

            //返回构造函数个数及数据类型字节码
            Constructor cs=c.getConstructor();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
