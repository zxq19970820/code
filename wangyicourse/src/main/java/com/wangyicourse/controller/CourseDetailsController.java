package com.wangyicourse.controller;

import com.wangyicourse.entity.Course;
import com.wangyicourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/coursedetails")
public class CourseDetailsController {
    @Autowired
    CourseService courseService;

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/display")
    public Course displayCourseDetails(int courseid){
        return  courseService.findCourseDetails(courseid);
    }


}
