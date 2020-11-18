package com.wangyicourse.controller;


import com.wangyicourse.entity.Pictures;
import com.wangyicourse.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/14 14:23
 * 4
 */

@Controller
@CrossOrigin(origins = "*")
public class pictureController {

    @Autowired
    private PictureServiceImpl ps;

    @RequestMapping("/getimg")
    @ResponseBody
    public List<String> getPictures(String title) {

        List<Pictures> pictures = ps.getPictures(title);

        List<String> img = new ArrayList<>();
        for (Pictures picture : pictures) {
            img.add(picture.getPicture());
        }
        return img;
    }

    @RequestMapping("/getpic")
    @ResponseBody
    public List<Pictures> getPic(String title) {
        List<Pictures> pictures = ps.getPictures(title);
        return pictures;
    }


    @RequestMapping("/getcou")
    @ResponseBody
    public List<Pictures> selectByDes(String des) {

        System.out.println("获取搜索结果的课程....前端传来的数据为：" + des);

        List<Pictures> pictures = ps.selectByDes1(des);
        return pictures;
    }

//    @RequestMapping("touxiang")
//    @ResponseBody
//    public String getTouXiang(int id) {
//        System.out.println("获取头像.....前端传来的用户id为：" + id);
//        String sid = id + "";
//        String img = ps.getTouXiang(sid);
//        return img;
//    }

}
