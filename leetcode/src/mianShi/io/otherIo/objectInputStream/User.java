package mianShi.io.otherIo.objectInputStream;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 20:21
 * 4
 */
public class User implements Serializable {
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
