package com.zxq.demo;

import com.zxq.dao.UserRepository;
import com.zxq.doamin.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        System.out.println("aa");
    }


    /**
     * 修改客户：调用save(obj)方法
     * 对于save方法的解释：如果执行此方法是对象中存在id属性，即为更新操作会先根据id查询，再更新
     * 如果执行此方法中对象中不存在id属性，即为保存操作
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setName("蒙奇·D·卡普");
        user.setAge(22);
        user.setAddress("风车村");

        userRepository.save(user);
    }


    @Test
    public void testUpdate() {
        //根据id查询id为1的客户
        User user = userRepository.findById(1).orElse(null);

//        修改用户名称
        user.setName("哈哈哈");

//        更新
        userRepository.save(user);
    }


    //    根据id删除，调用delete（id）
    @Test
    public void testDelete() {
        userRepository.deleteById(1);
    }

    //    根据id查询
    @Test
    public void testFindById() {
        User user = userRepository.findById(1).orElse(null);
        System.out.println(user);       //null

        User user1 = userRepository.findById(2).orElse(null);
        System.out.println(user1);

    }


//    自定义查询
    @Test
    public void tQuery(){
        User user = userRepository.findUser("德玛西亚");
        System.out.println(user);

    }


//    自定义更新
    @Test
    public void tUpdate(){
        userRepository.updateById("嘤嘤嘤", 4);
    }


}
