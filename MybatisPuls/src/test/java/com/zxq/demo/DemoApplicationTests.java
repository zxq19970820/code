package com.zxq.demo;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;


    //    查询一个
    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    //    批量查询
    @Test
    public void TestMany() {
        List<User> list = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));

        list.forEach(System.out::println);
    }

    @Test //条件查询map
    public void TestSelectByMap() {
        HashMap<String, Object> map = new HashMap<>();
//        自定义查询
        map.put("name", "鬼谷");
        map.put("age", 1326807765930246146L);
//        map.put("version", 1);
        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);
    }


    //    查询所有
    @Test
    void Test1() {
//        参数是一个wrapper，条件构造器，这里我们先不用,用null表示
//        查询全部用户
        List<User> list = userMapper.selectList(null);
        for (User user : list) {
            System.out.println(user);
        }
    }

    //    测试插入
    @Test
    public void test2() {
        User user = new User();
        user.setName("恕瑞玛");
        user.setAge(123);
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void test3() {
        User user = new User();
        user.setName("鬼谷");
        user.setAge(123);
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }


    //    测试更新
    @Test
    public void test4() {
        User user = new User();
        user.setId(1326807765930246147L);
        user.setName("呼呼");
//        user.setAge(18);
        int i = userMapper.updateById(user);
        System.out.println(i);
    }


    //    测试乐观锁     成功
    @Test
    public void test5() {
//        1.查询用户信息
        User user = userMapper.selectById(4L);
//        2.修改用户信息
        user.setName("恕瑞玛");
        user.setEmail("123@qq.com");
//        3.执行更新操作
        userMapper.updateById(user);
    }


    //    测试乐观锁     失败
    @Test
    public void test6() {

//        模拟线程1
//        1.查询用户信息
        User user = userMapper.selectById(1L);
//        2.修改用户信息
        user.setName("嘻嘻哈哈");
        user.setEmail("123@qq.com");

//        模拟线程2，执行了插队操作
        //        1.查询用户信息
        User user2 = userMapper.selectById(1L);
//        2.修改用户信息
        user2.setName("嘤嘤嘤嘤嘤");
        user2.setEmail("123@qq.com");
//        3.执行更新操作
        userMapper.updateById(user2);


//        自旋锁来多次尝试提交
//        3.执行更新操作
        userMapper.updateById(user);        //如果没有乐观锁就会覆盖插队线程的值
    }

    //测试分页查询
    @Test
    public void Test7() {
//        参数一：当前页
//        参数二：页面大小
        Page<User> page = new Page<>(1, 2);
        userMapper.selectPage(page, null);
        List<User> records = page.getRecords();     //当前页的数据
        for (User record : records) {
            System.out.println(" page.getRecords()-----" + record);
        }
        System.out.println("----------");
        System.out.println("page.getCurrent()-------" + page.getCurrent());   //当前页
        System.out.println("page.getSize()-------" + page.getSize());         //当前页容量
        System.out.println("page.getTotal()-------" + page.getTotal());       //数据总量
        System.out.println("page.getPages()-------" + page.getPages());       //页数总量

        System.out.println("还有上一页吗" + page.hasPrevious());
        System.out.println("还有下一页吗" + page.hasNext());

//        page.getRecords().forEach(System.out::println);

    }

    //    删除一个
    @Test
    public void Test8() {
        userMapper.deleteById(3L);
    }

    //    删除多个
    @Test
    public void Test9() {
        userMapper.deleteBatchIds(Arrays.asList(1, 2));
    }

    //    删除，使用map
    @Test
    public void Test10() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "鬼谷");
        userMapper.deleteByMap(map);
    }


    //    自定义sql
    @Test
    void Test11() {
        User user = userMapper.selectUserById(3L);
        System.out.println(user);
    }

}











































