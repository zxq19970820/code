package com.wangyicourse.controller;

import com.wangyicourse.entity.Institution;
import com.wangyicourse.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/25 13:33
 * 4
 */

@Controller
@RequestMapping("/institution")

public class InstitutionController {

    @Autowired
    private InstitutionService is;

    @RequestMapping("findbyname1")
    @ResponseBody
    public ModelAndView findByName(String name, Model model) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/jigou/jigou-list");
        List<Institution> byName = is.findByName1(name);
        model.addAttribute("jigou1", byName);
        return mav;

    }

    @RequestMapping("findbyname2")
    @ResponseBody
    public ModelAndView findByName2(String name, Model model) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/jigou/jigou-del");
        List<Institution> byName = is.findByName2(name);
        model.addAttribute("jigou2", byName);
        return mav;

    }

    @RequestMapping("/deletebyid")
    @ResponseBody
    public int deleteById(int id) {
        System.out.println("controller接收到的课程id为。。。。" + id);
        int i = is.deleteById(id);
        System.out.println(i);
        return i;
    }

    @RequestMapping("/huifubyid")
    @ResponseBody
    public int huiFuById(int id) {
        int i = is.HuiFuById(id);
        System.out.println(i);
        return i;
    }

    @RequestMapping("/addjigou")
    public String addJiGou(Institution institution, Model model) {
        int i = is.addJiGou(institution);
        System.out.println("成功插入" + i + "条机构数据");
        List<Institution> allJIGouByState = is.getAllJIGouByState("已启用");
        System.out.println(allJIGouByState);
        model.addAttribute("jigou1", allJIGouByState);
        return "jigou/jigou-list";

    }

    @RequestMapping("/updatejigou")
    public String updateCourse(Institution it, Model model) {
        System.out.println("controller接收到的course为："+it);

        is.updateJiGou(it);
        List<Institution> all = is.getAllJIGouByState("已启用");
        model.addAttribute("jigou1", all);
        return "jigou/jigou-list";

    }


}
