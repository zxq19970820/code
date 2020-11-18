package MVC__3_11.dao.impl;

import MVC__3_11.dao.UsersDao;
import MVC__3_11.pojo.Users;

import java.sql.SQLException;

public class UsersDaoImpl extends BaseDao implements UsersDao {


    public Users login(String uname, String pwd) {

        Users users = null;
        try {

            getConn();

            String sql = "select * from users where username=? and password=?";

            ps = conn.prepareStatement(sql);

            //完善sql
            ps.setString(1, uname);
            ps.setString(2, pwd);

            rs = ps.executeQuery();

            if (rs.next()) {
                users = new Users();

                users.setUserId(rs.getInt("userid"));
                users.setUserName(rs.getString("username"));
                users.setPassWord(rs.getString("password"));
                users.setAddress(rs.getString("address"));
                users.setPhone(rs.getString("phone"));
                users.setBalance(rs.getInt("balance"));
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            closeAll();
        }
        return users;
    }

    @Override
    public int register(Users user) {
        return 0;
    }

    @Override
    public int update(Users user) {
       return 0;
    }


    @Override
    public int updatePassword(int userid, String oldPassword, String newPassword) {
        return 0;
    }

    public Users getById(int userid) {

        Users users = null;

        try {
            getConn();

            String sql = "select * from users where userid =?";
            ps = conn.prepareStatement(sql);
            //完善sql
            ps.setInt(1,userid);
            rs=ps.executeQuery();

            if (rs.next()){

                users=new Users();

                users.setUserId(rs.getInt("userid"));
                users.setUserName(rs.getString("username"));
                users.setPassWord(rs.getString("password"));
                users.setAddress(rs.getString("address"));
                users.setPhone(rs.getString("phone"));
                users.setBalance(rs.getInt("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeAll();
        }

        return users;
    }


}
