package mianShi.keLong.KL2.domain;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/26 20:42
 * 4
 */
public class Address  implements Cloneable{
    private Integer id;
    private String province;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
