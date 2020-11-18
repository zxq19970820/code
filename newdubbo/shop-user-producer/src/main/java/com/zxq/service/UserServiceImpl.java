package com.zxq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxq.mapper.UserAddressMapper;
import com.zxq.shopinterface.UserAddress;
import com.zxq.shopinterface.UserAddressExample;
import com.zxq.shopinterface.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 86186
 */

@Service
@Component
public class UserServiceImpl implements UserService {



	@Override
	public List<UserAddress> getUserAddressByUserId(Integer userId) {
//		System.out.println("UserServiceImpl.....new...");
//		 UserAddress address1 = new UserAddress(1, "天津市西青区天津市大学软件学院1号楼206", 1, "张明", "13388902288", "Y");
//		 UserAddress address2 = new UserAddress(2, "深圳市宝安区静香里小区2单元206", 1, "王美丽", "13892002299", "N");
//
//		List<UserAddress> userAddresses = new ArrayList<>();
//
//		userAddresses.add(address1);
//		userAddresses.add(address2);


		//1)加载mybatis-config.xml文件
		String resource = "mybatis-config.xml";
		List<UserAddress> userAddresses = new ArrayList<>();
		try {


			InputStream inputStream = Resources.getResourceAsStream(resource);

			//2) 获取SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


			//3) 获取SqlSession
			SqlSession session = sqlSessionFactory.openSession(true);


			//4) 执行Mapper接口方法的调用,UsersMapper接口
			UserAddressMapper mapper = session.getMapper(UserAddressMapper.class);

			UserAddressExample uae = new UserAddressExample();

			uae.createCriteria().andUseridEqualTo(userId);


			userAddresses = mapper.selectByExample(uae);


		} catch (Exception e) {
		}
		return userAddresses;
	}


}



