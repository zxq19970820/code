package jdbc_java;

import java.sql.*;

public class jdbc_add {


    public static void main(String[] args) {

        //加载驱动  高版本可省略
//        com.mysql.jdbc.Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //获取连接
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8","root", "root");


            System.out.println("连接成功");

            //编写sql语句
            String sql="insert into users value (null ,'尼古拉赵四','823',5351125554,'广州','42452224')";

            PreparedStatement ps = conn.prepareStatement(sql);

            //查找
            //            ResultSet rs = ps.executeQuery();

            //执行sql语句,执行增删改操作，返回受影响行数
            int row=ps.executeUpdate();

            if (row>0){
                System.out.println("执行成功");
            }
            else{
                System.out.println("操作无效");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
