package com.zxq.demo;

import com.zxq.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/14 21:28
 */

@SpringBootTest
public class OpsForList {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void Test1() {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();

//        添加单个
        opsForList.leftPush("userList", "jack");
        opsForList.rightPush("userList", "tom");
        opsForList.leftPush("userList", "rose");

//        设置时间
//        redisTemplate.expire("userList",6, TimeUnit.SECONDS);
    }


    //添加list
    @Test
    public void Test2() {

        List<Person> list = new ArrayList<>();

        Person person1 = new Person();
        person1.setUsername("zxq");
        person1.setPassword("123");

        Person person2 = new Person();
        person2.setUsername("fdy");
        person2.setPassword("123");

        list.add(person1);
        list.add(person2);

        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();
        opsForList.leftPush("user1", list);
    }

    @Test
    public void Test3() {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();

        List<String> list = new ArrayList<>();
        list.add("德玛西亚");
        list.add("艾欧尼亚");
        list.add("恕瑞玛");
        opsForList.rightPushAll("name", "a", "b", "c");
        Long name = opsForList.rightPushAll("name", list);
        System.out.println(name);
    }


    @Test
    public void Test4() {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();

//        弹出最左边元素
        Object name = opsForList.leftPop("name");
        System.out.println(name);

        Object name1 = opsForList.rightPop("name");
        System.out.println(name1);
    }


    //    查询
    @Test
    public void Test5() {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();

//        查询全部
        List<Object> name = opsForList.range("name", 0, -1);
        System.out.println(name);

//        查询前两个元素
        List<Object> name1 = opsForList.range("name", 0, 1);
        System.out.println(name1);
    }


    @Test
    public void Test6() {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();
//          留下指定位置的元素1-2
        opsForList.trim("name", 1, 2);




//           从左往右删除list中元素c  (1:从左往右 -1:从右往左 0:删除全部)
//        opsForList.remove("name",1,"c");
    }


//    删除指定键
    @Test
    public void Test(){
        Boolean user = redisTemplate.delete("name");
        System.out.println(user);
    }


}
