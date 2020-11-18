package com.wangyicourse.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wangyicourse.entity.PreOrder;
import com.wangyicourse.service.CartDetailsService;
import com.wangyicourse.service.PreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/preorder")
public class PreOderController {
    @Autowired
    PreOrderService preOrderService;
    @Autowired
    CartDetailsService cartDetailsService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @CrossOrigin(value = "*")
    public String add(@RequestBody JSONArray jsonArray){
    //具有逻辑错误，除非cartid=userid，不然出错

          for(int i=0;i<jsonArray.size();i++){
              JSONObject jsonObject=jsonArray.getJSONObject(i);
              String j=jsonObject.toJSONString();
              PreOrder preOrder=jsonObject.parseObject(j,PreOrder.class);
              preOrderService.addPreOrder(preOrder);
              preOrderService.deleteCartDetails(preOrder.getUserid(),preOrder.getCourseid());

          }
        System.out.println(jsonArray.size());
        return "提交成功";
    }
    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping(value = "/display")
    public List<PreOrder> display(int userid){
        return preOrderService.selectByUserId(userid);
    }
}
