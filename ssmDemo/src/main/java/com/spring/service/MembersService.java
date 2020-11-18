package com.spring.service;

import com.spring.entity.Members;
import com.spring.entity.MembersExample;

import java.util.Date;
import java.util.List;

public interface MembersService {


    List<Members> selectByState(String state);


    int qiYongById(int id);


    List<Members> selectAll();

    int deleteByIdList(List<Integer> list);

    int updatePassword(int id, String password);

    int updateInformationById(int id, String userName, String sex, String phoneNum, String email);

    int insertMembers(String userName, String password, String sex, String phoneNum, String email, String address, Date date);

    List<Members> selectByTime(String start, String end);

    List<Members> selectByKeys(String key);

    List<Members> searchByKeys(MembersExample membersExample);

    int updateMemberStateById(Members members);
}

















