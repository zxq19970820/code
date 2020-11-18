package MVC__3_11.pojo;

public class orderitem {

    private int id;
    private order order;
    private Product product;
    private int num;
    private double price;

    public orderitem() {
    }

    public orderitem(int id, MVC__3_11.pojo.order order, Product product, int num, double price) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.num = num;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MVC__3_11.pojo.order getOrder() {
        return order;
    }

    public void setOrder(MVC__3_11.pojo.order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
