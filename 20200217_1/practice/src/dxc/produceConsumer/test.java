package dxc.produceConsumer;

public class test {
    public static void main(String[] args) {

        Student s=new Student();

        setStudent ss=new setStudent(s);
        getStudent gs=new getStudent(s);

        Thread t1=new Thread(ss);
        Thread t2=new Thread(gs);

        t1.start();
        t2.start();
    }

}
