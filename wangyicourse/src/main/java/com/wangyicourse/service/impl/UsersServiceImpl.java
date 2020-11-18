package com.wangyicourse.service.impl;


import com.wangyicourse.entity.Users;
import com.wangyicourse.entity.UsersExample;
import com.wangyicourse.mappers.UsersMapper;
import com.wangyicourse.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 86186
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public Users validateUser(String username, String password) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andPasswordEqualTo(password).andUsernameEqualTo(username);
        List<Users> users = usersMapper.selectByExample(usersExample);
        System.out.println("从数据库获取的登录用户对象" + users);
        if (users.isEmpty()) {
            return null;
        }
        int userid = users.get(0).getUserid();
        System.out.println("从数据库获取的登录用户对象" + userid);
        return users.get(0);
    }

    @Override
    public List<Users> getAllUsers() {
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }

    @Override
    public void register(Users user) {
        int rows = usersMapper.insert(user);
        System.out.println("rows=" + rows);
    }

    @Override
    public boolean registerTest(Users user) {
        int rows = usersMapper.insert(user);
        System.out.println("rows=" + rows);
        return rows > 0 ? true : false;
    }


    @Override
    public String getUserByName(int id) {
        UsersExample us = new UsersExample();
        us.createCriteria().andUseridEqualTo(id);
        Users users = usersMapper.selectByPrimaryKey(id);
        return users.getUsername();
    }

    @Override
    public String getTouXiangById(int id) {
        UsersExample us = new UsersExample();
        us.createCriteria().andUseridEqualTo(id);

//        根据id查找，id唯一，所以结果只有一个
        List<Users> users = usersMapper.selectByExample(us);
        String img = users.get(0).getImg();
        return img;
    }


    @Override
    public void updateUserById(Users users) {

        usersMapper.updateByPrimaryKeySelective(users);

    }

    @Override
    public List<Users> getUserByUsername(String name) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(name);
        List<Users> users = usersMapper.selectByExample(usersExample);
        return users;
    }


    //    新增

    @Override
    public List<Users> getAllByState(String state) {
        UsersExample ue = new UsersExample();
        ue.createCriteria().andStateEqualTo(state);
        List<Users> users = usersMapper.selectByExample(ue);
        return users;
    }

    @Override
    public List<Users> getAllByTime(Date start, Date end) {
        UsersExample ue = new UsersExample();
        ue.createCriteria().andTimeBetween(start, end);
        List<Users> users = usersMapper.selectByExample(ue);

        return users;
    }

    @Override
    public List<Users> getAllBeforeTime(Date time) {
        UsersExample ue = new UsersExample();
        ue.createCriteria().andTimeLessThan(time);
        List<Users> users = usersMapper.selectByExample(ue);

        return users;
    }

    @Override
    public List<Users> selectByName1(String name, String timeStart, String timeEnd) {
        UsersExample ue = new UsersExample();

//        if (timeStart != "null" && timeStart != "" && timeEnd != "" && timeEnd != "null") {
//            SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
//            try {
//
//                Date start = sdf.parse(timeStart);
//                Date end = sdf.parse(timeEnd);
//                System.out.println("if..1..判断为真");
//                ue.createCriteria().andTimeBetween(start, end).andStateEqualTo("启用");
//            } catch (ParseException e) {
//                e.printStackTrace();
//
//            }
//            if (name != "" && name != null) {
//
//                ue.or().andEmailLike("%" + name + "%");
//                ue.or().andUsernameLike("%" + name + "%");
//                ue.or().andTelLike("%" + name + "%");
//                System.out.println("if..2..判断为真");
//            }
//
//
//        } else {
//            System.out.println("if..1..判断为假");
//            ue.createCriteria().andStateEqualTo("已启用");
//            ue.or().andEmailLike("%" + name + "%");
//            ue.or().andUsernameLike("%" + name + "%");
//            ue.or().andTelLike("%" + name + "%");
//        }
        ue.or().andEmailLike("%" + name + "%");
        ue.or().andUsernameLike("%" + name + "%");
        ue.or().andTelLike("%" + name + "%");
        List<Users> users = usersMapper.selectByExample(ue);
        System.out.println(users);
        return users;
    }

    @Override
    public List<Users> selectByName2(String name, String timeStart, String timeEnd) {
        UsersExample ue = new UsersExample();
//        if (timeStart != "null" && timeEnd != "null") {
//            SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
//            try {
//                Date start = sdf.parse(timeStart);
//                Date end = sdf.parse(timeEnd);
//                ue.createCriteria().andTimeBetween(start, end).andStateEqualTo("已删除");
//
//                if (name != "" && name != null) {
//                    ue.or().andEmailLike("%" + name + "%");
//                    ue.or().andUsernameLike("%" + name + "%");
//                    ue.or().andTelLike("%" + name + "%");
//                }
//            } catch (ParseException e) {
//                e.printStackTrace();
//
//            }
//
//
//        } else {
//            ue.createCriteria().andStateEqualTo("已删除");
//            ue.or().andEmailLike("%" + name + "%");
//            ue.or().andUsernameLike("%" + name + "%");
//            ue.or().andTelLike("%" + name + "%");
//        }
        ue.or().andEmailLike("%" + name + "%");
        ue.or().andUsernameLike("%" + name + "%");
        ue.or().andTelLike("%" + name + "%");
        List<Users> users = usersMapper.selectByExample(ue);
        System.out.println("删除用户搜索调用了");
        return users;
    }

    @Override
    @ResponseBody
    public int deleteById(int id) {
        Users u = new Users();
        u.setUserid(id);
        u.setState("删除");
        int i = usersMapper.updateByPrimaryKeySelective(u);

        return i;
    }

    @Override
    @ResponseBody
    public int HuiFuById(int id) {
        Users u = new Users();
        u.setUserid(id);
        u.setState("启用");
        int i = usersMapper.updateByPrimaryKeySelective(u);

        return i;
    }

    @Override
    public int addUser(String username, String password, String tel, String email) {
        Users u = new Users();
        u.setUsername(username);
        u.setPassword(password);
        u.setTel(tel);
        u.setEmail(email);
        u.setState("启用");
        u.setTime(new Date());
        int i = usersMapper.insertSelective(u);
        return i;
    }

    @Override
    public int updateUser(Users users) {
        int i = usersMapper.updateByPrimaryKeySelective(users);
        return i;
    }
}


