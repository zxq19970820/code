package com.zxq.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:43
 * 4
 */
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("请传入参数");
        }

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");

        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换异常");
        }

    }
}
