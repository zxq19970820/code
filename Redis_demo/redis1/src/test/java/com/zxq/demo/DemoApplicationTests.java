package com.zxq.demo;

import com.zxq.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void opsValue() {
        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();

        Person p = new Person();
        p.setUsername("h");
        p.setPassword("123");

        opsForValue.set("p1", p);
        Object p1 = opsForValue.get("p1");
        System.out.println(p1);

    }


    @Test
    public void opsList(){
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();

        Person p=new Person();
        p.setUsername("zxq");
        p.setPassword("123");

        Person p2=new Person();
        p2.setUsername("fdy");
        p2.setPassword("123");


        opsForList.rightPush("p1",p);
        opsForList.rightPush("p1",p2);

        List<Object> list1 = opsForList.range("p1", 0, -1);//遍历所有
        list1.forEach(System.out::println);
    }

    @Test
    public void delete(){
        redisTemplate.delete("p1");
    }



}
