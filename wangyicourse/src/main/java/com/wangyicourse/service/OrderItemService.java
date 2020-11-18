package com.wangyicourse.service;

import com.wangyicourse.entity.OrderItem;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
    boolean insert(OrderItem orderItem);
    boolean deleteOrderNum(String orderNum);
}
