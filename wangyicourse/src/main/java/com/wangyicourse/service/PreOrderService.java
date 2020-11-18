package com.wangyicourse.service;

import com.wangyicourse.entity.PreOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PreOrderService {
    boolean addPreOrder(PreOrder preOrder);
    List<PreOrder> selectPreOrderByCidAndUid(int cid,int uid);
    List<PreOrder> selectByUserId(int userid);
    boolean deleteAll();
    boolean deleteCartDetails(int userid,int courseid);
}
