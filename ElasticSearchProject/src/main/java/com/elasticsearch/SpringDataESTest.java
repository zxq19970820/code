package com.elasticsearch;

import com.elasticsearch.entity.Hello;
import com.elasticsearch.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringDataESTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private HelloService helloService;

    @Test   //import org.junit.Test;   不要自己创建一个名称为Test类
    public void createIndex() {
        //创建空的索引库
        elasticsearchTemplate.createIndex(Hello.class);
        //添加映射
        elasticsearchTemplate.putMapping(Hello.class);
    }

    //添加文档对象
    @Test
    public void createDocument() {
        //批量创建Hello对象
        for (Long i = 1l; i <= 10l; i++) {
            Hello hello = new Hello();
            hello.setId(i);
            hello.setTitle("新增title:" + i);
            hello.setContent("新增content:" + i);
            helloService.save(hello);

        }
    }

    //根据id查询
    @Test
    public void getDocumentById() {
        Optional<Hello> helloOptional = helloService.findById(1l);
        Hello hello = helloOptional.get();
        System.out.println("hello:" + hello);//hello:Hello{id=1, title='新增title:1', content='新增content:1'}
    }


    //查询所有
    @Test
    public void getAllDocuments() {
        Iterable<Hello> all = helloService.findAll();

        Iterator<Hello> iterator = all.iterator();//10个
        while (iterator.hasNext()) {
            Hello hello = iterator.next();
            System.out.println(hello);
        }



//        all.forEach(Consumer);Consumer接口通过@FunctionalInterface修饰，表示它是一个函数式接口
        //如果一个方法的形参是函数式接口，传递形参时可以使用Lambda表达式，特点使用箭头符号
        // 形参(T t) -> 方法体内容
        //void accept(T t);
//        all.forEach(item -> System.out.println(item) );

    }


    //更新文档<S extends T> S save(S var1);   保证传递的Hello对象中的id是已经存在的
    @Test
    public void updateDocument() {
        //批量创建Hello对象
        for (Long i = 1l; i <= 10l; i++) {
            Hello hello = new Hello();
            hello.setId(i);
            hello.setTitle("修改title:" + i);
            hello.setContent("修改content:" + i);
            helloService.save(hello);
        }
    }


    //删除文档void deleteById(ID var1);    void deleteAll();
    @Test
    public void deleteById() {
        helloService.deleteById(1l);
    }


    @Test
    public void deleteAll() {
        helloService.deleteAll();
    }


    @Test
    public void getDocumentsByTitle() {
        List<Hello> hs = helloService.findByTitle("新增");
        System.out.println(hs);

    }


    //page第几页，size表示每页page展示数；
    @Test
    public void getDocumentsByTitleAndPage() {
        List<Hello> hs = helloService.findByTitle("新增");
        for (Hello h : hs) {
            System.out.println(h);
        }
        List<Hello> hs1 = helloService.findByTitle("新增", PageRequest.of(0, 3));
        System.out.println("\n"+"...........");
        for (Hello hello : hs1) {
            System.out.println(hello);
        }


    }

    @Test
    public void getDocumentByContent(){
        List<Hello> hs=helloService.findByContent("新增");
        for (Hello h : hs) {
            System.out.println(h);
        }

    }
}
