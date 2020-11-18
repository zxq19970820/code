package com.zxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/14 21:21
 */
@SpringBootTest
public class OpsForString {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;


    @Test
    public void Test1(){
        ValueOperations<Object, Object> forValue = redisTemplate.opsForValue();
        forValue.set("user","uuu");         //存字符串
        Object user = forValue.get("user");     //取字符串
        System.out.println(user);

    }

//    @Test
//    public void Test(){
//        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
//        Integer append = opsForValue.append("user", "vvv");
//        System.out.println(append);
//    }



}
