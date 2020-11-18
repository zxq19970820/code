package com.wangyicourse.controller;



import com.wangyicourse.entity.MyStudy;
import com.wangyicourse.service.MyStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/myStudy")
public class MystudentController {

    @Autowired

    private MyStudyService myStudyService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getMyStudyByUserId",method = RequestMethod.GET)
    @ResponseBody

    public List<MyStudy> getMyStudy(int userid){
        System.out.println("==========="+userid);

        List<MyStudy> byUserId = myStudyService.getByUserId(userid);
        byUserId.stream().forEach(System.out::println);
        System.out.println(byUserId.size());
        return myStudyService.getByUserId(userid);
    }
    //新增
    @CrossOrigin(value = "*")
    @RequestMapping("/validBuyCourse")
    @ResponseBody
    public String validBuyCourse(int userid,int courseid){
        if(myStudyService.getByUserIdAndCourseId(userid,courseid).size()!=0){
            return "true";
        }else{
            return "false";
        }
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/addCourseToStudy")
    @ResponseBody
    public String addCourseToMyStudy(int userid,int courseid){

        MyStudy myStudy = new MyStudy();
        myStudy.setUserid(userid);
        myStudy.setCourseid(courseid);
        if(myStudyService.addMyStudent(myStudy)){
            return "加入成功";
        }else{
            return "加入失败";
        }
    }




}
