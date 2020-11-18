package dxc.produceConsumer;

public class setStudent implements Runnable {

    Student s;
    int x = 0;

    public setStudent(Student s) {
        this.s = s;
    }

    public void run() {

        while (true) {


            synchronized (s){

                if (s.flag){

                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x%2 == 0) {
                    s.name = "林青霞";
                    s.age = 27;
                }else {

                    s.name="刘意";
                    s.age=30;
                }
                x++;

                s.flag=true;
                s.notify();

            }

        }

    }
}
