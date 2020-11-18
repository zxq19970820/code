package mvc.dao.impl;


import mvc.dao.OrderDao;
import mvc.pojo.Order;
import mvc.pojo.Users;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class orderDaoImpl extends BaseDao implements OrderDao {

    @Override
    public int addOrder(Order od) {

        int row = 0;
        getConn();
        //sql
        String sql = "insert into `order` values(null,?,?,?,?)";

        //ps

        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, od.getUser().getUserId());

            Date d = new Date();
            SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = adf.format(d);

            ps.setString(2, time);
            ps.setInt(3, od.getState());
            ps.setDouble(4, od.getTotalprice());

            row = ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }

        return row;
    }

    public static void main(String[] args) {
        Order o = new Order();
        o.setState(1);
        o.setTotalprice(250);

        Users u = new Users();
        u.setUserId(1);
        o.setUser(u);
        if (new orderDaoImpl().

                addOrder(o) > 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}
