package MVC__3_11.biz;

import MVC__3_11.pojo.Cart;

import java.util.List;

public interface CartBiz {
    public boolean add(Cart cart);

    public boolean del(Cart cid);

    public boolean update(Cart cart);

    public List<Cart> getByUser(int userid);

    public boolean updataNum(int cid,int num);
}
