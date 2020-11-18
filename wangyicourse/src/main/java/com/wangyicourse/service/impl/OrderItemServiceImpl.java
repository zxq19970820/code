package com.wangyicourse.service.impl;

import com.wangyicourse.entity.OrderItem;
import com.wangyicourse.entity.OrderItemExample;
import com.wangyicourse.mappers.OrderItemMapper;
import com.wangyicourse.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public boolean insert(OrderItem orderItem) {
        return orderItemMapper.insertSelective(orderItem)>0;
    }

    @Override
    public boolean deleteOrderNum(String orderNum) {
        OrderItemExample orderItemExample=new OrderItemExample();
        orderItemExample.createCriteria().andOrdernumEqualTo(orderNum);
        return orderItemMapper.deleteByExample(orderItemExample)>0;
    }
}
