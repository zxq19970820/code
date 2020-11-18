package com.zxq.shopuserconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxq.shopinterface.OrderService;
import com.zxq.shopinterface.UserAddress;
import com.zxq.shopinterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 86186
 */
@Component
public class OrderServiceImpl implements OrderService {

//	@Autowired
	@Reference  //从 Dubbo 中去取这个服务，【引用服务】
	UserService userService;


	@Override
	public List<UserAddress> initOrder(Integer userId) {
		// TODO Auto-generated method stub

		System.out.println("用户id："+userId);

		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressByUserId(userId);

		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUseraddress());
		}
		return addressList;
	}


}
