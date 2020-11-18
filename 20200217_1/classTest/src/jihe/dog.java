package jihe;

import java.util.Objects;

public class dog implements Comparable<dog> {
    private String name;
    private String type;

    public dog() {
    }

    public dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dog dog = (dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(type, dog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public int compareTo(dog o) {
//        dog d = (dog) o;
        return (this.name.compareTo(o.name));
    }
}
