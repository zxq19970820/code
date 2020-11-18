package com.wangyicourse.service;

import com.wangyicourse.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    boolean add(Orders order);
    List<Orders> selectOrderByUserid(int userid);
    List<Orders> selectOrderByUseridAndState(int userid,String state);
    boolean cancelOrder(String ordernum);
    boolean deleteOrder(String ordernum);
    List<Orders> selectOrderByUserIdAndOrderId(int userid,int orderid);
    boolean paySuccess(int orderid);
}
