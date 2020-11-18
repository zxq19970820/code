package com.wangyicourse;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.MyStudy;
import com.wangyicourse.entity.SectionExample;
import com.wangyicourse.mappers.OrdersMapper;
import com.wangyicourse.mappers.SectionMapper;
import com.wangyicourse.service.*;
import com.wangyicourse.service.impl.PictureServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//import com.wangyicourse.entity.Order;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    PreOrderService preOrderService;
    @Autowired
    OrderService orderService;
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    PictureServiceImpl pictureService;
    @Autowired
    CartService cartService;
    @Autowired
    MyStudyService myStudyService;
    @Autowired
    CourseService courseService;
    @Autowired
    SectionMapper sectionMapper;
    @Autowired
    SectionService sectionService;
    @Test
    void contextLoads() {

//        Orders order=new Orders();
//        order.setUserid(1);
//        order.setState("待支付");
//        order.setTotalprice(new BigDecimal(123));
//        order.setOrdernum(Util.getOrderIdByTime());
//        order.setCreatetime(new Date());
//        System.out.println(orderService.add(order));
//        System.out.println(ordersMapper.selectOrderByUserId(1));
//        System.out.println(pictureService.getPictures("课堂直播2"));
//        System.out.println(cartService.findCartByUserId(1));
//        SectionExample sectionExample=new SectionExample();
//        System.out.println(sectionMapper.selectByExample(sectionExample));
//        System.out.println(sectionService.getVideoUrl(2));
        System.out.println(ordersMapper.selectByPrimaryKey(39));
    }

}
