package mvc.pojo;

public class Cart {
    private int cid;
    private int num;
    private double total;
    private Product product;
    private Users user;


    public Cart() {
    }


    public Cart(int cid, int num, Product product, Users user) {
        this.cid = cid;
        this.num = num;
        this.product = product;
        this.user = user;
        this.total = getProduct().getPrice() * getNum();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotal() {
        return getProduct().getPrice() * getNum();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
