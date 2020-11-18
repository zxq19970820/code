package com.wangyicourse.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wangyicourse.entity.MyStudy;
import com.wangyicourse.entity.OrderItem;
import com.wangyicourse.entity.Orders;
import com.wangyicourse.service.*;
import com.wangyicourse.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/Order")
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    PreOrderService preOrderService;
    @Autowired
    CartDetailsService cartDetailsService;
    @Autowired
    MyStudyService myStudyService;
    @Autowired
    CourseService courseService;
    @RequestMapping("/display")
    @CrossOrigin(value = "*")
    @ResponseBody
    public String display(@RequestBody JSONObject jsonObject){
        Integer i=Integer.parseInt(jsonObject.getString("price"));
        JSONArray jsonArray=jsonObject.getJSONArray("orderitems");
        int userid=((JSONObject)jsonArray.get(0)).getInteger("userid");

        Orders order=new Orders();
        String num=Util.getOrderIdByTime();
        order.setOrdernum(num);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String newDateStr=simpleDateFormat.format(date);
        Date newDate=null;
        try {
            newDate=simpleDateFormat.parse(newDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        order.setCreatetime(newDate);
        order.setTotalprice(new BigDecimal(i));
        order.setState("待支付");
        order.setUserid(userid);
        orderService.add(order);

        for(int j=0;j<jsonArray.size();j++){
            JSONObject jsonObject1=(JSONObject) jsonArray.get(j);
            OrderItem orderItem=new OrderItem();
            orderItem.setOrdernum(num);
            int courseid=jsonObject1.getInteger("courseid");
            orderItem.setCourseid(courseid);
            cartDetailsService.deleteByUserIdAndCourseId(userid,courseid);
            orderItem.setSecondordernum(Util.getOrderIdByTime());
            orderItemService.insert(orderItem);
            System.out.println(jsonObject1.toJSONString());
        }
        System.out.println(i);
        preOrderService.deleteAll();
        return "成功";
    }

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/displayOrders")
    public List<Orders> displayOrders(int userid){
         return orderService.selectOrderByUserid(userid);
    }


    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/displayOrdersByState")
    public List<Orders> displayOrdersByState(int userid,String state){
        return orderService.selectOrderByUseridAndState(userid,state);
    }

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/cancelOrder")
    public String cancelOrder(String orderNum){

        if(!orderService.cancelOrder(orderNum)){
           return "取消失败";
        }
        return "取消成功";
    }

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/deleteOrder")
    public Orders deleteOrder(String orderNum){
        boolean r=orderService.deleteOrder(orderNum);
        boolean l=orderItemService.deleteOrderNum(orderNum);
        Orders orders=new Orders();
        if(!r&&!l){
            orders.setId(-1);
            return orders;
        }
        orders.setId(-2);
        return orders;
    }


    //支付页面

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/disPayment")
    public List<Orders> disPayment(int userid,int orderId){
        return orderService.selectOrderByUserIdAndOrderId(userid, orderId);
    }

    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/pay")
    public String pay(@RequestBody JSONObject jsonObject){
        boolean flag=true;
        int userid=jsonObject.getInteger("userid");
        int orderid=jsonObject.getInteger("orderid");
        JSONArray ids = jsonObject.getJSONArray("ids");
        for(int i=0;i<ids.size();i++){

            Integer courseid=ids.getInteger(i);
            MyStudy myStudy = new MyStudy();
            myStudy.setCourseid(courseid);
            myStudy.setUserid(userid);
            if(!myStudyService.addMyStudent(myStudy)){
                flag=false;
            }
            if(!courseService.addSubscribe(courseid)){
                flag=false;
            }

        }
        if(!orderService.paySuccess(orderid)){
            flag=false;
        }
        if(flag){
            return "购买成功";
        }else{
            return  "购买失败";
        }
    }
    @CrossOrigin(value = "*")
    @ResponseBody
    @RequestMapping("/addOneOrder")
    public String addOneOrder(int userid,int courseid,int totalPrice){
        Orders orders =new Orders();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String newDateStr=simpleDateFormat.format(date);
        Date newDate=null;
        try {
            newDate=simpleDateFormat.parse(newDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        orders.setTotalprice(new BigDecimal(totalPrice));
        orders.setCreatetime(newDate);
        orders.setState("待支付");
        String num=Util.getOrderIdByTime();
        orders.setOrdernum(num);
        orders.setUserid(userid);
        orderService.add(orders);
        OrderItem orderItem=new OrderItem();
        orderItem.setSecondordernum(Util.getOrderIdByTime());
        orderItem.setCourseid(courseid);
        orderItem.setOrdernum(num);
        orderItemService.insert(orderItem);
        return "true";
    }

}
