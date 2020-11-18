package com.wangyicourse.controller;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.Users;
import com.wangyicourse.service.StatisticsService;
import com.wangyicourse.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 15:03
 * 4
 */

@Controller
public class StatisticsController {


    @Autowired
    StatisticsService ss;

    @Autowired
    UsersService us;


    @RequestMapping(value = "/bar", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getBarData() {
        List<Map<String, Object>> data = new ArrayList<>();

        List<Course> topFiveCourse = ss.findTopFiveCourse();
        for (Course course : topFiveCourse) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", course.getCoursename());
            map.put("value", course.getSubscribenum());
            data.add(map);
        }
        return data;

    }


    @RequestMapping(value = "/line", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getLineData() {
        List<Map<String, Object>> data = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        Date Time0 = null;

        try {
            Time0 = sdf.parse("2020-3-1");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Users> usAllBeforeTime = us.getAllBeforeTime(Time0);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "更早以前");
        map.put("value", usAllBeforeTime.size());
        data.add(map);


        Date startTime1 = null;
        Date endTime1 = null;
        try {
            startTime1 = sdf.parse("2020-3-1");
            endTime1 = sdf.parse("2020-4-1");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Users> allByTime1 = us.getAllByTime(startTime1, endTime1);
        map = new HashMap<String, Object>();
        map.put("name", "三个月前");
        map.put("value", allByTime1.size());
        data.add(map);


        Date startTime2 = null;
        Date endTime2 = null;
        try {
            startTime2 = sdf.parse("2020-5-1");
            endTime2 = sdf.parse("2020-6-1");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Users> allByTime2 = us.getAllByTime(startTime2, endTime2);
        map = new HashMap<String, Object>();
        map.put("name", "两个月前");
        map.put("value", allByTime2.size());
        data.add(map);


        Date startTime3 = null;
        Date endTime3 = null;
        try {
            startTime3 = sdf.parse("2020-6-1");
            endTime3 = sdf.parse("2020-7-1");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Users> allByTime3 = us.getAllByTime(startTime3, endTime3);
        map = new HashMap<String, Object>();
        map.put("name", "一个月前");
        map.put("value", allByTime3.size());
        data.add(map);


        return data;
    }


    @RequestMapping(value = "/pie", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getPieData() {

        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();

        int nanNum = ss.getNanNum();
        int nvNum = ss.getNvNum();

        map.put("name", "男");
        map.put("value", nanNum);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "女");
        map.put("value", nvNum);
        data.add(map);


        return data;


    }


}
