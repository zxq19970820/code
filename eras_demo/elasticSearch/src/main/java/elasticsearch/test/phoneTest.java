package elasticsearch.test;


import elasticsearch.entity.Product;
import elasticsearch.jsoupDemo;
import elasticsearch.service.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class phoneTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private PhoneService phoneService;



    jsoupDemo jd = new jsoupDemo();
    List<Product> phones = jd.getPhones();


    @Test   //import org.junit.Test;   不要自己创建一个名称为Test类
    public void createIndex1() {
        //创建空的索引库
        elasticsearchTemplate.createIndex(Product.class);
        //添加映射
        elasticsearchTemplate.putMapping(Product.class);
    }

    //添加文档对象
    @Test
    public void createDocument1() {

        for (Product phone : phones) {
            System.out.println(phones);
            phoneService.save(phone);
        }


    }


    //根据id查询
    @Test
    public void getDocumentById() {
        Optional<Product> productOptional = phoneService.findById(1l);
        Product product = productOptional.get();
        System.out.println("product:" + product);
    }

    //查询所有
    @Test
    public void getAllDocuments() {
        Iterable<Product> all = phoneService.findAll();
        Iterator<Product> iterator = all.iterator();//10个
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }


//        all.forEach(Consumer);Consumer接口通过@FunctionalInterface修饰，表示它是一个函数式接口
        //如果一个方法的形参是函数式接口，传递形参时可以使用Lambda表达式，特点使用箭头符号 形参(T t) -> 方法体内容
        //void accept(T t);
//        all.forEach(item -> System.out.println(item) );

    }


//更新文档<S extends T> S save(S var1);   保证传递的Hello对象中的id是已经存在的
    @Test
    public void updateDocument() {
        //批量创建Hello对象
        for (Long i = 1l; i <= (long) phones.size(); i++) {
            Product product = new Product();
            product.setId(i);
            product.setPname("修改pname" + i);
            product.setPprice("修改pprice:" + i);
            phoneService.save(product);
        }
    }


    //删除文档void deleteById(ID var1);    void deleteAll();
    @Test
    public void deleteById() {
        phoneService.deleteById(1l);
    }
//
//
    @Test
    public void deleteAll() {
        phoneService.deleteAll();
    }


    @Test
    public void getDocumentsByTitle() {
        List<Product> hs = phoneService.findByPname("小米");
        System.out.println(hs);

    }


    //page第几页，size表示每页page展示数；
    @Test
    public void getDocumentsByTitleAndPage() {

        List<Product> hs1 = phoneService.findByPname("小米", PageRequest.of(0, 3));
        System.out.println("\n"+"...........");
        for (Product phone : hs1) {
            System.out.println(phone);
        }


    }

}
