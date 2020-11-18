package mvc.biz.impl;


import mvc.biz.CartBiz;
import mvc.dao.impl.CartDaoImpl;
import mvc.pojo.Cart;

import java.util.List;

public class CartBizImpl implements CartBiz {

    private CartDaoImpl dao = new CartDaoImpl();

    @Override
    public boolean add(Cart cart) {
        return dao.add(cart) > 0;
    }

    @Override
    public boolean del(Cart cid) {
        return dao.del(cid) > 0;
    }

    @Override
    public boolean update(Cart cart) {
        return dao.update(cart) > 0;
    }

    @Override
    public List<Cart> getByUser(int userid) {
        return dao.getByUser(userid);
    }

    @Override
    public boolean updataNum(int cid, int num) {

        //根据id获取购物车对象
        Cart c = dao.getById(cid);

        //修改数据
        c.setNum(num);

        //更新数据
        dao.update(c);

        return false;
    }
}
