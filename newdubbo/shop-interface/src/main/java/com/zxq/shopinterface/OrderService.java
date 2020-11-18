package com.zxq.shopinterface;

import java.util.List;

/**
 * @author 86186
 */
public interface OrderService {

	/**
	 * 初始化订单
	 * @param userId
	 * @return
	 */
	public List<UserAddress> initOrder(Integer userId);
}
