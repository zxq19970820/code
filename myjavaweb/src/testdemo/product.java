package testdemo;

public class product {
    private int pid;
    private String pname;
    private String pic;
    private String details;
    private String price;
    private int count;


    public product() {
    }

    public product(int pid, String pname, String pic, String details, String price, int count) {
        this.pid = pid;
        this.pname = pname;
        this.pic = pic;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pic='" + pic + '\'' +
                ", details='" + details + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                '}';
    }
}
