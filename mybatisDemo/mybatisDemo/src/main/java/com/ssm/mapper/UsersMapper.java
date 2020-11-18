package com.ssm.mapper;

import com.ssm.entity.Users;
import com.ssm.entity.UsersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

//    自定义部分

    Users selectUsersByUsername(@Param("uname") String uname);

    //查询所有用户
    List<Users>  selectAllUsers();

    //方法返回值，方法名，方法参数列表
    //SQL分为两种类型：查询、更新；
    // 1、查询---方法的返回值：是一个对象(条件)，或者是多个对象
    //                     实体类POJO ，集合（List、Set、Map<k,v>）
    //                                  List<Pojo>或Set<Pojo>   mapper.xml文件resultType=集合泛型类型
    //                                  Map<POJO任意的属性,POJO>         "tom"=Users{，，}; "jack"=Users{，，}
    //                                                                  resultType="java.util.Map"
    //                                           POJO任意的属性，通过注解@Mapkey("属性名")

    //2、更新：insert   update    delete，方法返回值类型：int、long（返回影响的行数）、boolean（更新是否成功）、void

    //方法名：selectUsersById   deleteUsersById   updateUsersByIds 等等\

    //方法参数列表：sql语句的条件，条件的作用去补充sql语句,需要使用注解   @Param("")修饰形参

    // 方法：根据id查找用户     结果是一个符合要求的用户
    //  select  * from  users   where id = #{uid}
    Users  selectUsersById(@Param("uid") int id);

    //查询所有用户，通过Map结果的构造
    @MapKey("username")
    Map<String,Users> selectUsers();

    //更新表数据，根据id，更新多个字段的值：1)条件以及要更新的字段分别使用@Param("")
    boolean  updateUsersById1(@Param("id") int uid,@Param("uname") String name);
    //2)或者使用POJO实体类作为形参，不需要使用@Param()注解，mapper.xml中取值#{pojo属性名}
    boolean  updateUsersById2(Users  users);


}