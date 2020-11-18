package homework_____2_18___new;

public class Hero {

    private int exp;//经验值   0~30(30*30*30+5*30)-80
    private int lv;//等级   0~30
    private int atk;//攻击力

    //击打
    public int attack(Monster monster) {
        System.out.println("英雄疯狂击打怪物中...");
        int result = 0;
        if (monster.getHp() >= this.atk) {
            //避免击打怪物出现怪物生命值为负数
            result = monster.getHp() - this.atk;
        }
        monster.setHp(result);//怪物剩余生命值
        return result;
    }

    public Hero(int exp, int lv, int atk) {
        this.exp = exp;
        this.lv = lv;
        this.atk = atk;
    }

    public Hero(int lv) {
        operExp(lv);
    }

    public void operExp(int lv) {
        if (lv >= 0 && lv <= 30) {
            this.lv = lv;
            this.exp = 30 * (lv * lv * lv + 5 * lv) - 80;
        }
    }

    public Hero() {
        this.exp = 0;

    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "exp=" + exp +
                ", lv=" + lv +
                '}';
    }
}
