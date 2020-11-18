package duotai;

public class pet {
    protected String name;

    protected String getName() {
        return name;
    }


    public pet() {
    }

    public pet(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println(getName() + "hello");
    }

    public void eat() {
        System.out.println("吃");
    }
}
