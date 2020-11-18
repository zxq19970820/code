package lol;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Lol {
    public static void main(String[] args) throws InterruptedException {

        start();
    }

    public static void start() {


        System.out.println("请输入怪物数量：");

        Scanner sn = new Scanner(System.in);
        int in = sn.nextInt();

        LinkedList<LolMonster> ll = new LinkedList<LolMonster>();

        for (int i = 1; i <= in; i++) {
            ll.add(new LolMonster(i));
        }

        LolHero lh = new LolHero();

        lh.setLevel(1);
        lh.setAtk(100);

        System.out.println();
        System.out.println("游戏开始！");

        Iterator<LolMonster> it = ll.iterator();
        int p = 1;
        while (it.hasNext()) {
            LolMonster lm = it.next();
            System.out.println("第" + p + "只怪" + lm.toString());
            int i = lm.getLevel();
            int hi = lh.getLevel();
            int num = 1;
            System.out.println("英雄攻击力：" + lh.getAtk() + "英雄等级" + hi);
            while (true) {
                try {
                    double a = lh.hit(lm);
                    int lv = lh.getLevel();

                    Thread.sleep(2000);

                    System.out.println();
                    System.out.println("--------------开始第" + p + "只怪第" + (num++) + "次攻击----------------");
                    System.out.println();
                    System.out.println("英雄攻击力：" + lh.getAtk() + "英雄等级" + lv);
                    lm.mySetLevel(i++);
                    lh.setLevel(++hi);
                    System.out.println("怪物血量：" + a + "怪物等级" + lm.getLevel());
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println();
                    if (a < lh.getAtk()) {
                        System.out.println();
                        System.out.println("--------------第" + p + "只怪攻击结束----------------");
                        System.out.println("英雄攻击力：" + lh.getAtk() + "英雄等级" + lh.getLevel());
                        System.out.println("怪物血量：" + 0 + "怪物等级" + lm.getLevel());
                        System.out.println("第" + p + "只怪死了");
                        System.out.println("-------------------------------------");
                        System.out.println();
                        num = 1;
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            p++;
        }
    }
}
