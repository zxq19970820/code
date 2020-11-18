package com.ssm.test;

import com.ssm.entity.Members;
import com.ssm.entity.MembersExample;
import com.ssm.entity.ProductExample;
import com.ssm.mapper.MembersMapper;
import com.ssm.mapper.ProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class hwTest {
    public static void main(String[] args) {

        String resource = "mybatis-config.xml";


        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }


        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);

        MembersMapper membersMapper = session.getMapper(MembersMapper.class);


        System.out.println("-----查询已启用会员列表------");

        MembersExample membersExample = new MembersExample();
        membersExample.createCriteria().andStateEqualTo("已启用");
        List<Members> members = membersMapper.selectByExample(membersExample);
        System.out.println("已启用的用户有" + members);


        System.out.println("\n" + "-----查询已删除的会员列表-----");

        MembersExample membersExample1 = new MembersExample();
        membersExample1.createCriteria().andStateEqualTo("已删除");
        List<Members> members1 = membersMapper.selectByExample(membersExample1);
        System.out.println("已删除用户有" + members1);


//        System.out.println("\n" + "------根据会员id进行会员状态切换----------");

//        Members members2 = new Members();
//        members2.setId(2);
//        members2.setState("已启用");
//        membersMapper.updateByPrimaryKeySelective(members2);
//        System.out.println("状态切换成功");


        System.out.println("\n" + "------根据会员id进行会员批量删除-------");
        Members members3 = new Members();
        members3.setState("已删除");
        MembersExample membersExample3 = new MembersExample();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        membersExample3.createCriteria().andIdIn(list);
        membersMapper.updateByExampleSelective(members3, membersExample3);
        System.out.println("批量删除成功");

//
//        System.out.println("\n"+"4、根据会员id进行会员密码重置");
//        Members members2=new Members();
//        members2.setId(1);
//        members2.setPassword("112233");
//        membersMapper.updateByPrimaryKeySelective(members2);
//        System.out.println("密码重置成功");

//        System.out.println("\n"+"根据会员id进行会员信息的修改");
//        Members members9=new Members();
//        members9.setId(1);
//        members9.setUsername("德玛西亚");
//        members9.setGender("男");
//        members9.setPhone("123456");
//        members9.setEmail("11@qq.com");
//        membersMapper.updateByPrimaryKeySelective(members9);
//        System.out.println("更新完成");


//        System.out.println("\n" + "------实现会员信息的新增--------");
//
//        Members members4 = new Members();
//        Date date = new Date();
//
//        members4.setBirthdate(date);
//        members4.setUsername("德古拉");
//        members4.setPassword("123123");
//        members4.setEmail("321@qq.com");
//        members4.setPhone("987654");
//        members4.setState("已启用");
//        members4.setGender("男");
//        members4.setAddress("北京市");
//        membersMapper.insertSelective(members4);
//        System.out.println("新增会员信息成功");


        System.out.println("\n" + "-----根据条件完成会员信息查询----");
        MembersExample membersExample7 = new MembersExample();

        String start = "2019-02-02 00:00:00";
        String end = "2020-01-01 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date startTime = null;
        Date endTime = null;
        try {
            startTime = sdf.parse(start);
            endTime = sdf.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        membersExample7.createCriteria().andBirthdateBetween(startTime, endTime);
        membersExample7.or().andUsernameLike("%四%").andPhoneLike("%四%").andEmailLike("%四%");
        List<Members> members4 = membersMapper.selectByExample(membersExample7);
        System.out.println("查询结果为" + members4);





    }
}
