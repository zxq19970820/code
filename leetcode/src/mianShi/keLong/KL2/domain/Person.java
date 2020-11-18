package mianShi.keLong.KL2.domain;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 20:56
 * 4
 */
public class Person implements Cloneable {

    private String name;
    private Integer age;

    private Address address;

    public Person() {
    }

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public Object clone() throws CloneNotSupportedException {

        Person person = (Person) super.clone();
        Address clone = (Address) person.getAddress().clone();
        person.setAddress(clone);
        return person;
//        return super.clone();

    }


}
