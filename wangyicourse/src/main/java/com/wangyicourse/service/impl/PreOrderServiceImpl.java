package com.wangyicourse.service.impl;

import com.wangyicourse.entity.*;
import com.wangyicourse.mappers.CartDetailsMapper;
import com.wangyicourse.mappers.CartMapper;
import com.wangyicourse.mappers.PreOrderMapper;
import com.wangyicourse.service.PreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreOrderServiceImpl implements PreOrderService {
    @Autowired
    PreOrderMapper preOrderMapper;
    @Autowired
    CartMapper cartMapper;
    @Autowired
    CartDetailsMapper cartDetailsMapper;

    @Override
    public boolean deleteCartDetails(int userid,int courseid) {
        CartExample cartExample=new CartExample();
        cartExample.createCriteria().andUseridEqualTo(userid);
        List<Cart> list=cartMapper.selectByExample(cartExample);
        int cid=list.get(0).getId();
        CartDetailsExample cartDetailsExample=new CartDetailsExample();
        cartDetailsExample.createCriteria().andCartidEqualTo(cid).andCourseidEqualTo(courseid);
        int row=cartDetailsMapper.deleteByExample(cartDetailsExample);
        return row>0;
    }

    @Override
    public boolean addPreOrder(PreOrder preOrder) {

        return preOrderMapper.insertSelective(preOrder)>0;
    }

    @Override
    public boolean deleteAll() {
        return preOrderMapper.deleteAll()>0;
    }

    @Override
    public List<PreOrder> selectByUserId(int userid) {
        return preOrderMapper.selectByUserId(userid);
    }

    @Override
    public List<PreOrder> selectPreOrderByCidAndUid(int cid, int uid) {
        PreOrderExample preOrderExample=new PreOrderExample();
        preOrderExample.createCriteria().andCourseidEqualTo(cid).andUseridEqualTo(uid);
        return preOrderMapper.selectByExample(preOrderExample);
    }
}
