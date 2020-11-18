package com.example.mapper;


import com.example.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    List<Role> getAllRole();

    Role getById(Integer id);

}
