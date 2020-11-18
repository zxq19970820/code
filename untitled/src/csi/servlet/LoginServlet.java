package csi.servlet;

import testdemo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
//  untitled_war_exploded/classtest/3.9

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        

        //获取数据
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");


        //验证是否获取到输入框的数据
//        System.out.println(uname);
//        System.out.println(pwd);

        //处理数据
        try {

            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;

        //获取连接
        try {
            conn = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8", "root", "root");

            String sql = "select * from users where username=? and password=?";

            //获取执行对象
            ps = conn.prepareStatement(sql);

            //完善sql语句
            ps.setString(1, uname);
            ps.setString(2, pwd);

            rs = ps.executeQuery();

            if (rs.next()) {

                //如果有信息，证明登录成功，记录信息
                user = new User();

                user.setId(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setBalance(rs.getInt("balance"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

//                System.out.println("登陆成功");

            }
//            else{
//                System.out.println("登录失败");
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if ((ps != null)) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String msg = null;
            if (user != null) {
                //用户不为空，证明要登录成功
                //将用户信息存储到session中
                //在jsp中是内置对象   servlect中不是，需要创建一下
                request.getSession().setAttribute("user", user);

                msg = "登录成功";
            } else {
                msg = "登录失败";
            }
            request.setAttribute("msg", msg);

            //转发到结果页面
            request.getRequestDispatcher("/classtest/3.9/result.jsp").forward(request, response);

        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
