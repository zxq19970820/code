package zhangxingqiang__homework_2_18__new;

public class hero {
    private int EXP;          //经验
    private int dj;           //等级
    private int hitnum;


    public hero() {
        this.EXP = 0;
    }
    public hero(int lv) {
        newExp(lv);
    }

    public hero(int EXP, int dj, int hitnum) {
        this.EXP = EXP;
        this.dj = dj;
        this.hitnum = hitnum;
    }

    public int getEXP() {
        return EXP;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public int getDj() {
        return dj;
    }

    public void setDj(int dj) {
        this.dj = dj;
    }

    public int getHitnum() {
        return hitnum;
    }

    public void setHitnum(int hitnum) {
        this.hitnum = hitnum;
    }

    public int hit(monster mo) {
        System.out.println("英雄开始打野");
        int x = this.hitnum - (mo.getHp());
        if (x <= 0) {
            mo.setHp(0);
            return 0;
        } else
            mo.setHp(x);
            return x;
    }

    public void newExp(int lv) {
        if (lv >= 0 && lv <= 30) {
            this.dj = lv;
            this.EXP = 30 * (lv * lv * lv + 5 * lv) - 80;
        }
    }



    @Override
    public String toString() {
        return "hero{" +
                "EXP=" + EXP +
                ", dj=" + dj +
                ", hitnum=" + hitnum +
                '}';
    }
}
