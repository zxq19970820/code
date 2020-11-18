package MVC__3_11.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import MVC__3_11.pojo.Users;

import java.sql.*;

public class BaseDao {
    protected Connection conn=null;
    protected PreparedStatement ps=null;
    protected ResultSet rs=null;

    //获取连接
    public void getConn(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
//            conn=new ComboPooledDataSource().getConnection();
//            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?useUnicode=true&amp;characterEncoding=UTF-8","root","root");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?characterEncoding=UTF-8","root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeAll(){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int register(Users user) {
        return 0;
    }


    public int update(Users user) {
        return 0;
    }

    public int updatePassword(int userid, String oldPassword, String newPassword) {
        return 0;
    }
}
