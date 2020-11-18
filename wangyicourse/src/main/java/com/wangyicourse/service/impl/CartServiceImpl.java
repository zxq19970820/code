package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Cart;
import com.wangyicourse.mappers.CartMapper;
import com.wangyicourse.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public List<Cart> getAll() {
        return cartMapper.getAll();
    }

    @Override
    public boolean deleteByCartId(int cid) {


        return cartMapper.deleteByPrimaryKey(cid)>0;
    }

    @Override
    public Cart findCartByUserId(int userid) {
        return cartMapper.findCartByUserId(userid);

    }

    @Override
    public Cart findCartIdByUserId(int userid) {
        return  cartMapper.findCartIdByUserId(userid);
    }

    @Override
    public boolean insertOneCart(Cart cart) {
        return cartMapper.insertSelective(cart)>0;
    }
}
