package com.zxq.factory;

import javax.annotation.PostConstruct;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/1 15:04
 * 4
 */
public class dataFactory {

    private String driver;
    private String url;
    private String username;
    private String password;

    //初始化方法，在该方法中检验数据连接是否有问题
//    @PostConstruct
    public void init(){
        try {
            //加载驱动
            Class.forName(driver);
            //获取连接
            DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功！");
        } catch (ClassNotFoundException e) {

            System.out.println("驱动加载失败，请检查！");
        } catch (SQLException e) {
            System.out.println("数据库连接获取失败，请检查！");
        }
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "dataFactory{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


