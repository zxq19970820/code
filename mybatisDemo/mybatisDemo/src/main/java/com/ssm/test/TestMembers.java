package com.ssm.test;

import com.ssm.entity.Members;
import com.ssm.entity.MembersExample;
import com.ssm.mapper.MembersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestMembers {
    public static <membersMapper> void main(String[] args) {


        String resource = "mybatis-config.xml";
        InputStream inputStream = null;


        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

//2）获取sqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


// 3）使用工厂 获取sqlSession sql会话    表示会话开始
        SqlSession session = sqlSessionFactory.openSession(true);//自动更新操作的保存


        MembersMapper membersMapper = session.getMapper(MembersMapper.class);

        System.out.println("\n" + "--------查询所有------");
        MembersExample npe = new MembersExample();
        List<Members> pros = membersMapper.selectByExample(npe);
        System.out.println(pros);







        System.out.println("\n" + "--------根据时间查询------");

        MembersExample npe1 = new MembersExample();
//        开始和结束时间  开始2020-04-02 2:22:22  结束2020-05-06 3:33:33
        String startTime = "2020-04-02 2:22:22";
        String endTime = "2020-05-06 3:33:33";

        //时间格式化
//        SimpleDateFormat:String---->Date  parse()
//        Date--->String   format()
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date start = null;
        Date end=null;
        try {
            start = sdf.parse(startTime);
             end = sdf.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }


////设置查询条件
//        List<MembersExample.Criteria> oc = npe1.getOredCriteria();
//        MembersExample.Criteria cr1 = npe1.or();
//        cr1.andBirthdateBetween(start, end);
//
//        oc.add(cr1);
//        List<Members> pros1 = membersMapper.selectByExample(npe1);
//        System.out.println(pros1);

        //设置查询条件
        //createCriteria（）方法获取Criteria对象，通过and拼接sql
        npe1.createCriteria().andPhoneLike("%2%")
                .andBirthdateBetween(start, end);
        List<Members> members = membersMapper.selectByExample(npe1);
        System.out.println(members);


        System.out.println("\n" + "------or拼接条件------");
        MembersExample me = new MembersExample();
        //me添加3个条件  or
        me.or().andUsernameLike("%2%");
        me.or().andEmailLike("%2%");
        me.or().andPhoneLike("%2%");

        List<Members> members1 = membersMapper.selectByExample(me);
        System.out.println(members1);
//总结：Example中有2种方法获取Criteria对象（作用：andxxx（），条件）
//      1.  or（）：条件之间通过or拼接的，多个条件（多个Criteria对象）多次调用or（）
//      2.  createCriteria（）：条件之间通过and拼接，多个条件多次调用andxxx（）方法



        System.out.println("------更新state------");

//        //id=1   state='已删除'

        Members members2 = new Members();
        members2.setState("已删除");
        MembersExample me1 = new MembersExample();
        me1.createCriteria().andIdEqualTo(1);
        //updateByExample对应sql标签将所有的字段进行值设置，如果传递的对象没有给所有属性赋值，使用默认初始值
        int i = membersMapper.updateByExampleSelective(members2, me1);
        System.out.println("i=" + i);


        //        System.out.println("\n"+"------------updateBySelective:根据主键id更新-----");
//        Members members3=new Members();
//        members3.setId(2);
//        members3.setState("已删除");
//         membersMapper.updateByPrimaryKeySelective(members3);//返回更新操作影响的行数


//        System.out.println("----------根据id批量删除会员----------");
//        Members members3 = new Members();
//        members3.setState("已删除");
//        MembersExample me2 = new MembersExample();
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        me2.createCriteria().andIdIn(list);
//        int j = membersMapper.updateByExampleSelective(members3, me2);
//        System.out.println("修改成功");

//        用主键更新
        Members members4=new Members();
        members4.setState("已删除");
        members4.setId(1);
        membersMapper.updateByPrimaryKeySelective(members4);



//        System.out.println("/n"+"-----根据会员id重置密码----");
//
//        Members members5 = new Members();
//        members5.setPassword("1125233");
//        MembersExample me5 = new MembersExample();
//        me5.createCriteria().andIdEqualTo(1);
//        membersMapper.updateByExampleSelective(members5, me5);
//        System.out.println("----------重置成功--------");


    }
}
