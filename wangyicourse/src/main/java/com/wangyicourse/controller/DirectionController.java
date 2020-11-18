package com.wangyicourse.controller;


import com.wangyicourse.entity.Direction;
import com.wangyicourse.service.impl.DirectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/14 17:41
 * 4
 */


//    允许跨域访问
@CrossOrigin(origins = "*")
@ResponseBody
@Controller
public class DirectionController {

    @Autowired
    private DirectionServiceImpl ds;

    @RequestMapping("getdirection")
    public List<String> getDirections() {

        List<Direction> dname = ds.getDname();
        ArrayList list = new ArrayList();
        for (Direction direction : dname) {
            list.add(direction.getDirectionname());

        }
        return list;
    }
}

