package dxc.produceConsumer;

public class getStudent implements Runnable {

    private Student s;

    public getStudent(Student s) {
        this.s = s;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (s) {

                if(!s.flag){
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(s.name + "......." + s.age);

                s.flag=false;
                s.notify();
            }
        }


    }
}
