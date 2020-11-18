package wine;

public class XIaoMing {
    public void tatseWine(Wine w) {
        if (w instanceof RedWine) {
            RedWine red = (RedWine) w;
            red.drink();
        } else if (w instanceof WhiteWine) {
            WhiteWine white = (WhiteWine) w;
            white.drink();
        } else {
            System.out.println("其他");
        }
    }
}
