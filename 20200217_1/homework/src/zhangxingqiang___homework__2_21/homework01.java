package zhangxingqiang___homework__2_21;

import java.util.*;

public class homework01 {
    public static void main(String[] args) {

        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        HashMap<Integer, cn> hm = new HashMap<Integer, cn> ();

        hm.put(2006,new cn(18,"意大利"));
        hm.put(2002,new cn(17,"巴西"));
        hm.put(1998,new cn(16,"法国"));
        hm.put(1994,new cn(15,"巴西"));
        hm.put(1990,new cn(14,"德国"));
        hm.put(1986,new cn(13,"阿根廷"));
        hm.put(1982,new cn(12,"意大利"));
        hm.put(1978,new cn(11,"阿根廷"));
        hm.put(1974,new cn(10,"德国"));
        hm.put(1970,new cn(9,"巴西"));
        hm.put(1966,new cn(8,"英格兰"));
        hm.put(1962,new cn(7,"巴西"));
        hm.put(1958,new cn(6,"巴西"));
        hm.put(1954,new cn(5,"德国"));
        hm.put(1950,new cn(4,"乌拉圭"));
        hm.put(1938,new cn(3,"意大利"));
        hm.put(1934,new cn(2,"意大利"));
        hm.put(1930,new cn(1,"乌拉圭"));

        Set<Integer> keyset =hm.keySet();

        if (keyset.contains(year)){
            System.out.println(year+"年是第"+hm.get(year).getNum()+"届世界杯，冠军是"+hm.get(year).getCountry());
        }
        else{
            System.out.println("没有举办世界杯。");
        }


    }


}
