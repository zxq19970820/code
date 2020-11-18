package com.example.mapper;


import com.example.pojo.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMapper {

    //    @Select("select * from staff")
    List<Staff> getAll();

    Staff getById(String id);

    List<Staff> getByJob(String job);

    int updateJob(Staff s);

    List<Staff> likeJob(String a);

    List<Staff> likeJob2(String job);

    List<Staff> getbyDname(String did);


}
