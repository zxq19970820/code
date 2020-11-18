package mianShi.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/17 21:34
 * 4
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String format = df.format(date);
        System.out.println(format);


        Date parse = df.parse(format);
        System.out.println(parse);

    }
}
