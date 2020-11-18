package com.example.controller;


import com.example.pojo.Staff;
import com.example.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @RequestMapping("getall")
    @ResponseBody
    public List<Staff> selectAll() {
        List<Staff> list = staffService.getAll();
        return list;
    }

    @RequestMapping("byid")
    @ResponseBody
    public Staff selectById(String id) {
        return staffService.getById(id);
    }

    @RequestMapping("byjob")
    @ResponseBody
    public List<Staff> selectByJob(String job) {
        return staffService.getByJob(job);
    }


    @RequestMapping("/joblike")
    @ResponseBody
    public List<Staff> jobLike(String job) {
        return staffService.getLikeJob(job);
    }

    @RequestMapping("/joblike2")
    @ResponseBody
    public List<Staff> jobLike2(String job) {
        return staffService.getLikeJob2(job);
    }


    @RequestMapping("/upd")
    @ResponseBody
    public String updateJob(String sid, String job) {
        Staff staff = new Staff();
        staff.setSid(sid);
        staff.setJob(job);
        if (staffService.updateJob(staff) > 0) {
            return "修改成功";
        } else return "修改失败";
    }

    @RequestMapping("selectAllStaff")
    public String selectAllStaff(ModelMap map) {
        List<Staff> all = staffService.getAll();


        map.addAttribute("allStaff", all);

        return "showStaff";

    }

    @RequestMapping("selectStaff")
    public String selectStaffByDname(String did, ModelMap map) {

        if (did != null) {
            List<Staff> list = staffService.selectStaffByDname(did);
            System.out.println(did);
            map.addAttribute("allStaff", list);
        } else {

            List<Staff> all = staffService.getAll();

            map.addAttribute("allStaff", all);
        }

        return "showStaff";

    }

    @RequestMapping("updateStaff")
    @ResponseBody
    public String updateJob(Staff staff) {

        if (staffService.updateJob(staff) > 0) {
            return "修改成功";
        } else return "修改失败";
    }


}
















