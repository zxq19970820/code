package test___;

import java.util.Scanner;

public class anoth {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int i=sc.nextInt();

        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        System.out.println(result);

    }
}
