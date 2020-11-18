package com.example.mapper;

import com.example.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

 List<Account> getAllAccount();

    List<Account> getById(String rid);

}
