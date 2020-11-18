package MVC__3_11.pojo;

public class order {
    private int oid;
    private Users user;

    private String createtime;
    private int state;
    private double totalprice;

    public order() {
    }

    public order(int oid, Users user, String createtime, int state, double totalprice) {
        this.oid = oid;
        this.user = user;
        this.createtime = createtime;
        this.state = state;
        this.totalprice = totalprice;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
