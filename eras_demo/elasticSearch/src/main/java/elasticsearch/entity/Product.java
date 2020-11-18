package elasticsearch.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//在ES中每一条记录是一个docuemnt对象
//indexName：索引名称
//type:表名
//Field块
//添加映射信息：{"hello":{ "properties":{ "id":{"type":"long",......} }} }
@Document(indexName = "product", type = "phone")
public class Product {

    @Id//让id属性的值与_id保持一致
    @Field(type = FieldType.Long, index = false, store = true)//Field字段
    private Long id;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_max_word")
    private String pname;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_max_word")
    private String pprice;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_max_word")
    private String pimg;

    public Product() {
    }

    public Product(Long id, String pname, String pprice, String pimg) {
        this.id = id;
        this.pname = pname;
        this.pprice = pprice;
        this.pimg = pimg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pprice='" + pprice + '\'' +
                ", pimg='" + pimg + '\'' +
                '}';
    }
}
