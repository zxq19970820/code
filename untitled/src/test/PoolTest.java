package test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class PoolTest {
    public static void main(String[] args) {
        try {
            Connection conn=new ComboPooledDataSource().getConnection();
            System.out.println("连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
