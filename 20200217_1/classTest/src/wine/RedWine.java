package wine;

public class RedWine extends Wine implements Drinkable {

    public RedWine() {
    }


    public RedWine(int degree, String name) {
        super(degree, name);
    }

    @Override
    public void drink() {
        System.out.println("喝红酒,"+"品牌是"+name+",度数是："+degree);
    }
}
