package wine;

public class WhiteWine extends Wine implements Drinkable {

    public WhiteWine() {
        super();
    }

    public WhiteWine(int degree, String name) {
        super(degree, name);
    }

    @Override

    public void drink() {
        System.out.println("喝白酒,"+"品牌是"+name+",度数是:"+degree);
    }
}
