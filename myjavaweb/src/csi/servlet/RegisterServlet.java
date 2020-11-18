package csi.servlet;

import jdk.nashorn.internal.ir.RuntimeNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register.do")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html,charset=UTF-8");


        //  获取余
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        System.out.println(uname);
        System.out.println(pwd);
        System.out.println(phone);
        System.out.println(address);

        //将数据存入数据库
        //加载驱动.
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        //获取链接
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8");
//
//            //编写sql语句
//            String sql = "insert into users values(null,?,?,?,?,0)";
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//
//            //完善sql语句
//            ps.setString(1, uname);
//            ps.setString(2, pwd);
//            ps.setString(3, phone);
//            ps.setString(4, address);
//
//            //执行  返回受影响行数
//            int row = ps.executeUpdate();
//            String msg = null;
//            if (row > 0) {
//                msg = "添加成功";
//            } else {
//                msg = "添加失败";
//            }
//
//            if (ps!=null){
//                ps.close();
//            }
//
//            if (conn!=null){
//                conn.close();
//            }
//
//            request.setAttribute("msg",msg);
//            request.getRequestDispatcher(" /classtest/3.9/result.jsp").forward(request,response);
////
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
