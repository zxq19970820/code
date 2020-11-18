package duotai;

public class cat extends pet {

    public cat() {
    }

    public cat(String name) {
        super(name);
    }


    public void sayHi() {
        System.out.println(getName() + "喵喵");
    }

    public void eat() {
        System.out.println("吃鱼");
    }
}
