package zhangxingqiang___homework__2_21;

import java.util.Objects;

public class cn {
    private int num;
    private String country;

    public cn( ) {
    }

    public cn(int num, String country) {
        this.num = num;
        this.country = country;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "cn{" +
                "num=" + num +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cn cn = (cn) o;
        return num == cn.num &&
                Objects.equals(country, cn.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, country);
    }
}
