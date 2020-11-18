
package com.zxq.doamin;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *		* 所有的注解都是使用JPA的规范提供的注解，
 *		* 所以在导入注解包的时候，一定要导入javax.persistence下的
 */

@EntityListeners(AuditingEntityListener.class)    //监听
@Entity     //声明实体类
@Table(name="t_user")
public class User implements Serializable {


//    @ApiModelProperty(value="属性id")
    @Id     //声明当前私有属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //配置主键的生成策略   //自增
    @Column(name = "id")    //指定和表中cust_id字段的映射关系
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @CreatedDate       // spring-data-jap中提供的自动填充，新增时自动填充时间（配合SPRING-DATA-JPA监听注解使用）
    private Date createDate;

    @LastModifiedDate    // spring-data-jap中提供的自动填充，有更新时自动填充更新时间（配合SPING-DATA-JPA监听注解使用）
    private Date updateTime;



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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
