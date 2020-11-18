package com.wangyicourse.service.impl;

import com.wangyicourse.entity.OrderItemExample;
import com.wangyicourse.entity.Orders;
import com.wangyicourse.entity.OrdersExample;
import com.wangyicourse.mappers.OrdersMapper;
import com.wangyicourse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public boolean cancelOrder(String ordernum) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andOrdernumEqualTo(ordernum);
        Orders orders=new Orders();
        orders.setState("交易关闭");
        int row=ordersMapper.updateByExampleSelective(orders,ordersExample);
        return row>0;
    }

    @Override
    public boolean deleteOrder(String ordernum) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andOrdernumEqualTo(ordernum);
        int i=ordersMapper.deleteByExample(ordersExample);
        return i>0;
    }

    @Override
    public List<Orders> selectOrderByUseridAndState(int userid, String state) {
        return ordersMapper.selectOrderByUserIdAndState(userid, state);
    }

    @Override
    public List<Orders> selectOrderByUserid(int userid) {
        List<Orders> orders = ordersMapper.selectOrderByUserId(userid);
        for(Orders o:orders){
            Date date=OrderServiceImpl.convertTime(o.getCreatetime());
            o.setCreatetime(date);
        }
        return orders;
    }

    @Override
    public boolean add(Orders order) {
        return ordersMapper.insertSelective(order)>0;
    }

    @Override
    public List<Orders> selectOrderByUserIdAndOrderId(int userid, int orderid) {
        List<Orders> orders = ordersMapper.selectOrderByUserIdAndOrderId(userid,orderid);
        for(Orders o:orders){
            Date date=OrderServiceImpl.convertTime(o.getCreatetime());
            o.setCreatetime(date);
        }
        return orders;
    }

    @Override
    public boolean paySuccess(int orderid) {
        Orders orders = ordersMapper.selectByPrimaryKey(orderid);
        orders.setState("交易成功");
        OrdersExample ordersExample = new OrdersExample();
        ordersExample.createCriteria().andIdEqualTo(orderid);
        return ordersMapper.updateByExampleSelective(orders,ordersExample)>0;
    }

    //convert时间
    public static Date convertTime(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String newDateStr=simpleDateFormat.format(date);
        Date newDate=null;
        try {
            newDate=simpleDateFormat.parse(newDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }
}
