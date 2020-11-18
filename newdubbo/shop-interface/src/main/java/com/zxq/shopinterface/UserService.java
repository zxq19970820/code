package com.zxq.shopinterface;

import java.util.List;


public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     */


    public List<UserAddress> getUserAddressByUserId(Integer userId);


}
