package com.spring.aaa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a {
    public static void main(String[] args) throws ParseException {
        System.out.println("123");


        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        System.out.println("sd............" + sd);

        String format = sd.format(date);
        System.out.println("format........" + format);

        Date parse = sd.parse(format);
        System.out.println("parse...." + parse);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("今天的日期：" + df.format(date));
        System.out.println("两天前的日期：" + df.format(new Date(date.getTime() - 2 * 24 * 60 * 60 * 1000)));
        System.out.println("三天后的日期：" + df.format(new Date(date.getTime() + 3 * 24 * 60 * 60 * 1000)));


    }
}
