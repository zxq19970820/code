package zhaungsimoshi;

public class zhuangShi implements huaTu {
    SanJiao sj = null;

    public zhuangShi(SanJiao sj) {
        this.sj = sj;
    }

    public void hua() {
        sj.hua();
        System.out.println("加边框");
    }
}
