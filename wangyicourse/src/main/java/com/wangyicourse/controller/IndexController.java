package com.wangyicourse.controller;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.Institution;
import com.wangyicourse.entity.Users;
import com.wangyicourse.service.CourseService;

import com.wangyicourse.service.InstitutionService;
import com.wangyicourse.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {


    @Autowired
    private UsersService usersService;

    @Autowired
    private InstitutionService institutionService;

    @Autowired
    private CourseService courseService;


    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/tologin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/welcome")
    public String toWelcome() {
        return "welcome";
    }


    @RequestMapping("/course-list")
    public String toProductBrand(Model model) {
        System.out.println("成功访问....获取所有课程的controller");

        List<Course> all = courseService.getAll();
//        System.out.println(all);
        model.addAttribute("allcourse", all);
        return "course/article-list";
    }


    @RequestMapping("/member-list")
    public String toMemberList(Model model) {
        System.out.println("controller-----------");

        List<Users> allUserss = usersService.getAllByState("启用");
        System.out.println(allUserss);
        model.addAttribute("users1", allUserss);
        return "member/member-list";
    }

    @RequestMapping("/member-del")
    public String toMemberDel(Model model) {

        List<Users> allUserss = usersService.getAllByState("删除");
        System.out.println(allUserss);
        model.addAttribute("users2", allUserss);
        return "member/member-del";
    }


    @RequestMapping("/admin-role")
    public String toAdminRole() {
        return "admin/admin-role";
    }

    @RequestMapping("/admin-permission")
    public String toAdminPermission() {
        return "admin/admin-permission";
    }

    @RequestMapping("/admin-list")
    public String toAdminList() {
        return "admin/admin-list";
    }


    @RequestMapping("/charts1")
    public String toCharts1() {
        System.out.println("controller访问成功");
        return "charts/charts-1";
    }


    @RequestMapping("/charts2")
    public String toCharts2() {
        return "charts/charts-2";
    }

    @RequestMapping("/charts3")
    public String toCharts3() {
        return "charts/charts-3";
    }

    @RequestMapping("/charts4")
    public String toCharts4() {
        return "charts/charts-4";
    }

    @RequestMapping("/charts5")
    public String toCharts5() {
        return "charts/charts-5";
    }

    @RequestMapping("/charts6")
    public String toCharts6() {
        return "charts/charts-6";
    }

    @RequestMapping("/charts7")
    public String toCharts7() {
        return "charts/charts-7";
    }


    @RequestMapping("/jigou-list")
    public String toJiGouList(Model model) {
        List<Institution> allJIGouByState = institutionService.getAllJIGouByState("已启用");
        System.out.println(allJIGouByState);
        model.addAttribute("jigou1", allJIGouByState);
        return "jigou/jigou-list";
    }

    @RequestMapping("/jigou-del")
    public String toJiGouDel(Model model) {
        List<Institution> allJIGouByState = institutionService.getAllJIGouByState("已删除");
        System.out.println(allJIGouByState);
        model.addAttribute("jigou2", allJIGouByState);
        return "jigou/jigou-del";
    }

    @RequestMapping("/touseradd")
    public String touseradd() {
        return "member/member-add";
    }

    @RequestMapping("/useradd")
    public String touserUpdate() {
        return "member/member-add";
    }

    @RequestMapping("tocourseadd")
    public String tocourse() {

        return "course/course-add";
    }

    @RequestMapping("tocourseupdate1")
    @ResponseBody
    public String tocourseUpdate1(int id, Model model) {
        System.out.println(id);
        model.addAttribute("courseId", id);

        return id + "";
    }

    @RequestMapping("tocourseupdate2")
    public String toCourseUpdate2() {

        return "course/update";
    }


    @RequestMapping("touserupdate1")
    @ResponseBody
    public String toUserUpdate1(int id, Model model) {
        System.out.println(id);
        model.addAttribute("courseId", id);
        System.out.println("跳转修改用户页controller访问成功");
        return id + "";
    }

    @RequestMapping("touserupdate2")
    public String toUserUpdate2() {

        return "member/passwordr-update";
    }


    @RequestMapping("toaddjigou")
    public String tojigouadd() {

        return "jigou/jigou-add";
    }


    @RequestMapping("tojigouupdate1")
    @ResponseBody
    public String toJiGouUpdate1(int id, Model model) {
        System.out.println(id);
        model.addAttribute("courseId", id);
        System.out.println("跳转修改机构页controller访问成功");
        return id + "";
    }

    @RequestMapping("tojigouupdate2")
    public String toJiGouUpdate2() {

        return "jigou/passwordr-update";
    }

}
