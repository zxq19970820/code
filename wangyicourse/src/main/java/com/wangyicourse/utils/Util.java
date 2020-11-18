package com.wangyicourse.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class Util {


    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        String finalreslut=newDate+result;
        return finalreslut;
    }

    public static void main(String[] args) {
        System.out.println(Util.getOrderIdByTime());
    }
}
