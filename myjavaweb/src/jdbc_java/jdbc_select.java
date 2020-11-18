package jdbc_java;

import java.sql.*;

public class jdbc_select {
    public static void main(String[] args) {


        //加载驱动
//        com.mysql.jdbc.Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //获取连接
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8",
                    "root", "root");


            System.out.println("连接成功");

            //创建statement对象，执行sql语句    不安全
//            Statement stmt=conn.createStatement();


            //编写sql语句

            String sql = "Select * from users ";

            //预处理
            PreparedStatement ps = conn.prepareStatement(sql);

            //执行sql语句   查找用executeQuery
            ResultSet rs = ps.executeQuery();


            //处理结果

            while (rs.next()) {
                System.out.println(rs.getInt("userid") + "\t"
                        + rs.getString("username") + "\t"
                        + rs.getInt(6));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
