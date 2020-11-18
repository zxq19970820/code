package duotai;

public class moster {

    public void weishi(pet p) {
        if (p instanceof dog){
            dog d=(dog) p;
            d.eat();
        }
        else if (p instanceof cat){
            cat c=(cat) p;
            c.eat();
        }else System.out.println("其他");

    }
}
