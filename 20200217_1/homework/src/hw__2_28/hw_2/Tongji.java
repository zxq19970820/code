package hw__2_28.hw_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Tongji {

    public static void main(String[] args) {

        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入:");

        char [] arr=sc.nextLine().toCharArray();

        for (int i=0;i<arr.length;i++){

            if (!hm.containsKey(arr[i])){

                hm.put(arr[i],1);
            }

            else {
                int x=hm.get(arr[i]);
                hm.put(arr[i],(x+1));
            }
        }

        Set<Character> keyset=hm.keySet();

        Iterator<Character> it=keyset.iterator();

        while (it.hasNext()) {

            char key=it.next();
            int num=hm.get(key);
            System.out.println("字符\""+key+"\"出现的次数为:"+num);
        }



    }

}
