package mvc.pojo;

public class Product {
    private int pid;
    private String pname;
    private String image;
    private String details;
    private double price;
    private int count;

    public Product() {
    }

    public Product(int pid, String pname, String image, String details, double price, int count) {
        this.pid = pid;
        this.pname = pname;
        this.image = image;
        this.details = details;
        this.price = price;
        this.count = count;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
