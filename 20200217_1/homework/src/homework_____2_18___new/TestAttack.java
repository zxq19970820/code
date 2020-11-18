package homework_____2_18___new;

import java.util.Random;

public class TestAttack {

    public static void main(String[] args) {

        Hero hero2 = new Hero(2);//等级   经验值
        hero2.setAtk(1000);//攻击力
        System.out.println(hero2);
        //
        Monster monster1 = new Monster(2,1);//等级   生命值   编号    isDead=false
        Monster monster2 = new Monster(3,2);
        Monster monster3 = new Monster(2,3);
        Monster monster4 = new Monster(6,4);
        //
        Monster[] monsters = new Monster[4];
        monsters[0]=monster1;
        monsters[1]=monster2;
        monsters[2]=monster3;
        monsters[3]=monster4;

        //提升等级和经验
        strongHero(hero2);
        for (Monster m:monsters){
            strongMonster(m);
        }
        //英雄攻打怪物
        boolean loop = false;
        do {   //攻击怪物：活着的怪物，生命值>0，isDead=false    aliveMonsters
            Monster[] aliveMonsters = new Monster[4];
            int aliveNum = 0;//表示存活怪物数
            //检查是否所有怪物都死亡-----修改loop变量==true,怪物没死
            //--从monsters数组中找到存活的怪物
            for(int i = 0 ; i < monsters.length ; i++ ){
                if(!monsters[i].isDead()){//怪物没有死亡
                    loop = true;
                    aliveMonsters[aliveNum] = monsters[i];
                    aliveNum ++;
                }else{
                    loop = false;//怪物死亡
                }
            }
            if(!loop) {         //loop==false
                break;//所有怪物死亡，终止循环
            }
            //随机数   Math.random()   0-1小数
            // aliveMonsters  下标



//            int n = (int) Math.floor(Math.random() * aliveNum);
            Random r=new Random();
            int n=r.nextInt(aliveNum);



            //targetMonster 目标要被攻击的怪物
            Monster targetMonster = aliveMonsters[n];
            System.out.println("英雄攻打" +targetMonster.getNo() + "号怪物.....");
            if(targetMonster.isDead()){
                continue;//终止当前次循环，开始下一次循环
            }
            int monsterHp = hero2.attack(targetMonster);
            System.out.println(targetMonster.getNo() +"号怪物剩余生命值：" + monsterHp);
            if(monsterHp==0){
                targetMonster.setDead(true);//
                System.out.println("---------------"+targetMonster.getNo() +"号怪物死亡------------");
            }
        }while(loop);
        System.out.println("打怪结束，英雄胜利");
    }

    public static void strongMonster(Monster monster){
        System.out.println("怪物初始等级="+monster.getLv()+",生命值="+monster.getHp());
        monster.setLv(monster.getLv()+1);
        monster.setHp(monster.getLv()*1000);
        System.out.println("---怪物加强完成---");
        System.out.println("怪物加强后等级="+monster.getLv()+",生命值="+monster.getHp());
    }

    public static void strongHero(Hero hero){
        System.out.println("英雄初始等级="+hero.getLv()+",经验值值="+hero.getExp());
        hero.setLv(hero.getLv()+6);
        hero.operExp(hero.getLv());
        hero.setExp(hero.getExp()+1000);
        System.out.println("---英雄加强完成---");
        System.out.println("英雄加强后等级="+hero.getLv()+",经验值值="+hero.getExp());
    }
}
