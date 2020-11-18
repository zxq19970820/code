package com.wangyicourse.service;

import com.wangyicourse.entity.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    List<Cart> getAll();
    Cart findCartByUserId(int userid);
    boolean deleteByCartId(int cid);

    Cart findCartIdByUserId(int userid);

    boolean insertOneCart(Cart cart);

}
