package com.wangyicourse.controller;


import com.wangyicourse.entity.Chapter;
import com.wangyicourse.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @RequestMapping("/findAllChapter")
    @ResponseBody
    @CrossOrigin(value = "*")
   public List<Chapter> findAllChapter(){
       return chapterService.findAllChapter();
    }
}
