package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Cart;
import com.wangyicourse.entity.CartDetails;
import com.wangyicourse.entity.CartDetailsExample;
import com.wangyicourse.mappers.CartDetailsMapper;
import com.wangyicourse.mappers.CartMapper;
import com.wangyicourse.service.CartDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailsServiceImpl implements CartDetailsService {
    @Autowired
    CartDetailsMapper cartDetailsMapper;
    @Autowired
    CartMapper cartMapper;
    @Override
    public boolean deleteByCartId(int id) {

        System.out.println(id);
        return cartDetailsMapper.deleteByPrimaryKey(id)>0;
    }
    public boolean deleteById(int cdid){
        return cartDetailsMapper.deleteByPrimaryKey(cdid)>0;
    }

    @Override
    public boolean addCartDetails(CartDetails cartDetails) {
        return cartDetailsMapper.insertSelective(cartDetails)>0;
    }
//新增
    @Override
    public boolean deleteByUserIdAndCourseId(int userid,int courseid) {
        Cart cart =cartMapper.findCartIdByUserId(userid);


        int cartid=cart.getId();
        CartDetails cartDetails=new CartDetails();
        CartDetailsExample cartDetailsExample=new CartDetailsExample();
        cartDetailsExample.createCriteria().andCartidEqualTo(cartid).andCourseidEqualTo(courseid);
        int row=cartDetailsMapper.deleteByExample(cartDetailsExample);
        return row>0;
    }

    @Override
    public List<CartDetails> selectByCartIdAndCourseId(int cartid, int courseid) {
        CartDetailsExample cartDetailsExample=new CartDetailsExample();
        cartDetailsExample.createCriteria().andCartidEqualTo(cartid).andCourseidEqualTo(courseid);
        return cartDetailsMapper.selectByExample(cartDetailsExample);
    }
}
