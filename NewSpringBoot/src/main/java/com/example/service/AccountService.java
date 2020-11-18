package com.example.service;

import com.example.mapper.AccountMapper;
import com.example.mapper.RoleMapper;
import com.example.pojo.Account;
import com.example.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AccountMapper accountMapper;


    public List<Role> getAllRole(){
        return roleMapper.getAllRole();
    }

    public  List<Account> getAllAccount(){
        return accountMapper.getAllAccount();
    }

}



















