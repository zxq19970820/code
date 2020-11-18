package MVC__3_11.dao;

import MVC__3_11.pojo.Cart;

import java.util.List;

public interface CartDao {

    public int add(Cart cart);

    public int del(Cart cid);

    public int update(Cart cart);

    public List<Cart> getByUser(int userid);

    public Cart getById(int cid);
}
