package com.wangyicourse.controller;


import com.wangyicourse.entity.Course;
import com.wangyicourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping("/allCourses")
    @ResponseBody
    @CrossOrigin(value = "*")
    public List<Course> allCourses() {
        return courseService.findAllCourse();
    }



    //    新增

    @RequestMapping("/searchCourse")
    public ModelAndView selectByKeys(String datemin, String datemax, String keys) {
        System.out.println("起始时间为：" + datemin + "------" + "结束时间为："
                + datemax + "-----" + "输入的搜索关键字为:" + keys);
        ModelAndView mav = new ModelAndView();

        mav.setViewName("/course/article-list");
        List<Course> courses = courseService.searchByKeys(datemin, datemax, keys);


        mav.addObject("allcourse", courses);
        return mav;
    }

    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(int id) {
//        System.out.println("删除的controller访问成功");
//        System.out.println("接收到的课程id为：" + id);
        int i = courseService.deleteById(id);

        return i;
    }

    @RequestMapping("addcourse")
    public String addcourse(String coursename, BigDecimal courseprice, Integer coursehour, Integer discount, String validtime, Integer institutionid, Model model) {
        int i = courseService.addCourse(coursename, courseprice, coursehour, discount, validtime, institutionid);
        System.out.println(i);

        List<Course> all = courseService.getAll();
//        System.out.println(all);
        model.addAttribute("allcourse", all);
        return "course/article-list";
    }

    @RequestMapping("/updatecourse")
    public String updateCourse(Course course, Model model) {
        System.out.println("controller接收到的course为："+course);

        courseService.updateCourse(course);
        List<Course> all = courseService.getAll();
        model.addAttribute("allcourse", all);
        return "course/article-list";

    }

}
