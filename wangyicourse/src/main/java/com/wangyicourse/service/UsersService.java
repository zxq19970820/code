package com.wangyicourse.service;





import com.wangyicourse.entity.Users;

import java.util.Date;
import java.util.List;

public interface UsersService {

/**
     * 验证用户信息（登录）
     * @param username
     * @param password
     * @return*/


    public Users validateUser(String username, String password);

    /**
     * 获取所有用户
     * @return
     */
    List<Users> getAllUsers();

    /**
     * 注册用户
     * @param user
     * @return
     */
    void register(Users user);

    boolean registerTest(Users user);

     String getUserByName(int id);

    String getTouXiangById(int id);

    void updateUserById(Users users);
    List<Users> getUserByUsername(String name);


    //    新增

    List<Users> getAllByState(String state);

    List<Users> getAllByTime(Date start, Date end);

    List<Users> getAllBeforeTime(Date time);

    List<Users> selectByName1(String name,String timeStart,String timeEnd);

    List<Users> selectByName2(String name,String timeStart,String timeEnd);

    int deleteById(int id);

    int HuiFuById(int id);

    int addUser(String username,String password,String tel,String email);

    int updateUser(Users users);
}
