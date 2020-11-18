package com.zxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;

import java.util.Set;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/14 22:39
 */

@SpringBootTest
public class OpsForSet {


    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

//存储
    @Test
    public void Test1(){
        SetOperations<Object, Object> opsForSet = redisTemplate.opsForSet();
        opsForSet.add("set","v1");
        opsForSet.add("set","v2");
        Long count = opsForSet.add("set", "v3", "v4", "v5");
        System.out.println("成功存入"+count+"个");
    }


//    查询

    @Test
    public void Test2(){

//        查询所有
        SetOperations<Object, Object> opsForSet = redisTemplate.opsForSet();
        Set<Object> set = opsForSet.members("set");
        System.out.println(set);

        System.out.println("----");

        set.forEach(System.out::println);

//        查询是否有值
        Boolean target = opsForSet.isMember("set", "v1");
        System.out.println(target);
    }


//    获取长度
    @Test
    public void Test3(){
        SetOperations<Object, Object> opsForSet = redisTemplate.opsForSet();
        Long set = opsForSet.size("set");
        System.out.println("set的长度为"+set);
    }

}
