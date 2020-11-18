package com.spring.test;

import com.spring.entity.*;
import com.spring.service.MembersService;
import com.spring.service.UsersService;
import com.spring.service.impl.MembersServiceImpl;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class testSpring {


    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");


//        MobilePhone mobilePhone = (MobilePhone) ac.getBean("mobilePhone");
//        System.out.println(mobilePhone);
//
//
//        System.out.println("---通过注解创建对象-----");
//        Student student = (Student) ac.getBean("student");
//
//        System.out.println(student);


//调用服务层UsersServiceImpl的getAllUsers()

        System.out.println("-------查询所有用户-----");
        UserServiceImpl usi = (UserServiceImpl) ac.getBean("userServiceImpl");

        Map<Integer, Users> allUsers = usi.getAllUsers();
        System.out.println(allUsers);


        System.out.println("\n" + "------查询信息-----");

        MembersServiceImpl msi1 = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        List<Members> m1 = msi1.selectByState("已启用");
        List<Members> m2 = msi1.selectByState("已删除");

        System.out.println("\n已启用的用户有" + m1);
        System.out.println("\n已删除的用户有" + m2);


        System.out.println("\n" + "-------根据会员id进行会员状态的修改------");
        MembersServiceImpl msi = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        msi.qiYongById(1);

        System.out.println("\n" + "--------修改成功-------");


        System.out.println("\n" + "-------查询所有用户------");


        MembersServiceImpl msi2 = (MembersServiceImpl) ac.getBean("membersServiceImpl");

        List<Members> members2 = msi2.selectAll();
        for (Members members3 : members2) {
            System.out.println(members3);
        }


        System.out.println("\n" + "-------根据会员id进行会员批量删除------");

        MembersServiceImpl msi4 = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        msi4.deleteByIdList(list);
        System.out.println("删除成功");


        System.out.println("\n" + "-------根据会员id进行会员密码重置------");

        MembersServiceImpl msi5 = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        msi5.updatePassword(1, "1928");
        System.out.println("更新成功");


        System.out.println("\n" + "-------根据会员id进行会员信息的修改------");

        MembersServiceImpl msi6 = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        msi6.updateInformationById(1, "皮皮虾", "男", "123454321", "111@qq.com");
        System.out.println("修改成功");


        System.out.println("\n" + "-------新增会员信息------");
        MembersServiceImpl msi7 = (MembersServiceImpl) ac.getBean("membersServiceImpl");
        msi7.insertMembers("该隐", "999", "男", "9999", "111222@qq.com", "召唤师峡谷", new Date());
        System.out.println("新增会员成功");


        System.out.println("\n" + "-----模糊查询   or和createCriteria只生效一个-----");
        MembersServiceImpl msi9 = (MembersServiceImpl) ac.getBean("membersServiceImpl");

        MembersExample membersExample = new MembersExample();
        membersExample.or().andPhoneLike("%" + "德" + "%");
        membersExample.or().andEmailLike("%" + "德" + "%");
        membersExample.or().andUsernameLike("%" + "德" + "%");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date startTime = null;
        Date endTime = null;
        try {
            startTime = sdf.parse("2020-1-1 0:3:12");
            endTime = sdf.parse("2020-4-11 8:2:2");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        membersExample.createCriteria().andBirthdateBetween(startTime, endTime);
        List<Members> members = msi9.searchByKeys(membersExample);
        for (Members member : members) {
            System.out.println(member);
        }
    }


}
