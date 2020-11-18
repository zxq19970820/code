package com.abcd;

import java.util.Calendar;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {

        System.out.println("获取当前时间:");
        Date date=new Date();
        System.out.println(date);


        System.out.println("\n"+"时间戳时间");
        Date date1=new Date(1000*60);
        System.out.println(date1);


        System.out.println("Calender类获取时间");

        Calendar calendar=Calendar.getInstance();//获取当前时间的calender对象

        int year=calendar.get(Calendar.YEAR);//获取年
        int month=calendar.get(Calendar.MONTH)+1;//获取月，月起始为0，需要+1
        int date2=calendar.get(Calendar.DATE);//获取日
        int hour=calendar.get(calendar.HOUR);//获取时
        int minute=calendar.get(calendar.MINUTE);//获取分
        int second=calendar.get(calendar.SECOND);//获取秒

        System.out.println("当前时间为"+year+"年"+month+"月"+date2+"日"+hour+"时"+minute+"分"+second+"秒");

        System.out.println("\n"+"自定义时间");
        Calendar calendar1=Calendar.getInstance();

//        设置时间为2020.8.8
        calendar1.set(2020,8,8);//设置当前时间
        calendar1.add(Calendar.DATE,100);

        int year1=calendar.get(Calendar.YEAR);//获取年
        int month1=calendar.get(Calendar.MONTH)+1;//获取月，月起始为0，需要+1
        int date3=calendar.get(Calendar.DATE);//获取日
        System.out.println("当前时间为"+year1+"年"+month1+"月"+date3+"日");



    }

}
