package javase___zhiXing__SunXu;

public class test {
    public static void main(String[] args) {

        person d = new person();
        System.out.println("年龄：" + d.getAge() + "身高：" + d.getHeight());
        d.walk(50);


        person d1 = new person(20,180);
        System.out.println("年龄：" + d1.getAge() + "身高：" + d1.getHeight());
        d1.walk(100);

        person d2=new person(30,2);
        d2.walk(45);
    }


}
