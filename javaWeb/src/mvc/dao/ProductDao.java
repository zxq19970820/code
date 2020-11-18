package mvc.dao;


import mvc.pojo.Product;

import java.util.List;

public interface ProductDao {
    public int add(Product product);

    public int del(int pid);

    public Product getById(int pid);

    public List<Product> getAll();

    public List<Product> getByName(String pname);
}
