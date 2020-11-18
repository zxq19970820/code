package mvc.dao.impl;


import mvc.dao.ProductDao;
import mvc.pojo.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productDaoImpl extends BaseDao implements ProductDao {

    @Override
    public int add(Product product) {

        int row = 0;

        getConn();

        String sql = "insert into product values(null,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, product.getPname());
            ps.setString(2, product.getImage());
            ps.setString(3, product.getDetails());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getCount());

            row = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }


    @Override
    public int del(int pid) {
        return 0;
    }

    @Override
    public Product getById(int pid) {

        Product p = null;

        getConn();

        String sql = "select  * from product where pid=?";

        try {
            //完善sql
            ps = conn.prepareStatement(sql);

            ps.setInt(1, pid);

            rs = ps.executeQuery();

            if (rs.next()) {

                p = new Product();

                p.setPid(rs.getInt("pid"));
                p.setPname(rs.getString("pname"));
                p.setImage(rs.getString("image"));
                p.setDetails(rs.getString("details"));
                p.setPrice(rs.getDouble("price"));
                p.setCount(rs.getInt("count"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            closeAll();
        }
        return p;
    }


    @Override
    public List<Product> getAll() {

        List<Product> list = new ArrayList<Product>();

        getConn();
        String sql = "select * from product";

        try {
            //完善sql
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                //如果有一行数据，说明有一个对象
                Product p = new Product();

                p.setPid(rs.getInt("pid"));
                p.setPname(rs.getString("pname"));
                p.setImage(rs.getString("image"));
                p.setDetails(rs.getString("details"));
                p.setPrice(rs.getDouble("price"));
                p.setCount(rs.getInt("count"));

                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            closeAll();
        }
        return list;
    }


    @Override
    public List<Product> getByName(String pname) {


        List<Product> list = new ArrayList<Product>();
        getConn();

        String sql = "select  * from product where pname like ?";


        try {
            //完善sql
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + pname + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product();

                p.setPid(rs.getInt("pid"));
                p.setPname(rs.getString("pname"));
                p.setImage(rs.getString("image"));
                p.setDetails(rs.getString("details"));
                p.setPrice(rs.getDouble("price"));
                p.setCount(rs.getInt("count"));

                list.add(p);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            closeAll();
        }
        return list;
    }

    public static void main(String[] args) {

//        System.out.println(new productDaoImpl().getAll().size());
        System.out.println(new productDaoImpl().getById(3).getPname());
    }

}
