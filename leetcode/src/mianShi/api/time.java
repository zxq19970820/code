package mianShi.api;

import java.util.Calendar;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 9:47
 * 4
 */
public class time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);


        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        int hour2 = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);


        System.out.println(hour1);
        System.out.println(hour2);
        System.out.println("现在是" + year + "年" + month + "月" + date + "日" + hour1 + "点" + minute + "分" + second + "秒");


        System.out.println("------------------");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, 8,29 );
        calendar1.add(Calendar.DATE,1);

        int year1 = calendar1.get(Calendar.YEAR);
        int month1 = calendar1.get(Calendar.MONTH) + 1;
        int date1 = calendar1.get(Calendar.DATE);
        System.out.println("完成日期是" + year1 + "年" + month1 + "月" + date1 + "日" );


    }
}
