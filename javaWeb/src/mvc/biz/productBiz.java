package mvc.biz;


import mvc.pojo.Product;

import java.util.List;

public interface productBiz {

    public boolean add(Product product);

    public boolean del(int pid);

    public Product getById(int pid);

    public List<Product> getAll();

    public List<Product> getByName(String pname);
}
