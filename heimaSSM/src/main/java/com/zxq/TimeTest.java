package com.zxq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/16 21:57
 * 4
 */
public class TimeTest {

    public static  void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(new Date());
        try {
            Date dd = simpleDateFormat.parse(format);
            System.out.println(format + "........." + dd);
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
    }
}