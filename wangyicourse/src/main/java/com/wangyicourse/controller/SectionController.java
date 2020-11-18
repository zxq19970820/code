package com.wangyicourse.controller;


import com.wangyicourse.entity.Section;
import com.wangyicourse.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/section")
public class SectionController {
    @Autowired
    SectionService sectionService;

    @RequestMapping("/getUrl")
    @ResponseBody
    @CrossOrigin(value = "*")
   public String getUrl(int sectionid){
       return sectionService.getVideoUrl(sectionid);
    }
}
