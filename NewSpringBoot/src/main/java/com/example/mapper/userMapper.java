package com.example.mapper;


import com.example.pojo.user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userMapper {

    String getPassword(int id);

    String getUname(int id);

    List<user> getAll();

    int upd(user u);


}
