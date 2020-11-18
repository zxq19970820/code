package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.CourseExample;
import com.wangyicourse.mappers.CourseMapper;
import com.wangyicourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> findAllCourse() {
        return courseMapper.findAllChaptersById();
    }

    @Override
    public Course findCourseDetails(int courseid) {

        return courseMapper.findCourseDetails(courseid);
    }


    @Override
    public boolean addSubscribe(int courseid) {
        Course course = courseMapper.selectByPrimaryKey(courseid);
        course.setSubscribenum(course.getSubscribenum()+1);
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andIdEqualTo(courseid);
        return courseMapper.updateByExampleSelective(course,courseExample)>0;
    }


    @Override
    public int deleteById(int id) {

        Course c = new Course();
        c.setId(id);

        c.setCategory3id(0);
        System.out.println("课程id为" + id);
        System.out.println("更改课程状态成功");
        int i = courseMapper.updateByPrimaryKeySelective(c);
        return i;
    }


    @Override
    public List<Course> getAll() {
        CourseExample ce = new CourseExample();
        ce.createCriteria().andCategory3idEqualTo(1);
        List<Course> courses = courseMapper.selectByExample(ce);

        return courses;
    }

    @Override
    public List<Course> searchByKeys(String datemin, String datemax, String keys) {
        System.out.println("起始时间为：" + datemin + "------" + "结束时间为："
                + datemax + "-----" + "输入的搜索关键字为:" + keys);

        CourseExample me = new CourseExample();
        List<Course> courses = null;

//        if (datemin != null && datemax != null) {
//            //根据日期查询
//
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//            Date startTime = null;
//            Date endTime=null;
//            try {
//                startTime = sdf.parse(datemin);
//                endTime = sdf.parse(datemax);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            me.or().andValidtimeBetween(datemin, datemax);
//
//        }
        if (keys != null) {
            System.out.println("搜索课程");
//            me.or().andCategory3idEqualTo(1);
            me.or().andCoursenameLike("%" + keys + "%");

        }
        courses = courseMapper.selectByExample(me);


        return courses;
    }


    @Override
    public int addCourse(String coursename, BigDecimal courseprice, Integer coursehour, Integer discount, String validtime, Integer institutionid) {

        System.out.println("service中的参数discout:" +discount+"validtime:"+validtime+"institutionid"+institutionid);
        Course c = new Course();
        c.setCoursename(coursename);
        c.setCourseprice(courseprice);
        c.setCoursehour(coursehour);
        c.setDiscount(discount);
        c.setValidtime(validtime);
        c.setInstitutionid(institutionid);
        c.setCategory3id(1);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        c.setPublish(format);
        c.setSubscribenum(0);

        int i = courseMapper.insertSelective(c);
        return i;
    }

    @Override
    public int updateCourse(Course course) {
        int i = courseMapper.updateByPrimaryKeySelective(course);
        return i;
    }
}
