package zhangxingqiang__homework_2_18__new;

public class test {
    public static void main(String[] args) {
        hero he = new hero(1);
        he.setHitnum(1000);
        System.out.println(he);

        monster mo1 = new monster(1, 1);
        monster mo2 = new monster(2, 2);
        monster mo3 = new monster(3, 3);
        monster mo4 = new monster(4, 4);

        monster[] arr = new monster[]{mo1, mo2, mo3, mo4};
        strongHero(he);
        for (monster m : arr) {
            strongMonster(m);
        }

        boolean loop = false;
        do {
            monster[] aliveMonsters = new monster[4];
            int aliveNum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].isDeath()) {
                    loop = true;
                    aliveMonsters[aliveNum] = arr[i];
                    aliveNum++;
                } else {
                    loop = false;
                }
            }
            if (!loop) {
                break;
            }

            int n = (int) Math.floor(Math.random() * aliveNum);

            monster targetMonster = aliveMonsters[n];
            System.out.println("英雄击打" + targetMonster.getNO() + "号怪物.....");
            if (targetMonster.isDeath()) {
                continue;
            }
            int monsterHp = he.hit(targetMonster);
            System.out.println(targetMonster.getNO() + "号怪物剩余生命值：" + monsterHp);
            if (monsterHp == 0) {
                targetMonster.setDeath(true);//
                System.out.println("---------------" + targetMonster.getNO() + "号怪物死亡------------");
            }
        } while (loop);
        System.out.println("野怪死光了");
    }

    public static void strongMonster(monster monster) {
        System.out.println("怪物初始等级=" + monster.getDj() + ",生命值=" + monster.getHp());
        monster.setDj(monster.getDj() + 1);
        monster.setHp(monster.getDj() * 1000);
        System.out.println("---怪物加强完成---");
        System.out.println("怪物加强后等级=" + monster.getDj() + ",生命值=" + monster.getHp());
    }

    public static void strongHero(hero hero) {
        System.out.println("英雄初始等级=" + hero.getDj() + ",经验值值=" + hero.getEXP());
        hero.setDj(hero.getDj() + 6);
        hero.newExp(hero.getEXP());
        hero.setEXP(hero.getEXP() + 1000);
        System.out.println("---英雄加强完成---");
        System.out.println("英雄加强后等级=" + hero.getDj() + ",经验值值=" + hero.getEXP());
    }
}

