package jdbc_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class product {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            Connection conn= DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/shopping?characterEncoding=UTF-8","root","root");

            System.out.println("连接成功");

            String sql ="insert into  product values(1,'串串','p1','d1', 10,100 )," +
                    "(2,'串串','p1','d1', 10,100 )," +
                    "(3,'串串','p1','d1', 10,100 )," +
                    "(4,'串串','p1','d1', 10,100 )," +
                    "(5,'串串','p1','d1', 10,100 )" ;

            PreparedStatement ps=conn.prepareStatement(sql);

            int row=ps.executeUpdate();


            if (row>0){
                System.out.println("执行成功");
            }else {
                System.out.println("执行无效");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
