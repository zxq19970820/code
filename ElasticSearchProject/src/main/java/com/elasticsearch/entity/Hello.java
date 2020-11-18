package com.elasticsearch.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
//在ES中每一条记录是一个docuemnt对象
//indexName：索引名称
//type:表名
//Field块
//添加映射信息：{"hello":{ "properties":{ "id":{"type":"long",......} }} }
@Document(indexName = "my-index", type = "hello")
public class Hello {

    @Id//让id属性的值与_id保持一致
    @Field(type = FieldType.Long, index = false, store = true)//Field字段
    private Long id;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_max_word")
    private String title;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_max_word")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
