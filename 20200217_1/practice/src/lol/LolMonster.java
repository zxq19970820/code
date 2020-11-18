package lol;

public class LolMonster {

    private float hp;
    private int level;

    public LolMonster(int level){
        this.level = level;
        this.hp = (float) (level*10000);
    }
    public float getHp() {
        return hp;
    }

    public void mySetHp(float hp){
        this.hp = hp;
    }
    public void mySetLevel(int level){
        if(level>9){
            //System.out.println("怪满级了");
            return;
        }
        this.hp = this.hp + level*1000;
        this.level = level;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return
                "血量" + hp +
                "等级" + level ;
    }
}
