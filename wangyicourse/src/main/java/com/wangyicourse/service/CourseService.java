package com.wangyicourse.service;


import com.wangyicourse.entity.Course;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface CourseService {
    List<Course> findAllCourse();

    //获取课程及课程详情
    Course findCourseDetails(int courseid);
    //xinzeng
    boolean addSubscribe(int courseid);


    //    新增


    List<Course> getAll();

    List<Course> searchByKeys(String datemin, String datemax, String keys);

    int deleteById(int id);

    int addCourse(String coursename, BigDecimal courseprice, Integer coursehour, Integer discount, String validtime, Integer institutionid);

    int updateCourse(Course course);
}
