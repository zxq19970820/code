package com.zxq.demo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/13 11:10
 */

@SpringBootTest
public class WarpperTest {
    @Autowired
    private UserMapper userMapper;

    //    查询多个
    @Test
    void Test1() {
//        查询name不为空的用户，并且邮箱不为空，年龄>=12
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name")
                .isNotNull("email")
                .ge("age", 12);
        List<User> list = userMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }


    //    查询一个
    @Test
    void test2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "呼呼");
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }


    @Test
    void test3() {
//        查询年龄在20-30之间用户数量
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age", 20, 30);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }

    //    模糊查询
    @Test
    void test4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.notLike("name", "e").likeRight("email", "t");
//        wrapper.like("email","t");
        List<User> list = userMapper.selectList(wrapper);
        for (User user : list) {
            System.out.println(list);
        }
    }

//    @Test
//    void test5(){
////        在子查询中查出来
//        Wrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.inSql("id","select id from user where id<3");
//    }

    @Test   //降序
    void test6() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");
        List<User> list = userMapper.selectList(wrapper);
        for (User user : list) {
            System.out.println(user);
        }
    }

}
