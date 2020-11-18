package homework_____2_18___new;

public class Monster {
    private int hp;//生命值
    private int lv;//等级

    private int no;//怪物编号
    private boolean isDead;//是否死亡

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Monster(int lv,int no) {
        this.no = no;
        this.hp = lv * 1000;
        this.lv = lv;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }
}
