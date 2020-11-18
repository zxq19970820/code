package wine;

public class TestWine {
    public static void main(String[] args) {

        RedWine r1=new RedWine(20,"red1");
        RedWine r2=new RedWine(25,"red2");
        WhiteWine w1=new WhiteWine(40,"white1");
        WhiteWine w2=new WhiteWine(50,"white2");

        Wine [] arr=new Wine[]{r1,r2,w1,w2};

        XIaoMing xm=new XIaoMing();
        for(int i=0;i<4;i++){
            xm.tatseWine(arr[i]);
        }
    }


}
