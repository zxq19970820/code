package MVC__3_11.dao.impl;

import MVC__3_11.dao.CartDao;
import MVC__3_11.pojo.Cart;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDaoImpl extends BaseDao implements CartDao {
    @Override
    public int add(Cart cart) {
        int row = 0;

        //获取连接
        getConn();

        //sql语句
        String sql = "insert into cart values(null,?,?,?,?)";

        //ps对象
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, cart.getProduct().getPid());
            ps.setInt(2, cart.getUser().getUserId());
            ps.setInt(3, cart.getNum());
            ps.setDouble(4, cart.getTotal());

            //执行并接收
            row = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }

        //处理数据
        return row;
    }

    @Override
    public int del(Cart cid) {
        return 0;
    }

    @Override
    public int update(Cart cart) {

        int row = 0;
        //连接
        getConn();

        //sql
        String sql = "update cart set pid=?,userid=?,num=?,total=?where cid=?";

        //ps
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, cart.getProduct().getPid());
            ps.setInt(2, cart.getUser().getUserId());
            ps.setInt(3, cart.getNum());
            ps.setDouble(4, cart.getTotal());
            ps.setInt(5, cart.getCid());

            //执行并接收
            row = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public List<Cart> getByUser(int userid) {

        List<Cart> list = new ArrayList<>();
        //连接
        getConn();

        //sql
        String sql = "select * from cart where userid=?";

        //ps
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userid);

            //执行
            rs = ps.executeQuery();

            //封装
            while (rs.next()) {

                Cart c = new Cart();

                c.setCid(rs.getInt("cid"));
                c.setNum(rs.getInt("num"));
                c.setTotal(rs.getDouble("total"));
                c.setUser(new UsersDaoImpl().getById(rs.getInt("userid")));
                c.setProduct(new productDaoImpl().getById(rs.getInt("pid")));

                list.add(c);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }

        return list;
    }


    //待定

    public Cart getById(int id) {

        Cart c = new Cart();

        //连接
        getConn();

        //sql
        String sql = "select * from cart where cid=?";

        //ps
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            //执行
            rs = ps.executeQuery();

            //封装
            while (rs.next()) {


                c.setCid(rs.getInt("cid"));
                c.setNum(rs.getInt("num"));
                c.setTotal(rs.getDouble("total"));
                c.setUser(new UsersDaoImpl().getById(rs.getInt("userid")));
                c.setProduct(new productDaoImpl().getById(rs.getInt("pid")));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }

        return c;
    }


    public static void main(String[] args) {
//        Product p = new Product();
//        p.setPid(1);
//        p.setPrice(1);
//
//        Users U = new Users();
//        U.setUserId(1);
//
//        Cart c = new Cart();
//        c.setNum(2);
//        c.setProduct(p);
//        c.setUser(U);
//
//        int row = new CartDaoImpl().add(c);
//        System.out.println(row);


//        Cart c=new CartDaoImpl().getById(1);
//        c.setNum(2);
//        System.out.println(c.getTotal());

        Cart c = new CartDaoImpl().getById(1);
        c.setNum(1);
        System.out.println(new CartDaoImpl().update(c));

    }
}
