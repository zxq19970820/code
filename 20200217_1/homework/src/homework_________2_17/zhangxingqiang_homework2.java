package homework_________2_17;

import java.util.ArrayList;
import java.util.Scanner;

public class zhangxingqiang_homework2 {
    public static void main(String[] args) {

        System.out.println("请输入一个整数");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        int num = judge(a);
        System.out.println("输入的数为" + num + "位数");

        System.out.println("逆序输出为");
        nixu(a);
    }
    private static void nixu(int a) {
       while(a>10){
            int x=a%10;
            System.out.print(x+" ");
            a=a/10;
        }
        System.out.print(a+" ");
    }
    private static int judge(int a) {
        int x = 1;
        while ((a / 10) > 1) {
            a = a / 10;
            x++;
        }
        return x;
    }
}
