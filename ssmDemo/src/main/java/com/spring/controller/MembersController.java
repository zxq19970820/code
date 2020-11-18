package com.spring.controller;


import com.spring.entity.Members;
import com.spring.entity.MembersExample;
import com.spring.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MembersController {

    @Autowired
    private MembersService membersService;

    //跳转到会员列表页面并传递数据
    @RequestMapping("/member-list")
    //1)返回值String(跳转的页面），方法形参Map(绑定数据）
    //2)返回值String(跳转的页面），方法形参Model(绑定数据）
    //3)返回值ModelAndView(跳转的绑定数据）
    public ModelAndView toMemberList() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("member-list");
//        mav.addObject("members", membersService.selectByState("已启用"));
        mav.addObject("members", membersService.selectAll());
        return mav;

    }


    @RequestMapping("/searchMember")
    public ModelAndView selectByKeys(String datemin, String datemax, String keys) {
        System.out.println("起始时间为：" + datemin + "------" + "结束时间为："
                + datemax + "-----" + "输入的搜索关键字为:" + keys);
        ModelAndView mav = new ModelAndView();

        mav.setViewName("member-list");    //返回的目标路径  member-list.jsp

        MembersExample me = new MembersExample();
        List<Members> members = null;

        if (datemin != null && datemax != null) {
//            //根据日期查询
//
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//            Date startTime = null;
//            Date endTime=null;
//            try {
//                startTime = sdf.parse(datemin);
//                endTime = sdf.parse(datemax);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            me.createCriteria().andBirthdateBetween(startTime, endTime);

        }
        if (keys != null) {

            me.or().andPhoneLike("%" + keys + "%");
            me.or().andEmailLike("%" + keys + "%");
            me.or().andUsernameLike("%" + keys + "%");

        }
        members = membersService.searchByKeys(me);

        System.out.println(me);
        for (Members member : members) {
            System.out.println(member);
        }

        mav.addObject("members", members);
        return mav;
    }


    //    //控制器处理异步请求  返回值就是响应结果，请求和响应式同一个界面
    @RequestMapping("/searchMemberAjAx")
    @ResponseBody
    public List<Members> searchMemberAjax(String datemin, String datemax, String keys) {
        List<Members> members = null;
        MembersExample me = new MembersExample();
        if (datemin != null && datemax != null) {
            //根据日期查询
//            me.createCriteria().andBirthdateBetween()
            members = membersService.searchByKeys(me);
        } else if (keys != null) {
            me.or().andEmailLike("%" + keys + "%");
            me.or().andUsernameLike("%" + keys + "%");
            me.or().andPhoneLike("%" + keys + "%");
            members = membersService.searchByKeys(me);
        }
        return members;

    }


    @RequestMapping("updateState")
    @ResponseBody
    public String updateState(@RequestParam("id") String id) {
        Members members = new Members();
        members.setId(Integer.parseInt(id));
        members.setState("已停用");
        membersService.updateMemberStateById(members);
        return "修改成功";

    }


    @RequestMapping("/searchMember01")
    public ModelAndView searchByKeys(String datemin, String datemax, String keys) {
        System.out.println("起始时间为：" + datemin + "------" + "结束时间为：" + datemax + "-----" + "输入的搜索关键字为" + keys);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("member-list");

        List<Members> members = null;
        if (datemin != null && datemax != null) {

            members = membersService.selectByTime(datemin, datemax);

        } else if (keys != null) {

            members = membersService.selectByKeys(keys);

        }
        mav.addObject("members", members);
        return mav;
    }
}





















