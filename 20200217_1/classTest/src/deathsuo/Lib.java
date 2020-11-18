package deathsuo;

public class Lib {

    public  int egg=0;

    public boolean isFull(){
        return egg==5;
    }

    public  boolean isEmpty(){
        return egg==0;
    }

    public static void main(String[] args) {
        Lib l=new Lib();

        new Hen(l,"下蛋鸡").start();
        new Human(l,"工作人员").start();
    }
}
