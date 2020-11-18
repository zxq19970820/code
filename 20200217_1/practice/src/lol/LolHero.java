package lol;

public class LolHero {
    private double exp;
    private int level;
    private float atk;
//    private LolMonster lm;

    public double hit (LolMonster lm){
        lm.mySetHp(lm.getHp() - atk);
        return lm.getHp();
    }
    public LolHero(){
        this.exp = 0;
    }
    public LolHero(double exp) {
        double i,j,k;
        double q = - (exp + 80.0)/30.0;
        double p = 5;
        i = Math.pow(q/2,2);
        j = Math.pow(p/3,3);
        k = Math.sqrt(i+j);
        this.level = (int)Math.ceil(Math.pow(-q/2+k,2));
    }

    public LolHero(int exp, int level, float atk) {
        if(level>=0 && level<31){
            this.exp = exp;
            this.level = level;
            this.atk = atk;
        }

    }

    public double getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level>=0 && level<31){
            this.level = level;
            this.atk = level*300;
            return;
        }else {
            this.level = 30;
           // System.out.println("级别错误");
        }

    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "LolHero{" +
                "exp=" + exp +
                ", level=" + level +
                ", atk=" + atk +
                '}';
    }


}
