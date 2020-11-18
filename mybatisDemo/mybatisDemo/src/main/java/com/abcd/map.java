package com.abcd;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<Integer,student> m=new HashMap<Integer, student>();

        m.put(1,new student("路人甲",10));
        m.put(2,new student("路人乙",20));
        m.put(3,new student("路人丙",30));

        System.out.println(m);
    }



}
