package test.reflect;

public class reflectDemo1 {
    public static void main(String[] args) {


        try {
            //Class.forName("全类名")
            Class cls1 = Class.forName("test.reflect.person");
            System.out.println(cls1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //类名.class
        Class cls2 = person.class;
        System.out.println(cls2);

        //对象.getclass
        person p = new person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

//比较文件在一次程序执行过程中产生的字节码文件是否是同一个
        System.out.println(cls2 == cls3);
    }
}
