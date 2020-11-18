package mianShi.time;

import java.util.Calendar;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/17 21:17
 * 4
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int date = calendar.get(Calendar.DATE);
        System.out.println(date);

        calendar.add(Calendar.DATE, 1);
        int date1 = calendar.get(Calendar.DATE);
        System.out.println(date1);

        calendar.add(Calendar.DATE, -1);
        int date2 = calendar.get(Calendar.DATE);
        System.out.println(date2);

//        int month=calendar.get(calendar.MONTH)+1;
//        calendar.get(calendar.DATE);

    }
}
