package com.example.service;

import com.example.mapper.StaffMapper;
import com.example.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StaffService {

    @Autowired
    private StaffMapper mapper;

    public List<Staff> getAll() {
        return mapper.getAll();
    }

    public List<Staff> getByJob(String job) {
        return mapper.getByJob(job);
    }


    public Staff getById(String id) {
        return mapper.getById(id);
    }

    public int updateJob(Staff s) {
        return mapper.updateJob(s);
    }

    public List<Staff> getLikeJob(String a) {
        String job = "%" + a + "%";
        System.out.println(job);
        return mapper.likeJob(job);
    }


    public List<Staff> getLikeJob2(String job) {
        return mapper.likeJob2(job);
    }

    public List<Staff> selectStaffByDname(String did) {
        return mapper.getbyDname(did);
    }
}
