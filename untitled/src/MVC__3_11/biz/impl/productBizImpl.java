package MVC__3_11.biz.impl;

import MVC__3_11.biz.productBiz;
import MVC__3_11.dao.impl.productDaoImpl;
import MVC__3_11.dao.productDao;
import MVC__3_11.pojo.Product;

import java.util.List;

public class  productBizImpl implements productBiz {

    productDaoImpl dao = new productDaoImpl();

    @Override
    public boolean add(Product product) {
        int v = dao.add(product);
        return v>0;
    }

    @Override
    public boolean del(int pid) {
        int v=dao.del(pid);
        return v>0;
    }

    @Override
    public Product getById(int pid) {
        Product v = dao.getById(pid);
        return v;
    }

    @Override
    public List<Product> getAll() {
        List<Product> all = dao.getAll();
        return all;
    }

    @Override
    public List<Product> getByName(String pname) {
        List<Product> byName = dao.getByName(pname);
        return byName;
    }
}
