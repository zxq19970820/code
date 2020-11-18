package duotai;

public class test {
    public static void main(String[] args) {
        pet p = new pet("宝宝");
        pet d = new dog("旺财");
        pet c = new cat("喵喵");
        p.sayHi();
        d.sayHi();
        c.sayHi();

        moster m=new moster();

        m.weishi(d);
        m.weishi(c);
        m.weishi(p);
    }
}
