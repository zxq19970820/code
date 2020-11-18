package duotai;

public class dog extends pet {

    public dog(String name) {
        super(name);
    }

    public dog() {
    }


    @Override
    public void sayHi() {
        System.out.println(getName() + "汪汪");
    }
    public void eat(){
        System.out.println("吃骨头");
    }
}
