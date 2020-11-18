package zhangxingqiang__homework_2_18__new;

public class monster {
    private int dj;
    private int hp;
    private  int NO;
    private boolean isDeath;

    public monster() {

    }
    public monster(int dj, int hp, int NO, boolean isDeath) {
        this.dj = dj;
        this.hp = hp;
        this.NO = NO;
        this.isDeath = isDeath;
    }


    public int getDj() {
        return dj;
    }
    public void setDj(int dj) {
        this.dj = dj;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNO() {
        return NO;
    }
    public void setNO(int NO) {
        this.NO = NO;
    }

    public boolean isDeath() {
        return isDeath;
    }
    public void setDeath(boolean death) {
        isDeath = death;
    }

    public monster(int lv,int no) {
        this.NO = no;
        this.hp = lv * 1000;
        this.dj = lv;
    }
}

