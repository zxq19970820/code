package mvc.pojo;

public class Orderitem {

    private int id;
    private Order order;
    private Product product;
    private int num;
    private double price;

    public Orderitem() {
    }

    public Orderitem(int id, Order order, Product product, int num, double price) {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
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
