package com.spring.service.impl;

import com.spring.entity.Members;
import com.spring.entity.MembersExample;
import com.spring.mapping.MembersMapper;
import com.spring.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MembersServiceImpl implements MembersService {


    @Autowired
    private MembersMapper membersMapper;


    public List<Members> selectByState(String state) {

        MembersExample me = new MembersExample();
        me.createCriteria().andStateEqualTo(state);

        return membersMapper.selectByExample(me);
    }

    @Override
    public int qiYongById(int id) {

        Members members = new Members();
        members.setState("已启用");
        members.setId(id);

        return membersMapper.updateByPrimaryKeySelective(members);
    }


    @Override
    public List<Members> searchByKeys(MembersExample membersExample) {
        return membersMapper.selectByExample(membersExample);
    }


    @Override
    public List<Members> selectAll() {
        MembersExample membersExample = new MembersExample();
        return membersMapper.selectByExample(membersExample);
    }

    @Override
    public int deleteByIdList(List<Integer> list) {
        MembersExample membersExample = new MembersExample();
        membersExample.createCriteria().andIdIn(list);

        Members members = new Members();
        members.setState("已删除");
        return membersMapper.updateByExampleSelective(members, membersExample);
    }

    @Override
    public int updatePassword(int id, String password) {
        Members members = new Members();
        members.setId(id);
        members.setPassword(password);
        return membersMapper.updateByPrimaryKeySelective(members);
    }

    public int updateInformationById(int id, String userName, String sex, String phoneNum, String email) {

        Members members = new Members();
        members.setId(id);
        members.setUsername(userName);
        members.setGender(sex);
        members.setPhone(phoneNum);
        members.setEmail(email);
        return membersMapper.updateByPrimaryKeySelective(members);
    }

    @Override
    public int insertMembers(String userName, String password, String sex, String phoneNum, String email, String address, Date date) {

        Members members = new Members();
        members.setUsername(userName);
        members.setPassword(password);
        members.setGender(sex);
        members.setPhone(phoneNum);
        members.setEmail(email);
        members.setAddress(address);
        members.setBirthdate(date);
        members.setState("已启用");
        return membersMapper.insertSelective(members);
    }

    @Override
    public int updateMemberStateById(Members members) {
        return membersMapper.updateByPrimaryKeySelective(members);
    }


    @Override
    public List<Members> selectByTime(String start, String end) {
        MembersExample membersExample = new MembersExample();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date startTime = null;
        Date endTime = null;
        try {
            startTime = sdf.parse(start);
            endTime = sdf.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        membersExample.createCriteria().andBirthdateBetween(startTime, endTime);
        return membersMapper.selectByExample(membersExample);
    }

    @Override
    public List<Members> selectByKeys(String key) {
        MembersExample membersExample = new MembersExample();
        membersExample.or().andEmailLike("%" + key + "%");
        membersExample.or().andPhoneLike("%" + key + "%");
        membersExample.or().andUsernameLike("%" + key + "%");

        return membersMapper.selectByExample(membersExample);
    }


}
