package com.wangyicourse.service;

import com.wangyicourse.entity.CartDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartDetailsService {
    boolean deleteByCartId(int cartid);
    boolean addCartDetails(CartDetails cartDetails);
    /*新增*/
    boolean deleteByUserIdAndCourseId(int userid,int courseid);
    List<CartDetails> selectByCartIdAndCourseId(int cartid,int courseid);
}
